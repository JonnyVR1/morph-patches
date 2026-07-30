package p153l;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes2.dex */
public final class st2 implements dkj0 {

    /* JADX INFO: renamed from: a */
    public final Map<X500Principal, Set<X509Certificate>> f170541a = new LinkedHashMap();

    public st2(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> linkedHashSet = this.f170541a.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>(1);
                this.f170541a.put(subjectX500Principal, linkedHashSet);
            }
            linkedHashSet.add(x509Certificate);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof st2) && ((st2) obj).f170541a.equals(this.f170541a);
    }

    @Override // p153l.dkj0
    public X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f170541a.get(x509Certificate.getIssuerX500Principal());
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

    public int hashCode() {
        return this.f170541a.hashCode();
    }
}
