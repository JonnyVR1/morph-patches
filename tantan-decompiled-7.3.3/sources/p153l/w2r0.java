package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.EnumC14893gk;
import com.xiaomi.push.service.C14985ah;
import com.xiaomi.push.service.XMPushService;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class w2r0 implements XMPushService.InterfaceC14970n {

    /* JADX INFO: renamed from: d */
    private static boolean f186924d = false;

    /* JADX INFO: renamed from: a */
    private Context f186925a;

    /* JADX INFO: renamed from: b */
    private boolean f186926b;

    /* JADX INFO: renamed from: c */
    private int f186927c;

    public w2r0(Context context) {
        this.f186925a = context;
    }

    /* JADX INFO: renamed from: b */
    private void m204582b(Context context) {
        this.f186926b = C14985ah.m87648a(context).m87660a(EnumC14893gk.TinyDataUploadSwitch.m86817a(), true);
        int iM87652a = C14985ah.m87648a(context).m87652a(EnumC14893gk.TinyDataUploadFrequency.m86817a(), 7200);
        this.f186927c = iM87652a;
        this.f186927c = Math.max(60, iM87652a);
    }

    /* JADX INFO: renamed from: c */
    public static void m204583c(boolean z) {
        f186924d = z;
    }

    /* JADX INFO: renamed from: d */
    private boolean m204584d() {
        return Math.abs((System.currentTimeMillis() / 1000) - this.f186925a.getSharedPreferences(MiPushClient.PREF_EXTRA, 4).getLong("last_tiny_data_upload_timestamp", -1L)) > ((long) this.f186927c);
    }

    /* JADX INFO: renamed from: e */
    private boolean m204585e(a3r0 a3r0Var) {
        if (!mtq0.m160044t(this.f186925a) || a3r0Var == null || TextUtils.isEmpty(m204581a(this.f186925a.getPackageName())) || !new File(this.f186925a.getFilesDir(), "tiny_data.data").exists() || f186924d) {
            return false;
        }
        return !C14985ah.m87648a(this.f186925a).m87660a(EnumC14893gk.ScreenOnOrChargingTinyDataUploadSwitch.m86817a(), false) || u3r0.m194403k(this.f186925a) || u3r0.m194409q(this.f186925a);
    }

    @Override // com.xiaomi.push.service.XMPushService.InterfaceC14970n
    /* JADX INFO: renamed from: a */
    public void mo87537a() {
        m204582b(this.f186925a);
        if (this.f186926b && m204584d()) {
            ouq0.m169393m("TinyData TinyDataCacheProcessor.pingFollowUpAction ts:" + System.currentTimeMillis());
            a3r0 a3r0VarM218458c = z2r0.m218456b(this.f186925a).m218458c();
            if (m204585e(a3r0VarM218458c)) {
                f186924d = true;
                x2r0.m209172b(this.f186925a, a3r0VarM218458c);
            } else {
                ouq0.m169393m("TinyData TinyDataCacheProcessor.pingFollowUpAction !canUpload(uploader) ts:" + System.currentTimeMillis());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private String m204581a(String str) {
        if ("com.xiaomi.xmsf".equals(str)) {
            return "1000271";
        }
        return this.f186925a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }
}
