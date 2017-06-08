package stereosystem.soundsystemwithxml;

/**
 * Created by Fun on 2017/5/10.
 */
//@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

//    @Bean
//    public CompactDisc randomBeatlesCD() {
//        int choice = (int) Math.floor(Math.random() * 4);
//        if (choice == 0) {
//            return new SgtPeppers();
//        } else if (choice == 1) {
//            return new WhiteAlbum();
//        } else if (choice == 2) {
//            return new HardDaysNight();
//        } else {
//            return new Revolver();
//        }
//    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

    public void playTrack(int id) {

    }
}
