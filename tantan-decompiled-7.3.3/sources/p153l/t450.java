package p153l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class t450 {

    /* JADX INFO: renamed from: j */
    public static volatile t450 f172005j;

    /* JADX INFO: renamed from: a */
    public final vxd0 f172006a = new vxd0("o_diamond_show_count_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: b */
    public final byd0 f172007b = new byd0("o_diamond_show_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public final byd0 f172008c = new byd0("o_diamond_privilege_tab_show_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public final jxd0 f172009d = new jxd0("visitor_entry_show_" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: e */
    public final byd0 f172010e = new byd0("visitor_entry_dot_show_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public final vxd0 f172011f = new vxd0("instant_chat_remaining_switcher_today_show_count_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: g */
    public final byd0 f172012g = new byd0("instant_chat_remaining_switcher_time_mills_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public final List<String> f172013h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public boolean f172014i;

    /* JADX INFO: renamed from: h */
    public static t450 m189174h() {
        if (f172005j == null) {
            synchronized (t450.class) {
                try {
                    if (f172005j == null) {
                        f172005j = new t450();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f172005j;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m189175j() {
        return CoreModule.m30933P().m143405a().mo180463f() && joa.m146357G3();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m189176k() {
        String strM80485F = RemoteConfig.m80481x().m80485F("new_visitor_show_animation_config");
        if (!TextUtils.isEmpty(strM80485F)) {
            try {
                return new JSONObject(strM80485F).optBoolean("new_visitor_of_visitor_tab_badge", false);
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static void m189177m() {
        f172005j = null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m189178a() {
        if (!m189175j() && !joa.m146363O3()) {
            return false;
        }
        m189179b();
        int iM189185i = m189185i();
        return iM189185i > 0 && this.f172011f.get().intValue() < iM189185i;
    }

    /* JADX INFO: renamed from: b */
    public final void m189179b() {
        if (pzi0.m174439D(this.f172012g.get().longValue())) {
            return;
        }
        this.f172011f.put(0);
    }

    /* JADX INFO: renamed from: c */
    public void m189180c() {
        this.f172011f.put(0);
        this.f172012g.put(0L);
        CoreModule.m30933P().m143410g().mo36037Va();
        r1j0.m179420g("已清除");
    }

    /* JADX INFO: renamed from: d */
    public void m189181d() {
        this.f172007b.put(0L);
        this.f172006a.put(0);
        this.f172008c.put(0L);
        this.f172009d.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: e */
    public void m189182e() {
        int iIntValue = this.f172011f.get().intValue();
        Long l2 = this.f172012g.get();
        l2.longValue();
        r1j0.m179420g("今日一键配对配置最大展示次数：" + m189185i() + "\n今日一键配对已展示次数：" + iIntValue + "\n一键配对最近展示时间：" + pzi0.f154859f.format(l2) + SignParameters.NEW_LINE);
    }

    /* JADX INFO: renamed from: f */
    public void m189183f() {
        this.f172009d.put(Boolean.valueOf(!this.f172009d.get().booleanValue()));
    }

    /* JADX INFO: renamed from: g */
    public boolean m189184g() {
        return this.f172014i;
    }

    /* JADX INFO: renamed from: i */
    public int m189185i() {
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public boolean m189186l() {
        return this.f172009d.get().booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public void m189187n(boolean z) {
        this.f172014i = z;
    }

    /* JADX INFO: renamed from: o */
    public void m189188o(long j) {
        this.f172010e.put(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: p */
    public void m189189p() {
        this.f172011f.m203841a(1);
        this.f172012g.put(Long.valueOf(pzi0.m174454o()));
    }
}
