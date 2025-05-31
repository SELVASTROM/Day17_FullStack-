interface MediaPlayer{
    void Play();
    void Pause();
    void Stop();
}
class AudioPLayer implements MediaPlayer{
    public void Play(){
        System.out.println("The Audio is Playing..");
    }public void Pause(){
        System.out.println("The Audio is Paused...");
    }public void Stop(){
        System.out.println("The Audio is Stoped playing...");
    }
}
class VideoPlayer implements MediaPlayer{
    public void Play(){
        System.out.println("The video is playing...");
    }public void Pause(){
        System.out.println("The Video is Paused");
    }public void Stop(){
        System.out.println("The Video is Stoped Playing...");
    }
}
public class Media {
    public static void main(String[] args) {
        MediaPlayer m;
        m=new AudioPLayer();
        m.Play();
        m.Pause();
        m.Stop();
        m=new VideoPlayer();
        m.Play();
        m.Pause();
        m.Stop();
    }
    
}
