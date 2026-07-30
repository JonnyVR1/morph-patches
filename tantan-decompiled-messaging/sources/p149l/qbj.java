package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes7.dex */
public class qbj {

    /* JADX INFO: renamed from: a */
    public boolean f153654a;

    /* JADX INFO: renamed from: g */
    private int f153660g;

    /* JADX INFO: renamed from: h */
    private int f153661h;

    /* JADX INFO: renamed from: e */
    private Object f153658e = new Object();

    /* JADX INFO: renamed from: i */
    private boolean f153662i = false;

    /* JADX INFO: renamed from: j */
    private boolean f153663j = false;

    /* JADX INFO: renamed from: b */
    protected int[] f153655b = new int[1];

    /* JADX INFO: renamed from: c */
    protected int[] f153656c = new int[1];

    /* JADX INFO: renamed from: d */
    protected int[] f153657d = new int[1];

    /* JADX INFO: renamed from: f */
    private int f153659f = 0;

    public qbj(int i, int i2) {
    }

    /* JADX INFO: renamed from: a */
    public void m173826a(int i, int i2) {
        if (this.f153662i) {
            return;
        }
        this.f153660g = i;
        this.f153661h = i2;
        GLES20.glGenFramebuffers(1, this.f153655b, 0);
        GLES20.glGenRenderbuffers(1, this.f153657d, 0);
        GLES20.glGenTextures(1, this.f153656c, 0);
        GLES20.glBindFramebuffer(36160, this.f153655b[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f153656c[0]);
        if (this.f153663j) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        }
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f153656c[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f153657d[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f153657d[0]);
        this.f153662i = true;
    }

    /* JADX INFO: renamed from: b */
    public void m173827b() {
        int[] iArr = this.f153655b;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f153655b = null;
        }
        int[] iArr2 = this.f153656c;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f153656c = null;
        }
        int[] iArr3 = this.f153657d;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f153657d = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public int[] m173828c() {
        return this.f153655b;
    }

    /* JADX INFO: renamed from: d */
    public int[] m173829d() {
        return this.f153656c;
    }

    /* JADX INFO: renamed from: e */
    public void m173830e(boolean z) {
        String strGlGetString = GLES20.glGetString(7939);
        if (strGlGetString == null || !strGlGetString.contains("GL_OES_texture_half_float")) {
            return;
        }
        this.f153663j = z;
    }

    /* JADX INFO: renamed from: f */
    public void m173831f() {
        synchronized (this.f153658e) {
            try {
                int i = this.f153659f - 1;
                this.f153659f = i;
                if (i < 1) {
                    this.f153654a = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
