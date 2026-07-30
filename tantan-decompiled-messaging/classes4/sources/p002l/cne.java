package p002l;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import java.util.ArrayList;
import l.d30;
import l.i0g0;
import l.mcr;
import l.o6j0;
import l.vwb;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cne extends wq90 {
    public cne(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p002l.wq90, p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        if (mo3351O().mo1570m0()) {
            m11122n0();
            m11123o0();
        }
    }

    @Override // p002l.wq90, p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return mo3351O().mo1570m0() && mo3351O().mo1523P1();
    }

    /* JADX INFO: renamed from: n0 */
    public void m11122n0() {
        int i = 0;
        ArrayList arrayListF0 = vwb.f0(new VText[]{this.f21925w, this.f21926x, this.f21912A, this.f21928z, this.f21927y, this.f21913B});
        while (i < arrayListF0.size()) {
            int i2 = i + 1;
            m9638C(i0g0.f[i2], (TextView) arrayListF0.get(i));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m11123o0() {
        m11130v0();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m11124p0() {
        o6j0.c("e_edit_profile_my_interests", "p_edit_profile_view", new o6j0.a[0]);
        LoopFragmentFactory.m1944F("sports", mo3351O().mo1514J1(), mo3351O().m9268i2());
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m11125q0() {
        o6j0.c("e_edit_profile_my_interests", "p_edit_profile_view", new o6j0.a[0]);
        LoopFragmentFactory.m1944F("music", mo3351O().mo1514J1(), mo3351O().m9268i2());
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m11126r0() {
        o6j0.c("e_edit_profile_my_interests", "p_edit_profile_view", new o6j0.a[0]);
        LoopFragmentFactory.m1944F("literature", mo3351O().mo1514J1(), mo3351O().m9268i2());
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m11127s0() {
        o6j0.c("e_edit_profile_my_interests", "p_edit_profile_view", new o6j0.a[0]);
        LoopFragmentFactory.m1944F("movies", mo3351O().mo1514J1(), mo3351O().m9268i2());
    }

    @Override // p002l.wq90, p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        m25317f0(mo3351O().m9268i2());
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m11128t0() {
        o6j0.c("e_edit_profile_my_interests", "p_edit_profile_view", new o6j0.a[0]);
        LoopFragmentFactory.m1944F("food", mo3351O().mo1514J1(), mo3351O().m9268i2());
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m11129u0() {
        o6j0.c("e_edit_profile_my_interests", "p_edit_profile_view", new o6j0.a[0]);
        LoopFragmentFactory.m1944F("places", mo3351O().mo1514J1(), mo3351O().m9268i2());
    }

    /* JADX INFO: renamed from: v0 */
    public final void m11130v0() {
        m9649N(this.f21925w, new d30() { // from class: l.wme
            public final void call() {
                this.f21828a.m11124p0();
            }
        }, true);
        m9649N(this.f21926x, new d30() { // from class: l.xme
            public final void call() {
                this.f22356a.m11125q0();
            }
        }, true);
        m9649N(this.f21912A, new d30() { // from class: l.yme
            public final void call() {
                this.f22979a.m11126r0();
            }
        }, true);
        m9649N(this.f21928z, new d30() { // from class: l.zme
            public final void call() {
                this.f23509a.m11127s0();
            }
        }, true);
        m9649N(this.f21927y, new d30() { // from class: l.ane
            public final void call() {
                this.f7767a.m11128t0();
            }
        }, true);
        m9649N(this.f21913B, new d30() { // from class: l.bne
            public final void call() {
                this.f8277a.m11129u0();
            }
        }, true);
    }
}
