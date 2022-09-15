package com.mardikus.mainPackage.Lists;

import java.util.ArrayList;

abstract class List {

    Line[] lines;

    protected static class Line{
        private final int key;
        private final ArrayList<Integer> values;

        Line(int key, ArrayList<Integer> value){
            this.key = key;
            this.values = value;
        }

        public int getKey(){
            return key;
        }
        public ArrayList<Integer> getValues(){
            return values;
        }

        @Override
        public String toString(){
            StringBuilder builder = new StringBuilder();
            builder.append(key).append(" : ");
            for(int i:values)
                builder.append(i).append(" ");
            return builder.toString();
        }
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(Line i:lines)
            builder.append(i).append('\n');
        return builder.toString();
    }

}
