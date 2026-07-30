package com.tencent.cloud.p075ai.network.okhttp3.internal.connection;

import com.tencent.cloud.p075ai.network.helper.AiOkHttpHelper;
import com.tencent.cloud.p075ai.network.okhttp3.Interceptor;
import com.tencent.cloud.p075ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p075ai.network.okhttp3.Request;
import com.tencent.cloud.p075ai.network.okhttp3.Response;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http.RealInterceptorChain;
import java.io.IOException;
import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes13.dex */
public final class ConnectInterceptor implements Interceptor {
    public final OkHttpClient client;

    public ConnectInterceptor(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.request();
        C13720j c13720jTransmitter = realInterceptorChain.transmitter();
        boolean z = !request.method().equals("GET");
        synchronized (c13720jTransmitter.f56545b) {
            if (c13720jTransmitter.f56558o) {
                throw new IllegalStateException("released");
            }
            if (c13720jTransmitter.f56553j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        C13713c c13713c = c13720jTransmitter.f56551h;
        OkHttpClient okHttpClient = c13720jTransmitter.f56544a;
        c13713c.getClass();
        try {
            InterfaceC13722a interfaceC13722aM81655a = c13713c.m81651a(chain.connectTimeoutMillis(), chain.readTimeoutMillis(), chain.writeTimeoutMillis(), okHttpClient.pingIntervalMillis(), okHttpClient.retryOnConnectionFailure(), z).m81655a(okHttpClient, chain);
            InetSocketAddress inetSocketAddress = interfaceC13722aM81655a.connection().f56507c.f56944c;
            if (inetSocketAddress != null) {
                AiOkHttpHelper.getInstance().logInfo("socketAddress:" + inetSocketAddress);
            }
            C13712b c13712b = new C13712b(c13720jTransmitter, c13720jTransmitter.f56546c, c13720jTransmitter.f56547d, c13720jTransmitter.f56551h, interfaceC13722aM81655a);
            synchronized (c13720jTransmitter.f56545b) {
                c13720jTransmitter.f56553j = c13712b;
                c13720jTransmitter.f56554k = false;
                c13720jTransmitter.f56555l = false;
            }
            return realInterceptorChain.proceed(request, c13720jTransmitter, c13712b);
        } catch (C13718h e) {
            c13713c.m81654d();
            throw e;
        } catch (IOException e2) {
            c13713c.m81654d();
            throw new C13718h(e2);
        }
    }
}
