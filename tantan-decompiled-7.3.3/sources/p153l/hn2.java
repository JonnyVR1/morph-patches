package p153l;

import com.momo.pipline.MomoInterface.MomoPipeline;

/* JADX INFO: loaded from: classes8.dex */
public abstract class hn2 implements pvl {

    /* JADX INFO: renamed from: a */
    protected uow f110690a;

    /* JADX INFO: renamed from: b */
    protected MomoPipeline f110691b;

    /* JADX INFO: renamed from: c */
    protected z5m f110692c;

    @Override // p153l.pvl
    /* JADX INFO: renamed from: A */
    public void mo136013A(Object obj) {
        MomoPipeline momoPipeline = this.f110691b;
        if (momoPipeline != null) {
            momoPipeline.mo20672A(obj);
        }
    }

    @Override // p153l.pvl
    /* JADX INFO: renamed from: C */
    public void mo136014C(Object obj) {
        MomoPipeline momoPipeline = this.f110691b;
        if (momoPipeline != null) {
            momoPipeline.mo20675C(obj);
        }
    }

    @Override // p153l.pvl
    /* JADX INFO: renamed from: G */
    public void mo109166G() {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat("stopRenderer"));
        this.f110692c = null;
        this.f110690a = null;
        this.f110691b = null;
    }

    @Override // p153l.pvl
    /* JADX INFO: renamed from: J */
    public void mo136015J(Object obj) {
        MomoPipeline momoPipeline = this.f110691b;
        if (momoPipeline != null) {
            momoPipeline.mo20683J(obj);
        }
    }

    @Override // p153l.pvl
    /* JADX INFO: renamed from: K */
    public void mo136016K() {
        MomoPipeline momoPipeline = this.f110691b;
        if (momoPipeline != null) {
            momoPipeline.mo20684K();
        }
    }

    @Override // p153l.pvl
    /* JADX INFO: renamed from: i */
    public synchronized void mo136017i(Object obj) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat("startRenderer"));
        MomoPipeline momoPipeline = this.f110691b;
        if (momoPipeline != null) {
            momoPipeline.mo20713q0(this.f110692c, obj, momoPipeline.mo20719v0() > 0);
            this.f110691b.mo20721x0(obj);
        }
    }
}
