package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lr2 extends bt2 {

    /* JADX INFO: renamed from: a */
    protected int f129458a;

    /* JADX INFO: renamed from: b */
    protected float f129459b;

    /* JADX INFO: renamed from: c */
    private int f129460c;

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f129458a = GLES20.glGetUniformLocation(this.programHandle, "iTime");
        this.f129460c = GLES20.glGetUniformLocation(this.programHandle, "iResolution");
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f129458a, this.f129459b);
        GLES20.glUniform2f(this.f129460c, getWidth(), getHeight());
    }

    @Override // p149l.uff0, p149l.AbstractC17477i4, p149l.q7m
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        this.f129459b = j / 1000.0f;
    }
}
