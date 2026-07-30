package com.cosmos.photon.push.dns;

import android.os.Build;
import com.cosmos.photon.push.referee.Referee;
import com.cosmos.photon.push.util.AppContext;
import com.cosmos.photon.push.util.DeviceUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.meituan.robust.Constants;
import java.util.Locale;
import p153l.zrl;

/* JADX INFO: loaded from: classes.dex */
public class PushDNSConfig extends zrl {
    private static String userAgent() {
        StringBuffer stringBuffer = new StringBuffer("CosmosPush/1.0 Android/1 (");
        stringBuffer.append(DeviceUtils.getModle() + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append("Android " + Build.VERSION.RELEASE + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append("Gapps " + (AppContext.hasGoogleMap() ? 1 : 0) + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append(Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry() + Constants.PACKNAME_END);
        stringBuffer.append(" 1; ");
        stringBuffer.append(DeviceUtils.getManufacturer());
        stringBuffer.append(")");
        try {
            return new String(stringBuffer.toString().getBytes(), "UTF-8");
        } catch (Exception unused) {
            return stringBuffer.toString();
        }
    }

    @Override // p153l.zrl
    public String getAppId() {
        return Referee.APP_ID;
    }

    @Override // p153l.zrl
    public String getDefaultLocalDNSConfigs() {
        return "{\"data\":{\"ldns_ttl\":300,\"g_forece_update_inter\":1,\"retry\":1,\"log_upload_inter\":3600,\"cdn_fails\":3,\"mas\":{\"last_number\":[\"5\"]},\"clean_current_available_address\":1,\"ttl\":300,\"etag\":\"1db8337a364b231b9c8c0a2911af9b21\",\"referee_fails\":1,\"dns\":[{\"domain\":\"httpdns.immomo.com\",\"ips\":{\"slaves\":[\"47.94.118.112\",\"47.95.130.252\",\"47.95.72.247\",\"47.95.130.249\"],\"master\":\"47.95.97.78\"}}],\"enable_new_referee\":true,\"self_failed_duration\":10,\"ec\":0,\"ap_fails\":2,\"cna\":{\"start_u\":1,\"ignore_ratio\":[],\"backgroud_u\":1,\"intervals\":240,\"ratio\":60,\"total\":10000,\"last_numbers\":[\"3\",\"4\",\"5\",\"6\",\"9\"],\"lock_u\":1,\"last_did\":[\"d3\"]},\"version\":158,\"em\":\"success\",\"idc_fails\":1,\"max_ct\":350,\"failed_retry_loop\":2,\"referee_update_interval\":86400,\"self_failed_count\":1,\"ok\":\"true\",\"g_ttl\":900},\"ec\":200,\"em\":\"sucessful\"}";
    }

    @Override // p153l.zrl
    public String getKeyStoreSha1() {
        return "93:88:6F:25:2A:8D:88:1D:11:B6:88:C0:61:7D:62:B8:74:19:AE:17";
    }

    @Override // p153l.zrl
    public String getPreHost() {
        return "paas-push-api.immomo.com";
    }

    @Override // p153l.zrl
    public String getUserAgent() {
        return userAgent();
    }
}
