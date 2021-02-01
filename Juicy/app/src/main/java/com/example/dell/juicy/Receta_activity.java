package com.example.dell.juicy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayerView;

public class Receta_activity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener{
    private TextView vistatitulo, vistadescripcion, vistacategoria;

    String LINK_VIDEO;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta_activity);

        YouTubePlayerView youTubePlayerView=findViewById(R.id.youtube_player);
        youTubePlayerView.initialize(Id_videos_conexion.MasterKey, this);

        vistatitulo=findViewById(R.id.vistaTitulo);
        vistadescripcion=findViewById(R.id.vistadescricopn);
        vistacategoria=findViewById(R.id.vistacategoria);


        //recive los datos y los usa

        Intent intent = getIntent();
        String Titlle = intent.getExtras().getString("Titulo receta");
        String Description = intent.getExtras().getString("Description");
        String categoria = intent.getExtras().getString("Category");
         LINK_VIDEO = intent.getExtras().getString("link_conect");


        //dandole valores

        vistatitulo.setText(Titlle);
        vistacategoria.setText(categoria);
        vistadescripcion.setText(Description);
        vistacategoria.setText(categoria);




    }
    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        //Error con el link del video
        Toast.makeText(this, "Fallo al buscar video !", Toast.LENGTH_LONG).show();


    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
       // AGREGANDO EL ACCION LISTENER PARA YOUTUBE
        youTubePlayer.setPlayerStateChangeListener(playerStateChangeListener);
        youTubePlayer.setPlaybackEventListener(playbackEventListener);

        //Comenzar reproduccion
        if(!b){

            youTubePlayer.cueVideo(LINK_VIDEO);
        }

    }
    private PlaybackEventListener playbackEventListener = new PlaybackEventListener() {
        @Override
        public void onPlaying() {

        }

        @Override
        public void onPaused() {

        }

        @Override
        public void onStopped() {

        }

        @Override
        public void onBuffering(boolean b) {

        }

        @Override
        public void onSeekTo(int arg0) {

        }
    };


    private PlayerStateChangeListener playerStateChangeListener = new PlayerStateChangeListener() {
        @Override
        public void onLoading() {

        }

        @Override
        public void onLoaded(String arg0) {

        }

        @Override
        public void onAdStarted() {

        }

        @Override
        public void onVideoStarted() {

        }

        @Override
        public void onVideoEnded() {

        }

        @Override
        public void onError(ErrorReason arg0) {

        }
    };


}

