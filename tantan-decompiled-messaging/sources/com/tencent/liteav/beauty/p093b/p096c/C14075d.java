package com.tencent.liteav.beauty.p093b.p096c;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p088c.C14015h;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.c.d */
/* JADX INFO: loaded from: classes2.dex */
class C14075d extends C14015h {

    /* JADX INFO: renamed from: r */
    private final boolean f58683r;

    /* JADX INFO: renamed from: s */
    private int f58684s;

    /* JADX INFO: renamed from: t */
    private int f58685t;

    /* JADX INFO: renamed from: u */
    private int f58686u;

    /* JADX INFO: renamed from: v */
    private int f58687v;

    public C14075d(boolean z) {
        super(" attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n \n uniform float texelWidthOffset;\n uniform float texelHeightOffset;\n \n varying vec2 textureCoordinate;\n varying vec4 textureShift_1;\n varying vec4 textureShift_2;\n varying vec4 textureShift_3;\n varying vec4 textureShift_4;\n \n void main(void)\n {\n     gl_Position = position;\n     textureCoordinate = inputTextureCoordinate.xy;\n     \n     vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n     textureShift_1 = vec4(textureCoordinate - singleStepOffset, textureCoordinate + singleStepOffset);\n     textureShift_2 = vec4(textureCoordinate - 2.0 * singleStepOffset, textureCoordinate + 2.0 * singleStepOffset);\n     textureShift_3 = vec4(textureCoordinate - 3.0 * singleStepOffset, textureCoordinate + 3.0 * singleStepOffset);\n     textureShift_4 = vec4(textureCoordinate - 4.0 * singleStepOffset, textureCoordinate + 4.0 * singleStepOffset);\n }\n", "uniform sampler2D inputImageTexture;\n varying highp vec2 textureCoordinate;\n varying highp vec4 textureShift_1;\n varying highp vec4 textureShift_2;\n varying highp vec4 textureShift_3;\n varying highp vec4 textureShift_4;\n \n void main()\n {\n     mediump vec3 sum = texture2D(inputImageTexture, textureCoordinate).rgb;\n     sum += texture2D(inputImageTexture, textureShift_1.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_1.zw).rgb;\n     sum += texture2D(inputImageTexture, textureShift_2.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_2.zw).rgb;\n     sum += texture2D(inputImageTexture, textureShift_3.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_3.zw).rgb;\n     sum += texture2D(inputImageTexture, textureShift_4.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_4.zw).rgb;\n     \n     gl_FragColor = vec4(sum * 0.1111, 1.0);\n }\n");
        this.f58684s = -1;
        this.f58685t = -1;
        this.f58683r = z;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82786a(int i, int i2) {
        float fMin = Math.min(1.0f, 360.0f / Math.min(i, i2));
        this.f58686u = Math.round(i * fMin);
        int iRound = Math.round(i2 * fMin);
        this.f58687v = iRound;
        super.mo82786a(this.f58686u, iRound);
        boolean z = this.f58683r;
        int i3 = this.f58684s;
        if (z) {
            m82785a(i3, 0.0f);
            m82785a(this.f58685t, 1.5f / this.f58687v);
        } else {
            m82785a(i3, 1.5f / this.f58686u);
            m82785a(this.f58685t, 0.0f);
        }
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        if (!super.mo82803b()) {
            return false;
        }
        this.f58684s = GLES20.glGetUniformLocation(m82818p(), "texelWidthOffset");
        this.f58685t = GLES20.glGetUniformLocation(m82818p(), "texelHeightOffset");
        return true;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public int mo82798b(int i) {
        GLES20.glViewport(0, 0, this.f58686u, this.f58687v);
        return super.mo82784a(i, this.f58180m, this.f58181n);
    }
}
