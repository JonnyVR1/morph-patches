package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes7.dex */
public class tij extends qdj0 {

    /* JADX INFO: renamed from: L */
    float f170587L;

    /* JADX INFO: renamed from: K */
    String f170586K = "blurSize";

    /* JADX INFO: renamed from: M */
    int f170588M = 0;

    /* JADX INFO: renamed from: N */
    private String f170589N = "mediump";

    public tij(float f) {
        this.f170587L = f;
    }

    /* JADX INFO: renamed from: R */
    public void m189203R(float f) {
        this.f170587L = f;
    }

    /* JADX INFO: renamed from: f */
    public void m189204f(String str) {
        this.f170589N = str;
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: p */
    public String mo95686p() {
        return "precision " + this.f170589N + " float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\nuniform float blurSize;\n\nfloat SCurve(float x) {\n\t\tx = x * 2.0 - 1.0;\n\t\treturn -x * abs(x) * 0.5 + x + 0.5;\n}\n\nvec4 blur(sampler2D source, vec2 size, vec2 uv, float radius) {\n\tif (radius >= 1.0)\n\t{\n\t\tvec4 A = vec4(0.0); \n\t\tvec4 C = vec4(0.0); \n\t\tfloat width = size.x;// 1 / width\n\t\tfloat height = size.y;// 1 / height\n\t\tfloat divisor = 0.0; \n        float weight = 0.0;\n        float radiusMultiplier = 1.0 / radius;\n        for (float y = -radius; y <= radius; y++)\n\t\t{\n\t\t\tA = texture2D(source, uv + vec2(y * width, y * height));\n            weight = SCurve(1.0 - (abs(y) * radiusMultiplier)); \n            C += A * weight; \n\t\t\tdivisor += weight; \n\t\t}\n\t\treturn vec4(C.r / divisor, C.g / divisor, C.b / divisor, 1.0);\n\t}\n\treturn texture2D(source, uv);\n}\n\nvoid main(){\n\tgl_FragColor = blur(inputImageTexture0, vec2(texelWidthOffset, texelHeightOffset), textureCoordinate, blurSize);\n}";
    }

    @Override // p149l.qdj0, p149l.bcj
    /* JADX INFO: renamed from: u */
    public void mo95688u() {
        super.mo95688u();
        this.f170588M = GLES20.glGetUniformLocation(this.f74924d, this.f170586K);
    }

    @Override // p149l.qdj0, p149l.bcj
    /* JADX INFO: renamed from: x */
    public void mo101089x() {
        super.mo101089x();
        GLES20.glUniform1f(this.f170588M, this.f170587L);
    }
}
