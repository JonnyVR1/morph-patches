package p149l;

import com.momo.pipline.MomoInterface.MomoPipeline;

/* JADX INFO: loaded from: classes8.dex */
public abstract class an2 implements btl {

    /* JADX INFO: renamed from: a */
    protected vlw f70698a;

    /* JADX INFO: renamed from: b */
    protected MomoPipeline f70699b;

    /* JADX INFO: renamed from: c */
    protected i3m f70700c;

    @Override // p149l.btl
    /* JADX INFO: renamed from: A */
    public void mo97703A(Object obj) {
        MomoPipeline momoPipeline = this.f70699b;
        if (momoPipeline != null) {
            momoPipeline.mo19673A(obj);
        }
    }

    @Override // p149l.btl
    /* JADX INFO: renamed from: C */
    public void mo97704C(Object obj) {
        MomoPipeline momoPipeline = this.f70699b;
        if (momoPipeline != null) {
            momoPipeline.mo19676C(obj);
        }
    }

    @Override // p149l.btl
    /* JADX INFO: renamed from: G */
    public void mo97705G() {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat("stopRenderer"));
        this.f70700c = null;
        this.f70698a = null;
        this.f70699b = null;
    }

    @Override // p149l.btl
    /* JADX INFO: renamed from: J */
    public void mo97706J(Object obj) {
        MomoPipeline momoPipeline = this.f70699b;
        if (momoPipeline != null) {
            momoPipeline.mo19684J(obj);
        }
    }

    @Override // p149l.btl
    /* JADX INFO: renamed from: K */
    public void mo97707K() {
        MomoPipeline momoPipeline = this.f70699b;
        if (momoPipeline != null) {
            momoPipeline.mo19685K();
        }
    }

    @Override // p149l.btl
    /* JADX INFO: renamed from: i */
    public synchronized void mo97708i(Object obj) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat("startRenderer"));
        MomoPipeline momoPipeline = this.f70699b;
        if (momoPipeline != null) {
            momoPipeline.mo19714q0(this.f70700c, obj, momoPipeline.mo19720v0() > 0);
            this.f70699b.mo19722x0(obj);
        }
    }
}
