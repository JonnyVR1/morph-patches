package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class bkg {

    /* JADX INFO: renamed from: a */
    public final int f77067a;

    /* JADX INFO: renamed from: b */
    public final uoe0 f77068b;

    /* JADX INFO: renamed from: c */
    public final String f77069c;

    /* JADX INFO: renamed from: d */
    public final String f77070d;

    /* JADX INFO: renamed from: e */
    public final x20 f77071e;

    /* JADX INFO: renamed from: l.bkg$a */
    public static class C16028a {

        /* JADX INFO: renamed from: a */
        public int f77072a;

        /* JADX INFO: renamed from: b */
        public uoe0 f77073b;

        /* JADX INFO: renamed from: c */
        public String f77074c;

        /* JADX INFO: renamed from: d */
        public String f77075d;

        /* JADX INFO: renamed from: e */
        public x20 f77076e;

        /* JADX INFO: renamed from: e */
        public bkg m104803e() {
            return new bkg(this);
        }

        /* JADX INFO: renamed from: f */
        public C16028a m104804f(x20 x20Var) {
            this.f77076e = x20Var;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C16028a m104805g(int i) {
            this.f77072a = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C16028a m104806h(uoe0 uoe0Var) {
            this.f77073b = uoe0Var;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C16028a m104807i(String str) {
            this.f77075d = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C16028a m104808j(String str) {
            this.f77074c = str;
            return this;
        }
    }

    public bkg(C16028a c16028a) {
        this.f77067a = c16028a.f77072a;
        this.f77068b = c16028a.f77073b;
        this.f77069c = c16028a.f77074c;
        this.f77070d = c16028a.f77075d;
        this.f77071e = c16028a.f77076e;
    }

    /* JADX INFO: renamed from: a */
    public boolean m104798a() {
        return TextUtils.equals(this.f77070d, "js");
    }
}
