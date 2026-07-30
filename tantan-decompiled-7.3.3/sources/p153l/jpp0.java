package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class jpp0 extends AbstractC17634i4 {

    /* JADX INFO: renamed from: a */
    private int f122127a;

    /* JADX INFO: renamed from: b */
    private float f122128b = 0.0f;

    /* JADX INFO: renamed from: c */
    private long f122129c = 100000;

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float iTime;\nvoid main(){\n vec2 uv = textureCoordinate;\n vec4 waterColor = vec4(1.0);\n    float reflactionY = 0.5;\n    if(uv.y <= reflactionY)\n    {        \n        float oy = uv.y;\n        uv.y = 2.0*reflactionY - uv.y;\n        uv.y = uv.y + sin(1./(oy-reflactionY)+iTime*10.0)*0.005;\n        waterColor = vec4(0.75,0.85, 0.95,1.0);\n    } gl_FragColor = texture2D(inputImageTexture0,uv)*waterColor;\n}";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f122127a = GLES20.glGetUniformLocation(this.programHandle, "iTime");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        float fCurrentTimeMillis = (System.currentTimeMillis() % this.f122129c) / 1000.0f;
        this.f122128b = fCurrentTimeMillis;
        GLES20.glUniform1f(this.f122127a, fCurrentTimeMillis);
    }
}
