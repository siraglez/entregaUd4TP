import twitter4j.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalisisTendenciasDatosRedesSociales {

    //Configurar las credenciales de la API de Twitter
    private static final String CONSUMER_KEY = "tu_consumer_key";
    private static final String CONSUMER_SECRET = "tu_consumer_secret";
    private static final String ACCESS_TOKEN = "tu_access_token";
    private static final String ACCESS_TOKEN_SECRET = "tu_access_token_secret";

    public static void main(String[] args) {
        List<String> datos = obtenerDatosRedesSociales();
        analizarTendencias(datos);
    }

    public static List<String> obtenerDatosRedesSociales() {
        List<String> tweets = new ArrayList<>();

        //Configuración de las credenciales de Twitter
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(CONSUMER_KEY)
                .setOAuthConsumerSecret(CONSUMER_SECRET)
                .setOAuthAccessToken(ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(ACCESS_TOKEN_SECRET);

        //Crear objeto Twitter con las credenciales configuradas
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();

        try {
            //Realizar búsqueda de tweets con un hashtag específico
            Query query = new Query("#Java");
            QueryResult result = twitter.search(query);

            //Recorre los resultados y agrega el texto de cada tweet a la lista
            for (Status status : result.getTweets()) {
                tweets.add(status.getText());
            }
        } catch (TwitterException e) {
            e.printStackTrace();
        }

        return tweets;
    }

    public static void analizarTendencias(List<String> datos) {
        Map<String, Integer> tendencias = identificarTendencias(datos);

        //Imprime las tendencias identificadas
        for (Map.Entry<String, Integer> entry : tendencias.entrySet()) {
            System.out.println("Tendencia: " + entry.getKey() + " - Apariciones: " + entry.getValue());
        }
    }

    public static Map<String, Integer> identificarTendencias(List<String> datos) {
        //Contar el número de ocurrencias de cada palabra que comienza con # (tendencias)
        Map<String, Integer> tendencias = new HashMap<>();

        for (String mensaje : datos) {
            String[] palabras = mensaje.split("\\s+");
            for (String palabra : palabras) {
                if (palabra.startsWith("#")) {
                    tendencias.put(palabra, tendencias.getOrDefault(palabra, 0) + 1);
                }
            }
        }

        return tendencias;
    }
}
