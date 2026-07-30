package com.tencent.cloud.p080ai.network.okhttp3.internal.connection;

import com.tencent.cloud.p080ai.network.okhttp3.C13864g;
import com.tencent.cloud.p080ai.network.okhttp3.C13924j;
import com.tencent.cloud.p080ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractC13867a;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.a */
/* JADX INFO: loaded from: classes12.dex */
public final class C13874a {

    /* JADX INFO: renamed from: a */
    public final List<C13924j> f57321a;

    /* JADX INFO: renamed from: b */
    public int f57322b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f57323c;

    /* JADX INFO: renamed from: d */
    public boolean f57324d;

    public C13874a(List<C13924j> list) {
        this.f57321a = list;
    }

    /* JADX INFO: renamed from: a */
    public C13924j m82824a(SSLSocket sSLSocket) throws UnknownServiceException {
        boolean z;
        C13924j c13924j;
        int i = this.f57322b;
        int size = this.f57321a.size();
        while (true) {
            z = true;
            if (i >= size) {
                c13924j = null;
                break;
            }
            c13924j = this.f57321a.get(i);
            if (c13924j.m83008a(sSLSocket)) {
                this.f57322b = i + 1;
                break;
            }
            i++;
        }
        if (c13924j == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f57324d);
            sb.append(", modes=");
            sb.append(this.f57321a);
            String string = Arrays.toString(sSLSocket.getEnabledProtocols());
            sb.append(", supported protocols=");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i2 = this.f57322b;
        while (true) {
            if (i2 >= this.f57321a.size()) {
                z = false;
                break;
            }
            if (this.f57321a.get(i2).m83008a(sSLSocket)) {
                break;
            }
            i2++;
        }
        this.f57323c = z;
        AbstractC13867a abstractC13867a = AbstractC13867a.f57301a;
        boolean z2 = this.f57324d;
        ((OkHttpClient.C13852a) abstractC13867a).getClass();
        String[] strArrM82803a = c13924j.f57729c != null ? C13869c.m82803a(C13864g.f57281b, sSLSocket.getEnabledCipherSuites(), c13924j.f57729c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrM82803a2 = c13924j.f57730d != null ? C13869c.m82803a(C13869c.f57311i, sSLSocket.getEnabledProtocols(), c13924j.f57730d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iM82785a = C13869c.m82785a(C13864g.f57281b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z2 && iM82785a != -1) {
            String str = supportedCipherSuites[iM82785a];
            int length = strArrM82803a.length;
            String[] strArr = new String[length + 1];
            System.arraycopy(strArrM82803a, 0, strArr, 0, strArrM82803a.length);
            strArr[length] = str;
            strArrM82803a = strArr;
        }
        C13924j.a aVarM83014b = new C13924j.a(c13924j).m83012a(strArrM82803a).m83014b(strArrM82803a2);
        String[] strArr2 = aVarM83014b.f57732b;
        String[] strArr3 = aVarM83014b.f57733c;
        if (strArr3 != null) {
            sSLSocket.setEnabledProtocols(strArr3);
        }
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
        return c13924j;
    }
}
