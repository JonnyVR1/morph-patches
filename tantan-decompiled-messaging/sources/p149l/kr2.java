package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class kr2 extends wp2 {

    /* JADX INFO: renamed from: e */
    protected int f124318e;

    /* JADX INFO: renamed from: f */
    protected float f124319f;

    public kr2(int i) {
        super(i);
    }

    @Override // p149l.xj10, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f124318e = GLES20.glGetUniformLocation(this.programHandle, "iTime");
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f124318e, this.f124319f);
    }

    @Override // p149l.wp2, p149l.fql, p149l.q7m
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        this.f124319f = j / 1000.0f;
    }
}
