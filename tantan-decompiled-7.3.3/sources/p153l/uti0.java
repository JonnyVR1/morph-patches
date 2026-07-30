package p153l;

import androidx.annotation.NonNull;
import com.momo.pipline.MomoInterface.MomoPipeline;

/* JADX INFO: loaded from: classes8.dex */
public class uti0 extends hn2 implements pvl {

    /* JADX INFO: renamed from: d */
    sti0 f180972d;

    /* JADX INFO: renamed from: e */
    long f180973e;

    public uti0(@NonNull MomoPipeline momoPipeline, uow uowVar, sti0 sti0Var, long j) {
        this.f110691b = momoPipeline;
        this.f180972d = sti0Var;
        this.f180973e = j;
        sti0Var.setFps(uowVar.f180159D0);
        this.f110691b.mo20697f0(this.f180972d);
        this.f110691b.mo20718u0(this.f180972d);
        this.f180972d.start();
    }

    @Override // p153l.hn2, p153l.pvl
    /* JADX INFO: renamed from: G */
    public void mo109166G() {
        g510 g510VarMo20690Z = (this.f110691b == null || mo109167a() == null) ? null : this.f110691b.mo20690Z(mo109167a());
        if (g510VarMo20690Z != null) {
            g510VarMo20690Z.m128991j();
        }
        super.mo109166G();
        sti0 sti0Var = this.f180972d;
        if (sti0Var != null) {
            sti0Var.stop();
        }
    }

    @Override // p153l.pvl
    /* JADX INFO: renamed from: a */
    public z5m mo109167a() {
        return this.f180972d;
    }
}
