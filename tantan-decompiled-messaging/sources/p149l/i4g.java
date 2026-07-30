package p149l;

/* JADX INFO: loaded from: classes4.dex */
public final class i4g {

    /* JADX INFO: renamed from: a */
    public final String f111441a;

    /* JADX INFO: renamed from: b */
    public final String f111442b;

    /* JADX INFO: renamed from: c */
    public final long f111443c;

    /* JADX INFO: renamed from: d */
    public final long f111444d;

    /* JADX INFO: renamed from: l.i4g$a */
    public static final class C17480a {

        /* JADX INFO: renamed from: a */
        public String f111445a;

        /* JADX INFO: renamed from: b */
        public String f111446b;

        /* JADX INFO: renamed from: c */
        public long f111447c;

        /* JADX INFO: renamed from: d */
        public long f111448d;

        /* JADX INFO: renamed from: a */
        public i4g m134344a() {
            return new i4g(this.f111445a, this.f111446b, this.f111447c, this.f111448d);
        }

        /* JADX INFO: renamed from: b */
        public C17480a m134345b(long j) {
            this.f111448d = j;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C17480a m134346c(long j) {
            this.f111447c = j;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C17480a m134347d(String str) {
            this.f111445a = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C17480a m134348e(String str) {
            this.f111446b = str;
            return this;
        }

        public C17480a() {
        }
    }

    public i4g(String str, String str2, long j, long j2) {
        this.f111441a = str;
        this.f111442b = str2;
        this.f111443c = j;
        this.f111444d = j2;
    }

    /* JADX INFO: renamed from: a */
    public static C17480a m134343a() {
        return new C17480a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i4g.class == obj.getClass()) {
            i4g i4gVar = (i4g) obj;
            if (this.f111443c == i4gVar.f111443c && this.f111444d == i4gVar.f111444d && v050.m196470a(this.f111441a, i4gVar.f111441a) && v050.m196470a(this.f111442b, i4gVar.f111442b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.m196471b(this.f111441a, this.f111442b, Long.valueOf(this.f111443c), Long.valueOf(this.f111444d));
    }

    public String toString() {
        return "FanData{userId='" + this.f111441a + "', userImageUrl='" + this.f111442b + "', rank=" + this.f111443c + ", amount=" + this.f111444d + '}';
    }
}
