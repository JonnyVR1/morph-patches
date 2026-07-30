package com.tencent.cloud.p080ai.network.okhttp3.internal.tls;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p153l.qxq0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.tls.a */
/* JADX INFO: loaded from: classes12.dex */
public final class C13918a extends AbstractC13920c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13922e f57659a;

    public C13918a(InterfaceC13922e interfaceC13922e) {
        this.f57659a = interfaceC13922e;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.tls.AbstractC13920c
    /* JADX INFO: renamed from: a */
    public List<Certificate> mo82978a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((Certificate) arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate2 = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate x509CertificateMo82981a = this.f57659a.mo82981a(x509Certificate2);
            if (x509CertificateMo82981a != null) {
                if (arrayList.size() > 1 || !x509Certificate2.equals(x509CertificateMo82981a)) {
                    arrayList.add(x509CertificateMo82981a);
                }
                if (m82989a(x509CertificateMo82981a, x509CertificateMo82981a)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                do {
                    if (!it.hasNext()) {
                        if (!z) {
                            qxq0.m178615a("Failed to find a trusted cert that signed ", x509Certificate2);
                            return null;
                        }
                        return arrayList;
                    }
                    x509Certificate = (X509Certificate) it.next();
                } while (!m82989a(x509Certificate2, x509Certificate));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        qxq0.m178615a("Certificate chain too long: ", arrayList);
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C13918a) && ((C13918a) obj).f57659a.equals(this.f57659a);
    }

    public int hashCode() {
        return this.f57659a.hashCode();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m82989a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
