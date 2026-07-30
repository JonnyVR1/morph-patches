package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class as2 extends nq2 {

    /* JADX INFO: renamed from: e */
    protected int f73022e;

    /* JADX INFO: renamed from: f */
    protected float f73023f;

    public as2(int i) {
        super(i);
    }

    @Override // p153l.hs10, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f73022e = GLES20.glGetUniformLocation(this.programHandle, "iTime");
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f73022e, this.f73023f);
    }

    @Override // p153l.nq2, p153l.rsl, p153l.gam
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        this.f73023f = j / 1000.0f;
    }
}
