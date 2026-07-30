package p153l;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes2.dex */
public final class pg50 implements HostnameVerifier {
    public static final pg50 INSTANCE = new pg50();

    /* JADX INFO: renamed from: a */
    public static List<String> m172219a(X509Certificate x509Certificate) {
        List<String> listM172220b = m172220b(x509Certificate, 7);
        List<String> listM172220b2 = m172220b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listM172220b.size() + listM172220b2.size());
        arrayList.addAll(listM172220b);
        arrayList.addAll(listM172220b2);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m172220b(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m172221c(String str, X509Certificate x509Certificate) {
        return zlk0.m220238L(str) ? m172224f(str, x509Certificate) : m172223e(str, x509Certificate);
    }

    /* JADX INFO: renamed from: d */
    public boolean m172222d(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str.concat(".");
            }
            if (!str2.endsWith(".")) {
                str2 = str2.concat(".");
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String strSubstring = lowerCase.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m172223e(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator<String> it = m172220b(x509Certificate, 2).iterator();
        while (it.hasNext()) {
            if (m172222d(lowerCase, it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m172224f(String str, X509Certificate x509Certificate) {
        List<String> listM172220b = m172220b(x509Certificate, 7);
        int size = listM172220b.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(listM172220b.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return m172221c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
