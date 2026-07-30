package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class cxd0 extends jt2 {

    /* JADX INFO: renamed from: a */
    private float f84210a;

    /* JADX INFO: renamed from: b */
    private int f84211b;

    public cxd0(float f) {
        m112971Q1(f);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m112971Q1(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.f84210a = f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float u_Saturation;\nconst vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\nvoid main(){\n   vec4 color = texture2D(inputImageTexture0,textureCoordinate);\n   float luminance = dot(color.rgb, luminanceWeighting);\n   vec3 greyScaleColor = vec3(luminance);\n   gl_FragColor = vec4(mix(greyScaleColor, color.rgb, u_Saturation), color.a);\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f84211b = GLES20.glGetUniformLocation(this.programHandle, "u_Saturation");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f84211b, this.f84210a);
    }
}
