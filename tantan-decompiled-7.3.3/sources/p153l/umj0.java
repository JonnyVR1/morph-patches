package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes7.dex */
public abstract class umj0 extends smj0 {

    /* JADX INFO: renamed from: G */
    protected float f179651G;

    /* JADX INFO: renamed from: H */
    protected float f179652H;

    /* JADX INFO: renamed from: I */
    private int f179653I;

    /* JADX INFO: renamed from: J */
    private int f179654J;

    @Override // p153l.ffj, p153l.vej
    /* JADX INFO: renamed from: t */
    public void mo125384t() {
        super.mo125384t();
        this.f179651G = 1.0f / m201064s();
        this.f179652H = 1.0f / m201063q();
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: u */
    public void mo97358u() {
        super.mo97358u();
        this.f179653I = GLES20.glGetUniformLocation(this.f183782d, "texelWidthOffset");
        this.f179654J = GLES20.glGetUniformLocation(this.f183782d, "texelHeightOffset");
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: x */
    public void mo97359x() {
        if (m186819Q() == 1) {
            this.f179651G = 1.0f / m201064s();
            this.f179652H = 0.0f;
        } else {
            this.f179651G = 0.0f;
            this.f179652H = 1.0f / m201063q();
        }
        super.mo97359x();
        GLES20.glUniform1f(this.f179653I, this.f179651G);
        GLES20.glUniform1f(this.f179654J, this.f179652H);
    }
}
