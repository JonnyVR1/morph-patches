package p153l;

import android.graphics.Color;
import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class xsf extends bs2 {

    /* JADX INFO: renamed from: d */
    private int f196092d;

    /* JADX INFO: renamed from: e */
    private int f196093e;

    /* JADX INFO: renamed from: f */
    private float[] f196094f;

    /* JADX INFO: renamed from: g */
    private float[] f196095g;

    /* JADX INFO: renamed from: Q1 */
    public void m212974Q1(int i) {
        this.f196095g = new float[]{Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f};
    }

    /* JADX INFO: renamed from: R1 */
    public void m212975R1(int i) {
        this.f196094f = new float[]{Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f};
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform highp vec3 lightColor;\n uniform highp vec3 darkColor;\n void main(){\n     highp vec2 uv = textureCoordinate;\n     vec4 color = texture2D(inputImageTexture0,fract(uv));\n     float luma = dot(color.rgb,vec3(0.299,0.587,0.114));\n     vec3 col = clamp(color.rgb,0.0,1.0);\n     col = mix(darkColor, lightColor,luma);\n     gl_FragColor = vec4(col,1.0);\n }";
    }

    @Override // p153l.bs2, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f196092d = GLES20.glGetUniformLocation(this.programHandle, "lightColor");
        this.f196093e = GLES20.glGetUniformLocation(this.programHandle, "darkColor");
    }

    @Override // p153l.bs2, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        int i = this.f196092d;
        float[] fArr = this.f196094f;
        GLES20.glUniform3f(i, fArr[0], fArr[1], fArr[2]);
        int i2 = this.f196093e;
        float[] fArr2 = this.f196095g;
        GLES20.glUniform3f(i2, fArr2[0], fArr2[1], fArr2[2]);
    }
}
