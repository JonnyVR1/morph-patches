package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class jrf extends lr2 {

    /* JADX INFO: renamed from: d */
    private int f119396d;

    /* JADX INFO: renamed from: e */
    private int f119397e;

    /* JADX INFO: renamed from: f */
    private int f119398f;

    /* JADX INFO: renamed from: g */
    private float f119399g = 1.0f;

    /* JADX INFO: renamed from: i */
    private float f119400i = 1.0f;

    /* JADX INFO: renamed from: j */
    private float f119401j = 1.0f;

    /* JADX INFO: renamed from: Q1 */
    public void m142926Q1(float f) {
        this.f119400i = f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m142927R1(float f) {
        this.f119401j = f;
    }

    /* JADX INFO: renamed from: S1 */
    public void m142928S1(float f) {
        this.f119399g = f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform highp float iTime;\n uniform highp vec2 iResolution;\n uniform float thickDistort;\n uniform float fineDistort;\n uniform float rollSpeed;\n float speed = 0.116;\n highp vec3 mod289(highp vec3 x) {\n     return x - floor(x * (1.0 / 289.0)) * 289.0;\n }\n highp vec2 mod289(highp vec2 x) {\n     return x - floor(x * (1.0 / 289.0)) * 289.0;\n }\n highp vec3 permute(highp vec3 x) {\n     return mod289(((x*34.0)+1.0)*x);\n }\n float snoise(highp vec2 v) {\n     const highp vec4 C = vec4(0.211324865405187, 0.366025403784439, -0.577350269189626, 0.024390243902439);\n     highp vec2 i = floor(v + dot(v, C.yy) );\n     highp vec2 x0 = v - i + dot(i, C.xx);\n     highp vec2 i1; i1 = (x0.x > x0.y) ? vec2(1.0, 0.0) : vec2(0.0, 1.0);\n     highp vec4 x12 = x0.xyxy + C.xxzz;\n     x12.xy -= i1;\n     i = mod289(i);\n     highp vec3 p = permute( permute( i.y + vec3(0.0, i1.y, 1.0 )) + i.x + vec3(0.0, i1.x, 1.0 ));\n     highp vec3 m = max(0.5 - vec3(dot(x0,x0), dot(x12.xy,x12.xy), dot(x12.zw,x12.zw)), 0.0);\n     m = m*m ; m = m*m ;\n     highp vec3 x = 2.0 * fract(p * C.www) - 1.0;\n     highp vec3 h = abs(x) - 0.5;\n     highp vec3 ox = floor(x + 0.5);\n     highp vec3 a0 = x - ox;\n     m *= 1.79284291400159 - 0.85373472095314 * ( a0*a0 + h*h );\n     highp vec3 g; g.x = a0.x * x0.x + h.x * x0.y;\n     g.yz = a0.yz * x12.xz + h.yz * x12.yw;\n     return 130.0 * dot(m, g);\n }\n void main() {\n     highp vec2 uv = textureCoordinate;\n     highp vec2 p = uv;\n     float time = iTime * 0.25;\n     float ty = time * speed * 17.346;\n     float yt = p.y - ty;\n     float offset = snoise(vec2(yt*3.0,0.0))*0.2;\n     offset = offset*thickDistort * offset*thickDistort * offset;\n     offset += snoise(vec2(yt*50.0,0.0))*fineDistort*0.002;\n     gl_FragColor = texture2D(inputImageTexture0,fract(vec2(fract(p.x + offset),fract(p.y - time * rollSpeed) )));\n }";
    }

    @Override // p149l.lr2, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f119396d = GLES20.glGetUniformLocation(this.programHandle, "thickDistort");
        this.f119397e = GLES20.glGetUniformLocation(this.programHandle, "fineDistort");
        this.f119398f = GLES20.glGetUniformLocation(this.programHandle, "rollSpeed");
    }

    @Override // p149l.lr2, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f119396d, this.f119399g);
        GLES20.glUniform1f(this.f119397e, this.f119400i);
        GLES20.glUniform1f(this.f119398f, this.f119401j);
    }
}
