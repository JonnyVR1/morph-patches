package p007l;

import androidx.annotation.NonNull;
import com.momo.pipline.MomoInterface.MomoPipeline;
import l.i3m;
import l.vlw;
import l.yw00;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class uki0 extends an2 implements btl {

    /* JADX INFO: renamed from: d */
    ski0 f4912d;

    /* JADX INFO: renamed from: e */
    long f4913e;

    public uki0(@NonNull MomoPipeline momoPipeline, vlw vlwVar, ski0 ski0Var, long j) {
        this.f1880b = momoPipeline;
        this.f4912d = ski0Var;
        this.f4913e = j;
        ski0Var.setFps(vlwVar.D0);
        this.f1880b.f0(this.f4912d);
        this.f1880b.u0(this.f4912d);
        this.f4912d.start();
    }

    @Override // p007l.an2, p007l.btl
    /* JADX INFO: renamed from: G */
    public void mo8566G() {
        yw00 yw00VarZ = (this.f1880b == null || mo8684a() == null) ? null : this.f1880b.Z(mo8684a());
        if (yw00VarZ != null) {
            yw00VarZ.j();
        }
        super.mo8566G();
        ski0 ski0Var = this.f4912d;
        if (ski0Var != null) {
            ski0Var.stop();
        }
    }

    @Override // p007l.btl
    /* JADX INFO: renamed from: a */
    public i3m mo8684a() {
        return this.f4912d;
    }
}
