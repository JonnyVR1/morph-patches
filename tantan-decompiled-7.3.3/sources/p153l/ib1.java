package p153l;

import com.momo.pipline.MomoInterface.MomoPipeline;

/* JADX INFO: loaded from: classes8.dex */
public class ib1 implements epl {

    /* JADX INFO: renamed from: a */
    private MomoPipeline f113643a;

    /* JADX INFO: renamed from: b */
    private dpl f113644b;

    public ib1(MomoPipeline momoPipeline) {
        this.f113643a = momoPipeline;
    }

    @Override // p153l.epl
    /* JADX INFO: renamed from: a */
    public void mo121862a() {
        dpl dplVar = this.f113644b;
        if (dplVar != null) {
            MomoPipeline momoPipeline = this.f113643a;
            if (momoPipeline != null) {
                momoPipeline.mo20676C0(dplVar);
            }
            this.f113644b.mo20934I1();
        }
    }

    @Override // p153l.epl
    /* JADX INFO: renamed from: b */
    public dpl mo121863b() {
        return this.f113644b;
    }

    @Override // p153l.epl
    /* JADX INFO: renamed from: c */
    public void mo121864c(dpl dplVar) {
        this.f113644b = dplVar;
    }

    @Override // p153l.epl
    public void stopAudio() {
        if (this.f113644b != null) {
            MomoPipeline momoPipeline = this.f113643a;
            if (momoPipeline != null) {
                momoPipeline.mo20676C0(null);
            }
            this.f113644b.mo20986X();
        }
    }
}
