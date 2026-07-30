package p002l;

import android.text.TextUtils;
import l.d30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nig {

    /* JADX INFO: renamed from: a */
    public final int f16050a;

    /* JADX INFO: renamed from: b */
    public final pge0 f16051b;

    /* JADX INFO: renamed from: c */
    public final String f16052c;

    /* JADX INFO: renamed from: d */
    public final String f16053d;

    /* JADX INFO: renamed from: e */
    public final d30 f16054e;

    /* JADX INFO: renamed from: l.nig$a */
    public static class C0701a {

        /* JADX INFO: renamed from: a */
        public int f16055a;

        /* JADX INFO: renamed from: b */
        public pge0 f16056b;

        /* JADX INFO: renamed from: c */
        public String f16057c;

        /* JADX INFO: renamed from: d */
        public String f16058d;

        /* JADX INFO: renamed from: e */
        public d30 f16059e;

        /* JADX INFO: renamed from: e */
        public nig m18779e() {
            return new nig(this);
        }

        /* JADX INFO: renamed from: f */
        public C0701a m18780f(d30 d30Var) {
            this.f16059e = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C0701a m18781g(int i) {
            this.f16055a = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C0701a m18782h(pge0 pge0Var) {
            this.f16056b = pge0Var;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C0701a m18783i(String str) {
            this.f16058d = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C0701a m18784j(String str) {
            this.f16057c = str;
            return this;
        }
    }

    public nig(C0701a c0701a) {
        this.f16050a = c0701a.f16055a;
        this.f16051b = c0701a.f16056b;
        this.f16052c = c0701a.f16057c;
        this.f16053d = c0701a.f16058d;
        this.f16054e = c0701a.f16059e;
    }

    /* JADX INFO: renamed from: a */
    public boolean m18774a() {
        return TextUtils.equals(this.f16053d, "js");
    }
}
