package p149l;

import com.momo.pipline.MomoInterface.MomoPipeline;

/* JADX INFO: loaded from: classes8.dex */
public class bb1 implements tml {

    /* JADX INFO: renamed from: a */
    private MomoPipeline f74754a;

    /* JADX INFO: renamed from: b */
    private sml f74755b;

    public bb1(MomoPipeline momoPipeline) {
        this.f74754a = momoPipeline;
    }

    @Override // p149l.tml
    /* JADX INFO: renamed from: a */
    public void mo100937a() {
        sml smlVar = this.f74755b;
        if (smlVar != null) {
            MomoPipeline momoPipeline = this.f74754a;
            if (momoPipeline != null) {
                momoPipeline.mo19677C0(smlVar);
            }
            this.f74755b.mo19935I1();
        }
    }

    @Override // p149l.tml
    /* JADX INFO: renamed from: b */
    public sml mo100938b() {
        return this.f74755b;
    }

    @Override // p149l.tml
    /* JADX INFO: renamed from: c */
    public void mo100939c(sml smlVar) {
        this.f74755b = smlVar;
    }

    @Override // p149l.tml
    public void stopAudio() {
        if (this.f74755b != null) {
            MomoPipeline momoPipeline = this.f74754a;
            if (momoPipeline != null) {
                momoPipeline.mo19677C0(null);
            }
            this.f74755b.mo19987X();
        }
    }
}
