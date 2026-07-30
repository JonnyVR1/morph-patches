package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class y43 extends jt2 {

    /* JADX INFO: renamed from: b */
    int f197406b;

    /* JADX INFO: renamed from: a */
    final String f197405a = "direction";

    /* JADX INFO: renamed from: c */
    float[] f197407c = {1.0f, 1.0f};

    /* JADX INFO: renamed from: d */
    String f197408d = "precision highp float;\nuniform vec2 direction;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvec3 sum = vec3(0.0);\nvec2 texcoord;\nvoid main(){ \ntexcoord = textureCoordinate + vec2(-4.0, -4.0) * direction;\nsum += texture2D(inputImageTexture0, texcoord).rgb*0.002690;\ntexcoord = textureCoordinate + vec2(-3.0, -3.0) * direction;\nsum += texture2D(inputImageTexture0, texcoord).rgb*0.021400;\ntexcoord = textureCoordinate + vec2(-2.0, -2.0) * direction;\nsum += texture2D(inputImageTexture0, texcoord).rgb*0.093900;\ntexcoord = textureCoordinate + vec2(-1.0, -1.0) * direction;\nsum += texture2D(inputImageTexture0, texcoord).rgb*0.228;\ntexcoord = textureCoordinate + vec2(1.0, 1.0) * direction;\nsum += texture2D(inputImageTexture0, texcoord).rgb*0.228000;\ntexcoord = textureCoordinate + vec2(2.0, 2.0) * direction;\nsum += texture2D(inputImageTexture0, texcoord).rgb*0.093900;\ntexcoord = textureCoordinate + vec2(3.0, 3.0) * direction;\nsum += texture2D(inputImageTexture0, texcoord).rgb*0.021400;\ntexcoord = textureCoordinate + vec2(4.0, 4.0) * direction;\nsum += texture2D(inputImageTexture0, texcoord).rgb*0.002690;\nsum += texture2D(inputImageTexture0, textureCoordinate).rgb*0.306870;\ngl_FragColor = vec4(sum, 1.0);}";

    public y43() {
        setFloatTexture(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m214196Q1(float f, float f2) {
        float[] fArr = this.f197407c;
        fArr[0] = f;
        fArr[1] = f2;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return this.f197408d;
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        super.initWithGLContext();
        this.f197406b = GLES20.glGetUniformLocation(this.programHandle, "direction");
    }

    @Override // p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        super.newTextureReady(i, gfjVar, z);
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        int i = this.f197406b;
        float[] fArr = this.f197407c;
        GLES20.glUniform2f(i, fArr[0], fArr[1]);
    }
}
