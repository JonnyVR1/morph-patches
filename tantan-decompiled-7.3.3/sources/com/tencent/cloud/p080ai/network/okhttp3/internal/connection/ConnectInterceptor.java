package com.tencent.cloud.p080ai.network.okhttp3.internal.connection;

import com.tencent.cloud.p080ai.network.helper.AiOkHttpHelper;
import com.tencent.cloud.p080ai.network.okhttp3.Interceptor;
import com.tencent.cloud.p080ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p080ai.network.okhttp3.Request;
import com.tencent.cloud.p080ai.network.okhttp3.Response;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http.RealInterceptorChain;
import java.io.IOException;
import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes12.dex */
public final class ConnectInterceptor implements Interceptor {
    public final OkHttpClient client;

    public ConnectInterceptor(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.request();
        C13883j c13883jTransmitter = realInterceptorChain.transmitter();
        boolean z = !request.method().equals("GET");
        synchronized (c13883jTransmitter.f57393b) {
            if (c13883jTransmitter.f57406o) {
                throw new IllegalStateException("released");
            }
            if (c13883jTransmitter.f57401j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        C13876c c13876c = c13883jTransmitter.f57399h;
        OkHttpClient okHttpClient = c13883jTransmitter.f57392a;
        c13876c.getClass();
        try {
            InterfaceC13885a interfaceC13885aM82838a = c13876c.m82834a(chain.connectTimeoutMillis(), chain.readTimeoutMillis(), chain.writeTimeoutMillis(), okHttpClient.pingIntervalMillis(), okHttpClient.retryOnConnectionFailure(), z).m82838a(okHttpClient, chain);
            InetSocketAddress inetSocketAddress = interfaceC13885aM82838a.connection().f57355c.f57792c;
            if (inetSocketAddress != null) {
                AiOkHttpHelper.getInstance().logInfo("socketAddress:" + inetSocketAddress);
            }
            C13875b c13875b = new C13875b(c13883jTransmitter, c13883jTransmitter.f57394c, c13883jTransmitter.f57395d, c13883jTransmitter.f57399h, interfaceC13885aM82838a);
            synchronized (c13883jTransmitter.f57393b) {
                c13883jTransmitter.f57401j = c13875b;
                c13883jTransmitter.f57402k = false;
                c13883jTransmitter.f57403l = false;
            }
            return realInterceptorChain.proceed(request, c13883jTransmitter, c13875b);
        } catch (C13881h e) {
            c13876c.m82837d();
            throw e;
        } catch (IOException e2) {
            c13876c.m82837d();
            throw new C13881h(e2);
        }
    }
}
