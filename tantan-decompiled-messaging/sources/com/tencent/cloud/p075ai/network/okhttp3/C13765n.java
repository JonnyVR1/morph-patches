package com.tencent.cloud.p075ai.network.okhttp3;

import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.eclipse.jetty.util.security.Constraint;
import p149l.qkq0;
import p149l.rhg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.n */
/* JADX INFO: loaded from: classes13.dex */
public final class C13765n {

    /* JADX INFO: renamed from: a */
    public final EnumC13771t f56902a;

    /* JADX INFO: renamed from: b */
    public final C13701g f56903b;

    /* JADX INFO: renamed from: c */
    public final List<Certificate> f56904c;

    /* JADX INFO: renamed from: d */
    public final List<Certificate> f56905d;

    public C13765n(EnumC13771t enumC13771t, C13701g c13701g, List<Certificate> list, List<Certificate> list2) {
        this.f56902a = enumC13771t;
        this.f56903b = c13701g;
        this.f56904c = list;
        this.f56905d = list2;
    }

    /* JADX INFO: renamed from: a */
    public static C13765n m81839a(SSLSession sSLSession) throws IOException {
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
        C13701g c13701gM81595a = C13701g.m81595a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            qkq0.m175383a("tlsVersion == null");
            return null;
        }
        if (Constraint.NONE.equals(protocol)) {
            rhg0.m179353a("tlsVersion == NONE");
            return null;
        }
        EnumC13771t enumC13771tM81882a = EnumC13771t.m81882a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        List listM81610a = peerCertificates != null ? C13706c.m81610a(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new C13765n(enumC13771tM81882a, c13701gM81595a, listM81610a, localCertificates != null ? C13706c.m81610a(localCertificates) : Collections.EMPTY_LIST);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13765n)) {
            return false;
        }
        C13765n c13765n = (C13765n) obj;
        return this.f56902a.equals(c13765n.f56902a) && this.f56903b.equals(c13765n.f56903b) && this.f56904c.equals(c13765n.f56904c) && this.f56905d.equals(c13765n.f56905d);
    }

    public int hashCode() {
        return ((((((this.f56902a.hashCode() + 527) * 31) + this.f56903b.hashCode()) * 31) + this.f56904c.hashCode()) * 31) + this.f56905d.hashCode();
    }

    public String toString() {
        return "Handshake{tlsVersion=" + this.f56902a + " cipherSuite=" + this.f56903b + " peerCertificates=" + m81840a(this.f56904c) + " localCertificates=" + m81840a(this.f56905d) + '}';
    }

    /* JADX INFO: renamed from: a */
    public final List<String> m81840a(List<Certificate> list) {
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
