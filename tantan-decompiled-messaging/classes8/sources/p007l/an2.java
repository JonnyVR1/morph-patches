package p007l;

import com.momo.pipline.MomoInterface.MomoPipeline;
import l.i3m;
import l.ii70;
import l.vlw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public abstract class an2 implements btl {

    /* JADX INFO: renamed from: a */
    protected vlw f1879a;

    /* JADX INFO: renamed from: b */
    protected MomoPipeline f1880b;

    /* JADX INFO: renamed from: c */
    protected i3m f1881c;

    @Override // p007l.btl
    /* JADX INFO: renamed from: A */
    public void mo8564A(Object obj) {
        MomoPipeline momoPipeline = this.f1880b;
        if (momoPipeline != null) {
            momoPipeline.A(obj);
        }
    }

    @Override // p007l.btl
    /* JADX INFO: renamed from: C */
    public void mo8565C(Object obj) {
        MomoPipeline momoPipeline = this.f1880b;
        if (momoPipeline != null) {
            momoPipeline.C(obj);
        }
    }

    @Override // p007l.btl
    /* JADX INFO: renamed from: G */
    public void mo8566G() {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat("stopRenderer"));
        this.f1881c = null;
        this.f1879a = null;
        this.f1880b = null;
    }

    @Override // p007l.btl
    /* JADX INFO: renamed from: J */
    public void mo8567J(Object obj) {
        MomoPipeline momoPipeline = this.f1880b;
        if (momoPipeline != null) {
            momoPipeline.J(obj);
        }
    }

    @Override // p007l.btl
    /* JADX INFO: renamed from: K */
    public void mo8568K() {
        MomoPipeline momoPipeline = this.f1880b;
        if (momoPipeline != null) {
            momoPipeline.K();
        }
    }

    @Override // p007l.btl
    /* JADX INFO: renamed from: i */
    public synchronized void mo8569i(Object obj) {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat("startRenderer"));
        MomoPipeline momoPipeline = this.f1880b;
        if (momoPipeline != null) {
            momoPipeline.q0(this.f1881c, obj, momoPipeline.v0() > 0);
            this.f1880b.x0(obj);
        }
    }
}
