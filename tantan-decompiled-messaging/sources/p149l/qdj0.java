package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes7.dex */
public abstract class qdj0 extends odj0 {

    /* JADX INFO: renamed from: G */
    protected float f153936G;

    /* JADX INFO: renamed from: H */
    protected float f153937H;

    /* JADX INFO: renamed from: I */
    private int f153938I;

    /* JADX INFO: renamed from: J */
    private int f153939J;

    @Override // p149l.lcj, p149l.bcj
    /* JADX INFO: renamed from: t */
    public void mo101086t() {
        super.mo101086t();
        this.f153936G = 1.0f / m101085s();
        this.f153937H = 1.0f / m101084q();
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: u */
    public void mo95688u() {
        super.mo95688u();
        this.f153938I = GLES20.glGetUniformLocation(this.f74924d, "texelWidthOffset");
        this.f153939J = GLES20.glGetUniformLocation(this.f74924d, "texelHeightOffset");
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: x */
    public void mo101089x() {
        if (m163668Q() == 1) {
            this.f153936G = 1.0f / m101085s();
            this.f153937H = 0.0f;
        } else {
            this.f153936G = 0.0f;
            this.f153937H = 1.0f / m101084q();
        }
        super.mo101089x();
        GLES20.glUniform1f(this.f153938I, this.f153936G);
        GLES20.glUniform1f(this.f153939J, this.f153937H);
    }
}
