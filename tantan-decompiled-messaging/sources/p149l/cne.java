package p149l;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class cne extends wq90 {
    public cne(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p149l.wq90, p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        if (mo52800O().mo51119m0()) {
            m107784n0();
            m107785o0();
        }
    }

    @Override // p149l.wq90, p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return mo52800O().mo51119m0() && mo52800O().mo51075P1();
    }

    /* JADX INFO: renamed from: n0 */
    public void m107784n0() {
        int i = 0;
        ArrayList arrayListM200324f0 = vwb.m200324f0(this.f187666w, this.f187667x, this.f187653A, this.f187669z, this.f187668y, this.f187654B);
        while (i < arrayListM200324f0.size()) {
            int i2 = i + 1;
            m96407C(i0g0.f110329f[i2], (TextView) arrayListM200324f0.get(i));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m107785o0() {
        m107792v0();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m107786p0() {
        o6j0.m162859c("e_edit_profile_my_interests", "p_edit_profile_view", new o6j0.C18854a[0]);
        LoopFragmentFactory.m51462F("sports", mo52800O().mo51066J1(), mo52800O().m94569i2());
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m107787q0() {
        o6j0.m162859c("e_edit_profile_my_interests", "p_edit_profile_view", new o6j0.C18854a[0]);
        LoopFragmentFactory.m51462F("music", mo52800O().mo51066J1(), mo52800O().m94569i2());
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m107788r0() {
        o6j0.m162859c("e_edit_profile_my_interests", "p_edit_profile_view", new o6j0.C18854a[0]);
        LoopFragmentFactory.m51462F("literature", mo52800O().mo51066J1(), mo52800O().m94569i2());
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m107789s0() {
        o6j0.m162859c("e_edit_profile_my_interests", "p_edit_profile_view", new o6j0.C18854a[0]);
        LoopFragmentFactory.m51462F("movies", mo52800O().mo51066J1(), mo52800O().m94569i2());
    }

    @Override // p149l.wq90, p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        m205050f0(mo52800O().m94569i2());
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m107790t0() {
        o6j0.m162859c("e_edit_profile_my_interests", "p_edit_profile_view", new o6j0.C18854a[0]);
        LoopFragmentFactory.m51462F("food", mo52800O().mo51066J1(), mo52800O().m94569i2());
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m107791u0() {
        o6j0.m162859c("e_edit_profile_my_interests", "p_edit_profile_view", new o6j0.C18854a[0]);
        LoopFragmentFactory.m51462F("places", mo52800O().mo51066J1(), mo52800O().m94569i2());
    }

    /* JADX INFO: renamed from: v0 */
    public final void m107792v0() {
        m96418N(this.f187666w, new d30() { // from class: l.wme
            @Override // p149l.d30
            public final void call() {
                this.f187063a.m107786p0();
            }
        }, true);
        m96418N(this.f187667x, new d30() { // from class: l.xme
            @Override // p149l.d30
            public final void call() {
                this.f193548a.m107787q0();
            }
        }, true);
        m96418N(this.f187653A, new d30() { // from class: l.yme
            @Override // p149l.d30
            public final void call() {
                this.f198996a.m107788r0();
            }
        }, true);
        m96418N(this.f187669z, new d30() { // from class: l.zme
            @Override // p149l.d30
            public final void call() {
                this.f203707a.m107789s0();
            }
        }, true);
        m96418N(this.f187668y, new d30() { // from class: l.ane
            @Override // p149l.d30
            public final void call() {
                this.f70731a.m107790t0();
            }
        }, true);
        m96418N(this.f187654B, new d30() { // from class: l.bne
            @Override // p149l.d30
            public final void call() {
                this.f76393a.m107791u0();
            }
        }, true);
    }
}
