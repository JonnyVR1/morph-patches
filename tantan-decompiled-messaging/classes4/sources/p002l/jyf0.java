package p002l;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuRuleViewModel;
import l.bwr;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jyf0<T extends ho2> extends h4t<T, StormDanmakuRuleViewModel> implements zqe {
    @SuppressLint({"InflateParams"})
    public jyf0(bsm<T> bsmVar) {
        super(bsmVar);
        C((StormDanmakuRuleViewModel) act().inflater().inflate(t6c0.f19516F0, (ViewGroup) null));
    }

    /* JADX INFO: renamed from: J3 */
    public void m16450J3() {
        m25548F2().EffectsDanmakuEvent.showEffectsDanmakuDialog().j(new oqe.C0730a().m19682c(EffectsDanmakuEvent$Page.STORM).m19680a());
    }

    @Override // p002l.zqe
    /* JADX INFO: renamed from: K */
    public View mo15512K() {
        return ((bwr) this).viewModel;
    }

    @Override // p002l.zqe
    /* JADX INFO: renamed from: V */
    public boolean mo15518V() {
        return false;
    }

    @Override // p002l.zqe
    /* JADX INFO: renamed from: w */
    public void mo15528w() {
    }

    @Override // p002l.zqe
    /* JADX INFO: renamed from: Y0 */
    public void mo15522Y0(oqe oqeVar) {
    }

    @Override // p002l.zqe
    /* JADX INFO: renamed from: g0 */
    public void mo15527g0(int i) {
    }
}
