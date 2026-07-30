package p149l;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes2.dex */
public final class rs2 extends wp4 {

    /* JADX INFO: renamed from: a */
    public final zaj0 f160802a;

    public rs2(zaj0 zaj0Var) {
        this.f160802a = zaj0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m180615a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
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

    @Override // p149l.wp4
    public List<Certificate> clean(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate2 = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate x509CertificateFindByIssuerAndSignature = this.f160802a.findByIssuerAndSignature(x509Certificate2);
            if (x509CertificateFindByIssuerAndSignature != null) {
                if (arrayList.size() > 1 || !x509Certificate2.equals(x509CertificateFindByIssuerAndSignature)) {
                    arrayList.add(x509CertificateFindByIssuerAndSignature);
                }
                if (m180615a(x509CertificateFindByIssuerAndSignature, x509CertificateFindByIssuerAndSignature)) {
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
                } while (!m180615a(x509Certificate2, x509Certificate));
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
        return (obj instanceof rs2) && ((rs2) obj).f160802a.equals(this.f160802a);
    }

    public int hashCode() {
        return this.f160802a.hashCode();
    }
}
