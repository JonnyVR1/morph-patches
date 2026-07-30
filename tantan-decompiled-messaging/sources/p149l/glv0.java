package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.eclipse.jetty.http.HttpMethods;

/* JADX INFO: loaded from: classes6.dex */
public final class glv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final boolean f103405a;

    /* JADX INFO: renamed from: b */
    public final boolean f103406b;

    /* JADX INFO: renamed from: c */
    public final String f103407c;

    /* JADX INFO: renamed from: d */
    public final boolean f103408d;

    /* JADX INFO: renamed from: e */
    public final int f103409e;

    /* JADX INFO: renamed from: f */
    public final int f103410f;

    /* JADX INFO: renamed from: g */
    public final int f103411g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f103412h;

    public glv0(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3, @Nullable String str2) {
        this.f103405a = z;
        this.f103406b = z2;
        this.f103407c = str;
        this.f103408d = z3;
        this.f103409e = i;
        this.f103410f = i2;
        this.f103411g = i3;
        this.f103412h = str2;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f103407c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) d1s0.m109677c().m144697a(m7s0.f131860B3));
        bundle.putInt("target_api", this.f103409e);
        bundle.putInt("dv", this.f103410f);
        bundle.putInt("lv", this.f103411g);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132102V5)).booleanValue() && !TextUtils.isEmpty(this.f103412h)) {
            bundle.putString("ev", this.f103412h);
        }
        Bundle bundleM200674a = vyv0.m200674a(bundle, "sdk_env");
        bundleM200674a.putBoolean("mf", ((Boolean) bas0.f74716a.m115379e()).booleanValue());
        bundleM200674a.putBoolean("instant_app", this.f103405a);
        bundleM200674a.putBoolean("lite", this.f103406b);
        bundleM200674a.putBoolean("is_privileged_process", this.f103408d);
        bundle.putBundle("sdk_env", bundleM200674a);
        Bundle bundleM200674a2 = vyv0.m200674a(bundleM200674a, "build_meta");
        bundleM200674a2.putString("cl", "610756093");
        bundleM200674a2.putString("rapid_rc", "dev");
        bundleM200674a2.putString("rapid_rollup", HttpMethods.HEAD);
        bundleM200674a.putBundle("build_meta", bundleM200674a2);
    }
}
