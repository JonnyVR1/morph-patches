package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class zif0 extends AbstractC0341i4 {

    /* JADX INFO: renamed from: a */
    protected float f9361a;

    /* JADX INFO: renamed from: b */
    protected float f9362b;

    /* JADX INFO: renamed from: c */
    private int f9363c;

    /* JADX INFO: renamed from: d */
    private int f9364d;

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float u_TexelWidth;\nuniform float u_TexelHeight;\nvoid main(){\n   vec2 up = vec2(0.0, u_TexelHeight);\n   vec2 right = vec2(u_TexelWidth, 0.0);\n   float bottomLeftIntensity = texture2D(inputImageTexture0, textureCoordinate - up - right).r;\n   float topRightIntensity = texture2D(inputImageTexture0, textureCoordinate + up + right).r;\n   float topLeftIntensity = texture2D(inputImageTexture0, textureCoordinate + up - right).r;\n   float bottomRightIntensity = texture2D(inputImageTexture0, textureCoordinate - up + right).r;\n   float leftIntensity = texture2D(inputImageTexture0, textureCoordinate - right).r;\n   float rightIntensity = texture2D(inputImageTexture0, textureCoordinate + right).r;\n   float bottomIntensity = texture2D(inputImageTexture0, textureCoordinate - up).r;\n   float topIntensity = texture2D(inputImageTexture0, textureCoordinate + up).r;\n   float h = -topLeftIntensity - 2.0 * topIntensity - topRightIntensity + bottomLeftIntensity + 2.0 * bottomIntensity + bottomRightIntensity;\n   float v = -bottomLeftIntensity - 2.0 * leftIntensity - topLeftIntensity + bottomRightIntensity + 2.0 * rightIntensity + topRightIntensity;\n   float mag = 1.0 - length(vec2(h, v));\n   gl_FragColor = vec4(vec3(mag), 1.0);\n}\n";
    }

    @Override // p003l.mcj, p003l.ccj
    public void handleSizeChange() {
        super.handleSizeChange();
        this.f9361a = 1.0f / getWidth();
        this.f9362b = 1.0f / getHeight();
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f9363c = GLES20.glGetUniformLocation(this.programHandle, "u_TexelWidth");
        this.f9364d = GLES20.glGetUniformLocation(this.programHandle, "u_TexelHeight");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f9363c, this.f9361a);
        GLES20.glUniform1f(this.f9364d, this.f9362b);
    }
}
