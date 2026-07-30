package com.tencent.liteav.beauty.p093b.p096c;

import android.opengl.GLES20;
import com.tencent.liteav.beauty.p093b.C14093u;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.c.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14073b extends C14093u {

    /* JADX INFO: renamed from: r */
    private int f58672r;

    /* JADX INFO: renamed from: s */
    private int f58673s;

    public C14073b() {
        super(" attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n \n varying vec2 textureCoordinate;\n \n void main(void)\n {\n     gl_Position = position;\n     textureCoordinate = inputTextureCoordinate.xy;\n }\n", " varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n void main()\n {\n     lowp vec3 iColor = texture2D(inputImageTexture, textureCoordinate).rgb;\n     lowp vec3 meanColor = texture2D(inputImageTexture2, textureCoordinate).rgb;\n     highp vec3 diffColor = (iColor - meanColor) * 7.07;\n     diffColor = min(diffColor * diffColor, 1.0);\n     gl_FragColor = vec4(diffColor, 1.0);\n }\n");
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82786a(int i, int i2) {
        float fMin = Math.min(1.0f, 360.0f / Math.min(i, i2));
        this.f58672r = Math.round(i * fMin);
        int iRound = Math.round(i2 * fMin);
        this.f58673s = iRound;
        super.mo82786a(this.f58672r, iRound);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public int mo82798b(int i) {
        GLES20.glViewport(0, 0, this.f58672r, this.f58673s);
        return super.mo82784a(i, this.f58180m, this.f58181n);
    }
}
