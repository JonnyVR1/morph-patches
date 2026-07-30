package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.eclipse.jetty.http.HttpMethods;

/* JADX INFO: loaded from: classes6.dex */
public final class muv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final boolean f138850a;

    /* JADX INFO: renamed from: b */
    public final boolean f138851b;

    /* JADX INFO: renamed from: c */
    public final String f138852c;

    /* JADX INFO: renamed from: d */
    public final boolean f138853d;

    /* JADX INFO: renamed from: e */
    public final int f138854e;

    /* JADX INFO: renamed from: f */
    public final int f138855f;

    /* JADX INFO: renamed from: g */
    public final int f138856g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f138857h;

    public muv0(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3, @Nullable String str2) {
        this.f138850a = z;
        this.f138851b = z2;
        this.f138852c = str;
        this.f138853d = z3;
        this.f138854e = i;
        this.f138855f = i2;
        this.f138856g = i3;
        this.f138857h = str2;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f138852c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) jas0.m144075c().m176505a(sgs0.f167931B3));
        bundle.putInt("target_api", this.f138854e);
        bundle.putInt("dv", this.f138855f);
        bundle.putInt("lv", this.f138856g);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168173V5)).booleanValue() && !TextUtils.isEmpty(this.f138857h)) {
            bundle.putString("ev", this.f138857h);
        }
        Bundle bundleM103038a = b8w0.m103038a(bundle, "sdk_env");
        bundleM103038a.putBoolean("mf", ((Boolean) hjs0.f110317a.m149974e()).booleanValue());
        bundleM103038a.putBoolean("instant_app", this.f138850a);
        bundleM103038a.putBoolean("lite", this.f138851b);
        bundleM103038a.putBoolean("is_privileged_process", this.f138853d);
        bundle.putBundle("sdk_env", bundleM103038a);
        Bundle bundleM103038a2 = b8w0.m103038a(bundleM103038a, "build_meta");
        bundleM103038a2.putString("cl", "610756093");
        bundleM103038a2.putString("rapid_rc", "dev");
        bundleM103038a2.putString("rapid_rollup", HttpMethods.HEAD);
        bundleM103038a.putBundle("build_meta", bundleM103038a2);
    }
}
