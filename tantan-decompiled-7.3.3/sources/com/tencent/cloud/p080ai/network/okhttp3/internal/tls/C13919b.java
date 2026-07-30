package com.tencent.cloud.p080ai.network.okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.tls.b */
/* JADX INFO: loaded from: classes12.dex */
public final class C13919b implements InterfaceC13922e {

    /* JADX INFO: renamed from: a */
    public final Map<X500Principal, Set<X509Certificate>> f57660a = new LinkedHashMap();

    public C13919b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> linkedHashSet = this.f57660a.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>(1);
                this.f57660a.put(subjectX500Principal, linkedHashSet);
            }
            linkedHashSet.add(x509Certificate);
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.tls.InterfaceC13922e
    /* JADX INFO: renamed from: a */
    public X509Certificate mo82981a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f57660a.get(x509Certificate.getIssuerX500Principal());
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
        return (obj instanceof C13919b) && ((C13919b) obj).f57660a.equals(this.f57660a);
    }

    public int hashCode() {
        return this.f57660a.hashCode();
    }
}
