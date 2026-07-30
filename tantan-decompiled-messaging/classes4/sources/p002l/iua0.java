package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.ui.verification.VerificationCenterAct;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e16;
import l.mcr;
import l.tvf;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iua0 extends xf90 {

    /* JADX INFO: renamed from: A */
    public cwa0 f13411A;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f13412v;

    /* JADX INFO: renamed from: w */
    public VImage f13413w;

    /* JADX INFO: renamed from: x */
    public VImage f13414x;

    /* JADX INFO: renamed from: y */
    public VText f13415y;

    /* JADX INFO: renamed from: z */
    public VerificationCenter f13416z;

    public iua0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f13411A = new cwa0();
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m15398W(d30 d30Var, View view) {
        zvf0.r("e_id_verification_banner_click", "p_suggest_user_profile_info_view");
        d30Var.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m15402a0() {
        tvf.n();
        mo3351O().startActivity(VerificationCenterAct.X1(mo3351O().act(), false));
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return (a1m) this.f12125c;
    }

    @Override // p002l.xf90
    /* JADX INFO: renamed from: S */
    public boolean mo10392S() {
        if (!mo3351O().mo1556g3()) {
            return false;
        }
        this.f13416z = CoreModule.c.B0.k4();
        if (mo3351O().mo1523P1()) {
            return NullChecker.a(this.f13416z) && NullChecker.b(this.f13416z.picVerificationInfo) && TEnum.equals(this.f13416z.picVerificationInfo.status, "verified") && NullChecker.a(this.f13416z.idCard) && !TEnum.equals(this.f13416z.idCard.status, "verified");
        }
        return mo3351O().mo1517K2().isIdAndPicBothVerified() && !mo3351O().mo2827me().isIdCardVerified();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m15403b0() {
        tvf.n();
        mo3351O().startActivity(VerificationCenterAct.X1(mo3351O().act(), false));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m15404c0() {
        tvf.n();
        mo3351O().startActivity(VerificationCenterAct.X1(mo3351O().act(), false));
    }

    /* JADX INFO: renamed from: d0 */
    public void m15405d0(View view, int i, boolean z, final d30 d30Var, TextView textView, String str) {
        m9651Q(view, i);
        if (z) {
            view.setEnabled(true);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.hua0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    iua0.m15398W(d30Var, view2);
                }
            });
        } else {
            view.setEnabled(false);
            view.setOnClickListener(null);
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m15406e0(StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            xdl0.M(this.f13412v, false);
        } else if (TEnum.equals(studentVerificationStatus, "pending")) {
            xdl0.M0(this.f13412v, true);
            m15405d0(this.f13412v, 0, true, new d30() { // from class: l.fua0
                public final void call() {
                    this.f10637a.m15403b0();
                }
            }, this.f13415y, mo3351O().act().string(R.string.q8));
            xdl0.M(this.f13414x, false);
            m9651Q(this.f13414x, 8);
        } else {
            String strString = TEnum.equals(studentVerificationStatus, "rejected") ? mo3351O().act().string(R.string.p8) : mo3351O().act().string(R.string.o8);
            xdl0.M0(this.f13412v, true);
            m15405d0(this.f13412v, 0, true, new d30() { // from class: l.gua0
                public final void call() {
                    this.f11630a.m15404c0();
                }
            }, this.f13415y, strString);
            m9651Q(this.f13414x, 0);
        }
        m15407f0();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m15407f0() {
        if (!mo3351O().mo1501D2()) {
            this.f13413w.setImageResource(x2c0.y8);
            this.f13412v.setBackgroundResource(x2c0.Wp);
            return;
        }
        boolean zMo1523P1 = mo3351O().mo1523P1();
        VImage vImage = this.f13413w;
        if (!zMo1523P1) {
            vImage.setImageDrawable(e16.e(mo3351O().act(), x2c0.tq));
        } else {
            vImage.setImageDrawable(e16.e(mo3351O().act(), x2c0.uq));
            this.f13412v.setBackgroundResource(x2c0.Wp);
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        if (!mo3351O().mo1501D2() || mo3351O().mo1570m0()) {
            this.f13412v.setBackgroundResource(x2c0.Ot);
        }
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        View viewM11396a = this.f13411A.m11396a(mo3351O().mo9267H2(), viewGroup);
        cwa0 cwa0Var = this.f13411A;
        this.f13412v = cwa0Var.f8957a;
        this.f13413w = cwa0Var.f8958b;
        this.f13414x = cwa0Var.f8959c;
        this.f13415y = cwa0Var.f8960d;
        return viewM11396a;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        if (mo3351O().mo1523P1()) {
            if (NullChecker.b(this.f13416z) && NullChecker.b(this.f13416z.idCard)) {
                m15406e0(this.f13416z.idCard.status);
                return;
            }
            return;
        }
        m9651Q(this.f13412v, 0);
        m15405d0(this.f13412v, 0, true, new d30() { // from class: l.eua0
            public final void call() {
                this.f9968a.m15402a0();
            }
        }, this.f13415y, mo3351O().act().string(R.string.n8));
        m9651Q(this.f13414x, 0);
        m15407f0();
    }
}
