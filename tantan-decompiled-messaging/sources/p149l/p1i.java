package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class p1i {

    /* JADX INFO: renamed from: c */
    public static final Long f146677c = 86400000L;

    /* JADX INFO: renamed from: d */
    public static zpd0 f146678d;

    /* JADX INFO: renamed from: e */
    public static volatile p1i f146679e;

    /* JADX INFO: renamed from: a */
    public boolean f146680a = false;

    /* JADX INFO: renamed from: b */
    public int f146681b = 0;

    /* JADX INFO: renamed from: c */
    public static p1i m167059c() {
        if (f146679e == null) {
            synchronized (p1i.class) {
                try {
                    if (f146679e == null) {
                        f146679e = new p1i();
                        f146678d = new zpd0("last_show_my_tab_state_post_tips_time_" + CoreModule.m29931H().userId(), 0L);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f146679e;
    }

    /* JADX INFO: renamed from: a */
    public boolean m167060a() {
        zpd0 zpd0Var = f146678d;
        if (zpd0Var == null) {
            return false;
        }
        long jLongValue = zpd0Var.get().longValue();
        return jLongValue <= 0 || mqi0.m155944o() - jLongValue > ((long) m167062d()) * f146677c.longValue();
    }

    /* JADX INFO: renamed from: b */
    public boolean m167061b() {
        return m167063e() >= 3;
    }

    /* JADX INFO: renamed from: d */
    public final int m167062d() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("state_publish_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return 1;
            }
            return new JSONObject(strM79302F).optInt("navigation_view_bubbleshowtimes");
        } catch (Exception unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: e */
    public int m167063e() {
        return this.f146681b;
    }

    /* JADX INFO: renamed from: f */
    public void m167064f() {
        int i = this.f146681b;
        this.f146681b = i < 100 ? i + 1 : 100;
    }

    /* JADX INFO: renamed from: g */
    public void m167065g() {
        f146679e = null;
        this.f146681b = 0;
    }

    /* JADX INFO: renamed from: h */
    public void m167066h() {
        zpd0 zpd0Var = f146678d;
        if (zpd0Var != null) {
            zpd0Var.put(Long.valueOf(mqi0.m155944o()));
        }
    }
}
