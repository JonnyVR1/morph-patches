package p153l;

import android.opengl.GLES20;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public class rtf extends bs2 {

    /* JADX INFO: renamed from: d */
    private int f164811d;

    /* JADX INFO: renamed from: e */
    private int f164812e;

    /* JADX INFO: renamed from: f */
    private int f164813f;

    /* JADX INFO: renamed from: g */
    private float f164814g;

    /* JADX INFO: renamed from: i */
    private float f164815i;

    /* JADX INFO: renamed from: j */
    private float f164816j;

    /* JADX INFO: renamed from: Q1 */
    public void m183111Q1(float f) {
        this.f164814g = f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m183112R1(float f) {
        this.f164815i = f;
    }

    /* JADX INFO: renamed from: S1 */
    public void m183113S1(float f) {
        this.f164816j = f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform highp float iTime;\n uniform highp vec2 iResolution;\n uniform float count;\n uniform float offset;\n uniform float speedV;\n float steppedVal(float v, float steps){\n     return floor(v*steps)/steps;\n }\n float random1d(float n){\n     return fract(sin(n) * 43758.5453);\n }\n float noise1d(float p){\n     float fl = floor(p);\n     float fc = fract(p);\n     return mix(random1d(fl), random1d(fl + 1.0), fc);\n }\n const float TWO_PI = 6.283185307179586;\n void main() {\n     vec2 uv = textureCoordinate;\n     float time = iTime * 0.25;\n     float n = noise1d(uv.y * count + time * speedV * 3.0);\n     float ns = steppedVal(fract(n ),count) + 2.0;\n     float nsr = random1d(ns);\n     highp vec2 uvn = uv;\n     uvn.x += nsr * sin(time * TWO_PI + nsr * 20.0) * offset;\n     gl_FragColor = texture2D(inputImageTexture0, uvn);\n }";
    }

    @Override // p153l.bs2, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f164811d = GLES20.glGetUniformLocation(this.programHandle, "count");
        this.f164812e = GLES20.glGetUniformLocation(this.programHandle, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
        this.f164813f = GLES20.glGetUniformLocation(this.programHandle, "speedV");
    }

    @Override // p153l.bs2, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f164811d, this.f164814g);
        GLES20.glUniform1f(this.f164812e, this.f164815i);
        GLES20.glUniform1f(this.f164813f, this.f164816j);
    }
}
