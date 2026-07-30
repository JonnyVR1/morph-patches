package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class irf0 extends AbstractC17634i4 {

    /* JADX INFO: renamed from: a */
    protected float f116554a;

    /* JADX INFO: renamed from: b */
    protected float f116555b;

    /* JADX INFO: renamed from: c */
    private int f116556c;

    /* JADX INFO: renamed from: d */
    private int f116557d;

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float u_TexelWidth;\nuniform float u_TexelHeight;\nvoid main(){\n   vec2 up = vec2(0.0, u_TexelHeight);\n   vec2 right = vec2(u_TexelWidth, 0.0);\n   float bottomLeftIntensity = texture2D(inputImageTexture0, textureCoordinate - up - right).r;\n   float topRightIntensity = texture2D(inputImageTexture0, textureCoordinate + up + right).r;\n   float topLeftIntensity = texture2D(inputImageTexture0, textureCoordinate + up - right).r;\n   float bottomRightIntensity = texture2D(inputImageTexture0, textureCoordinate - up + right).r;\n   float leftIntensity = texture2D(inputImageTexture0, textureCoordinate - right).r;\n   float rightIntensity = texture2D(inputImageTexture0, textureCoordinate + right).r;\n   float bottomIntensity = texture2D(inputImageTexture0, textureCoordinate - up).r;\n   float topIntensity = texture2D(inputImageTexture0, textureCoordinate + up).r;\n   float h = -topLeftIntensity - 2.0 * topIntensity - topRightIntensity + bottomLeftIntensity + 2.0 * bottomIntensity + bottomRightIntensity;\n   float v = -bottomLeftIntensity - 2.0 * leftIntensity - topLeftIntensity + bottomRightIntensity + 2.0 * rightIntensity + topRightIntensity;\n   float mag = 1.0 - length(vec2(h, v));\n   gl_FragColor = vec4(vec3(mag), 1.0);\n}\n";
    }

    @Override // p153l.gfj, p153l.wej
    public void handleSizeChange() {
        super.handleSizeChange();
        this.f116554a = 1.0f / getWidth();
        this.f116555b = 1.0f / getHeight();
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f116556c = GLES20.glGetUniformLocation(this.programHandle, "u_TexelWidth");
        this.f116557d = GLES20.glGetUniformLocation(this.programHandle, "u_TexelHeight");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f116556c, this.f116554a);
        GLES20.glUniform1f(this.f116557d, this.f116555b);
    }
}
