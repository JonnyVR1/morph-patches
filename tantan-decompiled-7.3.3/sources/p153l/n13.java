package p153l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class n13 {

    /* JADX INFO: renamed from: a */
    public int f139715a;

    /* JADX INFO: renamed from: b */
    public long f139716b;

    /* JADX INFO: renamed from: c */
    public final int f139717c;

    /* JADX INFO: renamed from: d */
    public final int f139718d;

    /* JADX INFO: renamed from: e */
    public final w4d0<Bitmap> f139719e;

    /* JADX INFO: renamed from: l.n13$a */
    public class C18759a implements w4d0<Bitmap> {
        public C18759a() {
        }

        @Override // p153l.w4d0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void release(Bitmap bitmap) {
            try {
                n13.this.m161076a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public n13(int i, int i2) {
        wn80.m207177b(Boolean.valueOf(i > 0));
        wn80.m207177b(Boolean.valueOf(i2 > 0));
        this.f139717c = i;
        this.f139718d = i2;
        this.f139719e = new C18759a();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m161076a(Bitmap bitmap) {
        int iM143310i = j33.m143310i(bitmap);
        wn80.m207178c(this.f139715a > 0, "No bitmaps registered.");
        long j = iM143310i;
        wn80.m207179d(j <= this.f139716b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(iM143310i), Long.valueOf(this.f139716b));
        this.f139716b -= j;
        this.f139715a--;
    }

    /* JADX INFO: renamed from: b */
    public synchronized int m161077b() {
        return this.f139715a;
    }

    /* JADX INFO: renamed from: c */
    public synchronized int m161078c() {
        return this.f139717c;
    }

    /* JADX INFO: renamed from: d */
    public synchronized int m161079d() {
        return this.f139718d;
    }

    /* JADX INFO: renamed from: e */
    public w4d0<Bitmap> m161080e() {
        return this.f139719e;
    }

    /* JADX INFO: renamed from: f */
    public synchronized long m161081f() {
        return this.f139716b;
    }

    /* JADX INFO: renamed from: g */
    public synchronized boolean m161082g(Bitmap bitmap) {
        int iM143310i = j33.m143310i(bitmap);
        int i = this.f139715a;
        if (i < this.f139717c) {
            long j = this.f139716b;
            long j2 = iM143310i;
            if (j + j2 <= this.f139718d) {
                this.f139715a = i + 1;
                this.f139716b = j + j2;
                return true;
            }
        }
        return false;
    }
}
