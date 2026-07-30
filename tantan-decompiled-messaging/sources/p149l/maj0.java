package p149l;

import android.opengl.GLES20;
import android.text.TextUtils;
import com.immomo.components.interfaces.IProcessOutput;

/* JADX INFO: loaded from: classes7.dex */
public class maj0 extends yj10 implements dtf {

    /* JADX INFO: renamed from: I */
    private int f132917I;

    /* JADX INFO: renamed from: J */
    private int f132918J;

    /* JADX INFO: renamed from: K */
    private int f132919K;

    /* JADX INFO: renamed from: L */
    private int f132920L;

    /* JADX INFO: renamed from: M */
    private int f132921M;

    /* JADX INFO: renamed from: N */
    private int f132922N;

    /* JADX INFO: renamed from: O */
    protected int f132923O;

    /* JADX INFO: renamed from: P */
    protected boolean f132924P;

    /* JADX INFO: renamed from: Q */
    protected boolean f132925Q;

    /* JADX INFO: renamed from: R */
    protected float[] f132926R;

    /* JADX INFO: renamed from: S */
    protected int f132927S;

    /* JADX INFO: renamed from: T */
    private IProcessOutput f132928T;

    /* JADX INFO: renamed from: U */
    private int f132929U;

    /* JADX INFO: renamed from: V */
    private String f132930V;

    /* JADX INFO: renamed from: W */
    private int f132931W;

    /* JADX INFO: renamed from: X */
    protected float f132932X;

    /* JADX INFO: renamed from: Y */
    private int f132933Y;

    public maj0() {
        super(2);
        this.f132923O = 1;
        this.f132924P = false;
        this.f132925Q = false;
        this.f132927S = 5;
        this.f132929U = 0;
        this.f132931W = 1;
        this.f132932X = 1.0f;
    }

    /* JADX INFO: renamed from: R */
    public void m153821R(boolean z) {
        this.f132931W = z ? 1 : 0;
    }

    @Override // p149l.dtf
    /* JADX INFO: renamed from: d */
    public void mo104314d(IProcessOutput iProcessOutput) {
        if (iProcessOutput == null) {
            return;
        }
        this.f132928T = iProcessOutput;
        iProcessOutput.m18291b(0);
        m153821R(false);
    }

    @Override // p149l.yj10, p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: f */
    public void mo102038f() {
        super.mo102038f();
        int i = this.f132929U;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: m */
    public String mo102573m() {
        if (this.f132924P) {
            return this.f132925Q ? "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nuniform int blend;\nvarying vec2 textureCoordinate;\n\nuniform float texelWidth;\nuniform float texelHeight;\n\nuniform int strokeRadius;\nuniform vec4 strokeColor;\nuniform int strokeEnabled;\nfloat stepWidth = 1.0;\n\nfloat intensityForEdge(vec2 center, vec2 step1) {\n    //bool isIntensity = false;\n    vec4 centerTex = texture2D(inputImageTexture3, center);\n    float intensity = centerTex.r;\n    for (int i = 0; i < strokeRadius; i++) {\n        vec2 left = center + vec2(step1.x * float(i), 0.0);\n        vec2 right = center + vec2(step1.x * -float(i), 0.0);\n        vec2 top = center + vec2(0.0, -step1.y * float(i));\n        vec2 bottom = center + vec2(0.0, +step1.y * float(i));\n        vec4 leftTex = texture2D( inputImageTexture3, left);\n        vec4 rightTex = texture2D( inputImageTexture3, right);\n        vec4 topTex = texture2D( inputImageTexture3, top);\n        vec4 bottomTex = texture2D( inputImageTexture3, bottom);\n        intensity = (intensity+(leftTex.r+rightTex.r+ topTex.r+ bottomTex.r)*(1.0-float(i)/float(strokeRadius)));\n    }\n    return intensity*float(strokeRadius);\n}\n\nvoid main(){\n vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0) {\n   gl_FragColor = color2;\n} else {   \n   vec2 step1 = vec2(stepWidth*texelWidth, stepWidth*texelHeight);\n   vec4 picture = texture2D(inputImageTexture1, textureCoordinate);\n\n   vec4 color1;\n   float intensity = intensityForEdge(textureCoordinate, step1);\n   //if (intensity > 0.0) {\n   //   color1 = strokeColor;\n   //} else {\n   //   color1 = picture;\n   //}\n   color1 = mix(strokeColor, picture , step(0.0, -intensity));\n   color1 = mix(picture, color1, float(strokeEnabled));\n   //vec4 colorSobel = texture2D(inputImageTexture3,textureCoordinate);\n   //float c1AlphaDivisor = color1.a + step(color1.a, 0.0);\n   //color1.rgb = color1.rgb/c1AlphaDivisor;\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   vec4 colorAlpha = texture2D(inputImageTexture2, textureCoordinate);\n   color1 = vec4(color1.rgb, color1.a * (colorAlpha.r > 0.9 ? 0.0 : (1.0 - colorAlpha.r * colorAlpha.r* colorAlpha.r)));\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n   }\n }" : "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nuniform int blend;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0) {     gl_FragColor = color2; }  else{   vec4 color1 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   vec4 colorAlpha = texture2D(inputImageTexture2, textureCoordinate);\n   color1 = vec4(color1.rgb, color1.a * (colorAlpha.r > 0.9 ? 0.0 : (1.0 - colorAlpha.r * colorAlpha.r* colorAlpha.r)));\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n }}\n";
        }
        if (TextUtils.isEmpty(this.f132930V)) {
            return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform int blend;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0) {     gl_FragColor = color2; }  else{   vec4 color1 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n }}\n";
        }
        String strM157700b = n33.m157700b(this.f132930V);
        return !TextUtils.isEmpty(strM157700b) ? strM157700b : "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform int blend;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0) {     gl_FragColor = color2; }  else{   vec4 color1 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n }}\n";
    }

    @Override // p149l.yj10, p149l.dcj
    /* JADX INFO: renamed from: t */
    public void mo110707t() {
        super.mo110707t();
        this.f132917I = GLES20.glGetUniformLocation(this.f85418d, "blend");
        if (this.f132924P && this.f132925Q) {
            this.f132918J = GLES20.glGetUniformLocation(this.f85418d, "texelWidth");
            this.f132919K = GLES20.glGetUniformLocation(this.f85418d, "texelHeight");
            this.f132920L = GLES20.glGetUniformLocation(this.f85418d, "strokeRadius");
            this.f132921M = GLES20.glGetUniformLocation(this.f85418d, "strokeColor");
            this.f132922N = GLES20.glGetUniformLocation(this.f85418d, "strokeEnabled");
        }
        this.f132933Y = GLES20.glGetUniformLocation(this.f85418d, "intensity");
    }

    @Override // p149l.yj10, p149l.dcj
    /* JADX INFO: renamed from: w */
    public void mo110710w() {
        super.mo110710w();
        GLES20.glUniform1i(this.f132917I, this.f132923O);
        if (this.f132924P && this.f132925Q) {
            GLES20.glUniform1f(this.f132918J, 1.0f / m110705r());
            GLES20.glUniform1f(this.f132919K, 1.0f / m110701n());
            GLES20.glUniform1i(this.f132920L, this.f132927S);
            int i = this.f132921M;
            float[] fArr = this.f132926R;
            GLES20.glUniform4f(i, fArr[0], fArr[1], fArr[2], fArr[3]);
            GLES20.glUniform1i(this.f132922N, this.f132931W);
        }
        GLES20.glUniform1f(this.f132933Y, this.f132932X);
    }
}
