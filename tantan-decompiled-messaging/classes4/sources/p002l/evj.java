package p002l;

import android.text.TextUtils;
import l.d30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class evj {

    /* JADX INFO: renamed from: a */
    public final String f9977a;

    /* JADX INFO: renamed from: b */
    public final String f9978b;

    /* JADX INFO: renamed from: c */
    public final String f9979c;

    /* JADX INFO: renamed from: d */
    public final d30 f9980d;

    /* JADX INFO: renamed from: e */
    public final String f9981e;

    /* JADX INFO: renamed from: l.evj$a */
    public static class C0549a {

        /* JADX INFO: renamed from: a */
        public final String f9982a;

        /* JADX INFO: renamed from: b */
        public final String f9983b;

        /* JADX INFO: renamed from: c */
        public final String f9984c;

        /* JADX INFO: renamed from: d */
        public d30 f9985d;

        /* JADX INFO: renamed from: e */
        public String f9986e = "";

        public C0549a(String str, String str2, String str3) {
            this.f9982a = str;
            this.f9983b = str2;
            this.f9984c = str3;
        }

        /* JADX INFO: renamed from: f */
        public evj m12717f() {
            return new evj(this);
        }

        /* JADX INFO: renamed from: g */
        public C0549a m12718g(d30 d30Var) {
            this.f9985d = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C0549a m12719h(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f9986e = str;
            }
            return this;
        }
    }

    public evj(C0549a c0549a) {
        this.f9977a = c0549a.f9982a;
        this.f9978b = c0549a.f9983b;
        this.f9979c = c0549a.f9984c;
        this.f9980d = c0549a.f9985d;
        this.f9981e = c0549a.f9986e;
    }

    /* JADX INFO: renamed from: a */
    public String m12706a() {
        return this.f9978b;
    }

    /* JADX INFO: renamed from: b */
    public String m12707b() {
        return this.f9981e;
    }

    /* JADX INFO: renamed from: c */
    public String m12708c() {
        return this.f9977a;
    }

    /* JADX INFO: renamed from: d */
    public String m12709d() {
        return this.f9979c;
    }

    /* JADX INFO: renamed from: e */
    public d30 m12710e() {
        return this.f9980d;
    }

    /* JADX INFO: renamed from: f */
    public boolean m12711f() {
        return TextUtils.equals(this.f9979c, "live");
    }
}
