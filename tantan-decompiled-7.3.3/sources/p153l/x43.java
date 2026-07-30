package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class x43 extends jt2 {

    /* JADX INFO: renamed from: a */
    private int f192328a;

    /* JADX INFO: renamed from: b */
    protected float f192329b = 0.04f;

    /* JADX INFO: renamed from: c */
    protected float f192330c = 0.0f;

    /* JADX INFO: renamed from: d */
    private float f192331d = 10.0f;

    /* JADX INFO: renamed from: e */
    private float f192332e = 8.0f;

    /* JADX INFO: renamed from: Q1 */
    public void m209299Q1(float f) {
        this.f192332e = f;
    }

    /* JADX INFO: renamed from: R1 */
    public synchronized void m209300R1() {
        this.f192329b = 0.04f;
        this.f192330c = 0.0f;
        this.f192331d = 10.0f;
        this.f192332e = 0.0f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n  uniform float grad;\nvoid main(){\n    vec2 uv = textureCoordinate;\n    gl_FragColor = texture2D(inputImageTexture0,uv, grad);\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f192328a = GLES20.glGetUniformLocation(this.programHandle, "grad");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glTexParameterf(3553, 10240, 9987.0f);
        GLES20.glTexParameterf(3553, 10241, 9987.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glGenerateMipmap(3553);
        this.f192330c += this.f192329b;
        super.passShaderValues();
        if (this.f192330c >= this.f192332e) {
            float f = this.f192331d - 1.0f;
            this.f192331d = f;
            if (f < 0.0f) {
                this.f192331d = 0.0f;
            }
        }
        GLES20.glUniform1f(this.f192328a, this.f192331d);
    }
}
