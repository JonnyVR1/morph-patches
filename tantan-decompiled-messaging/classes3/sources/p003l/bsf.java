package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class bsf extends lr2 {

    /* JADX INFO: renamed from: d */
    private int f2484d;

    /* JADX INFO: renamed from: e */
    private int f2485e;

    /* JADX INFO: renamed from: f */
    private float f2486f = 0.2f;

    /* JADX INFO: renamed from: g */
    private float f2487g = 0.15f;

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform highp float iTime;\n uniform highp vec2 iResolution;\n uniform float amount;\n uniform float speed;\n float random1d(float n){\n     return fract(sin(n) * 43758.5453);\n }\n float random2d(highp vec2 n) {\n     return fract(sin(dot(n, vec2(12.9898, 4.1414))) * 43758.5453);\n }\n float randomRange (highp vec2 seed, in float min, in float max) {\n     return min + random2d(seed) * (max - min);\n }\n float insideRange(float v, float bottom, float top) {\n     return step(bottom, v) - step(top, v);\n }\n float rand(highp vec2 co){\n     return fract(sin(dot(co.xy ,vec2(12.9898,78.233))) * 43758.5453);\n }\n void main() {\n     highp vec2 uv = textureCoordinate;\n     float sTime = floor(iTime * 0.25 * speed * 6.0 * 24.0);\n     highp vec3 inCol = texture2D(inputImageTexture0, uv).rgb;\n     highp vec3 outCol = inCol;\n     float maxOffset = amount/2.0; highp vec2 uvOff;\n     for (float i = 0.0; i < 10.0; i += 1.0) {\n         if (i > 10.0 * amount) break;\n         float sliceY = random2d(vec2(sTime + amount, 2345.0 + float(i)));\n         float sliceH = random2d(vec2(sTime + amount, 9035.0 + float(i))) * 0.25;\n         float hOffset = randomRange(vec2(sTime + amount, 9625.0 + float(i)), -maxOffset, maxOffset);\n         uvOff = uv;\n         uvOff.x += hOffset;\n         highp vec2 uvOff = fract(uvOff);\n         if (insideRange(uv.y, sliceY, fract(sliceY+sliceH)) == 1.0 ){\n             outCol = texture2D(inputImageTexture0, uvOff).rgb;\n         }\n     }\n     float maxColOffset = amount/6.0;\n     highp vec2 colOffset = vec2(randomRange(vec2(sTime + amount, 3545.0),-maxColOffset,maxColOffset), randomRange(vec2(sTime , 7205.0),-maxColOffset,maxColOffset));\n     uvOff = fract(uv + colOffset);\n     float rnd = random2d(vec2(sTime + amount, 9545.0));\n     if (rnd < 0.33){\n         outCol.r = texture2D(inputImageTexture0, uvOff).r;\n     }else if (rnd < 0.66){\n         outCol.g = texture2D(inputImageTexture0, uvOff).g;\n     } else{\n         outCol.b = texture2D(inputImageTexture0, uvOff).b;\n     }\n     gl_FragColor = vec4(outCol,1.0);\n }";
    }

    @Override // p003l.lr2, p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f2484d = GLES20.glGetUniformLocation(this.programHandle, "amount");
        this.f2485e = GLES20.glGetUniformLocation(this.programHandle, "speed");
    }

    @Override // p003l.lr2, p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f2484d, this.f2486f);
        GLES20.glUniform1f(this.f2485e, this.f2487g);
    }
}
