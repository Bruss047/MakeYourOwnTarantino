package tarantino047.makeyourowntarantino.Actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

import tarantino047.makeyourowntarantino.Mix;
import tarantino047.makeyourowntarantino.R;

public class MakeYTarantino extends AppCompatActivity {

    private TextView texto;
    private TextView seek2;
    private SeekBar sk;
    private SeekBar sk2;
    private Button bb;
    private RadioButton ca;
    private RadioButton ca2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_ytarantino);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        texto = (TextView) findViewById(R.id.texto);
        seek2 = (TextView) findViewById(R.id.seek2);
        sk = (SeekBar) findViewById(R.id.venganza);
        ca = (RadioButton) findViewById(R.id.radioButton);
        ca2 = (RadioButton) findViewById(R.id.radioButton2);
        sk2 = (SeekBar) findViewById(R.id.violencia);
        bb = (Button) findViewById(R.id.bf);
        texto.setText("Venganza: " + sk.getProgress() + " / " + sk.getMax());
        seek2.setText("Violencia: " + sk2.getProgress() + " / " + sk2.getMax());

        //1: 0-0-BUENA
        final Mix m1 = new Mix("\n" +
                "LA MONJA", "Una monja comprometida con sus hábitos dará todo por encontrar la iluminación del Señor, luchando con Amor y Justicia celestial.\n" +
                "\n" +
                "CAST:  Natalie Portman/ Gary Oldman/ Denzel Washington…\n", "Imperdible, Sagaz, Audaz, una muestra de lo mejor del cine trash.","4");
        //2: 0-0-MALA
        final Mix m2 = new Mix("ZAPATOS DEL BRONX", "Un hombre sin miedo a nada deberá poner a flote su zapatería, evitando las confrontaciones con su amada esposa.\n" +
                "\n" +
                "CAST: Diego Luna / Halle Berry/ Pat Morita... \n", "Aburrida, predecible. No llegamos nunca a generar empatía con los zapatos. Para ver un domingo a las 14hs si se corta el cable.\n","2");
        //3: 0-50-BUENA

        final Mix m3 = new Mix("3/2 KIRKY BULLET", "Western épico donde Douglas Kirk deberá desplazar al corrupto Sheriff del pueblo y tomar su lugar mediante balas y hachas. Su ley: tres amputaciones por persona. Mínimo.\n" +
                " \n" +
                "CAST: Nicolas Cage/ Matthew McConaughey / Hilary Swank...\n", "Impactante, mantiene la tensión en todo momento pero no llega a satisfacer del todo. Faltan más amputaciones e inspiración.","3");
        //4: 0-50-MALA

        final Mix m4 = new Mix(" MIAMI PHOTOKILL", "El empresario más corrupto de Miami desea incursionar en el negocio de las drogas. Asesinando rivales y matando agentes de fotomultas a como dé lugar.\n" +
                " \n" +
                "CAST: Diego Torres / Ron Pearlman / Penélope Cruz...\n", "Comienza lenta pero gana enteros después de la primera fotomulta. Lo peor que podrían haber hecho. Recomendada para ver cuanto antes.","4");
        // 0-100-BUENA
        final Mix m5 = new Mix("CHIPA JUSTICE RELOADED", "Nadie espera nada de un vendedor de chipá, excepto chipá. Michael Juarez es la excepción. Siendo un asesino Ad Honorem, Michael los destripará y los llenará de Chipá para su contrabando.\n" +
                " \n" +
                "CAST: Daniel Day Lewis / Gary Oldman / Scarlett Johansson...\n", "Visceral, elocuente, volumétrica. Daniel Day Lewis da lo mayor de su carrera actoral en un Thriller descomunal. Verla cuanto antes. ¡No volverán a comer chipá!","5");
        //0-100-MALA
        final Mix m6 = new Mix("PARTY VOLEY", "Un policía local debe investigar el brutal asesinato de un joven jugador de Voley, una vez que termine de recuperar todas las piezas del cuerpo. 3 sospechosos, un asesino. ¿Uno?. \n" +
                " \n" +
                " CAST: Dominic Purcell / Steven Seagal / Monica Bellucci...\n", "Sosa, aburrida, no recomendable. No llegan a encajar las partes, tanto las de la víctima como las del film.", "1");
        //50-0-BUENA
        final Mix m7 = new Mix("FRIENDLY ENVIDIA", "Megan es conductora designada en un pueblo apartado de California. La envidia invade su mente al destruir el auto de su amigo Brad atropellando buzones de correo a mansalva para vengarse por la calidad automotriz de su amigo. Desoladora y épica! \n" +
                "  \n" +
                "CAST: Emma Stone/ Leonardo Dicaprio / Jamie Foxx...\n", "Mala, abominable. La recomiendo solo como castigo.","1");
        //50-0-MALA
        final Mix m8 = new Mix("WHO KILLED GOLDIE NIGELS?", "Dentro de un submarino ruso, alguien ha ahogado al pez del Teniente Nigels. Grave error. El Teniente buscará a los responsables y les pedirá un explicación lógica al respecto. 193 minutos intensos y angustiantes. \n" +
                " \n" +
                "CAST: Naomi Watts / Robert Pattinson / Rupert Grint...\n", "Excelente ambientación, trama compleja que resulta satisfactoria en su culminación. Se queda corta en cuanto a minutos de metraje para terminar de abordar todo el conflicto. Se espera la segunda parte.", "4");
        //50-50-BUENA
        final Mix m9 = new Mix("VENGANCINDARIO!", "En Kansas, un obrero de la construcción es asesinado en un ajuste de cuentas, despertando en su nieto Murray una sangrienta venganza que lo llevará a construir casas sobre los cuerpos de los culpables, conformando así un Vengancindario. \n" +
                " \n" +
                "CAST: Tim Robbins/ Anthony Hopkins / Jennifer Jason Leigh...", "Entretenida pero monótona, por momentos se confunde con episodio de Hágalo usted mismo. Aún así cuenta con buenas interpretaciones. Para un día de lluvia.", "3");
        // 50-50-MALA
        final Mix m10 = new Mix("DONDE LAS HERMANAS VUELAN", "Una explosión en Florida deja sin vida a la hermana de Susan Bullock. Conociendo que la explosión fue producto del extremista Mustafa Boombastic, Susan viajara hasta medio Oriente para cobrar venganza con una colección casera de bombas listas para ser catadas por el siniestro Mustafa. \n" +
                "CAST: Carmen Electra/ Moria Casan/ Chuck Norris…", "Lo único que realmente explota en esta película es la crispación. Mala. Rescatando un punto gracias a lo bien logrado de las 64 explosiones que se dan en 101 minutos de película. Como cabían tantas bombas en su cartera?", "3");

        final Mix m11 = new Mix("CRAZY GARDEN", "Samanta Garden tenía un precioso jardín hasta que un grupo de adolescentes decidió destruirlo y llenar de abono humano sus macetas. Samanta, como una planta carnívora los buscara. Con sus intestinos arará la tierra y con sus cabezas formará horribles espantapájaros sangrientos.\n" +
                "CAST: Meryl Streep/ Jamie Fox / Jean Reno...\n", "Buena. Nos hace repensar cómo tenemos que abonar nuestra tierra y aprender a respetar los jardines ajenos. Un Jamie Foxx inspirado y escatológico y una Meryl Streep deslumbrante.","4");

        final Mix m12 = new Mix("RACE FOR THE LIVING", "Cuando el perro de Michael es accidentalmente atropellado por su vecino, éste decide iniciar una revancha tamaño familiar, atropellando a la madre, al padre, al hijo, al tío, al sobrino, al mejor amigo y a la mujer de su vecino, a fin de aliviar su dolor por la mascota perdida.    \n" +
                " \n" +
                "CAST: Adam Sandler/ Shakira / Shawn Wayans...\n", "Es buena, pero algo le falta. Gran fotografía y despliegue artístico. Entretiene, pero se queda corta. Demasiados funerales para una sola película. Recomendada para ver en familia sin grandes alardes.", "3");

        final Mix m13 = new Mix("PAYBACK 8", "El asesinato de su pequeño hijo de 5 años es la peor pesadilla que podría haber vivido el jefe de la mafia neoyorkina Jack Chavez. Ahora, el desolado padre deberá tomar venganza persiguiendo y demandando a los homicidas ante la Justicia por daños y perjuicios.\n" +

                "CAST: Al Pacino/ Robert Downey Jr / Meryl Streep...\n", "Deslumbrante. Emotiva. Nos hace replantear la jurisprudencia americana. Un capo Mafia muy decente rompiendo el cliché del género. El Padrino es bazofia en comparación. ", "5");

        final Mix m14 = new Mix("BAMBU PEACE", "En medio de la Guerra Fría, el general Kuscher es brutalmente asesinado por las fuerzas soviéticas en un acto de traición. Su segundo al mando decide tomar venganza rebelándose contra todo el sistema soviético. Solo él y su bastón de bambú justiciero podrán terminar con este largo enfrentamiento bélico. \n" +

                "CAST: Channing Tatum / Paris Hilton / Jimmy Fallon...\n", "Gran contexto histórico desaprovechado. Demasiado sobreactuadas las coreografías con el Bambú. Para el olvido. Mejor es destaparle el inodoro a la Tota Santillan.", "2");

        final Mix m15 = new Mix("WELCOME TO IRAN", "Un exiliado iraní se dirige a Bulgaria para iniciar un célula terrorista a raíz del exterminio de gran parte de su familia en su pais natal. Con la ayuda de socios como el Señor Pantera y Miss Gorrión planeará un atentado a gran escala en el Congreso búlgaro con perros bomba de corto alcance. \n" +

                "CAST: Sacha Baron Cohen / Anne Hathaway / Anthony Hopkins...\n", "Real, intimidante. Narra con gran acierto el contexto bélico introduciéndonos en el arte poco conocido de los perros explosivos. No importa su raza o etnia, los perros volarán por los aires. Recomendable.", "4");

        final Mix m16 = new Mix("YANET YANET", "Yanet Vulcan pierde a sus hijos y esposo durante un asalto a su hogar. Luego de una serie de disparos, los ladrones la dan por muerta. Grave error. Yanet volverá para cobrar venganza, con un par de extremidades menos pero dispuesta a todo para lograr su cometido con la ayuda de su antigua resortera. \n" +

                " CAST: Jennifer López / Sebastián Estevanez/ Tobey Maguire...\n", "Guión inconexo, personajes para el olvido. La protagonista muere producto de un gomerazo, como si fuera una especie de karma barato. No es un spoiler, es un favor.", "1");

        final Mix m17 = new Mix("INTESTINO MILE", "Wisconsin se descontrola. Cadaveres sin intestinos cuelgan de los arboles aquí y alla. Wilson Carraghan buscara al asesino para vengar la muerte de su esposa y sus 7 hijos, sus tios, sus hermanos, sus sobrinos y sus cuñados intentando recuperar los kilómetros de intestinos que le pertenecen.\n" +
                "CAST:  Christoph Waltz / Johnny Depp/ Keira knightley...\n", "Un tanto gore, pero vale la pena. Una gran lección de venganza y una gran lección sobre anatomía. Apreciaras más tus intestinos después de verla. Casi recomendable.","3");

        final Mix m18 = new Mix("APOCALISIS LATER", "En un entorno post apocalíptico, la sobreviviente Mara Jordan moverá cielo y tierra para dar con el científico Nazi que originó la catastrofe.\n" +
                "La heroína renga lo buscará en el páramo desolado, sin Gps, con tan solo una cuchilla afilada y una campera impermeable. \n" +

                "CAST: Cameron Diaz/ Flavio Mendoza/  Xuxa…\n", "Epica, Monumental, Gigantezca, Colosal. La mejor versión de Xuxa. Genialidad pura. Obra maestra. Mirala si te gusto Scarface.","5");

        sk.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


                if (sk.getProgress() < 25) {
                    texto.setText("Venganza: " + sk.getProgress() + " / " + sk.getMax());
                } else if (sk.getProgress() >= 25 && sk.getProgress() < 85) {
                    texto.setText("Venganza Sádica: " + sk.getProgress() + " / " + sk.getMax());
                } else {
                    texto.setText("Venganza PsicoPatica Activa!!!: " + sk.getProgress() + " / " + sk.getMax());
                }


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sk2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


                if (sk2.getProgress() < 25) {
                    seek2.setText("Violencia: " + sk2.getProgress() + " / " + sk2.getMax());
                } else if (sk2.getProgress() >= 25 && sk2.getProgress() < 85) {
                    seek2.setText("Violencia Mórbida: " + sk2.getProgress() + " / " + sk2.getMax());
                } else {
                    seek2.setText("Violencia Apoteósica: " + sk2.getProgress() + " / " + sk2.getMax());
                }


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //0 0 buena
                if (sk.getProgress() < 25 && sk2.getProgress() < 25 && ca.isChecked()) {
                    Intent pase = new Intent(MakeYTarantino.this, Resultado.class);
                    pase.putExtra("titulo", m1.getNombre());
                    pase.putExtra("sinopsis", m1.getSinopsis());
                    pase.putExtra("critica", m1.getCritica());
                    pase.putExtra("calificacion", m1.getCalificacion());

                    startActivity(pase);
                } else if (sk.getProgress() < 25 && sk2.getProgress() < 25 && ca2.isChecked()) {
                    Intent pase = new Intent(MakeYTarantino.this, Resultado.class);
                    pase.putExtra("titulo", m2.getNombre());
                    pase.putExtra("sinopsis", m2.getSinopsis());
                    pase.putExtra("critica", m2.getCritica());
                    pase.putExtra("calificacion", m2.getCalificacion());

                    startActivity(pase);
                }//0 50 buena
                else if (sk.getProgress() < 25 && sk2.getProgress() >= 25 && sk2.getProgress() < 85 && ca.isChecked()) {
                    Intent pase = new Intent(MakeYTarantino.this, Resultado.class);
                    pase.putExtra("titulo", m3.getNombre());
                    pase.putExtra("sinopsis", m3.getSinopsis());
                    pase.putExtra("critica", m3.getCritica());
                    pase.putExtra("calificacion", m3.getCalificacion());

                    startActivity(pase);
                } else if (sk.getProgress() < 25 && sk2.getProgress() >= 25 && sk2.getProgress() < 85 && ca2.isChecked()) {
                    Intent pase = new Intent(MakeYTarantino.this, Resultado.class);
                    pase.putExtra("titulo", m4.getNombre());
                    pase.putExtra("sinopsis", m4.getSinopsis());
                    pase.putExtra("critica", m4.getCritica());
                    pase.putExtra("calificacion", m4.getCalificacion());


                    startActivity(pase);
                } else if (sk.getProgress() < 25 && sk2.getProgress() >= 85 && ca.isChecked()) {
                    Intent pase = new Intent(MakeYTarantino.this, Resultado.class);
                    pase.putExtra("titulo", m5.getNombre());
                    pase.putExtra("sinopsis", m5.getSinopsis());
                    pase.putExtra("critica", m5.getCritica());
                    pase.putExtra("calificacion", m5.getCalificacion());

                    startActivity(pase);
                } else if (sk.getProgress() < 25 && sk2.getProgress() >= 85 && ca2.isChecked()) {
                    Intent pase = new Intent(MakeYTarantino.this, Resultado.class);
                    pase.putExtra("titulo", m6.getNombre());
                    pase.putExtra("sinopsis", m6.getSinopsis());
                    pase.putExtra("critica", m6.getCritica());
                    pase.putExtra("calificacion", m6.getCalificacion());

                    startActivity(pase);
                } else if (sk.getProgress() >= 25 && sk.getProgress() < 85 && sk2.getProgress() < 25 && ca.isChecked()) {
                    Intent pase = new Intent(MakeYTarantino.this, Resultado.class);
                    pase.putExtra("titulo", m7.getNombre());
                    pase.putExtra("sinopsis", m7.getSinopsis());
                    pase.putExtra("critica", m7.getCritica());
                    pase.putExtra("calificacion", m7.getCalificacion());

                    startActivity(pase);
                } else if (sk.getProgress() >= 25 && sk.getProgress() < 85 && sk2.getProgress() < 25 && ca2.isChecked()) {
                    Intent pase = new Intent(MakeYTarantino.this, Resultado.class);
                    pase.putExtra("titulo", m8.getNombre());
                    pase.putExtra("sinopsis", m8.getSinopsis());
                    pase.putExtra("critica", m8.getCritica());
                    pase.putExtra("calificacion", m8.getCalificacion());

                    startActivity(pase);
                } else if (sk.getProgress() >= 25 && sk.getProgress() < 85 && sk2.getProgress() >= 25 && sk2.getProgress() < 85 && ca.isChecked()) {
                    Intent pase = new Intent(MakeYTarantino.this, Resultado.class);
                    pase.putExtra("titulo", m9.getNombre());
                    pase.putExtra("sinopsis", m9.getSinopsis());
                    pase.putExtra("critica", m9.getCritica());
                    pase.putExtra("calificacion", m9.getCalificacion());

                    startActivity(pase);
                }
                //10: 50-50-MALA
                else if (sk.getProgress() >= 25 && sk.getProgress() < 85 && sk2.getProgress() >= 25 && sk2.getProgress() < 85 && ca2.isChecked()) {
                    Intent pase = new Intent(MakeYTarantino.this, Resultado.class);
                    pase.putExtra("titulo", m10.getNombre());
                    pase.putExtra("sinopsis", m10.getSinopsis());
                    pase.putExtra("critica", m10.getCritica());
                    pase.putExtra("calificacion", m10.getCalificacion());

                    startActivity(pase);
                } else if (sk.getProgress() >= 25 && sk.getProgress() < 85 && sk2.getProgress() >= 85 && ca.isChecked()) {
                    Intent pase = new Intent(MakeYTarantino.this, Resultado.class);
                    pase.putExtra("titulo", m11.getNombre());
                    pase.putExtra("sinopsis", m11.getSinopsis());
                    pase.putExtra("critica", m11.getCritica());
                    pase.putExtra("calificacion", m11.getCalificacion());

                    startActivity(pase);
                } else if (sk.getProgress() >= 25 && sk.getProgress() < 85 && sk2.getProgress() >=85 && ca2.isChecked()) {
                    Intent pase = new Intent(MakeYTarantino.this, Resultado.class);
                    pase.putExtra("titulo", m12.getNombre());
                    pase.putExtra("sinopsis", m12.getSinopsis());
                    pase.putExtra("critica", m12.getCritica());
                    pase.putExtra("calificacion", m12.getCalificacion());

                    startActivity(pase);
                }
                else if (sk.getProgress() >= 85 && sk2.getProgress() <25 && ca.isChecked()) {
                    Intent pase = new Intent(MakeYTarantino.this, Resultado.class);
                    pase.putExtra("titulo", m13.getNombre());
                    pase.putExtra("sinopsis", m13.getSinopsis());
                    pase.putExtra("critica", m13.getCritica());
                    pase.putExtra("calificacion", m13.getCalificacion());

                    startActivity(pase);
                }
                else if (sk.getProgress() >= 85 && sk2.getProgress() <25 && ca2.isChecked()) {
                    Intent pase = new Intent(MakeYTarantino.this, Resultado.class);
                    pase.putExtra("titulo", m14.getNombre());
                    pase.putExtra("sinopsis", m14.getSinopsis());
                    pase.putExtra("critica", m14.getCritica());
                    pase.putExtra("calificacion", m14.getCalificacion());

                    startActivity(pase);
                }
                else if (sk.getProgress() >= 85 && sk2.getProgress() >=25 && sk2.getProgress() <85 && ca.isChecked()) {
                    Intent pase = new Intent(MakeYTarantino.this, Resultado.class);
                    pase.putExtra("titulo", m15.getNombre());
                    pase.putExtra("sinopsis", m15.getSinopsis());
                    pase.putExtra("critica", m15.getCritica());
                    pase.putExtra("calificacion", m15.getCalificacion());

                    startActivity(pase);
                }

                else if (sk.getProgress() >= 85 && sk2.getProgress() >=25 && sk2.getProgress() <85 && ca2.isChecked()) {
                    Intent pase = new Intent(MakeYTarantino.this, Resultado.class);
                    pase.putExtra("titulo", m16.getNombre());
                    pase.putExtra("sinopsis", m16.getSinopsis());
                    pase.putExtra("critica", m16.getCritica());
                    pase.putExtra("calificacion", m16.getCalificacion());

                    startActivity(pase);
                }
                else if (sk.getProgress() >= 85 && sk2.getProgress() >=85 && ca.isChecked()) {
                    Intent pase = new Intent(MakeYTarantino.this, Resultado.class);
                    pase.putExtra("titulo", m17.getNombre());
                    pase.putExtra("sinopsis", m17.getSinopsis());
                    pase.putExtra("critica", m17.getCritica());
                    pase.putExtra("calificacion", m17.getCalificacion());

                    startActivity(pase);
                }
                else if (sk.getProgress() >= 85 && sk2.getProgress() >=85 && ca2.isChecked()) {
                    Intent pase = new Intent(MakeYTarantino.this, Resultado.class);
                    pase.putExtra("titulo", m18.getNombre());
                    pase.putExtra("sinopsis", m18.getSinopsis());
                    pase.putExtra("critica", m18.getCritica());
                    pase.putExtra("calificacion", m18.getCalificacion());


                    startActivity(pase);
                }


            }

        });


    }
}





