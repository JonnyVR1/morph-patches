package p149l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ew40 {

    /* JADX INFO: renamed from: j */
    public static volatile ew40 f93429j;

    /* JADX INFO: renamed from: a */
    public final tpd0 f93430a = new tpd0("o_diamond_show_count_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: b */
    public final zpd0 f93431b = new zpd0("o_diamond_show_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public final zpd0 f93432c = new zpd0("o_diamond_privilege_tab_show_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public final hpd0 f93433d = new hpd0("visitor_entry_show_" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: e */
    public final zpd0 f93434e = new zpd0("visitor_entry_dot_show_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public final tpd0 f93435f = new tpd0("instant_chat_remaining_switcher_today_show_count_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: g */
    public final zpd0 f93436g = new zpd0("instant_chat_remaining_switcher_time_mills_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public final List<String> f93437h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public boolean f93438i;

    /* JADX INFO: renamed from: h */
    public static ew40 m118397h() {
        if (f93429j == null) {
            synchronized (ew40.class) {
                try {
                    if (f93429j == null) {
                        f93429j = new ew40();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f93429j;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m118398j() {
        return CoreModule.m29935P().m94651a().mo158371f() && xma.m210043F3();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m118399k() {
        String strM79302F = RemoteConfig.m79298x().m79302F("new_visitor_show_animation_config");
        if (!TextUtils.isEmpty(strM79302F)) {
            try {
                return new JSONObject(strM79302F).optBoolean("new_visitor_of_visitor_tab_badge", false);
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static void m118400m() {
        f93429j = null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m118401a() {
        if (!m118398j() && !xma.m210049N3()) {
            return false;
        }
        m118402b();
        int iM118408i = m118408i();
        return iM118408i > 0 && this.f93435f.get().intValue() < iM118408i;
    }

    /* JADX INFO: renamed from: b */
    public final void m118402b() {
        if (mqi0.m155929D(this.f93436g.get().longValue())) {
            return;
        }
        this.f93435f.put(0);
    }

    /* JADX INFO: renamed from: c */
    public void m118403c() {
        this.f93435f.put(0);
        this.f93436g.put(0L);
        CoreModule.m29935P().m94656g().mo35034Va();
        osi0.m165783g("已清除");
    }

    /* JADX INFO: renamed from: d */
    public void m118404d() {
        this.f93431b.put(0L);
        this.f93430a.put(0);
        this.f93432c.put(0L);
        this.f93433d.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: e */
    public void m118405e() {
        int iIntValue = this.f93435f.get().intValue();
        Long l2 = this.f93436g.get();
        l2.longValue();
        osi0.m165783g("今日一键配对配置最大展示次数：" + m118408i() + "\n今日一键配对已展示次数：" + iIntValue + "\n一键配对最近展示时间：" + mqi0.f135254f.format(l2) + SignParameters.NEW_LINE);
    }

    /* JADX INFO: renamed from: f */
    public void m118406f() {
        this.f93433d.put(Boolean.valueOf(!this.f93433d.get().booleanValue()));
    }

    /* JADX INFO: renamed from: g */
    public boolean m118407g() {
        return this.f93438i;
    }

    /* JADX INFO: renamed from: i */
    public int m118408i() {
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public boolean m118409l() {
        return this.f93433d.get().booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public void m118410n(boolean z) {
        this.f93438i = z;
    }

    /* JADX INFO: renamed from: o */
    public void m118411o(long j) {
        this.f93434e.put(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: p */
    public void m118412p() {
        this.f93435f.m189988a(1);
        this.f93436g.put(Long.valueOf(mqi0.m155944o()));
    }
}
