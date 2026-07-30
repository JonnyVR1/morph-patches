package p149l;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: classes7.dex */
public class r2h0 extends yhm {

    /* JADX INFO: renamed from: o */
    hbe f157413o;

    /* JADX INFO: renamed from: p */
    private float[] f157414p;

    /* JADX INFO: renamed from: q */
    int f157415q;

    /* JADX INFO: renamed from: r */
    int f157416r;

    /* JADX INFO: renamed from: s */
    SurfaceTexture f157417s;

    /* JADX INFO: renamed from: t */
    tif0 f157418t;

    @Override // p149l.yhm
    /* JADX INFO: renamed from: f */
    public void mo177602f() {
        tif0 tif0Var;
        if (this.f157413o == null) {
            this.f157413o = new hbe();
        }
        int i = this.f157415q;
        if (i != 0) {
            this.f157413o.m130326O(360 - i);
        }
        hbe hbeVar = this.f157413o;
        if (hbeVar != null && (tif0Var = this.f157418t) != null) {
            hbeVar.mo110713z(tif0Var.m189184b(), this.f157418t.m189183a());
        }
        m214836o(this.f157413o);
    }

    @Override // p149l.yhm
    /* JADX INFO: renamed from: i */
    public void mo177603i() {
        super.mo177603i();
        hbe hbeVar = this.f157413o;
        if (hbeVar != null) {
            hbeVar.mo102038f();
            this.f157413o = null;
        }
        this.f157414p = null;
    }

    @Override // p149l.yhm
    /* JADX INFO: renamed from: j */
    public void mo177604j() {
        hbe hbeVar = this.f157413o;
        if (hbeVar != null) {
            hbeVar.m130327P(this.f157416r);
            if (this.f157414p == null) {
                this.f157414p = new float[16];
            }
            this.f157417s.getTransformMatrix(this.f157414p);
            this.f157413o.m130328Q(this.f157414p);
        }
        super.mo177604j();
    }

    @Override // p149l.yhm
    /* JADX INFO: renamed from: n */
    public void mo177605n(tif0 tif0Var) {
        super.mo177605n(tif0Var);
        this.f157418t = tif0Var;
        hbe hbeVar = this.f157413o;
        if (hbeVar != null) {
            hbeVar.mo110713z(tif0Var.m189184b(), tif0Var.m189183a());
        }
    }

    /* JADX INFO: renamed from: t */
    public void m177606t(int i) {
        this.f157415q = i;
        hbe hbeVar = this.f157413o;
        if (hbeVar != null) {
            hbeVar.m130326O(360 - i);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m177607u(SurfaceTexture surfaceTexture, int i) {
        this.f157417s = surfaceTexture;
        this.f157416r = i;
    }
}
