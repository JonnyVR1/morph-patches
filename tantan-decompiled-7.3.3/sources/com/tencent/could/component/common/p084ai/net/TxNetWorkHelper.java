package com.tencent.could.component.common.p084ai.net;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.tencent.cloud.p080ai.network.helper.AiOkHttpHelper;
import com.tencent.cloud.p080ai.network.helper.NetworkLogger;
import com.tencent.cloud.p080ai.network.helper.NetworkLoggerCallBack;
import com.tencent.could.component.common.p084ai.eventreport.api.EventReportConfig;
import com.tencent.could.component.common.p084ai.utils.ThreadPoolUtil;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class TxNetWorkHelper {

    /* JADX INFO: renamed from: a */
    public volatile Map<String, DnsCacheInfo> f58167a;

    /* JADX INFO: renamed from: c */
    public NetWorkLoggerCallBack f58169c;

    /* JADX INFO: renamed from: d */
    public LOG_LEVEL f58170d = LOG_LEVEL.LEVEL_VERBOSE;

    /* JADX INFO: renamed from: b */
    public volatile Set<String> f58168b = new HashSet();

    /* JADX INFO: renamed from: com.tencent.could.component.common.ai.net.TxNetWorkHelper$3 */
    public static /* synthetic */ class C140293 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f58176a;

        static {
            int[] iArr = new int[LOG_LEVEL.values().length];
            f58176a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58176a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58176a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58176a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58176a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58176a[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum LOG_LEVEL {
        LEVEL_VERBOSE,
        LEVEL_DEBUG,
        LEVEL_INFO,
        LEVEL_WARN,
        LEVEL_ERROR,
        LEVEL_NONE
    }

    public static final class TxNetWorkHelperHolder {

        /* JADX INFO: renamed from: a */
        public static final TxNetWorkHelper f58178a = new TxNetWorkHelper();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m83391a(TxNetWorkHelper txNetWorkHelper, Context context, String str) {
        DnsCacheInfo dnsCacheInfo;
        if (txNetWorkHelper.f58167a == null || (dnsCacheInfo = txNetWorkHelper.f58167a.get(str)) == null) {
            try {
                long j = context != null ? context.getSharedPreferences("txy_comoon_share_data", 0).getLong(str + "_time", 0L) : 0L;
                if (System.currentTimeMillis() - j > 86400000) {
                    getInstance().logError("TxNetWorkHelper", "isHostNameIpTimeOut is timeout");
                    return true;
                }
                String string = context == null ? EventReportConfig.STRING_INIT : context.getSharedPreferences("txy_comoon_share_data", 0).getString(str, EventReportConfig.STRING_INIT);
                if (!TextUtils.isEmpty(string)) {
                    if (txNetWorkHelper.f58167a == null) {
                        txNetWorkHelper.f58167a = new HashMap();
                    }
                    txNetWorkHelper.f58167a.put(str, new DnsCacheInfo(str, string, j));
                }
            } catch (Exception e) {
                getInstance().logError("TxNetWorkHelper", "isHostNameIpTimeOut e: " + e.getLocalizedMessage());
                return true;
            }
        } else if (System.currentTimeMillis() - dnsCacheInfo.getRefreshTime() > 86400000) {
            getInstance().logError("TxNetWorkHelper", "isHostNameIpTimeOut is timeout in cache");
            return true;
        }
        return false;
    }

    public static TxNetWorkHelper getInstance() {
        return TxNetWorkHelperHolder.f58178a;
    }

    public void checkHostName(final Context context, final String str, final boolean z) {
        ThreadPoolUtil.getInstance().addWork(new Runnable() { // from class: com.tencent.could.component.common.ai.net.TxNetWorkHelper.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (TxNetWorkHelper.m83391a(TxNetWorkHelper.this, context, str) || z) {
                        if (!TxNetWorkHelper.this.f58168b.contains(str)) {
                            TxNetWorkHelper.this.f58168b.add(str);
                        }
                        DnsResolver dnsResolver = new DnsResolver(str);
                        Thread thread = new Thread(dnsResolver);
                        thread.start();
                        thread.join(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                        if (TxNetWorkHelper.this.f58168b.contains(str)) {
                            TxNetWorkHelper.this.f58168b.remove(str);
                        }
                        InetAddress hasAddress = dnsResolver.getHasAddress();
                        TxNetWorkHelper txNetWorkHelper = TxNetWorkHelper.this;
                        if (hasAddress == null) {
                            TxNetWorkHelper.m83390a(txNetWorkHelper, context, str, "", 0L);
                        } else {
                            TxNetWorkHelper.m83390a(txNetWorkHelper, context, str, hasAddress.getHostAddress(), System.currentTimeMillis());
                        }
                    }
                } catch (Exception e) {
                    TxNetWorkHelper.this.logError("TxNetWorkHelper", "checkHostName, error: " + e.getLocalizedMessage());
                }
            }
        });
    }

    public String getHostNameCurrentIp(Context context, String str) {
        DnsCacheInfo dnsCacheInfo;
        if (this.f58167a != null && (dnsCacheInfo = this.f58167a.get(str)) != null && System.currentTimeMillis() - dnsCacheInfo.getRefreshTime() < 86400000) {
            getInstance().logError("TxNetWorkHelper", "get hostName use cache: " + dnsCacheInfo.getIp());
            return dnsCacheInfo.getIp();
        }
        try {
            long j = context != null ? context.getSharedPreferences("txy_comoon_share_data", 0).getLong(str + "_time", 0L) : 0L;
            if (System.currentTimeMillis() - j > 86400000) {
                if (this.f58168b.contains(str)) {
                    getInstance().logError("TxNetWorkHelper", "do not need update dns!");
                } else {
                    getInstance().logError("TxNetWorkHelper", "need update dns!");
                    checkHostName(context, str, false);
                }
                return "";
            }
            String string = context == null ? EventReportConfig.STRING_INIT : context.getSharedPreferences("txy_comoon_share_data", 0).getString(str, EventReportConfig.STRING_INIT);
            if (!TextUtils.isEmpty(string)) {
                if (this.f58167a == null) {
                    this.f58167a = new HashMap();
                }
                this.f58167a.put(str, new DnsCacheInfo(str, string, j));
            }
            return string;
        } catch (Exception e) {
            Log.e("TxNetWorkHelper", "getHostNameCurrentIp error: " + e.getLocalizedMessage());
            return "";
        }
    }

    public void logDebug(String str, String str2) {
        if (this.f58169c == null || LOG_LEVEL.LEVEL_DEBUG.compareTo(this.f58170d) < 0) {
            return;
        }
        this.f58169c.logger(str, str2);
    }

    public void logError(String str, String str2) {
        if (this.f58169c == null || LOG_LEVEL.LEVEL_ERROR.compareTo(this.f58170d) < 0) {
            Log.e(str, str2);
        } else {
            this.f58169c.logger(str, str2);
        }
    }

    public void release() {
        if (this.f58169c != null) {
            this.f58169c = null;
        }
        AiOkHttpHelper.getInstance().release();
    }

    public void setAiNetWorkLevel(LOG_LEVEL log_level) {
        NetworkLogger.LOG_LEVEL log_level2 = NetworkLogger.LOG_LEVEL.LEVEL_VERBOSE;
        int iOrdinal = log_level.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                log_level2 = NetworkLogger.LOG_LEVEL.LEVEL_DEBUG;
            } else if (iOrdinal == 2) {
                log_level2 = NetworkLogger.LOG_LEVEL.LEVEL_INFO;
            } else if (iOrdinal == 3) {
                log_level2 = NetworkLogger.LOG_LEVEL.LEVEL_WARN;
            } else if (iOrdinal == 4) {
                log_level2 = NetworkLogger.LOG_LEVEL.LEVEL_ERROR;
            } else if (iOrdinal == 5) {
                log_level2 = NetworkLogger.LOG_LEVEL.LEVEL_NONE;
            }
        }
        AiOkHttpHelper.getInstance().setLogLevel(log_level2);
    }

    public void setLoggerCallBack(final NetWorkLoggerCallBack netWorkLoggerCallBack, LOG_LEVEL log_level) {
        this.f58169c = netWorkLoggerCallBack;
        this.f58170d = log_level;
        AiOkHttpHelper.getInstance().setLoggerCallBack(new NetworkLoggerCallBack(this) { // from class: com.tencent.could.component.common.ai.net.TxNetWorkHelper.1
            @Override // com.tencent.cloud.p080ai.network.helper.NetworkLoggerCallBack
            public void logger(String str, String str2) {
                NetWorkLoggerCallBack netWorkLoggerCallBack2 = netWorkLoggerCallBack;
                if (netWorkLoggerCallBack2 != null) {
                    netWorkLoggerCallBack2.logger(str, str2);
                }
            }
        });
    }

    public void setLoggerCallBack(NetWorkLoggerCallBack netWorkLoggerCallBack) {
        setLoggerCallBack(netWorkLoggerCallBack, this.f58170d);
    }

    /* JADX INFO: renamed from: a */
    public static void m83390a(TxNetWorkHelper txNetWorkHelper, Context context, String str, String str2, long j) {
        if (txNetWorkHelper.f58167a == null) {
            txNetWorkHelper.f58167a = new HashMap();
        }
        txNetWorkHelper.f58167a.put(str, new DnsCacheInfo(str, str2, j));
        if (context != null) {
            context.getSharedPreferences("txy_comoon_share_data", 0).edit().putString(str, str2).apply();
        }
        String str3 = str + "_time";
        if (context == null) {
            return;
        }
        context.getSharedPreferences("txy_comoon_share_data", 0).edit().putLong(str3, j).apply();
    }
}
