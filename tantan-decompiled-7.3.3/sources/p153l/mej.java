package p153l;

import android.opengl.GLES20;
import android.util.Log;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;

/* JADX INFO: loaded from: classes7.dex */
public class mej {

    /* JADX INFO: renamed from: a */
    public boolean f136503a;

    /* JADX INFO: renamed from: i */
    private int f136511i;

    /* JADX INFO: renamed from: j */
    private int f136512j;

    /* JADX INFO: renamed from: g */
    private Object f136509g = new Object();

    /* JADX INFO: renamed from: k */
    private boolean f136513k = false;

    /* JADX INFO: renamed from: l */
    private boolean f136514l = false;

    /* JADX INFO: renamed from: b */
    protected int[] f136504b = new int[1];

    /* JADX INFO: renamed from: c */
    protected int[] f136505c = new int[1];

    /* JADX INFO: renamed from: d */
    protected int[] f136506d = new int[1];

    /* JADX INFO: renamed from: e */
    protected int[] f136507e = new int[1];

    /* JADX INFO: renamed from: f */
    protected int[] f136508f = new int[1];

    /* JADX INFO: renamed from: h */
    private int f136510h = 0;

    public mej(int i, int i2) {
    }

    /* JADX INFO: renamed from: a */
    public void m158023a(int i, int i2) {
        if (this.f136513k) {
            return;
        }
        if (this.f136504b == null) {
            this.f136504b = new int[1];
            this.f136506d = new int[1];
            this.f136507e = new int[1];
            this.f136510h = 0;
        }
        this.f136511i = i;
        this.f136512j = i2;
        GLES20.glGenFramebuffers(1, this.f136504b, 0);
        GLES20.glGenRenderbuffers(1, this.f136507e, 0);
        GLES20.glGenTextures(1, this.f136506d, 0);
        GLES20.glBindFramebuffer(36160, this.f136504b[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f136506d[0]);
        if (this.f136514l) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
            MDLog.m7449i(MDLogTag.FILTER_TAG, "use half float ");
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        }
        Log.e("GLFrameBuffer", "frameBufferNumber" + this.f136506d[0]);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f136506d[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f136507e[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f136507e[0]);
        this.f136513k = true;
    }

    /* JADX INFO: renamed from: b */
    public void m158024b(int i, int i2) {
        if (this.f136513k) {
            return;
        }
        this.f136511i = i;
        this.f136512j = i2;
        GLES20.glGenFramebuffers(1, this.f136504b, 0);
        GLES20.glGenRenderbuffers(1, this.f136507e, 0);
        GLES20.glGenTextures(1, this.f136506d, 0);
        GLES20.glBindFramebuffer(36160, this.f136504b[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f136506d[0]);
        if (this.f136514l) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
            MDLog.m7449i(MDLogTag.FILTER_TAG, "use half float ");
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        }
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f136506d[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f136507e[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f136507e[0]);
        this.f136513k = true;
    }

    /* JADX INFO: renamed from: c */
    public void m158025c() {
        int[] iArr = this.f136504b;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f136504b = null;
        }
        int[] iArr2 = this.f136505c;
        if (iArr2 != null) {
            GLES20.glDeleteFramebuffers(1, iArr2, 0);
            this.f136505c = null;
        }
        int[] iArr3 = this.f136506d;
        if (iArr3 != null) {
            GLES20.glDeleteTextures(1, iArr3, 0);
            this.f136506d = null;
        }
        int[] iArr4 = this.f136507e;
        if (iArr4 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr4, 0);
            this.f136507e = null;
        }
        int[] iArr5 = this.f136508f;
        if (iArr5 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr5, 0);
            this.f136508f = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public int[] m158026d() {
        return this.f136504b;
    }

    /* JADX INFO: renamed from: e */
    public int[] m158027e() {
        return this.f136506d;
    }

    /* JADX INFO: renamed from: f */
    public void m158028f(boolean z) {
        if (GLES20.glGetString(7939).contains("GL_OES_texture_half_float")) {
            this.f136514l = z;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m158029g() {
        synchronized (this.f136509g) {
            try {
                int i = this.f136510h - 1;
                this.f136510h = i;
                if (i < 1) {
                    this.f136503a = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
