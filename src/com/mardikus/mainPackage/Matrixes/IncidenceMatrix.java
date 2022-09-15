package com.mardikus.mainPackage.Matrixes;

import com.mardikus.mainPackage.Lists.ListOfIncidentEdges;

public class IncidenceMatrix extends Matrix{
    IncidenceMatrix(int[][] matrix){
        this.matrix = matrix;
    }
    public ListOfIncidentEdges convertToListOfIncidentEdges(){
        return new ListOfIncidentEdges(matrix);
    }
}
