package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.ui.verification.VerificationCenterAct;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.mcr;
import l.tvf;
import l.x2c0;
import l.xdl0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iqa0 extends xf90 {

    /* JADX INFO: renamed from: A */
    public VerificationCenter f13358A;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f13359v;

    /* JADX INFO: renamed from: w */
    public VImage f13360w;

    /* JADX INFO: renamed from: x */
    public VImage f13361x;

    /* JADX INFO: renamed from: y */
    public VText f13362y;

    /* JADX INFO: renamed from: z */
    public cwa0 f13363z;

    public iqa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f13363z = new cwa0();
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return (a1m) this.f12125c;
    }

    @Override // p002l.xf90
    /* JADX INFO: renamed from: S */
    public boolean mo10392S() {
        User userMo1517K2 = mo3351O().mo1517K2();
        User userMo2827me = mo3351O().mo2827me();
        this.f13358A = CoreModule.c.B0.k4();
        if (mo3351O().mo1523P1()) {
            return (NullChecker.a(this.f13358A) && NullChecker.b(this.f13358A.picVerificationInfo) && TEnum.equals(this.f13358A.picVerificationInfo.status, "verified")) ? false : true;
        }
        return userMo1517K2.isPicVerificationVerified() && !userMo2827me.isPicVerificationVerified();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m15291a0() {
        tvf.n();
        mo3351O().startActivity(VerificationCenterAct.X1(mo3351O().act(), false));
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m15292b0() {
        tvf.n();
        mo3351O().startActivity(VerificationCenterAct.X1(mo3351O().act(), false));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m15293c0() {
        mo3351O().startActivity(VerificationCenterAct.X1(mo3351O().act(), false));
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m15294d0() {
        tvf.n();
        mo3351O().startActivity(VerificationCenterAct.X1(mo3351O().act(), false));
    }

    /* JADX INFO: renamed from: e0 */
    public final void m15295e0(StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            xdl0.M(this.f13359v, false);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            xdl0.M0(this.f13359v, true);
            m25903U(this.f13359v, 0, true, new d30() { // from class: l.gqa0
                public final void call() {
                    this.f11577a.m15293c0();
                }
            }, this.f13362y, mo3351O().act().string(R.string.Dr));
            m9651Q(this.f13361x, 8);
        } else {
            String strString = TEnum.equals(studentVerificationStatus, "rejected") ? mo3351O().act().string(R.string.Er) : mo3351O().act().string(R.string.Fr);
            xdl0.M0(this.f13359v, true);
            m25903U(this.f13359v, 0, true, new d30() { // from class: l.hqa0
                public final void call() {
                    this.f12217a.m15294d0();
                }
            }, this.f13362y, strString);
            m9651Q(this.f13361x, 0);
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        if (mo3351O().mo1501D2()) {
            return;
        }
        this.f13360w.setImageResource(x2c0.ft);
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        View viewM11396a = this.f13363z.m11396a(mo3351O().mo9267H2(), viewGroup);
        cwa0 cwa0Var = this.f13363z;
        this.f13359v = cwa0Var.f8957a;
        this.f13360w = cwa0Var.f8958b;
        this.f13361x = cwa0Var.f8959c;
        this.f13362y = cwa0Var.f8960d;
        return viewM11396a;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        if (!mo3351O().mo1523P1()) {
            m25903U(this.f13359v, 0, true, new d30() { // from class: l.fqa0
                public final void call() {
                    this.f10596a.m15292b0();
                }
            }, this.f13362y, mo3351O().act().string(R.string.Gr));
        } else if (NullChecker.a(this.f13358A) && NullChecker.b(this.f13358A.picVerificationInfo)) {
            m15295e0(this.f13358A.picVerificationInfo.status);
        } else {
            xdl0.M0(this.f13359v, true);
            m25903U(this.f13359v, 0, true, new d30() { // from class: l.eqa0
                public final void call() {
                    this.f9930a.m15291a0();
                }
            }, this.f13362y, mo3351O().act().string(R.string.Fr));
        }
    }
}
