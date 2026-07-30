package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.api.api.Network;

/* JADX INFO: loaded from: classes6.dex */
public final class uvt0 {

    /* JADX INFO: renamed from: a */
    public final vcw0 f181168a;

    /* JADX INFO: renamed from: b */
    public final xwu0 f181169b;

    /* JADX INFO: renamed from: c */
    public final b7w0 f181170c;

    public uvt0(xwu0 xwu0Var, b7w0 b7w0Var, vcw0 vcw0Var) {
        this.f181168a = vcw0Var;
        this.f181169b = xwu0Var;
        this.f181170c = b7w0Var;
    }

    /* JADX INFO: renamed from: b */
    public static String m198307b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return "h";
        }
        if (i2 == 1) {
            return "bb";
        }
        if (i2 == 2) {
            return "cc";
        }
        if (i2 != 3) {
            return i2 != 4 ? "u" : Network.AUTH_CORE;
        }
        return "cb";
    }

    /* JADX INFO: renamed from: a */
    public final void m198308a(long j, int i) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168554z8)).booleanValue()) {
            vcw0 vcw0Var = this.f181168a;
            b7w0 b7w0Var = this.f181170c;
            ucw0 ucw0VarM195443b = ucw0.m195443b("ad_closed");
            ucw0VarM195443b.m195449g(b7w0Var.f75343b.f68854b);
            ucw0VarM195443b.m195445a("show_time", String.valueOf(j));
            ucw0VarM195443b.m195445a(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
            ucw0VarM195443b.m195445a("acr", m198307b(i));
            vcw0Var.mo125151a(ucw0VarM195443b);
            return;
        }
        xwu0 xwu0Var = this.f181169b;
        b7w0 b7w0Var2 = this.f181170c;
        wwu0 wwu0VarM213443a = xwu0Var.m213443a();
        wwu0VarM213443a.m208310e(b7w0Var2.f75343b.f68854b);
        wwu0VarM213443a.m208307b("action", "ad_closed");
        wwu0VarM213443a.m208307b("show_time", String.valueOf(j));
        wwu0VarM213443a.m208307b(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        wwu0VarM213443a.m208307b("acr", m198307b(i));
        wwu0VarM213443a.m208312g();
    }
}
