package p153l;

import android.opengl.GLES20;
import android.text.TextUtils;
import com.immomo.components.interfaces.IProcessOutput;

/* JADX INFO: loaded from: classes7.dex */
public class qjj0 extends is10 implements ruf {

    /* JADX INFO: renamed from: I */
    private int f157977I;

    /* JADX INFO: renamed from: J */
    private int f157978J;

    /* JADX INFO: renamed from: K */
    private int f157979K;

    /* JADX INFO: renamed from: L */
    private int f157980L;

    /* JADX INFO: renamed from: M */
    private int f157981M;

    /* JADX INFO: renamed from: N */
    private int f157982N;

    /* JADX INFO: renamed from: O */
    protected int f157983O;

    /* JADX INFO: renamed from: P */
    protected boolean f157984P;

    /* JADX INFO: renamed from: Q */
    protected boolean f157985Q;

    /* JADX INFO: renamed from: R */
    protected float[] f157986R;

    /* JADX INFO: renamed from: S */
    protected int f157987S;

    /* JADX INFO: renamed from: T */
    private IProcessOutput f157988T;

    /* JADX INFO: renamed from: U */
    private int f157989U;

    /* JADX INFO: renamed from: V */
    private String f157990V;

    /* JADX INFO: renamed from: W */
    private int f157991W;

    /* JADX INFO: renamed from: X */
    protected float f157992X;

    /* JADX INFO: renamed from: Y */
    private int f157993Y;

    public qjj0() {
        super(2);
        this.f157983O = 1;
        this.f157984P = false;
        this.f157985Q = false;
        this.f157987S = 5;
        this.f157989U = 0;
        this.f157991W = 1;
        this.f157992X = 1.0f;
    }

    /* JADX INFO: renamed from: R */
    public void m176834R(boolean z) {
        this.f157991W = z ? 1 : 0;
    }

    @Override // p153l.ruf
    /* JADX INFO: renamed from: d */
    public void mo102835d(IProcessOutput iProcessOutput) {
        if (iProcessOutput == null) {
            return;
        }
        this.f157988T = iProcessOutput;
        iProcessOutput.m19368b(0);
        m176834R(false);
    }

    @Override // p153l.is10, p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: f */
    public void mo96080f() {
        super.mo96080f();
        int i = this.f157989U;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: m */
    public String mo112466m() {
        if (this.f157984P) {
            return this.f157985Q ? "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nuniform int blend;\nvarying vec2 textureCoordinate;\n\nuniform float texelWidth;\nuniform float texelHeight;\n\nuniform int strokeRadius;\nuniform vec4 strokeColor;\nuniform int strokeEnabled;\nfloat stepWidth = 1.0;\n\nfloat intensityForEdge(vec2 center, vec2 step1) {\n    //bool isIntensity = false;\n    vec4 centerTex = texture2D(inputImageTexture3, center);\n    float intensity = centerTex.r;\n    for (int i = 0; i < strokeRadius; i++) {\n        vec2 left = center + vec2(step1.x * float(i), 0.0);\n        vec2 right = center + vec2(step1.x * -float(i), 0.0);\n        vec2 top = center + vec2(0.0, -step1.y * float(i));\n        vec2 bottom = center + vec2(0.0, +step1.y * float(i));\n        vec4 leftTex = texture2D( inputImageTexture3, left);\n        vec4 rightTex = texture2D( inputImageTexture3, right);\n        vec4 topTex = texture2D( inputImageTexture3, top);\n        vec4 bottomTex = texture2D( inputImageTexture3, bottom);\n        intensity = (intensity+(leftTex.r+rightTex.r+ topTex.r+ bottomTex.r)*(1.0-float(i)/float(strokeRadius)));\n    }\n    return intensity*float(strokeRadius);\n}\n\nvoid main(){\n vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0) {\n   gl_FragColor = color2;\n} else {   \n   vec2 step1 = vec2(stepWidth*texelWidth, stepWidth*texelHeight);\n   vec4 picture = texture2D(inputImageTexture1, textureCoordinate);\n\n   vec4 color1;\n   float intensity = intensityForEdge(textureCoordinate, step1);\n   //if (intensity > 0.0) {\n   //   color1 = strokeColor;\n   //} else {\n   //   color1 = picture;\n   //}\n   color1 = mix(strokeColor, picture , step(0.0, -intensity));\n   color1 = mix(picture, color1, float(strokeEnabled));\n   //vec4 colorSobel = texture2D(inputImageTexture3,textureCoordinate);\n   //float c1AlphaDivisor = color1.a + step(color1.a, 0.0);\n   //color1.rgb = color1.rgb/c1AlphaDivisor;\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   vec4 colorAlpha = texture2D(inputImageTexture2, textureCoordinate);\n   color1 = vec4(color1.rgb, color1.a * (colorAlpha.r > 0.9 ? 0.0 : (1.0 - colorAlpha.r * colorAlpha.r* colorAlpha.r)));\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n   }\n }" : "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nuniform int blend;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0) {     gl_FragColor = color2; }  else{   vec4 color1 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   vec4 colorAlpha = texture2D(inputImageTexture2, textureCoordinate);\n   color1 = vec4(color1.rgb, color1.a * (colorAlpha.r > 0.9 ? 0.0 : (1.0 - colorAlpha.r * colorAlpha.r* colorAlpha.r)));\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n }}\n";
        }
        if (TextUtils.isEmpty(this.f157990V)) {
            return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform int blend;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0) {     gl_FragColor = color2; }  else{   vec4 color1 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n }}\n";
        }
        String strM114082b = d43.m114082b(this.f157990V);
        return !TextUtils.isEmpty(strM114082b) ? strM114082b : "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform int blend;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n if(blend==0) {     gl_FragColor = color2; }  else{   vec4 color1 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n }}\n";
    }

    @Override // p153l.is10, p153l.xej
    /* JADX INFO: renamed from: t */
    public void mo112468t() {
        super.mo112468t();
        this.f157977I = GLES20.glGetUniformLocation(this.f193943d, "blend");
        if (this.f157984P && this.f157985Q) {
            this.f157978J = GLES20.glGetUniformLocation(this.f193943d, "texelWidth");
            this.f157979K = GLES20.glGetUniformLocation(this.f193943d, "texelHeight");
            this.f157980L = GLES20.glGetUniformLocation(this.f193943d, "strokeRadius");
            this.f157981M = GLES20.glGetUniformLocation(this.f193943d, "strokeColor");
            this.f157982N = GLES20.glGetUniformLocation(this.f193943d, "strokeEnabled");
        }
        this.f157993Y = GLES20.glGetUniformLocation(this.f193943d, "intensity");
    }

    @Override // p153l.is10, p153l.xej
    /* JADX INFO: renamed from: w */
    public void mo112469w() {
        super.mo112469w();
        GLES20.glUniform1i(this.f157977I, this.f157983O);
        if (this.f157984P && this.f157985Q) {
            GLES20.glUniform1f(this.f157978J, 1.0f / m210702r());
            GLES20.glUniform1f(this.f157979K, 1.0f / m210701n());
            GLES20.glUniform1i(this.f157980L, this.f157987S);
            int i = this.f157981M;
            float[] fArr = this.f157986R;
            GLES20.glUniform4f(i, fArr[0], fArr[1], fArr[2], fArr[3]);
            GLES20.glUniform1i(this.f157982N, this.f157991W);
        }
        GLES20.glUniform1f(this.f157993Y, this.f157992X);
    }
}
