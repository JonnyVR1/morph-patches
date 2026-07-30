package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class jf5 extends jt2 {

    /* JADX INFO: renamed from: a */
    private float[] f120562a;

    /* JADX INFO: renamed from: b */
    private float f120563b;

    /* JADX INFO: renamed from: c */
    private int f120564c;

    /* JADX INFO: renamed from: d */
    private int f120565d;

    public jf5(float[] fArr, float f) {
        this.f120562a = fArr;
        f = f < 0.0f ? 0.0f : f;
        this.f120563b = f > 1.0f ? 1.0f : f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float u_Intensity;\nuniform mat4 u_ColorMatrix;\nvoid main(){\n   vec4 color = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 matrixResult = vec4(color.rgb, 1.0) * u_ColorMatrix;\n   vec4 colorResult = u_Intensity * matrixResult + (1.0 - u_Intensity) * color;\n   gl_FragColor = vec4(colorResult.rgb, color.a);\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f120564c = GLES20.glGetUniformLocation(this.programHandle, "u_ColorMatrix");
        this.f120565d = GLES20.glGetUniformLocation(this.programHandle, "u_Intensity");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniformMatrix4fv(this.f120564c, 1, false, this.f120562a, 0);
        GLES20.glUniform1f(this.f120565d, this.f120563b);
    }
}
