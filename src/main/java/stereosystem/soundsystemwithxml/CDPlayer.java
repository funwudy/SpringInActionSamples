package stereosystem.soundsystemwithxml;

import org.springframework.stereotype.Component;

/**
 * Created by luosf on 2017/5/11.
 */
@Component
public class CDPlayer implements MediaPlayer {

    public CompactDisc cd;

    //@Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }



    public void play() {
        cd.play();
    }

}
