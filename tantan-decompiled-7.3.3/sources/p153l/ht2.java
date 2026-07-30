package p153l;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes2.dex */
public final class ht2 extends vq4 {

    /* JADX INFO: renamed from: a */
    public final dkj0 f111502a;

    public ht2(dkj0 dkj0Var) {
        this.f111502a = dkj0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m137065a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
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

    @Override // p153l.vq4
    public List<Certificate> clean(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate2 = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate x509CertificateFindByIssuerAndSignature = this.f111502a.findByIssuerAndSignature(x509Certificate2);
            if (x509CertificateFindByIssuerAndSignature != null) {
                if (arrayList.size() > 1 || !x509Certificate2.equals(x509CertificateFindByIssuerAndSignature)) {
                    arrayList.add(x509CertificateFindByIssuerAndSignature);
                }
                if (m137065a(x509CertificateFindByIssuerAndSignature, x509CertificateFindByIssuerAndSignature)) {
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
                } while (!m137065a(x509Certificate2, x509Certificate));
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
        return (obj instanceof ht2) && ((ht2) obj).f111502a.equals(this.f111502a);
    }

    public int hashCode() {
        return this.f111502a.hashCode();
    }
}
