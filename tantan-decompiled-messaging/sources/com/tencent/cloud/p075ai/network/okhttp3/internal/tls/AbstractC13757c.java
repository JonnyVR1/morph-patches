package com.tencent.cloud.p075ai.network.okhttp3.internal.tls;

import com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.tls.c */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC13757c {
    /* JADX INFO: renamed from: a */
    public static AbstractC13757c m81807a(X509TrustManager x509TrustManager) {
        return C13752c.f56801a.mo81785a(x509TrustManager);
    }

    /* JADX INFO: renamed from: a */
    public abstract List<Certificate> mo81795a(List<Certificate> list, String str);
}
