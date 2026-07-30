package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class mya0 extends bo90 {

    /* JADX INFO: renamed from: A */
    public VerificationCenter f139342A;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f139343v;

    /* JADX INFO: renamed from: w */
    public VImage f139344w;

    /* JADX INFO: renamed from: x */
    public VImage f139345x;

    /* JADX INFO: renamed from: y */
    public VText f139346y;

    /* JADX INFO: renamed from: z */
    public g4b0 f139347z;

    public mya0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f139347z = new g4b0();
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return (t3m) this.f148056c;
    }

    @Override // p153l.bo90
    /* JADX INFO: renamed from: S */
    public boolean mo105673S() {
        User userMo52252K2 = mo53983O().mo52252K2();
        User userMo53478me = mo53983O().mo53478me();
        this.f139342A = CoreModule.f18264c.f20294B0.m32615k4();
        if (mo53983O().mo52258P1()) {
            return (NullChecker.m82486a(this.f139342A) && NullChecker.m82487b(this.f139342A.picVerificationInfo) && TEnum.equals(this.f139342A.picVerificationInfo.status, "verified")) ? false : true;
        }
        return userMo52252K2.isPicVerificationVerified() && !userMo53478me.isPicVerificationVerified();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m160746a0() {
        hxf.m137593n();
        mo53983O().startActivity(VerificationCenterAct.m57174Y1(mo53983O().act(), false));
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m160747b0() {
        hxf.m137593n();
        mo53983O().startActivity(VerificationCenterAct.m57174Y1(mo53983O().act(), false));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m160748c0() {
        mo53983O().startActivity(VerificationCenterAct.m57174Y1(mo53983O().act(), false));
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m160749d0() {
        hxf.m137593n();
        mo53983O().startActivity(VerificationCenterAct.m57174Y1(mo53983O().act(), false));
    }

    /* JADX INFO: renamed from: e0 */
    public final void m160750e0(StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            bnl0.m105524M(this.f139343v, false);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            bnl0.m105525M0(this.f139343v, true);
            m105675U(this.f139343v, 0, true, new x20() { // from class: l.kya0
                @Override // p153l.x20
                public final void call() {
                    this.f129296a.m160748c0();
                }
            }, this.f139346y, mo53983O().act().string(R$string.f19074Zr));
            m121845Q(this.f139345x, 8);
        } else {
            String strString = TEnum.equals(studentVerificationStatus, "rejected") ? mo53983O().act().string(R$string.f19105as) : mo53983O().act().string(R$string.f19136bs);
            bnl0.m105525M0(this.f139343v, true);
            m105675U(this.f139343v, 0, true, new x20() { // from class: l.lya0
                @Override // p153l.x20
                public final void call() {
                    this.f134047a.m160749d0();
                }
            }, this.f139346y, strString);
            m121845Q(this.f139345x, 0);
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        if (mo53983O().mo52236D2()) {
            return;
        }
        this.f139344w.setImageResource(dbc0.f86646Ut);
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View viewM128861a = this.f139347z.m128861a(mo53983O().mo146493H2(), viewGroup);
        g4b0 g4b0Var = this.f139347z;
        this.f139343v = g4b0Var.f102159a;
        this.f139344w = g4b0Var.f102160b;
        this.f139345x = g4b0Var.f102161c;
        this.f139346y = g4b0Var.f102162d;
        return viewM128861a;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        if (!mo53983O().mo52258P1()) {
            m105675U(this.f139343v, 0, true, new x20() { // from class: l.jya0
                @Override // p153l.x20
                public final void call() {
                    this.f123124a.m160747b0();
                }
            }, this.f139346y, mo53983O().act().string(R$string.f19167cs));
        } else if (NullChecker.m82486a(this.f139342A) && NullChecker.m82487b(this.f139342A.picVerificationInfo)) {
            m160750e0(this.f139342A.picVerificationInfo.status);
        } else {
            bnl0.m105525M0(this.f139343v, true);
            m105675U(this.f139343v, 0, true, new x20() { // from class: l.iya0
                @Override // p153l.x20
                public final void call() {
                    this.f117532a.m160746a0();
                }
            }, this.f139346y, mo53983O().act().string(R$string.f19136bs));
        }
    }
}
