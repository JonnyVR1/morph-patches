package com.tencent.liteav.beauty.p098b.p101c;

import android.opengl.GLES20;
import com.tencent.liteav.beauty.p098b.C14256u;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.c.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14236b extends C14256u {

    /* JADX INFO: renamed from: r */
    private int f59520r;

    /* JADX INFO: renamed from: s */
    private int f59521s;

    public C14236b() {
        super(" attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n \n varying vec2 textureCoordinate;\n \n void main(void)\n {\n     gl_Position = position;\n     textureCoordinate = inputTextureCoordinate.xy;\n }\n", " varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n void main()\n {\n     lowp vec3 iColor = texture2D(inputImageTexture, textureCoordinate).rgb;\n     lowp vec3 meanColor = texture2D(inputImageTexture2, textureCoordinate).rgb;\n     highp vec3 diffColor = (iColor - meanColor) * 7.07;\n     diffColor = min(diffColor * diffColor, 1.0);\n     gl_FragColor = vec4(diffColor, 1.0);\n }\n");
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83969a(int i, int i2) {
        float fMin = Math.min(1.0f, 360.0f / Math.min(i, i2));
        this.f59520r = Math.round(i * fMin);
        int iRound = Math.round(i2 * fMin);
        this.f59521s = iRound;
        super.mo83969a(this.f59520r, iRound);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public int mo83981b(int i) {
        GLES20.glViewport(0, 0, this.f59520r, this.f59521s);
        return super.mo83967a(i, this.f59028m, this.f59029n);
    }
}
