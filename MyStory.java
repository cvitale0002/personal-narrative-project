import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene{
  
  //Instance Variables 
  private String [][] school;
  private ImageFilter [][] schoolPlaces;
  
  public MyStory(String[][] school) {
    this.school = school;
    
  }
  //Constructors 
  public MyStory(String[][] school, ImageFilter[][] schoolPlaces) {
    this.school = school;
    this.schoolPlaces = schoolPlaces;
    
  }
  
  public void drawScene(){
    drawIntroScene();
    drawSchoolScene();
    drawSchoolImage();
    // add more her
  }
  //Main drawScene method 
  public void drawIntroScene(){
    clear("white");
    
    setTextHeight(24);
    setTextColor("black");
    setTextStyle(Font.MONO, FontStyle.BOLD);

    drawText("Where I Travel For Volleyball",0, 30);

    
    
    ImageFilter volleyball = new ImageFilter("vb.jpg");
    volleyball.colorShift(100);
    drawImage (volleyball, 100, 100, volleyball.getWidth());
    pause(2.0);
  }

  public void drawSchoolScene(){
    clear("white");
    
    setTextHeight(22);
    setTextColor("black");
    setTextStyle(Font.MONO, FontStyle.BOLD);

    drawText("For School I Went to Las Vegas",0, 30);
    
    drawText(school[0][0], 0, 100);
    pause(0.5);
    drawText(school[0][1], 220, 100);
    pause(0.5);
    drawText(school[1][0], 0, 300);
    pause(0.5);
    drawText(school[1][1], 220, 300);
    pause(0.5);
  }

    
    public void drawSchoolImage(){
    clear("white");

    String[] filters = {"saturate", "colorShift", "makeSepia", "saturate"};
    int[] filterValues = {1, 50, 0, 2};

    int index = 0;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            ImageFilter currentImage = schoolPlaces[i][j];
            
            if (filters[index].equals("saturate")) {
                currentImage.saturate(filterValues[index]);
            } else if (filters[index].equals("colorShift")) {
                currentImage.colorShift(filterValues[index]);
            } else if (filters[index].equals("makeSepia")) {
                currentImage.makeSepia();
            }

            pause(0.5);

            if (i == 0 && j == 0) {
                drawImage(currentImage, 0, 0, 200);
            } else if (i == 0 && j == 1) {
                drawImage(currentImage, 200, 0, 200);
            } else if (i == 1 && j == 0) {
                drawImage(currentImage, 0, 200, 200);
            } else if (i == 1 && j == 1) {
                drawImage(currentImage, 200, 200, 200);
            }

            index++;
        }
    }
}
}    
  
