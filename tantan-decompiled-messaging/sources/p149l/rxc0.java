package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.data.Explore;

/* JADX INFO: loaded from: classes9.dex */
public class rxc0 {

    /* JADX INFO: renamed from: a */
    public int f161418a;

    /* JADX INFO: renamed from: b */
    public int f161419b;

    /* JADX INFO: renamed from: c */
    public int f161420c;

    /* JADX INFO: renamed from: d */
    public int f161421d;

    /* JADX INFO: renamed from: e */
    public String f161422e;

    /* JADX INFO: renamed from: f */
    public String f161423f;

    /* JADX INFO: renamed from: g */
    public String f161424g;

    /* JADX INFO: renamed from: h */
    public boolean f161425h;

    /* JADX INFO: renamed from: i */
    public int f161426i;

    /* JADX INFO: renamed from: k */
    public String f161428k;

    /* JADX INFO: renamed from: m */
    public String f161430m;

    /* JADX INFO: renamed from: n */
    public String f161431n;

    /* JADX INFO: renamed from: j */
    public View f161427j = null;

    /* JADX INFO: renamed from: l */
    public Runnable f161429l = null;

    /* JADX INFO: renamed from: l.rxc0$a */
    public static class C19808a {

        /* JADX INFO: renamed from: a */
        public int f161432a;

        /* JADX INFO: renamed from: b */
        public int f161433b;

        /* JADX INFO: renamed from: c */
        public int f161434c;

        /* JADX INFO: renamed from: d */
        public int f161435d;

        /* JADX INFO: renamed from: e */
        public String f161436e;

        /* JADX INFO: renamed from: f */
        public String f161437f;

        /* JADX INFO: renamed from: g */
        public String f161438g;

        /* JADX INFO: renamed from: h */
        public boolean f161439h;

        /* JADX INFO: renamed from: i */
        public int f161440i;

        /* JADX INFO: renamed from: j */
        public String f161441j = "继续探索";

        /* JADX INFO: renamed from: k */
        public Runnable f161442k = null;

        /* JADX INFO: renamed from: l */
        public String f161443l = Explore.TYPE;

        /* JADX INFO: renamed from: m */
        public String f161444m = "pending";

        /* JADX INFO: renamed from: a */
        public rxc0 m181532a() {
            rxc0 rxc0Var = new rxc0();
            rxc0Var.f161418a = this.f161432a;
            rxc0Var.f161419b = this.f161433b;
            rxc0Var.f161420c = this.f161434c;
            rxc0Var.f161421d = this.f161435d;
            rxc0Var.f161423f = this.f161437f;
            rxc0Var.f161424g = this.f161438g;
            rxc0Var.f161425h = this.f161439h;
            rxc0Var.f161426i = this.f161440i;
            rxc0Var.f161428k = this.f161441j;
            rxc0Var.f161429l = this.f161442k;
            rxc0Var.f161430m = this.f161443l;
            rxc0Var.f161431n = this.f161444m;
            rxc0Var.f161422e = this.f161436e;
            return rxc0Var;
        }

        /* JADX INFO: renamed from: b */
        public C19808a m181533b(Runnable runnable) {
            this.f161442k = runnable;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C19808a m181534c(String str) {
            this.f161441j = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C19808a m181535d(int i) {
            this.f161434c = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C19808a m181536e(String str) {
            this.f161438g = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C19808a m181537f(String str, String str2) {
            this.f161443l = str;
            this.f161444m = str2;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C19808a m181538g(int i) {
            this.f161440i = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C19808a m181539h(boolean z) {
            this.f161439h = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C19808a m181540i(int i) {
            this.f161435d = i;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C19808a m181541j(String str) {
            this.f161436e = str;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C19808a m181542k(String str) {
            this.f161437f = str;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C19808a m181543l(int i) {
            this.f161433b = i;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C19808a m181544m(int i) {
            this.f161432a = i;
            return this;
        }
    }

    /* JADX INFO: renamed from: n */
    public Runnable m181519n() {
        return this.f161429l;
    }

    /* JADX INFO: renamed from: o */
    public String m181520o() {
        return this.f161428k;
    }

    /* JADX INFO: renamed from: p */
    public int m181521p() {
        return this.f161420c;
    }

    /* JADX INFO: renamed from: q */
    public String m181522q() {
        return this.f161430m;
    }

    /* JADX INFO: renamed from: r */
    public View m181523r(Context context) {
        if (this.f161426i <= 0) {
            return null;
        }
        View view = this.f161427j;
        if (view != null) {
            return view;
        }
        View viewInflate = LayoutInflater.from(context).inflate(this.f161426i, (ViewGroup) null);
        this.f161427j = viewInflate;
        return viewInflate;
    }

    /* JADX INFO: renamed from: s */
    public String m181524s() {
        return this.f161431n;
    }

    /* JADX INFO: renamed from: t */
    public String m181525t() {
        return this.f161424g;
    }

    /* JADX INFO: renamed from: u */
    public String m181526u() {
        return this.f161423f;
    }

    /* JADX INFO: renamed from: v */
    public int m181527v() {
        return this.f161421d;
    }

    /* JADX INFO: renamed from: w */
    public String m181528w() {
        return this.f161422e;
    }

    /* JADX INFO: renamed from: x */
    public int m181529x() {
        return this.f161419b;
    }

    /* JADX INFO: renamed from: y */
    public int m181530y() {
        return this.f161418a;
    }

    /* JADX INFO: renamed from: z */
    public boolean m181531z() {
        return this.f161425h;
    }
}
