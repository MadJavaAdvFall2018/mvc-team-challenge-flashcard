package java112.project3;
import java.io.*;
import java.util.*;


import java112.utilities.*;




public class BeanFlashCard {
    private Map<String, String> qA;
    String question;
    String answer;

    public BeanFlashCard() {

        qA = new HashMap<String, String>();

        qA.put("question1", "answer1");
        qA.put("question2", "answer2");
        qA.put("question3", "answer3");
        qA.put("question4", "answer4");
        qA.put("question5", "answer5");
        qA.put("question6", "answer6");
        qA.put("question7", "answer7");
        qA.put("question8", "answer8");
        qA.put("question9", "answer9");
        qA.put("question10", "answer10");
        qA.put("question11", "answer11");
        qA.put("question12", "answer12");
        qA.put("question13", "answer13");
        qA.put("question14", "answer14");
        qA.put("question15", "answer15");
    }


    public String[] getRandomQuestion() {
        Object[] array = qA.keySet().toArray();
        Random random = new Random();
        Object key = array[random.nextInt(array.length)];
        question = key.toString();
        answer = qA.get(key);

        String randomQuestion = qA.get(key);
        String[] questionAnswer = new String[2];
        int a = 1;
/*
        for (Map.Entry<String, String> entry : qA.entrySet()) {
            if (entry.getKey() == randomQuestion) {
                questionAnswer[0] = entry.getKey();
                questionAnswer[1] = entry.getValue();
                //question = entry.getKey();
                //answer = entry.getValue();
            }
        }*/


        return questionAnswer;
    }

    public String getQuestion() {
        return question;

    }
    public String getAnswer() {
        return answer;
    }

    public Map<String, String> getData() {
        return qA;
    }

}
