package p149l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class lqe {

    /* JADX INFO: renamed from: a */
    public final String f129315a;

    /* JADX INFO: renamed from: b */
    public final boolean f129316b;

    /* JADX INFO: renamed from: c */
    public final int f129317c;

    /* JADX INFO: renamed from: d */
    public Map<String, Object> f129318d;

    /* JADX INFO: renamed from: l.lqe$a */
    public static class C18285a {

        /* JADX INFO: renamed from: a */
        public String f129319a;

        /* JADX INFO: renamed from: b */
        public int f129320b;

        /* JADX INFO: renamed from: c */
        public String f129321c;

        /* JADX INFO: renamed from: d */
        public String f129322d;

        /* JADX INFO: renamed from: e */
        public String f129323e;

        /* JADX INFO: renamed from: f */
        public String f129324f;

        /* JADX INFO: renamed from: g */
        public String f129325g;

        /* JADX INFO: renamed from: h */
        public String f129326h;

        /* JADX INFO: renamed from: i */
        public int f129327i;

        /* JADX INFO: renamed from: j */
        public boolean f129328j;

        /* JADX INFO: renamed from: k */
        public int f129329k;

        /* JADX INFO: renamed from: l */
        public lqe m151003l() {
            return new lqe(this);
        }

        /* JADX INFO: renamed from: m */
        public C18285a m151004m(String str, int i) {
            this.f129319a = str + "_" + i;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C18285a m151005n(boolean z) {
            this.f129328j = z;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C18285a m151006o(String str) {
            this.f129323e = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C18285a m151007p(String str) {
            this.f129326h = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C18285a m151008q(int i) {
            this.f129320b = i;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C18285a m151009r(int i) {
            this.f129329k = i;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C18285a m151010s(String str) {
            this.f129324f = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C18285a m151011t(String str) {
            this.f129321c = str;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C18285a m151012u(int i) {
            this.f129327i = i;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C18285a m151013v(String str) {
            this.f129325g = str;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C18285a m151014w(String str) {
            this.f129322d = str;
            return this;
        }
    }

    public lqe(C18285a c18285a) {
        this.f129318d = new HashMap();
        this.f129315a = c18285a.f129322d;
        this.f129316b = c18285a.f129328j;
        this.f129317c = c18285a.f129329k;
        this.f129318d.put("unique_id", c18285a.f129319a);
        this.f129318d.put("giftId", Integer.valueOf(c18285a.f129320b));
        this.f129318d.put("gift_resource_id", c18285a.f129321c);
        this.f129318d.put("actor_user_id", c18285a.f129322d);
        this.f129318d.put("anchorId", c18285a.f129323e);
        this.f129318d.put("giftName", c18285a.f129324f);
        this.f129318d.put("liveId", c18285a.f129325g);
        this.f129318d.put("gift_effect_type", c18285a.f129326h);
        this.f129318d.put("gift_source", Integer.valueOf(c18285a.f129327i));
    }

    /* JADX INFO: renamed from: a */
    public int m150987a() {
        return this.f129317c;
    }

    /* JADX INFO: renamed from: b */
    public String m150988b() {
        return this.f129315a;
    }

    /* JADX INFO: renamed from: c */
    public Map<String, Object> m150989c() {
        return this.f129318d;
    }

    /* JADX INFO: renamed from: d */
    public boolean m150990d() {
        return this.f129316b;
    }

    /* JADX INFO: renamed from: e */
    public void m150991e(boolean z) {
        this.f129318d.put("process_status", z ? "success" : "fail");
    }
}
