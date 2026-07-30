package p002l;

import l.v050;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public final class i4g {

    /* JADX INFO: renamed from: a */
    public final String f13039a;

    /* JADX INFO: renamed from: b */
    public final String f13040b;

    /* JADX INFO: renamed from: c */
    public final long f13041c;

    /* JADX INFO: renamed from: d */
    public final long f13042d;

    /* JADX INFO: renamed from: l.i4g$a */
    public static final class C0616a {

        /* JADX INFO: renamed from: a */
        public String f13043a;

        /* JADX INFO: renamed from: b */
        public String f13044b;

        /* JADX INFO: renamed from: c */
        public long f13045c;

        /* JADX INFO: renamed from: d */
        public long f13046d;

        /* JADX INFO: renamed from: a */
        public i4g m14992a() {
            return new i4g(this.f13043a, this.f13044b, this.f13045c, this.f13046d);
        }

        /* JADX INFO: renamed from: b */
        public C0616a m14993b(long j) {
            this.f13046d = j;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0616a m14994c(long j) {
            this.f13045c = j;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C0616a m14995d(String str) {
            this.f13043a = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C0616a m14996e(String str) {
            this.f13044b = str;
            return this;
        }

        public C0616a() {
        }
    }

    public i4g(String str, String str2, long j, long j2) {
        this.f13039a = str;
        this.f13040b = str2;
        this.f13041c = j;
        this.f13042d = j2;
    }

    /* JADX INFO: renamed from: a */
    public static C0616a m14991a() {
        return new C0616a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i4g.class == obj.getClass()) {
            i4g i4gVar = (i4g) obj;
            if (this.f13041c == i4gVar.f13041c && this.f13042d == i4gVar.f13042d && v050.a(this.f13039a, i4gVar.f13039a) && v050.a(this.f13040b, i4gVar.f13040b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.b(new Object[]{this.f13039a, this.f13040b, Long.valueOf(this.f13041c), Long.valueOf(this.f13042d)});
    }

    public String toString() {
        return "FanData{userId='" + this.f13039a + "', userImageUrl='" + this.f13040b + "', rank=" + this.f13041c + ", amount=" + this.f13042d + '}';
    }
}
