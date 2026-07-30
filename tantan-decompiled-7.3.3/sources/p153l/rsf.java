package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class rsf extends bs2 {

    /* JADX INFO: renamed from: d */
    private float f164657d;

    /* JADX INFO: renamed from: e */
    private int f164658e;

    /* JADX INFO: renamed from: f */
    private int f164659f;

    /* JADX INFO: renamed from: g */
    private float f164660g;

    /* JADX INFO: renamed from: Q1 */
    public void m182955Q1(float f) {
        this.f164657d = f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m182956R1(float f) {
        this.f164660g = f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform highp float iTime;\n uniform highp vec2 iResolution;\n uniform float contrast;\n uniform float brightness;\n void main() {\n     highp vec2 uv = textureCoordinate;\n     highp vec4 color = texture2D(inputImageTexture0,fract(uv));\n     color.rgb += brightness;\n     color.rgb = (color.rgb - 0.5) / (1.0 - contrast) + 0.5;\n     gl_FragColor = color;\n }";
    }

    @Override // p153l.bs2, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f164658e = GLES20.glGetUniformLocation(this.programHandle, "brightness");
        this.f164659f = GLES20.glGetUniformLocation(this.programHandle, "contrast");
    }

    @Override // p153l.bs2, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f164658e, this.f164657d);
        GLES20.glUniform1f(this.f164659f, this.f164660g);
    }
}
