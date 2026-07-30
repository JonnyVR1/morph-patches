package p007l;

import com.momo.pipline.MomoInterface.MomoPipeline;
import l.sml;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class bb1 implements tml {

    /* JADX INFO: renamed from: a */
    private MomoPipeline f2295a;

    /* JADX INFO: renamed from: b */
    private sml f2296b;

    public bb1(MomoPipeline momoPipeline) {
        this.f2295a = momoPipeline;
    }

    @Override // p007l.tml
    /* JADX INFO: renamed from: a */
    public void mo8614a() {
        sml smlVar = this.f2296b;
        if (smlVar != null) {
            MomoPipeline momoPipeline = this.f2295a;
            if (momoPipeline != null) {
                momoPipeline.C0(smlVar);
            }
            this.f2296b.I1();
        }
    }

    @Override // p007l.tml
    /* JADX INFO: renamed from: b */
    public sml mo8615b() {
        return this.f2296b;
    }

    @Override // p007l.tml
    /* JADX INFO: renamed from: c */
    public void mo8616c(sml smlVar) {
        this.f2296b = smlVar;
    }

    @Override // p007l.tml
    public void stopAudio() {
        if (this.f2296b != null) {
            MomoPipeline momoPipeline = this.f2295a;
            if (momoPipeline != null) {
                momoPipeline.C0((sml) null);
            }
            this.f2296b.X();
        }
    }
}
