package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class nig {

    /* JADX INFO: renamed from: a */
    public final int f139088a;

    /* JADX INFO: renamed from: b */
    public final pge0 f139089b;

    /* JADX INFO: renamed from: c */
    public final String f139090c;

    /* JADX INFO: renamed from: d */
    public final String f139091d;

    /* JADX INFO: renamed from: e */
    public final d30 f139092e;

    /* JADX INFO: renamed from: l.nig$a */
    public static class C18699a {

        /* JADX INFO: renamed from: a */
        public int f139093a;

        /* JADX INFO: renamed from: b */
        public pge0 f139094b;

        /* JADX INFO: renamed from: c */
        public String f139095c;

        /* JADX INFO: renamed from: d */
        public String f139096d;

        /* JADX INFO: renamed from: e */
        public d30 f139097e;

        /* JADX INFO: renamed from: e */
        public nig m159505e() {
            return new nig(this);
        }

        /* JADX INFO: renamed from: f */
        public C18699a m159506f(d30 d30Var) {
            this.f139097e = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C18699a m159507g(int i) {
            this.f139093a = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C18699a m159508h(pge0 pge0Var) {
            this.f139094b = pge0Var;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C18699a m159509i(String str) {
            this.f139096d = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C18699a m159510j(String str) {
            this.f139095c = str;
            return this;
        }
    }

    public nig(C18699a c18699a) {
        this.f139088a = c18699a.f139093a;
        this.f139089b = c18699a.f139094b;
        this.f139090c = c18699a.f139095c;
        this.f139091d = c18699a.f139096d;
        this.f139092e = c18699a.f139097e;
    }

    /* JADX INFO: renamed from: a */
    public boolean m159500a() {
        return TextUtils.equals(this.f139091d, "js");
    }
}
