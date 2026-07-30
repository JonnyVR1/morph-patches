package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class je5 extends ts2 {

    /* JADX INFO: renamed from: a */
    private float[] f4627a;

    /* JADX INFO: renamed from: b */
    private float f4628b;

    /* JADX INFO: renamed from: c */
    private int f4629c;

    /* JADX INFO: renamed from: d */
    private int f4630d;

    public je5(float[] fArr, float f) {
        this.f4627a = fArr;
        f = f < 0.0f ? 0.0f : f;
        this.f4628b = f > 1.0f ? 1.0f : f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float u_Intensity;\nuniform mat4 u_ColorMatrix;\nvoid main(){\n   vec4 color = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 matrixResult = vec4(color.rgb, 1.0) * u_ColorMatrix;\n   vec4 colorResult = u_Intensity * matrixResult + (1.0 - u_Intensity) * color;\n   gl_FragColor = vec4(colorResult.rgb, color.a);\n}\n";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f4629c = GLES20.glGetUniformLocation(this.programHandle, "u_ColorMatrix");
        this.f4630d = GLES20.glGetUniformLocation(this.programHandle, "u_Intensity");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniformMatrix4fv(this.f4629c, 1, false, this.f4627a, 0);
        GLES20.glUniform1f(this.f4630d, this.f4628b);
    }
}
