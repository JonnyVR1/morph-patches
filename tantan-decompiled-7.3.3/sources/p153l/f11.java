package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes7.dex */
public class f11 extends qjj0 {

    /* JADX INFO: renamed from: Z */
    private int f96755Z;

    /* JADX INFO: renamed from: a0 */
    private int f96756a0;

    /* JADX INFO: renamed from: b0 */
    private int f96757b0;

    /* JADX INFO: renamed from: c0 */
    private int f96758c0;

    /* JADX INFO: renamed from: d0 */
    private int f96759d0;

    /* JADX INFO: renamed from: e0 */
    private int f96760e0;

    /* JADX INFO: renamed from: f0 */
    private float f96761f0 = 0.0f;

    /* JADX INFO: renamed from: g0 */
    private float f96762g0 = 0.0f;

    /* JADX INFO: renamed from: S */
    public void m123542S(float f, float f2) {
        this.f96761f0 = f;
        this.f96762g0 = f2;
    }

    @Override // p153l.qjj0, p153l.xej
    /* JADX INFO: renamed from: m */
    public String mo112466m() {
        return "precision highp float;\nvarying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform float maximumHorizontalDisplacement;\nuniform float maximumVerticalDisplacement;\nuniform int horizontalDisplacementComponent;\nuniform int verticalDisplacementComponent;\nuniform float textureWidth;\nuniform float textureHeight;\nvoid main() {\n    vec4 displacement = texture2D(inputImageTexture1,textureCoordinate);\n    float h = displacement.x ; \n    float v = displacement.x ;\n    float hOffset = (h - 0.5) * 2.0 * maximumHorizontalDisplacement;\n    float vOffset = (v -0.5) * 2.0 * maximumVerticalDisplacement;\n    vec2 textureSize = vec2(textureWidth, textureHeight);\n    const int count = 8;\n    vec2 subSampleOffsets[count];\n    subSampleOffsets[0] = vec2( 0.0625, -0.1875);\n    subSampleOffsets[1] = vec2(-0.0625,  0.1875);\n    subSampleOffsets[2] = vec2( 0.3125,  0.0625);\n    subSampleOffsets[3] = vec2(-0.1875, -0.3125);\n    subSampleOffsets[4] = vec2(-0.3125,  0.3125);\n    subSampleOffsets[5] = vec2(-0.4375, -0.0625);\n    subSampleOffsets[6] = vec2( 0.1875,  0.4375);\n    subSampleOffsets[7] = vec2( 0.4375, -0.4375);\n    vec2 textureCoordinates[count];\n    for (int i = 0; i < count; i += 1) {\n        textureCoordinates[i] = textureCoordinate + subSampleOffsets[i]/textureSize;\n    }\n    vec4 color = vec4(0.0, 0.0, 0.0, 0.0);\n    float count1 = float(count); vec4 origin;\n    for (int i = 0; i < count; i += 1) {\n       origin   = texture2D(inputImageTexture0, textureCoordinates[i] + vec2(hOffset, vOffset));\n       color += origin/count1;\n    }\n    gl_FragColor =  color;\n}\n";
    }

    @Override // p153l.qjj0, p153l.is10, p153l.xej
    /* JADX INFO: renamed from: t */
    public void mo112468t() {
        super.mo112468t();
        this.f96755Z = GLES20.glGetUniformLocation(this.f193943d, "maximumHorizontalDisplacement");
        this.f96756a0 = GLES20.glGetUniformLocation(this.f193943d, "maximumVerticalDisplacement");
        this.f96757b0 = GLES20.glGetUniformLocation(this.f193943d, "horizontalDisplacementComponent");
        this.f96758c0 = GLES20.glGetUniformLocation(this.f193943d, "verticalDisplacementComponent");
        this.f96759d0 = GLES20.glGetUniformLocation(this.f193943d, "textureWidth");
        this.f96760e0 = GLES20.glGetUniformLocation(this.f193943d, "textureHeight");
    }

    @Override // p153l.qjj0, p153l.is10, p153l.xej
    /* JADX INFO: renamed from: w */
    public void mo112469w() {
        super.mo112469w();
        GLES20.glUniform1f(this.f96755Z, this.f96761f0);
        GLES20.glUniform1f(this.f96756a0, this.f96762g0);
        GLES20.glUniform1i(this.f96757b0, 0);
        GLES20.glUniform1i(this.f96758c0, 0);
        GLES20.glUniform1f(this.f96759d0, m210702r());
        GLES20.glUniform1f(this.f96760e0, m210701n());
    }
}
