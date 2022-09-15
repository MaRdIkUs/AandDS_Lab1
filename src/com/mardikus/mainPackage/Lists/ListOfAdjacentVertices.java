package com.mardikus.mainPackage.Lists;

public class ListOfAdjacentVertices extends List{
    ListOfAdjacentVertices(Line[] lines){
        this.lines = lines;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(Line i:lines){
            builder.append(i.getKey()+1).append(" : ");
            for(int i1:i.getValues())
                builder.append(i1 + 1).append(" ");
            builder.append('\n');
        }
        return builder.toString();
    }
}
