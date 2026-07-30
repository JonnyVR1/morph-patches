package p153l;

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
public final class xq4 {

    /* JADX INFO: renamed from: c */
    public static final xq4 f195773c = new C21419a().m212716b();

    /* JADX INFO: renamed from: a */
    public final Set<C21420b> f195774a;

    /* JADX INFO: renamed from: b */
    public final vq4 f195775b;

    /* JADX INFO: renamed from: l.xq4$a */
    public static final class C21419a {

        /* JADX INFO: renamed from: a */
        public final List<C21420b> f195776a = new ArrayList();

        /* JADX INFO: renamed from: a */
        public C21419a m212715a(String str, String... strArr) {
            if (str == null) {
                mnd0.m159157a("pattern == null");
                return null;
            }
            for (String str2 : strArr) {
                this.f195776a.add(new C21420b(str, str2));
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        public xq4 m212716b() {
            return new xq4(new LinkedHashSet(this.f195776a), null);
        }
    }

    /* JADX INFO: renamed from: l.xq4$b */
    public static final class C21420b {

        /* JADX INFO: renamed from: a */
        public final String f195777a;

        /* JADX INFO: renamed from: b */
        public final String f195778b;

        /* JADX INFO: renamed from: c */
        public final String f195779c;

        /* JADX INFO: renamed from: d */
        public final ByteString f195780d;

        public C21420b(String str, String str2) {
            this.f195777a = str;
            this.f195778b = str.startsWith("*.") ? rnl.m182263l("http://".concat(str.substring(2))).m182286m() : rnl.m182263l("http://".concat(str)).m182286m();
            if (str2.startsWith("sha1/")) {
                this.f195779c = "sha1/";
                this.f195780d = ByteString.decodeBase64(str2.substring(5));
            } else {
                if (!str2.startsWith("sha256/")) {
                    wg3.m206174a("pins must start with 'sha256/' or 'sha1/': ".concat(str2));
                    throw null;
                }
                this.f195779c = "sha256/";
                this.f195780d = ByteString.decodeBase64(str2.substring(7));
            }
            if (this.f195780d != null) {
                return;
            }
            wg3.m206174a("pins must be base64: ".concat(str2));
            throw null;
        }

        /* JADX INFO: renamed from: a */
        public boolean m212717a(String str) {
            if (!this.f195777a.startsWith("*.")) {
                return str.equals(this.f195778b);
            }
            int iIndexOf = str.indexOf(46);
            if ((str.length() - iIndexOf) - 1 != this.f195778b.length()) {
                return false;
            }
            String str2 = this.f195778b;
            return str.regionMatches(false, iIndexOf + 1, str2, 0, str2.length());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C21420b)) {
                return false;
            }
            C21420b c21420b = (C21420b) obj;
            return this.f195777a.equals(c21420b.f195777a) && this.f195779c.equals(c21420b.f195779c) && this.f195780d.equals(c21420b.f195780d);
        }

        public int hashCode() {
            return ((((527 + this.f195777a.hashCode()) * 31) + this.f195779c.hashCode()) * 31) + this.f195780d.hashCode();
        }

        public String toString() {
            return this.f195779c + this.f195780d.base64();
        }
    }

    public xq4(Set<C21420b> set, vq4 vq4Var) {
        this.f195774a = set;
        this.f195775b = vq4Var;
    }

    /* JADX INFO: renamed from: c */
    public static String m212709c(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            wg3.m206174a("Certificate pinning requires X509 certificates");
            return null;
        }
        return "sha256/" + m212711e((X509Certificate) certificate).base64();
    }

    /* JADX INFO: renamed from: d */
    public static ByteString m212710d(X509Certificate x509Certificate) {
        return ByteString.m222317of(x509Certificate.getPublicKey().getEncoded()).sha1();
    }

    /* JADX INFO: renamed from: e */
    public static ByteString m212711e(X509Certificate x509Certificate) {
        return ByteString.m222317of(x509Certificate.getPublicKey().getEncoded()).sha256();
    }

    /* JADX INFO: renamed from: a */
    public void m212712a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<C21420b> listM212713b = m212713b(str);
        if (listM212713b.isEmpty()) {
            return;
        }
        vq4 vq4Var = this.f195775b;
        if (vq4Var != null) {
            list = vq4Var.clean(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = listM212713b.size();
            ByteString byteStringM212711e = null;
            ByteString byteStringM212710d = null;
            for (int i2 = 0; i2 < size2; i2++) {
                C21420b c21420b = listM212713b.get(i2);
                if (c21420b.f195779c.equals("sha256/")) {
                    if (byteStringM212711e == null) {
                        byteStringM212711e = m212711e(x509Certificate);
                    }
                    if (c21420b.f195780d.equals(byteStringM212711e)) {
                        return;
                    }
                } else {
                    if (!c21420b.f195779c.equals("sha1/")) {
                        wq4.m207499a("unsupported hashAlgorithm: ", c21420b.f195779c);
                        return;
                    }
                    if (byteStringM212710d == null) {
                        byteStringM212710d = m212710d(x509Certificate);
                    }
                    if (c21420b.f195780d.equals(byteStringM212710d)) {
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
            sb.append(m212709c(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = listM212713b.size();
        for (int i4 = 0; i4 < size4; i4++) {
            C21420b c21420b2 = listM212713b.get(i4);
            sb.append("\n    ");
            sb.append(c21420b2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public List<C21420b> m212713b(String str) {
        List<C21420b> arrayList = Collections.EMPTY_LIST;
        for (C21420b c21420b : this.f195774a) {
            if (c21420b.m212717a(str)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(c21420b);
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xq4)) {
            return false;
        }
        xq4 xq4Var = (xq4) obj;
        return Objects.equals(this.f195775b, xq4Var.f195775b) && this.f195774a.equals(xq4Var.f195774a);
    }

    /* JADX INFO: renamed from: f */
    public xq4 m212714f(vq4 vq4Var) {
        return Objects.equals(this.f195775b, vq4Var) ? this : new xq4(this.f195774a, vq4Var);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f195775b) * 31) + this.f195774a.hashCode();
    }
}
