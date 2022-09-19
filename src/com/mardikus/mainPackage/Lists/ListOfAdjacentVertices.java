package com.mardikus.mainPackage.Lists;

import java.util.ArrayList;

public class ListOfAdjacentVertices extends List{
    ListOfAdjacentVertices(Line[] lines){
        this.lines = lines;
    }


    public String graphTraversalInDepth(int vertex){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(--vertex);
        for(int i = 0;i>-1;i--){
            for(int i1:lines[result.get(i)].getValues()) {
                boolean isFind = false;
                    for (int i2 : result){
                        if (i2 == i1) {
                            isFind = true;
                            break;
                        }
                    }
                if(!isFind) {
                    result.add(i1);
                    i = result.size();
                    break;
                }
            }

        }
        return verticesToString(result);
    }

    private static String verticesToString(ArrayList<Integer> vertices){
        StringBuilder builder = new StringBuilder();
        for(int i:vertices)
            builder.append(i + 1).append(", ");
        builder.replace(builder.length()-2,builder.length(),"");
        return builder.toString();
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
