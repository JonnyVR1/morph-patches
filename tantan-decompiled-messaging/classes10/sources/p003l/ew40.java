package p003l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import java.util.ArrayList;
import java.util.List;
import l.hpd0;
import l.mqi0;
import l.osi0;
import l.tpd0;
import l.xma;
import l.zpd0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ew40 {

    /* JADX INFO: renamed from: j */
    public static volatile ew40 f4350j;

    /* JADX INFO: renamed from: a */
    public final tpd0 f4351a = new tpd0("o_diamond_show_count_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: b */
    public final zpd0 f4352b = new zpd0("o_diamond_show_time_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public final zpd0 f4353c = new zpd0("o_diamond_privilege_tab_show_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public final hpd0 f4354d = new hpd0("visitor_entry_show_" + CoreModule.H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: e */
    public final zpd0 f4355e = new zpd0("visitor_entry_dot_show_time_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public final tpd0 f4356f = new tpd0("instant_chat_remaining_switcher_today_show_count_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: g */
    public final zpd0 f4357g = new zpd0("instant_chat_remaining_switcher_time_mills_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public final List<String> f4358h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public boolean f4359i;

    /* JADX INFO: renamed from: h */
    public static ew40 m6339h() {
        if (f4350j == null) {
            synchronized (ew40.class) {
                try {
                    if (f4350j == null) {
                        f4350j = new ew40();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4350j;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m6340j() {
        return CoreModule.P().a().f() && xma.F3();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m6341k() {
        String strF = RemoteConfig.x().F("new_visitor_show_animation_config");
        if (!TextUtils.isEmpty(strF)) {
            try {
                return new JSONObject(strF).optBoolean("new_visitor_of_visitor_tab_badge", false);
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static void m6342m() {
        f4350j = null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m6343a() {
        if (!m6340j() && !xma.N3()) {
            return false;
        }
        m6344b();
        int iM6350i = m6350i();
        return iM6350i > 0 && ((Integer) this.f4356f.get()).intValue() < iM6350i;
    }

    /* JADX INFO: renamed from: b */
    public final void m6344b() {
        if (mqi0.D(((Long) this.f4357g.get()).longValue())) {
            return;
        }
        this.f4356f.put(0);
    }

    /* JADX INFO: renamed from: c */
    public void m6345c() {
        this.f4356f.put(0);
        this.f4357g.put(0L);
        CoreModule.P().g().Va();
        osi0.g("已清除");
    }

    /* JADX INFO: renamed from: d */
    public void m6346d() {
        this.f4352b.put(0L);
        this.f4351a.put(0);
        this.f4353c.put(0L);
        this.f4354d.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: e */
    public void m6347e() {
        int iIntValue = ((Integer) this.f4356f.get()).intValue();
        Long l2 = (Long) this.f4357g.get();
        l2.longValue();
        osi0.g("今日一键配对配置最大展示次数：" + m6350i() + "\n今日一键配对已展示次数：" + iIntValue + "\n一键配对最近展示时间：" + mqi0.f.format(l2) + "\n");
    }

    /* JADX INFO: renamed from: f */
    public void m6348f() {
        this.f4354d.put(Boolean.valueOf(!((Boolean) this.f4354d.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: g */
    public boolean m6349g() {
        return this.f4359i;
    }

    /* JADX INFO: renamed from: i */
    public int m6350i() {
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public boolean m6351l() {
        return ((Boolean) this.f4354d.get()).booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public void m6352n(boolean z) {
        this.f4359i = z;
    }

    /* JADX INFO: renamed from: o */
    public void m6353o(long j) {
        this.f4355e.put(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: p */
    public void m6354p() {
        this.f4356f.a(1);
        this.f4357g.put(Long.valueOf(mqi0.o()));
    }
}
