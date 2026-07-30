package com.tencent.liteav.basic.p088c;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.tencent.liteav.basic.c.h */
/* JADX INFO: loaded from: classes2.dex */
public class C14015h {

    /* JADX INFO: renamed from: a */
    protected int f58168a;

    /* JADX INFO: renamed from: b */
    protected int f58169b;

    /* JADX INFO: renamed from: c */
    protected int f58170c;

    /* JADX INFO: renamed from: d */
    protected int f58171d;

    /* JADX INFO: renamed from: e */
    protected int f58172e;

    /* JADX INFO: renamed from: f */
    protected int f58173f;

    /* JADX INFO: renamed from: g */
    protected boolean f58174g;

    /* JADX INFO: renamed from: h */
    protected FloatBuffer f58175h;

    /* JADX INFO: renamed from: i */
    protected FloatBuffer f58176i;

    /* JADX INFO: renamed from: j */
    protected float[] f58177j;

    /* JADX INFO: renamed from: k */
    protected float[] f58178k;

    /* JADX INFO: renamed from: l */
    protected a f58179l;

    /* JADX INFO: renamed from: m */
    protected int f58180m;

    /* JADX INFO: renamed from: n */
    protected int f58181n;

    /* JADX INFO: renamed from: o */
    protected boolean f58182o;

    /* JADX INFO: renamed from: p */
    protected boolean f58183p;

    /* JADX INFO: renamed from: q */
    protected boolean f58184q;

    /* JADX INFO: renamed from: r */
    private final LinkedList<Runnable> f58185r;

    /* JADX INFO: renamed from: s */
    private final String f58186s;

    /* JADX INFO: renamed from: t */
    private final String f58187t;

    /* JADX INFO: renamed from: u */
    private boolean f58188u;

    /* JADX INFO: renamed from: v */
    private int f58189v;

    /* JADX INFO: renamed from: w */
    private float[] f58190w;

    /* JADX INFO: renamed from: com.tencent.liteav.basic.c.h$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo82642a(int i);
    }

    public C14015h(String str, String str2, boolean z) {
        this.f58188u = false;
        this.f58189v = -1;
        this.f58190w = null;
        this.f58180m = -1;
        this.f58181n = -1;
        this.f58182o = false;
        this.f58183p = false;
        this.f58184q = false;
        this.f58185r = new LinkedList<>();
        this.f58186s = str;
        this.f58187t = str2;
        this.f58184q = z;
        if (true == z) {
            TXCLog.m82969i("TXCGPUFilter", "set Oes fileter");
        }
        float[] fArr = C14019l.f58233e;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f58175h = floatBufferAsFloatBuffer;
        this.f58177j = fArr;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f58176i = ByteBuffer.allocateDirect(C14019l.f58229a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        float[] fArrM82837a = C14019l.m82837a(EnumC14018k.NORMAL, false, true);
        this.f58178k = fArrM82837a;
        this.f58176i.put(fArrM82837a).position(0);
    }

    /* JADX INFO: renamed from: a */
    public void m82787a(int i, int i2, int i3, float[] fArr, float f, boolean z, boolean z2) {
        float[] fArrM82837a = fArr == null ? C14019l.m82837a(EnumC14018k.NORMAL, false, true) : fArr;
        int i4 = i;
        float f2 = i4;
        int i5 = i2;
        float f3 = i5;
        float f4 = f2 / f3;
        if (f4 > f) {
            i4 = (int) (f3 * f);
        } else if (f4 < f) {
            i5 = (int) (f2 / f);
        }
        float f5 = (1.0f - (i4 / f2)) / 2.0f;
        float f6 = (1.0f - (i5 / f3)) / 2.0f;
        for (int i6 = 0; i6 < fArrM82837a.length / 2; i6++) {
            int i7 = i6 * 2;
            float f7 = fArrM82837a[i7];
            if (f7 < 0.5f) {
                fArrM82837a[i7] = f7 + f5;
            } else {
                fArrM82837a[i7] = f7 - f5;
            }
            int i8 = i7 + 1;
            float f8 = fArrM82837a[i8];
            if (f8 < 0.5f) {
                fArrM82837a[i8] = f8 + f6;
            } else {
                fArrM82837a[i8] = f8 - f6;
            }
        }
        int i9 = i3 / 90;
        for (int i10 = 0; i10 < i9; i10++) {
            float f9 = fArrM82837a[0];
            float f10 = fArrM82837a[1];
            fArrM82837a[0] = fArrM82837a[2];
            fArrM82837a[1] = fArrM82837a[3];
            fArrM82837a[2] = fArrM82837a[6];
            fArrM82837a[3] = fArrM82837a[7];
            fArrM82837a[6] = fArrM82837a[4];
            fArrM82837a[7] = fArrM82837a[5];
            fArrM82837a[4] = f9;
            fArrM82837a[5] = f10;
        }
        if (i9 == 0 || i9 == 2) {
            if (z) {
                fArrM82837a[0] = 1.0f - fArrM82837a[0];
                fArrM82837a[2] = 1.0f - fArrM82837a[2];
                fArrM82837a[4] = 1.0f - fArrM82837a[4];
                fArrM82837a[6] = 1.0f - fArrM82837a[6];
            }
            if (z2) {
                fArrM82837a[1] = 1.0f - fArrM82837a[1];
                fArrM82837a[3] = 1.0f - fArrM82837a[3];
                fArrM82837a[5] = 1.0f - fArrM82837a[5];
                fArrM82837a[7] = 1.0f - fArrM82837a[7];
            }
        } else {
            if (z2) {
                fArrM82837a[0] = 1.0f - fArrM82837a[0];
                fArrM82837a[2] = 1.0f - fArrM82837a[2];
                fArrM82837a[4] = 1.0f - fArrM82837a[4];
                fArrM82837a[6] = 1.0f - fArrM82837a[6];
            }
            if (z) {
                fArrM82837a[1] = 1.0f - fArrM82837a[1];
                fArrM82837a[3] = 1.0f - fArrM82837a[3];
                fArrM82837a[5] = 1.0f - fArrM82837a[5];
                fArrM82837a[7] = 1.0f - fArrM82837a[7];
            }
        }
        m82795a((float[]) C14019l.f58233e.clone(), fArrM82837a);
    }

    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        this.f58169b = GLES20.glGetAttribLocation(this.f58168a, "position");
        this.f58170c = GLES20.glGetUniformLocation(this.f58168a, "inputImageTexture");
        this.f58189v = GLES20.glGetUniformLocation(this.f58168a, "textureTransform");
        this.f58171d = GLES20.glGetAttribLocation(this.f58168a, "inputTextureCoordinate");
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m82805c(final int i, final float[] fArr) {
        m82792a(new Runnable() { // from class: com.tencent.liteav.basic.c.h.5
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniform4fv(i, 1, FloatBuffer.wrap(fArr));
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void mo82806d() {
        GLES20.glDeleteProgram(this.f58168a);
        mo82807e();
        this.f58174g = false;
    }

    /* JADX INFO: renamed from: e */
    public void mo82807e() {
        mo82808f();
        this.f58173f = -1;
        this.f58172e = -1;
    }

    /* JADX INFO: renamed from: f */
    public void mo82808f() {
        int i = this.f58180m;
        if (i != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.f58180m = -1;
        }
        int i2 = this.f58181n;
        if (i2 != -1) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.f58181n = -1;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m82809g() {
        if (this.f58178k != null) {
            for (int i = 0; i < 8; i += 2) {
                float[] fArr = this.f58178k;
                fArr[i] = 1.0f - fArr[i];
            }
            m82795a(this.f58177j, this.f58178k);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m82810h() {
        if (this.f58178k != null) {
            for (int i = 1; i < 8; i += 2) {
                float[] fArr = this.f58178k;
                fArr[i] = 1.0f - fArr[i];
            }
            m82795a(this.f58177j, this.f58178k);
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo82811i() {
    }

    /* JADX INFO: renamed from: j */
    public void mo82812j() {
    }

    /* JADX INFO: renamed from: k */
    public void m82813k() {
        while (!this.f58185r.isEmpty()) {
            this.f58185r.removeFirst().run();
        }
    }

    /* JADX INFO: renamed from: l */
    public int m82814l() {
        return this.f58181n;
    }

    /* JADX INFO: renamed from: m */
    public boolean m82815m() {
        return this.f58174g;
    }

    /* JADX INFO: renamed from: n */
    public int m82816n() {
        return this.f58172e;
    }

    /* JADX INFO: renamed from: o */
    public int m82817o() {
        return this.f58173f;
    }

    /* JADX INFO: renamed from: p */
    public int m82818p() {
        return this.f58168a;
    }

    /* JADX INFO: renamed from: c */
    public void mo82804c() {
    }

    /* JADX INFO: renamed from: b */
    public void m82802b(boolean z) {
        this.f58183p = z;
        TXCLog.m82969i("TXCGPUFilter", "set Nearest model " + z);
    }

    /* JADX INFO: renamed from: b */
    public int m82799b(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (!this.f58174g) {
            return -1;
        }
        mo82789a(i, floatBuffer, floatBuffer2);
        if (this.f58179l == null) {
            return 1;
        }
        this.f58179l.mo82642a(i);
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public int mo82798b(int i) {
        return mo82784a(i, this.f58180m, this.f58181n);
    }

    /* JADX INFO: renamed from: b */
    public void m82800b(final int i, final int i2) {
        m82792a(new Runnable() { // from class: com.tencent.liteav.basic.c.h.1
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniform1i(i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m82801b(final int i, final float[] fArr) {
        m82792a(new Runnable() { // from class: com.tencent.liteav.basic.c.h.4
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniform3fv(i, 1, FloatBuffer.wrap(fArr));
            }
        });
    }

    public C14015h(String str, String str2) {
        this(str, str2, false);
    }

    public C14015h() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}", false);
    }

    /* JADX INFO: renamed from: a */
    public void m82793a(boolean z) {
        this.f58182o = z;
    }

    /* JADX INFO: renamed from: a */
    public void m82791a(a aVar) {
        this.f58188u = aVar != null;
        this.f58179l = aVar;
    }

    /* JADX INFO: renamed from: a */
    private static float[] m82782a(FloatBuffer floatBuffer) {
        if (floatBuffer.limit() <= 0) {
            return null;
        }
        float[] fArr = new float[floatBuffer.limit()];
        for (int i = 0; i < floatBuffer.limit(); i++) {
            fArr[i] = floatBuffer.get(i);
        }
        return fArr;
    }

    /* JADX INFO: renamed from: a */
    public void mo82786a(int i, int i2) {
        if (this.f58173f == i2 && this.f58172e == i) {
            return;
        }
        this.f58172e = i;
        this.f58173f = i2;
        if (this.f58182o) {
            if (this.f58180m != -1) {
                mo82808f();
            }
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f58180m = iArr[0];
            this.f58181n = C14017j.m82820a(i, i2, 6408, 6408);
            GLES20.glBindFramebuffer(36160, this.f58180m);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f58181n, 0);
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo82789a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        float[] fArr;
        GLES20.glUseProgram(this.f58168a);
        m82813k();
        if (this.f58174g) {
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(this.f58169b, 2, 5126, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.f58169b);
            floatBuffer2.position(0);
            GLES20.glVertexAttribPointer(this.f58171d, 2, 5126, false, 0, (Buffer) floatBuffer2);
            GLES20.glEnableVertexAttribArray(this.f58171d);
            int i2 = this.f58189v;
            if (i2 >= 0 && (fArr = this.f58190w) != null) {
                GLES20.glUniformMatrix4fv(i2, 1, false, fArr, 0);
            }
            if (i != -1) {
                GLES20.glActiveTexture(33984);
                if (true == this.f58184q) {
                    GLES20.glBindTexture(36197, i);
                } else {
                    GLES20.glBindTexture(3553, i);
                }
                GLES20.glUniform1i(this.f58170c, 0);
            }
            mo82811i();
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f58169b);
            GLES20.glDisableVertexAttribArray(this.f58171d);
            mo82812j();
            if (true == this.f58184q) {
                GLES20.glBindTexture(36197, 0);
            } else {
                GLES20.glBindTexture(3553, 0);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo82794a(float[] fArr) {
        this.f58190w = fArr;
    }

    /* JADX INFO: renamed from: a */
    public int m82783a(int i) {
        return m82799b(i, this.f58175h, this.f58176i);
    }

    /* JADX INFO: renamed from: a */
    public int mo82784a(int i, int i2, int i3) {
        if (!this.f58174g) {
            return -1;
        }
        GLES20.glBindFramebuffer(36160, i2);
        mo82789a(i, this.f58175h, this.f58176i);
        if (this.f58179l != null) {
            this.f58179l.mo82642a(i3);
        }
        GLES20.glBindFramebuffer(36160, 0);
        return i3;
    }

    /* JADX INFO: renamed from: a */
    public void m82795a(float[] fArr, float[] fArr2) {
        this.f58177j = fArr;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(C14019l.f58233e.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f58175h = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f58178k = fArr2;
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(C14019l.f58229a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f58176i = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr2).position(0);
    }

    /* JADX INFO: renamed from: a */
    public float[] m82797a(int i, int i2, FloatBuffer floatBuffer, C14008a c14008a, int i3) {
        float[] fArrM82782a;
        if (floatBuffer != null) {
            fArrM82782a = m82782a(floatBuffer);
        } else if (4 == i3) {
            fArrM82782a = C14019l.m82837a(EnumC14018k.NORMAL, false, false);
        } else {
            fArrM82782a = C14019l.m82837a(EnumC14018k.NORMAL, false, true);
        }
        if (c14008a != null) {
            int i4 = c14008a.f58079a;
            float f = i * 1.0f;
            float f2 = i4 / f;
            float f3 = ((i - i4) - c14008a.f58081c) / f;
            int i5 = c14008a.f58080b;
            float f4 = i2 * 1.0f;
            float f5 = i5 / f4;
            float f6 = ((i2 - i5) - c14008a.f58082d) / f4;
            for (int i6 = 0; i6 < fArrM82782a.length / 2; i6++) {
                int i7 = i6 * 2;
                float f7 = fArrM82782a[i7];
                if (f7 < 0.5f) {
                    fArrM82782a[i7] = f7 + f2;
                } else {
                    fArrM82782a[i7] = f7 - f3;
                }
                int i8 = i7 + 1;
                float f8 = fArrM82782a[i8];
                if (f8 < 0.5f) {
                    fArrM82782a[i8] = f8 + f5;
                } else {
                    fArrM82782a[i8] = f8 - f6;
                }
            }
        }
        return fArrM82782a;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo82796a() {
        int iM82826a = C14017j.m82826a(this.f58186s, this.f58187t);
        this.f58168a = iM82826a;
        if (iM82826a != 0 && mo82803b()) {
            this.f58174g = true;
        } else {
            this.f58174g = false;
        }
        mo82804c();
        return this.f58174g;
    }

    /* JADX INFO: renamed from: a */
    public void m82788a(int i, FloatBuffer floatBuffer) {
        float[] fArrM82782a;
        if (floatBuffer == null) {
            fArrM82782a = C14019l.m82837a(EnumC14018k.NORMAL, false, true);
        } else {
            fArrM82782a = m82782a(floatBuffer);
        }
        int i2 = i / 90;
        for (int i3 = 0; i3 < i2; i3++) {
            float f = fArrM82782a[0];
            float f2 = fArrM82782a[1];
            fArrM82782a[0] = fArrM82782a[2];
            fArrM82782a[1] = fArrM82782a[3];
            fArrM82782a[2] = fArrM82782a[6];
            fArrM82782a[3] = fArrM82782a[7];
            fArrM82782a[6] = fArrM82782a[4];
            fArrM82782a[7] = fArrM82782a[5];
            fArrM82782a[4] = f;
            fArrM82782a[5] = f2;
        }
        m82795a((float[]) C14019l.f58233e.clone(), fArrM82782a);
    }

    /* JADX INFO: renamed from: a */
    public void m82785a(final int i, final float f) {
        m82792a(new Runnable() { // from class: com.tencent.liteav.basic.c.h.2
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniform1f(i, f);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m82790a(final int i, final float[] fArr) {
        m82792a(new Runnable() { // from class: com.tencent.liteav.basic.c.h.3
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniform2fv(i, 1, FloatBuffer.wrap(fArr));
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m82792a(Runnable runnable) {
        synchronized (this.f58185r) {
            this.f58185r.addLast(runnable);
        }
    }
}
