package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class u3j {

    /* JADX INFO: renamed from: a */
    public final int f173615a;

    /* JADX INFO: renamed from: b */
    public final int f173616b;

    /* JADX INFO: renamed from: c */
    public final float f173617c;

    /* JADX INFO: renamed from: d */
    public final long f173618d;

    /* JADX INFO: renamed from: l.u3j$b */
    public static final class C20344b {

        /* JADX INFO: renamed from: a */
        public int f173619a;

        /* JADX INFO: renamed from: b */
        public int f173620b;

        /* JADX INFO: renamed from: c */
        public float f173621c = 1.0f;

        /* JADX INFO: renamed from: d */
        public long f173622d;

        public C20344b(int i, int i2) {
            this.f173619a = i;
            this.f173620b = i2;
        }

        /* JADX INFO: renamed from: a */
        public u3j m191575a() {
            return new u3j(this.f173619a, this.f173620b, this.f173621c, this.f173622d);
        }

        /* JADX INFO: renamed from: b */
        public C20344b m191576b(float f) {
            this.f173621c = f;
            return this;
        }
    }

    public u3j(int i, int i2, float f, long j) {
        p11.m167008b(i > 0, "width must be positive, but is: " + i);
        p11.m167008b(i2 > 0, "height must be positive, but is: " + i2);
        this.f173615a = i;
        this.f173616b = i2;
        this.f173617c = f;
        this.f173618d = j;
    }
}
