package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class qqq0 extends hs10 {

    /* JADX INFO: renamed from: a */
    private int f159029a;

    /* JADX INFO: renamed from: b */
    private int f159030b;

    /* JADX INFO: renamed from: c */
    private float f159031c;

    /* JADX INFO: renamed from: d */
    private float f159032d;

    /* JADX INFO: renamed from: e */
    private boolean f159033e;

    /* JADX INFO: renamed from: f */
    private int f159034f;

    public qqq0() {
        super(2);
        this.f159031c = 0.8f;
        this.f159032d = 0.0f;
        this.f159033e = false;
        this.f159034f = 25;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m177510Q1(boolean z) {
        this.f159033e = z;
        this.f159031c = 0.8f;
        this.f159032d = 0.0f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float shift;\n  uniform float mixShift;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec2 uv1 = scaleFromCenter(uv,shift);\n    vec3 color1 = texture2D(inputImageTexture1, uv1).rgb;\n    vec3 color2 = texture2D(inputImageTexture0, uv).rgb;\n    vec3 mixColor = mix(color1, color2, 1.0 -mixShift);\n    gl_FragColor = vec4(mixColor,1.0);\n}\n";
    }

    @Override // p153l.hs10, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f159029a = GLES20.glGetUniformLocation(this.programHandle, "shift");
        this.f159030b = GLES20.glGetUniformLocation(this.programHandle, "mixShift");
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f159033e) {
            float f = this.f159031c;
            int i = this.f159034f;
            float f2 = f + (0.4f / i);
            this.f159031c = f2;
            if (f2 >= 1.0d) {
                this.f159031c = 1.0f;
            }
            float f3 = this.f159032d + (1.0f / i);
            this.f159032d = f3;
            if (f3 >= 1.0d) {
                this.f159032d = 1.0f;
            }
        }
        GLES20.glUniform1f(this.f159029a, this.f159031c);
        GLES20.glUniform1f(this.f159030b, this.f159032d);
    }

    public void setFrameRate(int i) {
        this.f159034f = i;
    }
}
