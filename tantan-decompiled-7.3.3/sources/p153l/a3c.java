package p153l;

import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.tag.DanmakuTagViewContainer;
import java.util.HashMap;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class a3c<D extends oo2> extends nn2<D, DanmakuTagViewContainer> {
    public a3c(dum<D> dumVar, DanmakuTagViewContainer danmakuTagViewContainer) {
        super(dumVar);
        mo52715C(danmakuTagViewContainer);
    }

    @Override // p153l.nn2
    /* JADX INFO: renamed from: Y3 */
    public void mo95792Y3(boolean z) {
        super.mo95792Y3(z);
        if (z) {
            return;
        }
        ((DanmakuTagViewContainer) this.viewModel).m73764d(0.0f, true);
    }

    @Override // p153l.nn2
    /* JADX INFO: renamed from: Z3 */
    public void mo95793Z3(boolean z, int i) {
        super.mo95793Z3(z, i);
        if (!z) {
            ((DanmakuTagViewContainer) this.viewModel).m73764d(1.0f - (i / 180.0f), false);
        } else {
            float f = i;
            ((DanmakuTagViewContainer) this.viewModel).m73766j(f <= 240.0f ? f / 240.0f : 1.0f);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m95794d4() {
        m213811F2().ChatEvent.dismissDialog().m199277p();
        m213811F2().EffectsDanmakuEvent.showEffectsDanmakuDialog().mo199273j(new sre.C20136a().m187597c(EffectsDanmakuEvent$Page.STORM).m187595a());
        HashMap map = new HashMap();
        map.put("bullet_show_type", "special_effects");
        i4g0.m138521s("e_live_bullet_storm_entrance", mo78457R2(), map);
    }

    /* JADX INFO: renamed from: e4 */
    public void m95795e4() {
        HashMap map = new HashMap();
        map.put("bullet_show_type", "text");
        i4g0.m138521s("e_live_bullet_storm_entrance", mo78457R2(), map);
    }
}
