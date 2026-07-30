package com.tencent.cloud.p075ai.network.okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.tls.b */
/* JADX INFO: loaded from: classes13.dex */
public final class C13756b implements InterfaceC13759e {

    /* JADX INFO: renamed from: a */
    public final Map<X500Principal, Set<X509Certificate>> f56812a = new LinkedHashMap();

    public C13756b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> linkedHashSet = this.f56812a.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>(1);
                this.f56812a.put(subjectX500Principal, linkedHashSet);
            }
            linkedHashSet.add(x509Certificate);
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.tls.InterfaceC13759e
    /* JADX INFO: renamed from: a */
    public X509Certificate mo81798a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f56812a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C13756b) && ((C13756b) obj).f56812a.equals(this.f56812a);
    }

    public int hashCode() {
        return this.f56812a.hashCode();
    }
}
