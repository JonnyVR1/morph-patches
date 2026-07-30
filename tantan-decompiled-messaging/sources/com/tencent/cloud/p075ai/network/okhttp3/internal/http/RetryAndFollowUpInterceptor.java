package com.tencent.cloud.p075ai.network.okhttp3.internal.http;

import com.google.android.gms.common.api.Api;
import com.tencent.cloud.p075ai.network.okhttp3.C13695a;
import com.tencent.cloud.p075ai.network.okhttp3.C13699e;
import com.tencent.cloud.p075ai.network.okhttp3.C13767p;
import com.tencent.cloud.p075ai.network.okhttp3.C13770s;
import com.tencent.cloud.p075ai.network.okhttp3.Interceptor;
import com.tencent.cloud.p075ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p075ai.network.okhttp3.Request;
import com.tencent.cloud.p075ai.network.okhttp3.RequestBody;
import com.tencent.cloud.p075ai.network.okhttp3.Response;
import com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractC13704a;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13721d;
import com.tencent.cloud.p075ai.network.okhttp3.internal.connection.C13712b;
import com.tencent.cloud.p075ai.network.okhttp3.internal.connection.C13713c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.connection.C13716f;
import com.tencent.cloud.p075ai.network.okhttp3.internal.connection.C13718h;
import com.tencent.cloud.p075ai.network.okhttp3.internal.connection.C13720j;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http2.C13728a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpMethods;
import p149l.aza0;
import p149l.bza0;
import p149l.ohg0;
import p149l.rhg0;

/* JADX INFO: loaded from: classes13.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    public final OkHttpClient f56573a;

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        this.f56573a = okHttpClient;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81689a(IOException iOException, C13720j c13720j, boolean z, Request request) {
        boolean z2;
        RequestBody requestBodyBody;
        if (!this.f56573a.retryOnConnectionFailure()) {
            return false;
        }
        if ((z && (((requestBodyBody = request.body()) != null && requestBodyBody.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z)) {
            return false;
        }
        C13713c c13713c = c13720j.f56551h;
        synchronized (c13713c.f56496c) {
            z2 = c13713c.f56502i;
        }
        return z2 && c13720j.f56551h.m81652b();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:107:0x0213  */
    /* JADX WARN: Code duplicated, block: B:109:0x021f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0223 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0225  */
    /* JADX WARN: Code duplicated, block: B:112:0x022e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0234  */
    /* JADX WARN: Code duplicated, block: B:118:0x0251  */
    /* JADX WARN: Code duplicated, block: B:185:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e5  */
    @Override // com.tencent.cloud.p075ai.network.okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        C13767p c13767pUrl;
        SSLSocketFactory sslSocketFactory;
        HostnameVerifier hostnameVerifier;
        C13699e c13699eCertificatePinner;
        Request requestBuild;
        String strHeader;
        C13767p.a aVarM81870a;
        C13767p c13767pM81872a;
        Request.Builder builderNewBuilder;
        boolean zEquals;
        RequestBody requestBodyBody;
        Request request = chain.request();
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        C13720j c13720jTransmitter = realInterceptorChain.transmitter();
        Request request2 = request;
        int i = 0;
        Response response = null;
        while (true) {
            Request request3 = c13720jTransmitter.f56550g;
            if (request3 == null) {
                c13720jTransmitter.f56550g = request2;
                C13716f c13716f = c13720jTransmitter.f56545b;
                c13767pUrl = request2.url();
                if (c13767pUrl.f56909a.equals("https")) {
                    sslSocketFactory = c13720jTransmitter.f56544a.sslSocketFactory();
                    hostnameVerifier = c13720jTransmitter.f56544a.hostnameVerifier();
                    c13699eCertificatePinner = c13720jTransmitter.f56544a.certificatePinner();
                } else {
                    sslSocketFactory = null;
                    hostnameVerifier = null;
                    c13699eCertificatePinner = null;
                }
                c13720jTransmitter.f56551h = new C13713c(c13720jTransmitter, c13716f, new C13695a(c13767pUrl.f56912d, c13767pUrl.f56913e, c13720jTransmitter.f56544a.dns(), c13720jTransmitter.f56544a.socketFactory(), sslSocketFactory, hostnameVerifier, c13699eCertificatePinner, c13720jTransmitter.f56544a.proxyAuthenticator(), c13720jTransmitter.f56544a.proxy(), c13720jTransmitter.f56544a.protocols(), c13720jTransmitter.f56544a.connectionSpecs(), c13720jTransmitter.f56544a.proxySelector()), c13720jTransmitter.f56546c, c13720jTransmitter.f56547d);
            } else if (!C13706c.m81617a(request3.url(), request2.url()) || !c13720jTransmitter.f56551h.m81652b()) {
                if (c13720jTransmitter.f56553j != null) {
                    ohg0.m164364a();
                    return null;
                }
                if (c13720jTransmitter.f56551h != null) {
                    c13720jTransmitter.m81678a(null, true);
                    c13720jTransmitter.f56551h = null;
                }
                c13720jTransmitter.f56550g = request2;
                C13716f c13716f2 = c13720jTransmitter.f56545b;
                c13767pUrl = request2.url();
                if (c13767pUrl.f56909a.equals("https")) {
                    sslSocketFactory = c13720jTransmitter.f56544a.sslSocketFactory();
                    hostnameVerifier = c13720jTransmitter.f56544a.hostnameVerifier();
                    c13699eCertificatePinner = c13720jTransmitter.f56544a.certificatePinner();
                } else {
                    sslSocketFactory = null;
                    hostnameVerifier = null;
                    c13699eCertificatePinner = null;
                }
                c13720jTransmitter.f56551h = new C13713c(c13720jTransmitter, c13716f2, new C13695a(c13767pUrl.f56912d, c13767pUrl.f56913e, c13720jTransmitter.f56544a.dns(), c13720jTransmitter.f56544a.socketFactory(), sslSocketFactory, hostnameVerifier, c13699eCertificatePinner, c13720jTransmitter.f56544a.proxyAuthenticator(), c13720jTransmitter.f56544a.proxy(), c13720jTransmitter.f56544a.protocols(), c13720jTransmitter.f56544a.connectionSpecs(), c13720jTransmitter.f56544a.proxySelector()), c13720jTransmitter.f56546c, c13720jTransmitter.f56547d);
            }
            if (c13720jTransmitter.m81683d()) {
                rhg0.m179353a("Canceled");
                return null;
            }
            try {
                try {
                    try {
                        Response responseProceed = realInterceptorChain.proceed(request2, c13720jTransmitter, null);
                        if (response != null) {
                            responseProceed = responseProceed.newBuilder().priorResponse(response.newBuilder().body(null).build()).build();
                        }
                        response = responseProceed;
                        ((OkHttpClient.C13689a) AbstractC13704a.f56453a).getClass();
                        C13712b c13712b = response.f56385m;
                        C13770s c13770s = c13712b != null ? c13712b.f56481e.connection().f56507c : null;
                        int iCode = response.code();
                        String strMethod = response.request().method();
                        if (iCode != 307 && iCode != 308) {
                            if (iCode == 401) {
                                requestBuild = this.f56573a.authenticator().mo81589a(c13770s, response);
                            } else if (iCode != 503) {
                                if (iCode == 407) {
                                    if ((c13770s != null ? c13770s.f56943b : this.f56573a.proxy()).type() != Proxy.Type.HTTP) {
                                        aza0.m99642a("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                                        return null;
                                    }
                                    requestBuild = this.f56573a.proxyAuthenticator().mo81589a(c13770s, response);
                                } else if (iCode != 408) {
                                    switch (iCode) {
                                        case 300:
                                        case 301:
                                        case 302:
                                        case 303:
                                            if (!this.f56573a.followRedirects()) {
                                                C13767p c13767pUrl2 = response.request().url();
                                                c13767pUrl2.getClass();
                                                aVarM81870a = new C13767p.a().m81870a(c13767pUrl2, strHeader);
                                                if (aVarM81870a != null) {
                                                    c13767pM81872a = aVarM81870a.m81872a();
                                                } else {
                                                    c13767pM81872a = null;
                                                }
                                                if (c13767pM81872a != null) {
                                                    if (c13767pM81872a.f56909a.equals(response.request().url().f56909a)) {
                                                    }
                                                    builderNewBuilder = response.request().newBuilder();
                                                    if (C13721d.m81687a(strMethod)) {
                                                        zEquals = strMethod.equals("PROPFIND");
                                                        if (strMethod.equals("PROPFIND")) {
                                                            if (zEquals) {
                                                                requestBodyBody = response.request().body();
                                                            } else {
                                                                requestBodyBody = null;
                                                            }
                                                            builderNewBuilder.method(strMethod, requestBodyBody);
                                                        } else {
                                                            builderNewBuilder.method("GET", null);
                                                        }
                                                        if (!zEquals) {
                                                            builderNewBuilder.removeHeader(HttpHeaders.TRANSFER_ENCODING);
                                                            builderNewBuilder.removeHeader("Content-Length");
                                                            builderNewBuilder.removeHeader("Content-Type");
                                                        }
                                                    }
                                                    if (!C13706c.m81617a(response.request().url(), c13767pM81872a)) {
                                                        builderNewBuilder.removeHeader("Authorization");
                                                    }
                                                    requestBuild = builderNewBuilder.url(c13767pM81872a).build();
                                                } else {
                                                    request2 = null;
                                                }
                                                break;
                                            }
                                            break;
                                        default:
                                            request2 = null;
                                            break;
                                    }
                                } else if (this.f56573a.retryOnConnectionFailure()) {
                                    RequestBody requestBodyBody2 = response.request().body();
                                    if (requestBodyBody2 != null && requestBodyBody2.isOneShot()) {
                                        request2 = null;
                                    } else if ((response.priorResponse() == null || response.priorResponse().code() != 408) && m81688a(response, 0) <= 0) {
                                        requestBuild = response.request();
                                    } else {
                                        request2 = null;
                                    }
                                } else {
                                    request2 = null;
                                }
                            } else if ((response.priorResponse() == null || response.priorResponse().code() != 503) && m81688a(response, Api.BaseClientBuilder.API_PRIORITY_OTHER) == 0) {
                                requestBuild = response.request();
                            } else {
                                request2 = null;
                            }
                            request2 = requestBuild;
                        } else if (!strMethod.equals("GET") && !strMethod.equals(HttpMethods.HEAD)) {
                            request2 = null;
                        } else if (!this.f56573a.followRedirects() || (strHeader = response.header("Location")) == null) {
                            request2 = null;
                        } else {
                            C13767p c13767pUrl3 = response.request().url();
                            c13767pUrl3.getClass();
                            try {
                                aVarM81870a = new C13767p.a().m81870a(c13767pUrl3, strHeader);
                            } catch (IllegalArgumentException unused) {
                                aVarM81870a = null;
                            }
                            if (aVarM81870a != null) {
                                c13767pM81872a = aVarM81870a.m81872a();
                            } else {
                                c13767pM81872a = null;
                            }
                            if (c13767pM81872a != null) {
                                request2 = null;
                            } else if (!c13767pM81872a.f56909a.equals(response.request().url().f56909a) || this.f56573a.followSslRedirects()) {
                                builderNewBuilder = response.request().newBuilder();
                                if (C13721d.m81687a(strMethod)) {
                                    zEquals = strMethod.equals("PROPFIND");
                                    if (strMethod.equals("PROPFIND")) {
                                        builderNewBuilder.method("GET", null);
                                    } else {
                                        if (zEquals) {
                                            requestBodyBody = response.request().body();
                                        } else {
                                            requestBodyBody = null;
                                        }
                                        builderNewBuilder.method(strMethod, requestBodyBody);
                                    }
                                    if (!zEquals) {
                                        builderNewBuilder.removeHeader(HttpHeaders.TRANSFER_ENCODING);
                                        builderNewBuilder.removeHeader("Content-Length");
                                        builderNewBuilder.removeHeader("Content-Type");
                                    }
                                }
                                if (!C13706c.m81617a(response.request().url(), c13767pM81872a)) {
                                    builderNewBuilder.removeHeader("Authorization");
                                }
                                requestBuild = builderNewBuilder.url(c13767pM81872a).build();
                                request2 = requestBuild;
                            } else {
                                request2 = null;
                            }
                        }
                        if (request2 != null) {
                            RequestBody requestBodyBody3 = request2.body();
                            if (requestBodyBody3 == null || !requestBodyBody3.isOneShot()) {
                                C13706c.m81615a(response.body());
                                if (c13720jTransmitter.m81682c()) {
                                    c13712b.f56481e.cancel();
                                    c13712b.f56477a.m81676a(c13712b, true, true, null);
                                }
                                i++;
                                if (i > 20) {
                                    bza0.m104561a("Too many follow-up requests: ", i);
                                    return null;
                                }
                            }
                        } else if (c13712b != null && c13712b.f56482f) {
                            if (c13720jTransmitter.f56557n) {
                                ohg0.m164364a();
                                return null;
                            }
                            c13720jTransmitter.f56557n = true;
                            c13720jTransmitter.f56548e.m81894i();
                        }
                        return response;
                    } catch (Throwable th) {
                        c13720jTransmitter.m81681b();
                        throw th;
                    }
                } catch (C13718h e) {
                    if (!m81689a(e.f56532b, c13720jTransmitter, false, request2)) {
                        throw e.f56531a;
                    }
                    c13720jTransmitter.m81681b();
                }
            } catch (IOException e2) {
                if (!m81689a(e2, c13720jTransmitter, !(e2 instanceof C13728a), request2)) {
                    throw e2;
                }
                c13720jTransmitter.m81681b();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m81688a(Response response, int i) {
        String strHeader = response.header(HttpHeaders.RETRY_AFTER);
        if (strHeader == null) {
            return i;
        }
        return strHeader.matches("\\d+") ? Integer.valueOf(strHeader).intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }
}
