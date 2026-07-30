package p007l;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.momo.pipline.MomoInterface.MomoPipeline;
import java.util.List;
import l.eyx;
import l.i3m;
import l.ja4;
import l.jkg;
import l.ktf;
import l.ow3;
import l.qnl;
import l.slw;
import l.ts2;
import l.ulw;
import l.v84;
import l.vif0;
import l.vlw;
import l.w84;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class x84 extends an2 implements rnl {

    /* JADX INFO: renamed from: d */
    private qnl f5087d;

    /* JADX INFO: renamed from: e */
    int f5088e;

    public x84(@NonNull vlw vlwVar, MomoPipeline momoPipeline, @NonNull slw slwVar, int i, ts2 ts2Var) {
        this.f5088e = 0;
        this.f1879a = vlwVar;
        this.f1880b = momoPipeline;
        qnl qnlVarM11847b = xv00.m11847b(vlwVar, momoPipeline.A0(), ts2Var);
        this.f5087d = qnlVarM11847b;
        this.f1881c = qnlVarM11847b;
        this.f1880b.f0(qnlVarM11847b);
        this.f1880b.u0(this.f5087d);
        eyx.c().g(new Object[]{"CameraInputPipline", "startPreview"});
        if (this.f5087d.E1(i, slwVar)) {
            return;
        }
        this.f5088e = 0;
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: B */
    public void mo10561B(@NonNull slw slwVar) {
        if (this.f5087d == null || this.f1880b == null) {
            return;
        }
        try {
            vlw vlwVar = this.f1879a;
            if (vlwVar != null) {
                ((ulw) vlwVar).u = slwVar.j().b();
                ((ulw) this.f1879a).v = slwVar.j().a();
            }
            this.f1880b.i0(this.f1879a);
            this.f5087d.B(slwVar);
            this.f1880b.s0(this.f5087d);
        } catch (Error | Exception unused) {
        }
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: B0 */
    public void mo10562B0(slw slwVar) {
        mo10577i0(null, slwVar);
    }

    @Override // p007l.an2, p007l.btl
    /* JADX INFO: renamed from: G */
    public synchronized void mo8566G() {
        qnl qnlVar = this.f5087d;
        if (qnlVar == null) {
            return;
        }
        try {
            qnlVar.a();
            this.f1880b.Z(this.f5087d).j();
            this.f5087d = null;
            super.mo8566G();
        } catch (Error | Exception unused) {
        }
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: I */
    public void mo10563I(boolean z) {
        qnl qnlVar = this.f5087d;
        if (qnlVar != null) {
            qnlVar.I(z);
        }
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: N */
    public void mo10564N() {
        qnl qnlVar = this.f5087d;
        if (qnlVar == null) {
            return;
        }
        qnlVar.N();
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: P */
    public void mo10565P(float f) {
        qnl qnlVar = this.f5087d;
        if (qnlVar != null) {
            qnlVar.P(f);
        }
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: Q */
    public void mo10566Q(ja4.l lVar) {
        qnl qnlVar = this.f5087d;
        if (qnlVar != null) {
            qnlVar.Q(lVar);
        }
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: R */
    public void mo10567R(ow3 ow3Var) {
        qnl qnlVar = this.f5087d;
        if (qnlVar != null) {
            qnlVar.R(ow3Var);
        }
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: S */
    public void mo10568S(boolean z) {
        qnl qnlVar = this.f5087d;
        if (qnlVar != null) {
            qnlVar.S(z);
        }
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: T */
    public void mo10569T(boolean z) {
        qnl qnlVar = this.f5087d;
        if (qnlVar == null) {
            return;
        }
        try {
            qnlVar.T(z);
        } catch (Error | Exception unused) {
        }
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: Z0 */
    public void mo10570Z0(int i, int i2) {
        v84 v84Var = this.f5087d;
        if (v84Var != null) {
            v84Var.Z0(i, i2);
        }
    }

    @Override // p007l.btl
    /* JADX INFO: renamed from: a */
    public i3m mo8684a() {
        return this.f5087d;
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: b */
    public void mo10571b(int i) {
        qnl qnlVar = this.f5087d;
        if (qnlVar == null) {
            return;
        }
        qnlVar.b(i);
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: c */
    public int mo10572c() {
        qnl qnlVar = this.f5087d;
        if (qnlVar == null) {
            return 0;
        }
        return qnlVar.c();
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: d */
    public int mo10573d() {
        qnl qnlVar = this.f5087d;
        if (qnlVar == null) {
            return 0;
        }
        return qnlVar.d();
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: e */
    public boolean mo10574e() {
        qnl qnlVar = this.f5087d;
        if (qnlVar == null) {
            return false;
        }
        return qnlVar.e();
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: g */
    public int mo10575g() {
        qnl qnlVar = this.f5087d;
        if (qnlVar != null) {
            return qnlVar.g();
        }
        return -1;
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: h */
    public int mo10576h() {
        qnl qnlVar = this.f5087d;
        if (qnlVar != null) {
            return qnlVar.h();
        }
        return -1;
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: i0 */
    public void mo10577i0(Activity activity, slw slwVar) {
        qnl qnlVar = this.f5087d;
        if (qnlVar == null) {
            return;
        }
        qnlVar.E(0, slwVar);
        this.f1880b.s0(this.f5087d);
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: i1 */
    public void mo10578i1(w84 w84Var) {
        qnl qnlVar = this.f5087d;
        if (qnlVar != null) {
            qnlVar.J1(w84Var);
        }
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: j */
    public void mo10579j(ts2 ts2Var) {
        if (this.f5087d == null) {
            return;
        }
        try {
            this.f1880b.j(ts2Var);
        } catch (Error | Exception unused) {
        }
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: k */
    public void mo10580k(boolean z) {
        qnl qnlVar = this.f5087d;
        if (qnlVar == null) {
            return;
        }
        qnlVar.k(z);
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: l */
    public void mo10581l(List<String> list) {
        qnl qnlVar = this.f5087d;
        if (qnlVar != null) {
            qnlVar.l(list);
        }
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: m */
    public void mo10582m(int i) {
        qnl qnlVar = this.f5087d;
        if (qnlVar == null) {
            return;
        }
        qnlVar.m(i);
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: q */
    public void mo10583q(float f) {
        qnl qnlVar = this.f5087d;
        if (qnlVar == null) {
            return;
        }
        qnlVar.q(f);
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: r */
    public void mo10584r() {
        qnl qnlVar = this.f5087d;
        if (qnlVar != null) {
            qnlVar.r();
        }
        try {
            this.f1880b.s0(this.f5087d);
        } catch (Exception unused) {
        }
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: s */
    public void mo10585s(int i) {
        qnl qnlVar = this.f5087d;
        if (qnlVar != null) {
            qnlVar.s(i);
        }
    }

    /* JADX INFO: renamed from: s1 */
    public void m11397s1(jkg jkgVar, ktf ktfVar) {
        qnl qnlVar = this.f5087d;
        if (qnlVar != null) {
            qnlVar.s1(jkgVar, ktfVar);
        }
    }

    @Override // p007l.rnl
    public void setExposureCompensation(int i) {
        qnl qnlVar = this.f5087d;
        if (qnlVar != null) {
            qnlVar.setExposureCompensation(i);
        }
    }

    @Override // p007l.rnl
    public void setWarpType(int i) {
        qnl qnlVar = this.f5087d;
        if (qnlVar == null) {
            return;
        }
        qnlVar.setWarpType(i);
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: u */
    public void mo10586u(int i) {
        qnl qnlVar = this.f5087d;
        if (qnlVar != null) {
            qnlVar.u(i);
        }
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: v */
    public void mo10587v(float f) {
        qnl qnlVar = this.f5087d;
        if (qnlVar == null) {
            return;
        }
        qnlVar.v(f);
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: w */
    public void mo10588w(boolean z) {
        qnl qnlVar = this.f5087d;
        if (qnlVar != null) {
            qnlVar.w(z);
        }
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: x */
    public vif0 mo10589x(int i, int i2) {
        v84 v84Var = this.f5087d;
        if (v84Var != null) {
            return v84Var.x(i, i2);
        }
        return null;
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: y1 */
    public void mo10590y1(int i) {
        qnl qnlVar = this.f5087d;
        if (qnlVar != null) {
            qnlVar.Z(i);
        }
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: z */
    public void mo10591z() {
        qnl qnlVar = this.f5087d;
        if (qnlVar == null) {
            return;
        }
        qnlVar.z();
    }

    @Override // p007l.rnl
    /* JADX INFO: renamed from: z1 */
    public w84 mo10592z1() {
        qnl qnlVar = this.f5087d;
        if (qnlVar != null) {
            return qnlVar.a1();
        }
        return null;
    }
}
