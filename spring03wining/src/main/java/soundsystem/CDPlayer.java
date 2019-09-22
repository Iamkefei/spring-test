package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
//    @Autowired
    private CompactDisc cd;
//    @Autowired
    private Power power;

//    @Autowired
//    public void setCd(CompactDisc cd) {
//        this.cd = cd;
//        System.out.println("调用setCd..");
//    }
//    @Autowired
//    public void setPower(Power power) {
//        this.power = power;
//        System.out.println("调用Power.");
//    }

    public CDPlayer() {
        super();
        System.out.println("CDPlayer无参构造函数");
    }

//    @Autowired
//    public CDPlayer(CompactDisc cd) {
//        this.cd = cd;
//        System.out.println("CDPlayer的有参构造函数");
//    }

//    @Autowired
//    public CDPlayer(CompactDisc cd, Power power) {
//        this.cd = cd;
//        this.power = power;
//        System.out.println("CDPlayer的多参构造函数...");
//    }
    @Autowired
    public void prepare(CompactDisc cd, Power power) {
        this.cd = cd;
        this.power = power;
        System.out.println("prepare调用");
    }

    public void play() {
        power.supply();
        cd.play();
    }
}
