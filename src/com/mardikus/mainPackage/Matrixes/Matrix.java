package com.mardikus.mainPackage.Matrixes;

abstract class Matrix {

    protected int[][] matrix;

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(int[] i1:matrix){
            for(int i:i1){
                builder.append(i).append(" ");
            }
            builder.append('\n');
        }
        return builder.toString();
    }
}
