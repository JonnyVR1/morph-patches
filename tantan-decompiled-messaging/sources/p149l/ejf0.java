package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class ejf0 extends xj10 {

    /* JADX INFO: renamed from: a */
    private int f91718a;

    /* JADX INFO: renamed from: b */
    private float f91719b;

    public ejf0(float f) {
        super(3);
        this.f91719b = f;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m116840Q1(float f) {
        synchronized (getLockObject()) {
            this.f91719b = f;
        }
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nvarying vec2 textureCoordinate;\nuniform float mixPercent;\nvoid main(){\n   vec4 image = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 toneCurvedImage = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 mask = texture2D(inputImageTexture2,textureCoordinate);\n    gl_FragColor = vec4(mix(image.rgb,toneCurvedImage.rgb,1.0 - mask.b*mixPercent),1.0);\n}\n";
    }

    @Override // p149l.xj10, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f91718a = GLES20.glGetUniformLocation(this.programHandle, "mixPercent");
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f91718a, this.f91719b);
    }

    public ejf0() {
        super(3);
    }
}
