package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public abstract class js10 extends hs10 {

    /* JADX INFO: renamed from: a */
    protected float f122420a;

    /* JADX INFO: renamed from: b */
    protected float f122421b;

    /* JADX INFO: renamed from: c */
    private int f122422c;

    /* JADX INFO: renamed from: d */
    private int f122423d;

    public js10(int i) {
        super(i);
    }

    @Override // p153l.gfj, p153l.wej
    public void handleSizeChange() {
        super.handleSizeChange();
        this.f122420a = 1.0f / getWidth();
        this.f122421b = 1.0f / getHeight();
    }

    @Override // p153l.hs10, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f122422c = GLES20.glGetUniformLocation(this.programHandle, "u_TexelWidth");
        this.f122423d = GLES20.glGetUniformLocation(this.programHandle, "u_TexelHeight");
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f122422c, this.f122420a);
        GLES20.glUniform1f(this.f122423d, this.f122421b);
    }
}
