package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes7.dex */
public class hbe extends ncj {

    /* JADX INFO: renamed from: D */
    private int f106922D = 10;

    /* JADX INFO: renamed from: E */
    private sbj f106923E = null;

    /* JADX INFO: renamed from: F */
    private float[] f106924F = null;

    /* JADX INFO: renamed from: G */
    private int f106925G = -1;

    public hbe() {
        this.f85423i = true;
    }

    @Override // p149l.ncj
    /* JADX INFO: renamed from: F */
    public void mo118663F() {
        GLES20.glViewport(0, 0, m110705r(), m110701n());
        GLES20.glClear(16640);
        GLES20.glClearColor(m110700l(), m110699k(), m110698j(), m110697i());
        GLES20.glUseProgram(this.f85418d);
        mo110710w();
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* JADX INFO: renamed from: O */
    public void m130326O(int i) {
        this.f85415a = 0;
        m110711x(i / 90);
    }

    /* JADX INFO: renamed from: P */
    public void m130327P(int i) {
        this.f106922D = i;
    }

    /* JADX INFO: renamed from: Q */
    public void m130328Q(float[] fArr) {
        this.f106924F = (float[]) fArr.clone();
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: m */
    public String mo102573m() {
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES inputImageTexture0;\nvarying vec2 textureCoordinate;\nvoid main(){\n   gl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\n}\n";
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: o */
    public String mo110702o() {
        return "attribute vec4 position;\nuniform mat4 u_Matrix;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main() {\n   vec4 texPos = u_Matrix * vec4(inputTextureCoordinate, 1, 1);\n   textureCoordinate = texPos.xy;\n   gl_Position = position;\n}\n";
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: u */
    public void mo110708u() {
        super.mo110708u();
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: v */
    public void mo110709v() {
        m158950L();
        super.mo110709v();
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: w */
    public void mo110710w() {
        super.mo110710w();
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, 0);
        GLES20.glBindTexture(36197, this.f106922D);
        if (this.f106924F != null) {
            if (this.f106925G < 0) {
                this.f106925G = GLES20.glGetUniformLocation(this.f85418d, "u_Matrix");
            }
            GLES20.glUniformMatrix4fv(this.f106925G, 1, false, this.f106924F, 0);
        }
    }
}
