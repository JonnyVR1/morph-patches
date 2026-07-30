package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes7.dex */
public class mlj extends umj0 {

    /* JADX INFO: renamed from: L */
    float f137413L;

    /* JADX INFO: renamed from: K */
    String f137412K = "blurSize";

    /* JADX INFO: renamed from: M */
    int f137414M = 0;

    /* JADX INFO: renamed from: N */
    private String f137415N = "mediump";

    public mlj(float f) {
        this.f137413L = f;
    }

    /* JADX INFO: renamed from: R */
    public void m158895R(float f) {
        this.f137413L = f;
    }

    /* JADX INFO: renamed from: f */
    public void m158896f(String str) {
        this.f137415N = str;
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: p */
    public String mo97356p() {
        return "precision " + this.f137415N + " float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\nuniform float blurSize;\n\nfloat SCurve(float x) {\n\t\tx = x * 2.0 - 1.0;\n\t\treturn -x * abs(x) * 0.5 + x + 0.5;\n}\n\nvec4 blur(sampler2D source, vec2 size, vec2 uv, float radius) {\n\tif (radius >= 1.0)\n\t{\n\t\tvec4 A = vec4(0.0); \n\t\tvec4 C = vec4(0.0); \n\t\tfloat width = size.x;// 1 / width\n\t\tfloat height = size.y;// 1 / height\n\t\tfloat divisor = 0.0; \n        float weight = 0.0;\n        float radiusMultiplier = 1.0 / radius;\n        for (float y = -radius; y <= radius; y++)\n\t\t{\n\t\t\tA = texture2D(source, uv + vec2(y * width, y * height));\n            weight = SCurve(1.0 - (abs(y) * radiusMultiplier)); \n            C += A * weight; \n\t\t\tdivisor += weight; \n\t\t}\n\t\treturn vec4(C.r / divisor, C.g / divisor, C.b / divisor, 1.0);\n\t}\n\treturn texture2D(source, uv);\n}\n\nvoid main(){\n\tgl_FragColor = blur(inputImageTexture0, vec2(texelWidthOffset, texelHeightOffset), textureCoordinate, blurSize);\n}";
    }

    @Override // p153l.umj0, p153l.vej
    /* JADX INFO: renamed from: u */
    public void mo97358u() {
        super.mo97358u();
        this.f137414M = GLES20.glGetUniformLocation(this.f183782d, this.f137412K);
    }

    @Override // p153l.umj0, p153l.vej
    /* JADX INFO: renamed from: x */
    public void mo97359x() {
        super.mo97359x();
        GLES20.glUniform1f(this.f137414M, this.f137413L);
    }
}
