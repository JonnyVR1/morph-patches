package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes7.dex */
public class ji70 extends us2 {

    /* JADX INFO: renamed from: D */
    private int f118056D;

    /* JADX INFO: renamed from: E */
    private int f118057E;

    /* JADX INFO: renamed from: F */
    private int f118058F;

    /* JADX INFO: renamed from: G */
    private float f118059G;

    /* JADX INFO: renamed from: H */
    private float f118060H;

    /* JADX INFO: renamed from: I */
    private int f118061I = 0;

    public ji70(float f, float f2) {
        this.f118059G = f;
        this.f118060H = f2;
    }

    /* JADX INFO: renamed from: O */
    public void m141633O(boolean z) {
        if (z) {
            this.f118061I = 0;
        } else {
            this.f118061I = 1;
        }
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: m */
    public String mo102573m() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float u_FractionalWidth;\nuniform float u_AspectRatio;\nuniform int u_Normal;\nvoid main(){\n   highp vec2 sampleDivisor = vec2(u_FractionalWidth, u_FractionalWidth / u_AspectRatio);\n   highp vec2 samplePos = textureCoordinate - mod(textureCoordinate, sampleDivisor) + 0.5 * sampleDivisor;\n     if (u_Normal == 0) {   gl_FragColor = texture2D(inputImageTexture0, samplePos);\n     } else {\n   gl_FragColor = texture2D(inputImageTexture0, textureCoordinate);\n     }\n}\n";
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: t */
    public void mo110707t() {
        super.mo110707t();
        this.f118056D = GLES20.glGetUniformLocation(this.f85418d, "u_FractionalWidth");
        this.f118057E = GLES20.glGetUniformLocation(this.f85418d, "u_AspectRatio");
        this.f118058F = GLES20.glGetUniformLocation(this.f85418d, "u_Normal");
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: w */
    public void mo110710w() {
        super.mo110710w();
        GLES20.glUniform1f(this.f118056D, this.f118059G);
        GLES20.glUniform1f(this.f118057E, this.f118060H);
        GLES20.glUniform1i(this.f118058F, this.f118061I);
    }
}
