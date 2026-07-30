package p149l;

import android.opengl.GLES20;
import android.util.Log;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;

/* JADX INFO: loaded from: classes7.dex */
public class sbj {

    /* JADX INFO: renamed from: a */
    public boolean f163545a;

    /* JADX INFO: renamed from: i */
    private int f163553i;

    /* JADX INFO: renamed from: j */
    private int f163554j;

    /* JADX INFO: renamed from: g */
    private Object f163551g = new Object();

    /* JADX INFO: renamed from: k */
    private boolean f163555k = false;

    /* JADX INFO: renamed from: l */
    private boolean f163556l = false;

    /* JADX INFO: renamed from: b */
    protected int[] f163546b = new int[1];

    /* JADX INFO: renamed from: c */
    protected int[] f163547c = new int[1];

    /* JADX INFO: renamed from: d */
    protected int[] f163548d = new int[1];

    /* JADX INFO: renamed from: e */
    protected int[] f163549e = new int[1];

    /* JADX INFO: renamed from: f */
    protected int[] f163550f = new int[1];

    /* JADX INFO: renamed from: h */
    private int f163552h = 0;

    public sbj(int i, int i2) {
    }

    /* JADX INFO: renamed from: a */
    public void m183221a(int i, int i2) {
        if (this.f163555k) {
            return;
        }
        if (this.f163546b == null) {
            this.f163546b = new int[1];
            this.f163548d = new int[1];
            this.f163549e = new int[1];
            this.f163552h = 0;
        }
        this.f163553i = i;
        this.f163554j = i2;
        GLES20.glGenFramebuffers(1, this.f163546b, 0);
        GLES20.glGenRenderbuffers(1, this.f163549e, 0);
        GLES20.glGenTextures(1, this.f163548d, 0);
        GLES20.glBindFramebuffer(36160, this.f163546b[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f163548d[0]);
        if (this.f163556l) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
            MDLog.m7395i(MDLogTag.FILTER_TAG, "use half float ");
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        }
        Log.e("GLFrameBuffer", "frameBufferNumber" + this.f163548d[0]);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f163548d[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f163549e[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f163549e[0]);
        this.f163555k = true;
    }

    /* JADX INFO: renamed from: b */
    public void m183222b(int i, int i2) {
        if (this.f163555k) {
            return;
        }
        this.f163553i = i;
        this.f163554j = i2;
        GLES20.glGenFramebuffers(1, this.f163546b, 0);
        GLES20.glGenRenderbuffers(1, this.f163549e, 0);
        GLES20.glGenTextures(1, this.f163548d, 0);
        GLES20.glBindFramebuffer(36160, this.f163546b[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f163548d[0]);
        if (this.f163556l) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
            MDLog.m7395i(MDLogTag.FILTER_TAG, "use half float ");
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        }
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f163548d[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f163549e[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f163549e[0]);
        this.f163555k = true;
    }

    /* JADX INFO: renamed from: c */
    public void m183223c() {
        int[] iArr = this.f163546b;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f163546b = null;
        }
        int[] iArr2 = this.f163547c;
        if (iArr2 != null) {
            GLES20.glDeleteFramebuffers(1, iArr2, 0);
            this.f163547c = null;
        }
        int[] iArr3 = this.f163548d;
        if (iArr3 != null) {
            GLES20.glDeleteTextures(1, iArr3, 0);
            this.f163548d = null;
        }
        int[] iArr4 = this.f163549e;
        if (iArr4 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr4, 0);
            this.f163549e = null;
        }
        int[] iArr5 = this.f163550f;
        if (iArr5 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr5, 0);
            this.f163550f = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public int[] m183224d() {
        return this.f163546b;
    }

    /* JADX INFO: renamed from: e */
    public int[] m183225e() {
        return this.f163548d;
    }

    /* JADX INFO: renamed from: f */
    public void m183226f(boolean z) {
        if (GLES20.glGetString(7939).contains("GL_OES_texture_half_float")) {
            this.f163556l = z;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m183227g() {
        synchronized (this.f163551g) {
            try {
                int i = this.f163552h - 1;
                this.f163552h = i;
                if (i < 1) {
                    this.f163545a = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
