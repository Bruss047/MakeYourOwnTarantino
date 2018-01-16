package tarantino047.makeyourowntarantino.Actividades;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.sql.SQLException;
import java.util.List;

import tarantino047.makeyourowntarantino.Pelicula;
import tarantino047.makeyourowntarantino.PeliculaFactory;
import tarantino047.makeyourowntarantino.PelisAdapter;
import tarantino047.makeyourowntarantino.R;

public class PeliculasPrincipales extends AppCompatActivity {



    private ListView lfilms;
    private Button make;
    private Typeface cap;
    private MediaPlayer mp;
    Pelicula rd = new Pelicula(1,"RESERVOIR DOGS","1992","CASTING:\n" +
            "+Harvey Keitel - Mr. White.\n" +
            "+Tim Roth - Sr. Naranja.\n" +
            "+Michael Madsen - Sr. Rubio.\n" +
            "+Steve Buscemi - Sr. Rosa.\n" +
            "+Chris Penn - \"Nice Guy\" Eddie Cabot.\n" +
            "+Lawrence Tierney - Joe Cabot.\n" +
            "+Quentin Tarantino - Sr. Marrón.\n" +
            "+Edward Bunker - Sr. Azul.","ARGUMENTO:\n" +"Seis criminales profesionales son contratados por Joe Cabot (Lawrence Tierney) y su hijo Nice Guy Eddie (Chris Penn) para un trabajo. No se conocen entre sí y se mantienen en el anonimato, escondidos bajo nombres de colores: el señor Naranja (Tim Roth), el señor Blanco (Harvey Keitel), el señor Rosa (Steve Buscemi), el señor Rubio (Michael Madsen), el señor Marrón (Quentin Tarantino) y el señor Azul (Edward Bunker). Estratagema que ya fue utilizada anteriormente en Pelham 1 2 3. Preparan minuciosamente el robo a un almacén de diamantes, pero la policía aparece inesperadamente en el momento del atraco convirtiéndolo en una masacre que tiene como resultado las muertes de algunos policías, empleados y también del señor Azul y del señor Marrón. Todo hace sospechar que hay un traidor infiltrado. Reunidos a puerta cerrada en un viejo almacén abandonado, los supervivientes se enfrentan entre sí intentando descubrir quién les ha conducido a esta situación límite.\n" +
            "La mayor parte de lo anterior no se muestra en la película sino que el espectador lo deduce de los diálogos y de flash-backs parciales que ilustran los antecedentes de la situación central. La película comienza en realidad con unos hombres desayunando en un bar donde comentan hechos banales.\n" +
            "\n" +
            "CURIOSIDADES:\n" +
            "+ En la escena de tortura del policía, Tarantino dejó al actor dos horas ahí atado para que se metiera en el personaje. Las cuerdas estaban muy apretadas para dar realismo.\n" +
            "\n" +
            "+Durante todo el rodaje estuvo presente un paramédico, para asegurarse que la cantidad de sangre del Sr. Naranja se mantuviera en cantidades creíbles.\n" +
            "\n" +
            "+Uno de los grandes misterios del cine de Tarantino es el apellido Vega. En Reservoir Dogs sabemos que el Sr. Rubio se llama Vic Vega pero lo curioso es que en la siguiente película del director, Pulp Fiction, John Travolta interpreta a un asesino llamado Vincent Vega. \n" +
            "Conociendo la afición de Tarantino por hacerse honores no sorprendería que hubiese una unión entre estos dos personajes.\n" +
            "\n" +
            "+Durante la película se dice 252 veces la palabra \"Fuck\". Aun así, varios sitios web amplían o reducen la cifra, que siempre sitúa alrededor de este número.\n","drawable/rsbb", R.drawable.rsbb,R.drawable.reservdogscaptura);
    Pelicula pb = new Pelicula(2,"PULP FICTION","1994","CASTING:\n" +
            "John Travolta - Vincent Vega\n" +
            "+ Uma Thurman - Mia Wallace\n" +
            "+ Samuel L. Jackson - Jules Winnfield\n" +
            "+ Bruce Willis - Butch Coolidge\n" +
            "+Harvey Keitel - Winston Lobo\n" +
            "+Tim Roth - \"Pumpkin\" o \"Ringo\"\n" +
            "+Amanda Plummer - Yolanda o \"Honey Bunny\"\n" +
            "+Maria de Medeiros - Fabienne\n" +
            "+Ving Rhames - Marsellus Wallace\n" +
            "+Eric Stoltz - Lance\n" +
            "+Rosanna Arquette- Jody\n" +
            "+Christopher Walken - Capitán Koons","ARGUMENTO:\n" +
            "Jules Winnfield (Samuel L. Jackson, Jackie Brown) y Vincent Vega (John Travolta, Grease) son dos asesinos a sueldo que trabajan a las órdenes del temido gángster Marsellus Wallace (Ving Rhames, Amanecer de los muertos), quien les encarga la importante misión de recuperar su misterioso maletín, que ha sido robado. Ahí empezarán todos sus problemas. \n" +
            "\n" +
            "Los dos criminales son polos opuestos que deberán trabajar juntos para cumplir su cometido. De forma paralela, Vincent tendrá que hacerse cargo de Mia Wallace (Uma Thurman, Kill Bill), la peculiar novia de su jefe, a petición del mismo, mientras él pasa unos días fuera de la ciudad. Su compañero Jules le recomienda que vaya con cautela, pues la atractiva mujer le puede meter en problemas. Mientras, el boxeador Butch Coolidge (Bruce Willis, El sexto sentido) debe perder una importante pelea, pues ha sido sobornado por Wallace para participar en este combate amañado, y la pareja formada por Pumpkin/Ringo (Tim Roth, Reservoir Dogs) y Honey Bunny/Yolanda (Amanda Plummer, Mi vida sin mí) decidirá atracar un establecimiento debido a su lamentable situación laboral. \n" +
            "\n" +
            "Esta película de culto escrita y dirigida por Quentin Tarantino (Reservoir Dogs, Malditos bastardos) se convirtió en todo un icono de la década de los noventa y en uno de los filmes mejor valorados de la historia. Además de los mencionados, cuenta en su reparto con Harvey Keitel (El gran hotel Budapest), Maria de Medeiros (Mi vida sin mí), Eric Stoltz (El efecto mariposa), Rosanna Arquette (El gran azul) y Christopher Walken (Atrápame si puedes).\n" +
            "\n" +"CURIOSIDADES:\n" +"\n"+
            "+1. El discurso de Jules en realidad no ha salido de la Biblia\n" +
            "En el increíble monólogo precedente a la ejecución de Brett, Jules afirma que la cita pertenece al pasaje bíblico perteneciente Ezequiel 25:17. No es así. Aunque hay cierta inspiración de algunas partes de esa cita concreta, la mayoría está escrita por Tarantino para darle (y con razón) más fuerza a la escena.\n" +
            "\n" +
            "+El coche de Vincent era en realidad de Tarantino, y fue robado\n" +
            "En varios momentos de la película Vincent habla de su coche, un Chevrolet Malibu de 1964. La cuestión es que el coche pertenecía, en realidad, al mismísimo Quentin Tarantino y fue robado poco después del rodaje de la película, en 1994. No apareció hasta veinte años después y por pura casualidad. Irónicamente, uno de los posteriores propietarios del coche, que se lo compró a un coleccionista sin sospechar nada, gastó casi $40.000 dólares en repararlo, por lo que el coche volvió prácticamente intacto al director casi dos décadas después.\n" +
            "\n" +
            "+La famosa cartea de Jules era, también, de Tarantino\n" +
            "La famosa cartera con el Bad Motherfucker escrito sobre ella pertenecía también al director y se la prestó para la escena.\n" +
            "\n" +
            "+ Christopher Walken no ensayó su escena, y utilizó Tabasco para rodarla\n" +
            "Como mencionaba antes, una de las maneras de rodar la película con tan bajo presupuesto fue que los actores famosos que aparecían en ella, como Christopher Walken, acudiesen al set de rodaje cuando sus otras obligaciones se lo permitían. Por este motivo, la escena del Capitán Koons fue la última en rodarse y además Christopher Walken la hizo a pelo, sin practicarla. Para que no se le secase la boca mientras hablaba, utilizó un viejo truco de Hollywood: ponerse tabasco en  los labios.\n","drawable/pfictionbb",R.drawable.pfictionbb,R.drawable.pficap);
    Pelicula jb = new Pelicula(3,"JACKIE BROWN","1997","CASTING:\n" +"+Pam Grier - Jackie Brown\n" +
            "+Samuel L. Jackson - Ordell Robbie\n" +
            "+Robert Forster - Max Cherry\n" +
            "+Bridget Fonda - Melanie Ralston\n" +
            "+Michael Keaton - Ray Nicolette\n" +
            "+Robert De Niro - Louis Gara\n" +
            "+Chris Tucker - Beaumont Livingston\n" +
            "+Michael Bowen - Mark Dargus\n" +
            "+Lisa Gay Hamilton - Sheronda\n" +
            "+Tommy \"Tiny\" Lister Jr. - Winston","ARGUMENTO:\n" +
            "Jackie Brown es una azafata que, para conseguir dinero extra, se dedica a traer dinero del exterior a Estados Unidos para el traficante de armas Ordell Robbie quien está acompañado por su amigo recién salido de la cárcel Louis Gara y por Melanie. Jackie es sorprendida por la policía con una bolsa de cocaína de la que Jackie asegura no saber nada. Ordell envía al agente de fianzas Max Cherry a sacarla de la cárcel y Cherry se enamora al instante. La policía, con el agente Ray Nicolette a la cabeza, quiere a Jackie para atrapar a Ordell. Pronto los personajes tendrán que demostrar quiénes son los más listos cuando hay por el medio 500.000 dólares en juego.\n" +
            "\n" +
            "CURIOSIDADES:\n" +
            "+El papel de Jackie Brown estaba escrito específicamente para Pam Grier. Cuando Quentin leyó por primera vez el libro \"Rum Punch\", en el que se basa el film, se pasó la parte en la que Jackie es descrita como una mujer blanca. Sólo se dió cuenta cuando adaptó el guión y tuvo que revisar el libro.\n" +
            "\n" +
            "+Quentin cambió enl nombre original de la novela \"Rum Punch\" (Jackie Burke) por el de Jackie Brown en honor a la película Foxy Brown.\n" +
            "\n" +
            "+El nombre de Jackie Brown fue sacado de una criminal caracteriazada en la novela de 1973, \"The Friends of Eddie Coyle\" de George V. Higgins.\n" +
            "\n" +
            "+La productora \"Mighty Mighty Afrodite\" que colabora en Jackie Brown, pertenece a la ex-novia de Quentin, Mira Sorvino.\n","drawable/jbbb",R.drawable.jbbb,R.drawable.jackcaptura);
    Pelicula kb1 = new Pelicula(4,"KILL BILL VOL.1","2003","CASTING:\n" +"+Uma Thurman - Beatrix Kiddo \n" +
            "+David Carradine - Bill \n" +
            "+Gordon Liu - Pai Mei\n" +
            "+Vivica Fox - Vernita Green \n" +
            "+Daryl Hannah - Elle Driver \n" +
            "+Lucy Liu - O-Ren Ishii \n" +
            "+Michael Madsen - Budd \n" +
            "+Julie Dreyfus - Sofie Fatale\n" +
            "+Chiaki Kuriyama - Gogo Yubari\n" +
            "+Sonny Chiba - Hattori Hanzō\n" +
            "+Michael Parks - Earl McGraw\n" +
            "+Michael Bowen - Buck\n" +
            "+Christopher Allen Nelson - Tommy Plympton","ARGUMENTO:\n" +
            "En \"Kill Bill-Vol. 1\" el protagonista, interpretado por David Carradine, es un personaje siniestro al que apenas se ve en la película y que ha creado un grupo de élite llamado Comando Letal Asesino Víbora (Deadly Viper Assassination Squad o DiVAS).\n" +
            "\n" +
            "Todos los vipers llevan el nombre de una serpiente venenosa y el más letal es Mamba Negra (Uma Thurman), que además es la antigua amante de Bill.\n" +
            "\n" +
            "Al principio del \"Vol. 1\", un Ranger de Texas (Michael Parks) observa el escenario de un crimen espeluznante: todos los invitados de una boda son masacrados durante un ensayo en la capilla de una pequeña localidad. La mujer embarazada con el vestido de novia salpicado de sangre es Mamba Negra, más conocida como La Novia.\n" +
            "\n" +
            "Bill y los Vipers dan a La Novia por muerta pero, para su desgracia, sólo se encontraba en coma. La Viper alias Serpiente de la Montaña de California, Elle Driver (Daryl Hannah), se cuela en la habitación de hospital de La Novia disfrazada de enfermera y jeringuilla en mano, pero el propio Bill anula la operación en el último momento.\n" +
            "\n" +
            "Cuatro años después, La Novia despierta de repente del coma y se da cuenta de lo que le han hecho. Elimina al celador del hospital (Michael Bowen), que ha estado obteniendo favores sexuales de ella mientras se encontraba inmovilizada, se sube a su llamativo \"Pussy Wagon\" y se lanza a una misión con una única y feroz meta.\n" +
            "\n" +
            "CURIOSIDADES:\n" +
            "\n" +
            "+Cuando Beatrix Kiddo llega a Tokio, se escucha la canción “El vuelo del abejorro“, tema principal de la serie “El avispón verde”, donde Bruce Lee interpretó a Kato.\n" +
            "\n" +
            "+Sonny Chiba, actor que le dio vida a Hattori Hanzo, hace katanas en la vida real. También interpretó al mismo personaje en la serie de televisión “Kage no Gundam”. El hombre es icono del cine de artes marciales de los 70.\n" +
            "+El nombre Hattori Hanzo también sale en la serie “Shadow Warriors” y hasta en el videojuego “Samurai Shodown“.\n" +
            "+Se ocuparon más de 500 litros de sangre falsa para rodar Kill Bill Vol. 1 y Kill Bill Vol. 2. ¿Por qué hay dos partesx?x Nunca estuvo pensado así, pero Tarantino la dividió entendiendo que estar 4 horas en el cine es para quedar enfermo.\n","drawable/kbbb",R.drawable.kbbb,R.drawable.killbillcaptura);
    Pelicula kb2 = new Pelicula(5,"KILL BILL VOL.2","2004","CASTING:\n" +"+Uma Thurman - Beatrix Kiddo\n" +
            "+Vivica A. Fox - Vernita Green\n" +
            "+Michael Parks - Earl McGraw \n" +
            "+James Parks - Edgar McGraw\n" +
            "+Jun Kunimura - Boss Tanaka\n" +
            "+Lucy Liu - O-Ren Ishii\n" +
            "+Bo Svenson - Reverend Harmony\n" +
            "+Samuel L. Jackson - Rufus\n" +
            "+Larry Bishop - Larry Gomez\n" +
            "+Laura Cayouette - Rocket\n" +
            "+Michael Madsen - Budd\n" +
            "+David Carradine - Bill\n" +
            "+Perla Haney-Jardine - B.B.\n","ARGUMENTO:\n" +
            "En un flashback, la Novia (Uma Thurman) ―visiblemente embarazada― y su novio (Chris Nelson) ensayan su matrimonio. Bill (David Carradine), su antiguo novio y el líder del Escuadrón de Serpientes Asesinas, llega inesperadamente y le desea su bien, y revela que la Novia se ha retirado de su trabajo asesino y abandonó a Bill para entregarle una mejor vida a su hija nonata. Momentos después, los otros miembros del escuadrón asesino ―bajo las órdenes de Bill― llegan y acribillan el ensayo del matrimonio.\n" +
            "En el presente, Bill advierte a su hermano Budd (Michael Madsen), un ex Serpiente Asesina y ahora portero de un club nocturno, que sería el próximo objetivo. La Novia llega a su caravana e irrumpe a través de la puerta, esperando en tenderle una emboscada, pero Budd está esperándola, apoyándole en el pecho una escopeta de dos cañones y disparándole dos balazos de granos de sal. Debido al dolor, la Novia pierde el conocimiento. Budd llama a Elle Driver (Daryl Hannah), otra ex Serpiente Asesina, con la intención de vender la espada Hanzō de la Novia por un millón de dólares en efectivo. Él entonces sella a la Novia dentro de un ataúd y la entierra viva…\n" +
            "\n" +
            "CURIOSIDADES:\n" +
            "+ Quentin Tarantino, como en todos sus filmes aparece en la película. Es uno de los 88 maníacos que luchan contra la novia en el restaurante de Tokyo. Debido al antifaz y a la cantidad de luchadores, es difícil identificarlo. \n" +
            "\n" +
            "+ La marca de cigarrillos Red Apple, es una marca ficticia que Quentin Tarantino utiliza para todas sus películas, además, se puede observar que el dibujo de la portada de los paquetes es una manzana roja de la que sale un gusano verde con la cara del mismo director con gafas de sol. \n" +
            "\n" +
            "+ El rodaje se inició el 14 de junio de 2002 en Pekín, con bastante retraso debido al embarazo de Uma Thurman, y se prolongó hasta el 3 de marzo de 2003. \n" +
            "\n" +
            "+ La escena de la pelea contra los 88 maniacos es una calca de la coreografia de una de las peleas de \"puños de furia\", de igual forma, el traje que usa la novia en esta escena, y la trama (la lista), es un guiño a \"el juego con la muerte\" ambas de Bruce Lee.\n","drawable/kbb2",R.drawable.kbb2,R.drawable.killbill2captura2);
    Pelicula dp = new Pelicula(6,"DEATH PROOF","2007","CASTING:\n" +"+Kurt Russell - Especialista Mike/Doble Mike\n" +
            "+Rosario Dawson - Abernathy \"Abbie\" Ross\n" +
            "+Mary Elizabeth Winstead - Lee Montgomery\n" +
            "+Vanessa Ferlito - Arlene\n" +
            "+Jordan Ladd - Shanna 'Banana'\n" +
            "+Rose McGowan - Pam Greer\n" +
            "+Sydney Tamiia Poitier - Jungle Julia Lucai\n" +
            "+Zoë Bell - Ella misma (Zoë Bell)\n" +
            "+Tracie Thoms - Kim Mathis\n" +
            "+Marcy Harriell - Marcy\n" +
            "+Omar Doom - Nate\n","ARGUMENTO:\n"
            +"Stuntman Mike es un peligroso sicópata que acosa a las mujeres en la carretera a bordo de su auto, un Chevy 70 especialmente preparado para acrobacias, que lo considera \"a prueba de muerte\". Su plan de acción es simple: se acerca a las mujeres e intenta seducirlas con su carisma. Pero cuando es rechazado, su mayor satisfacción perseguirlas y estrellarlas con su poderoso coche. Mientras tanto, Zoe y un grupo de amigas que trabajan en los staff técnicos de los filmes de Hollywood se encuentran en la campiña de vacaciones. Zoe quiere cumplir un viejo sueño: manejar un Dodge Challenger similar al de la película Vanishing Point. Pero cuando se encuentra probando el auto en la carretera, Stuntman Mike se les lanza encima, y súbitamente las vidas de las chicas se pone en peligro.\n" +
            "\n" +
            "\n" +
            "\n" +
            "CURIOSIDADES:\n" +
            "\n" +
            "+Tarantino vuelve a recurrir en 'Death Proof' a varios elementos comunes de sus películas anteriores: uno de los personajes pide cigarrillos 'Red Apple' (que aparecen en casi todas sus películas), y Especialista Mike menciona la famosa hamburguesa 'Big Kahuna' que tan popular hizo Samuel L. Jackson en 'Pulp Fiction'.\n" +
            "\n" +
            "+Por todos es conocido el mimo con el que Tarantino selecciona la banda sonora de sus películas. Lo que quizá no conocías es que la gramola que aparece en 'Death Proof' pertenece a su colección personal, se llama AMi, y también apareció en la película 'Asesinos natos', de la que Tarantino fue guionista.\n" +
            "\n" +
            "+'Death Proof' ha sido, hasta la fecha, la única película en la que Quentin Tarantino no se ha servido del recurso del flashback o de los saltos en el tiempo para narrar la historia, por lo que podemos ver todo lo que ocurre en orden cronológico.\n" +
            "\n" +
            "+Tarantino suele ser conocido por no dejar nada al azar en cada uno de los detalles de sus películas. Y las matrículas de los dos coches utilizados por Especialista Mike no iban a ser una excepción. La matrícula JJZ-109 es un tributo a la matrícula de Steve McQueen en 'Bullitt', y la matrícula 983-DAN aparecía en la película 'La indecente Mary y Larry el loco'.\n","drawable/dprbb",R.drawable.dprbb,R.drawable.deathcaptura);
    Pelicula ib = new Pelicula(7,"INGLORIUS BASTARDS","2009","CASTING:\n" +"\n" +
            "+Brad Pitt - Aldo Raine \n" +
            "+Mélanie Laurent - Shosanna Dreyfus \n" +
            "+Christoph Waltz - Hans Landa \n" +
            "+Eli Roth - Sgt. Donnie Donowitz \n" +
            "+Michael Fassbender - Archie Hicox \n" +
            "+Diane Kruger - Bridget Von Hammersmark \n" +
            "+Daniel Brühl - Fredrick Zoller\n" +
            "+Til Schweiger - Sgt. Hugo Stiglitz \n" +
            "+Gedeon Burkhard - Cabo Wilhelm Wicki","ARGUMENTO:\n"+
            "El oficial del SD, el Standartenführer Hans Landa (Christoph Waltz), cuya personalidad recuerda al célebre verdugo nazi Reinhard Heydrich, se dedica a perseguir a familias judías en una región francesa. Un día llega a una casa e interroga al dueño de la misma, Perrier LaPadite (Denis Menochet) acerca de una familia judía desaparecida. Landa promete no molestar a su familia nunca si le dice la verdad y LaPadite, aterrorizado, acaba confesando que hay un refugio bajo el suelo de su hogar en el que está escondida una familia judía, los Dreyfus, antiguos vecinos suyos, que acaban siendo asesinados. Todos, excepto la adolescente Shoshanna (Mélanie Laurent), a la que Landa deja escapar.\n" +
            "Años después, Aldo el Apache Raine (Brad Pitt), un teniente primero del ejército estadounidense, recluta a un grupo de soldados judíos, estadounidenses y alemanes con una misión: en lugar de infiltrarse como otros comandos en territorio para misiones de sabotaje y colaboración con la resistencia francesa, van a dedicarse exclusivamente a matar soldados alemanes con los métodos más horribles posibles con tal de provocar terror en las filas nazis. Un día, los Bastardos emboscan a un escuadrón alemán matándolos a casi todos. El Sargento Werner Rachtman (Richard Sammel) es interrogado por Raine, que en busca de nuevos objetivos, quiere saber dónde hay más patrullas alemanas, y con qué efectivos y material cuentan los alemanes en la zona. Werner se niega, y Raine le dice que si no habla, dejará que le interrogue el Sargento Donny Oso Judío Donowitz (Eli Roth), conocido por golpear a los nazis con un bate de béisbol en la cabeza. Raine le pregunta por última vez y Werner, de nuevo, mostrando valor y sentido del deber, rehusa responder, por lo que Raine llama a Donowitz, que mata a Werner a golpes con el bate. El aterrorizado único sobreviviente, Butz, le dice a Raine todo lo que los Bastardos desean saber. Raine le advierte que de contar la verdad a sus superiores será asesinado por traidor, por lo que le induce a alegar que le dejaron ir para que le pudiera contar a todos los alemanes qué les pasará cuando se encuentren con los Bastardos. Luego le pregunta qué hará después de la guerra y Butz le dice que abrazará a su madre y quemará su uniforme nazi. No conforme con la respuesta, ya que eso ocultaría el hecho de que fue un nazi, Raine le marca una esvástica en la frente. Cortarle el cuero cabelludo a los muertos, dejar a un solo sobreviviente para que corra el rumor, y marcarle una esvástica en la frente con un cuchillo de caza, se revela como el modus operandi de los Bastardos. Los rumores llegan hasta el mismo Adolf Hitler (Martin Wuttke), que se propone aniquilar a los Bastardos.\n" +
            "\n" +
            "\n" +
            "CURIOSIDADES:\n" +
            "\n" +
            "+Eli Roth ganó 15 kilos de músculo para interpretar a Donnie Donowitz, \"el Oso Judío\". Roth también aprendió a cortar el pelo para el papel gracias a Humberto, el padre de la productora Pilar Savone, en su salón de Beverly Hills.\n" +
            "\n" +
            "+Quentin Tarantino empezó a escribir el guión antes de Kill Bill: Volume 1, pero no se le ocurría ningún buen final, así que lo pausó y empezó a rodar Kill Bill, un proyecto que había estado preparando mentalmente desde Pulp Fiction (1994).\n" +
            "\n" +
            "+Quentin Tarantino quería hacer una película de guerra con el estilo del spaghetti western, así, decidió que el título sería \"Érase una vez en la Francia ocupada\". Finalmente lo desestimó, pero dio ese nombre al título del primer capítulo de la película.\n" +
            "\n" +
            "+La directora de casting Johanna Ray que trabajó en Kill Bill y en Malditos Bastardos, estuvo casada con Aldo Ray de 1960 a 1967.\n","drawable/ibbb",R.drawable.ibbb,R.drawable.inglocaptura);
    Pelicula du = new Pelicula(8,"DJANGO\n" +
            "UNCHAINED","2012","CASTING:\n" +"+Jamie Foxx como Django.\n" +
            "+Christoph Waltz - Dr. King Schultz.\n" +
            "+Leonardo DiCaprio - Calvin J. Candie.\n" +
            "+Kerry Washington - Broomhilda Von Schaft.\n" +
            "+Samuel L. Jackson - Stephen.\n" +
            "+Don Johnson - Spencer Gordon \"Big Daddy\" Bennett.\n" +
            "+Franco Nero - Amerigo Vessepi.\n" +
            "+Tom Savini - Ellis Brittle.\n" +
            "+Anthony LaPaglia - Roy.","ARGUMENTO:\n" +
            "Ambientada en los estados del Sur estadounidense dos años antes de estallar la Guerra Civil, DJANGO DESENCADENADO está protagonizada por el actor ganador del Oscar® Jamie Foxx en el papel de Django, un esclavo cuyo brutal pasado con sus antiguos dueños le lleva cara a cara con el cazarrecompensas de origen alemán, el Dr. King Schultz (el actor ganador del Oscar® Christoph Waltz). Schultz le sigue la pista a los hermanos asesinos Brittle y Django es el único que podrá llevarle hasta ellos. El poco ortodoxo Schultz compra a Django con la promesa de dejarlo en libertad tras capturar a los Brittle \u0096 muertos o vivos. \n" +
            "\n" +
            "Tras la exitosa misión Schultz deja en libertad a Django pero ambos optan por no separarse y seguir el mismo camino. Con la ayuda de Django, Schultz emprende la búsqueda y captura de los delincuentes más buscados del Sur. Según va puliendo sus capacidad como cazador, Django se centra en su única meta: hallar y rescatar a Broomhilda (Kerry Washington), la esposa que le arrebató el tráfico de esclavos muchos años atrás. \n" +
            "\n" +
            "La búsqueda de Django y Schultz los guiará en última instancia a Calvin Candie (encarnado por el actor nominado al Oscar® Leonardo DiCaprio), el propietario de \u0093Candyland,\u0094 una infame plantación donde los esclavos son preparados por el entrenador Ace Woody (Kurt Russell) para luchar unos contra otros por diversión. Al reconocer la propiedad bajo pretensiones falsas, Django y Schultz levantan la sospecha de Stephen (el actor nominado al Oscar® Samuel L. Jackson), el esclavo doméstico de confianza de Candie. Ahora siguen sus pasos, y una despiadada organización se les aproxima. Si Django y Schultz quieren escapar con Broomhilda, se verán obligados a escoger entre la independencia y la solidaridad, el sacrificio y la supervivencia\n" +
            "\n" +
            "CURIOSIDADES:\n" +
            "\n" +
            "+La escena del Klu Klux Klan, liderado por Don Johnson, en la que discuten sobre esas caperuzas tejidas a mano, esconde dos guiños. El primero es El nacimiento de una nación, filme de D. W. Griffith en la que los miembros del Klan protagonizan una épica cabalgata. El segundo, más cariñoso, tiene por objeto el Django original de Sergio Corbucci: resulta que, en dicha película, el pistolero Nero lucha contra el Klu Klux Klan cuyos miembros lucen unas capuchas con aberturas para los ojos muy, muy pequeñas. Tanto, que los fans del spaghetti western aún discuten sobre cómo podían ver con ellas puestas.\n" +
            "\n" +
            "+Muchos han visto en la escena de las pistolas diminutas escondidas en las mangas de Schultz un homenaje a Taxi Driver pero parece que es otra película la que se esconde en estas imágenes: la referencia va destinada a Sartana, un ,pistolero protagonista de varios spaghetti westerns que se valía de gadgets y máquinas de todo tipo para acabar con los malos, incluyendo los famosos resortes en las muñecas. Por cierto, en la saga también hubo lugar para un Django desafía a Sartana.\n" +
            "\n" +
            "+King Schultz se sorprende del nombre de la amada de Djanjo (¨¿Me estás diciendo que tu mujer se llama Broomhilda Von Shaft?¨) , y desde luego no es casual. Según ha dejado caer el director, entre los futuros descendientes de su héroe y su heroína se encontrará John Shaft, el detective negro y cabreado al que Richard Roundtree encarnó en Las noches rojas de Harlem y Shaft en África.\n" +
            "\n" +
            "+El personaje interpretado en Django por el gran Christoph Waltz se hace llamar ¨Dr. King Schultz¨. Este apellido debe resultar familiar a cualquier conocedor de la obra de Tarantino. En Kill Bill Vol.2 había un episodio titulado ¨La solitaria tumba de Paula Schultz¨ . Por la fecha de nacimiento de Paula Schutz que puede verse en la película (1827) y sabiendo que Django se ambienta en 1858, no cabe duda que existe algún tipo de relación en la mente del director\n","drawable/djangobb",R.drawable.djangobb,R.drawable.djangocaptura);
    Pelicula he = new Pelicula(9,"THE HATEFUL EIGHT ","2015","CASTING:\n" +"+Samuel L. Jackson - Mayor Marquis Warren.\n" +
            "+Kurt Russell - John Ruth, la Horca.\n" +
            "+Jennifer Jason Leigh - Daisy Domergue, la prisionera.\n" +
            "+Walton Goggins - Chris Mannix, el sheriff.\n" +
            "+Demián Bichir - Bob, el mexicano.\n" +
            "+Tim Roth - Oswaldo Mobray, el verdugo.\n" +
            "+Michael Madsen - Joe Gage, el vaquero.\n" +
            "+Bruce Dern - general Sandy Smithers.","ARGUMENTO:\n" +
            "Un cazarrecompensas llamado John Ruth, lleva una prisionera, por la que se ofrece una gran suma de dinero, hacia el pueblo de Red Rock a ser colgada. En el nevado camino se encuentra a dos antiguos conocidos (incluyendo a otro cazarrecompensas transportando tres cadáveres valiosos) a los cuales la repentina ventisca los ha tomado por sorpresa, dejándolos sin caballo y con mucho frío. Este accede a llevarlos consigo a un refugio cercano para protegerse de la brutal tormenta de nieve que los persigue, no sin antes hacer un trato con uno de sus camaradas para proteger mutuamente sus tesoros humanos.\n" +
            "Al llegar ahí se dan cuenta que los amigables dueños del lugar están ausentes, dejaron un encargado que no se ve muy confiable y el establecimiento entero está lleno de gente desconocida. El escenario en que se encuentran será el catalizador para una historia misteriosa y graciosa, muy parecida a un juego de Clue entre amigos.\n" +
            "The Hateful Eight toma lugar algunos años luego de la guerra civil estadounidense. Como en esa guerra, el racismo también juega un papel principal en esta cinta. Todos los personajes (acorralados en el refugio por la nieve) pertenecían a alguno de los dos bandos, tanto es así que llegan a separar la pequeña casa, temporalmente, en dos zonas: norteños de un lado y sureños del otro, para evitar futuros conflictos.\n" +
            "La distinción se hace presente en las charlas que tienen como grupo, los temas se derivan de alguna u otra forma a las heridas que el racismo dejó en Estados Unidos, sobretodo la enemistad mortal entre blancos y negros, hasta la discriminación que estos últimos han sufrido. Es notable el deseo de venganza que existe en el personaje de Samuel L. Jackson y el de resentimiento que expresa un antiguo general sureño atrapado en la fría cabaña.\n" +
            "El elenco entero puede servir de metáfora para el Estados Unidos post-guerra civil. Por supuesto no se toma a sí misma muy en serio, no pretende ser una película histórica; parodia a los estereotipos de esa época, tanto históricos como cinematográficos, y no intenta pasar de ahí.\n" +
            "\n" +
            "CURIOSIDADES:\n" +
            "+ Luego de que alguien filtrara el guión en internet, Quentin Tarantino había cancelado los planes de realizar esta película. Pero después de que se realizó una lectura del guion en Los Ángeles, el elenco estaba tan asombrado, que Samuel L. Jackson persuadió a Tarantino para que aceptara filmar la película.\n" +
            "\n" +
            "+Quentin Tarantino ha dicho que algunas pistas del soundtrack de Ennio Morriconepara Los Ocho Más Odiados, son pistas que nunca se llegaron a usar para la película de La Cosa (1982).\n" +
            "\n" +
            "+A pesar de que es su sexta colaboración como actor y director, esta es la primera vez que Samuel L. Jackson encabeza el reparto en una película dirigida por Quentin Tarantino.\n" +
            "+Esta es la tercera película consecutiva de Quentin Tarantino en la que un personaje recibe un balazo en los testículos.\n","drawable/hebb",R.drawable.hebb,R.drawable.heightcaptura);

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peliculas_principales);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("| MakeYourOwnTarantino |");
        getSupportActionBar().setIcon(R.drawable.logoaction);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        mp= MediaPlayer.create(this, R.raw.intro);
        mp.start();



        lfilms=(ListView) findViewById(R.id.ll);
        make=(Button)findViewById(R.id.myt);



        String fuente = "font/Dust West.otf";

        this.cap = Typeface.createFromAsset(getAssets(), fuente);
        make.setTypeface(cap);

        make.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PeliculasPrincipales.this,MakeYTarantino.class);

                startActivity(intent);
            }
        });

     con();


        try {
            List<Pelicula> taran = PeliculaFactory.getInstance(this).obtenerPeliculas();
           lfilms.setAdapter(new PelisAdapter(taran));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        lfilms.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Pelicula peliselected = (Pelicula) lfilms.getItemAtPosition(position);

                Intent detalle = new Intent(PeliculasPrincipales.this, ActivityDetalle.class);

                detalle.putExtra("nombre",  peliselected.getNombre());

                detalle.putExtra("sinopsis",  peliselected.getSinopsis());

                detalle.putExtra("cast",  peliselected.getCast());

                detalle.putExtra("imgdetalle",  peliselected.getImgdetalle());

                detalle.putExtra("captura",  peliselected.getImgcaptura());


                startActivity(detalle);

            }
        });

    }



    public void con() {


        try {

            PeliculaFactory.getInstance(PeliculasPrincipales.this).guardarPeli(pb);
            PeliculaFactory.getInstance(PeliculasPrincipales.this).guardarPeli(jb);
            PeliculaFactory.getInstance(PeliculasPrincipales.this).guardarPeli(rd);
            PeliculaFactory.getInstance(PeliculasPrincipales.this).guardarPeli(ib);
            PeliculaFactory.getInstance(PeliculasPrincipales.this).guardarPeli(dp);
            PeliculaFactory.getInstance(PeliculasPrincipales.this).guardarPeli(kb1);
            PeliculaFactory.getInstance(PeliculasPrincipales.this).guardarPeli(kb2);
            PeliculaFactory.getInstance(PeliculasPrincipales.this).guardarPeli(du);
            PeliculaFactory.getInstance(PeliculasPrincipales.this).guardarPeli(he);

        } catch (SQLException e) {
            e.printStackTrace();

        }


    }

}
