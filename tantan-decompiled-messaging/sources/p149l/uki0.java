package p149l;

import androidx.annotation.NonNull;
import com.momo.pipline.MomoInterface.MomoPipeline;

/* JADX INFO: loaded from: classes8.dex */
public class uki0 extends an2 implements btl {

    /* JADX INFO: renamed from: d */
    ski0 f176930d;

    /* JADX INFO: renamed from: e */
    long f176931e;

    public uki0(@NonNull MomoPipeline momoPipeline, vlw vlwVar, ski0 ski0Var, long j) {
        this.f70699b = momoPipeline;
        this.f176930d = ski0Var;
        this.f176931e = j;
        ski0Var.setFps(vlwVar.f182015D0);
        this.f70699b.mo19698f0(this.f176930d);
        this.f70699b.mo19719u0(this.f176930d);
        this.f176930d.start();
    }

    @Override // p149l.an2, p149l.btl
    /* JADX INFO: renamed from: G */
    public void mo97705G() {
        yw00 yw00VarMo19691Z = (this.f70699b == null || mo103860a() == null) ? null : this.f70699b.mo19691Z(mo103860a());
        if (yw00VarMo19691Z != null) {
            yw00VarMo19691Z.m216276j();
        }
        super.mo97705G();
        ski0 ski0Var = this.f176930d;
        if (ski0Var != null) {
            ski0Var.stop();
        }
    }

    @Override // p149l.btl
    /* JADX INFO: renamed from: a */
    public i3m mo103860a() {
        return this.f176930d;
    }
}
