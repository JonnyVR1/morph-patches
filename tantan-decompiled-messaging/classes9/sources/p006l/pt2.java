package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p1.mobile.putong.data.ApmConfigSetting;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.beatles.fpsmonitor.FpsMonitor;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import l.bhy;
import l.e51;
import l.ifi0;
import l.nt2;
import l.orb;
import l.trb;
import l.ugy;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class pt2 {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f19290a;

    /* JADX INFO: renamed from: b */
    public static final Set<String> f19291b;

    /* JADX INFO: renamed from: c */
    public static trb f19292c;

    /* JADX INFO: renamed from: d */
    public static bhy f19293d;

    /* JADX INFO: renamed from: e */
    public static FpsMonitor f19294e;

    /* JADX INFO: renamed from: f */
    public static ApmConfigSetting f19295f;

    static {
        HashSet hashSet = new HashSet();
        f19290a = hashSet;
        HashSet hashSet2 = new HashSet();
        f19291b = hashSet2;
        hashSet.add("p_suggest_users_home_view");
        hashSet.add("p_moments_view");
        hashSet.add("p_nearby");
        hashSet.add("p_follow");
        hashSet.add("p_recommend");
        hashSet2.addAll(hashSet);
        hashSet2.add("p_user_live_room");
        hashSet2.add("p_messages_view");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m21675a() {
        ApmConfigSetting apmConfigSettingM21677c = m21677c();
        f19295f = apmConfigSettingM21677c;
        if (apmConfigSettingM21677c.enableCpuReport) {
            ifi0 trbVar = new trb(new orb.a().b(true).c(f19295f.cpuModuleInterval).e(f19295f.cpuModuleStartDelay).d(f19295f.cpuSamplingMaxTimes).a());
            f19292c = trbVar;
            nt2.b(new ifi0[]{trbVar});
        }
        if (f19295f.enableMemoryReport) {
            ifi0 bhyVar = new bhy(new ugy.a().b(true).c(f19295f.memoryModuleInterval).e(f19295f.memoryModuleStartDelay).d(f19295f.memorySamplingMaxTimes).a());
            f19293d = bhyVar;
            nt2.b(new ifi0[]{bhyVar});
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m21676b() {
        return "360store".equals(mr4.f17192a) || "baidu".equals(mr4.f17192a) || "ppzhushou".equals(mr4.f17192a) || "organic".equals(mr4.f17192a) || "meizu".equals(mr4.f17192a) || "qq".equals(mr4.f17192a) || "qq_32".equals(mr4.f17192a) || "qq_64".equals(mr4.f17192a);
    }

    /* JADX INFO: renamed from: c */
    public static ApmConfigSetting m21677c() {
        ApmConfigSetting apmConfigSettingNew_ = ApmConfigSetting.new_();
        f19295f = apmConfigSettingNew_;
        apmConfigSettingNew_.cpuModuleStartDelay = 3000L;
        apmConfigSettingNew_.cpuModuleInterval = 5000L;
        apmConfigSettingNew_.memoryModuleStartDelay = 3000L;
        apmConfigSettingNew_.memoryModuleInterval = 5000L;
        String strF = RemoteConfig.x().F("beatles_apm_config");
        if (!TextUtils.isEmpty(strF)) {
            try {
                ApmConfigSetting apmConfigSetting = (ApmConfigSetting) ApmConfigSetting.JSON_ADAPTER.parse(strF);
                f19295f = apmConfigSetting;
                apmConfigSetting.cpuModuleStartDelay = Math.max(1000L, apmConfigSetting.cpuModuleStartDelay);
                ApmConfigSetting apmConfigSetting2 = f19295f;
                apmConfigSetting2.cpuModuleInterval = Math.max(2000L, apmConfigSetting2.cpuModuleInterval);
                ApmConfigSetting apmConfigSetting3 = f19295f;
                apmConfigSetting3.memoryModuleStartDelay = Math.max(2000L, apmConfigSetting3.memoryModuleStartDelay);
                ApmConfigSetting apmConfigSetting4 = f19295f;
                apmConfigSetting4.memoryModuleInterval = Math.max(3000L, apmConfigSetting4.memoryModuleInterval);
            } catch (IOException unused) {
                f19295f.configName = CameraSticker.CATEGORY_DEFAULT_FILTER;
            }
        }
        return f19295f;
    }

    /* JADX INFO: renamed from: d */
    public static trb m21678d() {
        return f19292c;
    }

    /* JADX INFO: renamed from: e */
    public static bhy m21679e() {
        return f19293d;
    }

    /* JADX INFO: renamed from: f */
    public static ApmConfigSetting m21680f() {
        return f19295f;
    }

    /* JADX INFO: renamed from: g */
    public static void m21681g() {
        ifi0 ifi0VarX = FpsMonitor.x();
        f19294e = ifi0VarX;
        nt2.b(new ifi0[]{ifi0VarX});
        if (m21676b()) {
            e51.y(new Runnable() { // from class: l.ot2
                @Override // java.lang.Runnable
                public final void run() {
                    pt2.m21675a();
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m21682h(String str) {
        if (f19290a.contains(str)) {
            p1j.m21009c(str);
        }
        if (f19292c != null && f19291b.contains(str)) {
            vrb.m25857c(str);
        }
        if (f19293d == null || !f19291b.contains(str)) {
            return;
        }
        ehy.m14544c(str);
    }

    /* JADX INFO: renamed from: i */
    public static void m21683i(String str) {
        if (f19290a.contains(str)) {
            p1j.m21011e(str);
        }
        if (f19292c != null && f19291b.contains(str)) {
            vrb.m25859e(str);
        }
        if (f19293d == null || !f19291b.contains(str)) {
            return;
        }
        ehy.m14547f(str);
    }

    /* JADX INFO: renamed from: j */
    public static void m21684j() {
        try {
            for (String str : RemoteConfig.x().F("apm_report_pids").split(",")) {
                f19291b.add(str);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
