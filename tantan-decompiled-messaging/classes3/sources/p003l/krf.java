package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class krf extends lr2 {

    /* JADX INFO: renamed from: d */
    private float f5015d;

    /* JADX INFO: renamed from: e */
    private int f5016e;

    /* JADX INFO: renamed from: f */
    private int f5017f;

    /* JADX INFO: renamed from: g */
    private float f5018g;

    /* JADX INFO: renamed from: Q1 */
    public void m5766Q1(float f) {
        this.f5015d = f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m5767R1(float f) {
        this.f5018g = f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform highp float iTime;\n uniform highp vec2 iResolution;\n uniform float contrast;\n uniform float brightness;\n void main() {\n     highp vec2 uv = textureCoordinate;\n     highp vec4 color = texture2D(inputImageTexture0,fract(uv));\n     color.rgb += brightness;\n     color.rgb = (color.rgb - 0.5) / (1.0 - contrast) + 0.5;\n     gl_FragColor = color;\n }";
    }

    @Override // p003l.lr2, p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f5016e = GLES20.glGetUniformLocation(this.programHandle, "brightness");
        this.f5017f = GLES20.glGetUniformLocation(this.programHandle, "contrast");
    }

    @Override // p003l.lr2, p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f5016e, this.f5015d);
        GLES20.glUniform1f(this.f5017f, this.f5018g);
    }
}
