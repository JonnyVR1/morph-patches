package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public class r8r {

    /* JADX INFO: renamed from: a */
    public String f161750a;

    /* JADX INFO: renamed from: b */
    public int f161751b;

    /* JADX INFO: renamed from: c */
    public int f161752c;

    /* JADX INFO: renamed from: d */
    public int f161753d;

    /* JADX INFO: renamed from: e */
    public int f161754e;

    /* JADX INFO: renamed from: f */
    public zvl f161755f;

    public r8r() {
        this.f161750a = "";
        this.f161751b = -1;
        this.f161752c = -1;
        this.f161753d = -1;
        this.f161754e = -1;
    }

    /* JADX INFO: renamed from: a */
    public r8r m180237a() {
        r8r r8rVar = new r8r();
        r8rVar.f161750a = this.f161750a;
        r8rVar.f161751b = this.f161751b;
        r8rVar.f161752c = this.f161752c;
        r8rVar.f161753d = this.f161753d;
        r8rVar.f161754e = this.f161754e;
        r8rVar.f161755f = this.f161755f;
        return r8rVar;
    }

    /* JADX INFO: renamed from: b */
    public boolean m180238b() {
        return this.f161751b > 0;
    }

    /* JADX INFO: renamed from: c */
    public boolean m180239c() {
        return !TextUtils.isEmpty(this.f161750a);
    }

    /* JADX INFO: renamed from: d */
    public boolean m180240d() {
        return this.f161754e > 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean m180241e() {
        return TextUtils.isEmpty(this.f161750a) && this.f161751b > 0;
    }

    /* JADX INFO: renamed from: f */
    public boolean m180242f() {
        return !TextUtils.isEmpty(this.f161750a) && this.f161751b <= 0;
    }

    /* JADX INFO: renamed from: g */
    public void m180243g(String str) {
        this.f161750a = str;
    }

    /* JADX INFO: renamed from: l.r8r$a */
    public static class C19791a {

        /* JADX INFO: renamed from: a */
        public String f161756a;

        /* JADX INFO: renamed from: b */
        public int f161757b;

        /* JADX INFO: renamed from: c */
        public int f161758c;

        /* JADX INFO: renamed from: d */
        public int f161759d;

        /* JADX INFO: renamed from: e */
        public int f161760e;

        /* JADX INFO: renamed from: f */
        public zvl f161761f;

        public C19791a(int i) {
            this.f161756a = "";
            this.f161757b = -1;
            this.f161758c = -1;
            this.f161759d = -1;
            this.f161760e = i;
        }

        /* JADX INFO: renamed from: a */
        public r8r m180244a() {
            r8r r8rVar = new r8r();
            if (this.f161760e > 0) {
                this.f161756a = "";
                this.f161757b = -1;
                this.f161758c = -1;
                this.f161759d = -1;
            } else {
                this.f161760e = -1;
            }
            if (this.f161761f == null) {
                o1j0.m165636j("标签必须设置一个tag");
            }
            r8rVar.f161750a = this.f161756a;
            r8rVar.f161751b = this.f161757b;
            r8rVar.f161752c = this.f161758c;
            r8rVar.f161753d = this.f161759d;
            r8rVar.f161754e = this.f161760e;
            r8rVar.f161755f = this.f161761f;
            return r8rVar;
        }

        /* JADX INFO: renamed from: b */
        public C19791a m180245b(int i) {
            this.f161758c = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C19791a m180246c(zvl zvlVar) {
            this.f161761f = zvlVar;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C19791a m180247d(int i) {
            this.f161759d = i;
            return this;
        }

        public C19791a(String str, int i) {
            this.f161758c = -1;
            this.f161759d = -1;
            this.f161760e = -1;
            this.f161756a = str;
            this.f161757b = i;
        }
    }
}
