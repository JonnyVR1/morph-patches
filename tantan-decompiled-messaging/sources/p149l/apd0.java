package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class apd0 extends ts2 {

    /* JADX INFO: renamed from: a */
    private float f71026a;

    /* JADX INFO: renamed from: b */
    private int f71027b;

    public apd0(float f) {
        m98108Q1(f);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m98108Q1(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.f71026a = f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float u_Saturation;\nconst vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\nvoid main(){\n   vec4 color = texture2D(inputImageTexture0,textureCoordinate);\n   float luminance = dot(color.rgb, luminanceWeighting);\n   vec3 greyScaleColor = vec3(luminance);\n   gl_FragColor = vec4(mix(greyScaleColor, color.rgb, u_Saturation), color.a);\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f71027b = GLES20.glGetUniformLocation(this.programHandle, "u_Saturation");
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f71027b, this.f71026a);
    }
}
