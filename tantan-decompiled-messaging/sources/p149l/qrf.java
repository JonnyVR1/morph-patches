package p149l;

import android.graphics.Color;
import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class qrf extends lr2 {

    /* JADX INFO: renamed from: d */
    private int f155986d;

    /* JADX INFO: renamed from: e */
    private int f155987e;

    /* JADX INFO: renamed from: f */
    private float[] f155988f;

    /* JADX INFO: renamed from: g */
    private float[] f155989g;

    /* JADX INFO: renamed from: Q1 */
    public void m175987Q1(int i) {
        this.f155989g = new float[]{Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f};
    }

    /* JADX INFO: renamed from: R1 */
    public void m175988R1(int i) {
        this.f155988f = new float[]{Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f};
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform highp vec3 lightColor;\n uniform highp vec3 darkColor;\n void main(){\n     highp vec2 uv = textureCoordinate;\n     vec4 color = texture2D(inputImageTexture0,fract(uv));\n     float luma = dot(color.rgb,vec3(0.299,0.587,0.114));\n     vec3 col = clamp(color.rgb,0.0,1.0);\n     col = mix(darkColor, lightColor,luma);\n     gl_FragColor = vec4(col,1.0);\n }";
    }

    @Override // p149l.lr2, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f155986d = GLES20.glGetUniformLocation(this.programHandle, "lightColor");
        this.f155987e = GLES20.glGetUniformLocation(this.programHandle, "darkColor");
    }

    @Override // p149l.lr2, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        int i = this.f155986d;
        float[] fArr = this.f155988f;
        GLES20.glUniform3f(i, fArr[0], fArr[1], fArr[2]);
        int i2 = this.f155987e;
        float[] fArr2 = this.f155989g;
        GLES20.glUniform3f(i2, fArr2[0], fArr2[1], fArr2[2]);
    }
}
