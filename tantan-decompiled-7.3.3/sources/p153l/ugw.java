package p153l;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public class ugw implements v23 {

    /* JADX INFO: renamed from: a */
    public final wi80<Bitmap> f178936a = new y23();

    /* JADX INFO: renamed from: b */
    public final int f178937b;

    /* JADX INFO: renamed from: c */
    public int f178938c;

    /* JADX INFO: renamed from: d */
    public final cj80 f178939d;

    /* JADX INFO: renamed from: e */
    public int f178940e;

    public ugw(int i, int i2, cj80 cj80Var, gqy gqyVar) {
        this.f178937b = i;
        this.f178938c = i2;
        this.f178939d = cj80Var;
        if (gqyVar != null) {
            gqyVar.mo131504a(this);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    private Bitmap m195947g(int i) {
        this.f178939d.mo110080a(i);
        return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
    }

    @Override // p153l.vi80
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public synchronized Bitmap get(int i) {
        try {
            int i2 = this.f178940e;
            int i3 = this.f178937b;
            if (i2 > i3) {
                m195950j(i3);
            }
            Bitmap bitmap = this.f178936a.get(i);
            if (bitmap == null) {
                return m195947g(i);
            }
            int iMo206556a = this.f178936a.mo206556a(bitmap);
            this.f178940e -= iMo206556a;
            this.f178939d.mo110081b(iMo206556a);
            return bitmap;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.vi80, p153l.w4d0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void release(Bitmap bitmap) {
        int iMo206556a = this.f178936a.mo206556a(bitmap);
        if (iMo206556a <= this.f178938c) {
            this.f178939d.mo110085f(iMo206556a);
            this.f178936a.put(bitmap);
            synchronized (this) {
                this.f178940e += iMo206556a;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m195950j(int i) {
        Bitmap bitmapPop;
        while (this.f178940e > i && (bitmapPop = this.f178936a.pop()) != null) {
            int iMo206556a = this.f178936a.mo206556a(bitmapPop);
            this.f178940e -= iMo206556a;
            this.f178939d.mo110084e(iMo206556a);
        }
    }
}
