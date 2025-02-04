import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    String[][] array1 = {
      {"New Orleans HT", "LV High School"},
      {"Arcade", "Tournaments"}
    };

    ImageFilter [][] array2= {
      { new ImageFilter("no-hotel.jpg"), new ImageFilter("lv-hotel.jpg") },
      { new ImageFilter("arcade.jpeg"), new ImageFilter("AAUVB.jpg") },
    };
      


    
MyStory scene = new MyStory(array1, array2);
// ImageFilter image = new ImageFilter ("vb.jpg");
    // scene.pause(1.0);
    scene.drawScene();
      



    Theater.playScenes(scene);

    

    
    
  }
}