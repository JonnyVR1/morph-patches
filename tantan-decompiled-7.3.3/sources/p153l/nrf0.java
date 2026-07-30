package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class nrf0 extends hs10 {

    /* JADX INFO: renamed from: a */
    private int f143401a;

    /* JADX INFO: renamed from: b */
    private float f143402b;

    public nrf0(float f) {
        super(3);
        this.f143402b = f;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m164482Q1(float f) {
        synchronized (getLockObject()) {
            this.f143402b = f;
        }
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nvarying vec2 textureCoordinate;\nuniform float mixPercent;\nvoid main(){\n   vec4 image = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 toneCurvedImage = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 mask = texture2D(inputImageTexture2,textureCoordinate);\n    gl_FragColor = vec4(mix(image.rgb,toneCurvedImage.rgb,1.0 - mask.b*mixPercent),1.0);\n}\n";
    }

    @Override // p153l.hs10, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f143401a = GLES20.glGetUniformLocation(this.programHandle, "mixPercent");
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f143401a, this.f143402b);
    }

    public nrf0() {
        super(3);
    }
}
