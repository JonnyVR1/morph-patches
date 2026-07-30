package com.tencent.could.component.common.p084ai.net;

import android.text.TextUtils;
import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import com.tencent.could.component.common.p084ai.utils.GZipUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes12.dex */
public class JsonHttpRequest implements IHttpRequest {

    /* JADX INFO: renamed from: a */
    public volatile CallBackListener f58148a;

    /* JADX INFO: renamed from: b */
    public NetWorkParam f58149b;

    /* JADX INFO: renamed from: c */
    public boolean f58150c = false;

    /* JADX INFO: renamed from: d */
    public boolean f58151d = false;

    /* JADX INFO: renamed from: e */
    public boolean f58152e = false;

    /* JADX INFO: renamed from: f */
    public int f58153f = 0;

    /* JADX INFO: renamed from: a */
    public final void m83388a(HttpURLConnection httpURLConnection, NetWorkParam netWorkParam) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        String requestData = netWorkParam.getRequestData() == null ? null : netWorkParam.getRequestData();
        byte[] bArrCompress = netWorkParam.isGzip() ? GZipUtils.compress(requestData) : requestData.getBytes("UTF-8");
        if (bArrCompress != null) {
            TxNetWorkHelper.getInstance().logDebug("JsonHttpRequest", "start write bytes size: " + bArrCompress.length);
        }
        bufferedOutputStream.write(bArrCompress);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        outputStream.close();
        TxNetWorkHelper.getInstance().logDebug("JsonHttpRequest", "end write bytes!");
    }

    @Override // com.tencent.could.component.common.p084ai.net.IHttpRequest
    public void cleanExecute() {
        synchronized (JsonHttpRequest.class) {
            try {
                if (this.f58148a != null) {
                    this.f58148a.cleanListener();
                    this.f58148a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    @Override // com.tencent.could.component.common.p084ai.net.IHttpRequest
    public void execute() throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        HttpURLConnection httpURLConnection;
        TxNetWorkHelper.getInstance().logDebug("JsonHttpRequest", "start newExecuteHttpConnect!");
        if (this.f58148a == null) {
            TxNetWorkHelper.getInstance().logError("JsonHttpRequest", "callBackListener is null!");
            return;
        }
        HttpsURLConnection httpsURLConnection = null;
        try {
            try {
                final String url = this.f58149b.getUrl();
                if (!this.f58150c || TextUtils.isEmpty(this.f58149b.getDeputyUrl())) {
                    z = false;
                } else {
                    TxNetWorkHelper.getInstance().logError("JsonHttpRequest", "use DeputyUrl");
                    url = this.f58149b.getDeputyUrl();
                    z = true;
                }
                if (!this.f58151d || TextUtils.isEmpty(this.f58149b.getBackUpIpStringUrl())) {
                    z2 = false;
                } else {
                    TxNetWorkHelper.getInstance().logError("JsonHttpRequest", "use backUpIpStringUrl");
                    url = this.f58149b.getBackUpIpStringUrl();
                    z2 = true;
                }
                if (!this.f58152e || this.f58149b.getBackUpIpStringUrls() == null) {
                    z3 = false;
                } else {
                    String[] backUpIpStringUrls = this.f58149b.getBackUpIpStringUrls();
                    int i = this.f58153f;
                    if (i >= backUpIpStringUrls.length || TextUtils.isEmpty(backUpIpStringUrls[i])) {
                        z3 = false;
                    } else {
                        TxNetWorkHelper.getInstance().logError("JsonHttpRequest", "use backup ip urls, index: " + this.f58153f);
                        url = backUpIpStringUrls[this.f58153f];
                        z3 = true;
                    }
                }
                TxNetWorkHelper.getInstance().logDebug("JsonHttpRequest", "connect url: " + url);
                URL url2 = new URL(url);
                if (url.startsWith("https")) {
                    HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) url2.openConnection();
                    try {
                        final String httpsVerifyHost = this.f58149b.getHttpsVerifyHost();
                        if (!z2 && !z3 && !z) {
                            if (TextUtils.isEmpty(this.f58149b.getDeputyUrl())) {
                                TxNetWorkHelper.getInstance().logDebug("JsonHttpRequest", "deputy url is empty.");
                            } else {
                                httpsVerifyHost = new URL(this.f58149b.getDeputyUrl()).getHost();
                                TxNetWorkHelper.getInstance().logDebug("JsonHttpRequest", "verify host url is: " + httpsVerifyHost);
                            }
                        }
                        if (!TextUtils.isEmpty(httpsVerifyHost)) {
                            httpsURLConnection2.setRequestProperty("Host", httpsVerifyHost);
                            httpsURLConnection2.setSSLSocketFactory(new TxcSniSocketFactory(httpsURLConnection2));
                            httpsURLConnection2.setHostnameVerifier(new HostnameVerifier(this) { // from class: com.tencent.could.component.common.ai.net.JsonHttpRequest.1
                                @Override // javax.net.ssl.HostnameVerifier
                                public boolean verify(String str, SSLSession sSLSession) {
                                    TxNetWorkHelper.getInstance().logError("JsonHttpRequest", "verify input host: " + str + " session:");
                                    String str2 = httpsVerifyHost;
                                    boolean zVerify = HttpsURLConnection.getDefaultHostnameVerifier().verify(str2, sSLSession);
                                    TxNetWorkHelper.getInstance().logError("JsonHttpRequest", "verify: " + str2 + " isSuccess: " + zVerify + " checkHost: " + httpsVerifyHost);
                                    TxNetWorkHelper txNetWorkHelper = TxNetWorkHelper.getInstance();
                                    StringBuilder sb = new StringBuilder("current verify url: ");
                                    sb.append(url);
                                    txNetWorkHelper.logError("JsonHttpRequest", sb.toString());
                                    return zVerify;
                                }
                            });
                        }
                        httpURLConnection = httpsURLConnection2;
                    } catch (IOException e) {
                        e = e;
                        throw new RuntimeException("network error IOException e : " + e.getMessage());
                    } catch (Throwable th) {
                        th = th;
                        httpsURLConnection = httpsURLConnection2;
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                } else {
                    httpURLConnection = (HttpURLConnection) url2.openConnection();
                }
                httpURLConnection.setConnectTimeout(this.f58149b.getTimeOutTimes());
                httpURLConnection.setReadTimeout(this.f58149b.getTimeOutTimes());
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Content-Type", FastJsonJsonView.DEFAULT_CONTENT_TYPE);
                HashMap<String, String> requestHeaders = this.f58149b.getRequestHeaders();
                if (requestHeaders != null) {
                    for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                if (this.f58149b.isGzip()) {
                    httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, HttpHeaderValues.GZIP);
                    httpURLConnection.setRequestProperty("Content-Encoding", HttpHeaderValues.GZIP);
                }
                HttpMethod httpMethod = this.f58149b.getHttpMethod();
                HttpMethod httpMethod2 = HttpMethod.POST;
                if (httpMethod == httpMethod2) {
                    httpURLConnection.setRequestMethod("POST");
                }
                if (this.f58149b.getHttpMethod() == HttpMethod.GET) {
                    httpURLConnection.setRequestMethod("GET");
                }
                TxNetWorkHelper.getInstance().logDebug("JsonHttpRequest", "do connect!");
                httpURLConnection.connect();
                if (this.f58149b.getHttpMethod() == httpMethod2) {
                    TxNetWorkHelper.getInstance().logDebug("JsonHttpRequest", "sendPostDateWithCheckGzip!");
                    m83388a(httpURLConnection, this.f58149b);
                }
                if (httpURLConnection.getResponseCode() != 200) {
                    throw new RuntimeException("network error, responseCode:" + httpURLConnection.getResponseCode());
                }
                TxNetWorkHelper.getInstance().logDebug("JsonHttpRequest", "get ResponseCode! ok");
                InputStream inputStream = httpURLConnection.getInputStream();
                TxNetWorkHelper.getInstance().logDebug("JsonHttpRequest", "get net InputStream");
                if (this.f58148a != null) {
                    this.f58148a.onSuccess(inputStream, HttpHeaderValues.GZIP.equals(httpURLConnection.getContentEncoding()));
                }
                httpURLConnection.disconnect();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public CallBackListener getCallBackListener() {
        return this.f58148a;
    }

    @Override // com.tencent.could.component.common.p084ai.net.IHttpRequest
    public NetWorkParam getNetWorkParam() {
        return this.f58149b;
    }

    @Override // com.tencent.could.component.common.p084ai.net.IHttpRequest
    public void setListener(CallBackListener callBackListener) {
        this.f58148a = callBackListener;
    }

    @Override // com.tencent.could.component.common.p084ai.net.IHttpRequest
    public void setNeedIpBackUrl(boolean z) {
        this.f58151d = z;
    }

    @Override // com.tencent.could.component.common.p084ai.net.IHttpRequest
    public void setNeedIpBackUrls(boolean z, int i) {
        this.f58152e = z;
        this.f58153f = i;
    }

    @Override // com.tencent.could.component.common.p084ai.net.IHttpRequest
    public void setNeedUseDeputy(boolean z) {
        this.f58150c = z;
    }

    @Override // com.tencent.could.component.common.p084ai.net.IHttpRequest
    public void setNetWorkParam(NetWorkParam netWorkParam) {
        this.f58149b = netWorkParam;
    }
}
