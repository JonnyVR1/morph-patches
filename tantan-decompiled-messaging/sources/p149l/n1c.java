package p149l;

import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.tag.DanmakuTagViewContainer;
import java.util.HashMap;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class n1c<D extends ho2> extends gn2<D, DanmakuTagViewContainer> {
    public n1c(bsm<D> bsmVar, DanmakuTagViewContainer danmakuTagViewContainer) {
        super(bsmVar);
        mo51532C(danmakuTagViewContainer);
    }

    @Override // p149l.gn2
    /* JADX INFO: renamed from: Y3 */
    public void mo127107Y3(boolean z) {
        super.mo127107Y3(z);
        if (z) {
            return;
        }
        ((DanmakuTagViewContainer) this.viewModel).m72581d(0.0f, true);
    }

    @Override // p149l.gn2
    /* JADX INFO: renamed from: Z3 */
    public void mo127108Z3(boolean z, int i) {
        super.mo127108Z3(z, i);
        if (!z) {
            ((DanmakuTagViewContainer) this.viewModel).m72581d(1.0f - (i / 180.0f), false);
        } else {
            float f = i;
            ((DanmakuTagViewContainer) this.viewModel).m72583j(f <= 240.0f ? f / 240.0f : 1.0f);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m157344d4() {
        m206028F2().ChatEvent.dismissDialog().m172467p();
        m206028F2().EffectsDanmakuEvent.showEffectsDanmakuDialog().mo172463j(new oqe.C19001a().m165421c(EffectsDanmakuEvent$Page.STORM).m165419a());
        HashMap map = new HashMap();
        map.put("bullet_show_type", "special_effects");
        zvf0.m220397s("e_live_bullet_storm_entrance", mo77274R2(), map);
    }

    /* JADX INFO: renamed from: e4 */
    public void m157345e4() {
        HashMap map = new HashMap();
        map.put("bullet_show_type", "text");
        zvf0.m220397s("e_live_bullet_storm_entrance", mo77274R2(), map);
    }
}
