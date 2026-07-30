package p003l;

import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.Log;
import com.cosmos.mdlog.MDLog;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class rbj {

    /* JADX INFO: renamed from: a */
    public boolean f6829a;

    /* JADX INFO: renamed from: i */
    private int f6837i;

    /* JADX INFO: renamed from: j */
    private int f6838j;

    /* JADX INFO: renamed from: g */
    private Object f6835g = new Object();

    /* JADX INFO: renamed from: k */
    private boolean f6839k = false;

    /* JADX INFO: renamed from: l */
    private boolean f6840l = false;

    /* JADX INFO: renamed from: m */
    private boolean f6841m = false;

    /* JADX INFO: renamed from: b */
    protected int[] f6830b = new int[1];

    /* JADX INFO: renamed from: c */
    protected int[] f6831c = new int[1];

    /* JADX INFO: renamed from: d */
    protected int[] f6832d = new int[1];

    /* JADX INFO: renamed from: e */
    protected int[] f6833e = new int[1];

    /* JADX INFO: renamed from: f */
    protected int[] f6834f = new int[1];

    /* JADX INFO: renamed from: h */
    public int f6836h = 0;

    public rbj(int i, int i2) {
    }

    /* JADX INFO: renamed from: a */
    public void m7165a(int i, int i2) {
        if (this.f6839k) {
            return;
        }
        if (this.f6830b == null) {
            this.f6830b = new int[1];
            this.f6832d = new int[1];
            this.f6833e = new int[1];
            this.f6836h = 0;
        }
        this.f6837i = i;
        this.f6838j = i2;
        GLES20.glGenFramebuffers(1, this.f6830b, 0);
        GLES20.glGenRenderbuffers(1, this.f6833e, 0);
        GLES20.glGenTextures(1, this.f6832d, 0);
        GLES20.glBindFramebuffer(36160, this.f6830b[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f6832d[0]);
        if (this.f6841m) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
            MDLog.i("FilterProcess", "use half float ");
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        }
        Log.e("GLFrameBuffer", "frameBufferNumber" + this.f6832d[0]);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f6832d[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f6833e[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f6833e[0]);
        this.f6839k = true;
    }

    /* JADX INFO: renamed from: b */
    public void m7166b(int i, int i2) {
        if (this.f6839k) {
            return;
        }
        if (this.f6830b == null) {
            this.f6830b = new int[1];
            this.f6832d = new int[1];
            this.f6833e = new int[1];
            this.f6836h = 0;
        }
        this.f6837i = i;
        this.f6838j = i2;
        GLES20.glGenFramebuffers(1, this.f6830b, 0);
        GLES20.glGenRenderbuffers(1, this.f6833e, 0);
        GLES20.glGenTextures(1, this.f6832d, 0);
        GLES20.glBindFramebuffer(36160, this.f6830b[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f6832d[0]);
        if (this.f6841m) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
            MDLog.i("FilterProcess", "use half float ");
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        }
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f6832d[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f6833e[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f6833e[0]);
        this.f6839k = true;
    }

    /* JADX INFO: renamed from: c */
    public void m7167c(int i, int i2) {
        if (this.f6840l) {
            m7169e();
        }
        if (this.f6839k) {
            return;
        }
        if (this.f6830b == null) {
            this.f6830b = new int[1];
            this.f6832d = new int[1];
            this.f6836h = 0;
        }
        this.f6837i = i;
        this.f6838j = i2;
        GLES20.glGenFramebuffers(1, this.f6830b, 0);
        GLES20.glGenTextures(1, this.f6832d, 0);
        GLES20.glBindFramebuffer(36160, this.f6830b[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f6832d[0]);
        if (this.f6841m) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
            MDLog.i("FilterProcess", "use half float ");
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        }
        GLES20.glTexParameteri(3553, 10242, 10497);
        GLES20.glTexParameteri(3553, 10243, 10497);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f6832d[0], 0);
        this.f6839k = true;
    }

    /* JADX INFO: renamed from: d */
    public void m7168d(int i, int i2) {
        int i3;
        int i4;
        if (this.f6839k) {
            return;
        }
        this.f6837i = i;
        this.f6838j = i2;
        GLES20.glGenRenderbuffers(1, this.f6833e, 0);
        GLES20.glBindRenderbuffer(36161, this.f6833e[0]);
        GLES30.glRenderbufferStorageMultisample(36161, 4, 32856, i, i2);
        GLES20.glBindRenderbuffer(36161, 0);
        GLES20.glGenFramebuffers(1, this.f6830b, 0);
        GLES20.glBindFramebuffer(36160, this.f6830b[0]);
        GLES20.glFramebufferRenderbuffer(36160, 36064, 36161, this.f6833e[0]);
        GLES20.glGenTextures(1, this.f6832d, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f6832d[0]);
        if (this.f6841m) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
            MDLog.i("FilterProcess", "use half float ");
            i3 = i;
            i4 = i2;
        } else {
            i3 = i;
            i4 = i2;
            GLES20.glTexImage2D(3553, 0, 6408, i3, i4, 0, 6408, 5121, null);
        }
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glGenRenderbuffers(1, this.f6834f, 0);
        GLES20.glBindRenderbuffer(36161, this.f6834f[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i3, i4);
        GLES20.glGenFramebuffers(1, this.f6831c, 0);
        GLES20.glBindFramebuffer(36160, this.f6831c[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f6832d[0], 0);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f6834f[0]);
        this.f6839k = true;
    }

    /* JADX INFO: renamed from: e */
    public void m7169e() {
        if (ybj.m9172d().m9174b(this)) {
            m7176l();
            return;
        }
        int[] iArr = this.f6830b;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f6830b = null;
        }
        int[] iArr2 = this.f6831c;
        if (iArr2 != null) {
            GLES20.glDeleteFramebuffers(1, iArr2, 0);
            this.f6831c = null;
        }
        int[] iArr3 = this.f6832d;
        if (iArr3 != null) {
            GLES20.glDeleteTextures(1, iArr3, 0);
            this.f6832d = null;
        }
        int[] iArr4 = this.f6833e;
        if (iArr4 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr4, 0);
            this.f6833e = null;
        }
        int[] iArr5 = this.f6834f;
        if (iArr5 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr5, 0);
            this.f6834f = null;
        }
        m7176l();
        this.f6839k = false;
    }

    /* JADX INFO: renamed from: f */
    public int m7170f() {
        return this.f6838j;
    }

    /* JADX INFO: renamed from: g */
    public int m7171g() {
        return this.f6837i;
    }

    /* JADX INFO: renamed from: h */
    public int[] m7172h() {
        return this.f6830b;
    }

    /* JADX INFO: renamed from: i */
    public int[] m7173i() {
        return this.f6832d;
    }

    /* JADX INFO: renamed from: j */
    public void m7174j() {
        synchronized (this.f6835g) {
            this.f6829a = true;
            this.f6836h++;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m7175k(boolean z) {
        String strGlGetString = GLES20.glGetString(7939);
        if (strGlGetString == null || !strGlGetString.contains("GL_OES_texture_half_float")) {
            return;
        }
        this.f6841m = z;
    }

    /* JADX INFO: renamed from: l */
    public void m7176l() {
        synchronized (this.f6835g) {
            try {
                int i = this.f6836h - 1;
                this.f6836h = i;
                if (i < 1) {
                    this.f6829a = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m7177m(int i, int i2) {
        GLES20.glBindFramebuffer(36009, this.f6831c[0]);
        GLES20.glBindFramebuffer(36008, this.f6830b[0]);
        GLES30.glBlitFramebuffer(0, 0, i, i2, 0, 0, i, i2, 16384, 9729);
    }
}
