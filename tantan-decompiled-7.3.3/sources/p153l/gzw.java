package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.User;
import p153l.hzw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gzw<V extends hzw> extends ar2<V> {
    public gzw(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m133133i0(Bundle bundle) {
        m133135h0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        mo95433g0(m133134f0().m48636a2().m213993q0(), m133134f0().m48636a2().m213996t0());
        creates(new y20() { // from class: l.fzw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101554a.m133133i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public MarryEditProfileSeriesAct m133134f0() {
        return ((hzw) this.viewModel).act();
    }

    /* JADX INFO: renamed from: g0 */
    public abstract void mo95433g0(MarrySeriesType marrySeriesType, User user);

    /* JADX INFO: renamed from: h0 */
    public void m133135h0() {
        ((hzw) this.viewModel).mo95578i(m133134f0().m48636a2().m213993q0(), m133134f0().m48636a2().m213996t0());
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
