package p003l;

import android.opengl.GLES20;
import android.text.TextUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class qs2 extends xj10 {

    /* JADX INFO: renamed from: a */
    private int f6682a;

    /* JADX INFO: renamed from: b */
    private int f6683b;

    /* JADX INFO: renamed from: c */
    private boolean f6684c;

    /* JADX INFO: renamed from: d */
    private boolean f6685d;

    /* JADX INFO: renamed from: e */
    private String f6686e;

    /* JADX INFO: renamed from: f */
    private float f6687f;

    /* JADX INFO: renamed from: g */
    protected float f6688g;

    /* JADX INFO: renamed from: i */
    protected float f6689i;

    /* JADX INFO: renamed from: j */
    private float f6690j;

    /* JADX INFO: renamed from: k */
    private float f6691k;

    /* JADX INFO: renamed from: l */
    private String f6692l;

    public qs2() {
        super(2);
        this.f6684c = false;
        this.f6685d = false;
        this.f6687f = 0.0f;
        this.f6688g = 0.04f;
        this.f6689i = 0.0f;
        this.f6690j = 1.0f;
        this.f6691k = 0.0f;
        this.f6692l = "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform float blend;\nuniform float alpha;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec4 base = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0.0) {     gl_FragColor = base; } else {     lowp vec4 overlayer = texture2D(inputImageTexture1,textureCoordinate) * alpha;\n          \n     gl_FragColor = overlayer * base + overlayer * (1.0 - base.a) + base * (1.0 - overlayer.a);\n}\n }";
    }

    /* JADX INFO: renamed from: Q1 */
    public void m7028Q1() {
        this.f6687f = 0.0f;
        this.f6688g = 0.04f;
        this.f6689i = 0.0f;
        this.f6690j = 1.0f;
        this.f6691k = 0.0f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m7029R1(float f) {
        this.f6687f = f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        if (this.f6685d) {
            return this.f6692l;
        }
        if (TextUtils.isEmpty(this.f6686e) || this.f6686e.equals("Normal")) {
            return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform float blend;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0.0) {     gl_FragColor = color2; }  else{   vec4 color1 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n }}\n";
        }
        String strM6273b = m33.m6273b(this.f6686e);
        return !TextUtils.isEmpty(strM6273b) ? strM6273b : "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform float blend;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0.0) {     gl_FragColor = color2; }  else{   vec4 color1 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n }}\n";
    }

    @Override // p003l.xj10, p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f6682a = GLES20.glGetUniformLocation(this.programHandle, "blend");
        this.f6683b = GLES20.glGetUniformLocation(this.programHandle, "alpha");
    }

    @Override // p003l.xj10, p003l.ccj
    public void passShaderValues() {
        this.f6689i += this.f6688g;
        super.passShaderValues();
        if (this.f6689i >= this.f6687f) {
            this.f6684c = true;
            float f = this.f6690j + this.f6691k;
            this.f6690j = f;
            if (f > 1.0f) {
                this.f6690j = 1.0f;
            }
        } else {
            this.f6684c = false;
        }
        GLES20.glUniform1f(this.f6682a, this.f6684c ? 1.0f : 0.0f);
        GLES20.glUniform1f(this.f6683b, this.f6690j);
    }

    public void setBlendType(String str) {
        this.f6686e = str;
    }
}
