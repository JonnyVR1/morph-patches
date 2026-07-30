package p153l;

import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes9.dex */
public class i7d0 {

    /* JADX INFO: renamed from: g */
    public static i7d0 f113252g;

    /* JADX INFO: renamed from: a */
    public jxd0 f113253a;

    /* JADX INFO: renamed from: b */
    public jxd0 f113254b;

    /* JADX INFO: renamed from: c */
    public byd0 f113255c;

    /* JADX INFO: renamed from: d */
    public jxd0 f113256d;

    /* JADX INFO: renamed from: e */
    public jxd0 f113257e;

    /* JADX INFO: renamed from: f */
    public jxd0 f113258f;

    public i7d0() {
        String str = "rev_target_user_defined_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f113253a = new jxd0(str, bool);
        this.f113254b = new jxd0("rev_target_user_flag_" + CoreModule.m30929H().userId(), bool);
        this.f113255c = new byd0("rev_user_first_start_app_time" + CoreModule.m30929H().userId(), 0L);
        this.f113256d = new jxd0("has_shown_vip_expired_alert_24h" + CoreModule.m30929H().userId(), bool);
        this.f113257e = new jxd0("has_shown_vip_expired_alert_48h" + CoreModule.m30929H().userId(), bool);
        this.f113258f = new jxd0("has_show_vip_expired_alert" + CoreModule.m30929H().userId(), bool);
    }

    /* JADX INFO: renamed from: b */
    public static i7d0 m138926b() {
        if (f113252g == null) {
            synchronized (i7d0.class) {
                try {
                    if (f113252g == null) {
                        f113252g = new i7d0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f113252g;
    }

    /* JADX INFO: renamed from: c */
    public static void m138927c() {
        f113252g = null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m138928a() {
        return this.f113256d.get().booleanValue() || this.f113257e.get().booleanValue() || this.f113258f.get().booleanValue();
    }
}
