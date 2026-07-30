package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class apd0 extends ts2 {

    /* JADX INFO: renamed from: a */
    private float f2250a;

    /* JADX INFO: renamed from: b */
    private int f2251b;

    public apd0(float f) {
        m2906Q1(f);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m2906Q1(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.f2250a = f;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float u_Saturation;\nconst vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\nvoid main(){\n   vec4 color = texture2D(inputImageTexture0,textureCoordinate);\n   float luminance = dot(color.rgb, luminanceWeighting);\n   vec3 greyScaleColor = vec3(luminance);\n   gl_FragColor = vec4(mix(greyScaleColor, color.rgb, u_Saturation), color.a);\n}\n";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f2251b = GLES20.glGetUniformLocation(this.programHandle, "u_Saturation");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f2251b, this.f2250a);
    }
}
