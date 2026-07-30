package com.tencent.cloud.p080ai.network.okhttp3.internal.tls;

import com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.tls.c */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC13920c {
    /* JADX INFO: renamed from: a */
    public static AbstractC13920c m82990a(X509TrustManager x509TrustManager) {
        return C13915c.f57649a.mo82968a(x509TrustManager);
    }

    /* JADX INFO: renamed from: a */
    public abstract List<Certificate> mo82978a(List<Certificate> list, String str);
}
