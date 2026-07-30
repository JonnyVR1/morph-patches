package com.tencent.cloud.p075ai.network.okhttp3.internal.connection;

import com.tencent.cloud.p075ai.network.okhttp3.C13701g;
import com.tencent.cloud.p075ai.network.okhttp3.C13761j;
import com.tencent.cloud.p075ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractC13704a;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.a */
/* JADX INFO: loaded from: classes13.dex */
public final class C13711a {

    /* JADX INFO: renamed from: a */
    public final List<C13761j> f56473a;

    /* JADX INFO: renamed from: b */
    public int f56474b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f56475c;

    /* JADX INFO: renamed from: d */
    public boolean f56476d;

    public C13711a(List<C13761j> list) {
        this.f56473a = list;
    }

    /* JADX INFO: renamed from: a */
    public C13761j m81641a(SSLSocket sSLSocket) throws UnknownServiceException {
        boolean z;
        C13761j c13761j;
        int i = this.f56474b;
        int size = this.f56473a.size();
        while (true) {
            z = true;
            if (i >= size) {
                c13761j = null;
                break;
            }
            c13761j = this.f56473a.get(i);
            if (c13761j.m81825a(sSLSocket)) {
                this.f56474b = i + 1;
                break;
            }
            i++;
        }
        if (c13761j == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f56476d);
            sb.append(", modes=");
            sb.append(this.f56473a);
            String string = Arrays.toString(sSLSocket.getEnabledProtocols());
            sb.append(", supported protocols=");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i2 = this.f56474b;
        while (true) {
            if (i2 >= this.f56473a.size()) {
                z = false;
                break;
            }
            if (this.f56473a.get(i2).m81825a(sSLSocket)) {
                break;
            }
            i2++;
        }
        this.f56475c = z;
        AbstractC13704a abstractC13704a = AbstractC13704a.f56453a;
        boolean z2 = this.f56476d;
        ((OkHttpClient.C13689a) abstractC13704a).getClass();
        String[] strArrM81620a = c13761j.f56881c != null ? C13706c.m81620a(C13701g.f56433b, sSLSocket.getEnabledCipherSuites(), c13761j.f56881c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrM81620a2 = c13761j.f56882d != null ? C13706c.m81620a(C13706c.f56463i, sSLSocket.getEnabledProtocols(), c13761j.f56882d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iM81602a = C13706c.m81602a(C13701g.f56433b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z2 && iM81602a != -1) {
            String str = supportedCipherSuites[iM81602a];
            int length = strArrM81620a.length;
            String[] strArr = new String[length + 1];
            System.arraycopy(strArrM81620a, 0, strArr, 0, strArrM81620a.length);
            strArr[length] = str;
            strArrM81620a = strArr;
        }
        C13761j.a aVarM81831b = new C13761j.a(c13761j).m81829a(strArrM81620a).m81831b(strArrM81620a2);
        String[] strArr2 = aVarM81831b.f56884b;
        String[] strArr3 = aVarM81831b.f56885c;
        if (strArr3 != null) {
            sSLSocket.setEnabledProtocols(strArr3);
        }
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
        return c13761j;
    }
}
