
package piechart;
import javax.swing.*;
import java.awt.*;
public class PieChart extends JApplet{
    private   String[] arr={"Apple","Microsoft","Blackberry","Android","Samsung"};
    
      
    public void paint(Graphics g){
        double micr=0;double  app=0;double black=0;double andr=0;double oth=0;
        for (String arr1 : arr){
            switch (arr1) {
                case "Microsoft":
                    micr++;
                    break;
                case "Apple":
                    app++;
                    break;
                case "Android":
                    andr++;
                    break;
                case "Blackberry":
                    black++;
                    break;
                default:
                    oth++;
                    break;
            }
        }
        int cetx,cety,wid,hei;
        cetx=200;
        cety=200;
        wid=400;
        hei=400;
         g.setColor(Color.GREEN);
          // cetx+=2;
       // cety+=2;
        int  angan=(int)((andr/arr.length)*360);
        g.fillArc(cetx+20,cety+20,wid,hei,0,angan);
        g.setColor(Color.ORANGE);
        
         cetx+=10;
        cety+=10;
        int  angot=(int)((oth/arr.length)*360);
        g.fillArc(cetx,cety,wid,hei,angan,angot); 
        int angm;
        
         cetx+=10;
        cety+=10;
        angm=(int)((micr/arr.length)*360);
        g.setColor(Color.BLACK);
         
       g.fillArc(cetx-10,cety,wid,hei,angan+angot, angm);
        g.setColor(Color.BLUE);
        int  angb=(int)((black/arr.length)*360);
       cetx-=10;
       cety+=10;
        g.fillArc(cetx,cety,wid,hei,angan+angot+angm,angb);
      
           
      g.setColor(Color.GRAY);
         int anga;
        anga=(int)((app/arr.length)*360);
         cetx+=10;
        g.fillArc(cetx,cety,wid,hei,angan+angot+ angm+angb,anga);
         
      
        
        g.setColor(Color.WHITE);
        double micro=((double)angm/360)*100;
         double appl=((double)anga/360)*100;
         double blac=((double)angb/360)*100;
         double andro=((double)angan/360)*100;
         double other=((double)angot/360)*100;
         Font big = new Font( "SanSerif", Font.BOLD, 20 );
        g.setFont( big );
        Image  img ;
        if(micro>0){
        g.drawString(Integer.toString((int)micro)+"% ", 250,380);
         img= getImage( getCodeBase( ), "microsoft.PNG" );
        g.drawImage( img, 90,380, this );}
        if(appl>0){
        g.drawString(Integer.toString((int)appl)+"% ", 480,500 );
         img = getImage( getCodeBase( ), "apple.PNG" );
        g.drawImage( img, 650,500, this );}
        if(blac>0){
        g.drawString(Integer.toString((int)blac)+"% ", 370,530);
        img = getImage( getCodeBase( ), "blackberry.PNG" );
         g.drawImage( img, 240,600, this );}
        if(andro>0){
        g.drawString(Integer.toString((int)andro)+"% ", 480,320 );
         img = getImage( getCodeBase( ), "android.PNG" );
         g.drawImage( img, 600,250, this );}
        if(other>0){
        g.drawString(Integer.toString((int)other)+"% ", 350,300 );
         g.setColor(Color.ORANGE);
         g.drawString("other",230,230);}
         
   
         
    }
     
        
}
