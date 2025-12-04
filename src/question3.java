// Question :: Use an interface Playable and implement it in VideoPlayer and MusicPlayer classes.

interface Playable {
    void play();      // abstract method
    void pause();
    void stop();
}

// VideoPlayer implementing Playable
class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing video...");
    }

    @Override
    public void pause() {
        System.out.println("Video paused.");
    }

    @Override
    public void stop() {
        System.out.println("Video stopped.");
    }
}

// MusicPlayer implementing Playable
class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Music paused.");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped.");
    }
}

public class question3 {
    public static void main(String[] args) {

        Playable p1 = new VideoPlayer();   // Polymorphism
        Playable p2 = new MusicPlayer();

        System.out.println("Video Player:");
        p1.play();
        p1.pause();
        p1.stop();

        System.out.println("\nMusic Player:");
        p2.play();
        p2.pause();
        p2.stop();
    }
}
