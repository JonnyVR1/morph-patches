package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ksf extends lr2 {

    /* JADX INFO: renamed from: d */
    private int f5026d;

    /* JADX INFO: renamed from: e */
    private int f5027e;

    /* JADX INFO: renamed from: f */
    private int f5028f;

    /* JADX INFO: renamed from: g */
    private float f5029g;

    /* JADX INFO: renamed from: i */
    private float f5030i;

    /* JADX INFO: renamed from: j */
    private float f5031j;

    /* JADX INFO: renamed from: Q1 */
    public void m5779Q1(float f) {
        this.f5029g = f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m5780R1(float f) {
        this.f5030i = f;
    }

    /* JADX INFO: renamed from: S1 */
    public void m5781S1(float f) {
        this.f5031j = f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform highp float iTime;\n uniform highp vec2 iResolution;\n uniform float count;\n uniform float offset;\n uniform float speedV;\n float steppedVal(float v, float steps){\n     return floor(v*steps)/steps;\n }\n float random1d(float n){\n     return fract(sin(n) * 43758.5453);\n }\n float noise1d(float p){\n     float fl = floor(p);\n     float fc = fract(p);\n     return mix(random1d(fl), random1d(fl + 1.0), fc);\n }\n const float TWO_PI = 6.283185307179586;\n void main() {\n     vec2 uv = textureCoordinate;\n     float time = iTime * 0.25;\n     float n = noise1d(uv.y * count + time * speedV * 3.0);\n     float ns = steppedVal(fract(n ),count) + 2.0;\n     float nsr = random1d(ns);\n     highp vec2 uvn = uv;\n     uvn.x += nsr * sin(time * TWO_PI + nsr * 20.0) * offset;\n     gl_FragColor = texture2D(inputImageTexture0, uvn);\n }";
    }

    @Override // p003l.lr2, p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f5026d = GLES20.glGetUniformLocation(this.programHandle, "count");
        this.f5027e = GLES20.glGetUniformLocation(this.programHandle, "offset");
        this.f5028f = GLES20.glGetUniformLocation(this.programHandle, "speedV");
    }

    @Override // p003l.lr2, p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f5026d, this.f5029g);
        GLES20.glUniform1f(this.f5027e, this.f5030i);
        GLES20.glUniform1f(this.f5028f, this.f5031j);
    }
}
