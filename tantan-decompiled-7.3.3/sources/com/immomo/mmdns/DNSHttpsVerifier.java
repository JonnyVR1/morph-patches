package com.immomo.mmdns;

import javax.net.ssl.SSLException;
import org.apache.http.conn.ssl.AbstractVerifier;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class DNSHttpsVerifier extends AbstractVerifier {
    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public void verify(String str, String[] strArr, String[] strArr2) throws SSLException {
        verify(str, strArr, strArr2, true);
    }
}
