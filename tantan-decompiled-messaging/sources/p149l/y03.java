package p149l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class y03 {

    /* JADX INFO: renamed from: a */
    public int f195247a;

    /* JADX INFO: renamed from: b */
    public long f195248b;

    /* JADX INFO: renamed from: c */
    public final int f195249c;

    /* JADX INFO: renamed from: d */
    public final int f195250d;

    /* JADX INFO: renamed from: e */
    public final twc0<Bitmap> f195251e;

    /* JADX INFO: renamed from: l.y03$a */
    public class C21270a implements twc0<Bitmap> {
        public C21270a() {
        }

        @Override // p149l.twc0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void release(Bitmap bitmap) {
            try {
                y03.this.m212030a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public y03(int i, int i2) {
        rf80.m179111b(Boolean.valueOf(i > 0));
        rf80.m179111b(Boolean.valueOf(i2 > 0));
        this.f195249c = i;
        this.f195250d = i2;
        this.f195251e = new C21270a();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m212030a(Bitmap bitmap) {
        int iM186960i = t23.m186960i(bitmap);
        rf80.m179112c(this.f195247a > 0, "No bitmaps registered.");
        long j = iM186960i;
        rf80.m179113d(j <= this.f195248b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(iM186960i), Long.valueOf(this.f195248b));
        this.f195248b -= j;
        this.f195247a--;
    }

    /* JADX INFO: renamed from: b */
    public synchronized int m212031b() {
        return this.f195247a;
    }

    /* JADX INFO: renamed from: c */
    public synchronized int m212032c() {
        return this.f195249c;
    }

    /* JADX INFO: renamed from: d */
    public synchronized int m212033d() {
        return this.f195250d;
    }

    /* JADX INFO: renamed from: e */
    public twc0<Bitmap> m212034e() {
        return this.f195251e;
    }

    /* JADX INFO: renamed from: f */
    public synchronized long m212035f() {
        return this.f195248b;
    }

    /* JADX INFO: renamed from: g */
    public synchronized boolean m212036g(Bitmap bitmap) {
        int iM186960i = t23.m186960i(bitmap);
        int i = this.f195247a;
        if (i < this.f195249c) {
            long j = this.f195248b;
            long j2 = iM186960i;
            if (j + j2 <= this.f195250d) {
                this.f195247a = i + 1;
                this.f195248b = j + j2;
                return true;
            }
        }
        return false;
    }
}
