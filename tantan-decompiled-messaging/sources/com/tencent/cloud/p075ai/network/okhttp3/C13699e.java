package com.tencent.cloud.p075ai.network.okhttp3;

import com.tencent.cloud.p075ai.network.okhttp3.internal.tls.AbstractC13757c;
import com.tencent.cloud.p075ai.network.okio.ByteString;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p149l.ig3;
import p149l.xp4;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.e */
/* JADX INFO: loaded from: classes13.dex */
public final class C13699e {

    /* JADX INFO: renamed from: c */
    public static final C13699e f56425c = new C13699e(new LinkedHashSet(new ArrayList()), null);

    /* JADX INFO: renamed from: a */
    public final Set<a> f56426a;

    /* JADX INFO: renamed from: b */
    public final AbstractC13757c f56427b;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f56428a;

        /* JADX INFO: renamed from: b */
        public final String f56429b;

        /* JADX INFO: renamed from: c */
        public final ByteString f56430c;

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                throw null;
            }
            return false;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            throw null;
        }
    }

    public C13699e(Set<a> set, AbstractC13757c abstractC13757c) {
        this.f56426a = set;
        this.f56427b = abstractC13757c;
    }

    /* JADX INFO: renamed from: a */
    public void m81593a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List list2 = Collections.EMPTY_LIST;
        Iterator<a> it = this.f56426a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw null;
        }
        if (list2.isEmpty()) {
            return;
        }
        AbstractC13757c abstractC13757c = this.f56427b;
        if (abstractC13757c != null) {
            list = abstractC13757c.mo81795a(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = list2.size();
            ByteString byteStringSha256 = null;
            ByteString byteStringSha1 = null;
            for (int i2 = 0; i2 < size2; i2++) {
                a aVar = (a) list2.get(i2);
                if (aVar.f56429b.equals("sha256/")) {
                    if (byteStringSha256 == null) {
                        byteStringSha256 = ByteString.m81885of(x509Certificate.getPublicKey().getEncoded()).sha256();
                    }
                    if (aVar.f56430c.equals(byteStringSha256)) {
                        return;
                    }
                } else {
                    if (!aVar.f56429b.equals("sha1/")) {
                        xp4.m210459a("unsupported hashAlgorithm: ", aVar.f56429b);
                        return;
                    }
                    if (byteStringSha1 == null) {
                        byteStringSha1 = ByteString.m81885of(x509Certificate.getPublicKey().getEncoded()).sha1();
                    }
                    if (aVar.f56430c.equals(byteStringSha1)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
            sb.append("\n    ");
            sb.append(m81591a(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            a aVar2 = (a) list2.get(i4);
            sb.append("\n    ");
            sb.append(aVar2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13699e)) {
            return false;
        }
        C13699e c13699e = (C13699e) obj;
        return Objects.equals(this.f56427b, c13699e.f56427b) && this.f56426a.equals(c13699e.f56426a);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f56427b) * 31) + this.f56426a.hashCode();
    }

    /* JADX INFO: renamed from: a */
    public C13699e m81592a(AbstractC13757c abstractC13757c) {
        return Objects.equals(this.f56427b, abstractC13757c) ? this : new C13699e(this.f56426a, abstractC13757c);
    }

    /* JADX INFO: renamed from: a */
    public static String m81591a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + ByteString.m81885of(((X509Certificate) certificate).getPublicKey().getEncoded()).sha256().base64();
        }
        ig3.m135964a("Certificate pinning requires X509 certificates");
        return null;
    }
}
