package com.tencent.liteav.beauty.p098b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p093c.C14178h;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.r */
/* JADX INFO: loaded from: classes2.dex */
public class C14253r extends C14178h {

    /* JADX INFO: renamed from: v */
    private static String f59620v = "GPUSharpen";

    /* JADX INFO: renamed from: r */
    private int f59621r;

    /* JADX INFO: renamed from: s */
    private float f59622s;

    /* JADX INFO: renamed from: t */
    private int f59623t;

    /* JADX INFO: renamed from: u */
    private int f59624u;

    public C14253r(float f) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nuniform float imageWidthFactor; \nuniform float imageHeightFactor; \n\nvarying vec2 textureCoordinate;\nvarying vec2 leftTextureCoordinate;\nvarying vec2 rightTextureCoordinate; \nvarying vec2 topTextureCoordinate;\nvarying vec2 bottomTextureCoordinate;\n\n\nvoid main()\n{\n    gl_Position = position;\n    \n    mediump vec2 widthStep = vec2(imageWidthFactor, 0.0);\n    mediump vec2 heightStep = vec2(0.0, imageHeightFactor);\n    \n    textureCoordinate = inputTextureCoordinate.xy;\n    leftTextureCoordinate = inputTextureCoordinate.xy - widthStep;\n    rightTextureCoordinate = inputTextureCoordinate.xy + widthStep;\n    topTextureCoordinate = inputTextureCoordinate.xy + heightStep;     \n    bottomTextureCoordinate = inputTextureCoordinate.xy - heightStep;\n}\n", "precision mediump float;\n\nuniform float sharpness;\nvarying mediump vec2 textureCoordinate;\nvarying mediump vec2 leftTextureCoordinate;\nvarying mediump vec2 rightTextureCoordinate; \nvarying mediump vec2 topTextureCoordinate;\nvarying mediump vec2 bottomTextureCoordinate;\n\nuniform sampler2D inputImageTexture;\nfloat centerMultiplier;\nfloat edgeMultiplier;\n\nvoid main()\n{\n    mediump vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    mediump vec3 leftTextureColor = texture2D(inputImageTexture, leftTextureCoordinate).rgb;\n    mediump vec3 rightTextureColor = texture2D(inputImageTexture, rightTextureCoordinate).rgb;\n    mediump vec3 topTextureColor = texture2D(inputImageTexture, topTextureCoordinate).rgb;\n    mediump vec3 bottomTextureColor = texture2D(inputImageTexture, bottomTextureCoordinate).rgb;\n\n    centerMultiplier = 1.0 + 4.0 * sharpness * (1.0 - textureColor.a);\n    edgeMultiplier = sharpness * (1.0 - textureColor.a);\n    gl_FragColor = vec4((textureColor.rgb * centerMultiplier - (leftTextureColor * edgeMultiplier + rightTextureColor * edgeMultiplier + topTextureColor * edgeMultiplier + bottomTextureColor * edgeMultiplier)), textureColor.a);    \n}\n");
        this.f59622s = f;
    }

    /* JADX INFO: renamed from: a */
    public void m84335a(float f) {
        this.f59622s = f;
        TXCLog.m84152i(f59620v, "set Sharpness " + f);
        m83968a(this.f59621r, this.f59622s);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        boolean zMo83986b = super.mo83986b();
        this.f59621r = GLES20.glGetUniformLocation(m84001p(), "sharpness");
        this.f59623t = GLES20.glGetUniformLocation(m84001p(), "imageWidthFactor");
        this.f59624u = GLES20.glGetUniformLocation(m84001p(), "imageHeightFactor");
        m84335a(this.f59622s);
        return zMo83986b;
    }

    public C14253r() {
        this(0.0f);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83969a(int i, int i2) {
        super.mo83969a(i, i2);
        m83968a(this.f59623t, 1.0f / i);
        m83968a(this.f59624u, 1.0f / i2);
    }
}
