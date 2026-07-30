package p153l;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.opengl.GLES20;
import com.immomo.components.interfaces.IProcessOutput;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class rer extends puf implements bvb {

    /* JADX INFO: renamed from: D */
    private final IProcessOutput.ProcessType f162668D;

    /* JADX INFO: renamed from: E */
    private int f162669E;

    /* JADX INFO: renamed from: F */
    private boolean f162670F;

    /* JADX INFO: renamed from: G */
    private boolean f162671G;

    /* JADX INFO: renamed from: H */
    private int f162672H;

    /* JADX INFO: renamed from: I */
    private boolean f162673I;

    /* JADX INFO: renamed from: J */
    private dh4 f162674J;

    /* JADX INFO: renamed from: K */
    private Rect f162675K;

    /* JADX INFO: renamed from: L */
    private int f162676L;

    /* JADX INFO: renamed from: M */
    private int f162677M;

    /* JADX INFO: renamed from: N */
    private volatile boolean f162678N;

    /* JADX INFO: renamed from: O */
    private boolean f162679O;

    /* JADX INFO: renamed from: P */
    private final boolean f162680P;

    /* JADX INFO: renamed from: Q */
    private long f162681Q;

    /* JADX INFO: renamed from: R */
    private long f162682R;

    /* JADX INFO: renamed from: S */
    private volatile boolean f162683S;

    /* JADX INFO: renamed from: l.rer$a */
    public class RunnableC19817a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ByteBuffer f162684a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f162685b;

        public RunnableC19817a(ByteBuffer byteBuffer, boolean z) {
            this.f162684a = byteBuffer;
            this.f162685b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect rect = rer.this.f162675K;
            rer rerVar = rer.this;
            Bitmap bitmapCreateBitmap = rect != null ? Bitmap.createBitmap(rerVar.f162676L, rer.this.f162677M, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(rerVar.f193951l, rer.this.f193952m, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(this.f162684a);
            Matrix matrix = new Matrix();
            matrix.postScale(1.0f, -1.0f);
            matrix.postRotate(rer.this.f162672H);
            Rect rect2 = rer.this.f162675K;
            rer rerVar2 = rer.this;
            Bitmap bitmapCreateBitmap2 = rect2 != null ? Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, rerVar2.f162676L, rer.this.f162677M, matrix, true) : Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, rerVar2.f193951l, rer.this.f193952m, matrix, true);
            boolean z = this.f162685b;
            rer rerVar3 = rer.this;
            if (z) {
                rerVar3.f162674J.mo115783a(bitmapCreateBitmap2);
            } else {
                rerVar3.f162674J.get3DRenderImage(bitmapCreateBitmap2);
            }
        }
    }

    public rer(IProcessOutput.ProcessType processType, boolean z) {
        this.f162669E = 1;
        this.f162670F = false;
        this.f162671G = false;
        this.f162672H = 0;
        this.f162673I = true;
        this.f162674J = null;
        this.f162675K = null;
        this.f162678N = true;
        this.f162681Q = -1L;
        this.f162682R = -1L;
        this.f162683S = false;
        this.f162668D = processType;
        lrw.m155653j().m155660f();
        this.f162680P = true;
        this.f162679O = false;
    }

    /* JADX INFO: renamed from: h0 */
    private void m181042h0(boolean z) {
        ByteBuffer byteBufferAllocate;
        if (this.f162674J == null) {
            return;
        }
        GLES20.glFinish();
        Rect rect = this.f162675K;
        if (rect != null) {
            int i = rect.right;
            int i2 = rect.left;
            int i3 = i - i2;
            this.f162676L = i3;
            int i4 = rect.bottom;
            int i5 = rect.top;
            int i6 = i4 - i5;
            this.f162677M = i6;
            int i7 = (this.f193952m - i5) - i6;
            byteBufferAllocate = ByteBuffer.allocate(i3 * i6 * 4);
            byteBufferAllocate.position(0);
            GLES20.glReadPixels(i2, i7, this.f162676L, this.f162677M, 6408, 5121, byteBufferAllocate);
        } else {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(m210702r() * m210701n() * 4);
            byteBufferAllocate2.position(0);
            GLES20.glReadPixels(0, 0, m210702r(), m210701n(), 6408, 5121, byteBufferAllocate2);
            byteBufferAllocate = byteBufferAllocate2;
        }
        byteBufferAllocate.position(0);
        this.f162670F = false;
        this.f162671G = false;
        lyi0.m156289d(2, new RunnableC19817a(byteBufferAllocate, z));
    }

    /* JADX INFO: renamed from: i0 */
    private synchronized void m181043i0(boolean z) {
    }

    @Override // p153l.hfj
    /* JADX INFO: renamed from: F */
    public void mo134797F() {
        if (this.f162670F) {
            this.f162673I = false;
        } else {
            this.f162673I = true;
        }
        if (this.f162673I) {
            m181051f0();
            if (this.f162671G) {
                m181042h0(true);
            }
        }
        GLES20.glViewport(0, 0, this.f193951l, this.f193952m);
        GLES20.glEnable(3089);
        m210702r();
        m210701n();
        m181053j0();
        m181048c0();
        GLES20.glDisable(2884);
        GLES20.glDisable(3089);
        if (!this.f162670F || this.f162673I) {
            return;
        }
        m181042h0(false);
    }

    @Override // p153l.hfj
    /* JADX INFO: renamed from: K */
    public void mo96077K() {
        mej mejVar = this.f109305x;
        if (mejVar != null) {
            mejVar.m158025c();
        }
        if (this.f162679O) {
            this.f109305x = tej.m190707b().m190708a(m210702r() * this.f162669E, m210701n() * this.f162669E);
        } else {
            this.f109305x = new mej(m210702r() * this.f162669E, m210701n() * this.f162669E);
        }
        boolean z = this.f162680P;
        mej mejVar2 = this.f109305x;
        if (z) {
            mejVar2.m158023a(m210702r() * this.f162669E, m210701n() * this.f162669E);
        } else {
            mejVar2.m158024b(m210702r() * this.f162669E, m210701n() * this.f162669E);
        }
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        muf.m160142a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    /* JADX INFO: renamed from: Y */
    public void m181044Y(g6x g6xVar) {
        if (g6xVar == null || g6xVar.m129285a() == null) {
            return;
        }
        g6xVar.m129285a();
    }

    /* JADX INFO: renamed from: c0 */
    public boolean m181048c0() {
        long j = this.f162681Q;
        return j != -1 && j == Thread.currentThread().getId();
    }

    @Override // p153l.ruf
    /* JADX INFO: renamed from: d */
    public void mo102835d(IProcessOutput iProcessOutput) {
        long id = Thread.currentThread().getId();
        long j = this.f162682R;
        if (j == -1 || id != j || !this.f162683S) {
            m181043i0(this.f162668D == IProcessOutput.ProcessType.PROCESS_PREVIEW_TYPE);
        }
        this.f162682R = id;
    }

    @Override // p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: f */
    public void mo96080f() {
        super.mo96080f();
        this.f162683S = false;
    }

    /* JADX INFO: renamed from: f0 */
    public void m181051f0() {
        int i = this.f193951l;
        int i2 = this.f162669E;
        GLES20.glViewport(0, 0, i * i2, this.f193952m * i2);
        GLES20.glClearColor(m210700l(), m210699k(), m210698j(), m210697i());
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.f193943d);
        mo112469w();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f193945f);
        GLES20.glDisableVertexAttribArray(this.f193946g);
    }

    /* JADX INFO: renamed from: g0 */
    public void m181052g0(boolean z) {
        this.f162678N = z;
    }

    /* JADX INFO: renamed from: j0 */
    public void m181053j0() {
        if (this.f162681Q == -1) {
            this.f162681Q = Thread.currentThread().getId();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m181056m0(dh4 dh4Var) {
        this.f162674J = dh4Var;
    }

    @Override // p153l.puf
    /* JADX INFO: renamed from: O */
    public void mo166121O() {
    }

    /* JADX INFO: renamed from: d0 */
    public void m181049d0() {
    }

    /* JADX INFO: renamed from: e0 */
    public void m181050e0() {
    }

    /* JADX INFO: renamed from: k0 */
    public void m181054k0() {
    }

    /* JADX INFO: renamed from: Z */
    public void m181045Z(String str) {
    }

    /* JADX INFO: renamed from: a0 */
    public void m181046a0(String str) {
    }

    /* JADX INFO: renamed from: l0 */
    public void m181055l0(String str) {
    }

    /* JADX INFO: renamed from: o0 */
    public void m181058o0(String str) {
    }

    /* JADX INFO: renamed from: p0 */
    public void m181059p0(float f) {
    }

    /* JADX INFO: renamed from: r0 */
    public void m181061r0(int i) {
    }

    /* JADX INFO: renamed from: s0 */
    public void m181062s0(int i) {
    }

    public rer(IProcessOutput.ProcessType processType) {
        this(processType, false);
    }

    /* JADX INFO: renamed from: b0 */
    public void m181047b0(Object obj, String str) {
    }

    /* JADX INFO: renamed from: n0 */
    public void m181057n0(String str, float f) {
    }

    /* JADX INFO: renamed from: q0 */
    public void m181060q0(String str, float f) {
    }
}
