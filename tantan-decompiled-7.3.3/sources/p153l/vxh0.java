package p153l;

import com.immomo.mmdns.IMDDNSConfig;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;

/* JADX INFO: loaded from: classes9.dex */
public class vxh0 extends IMDDNSConfig {

    /* JADX INFO: renamed from: b */
    public static String f186261b = "7d619d2a0cc234d97768aecf533d7aa9";

    /* JADX INFO: renamed from: a */
    public String f186262a;

    public vxh0(String str) {
        this.f186262a = str;
    }

    @Override // com.immomo.mmdns.IMDDNSConfig
    public String getAppId() {
        return f186261b;
    }

    @Override // com.immomo.mmdns.IMDDNSConfig
    public String getDefaultLocalDNSConfigs() {
        return "{\"data\":{\"ldns_ttl\":300,\"g_forece_update_inter\":1,\"retry\":1,\"log_upload_inter\":3600,\"cdn_fails\":3,\"mas\":{\"last_number\":[\"5\"]},\"clean_current_available_address\":1,\"ttl\":300,\"referee_fails\":1,\"dns\":[{\"domain\":\"httpdns.immomo.com\",\"ips\":{\"slaves\":[\"47.84.89.117\",\"47.93.180.18\",\"60.205.191.69\",\"47.93.19.216\",],\"master\":\"47.84.65.220\"}}],\"enable_new_referee\":true,\"self_failed_duration\":10,\"ec\":0,\"ap_fails\":2,\"cna\":{\"start_u\":1,\"ignore_ratio\":[],\"backgroud_u\":1,\"intervals\":240,\"ratio\":60,\"total\":10000,\"last_numbers\":[\"3\",\"4\",\"5\",\"6\",\"9\"],\"lock_u\":1,\"last_did\":[\"d3\"]},\"version\":158,\"em\":\"success\",\"idc_fails\":1,\"max_ct\":350,\"failed_retry_loop\":2,\"referee_update_interval\":86400,\"self_failed_count\":1,\"ok\":\"true\",\"g_ttl\":900},\"ec\":200,\"em\":\"sucessful\"}";
    }

    @Override // com.immomo.mmdns.IMDDNSConfig
    public String getKeyStoreSha1() {
        return "71:5B:AB:0F:36:33:95:FE:34:D1:87:68:4B:0E:F7:71:A9:D4:00:F0";
    }

    @Override // com.immomo.mmdns.IMDDNSConfig
    public String getLat() {
        return "";
    }

    @Override // com.immomo.mmdns.IMDDNSConfig
    public String getLng() {
        return "";
    }

    @Override // com.immomo.mmdns.IMDDNSConfig
    public String getNetworkType() {
        return ui20.m196134b();
    }

    @Override // com.immomo.mmdns.IMDDNSConfig
    public String getPreHosts() {
        return this.f186262a;
    }

    @Override // com.immomo.mmdns.IMDDNSConfig
    public String getUid() {
        bn5 bn5Var = uqb0.f180397c0;
        return bn5Var != null ? bn5Var.userId() : "";
    }

    @Override // com.immomo.mmdns.IMDDNSConfig
    public String getUserAgent() {
        return Network.getUA();
    }

    @Override // com.immomo.mmdns.IMDDNSConfig
    public String getVersion() {
        return wx0.m208361a(App.f16088e);
    }

    @Override // com.immomo.mmdns.IMDDNSConfig
    public boolean isNetworkAvailable() {
        return ui20.m196136d();
    }
}
