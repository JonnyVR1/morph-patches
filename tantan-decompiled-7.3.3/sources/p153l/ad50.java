package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.tantan.live.eventbus.LiveEventBus;

/* JADX INFO: loaded from: classes5.dex */
public class ad50 extends dum<mc50> {
    public ad50(LiveBaseFrag liveBaseFrag, pol polVar, mc50 mc50Var, LiveEventBus liveEventBus) {
        super(liveBaseFrag, mc50Var, new f80(polVar, liveBaseFrag), false, liveEventBus);
        if (u9t.m195114c(mc50Var)) {
            this.f90819e = "p_anchor_live_room";
        } else {
            this.f90819e = "p_user_live_room";
        }
    }
}
