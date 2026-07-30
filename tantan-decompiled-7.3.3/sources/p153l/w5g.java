package p153l;

/* JADX INFO: loaded from: classes4.dex */
public final class w5g {

    /* JADX INFO: renamed from: a */
    public final String f187506a;

    /* JADX INFO: renamed from: b */
    public final String f187507b;

    /* JADX INFO: renamed from: c */
    public final long f187508c;

    /* JADX INFO: renamed from: d */
    public final long f187509d;

    /* JADX INFO: renamed from: l.w5g$a */
    public static final class C21024a {

        /* JADX INFO: renamed from: a */
        public String f187510a;

        /* JADX INFO: renamed from: b */
        public String f187511b;

        /* JADX INFO: renamed from: c */
        public long f187512c;

        /* JADX INFO: renamed from: d */
        public long f187513d;

        /* JADX INFO: renamed from: a */
        public w5g m204973a() {
            return new w5g(this.f187510a, this.f187511b, this.f187512c, this.f187513d);
        }

        /* JADX INFO: renamed from: b */
        public C21024a m204974b(long j) {
            this.f187513d = j;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C21024a m204975c(long j) {
            this.f187512c = j;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C21024a m204976d(String str) {
            this.f187510a = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C21024a m204977e(String str) {
            this.f187511b = str;
            return this;
        }

        public C21024a() {
        }
    }

    public w5g(String str, String str2, long j, long j2) {
        this.f187506a = str;
        this.f187507b = str2;
        this.f187508c = j;
        this.f187509d = j2;
    }

    /* JADX INFO: renamed from: a */
    public static C21024a m204972a() {
        return new C21024a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w5g.class == obj.getClass()) {
            w5g w5gVar = (w5g) obj;
            if (this.f187508c == w5gVar.f187508c && this.f187509d == w5gVar.f187509d && k950.m148863a(this.f187506a, w5gVar.f187506a) && k950.m148863a(this.f187507b, w5gVar.f187507b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k950.m148864b(this.f187506a, this.f187507b, Long.valueOf(this.f187508c), Long.valueOf(this.f187509d));
    }

    public String toString() {
        return "FanData{userId='" + this.f187506a + "', userImageUrl='" + this.f187507b + "', rank=" + this.f187508c + ", amount=" + this.f187509d + '}';
    }
}
