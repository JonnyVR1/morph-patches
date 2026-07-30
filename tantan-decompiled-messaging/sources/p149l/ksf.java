package p149l;

import android.opengl.GLES20;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public class ksf extends lr2 {

    /* JADX INFO: renamed from: d */
    private int f124448d;

    /* JADX INFO: renamed from: e */
    private int f124449e;

    /* JADX INFO: renamed from: f */
    private int f124450f;

    /* JADX INFO: renamed from: g */
    private float f124451g;

    /* JADX INFO: renamed from: i */
    private float f124452i;

    /* JADX INFO: renamed from: j */
    private float f124453j;

    /* JADX INFO: renamed from: Q1 */
    public void m147064Q1(float f) {
        this.f124451g = f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m147065R1(float f) {
        this.f124452i = f;
    }

    /* JADX INFO: renamed from: S1 */
    public void m147066S1(float f) {
        this.f124453j = f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform highp float iTime;\n uniform highp vec2 iResolution;\n uniform float count;\n uniform float offset;\n uniform float speedV;\n float steppedVal(float v, float steps){\n     return floor(v*steps)/steps;\n }\n float random1d(float n){\n     return fract(sin(n) * 43758.5453);\n }\n float noise1d(float p){\n     float fl = floor(p);\n     float fc = fract(p);\n     return mix(random1d(fl), random1d(fl + 1.0), fc);\n }\n const float TWO_PI = 6.283185307179586;\n void main() {\n     vec2 uv = textureCoordinate;\n     float time = iTime * 0.25;\n     float n = noise1d(uv.y * count + time * speedV * 3.0);\n     float ns = steppedVal(fract(n ),count) + 2.0;\n     float nsr = random1d(ns);\n     highp vec2 uvn = uv;\n     uvn.x += nsr * sin(time * TWO_PI + nsr * 20.0) * offset;\n     gl_FragColor = texture2D(inputImageTexture0, uvn);\n }";
    }

    @Override // p149l.lr2, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f124448d = GLES20.glGetUniformLocation(this.programHandle, "count");
        this.f124449e = GLES20.glGetUniformLocation(this.programHandle, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
        this.f124450f = GLES20.glGetUniformLocation(this.programHandle, "speedV");
    }

    @Override // p149l.lr2, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f124448d, this.f124451g);
        GLES20.glUniform1f(this.f124449e, this.f124452i);
        GLES20.glUniform1f(this.f124450f, this.f124453j);
    }
}
