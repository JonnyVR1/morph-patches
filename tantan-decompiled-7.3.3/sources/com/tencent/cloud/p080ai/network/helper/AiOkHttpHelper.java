package com.tencent.cloud.p080ai.network.helper;

import com.tencent.cloud.p080ai.network.okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes12.dex */
public class AiOkHttpHelper {

    /* JADX INFO: renamed from: a */
    public OkHttpClient f57159a;

    /* JADX INFO: renamed from: b */
    public NetworkLoggerCallBack f57160b;

    public static class AiOkHttpHelperHolder {

        /* JADX INFO: renamed from: a */
        public static final AiOkHttpHelper f57161a = new AiOkHttpHelper();
    }

    public static AiOkHttpHelper getInstance() {
        return AiOkHttpHelperHolder.f57161a;
    }

    public OkHttpClient getOkHttpClient() {
        return this.f57159a;
    }

    public void logDebug(String str) {
        NetworkLogger.debug("AiOkHttpHelper", str, this.f57160b);
    }

    public void logError(String str) {
        NetworkLogger.error("AiOkHttpHelper", str, this.f57160b);
    }

    public void logInfo(String str) {
        NetworkLogger.info("AiOkHttpHelper", str, this.f57160b);
    }

    public void release() {
        if (this.f57159a != null) {
            this.f57159a = null;
        }
    }

    public void setLogLevel(NetworkLogger.LOG_LEVEL log_level) {
        NetworkLogger.setLogLevel(log_level);
    }

    public void setLoggerCallBack(NetworkLoggerCallBack networkLoggerCallBack) {
        this.f57160b = networkLoggerCallBack;
    }

    public void setOkHttpClient(OkHttpClient okHttpClient) {
        this.f57159a = okHttpClient;
    }
}
