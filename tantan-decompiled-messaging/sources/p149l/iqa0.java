package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationCenterAct;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class iqa0 extends xf90 {

    /* JADX INFO: renamed from: A */
    public VerificationCenter f114451A;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f114452v;

    /* JADX INFO: renamed from: w */
    public VImage f114453w;

    /* JADX INFO: renamed from: x */
    public VImage f114454x;

    /* JADX INFO: renamed from: y */
    public VText f114455y;

    /* JADX INFO: renamed from: z */
    public cwa0 f114456z;

    public iqa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f114456z = new cwa0();
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return (a1m) this.f108534c;
    }

    @Override // p149l.xf90
    /* JADX INFO: renamed from: S */
    public boolean mo102271S() {
        User userMo51069K2 = mo52800O().mo51069K2();
        User userMo52295me = mo52800O().mo52295me();
        this.f114451A = CoreModule.f17545c.f19552B0.m31612k4();
        if (mo52800O().mo51075P1()) {
            return (NullChecker.m81303a(this.f114451A) && NullChecker.m81304b(this.f114451A.picVerificationInfo) && TEnum.equals(this.f114451A.picVerificationInfo.status, "verified")) ? false : true;
        }
        return userMo51069K2.isPicVerificationVerified() && !userMo52295me.isPicVerificationVerified();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m137723a0() {
        tvf.m190736n();
        mo52800O().startActivity(VerificationCenterAct.m55991X1(mo52800O().act(), false));
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m137724b0() {
        tvf.m190736n();
        mo52800O().startActivity(VerificationCenterAct.m55991X1(mo52800O().act(), false));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m137725c0() {
        mo52800O().startActivity(VerificationCenterAct.m55991X1(mo52800O().act(), false));
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m137726d0() {
        tvf.m190736n();
        mo52800O().startActivity(VerificationCenterAct.m55991X1(mo52800O().act(), false));
    }

    /* JADX INFO: renamed from: e0 */
    public final void m137727e0(StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            xdl0.m208344M(this.f114452v, false);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            xdl0.m208345M0(this.f114452v, true);
            m208598U(this.f114452v, 0, true, new d30() { // from class: l.gqa0
                @Override // p149l.d30
                public final void call() {
                    this.f103912a.m137725c0();
                }
            }, this.f114455y, mo52800O().act().string(R$string.f17684Dr));
            m96420Q(this.f114454x, 8);
        } else {
            String strString = TEnum.equals(studentVerificationStatus, "rejected") ? mo52800O().act().string(R$string.f17714Er) : mo52800O().act().string(R$string.f17744Fr);
            xdl0.m208345M0(this.f114452v, true);
            m208598U(this.f114452v, 0, true, new d30() { // from class: l.hqa0
                @Override // p149l.d30
                public final void call() {
                    this.f109051a.m137726d0();
                }
            }, this.f114455y, strString);
            m96420Q(this.f114454x, 0);
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        if (mo52800O().mo51053D2()) {
            return;
        }
        this.f114453w.setImageResource(x2c0.f190154ft);
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View viewM108989a = this.f114456z.m108989a(mo52800O().mo94568H2(), viewGroup);
        cwa0 cwa0Var = this.f114456z;
        this.f114452v = cwa0Var.f82764a;
        this.f114453w = cwa0Var.f82765b;
        this.f114454x = cwa0Var.f82766c;
        this.f114455y = cwa0Var.f82767d;
        return viewM108989a;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        if (!mo52800O().mo51075P1()) {
            m208598U(this.f114452v, 0, true, new d30() { // from class: l.fqa0
                @Override // p149l.d30
                public final void call() {
                    this.f98780a.m137724b0();
                }
            }, this.f114455y, mo52800O().act().string(R$string.f17774Gr));
        } else if (NullChecker.m81303a(this.f114451A) && NullChecker.m81304b(this.f114451A.picVerificationInfo)) {
            m137727e0(this.f114451A.picVerificationInfo.status);
        } else {
            xdl0.m208345M0(this.f114452v, true);
            m208598U(this.f114452v, 0, true, new d30() { // from class: l.eqa0
                @Override // p149l.d30
                public final void call() {
                    this.f92764a.m137723a0();
                }
            }, this.f114455y, mo52800O().act().string(R$string.f17744Fr));
        }
    }
}
