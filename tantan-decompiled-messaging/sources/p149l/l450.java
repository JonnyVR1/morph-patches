package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.tantan.live.eventbus.LiveEventBus;

/* JADX INFO: loaded from: classes4.dex */
public class l450 extends bsm<x350> {
    public l450(LiveBaseFrag liveBaseFrag, dml dmlVar, x350 x350Var, LiveEventBus liveEventBus) {
        super(liveBaseFrag, x350Var, new j80(dmlVar, liveBaseFrag), false, liveEventBus);
        if (t7t.m187503c(x350Var)) {
            this.f77099e = "p_anchor_live_room";
        } else {
            this.f77099e = "p_user_live_room";
        }
    }
}
