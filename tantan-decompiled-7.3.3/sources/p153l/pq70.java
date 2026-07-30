package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes7.dex */
public class pq70 extends kt2 {

    /* JADX INFO: renamed from: D */
    private int f153645D;

    /* JADX INFO: renamed from: E */
    private int f153646E;

    /* JADX INFO: renamed from: F */
    private int f153647F;

    /* JADX INFO: renamed from: G */
    private float f153648G;

    /* JADX INFO: renamed from: H */
    private float f153649H;

    /* JADX INFO: renamed from: I */
    private int f153650I = 0;

    public pq70(float f, float f2) {
        this.f153648G = f;
        this.f153649H = f2;
    }

    /* JADX INFO: renamed from: O */
    public void m173325O(boolean z) {
        if (z) {
            this.f153650I = 0;
        } else {
            this.f153650I = 1;
        }
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: m */
    public String mo112466m() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float u_FractionalWidth;\nuniform float u_AspectRatio;\nuniform int u_Normal;\nvoid main(){\n   highp vec2 sampleDivisor = vec2(u_FractionalWidth, u_FractionalWidth / u_AspectRatio);\n   highp vec2 samplePos = textureCoordinate - mod(textureCoordinate, sampleDivisor) + 0.5 * sampleDivisor;\n     if (u_Normal == 0) {   gl_FragColor = texture2D(inputImageTexture0, samplePos);\n     } else {\n   gl_FragColor = texture2D(inputImageTexture0, textureCoordinate);\n     }\n}\n";
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: t */
    public void mo112468t() {
        super.mo112468t();
        this.f153645D = GLES20.glGetUniformLocation(this.f193943d, "u_FractionalWidth");
        this.f153646E = GLES20.glGetUniformLocation(this.f193943d, "u_AspectRatio");
        this.f153647F = GLES20.glGetUniformLocation(this.f193943d, "u_Normal");
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: w */
    public void mo112469w() {
        super.mo112469w();
        GLES20.glUniform1f(this.f153645D, this.f153648G);
        GLES20.glUniform1f(this.f153646E, this.f153649H);
        GLES20.glUniform1i(this.f153647F, this.f153650I);
    }
}
