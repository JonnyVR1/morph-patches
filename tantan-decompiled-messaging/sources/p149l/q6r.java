package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public class q6r {

    /* JADX INFO: renamed from: a */
    public String f152935a;

    /* JADX INFO: renamed from: b */
    public int f152936b;

    /* JADX INFO: renamed from: c */
    public int f152937c;

    /* JADX INFO: renamed from: d */
    public int f152938d;

    /* JADX INFO: renamed from: e */
    public int f152939e;

    /* JADX INFO: renamed from: f */
    public ltl f152940f;

    public q6r() {
        this.f152935a = "";
        this.f152936b = -1;
        this.f152937c = -1;
        this.f152938d = -1;
        this.f152939e = -1;
    }

    /* JADX INFO: renamed from: a */
    public q6r m173148a() {
        q6r q6rVar = new q6r();
        q6rVar.f152935a = this.f152935a;
        q6rVar.f152936b = this.f152936b;
        q6rVar.f152937c = this.f152937c;
        q6rVar.f152938d = this.f152938d;
        q6rVar.f152939e = this.f152939e;
        q6rVar.f152940f = this.f152940f;
        return q6rVar;
    }

    /* JADX INFO: renamed from: b */
    public boolean m173149b() {
        return this.f152936b > 0;
    }

    /* JADX INFO: renamed from: c */
    public boolean m173150c() {
        return !TextUtils.isEmpty(this.f152935a);
    }

    /* JADX INFO: renamed from: d */
    public boolean m173151d() {
        return this.f152939e > 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean m173152e() {
        return TextUtils.isEmpty(this.f152935a) && this.f152936b > 0;
    }

    /* JADX INFO: renamed from: f */
    public boolean m173153f() {
        return !TextUtils.isEmpty(this.f152935a) && this.f152936b <= 0;
    }

    /* JADX INFO: renamed from: g */
    public void m173154g(String str) {
        this.f152935a = str;
    }

    /* JADX INFO: renamed from: l.q6r$a */
    public static class C19436a {

        /* JADX INFO: renamed from: a */
        public String f152941a;

        /* JADX INFO: renamed from: b */
        public int f152942b;

        /* JADX INFO: renamed from: c */
        public int f152943c;

        /* JADX INFO: renamed from: d */
        public int f152944d;

        /* JADX INFO: renamed from: e */
        public int f152945e;

        /* JADX INFO: renamed from: f */
        public ltl f152946f;

        public C19436a(int i) {
            this.f152941a = "";
            this.f152942b = -1;
            this.f152943c = -1;
            this.f152944d = -1;
            this.f152945e = i;
        }

        /* JADX INFO: renamed from: a */
        public q6r m173155a() {
            q6r q6rVar = new q6r();
            if (this.f152945e > 0) {
                this.f152941a = "";
                this.f152942b = -1;
                this.f152943c = -1;
                this.f152944d = -1;
            } else {
                this.f152945e = -1;
            }
            if (this.f152946f == null) {
                lsi0.m151580j("标签必须设置一个tag");
            }
            q6rVar.f152935a = this.f152941a;
            q6rVar.f152936b = this.f152942b;
            q6rVar.f152937c = this.f152943c;
            q6rVar.f152938d = this.f152944d;
            q6rVar.f152939e = this.f152945e;
            q6rVar.f152940f = this.f152946f;
            return q6rVar;
        }

        /* JADX INFO: renamed from: b */
        public C19436a m173156b(int i) {
            this.f152943c = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C19436a m173157c(ltl ltlVar) {
            this.f152946f = ltlVar;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C19436a m173158d(int i) {
            this.f152944d = i;
            return this;
        }

        public C19436a(String str, int i) {
            this.f152943c = -1;
            this.f152944d = -1;
            this.f152945e = -1;
            this.f152941a = str;
            this.f152942b = i;
        }
    }
}
