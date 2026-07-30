package com.tencent.liteav.beauty.p093b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p088c.C14015h;
import com.tencent.liteav.basic.p088c.C14017j;
import com.tencent.liteav.beauty.NativeLoad;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.k */
/* JADX INFO: loaded from: classes2.dex */
public class C14083k extends C14015h {

    /* JADX INFO: renamed from: y */
    private static String f58729y = "YUV420pToRGBFilter";

    /* JADX INFO: renamed from: r */
    private byte[] f58730r;

    /* JADX INFO: renamed from: s */
    private int f58731s;

    /* JADX INFO: renamed from: t */
    private int[] f58732t;

    /* JADX INFO: renamed from: u */
    private int[] f58733u;

    /* JADX INFO: renamed from: v */
    private int f58734v;

    /* JADX INFO: renamed from: w */
    private int f58735w;

    /* JADX INFO: renamed from: x */
    private int[] f58736x;

    public C14083k(int i) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.f58730r = null;
        this.f58732t = null;
        this.f58733u = null;
        this.f58734v = 0;
        this.f58735w = 0;
        this.f58736x = null;
        this.f58731s = i;
        TXCLog.m82969i(f58729y, "yuv Type " + i);
    }

    /* JADX INFO: renamed from: r */
    private int m83135r() {
        GLES20.glBindTexture(3553, this.f58736x[0]);
        if (this.f58730r != null) {
            NativeLoad.getInstance();
            NativeLoad.nativeglTexImage2D(3553, 0, 6408, this.f58172e, this.f58173f, 0, 6408, 5121, this.f58730r, 0);
        }
        return this.f58736x[0];
    }

    /* JADX INFO: renamed from: s */
    private void m83136s() {
        int[] iArr = this.f58732t;
        if (iArr != null && iArr[0] > 0) {
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f58732t = null;
        }
        int[] iArr2 = this.f58733u;
        if (iArr2 != null && iArr2[0] > 0) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f58733u = null;
        }
        int[] iArr3 = this.f58736x;
        if (iArr3 == null || iArr3[0] <= 0) {
            return;
        }
        GLES20.glDeleteTextures(1, iArr3, 0);
        this.f58736x = null;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82786a(int i, int i2) {
        if (this.f58173f == i2 && this.f58172e == i) {
            return;
        }
        m83136s();
        if (this.f58732t == null) {
            int[] iArr = new int[1];
            this.f58732t = iArr;
            iArr[0] = C14017j.m82822a(i, i2, 6409, 6409, iArr);
        }
        this.f58734v = GLES20.glGetUniformLocation(m82818p(), "yTexture");
        this.f58735w = GLES20.glGetUniformLocation(m82818p(), "uvTexture");
        int i3 = this.f58731s;
        if (1 == i3) {
            GLES20.glActiveTexture(33984);
            GLES20.glActiveTexture(33985);
            int[] iArr2 = new int[1];
            this.f58733u = iArr2;
            iArr2[0] = C14017j.m82822a(i, i2 / 2, 6409, 6409, iArr2);
            GLES20.glUniform1i(this.f58734v, 0);
            GLES20.glUniform1i(this.f58735w, 1);
        } else if (3 == i3) {
            GLES20.glActiveTexture(33984);
            GLES20.glActiveTexture(33985);
            this.f58734v = GLES20.glGetUniformLocation(m82818p(), "yTexture");
            this.f58735w = GLES20.glGetUniformLocation(m82818p(), "uvTexture");
            int[] iArr3 = new int[1];
            this.f58733u = iArr3;
            iArr3[0] = C14017j.m82822a(i / 2, i2 / 2, 6410, 6410, iArr3);
            GLES20.glUniform1i(this.f58734v, 0);
            GLES20.glUniform1i(this.f58735w, 1);
        } else if (2 == i3 && this.f58736x == null) {
            int[] iArr4 = new int[1];
            this.f58736x = iArr4;
            iArr4[0] = C14017j.m82822a(i, i2, 6408, 6408, iArr4);
        }
        super.mo82786a(i, i2);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: e */
    public void mo82807e() {
        super.mo82807e();
        m83136s();
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: i */
    public void mo82811i() {
        int[] iArr;
        int i;
        super.mo82811i();
        if (this.f58172e % 4 != 0) {
            iArr = new int[1];
            GLES20.glGetIntegerv(3317, iArr, 0);
            GLES20.glPixelStorei(3317, 1);
        } else {
            iArr = null;
        }
        int i2 = this.f58731s;
        if (1 == i2) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f58732t[0]);
            GLES20.glUniform1i(this.f58734v, 0);
            NativeLoad.getInstance();
            NativeLoad.nativeglTexImage2D(3553, 0, 6409, this.f58172e, this.f58173f, 0, 6409, 5121, this.f58730r, 0);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.f58733u[0]);
            GLES20.glUniform1i(this.f58735w, 1);
            NativeLoad.getInstance();
            int i3 = this.f58172e;
            int i4 = this.f58173f;
            NativeLoad.nativeglTexImage2D(3553, 0, 6409, i3, i4 / 2, 0, 6409, 5121, this.f58730r, i3 * i4);
        } else if (3 == i2) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f58732t[0]);
            GLES20.glUniform1i(this.f58734v, 0);
            NativeLoad.getInstance();
            NativeLoad.nativeglTexImage2D(3553, 0, 6409, this.f58172e, this.f58173f, 0, 6409, 5121, this.f58730r, 0);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.f58733u[0]);
            GLES20.glUniform1i(this.f58735w, 1);
            NativeLoad.getInstance();
            int i5 = this.f58172e;
            int i6 = this.f58173f;
            NativeLoad.nativeglTexImage2D(3553, 0, 6410, i5 / 2, i6 / 2, 0, 6410, 5121, this.f58730r, i5 * i6);
        } else if (2 == i2) {
            m83135r();
        }
        if (this.f58172e % 4 != 0) {
            if (iArr == null || (i = iArr[0]) <= 0) {
                GLES20.glPixelStorei(3317, 4);
            } else {
                GLES20.glPixelStorei(3317, i);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public int m83138q() {
        if (2 != this.f58731s) {
            return super.mo82798b(-1);
        }
        int iM83135r = m83135r();
        GLES20.glBindTexture(3553, 0);
        return iM83135r;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public boolean mo82796a() {
        int i = this.f58731s;
        int i2 = 7;
        if (i != 1) {
            if (i == 3) {
                i2 = 9;
            } else {
                if (i == 2) {
                    return super.mo82796a();
                }
                TXCLog.m82966e(f58729y, "don't support yuv format " + this.f58731s);
            }
        }
        NativeLoad.getInstance();
        int iNativeLoadGLProgram = NativeLoad.nativeLoadGLProgram(i2);
        this.f58168a = iNativeLoadGLProgram;
        if (iNativeLoadGLProgram != 0 && mo82803b()) {
            this.f58174g = true;
        } else {
            this.f58174g = false;
        }
        mo82804c();
        return this.f58174g;
    }

    /* JADX INFO: renamed from: a */
    public void m83137a(byte[] bArr) {
        this.f58730r = bArr;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82789a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        super.mo82789a(-1, floatBuffer, floatBuffer2);
    }
}
