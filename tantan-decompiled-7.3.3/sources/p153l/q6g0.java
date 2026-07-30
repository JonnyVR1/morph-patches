package p153l;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuRuleViewModel;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class q6g0<T extends oo2> extends i6t<T, StormDanmakuRuleViewModel> implements dse {
    @SuppressLint({"InflateParams"})
    public q6g0(dum<T> dumVar) {
        super(dumVar);
        mo52715C((StormDanmakuRuleViewModel) act().inflater().inflate(yec0.f198752F0, (ViewGroup) null));
    }

    /* JADX INFO: renamed from: J3 */
    public void m175593J3() {
        m213811F2().EffectsDanmakuEvent.showEffectsDanmakuDialog().mo199273j(new sre.C20136a().m187597c(EffectsDanmakuEvent$Page.STORM).m187595a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.dse
    /* JADX INFO: renamed from: K */
    public View mo117724K() {
        return (View) this.viewModel;
    }

    @Override // p153l.dse
    /* JADX INFO: renamed from: V */
    public boolean mo117725V() {
        return false;
    }

    @Override // p153l.dse
    /* JADX INFO: renamed from: w */
    public void mo117728w() {
    }

    @Override // p153l.dse
    /* JADX INFO: renamed from: Y0 */
    public void mo117726Y0(sre sreVar) {
    }

    @Override // p153l.dse
    /* JADX INFO: renamed from: g0 */
    public void mo117727g0(int i) {
    }
}
