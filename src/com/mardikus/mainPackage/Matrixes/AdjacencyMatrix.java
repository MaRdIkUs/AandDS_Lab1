package com.mardikus.mainPackage.Matrixes;

public class AdjacencyMatrix extends Matrix {

    public AdjacencyMatrix(int[][] matrix){
        this.matrix = matrix;
    }

    private int edgesCountCalculating(){
        int edgesCount = 0;
        for(int i = 0;i< matrix.length;i++)
            for(int i1 = 0;i1< matrix.length;i1++)
                edgesCount += i==i1 ? matrix[i][i1]*2 : matrix[i][i1];
        return edgesCount/2;
    }

    public IncidenceMatrix convertToIncidenceMatrix(){
        int[][] matrix = new int[this.matrix.length][this.matrix.length];
        System.arraycopy(this.matrix,0,matrix,0,matrix.length);
        int edgesCount = edgesCountCalculating();
        int[][] newMatrix = new int[this.matrix.length][edgesCount];
        int nowEdge = 0;
        for(int i = 0;i< matrix.length;i++)
            for(int i1 = 0;i1< matrix[i].length;i1++)
                for(int l = 0;l<matrix[i][i1];l++) {
                    newMatrix[i][nowEdge]++;
                    newMatrix[i1][nowEdge++]++;
                    matrix[i1][i]--;
                }
        return new IncidenceMatrix(newMatrix);
    }
}
