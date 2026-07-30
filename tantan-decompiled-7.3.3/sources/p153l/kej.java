package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes7.dex */
public class kej {

    /* JADX INFO: renamed from: a */
    public boolean f126188a;

    /* JADX INFO: renamed from: g */
    private int f126194g;

    /* JADX INFO: renamed from: h */
    private int f126195h;

    /* JADX INFO: renamed from: e */
    private Object f126192e = new Object();

    /* JADX INFO: renamed from: i */
    private boolean f126196i = false;

    /* JADX INFO: renamed from: j */
    private boolean f126197j = false;

    /* JADX INFO: renamed from: b */
    protected int[] f126189b = new int[1];

    /* JADX INFO: renamed from: c */
    protected int[] f126190c = new int[1];

    /* JADX INFO: renamed from: d */
    protected int[] f126191d = new int[1];

    /* JADX INFO: renamed from: f */
    private int f126193f = 0;

    public kej(int i, int i2) {
    }

    /* JADX INFO: renamed from: a */
    public void m149329a(int i, int i2) {
        if (this.f126196i) {
            return;
        }
        this.f126194g = i;
        this.f126195h = i2;
        GLES20.glGenFramebuffers(1, this.f126189b, 0);
        GLES20.glGenRenderbuffers(1, this.f126191d, 0);
        GLES20.glGenTextures(1, this.f126190c, 0);
        GLES20.glBindFramebuffer(36160, this.f126189b[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f126190c[0]);
        if (this.f126197j) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        }
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f126190c[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f126191d[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f126191d[0]);
        this.f126196i = true;
    }

    /* JADX INFO: renamed from: b */
    public void m149330b() {
        int[] iArr = this.f126189b;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f126189b = null;
        }
        int[] iArr2 = this.f126190c;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f126190c = null;
        }
        int[] iArr3 = this.f126191d;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f126191d = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public int[] m149331c() {
        return this.f126189b;
    }

    /* JADX INFO: renamed from: d */
    public int[] m149332d() {
        return this.f126190c;
    }

    /* JADX INFO: renamed from: e */
    public void m149333e(boolean z) {
        String strGlGetString = GLES20.glGetString(7939);
        if (strGlGetString == null || !strGlGetString.contains("GL_OES_texture_half_float")) {
            return;
        }
        this.f126197j = z;
    }

    /* JADX INFO: renamed from: f */
    public void m149334f() {
        synchronized (this.f126192e) {
            try {
                int i = this.f126193f - 1;
                this.f126193f = i;
                if (i < 1) {
                    this.f126188a = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
