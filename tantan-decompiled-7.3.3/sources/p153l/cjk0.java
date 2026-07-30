package p153l;

import android.text.TextUtils;
import java.util.HashSet;

/* JADX INFO: loaded from: classes11.dex */
public class cjk0 {

    /* JADX INFO: renamed from: a */
    public String f82174a;

    /* JADX INFO: renamed from: b */
    public boolean f82175b;

    /* JADX INFO: renamed from: c */
    public boolean f82176c;

    /* JADX INFO: renamed from: d */
    public x3f f82177d;

    /* JADX INFO: renamed from: e */
    public HashSet<c610> f82178e;

    /* JADX INFO: renamed from: f */
    public HashSet<ioi0> f82179f;

    /* JADX INFO: renamed from: g */
    public qyv f82180g;

    /* JADX INFO: renamed from: h */
    public r4f f82181h;

    /* JADX INFO: renamed from: i */
    public yul f82182i;

    /* JADX INFO: renamed from: j */
    public boolean f82183j;

    /* JADX INFO: renamed from: k */
    public j5m f82184k;

    /* JADX INFO: renamed from: l.cjk0$b */
    public static final class C16287b {

        /* JADX INFO: renamed from: a */
        public String f82185a;

        /* JADX INFO: renamed from: b */
        public boolean f82186b;

        /* JADX INFO: renamed from: c */
        public boolean f82187c;

        /* JADX INFO: renamed from: d */
        public x3f f82188d;

        /* JADX INFO: renamed from: e */
        public qyv f82189e;

        /* JADX INFO: renamed from: f */
        public boolean f82190f;

        /* JADX INFO: renamed from: g */
        public j5m f82191g;

        /* JADX INFO: renamed from: h */
        public r4f f82192h;

        /* JADX INFO: renamed from: i */
        public yul f82193i;

        /* JADX INFO: renamed from: j */
        public boolean f82194j;

        /* JADX INFO: renamed from: k */
        public HashSet<c610> f82195k = new HashSet<>();

        /* JADX INFO: renamed from: a */
        public cjk0 m110257a() {
            return new cjk0(this.f82185a, this.f82188d, this.f82195k, this.f82189e, this.f82187c, this.f82194j, this.f82192h, this.f82193i, this.f82190f, this.f82191g, null);
        }

        /* JADX INFO: renamed from: b */
        public C16287b m110258b(boolean z) {
            this.f82194j = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C16287b m110259c(boolean z) {
            this.f82187c = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C16287b m110260d(boolean z) {
            this.f82190f = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C16287b m110261e(r4f r4fVar) {
            this.f82192h = r4fVar;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C16287b m110262f(String str) {
            this.f82185a = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C16287b m110263g(yul yulVar) {
            this.f82193i = yulVar;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C16287b m110264h(boolean z) {
            this.f82186b = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C16287b m110265i(x3f x3fVar) {
            this.f82188d = x3fVar;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C16287b m110266j(qyv qyvVar) {
            this.f82189e = qyvVar;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C16287b m110267k(c610 c610Var) {
            String eventType = c610Var.getEventType();
            String strMo82290a = c610Var.mo82290a();
            for (c610 c610Var2 : this.f82195k) {
                if (TextUtils.equals(eventType, c610Var2.getEventType()) && TextUtils.equals(strMo82290a, c610Var2.mo82290a())) {
                    throw new RuntimeException(String.format("monitor with tag %s is already exist", eventType));
                }
            }
            this.f82195k.add(c610Var);
            return this;
        }

        /* JADX INFO: renamed from: l */
        public <T> C16287b m110268l(j5m<T> j5mVar) {
            this.f82191g = j5mVar;
            return this;
        }
    }

    public cjk0(String str, x3f x3fVar, HashSet<c610> hashSet, qyv qyvVar, boolean z, boolean z2, r4f r4fVar, yul yulVar, boolean z3, j5m j5mVar, foi0 foi0Var) {
        this.f82174a = str;
        this.f82177d = x3fVar;
        this.f82178e = hashSet;
        this.f82180g = qyvVar;
        this.f82175b = z;
        this.f82176c = z2;
        this.f82181h = r4fVar;
        this.f82182i = yulVar;
        this.f82183j = z3;
        this.f82184k = j5mVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean m110245a() {
        return this.f82176c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m110246b() {
        return this.f82175b;
    }

    /* JADX INFO: renamed from: c */
    public x3f m110247c() {
        return this.f82177d;
    }

    /* JADX INFO: renamed from: d */
    public r4f m110248d() {
        return this.f82181h;
    }

    /* JADX INFO: renamed from: e */
    public String m110249e() {
        return this.f82174a;
    }

    /* JADX INFO: renamed from: f */
    public yul m110250f() {
        return this.f82182i;
    }

    /* JADX INFO: renamed from: g */
    public qyv m110251g() {
        return this.f82180g;
    }

    /* JADX INFO: renamed from: h */
    public c610 m110252h(String str) {
        for (c610 c610Var : this.f82178e) {
            if (str.equals(c610Var.getEventType())) {
                return c610Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public HashSet<c610> m110253i() {
        return this.f82178e;
    }

    /* JADX INFO: renamed from: j */
    public foi0 m110254j() {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public HashSet<ioi0> m110255k() {
        if (this.f82179f == null) {
            this.f82179f = new HashSet<>();
        }
        return this.f82179f;
    }

    /* JADX INFO: renamed from: l */
    public String m110256l() {
        return this.f82174a + "_v2";
    }
}
