package com.example.dell.juicy;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    List<Reseta> lstRecetas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        String combinacion="";

        Intent intent = getIntent();
        String paisSelected = intent.getExtras().getString("PAISSELECT");
        String categoriaSelected = intent.getExtras().getString("CATEGORIASELECT");


       verefySeleccion(paisSelected, categoriaSelected);

    }




    public void verefySeleccion(String pais, String categoria) {

        lstRecetas = new ArrayList<>();

        if(pais.equals("RD") && categoria.equals("SALUDABLE")){

            lstRecetas.add(new Reseta("Pan sin gluten", "Saludable ","INGREDIENTES: \n" +
                    "• 300 gramos de harina de almendras\n" +
                    "• 2 bananas trituradas o 2 calabacines rallados\n" +
                    "• 2 huevos\n" +
                    "• Una pizca de sal\n" +
                    "• Una cucharadita de polvo para hornear (hay versiones con y sin gluten, cuidado)\n" +
                    "• Un cuarto de taza de leche de almendras o avellanas\n" +
                    "• Aceite de coco",R.drawable.pansingluten,Id_videos_conexion.VIDEO_RD_SALUDABLE_1 ));
            lstRecetas.add(new Reseta("Leche de arroz", "Saludable ","INGREDIENTES: \n" +
                    "• 1 taza de arroz\n" +
                    "• 10 tazas de agua\n" +
                    "• pizca Una de sal\n",R.drawable.lechedearroz,Id_videos_conexion.VIDEO_RD_SALUDABLE_2 ));
            lstRecetas.add(new Reseta("Crema de espárragos", "Saludable ","INGREDIENTES: \n" +
                    "• 250 gramos de espárragos trigueros\n" +
                    "• 1 cebolla mediana\n" +
                    "• 1 puerro\n" +
                    "• 200 ml de caldo de verduras\n" +
                    "• 1 cucharada de nata\n" +
                    "• Sal\n" +
                    "• Pimienta\n" +
                    "• Aceite de oliva",R.drawable.cremadeesparragos,Id_videos_conexion.VIDEO_RD_SALUDABLE_3 ));
            lstRecetas.add(new Reseta("Pescado en salsa verde", "Saludable ","INGREDIENTES: \n" +
                    "• 2 de dientes de ajo\n" +
                    "• Varias hojas de perejil fresco\n" +
                    "• Una cebolla mediana\n" +
                    "• Aceite de oliva\n" +
                    "• Una pizca de sal\n" +
                    "• 1/2 copita de vino blanco\n" +
                    "• Un toque de pimienta negra recién molida\n" +
                    "• 2 filetes de pescado",R.drawable.pescadoensalsaverde,Id_videos_conexion.VIDEO_RD_SALUDABLE_4 ));

        }

        if(pais.equals("RD") && categoria.equals("RAPIDA")){

            lstRecetas.add(new Reseta("Yaroa", "RAPIDA ","INGREDIENTES:\n" +
                    "Papas para freir o para hornear.\n" +
                    "2 pechugas y media de pollo hervidas.\n" +
                    "Caldo donde las pechugas fueron hervidas, con sal, pimienta y orégano.\n" +
                    "Ají morrón rojo.\n" +
                    "Una cebolla mediana.\n" +
                    "Queso monterrey jack, danés o cheddar.\n" +
                    "Una cucharadita de zumo de limón\n" +
                    "Una cucharada de aceite\n" +
                    "1 taza de salsa de tomate\n" +
                    "1 cucharadita de azúcar\n" +
                    "Crema agria o la pueden sustituir por mayonesa\n" +
                    "Perejil picado\n" +
                    "Sal y pimienta al gusto",R.drawable.yaroa,Id_videos_conexion.VIDEO_RD_RAPIDA_1 ));

            lstRecetas.add(new Reseta("Yaniqueque", "RAPIDA ","INGREDIENTES:\n" +
                    "2 tazas de harina\n" +
                    "• 1 cucharadita de sal\n" +
                    "• media cucharadita de bicarbonato\n" +
                    "• media taza de agua\n" +
                    "• aceite para freir\n",R.drawable.yaniqueque,Id_videos_conexion.VIDEO_RD_RAPIDA_2 ));

            lstRecetas.add(new Reseta("Pan de batata", "RAPIDA ","INGREDIENTES:\n" +
                    "• ½ taza de mantequilla at temperatura ambiente, cantidad dividida\n" +
                    "• 2 libras [0.9 kg] de batata\n" +
                    "• 1½ taza de azúcar\n" +
                    "• 1 taza de leche entera\n" +
                    "• 2 huevos\n" +
                    "• 1 cucharadita de sal\n" +
                    "• ¼ taza de pasas\n" +
                    "• ½ taza de coco troceado muy pequeñito\n" +
                    "• 2 cucharadita de jengibre rallado.\n" +
                    "• 1 cucharadita de canela en polvo\n" +
                    "• 1 cucharadita de clavos dulce en polvo\n" +
                    "• ½ cucharadita de nuez moscada molida",R.drawable.pandebatata,Id_videos_conexion.VIDEO_RD_RAPIDA_3 ));

            lstRecetas.add(new Reseta("Bizcochuelo", "RAPIDA ","INGREDIENTES:\n" +
                    "• Huevos: 5\n" +
                    "• Harina común: 250 gramos\n" +
                    "• Azúcar: 250 gramos\n" +
                    "• Polvo de hornear: 8 gramos\n" +
                    "• Ralladura de un limón\n" +
                    "• Vainilla: 1 cdita\n" +
                    "• Leche: 50 ml\n" +
                    "• Aceite: 25 ml\n",R.drawable.bizcochuelo,Id_videos_conexion.VIDEO_RD_RAPIDA_4 ));

            lstRecetas.add(new Reseta("Harina de maíz", "RAPIDA ","INGREDIENTES:\n" +
                    "• 1/3 taza de harina de maíz\n" +
                    "• 2 tazas de leche\n" +
                    "• 1 palito de canela en rama (opcional)\n" +
                    "• 1/4 de azucar o azucar al gusto\n" +
                    "• 1 pisca de sal\n" +
                    "• 1 cucharadita de vainilla",R.drawable.harinademaiz,Id_videos_conexion.VIDEO_RD_RAPIDA_5 ));

            lstRecetas.add(new Reseta("Tres leches", "RAPIDA ","INGREDIENTES:\n" +
                    "• 4 tazas de harina para todo uso o harina para pasteles\n" +
                    "• 1 taza de azúcar (220 gramos)\n" +
                    "• 1/2 taza de mantequilla (113 gramos)\n" +
                    "• 5 huevos, separados\n" +
                    "• cucharaditas de extracto de vainilla\n" +
                    "• 1/2 taza de leche (240 ml)\n" +
                    "• cucharaditas de polvo de hornear\n" +
                    "• 1/4 cucharadita de sal\n",R.drawable.tresleches,Id_videos_conexion.VIDEO_RD_RAPIDA_6 ));

            lstRecetas.add(new Reseta("Quesillo", "RAPIDA ","INGREDIENTES:\n" +
                    "• 7 huevos\n" +
                    "• 750ml de leche evaporada\n" +
                    "• 12cdas de azúcar\n" +
                    "• Vainilla al gusto\n" +
                    "• ½ taza de azúcar",R.drawable.quesillo,Id_videos_conexion.VIDEO_RD_RAPIDA_7 ));

                lstRecetas.add(new Reseta("Caramelo", "RAPIDA ","INGREDIENTES:\n" +
                    "• 1 Taza de Azucar Blanca\n" +
                    "• 1/2 Taza de Crema de Leche\n" +
                    "• 3 Cucharadas de Mantequilla\n" +
                    "• 1/2 Cucharadita de Vainilla",R.drawable.caramelo,Id_videos_conexion.VIDEO_RD_RAPIDA_8 ));

            }

        if(pais.equals("RD") && categoria.equals("TIPICA")){

            lstRecetas.add(new Reseta("Gallina Guisada", "TIPICA ","INGREDIENTES:\n" +
                    "• 3 1/2 lbs. gallinita\n" +
                    "• 2 cdas. aceite\n" +
                    "• 1 cda. azúcar\n" +
                    "• 3 dientes de ajo triturados, machacados o 1 cdta. en polvo\n" +
                    "• 3 cdas. sofrito\n" +
                    "• 2 cdas. sazón en líquido\n" +
                    "• 2 pqts. sazón con culantro & achiote |\n" +
                    "• 1/4 cdta. pimienta molida\n" +
                    "• 1/4 cdta. cebolla en polvo\n" +
                    "• 1/2 cdta. orégano\n" +
                    "• 1 cda. adobo\n" +
                    "• 1/2 cubito de pollo, sopita o al gusto |\n" +
                    "• 1/2 cdta. vinagre\n" +
                    "• 2 cda. alcaparrado\n" +
                    "• 2 cda. pasta de tomate\n" +
                    "• picante al gusto, opcional\n" +
                    "• ajíes al gusto",R.drawable.gallinaguisada,Id_videos_conexion.VIDEO_RD_TIPICA_1 ));

            lstRecetas.add(new Reseta("Sancocho", "TIPICA ","INGREDIENTES:\n" +
                    "• 5 dientes de ajo machacados\n" +
                    "• 1/2 ají verde, puedes usar rojo también & 3 ajicito gustosos dominicanos no picantes\n" +
                    "• 1/2 cebolla\n" +
                    "• 2 ramitas de ápio \n" +
                    "• cilantro & del cilantro ancho al gusto 6 cubitos de pollo o al gusto\n" +
                    "• una pizca de sal\n" +
                    "• 1-2 zanahorias\n" +
                    "• 1 maíz\n" +
                    "• 2 plátanos verdes (1 para las bolitas o bollitos)\n" +
                    "• 2-3 guineitos verdes\n" +
                    "• 1 ñame",R.drawable.sancochito,Id_videos_conexion.VIDEO_RD_TIPICA_2 ));

            lstRecetas.add(new Reseta("Mangu", "TIPICA ","INGREDIENTES:\n" +
                    "• 4 plátanos verdes.\n" +
                    "• 1 1/2 cucharadita de sal.\n" +
                    "• 4 cucharadas de mantequilla o aceite de oliva.\n" +
                    "• 1 cucharada de cebolla en polvo (opcional).\n" +
                    "• 1/2 taza de agua a temperatura ambiente.",R.drawable.mangu,Id_videos_conexion.VIDEO_RD_TIPICA_3 ));

            lstRecetas.add(new Reseta("Arroz blanco", "TIPICA ","INGREDIENTES:\n" +
                    "• 2 tazas de agua\n" +
                    "• 1 taza de arroz\n" +
                    "• 1 cucharadita de sal",R.drawable.arrozblanco,Id_videos_conexion.VIDEO_RD_TIPICA_4 ));

            lstRecetas.add(new Reseta("Asopao de pollo", "TIPICA ","INGREDIENTES:\n" +
                    " 4 piernas y 4 muslos de pollo\n" +
                    "• 1/2 taza de auyama\n" +
                    "• 1 cucharadita de oregano molido\n" +
                    "• 6 tazas de agua\n" +
                    "• 1taza de arroz\n" +
                    "• 2 tazas de vegetales frisado\n" +
                    "• 1 paquete de culantro y achiote de Goya (opcional)\n" +
                    "• 2 cucharas de sazon liquido\n" +
                    "• 1 cuchara de sazon adobo\n" +
                    "• 1 cuchara de ajo molido\n",R.drawable.asopaopollo,Id_videos_conexion.VIDEO_RD_TIPICA_5 ));

            lstRecetas.add(new Reseta("Moro de maíz", "TIPICA ","INGREDIENTES:\n" +
                    " 1 lata de maíz\n" +
                    "• 2/4 taza de maíz\n" +
                    "• 3 dientes de ajo fresco machacado\n" +
                    "• 2 sobres de sazón con culantro y achiote\n" +
                    "• 1 maso de cilantro\n" +
                    "• cebolla y pimiento cortado en pedacitos\n" +
                    "• 1 cucharada grande aceite\n" +
                    "• 3 tazas de agua\n" +
                    "• 3 tazas de arroz de grano largo\n" +
                    "• 1 calde cubito de pollo o 1 cucharada de polvo de pollo\n" +
                    "• sal al gusto 1o cucharada de sal\n",R.drawable.morodemaiz,Id_videos_conexion.VIDEO_RD_TIPICA_6 ));
            }

            if(pais.equals("RD") && categoria.equals("BEBIDA")){

                lstRecetas.add(new Reseta("Ponche dominicano", "BEBIDA ","INGREDIENTES:\n" +
                        "• 3 yemas de 3 huevos\n" +
                        "• 1 lata de leche carnation o evaporada\n" +
                        "• 1 lata de leche condensada\n" +
                        "• 1 cucharadita de extracto de vainilla\n" +
                        "• media cucharadita de moscada en polvo\n" +
                        "• media cucharadita de canela en polvo\n" +
                        "• 1/4 de taza de ron Dominicano o mas (al gusto)\n" +
                        "• 1 cucharadita de fécula de maiz (maicena)\n",R.drawable.ponchedominicano,Id_videos_conexion.VIDEO_RD_BEBIDA_1 ));

                lstRecetas.add(new Reseta("Morir soñando de naranja", "BEBIDA ","INGREDIENTES:\n" +
                        "• Naranjas frescas\n" +
                        "• Leche evaporada\n" +
                        "• Azúcar a su gusto\n" +
                        "• 1 cuchara de vainilla \n" +
                        "• Hielo al gusto",R.drawable.morirsonando,Id_videos_conexion.VIDEO_RD_BEBIDA_2 ));

                lstRecetas.add(new Reseta("Jugo de Jagua", "BEBIDA ","INGREDIENTES:\n" +
                        "• 5 Jaguas\n" +
                        "• Agua\n" +
                        "• Hielo",R.drawable.jugojagua,Id_videos_conexion.VIDEO_RD_BEBIDA_3 ));
                lstRecetas.add(new Reseta("Morir soñando de limon", "BEBIDA ","INGREDIENTES:\n" +
                        "• Limones frescos\n" +
                        "• Leche evaporada\n" +
                        "• Azúcar a su gusto\n" +
                        "• 1 cuchara de vainilla\n" +
                        "• Hielo al gusto",R.drawable.morirsonandolimon,Id_videos_conexion.VIDEO_RD_BEBIDA_4 ));
            }

        //Posibles combianaciones para USA

        if(pais.equals("USA") && categoria.equals("SALUDABLE")){

            lstRecetas.add(new Reseta("Avena nutritiva", "Saludable ","INGREDIENTES: \n" +
                    "• 50 gramos de avena orgánica\n" +
                    "• 2 cucharas soperas de yogur (o kefir de leche o jugo de limón/lima o kombucha o vinagre o\n" +
                    "suero)\n" +
                    "• Agua tibia filtrada (suficiente para cubrir toda la avena en el bol)\n" +
                    "• 250 mL de leche (puede ser leche de vaca o algún sustituto como la leche de coco)\n" +
                    "• Toppings opcionales: Canela, berries O frutos secos activados\n" +
                    "• Un bol grande en el que remojar\n",R.drawable.avenanutritiva,Id_videos_conexion.VIDEO_EU_SALUDABLE_1 ));
            lstRecetas.add(new Reseta("Agua de avena con manzana", "Saludable ","INGREDIENTES: \n" +
                    "• Avena\n" +
                    "• Agua caliente\n" +
                    "• Azúcar\n" +
                    "• Leche evaporada\n" +
                    "• Vainilla\n" +
                    "• Hielos\n" +
                    "• Manzana",R.drawable.avenaymanzanaverde,Id_videos_conexion.VIDEO_EU_SALUDABLE_2 ));
            lstRecetas.add(new Reseta("Ensalada verde", "Saludable ","INGREDIENTES: \n" +
                    "• 1 Lechuga Romana o cualquier otra lechuga de hojas verdes\n" +
                    "• 1 Pimiento Morron Rojo\n" +
                    "• 1 Pimineto Morron Verde\n" +
                    "• ½ Cebolla Morada\n" +
                    "• 1 taza de Aceitunas Negras\n" +
                    "• 1 taza de Tomates pequeños (yo use tomates uva)\n" +
                    "• ½ Pepino Ingles\n" +
                    "• 1 taza de Queso Feta cortado en cubos pequeños",R.drawable.ensaladaverde,Id_videos_conexion.VIDEO_EU_SALUDABLE_3 ));
            lstRecetas.add(new Reseta("Ensalada de pollo y aguacate", "Saludable ","INGREDIENTES\n" +
                    "• 1 filete de pollo en trozos\n" +
                    "• 2 dientes de ajo picado\n" +
                    "• ½ pimentón en verde en tiras\n" +
                    "• ½ cebolla morada\n" +
                    "• 2 aguacates\n" +
                    "• 50 ml de jugo de limón\n" +
                    "• 1 Lechuga\n" +
                    "• 15 tomates cherry\n" +
                    "• 20 ml de aceite de oliva\n",R.drawable.ensaladadepolloyaguacate,Id_videos_conexion.VIDEO_EU_SALUDABLE_4 ));

        }

        if(pais.equals("USA") && categoria.equals("RAPIDA")){

            lstRecetas.add(new Reseta("Pizza De Pepperoni", "RAPIDA ","INGREDIENTES:\n" +
                    "Para la Masa:\n" +
                    "• 1/2 kg de harina\n" +
                    "• 1 sobre de levadura\n" +
                    "• 1 1/3 taza de agua tibia\n" +
                    "• 1/4 taza de aceite y un poco más para untarle a la masa\n" +
                    "• 1 cucharada de azúcar\n" +
                    "• 1/2 cucharada de sal molida\n" +
                    "Para la Salsa:\n" +
                    "• 1 kg de jitomate saladet maduro\n" +
                    "• 1/2 cebolla\n" +
                    "• 2 dientes de ajo o 1 grande\n" +
                    "• Azúcar\n" +
                    "• Sal\n" +
                    "• Ajo en polvo\n" +
                    "• 1 cajita de puré de tomate condimentado\n" +
                    "• Pimienta negra molida\n" +
                    "• Aceite de oliva\n" +
                    "• 2 cucharaditas de condimentos (orégano, mejorama, tomillo, albahaca, romero y salvia)\n" +
                    "• Queso mozzarella",R.drawable.pizza,Id_videos_conexion.VIDEO_EU_RAPIDA_1 ));

            lstRecetas.add(new Reseta("Perro Caliente", "RAPIDA ","INGREDIENTES:\n" +
                    "• Pan para Perritos\n" +
                    "• Lonchas de Bacon\n" +
                    "• Salchichas con Queso o sin Grandes (Para Perrito)\n" +
                    "• Cebolla Frita\n" +
                    "• Lonchas de Queso\n" +
                    "• Mostaza Normal\n" +
                    "• Ketchup",R.drawable.perrocaliente,Id_videos_conexion.VIDEO_EU_RAPIDA_2 ));

            lstRecetas.add(new Reseta("Hamburguesas de res", "RAPIDA ","INGREDIENTES:\n" +
                    "• 2 lbs d carne d res magra\n" +
                    "• 1/2 cebolla picada\n" +
                    "• 1/2 manojo d cilantro picado\n" +
                    "• consomé d pollo al gusto\n" +
                    "• 2 cucharaditas d pimienta molida\n" +
                    "• 1 cucharadita d sal d ajo\n" +
                    "• 1 cucharadita d cebolla en polvo\n" +
                    "• 1 cucharada d jugo maggi\n" +
                    "• 4 cucharadas d catsup\n" +
                    "• 1 huevo\n" +
                    "• 1/2 tz d corn flakes molidos o pan molido",R.drawable.hamburguesaderes,Id_videos_conexion.VIDEO_EU_RAPIDA_3 ));

            lstRecetas.add(new Reseta("Macarrones con queso", "RAPIDA ","INGREDIENTES:\n" +
                    "• Pasta: 250 gr\n" +
                    "• Manteca: 50 gr\n" +
                    "• Harina: 50 gr\n" +
                    "• Sal: a gusto\n" +
                    "• Leche: 750 ml\n" +
                    "• Pimentón: una pizca\n" +
                    "• Pimienta: a gusto\n" +
                    "• Queso cheddar: 150 gr\n" +
                    "• Queso parmesano: 150 gr",R.drawable.macarronesconqueso,Id_videos_conexion.VIDEO_EU_RAPIDA_4 ));

            lstRecetas.add(new Reseta("Alitas de bufalo", "RAPIDA ","INGREDIENTES:\n" +
                    "• 12 alitas de pollo\n" +
                    "• 200g de una salsa picante a tu elección\n" +
                    "• 100g de mantequilla\n" +
                    "• 1 cucharadita y media de guindilla de cayena o chile molido\n" +
                    "• 1 cucharadita y media de pimentón o Paprika\n" +
                    "• 1 cucharadita de ajo en polvo\n" +
                    "• 100g de harina\n" +
                    "• 1 chorrito de vinagre\n" +
                    "• 1 cucharadita de maizena (harina fina de maíz)\n" +
                    "• sal y pimienta\n" +
                    "• Una pizca de azúcar\n" +
                    "• Aceite",R.drawable.alitasdebufalo,Id_videos_conexion.VIDEO_EU_RAPIDA_5 ));

            lstRecetas.add(new Reseta("Budin de platano", "RAPIDA ","INGREDIENTES:\n" +
                    "• 2 platanos machos maduros\n" +
                    "• 1/4 taza de pasitas\n" +
                    "• 1/2 taza de leche\n" +
                    "• 1 taza de azucar (o al gusto)\n" +
                    "• 3 cucharadas de harina (al gusto)\n" +
                    "• Canela molida al gusto\n" +
                    "• 70 gramos de mantequilla sin sal",R.drawable.budindeplatano,Id_videos_conexion.VIDEO_EU_RAPIDA_6 ));

            lstRecetas.add(new Reseta("Galletas de chispas de chocolate", "RAPIDA ","INGREDIENTES:\n" +
                    "• 1 barrita de mantequilla sin sal derretida (90 gr)\n" +
                    "• 1 huevo\n" +
                    "• ¼ de taza de azúcar normal\n" +
                    "• ¼ de taza de azúcar mascabado\n" +
                    "• 1 ½ taza de harina de trigo\n" +
                    "• 1 cucharadita de polvo para hornear\n" +
                    "• ½ taza de chispas de chocolate\n" +
                    "• 1 cucharadita de esencia de vainilla\n" +
                    "• 1 pisca de sal\n",R.drawable.galletasdechocolate,Id_videos_conexion.VIDEO_EU_RAPIDA_7 ));

            lstRecetas.add(new Reseta("Baked Alaska", "RAPIDA ","INGREDIENTES:\n" +
                    "Helado de vainilla\n" +
                    "• 1 1/4 taza (300 g) de crema batida, enfriada\n" +
                    "• 1/2 lata (7 oz, 198 g) de leche condensada azucarada\n" +
                    "• 2 cucharaditas (10 g) de extracto de vainilla\n" +
                    "• 1 oz (30 g) de chocolate semi dulce, rallado\n" +
                    "Helado de fresa\n" +
                    "• 1 1/4 taza (300 g) de crema batida, enfriada\n" +
                    "• 1/2 lata (7 oz, 198 g) de leche condensada azucarada\n" +
                    "• 1/2 taza (120 g) de mermelada de fresa\n" +
                    "• Colorante rojo, opcional.\n" +
                    "Duende\n" +
                    "• Chocolate semidulce de 3.5 oz (100 g)\n" +
                    "• 1/2 taza (110 g) de mantequilla\n" +
                    "• 1 cucharadita (1 g) de café instantáneo en polvo\n" +
                    "• 1/2 taza (100 g) de azúcar\n" +
                    "• 2 huevos\n" +
                    "• 1 cucharadita (5 g) de extracto de vainilla\n" +
                    "• 1 cucharada (8g) de cacao en polvo sin azúcar\n",R.drawable.bakedalaska,Id_videos_conexion.VIDEO_EU_RAPIDA_8 ));

            lstRecetas.add(new Reseta("Banana Split", "RAPIDA ","INGREDIENTES:\n" +
                    "• 4 plátanos tabasco\n" +
                    "• 4 bolas de helado de chocolate\n" +
                    "• 4 bolas de helado de fresa\n" +
                    "• 4 bolas de helado dulce de leche\n" +
                    "• 1/2 taza de chocolate amargo derretido\n" +
                    "• 4 cucharadas de crema chantilly\n" +
                    "• 4 cucharadas de Grajea de Colores\n" +
                    "• 12 cerezas en almíbar\n",R.drawable.bananasplit,Id_videos_conexion.VIDEO_EU_RAPIDA_9 ));

            lstRecetas.add(new Reseta("Budin de pan", "RAPIDA ","INGREDIENTES\n" +
                    "• litro y medio de leche fresca.\n" +
                    "• 1 lata grande le leche condensada o 1 taza 1/4 de azucar.\n" +
                    "• 6 huevos grandes.\n" +
                    "• 200 a 250 gramos de mantequilla. derretir.\n" +
                    "• 1 a 2 cdas de canela molida.\n" +
                    "• Rayadura de Naranja y limon.\n" +
                    "• 1 cda o mas de escencia de vainilla.\n" +
                    "• si deseas agrega 50 gr de pasas de uva.",R.drawable.budindepan,Id_videos_conexion.VIDEO_EU_RAPIDA_10 ));

            lstRecetas.add(new Reseta("Brownie", "RAPIDA ","INGREDIENTES:\n" +
                    "• 300 gr de chocolate fondue (yo usé chips de hersheys)\n" +
                    "• 100 gr de mantequilla\n" +
                    "• 3 huevos\n" +
                    "• 200 gr de azúcar moreno\n" +
                    "• 60 gr de harina\n" +
                    "• 30 gr de cacao en polvo (yo usé hersheys)\n" +
                    "• 1/2 cucharadita de polvo para hornear\n" +
                    "• 2 remolachas sancochadas",R.drawable.brownie,Id_videos_conexion.VIDEO_EU_RAPIDA_11));

            lstRecetas.add(new Reseta("Pastel de calabaza", "RAPIDA ","INGREDIENTES:\n" +
                    "• 300 g de calabaza (dos rodajas)\n" +
                    "• 300 g de harina de trigo de todo uso (2 y 1/2 tazas)\n" +
                    "• 200 ml aceite (3/4 de taza)\n" +
                    "• 4 huevos tamaño l\n" +
                    "• 200 gr azúcar (3/4 de taza)\n" +
                    "• 16 gr levadura química o polvo de hornear (1 sobre)\n" +
                    "• 1 cucharada de esencia de vainilla y una pizca de sal\n" +
                    "• Mantequilla para engrasar el molde\n" +
                    "• Azúcar glass o 80 gr de chocolate para fundir (cobertura)",R.drawable.pasteldecalabaza,Id_videos_conexion.VIDEO_EU_RAPIDA_12));
        }

        if(pais.equals("USA") && categoria.equals("TIPICA")){

            lstRecetas.add(new Reseta("Costillas en salsa BBQ", "TIPICA ","INGREDIENTES:\n" +
                    "• 1 Cebolla mediana picada\n" +
                    "• 3/4 de taza de salsa de soya\n" +
                    "• 3 dientes de ajo picados\n" +
                    "• 1 cucharadita de limon\n" +
                    "• 1 taza de vino blanco o tinto, o 1 taza de caldo de pollo o de res\n" +
                    "SALSA BBQ:\n" +
                    "• 1/2 cebolla picada\n" +
                    "• 1 taza de azucar\n" +
                    "• 3/4 de taza de vinagre de manzana\n" +
                    "• 1 taza de catsup\n" +
                    "• 1/2 taza de salsa inglesa worcestershire",R.drawable.costillaensalsabbq,Id_videos_conexion.VIDEO_EU_TIPICA_1 ));
            lstRecetas.add(new Reseta("Ensalada de repollo", "TIPICA ","INGREDIENTES:\n" +
                    "• Col (1/4)\n" +
                    "• Lombarda (1/4)\n" +
                    "• Cebolla (1/2)\n" +
                    "• Zanahoria (1)\n" +
                    "• Manzana (1/2)\n" +
                    "• Hojas de hinojo\n" +
                    "• Salsa mahonesa (200 gr)\n" +
                    "• Mostaza suave (al gusto)\n" +
                    "• Nata líquida (50 gr)\n" +
                    "• Zumo de naranja (50 ml)\n" +
                    "• Sal\n" +
                    "• Pimienta negra\n",R.drawable.ensaladaderepollo,Id_videos_conexion.VIDEO_EU_TIPICA_2 ));
            lstRecetas.add(new Reseta("Ensalada de repollo con nueces", "TIPICA ","INGREDIENTES:\n" +
                    "• Mitad de repollo morado (lavado)\n" +
                    "• Mitad de repollo verde (lavado)\n" +
                    "• Media taza de melon bien cortadito\n" +
                    "• Media taza de mango bien cortadito\n" +
                    "• 1 manzana roja mediana cortada en tiritas\n" +
                    "• 1 cebolla roja cortada\n" +
                    "• Hojas de cilantro\n" +
                    "• 1 zanahoria grande lavada y rallada\n" +
                    "Salsa\n" +
                    "• 3 cucharadas de mayonesa\n" +
                    "• 2 cucharadas de vinagre tinto rojo\n" +
                    "• sal y pimienta al gusto (1 cucharadita)\n" +
                    "• jugo de 1 limon verde",R.drawable.ensaladaderepolloconnueces,Id_videos_conexion.VIDEO_EU_TIPICA_3 ));
            lstRecetas.add(new Reseta("Deep dish pizza", "TIPICA ","INGREDIENTES:\n" +
                    "Masa\n" +
                    "• 1¼ taza de agua tibia\n" +
                    "• 2¼ cucharadita de levadura seca activa\n" +
                    "• 2 cucharaditas de azúcar\n" +
                    "• 3¼ tazas de harina\n" +
                    "• ¾ taza de harina de maíz\n" +
                    "• 2 cucharaditas de sal\n" +
                    "• 2 cucharadas de mantequilla, derretida\n" +
                    "• 1 cucharada de aceite de oliva\n" +
                    "Salsa\n" +
                    "• 2 cucharadas de mantequilla\n" +
                    "• 1 cebolla, cortada en cubitos\n" +
                    "• 1 cucharadita de sal\n" +
                    "• 1 cucharadita de pimiento rojo picado\n" +
                    "• 1 cucharadita de orégano",R.drawable.deepdishpizza,Id_videos_conexion.VIDEO_EU_TIPICA_4 ));
            lstRecetas.add(new Reseta("Pastel de calabaza", "TIPICA ","INGREDIENTES:\n" +
                    "• 300 g de calabaza (dos rodajas)\n" +
                    "• 300 g de harina de trigo de todo uso (2 y 1/2 tazas)\n" +
                    "•  200 ml aceite (3/4 de taza)\n" +
                    "• 4 huevos tamaño l\n" +
                    "• 200 gr azúcar (3/4 de taza)\n" +
                    "• 16 gr levadura química o polvo de hornear (1 sobre)\n" +
                    "• 1 cucharada de esencia de vainilla y una pizca de sal\n" +
                    "• Mantequilla para engrasar el molde\n" +
                    "• Azúcar glass o 80 gr de chocolate para fundir (cobertura)",R.drawable.pasteldecalabaza,Id_videos_conexion.VIDEO_EU_TIPICA_5 ));
            lstRecetas.add(new Reseta("Gumbo", "TIPICA ","INGREDIENTES:\n" +
                    "• ½ taza de mantequilla\n" +
                    "• ¾ taza de harina de trigo\n" +
                    "• 3 y ½ tazas de caldo de pollo\n" +
                    "• 50 gramos / ½ lb. de salchicha Andouille (o salchicha picante)\n" +
                    "• 2-3 pechugas de pollo sin piel ni hueso\n" +
                    "• ½ cebolla, picada\n" +
                    "• ½ pimiento morrón verde, picado\n" +
                    "• 2 ramos grandes de apio, picados\n" +
                    "• 4 dientes de ajo, finamente picados\n" +
                    "• 2 tomates medianos, picados\n" +
                    "• 1 y ½ tazas de agua\n" +
                    "• 4-6 hojas de laurel\n" +
                    "• ½ cdita de tomillo seco\n" +
                    "• 1 cdita de especias de cajún\n",R.drawable.gumbo,Id_videos_conexion.VIDEO_EU_TIPICA_6 ));
        }


        if(pais.equals("USA") && categoria.equals("BEBIDA")){

            lstRecetas.add(new Reseta("Cerveza", "BEBIDA ","INGREDIENTES: \n" +
                    "• 2200 gr de Malta Pale extra\n" +
                    "• 50 gr malta Cristal clara.\n" +
                    "• LÚPULOS\n" +
                    "• 17 gr Challenger.\n" +
                    "• 13 gr East Kent Golding\n" +
                    "• 8 gr Styriam Golding.\n" +
                    "• AGUA\n" +
                    "• 15 l de agua total.\n" +
                    "• LEVADURA\n" +
                    "• 1 Sobre levadura de cerveza.",R.drawable.cerveza,Id_videos_conexion.VIDEO_EU_BEBIDA_1 ));
            lstRecetas.add(new Reseta("Limonada con Wisky", "BEBIDA ","INGREDIENTES:\n" +
                    "• Whisky 3 caballitos de (6 onzas)\n" +
                    "• Agua mineral 1 lata\n" +
                    "• Canela molida ½ cucharadita\n" +
                    "• Jarabe natural 1 cucharada\n" +
                    "• Fresas 6 piezas\n" +
                    "• Limón: 2 piezas\n" +
                    "• Azúcar para escarchar 2 cucharadas\n" +
                    "• Fresas para decorar 2 piezas\n" +
                    "• Hielo ½ taza\n" +
                    "• Limón :1 pieza",R.drawable.limonadaconwisky,Id_videos_conexion.VIDEO_EU_BEBIDA_2 ));
            lstRecetas.add(new Reseta("Daikiri de Tequila", "BEBIDA ","INGREDIENTES:\n" +
                    "• Jarabe Natural\n" +
                    "• jugo de limon\n" +
                    "• tequila\n" +
                    "• hielos\n",R.drawable.daikiridetequila,Id_videos_conexion.VIDEO_EU_BEBIDA_3 ));
            lstRecetas.add(new Reseta("Acapulco de noche", "BEBIDA ","INGREDIENTES:\n" +
                    "• *jugo de naranja\n" +
                    "• *tequila\n" +
                    "• *ron blanco",R.drawable.acapulcodenoche,Id_videos_conexion.VIDEO_EU_BEBIDA_4 ));
            lstRecetas.add(new Reseta("Noche Salvaje", "BEBIDA ","INGREDIENTES:\n" +
                    "• Jugo de arandano\n" +
                    "• agua mineral\n" +
                    "• jugo de limon\n" +
                    "• tequila blanco",R.drawable.nochesalvaje,Id_videos_conexion.VIDEO_EU_BEBIDA_5 ));
            lstRecetas.add(new Reseta("Cooler de melón verde", "BEBIDA ","INGREDIENTES:\n" +
                    "• 1 1/2 taza de melon verde\n" +
                    "• agua\n" +
                    "• jugo de limon\n" +
                    "• jarabe natural\n" +
                    "• agua mineral\n" +
                    "• Tequila",R.drawable.coolerdemelonverde,Id_videos_conexion.VIDEO_EU_BEBIDA_6 ));
        }

        //Posibles combianaciones para ESPANA

        if(pais.equals("ESPANA") && categoria.equals("SALUDABLE")){

            lstRecetas.add(new Reseta("Sopa de verduras", "Saludable ","INGREDIENTES: \n" +
                    "• Panceta opcional\n" +
                    "• Calabacín\n" +
                    "• Calabaza\n" +
                    "• Zanahoria\n" +
                    "• Vainas picadas\n" +
                    "• Espinacas\n" +
                    "• Cebolla\n" +
                    "• Guindilla picante opcional\n" +
                    "• Cebolla verde cebollino, verdeo\n" +
                    "• Apio\n" +
                    "• Cilantro\n" +
                    "• Perejil\n" +
                    "• hojas de yerbabuena pocas\n" +
                    "• Aceite de oliva\n" +
                    "• Sal\n" +
                    "• Pimienta",R.drawable.sopadeverduras,Id_videos_conexion.VIDEO_ESPANA_SALUDABLE_1 ));
            lstRecetas.add(new Reseta("Pescado sudado al horno", "Saludable ","INGREDIENTES: \n" +
                    "• 2 ruedas de pescado blanco (merluza es ideal)\n" +
                    "• 2 patatas medianas\n" +
                    "• 1/2 cebolla\n" +
                    "• 1/2 pimiento\n" +
                    "• Una pizca de sal\n" +
                    "• Un poco de pimienta\n" +
                    "• Aceite de oliva\n",R.drawable.pescadosudado,Id_videos_conexion.VIDEO_ESPANA_SALUDABLE_2 ));
            lstRecetas.add(new Reseta("Crema de zanahoria", "Saludable ","INGREDIENTES: \n" +
                    "• 400 gramos de zanahorias (aproximadamente 5 o 6 zanahorias medianas)\n" +
                    "• 2 batatas mediana\n" +
                    "• 4 tazas de caldo de vegetales\n" +
                    "• 1 cucharada de polvo de curry\n" +
                    "• Sal\n" +
                    "• Pimienta",R.drawable.cremadezanahoria,Id_videos_conexion.VIDEO_ESPANA_SALUDABLE_3 ));
            lstRecetas.add(new Reseta("Arroz con verduras", "Saludable ","INGREDIENTES: \n" +
                    "• 1 taza y media de arroz\n" +
                    "• 3 tazas de caldo de vegetales (puedes usar agua también)\n" +
                    "• Media cebolla de tamaño mediano\n" +
                    "• Media zanahoria\n" +
                    "• Medio calabacín\n" +
                    "• 2 dientes de ajo\n" +
                    "• ¼ de pimentón\n" +
                    "• ½ taza de guisantes verdes\n" +
                    "• Un trozo de tallo de puerro\n" +
                    "• 1 tallo de cebollín\n" +
                    "• 1 tomate mediano\n" +
                    "• Sal\n" +
                    "• Pimienta\n" +
                    "• Aceite de oliva",R.drawable.arrozverduras,Id_videos_conexion.VIDEO_ESPANA_SALUDABLE_4 ));

        }

        if(pais.equals("ESPANA") && categoria.equals("RAPIDA")){

            lstRecetas.add(new Reseta("Rosquilla Española", "RAPIDA ","INGREDIENTES: \n" +
                    "• 900 gramos de harina de trigo de todo uso\n" +
                    "• 500 gramos de azúcar\n" +
                    "• 4 huevos\n" +
                    "• 2 limones\n" +
                    "• 150 g de mantequilla\n" +
                    "• 200 ml de anís\n" +
                    "• 30 g de levadura química o polvo de hornear",R.drawable.rosquillaespanola,Id_videos_conexion.VIDEO_ESPANA_RAPIDA_1 ));

            lstRecetas.add(new Reseta("Natilla", "RAPIDA ","INGREDIENTES:"+
                    "1 litro de leche\n" +
                    "• Canela en rajas o en polvo al gusto\n" +
                    "• 1 o 2 cucharadas soperas de vanilla\n" +
                    "• 1/2 taza de fecula de maiz o maicena\n" +
                    "• 1/2 taza de azucar o al gusto\n" +
                    "• 1/2 taza de agua\n" +
                    "• 1 huevo\n" +
                    "• 1/2 taza de pasas (opcional)\n",R.drawable.natilla,Id_videos_conexion.VIDEO_ESPANA_RAPIDA_2 ));

            lstRecetas.add(new Reseta("Crema Catalana", "RAPIDA ","INGREDIENTES:"+
                    "Leche 500 cm3\n" +
                    "• Yemas 4 u.\n" +
                    "• Azúcar 100 gr.\n" +
                    "• Fécula de maíz 25 gr.\n" +
                    "• Ralladura de naranja c/n\n" +
                    "• Esencia de vainilla c/n\n" +
                    "• Azúcar rubia c/n",R.drawable.cremacatalana,Id_videos_conexion.VIDEO_ESPANA_RAPIDA_3 ));

            lstRecetas.add(new Reseta("Sobaos pasiegos", "RAPIDA ","INGREDIENTES:"+
                    "• 500gr de mantequilla\n" +
                    "• 500gr de azúcar y una pizca de sal\n" +
                    "• 2 cucharadas de miel\n" +
                    "• La ralladura de un limón\n" +
                    "• 6 huevos\n" +
                    "• 400gr de harina de trigo\n" +
                    "• Medio sobre de levadura química o polvo para hornear (unos 6gr)",R.drawable.sobaospasiegos,Id_videos_conexion.VIDEO_ESPANA_RAPIDA_4 ));

            lstRecetas.add(new Reseta("Leche frita", "RAPIDA ","INGREDIENTES:\n" +
                    "• 1 litro de leche\n" +
                    "• Canela en rama, limón y naranja\n" +
                    "• 4 huevos\n" +
                    "• 200 g. de azúcar\n" +
                    "• 150 g. de fécula de maíz\n" +
                    "• Harina y huevo para rebozar\n" +
                    "• Azúcar y canela molida\n" +
                    "• Aceite de oliva virgen extra\n",R.drawable.lechefrita,Id_videos_conexion.VIDEO_ESPANA_RAPIDA_5 ));

            lstRecetas.add(new Reseta("Yemas de canela", "RAPIDA ","INGREDIENTES:\n" +
                    "• 5 o 6 huevos de gallina\n" +
                    "• 1/2 de taza de azúcar que son 90 gramos\n" +
                    "• 1/4 de taza de agua que son 50 ml",R.drawable.yemasdecanela,Id_videos_conexion.VIDEO_ESPANA_RAPIDA_6 ));
        }

        if(pais.equals("ESPANA") && categoria.equals("TIPICA")){

            lstRecetas.add(new Reseta("Paella", "TIPICA ","INGREDIENTES TOTALES (De Las 3 Paellas)\n" +
                    "• Arroz especial para paella: Por cada 1 taza, 2 tazas de liquido\n" +
                    "• (yo usé 2 tazas de arroz, 4 tazas de liquido)\n" +
                    "• Si no consigues arroz paellero, entonces compra, ARROZ BLANCO PRECOCIDO\n" +
                    "• Yo usé 3 tazas de arroz ya humedecido, y 4 tazas de liquido\n" +
                    "• (Lo que me sobró, se fue a la tercera olla (La de color negro))\n" +
                    "• Carnes:\n" +
                    "• Costillas de puerco, ó pulpa de pernil, o maciza de puerco (Yo usé 600 gramos aprox para las 3\n" +
                    "paellas)\n" +
                    "• Chorizo ó chistorra al gusto (yo usé 500 gramos de las dos en total para las 3 paellas)\n" +
                    "• Pollo: Muslos de pollo en 4 partes, o piernas de pollo, alitas ó pechuga en cuadritos (Yo usé una\n" +
                    "pechuga (700 gr para las 3 paellas)\n" +
                    "• Camarones: Al gusto; yo usé jumbo y tamaño normal, en total 800 gramos de ambos para las 3\n" +
                    "paellas",R.drawable.paella,Id_videos_conexion.VIDEO_ESPANA_TIPICA_1 ));

            lstRecetas.add(new Reseta("Tortillas de patatas", "TIPICA ","Ingredientes para 8 personas:\n" +
                    "• 750 g de patataas peladas\n" +
                    "• 1/2 cebolla mediana\n" +
                    "• 8 huevos\n" +
                    "• sal\n" +
                    "• aceite de oliva virgen extra",R.drawable.tortillasdepatatas,Id_videos_conexion.VIDEO_ESPANA_TIPICA_2 ));

            lstRecetas.add(new Reseta("Gazpacho", "TIPICA ","INGREDIENTES: \n" +
                    "• Pimiento verde\n" +
                    "• Tomate\n" +
                    "• Ajo\n" +
                    "• Cebolla blanca\n" +
                    "• Pepino\n" +
                    "• Pan\n" +
                    "• Sal\n" +
                    "• Aceite de oliva",R.drawable.gazpacho,Id_videos_conexion.VIDEO_ESPANA_TIPICA_3 ));

            lstRecetas.add(new Reseta("Arroz al horno", "TIPICA ","INGREDIENTES: \n" +
                    "2 cebollas\n" +
                    "2 patatas\n" +
                    "1 tomate\n" +
                    "1 cabeza de ajos\n" +
                    "• Muslos de pollo\n" +
                    "• Costillas de cerdo\n" +
                    "• Morcillas\n" +
                    "• 1kg de arroz\n" +
                    "• Aceite de oliva\n" +
                    "• Colorante alimentario\n" +
                    "• 1 pastilla de caldo de pollo\n" +
                    "• Agua\n" +
                    "• Sal.",R.drawable.arrozalhorno,Id_videos_conexion.VIDEO_ESPANA_TIPICA_4 ));

            lstRecetas.add(new Reseta("Ensalada rusa", "TIPICA ","INGREDIENTES: \n" +
                    "3 papas medianas\n" +
                    "• 1 zanahoria y media\n" +
                    "• 1 taza de arvejas congeladas\n" +
                    "• 1/2 taza de mayonesa\n" +
                    "• 1 lata de atún\n" +
                    "• 1 huevo duro\n" +
                    "• 1 pepinillo en vinagre\n" +
                    "• 1 puñado de aceitunas\n" +
                    "• 2 cdas. de mayonesa extra",R.drawable.ensaladarusa,Id_videos_conexion.VIDEO_ESPANA_TIPICA_5 ));

            lstRecetas.add(new Reseta("Cocido andaluz", "TIPICA ","INGREDIENTES:\n" +
                    "• 1.200 gr de garbanzos ya hidratados\n" +
                    "• 700 gr de gallina\n" +
                    "• 450 gr de jarrete de ternera\n" +
                    "• 300 gr de tocino o panceta de cerdo\n" +
                    "• 1 hueso fresco de ternera\n" +
                    "• 1 hueso añejo\n" +
                    "• 800 gr de calabaza\n" +
                    "• 300 gr de judías verdes\n" +
                    "• 1 chorizo\n" +
                    "• 1 morcilla\n" +
                    "• Sal\n",R.drawable.cocidoandaluz,Id_videos_conexion.VIDEO_ESPANA_TIPICA_6 ));
        }

        if(pais.equals("ESPANA") && categoria.equals("BEBIDA")){

            lstRecetas.add(new Reseta("Cerveza", "BEBIDA ","INGREDIENTES:\n" +
                    "• 2200 gr de Malta Pale extra\n" +
                    "• 50 gr malta Cristal clara.\n" +
                    "• LÚPULOS\n" +
                    "• 17 gr Challenger.\n" +
                    "• 13 gr East Kent Golding\n" +
                    "• 8 gr Styriam Golding.\n" +
                    "• AGUA\n" +
                    "• 15 l de agua total.\n" +
                    "• LEVADURA\n" +
                    "• 1 Sobre levadura de cerveza.",R.drawable.cerveza,Id_videos_conexion.VIDEO_ESPANA_BEBIDA_1 ));

            lstRecetas.add(new Reseta("Queimada", "BEBIDA ","INGREDIENTES: \n" +
                    "• Caña de orujo\n" +
                    "• Azúcar\n" +
                    "• Pelas de limón\n" +
                    "• Granos de café.",R.drawable.queimada,Id_videos_conexion.VIDEO_ESPANA_BEBIDA_2 ));

            lstRecetas.add(new Reseta("Tinto de verano", "BEBIDA ","INGREDIENTES:\n" +
                    "• Soda de limón\n" +
                    "• Rodajas de limón\n" +
                    "• Rodajas de Naranja\n" +
                    "• Hielo\n" +
                    "• Vino",R.drawable.tintodeverano,Id_videos_conexion.VIDEO_ESPANA_BEBIDA_3 ));

            lstRecetas.add(new Reseta("Sangria", "BEBIDA ","INGREDIENTES:\n" +
                    "• 1/2 taza de agua\n" +
                    "• 1 raja de canela\n" +
                    "• 2 cucharadas de azúcar morena\n" +
                    "• 2 nectarinas o melocotones\n" +
                    "• 2 manzanas\n" +
                    "• 1 limón\n" +
                    "• 1 naranja\n" +
                    "• 20 cerezas en almíbar\n" +
                    "• 1/2 taza de jugo de cereza\n" +
                    "• 2 cucharadas de brandy\n" +
                    "• 1/2 taza de agua con gas\n" +
                    "• 570 ml de vino tinto",R.drawable.sangria,Id_videos_conexion.VIDEO_ESPANA_BEBIDA_4 ));
        }


        //Posibles combianaciones para CHINA

        if(pais.equals("CHINA") && categoria.equals("SALUDABLE")){

                lstRecetas.add(new Reseta("Rollitos de verano con salsa dulce", "Saludable ","INGREDIENTES: \n" +
                        "• 1 col china\n" +
                        "• 350 g carne picada cerdo y ternera\n" +
                        "• 1/2 cebolleta\n" +
                        "• 1 zanahoria\n" +
                        "• 1 huevo\n" +
                        "• 1 cd harina\n" +
                        "• 1 ajo\n" +
                        "• 1 trozo de jengibre\n" +
                        "• chile rojo (opcional)\n" +
                        "• 1 cucharada de aceite de sésamo tostado\n" +
                        "• 1 cucharada de vino de arroz\n" +
                        "• 2 cucharada de salsa de soja\n" +
                        "• 1/2 cucharadita de cinco especias chinas\n" +
                        "• pimienta blanca\n" +
                        "sal\n" +
                        "• para la salsa:\n" +
                        "• 2 cucharada de salsa de soja oscura\n" +
                        "• 2 cucharada de salsa de soja dulce\n" +
                        "• 1/2 cucharadita de salsa de chile\n" +
                        "• 1/2 cucharada de vinagre de arroz\n" +
                        "• 4 cucharada de caldo de pollo",R.drawable.rollitosdeveranoconsalsadulce,Id_videos_conexion.VIDEO_ESPANA_SALUDABLE_1 ));
                lstRecetas.add(new Reseta("Sopa de fideos al estilo oriental", "Saludable ","INGREDIENTES: \n" +
                        "• 1/4 taza de aceite vegetal\n" +
                        "• 12 echalotes pequeños, finamente rebanados\n" +
                        "• 175 gramos fideos de huevo\n" +
                        "• 1 taza de germinado de soya\n" +
                        "• 3 litros de caldo de pollo\n" +
                        "• 3 tazas de pechuga de pollo cocida y desmenuzada\n" +
                        "• 3 cebollines picados\n" +
                        "• Sal y pimienta al gusto\n",R.drawable.sopadefideosalestilooriental,Id_videos_conexion.VIDEO_ESPANA_SALUDABLE_2 ));
                lstRecetas.add(new Reseta("Pollo con salsa de champiñones y almendras", "Saludable ","INGREDIENTES: \n" +
                        "• 1/2 pollo pequeño (2 muslos y 2 sobremuslos) de corral\n" +
                        "• 3 cdas aceite de oliva\n" +
                        "• 1 cebolla\n" +
                        "• 1/4 champiñones\n" +
                        "• 1 lata guisantes\n" +
                        "• 1/2 cda maizena\n" +
                        "• 1 vaso vino blanco seco\n" +
                        "• 1 puñado almendras naturales o avellanas\n" +
                        "• 3 dientes ajo\n" +
                        "• azafrán en rama\n" +
                        "• perejil picado\n" +
                        "• tomillo\n" +
                        "• albahaca\n" +
                        "• sal y pimienta\n",R.drawable.polloconsalsadechampinonesyalmendras,Id_videos_conexion.VIDEO_ESPANA_SALUDABLE_3 ));
                lstRecetas.add(new Reseta("Carne con brocoli", "Saludable ","INGREDIENTES: \n" +"1 cucharadita de maicena.\n" +
                        "1 taza de caldo de pollo.\n" +
                        "½ kilogramo de filete de res.\n" +
                        "½ diente de ajo picado.\n" +
                        "2 cucharadas soperas de cebolla picada.\n" +
                        "1 cucharada sopera de mantequilla.\n" +
                        "¼ taza de salsa de soja.\n" +
                        "¼ taza de salsa Hoisin.",R.drawable.carnedebrocoli,Id_videos_conexion.VIDEO_ESPANA_SALUDABLE_4 ));
        }

        if(pais.equals("CHINA") && categoria.equals("RAPIDA")){

                lstRecetas.add(new Reseta("POLLO A LA MIEL ESTILO CHINO", "RAPIDA ","INGREDIENTES: \n" +
                        "• 3 pechugas enteras de pollo\n" +
                        "• Aceite de oliva (para freír)\n" +
                        "• Semillas de sésamo (para adornar)\n" +
                        "• Para el rebozado:\n" +
                        "• 4 cucharadas de fécula de maíz\n" +
                        "• Harina un 1/4 de taza\n" +
                        "• 1/2 taza de agua\n" +
                        "• 1 cucharadita de polvo para hornear\n" +
                        "• 1/2 cucharadita de sal\n" +
                        "• 1 huevo\n" +
                        "• 1 clara de huevo\n" +
                        "• Para la salsa:\n" +
                        "• 1 1/2 cucharadas de aceite\n" +
                        "• 2 cucharaditas de jengibre picado (si no tienes fresco en polvo)\n" +
                        "• 3 cucharadas de ajo (picado)\n" +
                        "• 1 cucharadita de sal\n" +
                        "• 4 cucharadas de miel",R.drawable.polloalamielestilochino,Id_videos_conexion.VIDEO_CHINA_RAPIDA_1 ));
                lstRecetas.add(new Reseta("Pollo A La Naranja", "RAPIDA ","INGREDIENTES: \n" +
                        "Para el pollo!\n" +
                        "• 1 pechuga de pollo grande sin hueso y cortada en cubos tamaño bocado sazonadas con salpimienta y papikra\n" +
                        "• 3/4 taza de fécula de maíz blanca maizena revuelta con sal al gusto\n" +
                        "• 3/4 taza de harina de trigo revuelta con sal al gusto\n" +
                        "• 2 huevos batidos con sal y pimienta al gusto\n" +
                        "• Aceite Vegetal o de canola para freír\n" +
                        "Para la salsa de naranja\n" +
                        "• 1 taza y media de jugo de naranja fresco o de bote\n" +
                        "• 1 limon ralladura\n" +
                        "• 3/4 taza de caldo de pollo\n" +
                        "• 1/4 taza de salsa de solla\n" +
                        "• 2 cucharads de azucar morena\n" +
                        "• 3 cucharadas de aceite de ajonjoli\n" +
                        "• 2 cebollinos picados",R.drawable.polloalanaranja,Id_videos_conexion.VIDEO_CHINA_RAPIDA_2 ));
                lstRecetas.add(new Reseta("Torta Nian Gao de Año nuevo", "RAPIDA ","INGREDIENTES:\n" +
                        "• 400 g de harina de arroz glutinoso (harina de arroz pegajoso)\n" +
                        "• 2/3 taza (130 g) de azúcar moreno\n" +
                        "• 210 ml de agua hirviendo\n" +
                        "• 1 cucharada de leche\n" +
                        "• Agua (por cucharadas)",R.drawable.tortaniangaodeanonuevo,Id_videos_conexion.VIDEO_CHINA_RAPIDA_3 ));
                lstRecetas.add(new Reseta("Bollos de piña", "RAPIDA ","INGREDIENTES:\n" +
                        "• 2 tazas harina cernida\n" +
                        "• 1/2 taza azúcar\n" +
                        "• 3 Cucharadas polvo de hornear\n" +
                        "• 1/2 cucharadita sal\n" +
                        "• 1 huevo\n" +
                        "• 1/4 taza aceite de cocina\n" +
                        "• 1 taza leche\n" +
                        "• piňa en trozos bien escurrida en almíbar",R.drawable.bollosdepina,Id_videos_conexion.VIDEO_CHINA_RAPIDA_4 ));
                lstRecetas.add(new Reseta("Helado frito", "RAPIDA ","INGREDIENTES:\n" +
                        "• Helado al gusto (vainilla, chocolate…)\n" +
                        "• 1 huevo\n" +
                        "• Pan de molde sin corteza\n" +
                        "• 1 taza de harina\n" +
                        "• ½ taza de leche\n" +
                        "• Canela molida\n" +
                        "• Sirope para decorar\n" +
                        "• Aceite para freír",R.drawable.heladofrito,Id_videos_conexion.VIDEO_CHINA_RAPIDA_5 ));
                lstRecetas.add(new Reseta("Barba de dragon dulce", "RAPIDA ","INGREDIENTES:\n" +
                        "• 250g de azúcar\n" +
                        "• 30g de sirope de maíz o azúcar invertido\n" +
                        "• Un chorrito de vinagre\n" +
                        "• 120ml de agua",R.drawable.barbadedragondulce,Id_videos_conexion.VIDEO_CHINA_RAPIDA_6 ));
        }

        if(pais.equals("CHINA") && categoria.equals("TIPICA")){

            lstRecetas.add(new Reseta("Arroz con huevo", "TIPICA ","INGREDIENTES:\n" +
                    "• 3 tazas de arroz.\n" +
                    "• Sal al gusto (Yo uso algo así como media cucharada de sal)\n" +
                    "• 1 cucharon de aceite.\n" +
                    "• 3 tazas de agua.\n" +
                    "• 4 huevos.",R.drawable.arrozchinofrito,Id_videos_conexion.VIDEO_CHINA_TIPICA_1 ));
            lstRecetas.add(new Reseta("Sopa Wonton", "TIPICA ","INGREDIENTES:\n" +
                    "• 40 piezas de pasta wontons\n" +
                    "• 1 tallo cebolletas\n" +
                    "• pimienta blanca\n" +
                    "• aceite de sésamo\n" +
                    "• Para el relleno\n" +
                    "• 300 g. de cerdo\n" +
                    "• 300 g. de langostinos\n" +
                    "• 100 g. de tallos de cebolleta\n" +
                    "• 1 cucharada de salsa de soja ligera\n" +
                    "• ½ cucharada azúcar\n" +
                    "• 2 cucharadas de  maicena\n" +
                    "• 1 cucharadita de sal\n" +
                    "• pimienta blanca\n" +
                    "• 1 cucharadita aceite de sésamo",R.drawable.sopawonton,Id_videos_conexion.VIDEO_CHINA_TIPICA_2 ));
            lstRecetas.add(new Reseta("MA PO TOFU", "TIPICA ","INGREDIENTES:\n" +
                    "• 250 g de carne mixta picada\n" +
                    "• 2 dientes de ajo\n" +
                    "• 3 cucharaditas de fécula de patata\n" +
                    "• 1 cucharada de salsa de ostras\n" +
                    "• 1 cucharadita de aceite de sésamo\n" +
                    "• 1 cucharada de salsa de soja\n" +
                    "• Aceite de oliva\n" +
                    "• 3 cucharaditas de pasta de guindilla picante\n" +
                    "• 750 g de tofu firme\n" +
                    "• 2 Cebolletas frescas\n" +
                    "• 50 ml de caldo de pollo\n" +
                    "• 1 cucharadita de cebollino picado\n" +
                    "• 1 cucharada de ketchup\n" +
                    "• Sal\n" +
                    "• Ajinomoto\n" +
                    "• Azúcar",R.drawable.mapotofu,Id_videos_conexion.VIDEO_CHINA_TIPICA_3 ));
            lstRecetas.add(new Reseta("Camarones Fritos", "TIPICA ","INGREDIENTES:\n" +
                    "• 900g de camarones\n" +
                    "• 700 ml de kétchup\n" +
                    "• 1 cucharada de pimienta negra recién molida\n" +
                    "• ¼ de cucharadita de comino molido\n" +
                    "• 1 cucharada de ajo granulado\n" +
                    "• 1 cucharada de sal\n" +
                    "• 1 taza de jugo de limón\n" +
                    "• Aceite de soya puro, para freír\n" +
                    "• Harina para todo uso",R.drawable.camaranosfritos,Id_videos_conexion.VIDEO_CHINA_TIPICA_4 ));
            lstRecetas.add(new Reseta("Chow mein de pollo", "TIPICA ","INGREDIENTES:\n" +
                    "• 200 g de fideos chinos o noodles deshidratados (los encuentras en cualquier supermercado bien surtido)\n" +
                    "• 120 g de pechuga de pollo cortada en trozos\n" +
                    "• 100 g de brotes de soja\n" +
                    "• Soja, una cucharada\n" +
                    "• 3 dientes de ajo\n" +
                    "• 1 zanahoria cortada en tiras\n" +
                    "• Una cebolla fresca o cebolleta cortada en trozos\n" +
                    "• Sal y pimienta\n" +
                    "• 1 cucharada de aceite de sésamo (lo encuentras en grandes superficies)\n" +
                    "• Aceite de girasol\n" +
                    "• 3 cucharadas de agua",R.drawable.chowmeindepollo,Id_videos_conexion.VIDEO_CHINA_TIPICA_5 ));
            lstRecetas.add(new Reseta("Pato a la pekinesa", "TIPICA ","INGREDIENTES:\n" +
                    "• Pato (2 Kg)\n" +
                    "• Cebolla (1 pieza)\n" +
                    "• Jengibre (2 trozos pequeños)\n" +
                    "• Sal (1 cucharada)\n" +
                    "• Vino de arroz o jerez seco (1 cucharita)\n" +
                    " Para escaldar el pato:\n" +
                    "• Agua (10 tazas)\n" +
                    "• Sal (3 cucharadas)\n" +
                    "• Salsa de soya (1 cucharada)\n" +
                    "• Miel (2 cucharadas)\n" +
                    "• Salsa Hoisin (4 cucharadas)\n" +
                    "• Pinceles de cebolla",R.drawable.patoalapekinesa,Id_videos_conexion.VIDEO_CHINA_TIPICA_6 ));
        }

        if(pais.equals("CHINA") && categoria.equals("BEBIDA")){

            lstRecetas.add(new Reseta("Té De Burbujas", "BEBIDA ","INGREDIENTES:\n" +
                    "• 2 tazas de té negro concentrado\n" +
                    "• 3 cucharadas de leche condensada\n" +
                    "• 4 cucharadas de perlas de tapioca en almibar\n" +
                    "• 1 taza de leche 2% libre de lactosa\n" +
                    "• 2 tazas de hielo picado",R.drawable.tedeburbujas,Id_videos_conexion.VIDEO_CHINA_BEBIDA_1 ));
            lstRecetas.add(new Reseta("Té con whisky", "BEBIDA ","INGREDIENTES:\n" +
                    "• 1/2 taza de azúcar\n" +
                    "• 8 bolsitas de té negro\n" +
                    "• 1/2 taza de hojas de menta fresca\n" +
                    "• 2 tazas de whisky",R.drawable.teconwhisky,Id_videos_conexion.VIDEO_CHINA_BEBIDA_2 ));
            lstRecetas.add(new Reseta("Leche de soya", "BEBIDA ","INGREDIENTES: \n" +
                    "• 500 gramos de fríjol de soya\n" +
                    "• 1 litro de agua\n" +
                    "• 2 cucharadas de azúcar\n" +
                    "• 1 varita de canela",R.drawable.lechedesoya,Id_videos_conexion.VIDEO_CHINA_BEBIDA_3 ));
            lstRecetas.add(new Reseta("Té De Crisantemo", "BEBIDA ","INGREDIENTES:\n" +
                    "• Una taza de agua hirviendo\n" +
                    "• Cuatro flores secas de crisantemo o crisantelo\n" +
                    "• Endulzante al gusto",R.drawable.tedecrisantemo,Id_videos_conexion.VIDEO_CHINA_BEBIDA_4 ));
            lstRecetas.add(new Reseta("Vino de arroz", "BEBIDA ","INGREDIENTES:\n" +
                    "• Granos\n" +
                    "• El agua\n" +
                    "• El fermento del licor",R.drawable.vinoarrozchino,Id_videos_conexion.VIDEO_CHINA_BEBIDA_5 ));
        }

        RecyclerView myrv= findViewById(R.id.recycleview_id);


        RecycleViewAdapter myAdapter = new RecycleViewAdapter(this,lstRecetas);

        myrv.setLayoutManager(new GridLayoutManager(this,2 ));
        myrv.setAdapter(myAdapter);
    }


}
