package p153l;

import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.Log;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;

/* JADX INFO: loaded from: classes3.dex */
public class lej {

    /* JADX INFO: renamed from: a */
    public boolean f131752a;

    /* JADX INFO: renamed from: i */
    private int f131760i;

    /* JADX INFO: renamed from: j */
    private int f131761j;

    /* JADX INFO: renamed from: g */
    private Object f131758g = new Object();

    /* JADX INFO: renamed from: k */
    private boolean f131762k = false;

    /* JADX INFO: renamed from: l */
    private boolean f131763l = false;

    /* JADX INFO: renamed from: m */
    private boolean f131764m = false;

    /* JADX INFO: renamed from: b */
    protected int[] f131753b = new int[1];

    /* JADX INFO: renamed from: c */
    protected int[] f131754c = new int[1];

    /* JADX INFO: renamed from: d */
    protected int[] f131755d = new int[1];

    /* JADX INFO: renamed from: e */
    protected int[] f131756e = new int[1];

    /* JADX INFO: renamed from: f */
    protected int[] f131757f = new int[1];

    /* JADX INFO: renamed from: h */
    public int f131759h = 0;

    public lej(int i, int i2) {
    }

    /* JADX INFO: renamed from: a */
    public void m153894a(int i, int i2) {
        if (this.f131762k) {
            return;
        }
        if (this.f131753b == null) {
            this.f131753b = new int[1];
            this.f131755d = new int[1];
            this.f131756e = new int[1];
            this.f131759h = 0;
        }
        this.f131760i = i;
        this.f131761j = i2;
        GLES20.glGenFramebuffers(1, this.f131753b, 0);
        GLES20.glGenRenderbuffers(1, this.f131756e, 0);
        GLES20.glGenTextures(1, this.f131755d, 0);
        GLES20.glBindFramebuffer(36160, this.f131753b[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f131755d[0]);
        if (this.f131764m) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
            MDLog.m7449i(MDLogTag.FILTER_TAG, "use half float ");
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        }
        Log.e("GLFrameBuffer", "frameBufferNumber" + this.f131755d[0]);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f131755d[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f131756e[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f131756e[0]);
        this.f131762k = true;
    }

    /* JADX INFO: renamed from: b */
    public void m153895b(int i, int i2) {
        if (this.f131762k) {
            return;
        }
        if (this.f131753b == null) {
            this.f131753b = new int[1];
            this.f131755d = new int[1];
            this.f131756e = new int[1];
            this.f131759h = 0;
        }
        this.f131760i = i;
        this.f131761j = i2;
        GLES20.glGenFramebuffers(1, this.f131753b, 0);
        GLES20.glGenRenderbuffers(1, this.f131756e, 0);
        GLES20.glGenTextures(1, this.f131755d, 0);
        GLES20.glBindFramebuffer(36160, this.f131753b[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f131755d[0]);
        if (this.f131764m) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
            MDLog.m7449i(MDLogTag.FILTER_TAG, "use half float ");
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        }
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f131755d[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f131756e[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f131756e[0]);
        this.f131762k = true;
    }

    /* JADX INFO: renamed from: c */
    public void m153896c(int i, int i2) {
        if (this.f131763l) {
            m153898e();
        }
        if (this.f131762k) {
            return;
        }
        if (this.f131753b == null) {
            this.f131753b = new int[1];
            this.f131755d = new int[1];
            this.f131759h = 0;
        }
        this.f131760i = i;
        this.f131761j = i2;
        GLES20.glGenFramebuffers(1, this.f131753b, 0);
        GLES20.glGenTextures(1, this.f131755d, 0);
        GLES20.glBindFramebuffer(36160, this.f131753b[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f131755d[0]);
        if (this.f131764m) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
            MDLog.m7449i(MDLogTag.FILTER_TAG, "use half float ");
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        }
        GLES20.glTexParameteri(3553, 10242, 10497);
        GLES20.glTexParameteri(3553, 10243, 10497);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f131755d[0], 0);
        this.f131762k = true;
    }

    /* JADX INFO: renamed from: d */
    public void m153897d(int i, int i2) {
        int i3;
        int i4;
        if (this.f131762k) {
            return;
        }
        this.f131760i = i;
        this.f131761j = i2;
        GLES20.glGenRenderbuffers(1, this.f131756e, 0);
        GLES20.glBindRenderbuffer(36161, this.f131756e[0]);
        GLES30.glRenderbufferStorageMultisample(36161, 4, 32856, i, i2);
        GLES20.glBindRenderbuffer(36161, 0);
        GLES20.glGenFramebuffers(1, this.f131753b, 0);
        GLES20.glBindFramebuffer(36160, this.f131753b[0]);
        GLES20.glFramebufferRenderbuffer(36160, 36064, 36161, this.f131756e[0]);
        GLES20.glGenTextures(1, this.f131755d, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f131755d[0]);
        if (this.f131764m) {
            GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 36193, null);
            MDLog.m7449i(MDLogTag.FILTER_TAG, "use half float ");
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
        GLES20.glGenRenderbuffers(1, this.f131757f, 0);
        GLES20.glBindRenderbuffer(36161, this.f131757f[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i3, i4);
        GLES20.glGenFramebuffers(1, this.f131754c, 0);
        GLES20.glBindFramebuffer(36160, this.f131754c[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f131755d[0], 0);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f131757f[0]);
        this.f131762k = true;
    }

    /* JADX INFO: renamed from: e */
    public void m153898e() {
        if (sej.m185545d().m185547b(this)) {
            m153905l();
            return;
        }
        int[] iArr = this.f131753b;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f131753b = null;
        }
        int[] iArr2 = this.f131754c;
        if (iArr2 != null) {
            GLES20.glDeleteFramebuffers(1, iArr2, 0);
            this.f131754c = null;
        }
        int[] iArr3 = this.f131755d;
        if (iArr3 != null) {
            GLES20.glDeleteTextures(1, iArr3, 0);
            this.f131755d = null;
        }
        int[] iArr4 = this.f131756e;
        if (iArr4 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr4, 0);
            this.f131756e = null;
        }
        int[] iArr5 = this.f131757f;
        if (iArr5 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr5, 0);
            this.f131757f = null;
        }
        m153905l();
        this.f131762k = false;
    }

    /* JADX INFO: renamed from: f */
    public int m153899f() {
        return this.f131761j;
    }

    /* JADX INFO: renamed from: g */
    public int m153900g() {
        return this.f131760i;
    }

    /* JADX INFO: renamed from: h */
    public int[] m153901h() {
        return this.f131753b;
    }

    /* JADX INFO: renamed from: i */
    public int[] m153902i() {
        return this.f131755d;
    }

    /* JADX INFO: renamed from: j */
    public void m153903j() {
        synchronized (this.f131758g) {
            this.f131752a = true;
            this.f131759h++;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m153904k(boolean z) {
        String strGlGetString = GLES20.glGetString(7939);
        if (strGlGetString == null || !strGlGetString.contains("GL_OES_texture_half_float")) {
            return;
        }
        this.f131764m = z;
    }

    /* JADX INFO: renamed from: l */
    public void m153905l() {
        synchronized (this.f131758g) {
            try {
                int i = this.f131759h - 1;
                this.f131759h = i;
                if (i < 1) {
                    this.f131752a = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m153906m(int i, int i2) {
        GLES20.glBindFramebuffer(36009, this.f131754c[0]);
        GLES20.glBindFramebuffer(36008, this.f131753b[0]);
        GLES30.glBlitFramebuffer(0, 0, i, i2, 0, 0, i, i2, 16384, 9729);
    }
}
