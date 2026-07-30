package p003l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.data.User;
import l.jq2;
import l.mcr;
import p003l.iww;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class hww<V extends iww> extends jq2<V> {
    public hww(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m5004i0(Bundle bundle) {
        m5006h0();
    }

    /* JADX INFO: renamed from: Z */
    public void mo3954Z() {
        super.Z();
        mo3202g0(m5005f0().m500Z1().m9549q0(), m5005f0().m500Z1().m9552t0());
        creates(new e30() { // from class: l.gww
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4073a.m5004i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public MarryEditProfileSeriesAct m5005f0() {
        return ((iww) ((jq2) this).viewModel).act();
    }

    /* JADX INFO: renamed from: g0 */
    public abstract void mo3202g0(MarrySeriesType marrySeriesType, User user);

    /* JADX INFO: renamed from: h0 */
    public void m5006h0() {
        ((iww) ((jq2) this).viewModel).mo3210i(m5005f0().m500Z1().m9549q0(), m5005f0().m500Z1().m9552t0());
    }

    public void destroy() {
    }
}
