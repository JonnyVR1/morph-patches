package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class p6j {

    /* JADX INFO: renamed from: a */
    public final int f150856a;

    /* JADX INFO: renamed from: b */
    public final int f150857b;

    /* JADX INFO: renamed from: c */
    public final float f150858c;

    /* JADX INFO: renamed from: d */
    public final long f150859d;

    /* JADX INFO: renamed from: l.p6j$b */
    public static final class C19308b {

        /* JADX INFO: renamed from: a */
        public int f150860a;

        /* JADX INFO: renamed from: b */
        public int f150861b;

        /* JADX INFO: renamed from: c */
        public float f150862c = 1.0f;

        /* JADX INFO: renamed from: d */
        public long f150863d;

        public C19308b(int i, int i2) {
            this.f150860a = i;
            this.f150861b = i2;
        }

        /* JADX INFO: renamed from: a */
        public p6j m170910a() {
            return new p6j(this.f150860a, this.f150861b, this.f150862c, this.f150863d);
        }

        /* JADX INFO: renamed from: b */
        public C19308b m170911b(float f) {
            this.f150862c = f;
            return this;
        }
    }

    public p6j(int i, int i2, float f, long j) {
        w11.m204366b(i > 0, "width must be positive, but is: " + i);
        w11.m204366b(i2 > 0, "height must be positive, but is: " + i2);
        this.f150856a = i;
        this.f150857b = i2;
        this.f150858c = f;
        this.f150859d = j;
    }
}
