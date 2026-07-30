package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class evj {

    /* JADX INFO: renamed from: a */
    public final String f93340a;

    /* JADX INFO: renamed from: b */
    public final String f93341b;

    /* JADX INFO: renamed from: c */
    public final String f93342c;

    /* JADX INFO: renamed from: d */
    public final d30 f93343d;

    /* JADX INFO: renamed from: e */
    public final String f93344e;

    /* JADX INFO: renamed from: l.evj$a */
    public static class C16689a {

        /* JADX INFO: renamed from: a */
        public final String f93345a;

        /* JADX INFO: renamed from: b */
        public final String f93346b;

        /* JADX INFO: renamed from: c */
        public final String f93347c;

        /* JADX INFO: renamed from: d */
        public d30 f93348d;

        /* JADX INFO: renamed from: e */
        public String f93349e = "";

        public C16689a(String str, String str2, String str3) {
            this.f93345a = str;
            this.f93346b = str2;
            this.f93347c = str3;
        }

        /* JADX INFO: renamed from: f */
        public evj m118277f() {
            return new evj(this);
        }

        /* JADX INFO: renamed from: g */
        public C16689a m118278g(d30 d30Var) {
            this.f93348d = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C16689a m118279h(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f93349e = str;
            }
            return this;
        }
    }

    public evj(C16689a c16689a) {
        this.f93340a = c16689a.f93345a;
        this.f93341b = c16689a.f93346b;
        this.f93342c = c16689a.f93347c;
        this.f93343d = c16689a.f93348d;
        this.f93344e = c16689a.f93349e;
    }

    /* JADX INFO: renamed from: a */
    public String m118266a() {
        return this.f93341b;
    }

    /* JADX INFO: renamed from: b */
    public String m118267b() {
        return this.f93344e;
    }

    /* JADX INFO: renamed from: c */
    public String m118268c() {
        return this.f93340a;
    }

    /* JADX INFO: renamed from: d */
    public String m118269d() {
        return this.f93342c;
    }

    /* JADX INFO: renamed from: e */
    public d30 m118270e() {
        return this.f93343d;
    }

    /* JADX INFO: renamed from: f */
    public boolean m118271f() {
        return TextUtils.equals(this.f93342c, "live");
    }
}
