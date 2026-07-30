package p149l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.immomo.mmdns.DNSManager;
import com.immomo.mmdns.IMDDNSConfig;

/* JADX INFO: loaded from: classes7.dex */
public class ivc0 {

    /* JADX INFO: renamed from: a */
    public static long f115112a = -1;

    /* JADX INFO: renamed from: b */
    public static volatile String f115113b = null;

    /* JADX INFO: renamed from: c */
    public static volatile String f115114c = "";

    /* JADX INFO: renamed from: d */
    private static volatile boolean f115115d = false;

    /* JADX INFO: renamed from: e */
    public static volatile String f115116e = null;

    /* JADX INFO: renamed from: f */
    public static volatile int f115117f = 0;

    /* JADX INFO: renamed from: g */
    public static Context f115118g = null;

    /* JADX INFO: renamed from: h */
    public static boolean f115119h = false;

    /* JADX INFO: renamed from: i */
    public static String f115120i;

    /* JADX INFO: renamed from: l.ivc0$a */
    public static class RunnableC17623a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f115121a;

        public RunnableC17623a(Context context) {
            this.f115121a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            ivc0.m138544e(this.f115121a);
        }
    }

    /* JADX INFO: renamed from: l.ivc0$b */
    public class C17624b extends IMDDNSConfig {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f115122a;

        public C17624b(Context context) {
            this.f115122a = context;
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
            return String.valueOf(mvv.m156604b(this.f115122a).m156605c().f135999a);
        }

        @Override // com.immomo.mmdns.IMDDNSConfig
        public String getLng() {
            return String.valueOf(mvv.m156604b(this.f115122a).m156605c().f136000b);
        }

        @Override // com.immomo.mmdns.IMDDNSConfig
        public String getNetworkType() {
            return ma20.m153629a();
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
            return xkd0.m209772e();
        }

        @Override // com.immomo.mmdns.IMDDNSConfig
        public String getVersion() {
            return "1001";
        }

        @Override // com.immomo.mmdns.IMDDNSConfig
        public boolean isNetworkAvailable() {
            return ma20.m153632d();
        }
    }

    private ivc0() {
    }

    /* JADX INFO: renamed from: b */
    public static String m138541b(String str) throws Exception {
        return k500.m144518a(str);
    }

    /* JADX INFO: renamed from: c */
    public static String m138542c(String str) throws Exception {
        if (-1 != f115112a && yh80.m214791c("CVCENTER_MODEL_CONFIG_LAST_UPDATE", -1L) + f115112a > System.currentTimeMillis()) {
            String strM214792d = yh80.m214792d("CVCENTER_MODEL_CONFIG", "");
            if (!TextUtils.isEmpty(strM214792d)) {
                return strM214792d;
            }
        }
        String strM144518a = k500.m144518a(str);
        if (-1 != f115112a) {
            yh80.m214794f("CVCENTER_MODEL_CONFIG_LAST_UPDATE", System.currentTimeMillis());
            yh80.m214795g("CVCENTER_MODEL_CONFIG", strM144518a);
            return strM144518a;
        }
        yh80.m214794f("CVCENTER_MODEL_CONFIG_LAST_UPDATE", -1L);
        yh80.m214795g("CVCENTER_MODEL_CONFIG", "");
        return strM144518a;
    }

    /* JADX INFO: renamed from: d */
    public static void m138543d(Context context, vkd0 vkd0Var) {
        f115118g = context.getApplicationContext();
        if (vkd0Var == null) {
            ig3.m135964a("SDKConfig should not be null");
            return;
        }
        f115120i = vkd0Var.mo161785d();
        f115113b = vkd0Var.mo161783b();
        f115114c = vkd0Var.mo161784c();
        f115117f = vkd0Var.m198718e();
        f115116e = vkd0Var.mo161786f();
        f115112a = vkd0Var.f181780a;
        if (vkd0Var.mo161787g()) {
            f115119h = true;
            if (Looper.getMainLooper() != Looper.myLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC17623a(context));
            } else {
                m138544e(context);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static synchronized void m138544e(Context context) {
        mvv.m156604b(context).m156605c();
        DNSManager.init(context, new C17624b(context));
        DNSManager.getInstance("8701b0b5e66f551562c78781b1dc66c3").openAll(true);
        f115115d = true;
    }
}
