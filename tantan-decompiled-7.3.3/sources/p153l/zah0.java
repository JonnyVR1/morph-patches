package p153l;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: classes7.dex */
public class zah0 extends bkm {

    /* JADX INFO: renamed from: o */
    lce f203565o;

    /* JADX INFO: renamed from: p */
    private float[] f203566p;

    /* JADX INFO: renamed from: q */
    int f203567q;

    /* JADX INFO: renamed from: r */
    int f203568r;

    /* JADX INFO: renamed from: s */
    SurfaceTexture f203569s;

    /* JADX INFO: renamed from: t */
    crf0 f203570t;

    @Override // p153l.bkm
    /* JADX INFO: renamed from: f */
    public void mo104824f() {
        crf0 crf0Var;
        if (this.f203565o == null) {
            this.f203565o = new lce();
        }
        int i = this.f203567q;
        if (i != 0) {
            this.f203565o.m153679O(360 - i);
        }
        lce lceVar = this.f203565o;
        if (lceVar != null && (crf0Var = this.f203570t) != null) {
            lceVar.mo172261z(crf0Var.m112050b(), this.f203570t.m112049a());
        }
        m104833o(this.f203565o);
    }

    @Override // p153l.bkm
    /* JADX INFO: renamed from: i */
    public void mo104827i() {
        super.mo104827i();
        lce lceVar = this.f203565o;
        if (lceVar != null) {
            lceVar.mo96080f();
            this.f203565o = null;
        }
        this.f203566p = null;
    }

    @Override // p153l.bkm
    /* JADX INFO: renamed from: j */
    public void mo104828j() {
        lce lceVar = this.f203565o;
        if (lceVar != null) {
            lceVar.m153680P(this.f203568r);
            if (this.f203566p == null) {
                this.f203566p = new float[16];
            }
            this.f203569s.getTransformMatrix(this.f203566p);
            this.f203565o.m153681Q(this.f203566p);
        }
        super.mo104828j();
    }

    @Override // p153l.bkm
    /* JADX INFO: renamed from: n */
    public void mo104832n(crf0 crf0Var) {
        super.mo104832n(crf0Var);
        this.f203570t = crf0Var;
        lce lceVar = this.f203565o;
        if (lceVar != null) {
            lceVar.mo172261z(crf0Var.m112050b(), crf0Var.m112049a());
        }
    }

    /* JADX INFO: renamed from: t */
    public void m219124t(int i) {
        this.f203567q = i;
        lce lceVar = this.f203565o;
        if (lceVar != null) {
            lceVar.m153679O(360 - i);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m219125u(SurfaceTexture surfaceTexture, int i) {
        this.f203569s = surfaceTexture;
        this.f203568r = i;
    }
}
