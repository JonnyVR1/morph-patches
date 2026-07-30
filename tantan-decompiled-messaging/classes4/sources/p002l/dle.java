package p002l;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.EditAboutMeAct;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.d30;
import l.e30;
import l.i0e;
import l.j760;
import l.mcr;
import l.v9j;
import l.vwb;
import l.w0c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dle extends ge90 {

    /* JADX INFO: renamed from: z */
    public Spannable f9321z;

    public dle(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f9321z = new SpannableString("");
        m14461p().creates(new e30() { // from class: l.cle
            public final void call(Object obj) {
                this.f8737a.m11937k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    private void m11936e0() {
        if (mo3351O().mo1501D2() || mo3351O().mo1530S()) {
            return;
        }
        m9638C(mo3351O().act().getResources().getColor(w0c0.N1), this.f11386x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m11937k0(Bundle bundle) {
        if (mo3351O().mo1570m0()) {
            this.f9321z = new SpannableString(mo3351O().mo2827me().description);
        }
    }

    @Override // p002l.ge90, p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return m14465w();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m11938f0() {
        if ("ko".equals(mo3351O().act().getResources().getConfiguration().locale.getLanguage())) {
            xdl0.E0(this.f11385w, new View.OnClickListener() { // from class: l.wke
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21811a.m11939g0(view);
                }
            });
            return;
        }
        final cwf0 cwf0VarC = i0e.c("p_edit_self_introduction_view", i0e.b.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", "active")});
        m9641F(this.f11385w, true, true, mo3351O().act().getString(R.string.ll), 5, 500, mo3351O().act().getString(R.string.A), new e30() { // from class: l.xke
            public final void call(Object obj) {
                this.f22336a.m11940h0((String) obj);
            }
        }, new v9j() { // from class: l.yke
            public final Object call() {
                return this.f22955a.m11941i0();
            }
        }, new d30() { // from class: l.zke
            public final void call() {
                i0e.f(cwf0VarC);
            }
        }, new d30() { // from class: l.ale
            public final void call() {
                i0e.e(cwf0VarC);
            }
        }, new d30() { // from class: l.ble
            public final void call() {
                this.f8255a.m11942j0();
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m11939g0(View view) {
        mo3351O().startActivityForResult(EditAboutMeAct.m1005e2(mo3351O().act(), mo3351O().m9268i2().description), 1);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m11940h0(String str) {
        mo3351O().m9268i2().description = vwb.k(str);
        mo3351O().mo1504E();
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ String m11941i0() {
        return mo3351O().m9268i2().description;
    }

    @Override // p002l.ge90, p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        m11936e0();
        m11938f0();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m11942j0() {
        m11944m0(mo3351O().m9268i2());
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return mo3351O().mo1570m0();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m11943l0(int[] iArr) {
        if (this.f11386x.getLineCount() > 1) {
            this.f11386x.setTextSize(15.0f);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m11944m0(User user) {
        if (NullChecker.a(user)) {
            this.f11386x.setText(user.description);
            this.f9321z = new SpannableString(user.description);
            m11938f0();
            if (mo3351O().mo1501D2() || mo3351O().mo1530S()) {
                return;
            }
            xdl0.Q0(this.f11386x, new e30() { // from class: l.vke
                public final void call(Object obj) {
                    this.f21197a.m11943l0((int[]) obj);
                }
            });
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        m11944m0(mo3351O().m9268i2());
    }
}
