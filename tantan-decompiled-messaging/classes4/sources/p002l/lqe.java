package p002l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lqe {

    /* JADX INFO: renamed from: a */
    public final String f14983a;

    /* JADX INFO: renamed from: b */
    public final boolean f14984b;

    /* JADX INFO: renamed from: c */
    public final int f14985c;

    /* JADX INFO: renamed from: d */
    public Map<String, Object> f14986d;

    /* JADX INFO: renamed from: l.lqe$a */
    public static class C0668a {

        /* JADX INFO: renamed from: a */
        public String f14987a;

        /* JADX INFO: renamed from: b */
        public int f14988b;

        /* JADX INFO: renamed from: c */
        public String f14989c;

        /* JADX INFO: renamed from: d */
        public String f14990d;

        /* JADX INFO: renamed from: e */
        public String f14991e;

        /* JADX INFO: renamed from: f */
        public String f14992f;

        /* JADX INFO: renamed from: g */
        public String f14993g;

        /* JADX INFO: renamed from: h */
        public String f14994h;

        /* JADX INFO: renamed from: i */
        public int f14995i;

        /* JADX INFO: renamed from: j */
        public boolean f14996j;

        /* JADX INFO: renamed from: k */
        public int f14997k;

        /* JADX INFO: renamed from: l */
        public lqe m17364l() {
            return new lqe(this);
        }

        /* JADX INFO: renamed from: m */
        public C0668a m17365m(String str, int i) {
            this.f14987a = str + "_" + i;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C0668a m17366n(boolean z) {
            this.f14996j = z;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C0668a m17367o(String str) {
            this.f14991e = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C0668a m17368p(String str) {
            this.f14994h = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C0668a m17369q(int i) {
            this.f14988b = i;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C0668a m17370r(int i) {
            this.f14997k = i;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C0668a m17371s(String str) {
            this.f14992f = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C0668a m17372t(String str) {
            this.f14989c = str;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C0668a m17373u(int i) {
            this.f14995i = i;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C0668a m17374v(String str) {
            this.f14993g = str;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C0668a m17375w(String str) {
            this.f14990d = str;
            return this;
        }
    }

    public lqe(C0668a c0668a) {
        this.f14986d = new HashMap();
        this.f14983a = c0668a.f14990d;
        this.f14984b = c0668a.f14996j;
        this.f14985c = c0668a.f14997k;
        this.f14986d.put("unique_id", c0668a.f14987a);
        this.f14986d.put("giftId", Integer.valueOf(c0668a.f14988b));
        this.f14986d.put("gift_resource_id", c0668a.f14989c);
        this.f14986d.put("actor_user_id", c0668a.f14990d);
        this.f14986d.put("anchorId", c0668a.f14991e);
        this.f14986d.put("giftName", c0668a.f14992f);
        this.f14986d.put("liveId", c0668a.f14993g);
        this.f14986d.put("gift_effect_type", c0668a.f14994h);
        this.f14986d.put("gift_source", Integer.valueOf(c0668a.f14995i));
    }

    /* JADX INFO: renamed from: a */
    public int m17348a() {
        return this.f14985c;
    }

    /* JADX INFO: renamed from: b */
    public String m17349b() {
        return this.f14983a;
    }

    /* JADX INFO: renamed from: c */
    public Map<String, Object> m17350c() {
        return this.f14986d;
    }

    /* JADX INFO: renamed from: d */
    public boolean m17351d() {
        return this.f14984b;
    }

    /* JADX INFO: renamed from: e */
    public void m17352e(boolean z) {
        this.f14986d.put("process_status", z ? "success" : "fail");
    }
}
