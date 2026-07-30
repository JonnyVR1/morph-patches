package p007l;

import android.text.TextUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class q6r {

    /* JADX INFO: renamed from: a */
    public String f3808a;

    /* JADX INFO: renamed from: b */
    public int f3809b;

    /* JADX INFO: renamed from: c */
    public int f3810c;

    /* JADX INFO: renamed from: d */
    public int f3811d;

    /* JADX INFO: renamed from: e */
    public int f3812e;

    /* JADX INFO: renamed from: f */
    public ltl f3813f;

    public q6r() {
        this.f3808a = "";
        this.f3809b = -1;
        this.f3810c = -1;
        this.f3811d = -1;
        this.f3812e = -1;
    }

    /* JADX INFO: renamed from: a */
    public q6r m10291a() {
        q6r q6rVar = new q6r();
        q6rVar.f3808a = this.f3808a;
        q6rVar.f3809b = this.f3809b;
        q6rVar.f3810c = this.f3810c;
        q6rVar.f3811d = this.f3811d;
        q6rVar.f3812e = this.f3812e;
        q6rVar.f3813f = this.f3813f;
        return q6rVar;
    }

    /* JADX INFO: renamed from: b */
    public boolean m10292b() {
        return this.f3809b > 0;
    }

    /* JADX INFO: renamed from: c */
    public boolean m10293c() {
        return !TextUtils.isEmpty(this.f3808a);
    }

    /* JADX INFO: renamed from: d */
    public boolean m10294d() {
        return this.f3812e > 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean m10295e() {
        return TextUtils.isEmpty(this.f3808a) && this.f3809b > 0;
    }

    /* JADX INFO: renamed from: f */
    public boolean m10296f() {
        return !TextUtils.isEmpty(this.f3808a) && this.f3809b <= 0;
    }

    /* JADX INFO: renamed from: g */
    public void m10297g(String str) {
        this.f3808a = str;
    }

    /* JADX INFO: renamed from: l.q6r$a */
    public static class C0664a {

        /* JADX INFO: renamed from: a */
        public String f3814a;

        /* JADX INFO: renamed from: b */
        public int f3815b;

        /* JADX INFO: renamed from: c */
        public int f3816c;

        /* JADX INFO: renamed from: d */
        public int f3817d;

        /* JADX INFO: renamed from: e */
        public int f3818e;

        /* JADX INFO: renamed from: f */
        public ltl f3819f;

        public C0664a(int i) {
            this.f3814a = "";
            this.f3815b = -1;
            this.f3816c = -1;
            this.f3817d = -1;
            this.f3818e = i;
        }

        /* JADX INFO: renamed from: a */
        public q6r m10298a() {
            q6r q6rVar = new q6r();
            if (this.f3818e > 0) {
                this.f3814a = "";
                this.f3815b = -1;
                this.f3816c = -1;
                this.f3817d = -1;
            } else {
                this.f3818e = -1;
            }
            if (this.f3819f == null) {
                lsi0.m9836j("标签必须设置一个tag");
            }
            q6rVar.f3808a = this.f3814a;
            q6rVar.f3809b = this.f3815b;
            q6rVar.f3810c = this.f3816c;
            q6rVar.f3811d = this.f3817d;
            q6rVar.f3812e = this.f3818e;
            q6rVar.f3813f = this.f3819f;
            return q6rVar;
        }

        /* JADX INFO: renamed from: b */
        public C0664a m10299b(int i) {
            this.f3816c = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0664a m10300c(ltl ltlVar) {
            this.f3819f = ltlVar;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C0664a m10301d(int i) {
            this.f3817d = i;
            return this;
        }

        public C0664a(String str, int i) {
            this.f3816c = -1;
            this.f3817d = -1;
            this.f3818e = -1;
            this.f3814a = str;
            this.f3815b = i;
        }
    }
}
