package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jr2 extends vs2 {

    /* JADX INFO: renamed from: a */
    protected int f119373a;

    /* JADX INFO: renamed from: b */
    protected float f119374b;

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f119373a = GLES20.glGetUniformLocation(this.programHandle, "iTime");
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f119373a, this.f119374b);
    }

    @Override // p149l.vs2, p149l.uff0, p149l.AbstractC17477i4, p149l.q7m
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        this.f119374b = j / 1000.0f;
    }
}
