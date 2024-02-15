package ejercicio1;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.util.CoreMap;

import java.util.List;
import java.util.Properties;

public class AnalisisSentimientosComentarios {
    public static void main(String[] args) {
        //Obtener comentarios
        List<String> comentarios = obtenerComentarios();

        //Analizar comentarios
        analizarComentarios(comentarios);
    }

    public static List<String> obtenerComentarios() {
        //Ejemplo simple de comentarios
        return List.of(
                "Me ha encantado el producto, es maravilloso",
                "No estoy completamente satisfecho con la calidad del producto recibido",
                "Esta empresa tiene muy buen servicio al cliente",
                "Por desgracia el producto no ha cumplido mis expectativas"
        );
    }

    public static void analizarComentarios(List<String> comentarios) {
        //Configuración básica para analizar el sentimiento de los comentarios
        Properties props = new Properties();
        props.put("annotators", "tokenize, ssplit, pos, lemma, ner, parse, sentiment");
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);

        //Analizar cada comentario
        for (String comentario : comentarios) {
            //Crear una anotación para el comentario
            Annotation annotation = new Annotation(comentario);

            //Ejecutar el pipeline sobre la anotación
            pipeline.annotate(annotation);

            //Obtener el sentimiento del comentario
            String sentimiento = obtenerSentimiento(annotation);

            //Imprimir el resultado
            System.out.println("Comentario: " + comentario + " - Sentimiento: " + sentimiento);
        }
    }

    public static String obtenerSentimiento(Annotation annotation) {
        //Obtener la lista de frases del comentario
        List<CoreMap> sentences = annotation.get(CoreAnnotations. SentencesAnnotation.class);

        //Obtener el sentimiento de la primera frase
        if (sentences != null && !sentences.isEmpty()) {
            CoreMap sentence = sentences.get(0);
            return sentence.get(SentimentCoreAnnotations.SentimentClass.class);
        }

        //Si no hay frases
        return "No se pudo determinar";
    }
}