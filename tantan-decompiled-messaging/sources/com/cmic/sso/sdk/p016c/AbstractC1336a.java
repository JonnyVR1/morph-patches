package com.cmic.sso.sdk.p016c;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1336a extends SSLSocketFactory {
    protected SSLSocketFactory delegate = HttpsURLConnection.getDefaultSSLSocketFactory();
}
