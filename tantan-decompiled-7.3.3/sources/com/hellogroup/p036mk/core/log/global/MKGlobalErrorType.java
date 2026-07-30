package com.hellogroup.p036mk.core.log.global;

import com.p051p1.mobile.putong.core.data.UserBanAppealSwitch;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, m88121d2 = {"Lcom/hellogroup/mk/core/log/global/MKGlobalErrorType;", "", "bizThird", "", "eventName", UserBanAppealSwitch.offline, "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "getBizThird", "()Ljava/lang/String;", "getEventName", "getOffline", "()Z", "MK_RENDER_CRASH", "HTTP_DNS", "REPORT_BRIDGE_LIST", "DISCARD_BRIDGE_LIST", "MK_BRIDGE_INVOKE", "GREY_ERROR", "SSL_ERROR", "SSL_ERROR_HANDLE_CANCEL", "LOAD_REAL_URL", "CHECK_UPDATE_FAIL", "WEB_CONFIG_FAIL", "OFFLINE_DOWNLOAD_FAIL", "LOAD_THIRD_PAGE", "THIRD_PARTY_LOAD_ON_NATIVE", "FEP_MONITOR", "DNS_LOG_FEP", "INTERCEPT_FILE_ERROR", "RECYCLE_RELOAD_CACHE", "RECYCLE_RELOAD", "ERROR_3O2", "LOCATION_ERROR", "LOAD_FILE", "MKCore_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public enum MKGlobalErrorType {
    MK_RENDER_CRASH("mkRenderCrash", "mkRenderCrash", true),
    HTTP_DNS("HttpDNS", "httpDns", true),
    REPORT_BRIDGE_LIST("reportBridgeList", "reportBridgeList", true),
    DISCARD_BRIDGE_LIST("discardBridgeList", "discardBridgeList", true),
    MK_BRIDGE_INVOKE("mk_bridge_invoke", "mkBridgeInvoke", true),
    GREY_ERROR("greyError", "greyError", false, 4, null),
    SSL_ERROR("SSL_ERROR", "sslError", false, 4, null),
    SSL_ERROR_HANDLE_CANCEL("SSL_ERROR_HANDLE_CANCEL", "sslErrorHandleCancel", false, 4, null),
    LOAD_REAL_URL("LOAD_REAL_URL", "loadRealUrl", false, 4, null),
    CHECK_UPDATE_FAIL("ERR_6.1", "checkUpdateFail", false, 4, null),
    WEB_CONFIG_FAIL("ERR_6.2", "webConfigFail", false, 4, null),
    OFFLINE_DOWNLOAD_FAIL("ERR_6.3", "offlineDownloadFail", false, 4, null),
    LOAD_THIRD_PAGE("ERR_7.1", "loadThirdPage", false, 4, null),
    THIRD_PARTY_LOAD_ON_NATIVE("ERR_7.2", "thirdPartyLoadOnNative", false, 4, null),
    FEP_MONITOR("fep_monitor", "fepMonitor", false, 4, null),
    DNS_LOG_FEP("dns_log_fep", "dnsLogFep", false, 4, null),
    INTERCEPT_FILE_ERROR("ERR_2.6", "interceptFileError", false, 4, null),
    RECYCLE_RELOAD_CACHE("recycle_reload_cache", "recycleReloadCache", false, 4, null),
    RECYCLE_RELOAD("recycle_reload", "recycleReload", false, 4, null),
    ERROR_3O2("ERR_7.3", "302Error", false, 4, null),
    LOCATION_ERROR("dns_log_fep", "locationError", false, 4, null),
    LOAD_FILE("loadFile", "loadFile", false, 4, null);


    @NotNull
    private final String bizThird;

    @NotNull
    private final String eventName;
    private final boolean offline;

    /* synthetic */ MKGlobalErrorType(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }

    @NotNull
    public final String getBizThird() {
        return this.bizThird;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    public final boolean getOffline() {
        return this.offline;
    }

    MKGlobalErrorType(String str, String str2, boolean z) {
        this.bizThird = str;
        this.eventName = str2;
        this.offline = z;
    }
}
