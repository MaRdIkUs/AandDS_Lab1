package com.mardikus.mainPackage;

import com.mardikus.mainPackage.Matrixes.AdjacencyMatrix;

import static com.mardikus.mainPackage.StreamWorking.*;

public class MainClass {
    public static void main(String[] args) {
        int[][] massForMatrix = convertToIntMass(readFromFile("StartMatrix2.txt").orElseGet(() -> new String[]{""}));
        AdjacencyMatrix matrix = new AdjacencyMatrix(massForMatrix);
        writeToFileAllMatrices("AllTreeMatrices.txt",matrix);
        writeMatrixToFIle("StartMatrix2.txt",matrix);
        System.out.println(matrix.convertToIncidenceMatrix().convertToListOfIncidentEdges().convertToListOfAdjacentVertices().graphTraversalInLength(1));
    }
}
