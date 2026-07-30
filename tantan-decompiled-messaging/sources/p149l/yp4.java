package p149l;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class yp4 {

    /* JADX INFO: renamed from: c */
    public static final yp4 f199387c = new C21458a().m215575b();

    /* JADX INFO: renamed from: a */
    public final Set<C21459b> f199388a;

    /* JADX INFO: renamed from: b */
    public final wp4 f199389b;

    /* JADX INFO: renamed from: l.yp4$a */
    public static final class C21458a {

        /* JADX INFO: renamed from: a */
        public final List<C21459b> f199390a = new ArrayList();

        /* JADX INFO: renamed from: a */
        public C21458a m215574a(String str, String... strArr) {
            if (str == null) {
                jfd0.m141176a("pattern == null");
                return null;
            }
            for (String str2 : strArr) {
                this.f199390a.add(new C21459b(str, str2));
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        public yp4 m215575b() {
            return new yp4(new LinkedHashSet(this.f199390a), null);
        }
    }

    /* JADX INFO: renamed from: l.yp4$b */
    public static final class C21459b {

        /* JADX INFO: renamed from: a */
        public final String f199391a;

        /* JADX INFO: renamed from: b */
        public final String f199392b;

        /* JADX INFO: renamed from: c */
        public final String f199393c;

        /* JADX INFO: renamed from: d */
        public final ByteString f199394d;

        public C21459b(String str, String str2) {
            this.f199391a = str;
            this.f199392b = str.startsWith("*.") ? cll.m107499l("http://".concat(str.substring(2))).m107522m() : cll.m107499l("http://".concat(str)).m107522m();
            if (str2.startsWith("sha1/")) {
                this.f199393c = "sha1/";
                this.f199394d = ByteString.decodeBase64(str2.substring(5));
            } else {
                if (!str2.startsWith("sha256/")) {
                    ig3.m135964a("pins must start with 'sha256/' or 'sha1/': ".concat(str2));
                    throw null;
                }
                this.f199393c = "sha256/";
                this.f199394d = ByteString.decodeBase64(str2.substring(7));
            }
            if (this.f199394d != null) {
                return;
            }
            ig3.m135964a("pins must be base64: ".concat(str2));
            throw null;
        }

        /* JADX INFO: renamed from: a */
        public boolean m215576a(String str) {
            if (!this.f199391a.startsWith("*.")) {
                return str.equals(this.f199392b);
            }
            int iIndexOf = str.indexOf(46);
            if ((str.length() - iIndexOf) - 1 != this.f199392b.length()) {
                return false;
            }
            String str2 = this.f199392b;
            return str.regionMatches(false, iIndexOf + 1, str2, 0, str2.length());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C21459b)) {
                return false;
            }
            C21459b c21459b = (C21459b) obj;
            return this.f199391a.equals(c21459b.f199391a) && this.f199393c.equals(c21459b.f199393c) && this.f199394d.equals(c21459b.f199394d);
        }

        public int hashCode() {
            return ((((527 + this.f199391a.hashCode()) * 31) + this.f199393c.hashCode()) * 31) + this.f199394d.hashCode();
        }

        public String toString() {
            return this.f199393c + this.f199394d.base64();
        }
    }

    public yp4(Set<C21459b> set, wp4 wp4Var) {
        this.f199388a = set;
        this.f199389b = wp4Var;
    }

    /* JADX INFO: renamed from: c */
    public static String m215568c(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            ig3.m135964a("Certificate pinning requires X509 certificates");
            return null;
        }
        return "sha256/" + m215570e((X509Certificate) certificate).base64();
    }

    /* JADX INFO: renamed from: d */
    public static ByteString m215569d(X509Certificate x509Certificate) {
        return ByteString.m221050of(x509Certificate.getPublicKey().getEncoded()).sha1();
    }

    /* JADX INFO: renamed from: e */
    public static ByteString m215570e(X509Certificate x509Certificate) {
        return ByteString.m221050of(x509Certificate.getPublicKey().getEncoded()).sha256();
    }

    /* JADX INFO: renamed from: a */
    public void m215571a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<C21459b> listM215572b = m215572b(str);
        if (listM215572b.isEmpty()) {
            return;
        }
        wp4 wp4Var = this.f199389b;
        if (wp4Var != null) {
            list = wp4Var.clean(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = listM215572b.size();
            ByteString byteStringM215570e = null;
            ByteString byteStringM215569d = null;
            for (int i2 = 0; i2 < size2; i2++) {
                C21459b c21459b = listM215572b.get(i2);
                if (c21459b.f199393c.equals("sha256/")) {
                    if (byteStringM215570e == null) {
                        byteStringM215570e = m215570e(x509Certificate);
                    }
                    if (c21459b.f199394d.equals(byteStringM215570e)) {
                        return;
                    }
                } else {
                    if (!c21459b.f199393c.equals("sha1/")) {
                        xp4.m210459a("unsupported hashAlgorithm: ", c21459b.f199393c);
                        return;
                    }
                    if (byteStringM215569d == null) {
                        byteStringM215569d = m215569d(x509Certificate);
                    }
                    if (c21459b.f199394d.equals(byteStringM215569d)) {
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
            sb.append(m215568c(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = listM215572b.size();
        for (int i4 = 0; i4 < size4; i4++) {
            C21459b c21459b2 = listM215572b.get(i4);
            sb.append("\n    ");
            sb.append(c21459b2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public List<C21459b> m215572b(String str) {
        List<C21459b> arrayList = Collections.EMPTY_LIST;
        for (C21459b c21459b : this.f199388a) {
            if (c21459b.m215576a(str)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(c21459b);
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yp4)) {
            return false;
        }
        yp4 yp4Var = (yp4) obj;
        return Objects.equals(this.f199389b, yp4Var.f199389b) && this.f199388a.equals(yp4Var.f199388a);
    }

    /* JADX INFO: renamed from: f */
    public yp4 m215573f(wp4 wp4Var) {
        return Objects.equals(this.f199389b, wp4Var) ? this : new yp4(this.f199388a, wp4Var);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f199389b) * 31) + this.f199388a.hashCode();
    }
}
