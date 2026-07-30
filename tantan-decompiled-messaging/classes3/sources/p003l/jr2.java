package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class jr2 extends vs2 {

    /* JADX INFO: renamed from: a */
    protected int f4707a;

    /* JADX INFO: renamed from: b */
    protected float f4708b;

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f4707a = GLES20.glGetUniformLocation(this.programHandle, "iTime");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f4707a, this.f4708b);
    }

    @Override // p003l.vs2, p003l.uff0, p003l.AbstractC0341i4, p003l.q7m
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        this.f4708b = j / 1000.0f;
    }
}
