package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.ApmConfigSetting;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.beatles.fpsmonitor.FpsMonitor;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class fu2 {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f100870a;

    /* JADX INFO: renamed from: b */
    public static final Set<String> f100871b;

    /* JADX INFO: renamed from: c */
    public static htb f100872c;

    /* JADX INFO: renamed from: d */
    public static ypy f100873d;

    /* JADX INFO: renamed from: e */
    public static FpsMonitor f100874e;

    /* JADX INFO: renamed from: f */
    public static ApmConfigSetting f100875f;

    static {
        HashSet hashSet = new HashSet();
        f100870a = hashSet;
        HashSet hashSet2 = new HashSet();
        f100871b = hashSet2;
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
    public static /* synthetic */ void m127423a() {
        ApmConfigSetting apmConfigSettingM127425c = m127425c();
        f100875f = apmConfigSettingM127425c;
        if (apmConfigSettingM127425c.enableCpuReport) {
            htb htbVar = new htb(new ctb.C16358a().m112460b(true).m112461c(f100875f.cpuModuleInterval).m112463e(f100875f.cpuModuleStartDelay).m112462d(f100875f.cpuSamplingMaxTimes).m112459a());
            f100872c = htbVar;
            du2.m118042b(htbVar);
        }
        if (f100875f.enableMemoryReport) {
            ypy ypyVar = new ypy(new rpy.C19896a().m182566b(true).m182567c(f100875f.memoryModuleInterval).m182569e(f100875f.memoryModuleStartDelay).m182568d(f100875f.memorySamplingMaxTimes).m182565a());
            f100873d = ypyVar;
            du2.m118042b(ypyVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m127424b() {
        return "360store".equals(ls4.f133389a) || "baidu".equals(ls4.f133389a) || "ppzhushou".equals(ls4.f133389a) || "organic".equals(ls4.f133389a) || "meizu".equals(ls4.f133389a) || "qq".equals(ls4.f133389a) || "qq_32".equals(ls4.f133389a) || "qq_64".equals(ls4.f133389a);
    }

    /* JADX INFO: renamed from: c */
    public static ApmConfigSetting m127425c() {
        ApmConfigSetting apmConfigSettingNew_ = ApmConfigSetting.new_();
        f100875f = apmConfigSettingNew_;
        apmConfigSettingNew_.cpuModuleStartDelay = 3000L;
        apmConfigSettingNew_.cpuModuleInterval = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
        apmConfigSettingNew_.memoryModuleStartDelay = 3000L;
        apmConfigSettingNew_.memoryModuleInterval = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
        String strM80485F = RemoteConfig.m80481x().m80485F("beatles_apm_config");
        if (!TextUtils.isEmpty(strM80485F)) {
            try {
                ApmConfigSetting apmConfigSetting = ApmConfigSetting.JSON_ADAPTER.parse(strM80485F);
                f100875f = apmConfigSetting;
                apmConfigSetting.cpuModuleStartDelay = Math.max(1000L, apmConfigSetting.cpuModuleStartDelay);
                ApmConfigSetting apmConfigSetting2 = f100875f;
                apmConfigSetting2.cpuModuleInterval = Math.max(2000L, apmConfigSetting2.cpuModuleInterval);
                ApmConfigSetting apmConfigSetting3 = f100875f;
                apmConfigSetting3.memoryModuleStartDelay = Math.max(2000L, apmConfigSetting3.memoryModuleStartDelay);
                ApmConfigSetting apmConfigSetting4 = f100875f;
                apmConfigSetting4.memoryModuleInterval = Math.max(3000L, apmConfigSetting4.memoryModuleInterval);
            } catch (IOException unused) {
                f100875f.configName = "default";
            }
        }
        return f100875f;
    }

    /* JADX INFO: renamed from: d */
    public static htb m127426d() {
        return f100872c;
    }

    /* JADX INFO: renamed from: e */
    public static ypy m127427e() {
        return f100873d;
    }

    /* JADX INFO: renamed from: f */
    public static ApmConfigSetting m127428f() {
        return f100875f;
    }

    /* JADX INFO: renamed from: g */
    public static void m127429g() {
        FpsMonitor fpsMonitorM82314x = FpsMonitor.m82314x();
        f100874e = fpsMonitorM82314x;
        du2.m118042b(fpsMonitorM82314x);
        if (m127424b()) {
            l51.m152919y(new Runnable() { // from class: l.eu2
                @Override // java.lang.Runnable
                public final void run() {
                    fu2.m127423a();
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m127430h(String str) {
        if (f100870a.contains(str)) {
            k4j.m148247c(str);
        }
        if (f100872c != null && f100871b.contains(str)) {
            jtb.m146897c(str);
        }
        if (f100873d == null || !f100871b.contains(str)) {
            return;
        }
        bqy.m106019c(str);
    }

    /* JADX INFO: renamed from: i */
    public static void m127431i(String str) {
        if (f100870a.contains(str)) {
            k4j.m148249e(str);
        }
        if (f100872c != null && f100871b.contains(str)) {
            jtb.m146899e(str);
        }
        if (f100873d == null || !f100871b.contains(str)) {
            return;
        }
        bqy.m106022f(str);
    }

    /* JADX INFO: renamed from: j */
    public static void m127432j() {
        try {
            for (String str : RemoteConfig.m80481x().m80485F("apm_report_pids").split(Constants.SEPARATOR_COMMA)) {
                f100871b.add(str);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
