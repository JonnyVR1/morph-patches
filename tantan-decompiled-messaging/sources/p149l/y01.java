package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes7.dex */
public class y01 extends maj0 {

    /* JADX INFO: renamed from: Z */
    private int f195238Z;

    /* JADX INFO: renamed from: a0 */
    private int f195239a0;

    /* JADX INFO: renamed from: b0 */
    private int f195240b0;

    /* JADX INFO: renamed from: c0 */
    private int f195241c0;

    /* JADX INFO: renamed from: d0 */
    private int f195242d0;

    /* JADX INFO: renamed from: e0 */
    private int f195243e0;

    /* JADX INFO: renamed from: f0 */
    private float f195244f0 = 0.0f;

    /* JADX INFO: renamed from: g0 */
    private float f195245g0 = 0.0f;

    /* JADX INFO: renamed from: S */
    public void m212027S(float f, float f2) {
        this.f195244f0 = f;
        this.f195245g0 = f2;
    }

    @Override // p149l.maj0, p149l.dcj
    /* JADX INFO: renamed from: m */
    public String mo102573m() {
        return "precision highp float;\nvarying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform float maximumHorizontalDisplacement;\nuniform float maximumVerticalDisplacement;\nuniform int horizontalDisplacementComponent;\nuniform int verticalDisplacementComponent;\nuniform float textureWidth;\nuniform float textureHeight;\nvoid main() {\n    vec4 displacement = texture2D(inputImageTexture1,textureCoordinate);\n    float h = displacement.x ; \n    float v = displacement.x ;\n    float hOffset = (h - 0.5) * 2.0 * maximumHorizontalDisplacement;\n    float vOffset = (v -0.5) * 2.0 * maximumVerticalDisplacement;\n    vec2 textureSize = vec2(textureWidth, textureHeight);\n    const int count = 8;\n    vec2 subSampleOffsets[count];\n    subSampleOffsets[0] = vec2( 0.0625, -0.1875);\n    subSampleOffsets[1] = vec2(-0.0625,  0.1875);\n    subSampleOffsets[2] = vec2( 0.3125,  0.0625);\n    subSampleOffsets[3] = vec2(-0.1875, -0.3125);\n    subSampleOffsets[4] = vec2(-0.3125,  0.3125);\n    subSampleOffsets[5] = vec2(-0.4375, -0.0625);\n    subSampleOffsets[6] = vec2( 0.1875,  0.4375);\n    subSampleOffsets[7] = vec2( 0.4375, -0.4375);\n    vec2 textureCoordinates[count];\n    for (int i = 0; i < count; i += 1) {\n        textureCoordinates[i] = textureCoordinate + subSampleOffsets[i]/textureSize;\n    }\n    vec4 color = vec4(0.0, 0.0, 0.0, 0.0);\n    float count1 = float(count); vec4 origin;\n    for (int i = 0; i < count; i += 1) {\n       origin   = texture2D(inputImageTexture0, textureCoordinates[i] + vec2(hOffset, vOffset));\n       color += origin/count1;\n    }\n    gl_FragColor =  color;\n}\n";
    }

    @Override // p149l.maj0, p149l.yj10, p149l.dcj
    /* JADX INFO: renamed from: t */
    public void mo110707t() {
        super.mo110707t();
        this.f195238Z = GLES20.glGetUniformLocation(this.f85418d, "maximumHorizontalDisplacement");
        this.f195239a0 = GLES20.glGetUniformLocation(this.f85418d, "maximumVerticalDisplacement");
        this.f195240b0 = GLES20.glGetUniformLocation(this.f85418d, "horizontalDisplacementComponent");
        this.f195241c0 = GLES20.glGetUniformLocation(this.f85418d, "verticalDisplacementComponent");
        this.f195242d0 = GLES20.glGetUniformLocation(this.f85418d, "textureWidth");
        this.f195243e0 = GLES20.glGetUniformLocation(this.f85418d, "textureHeight");
    }

    @Override // p149l.maj0, p149l.yj10, p149l.dcj
    /* JADX INFO: renamed from: w */
    public void mo110710w() {
        super.mo110710w();
        GLES20.glUniform1f(this.f195238Z, this.f195244f0);
        GLES20.glUniform1f(this.f195239a0, this.f195245g0);
        GLES20.glUniform1i(this.f195240b0, 0);
        GLES20.glUniform1i(this.f195241c0, 0);
        GLES20.glUniform1f(this.f195242d0, m110705r());
        GLES20.glUniform1f(this.f195243e0, m110701n());
    }
}
