package com.mardikus.mainPackage.Lists;

abstract class List {

    Line[] lines;

    private static class Line{
        private final int key;
        private final int[] values;

        Line(int key,int[] value){
            this.key = key;
            this.values = value;
        }

        public int getKey(){
            return key;
        }
        public int[] getValues(){
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
