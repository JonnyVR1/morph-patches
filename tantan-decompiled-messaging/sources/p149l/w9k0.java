package p149l;

import android.text.TextUtils;
import java.util.HashSet;

/* JADX INFO: loaded from: classes13.dex */
public class w9k0 {

    /* JADX INFO: renamed from: a */
    public String f185363a;

    /* JADX INFO: renamed from: b */
    public boolean f185364b;

    /* JADX INFO: renamed from: c */
    public boolean f185365c;

    /* JADX INFO: renamed from: d */
    public s2f f185366d;

    /* JADX INFO: renamed from: e */
    public HashSet<sx00> f185367e;

    /* JADX INFO: renamed from: f */
    public HashSet<ifi0> f185368f;

    /* JADX INFO: renamed from: g */
    public qwv f185369g;

    /* JADX INFO: renamed from: h */
    public m3f f185370h;

    /* JADX INFO: renamed from: i */
    public lsl f185371i;

    /* JADX INFO: renamed from: j */
    public boolean f185372j;

    /* JADX INFO: renamed from: k */
    public q2m f185373k;

    /* JADX INFO: renamed from: l.w9k0$b */
    public static final class C20838b {

        /* JADX INFO: renamed from: a */
        public String f185374a;

        /* JADX INFO: renamed from: b */
        public boolean f185375b;

        /* JADX INFO: renamed from: c */
        public boolean f185376c;

        /* JADX INFO: renamed from: d */
        public s2f f185377d;

        /* JADX INFO: renamed from: e */
        public qwv f185378e;

        /* JADX INFO: renamed from: f */
        public boolean f185379f;

        /* JADX INFO: renamed from: g */
        public q2m f185380g;

        /* JADX INFO: renamed from: h */
        public m3f f185381h;

        /* JADX INFO: renamed from: i */
        public lsl f185382i;

        /* JADX INFO: renamed from: j */
        public boolean f185383j;

        /* JADX INFO: renamed from: k */
        public HashSet<sx00> f185384k = new HashSet<>();

        /* JADX INFO: renamed from: a */
        public w9k0 m202322a() {
            return new w9k0(this.f185374a, this.f185377d, this.f185384k, this.f185378e, this.f185376c, this.f185383j, this.f185381h, this.f185382i, this.f185379f, this.f185380g, null);
        }

        /* JADX INFO: renamed from: b */
        public C20838b m202323b(boolean z) {
            this.f185383j = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C20838b m202324c(boolean z) {
            this.f185376c = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C20838b m202325d(boolean z) {
            this.f185379f = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C20838b m202326e(m3f m3fVar) {
            this.f185381h = m3fVar;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C20838b m202327f(String str) {
            this.f185374a = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C20838b m202328g(lsl lslVar) {
            this.f185382i = lslVar;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C20838b m202329h(boolean z) {
            this.f185375b = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C20838b m202330i(s2f s2fVar) {
            this.f185377d = s2fVar;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C20838b m202331j(qwv qwvVar) {
            this.f185378e = qwvVar;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C20838b m202332k(sx00 sx00Var) {
            String eventType = sx00Var.getEventType();
            String strMo81107a = sx00Var.mo81107a();
            for (sx00 sx00Var2 : this.f185384k) {
                if (TextUtils.equals(eventType, sx00Var2.getEventType()) && TextUtils.equals(strMo81107a, sx00Var2.mo81107a())) {
                    throw new RuntimeException(String.format("monitor with tag %s is already exist", eventType));
                }
            }
            this.f185384k.add(sx00Var);
            return this;
        }

        /* JADX INFO: renamed from: l */
        public <T> C20838b m202333l(q2m<T> q2mVar) {
            this.f185380g = q2mVar;
            return this;
        }
    }

    public w9k0(String str, s2f s2fVar, HashSet<sx00> hashSet, qwv qwvVar, boolean z, boolean z2, m3f m3fVar, lsl lslVar, boolean z3, q2m q2mVar, ffi0 ffi0Var) {
        this.f185363a = str;
        this.f185366d = s2fVar;
        this.f185367e = hashSet;
        this.f185369g = qwvVar;
        this.f185364b = z;
        this.f185365c = z2;
        this.f185370h = m3fVar;
        this.f185371i = lslVar;
        this.f185372j = z3;
        this.f185373k = q2mVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean m202310a() {
        return this.f185365c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m202311b() {
        return this.f185364b;
    }

    /* JADX INFO: renamed from: c */
    public s2f m202312c() {
        return this.f185366d;
    }

    /* JADX INFO: renamed from: d */
    public m3f m202313d() {
        return this.f185370h;
    }

    /* JADX INFO: renamed from: e */
    public String m202314e() {
        return this.f185363a;
    }

    /* JADX INFO: renamed from: f */
    public lsl m202315f() {
        return this.f185371i;
    }

    /* JADX INFO: renamed from: g */
    public qwv m202316g() {
        return this.f185369g;
    }

    /* JADX INFO: renamed from: h */
    public sx00 m202317h(String str) {
        for (sx00 sx00Var : this.f185367e) {
            if (str.equals(sx00Var.getEventType())) {
                return sx00Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public HashSet<sx00> m202318i() {
        return this.f185367e;
    }

    /* JADX INFO: renamed from: j */
    public ffi0 m202319j() {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public HashSet<ifi0> m202320k() {
        if (this.f185368f == null) {
            this.f185368f = new HashSet<>();
        }
        return this.f185368f;
    }

    /* JADX INFO: renamed from: l */
    public String m202321l() {
        return this.f185363a + "_v2";
    }
}
