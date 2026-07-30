package p153l;

import android.opengl.GLES20;
import com.momo.mcamera.mask.BigEyeFilter;

/* JADX INFO: loaded from: classes7.dex */
public class klk0 extends gs10 {

    /* JADX INFO: renamed from: J */
    private int f127390J;

    /* JADX INFO: renamed from: K */
    private int f127391K;

    /* JADX INFO: renamed from: L */
    private float f127392L;

    /* JADX INFO: renamed from: M */
    private float f127393M;

    /* JADX INFO: renamed from: N */
    private String f127394N;

    public klk0() {
        super(2);
        this.f127390J = 0;
        this.f127391K = 0;
        this.f127392L = 0.0f;
        this.f127393M = 0.0f;
        this.f127394N = "mediump";
    }

    /* JADX INFO: renamed from: S */
    private String m150386S() {
        return " vec3 rgb2yuv(vec3 color) {\n            float y =  0.299 * color.r + 0.587 * color.g + 0.114 * color.b;\n            float u = -0.147 * color.r - 0.289 * color.g + 0.436 * color.b;\n            float v =  0.615 * color.r - 0.515 * color.g - 0.100 * color.b;\n            return vec3(y, u, v);\n        }\n";
    }

    /* JADX INFO: renamed from: V */
    private String m150387V() {
        return "vec3 yuv2rgb(vec3 color) {\n            float y = color.r; float u = color.g; float v = color.b;\n            float r = y + 1.14 * v;\n            float g = y - 0.39 * u - 0.58 * v;\n            float b = y + 2.03 * u;\n            return vec3(r, g, b);\n        }\n";
    }

    /* JADX INFO: renamed from: T */
    public void m150388T(float f) {
        this.f127393M = f;
    }

    /* JADX INFO: renamed from: U */
    public void m150389U(float f) {
        this.f127392L = f;
    }

    /* JADX INFO: renamed from: f */
    public void m150390f(String str) {
        this.f127394N = str;
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: p */
    public String mo97356p() {
        return "precision " + this.f127394N + " float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float threshold;\nuniform float scale;\n" + m150386S() + m150387V() + "void main(){\n   vec4 textureColor = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 blurColor = texture2D(inputImageTexture1,textureCoordinate);\n   vec3 textureYUV = rgb2yuv(textureColor.rgb);\n   vec3 blurYUV = rgb2yuv(blurColor.rgb);\n   if (abs(textureYUV.r - blurYUV.r) < threshold) {\n       gl_FragColor = textureColor;\n   } else {\n       float sharpenY = textureYUV.r * (1.0 + scale) - scale * blurYUV.r;\n       vec3 temp = yuv2rgb(vec3(sharpenY, textureYUV.gb));\n       gl_FragColor = vec4(temp, textureColor.a);\n   }\n}\n";
    }

    @Override // p153l.gs10, p153l.vej
    /* JADX INFO: renamed from: u */
    public void mo97358u() {
        super.mo97358u();
        this.f127390J = GLES20.glGetUniformLocation(this.f183782d, "threshold");
        this.f127391K = GLES20.glGetUniformLocation(this.f183782d, BigEyeFilter.UNIFORM_SCALE);
    }

    @Override // p153l.gs10, p153l.vej
    /* JADX INFO: renamed from: x */
    public void mo97359x() {
        super.mo97359x();
        GLES20.glUniform1f(this.f127390J, this.f127392L);
        GLES20.glUniform1f(this.f127391K, this.f127393M);
    }
}
