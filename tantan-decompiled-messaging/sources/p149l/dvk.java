package p149l;

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
public final class dvk {

    /* JADX INFO: renamed from: a */
    public final TlsVersion f88064a;

    /* JADX INFO: renamed from: b */
    public final v35 f88065b;

    /* JADX INFO: renamed from: c */
    public final List<Certificate> f88066c;

    /* JADX INFO: renamed from: d */
    public final List<Certificate> f88067d;

    public dvk(TlsVersion tlsVersion, v35 v35Var, List<Certificate> list, List<Certificate> list2) {
        this.f88064a = tlsVersion;
        this.f88065b = v35Var;
        this.f88066c = list;
        this.f88067d = list2;
    }

    /* JADX INFO: renamed from: b */
    public static dvk m113782b(SSLSession sSLSession) throws IOException {
        String cipherSuite = sSLSession.getCipherSuite();
        Certificate[] peerCertificates = null;
        if (cipherSuite == null) {
            qkq0.m175383a("cipherSuite == null");
            return null;
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            rhg0.m179353a("cipherSuite == SSL_NULL_WITH_NULL_NULL");
            return null;
        }
        v35 v35VarM196826b = v35.m196826b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            qkq0.m175383a("tlsVersion == null");
            return null;
        }
        if (Constraint.NONE.equals(protocol)) {
            rhg0.m179353a("tlsVersion == NONE");
            return null;
        }
        TlsVersion tlsVersionForJavaName = TlsVersion.forJavaName(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        List listM188020u = peerCertificates != null ? tck0.m188020u(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new dvk(tlsVersionForJavaName, v35VarM196826b, listM188020u, localCertificates != null ? tck0.m188020u(localCertificates) : Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: c */
    public static dvk m113783c(TlsVersion tlsVersion, v35 v35Var, List<Certificate> list, List<Certificate> list2) {
        if (tlsVersion == null) {
            jfd0.m141176a("tlsVersion == null");
            return null;
        }
        if (v35Var != null) {
            return new dvk(tlsVersion, v35Var, tck0.m188019t(list), tck0.m188019t(list2));
        }
        jfd0.m141176a("cipherSuite == null");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public v35 m113784a() {
        return this.f88065b;
    }

    /* JADX INFO: renamed from: d */
    public List<Certificate> m113785d() {
        return this.f88067d;
    }

    /* JADX INFO: renamed from: e */
    public final List<String> m113786e(List<Certificate> list) {
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
        if (!(obj instanceof dvk)) {
            return false;
        }
        dvk dvkVar = (dvk) obj;
        return this.f88064a.equals(dvkVar.f88064a) && this.f88065b.equals(dvkVar.f88065b) && this.f88066c.equals(dvkVar.f88066c) && this.f88067d.equals(dvkVar.f88067d);
    }

    /* JADX INFO: renamed from: f */
    public List<Certificate> m113787f() {
        return this.f88066c;
    }

    /* JADX INFO: renamed from: g */
    public TlsVersion m113788g() {
        return this.f88064a;
    }

    public int hashCode() {
        return ((((((527 + this.f88064a.hashCode()) * 31) + this.f88065b.hashCode()) * 31) + this.f88066c.hashCode()) * 31) + this.f88067d.hashCode();
    }

    public String toString() {
        return "Handshake{tlsVersion=" + this.f88064a + " cipherSuite=" + this.f88065b + " peerCertificates=" + m113786e(this.f88066c) + " localCertificates=" + m113786e(this.f88067d) + '}';
    }
}
