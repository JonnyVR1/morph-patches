package p149l;

import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public final class vkg0 {

    /* JADX INFO: renamed from: a */
    public final int f181785a;

    /* JADX INFO: renamed from: b */
    public final int f181786b;

    /* JADX INFO: renamed from: c */
    public final long f181787c;

    /* JADX INFO: renamed from: d */
    public final long f181788d;

    /* JADX INFO: renamed from: e */
    public final long f181789e;

    /* JADX INFO: renamed from: f */
    public final long f181790f;

    /* JADX INFO: renamed from: g */
    public final long f181791g;

    /* JADX INFO: renamed from: h */
    public final long f181792h;

    /* JADX INFO: renamed from: i */
    public final long f181793i;

    /* JADX INFO: renamed from: j */
    public final long f181794j;

    /* JADX INFO: renamed from: k */
    public final int f181795k;

    /* JADX INFO: renamed from: l */
    public final int f181796l;

    /* JADX INFO: renamed from: m */
    public final int f181797m;

    /* JADX INFO: renamed from: n */
    public final long f181798n;

    public vkg0(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f181785a = i;
        this.f181786b = i2;
        this.f181787c = j;
        this.f181788d = j2;
        this.f181789e = j3;
        this.f181790f = j4;
        this.f181791g = j5;
        this.f181792h = j6;
        this.f181793i = j7;
        this.f181794j = j8;
        this.f181795k = i3;
        this.f181796l = i4;
        this.f181797m = i5;
        this.f181798n = j9;
    }

    /* JADX INFO: renamed from: a */
    public final void m198720a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f181785a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f181786b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f181786b / this.f181785a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f181787c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f181788d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f181795k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f181789e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f181792h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f181796l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f181790f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f181797m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f181791g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f181793i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f181794j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public final String toString() {
        return "StatsSnapshot{maxSize=" + this.f181785a + ", size=" + this.f181786b + ", cacheHits=" + this.f181787c + ", cacheMisses=" + this.f181788d + ", downloadCount=" + this.f181795k + ", totalDownloadSize=" + this.f181789e + ", averageDownloadSize=" + this.f181792h + ", totalOriginalBitmapSize=" + this.f181790f + ", totalTransformedBitmapSize=" + this.f181791g + ", averageOriginalBitmapSize=" + this.f181793i + ", averageTransformedBitmapSize=" + this.f181794j + ", originalBitmapCount=" + this.f181796l + ", transformedBitmapCount=" + this.f181797m + ", timeStamp=" + this.f181798n + '}';
    }
}
