package p149l;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class tuh0 {

    /* JADX INFO: renamed from: b */
    private rmw f172173b;

    /* JADX INFO: renamed from: c */
    private qmw f172174c;

    /* JADX INFO: renamed from: a */
    private boolean f172172a = false;

    /* JADX INFO: renamed from: d */
    public volatile boolean f172175d = false;

    /* JADX INFO: renamed from: e */
    private volatile boolean f172176e = false;

    /* JADX INFO: renamed from: l.tuh0$a */
    public class RunnableC20280a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Bitmap f172177a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f172178b;

        public RunnableC20280a(Bitmap bitmap, String str) {
            this.f172177a = bitmap;
            this.f172178b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            tuh0.this.m190691e(this.f172177a, this.f172178b);
        }
    }

    /* JADX INFO: renamed from: b */
    private Bitmap m190690b(int i, int i2, int i3, int i4, int i5) {
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
    public synchronized void m190691e(Bitmap bitmap, String str) {
        try {
            k23.m144257b(str, bitmap);
            rmw rmwVar = this.f172173b;
            if (rmwVar != null) {
                rmwVar.mo108309a(0, null);
            }
        } catch (Exception e) {
            rmw rmwVar2 = this.f172173b;
            if (rmwVar2 != null) {
                rmwVar2.mo108309a(-1, e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m190692c() {
        return this.f172175d;
    }

    /* JADX INFO: renamed from: d */
    public void m190693d(boolean z) {
        this.f172172a = true;
        this.f172176e = z;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m190694f(qmw qmwVar) {
        this.f172174c = qmwVar;
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m190695g(rmw rmwVar) {
        this.f172173b = rmwVar;
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m190696h(String str, int i, int i2, int i3, int i4, int i5) throws Throwable {
        tuh0 tuh0Var;
        try {
            try {
                if (this.f172172a) {
                    try {
                        this.f172175d = true;
                        tuh0Var = this;
                        try {
                            Bitmap bitmapM190690b = tuh0Var.m190690b(i2, i3, i4, i5, i);
                            if (tuh0Var.f172176e) {
                                tuh0Var.f172175d = false;
                            }
                            qmw qmwVar = tuh0Var.f172174c;
                            if (qmwVar != null) {
                                qmwVar.mo168081a(bitmapM190690b, null);
                            } else {
                                jpi0.m142740d(2, tuh0Var.new RunnableC20280a(bitmapM190690b, str));
                            }
                        } catch (Exception e) {
                            e = e;
                            Exception exc = e;
                            tuh0Var.f172175d = false;
                            rmw rmwVar = tuh0Var.f172173b;
                            if (rmwVar != null) {
                                rmwVar.mo108309a(-1, exc);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        tuh0Var = this;
                    }
                    tuh0Var.f172172a = false;
                } else {
                    tuh0Var = this;
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
