
package Advanced;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
      public void playVlc(String fileName) {
     System.out.println("Playng vcl file.Name"+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
      //do nothing
    }
    
    }
