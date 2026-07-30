package p149l;

import android.opengl.GLES20;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public class j9e extends xj10 {

    /* JADX INFO: renamed from: a */
    private float f116888a;

    /* JADX INFO: renamed from: b */
    private float f116889b;

    /* JADX INFO: renamed from: c */
    private float f116890c;

    /* JADX INFO: renamed from: d */
    private int f116891d;

    /* JADX INFO: renamed from: e */
    private int f116892e;

    /* JADX INFO: renamed from: f */
    private int f116893f;

    public j9e() {
        super(2);
        this.f116888a = 0.0f;
        this.f116889b = 1.0f;
        this.f116890c = 0.0f;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m140547Q1(boolean z) {
        this.f116890c = z ? 1.0f : 0.0f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m140548R1(float f) {
        this.f116889b = f;
    }

    /* JADX INFO: renamed from: S1 */
    public void m140549S1(float f) {
        this.f116888a = f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float offset;\nuniform float mixture;\nuniform float fullDown;\nvoid main(){\n  vec2 uv = textureCoordinate;\n  vec4 texColour2 = texture2D(inputImageTexture0,uv);\n  vec4 texColour = texture2D(inputImageTexture1,uv);\n  vec4 texColour3 = mix(texColour2,texColour,mixture);\n  if (uv.y < (1.0-offset)) {\n  gl_FragColor = texColour2;} else{\n  if (fullDown > 0.5){ \n   vec2 uv1 = vec2(uv.x, uv.y + offset - 1.0 );\n   texColour3 = texture2D(inputImageTexture1,uv1);\n  }\n  gl_FragColor = texColour3;}\n}\n";
    }

    @Override // p149l.xj10, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f116891d = GLES20.glGetUniformLocation(this.programHandle, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
        this.f116892e = GLES20.glGetUniformLocation(this.programHandle, "mixture");
        this.f116893f = GLES20.glGetUniformLocation(this.programHandle, "fullDown");
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f116891d, this.f116888a);
        GLES20.glUniform1f(this.f116892e, this.f116889b);
        GLES20.glUniform1f(this.f116893f, this.f116890c);
    }
}
