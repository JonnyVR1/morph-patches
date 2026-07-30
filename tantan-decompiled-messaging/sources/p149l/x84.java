package p149l;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.momo.pipline.MomoInterface.MomoPipeline;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class x84 extends an2 implements rnl {

    /* JADX INFO: renamed from: d */
    private qnl f191437d;

    /* JADX INFO: renamed from: e */
    int f191438e;

    public x84(@NonNull vlw vlwVar, MomoPipeline momoPipeline, @NonNull slw slwVar, int i, ts2 ts2Var) {
        this.f191438e = 0;
        this.f70698a = vlwVar;
        this.f70699b = momoPipeline;
        qnl qnlVarM211239b = xv00.m211239b(vlwVar, momoPipeline.mo19674A0(), ts2Var);
        this.f191437d = qnlVarM211239b;
        this.f70700c = qnlVarM211239b;
        this.f70699b.mo19698f0(qnlVarM211239b);
        this.f70699b.mo19719u0(this.f191437d);
        eyx.m118802c().m118808g("CameraInputPipline", "startPreview");
        if (this.f191437d.mo140641E1(i, slwVar)) {
            return;
        }
        this.f191438e = 0;
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: B */
    public void mo180072B(@NonNull slw slwVar) {
        if (this.f191437d == null || this.f70699b == null) {
            return;
        }
        try {
            vlw vlwVar = this.f70698a;
            if (vlwVar != null) {
                vlwVar.f177168u = slwVar.m184881j().m198562b();
                this.f70698a.f177169v = slwVar.m184881j().m198561a();
            }
            this.f70699b.mo19702i0(this.f70698a);
            this.f191437d.mo140639B(slwVar);
            this.f70699b.mo19716s0(this.f191437d);
        } catch (Error | Exception unused) {
        }
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: B0 */
    public void mo180073B0(slw slwVar) {
        mo180088i0(null, slwVar);
    }

    @Override // p149l.an2, p149l.btl
    /* JADX INFO: renamed from: G */
    public synchronized void mo97705G() {
        qnl qnlVar = this.f191437d;
        if (qnlVar == null) {
            return;
        }
        try {
            qnlVar.mo140654a();
            this.f70699b.mo19691Z(this.f191437d).m216276j();
            this.f191437d = null;
            super.mo97705G();
        } catch (Error | Exception unused) {
        }
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: I */
    public void mo180074I(boolean z) {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            qnlVar.mo140643I(z);
        }
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: N */
    public void mo180075N() {
        qnl qnlVar = this.f191437d;
        if (qnlVar == null) {
            return;
        }
        qnlVar.mo140647N();
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: P */
    public void mo180076P(float f) {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            qnlVar.mo175684P(f);
        }
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: Q */
    public void mo180077Q(ja4.InterfaceC17734l interfaceC17734l) {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            qnlVar.mo140648Q(interfaceC17734l);
        }
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: R */
    public void mo180078R(ow3 ow3Var) {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            qnlVar.mo140649R(ow3Var);
        }
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: S */
    public void mo180079S(boolean z) {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            qnlVar.mo140650S(z);
        }
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: T */
    public void mo180080T(boolean z) {
        qnl qnlVar = this.f191437d;
        if (qnlVar == null) {
            return;
        }
        try {
            qnlVar.mo140651T(z);
        } catch (Error | Exception unused) {
        }
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: Z0 */
    public void mo180081Z0(int i, int i2) {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            ((v84) qnlVar).m197391Z0(i, i2);
        }
    }

    @Override // p149l.btl
    /* JADX INFO: renamed from: a */
    public i3m mo103860a() {
        return this.f191437d;
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: b */
    public void mo180082b(int i) {
        qnl qnlVar = this.f191437d;
        if (qnlVar == null) {
            return;
        }
        qnlVar.mo140656b(i);
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: c */
    public int mo180083c() {
        qnl qnlVar = this.f191437d;
        if (qnlVar == null) {
            return 0;
        }
        return qnlVar.mo140657c();
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: d */
    public int mo180084d() {
        qnl qnlVar = this.f191437d;
        if (qnlVar == null) {
            return 0;
        }
        return qnlVar.mo140658d();
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: e */
    public boolean mo180085e() {
        qnl qnlVar = this.f191437d;
        if (qnlVar == null) {
            return false;
        }
        return qnlVar.mo140659e();
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: g */
    public int mo180086g() {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            return qnlVar.mo140660g();
        }
        return -1;
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: h */
    public int mo180087h() {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            return qnlVar.mo140661h();
        }
        return -1;
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: i0 */
    public void mo180088i0(Activity activity, slw slwVar) {
        qnl qnlVar = this.f191437d;
        if (qnlVar == null) {
            return;
        }
        qnlVar.mo140640E(0, slwVar);
        this.f70699b.mo19716s0(this.f191437d);
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: i1 */
    public void mo180089i1(w84 w84Var) {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            qnlVar.mo140645J1(w84Var);
        }
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: j */
    public void mo180090j(ts2 ts2Var) {
        if (this.f191437d == null) {
            return;
        }
        try {
            this.f70699b.mo19703j(ts2Var);
        } catch (Error | Exception unused) {
        }
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: k */
    public void mo180091k(boolean z) {
        qnl qnlVar = this.f191437d;
        if (qnlVar == null) {
            return;
        }
        qnlVar.mo140662k(z);
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: l */
    public void mo180092l(List<String> list) {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            qnlVar.mo140663l(list);
        }
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: m */
    public void mo180093m(int i) {
        qnl qnlVar = this.f191437d;
        if (qnlVar == null) {
            return;
        }
        qnlVar.mo140664m(i);
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: q */
    public void mo180094q(float f) {
        qnl qnlVar = this.f191437d;
        if (qnlVar == null) {
            return;
        }
        qnlVar.mo140666q(f);
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: r */
    public void mo180095r() {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            qnlVar.mo140668r();
        }
        try {
            this.f70699b.mo19716s0(this.f191437d);
        } catch (Exception unused) {
        }
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: s */
    public void mo180096s(int i) {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            qnlVar.mo140669s(i);
        }
    }

    @Override // p149l.vql
    /* JADX INFO: renamed from: s1 */
    public void mo140670s1(jkg jkgVar, ktf ktfVar) {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            qnlVar.mo140670s1(jkgVar, ktfVar);
        }
    }

    @Override // p149l.rnl
    public void setExposureCompensation(int i) {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            qnlVar.setExposureCompensation(i);
        }
    }

    @Override // p149l.rnl
    public void setWarpType(int i) {
        qnl qnlVar = this.f191437d;
        if (qnlVar == null) {
            return;
        }
        qnlVar.setWarpType(i);
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: u */
    public void mo180097u(int i) {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            qnlVar.mo140671u(i);
        }
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: v */
    public void mo180098v(float f) {
        qnl qnlVar = this.f191437d;
        if (qnlVar == null) {
            return;
        }
        qnlVar.mo140672v(f);
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: w */
    public void mo180099w(boolean z) {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            qnlVar.mo140674w(z);
        }
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: x */
    public vif0 mo180100x(int i, int i2) {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            return ((v84) qnlVar).m197392x(i, i2);
        }
        return null;
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: y1 */
    public void mo180101y1(int i) {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            qnlVar.mo140653Z(i);
        }
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: z */
    public void mo180102z() {
        qnl qnlVar = this.f191437d;
        if (qnlVar == null) {
            return;
        }
        qnlVar.mo140676z();
    }

    @Override // p149l.rnl
    /* JADX INFO: renamed from: z1 */
    public w84 mo180103z1() {
        qnl qnlVar = this.f191437d;
        if (qnlVar != null) {
            return qnlVar.mo140655a1();
        }
        return null;
    }
}
