package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class m2b0 extends bo90 {

    /* JADX INFO: renamed from: A */
    public g4b0 f134534A;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f134535v;

    /* JADX INFO: renamed from: w */
    public VImage f134536w;

    /* JADX INFO: renamed from: x */
    public VImage f134537x;

    /* JADX INFO: renamed from: y */
    public VText f134538y;

    /* JADX INFO: renamed from: z */
    public VerificationCenter f134539z;

    public m2b0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f134534A = new g4b0();
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m156799W(x20 x20Var, View view) {
        i4g0.m138520r("e_id_verification_banner_click", OMSDialogPositon.p_suggest_user_profile_info_view);
        x20Var.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m156803a0() {
        hxf.m137593n();
        mo53983O().startActivity(VerificationCenterAct.m57174Y1(mo53983O().act(), false));
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return (t3m) this.f148056c;
    }

    @Override // p153l.bo90
    /* JADX INFO: renamed from: S */
    public boolean mo105673S() {
        if (!mo53983O().mo52289g3()) {
            return false;
        }
        this.f134539z = CoreModule.f18264c.f20294B0.m32615k4();
        if (mo53983O().mo52258P1()) {
            return NullChecker.m82486a(this.f134539z) && NullChecker.m82487b(this.f134539z.picVerificationInfo) && TEnum.equals(this.f134539z.picVerificationInfo.status, "verified") && NullChecker.m82486a(this.f134539z.idCard) && !TEnum.equals(this.f134539z.idCard.status, "verified");
        }
        return mo53983O().mo52252K2().isIdAndPicBothVerified() && !mo53983O().mo53478me().isIdCardVerified();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m156804b0() {
        hxf.m137593n();
        mo53983O().startActivity(VerificationCenterAct.m57174Y1(mo53983O().act(), false));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m156805c0() {
        hxf.m137593n();
        mo53983O().startActivity(VerificationCenterAct.m57174Y1(mo53983O().act(), false));
    }

    /* JADX INFO: renamed from: d0 */
    public void m156806d0(View view, int i, boolean z, final x20 x20Var, TextView textView, String str) {
        m121845Q(view, i);
        if (z) {
            view.setEnabled(true);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.l2b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    m2b0.m156799W(x20Var, view2);
                }
            });
        } else {
            view.setEnabled(false);
            view.setOnClickListener(null);
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m156807e0(StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            bnl0.m105524M(this.f134535v, false);
        } else if (TEnum.equals(studentVerificationStatus, "pending")) {
            bnl0.m105525M0(this.f134535v, true);
            m156806d0(this.f134535v, 0, true, new x20() { // from class: l.j2b0
                @Override // p153l.x20
                public final void call() {
                    this.f118044a.m156804b0();
                }
            }, this.f134538y, mo53983O().act().string(R$string.f19640s8));
            bnl0.m105524M(this.f134537x, false);
            m121845Q(this.f134537x, 8);
        } else {
            String strString = TEnum.equals(studentVerificationStatus, "rejected") ? mo53983O().act().string(R$string.f19609r8) : mo53983O().act().string(R$string.f19578q8);
            bnl0.m105525M0(this.f134535v, true);
            m156806d0(this.f134535v, 0, true, new x20() { // from class: l.k2b0
                @Override // p153l.x20
                public final void call() {
                    this.f123590a.m156805c0();
                }
            }, this.f134538y, strString);
            m121845Q(this.f134537x, 0);
        }
        m156808f0();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m156808f0() {
        if (!mo53983O().mo52236D2()) {
            this.f134536w.setImageResource(dbc0.f87634z8);
            this.f134535v.setBackgroundResource(dbc0.f86323Kq);
            return;
        }
        boolean zMo52258P1 = mo53983O().mo52258P1();
        VImage vImage = this.f134536w;
        if (!zMo52258P1) {
            vImage.setImageDrawable(j26.m143192e(mo53983O().act(), dbc0.f87066hr));
        } else {
            vImage.setImageDrawable(j26.m143192e(mo53983O().act(), dbc0.f87098ir));
            this.f134535v.setBackgroundResource(dbc0.f86323Kq);
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        if (!mo53983O().mo52236D2() || mo53983O().mo52302m0()) {
            this.f134535v.setBackgroundResource(dbc0.f86071Cu);
        }
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View viewM128861a = this.f134534A.m128861a(mo53983O().mo146493H2(), viewGroup);
        g4b0 g4b0Var = this.f134534A;
        this.f134535v = g4b0Var.f102159a;
        this.f134536w = g4b0Var.f102160b;
        this.f134537x = g4b0Var.f102161c;
        this.f134538y = g4b0Var.f102162d;
        return viewM128861a;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        if (mo53983O().mo52258P1()) {
            if (NullChecker.m82487b(this.f134539z) && NullChecker.m82487b(this.f134539z.idCard)) {
                m156807e0(this.f134539z.idCard.status);
                return;
            }
            return;
        }
        m121845Q(this.f134535v, 0);
        m156806d0(this.f134535v, 0, true, new x20() { // from class: l.i2b0
            @Override // p153l.x20
            public final void call() {
                this.f112596a.m156803a0();
            }
        }, this.f134538y, mo53983O().act().string(R$string.f19547p8));
        m121845Q(this.f134537x, 0);
        m156808f0();
    }
}
