package com.tencent.liteav.beauty.p093b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p088c.C14015h;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.r */
/* JADX INFO: loaded from: classes2.dex */
public class C14090r extends C14015h {

    /* JADX INFO: renamed from: v */
    private static String f58772v = "GPUSharpen";

    /* JADX INFO: renamed from: r */
    private int f58773r;

    /* JADX INFO: renamed from: s */
    private float f58774s;

    /* JADX INFO: renamed from: t */
    private int f58775t;

    /* JADX INFO: renamed from: u */
    private int f58776u;

    public C14090r(float f) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nuniform float imageWidthFactor; \nuniform float imageHeightFactor; \n\nvarying vec2 textureCoordinate;\nvarying vec2 leftTextureCoordinate;\nvarying vec2 rightTextureCoordinate; \nvarying vec2 topTextureCoordinate;\nvarying vec2 bottomTextureCoordinate;\n\n\nvoid main()\n{\n    gl_Position = position;\n    \n    mediump vec2 widthStep = vec2(imageWidthFactor, 0.0);\n    mediump vec2 heightStep = vec2(0.0, imageHeightFactor);\n    \n    textureCoordinate = inputTextureCoordinate.xy;\n    leftTextureCoordinate = inputTextureCoordinate.xy - widthStep;\n    rightTextureCoordinate = inputTextureCoordinate.xy + widthStep;\n    topTextureCoordinate = inputTextureCoordinate.xy + heightStep;     \n    bottomTextureCoordinate = inputTextureCoordinate.xy - heightStep;\n}\n", "precision mediump float;\n\nuniform float sharpness;\nvarying mediump vec2 textureCoordinate;\nvarying mediump vec2 leftTextureCoordinate;\nvarying mediump vec2 rightTextureCoordinate; \nvarying mediump vec2 topTextureCoordinate;\nvarying mediump vec2 bottomTextureCoordinate;\n\nuniform sampler2D inputImageTexture;\nfloat centerMultiplier;\nfloat edgeMultiplier;\n\nvoid main()\n{\n    mediump vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    mediump vec3 leftTextureColor = texture2D(inputImageTexture, leftTextureCoordinate).rgb;\n    mediump vec3 rightTextureColor = texture2D(inputImageTexture, rightTextureCoordinate).rgb;\n    mediump vec3 topTextureColor = texture2D(inputImageTexture, topTextureCoordinate).rgb;\n    mediump vec3 bottomTextureColor = texture2D(inputImageTexture, bottomTextureCoordinate).rgb;\n\n    centerMultiplier = 1.0 + 4.0 * sharpness * (1.0 - textureColor.a);\n    edgeMultiplier = sharpness * (1.0 - textureColor.a);\n    gl_FragColor = vec4((textureColor.rgb * centerMultiplier - (leftTextureColor * edgeMultiplier + rightTextureColor * edgeMultiplier + topTextureColor * edgeMultiplier + bottomTextureColor * edgeMultiplier)), textureColor.a);    \n}\n");
        this.f58774s = f;
    }

    /* JADX INFO: renamed from: a */
    public void m83152a(float f) {
        this.f58774s = f;
        TXCLog.m82969i(f58772v, "set Sharpness " + f);
        m82785a(this.f58773r, this.f58774s);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        boolean zMo82803b = super.mo82803b();
        this.f58773r = GLES20.glGetUniformLocation(m82818p(), "sharpness");
        this.f58775t = GLES20.glGetUniformLocation(m82818p(), "imageWidthFactor");
        this.f58776u = GLES20.glGetUniformLocation(m82818p(), "imageHeightFactor");
        m83152a(this.f58774s);
        return zMo82803b;
    }

    public C14090r() {
        this(0.0f);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82786a(int i, int i2) {
        super.mo82786a(i, i2);
        m82785a(this.f58775t, 1.0f / i);
        m82785a(this.f58776u, 1.0f / i2);
    }
}
