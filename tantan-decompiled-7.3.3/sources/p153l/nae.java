package p153l;

import android.opengl.GLES20;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public class nae extends hs10 {

    /* JADX INFO: renamed from: a */
    private float f141003a;

    /* JADX INFO: renamed from: b */
    private float f141004b;

    /* JADX INFO: renamed from: c */
    private float f141005c;

    /* JADX INFO: renamed from: d */
    private int f141006d;

    /* JADX INFO: renamed from: e */
    private int f141007e;

    /* JADX INFO: renamed from: f */
    private int f141008f;

    public nae() {
        super(2);
        this.f141003a = 0.0f;
        this.f141004b = 1.0f;
        this.f141005c = 0.0f;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m162068Q1(boolean z) {
        this.f141005c = z ? 1.0f : 0.0f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m162069R1(float f) {
        this.f141004b = f;
    }

    /* JADX INFO: renamed from: S1 */
    public void m162070S1(float f) {
        this.f141003a = f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float offset;\nuniform float mixture;\nuniform float fullDown;\nvoid main(){\n  vec2 uv = textureCoordinate;\n  vec4 texColour2 = texture2D(inputImageTexture0,uv);\n  vec4 texColour = texture2D(inputImageTexture1,uv);\n  vec4 texColour3 = mix(texColour2,texColour,mixture);\n  if (uv.y < (1.0-offset)) {\n  gl_FragColor = texColour2;} else{\n  if (fullDown > 0.5){ \n   vec2 uv1 = vec2(uv.x, uv.y + offset - 1.0 );\n   texColour3 = texture2D(inputImageTexture1,uv1);\n  }\n  gl_FragColor = texColour3;}\n}\n";
    }

    @Override // p153l.hs10, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f141006d = GLES20.glGetUniformLocation(this.programHandle, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
        this.f141007e = GLES20.glGetUniformLocation(this.programHandle, "mixture");
        this.f141008f = GLES20.glGetUniformLocation(this.programHandle, "fullDown");
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f141006d, this.f141003a);
        GLES20.glUniform1f(this.f141007e, this.f141004b);
        GLES20.glUniform1f(this.f141008f, this.f141005c);
    }
}
