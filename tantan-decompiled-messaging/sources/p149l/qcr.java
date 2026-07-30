package p149l;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.opengl.GLES20;
import com.immomo.components.interfaces.IProcessOutput;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class qcr extends btf implements ntb {

    /* JADX INFO: renamed from: D */
    private final IProcessOutput.ProcessType f153792D;

    /* JADX INFO: renamed from: E */
    private int f153793E;

    /* JADX INFO: renamed from: F */
    private boolean f153794F;

    /* JADX INFO: renamed from: G */
    private boolean f153795G;

    /* JADX INFO: renamed from: H */
    private int f153796H;

    /* JADX INFO: renamed from: I */
    private boolean f153797I;

    /* JADX INFO: renamed from: J */
    private eg4 f153798J;

    /* JADX INFO: renamed from: K */
    private Rect f153799K;

    /* JADX INFO: renamed from: L */
    private int f153800L;

    /* JADX INFO: renamed from: M */
    private int f153801M;

    /* JADX INFO: renamed from: N */
    private volatile boolean f153802N;

    /* JADX INFO: renamed from: O */
    private boolean f153803O;

    /* JADX INFO: renamed from: P */
    private final boolean f153804P;

    /* JADX INFO: renamed from: Q */
    private long f153805Q;

    /* JADX INFO: renamed from: R */
    private long f153806R;

    /* JADX INFO: renamed from: S */
    private volatile boolean f153807S;

    /* JADX INFO: renamed from: l.qcr$a */
    public class RunnableC19461a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ByteBuffer f153808a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f153809b;

        public RunnableC19461a(ByteBuffer byteBuffer, boolean z) {
            this.f153808a = byteBuffer;
            this.f153809b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect rect = qcr.this.f153799K;
            qcr qcrVar = qcr.this;
            Bitmap bitmapCreateBitmap = rect != null ? Bitmap.createBitmap(qcrVar.f153800L, qcr.this.f153801M, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(qcrVar.f85426l, qcr.this.f85427m, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(this.f153808a);
            Matrix matrix = new Matrix();
            matrix.postScale(1.0f, -1.0f);
            matrix.postRotate(qcr.this.f153796H);
            Rect rect2 = qcr.this.f153799K;
            qcr qcrVar2 = qcr.this;
            Bitmap bitmapCreateBitmap2 = rect2 != null ? Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, qcrVar2.f153800L, qcr.this.f153801M, matrix, true) : Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, qcrVar2.f85426l, qcr.this.f85427m, matrix, true);
            boolean z = this.f153809b;
            qcr qcrVar3 = qcr.this;
            if (z) {
                qcrVar3.f153798J.mo116233a(bitmapCreateBitmap2);
            } else {
                qcrVar3.f153798J.get3DRenderImage(bitmapCreateBitmap2);
            }
        }
    }

    public qcr(IProcessOutput.ProcessType processType, boolean z) {
        this.f153793E = 1;
        this.f153794F = false;
        this.f153795G = false;
        this.f153796H = 0;
        this.f153797I = true;
        this.f153798J = null;
        this.f153799K = null;
        this.f153802N = true;
        this.f153805Q = -1L;
        this.f153806R = -1L;
        this.f153807S = false;
        this.f153792D = processType;
        mow.m155709j().m155716f();
        this.f153804P = true;
        this.f153803O = false;
    }

    /* JADX INFO: renamed from: h0 */
    private void m173903h0(boolean z) {
        ByteBuffer byteBufferAllocate;
        if (this.f153798J == null) {
            return;
        }
        GLES20.glFinish();
        Rect rect = this.f153799K;
        if (rect != null) {
            int i = rect.right;
            int i2 = rect.left;
            int i3 = i - i2;
            this.f153800L = i3;
            int i4 = rect.bottom;
            int i5 = rect.top;
            int i6 = i4 - i5;
            this.f153801M = i6;
            int i7 = (this.f85427m - i5) - i6;
            byteBufferAllocate = ByteBuffer.allocate(i3 * i6 * 4);
            byteBufferAllocate.position(0);
            GLES20.glReadPixels(i2, i7, this.f153800L, this.f153801M, 6408, 5121, byteBufferAllocate);
        } else {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(m110705r() * m110701n() * 4);
            byteBufferAllocate2.position(0);
            GLES20.glReadPixels(0, 0, m110705r(), m110701n(), 6408, 5121, byteBufferAllocate2);
            byteBufferAllocate = byteBufferAllocate2;
        }
        byteBufferAllocate.position(0);
        this.f153794F = false;
        this.f153795G = false;
        jpi0.m142740d(2, new RunnableC19461a(byteBufferAllocate, z));
    }

    /* JADX INFO: renamed from: i0 */
    private synchronized void m173904i0(boolean z) {
    }

    @Override // p149l.ncj
    /* JADX INFO: renamed from: F */
    public void mo118663F() {
        if (this.f153794F) {
            this.f153797I = false;
        } else {
            this.f153797I = true;
        }
        if (this.f153797I) {
            m173912f0();
            if (this.f153795G) {
                m173903h0(true);
            }
        }
        GLES20.glViewport(0, 0, this.f85426l, this.f85427m);
        GLES20.glEnable(3089);
        m110705r();
        m110701n();
        m173914j0();
        m173909c0();
        GLES20.glDisable(2884);
        GLES20.glDisable(3089);
        if (!this.f153794F || this.f153797I) {
            return;
        }
        m173903h0(false);
    }

    @Override // p149l.ncj
    /* JADX INFO: renamed from: K */
    public void mo158949K() {
        sbj sbjVar = this.f138175x;
        if (sbjVar != null) {
            sbjVar.m183223c();
        }
        if (this.f153803O) {
            this.f138175x = zbj.m217894b().m217895a(m110705r() * this.f153793E, m110701n() * this.f153793E);
        } else {
            this.f138175x = new sbj(m110705r() * this.f153793E, m110701n() * this.f153793E);
        }
        boolean z = this.f153804P;
        sbj sbjVar2 = this.f138175x;
        if (z) {
            sbjVar2.m183221a(m110705r() * this.f153793E, m110701n() * this.f153793E);
        } else {
            sbjVar2.m183222b(m110705r() * this.f153793E, m110701n() * this.f153793E);
        }
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        ysf.m215904a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    /* JADX INFO: renamed from: Y */
    public void m173905Y(h3x h3xVar) {
        if (h3xVar == null || h3xVar.m129179a() == null) {
            return;
        }
        h3xVar.m129179a();
    }

    /* JADX INFO: renamed from: c0 */
    public boolean m173909c0() {
        long j = this.f153805Q;
        return j != -1 && j == Thread.currentThread().getId();
    }

    @Override // p149l.dtf
    /* JADX INFO: renamed from: d */
    public void mo104314d(IProcessOutput iProcessOutput) {
        long id = Thread.currentThread().getId();
        long j = this.f153806R;
        if (j == -1 || id != j || !this.f153807S) {
            m173904i0(this.f153792D == IProcessOutput.ProcessType.PROCESS_PREVIEW_TYPE);
        }
        this.f153806R = id;
    }

    @Override // p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: f */
    public void mo102038f() {
        super.mo102038f();
        this.f153807S = false;
    }

    /* JADX INFO: renamed from: f0 */
    public void m173912f0() {
        int i = this.f85426l;
        int i2 = this.f153793E;
        GLES20.glViewport(0, 0, i * i2, this.f85427m * i2);
        GLES20.glClearColor(m110700l(), m110699k(), m110698j(), m110697i());
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.f85418d);
        mo110710w();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f85420f);
        GLES20.glDisableVertexAttribArray(this.f85421g);
    }

    /* JADX INFO: renamed from: g0 */
    public void m173913g0(boolean z) {
        this.f153802N = z;
    }

    /* JADX INFO: renamed from: j0 */
    public void m173914j0() {
        if (this.f153805Q == -1) {
            this.f153805Q = Thread.currentThread().getId();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m173917m0(eg4 eg4Var) {
        this.f153798J = eg4Var;
    }

    @Override // p149l.btf
    /* JADX INFO: renamed from: O */
    public void mo103827O() {
    }

    /* JADX INFO: renamed from: d0 */
    public void m173910d0() {
    }

    /* JADX INFO: renamed from: e0 */
    public void m173911e0() {
    }

    /* JADX INFO: renamed from: k0 */
    public void m173915k0() {
    }

    /* JADX INFO: renamed from: Z */
    public void m173906Z(String str) {
    }

    /* JADX INFO: renamed from: a0 */
    public void m173907a0(String str) {
    }

    /* JADX INFO: renamed from: l0 */
    public void m173916l0(String str) {
    }

    /* JADX INFO: renamed from: o0 */
    public void m173919o0(String str) {
    }

    /* JADX INFO: renamed from: p0 */
    public void m173920p0(float f) {
    }

    /* JADX INFO: renamed from: r0 */
    public void m173922r0(int i) {
    }

    /* JADX INFO: renamed from: s0 */
    public void m173923s0(int i) {
    }

    public qcr(IProcessOutput.ProcessType processType) {
        this(processType, false);
    }

    /* JADX INFO: renamed from: b0 */
    public void m173908b0(Object obj, String str) {
    }

    /* JADX INFO: renamed from: n0 */
    public void m173918n0(String str, float f) {
    }

    /* JADX INFO: renamed from: q0 */
    public void m173921q0(String str, float f) {
    }
}
