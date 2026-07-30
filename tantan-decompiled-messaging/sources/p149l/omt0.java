package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.api.api.Network;

/* JADX INFO: loaded from: classes6.dex */
public final class omt0 {

    /* JADX INFO: renamed from: a */
    public final p3w0 f144688a;

    /* JADX INFO: renamed from: b */
    public final rnu0 f144689b;

    /* JADX INFO: renamed from: c */
    public final vxv0 f144690c;

    public omt0(rnu0 rnu0Var, vxv0 vxv0Var, p3w0 p3w0Var) {
        this.f144688a = p3w0Var;
        this.f144689b = rnu0Var;
        this.f144690c = vxv0Var;
    }

    /* JADX INFO: renamed from: b */
    public static String m165151b(int i) {
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
    public final void m165152a(long j, int i) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132483z8)).booleanValue()) {
            p3w0 p3w0Var = this.f144688a;
            vxv0 vxv0Var = this.f144690c;
            o3w0 o3w0VarM162489b = o3w0.m162489b("ad_closed");
            o3w0VarM162489b.m162495g(vxv0Var.f183478b.f178773b);
            o3w0VarM162489b.m162491a("show_time", String.valueOf(j));
            o3w0VarM162489b.m162491a(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
            o3w0VarM162489b.m162491a("acr", m165151b(i));
            p3w0Var.mo124429a(o3w0VarM162489b);
            return;
        }
        rnu0 rnu0Var = this.f144689b;
        vxv0 vxv0Var2 = this.f144690c;
        qnu0 qnu0VarM180208a = rnu0Var.m180208a();
        qnu0VarM180208a.m175696e(vxv0Var2.f183478b.f178773b);
        qnu0VarM180208a.m175693b("action", "ad_closed");
        qnu0VarM180208a.m175693b("show_time", String.valueOf(j));
        qnu0VarM180208a.m175693b(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        qnu0VarM180208a.m175693b("acr", m165151b(i));
        qnu0VarM180208a.m175698g();
    }
}
