package com.tencent.could.component.common.p079ai.eventreport.entry;

import android.text.TextUtils;
import com.tencent.could.component.common.p079ai.eventreport.api.EventReportConfig;
import com.tencent.could.component.common.p079ai.net.HttpMethod;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class NetWorkParam {
    public static final int DEFAULT_CONNECT_TIME_OUT = 15000;
    public static final int DEFAULT_TIME_OUT = 30000;
    public static final int RETRY_TIMES = 2;
    public String backUpIpStringUrl;
    public String[] backUpIpStringUrls;
    public String[] connectIps;
    public int connectTimeOut;
    public String deputy;
    public HttpMethod httpMethod;
    public String httpsVerifyHost;
    public boolean isGzip;
    public String requestData;
    public HashMap<String, String> requestHeaders;
    public int retryTimes;
    public int timeOutTimes;
    public String url;

    public static class NetWorkParamBuilder {
        public String backUpIpStringUrl;
        public String[] backUpIpStringUrls;
        public String[] connectIps;
        public int connectTimeOut;
        public String deputy;
        public HttpMethod httpMethod;
        public String httpsVerifyHost;
        public boolean isGzip;
        public String requestData;
        public HashMap<String, String> requestHeaders;
        public int retryTimes;
        public int timeOutTimes;
        public String url;

        public NetWorkParamBuilder() {
            String str = EventReportConfig.STRING_INIT;
            this.url = str;
            this.deputy = str;
            this.httpsVerifyHost = str;
            this.backUpIpStringUrl = str;
            this.httpMethod = HttpMethod.POST;
            this.requestData = null;
            this.requestHeaders = null;
            this.isGzip = false;
            this.timeOutTimes = 30000;
            this.connectTimeOut = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
            this.retryTimes = 2;
        }

        public static NetWorkParamBuilder newBuilder() {
            return new NetWorkParamBuilder();
        }

        public NetWorkParam createNetWorkParam() {
            return new NetWorkParam(this);
        }

        public NetWorkParamBuilder setBackUpIpStringUrl(String str) {
            this.backUpIpStringUrl = str;
            return this;
        }

        public NetWorkParamBuilder setBackUpIpStringUrls(String[] strArr) {
            this.backUpIpStringUrls = strArr;
            return this;
        }

        public NetWorkParamBuilder setConnectIps(String[] strArr) {
            this.connectIps = strArr;
            return this;
        }

        public NetWorkParamBuilder setConnectTimeOut(int i) {
            this.connectTimeOut = i;
            return this;
        }

        public NetWorkParamBuilder setDeputyUrl(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.deputy = str;
            }
            return this;
        }

        public NetWorkParamBuilder setGzip(boolean z) {
            this.isGzip = z;
            return this;
        }

        public NetWorkParamBuilder setHttpMethod(HttpMethod httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        public NetWorkParamBuilder setHttpsVerifyHost(String str) {
            this.httpsVerifyHost = str;
            return this;
        }

        public NetWorkParamBuilder setRequestData(String str) {
            this.requestData = str;
            return this;
        }

        public NetWorkParamBuilder setRequestHeaders(HashMap<String, String> map) {
            this.requestHeaders = map;
            return this;
        }

        public NetWorkParamBuilder setRetryTimes(int i) {
            this.retryTimes = i;
            return this;
        }

        public NetWorkParamBuilder setTimeOutTimes(int i) {
            this.timeOutTimes = i;
            return this;
        }

        public NetWorkParamBuilder setUrl(String str) {
            this.url = str;
            return this;
        }
    }

    public NetWorkParam(NetWorkParamBuilder netWorkParamBuilder) {
        this.deputy = "";
        this.timeOutTimes = 30000;
        this.connectTimeOut = DEFAULT_CONNECT_TIME_OUT;
        this.retryTimes = 2;
        this.httpsVerifyHost = "";
        this.backUpIpStringUrl = "";
        this.url = netWorkParamBuilder.url;
        this.httpMethod = netWorkParamBuilder.httpMethod;
        this.requestData = netWorkParamBuilder.requestData;
        this.requestHeaders = netWorkParamBuilder.requestHeaders;
        this.isGzip = netWorkParamBuilder.isGzip;
        this.timeOutTimes = netWorkParamBuilder.timeOutTimes;
        this.retryTimes = netWorkParamBuilder.retryTimes;
        this.deputy = netWorkParamBuilder.deputy;
        this.httpsVerifyHost = netWorkParamBuilder.httpsVerifyHost;
        this.backUpIpStringUrl = netWorkParamBuilder.backUpIpStringUrl;
        this.backUpIpStringUrls = netWorkParamBuilder.backUpIpStringUrls;
        this.connectIps = netWorkParamBuilder.connectIps;
        this.connectTimeOut = netWorkParamBuilder.connectTimeOut;
    }

    public String getBackUpIpStringUrl() {
        return this.backUpIpStringUrl;
    }

    public String[] getBackUpIpStringUrls() {
        return this.backUpIpStringUrls;
    }

    public String[] getConnectIps() {
        return this.connectIps;
    }

    public int getConnectTimeOut() {
        return this.connectTimeOut;
    }

    public String getDeputyUrl() {
        return this.deputy;
    }

    public HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public String getHttpsVerifyHost() {
        return this.httpsVerifyHost;
    }

    public String getRequestData() {
        return this.requestData;
    }

    public HashMap<String, String> getRequestHeaders() {
        return this.requestHeaders;
    }

    public int getRetryTimes() {
        return this.retryTimes;
    }

    public int getTimeOutTimes() {
        return this.timeOutTimes;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isGzip() {
        return this.isGzip;
    }

    public String toString() {
        return "NetWorkParam{url='" + this.url + "', deputy='" + this.deputy + "', httpMethod=" + this.httpMethod + ", requestData='" + this.requestData + "', isGzip=" + this.isGzip + ", timeOutTimes=" + this.timeOutTimes + ", connectTimeOut=" + this.connectTimeOut + ", retryTimes=" + this.retryTimes + ", httpsVerifyHost='" + this.httpsVerifyHost + "', backUpIpStringUrl='" + this.backUpIpStringUrl + "'}";
    }
}
