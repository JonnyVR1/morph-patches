package com.tencent.cloud.p075ai.network.okhttp3.internal.tls;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p149l.koq0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.tls.a */
/* JADX INFO: loaded from: classes13.dex */
public final class C13755a extends AbstractC13757c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13759e f56811a;

    public C13755a(InterfaceC13759e interfaceC13759e) {
        this.f56811a = interfaceC13759e;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.tls.AbstractC13757c
    /* JADX INFO: renamed from: a */
    public List<Certificate> mo81795a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((Certificate) arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate2 = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate x509CertificateMo81798a = this.f56811a.mo81798a(x509Certificate2);
            if (x509CertificateMo81798a != null) {
                if (arrayList.size() > 1 || !x509Certificate2.equals(x509CertificateMo81798a)) {
                    arrayList.add(x509CertificateMo81798a);
                }
                if (m81806a(x509CertificateMo81798a, x509CertificateMo81798a)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                do {
                    if (!it.hasNext()) {
                        if (!z) {
                            koq0.m146754a("Failed to find a trusted cert that signed ", x509Certificate2);
                            return null;
                        }
                        return arrayList;
                    }
                    x509Certificate = (X509Certificate) it.next();
                } while (!m81806a(x509Certificate2, x509Certificate));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        koq0.m146754a("Certificate chain too long: ", arrayList);
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C13755a) && ((C13755a) obj).f56811a.equals(this.f56811a);
    }

    public int hashCode() {
        return this.f56811a.hashCode();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81806a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
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
