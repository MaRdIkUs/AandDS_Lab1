package com.mardikus.mainPackage;

import com.mardikus.mainPackage.Lists.ListOfAdjacentVertices;
import com.mardikus.mainPackage.Lists.ListOfIncidentEdges;
import com.mardikus.mainPackage.Matrixes.AdjacencyMatrix;
import com.mardikus.mainPackage.Matrixes.IncidenceMatrix;

import java.io.*;
import java.util.Optional;

public class StreamWorking {
    public static Optional<String[]> readFromFile(String fileName){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            return Optional.of(splitTextFromReader(reader));
        } catch (FileNotFoundException e) {
            System.out.println(e.hashCode());
        }
        return Optional.empty();
    }

    public static boolean writeMatrixToFIle(String fileName, AdjacencyMatrix matrix){
        return writeToFile(fileName,matrix.toString());
    }

    public static boolean writeToFileAllMatrices(String fileName,AdjacencyMatrix matrix){
        IncidenceMatrix matrix1 = matrix.convertToIncidenceMatrix();
        ListOfIncidentEdges list = matrix1.convertToListOfIncidentEdges();
        ListOfAdjacentVertices list1 = list.convertToListOfAdjacentVertices();
        return writeToFile(fileName,matrix1.toString() + '\n' + list + '\n' + list1);
    }

    private static boolean writeToFile(String fileName,String text){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(text);
            writer.close();
            return true;
        } catch (IOException e) {return false;}
    }

    public static String[] readFromKeyboard(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return splitTextFromReader(reader);
    }

    private static String[] splitTextFromReader(BufferedReader reader){
        String[] result = null;
        try{
            String s = reader.readLine();
            result = new String[s.split(" ").length];
            result[0] = s;
            for(int i = 1;i<s.split(" ").length;i++)
                result[i] = reader.readLine();
            reader.close();
        }
        catch (IOException e){
            System.out.println(e.hashCode());
        }
        return result;
    }

    public static int[][] convertToIntMass(String[] s){
        if(s == null || s.length == 0)
            return null;
        int integersBetweenSpaces = s[0].split(" ").length;
        int[][] result = new int[s.length][integersBetweenSpaces];
        String[] buffer;
        for(int i = 0;i<s.length;i++) {
            buffer = s[i].split(" ");
            for (int i1 = 0; i1 < buffer.length; i1++)
                result[i][i1] = Integer.parseInt(buffer[i1]);
        }
        return result;
    }
}
