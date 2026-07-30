package p149l;

import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.Log;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;

/* JADX INFO: loaded from: classes3.dex */
public class rbj {

    /* JADX INFO: renamed from: a */
    public boolean f158615a;

    /* JADX INFO: renamed from: i */
    private int f158623i;

    /* JADX INFO: renamed from: j */
    private int f158624j;

    /* JADX INFO: renamed from: g */
    private Object f158621g = new Object();

    /* JADX INFO: renamed from: k */
    private boolean f158625k = false;

    /* JADX INFO: renamed from: l */
    private boolean f158626l = false;

    /* JADX INFO: renamed from: m */
    private boolean f158627m = false;

    /* JADX INFO: renamed from: b */
    protected int[] f158616b = new int[1];

    /* JADX INFO: renamed from: c */
    protected int[] f158617c = new int[1];

    /* JADX INFO: renamed from: d */
    protected int[] f158618d = new int[1];

    /* JADX INFO: renamed from: e */
    protected int[] f158619e = new int[1];

    /* JADX INFO: renamed from: f */
    protected int[] f158620f = new int[1];

    /* JADX INFO: renamed from: h */
    public int f158622h = 0;

    public rbj(int i, int i2) {
    }

    /* JADX INFO: renamed from: a */
    public void m178602a(int i, int i2) {
        if (this.f158625k) {
            return;
        }
        if (this.f158616b == null) {
            this.f158616b = new int[1];
            this.f158618d = new int[1];
            this.f158619e = new int[1];
            this.f158622h = 0;
        }
        this.f158623i = i;
        this.f158624j = i2;
        GLES20.glGenFramebuffers(1, this.f158616b, 0);
        GLES20.glGenRenderbuffers(1, this.f158619e, 0);
        GLES20.glGenTextures(1, this.f158618d, 0);
        GLES20.glBindFramebuffer(36160, this.f158616b[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f158618d[0]);
        if (this.f158627m) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
            MDLog.m7395i(MDLogTag.FILTER_TAG, "use half float ");
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        }
        Log.e("GLFrameBuffer", "frameBufferNumber" + this.f158618d[0]);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f158618d[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f158619e[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f158619e[0]);
        this.f158625k = true;
    }

    /* JADX INFO: renamed from: b */
    public void m178603b(int i, int i2) {
        if (this.f158625k) {
            return;
        }
        if (this.f158616b == null) {
            this.f158616b = new int[1];
            this.f158618d = new int[1];
            this.f158619e = new int[1];
            this.f158622h = 0;
        }
        this.f158623i = i;
        this.f158624j = i2;
        GLES20.glGenFramebuffers(1, this.f158616b, 0);
        GLES20.glGenRenderbuffers(1, this.f158619e, 0);
        GLES20.glGenTextures(1, this.f158618d, 0);
        GLES20.glBindFramebuffer(36160, this.f158616b[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f158618d[0]);
        if (this.f158627m) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
            MDLog.m7395i(MDLogTag.FILTER_TAG, "use half float ");
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        }
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f158618d[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f158619e[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f158619e[0]);
        this.f158625k = true;
    }

    /* JADX INFO: renamed from: c */
    public void m178604c(int i, int i2) {
        if (this.f158626l) {
            m178606e();
        }
        if (this.f158625k) {
            return;
        }
        if (this.f158616b == null) {
            this.f158616b = new int[1];
            this.f158618d = new int[1];
            this.f158622h = 0;
        }
        this.f158623i = i;
        this.f158624j = i2;
        GLES20.glGenFramebuffers(1, this.f158616b, 0);
        GLES20.glGenTextures(1, this.f158618d, 0);
        GLES20.glBindFramebuffer(36160, this.f158616b[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f158618d[0]);
        if (this.f158627m) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
            MDLog.m7395i(MDLogTag.FILTER_TAG, "use half float ");
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        }
        GLES20.glTexParameteri(3553, 10242, 10497);
        GLES20.glTexParameteri(3553, 10243, 10497);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f158618d[0], 0);
        this.f158625k = true;
    }

    /* JADX INFO: renamed from: d */
    public void m178605d(int i, int i2) {
        int i3;
        int i4;
        if (this.f158625k) {
            return;
        }
        this.f158623i = i;
        this.f158624j = i2;
        GLES20.glGenRenderbuffers(1, this.f158619e, 0);
        GLES20.glBindRenderbuffer(36161, this.f158619e[0]);
        GLES30.glRenderbufferStorageMultisample(36161, 4, 32856, i, i2);
        GLES20.glBindRenderbuffer(36161, 0);
        GLES20.glGenFramebuffers(1, this.f158616b, 0);
        GLES20.glBindFramebuffer(36160, this.f158616b[0]);
        GLES20.glFramebufferRenderbuffer(36160, 36064, 36161, this.f158619e[0]);
        GLES20.glGenTextures(1, this.f158618d, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f158618d[0]);
        if (this.f158627m) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
            MDLog.m7395i(MDLogTag.FILTER_TAG, "use half float ");
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
        GLES20.glGenRenderbuffers(1, this.f158620f, 0);
        GLES20.glBindRenderbuffer(36161, this.f158620f[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i3, i4);
        GLES20.glGenFramebuffers(1, this.f158617c, 0);
        GLES20.glBindFramebuffer(36160, this.f158617c[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f158618d[0], 0);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f158620f[0]);
        this.f158625k = true;
    }

    /* JADX INFO: renamed from: e */
    public void m178606e() {
        if (ybj.m213953d().m213955b(this)) {
            m178613l();
            return;
        }
        int[] iArr = this.f158616b;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f158616b = null;
        }
        int[] iArr2 = this.f158617c;
        if (iArr2 != null) {
            GLES20.glDeleteFramebuffers(1, iArr2, 0);
            this.f158617c = null;
        }
        int[] iArr3 = this.f158618d;
        if (iArr3 != null) {
            GLES20.glDeleteTextures(1, iArr3, 0);
            this.f158618d = null;
        }
        int[] iArr4 = this.f158619e;
        if (iArr4 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr4, 0);
            this.f158619e = null;
        }
        int[] iArr5 = this.f158620f;
        if (iArr5 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr5, 0);
            this.f158620f = null;
        }
        m178613l();
        this.f158625k = false;
    }

    /* JADX INFO: renamed from: f */
    public int m178607f() {
        return this.f158624j;
    }

    /* JADX INFO: renamed from: g */
    public int m178608g() {
        return this.f158623i;
    }

    /* JADX INFO: renamed from: h */
    public int[] m178609h() {
        return this.f158616b;
    }

    /* JADX INFO: renamed from: i */
    public int[] m178610i() {
        return this.f158618d;
    }

    /* JADX INFO: renamed from: j */
    public void m178611j() {
        synchronized (this.f158621g) {
            this.f158615a = true;
            this.f158622h++;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m178612k(boolean z) {
        String strGlGetString = GLES20.glGetString(7939);
        if (strGlGetString == null || !strGlGetString.contains("GL_OES_texture_half_float")) {
            return;
        }
        this.f158627m = z;
    }

    /* JADX INFO: renamed from: l */
    public void m178613l() {
        synchronized (this.f158621g) {
            try {
                int i = this.f158622h - 1;
                this.f158622h = i;
                if (i < 1) {
                    this.f158615a = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m178614m(int i, int i2) {
        GLES20.glBindFramebuffer(36009, this.f158617c[0]);
        GLES20.glBindFramebuffer(36008, this.f158616b[0]);
        GLES30.glBlitFramebuffer(0, 0, i, i2, 0, 0, i, i2, 16384, 9729);
    }
}
