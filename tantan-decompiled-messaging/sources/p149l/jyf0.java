package p149l;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuRuleViewModel;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class jyf0<T extends ho2> extends h4t<T, StormDanmakuRuleViewModel> implements zqe {
    @SuppressLint({"InflateParams"})
    public jyf0(bsm<T> bsmVar) {
        super(bsmVar);
        mo51532C((StormDanmakuRuleViewModel) act().inflater().inflate(t6c0.f168020F0, (ViewGroup) null));
    }

    /* JADX INFO: renamed from: J3 */
    public void m143869J3() {
        m206028F2().EffectsDanmakuEvent.showEffectsDanmakuDialog().mo172463j(new oqe.C19001a().m165421c(EffectsDanmakuEvent$Page.STORM).m165419a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.zqe
    /* JADX INFO: renamed from: K */
    public View mo138969K() {
        return (View) this.viewModel;
    }

    @Override // p149l.zqe
    /* JADX INFO: renamed from: V */
    public boolean mo138975V() {
        return false;
    }

    @Override // p149l.zqe
    /* JADX INFO: renamed from: w */
    public void mo138985w() {
    }

    @Override // p149l.zqe
    /* JADX INFO: renamed from: Y0 */
    public void mo138979Y0(oqe oqeVar) {
    }

    @Override // p149l.zqe
    /* JADX INFO: renamed from: g0 */
    public void mo138984g0(int i) {
    }
}
