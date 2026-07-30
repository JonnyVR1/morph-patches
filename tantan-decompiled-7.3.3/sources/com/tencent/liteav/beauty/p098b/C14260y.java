package com.tencent.liteav.beauty.p098b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.p090b.C14165a;
import java.nio.Buffer;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.y */
/* JADX INFO: loaded from: classes2.dex */
public class C14260y extends C14165a {

    /* JADX INFO: renamed from: x */
    private static String f59661x = "varying lowp vec2 textureCoordinate;\n   \n  uniform sampler2D inputImageTexture;\n  uniform mediump float alphaBlend;\n  \n  void main()\n  {\n      mediump vec4 color = texture2D(inputImageTexture, textureCoordinate);\n       if (0.0 == color.a){\n            gl_FragColor = color;\n       }else{\n            gl_FragColor = vec4(color.rgb, alphaBlend);\n       } \n  }\n";

    /* JADX INFO: renamed from: z */
    private static String f59662z = "AlphaTexture";

    /* JADX INFO: renamed from: A */
    private boolean f59663A;

    /* JADX INFO: renamed from: y */
    private int f59664y;

    public C14260y() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.f59664y = -1;
        this.f59663A = false;
    }

    /* JADX INFO: renamed from: a */
    public void m84348a(float f) {
        m83968a(this.f59664y, f);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        if (!super.mo83986b()) {
            TXCLog.m84149e(f59662z, "onInit failed!");
            return false;
        }
        this.f59664y = GLES20.glGetUniformLocation(this.f59016a, "alphaBlend");
        m84348a(1.0f);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m84349c(boolean z) {
        this.f59663A = z;
    }

    @Override // com.tencent.liteav.beauty.p098b.C14261z, com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: j */
    public void mo83995j() {
        if (!((C14261z) this).f59671t || ((C14261z) this).f59669r == null) {
            return;
        }
        GLES20.glEnable(3042);
        if (true == this.f59663A) {
            GLES20.glBlendFunc(773, 772);
        } else {
            GLES20.glBlendFunc(770, 771);
        }
        GLES20.glActiveTexture(33984);
        int i = 0;
        while (true) {
            C14261z.a[] aVarArr = ((C14261z) this).f59669r;
            if (i >= aVarArr.length) {
                GLES20.glDisable(3042);
                return;
            }
            C14261z.a aVar = aVarArr[i];
            if (aVar != null) {
                GLES20.glBindTexture(3553, aVar.f59679d[0]);
                GLES20.glUniform1i(this.f59018c, 0);
                GLES20.glVertexAttribPointer(this.f59017b, 2, 5126, false, 8, (Buffer) ((C14261z) this).f59669r[i].f59676a);
                GLES20.glEnableVertexAttribArray(this.f59017b);
                GLES20.glVertexAttribPointer(this.f59019d, 4, 5126, false, 16, (Buffer) ((C14261z) this).f59669r[i].f59677b);
                GLES20.glEnableVertexAttribArray(this.f59019d);
                GLES20.glDrawElements(4, C14261z.f59666v.length, 5123, ((C14261z) this).f59673w);
                GLES20.glDisableVertexAttribArray(this.f59017b);
                GLES20.glDisableVertexAttribArray(this.f59019d);
            }
            i++;
        }
    }
}
