package p149l;

import android.graphics.Color;
import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class prf extends lr2 {

    /* JADX INFO: renamed from: d */
    private int f150877d;

    /* JADX INFO: renamed from: e */
    private int f150878e;

    /* JADX INFO: renamed from: f */
    private float[] f150879f;

    /* JADX INFO: renamed from: g */
    private float[] f150880g;

    public prf() {
        m171000R1(new float[]{Color.red(-914136) / 255.0f, Color.green(-914136) / 255.0f, Color.blue(-914136) / 255.0f, Color.red(-2100723) / 255.0f, Color.green(-2100723) / 255.0f, Color.blue(-2100723) / 255.0f, Color.red(-13574166) / 255.0f, Color.green(-13574166) / 255.0f, Color.blue(-13574166) / 255.0f, Color.red(-1424423) / 255.0f, Color.green(-1424423) / 255.0f, Color.blue(-1424423) / 255.0f});
        m170999Q1(new float[]{Color.red(-15000794) / 255.0f, Color.green(-15000794) / 255.0f, Color.blue(-15000794) / 255.0f, Color.red(-16053433) / 255.0f, Color.green(-16053433) / 255.0f, Color.blue(-16053433) / 255.0f, Color.red(-16690862) / 255.0f, Color.green(-16690862) / 255.0f, Color.blue(-16690862) / 255.0f, Color.red(-14082261) / 255.0f, Color.green(-14082261) / 255.0f, Color.blue(-14082261) / 255.0f});
    }

    /* JADX INFO: renamed from: Q1 */
    public void m170999Q1(float[] fArr) {
        this.f150880g = fArr;
    }

    /* JADX INFO: renamed from: R1 */
    public void m171000R1(float[] fArr) {
        this.f150879f = fArr;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform highp float lightColors[12];\n uniform highp float darkColors[12];\n highp vec4 colorMatch(highp vec2 uv, highp vec3 lightColor, highp vec3 darkColor) {\n     vec4 color = texture2D(inputImageTexture0,fract(uv));\n     float luma = dot(color.rgb,vec3(0.299,0.587,0.114));\n     vec3 col = clamp(color.rgb,0.0,1.0);\n     col = mix(darkColor, lightColor,luma);\n     return vec4(col,1.0);\n }\n void main() {\n     highp vec2 uv = textureCoordinate;\n     uv *= 2.0;\n     int i = int(floor(uv.x)) + int(floor(uv.y)) * 2;\n     vec3 lightColor = vec3(lightColors[0 + i * 3], lightColors[1+ i * 3], lightColors[2 + i * 3]);\n     vec3 darkColor = vec3(darkColors[0 + i * 3], darkColors[1 + i * 3], darkColors[2 + i * 3]);\n     gl_FragColor = colorMatch(fract(uv), lightColor, darkColor);\n }\n";
    }

    @Override // p149l.lr2, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f150877d = GLES20.glGetUniformLocation(this.programHandle, "lightColors");
        this.f150878e = GLES20.glGetUniformLocation(this.programHandle, "darkColors");
    }

    @Override // p149l.lr2, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1fv(this.f150877d, 12, this.f150879f, 0);
        GLES20.glUniform1fv(this.f150878e, 12, this.f150880g, 0);
    }
}
