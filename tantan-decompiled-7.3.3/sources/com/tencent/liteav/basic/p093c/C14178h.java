package com.tencent.liteav.basic.p093c;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.tencent.liteav.basic.c.h */
/* JADX INFO: loaded from: classes2.dex */
public class C14178h {

    /* JADX INFO: renamed from: a */
    protected int f59016a;

    /* JADX INFO: renamed from: b */
    protected int f59017b;

    /* JADX INFO: renamed from: c */
    protected int f59018c;

    /* JADX INFO: renamed from: d */
    protected int f59019d;

    /* JADX INFO: renamed from: e */
    protected int f59020e;

    /* JADX INFO: renamed from: f */
    protected int f59021f;

    /* JADX INFO: renamed from: g */
    protected boolean f59022g;

    /* JADX INFO: renamed from: h */
    protected FloatBuffer f59023h;

    /* JADX INFO: renamed from: i */
    protected FloatBuffer f59024i;

    /* JADX INFO: renamed from: j */
    protected float[] f59025j;

    /* JADX INFO: renamed from: k */
    protected float[] f59026k;

    /* JADX INFO: renamed from: l */
    protected a f59027l;

    /* JADX INFO: renamed from: m */
    protected int f59028m;

    /* JADX INFO: renamed from: n */
    protected int f59029n;

    /* JADX INFO: renamed from: o */
    protected boolean f59030o;

    /* JADX INFO: renamed from: p */
    protected boolean f59031p;

    /* JADX INFO: renamed from: q */
    protected boolean f59032q;

    /* JADX INFO: renamed from: r */
    private final LinkedList<Runnable> f59033r;

    /* JADX INFO: renamed from: s */
    private final String f59034s;

    /* JADX INFO: renamed from: t */
    private final String f59035t;

    /* JADX INFO: renamed from: u */
    private boolean f59036u;

    /* JADX INFO: renamed from: v */
    private int f59037v;

    /* JADX INFO: renamed from: w */
    private float[] f59038w;

    /* JADX INFO: renamed from: com.tencent.liteav.basic.c.h$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo83825a(int i);
    }

    public C14178h(String str, String str2, boolean z) {
        this.f59036u = false;
        this.f59037v = -1;
        this.f59038w = null;
        this.f59028m = -1;
        this.f59029n = -1;
        this.f59030o = false;
        this.f59031p = false;
        this.f59032q = false;
        this.f59033r = new LinkedList<>();
        this.f59034s = str;
        this.f59035t = str2;
        this.f59032q = z;
        if (true == z) {
            TXCLog.m84152i("TXCGPUFilter", "set Oes fileter");
        }
        float[] fArr = C14182l.f59081e;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f59023h = floatBufferAsFloatBuffer;
        this.f59025j = fArr;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f59024i = ByteBuffer.allocateDirect(C14182l.f59077a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        float[] fArrM84020a = C14182l.m84020a(EnumC14181k.NORMAL, false, true);
        this.f59026k = fArrM84020a;
        this.f59024i.put(fArrM84020a).position(0);
    }

    /* JADX INFO: renamed from: a */
    public void m83970a(int i, int i2, int i3, float[] fArr, float f, boolean z, boolean z2) {
        float[] fArrM84020a = fArr == null ? C14182l.m84020a(EnumC14181k.NORMAL, false, true) : fArr;
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
        for (int i6 = 0; i6 < fArrM84020a.length / 2; i6++) {
            int i7 = i6 * 2;
            float f7 = fArrM84020a[i7];
            if (f7 < 0.5f) {
                fArrM84020a[i7] = f7 + f5;
            } else {
                fArrM84020a[i7] = f7 - f5;
            }
            int i8 = i7 + 1;
            float f8 = fArrM84020a[i8];
            if (f8 < 0.5f) {
                fArrM84020a[i8] = f8 + f6;
            } else {
                fArrM84020a[i8] = f8 - f6;
            }
        }
        int i9 = i3 / 90;
        for (int i10 = 0; i10 < i9; i10++) {
            float f9 = fArrM84020a[0];
            float f10 = fArrM84020a[1];
            fArrM84020a[0] = fArrM84020a[2];
            fArrM84020a[1] = fArrM84020a[3];
            fArrM84020a[2] = fArrM84020a[6];
            fArrM84020a[3] = fArrM84020a[7];
            fArrM84020a[6] = fArrM84020a[4];
            fArrM84020a[7] = fArrM84020a[5];
            fArrM84020a[4] = f9;
            fArrM84020a[5] = f10;
        }
        if (i9 == 0 || i9 == 2) {
            if (z) {
                fArrM84020a[0] = 1.0f - fArrM84020a[0];
                fArrM84020a[2] = 1.0f - fArrM84020a[2];
                fArrM84020a[4] = 1.0f - fArrM84020a[4];
                fArrM84020a[6] = 1.0f - fArrM84020a[6];
            }
            if (z2) {
                fArrM84020a[1] = 1.0f - fArrM84020a[1];
                fArrM84020a[3] = 1.0f - fArrM84020a[3];
                fArrM84020a[5] = 1.0f - fArrM84020a[5];
                fArrM84020a[7] = 1.0f - fArrM84020a[7];
            }
        } else {
            if (z2) {
                fArrM84020a[0] = 1.0f - fArrM84020a[0];
                fArrM84020a[2] = 1.0f - fArrM84020a[2];
                fArrM84020a[4] = 1.0f - fArrM84020a[4];
                fArrM84020a[6] = 1.0f - fArrM84020a[6];
            }
            if (z) {
                fArrM84020a[1] = 1.0f - fArrM84020a[1];
                fArrM84020a[3] = 1.0f - fArrM84020a[3];
                fArrM84020a[5] = 1.0f - fArrM84020a[5];
                fArrM84020a[7] = 1.0f - fArrM84020a[7];
            }
        }
        m83978a((float[]) C14182l.f59081e.clone(), fArrM84020a);
    }

    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        this.f59017b = GLES20.glGetAttribLocation(this.f59016a, "position");
        this.f59018c = GLES20.glGetUniformLocation(this.f59016a, "inputImageTexture");
        this.f59037v = GLES20.glGetUniformLocation(this.f59016a, "textureTransform");
        this.f59019d = GLES20.glGetAttribLocation(this.f59016a, "inputTextureCoordinate");
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m83988c(final int i, final float[] fArr) {
        m83975a(new Runnable() { // from class: com.tencent.liteav.basic.c.h.5
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniform4fv(i, 1, FloatBuffer.wrap(fArr));
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void mo83989d() {
        GLES20.glDeleteProgram(this.f59016a);
        mo83990e();
        this.f59022g = false;
    }

    /* JADX INFO: renamed from: e */
    public void mo83990e() {
        mo83991f();
        this.f59021f = -1;
        this.f59020e = -1;
    }

    /* JADX INFO: renamed from: f */
    public void mo83991f() {
        int i = this.f59028m;
        if (i != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.f59028m = -1;
        }
        int i2 = this.f59029n;
        if (i2 != -1) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.f59029n = -1;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m83992g() {
        if (this.f59026k != null) {
            for (int i = 0; i < 8; i += 2) {
                float[] fArr = this.f59026k;
                fArr[i] = 1.0f - fArr[i];
            }
            m83978a(this.f59025j, this.f59026k);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m83993h() {
        if (this.f59026k != null) {
            for (int i = 1; i < 8; i += 2) {
                float[] fArr = this.f59026k;
                fArr[i] = 1.0f - fArr[i];
            }
            m83978a(this.f59025j, this.f59026k);
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo83994i() {
    }

    /* JADX INFO: renamed from: j */
    public void mo83995j() {
    }

    /* JADX INFO: renamed from: k */
    public void m83996k() {
        while (!this.f59033r.isEmpty()) {
            this.f59033r.removeFirst().run();
        }
    }

    /* JADX INFO: renamed from: l */
    public int m83997l() {
        return this.f59029n;
    }

    /* JADX INFO: renamed from: m */
    public boolean m83998m() {
        return this.f59022g;
    }

    /* JADX INFO: renamed from: n */
    public int m83999n() {
        return this.f59020e;
    }

    /* JADX INFO: renamed from: o */
    public int m84000o() {
        return this.f59021f;
    }

    /* JADX INFO: renamed from: p */
    public int m84001p() {
        return this.f59016a;
    }

    /* JADX INFO: renamed from: c */
    public void mo83987c() {
    }

    /* JADX INFO: renamed from: b */
    public void m83985b(boolean z) {
        this.f59031p = z;
        TXCLog.m84152i("TXCGPUFilter", "set Nearest model " + z);
    }

    /* JADX INFO: renamed from: b */
    public int m83982b(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (!this.f59022g) {
            return -1;
        }
        mo83972a(i, floatBuffer, floatBuffer2);
        if (this.f59027l == null) {
            return 1;
        }
        this.f59027l.mo83825a(i);
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public int mo83981b(int i) {
        return mo83967a(i, this.f59028m, this.f59029n);
    }

    /* JADX INFO: renamed from: b */
    public void m83983b(final int i, final int i2) {
        m83975a(new Runnable() { // from class: com.tencent.liteav.basic.c.h.1
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniform1i(i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m83984b(final int i, final float[] fArr) {
        m83975a(new Runnable() { // from class: com.tencent.liteav.basic.c.h.4
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniform3fv(i, 1, FloatBuffer.wrap(fArr));
            }
        });
    }

    public C14178h(String str, String str2) {
        this(str, str2, false);
    }

    public C14178h() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}", false);
    }

    /* JADX INFO: renamed from: a */
    public void m83976a(boolean z) {
        this.f59030o = z;
    }

    /* JADX INFO: renamed from: a */
    public void m83974a(a aVar) {
        this.f59036u = aVar != null;
        this.f59027l = aVar;
    }

    /* JADX INFO: renamed from: a */
    private static float[] m83965a(FloatBuffer floatBuffer) {
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
    public void mo83969a(int i, int i2) {
        if (this.f59021f == i2 && this.f59020e == i) {
            return;
        }
        this.f59020e = i;
        this.f59021f = i2;
        if (this.f59030o) {
            if (this.f59028m != -1) {
                mo83991f();
            }
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f59028m = iArr[0];
            this.f59029n = C14180j.m84003a(i, i2, 6408, 6408);
            GLES20.glBindFramebuffer(36160, this.f59028m);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f59029n, 0);
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo83972a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        float[] fArr;
        GLES20.glUseProgram(this.f59016a);
        m83996k();
        if (this.f59022g) {
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(this.f59017b, 2, 5126, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.f59017b);
            floatBuffer2.position(0);
            GLES20.glVertexAttribPointer(this.f59019d, 2, 5126, false, 0, (Buffer) floatBuffer2);
            GLES20.glEnableVertexAttribArray(this.f59019d);
            int i2 = this.f59037v;
            if (i2 >= 0 && (fArr = this.f59038w) != null) {
                GLES20.glUniformMatrix4fv(i2, 1, false, fArr, 0);
            }
            if (i != -1) {
                GLES20.glActiveTexture(33984);
                if (true == this.f59032q) {
                    GLES20.glBindTexture(36197, i);
                } else {
                    GLES20.glBindTexture(3553, i);
                }
                GLES20.glUniform1i(this.f59018c, 0);
            }
            mo83994i();
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f59017b);
            GLES20.glDisableVertexAttribArray(this.f59019d);
            mo83995j();
            if (true == this.f59032q) {
                GLES20.glBindTexture(36197, 0);
            } else {
                GLES20.glBindTexture(3553, 0);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo83977a(float[] fArr) {
        this.f59038w = fArr;
    }

    /* JADX INFO: renamed from: a */
    public int m83966a(int i) {
        return m83982b(i, this.f59023h, this.f59024i);
    }

    /* JADX INFO: renamed from: a */
    public int mo83967a(int i, int i2, int i3) {
        if (!this.f59022g) {
            return -1;
        }
        GLES20.glBindFramebuffer(36160, i2);
        mo83972a(i, this.f59023h, this.f59024i);
        if (this.f59027l != null) {
            this.f59027l.mo83825a(i3);
        }
        GLES20.glBindFramebuffer(36160, 0);
        return i3;
    }

    /* JADX INFO: renamed from: a */
    public void m83978a(float[] fArr, float[] fArr2) {
        this.f59025j = fArr;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(C14182l.f59081e.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f59023h = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f59026k = fArr2;
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(C14182l.f59077a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f59024i = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr2).position(0);
    }

    /* JADX INFO: renamed from: a */
    public float[] m83980a(int i, int i2, FloatBuffer floatBuffer, C14171a c14171a, int i3) {
        float[] fArrM83965a;
        if (floatBuffer != null) {
            fArrM83965a = m83965a(floatBuffer);
        } else if (4 == i3) {
            fArrM83965a = C14182l.m84020a(EnumC14181k.NORMAL, false, false);
        } else {
            fArrM83965a = C14182l.m84020a(EnumC14181k.NORMAL, false, true);
        }
        if (c14171a != null) {
            int i4 = c14171a.f58927a;
            float f = i * 1.0f;
            float f2 = i4 / f;
            float f3 = ((i - i4) - c14171a.f58929c) / f;
            int i5 = c14171a.f58928b;
            float f4 = i2 * 1.0f;
            float f5 = i5 / f4;
            float f6 = ((i2 - i5) - c14171a.f58930d) / f4;
            for (int i6 = 0; i6 < fArrM83965a.length / 2; i6++) {
                int i7 = i6 * 2;
                float f7 = fArrM83965a[i7];
                if (f7 < 0.5f) {
                    fArrM83965a[i7] = f7 + f2;
                } else {
                    fArrM83965a[i7] = f7 - f3;
                }
                int i8 = i7 + 1;
                float f8 = fArrM83965a[i8];
                if (f8 < 0.5f) {
                    fArrM83965a[i8] = f8 + f5;
                } else {
                    fArrM83965a[i8] = f8 - f6;
                }
            }
        }
        return fArrM83965a;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo83979a() {
        int iM84009a = C14180j.m84009a(this.f59034s, this.f59035t);
        this.f59016a = iM84009a;
        if (iM84009a != 0 && mo83986b()) {
            this.f59022g = true;
        } else {
            this.f59022g = false;
        }
        mo83987c();
        return this.f59022g;
    }

    /* JADX INFO: renamed from: a */
    public void m83971a(int i, FloatBuffer floatBuffer) {
        float[] fArrM83965a;
        if (floatBuffer == null) {
            fArrM83965a = C14182l.m84020a(EnumC14181k.NORMAL, false, true);
        } else {
            fArrM83965a = m83965a(floatBuffer);
        }
        int i2 = i / 90;
        for (int i3 = 0; i3 < i2; i3++) {
            float f = fArrM83965a[0];
            float f2 = fArrM83965a[1];
            fArrM83965a[0] = fArrM83965a[2];
            fArrM83965a[1] = fArrM83965a[3];
            fArrM83965a[2] = fArrM83965a[6];
            fArrM83965a[3] = fArrM83965a[7];
            fArrM83965a[6] = fArrM83965a[4];
            fArrM83965a[7] = fArrM83965a[5];
            fArrM83965a[4] = f;
            fArrM83965a[5] = f2;
        }
        m83978a((float[]) C14182l.f59081e.clone(), fArrM83965a);
    }

    /* JADX INFO: renamed from: a */
    public void m83968a(final int i, final float f) {
        m83975a(new Runnable() { // from class: com.tencent.liteav.basic.c.h.2
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniform1f(i, f);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m83973a(final int i, final float[] fArr) {
        m83975a(new Runnable() { // from class: com.tencent.liteav.basic.c.h.3
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniform2fv(i, 1, FloatBuffer.wrap(fArr));
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m83975a(Runnable runnable) {
        synchronized (this.f59033r) {
            this.f59033r.addLast(runnable);
        }
    }
}
