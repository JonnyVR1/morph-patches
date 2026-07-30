package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class je5 extends ts2 {

    /* JADX INFO: renamed from: a */
    private float[] f117474a;

    /* JADX INFO: renamed from: b */
    private float f117475b;

    /* JADX INFO: renamed from: c */
    private int f117476c;

    /* JADX INFO: renamed from: d */
    private int f117477d;

    public je5(float[] fArr, float f) {
        this.f117474a = fArr;
        f = f < 0.0f ? 0.0f : f;
        this.f117475b = f > 1.0f ? 1.0f : f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float u_Intensity;\nuniform mat4 u_ColorMatrix;\nvoid main(){\n   vec4 color = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 matrixResult = vec4(color.rgb, 1.0) * u_ColorMatrix;\n   vec4 colorResult = u_Intensity * matrixResult + (1.0 - u_Intensity) * color;\n   gl_FragColor = vec4(colorResult.rgb, color.a);\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f117476c = GLES20.glGetUniformLocation(this.programHandle, "u_ColorMatrix");
        this.f117477d = GLES20.glGetUniformLocation(this.programHandle, "u_Intensity");
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniformMatrix4fv(this.f117476c, 1, false, this.f117474a, 0);
        GLES20.glUniform1f(this.f117477d, this.f117475b);
    }
}
