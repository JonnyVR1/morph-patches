package com.tencent.liteav.beauty.p093b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p088c.C14015h;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.s */
/* JADX INFO: loaded from: classes2.dex */
public class C14091s extends C14015h {

    /* JADX INFO: renamed from: v */
    private static String f58777v = "GPUSharpen";

    /* JADX INFO: renamed from: r */
    private int f58778r;

    /* JADX INFO: renamed from: s */
    private float f58779s;

    /* JADX INFO: renamed from: t */
    private int f58780t;

    /* JADX INFO: renamed from: u */
    private int f58781u;

    public C14091s(float f) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nuniform float imageWidthFactor; \nuniform float imageHeightFactor; \nuniform float sharpness;\n\nvarying vec2 textureCoordinate;\nvarying vec2 leftTextureCoordinate;\nvarying vec2 rightTextureCoordinate; \nvarying vec2 topTextureCoordinate;\nvarying vec2 bottomTextureCoordinate;\n\nvarying float centerMultiplier;\nvarying float edgeMultiplier;\n\nvoid main()\n{\n    gl_Position = position;\n    \n    mediump vec2 widthStep = vec2(imageWidthFactor, 0.0);\n    mediump vec2 heightStep = vec2(0.0, imageHeightFactor);\n    \n    textureCoordinate = inputTextureCoordinate.xy;\n    leftTextureCoordinate = inputTextureCoordinate.xy - widthStep;\n    rightTextureCoordinate = inputTextureCoordinate.xy + widthStep;\n    topTextureCoordinate = inputTextureCoordinate.xy + heightStep;     \n    bottomTextureCoordinate = inputTextureCoordinate.xy - heightStep;\n    \n    centerMultiplier = 1.0 + 4.0 * sharpness;\n    edgeMultiplier = sharpness;\n}", "precision highp float;\n\nvarying highp vec2 textureCoordinate;\nvarying highp vec2 leftTextureCoordinate;\nvarying highp vec2 rightTextureCoordinate; \nvarying highp vec2 topTextureCoordinate;\nvarying highp vec2 bottomTextureCoordinate;\n\nvarying highp float centerMultiplier;\nvarying highp float edgeMultiplier;\n\nuniform sampler2D inputImageTexture;\n\nvoid main()\n{\n    mediump vec3 textureColor = texture2D(inputImageTexture, textureCoordinate).rgb;\n    mediump vec3 leftTextureColor = texture2D(inputImageTexture, leftTextureCoordinate).rgb;\n    mediump vec3 rightTextureColor = texture2D(inputImageTexture, rightTextureCoordinate).rgb;\n    mediump vec3 topTextureColor = texture2D(inputImageTexture, topTextureCoordinate).rgb;\n    mediump vec3 bottomTextureColor = texture2D(inputImageTexture, bottomTextureCoordinate).rgb;\n\n    gl_FragColor = vec4((textureColor * centerMultiplier - (leftTextureColor * edgeMultiplier + rightTextureColor * edgeMultiplier + topTextureColor * edgeMultiplier + bottomTextureColor * edgeMultiplier)), 1.0);\n}");
        this.f58779s = f;
    }

    /* JADX INFO: renamed from: a */
    public void m83153a(float f) {
        this.f58779s = f;
        TXCLog.m82969i(f58777v, "set Sharpness " + f);
        m82785a(this.f58778r, this.f58779s);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        boolean zMo82803b = super.mo82803b();
        this.f58778r = GLES20.glGetUniformLocation(m82818p(), "sharpness");
        this.f58780t = GLES20.glGetUniformLocation(m82818p(), "imageWidthFactor");
        this.f58781u = GLES20.glGetUniformLocation(m82818p(), "imageHeightFactor");
        m83153a(this.f58779s);
        return zMo82803b;
    }

    public C14091s() {
        this(0.0f);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82786a(int i, int i2) {
        super.mo82786a(i, i2);
        m82785a(this.f58780t, 1.0f / i);
        m82785a(this.f58781u, 1.0f / i2);
    }
}
