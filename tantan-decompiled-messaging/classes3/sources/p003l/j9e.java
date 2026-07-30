package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class j9e extends xj10 {

    /* JADX INFO: renamed from: a */
    private float f4589a;

    /* JADX INFO: renamed from: b */
    private float f4590b;

    /* JADX INFO: renamed from: c */
    private float f4591c;

    /* JADX INFO: renamed from: d */
    private int f4592d;

    /* JADX INFO: renamed from: e */
    private int f4593e;

    /* JADX INFO: renamed from: f */
    private int f4594f;

    public j9e() {
        super(2);
        this.f4589a = 0.0f;
        this.f4590b = 1.0f;
        this.f4591c = 0.0f;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m5310Q1(boolean z) {
        this.f4591c = z ? 1.0f : 0.0f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m5311R1(float f) {
        this.f4590b = f;
    }

    /* JADX INFO: renamed from: S1 */
    public void m5312S1(float f) {
        this.f4589a = f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float offset;\nuniform float mixture;\nuniform float fullDown;\nvoid main(){\n  vec2 uv = textureCoordinate;\n  vec4 texColour2 = texture2D(inputImageTexture0,uv);\n  vec4 texColour = texture2D(inputImageTexture1,uv);\n  vec4 texColour3 = mix(texColour2,texColour,mixture);\n  if (uv.y < (1.0-offset)) {\n  gl_FragColor = texColour2;} else{\n  if (fullDown > 0.5){ \n   vec2 uv1 = vec2(uv.x, uv.y + offset - 1.0 );\n   texColour3 = texture2D(inputImageTexture1,uv1);\n  }\n  gl_FragColor = texColour3;}\n}\n";
    }

    @Override // p003l.xj10, p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f4592d = GLES20.glGetUniformLocation(this.programHandle, "offset");
        this.f4593e = GLES20.glGetUniformLocation(this.programHandle, "mixture");
        this.f4594f = GLES20.glGetUniformLocation(this.programHandle, "fullDown");
    }

    @Override // p003l.xj10, p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f4592d, this.f4589a);
        GLES20.glUniform1f(this.f4593e, this.f4590b);
        GLES20.glUniform1f(this.f4594f, this.f4591c);
    }
}
