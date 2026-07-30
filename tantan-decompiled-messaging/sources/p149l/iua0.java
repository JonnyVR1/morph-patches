package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationCenterAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class iua0 extends xf90 {

    /* JADX INFO: renamed from: A */
    public cwa0 f114982A;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f114983v;

    /* JADX INFO: renamed from: w */
    public VImage f114984w;

    /* JADX INFO: renamed from: x */
    public VImage f114985x;

    /* JADX INFO: renamed from: y */
    public VText f114986y;

    /* JADX INFO: renamed from: z */
    public VerificationCenter f114987z;

    public iua0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f114982A = new cwa0();
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m138355W(d30 d30Var, View view) {
        zvf0.m220396r("e_id_verification_banner_click", OMSDialogPositon.p_suggest_user_profile_info_view);
        d30Var.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m138359a0() {
        tvf.m190736n();
        mo52800O().startActivity(VerificationCenterAct.m55991X1(mo52800O().act(), false));
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return (a1m) this.f108534c;
    }

    @Override // p149l.xf90
    /* JADX INFO: renamed from: S */
    public boolean mo102271S() {
        if (!mo52800O().mo51106g3()) {
            return false;
        }
        this.f114987z = CoreModule.f17545c.f19552B0.m31612k4();
        if (mo52800O().mo51075P1()) {
            return NullChecker.m81303a(this.f114987z) && NullChecker.m81304b(this.f114987z.picVerificationInfo) && TEnum.equals(this.f114987z.picVerificationInfo.status, "verified") && NullChecker.m81303a(this.f114987z.idCard) && !TEnum.equals(this.f114987z.idCard.status, "verified");
        }
        return mo52800O().mo51069K2().isIdAndPicBothVerified() && !mo52800O().mo52295me().isIdCardVerified();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m138360b0() {
        tvf.m190736n();
        mo52800O().startActivity(VerificationCenterAct.m55991X1(mo52800O().act(), false));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m138361c0() {
        tvf.m190736n();
        mo52800O().startActivity(VerificationCenterAct.m55991X1(mo52800O().act(), false));
    }

    /* JADX INFO: renamed from: d0 */
    public void m138362d0(View view, int i, boolean z, final d30 d30Var, TextView textView, String str) {
        m96420Q(view, i);
        if (z) {
            view.setEnabled(true);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.hua0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    iua0.m138355W(d30Var, view2);
                }
            });
        } else {
            view.setEnabled(false);
            view.setOnClickListener(null);
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m138363e0(StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            xdl0.m208344M(this.f114983v, false);
        } else if (TEnum.equals(studentVerificationStatus, "pending")) {
            xdl0.m208345M0(this.f114983v, true);
            m138362d0(this.f114983v, 0, true, new d30() { // from class: l.fua0
                @Override // p149l.d30
                public final void call() {
                    this.f99326a.m138360b0();
                }
            }, this.f114986y, mo52800O().act().string(R$string.f18847q8));
            xdl0.m208344M(this.f114985x, false);
            m96420Q(this.f114985x, 8);
        } else {
            String strString = TEnum.equals(studentVerificationStatus, "rejected") ? mo52800O().act().string(R$string.f18817p8) : mo52800O().act().string(R$string.f18786o8);
            xdl0.m208345M0(this.f114983v, true);
            m138362d0(this.f114983v, 0, true, new d30() { // from class: l.gua0
                @Override // p149l.d30
                public final void call() {
                    this.f104385a.m138361c0();
                }
            }, this.f114986y, strString);
            m96420Q(this.f114985x, 0);
        }
        m138364f0();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m138364f0() {
        if (!mo52800O().mo51053D2()) {
            this.f114984w.setImageResource(x2c0.f190739y8);
            this.f114983v.setBackgroundResource(x2c0.f189867Wp);
            return;
        }
        boolean zMo51075P1 = mo52800O().mo51075P1();
        VImage vImage = this.f114984w;
        if (!zMo51075P1) {
            vImage.setImageDrawable(e16.m114377e(mo52800O().act(), x2c0.f190597tq));
        } else {
            vImage.setImageDrawable(e16.m114377e(mo52800O().act(), x2c0.f190629uq));
            this.f114983v.setBackgroundResource(x2c0.f189867Wp);
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        if (!mo52800O().mo51053D2() || mo52800O().mo51119m0()) {
            this.f114983v.setBackgroundResource(x2c0.f189623Ot);
        }
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View viewM108989a = this.f114982A.m108989a(mo52800O().mo94568H2(), viewGroup);
        cwa0 cwa0Var = this.f114982A;
        this.f114983v = cwa0Var.f82764a;
        this.f114984w = cwa0Var.f82765b;
        this.f114985x = cwa0Var.f82766c;
        this.f114986y = cwa0Var.f82767d;
        return viewM108989a;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        if (mo52800O().mo51075P1()) {
            if (NullChecker.m81304b(this.f114987z) && NullChecker.m81304b(this.f114987z.idCard)) {
                m138363e0(this.f114987z.idCard.status);
                return;
            }
            return;
        }
        m96420Q(this.f114983v, 0);
        m138362d0(this.f114983v, 0, true, new d30() { // from class: l.eua0
            @Override // p149l.d30
            public final void call() {
                this.f93223a.m138359a0();
            }
        }, this.f114986y, mo52800O().act().string(R$string.f18755n8));
        m96420Q(this.f114985x, 0);
        m138364f0();
    }
}
