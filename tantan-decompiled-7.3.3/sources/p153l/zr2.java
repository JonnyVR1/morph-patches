package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zr2 extends lt2 {

    /* JADX INFO: renamed from: a */
    protected int f205726a;

    /* JADX INFO: renamed from: b */
    protected float f205727b;

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f205726a = GLES20.glGetUniformLocation(this.programHandle, "iTime");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f205726a, this.f205727b);
    }

    @Override // p153l.lt2, p153l.bof0, p153l.AbstractC17634i4, p153l.gam
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        this.f205727b = j / 1000.0f;
    }
}
