package com.mardikus.mainPackage;

import com.mardikus.mainPackage.Matrixes.AdjacencyMatrix;

public class MainClass {
    public static void main(String[] args) {
        int[][] massForMatrix = {{0,1,1,0,0,0},{1,0,1,0,0,0},{1,1,0,1,0,0},{0,0,1,0,1,0},{0,0,0,1,0,1},{0,0,0,0,1,0}};
        AdjacencyMatrix matrix = new AdjacencyMatrix(massForMatrix);
        System.out.println(matrix.convertToIncidenceMatrix().convertToListOfIncidentEdges().convertToListOfAdjacentVertices());
    }
}
