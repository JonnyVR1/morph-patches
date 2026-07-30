package com.tencent.cloud.p075ai.network.helper;

import com.tencent.cloud.p075ai.network.okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes13.dex */
public class AiOkHttpHelper {

    /* JADX INFO: renamed from: a */
    public OkHttpClient f56311a;

    /* JADX INFO: renamed from: b */
    public NetworkLoggerCallBack f56312b;

    public static class AiOkHttpHelperHolder {

        /* JADX INFO: renamed from: a */
        public static final AiOkHttpHelper f56313a = new AiOkHttpHelper();
    }

    public static AiOkHttpHelper getInstance() {
        return AiOkHttpHelperHolder.f56313a;
    }

    public OkHttpClient getOkHttpClient() {
        return this.f56311a;
    }

    public void logDebug(String str) {
        NetworkLogger.debug("AiOkHttpHelper", str, this.f56312b);
    }

    public void logError(String str) {
        NetworkLogger.error("AiOkHttpHelper", str, this.f56312b);
    }

    public void logInfo(String str) {
        NetworkLogger.info("AiOkHttpHelper", str, this.f56312b);
    }

    public void release() {
        if (this.f56311a != null) {
            this.f56311a = null;
        }
    }

    public void setLogLevel(NetworkLogger.LOG_LEVEL log_level) {
        NetworkLogger.setLogLevel(log_level);
    }

    public void setLoggerCallBack(NetworkLoggerCallBack networkLoggerCallBack) {
        this.f56312b = networkLoggerCallBack;
    }

    public void setOkHttpClient(OkHttpClient okHttpClient) {
        this.f56311a = okHttpClient;
    }
}
