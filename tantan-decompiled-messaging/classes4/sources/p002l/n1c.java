package p002l;

import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.tag.DanmakuTagViewContainer;
import java.util.HashMap;
import l.bwr;
import l.zvf0;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class n1c<D extends ho2> extends gn2<D, DanmakuTagViewContainer> {
    public n1c(bsm<D> bsmVar, DanmakuTagViewContainer danmakuTagViewContainer) {
        super(bsmVar);
        C(danmakuTagViewContainer);
    }

    @Override // p002l.gn2
    /* JADX INFO: renamed from: Y3 */
    public void mo13961Y3(boolean z) {
        super.mo13961Y3(z);
        if (z) {
            return;
        }
        ((DanmakuTagViewContainer) ((bwr) this).viewModel).m6078d(0.0f, true);
    }

    @Override // p002l.gn2
    /* JADX INFO: renamed from: Z3 */
    public void mo13962Z3(boolean z, int i) {
        super.mo13962Z3(z, i);
        if (!z) {
            ((DanmakuTagViewContainer) ((bwr) this).viewModel).m6078d(1.0f - (i / 180.0f), false);
        } else {
            float f = i;
            ((DanmakuTagViewContainer) ((bwr) this).viewModel).m6081j(f <= 240.0f ? f / 240.0f : 1.0f);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m18363d4() {
        m25548F2().ChatEvent.dismissDialog().p();
        m25548F2().EffectsDanmakuEvent.showEffectsDanmakuDialog().j(new oqe.C0730a().m19682c(EffectsDanmakuEvent$Page.STORM).m19680a());
        HashMap map = new HashMap();
        map.put("bullet_show_type", "special_effects");
        zvf0.s("e_live_bullet_storm_entrance", mo21430R2(), map);
    }

    /* JADX INFO: renamed from: e4 */
    public void m18364e4() {
        HashMap map = new HashMap();
        map.put("bullet_show_type", "text");
        zvf0.s("e_live_bullet_storm_entrance", mo21430R2(), map);
    }
}
