package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.User;
import p149l.iww;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hww<V extends iww> extends jq2<V> {
    public hww(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m133273i0(Bundle bundle) {
        m133275h0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        mo104384g0(m133274f0().m47453Z1().m220976q0(), m133274f0().m47453Z1().m220979t0());
        creates(new e30() { // from class: l.gww
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104798a.m133273i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public MarryEditProfileSeriesAct m133274f0() {
        return ((iww) this.viewModel).act();
    }

    /* JADX INFO: renamed from: g0 */
    public abstract void mo104384g0(MarrySeriesType marrySeriesType, User user);

    /* JADX INFO: renamed from: h0 */
    public void m133275h0() {
        ((iww) this.viewModel).mo104518i(m133274f0().m47453Z1().m220976q0(), m133274f0().m47453Z1().m220979t0());
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
