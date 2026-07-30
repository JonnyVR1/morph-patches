package p153l;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class b3i0 {

    /* JADX INFO: renamed from: b */
    private qpw f74775b;

    /* JADX INFO: renamed from: c */
    private ppw f74776c;

    /* JADX INFO: renamed from: a */
    private boolean f74774a = false;

    /* JADX INFO: renamed from: d */
    public volatile boolean f74777d = false;

    /* JADX INFO: renamed from: e */
    private volatile boolean f74778e = false;

    /* JADX INFO: renamed from: l.b3i0$a */
    public class RunnableC15913a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Bitmap f74779a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f74780b;

        public RunnableC15913a(Bitmap bitmap, String str) {
            this.f74779a = bitmap;
            this.f74780b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            b3i0.this.m102335e(this.f74779a, this.f74780b);
        }
    }

    /* JADX INFO: renamed from: b */
    private Bitmap m102334b(int i, int i2, int i3, int i4, int i5) {
        if (i4 <= 0 || i3 <= 0) {
            return null;
        }
        IntBuffer intBufferAllocate = IntBuffer.allocate(i3 * i4);
        GLES20.glReadPixels(i, i2, i3, i4, 6408, 5121, intBufferAllocate);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(intBufferAllocate);
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f);
        matrix.postRotate(i5);
        return Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, i3, i4, matrix, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public synchronized void m102335e(Bitmap bitmap, String str) {
        try {
            a33.m95766b(str, bitmap);
            qpw qpwVar = this.f74775b;
            if (qpwVar != null) {
                qpwVar.mo118030a(0, null);
            }
        } catch (Exception e) {
            qpw qpwVar2 = this.f74775b;
            if (qpwVar2 != null) {
                qpwVar2.mo118030a(-1, e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m102336c() {
        return this.f74777d;
    }

    /* JADX INFO: renamed from: d */
    public void m102337d(boolean z) {
        this.f74774a = true;
        this.f74778e = z;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m102338f(ppw ppwVar) {
        this.f74776c = ppwVar;
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m102339g(qpw qpwVar) {
        this.f74775b = qpwVar;
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m102340h(String str, int i, int i2, int i3, int i4, int i5) throws Throwable {
        b3i0 b3i0Var;
        try {
            try {
                if (this.f74774a) {
                    try {
                        this.f74777d = true;
                        b3i0Var = this;
                        try {
                            Bitmap bitmapM102334b = b3i0Var.m102334b(i2, i3, i4, i5, i);
                            if (b3i0Var.f74778e) {
                                b3i0Var.f74777d = false;
                            }
                            ppw ppwVar = b3i0Var.f74776c;
                            if (ppwVar != null) {
                                ppwVar.mo167018a(bitmapM102334b, null);
                            } else {
                                lyi0.m156289d(2, b3i0Var.new RunnableC15913a(bitmapM102334b, str));
                            }
                        } catch (Exception e) {
                            e = e;
                            Exception exc = e;
                            b3i0Var.f74777d = false;
                            qpw qpwVar = b3i0Var.f74775b;
                            if (qpwVar != null) {
                                qpwVar.mo118030a(-1, exc);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        b3i0Var = this;
                    }
                    b3i0Var.f74774a = false;
                } else {
                    b3i0Var = this;
                }
                return;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        throw th;
    }
}
