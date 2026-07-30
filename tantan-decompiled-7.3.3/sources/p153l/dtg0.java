package p153l;

import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public final class dtg0 {

    /* JADX INFO: renamed from: a */
    public final int f90576a;

    /* JADX INFO: renamed from: b */
    public final int f90577b;

    /* JADX INFO: renamed from: c */
    public final long f90578c;

    /* JADX INFO: renamed from: d */
    public final long f90579d;

    /* JADX INFO: renamed from: e */
    public final long f90580e;

    /* JADX INFO: renamed from: f */
    public final long f90581f;

    /* JADX INFO: renamed from: g */
    public final long f90582g;

    /* JADX INFO: renamed from: h */
    public final long f90583h;

    /* JADX INFO: renamed from: i */
    public final long f90584i;

    /* JADX INFO: renamed from: j */
    public final long f90585j;

    /* JADX INFO: renamed from: k */
    public final int f90586k;

    /* JADX INFO: renamed from: l */
    public final int f90587l;

    /* JADX INFO: renamed from: m */
    public final int f90588m;

    /* JADX INFO: renamed from: n */
    public final long f90589n;

    public dtg0(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f90576a = i;
        this.f90577b = i2;
        this.f90578c = j;
        this.f90579d = j2;
        this.f90580e = j3;
        this.f90581f = j4;
        this.f90582g = j5;
        this.f90583h = j6;
        this.f90584i = j7;
        this.f90585j = j8;
        this.f90586k = i3;
        this.f90587l = i4;
        this.f90588m = i5;
        this.f90589n = j9;
    }

    /* JADX INFO: renamed from: a */
    public final void m117869a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f90576a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f90577b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f90577b / this.f90576a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f90578c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f90579d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f90586k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f90580e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f90583h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f90587l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f90581f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f90588m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f90582g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f90584i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f90585j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public final String toString() {
        return "StatsSnapshot{maxSize=" + this.f90576a + ", size=" + this.f90577b + ", cacheHits=" + this.f90578c + ", cacheMisses=" + this.f90579d + ", downloadCount=" + this.f90586k + ", totalDownloadSize=" + this.f90580e + ", averageDownloadSize=" + this.f90583h + ", totalOriginalBitmapSize=" + this.f90581f + ", totalTransformedBitmapSize=" + this.f90582g + ", averageOriginalBitmapSize=" + this.f90584i + ", averageTransformedBitmapSize=" + this.f90585j + ", originalBitmapCount=" + this.f90587l + ", transformedBitmapCount=" + this.f90588m + ", timeStamp=" + this.f90589n + '}';
    }
}
