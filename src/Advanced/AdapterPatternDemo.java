
package Advanced;


public class AdapterPatternDemo {
    public static void main (String [] args){
        AudioPlayer audioPlayer = new AudioPlayer ();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "Alone.mp4");
        audioPlayer.play("avi", "mind me.avi");
    }
}
