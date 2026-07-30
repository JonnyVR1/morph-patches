package com.alibaba.sdk.android.oss;

import com.alibaba.sdk.android.oss.common.HttpProtocol;
import com.alibaba.sdk.android.oss.signer.SignVersion;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p149l.ig3;
import p149l.k850;

/* JADX INFO: loaded from: classes.dex */
public class ClientConfiguration {
    private static final int DEFAULT_MAX_RETRIES = 2;
    private String ipWithHeader;
    private String mUserAgentMark;
    private String proxyHost;
    private int proxyPort;
    private int maxConcurrentRequest = 5;
    private int maxConcurrentRequestsPerHost = -1;
    private int socketTimeout = HuiYanResultSender.TIMEOUT_MS;
    private int connectionTimeout = HuiYanResultSender.TIMEOUT_MS;
    private long max_log_size = 5242880;
    private int maxErrorRetry = 2;
    private List<String> customCnameExcludeList = new ArrayList();
    private boolean httpDnsEnable = false;
    private boolean checkCRC64 = false;
    private boolean pathStyleAccessEnable = false;
    private boolean customPathPrefixEnable = false;
    private boolean followRedirectsEnable = false;
    private k850 okHttpClient = null;
    private ExecutorService executorService = null;
    private SignVersion signVersion = SignVersion.V1;
    private HttpProtocol httpProtocol = HttpProtocol.HTTPS;

    public static ClientConfiguration getDefaultConf() {
        return new ClientConfiguration();
    }

    public int getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public List<String> getCustomCnameExcludeList() {
        return Collections.unmodifiableList(this.customCnameExcludeList);
    }

    public String getCustomUserMark() {
        return this.mUserAgentMark;
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public HttpProtocol getHttpProtocol() {
        return this.httpProtocol;
    }

    public String getIpWithHeader() {
        return this.ipWithHeader;
    }

    public int getMaxConcurrentRequest() {
        return this.maxConcurrentRequest;
    }

    public int getMaxConcurrentRequestsPerHost() {
        return this.maxConcurrentRequestsPerHost;
    }

    public int getMaxErrorRetry() {
        return this.maxErrorRetry;
    }

    public long getMaxLogSize() {
        return this.max_log_size;
    }

    public k850 getOkHttpClient() {
        return this.okHttpClient;
    }

    public String getProxyHost() {
        return this.proxyHost;
    }

    public int getProxyPort() {
        return this.proxyPort;
    }

    public SignVersion getSignVersion() {
        return this.signVersion;
    }

    public int getSocketTimeout() {
        return this.socketTimeout;
    }

    public boolean isCheckCRC64() {
        return this.checkCRC64;
    }

    public boolean isCustomPathPrefixEnable() {
        return this.customPathPrefixEnable;
    }

    public boolean isFollowRedirectsEnable() {
        return this.followRedirectsEnable;
    }

    public boolean isHttpDnsEnable() {
        return this.httpDnsEnable;
    }

    public boolean isPathStyleAccessEnable() {
        return this.pathStyleAccessEnable;
    }

    public void setCheckCRC64(boolean z) {
        this.checkCRC64 = z;
    }

    public void setConnectionTimeout(int i) {
        this.connectionTimeout = i;
    }

    public void setCustomCnameExcludeList(List<String> list) {
        if (list == null || list.size() == 0) {
            ig3.m135964a("cname exclude list should not be null.");
            return;
        }
        this.customCnameExcludeList.clear();
        for (String str : list) {
            boolean zContains = str.contains("://");
            List<String> list2 = this.customCnameExcludeList;
            if (zContains) {
                list2.add(str.substring(str.indexOf("://") + 3));
            } else {
                list2.add(str);
            }
        }
    }

    public void setCustomPathPrefixEnable(boolean z) {
        this.customPathPrefixEnable = z;
    }

    public void setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public void setFollowRedirectsEnable(boolean z) {
        this.followRedirectsEnable = z;
    }

    public void setHttpDnsEnable(boolean z) {
        this.httpDnsEnable = z;
    }

    public void setHttpProtocol(HttpProtocol httpProtocol) {
        this.httpProtocol = httpProtocol;
    }

    public void setIpWithHeader(String str) {
        this.ipWithHeader = str;
    }

    public void setMaxConcurrentRequest(int i) {
        this.maxConcurrentRequest = i;
    }

    public void setMaxConcurrentRequestsPerHost(int i) {
        this.maxConcurrentRequestsPerHost = i;
    }

    public void setMaxErrorRetry(int i) {
        this.maxErrorRetry = i;
    }

    public void setMaxLogSize(long j) {
        this.max_log_size = j;
    }

    public void setOkHttpClient(k850 k850Var) {
        this.okHttpClient = k850Var;
    }

    public void setPathStyleAccessEnable(boolean z) {
        this.pathStyleAccessEnable = z;
    }

    public void setProxyHost(String str) {
        this.proxyHost = str;
    }

    public void setProxyPort(int i) {
        this.proxyPort = i;
    }

    public void setSignVersion(SignVersion signVersion) {
        this.signVersion = signVersion;
    }

    public void setSocketTimeout(int i) {
        this.socketTimeout = i;
    }

    public void setUserAgentMark(String str) {
        this.mUserAgentMark = str;
    }
}
