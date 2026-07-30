package p153l;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.momo.pipline.MomoInterface.MomoPipeline;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class w94 extends hn2 implements cql {

    /* JADX INFO: renamed from: d */
    private bql f187974d;

    /* JADX INFO: renamed from: e */
    int f187975e;

    public w94(@NonNull uow uowVar, MomoPipeline momoPipeline, @NonNull row rowVar, int i, jt2 jt2Var) {
        this.f187975e = 0;
        this.f110690a = uowVar;
        this.f110691b = momoPipeline;
        bql bqlVarM123867b = f410.m123867b(uowVar, momoPipeline.mo20673A0(), jt2Var);
        this.f187974d = bqlVarM123867b;
        this.f110692c = bqlVarM123867b;
        this.f110691b.mo20697f0(bqlVarM123867b);
        this.f110691b.mo20718u0(this.f187974d);
        b7y.m102882c().m102888g("CameraInputPipline", "startPreview");
        if (this.f187974d.mo99492E1(i, rowVar)) {
            return;
        }
        this.f187975e = 0;
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: B */
    public void mo111928B(@NonNull row rowVar) {
        if (this.f187974d == null || this.f110691b == null) {
            return;
        }
        try {
            uow uowVar = this.f110690a;
            if (uowVar != null) {
                uowVar.f175510u = rowVar.m182472j().m122180b();
                this.f110690a.f175511v = rowVar.m182472j().m122179a();
            }
            this.f110691b.mo20701i0(this.f110690a);
            this.f187974d.mo99490B(rowVar);
            this.f110691b.mo20715s0(this.f187974d);
        } catch (Error | Exception unused) {
        }
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: B0 */
    public void mo111929B0(row rowVar) {
        mo111944i0(null, rowVar);
    }

    @Override // p153l.hn2, p153l.pvl
    /* JADX INFO: renamed from: G */
    public synchronized void mo109166G() {
        bql bqlVar = this.f187974d;
        if (bqlVar == null) {
            return;
        }
        try {
            bqlVar.mo99502a();
            this.f110691b.mo20690Z(this.f187974d).m128991j();
            this.f187974d = null;
            super.mo109166G();
        } catch (Error | Exception unused) {
        }
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: I */
    public void mo111930I(boolean z) {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            bqlVar.mo99493I(z);
        }
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: N */
    public void mo111931N() {
        bql bqlVar = this.f187974d;
        if (bqlVar == null) {
            return;
        }
        bqlVar.mo99496N();
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: P */
    public void mo111932P(float f) {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            bqlVar.mo105948P(f);
        }
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: Q */
    public void mo111933Q(ib4.InterfaceC17689l interfaceC17689l) {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            bqlVar.mo99497Q(interfaceC17689l);
        }
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: R */
    public void mo111934R(nx3 nx3Var) {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            bqlVar.mo99498R(nx3Var);
        }
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: S */
    public void mo111935S(boolean z) {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            bqlVar.mo99499S(z);
        }
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: T */
    public void mo111936T(boolean z) {
        bql bqlVar = this.f187974d;
        if (bqlVar == null) {
            return;
        }
        try {
            bqlVar.mo99500T(z);
        } catch (Error | Exception unused) {
        }
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: Z0 */
    public void mo111937Z0(int i, int i2) {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            ((u94) bqlVar).m195083Z0(i, i2);
        }
    }

    @Override // p153l.pvl
    /* JADX INFO: renamed from: a */
    public z5m mo109167a() {
        return this.f187974d;
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: b */
    public void mo111938b(int i) {
        bql bqlVar = this.f187974d;
        if (bqlVar == null) {
            return;
        }
        bqlVar.mo99504b(i);
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: c */
    public int mo111939c() {
        bql bqlVar = this.f187974d;
        if (bqlVar == null) {
            return 0;
        }
        return bqlVar.mo99505c();
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: d */
    public int mo111940d() {
        bql bqlVar = this.f187974d;
        if (bqlVar == null) {
            return 0;
        }
        return bqlVar.mo99506d();
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: e */
    public boolean mo111941e() {
        bql bqlVar = this.f187974d;
        if (bqlVar == null) {
            return false;
        }
        return bqlVar.mo99507e();
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: g */
    public int mo111942g() {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            return bqlVar.mo99508g();
        }
        return -1;
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: h */
    public int mo111943h() {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            return bqlVar.mo99509h();
        }
        return -1;
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: i0 */
    public void mo111944i0(Activity activity, row rowVar) {
        bql bqlVar = this.f187974d;
        if (bqlVar == null) {
            return;
        }
        bqlVar.mo99491E(0, rowVar);
        this.f110691b.mo20715s0(this.f187974d);
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: i1 */
    public void mo111945i1(v94 v94Var) {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            bqlVar.mo99494J1(v94Var);
        }
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: j */
    public void mo111946j(jt2 jt2Var) {
        if (this.f187974d == null) {
            return;
        }
        try {
            this.f110691b.mo20702j(jt2Var);
        } catch (Error | Exception unused) {
        }
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: k */
    public void mo111947k(boolean z) {
        bql bqlVar = this.f187974d;
        if (bqlVar == null) {
            return;
        }
        bqlVar.mo99510k(z);
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: l */
    public void mo111948l(List<String> list) {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            bqlVar.mo99511l(list);
        }
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: m */
    public void mo111949m(int i) {
        bql bqlVar = this.f187974d;
        if (bqlVar == null) {
            return;
        }
        bqlVar.mo99512m(i);
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: q */
    public void mo111950q(float f) {
        bql bqlVar = this.f187974d;
        if (bqlVar == null) {
            return;
        }
        bqlVar.mo99513q(f);
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: r */
    public void mo111951r() {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            bqlVar.mo99514r();
        }
        try {
            this.f110691b.mo20715s0(this.f187974d);
        } catch (Exception unused) {
        }
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: s */
    public void mo111952s(int i) {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            bqlVar.mo99515s(i);
        }
    }

    @Override // p153l.itl
    /* JADX INFO: renamed from: s1 */
    public void mo139270s1(ylg ylgVar, yuf yufVar) {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            bqlVar.mo139270s1(ylgVar, yufVar);
        }
    }

    @Override // p153l.cql
    public void setExposureCompensation(int i) {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            bqlVar.setExposureCompensation(i);
        }
    }

    @Override // p153l.cql
    public void setWarpType(int i) {
        bql bqlVar = this.f187974d;
        if (bqlVar == null) {
            return;
        }
        bqlVar.setWarpType(i);
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: u */
    public void mo111953u(int i) {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            bqlVar.mo99516u(i);
        }
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: v */
    public void mo111954v(float f) {
        bql bqlVar = this.f187974d;
        if (bqlVar == null) {
            return;
        }
        bqlVar.mo99517v(f);
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: w */
    public void mo111955w(boolean z) {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            bqlVar.mo99518w(z);
        }
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: x */
    public erf0 mo111956x(int i, int i2) {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            return ((u94) bqlVar).m195084x(i, i2);
        }
        return null;
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: y1 */
    public void mo111957y1(int i) {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            bqlVar.mo99501Z(i);
        }
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: z */
    public void mo111958z() {
        bql bqlVar = this.f187974d;
        if (bqlVar == null) {
            return;
        }
        bqlVar.mo99519z();
    }

    @Override // p153l.cql
    /* JADX INFO: renamed from: z1 */
    public v94 mo111959z1() {
        bql bqlVar = this.f187974d;
        if (bqlVar != null) {
            return bqlVar.mo99503a1();
        }
        return null;
    }
}
