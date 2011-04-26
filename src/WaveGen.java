import java.util.ArrayList;

import javax.swing.*;

//update
public class WaveGen {
    Board theBoard;

    
public WaveGen(Board aBoard){
theBoard=aBoard;
}
    private ArrayList<Trash> wave= new ArrayList<Trash>();

 

    
    public ArrayList<Trash> getWave(int level){
    int num =0;
    int spacing = 0;
    int initY= Util.pathPad;
    int speed= 0;
    ArrayList<Util.TrashType> types = new ArrayList<Util.TrashType>();

    
    if (level ==1){
    num =10;
    spacing = 135;
    speed =2;     //high for testing purposes, should be 2
    types.add(Util.TrashType.nuclear);
  

   
    }else if (level ==2){

   
    num =20;
    spacing = 85;
    speed =3;
    types.add(Util.TrashType.paper);

    

    
    }else if (level ==3){
    num = 25;
    spacing = 85;
    speed =3;
    types.add(Util.TrashType.paper);
    types.add(Util.TrashType.plastic);
    }else if (level ==4){
    num = 30;
    spacing= 80;
    speed = 4;
    types.add(Util.TrashType.plastic);
    types.add(Util.TrashType.aluminum);
    }

    

    

    
    int curX=-30;

    
    for(int i=0; i<num; i++){
        Trash curTrash=new Trash(curX-spacing, initY,speed,types.get(i%types.size()));
        wave.add(curTrash);
        curX-=spacing;
    }

    
    return wave;

    

    
    }

public ArrayList<ImageIcon> getMessages(int level) {
ArrayList<ImageIcon> temp = new ArrayList<ImageIcon>();
// JJrandomShit
if (level == 1)
temp.add(new ImageIcon(this.getClass().getResource(
"pics/welcome1.png")));
if (level == 2)
temp.add(new ImageIcon(this.getClass().getResource(
"pics/welcome2.png")));
if (level == 3)
temp.add(new ImageIcon(this.getClass().getResource(
"pics/welcome3.png")));
return temp;
}
}

