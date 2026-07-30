package p149l;

/* JADX INFO: loaded from: classes5.dex */
public final class y4n0 {

    /* JADX INFO: renamed from: a */
    public final String f196307a;

    /* JADX INFO: renamed from: b */
    public final String f196308b;

    /* JADX INFO: renamed from: c */
    public final long f196309c;

    /* JADX INFO: renamed from: d */
    public final long f196310d;

    /* JADX INFO: renamed from: l.y4n0$a */
    public static final class C21308a {

        /* JADX INFO: renamed from: a */
        public String f196311a;

        /* JADX INFO: renamed from: b */
        public String f196312b;

        /* JADX INFO: renamed from: c */
        public long f196313c;

        /* JADX INFO: renamed from: d */
        public long f196314d;

        /* JADX INFO: renamed from: a */
        public y4n0 m212927a() {
            return new y4n0(this.f196311a, this.f196312b, this.f196313c, this.f196314d);
        }

        /* JADX INFO: renamed from: b */
        public C21308a m212928b(long j) {
            this.f196314d = j;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C21308a m212929c(long j) {
            this.f196313c = j;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C21308a m212930d(String str) {
            this.f196311a = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C21308a m212931e(String str) {
            this.f196312b = str;
            return this;
        }

        public C21308a() {
        }
    }

    public y4n0(String str, String str2, long j, long j2) {
        this.f196307a = str;
        this.f196308b = str2;
        this.f196309c = j;
        this.f196310d = j2;
    }

    /* JADX INFO: renamed from: a */
    public static C21308a m212926a() {
        return new C21308a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y4n0.class == obj.getClass()) {
            y4n0 y4n0Var = (y4n0) obj;
            if (this.f196309c == y4n0Var.f196309c && this.f196310d == y4n0Var.f196310d && v050.m196470a(this.f196307a, y4n0Var.f196307a) && v050.m196470a(this.f196308b, y4n0Var.f196308b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.m196471b(this.f196307a, this.f196308b, Long.valueOf(this.f196309c), Long.valueOf(this.f196310d));
    }

    public String toString() {
        return "FanData{userId='" + this.f196307a + "', userImageUrl='" + this.f196308b + "', rank=" + this.f196309c + ", amount=" + this.f196310d + '}';
    }
}
