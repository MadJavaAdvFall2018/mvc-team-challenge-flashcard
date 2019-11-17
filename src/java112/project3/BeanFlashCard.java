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

        qA.put("The PrintWriter class is part of which package?", "java.io.*");
        qA.put("What does 'ANT' stand for?", "Another Neat Tool");
        qA.put("Consider this code: ArrayList<Car> carInventory = new ArrayList<Car>(); What is the object reference?", "carInventory");
        qA.put("In order to use Properties class, which package must be imported?", "java.util.*");
        qA.put("Which is not one of the main collection interfaces? List, Hash, Set, or Map", "Hash");
        qA.put("The Properties class is a type of:", "Map");
        qA.put("The Properties class has key-value pairs that are Strings. T/F?", "True");
        qA.put("If 100 users access a servlet from 100 different browsers, how many instances of the servlet are instantiated?", "1");
        qA.put("In a servlet, the public void init() method is:", "called once when the servlet is loaded");
        qA.put("What language is ANT written in?", "Java");
        qA.put("What 2 main functions have we used ANT for so far in this class?", "build/compile, running unit tests");
        qA.put("What does TDD stand for?", "Test driven development");
        qA.put("What does TFD stand for", "Test first development");
        qA.put("What tag is used to include files in jsp pages?", "<%@ include file= " + "&quot;example_file.jsp&quot;" + "%>");
        qA.put("What does Expression Language syntax look like?", "${some variable or attribute name here}");
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
