package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class zj10 extends xj10 {

    /* JADX INFO: renamed from: a */
    protected float f9370a;

    /* JADX INFO: renamed from: b */
    protected float f9371b;

    /* JADX INFO: renamed from: c */
    private int f9372c;

    /* JADX INFO: renamed from: d */
    private int f9373d;

    public zj10(int i) {
        super(i);
    }

    @Override // p003l.mcj, p003l.ccj
    public void handleSizeChange() {
        super.handleSizeChange();
        this.f9370a = 1.0f / getWidth();
        this.f9371b = 1.0f / getHeight();
    }

    @Override // p003l.xj10, p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f9372c = GLES20.glGetUniformLocation(this.programHandle, "u_TexelWidth");
        this.f9373d = GLES20.glGetUniformLocation(this.programHandle, "u_TexelHeight");
    }

    @Override // p003l.xj10, p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f9372c, this.f9370a);
        GLES20.glUniform1f(this.f9373d, this.f9371b);
    }
}
