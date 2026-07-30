package p153l;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.TlsVersion;
import org.eclipse.jetty.util.security.Constraint;

/* JADX INFO: loaded from: classes2.dex */
public final class txk {

    /* JADX INFO: renamed from: a */
    public final TlsVersion f176563a;

    /* JADX INFO: renamed from: b */
    public final w45 f176564b;

    /* JADX INFO: renamed from: c */
    public final List<Certificate> f176565c;

    /* JADX INFO: renamed from: d */
    public final List<Certificate> f176566d;

    public txk(TlsVersion tlsVersion, w45 w45Var, List<Certificate> list, List<Certificate> list2) {
        this.f176563a = tlsVersion;
        this.f176564b = w45Var;
        this.f176565c = list;
        this.f176566d = list2;
    }

    /* JADX INFO: renamed from: b */
    public static txk m193501b(SSLSession sSLSession) throws IOException {
        String cipherSuite = sSLSession.getCipherSuite();
        Certificate[] peerCertificates = null;
        if (cipherSuite == null) {
            wtq0.m207906a("cipherSuite == null");
            return null;
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            zpg0.m220844a("cipherSuite == SSL_NULL_WITH_NULL_NULL");
            return null;
        }
        w45 w45VarM204819b = w45.m204819b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            wtq0.m207906a("tlsVersion == null");
            return null;
        }
        if (Constraint.NONE.equals(protocol)) {
            zpg0.m220844a("tlsVersion == NONE");
            return null;
        }
        TlsVersion tlsVersionForJavaName = TlsVersion.forJavaName(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        List listM220259u = peerCertificates != null ? zlk0.m220259u(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new txk(tlsVersionForJavaName, w45VarM204819b, listM220259u, localCertificates != null ? zlk0.m220259u(localCertificates) : Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: c */
    public static txk m193502c(TlsVersion tlsVersion, w45 w45Var, List<Certificate> list, List<Certificate> list2) {
        if (tlsVersion == null) {
            mnd0.m159157a("tlsVersion == null");
            return null;
        }
        if (w45Var != null) {
            return new txk(tlsVersion, w45Var, zlk0.m220258t(list), zlk0.m220258t(list2));
        }
        mnd0.m159157a("cipherSuite == null");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public w45 m193503a() {
        return this.f176564b;
    }

    /* JADX INFO: renamed from: d */
    public List<Certificate> m193504d() {
        return this.f176566d;
    }

    /* JADX INFO: renamed from: e */
    public final List<String> m193505e(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : list) {
            if (certificate instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) certificate).getSubjectDN()));
            } else {
                arrayList.add(certificate.getType());
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof txk)) {
            return false;
        }
        txk txkVar = (txk) obj;
        return this.f176563a.equals(txkVar.f176563a) && this.f176564b.equals(txkVar.f176564b) && this.f176565c.equals(txkVar.f176565c) && this.f176566d.equals(txkVar.f176566d);
    }

    /* JADX INFO: renamed from: f */
    public List<Certificate> m193506f() {
        return this.f176565c;
    }

    /* JADX INFO: renamed from: g */
    public TlsVersion m193507g() {
        return this.f176563a;
    }

    public int hashCode() {
        return ((((((527 + this.f176563a.hashCode()) * 31) + this.f176564b.hashCode()) * 31) + this.f176565c.hashCode()) * 31) + this.f176566d.hashCode();
    }

    public String toString() {
        return "Handshake{tlsVersion=" + this.f176563a + " cipherSuite=" + this.f176564b + " peerCertificates=" + m193505e(this.f176565c) + " localCertificates=" + m193505e(this.f176566d) + '}';
    }
}
