package p149l;

import android.opengl.GLES20;
import com.momo.mcamera.mask.BigEyeFilter;

/* JADX INFO: loaded from: classes7.dex */
public class eck0 extends wj10 {

    /* JADX INFO: renamed from: J */
    private int f90545J;

    /* JADX INFO: renamed from: K */
    private int f90546K;

    /* JADX INFO: renamed from: L */
    private float f90547L;

    /* JADX INFO: renamed from: M */
    private float f90548M;

    /* JADX INFO: renamed from: N */
    private String f90549N;

    public eck0() {
        super(2);
        this.f90545J = 0;
        this.f90546K = 0;
        this.f90547L = 0.0f;
        this.f90548M = 0.0f;
        this.f90549N = "mediump";
    }

    /* JADX INFO: renamed from: S */
    private String m115730S() {
        return " vec3 rgb2yuv(vec3 color) {\n            float y =  0.299 * color.r + 0.587 * color.g + 0.114 * color.b;\n            float u = -0.147 * color.r - 0.289 * color.g + 0.436 * color.b;\n            float v =  0.615 * color.r - 0.515 * color.g - 0.100 * color.b;\n            return vec3(y, u, v);\n        }\n";
    }

    /* JADX INFO: renamed from: V */
    private String m115731V() {
        return "vec3 yuv2rgb(vec3 color) {\n            float y = color.r; float u = color.g; float v = color.b;\n            float r = y + 1.14 * v;\n            float g = y - 0.39 * u - 0.58 * v;\n            float b = y + 2.03 * u;\n            return vec3(r, g, b);\n        }\n";
    }

    /* JADX INFO: renamed from: T */
    public void m115732T(float f) {
        this.f90548M = f;
    }

    /* JADX INFO: renamed from: U */
    public void m115733U(float f) {
        this.f90547L = f;
    }

    /* JADX INFO: renamed from: f */
    public void m115734f(String str) {
        this.f90549N = str;
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: p */
    public String mo95686p() {
        return "precision " + this.f90549N + " float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float threshold;\nuniform float scale;\n" + m115730S() + m115731V() + "void main(){\n   vec4 textureColor = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 blurColor = texture2D(inputImageTexture1,textureCoordinate);\n   vec3 textureYUV = rgb2yuv(textureColor.rgb);\n   vec3 blurYUV = rgb2yuv(blurColor.rgb);\n   if (abs(textureYUV.r - blurYUV.r) < threshold) {\n       gl_FragColor = textureColor;\n   } else {\n       float sharpenY = textureYUV.r * (1.0 + scale) - scale * blurYUV.r;\n       vec3 temp = yuv2rgb(vec3(sharpenY, textureYUV.gb));\n       gl_FragColor = vec4(temp, textureColor.a);\n   }\n}\n";
    }

    @Override // p149l.wj10, p149l.bcj
    /* JADX INFO: renamed from: u */
    public void mo95688u() {
        super.mo95688u();
        this.f90545J = GLES20.glGetUniformLocation(this.f74924d, "threshold");
        this.f90546K = GLES20.glGetUniformLocation(this.f74924d, BigEyeFilter.UNIFORM_SCALE);
    }

    @Override // p149l.wj10, p149l.bcj
    /* JADX INFO: renamed from: x */
    public void mo101089x() {
        super.mo101089x();
        GLES20.glUniform1f(this.f90545J, this.f90547L);
        GLES20.glUniform1f(this.f90546K, this.f90548M);
    }
}
