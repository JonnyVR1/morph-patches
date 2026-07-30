package com.tencent.cloud.p075ai.network.okhttp3.internal.tls;

import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.tls.d */
/* JADX INFO: loaded from: classes13.dex */
public final class C13758d implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final C13758d f56813a = new C13758d();

    /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
    /* JADX INFO: renamed from: a */
    public boolean m81810a(String str, X509Certificate x509Certificate) {
        boolean zEquals;
        int length;
        if (C13706c.f56465k.matcher(str).matches()) {
            List<String> listM81809a = m81809a(x509Certificate, 7);
            int size = listM81809a.size();
            for (int i = 0; i < size; i++) {
                if (str.equalsIgnoreCase(listM81809a.get(i))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        for (String strConcat : m81809a(x509Certificate, 2)) {
            if (lowerCase == null || lowerCase.length() == 0 || lowerCase.startsWith(".") || lowerCase.endsWith("..") || strConcat == null || strConcat.length() == 0 || strConcat.startsWith(".") || strConcat.endsWith("..")) {
                zEquals = false;
            } else {
                String strConcat2 = !lowerCase.endsWith(".") ? lowerCase.concat(".") : lowerCase;
                if (!strConcat.endsWith(".")) {
                    strConcat = strConcat.concat(".");
                }
                String lowerCase2 = strConcat.toLowerCase(Locale.US);
                if (!lowerCase2.contains("*")) {
                    zEquals = strConcat2.equals(lowerCase2);
                } else if (!lowerCase2.startsWith("*.") || lowerCase2.indexOf(42, 1) != -1 || strConcat2.length() < lowerCase2.length() || "*.".equals(lowerCase2)) {
                    zEquals = false;
                } else {
                    String strSubstring = lowerCase2.substring(1);
                    if (strConcat2.endsWith(strSubstring) && ((length = strConcat2.length() - strSubstring.length()) <= 0 || strConcat2.lastIndexOf(46, length - 1) == -1)) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                }
            }
            if (zEquals) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return m81810a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m81809a(X509Certificate x509Certificate, int i) {
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

    /* JADX INFO: renamed from: a */
    public static List<String> m81808a(X509Certificate x509Certificate) {
        List<String> listM81809a = m81809a(x509Certificate, 7);
        List<String> listM81809a2 = m81809a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listM81809a.size() + listM81809a2.size());
        arrayList.addAll(listM81809a);
        arrayList.addAll(listM81809a2);
        return arrayList;
    }
}
