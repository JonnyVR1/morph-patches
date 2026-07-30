package p149l;

import android.opengl.GLES20;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class qs2 extends xj10 {

    /* JADX INFO: renamed from: a */
    private int f156086a;

    /* JADX INFO: renamed from: b */
    private int f156087b;

    /* JADX INFO: renamed from: c */
    private boolean f156088c;

    /* JADX INFO: renamed from: d */
    private boolean f156089d;

    /* JADX INFO: renamed from: e */
    private String f156090e;

    /* JADX INFO: renamed from: f */
    private float f156091f;

    /* JADX INFO: renamed from: g */
    protected float f156092g;

    /* JADX INFO: renamed from: i */
    protected float f156093i;

    /* JADX INFO: renamed from: j */
    private float f156094j;

    /* JADX INFO: renamed from: k */
    private float f156095k;

    /* JADX INFO: renamed from: l */
    private String f156096l;

    public qs2() {
        super(2);
        this.f156088c = false;
        this.f156089d = false;
        this.f156091f = 0.0f;
        this.f156092g = 0.04f;
        this.f156093i = 0.0f;
        this.f156094j = 1.0f;
        this.f156095k = 0.0f;
        this.f156096l = "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform float blend;\nuniform float alpha;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec4 base = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0.0) {     gl_FragColor = base; } else {     lowp vec4 overlayer = texture2D(inputImageTexture1,textureCoordinate) * alpha;\n          \n     gl_FragColor = overlayer * base + overlayer * (1.0 - base.a) + base * (1.0 - overlayer.a);\n}\n }";
    }

    /* JADX INFO: renamed from: Q1 */
    public void m176145Q1() {
        this.f156091f = 0.0f;
        this.f156092g = 0.04f;
        this.f156093i = 0.0f;
        this.f156094j = 1.0f;
        this.f156095k = 0.0f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m176146R1(float f) {
        this.f156091f = f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        if (this.f156089d) {
            return this.f156096l;
        }
        if (TextUtils.isEmpty(this.f156090e) || this.f156090e.equals("Normal")) {
            return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform float blend;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0.0) {     gl_FragColor = color2; }  else{   vec4 color1 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n }}\n";
        }
        String strM152810b = m33.m152810b(this.f156090e);
        return !TextUtils.isEmpty(strM152810b) ? strM152810b : "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform float blend;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0.0) {     gl_FragColor = color2; }  else{   vec4 color1 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n }}\n";
    }

    @Override // p149l.xj10, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f156086a = GLES20.glGetUniformLocation(this.programHandle, "blend");
        this.f156087b = GLES20.glGetUniformLocation(this.programHandle, "alpha");
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        this.f156093i += this.f156092g;
        super.passShaderValues();
        if (this.f156093i >= this.f156091f) {
            this.f156088c = true;
            float f = this.f156094j + this.f156095k;
            this.f156094j = f;
            if (f > 1.0f) {
                this.f156094j = 1.0f;
            }
        } else {
            this.f156088c = false;
        }
        GLES20.glUniform1f(this.f156086a, this.f156088c ? 1.0f : 0.0f);
        GLES20.glUniform1f(this.f156087b, this.f156094j);
    }

    public void setBlendType(String str) {
        this.f156090e = str;
    }
}
