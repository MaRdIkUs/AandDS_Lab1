package com.mardikus.mainPackage.Lists;

import java.util.ArrayList;

public class ListOfIncidentEdges extends List{

    public ListOfIncidentEdges(int[][] incidenceMatrix){
        lines = new Line[incidenceMatrix.length];
        for(int i = 0;i<lines.length;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i1 = 0;i1<incidenceMatrix[i].length;i1++)
                if(incidenceMatrix[i][i1] == 1)
                    list.add(i1);
            lines[i] = new Line(i,list);
        }
    }

    public ListOfAdjacentVertices convertToListOfAdjacentVertices(){
        Line[] newLines = new Line[lines.length];
        for(int i = 0;i<lines.length;i++){
            ArrayList<Integer> vertices = new ArrayList<>();
            for(int i1:lines[i].getValues())
                for(int i2 = 0;i2<lines.length;i2++)
                    if(i2!=i)
                        for(int i3:lines[i2].getValues())
                            if(i3 == i1)
                                vertices.add(i2);
            newLines[i] = new Line(i,vertices);
        }
        return new ListOfAdjacentVertices(newLines);
    }

}
