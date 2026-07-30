package com.tencent.cloud.p080ai.network.okhttp3;

import com.tencent.cloud.p080ai.network.okhttp3.internal.tls.AbstractC13920c;
import com.tencent.cloud.p080ai.network.okio.ByteString;
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
import p153l.wg3;
import p153l.wq4;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.e */
/* JADX INFO: loaded from: classes12.dex */
public final class C13862e {

    /* JADX INFO: renamed from: c */
    public static final C13862e f57273c = new C13862e(new LinkedHashSet(new ArrayList()), null);

    /* JADX INFO: renamed from: a */
    public final Set<a> f57274a;

    /* JADX INFO: renamed from: b */
    public final AbstractC13920c f57275b;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f57276a;

        /* JADX INFO: renamed from: b */
        public final String f57277b;

        /* JADX INFO: renamed from: c */
        public final ByteString f57278c;

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

    public C13862e(Set<a> set, AbstractC13920c abstractC13920c) {
        this.f57274a = set;
        this.f57275b = abstractC13920c;
    }

    /* JADX INFO: renamed from: a */
    public void m82776a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List list2 = Collections.EMPTY_LIST;
        Iterator<a> it = this.f57274a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw null;
        }
        if (list2.isEmpty()) {
            return;
        }
        AbstractC13920c abstractC13920c = this.f57275b;
        if (abstractC13920c != null) {
            list = abstractC13920c.mo82978a(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = list2.size();
            ByteString byteStringSha256 = null;
            ByteString byteStringSha1 = null;
            for (int i2 = 0; i2 < size2; i2++) {
                a aVar = (a) list2.get(i2);
                if (aVar.f57277b.equals("sha256/")) {
                    if (byteStringSha256 == null) {
                        byteStringSha256 = ByteString.m83068of(x509Certificate.getPublicKey().getEncoded()).sha256();
                    }
                    if (aVar.f57278c.equals(byteStringSha256)) {
                        return;
                    }
                } else {
                    if (!aVar.f57277b.equals("sha1/")) {
                        wq4.m207499a("unsupported hashAlgorithm: ", aVar.f57277b);
                        return;
                    }
                    if (byteStringSha1 == null) {
                        byteStringSha1 = ByteString.m83068of(x509Certificate.getPublicKey().getEncoded()).sha1();
                    }
                    if (aVar.f57278c.equals(byteStringSha1)) {
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
            sb.append(m82774a(x509Certificate2));
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
        if (!(obj instanceof C13862e)) {
            return false;
        }
        C13862e c13862e = (C13862e) obj;
        return Objects.equals(this.f57275b, c13862e.f57275b) && this.f57274a.equals(c13862e.f57274a);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f57275b) * 31) + this.f57274a.hashCode();
    }

    /* JADX INFO: renamed from: a */
    public C13862e m82775a(AbstractC13920c abstractC13920c) {
        return Objects.equals(this.f57275b, abstractC13920c) ? this : new C13862e(this.f57274a, abstractC13920c);
    }

    /* JADX INFO: renamed from: a */
    public static String m82774a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + ByteString.m83068of(((X509Certificate) certificate).getPublicKey().getEncoded()).sha256().base64();
        }
        wg3.m206174a("Certificate pinning requires X509 certificates");
        return null;
    }
}
