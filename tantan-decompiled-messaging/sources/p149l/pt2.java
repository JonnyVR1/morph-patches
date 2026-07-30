package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.ApmConfigSetting;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.beatles.fpsmonitor.FpsMonitor;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class pt2 {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f151105a;

    /* JADX INFO: renamed from: b */
    public static final Set<String> f151106b;

    /* JADX INFO: renamed from: c */
    public static trb f151107c;

    /* JADX INFO: renamed from: d */
    public static bhy f151108d;

    /* JADX INFO: renamed from: e */
    public static FpsMonitor f151109e;

    /* JADX INFO: renamed from: f */
    public static ApmConfigSetting f151110f;

    static {
        HashSet hashSet = new HashSet();
        f151105a = hashSet;
        HashSet hashSet2 = new HashSet();
        f151106b = hashSet2;
        hashSet.add("p_suggest_users_home_view");
        hashSet.add("p_moments_view");
        hashSet.add(OMSDialogPositon.p_nearby);
        hashSet.add("p_follow");
        hashSet.add("p_recommend");
        hashSet2.addAll(hashSet);
        hashSet2.add("p_user_live_room");
        hashSet2.add(OMSDialogPositon.p_messages_view);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m171267a() {
        ApmConfigSetting apmConfigSettingM171269c = m171269c();
        f151110f = apmConfigSettingM171269c;
        if (apmConfigSettingM171269c.enableCpuReport) {
            trb trbVar = new trb(new orb.C19005a().m165541b(true).m165542c(f151110f.cpuModuleInterval).m165544e(f151110f.cpuModuleStartDelay).m165543d(f151110f.cpuSamplingMaxTimes).m165540a());
            f151107c = trbVar;
            nt2.m160811b(trbVar);
        }
        if (f151110f.enableMemoryReport) {
            bhy bhyVar = new bhy(new ugy.C20425a().m193601b(true).m193602c(f151110f.memoryModuleInterval).m193604e(f151110f.memoryModuleStartDelay).m193603d(f151110f.memorySamplingMaxTimes).m193600a());
            f151108d = bhyVar;
            nt2.m160811b(bhyVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m171268b() {
        return "360store".equals(mr4.f135329a) || "baidu".equals(mr4.f135329a) || "ppzhushou".equals(mr4.f135329a) || "organic".equals(mr4.f135329a) || "meizu".equals(mr4.f135329a) || "qq".equals(mr4.f135329a) || "qq_32".equals(mr4.f135329a) || "qq_64".equals(mr4.f135329a);
    }

    /* JADX INFO: renamed from: c */
    public static ApmConfigSetting m171269c() {
        ApmConfigSetting apmConfigSettingNew_ = ApmConfigSetting.new_();
        f151110f = apmConfigSettingNew_;
        apmConfigSettingNew_.cpuModuleStartDelay = 3000L;
        apmConfigSettingNew_.cpuModuleInterval = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
        apmConfigSettingNew_.memoryModuleStartDelay = 3000L;
        apmConfigSettingNew_.memoryModuleInterval = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
        String strM79302F = RemoteConfig.m79298x().m79302F("beatles_apm_config");
        if (!TextUtils.isEmpty(strM79302F)) {
            try {
                ApmConfigSetting apmConfigSetting = ApmConfigSetting.JSON_ADAPTER.parse(strM79302F);
                f151110f = apmConfigSetting;
                apmConfigSetting.cpuModuleStartDelay = Math.max(1000L, apmConfigSetting.cpuModuleStartDelay);
                ApmConfigSetting apmConfigSetting2 = f151110f;
                apmConfigSetting2.cpuModuleInterval = Math.max(2000L, apmConfigSetting2.cpuModuleInterval);
                ApmConfigSetting apmConfigSetting3 = f151110f;
                apmConfigSetting3.memoryModuleStartDelay = Math.max(2000L, apmConfigSetting3.memoryModuleStartDelay);
                ApmConfigSetting apmConfigSetting4 = f151110f;
                apmConfigSetting4.memoryModuleInterval = Math.max(3000L, apmConfigSetting4.memoryModuleInterval);
            } catch (IOException unused) {
                f151110f.configName = "default";
            }
        }
        return f151110f;
    }

    /* JADX INFO: renamed from: d */
    public static trb m171270d() {
        return f151107c;
    }

    /* JADX INFO: renamed from: e */
    public static bhy m171271e() {
        return f151108d;
    }

    /* JADX INFO: renamed from: f */
    public static ApmConfigSetting m171272f() {
        return f151110f;
    }

    /* JADX INFO: renamed from: g */
    public static void m171273g() {
        FpsMonitor fpsMonitorM81131x = FpsMonitor.m81131x();
        f151109e = fpsMonitorM81131x;
        nt2.m160811b(fpsMonitorM81131x);
        if (m171268b()) {
            e51.m114774y(new Runnable() { // from class: l.ot2
                @Override // java.lang.Runnable
                public final void run() {
                    pt2.m171267a();
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m171274h(String str) {
        if (f151105a.contains(str)) {
            p1j.m167069c(str);
        }
        if (f151107c != null && f151106b.contains(str)) {
            vrb.m199653c(str);
        }
        if (f151108d == null || !f151106b.contains(str)) {
            return;
        }
        ehy.m116611c(str);
    }

    /* JADX INFO: renamed from: i */
    public static void m171275i(String str) {
        if (f151105a.contains(str)) {
            p1j.m167071e(str);
        }
        if (f151107c != null && f151106b.contains(str)) {
            vrb.m199655e(str);
        }
        if (f151108d == null || !f151106b.contains(str)) {
            return;
        }
        ehy.m116614f(str);
    }

    /* JADX INFO: renamed from: j */
    public static void m171276j() {
        try {
            for (String str : RemoteConfig.m79298x().m79302F("apm_report_pids").split(Constants.SEPARATOR_COMMA)) {
                f151106b.add(str);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
