package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes7.dex */
public class lce extends hfj {

    /* JADX INFO: renamed from: D */
    private int f131350D = 10;

    /* JADX INFO: renamed from: E */
    private mej f131351E = null;

    /* JADX INFO: renamed from: F */
    private float[] f131352F = null;

    /* JADX INFO: renamed from: G */
    private int f131353G = -1;

    public lce() {
        this.f193948i = true;
    }

    @Override // p153l.hfj
    /* JADX INFO: renamed from: F */
    public void mo134797F() {
        GLES20.glViewport(0, 0, m210702r(), m210701n());
        GLES20.glClear(16640);
        GLES20.glClearColor(m210700l(), m210699k(), m210698j(), m210697i());
        GLES20.glUseProgram(this.f193943d);
        mo112469w();
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* JADX INFO: renamed from: O */
    public void m153679O(int i) {
        this.f193940a = 0;
        m210703x(i / 90);
    }

    /* JADX INFO: renamed from: P */
    public void m153680P(int i) {
        this.f131350D = i;
    }

    /* JADX INFO: renamed from: Q */
    public void m153681Q(float[] fArr) {
        this.f131352F = (float[]) fArr.clone();
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: m */
    public String mo112466m() {
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES inputImageTexture0;\nvarying vec2 textureCoordinate;\nvoid main(){\n   gl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\n}\n";
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: o */
    public String mo112467o() {
        return "attribute vec4 position;\nuniform mat4 u_Matrix;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main() {\n   vec4 texPos = u_Matrix * vec4(inputTextureCoordinate, 1, 1);\n   textureCoordinate = texPos.xy;\n   gl_Position = position;\n}\n";
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: u */
    public void mo134344u() {
        super.mo134344u();
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: v */
    public void mo134345v() {
        m134802L();
        super.mo134345v();
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: w */
    public void mo112469w() {
        super.mo112469w();
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, 0);
        GLES20.glBindTexture(36197, this.f131350D);
        if (this.f131352F != null) {
            if (this.f131353G < 0) {
                this.f131353G = GLES20.glGetUniformLocation(this.f193943d, "u_Matrix");
            }
            GLES20.glUniformMatrix4fv(this.f131353G, 1, false, this.f131352F, 0);
        }
    }
}
