package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.tantan.live.eventbus.LiveEventBus;
import l.dml;
import l.j80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class l450 extends bsm<x350> {
    public l450(LiveBaseFrag liveBaseFrag, dml dmlVar, x350 x350Var, LiveEventBus liveEventBus) {
        super(liveBaseFrag, x350Var, new j80(dmlVar, liveBaseFrag), false, liveEventBus);
        if (t7t.m22811c(x350Var)) {
            this.f8336e = "p_anchor_live_room";
        } else {
            this.f8336e = "p_user_live_room";
        }
    }
}
