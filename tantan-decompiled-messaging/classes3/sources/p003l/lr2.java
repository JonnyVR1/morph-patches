package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class lr2 extends bt2 {

    /* JADX INFO: renamed from: a */
    protected int f5391a;

    /* JADX INFO: renamed from: b */
    protected float f5392b;

    /* JADX INFO: renamed from: c */
    private int f5393c;

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f5391a = GLES20.glGetUniformLocation(this.programHandle, "iTime");
        this.f5393c = GLES20.glGetUniformLocation(this.programHandle, "iResolution");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f5391a, this.f5392b);
        GLES20.glUniform2f(this.f5393c, getWidth(), getHeight());
    }

    @Override // p003l.uff0, p003l.AbstractC0341i4, p003l.q7m
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        this.f5392b = j / 1000.0f;
    }
}
