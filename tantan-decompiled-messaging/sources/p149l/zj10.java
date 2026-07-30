package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zj10 extends xj10 {

    /* JADX INFO: renamed from: a */
    protected float f203370a;

    /* JADX INFO: renamed from: b */
    protected float f203371b;

    /* JADX INFO: renamed from: c */
    private int f203372c;

    /* JADX INFO: renamed from: d */
    private int f203373d;

    public zj10(int i) {
        super(i);
    }

    @Override // p149l.mcj, p149l.ccj
    public void handleSizeChange() {
        super.handleSizeChange();
        this.f203370a = 1.0f / getWidth();
        this.f203371b = 1.0f / getHeight();
    }

    @Override // p149l.xj10, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f203372c = GLES20.glGetUniformLocation(this.programHandle, "u_TexelWidth");
        this.f203373d = GLES20.glGetUniformLocation(this.programHandle, "u_TexelHeight");
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f203372c, this.f203370a);
        GLES20.glUniform1f(this.f203373d, this.f203371b);
    }
}
