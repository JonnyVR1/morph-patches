package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.data.Explore;

/* JADX INFO: loaded from: classes12.dex */
public class u5d0 {

    /* JADX INFO: renamed from: a */
    public int f177603a;

    /* JADX INFO: renamed from: b */
    public int f177604b;

    /* JADX INFO: renamed from: c */
    public int f177605c;

    /* JADX INFO: renamed from: d */
    public int f177606d;

    /* JADX INFO: renamed from: e */
    public String f177607e;

    /* JADX INFO: renamed from: f */
    public String f177608f;

    /* JADX INFO: renamed from: g */
    public String f177609g;

    /* JADX INFO: renamed from: h */
    public boolean f177610h;

    /* JADX INFO: renamed from: i */
    public int f177611i;

    /* JADX INFO: renamed from: k */
    public String f177613k;

    /* JADX INFO: renamed from: m */
    public String f177615m;

    /* JADX INFO: renamed from: n */
    public String f177616n;

    /* JADX INFO: renamed from: j */
    public View f177612j = null;

    /* JADX INFO: renamed from: l */
    public Runnable f177614l = null;

    /* JADX INFO: renamed from: l.u5d0$a */
    public static class C20488a {

        /* JADX INFO: renamed from: a */
        public int f177617a;

        /* JADX INFO: renamed from: b */
        public int f177618b;

        /* JADX INFO: renamed from: c */
        public int f177619c;

        /* JADX INFO: renamed from: d */
        public int f177620d;

        /* JADX INFO: renamed from: e */
        public String f177621e;

        /* JADX INFO: renamed from: f */
        public String f177622f;

        /* JADX INFO: renamed from: g */
        public String f177623g;

        /* JADX INFO: renamed from: h */
        public boolean f177624h;

        /* JADX INFO: renamed from: i */
        public int f177625i;

        /* JADX INFO: renamed from: j */
        public String f177626j = "继续探索";

        /* JADX INFO: renamed from: k */
        public Runnable f177627k = null;

        /* JADX INFO: renamed from: l */
        public String f177628l = Explore.TYPE;

        /* JADX INFO: renamed from: m */
        public String f177629m = "pending";

        /* JADX INFO: renamed from: a */
        public u5d0 m194571a() {
            u5d0 u5d0Var = new u5d0();
            u5d0Var.f177603a = this.f177617a;
            u5d0Var.f177604b = this.f177618b;
            u5d0Var.f177605c = this.f177619c;
            u5d0Var.f177606d = this.f177620d;
            u5d0Var.f177608f = this.f177622f;
            u5d0Var.f177609g = this.f177623g;
            u5d0Var.f177610h = this.f177624h;
            u5d0Var.f177611i = this.f177625i;
            u5d0Var.f177613k = this.f177626j;
            u5d0Var.f177614l = this.f177627k;
            u5d0Var.f177615m = this.f177628l;
            u5d0Var.f177616n = this.f177629m;
            u5d0Var.f177607e = this.f177621e;
            return u5d0Var;
        }

        /* JADX INFO: renamed from: b */
        public C20488a m194572b(Runnable runnable) {
            this.f177627k = runnable;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C20488a m194573c(String str) {
            this.f177626j = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C20488a m194574d(int i) {
            this.f177619c = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C20488a m194575e(String str) {
            this.f177623g = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C20488a m194576f(String str, String str2) {
            this.f177628l = str;
            this.f177629m = str2;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C20488a m194577g(int i) {
            this.f177625i = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C20488a m194578h(boolean z) {
            this.f177624h = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C20488a m194579i(int i) {
            this.f177620d = i;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C20488a m194580j(String str) {
            this.f177621e = str;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C20488a m194581k(String str) {
            this.f177622f = str;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C20488a m194582l(int i) {
            this.f177618b = i;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C20488a m194583m(int i) {
            this.f177617a = i;
            return this;
        }
    }

    /* JADX INFO: renamed from: n */
    public Runnable m194558n() {
        return this.f177614l;
    }

    /* JADX INFO: renamed from: o */
    public String m194559o() {
        return this.f177613k;
    }

    /* JADX INFO: renamed from: p */
    public int m194560p() {
        return this.f177605c;
    }

    /* JADX INFO: renamed from: q */
    public String m194561q() {
        return this.f177615m;
    }

    /* JADX INFO: renamed from: r */
    public View m194562r(Context context) {
        if (this.f177611i <= 0) {
            return null;
        }
        View view = this.f177612j;
        if (view != null) {
            return view;
        }
        View viewInflate = LayoutInflater.from(context).inflate(this.f177611i, (ViewGroup) null);
        this.f177612j = viewInflate;
        return viewInflate;
    }

    /* JADX INFO: renamed from: s */
    public String m194563s() {
        return this.f177616n;
    }

    /* JADX INFO: renamed from: t */
    public String m194564t() {
        return this.f177609g;
    }

    /* JADX INFO: renamed from: u */
    public String m194565u() {
        return this.f177608f;
    }

    /* JADX INFO: renamed from: v */
    public int m194566v() {
        return this.f177606d;
    }

    /* JADX INFO: renamed from: w */
    public String m194567w() {
        return this.f177607e;
    }

    /* JADX INFO: renamed from: x */
    public int m194568x() {
        return this.f177604b;
    }

    /* JADX INFO: renamed from: y */
    public int m194569y() {
        return this.f177603a;
    }

    /* JADX INFO: renamed from: z */
    public boolean m194570z() {
        return this.f177610h;
    }
}
