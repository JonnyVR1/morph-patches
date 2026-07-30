package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class rxc0 {

    /* JADX INFO: renamed from: a */
    public int f20847a;

    /* JADX INFO: renamed from: b */
    public int f20848b;

    /* JADX INFO: renamed from: c */
    public int f20849c;

    /* JADX INFO: renamed from: d */
    public int f20850d;

    /* JADX INFO: renamed from: e */
    public String f20851e;

    /* JADX INFO: renamed from: f */
    public String f20852f;

    /* JADX INFO: renamed from: g */
    public String f20853g;

    /* JADX INFO: renamed from: h */
    public boolean f20854h;

    /* JADX INFO: renamed from: i */
    public int f20855i;

    /* JADX INFO: renamed from: k */
    public String f20857k;

    /* JADX INFO: renamed from: m */
    public String f20859m;

    /* JADX INFO: renamed from: n */
    public String f20860n;

    /* JADX INFO: renamed from: j */
    public View f20856j = null;

    /* JADX INFO: renamed from: l */
    public Runnable f20858l = null;

    /* JADX INFO: renamed from: l.rxc0$a */
    public static class C1242a {

        /* JADX INFO: renamed from: a */
        public int f20861a;

        /* JADX INFO: renamed from: b */
        public int f20862b;

        /* JADX INFO: renamed from: c */
        public int f20863c;

        /* JADX INFO: renamed from: d */
        public int f20864d;

        /* JADX INFO: renamed from: e */
        public String f20865e;

        /* JADX INFO: renamed from: f */
        public String f20866f;

        /* JADX INFO: renamed from: g */
        public String f20867g;

        /* JADX INFO: renamed from: h */
        public boolean f20868h;

        /* JADX INFO: renamed from: i */
        public int f20869i;

        /* JADX INFO: renamed from: j */
        public String f20870j = "继续探索";

        /* JADX INFO: renamed from: k */
        public Runnable f20871k = null;

        /* JADX INFO: renamed from: l */
        public String f20872l = "explore";

        /* JADX INFO: renamed from: m */
        public String f20873m = "pending";

        /* JADX INFO: renamed from: a */
        public rxc0 m23381a() {
            rxc0 rxc0Var = new rxc0();
            rxc0Var.f20847a = this.f20861a;
            rxc0Var.f20848b = this.f20862b;
            rxc0Var.f20849c = this.f20863c;
            rxc0Var.f20850d = this.f20864d;
            rxc0Var.f20852f = this.f20866f;
            rxc0Var.f20853g = this.f20867g;
            rxc0Var.f20854h = this.f20868h;
            rxc0Var.f20855i = this.f20869i;
            rxc0Var.f20857k = this.f20870j;
            rxc0Var.f20858l = this.f20871k;
            rxc0Var.f20859m = this.f20872l;
            rxc0Var.f20860n = this.f20873m;
            rxc0Var.f20851e = this.f20865e;
            return rxc0Var;
        }

        /* JADX INFO: renamed from: b */
        public C1242a m23382b(Runnable runnable) {
            this.f20871k = runnable;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C1242a m23383c(String str) {
            this.f20870j = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C1242a m23384d(int i) {
            this.f20863c = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C1242a m23385e(String str) {
            this.f20867g = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C1242a m23386f(String str, String str2) {
            this.f20872l = str;
            this.f20873m = str2;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C1242a m23387g(int i) {
            this.f20869i = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C1242a m23388h(boolean z) {
            this.f20868h = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C1242a m23389i(int i) {
            this.f20864d = i;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C1242a m23390j(String str) {
            this.f20865e = str;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C1242a m23391k(String str) {
            this.f20866f = str;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C1242a m23392l(int i) {
            this.f20862b = i;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C1242a m23393m(int i) {
            this.f20861a = i;
            return this;
        }
    }

    /* JADX INFO: renamed from: n */
    public Runnable m23368n() {
        return this.f20858l;
    }

    /* JADX INFO: renamed from: o */
    public String m23369o() {
        return this.f20857k;
    }

    /* JADX INFO: renamed from: p */
    public int m23370p() {
        return this.f20849c;
    }

    /* JADX INFO: renamed from: q */
    public String m23371q() {
        return this.f20859m;
    }

    /* JADX INFO: renamed from: r */
    public View m23372r(Context context) {
        if (this.f20855i <= 0) {
            return null;
        }
        View view = this.f20856j;
        if (view != null) {
            return view;
        }
        View viewInflate = LayoutInflater.from(context).inflate(this.f20855i, (ViewGroup) null);
        this.f20856j = viewInflate;
        return viewInflate;
    }

    /* JADX INFO: renamed from: s */
    public String m23373s() {
        return this.f20860n;
    }

    /* JADX INFO: renamed from: t */
    public String m23374t() {
        return this.f20853g;
    }

    /* JADX INFO: renamed from: u */
    public String m23375u() {
        return this.f20852f;
    }

    /* JADX INFO: renamed from: v */
    public int m23376v() {
        return this.f20850d;
    }

    /* JADX INFO: renamed from: w */
    public String m23377w() {
        return this.f20851e;
    }

    /* JADX INFO: renamed from: x */
    public int m23378x() {
        return this.f20848b;
    }

    /* JADX INFO: renamed from: y */
    public int m23379y() {
        return this.f20847a;
    }

    /* JADX INFO: renamed from: z */
    public boolean m23380z() {
        return this.f20854h;
    }
}
