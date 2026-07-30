package p153l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.immomo.mmdns.DNSManager;
import com.immomo.mmdns.IMDDNSConfig;

/* JADX INFO: loaded from: classes7.dex */
public class l3d0 {

    /* JADX INFO: renamed from: a */
    public static long f129859a = -1;

    /* JADX INFO: renamed from: b */
    public static volatile String f129860b = null;

    /* JADX INFO: renamed from: c */
    public static volatile String f129861c = "";

    /* JADX INFO: renamed from: d */
    private static volatile boolean f129862d = false;

    /* JADX INFO: renamed from: e */
    public static volatile String f129863e = null;

    /* JADX INFO: renamed from: f */
    public static volatile int f129864f = 0;

    /* JADX INFO: renamed from: g */
    public static Context f129865g = null;

    /* JADX INFO: renamed from: h */
    public static boolean f129866h = false;

    /* JADX INFO: renamed from: i */
    public static String f129867i;

    /* JADX INFO: renamed from: l.l3d0$a */
    public static class RunnableC18338a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f129868a;

        public RunnableC18338a(Context context) {
            this.f129868a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            l3d0.m152691e(this.f129868a);
        }
    }

    /* JADX INFO: renamed from: l.l3d0$b */
    public class C18339b extends IMDDNSConfig {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f129869a;

        public C18339b(Context context) {
            this.f129869a = context;
        }

        @Override // com.immomo.mmdns.IMDDNSConfig
        public String getAppId() {
            return "8701b0b5e66f551562c78781b1dc66c3";
        }

        @Override // com.immomo.mmdns.IMDDNSConfig
        public String getDefaultLocalDNSConfigs() {
            return "{\"data\":{\"ldns_ttl\":300,\"g_forece_update_inter\":1,\"retry\":1,\"ap_fails\":2,\"cdn_fails\":3,\"mas\":{\"last_number\":[\"5\"]},\"clean_current_available_address\":1,\"referee_update_interval\":86400,\"etag\":\"86cf85b88f6ded93237795a6ae5c99ec\",\"referee_fails\":1,\"dns\":[{\"domain\":\"httpdns.immomo.com\",\"ips\":{\"slaves\":[\"47.94.118.112\",\"47.95.130.252\",\"47.95.72.247\",\"47.95.130.249\"],\"master\":\"47.95.97.78\"}}],\"enable_new_referee\":true,\"em\":\"success\",\"ok\":\"true\",\"self_failed_count\":1,\"cna\":{\"start_u\":1,\"ignore_ratio\":{},\"backgroud_u\":1,\"intervals\":240,\"ratio\":60,\"total\":10000,\"last_numbers\":[\"3\",\"4\",\"5\",\"6\",\"9\"],\"lock_u\":1,\"last_did\":[\"d3\"]},\"version\":158,\"g_ttl\":900,\"failed_retry_loop\":2,\"idc_fails\":1,\"max_ct\":350,\"ttl\":300,\"self_failed_duration\":10,\"ec\":0,\"log_upload_interval\":3600},\"ec\":200,\"em\":\"sucessful\"}";
        }

        @Override // com.immomo.mmdns.IMDDNSConfig
        public String getKeyStoreSha1() {
            return "93:67:6F:25:2A:8D:88:1D:11:B6:67:C0:61:7D:62:B8:74:19:AE:17";
        }

        @Override // com.immomo.mmdns.IMDDNSConfig
        public String getLat() {
            return String.valueOf(nxv.m165284b(this.f129869a).m165285c().f144256a);
        }

        @Override // com.immomo.mmdns.IMDDNSConfig
        public String getLng() {
            return String.valueOf(nxv.m165284b(this.f129869a).m165285c().f144257b);
        }

        @Override // com.immomo.mmdns.IMDDNSConfig
        public String getNetworkType() {
            return vi20.m201318a();
        }

        @Override // com.immomo.mmdns.IMDDNSConfig
        public String getPreHosts() {
            return null;
        }

        @Override // com.immomo.mmdns.IMDDNSConfig
        public String getUid() {
            return "33043494";
        }

        @Override // com.immomo.mmdns.IMDDNSConfig
        public String getUserAgent() {
            return atd0.m100179e();
        }

        @Override // com.immomo.mmdns.IMDDNSConfig
        public String getVersion() {
            return "1001";
        }

        @Override // com.immomo.mmdns.IMDDNSConfig
        public boolean isNetworkAvailable() {
            return vi20.m201321d();
        }
    }

    private l3d0() {
    }

    /* JADX INFO: renamed from: b */
    public static String m152688b(String str) throws Exception {
        return yd00.m215184a(str);
    }

    /* JADX INFO: renamed from: c */
    public static String m152689c(String str) throws Exception {
        if (-1 != f129859a && dq80.m117493c("CVCENTER_MODEL_CONFIG_LAST_UPDATE", -1L) + f129859a > System.currentTimeMillis()) {
            String strM117494d = dq80.m117494d("CVCENTER_MODEL_CONFIG", "");
            if (!TextUtils.isEmpty(strM117494d)) {
                return strM117494d;
            }
        }
        String strM215184a = yd00.m215184a(str);
        if (-1 != f129859a) {
            dq80.m117496f("CVCENTER_MODEL_CONFIG_LAST_UPDATE", System.currentTimeMillis());
            dq80.m117497g("CVCENTER_MODEL_CONFIG", strM215184a);
            return strM215184a;
        }
        dq80.m117496f("CVCENTER_MODEL_CONFIG_LAST_UPDATE", -1L);
        dq80.m117497g("CVCENTER_MODEL_CONFIG", "");
        return strM215184a;
    }

    /* JADX INFO: renamed from: d */
    public static void m152690d(Context context, ysd0 ysd0Var) {
        f129865g = context.getApplicationContext();
        if (ysd0Var == null) {
            wg3.m206174a("SDKConfig should not be null");
            return;
        }
        f129867i = ysd0Var.mo160636d();
        f129860b = ysd0Var.mo160634b();
        f129861c = ysd0Var.mo160635c();
        f129864f = ysd0Var.m217239e();
        f129863e = ysd0Var.mo160637f();
        f129859a = ysd0Var.f201391a;
        if (ysd0Var.mo160638g()) {
            f129866h = true;
            if (Looper.getMainLooper() != Looper.myLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC18338a(context));
            } else {
                m152691e(context);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static synchronized void m152691e(Context context) {
        nxv.m165284b(context).m165285c();
        DNSManager.init(context, new C18339b(context));
        DNSManager.getInstance("8701b0b5e66f551562c78781b1dc66c3").openAll(true);
        f129862d = true;
    }
}
