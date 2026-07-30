package com.tencent.could.component.common.p079ai.net;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.tencent.cloud.p075ai.network.helper.AiOkHttpHelper;
import com.tencent.cloud.p075ai.network.helper.NetworkLogger;
import com.tencent.cloud.p075ai.network.helper.NetworkLoggerCallBack;
import com.tencent.could.component.common.p079ai.eventreport.api.EventReportConfig;
import com.tencent.could.component.common.p079ai.utils.ThreadPoolUtil;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class TxNetWorkHelper {

    /* JADX INFO: renamed from: a */
    public volatile Map<String, DnsCacheInfo> f57319a;

    /* JADX INFO: renamed from: c */
    public NetWorkLoggerCallBack f57321c;

    /* JADX INFO: renamed from: d */
    public LOG_LEVEL f57322d = LOG_LEVEL.LEVEL_VERBOSE;

    /* JADX INFO: renamed from: b */
    public volatile Set<String> f57320b = new HashSet();

    /* JADX INFO: renamed from: com.tencent.could.component.common.ai.net.TxNetWorkHelper$3 */
    public static /* synthetic */ class C138663 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f57328a;

        static {
            int[] iArr = new int[LOG_LEVEL.values().length];
            f57328a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57328a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57328a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57328a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57328a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57328a[3] = 6;
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
        public static final TxNetWorkHelper f57330a = new TxNetWorkHelper();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m82208a(TxNetWorkHelper txNetWorkHelper, Context context, String str) {
        DnsCacheInfo dnsCacheInfo;
        if (txNetWorkHelper.f57319a == null || (dnsCacheInfo = txNetWorkHelper.f57319a.get(str)) == null) {
            try {
                long j = context != null ? context.getSharedPreferences("txy_comoon_share_data", 0).getLong(str + "_time", 0L) : 0L;
                if (System.currentTimeMillis() - j > 86400000) {
                    getInstance().logError("TxNetWorkHelper", "isHostNameIpTimeOut is timeout");
                    return true;
                }
                String string = context == null ? EventReportConfig.STRING_INIT : context.getSharedPreferences("txy_comoon_share_data", 0).getString(str, EventReportConfig.STRING_INIT);
                if (!TextUtils.isEmpty(string)) {
                    if (txNetWorkHelper.f57319a == null) {
                        txNetWorkHelper.f57319a = new HashMap();
                    }
                    txNetWorkHelper.f57319a.put(str, new DnsCacheInfo(str, string, j));
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
        return TxNetWorkHelperHolder.f57330a;
    }

    public void checkHostName(final Context context, final String str, final boolean z) {
        ThreadPoolUtil.getInstance().addWork(new Runnable() { // from class: com.tencent.could.component.common.ai.net.TxNetWorkHelper.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (TxNetWorkHelper.m82208a(TxNetWorkHelper.this, context, str) || z) {
                        if (!TxNetWorkHelper.this.f57320b.contains(str)) {
                            TxNetWorkHelper.this.f57320b.add(str);
                        }
                        DnsResolver dnsResolver = new DnsResolver(str);
                        Thread thread = new Thread(dnsResolver);
                        thread.start();
                        thread.join(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                        if (TxNetWorkHelper.this.f57320b.contains(str)) {
                            TxNetWorkHelper.this.f57320b.remove(str);
                        }
                        InetAddress hasAddress = dnsResolver.getHasAddress();
                        TxNetWorkHelper txNetWorkHelper = TxNetWorkHelper.this;
                        if (hasAddress == null) {
                            TxNetWorkHelper.m82207a(txNetWorkHelper, context, str, "", 0L);
                        } else {
                            TxNetWorkHelper.m82207a(txNetWorkHelper, context, str, hasAddress.getHostAddress(), System.currentTimeMillis());
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
        if (this.f57319a != null && (dnsCacheInfo = this.f57319a.get(str)) != null && System.currentTimeMillis() - dnsCacheInfo.getRefreshTime() < 86400000) {
            getInstance().logError("TxNetWorkHelper", "get hostName use cache: " + dnsCacheInfo.getIp());
            return dnsCacheInfo.getIp();
        }
        try {
            long j = context != null ? context.getSharedPreferences("txy_comoon_share_data", 0).getLong(str + "_time", 0L) : 0L;
            if (System.currentTimeMillis() - j > 86400000) {
                if (this.f57320b.contains(str)) {
                    getInstance().logError("TxNetWorkHelper", "do not need update dns!");
                } else {
                    getInstance().logError("TxNetWorkHelper", "need update dns!");
                    checkHostName(context, str, false);
                }
                return "";
            }
            String string = context == null ? EventReportConfig.STRING_INIT : context.getSharedPreferences("txy_comoon_share_data", 0).getString(str, EventReportConfig.STRING_INIT);
            if (!TextUtils.isEmpty(string)) {
                if (this.f57319a == null) {
                    this.f57319a = new HashMap();
                }
                this.f57319a.put(str, new DnsCacheInfo(str, string, j));
            }
            return string;
        } catch (Exception e) {
            Log.e("TxNetWorkHelper", "getHostNameCurrentIp error: " + e.getLocalizedMessage());
            return "";
        }
    }

    public void logDebug(String str, String str2) {
        if (this.f57321c == null || LOG_LEVEL.LEVEL_DEBUG.compareTo(this.f57322d) < 0) {
            return;
        }
        this.f57321c.logger(str, str2);
    }

    public void logError(String str, String str2) {
        if (this.f57321c == null || LOG_LEVEL.LEVEL_ERROR.compareTo(this.f57322d) < 0) {
            Log.e(str, str2);
        } else {
            this.f57321c.logger(str, str2);
        }
    }

    public void release() {
        if (this.f57321c != null) {
            this.f57321c = null;
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
        this.f57321c = netWorkLoggerCallBack;
        this.f57322d = log_level;
        AiOkHttpHelper.getInstance().setLoggerCallBack(new NetworkLoggerCallBack(this) { // from class: com.tencent.could.component.common.ai.net.TxNetWorkHelper.1
            @Override // com.tencent.cloud.p075ai.network.helper.NetworkLoggerCallBack
            public void logger(String str, String str2) {
                NetWorkLoggerCallBack netWorkLoggerCallBack2 = netWorkLoggerCallBack;
                if (netWorkLoggerCallBack2 != null) {
                    netWorkLoggerCallBack2.logger(str, str2);
                }
            }
        });
    }

    public void setLoggerCallBack(NetWorkLoggerCallBack netWorkLoggerCallBack) {
        setLoggerCallBack(netWorkLoggerCallBack, this.f57322d);
    }

    /* JADX INFO: renamed from: a */
    public static void m82207a(TxNetWorkHelper txNetWorkHelper, Context context, String str, String str2, long j) {
        if (txNetWorkHelper.f57319a == null) {
            txNetWorkHelper.f57319a = new HashMap();
        }
        txNetWorkHelper.f57319a.put(str, new DnsCacheInfo(str, str2, j));
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
