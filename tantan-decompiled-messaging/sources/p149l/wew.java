package p149l;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public class wew implements f23 {

    /* JADX INFO: renamed from: a */
    public final qa80<Bitmap> f185983a = new i23();

    /* JADX INFO: renamed from: b */
    public final int f185984b;

    /* JADX INFO: renamed from: c */
    public int f185985c;

    /* JADX INFO: renamed from: d */
    public final wa80 f185986d;

    /* JADX INFO: renamed from: e */
    public int f185987e;

    public wew(int i, int i2, wa80 wa80Var, jhy jhyVar) {
        this.f185984b = i;
        this.f185985c = i2;
        this.f185986d = wa80Var;
        if (jhyVar != null) {
            jhyVar.mo141613a(this);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    private Bitmap m202935g(int i) {
        this.f185986d.mo189424a(i);
        return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
    }

    @Override // p149l.pa80
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public synchronized Bitmap get(int i) {
        try {
            int i2 = this.f185987e;
            int i3 = this.f185984b;
            if (i2 > i3) {
                m202938j(i3);
            }
            Bitmap bitmap = this.f185983a.get(i);
            if (bitmap == null) {
                return m202935g(i);
            }
            int iMo134041a = this.f185983a.mo134041a(bitmap);
            this.f185987e -= iMo134041a;
            this.f185986d.mo189425b(iMo134041a);
            return bitmap;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.pa80, p149l.twc0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void release(Bitmap bitmap) {
        int iMo134041a = this.f185983a.mo134041a(bitmap);
        if (iMo134041a <= this.f185985c) {
            this.f185986d.mo189429f(iMo134041a);
            this.f185983a.put(bitmap);
            synchronized (this) {
                this.f185987e += iMo134041a;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m202938j(int i) {
        Bitmap bitmapPop;
        while (this.f185987e > i && (bitmapPop = this.f185983a.pop()) != null) {
            int iMo134041a = this.f185983a.mo134041a(bitmapPop);
            this.f185987e -= iMo134041a;
            this.f185986d.mo189428e(iMo134041a);
        }
    }
}
