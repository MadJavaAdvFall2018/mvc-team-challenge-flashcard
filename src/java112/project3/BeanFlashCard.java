package java112.project3;
import java.io.*;
import java.util.*;


import java112.utilities.*;




public class BeanFlashCard {
    private Map<String, String> qA;
    
    public BeanFlashCard() {

        qA = new HashMap<String, String>();
        qA.put("question", "answer");
        qA.put("question1", "answer1");
        qA.put("question2", "answer2");
        qA.put("question3", "answer3");
        qA.put("question4", "answer4");

    }

    public String[] getRandomQuestion() {
        Object[] array = qA.keySet().toArray();
        Random random = new Random();
        Object key = array[random.nextInt(array.length)];
        String randomQuestion = qA.get(key);
        String[] questionAnswer = new String[2];

        for (Map.Entry<String, String> entry : qA.entrySet()) {
            if (entry.getKey() == randomQuestion) {
                questionAnswer[0] = entry.getKey();
                questionAnswer[1] = entry.getValue();
            }
        }

        return questionAnswer;
    }

    public Map<String, String> getData() {
        return qA;
    }
}