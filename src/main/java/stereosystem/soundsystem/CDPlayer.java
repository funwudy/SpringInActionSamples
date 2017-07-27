package stereosystem.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by luosf on 2017/5/11.
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    //@Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
