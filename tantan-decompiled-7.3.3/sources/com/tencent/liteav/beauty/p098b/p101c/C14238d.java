package com.tencent.liteav.beauty.p098b.p101c;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p093c.C14178h;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.c.d */
/* JADX INFO: loaded from: classes2.dex */
class C14238d extends C14178h {

    /* JADX INFO: renamed from: r */
    private final boolean f59531r;

    /* JADX INFO: renamed from: s */
    private int f59532s;

    /* JADX INFO: renamed from: t */
    private int f59533t;

    /* JADX INFO: renamed from: u */
    private int f59534u;

    /* JADX INFO: renamed from: v */
    private int f59535v;

    public C14238d(boolean z) {
        super(" attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n \n uniform float texelWidthOffset;\n uniform float texelHeightOffset;\n \n varying vec2 textureCoordinate;\n varying vec4 textureShift_1;\n varying vec4 textureShift_2;\n varying vec4 textureShift_3;\n varying vec4 textureShift_4;\n \n void main(void)\n {\n     gl_Position = position;\n     textureCoordinate = inputTextureCoordinate.xy;\n     \n     vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n     textureShift_1 = vec4(textureCoordinate - singleStepOffset, textureCoordinate + singleStepOffset);\n     textureShift_2 = vec4(textureCoordinate - 2.0 * singleStepOffset, textureCoordinate + 2.0 * singleStepOffset);\n     textureShift_3 = vec4(textureCoordinate - 3.0 * singleStepOffset, textureCoordinate + 3.0 * singleStepOffset);\n     textureShift_4 = vec4(textureCoordinate - 4.0 * singleStepOffset, textureCoordinate + 4.0 * singleStepOffset);\n }\n", "uniform sampler2D inputImageTexture;\n varying highp vec2 textureCoordinate;\n varying highp vec4 textureShift_1;\n varying highp vec4 textureShift_2;\n varying highp vec4 textureShift_3;\n varying highp vec4 textureShift_4;\n \n void main()\n {\n     mediump vec3 sum = texture2D(inputImageTexture, textureCoordinate).rgb;\n     sum += texture2D(inputImageTexture, textureShift_1.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_1.zw).rgb;\n     sum += texture2D(inputImageTexture, textureShift_2.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_2.zw).rgb;\n     sum += texture2D(inputImageTexture, textureShift_3.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_3.zw).rgb;\n     sum += texture2D(inputImageTexture, textureShift_4.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_4.zw).rgb;\n     \n     gl_FragColor = vec4(sum * 0.1111, 1.0);\n }\n");
        this.f59532s = -1;
        this.f59533t = -1;
        this.f59531r = z;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83969a(int i, int i2) {
        float fMin = Math.min(1.0f, 360.0f / Math.min(i, i2));
        this.f59534u = Math.round(i * fMin);
        int iRound = Math.round(i2 * fMin);
        this.f59535v = iRound;
        super.mo83969a(this.f59534u, iRound);
        boolean z = this.f59531r;
        int i3 = this.f59532s;
        if (z) {
            m83968a(i3, 0.0f);
            m83968a(this.f59533t, 1.5f / this.f59535v);
        } else {
            m83968a(i3, 1.5f / this.f59534u);
            m83968a(this.f59533t, 0.0f);
        }
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        if (!super.mo83986b()) {
            return false;
        }
        this.f59532s = GLES20.glGetUniformLocation(m84001p(), "texelWidthOffset");
        this.f59533t = GLES20.glGetUniformLocation(m84001p(), "texelHeightOffset");
        return true;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public int mo83981b(int i) {
        GLES20.glViewport(0, 0, this.f59534u, this.f59535v);
        return super.mo83967a(i, this.f59028m, this.f59029n);
    }
}
