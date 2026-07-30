package com.google.android.libraries.places.internal;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes7.dex */
final class zzbns {
    public static final PasswordAuthentication zza(String str, InetAddress inetAddress, int i, String str2, String str3, String str4) {
        URL url;
        try {
            url = new URL("https", str, i, "");
        } catch (MalformedURLException unused) {
            zzbnu.zza.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", str});
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i, "https", "", null, url, Authenticator.RequestorType.PROXY);
    }
}
