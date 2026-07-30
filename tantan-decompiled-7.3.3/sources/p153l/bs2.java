package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bs2 extends rt2 {

    /* JADX INFO: renamed from: a */
    protected int f78083a;

    /* JADX INFO: renamed from: b */
    protected float f78084b;

    /* JADX INFO: renamed from: c */
    private int f78085c;

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f78083a = GLES20.glGetUniformLocation(this.programHandle, "iTime");
        this.f78085c = GLES20.glGetUniformLocation(this.programHandle, "iResolution");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f78083a, this.f78084b);
        GLES20.glUniform2f(this.f78085c, getWidth(), getHeight());
    }

    @Override // p153l.bof0, p153l.AbstractC17634i4, p153l.gam
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        this.f78084b = j / 1000.0f;
    }
}
