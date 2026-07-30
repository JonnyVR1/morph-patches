package p149l;

/* JADX INFO: loaded from: classes7.dex */
public interface ssl {

    /* JADX INFO: renamed from: l.ssl$a */
    public static class C20019a {

        /* JADX INFO: renamed from: a */
        int f166221a;

        /* JADX INFO: renamed from: b */
        String f166222b;

        /* JADX INFO: renamed from: c */
        String f166223c;

        public C20019a(int i, String str, String str2) {
            this.f166221a = i;
            this.f166222b = str;
            this.f166223c = str2;
        }

        /* JADX INFO: renamed from: a */
        public String m185752a() {
            return this.f166223c;
        }

        /* JADX INFO: renamed from: b */
        public int m185753b() {
            return this.f166221a;
        }

        /* JADX INFO: renamed from: c */
        public String m185754c() {
            return this.f166222b;
        }

        /* JADX INFO: renamed from: d */
        public boolean m185755d() {
            int i = this.f166221a;
            return i >= 200 && i < 300;
        }
    }

    /* JADX INFO: renamed from: a */
    C20019a mo185750a();

    /* JADX INFO: renamed from: b */
    C20019a mo185751b();
}
