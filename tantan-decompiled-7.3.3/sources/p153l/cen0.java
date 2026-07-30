package p153l;

/* JADX INFO: loaded from: classes5.dex */
public final class cen0 {

    /* JADX INFO: renamed from: a */
    public final String f81391a;

    /* JADX INFO: renamed from: b */
    public final String f81392b;

    /* JADX INFO: renamed from: c */
    public final long f81393c;

    /* JADX INFO: renamed from: d */
    public final long f81394d;

    /* JADX INFO: renamed from: l.cen0$a */
    public static final class C16240a {

        /* JADX INFO: renamed from: a */
        public String f81395a;

        /* JADX INFO: renamed from: b */
        public String f81396b;

        /* JADX INFO: renamed from: c */
        public long f81397c;

        /* JADX INFO: renamed from: d */
        public long f81398d;

        /* JADX INFO: renamed from: a */
        public cen0 m109433a() {
            return new cen0(this.f81395a, this.f81396b, this.f81397c, this.f81398d);
        }

        /* JADX INFO: renamed from: b */
        public C16240a m109434b(long j) {
            this.f81398d = j;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C16240a m109435c(long j) {
            this.f81397c = j;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C16240a m109436d(String str) {
            this.f81395a = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C16240a m109437e(String str) {
            this.f81396b = str;
            return this;
        }

        public C16240a() {
        }
    }

    public cen0(String str, String str2, long j, long j2) {
        this.f81391a = str;
        this.f81392b = str2;
        this.f81393c = j;
        this.f81394d = j2;
    }

    /* JADX INFO: renamed from: a */
    public static C16240a m109432a() {
        return new C16240a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cen0.class == obj.getClass()) {
            cen0 cen0Var = (cen0) obj;
            if (this.f81393c == cen0Var.f81393c && this.f81394d == cen0Var.f81394d && k950.m148863a(this.f81391a, cen0Var.f81391a) && k950.m148863a(this.f81392b, cen0Var.f81392b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k950.m148864b(this.f81391a, this.f81392b, Long.valueOf(this.f81393c), Long.valueOf(this.f81394d));
    }

    public String toString() {
        return "FanData{userId='" + this.f81391a + "', userImageUrl='" + this.f81392b + "', rank=" + this.f81393c + ", amount=" + this.f81394d + '}';
    }
}
