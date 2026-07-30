package com.tencent.could.component.common.p084ai.net;

import android.text.TextUtils;
import android.util.Log;
import com.tencent.cloud.p080ai.network.helper.AiOkHttpHelper;
import com.tencent.cloud.p080ai.network.okhttp3.Dns;
import com.tencent.cloud.p080ai.network.okhttp3.Interceptor;
import com.tencent.cloud.p080ai.network.okhttp3.MediaType;
import com.tencent.cloud.p080ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p080ai.network.okhttp3.Request;
import com.tencent.cloud.p080ai.network.okhttp3.RequestBody;
import com.tencent.cloud.p080ai.network.okhttp3.Response;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import com.tencent.could.component.common.p084ai.utils.GZipUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;
import p153l.rdd0;

/* JADX INFO: loaded from: classes12.dex */
public class OkHttpRequest extends JsonHttpRequest {
    public static volatile int currentConnectTimeout = 15000;
    public static volatile int currentTimeout = 30000;

    public class TimeoutInterceptor implements Interceptor {
        public TimeoutInterceptor() {
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            Request request = chain.request();
            Log.e("OkHttpRequest", "TimeoutInterceptor intercept");
            if (OkHttpRequest.this.f58149b == null) {
                AiOkHttpHelper.getInstance().logDebug("netWorkParam is null!");
                return chain.proceed(request);
            }
            Log.e("OkHttpRequest", "currentConnectTimeout:" + OkHttpRequest.currentConnectTimeout);
            Log.e("OkHttpRequest", "currentTimeout:" + OkHttpRequest.currentTimeout);
            int i = OkHttpRequest.currentConnectTimeout;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Interceptor.Chain chainWithReadTimeout = chain.withConnectTimeout(i, timeUnit).withWriteTimeout(OkHttpRequest.currentTimeout, timeUnit).withReadTimeout(OkHttpRequest.currentTimeout, timeUnit);
            TxNetWorkHelper.getInstance().logDebug("OkHttpRequest", "ConnectTimeout:" + chainWithReadTimeout.connectTimeoutMillis());
            TxNetWorkHelper.getInstance().logDebug("OkHttpRequest", "WriteTimeout:" + chainWithReadTimeout.writeTimeoutMillis());
            TxNetWorkHelper.getInstance().logDebug("OkHttpRequest", "ReadTimeout:" + chainWithReadTimeout.readTimeoutMillis());
            return chainWithReadTimeout.proceed(request);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Request m83389a(String str, RequestBody requestBody) {
        Request.Builder builder = new Request.Builder();
        builder.url(str);
        HashMap<String, String> requestHeaders = this.f58149b.getRequestHeaders();
        if (requestHeaders != null) {
            for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                builder = builder.addHeader(entry.getKey(), entry.getValue());
            }
        }
        if (this.f58149b.isGzip()) {
            builder.addHeader("Content-Encoding", HttpHeaderValues.GZIP);
            builder.addHeader(HttpHeaders.ACCEPT_ENCODING, HttpHeaderValues.GZIP);
        }
        if (requestBody != null) {
            builder.post(requestBody);
        }
        return builder.build();
    }

    @Override // com.tencent.could.component.common.p084ai.net.JsonHttpRequest, com.tencent.could.component.common.p084ai.net.IHttpRequest
    public void execute() {
        Request requestM83389a;
        Log.e("OkHttpRequest", "OkHttpRequest execute!");
        NetWorkParam netWorkParam = this.f58149b;
        if (netWorkParam == null) {
            TxNetWorkHelper.getInstance().logError("OkHttpRequest", "netWorkParam is null!");
            return;
        }
        String url = netWorkParam.getUrl();
        if (this.f58150c && !TextUtils.isEmpty(this.f58149b.getDeputyUrl())) {
            TxNetWorkHelper.getInstance().logError("OkHttpRequest", "use DeputyUrl");
            url = this.f58149b.getDeputyUrl();
        }
        if (HttpMethod.GET == this.f58149b.getHttpMethod()) {
            requestM83389a = m83389a(url, (RequestBody) null);
        } else {
            requestM83389a = m83389a(url, this.f58149b.isGzip() ? RequestBody.create(MediaType.parse("application/json"), GZipUtils.compress(this.f58149b.getRequestData())) : RequestBody.create(MediaType.parse("application/json"), this.f58149b.getRequestData()));
        }
        currentConnectTimeout = this.f58149b.getConnectTimeOut();
        currentTimeout = this.f58149b.getTimeOutTimes();
        OkHttpClient okHttpClient = AiOkHttpHelper.getInstance().getOkHttpClient();
        if (okHttpClient == null) {
            Log.e("OkHttpRequest", "OkHttpRequest execute! client == null");
            Log.e("OkHttpRequest", "createOkHttpClient");
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            long connectTimeOut = this.f58149b.getConnectTimeOut();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            builder.connectTimeout(connectTimeOut, timeUnit);
            builder.callTimeout(this.f58149b.getTimeOutTimes(), timeUnit);
            builder.readTimeout(this.f58149b.getTimeOutTimes(), timeUnit);
            builder.writeTimeout(this.f58149b.getTimeOutTimes(), timeUnit);
            builder.addInterceptor(new TimeoutInterceptor());
            final String[] connectIps = this.f58149b.getConnectIps();
            if (connectIps == null || connectIps.length == 0) {
                okHttpClient = builder.build();
            } else {
                builder.dns(new Dns(this) { // from class: com.tencent.could.component.common.ai.net.OkHttpRequest.1
                    @Override // com.tencent.cloud.p080ai.network.okhttp3.Dns
                    public List<InetAddress> lookup(String str) {
                        ArrayList arrayList = new ArrayList(connectIps.length);
                        for (String str2 : connectIps) {
                            try {
                                arrayList.add(InetAddress.getByName(str2));
                            } catch (UnknownHostException e) {
                                TxNetWorkHelper.getInstance().logError("OkHttpRequest", "UnknownHostException " + e.getLocalizedMessage());
                            }
                        }
                        return arrayList.size() != 0 ? arrayList : Dns.SYSTEM.lookup(str);
                    }
                });
                okHttpClient = builder.build();
            }
            AiOkHttpHelper.getInstance().setOkHttpClient(okHttpClient);
        }
        try {
            Response responseExecute = okHttpClient.newCall(requestM83389a).execute();
            int iCode = responseExecute.code();
            if (iCode != 200) {
                throw new RuntimeException("responseCode error: " + iCode);
            }
            if (responseExecute.body() == null) {
                throw new RuntimeException("response.body is null!");
            }
            if (this.f58148a == null) {
                TxNetWorkHelper.getInstance().logError("OkHttpRequest", "callBackListener is null!");
            } else if (HttpHeaderValues.GZIP.equals(responseExecute.header("Content-Encoding"))) {
                this.f58148a.onSuccess(GZipUtils.uncompressToString(responseExecute.body().bytes()));
            } else {
                this.f58148a.onSuccess(responseExecute.body().string());
            }
            responseExecute.close();
        } catch (IOException e) {
            rdd0.m180845a("realExecute error: ", e.getLocalizedMessage());
        }
    }
}
