package com.tencent.cloud.p080ai.network.okhttp3.internal.tls;

import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
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
/* JADX INFO: loaded from: classes12.dex */
public final class C13921d implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final C13921d f57661a = new C13921d();

    /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
    /* JADX INFO: renamed from: a */
    public boolean m82993a(String str, X509Certificate x509Certificate) {
        boolean zEquals;
        int length;
        if (C13869c.f57313k.matcher(str).matches()) {
            List<String> listM82992a = m82992a(x509Certificate, 7);
            int size = listM82992a.size();
            for (int i = 0; i < size; i++) {
                if (str.equalsIgnoreCase(listM82992a.get(i))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        for (String strConcat : m82992a(x509Certificate, 2)) {
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
            return m82993a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m82992a(X509Certificate x509Certificate, int i) {
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
    public static List<String> m82991a(X509Certificate x509Certificate) {
        List<String> listM82992a = m82992a(x509Certificate, 7);
        List<String> listM82992a2 = m82992a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listM82992a.size() + listM82992a2.size());
        arrayList.addAll(listM82992a);
        arrayList.addAll(listM82992a2);
        return arrayList;
    }
}
