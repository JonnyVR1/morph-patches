package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class e3i {

    /* JADX INFO: renamed from: c */
    public static final Long f91956c = 86400000L;

    /* JADX INFO: renamed from: d */
    public static byd0 f91957d;

    /* JADX INFO: renamed from: e */
    public static volatile e3i f91958e;

    /* JADX INFO: renamed from: a */
    public boolean f91959a = false;

    /* JADX INFO: renamed from: b */
    public int f91960b = 0;

    /* JADX INFO: renamed from: c */
    public static e3i m119288c() {
        if (f91958e == null) {
            synchronized (e3i.class) {
                try {
                    if (f91958e == null) {
                        f91958e = new e3i();
                        f91957d = new byd0("last_show_my_tab_state_post_tips_time_" + CoreModule.m30929H().userId(), 0L);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f91958e;
    }

    /* JADX INFO: renamed from: a */
    public boolean m119289a() {
        byd0 byd0Var = f91957d;
        if (byd0Var == null) {
            return false;
        }
        long jLongValue = byd0Var.get().longValue();
        return jLongValue <= 0 || pzi0.m174454o() - jLongValue > ((long) m119291d()) * f91956c.longValue();
    }

    /* JADX INFO: renamed from: b */
    public boolean m119290b() {
        return m119292e() >= 3;
    }

    /* JADX INFO: renamed from: d */
    public final int m119291d() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("state_publish_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return 1;
            }
            return new JSONObject(strM80485F).optInt("navigation_view_bubbleshowtimes");
        } catch (Exception unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: e */
    public int m119292e() {
        return this.f91960b;
    }

    /* JADX INFO: renamed from: f */
    public void m119293f() {
        int i = this.f91960b;
        this.f91960b = i < 100 ? i + 1 : 100;
    }

    /* JADX INFO: renamed from: g */
    public void m119294g() {
        f91958e = null;
        this.f91960b = 0;
    }

    /* JADX INFO: renamed from: h */
    public void m119295h() {
        byd0 byd0Var = f91957d;
        if (byd0Var != null) {
            byd0Var.put(Long.valueOf(pzi0.m174454o()));
        }
    }
}
