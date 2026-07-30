package p153l;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class goe extends az90 {
    public goe(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    @Override // p153l.az90, p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        if (mo53983O().mo52302m0()) {
            m131101n0();
            m131102o0();
        }
    }

    @Override // p153l.az90, p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return mo53983O().mo52302m0() && mo53983O().mo52258P1();
    }

    /* JADX INFO: renamed from: n0 */
    public void m131101n0() {
        int i = 0;
        ArrayList arrayListM147507f0 = jyb.m147507f0(this.f74116w, this.f74117x, this.f74103A, this.f74119z, this.f74118y, this.f74104B);
        while (i < arrayListM147507f0.size()) {
            int i2 = i + 1;
            m121832C(q8g0.f156113f[i2], (TextView) arrayListM147507f0.get(i));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m131102o0() {
        m131109v0();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m131103p0() {
        sfj0.m185596c("e_edit_profile_my_interests", "p_edit_profile_view", new sfj0.C20032a[0]);
        LoopFragmentFactory.m52645F("sports", mo53983O().mo52249J1(), mo53983O().m189086i2());
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m131104q0() {
        sfj0.m185596c("e_edit_profile_my_interests", "p_edit_profile_view", new sfj0.C20032a[0]);
        LoopFragmentFactory.m52645F("music", mo53983O().mo52249J1(), mo53983O().m189086i2());
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m131105r0() {
        sfj0.m185596c("e_edit_profile_my_interests", "p_edit_profile_view", new sfj0.C20032a[0]);
        LoopFragmentFactory.m52645F("literature", mo53983O().mo52249J1(), mo53983O().m189086i2());
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m131106s0() {
        sfj0.m185596c("e_edit_profile_my_interests", "p_edit_profile_view", new sfj0.C20032a[0]);
        LoopFragmentFactory.m52645F("movies", mo53983O().mo52249J1(), mo53983O().m189086i2());
    }

    @Override // p153l.az90, p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        m101032f0(mo53983O().m189086i2());
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m131107t0() {
        sfj0.m185596c("e_edit_profile_my_interests", "p_edit_profile_view", new sfj0.C20032a[0]);
        LoopFragmentFactory.m52645F("food", mo53983O().mo52249J1(), mo53983O().m189086i2());
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m131108u0() {
        sfj0.m185596c("e_edit_profile_my_interests", "p_edit_profile_view", new sfj0.C20032a[0]);
        LoopFragmentFactory.m52645F("places", mo53983O().mo52249J1(), mo53983O().m189086i2());
    }

    /* JADX INFO: renamed from: v0 */
    public final void m131109v0() {
        m121843N(this.f74116w, new x20() { // from class: l.aoe
            @Override // p153l.x20
            public final void call() {
                this.f72445a.m131103p0();
            }
        }, true);
        m121843N(this.f74117x, new x20() { // from class: l.boe
            @Override // p153l.x20
            public final void call() {
                this.f77668a.m131104q0();
            }
        }, true);
        m121843N(this.f74103A, new x20() { // from class: l.coe
            @Override // p153l.x20
            public final void call() {
                this.f82861a.m131105r0();
            }
        }, true);
        m121843N(this.f74119z, new x20() { // from class: l.doe
            @Override // p153l.x20
            public final void call() {
                this.f89915a.m131106s0();
            }
        }, true);
        m121843N(this.f74118y, new x20() { // from class: l.eoe
            @Override // p153l.x20
            public final void call() {
                this.f94925a.m131107t0();
            }
        }, true);
        m121843N(this.f74104B, new x20() { // from class: l.foe
            @Override // p153l.x20
            public final void call() {
                this.f100049a.m131108u0();
            }
        }, true);
    }
}
