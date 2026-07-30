package p153l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class pre {

    /* JADX INFO: renamed from: a */
    public final String f153766a;

    /* JADX INFO: renamed from: b */
    public final boolean f153767b;

    /* JADX INFO: renamed from: c */
    public final int f153768c;

    /* JADX INFO: renamed from: d */
    public Map<String, Object> f153769d;

    /* JADX INFO: renamed from: l.pre$a */
    public static class C19425a {

        /* JADX INFO: renamed from: a */
        public String f153770a;

        /* JADX INFO: renamed from: b */
        public int f153771b;

        /* JADX INFO: renamed from: c */
        public String f153772c;

        /* JADX INFO: renamed from: d */
        public String f153773d;

        /* JADX INFO: renamed from: e */
        public String f153774e;

        /* JADX INFO: renamed from: f */
        public String f153775f;

        /* JADX INFO: renamed from: g */
        public String f153776g;

        /* JADX INFO: renamed from: h */
        public String f153777h;

        /* JADX INFO: renamed from: i */
        public int f153778i;

        /* JADX INFO: renamed from: j */
        public boolean f153779j;

        /* JADX INFO: renamed from: k */
        public int f153780k;

        /* JADX INFO: renamed from: l */
        public pre m173471l() {
            return new pre(this);
        }

        /* JADX INFO: renamed from: m */
        public C19425a m173472m(String str, int i) {
            this.f153770a = str + "_" + i;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C19425a m173473n(boolean z) {
            this.f153779j = z;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C19425a m173474o(String str) {
            this.f153774e = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C19425a m173475p(String str) {
            this.f153777h = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C19425a m173476q(int i) {
            this.f153771b = i;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C19425a m173477r(int i) {
            this.f153780k = i;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C19425a m173478s(String str) {
            this.f153775f = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C19425a m173479t(String str) {
            this.f153772c = str;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C19425a m173480u(int i) {
            this.f153778i = i;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C19425a m173481v(String str) {
            this.f153776g = str;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C19425a m173482w(String str) {
            this.f153773d = str;
            return this;
        }
    }

    public pre(C19425a c19425a) {
        this.f153769d = new HashMap();
        this.f153766a = c19425a.f153773d;
        this.f153767b = c19425a.f153779j;
        this.f153768c = c19425a.f153780k;
        this.f153769d.put("unique_id", c19425a.f153770a);
        this.f153769d.put("giftId", Integer.valueOf(c19425a.f153771b));
        this.f153769d.put("gift_resource_id", c19425a.f153772c);
        this.f153769d.put("actor_user_id", c19425a.f153773d);
        this.f153769d.put("anchorId", c19425a.f153774e);
        this.f153769d.put("giftName", c19425a.f153775f);
        this.f153769d.put("liveId", c19425a.f153776g);
        this.f153769d.put("gift_effect_type", c19425a.f153777h);
        this.f153769d.put("gift_source", Integer.valueOf(c19425a.f153778i));
    }

    /* JADX INFO: renamed from: a */
    public int m173455a() {
        return this.f153768c;
    }

    /* JADX INFO: renamed from: b */
    public String m173456b() {
        return this.f153766a;
    }

    /* JADX INFO: renamed from: c */
    public Map<String, Object> m173457c() {
        return this.f153769d;
    }

    /* JADX INFO: renamed from: d */
    public boolean m173458d() {
        return this.f153767b;
    }

    /* JADX INFO: renamed from: e */
    public void m173459e(boolean z) {
        this.f153769d.put("process_status", z ? "success" : "fail");
    }
}
