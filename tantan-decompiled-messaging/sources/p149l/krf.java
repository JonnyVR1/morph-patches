package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class krf extends lr2 {

    /* JADX INFO: renamed from: d */
    private float f124350d;

    /* JADX INFO: renamed from: e */
    private int f124351e;

    /* JADX INFO: renamed from: f */
    private int f124352f;

    /* JADX INFO: renamed from: g */
    private float f124353g;

    /* JADX INFO: renamed from: Q1 */
    public void m146972Q1(float f) {
        this.f124350d = f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m146973R1(float f) {
        this.f124353g = f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform highp float iTime;\n uniform highp vec2 iResolution;\n uniform float contrast;\n uniform float brightness;\n void main() {\n     highp vec2 uv = textureCoordinate;\n     highp vec4 color = texture2D(inputImageTexture0,fract(uv));\n     color.rgb += brightness;\n     color.rgb = (color.rgb - 0.5) / (1.0 - contrast) + 0.5;\n     gl_FragColor = color;\n }";
    }

    @Override // p149l.lr2, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f124351e = GLES20.glGetUniformLocation(this.programHandle, "brightness");
        this.f124352f = GLES20.glGetUniformLocation(this.programHandle, "contrast");
    }

    @Override // p149l.lr2, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f124351e, this.f124350d);
        GLES20.glUniform1f(this.f124352f, this.f124353g);
    }
}
