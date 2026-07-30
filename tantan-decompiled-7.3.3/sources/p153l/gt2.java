package p153l;

import android.opengl.GLES20;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class gt2 extends hs10 {

    /* JADX INFO: renamed from: a */
    private int f106366a;

    /* JADX INFO: renamed from: b */
    private int f106367b;

    /* JADX INFO: renamed from: c */
    private boolean f106368c;

    /* JADX INFO: renamed from: d */
    private boolean f106369d;

    /* JADX INFO: renamed from: e */
    private String f106370e;

    /* JADX INFO: renamed from: f */
    private float f106371f;

    /* JADX INFO: renamed from: g */
    protected float f106372g;

    /* JADX INFO: renamed from: i */
    protected float f106373i;

    /* JADX INFO: renamed from: j */
    private float f106374j;

    /* JADX INFO: renamed from: k */
    private float f106375k;

    /* JADX INFO: renamed from: l */
    private String f106376l;

    public gt2() {
        super(2);
        this.f106368c = false;
        this.f106369d = false;
        this.f106371f = 0.0f;
        this.f106372g = 0.04f;
        this.f106373i = 0.0f;
        this.f106374j = 1.0f;
        this.f106375k = 0.0f;
        this.f106376l = "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform float blend;\nuniform float alpha;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec4 base = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0.0) {     gl_FragColor = base; } else {     lowp vec4 overlayer = texture2D(inputImageTexture1,textureCoordinate) * alpha;\n          \n     gl_FragColor = overlayer * base + overlayer * (1.0 - base.a) + base * (1.0 - overlayer.a);\n}\n }";
    }

    /* JADX INFO: renamed from: Q1 */
    public void m132193Q1() {
        this.f106371f = 0.0f;
        this.f106372g = 0.04f;
        this.f106373i = 0.0f;
        this.f106374j = 1.0f;
        this.f106375k = 0.0f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m132194R1(float f) {
        this.f106371f = f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        if (this.f106369d) {
            return this.f106376l;
        }
        if (TextUtils.isEmpty(this.f106370e) || this.f106370e.equals("Normal")) {
            return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform float blend;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0.0) {     gl_FragColor = color2; }  else{   vec4 color1 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n }}\n";
        }
        String strM107825b = c43.m107825b(this.f106370e);
        return !TextUtils.isEmpty(strM107825b) ? strM107825b : "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform float blend;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0.0) {     gl_FragColor = color2; }  else{   vec4 color1 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n }}\n";
    }

    @Override // p153l.hs10, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f106366a = GLES20.glGetUniformLocation(this.programHandle, "blend");
        this.f106367b = GLES20.glGetUniformLocation(this.programHandle, "alpha");
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        this.f106373i += this.f106372g;
        super.passShaderValues();
        if (this.f106373i >= this.f106371f) {
            this.f106368c = true;
            float f = this.f106374j + this.f106375k;
            this.f106374j = f;
            if (f > 1.0f) {
                this.f106374j = 1.0f;
            }
        } else {
            this.f106368c = false;
        }
        GLES20.glUniform1f(this.f106366a, this.f106368c ? 1.0f : 0.0f);
        GLES20.glUniform1f(this.f106367b, this.f106374j);
    }

    public void setBlendType(String str) {
        this.f106370e = str;
    }
}
