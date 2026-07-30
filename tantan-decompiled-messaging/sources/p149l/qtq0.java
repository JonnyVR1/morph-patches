package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.EnumC14745gk;
import com.xiaomi.push.service.C14837ah;
import com.xiaomi.push.service.XMPushService;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class qtq0 implements XMPushService.InterfaceC14822n {

    /* JADX INFO: renamed from: d */
    private static boolean f156377d = false;

    /* JADX INFO: renamed from: a */
    private Context f156378a;

    /* JADX INFO: renamed from: b */
    private boolean f156379b;

    /* JADX INFO: renamed from: c */
    private int f156380c;

    public qtq0(Context context) {
        this.f156378a = context;
    }

    /* JADX INFO: renamed from: b */
    private void m176473b(Context context) {
        this.f156379b = C14837ah.m86477a(context).m86489a(EnumC14745gk.TinyDataUploadSwitch.m85646a(), true);
        int iM86481a = C14837ah.m86477a(context).m86481a(EnumC14745gk.TinyDataUploadFrequency.m85646a(), 7200);
        this.f156380c = iM86481a;
        this.f156380c = Math.max(60, iM86481a);
    }

    /* JADX INFO: renamed from: c */
    public static void m176474c(boolean z) {
        f156377d = z;
    }

    /* JADX INFO: renamed from: d */
    private boolean m176475d() {
        return Math.abs((System.currentTimeMillis() / 1000) - this.f156378a.getSharedPreferences(MiPushClient.PREF_EXTRA, 4).getLong("last_tiny_data_upload_timestamp", -1L)) > ((long) this.f156380c);
    }

    /* JADX INFO: renamed from: e */
    private boolean m176476e(utq0 utq0Var) {
        if (!gkq0.m126691t(this.f156378a) || utq0Var == null || TextUtils.isEmpty(m176472a(this.f156378a.getPackageName())) || !new File(this.f156378a.getFilesDir(), "tiny_data.data").exists() || f156377d) {
            return false;
        }
        return !C14837ah.m86477a(this.f156378a).m86489a(EnumC14745gk.ScreenOnOrChargingTinyDataUploadSwitch.m85646a(), false) || ouq0.m166102k(this.f156378a) || ouq0.m166108q(this.f156378a);
    }

    @Override // com.xiaomi.push.service.XMPushService.InterfaceC14822n
    /* JADX INFO: renamed from: a */
    public void mo86366a() {
        m176473b(this.f156378a);
        if (this.f156379b && m176475d()) {
            ilq0.m137040m("TinyData TinyDataCacheProcessor.pingFollowUpAction ts:" + System.currentTimeMillis());
            utq0 utq0VarM190618c = ttq0.m190616b(this.f156378a).m190618c();
            if (m176476e(utq0VarM190618c)) {
                f156377d = true;
                rtq0.m180829b(this.f156378a, utq0VarM190618c);
            } else {
                ilq0.m137040m("TinyData TinyDataCacheProcessor.pingFollowUpAction !canUpload(uploader) ts:" + System.currentTimeMillis());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private String m176472a(String str) {
        if ("com.xiaomi.xmsf".equals(str)) {
            return "1000271";
        }
        return this.f156378a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }
}
