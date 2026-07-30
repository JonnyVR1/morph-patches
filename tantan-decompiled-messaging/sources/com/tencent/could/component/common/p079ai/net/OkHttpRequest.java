package com.tencent.could.component.common.p079ai.net;

import android.text.TextUtils;
import android.util.Log;
import com.tencent.cloud.p075ai.network.helper.AiOkHttpHelper;
import com.tencent.cloud.p075ai.network.okhttp3.Dns;
import com.tencent.cloud.p075ai.network.okhttp3.Interceptor;
import com.tencent.cloud.p075ai.network.okhttp3.MediaType;
import com.tencent.cloud.p075ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p075ai.network.okhttp3.Request;
import com.tencent.cloud.p075ai.network.okhttp3.RequestBody;
import com.tencent.cloud.p075ai.network.okhttp3.Response;
import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
import com.tencent.could.component.common.p079ai.utils.GZipUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.HttpHeaderValues;
import p149l.o5d0;

/* JADX INFO: loaded from: classes2.dex */
public class OkHttpRequest extends JsonHttpRequest {
    public static volatile int currentConnectTimeout = 15000;
    public static volatile int currentTimeout = 30000;

    public class TimeoutInterceptor implements Interceptor {
        public TimeoutInterceptor() {
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            Request request = chain.request();
            Log.e("OkHttpRequest", "TimeoutInterceptor intercept");
            if (OkHttpRequest.this.f57301b == null) {
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
    public final Request m82206a(String str, RequestBody requestBody) {
        Request.Builder builder = new Request.Builder();
        builder.url(str);
        HashMap<String, String> requestHeaders = this.f57301b.getRequestHeaders();
        if (requestHeaders != null) {
            for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                builder = builder.addHeader(entry.getKey(), entry.getValue());
            }
        }
        if (this.f57301b.isGzip()) {
            builder.addHeader("Content-Encoding", HttpHeaderValues.GZIP);
            builder.addHeader("Accept-Encoding", HttpHeaderValues.GZIP);
        }
        if (requestBody != null) {
            builder.post(requestBody);
        }
        return builder.build();
    }

    @Override // com.tencent.could.component.common.p079ai.net.JsonHttpRequest, com.tencent.could.component.common.p079ai.net.IHttpRequest
    public void execute() {
        Request requestM82206a;
        Log.e("OkHttpRequest", "OkHttpRequest execute!");
        NetWorkParam netWorkParam = this.f57301b;
        if (netWorkParam == null) {
            TxNetWorkHelper.getInstance().logError("OkHttpRequest", "netWorkParam is null!");
            return;
        }
        String url = netWorkParam.getUrl();
        if (this.f57302c && !TextUtils.isEmpty(this.f57301b.getDeputyUrl())) {
            TxNetWorkHelper.getInstance().logError("OkHttpRequest", "use DeputyUrl");
            url = this.f57301b.getDeputyUrl();
        }
        if (HttpMethod.GET == this.f57301b.getHttpMethod()) {
            requestM82206a = m82206a(url, (RequestBody) null);
        } else {
            requestM82206a = m82206a(url, this.f57301b.isGzip() ? RequestBody.create(MediaType.parse("application/json"), GZipUtils.compress(this.f57301b.getRequestData())) : RequestBody.create(MediaType.parse("application/json"), this.f57301b.getRequestData()));
        }
        currentConnectTimeout = this.f57301b.getConnectTimeOut();
        currentTimeout = this.f57301b.getTimeOutTimes();
        OkHttpClient okHttpClient = AiOkHttpHelper.getInstance().getOkHttpClient();
        if (okHttpClient == null) {
            Log.e("OkHttpRequest", "OkHttpRequest execute! client == null");
            Log.e("OkHttpRequest", "createOkHttpClient");
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            long connectTimeOut = this.f57301b.getConnectTimeOut();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            builder.connectTimeout(connectTimeOut, timeUnit);
            builder.callTimeout(this.f57301b.getTimeOutTimes(), timeUnit);
            builder.readTimeout(this.f57301b.getTimeOutTimes(), timeUnit);
            builder.writeTimeout(this.f57301b.getTimeOutTimes(), timeUnit);
            builder.addInterceptor(new TimeoutInterceptor());
            final String[] connectIps = this.f57301b.getConnectIps();
            if (connectIps == null || connectIps.length == 0) {
                okHttpClient = builder.build();
            } else {
                builder.dns(new Dns(this) { // from class: com.tencent.could.component.common.ai.net.OkHttpRequest.1
                    @Override // com.tencent.cloud.p075ai.network.okhttp3.Dns
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
            Response responseExecute = okHttpClient.newCall(requestM82206a).execute();
            int iCode = responseExecute.code();
            if (iCode != 200) {
                throw new RuntimeException("responseCode error: " + iCode);
            }
            if (responseExecute.body() == null) {
                throw new RuntimeException("response.body is null!");
            }
            if (this.f57300a == null) {
                TxNetWorkHelper.getInstance().logError("OkHttpRequest", "callBackListener is null!");
            } else if (HttpHeaderValues.GZIP.equals(responseExecute.header("Content-Encoding"))) {
                this.f57300a.onSuccess(GZipUtils.uncompressToString(responseExecute.body().bytes()));
            } else {
                this.f57300a.onSuccess(responseExecute.body().string());
            }
            responseExecute.close();
        } catch (IOException e) {
            o5d0.m162778a("realExecute error: ", e.getLocalizedMessage());
        }
    }
}
