package com.tencent.liteav.beauty.p093b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.p085b.C14002a;
import java.nio.Buffer;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.y */
/* JADX INFO: loaded from: classes2.dex */
public class C14097y extends C14002a {

    /* JADX INFO: renamed from: x */
    private static String f58813x = "varying lowp vec2 textureCoordinate;\n   \n  uniform sampler2D inputImageTexture;\n  uniform mediump float alphaBlend;\n  \n  void main()\n  {\n      mediump vec4 color = texture2D(inputImageTexture, textureCoordinate);\n       if (0.0 == color.a){\n            gl_FragColor = color;\n       }else{\n            gl_FragColor = vec4(color.rgb, alphaBlend);\n       } \n  }\n";

    /* JADX INFO: renamed from: z */
    private static String f58814z = "AlphaTexture";

    /* JADX INFO: renamed from: A */
    private boolean f58815A;

    /* JADX INFO: renamed from: y */
    private int f58816y;

    public C14097y() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.f58816y = -1;
        this.f58815A = false;
    }

    /* JADX INFO: renamed from: a */
    public void m83165a(float f) {
        m82785a(this.f58816y, f);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        if (!super.mo82803b()) {
            TXCLog.m82966e(f58814z, "onInit failed!");
            return false;
        }
        this.f58816y = GLES20.glGetUniformLocation(this.f58168a, "alphaBlend");
        m83165a(1.0f);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m83166c(boolean z) {
        this.f58815A = z;
    }

    @Override // com.tencent.liteav.beauty.p093b.C14098z, com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: j */
    public void mo82812j() {
        if (!((C14098z) this).f58823t || ((C14098z) this).f58821r == null) {
            return;
        }
        GLES20.glEnable(3042);
        if (true == this.f58815A) {
            GLES20.glBlendFunc(773, 772);
        } else {
            GLES20.glBlendFunc(770, 771);
        }
        GLES20.glActiveTexture(33984);
        int i = 0;
        while (true) {
            C14098z.a[] aVarArr = ((C14098z) this).f58821r;
            if (i >= aVarArr.length) {
                GLES20.glDisable(3042);
                return;
            }
            C14098z.a aVar = aVarArr[i];
            if (aVar != null) {
                GLES20.glBindTexture(3553, aVar.f58831d[0]);
                GLES20.glUniform1i(this.f58170c, 0);
                GLES20.glVertexAttribPointer(this.f58169b, 2, 5126, false, 8, (Buffer) ((C14098z) this).f58821r[i].f58828a);
                GLES20.glEnableVertexAttribArray(this.f58169b);
                GLES20.glVertexAttribPointer(this.f58171d, 4, 5126, false, 16, (Buffer) ((C14098z) this).f58821r[i].f58829b);
                GLES20.glEnableVertexAttribArray(this.f58171d);
                GLES20.glDrawElements(4, C14098z.f58818v.length, 5123, ((C14098z) this).f58825w);
                GLES20.glDisableVertexAttribArray(this.f58169b);
                GLES20.glDisableVertexAttribArray(this.f58171d);
            }
            i++;
        }
    }
}
