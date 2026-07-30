package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class kr2 extends wp2 {

    /* JADX INFO: renamed from: e */
    protected int f5013e;

    /* JADX INFO: renamed from: f */
    protected float f5014f;

    public kr2(int i) {
        super(i);
    }

    @Override // p003l.xj10, p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f5013e = GLES20.glGetUniformLocation(this.programHandle, "iTime");
    }

    @Override // p003l.xj10, p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f5013e, this.f5014f);
    }

    @Override // p003l.wp2, p003l.fql, p003l.q7m
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        this.f5014f = j / 1000.0f;
    }
}
