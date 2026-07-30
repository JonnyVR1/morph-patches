package com.tencent.liteav.beauty.p098b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.basic.p093c.C14180j;
import com.tencent.liteav.beauty.NativeLoad;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.k */
/* JADX INFO: loaded from: classes2.dex */
public class C14246k extends C14178h {

    /* JADX INFO: renamed from: y */
    private static String f59577y = "YUV420pToRGBFilter";

    /* JADX INFO: renamed from: r */
    private byte[] f59578r;

    /* JADX INFO: renamed from: s */
    private int f59579s;

    /* JADX INFO: renamed from: t */
    private int[] f59580t;

    /* JADX INFO: renamed from: u */
    private int[] f59581u;

    /* JADX INFO: renamed from: v */
    private int f59582v;

    /* JADX INFO: renamed from: w */
    private int f59583w;

    /* JADX INFO: renamed from: x */
    private int[] f59584x;

    public C14246k(int i) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.f59578r = null;
        this.f59580t = null;
        this.f59581u = null;
        this.f59582v = 0;
        this.f59583w = 0;
        this.f59584x = null;
        this.f59579s = i;
        TXCLog.m84152i(f59577y, "yuv Type " + i);
    }

    /* JADX INFO: renamed from: r */
    private int m84318r() {
        GLES20.glBindTexture(3553, this.f59584x[0]);
        if (this.f59578r != null) {
            NativeLoad.getInstance();
            NativeLoad.nativeglTexImage2D(3553, 0, 6408, this.f59020e, this.f59021f, 0, 6408, 5121, this.f59578r, 0);
        }
        return this.f59584x[0];
    }

    /* JADX INFO: renamed from: s */
    private void m84319s() {
        int[] iArr = this.f59580t;
        if (iArr != null && iArr[0] > 0) {
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f59580t = null;
        }
        int[] iArr2 = this.f59581u;
        if (iArr2 != null && iArr2[0] > 0) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f59581u = null;
        }
        int[] iArr3 = this.f59584x;
        if (iArr3 == null || iArr3[0] <= 0) {
            return;
        }
        GLES20.glDeleteTextures(1, iArr3, 0);
        this.f59584x = null;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83969a(int i, int i2) {
        if (this.f59021f == i2 && this.f59020e == i) {
            return;
        }
        m84319s();
        if (this.f59580t == null) {
            int[] iArr = new int[1];
            this.f59580t = iArr;
            iArr[0] = C14180j.m84005a(i, i2, 6409, 6409, iArr);
        }
        this.f59582v = GLES20.glGetUniformLocation(m84001p(), "yTexture");
        this.f59583w = GLES20.glGetUniformLocation(m84001p(), "uvTexture");
        int i3 = this.f59579s;
        if (1 == i3) {
            GLES20.glActiveTexture(33984);
            GLES20.glActiveTexture(33985);
            int[] iArr2 = new int[1];
            this.f59581u = iArr2;
            iArr2[0] = C14180j.m84005a(i, i2 / 2, 6409, 6409, iArr2);
            GLES20.glUniform1i(this.f59582v, 0);
            GLES20.glUniform1i(this.f59583w, 1);
        } else if (3 == i3) {
            GLES20.glActiveTexture(33984);
            GLES20.glActiveTexture(33985);
            this.f59582v = GLES20.glGetUniformLocation(m84001p(), "yTexture");
            this.f59583w = GLES20.glGetUniformLocation(m84001p(), "uvTexture");
            int[] iArr3 = new int[1];
            this.f59581u = iArr3;
            iArr3[0] = C14180j.m84005a(i / 2, i2 / 2, 6410, 6410, iArr3);
            GLES20.glUniform1i(this.f59582v, 0);
            GLES20.glUniform1i(this.f59583w, 1);
        } else if (2 == i3 && this.f59584x == null) {
            int[] iArr4 = new int[1];
            this.f59584x = iArr4;
            iArr4[0] = C14180j.m84005a(i, i2, 6408, 6408, iArr4);
        }
        super.mo83969a(i, i2);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: e */
    public void mo83990e() {
        super.mo83990e();
        m84319s();
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: i */
    public void mo83994i() {
        int[] iArr;
        int i;
        super.mo83994i();
        if (this.f59020e % 4 != 0) {
            iArr = new int[1];
            GLES20.glGetIntegerv(3317, iArr, 0);
            GLES20.glPixelStorei(3317, 1);
        } else {
            iArr = null;
        }
        int i2 = this.f59579s;
        if (1 == i2) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f59580t[0]);
            GLES20.glUniform1i(this.f59582v, 0);
            NativeLoad.getInstance();
            NativeLoad.nativeglTexImage2D(3553, 0, 6409, this.f59020e, this.f59021f, 0, 6409, 5121, this.f59578r, 0);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.f59581u[0]);
            GLES20.glUniform1i(this.f59583w, 1);
            NativeLoad.getInstance();
            int i3 = this.f59020e;
            int i4 = this.f59021f;
            NativeLoad.nativeglTexImage2D(3553, 0, 6409, i3, i4 / 2, 0, 6409, 5121, this.f59578r, i3 * i4);
        } else if (3 == i2) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f59580t[0]);
            GLES20.glUniform1i(this.f59582v, 0);
            NativeLoad.getInstance();
            NativeLoad.nativeglTexImage2D(3553, 0, 6409, this.f59020e, this.f59021f, 0, 6409, 5121, this.f59578r, 0);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.f59581u[0]);
            GLES20.glUniform1i(this.f59583w, 1);
            NativeLoad.getInstance();
            int i5 = this.f59020e;
            int i6 = this.f59021f;
            NativeLoad.nativeglTexImage2D(3553, 0, 6410, i5 / 2, i6 / 2, 0, 6410, 5121, this.f59578r, i5 * i6);
        } else if (2 == i2) {
            m84318r();
        }
        if (this.f59020e % 4 != 0) {
            if (iArr == null || (i = iArr[0]) <= 0) {
                GLES20.glPixelStorei(3317, 4);
            } else {
                GLES20.glPixelStorei(3317, i);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public int m84321q() {
        if (2 != this.f59579s) {
            return super.mo83981b(-1);
        }
        int iM84318r = m84318r();
        GLES20.glBindTexture(3553, 0);
        return iM84318r;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public boolean mo83979a() {
        int i = this.f59579s;
        int i2 = 7;
        if (i != 1) {
            if (i == 3) {
                i2 = 9;
            } else {
                if (i == 2) {
                    return super.mo83979a();
                }
                TXCLog.m84149e(f59577y, "don't support yuv format " + this.f59579s);
            }
        }
        NativeLoad.getInstance();
        int iNativeLoadGLProgram = NativeLoad.nativeLoadGLProgram(i2);
        this.f59016a = iNativeLoadGLProgram;
        if (iNativeLoadGLProgram != 0 && mo83986b()) {
            this.f59022g = true;
        } else {
            this.f59022g = false;
        }
        mo83987c();
        return this.f59022g;
    }

    /* JADX INFO: renamed from: a */
    public void m84320a(byte[] bArr) {
        this.f59578r = bArr;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83972a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        super.mo83972a(-1, floatBuffer, floatBuffer2);
    }
}
