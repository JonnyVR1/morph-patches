package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.core.CoreModule;
import l.zpd0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class p1i {

    /* JADX INFO: renamed from: c */
    public static final Long f18317c = 86400000L;

    /* JADX INFO: renamed from: d */
    public static zpd0 f18318d;

    /* JADX INFO: renamed from: e */
    public static volatile p1i f18319e;

    /* JADX INFO: renamed from: a */
    public boolean f18320a = false;

    /* JADX INFO: renamed from: b */
    public int f18321b = 0;

    /* JADX INFO: renamed from: c */
    public static p1i m20075c() {
        if (f18319e == null) {
            synchronized (p1i.class) {
                try {
                    if (f18319e == null) {
                        f18319e = new p1i();
                        f18318d = new zpd0("last_show_my_tab_state_post_tips_time_" + CoreModule.H().userId(), 0L);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18319e;
    }

    /* JADX INFO: renamed from: a */
    public boolean m20076a() {
        zpd0 zpd0Var = f18318d;
        if (zpd0Var == null) {
            return false;
        }
        long jLongValue = ((Long) zpd0Var.get()).longValue();
        return jLongValue <= 0 || mqi0.m18550o() - jLongValue > ((long) m20078d()) * f18317c.longValue();
    }

    /* JADX INFO: renamed from: b */
    public boolean m20077b() {
        return m20079e() >= 3;
    }

    /* JADX INFO: renamed from: d */
    public final int m20078d() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("state_publish_config");
            if (TextUtils.isEmpty(strM9623F)) {
                return 1;
            }
            return new JSONObject(strM9623F).optInt("navigation_view_bubbleshowtimes");
        } catch (Exception unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: e */
    public int m20079e() {
        return this.f18321b;
    }

    /* JADX INFO: renamed from: f */
    public void m20080f() {
        int i = this.f18321b;
        this.f18321b = i < 100 ? i + 1 : 100;
    }

    /* JADX INFO: renamed from: g */
    public void m20081g() {
        f18319e = null;
        this.f18321b = 0;
    }

    /* JADX INFO: renamed from: h */
    public void m20082h() {
        zpd0 zpd0Var = f18318d;
        if (zpd0Var != null) {
            zpd0Var.put(Long.valueOf(mqi0.m18550o()));
        }
    }
}
