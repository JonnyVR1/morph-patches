package com.tencent.cloud.p080ai.network.okhttp3;

import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.eclipse.jetty.util.security.Constraint;
import p153l.wtq0;
import p153l.zpg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.n */
/* JADX INFO: loaded from: classes12.dex */
public final class C13928n {

    /* JADX INFO: renamed from: a */
    public final EnumC13934t f57750a;

    /* JADX INFO: renamed from: b */
    public final C13864g f57751b;

    /* JADX INFO: renamed from: c */
    public final List<Certificate> f57752c;

    /* JADX INFO: renamed from: d */
    public final List<Certificate> f57753d;

    public C13928n(EnumC13934t enumC13934t, C13864g c13864g, List<Certificate> list, List<Certificate> list2) {
        this.f57750a = enumC13934t;
        this.f57751b = c13864g;
        this.f57752c = list;
        this.f57753d = list2;
    }

    /* JADX INFO: renamed from: a */
    public static C13928n m83022a(SSLSession sSLSession) throws IOException {
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
        C13864g c13864gM82778a = C13864g.m82778a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            wtq0.m207906a("tlsVersion == null");
            return null;
        }
        if (Constraint.NONE.equals(protocol)) {
            zpg0.m220844a("tlsVersion == NONE");
            return null;
        }
        EnumC13934t enumC13934tM83065a = EnumC13934t.m83065a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        List listM82793a = peerCertificates != null ? C13869c.m82793a(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new C13928n(enumC13934tM83065a, c13864gM82778a, listM82793a, localCertificates != null ? C13869c.m82793a(localCertificates) : Collections.EMPTY_LIST);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13928n)) {
            return false;
        }
        C13928n c13928n = (C13928n) obj;
        return this.f57750a.equals(c13928n.f57750a) && this.f57751b.equals(c13928n.f57751b) && this.f57752c.equals(c13928n.f57752c) && this.f57753d.equals(c13928n.f57753d);
    }

    public int hashCode() {
        return ((((((this.f57750a.hashCode() + 527) * 31) + this.f57751b.hashCode()) * 31) + this.f57752c.hashCode()) * 31) + this.f57753d.hashCode();
    }

    public String toString() {
        return "Handshake{tlsVersion=" + this.f57750a + " cipherSuite=" + this.f57751b + " peerCertificates=" + m83023a(this.f57752c) + " localCertificates=" + m83023a(this.f57753d) + '}';
    }

    /* JADX INFO: renamed from: a */
    public final List<String> m83023a(List<Certificate> list) {
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
}
