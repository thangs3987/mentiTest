package com.thangs.mentiResultsTest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class createJSON
{
    static String  workDir = System.getProperty("user.dir");
    public static void createNewJson() {
        //Creating a JSONObject object
        JSONObject jsonObject = new JSONObject();
        Random score1 = new Random();
        Random score2 = new Random();
        Random score3 = new Random();

        //Inserting key-value pairs into the json object

        jsonObject.put("Question", "What is the best company");
        JSONArray result = new JSONArray();
        JSONArray result1 = new JSONArray();
        JSONArray result2 = new JSONArray();
        JSONArray result3 = new JSONArray();

        result1.add("id: 1");
        result1.add("company: Kahoot");
        result1.add("score: ["+score1.nextInt()+"]");
        //jsonObject.put("", result1);
        result2.add("id: 2");
        result2.add("company: Mentimeter");
        result2.add("score: ["+score2.nextInt()+"]");
        //jsonObject.put("", result2);
        result3.add("id: 3");
        result3.add("company: Slido");
        result3.add("score: ["+score3.nextInt()+"]");
        //jsonObject.put("", result3);
        result.add(result1);
        result.add(result2);
        result.add(result3);
        jsonObject.put("result", result);



        try {
            FileWriter file = new FileWriter(workDir + "/Drivers/output.json");

            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);
    }
}
