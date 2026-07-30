package io.agora.utils2;

import io.agora.base.internal.CalledByNative;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class HttpRequest {
    private HashMap<String, String> headers = new HashMap<>();
    private Proxy httpProxy;
    private HttpAsyncTask httpTask;

    @CalledByNative
    public HttpRequest(long j, String str, int i) {
        this.httpTask = null;
        this.httpProxy = null;
        if (!str.isEmpty()) {
            this.httpProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i));
        }
        this.httpTask = new HttpAsyncTask(j);
    }

    @CalledByNative
    public void addHeader(String str, String str2) {
        this.headers.put(str, str2);
    }

    @CalledByNative
    public boolean send(String str, String str2, String str3, String str4, String str5, byte[] bArr, int i) {
        HttpAsyncTaskParam httpAsyncTaskParam = new HttpAsyncTaskParam();
        httpAsyncTaskParam.fullUrl = str;
        httpAsyncTaskParam.method = str2;
        httpAsyncTaskParam.user = str3;
        httpAsyncTaskParam.pass = str4;
        httpAsyncTaskParam.agent = str5;
        httpAsyncTaskParam.body = bArr;
        httpAsyncTaskParam.httpProxy = this.httpProxy;
        httpAsyncTaskParam.headers = this.headers;
        httpAsyncTaskParam.timeout_millsec = i;
        this.httpTask.execute(httpAsyncTaskParam);
        return true;
    }
}
