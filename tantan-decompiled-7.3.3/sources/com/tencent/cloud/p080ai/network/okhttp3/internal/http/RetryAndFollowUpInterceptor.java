package com.tencent.cloud.p080ai.network.okhttp3.internal.http;

import com.google.android.gms.common.api.Api;
import com.tencent.cloud.p080ai.network.okhttp3.C13858a;
import com.tencent.cloud.p080ai.network.okhttp3.C13862e;
import com.tencent.cloud.p080ai.network.okhttp3.C13930p;
import com.tencent.cloud.p080ai.network.okhttp3.C13933s;
import com.tencent.cloud.p080ai.network.okhttp3.Interceptor;
import com.tencent.cloud.p080ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p080ai.network.okhttp3.Request;
import com.tencent.cloud.p080ai.network.okhttp3.RequestBody;
import com.tencent.cloud.p080ai.network.okhttp3.Response;
import com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractC13867a;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13884d;
import com.tencent.cloud.p080ai.network.okhttp3.internal.connection.C13875b;
import com.tencent.cloud.p080ai.network.okhttp3.internal.connection.C13876c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.connection.C13879f;
import com.tencent.cloud.p080ai.network.okhttp3.internal.connection.C13881h;
import com.tencent.cloud.p080ai.network.okhttp3.internal.connection.C13883j;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http2.C13891a;
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
import p153l.e7b0;
import p153l.f7b0;
import p153l.wpg0;
import p153l.zpg0;

/* JADX INFO: loaded from: classes12.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    public final OkHttpClient f57421a;

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        this.f57421a = okHttpClient;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m82872a(IOException iOException, C13883j c13883j, boolean z, Request request) {
        boolean z2;
        RequestBody requestBodyBody;
        if (!this.f57421a.retryOnConnectionFailure()) {
            return false;
        }
        if ((z && (((requestBodyBody = request.body()) != null && requestBodyBody.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z)) {
            return false;
        }
        C13876c c13876c = c13883j.f57399h;
        synchronized (c13876c.f57344c) {
            z2 = c13876c.f57350i;
        }
        return z2 && c13883j.f57399h.m82835b();
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
    @Override // com.tencent.cloud.p080ai.network.okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        C13930p c13930pUrl;
        SSLSocketFactory sslSocketFactory;
        HostnameVerifier hostnameVerifier;
        C13862e c13862eCertificatePinner;
        Request requestBuild;
        String strHeader;
        C13930p.a aVarM83053a;
        C13930p c13930pM83055a;
        Request.Builder builderNewBuilder;
        boolean zEquals;
        RequestBody requestBodyBody;
        Request request = chain.request();
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        C13883j c13883jTransmitter = realInterceptorChain.transmitter();
        Request request2 = request;
        int i = 0;
        Response response = null;
        while (true) {
            Request request3 = c13883jTransmitter.f57398g;
            if (request3 == null) {
                c13883jTransmitter.f57398g = request2;
                C13879f c13879f = c13883jTransmitter.f57393b;
                c13930pUrl = request2.url();
                if (c13930pUrl.f57757a.equals("https")) {
                    sslSocketFactory = c13883jTransmitter.f57392a.sslSocketFactory();
                    hostnameVerifier = c13883jTransmitter.f57392a.hostnameVerifier();
                    c13862eCertificatePinner = c13883jTransmitter.f57392a.certificatePinner();
                } else {
                    sslSocketFactory = null;
                    hostnameVerifier = null;
                    c13862eCertificatePinner = null;
                }
                c13883jTransmitter.f57399h = new C13876c(c13883jTransmitter, c13879f, new C13858a(c13930pUrl.f57760d, c13930pUrl.f57761e, c13883jTransmitter.f57392a.dns(), c13883jTransmitter.f57392a.socketFactory(), sslSocketFactory, hostnameVerifier, c13862eCertificatePinner, c13883jTransmitter.f57392a.proxyAuthenticator(), c13883jTransmitter.f57392a.proxy(), c13883jTransmitter.f57392a.protocols(), c13883jTransmitter.f57392a.connectionSpecs(), c13883jTransmitter.f57392a.proxySelector()), c13883jTransmitter.f57394c, c13883jTransmitter.f57395d);
            } else if (!C13869c.m82800a(request3.url(), request2.url()) || !c13883jTransmitter.f57399h.m82835b()) {
                if (c13883jTransmitter.f57401j != null) {
                    wpg0.m207458a();
                    return null;
                }
                if (c13883jTransmitter.f57399h != null) {
                    c13883jTransmitter.m82861a(null, true);
                    c13883jTransmitter.f57399h = null;
                }
                c13883jTransmitter.f57398g = request2;
                C13879f c13879f2 = c13883jTransmitter.f57393b;
                c13930pUrl = request2.url();
                if (c13930pUrl.f57757a.equals("https")) {
                    sslSocketFactory = c13883jTransmitter.f57392a.sslSocketFactory();
                    hostnameVerifier = c13883jTransmitter.f57392a.hostnameVerifier();
                    c13862eCertificatePinner = c13883jTransmitter.f57392a.certificatePinner();
                } else {
                    sslSocketFactory = null;
                    hostnameVerifier = null;
                    c13862eCertificatePinner = null;
                }
                c13883jTransmitter.f57399h = new C13876c(c13883jTransmitter, c13879f2, new C13858a(c13930pUrl.f57760d, c13930pUrl.f57761e, c13883jTransmitter.f57392a.dns(), c13883jTransmitter.f57392a.socketFactory(), sslSocketFactory, hostnameVerifier, c13862eCertificatePinner, c13883jTransmitter.f57392a.proxyAuthenticator(), c13883jTransmitter.f57392a.proxy(), c13883jTransmitter.f57392a.protocols(), c13883jTransmitter.f57392a.connectionSpecs(), c13883jTransmitter.f57392a.proxySelector()), c13883jTransmitter.f57394c, c13883jTransmitter.f57395d);
            }
            if (c13883jTransmitter.m82866d()) {
                zpg0.m220844a("Canceled");
                return null;
            }
            try {
                try {
                    try {
                        Response responseProceed = realInterceptorChain.proceed(request2, c13883jTransmitter, null);
                        if (response != null) {
                            responseProceed = responseProceed.newBuilder().priorResponse(response.newBuilder().body(null).build()).build();
                        }
                        response = responseProceed;
                        ((OkHttpClient.C13852a) AbstractC13867a.f57301a).getClass();
                        C13875b c13875b = response.f57233m;
                        C13933s c13933s = c13875b != null ? c13875b.f57329e.connection().f57355c : null;
                        int iCode = response.code();
                        String strMethod = response.request().method();
                        if (iCode != 307 && iCode != 308) {
                            if (iCode == 401) {
                                requestBuild = this.f57421a.authenticator().mo82772a(c13933s, response);
                            } else if (iCode != 503) {
                                if (iCode == 407) {
                                    if ((c13933s != null ? c13933s.f57791b : this.f57421a.proxy()).type() != Proxy.Type.HTTP) {
                                        e7b0.m119688a("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                                        return null;
                                    }
                                    requestBuild = this.f57421a.proxyAuthenticator().mo82772a(c13933s, response);
                                } else if (iCode != 408) {
                                    switch (iCode) {
                                        case 300:
                                        case 301:
                                        case 302:
                                        case 303:
                                            if (!this.f57421a.followRedirects()) {
                                                C13930p c13930pUrl2 = response.request().url();
                                                c13930pUrl2.getClass();
                                                aVarM83053a = new C13930p.a().m83053a(c13930pUrl2, strHeader);
                                                if (aVarM83053a != null) {
                                                    c13930pM83055a = aVarM83053a.m83055a();
                                                } else {
                                                    c13930pM83055a = null;
                                                }
                                                if (c13930pM83055a != null) {
                                                    if (c13930pM83055a.f57757a.equals(response.request().url().f57757a)) {
                                                    }
                                                    builderNewBuilder = response.request().newBuilder();
                                                    if (C13884d.m82870a(strMethod)) {
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
                                                    if (!C13869c.m82800a(response.request().url(), c13930pM83055a)) {
                                                        builderNewBuilder.removeHeader("Authorization");
                                                    }
                                                    requestBuild = builderNewBuilder.url(c13930pM83055a).build();
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
                                } else if (this.f57421a.retryOnConnectionFailure()) {
                                    RequestBody requestBodyBody2 = response.request().body();
                                    if (requestBodyBody2 != null && requestBodyBody2.isOneShot()) {
                                        request2 = null;
                                    } else if ((response.priorResponse() == null || response.priorResponse().code() != 408) && m82871a(response, 0) <= 0) {
                                        requestBuild = response.request();
                                    } else {
                                        request2 = null;
                                    }
                                } else {
                                    request2 = null;
                                }
                            } else if ((response.priorResponse() == null || response.priorResponse().code() != 503) && m82871a(response, Api.BaseClientBuilder.API_PRIORITY_OTHER) == 0) {
                                requestBuild = response.request();
                            } else {
                                request2 = null;
                            }
                            request2 = requestBuild;
                        } else if (!strMethod.equals("GET") && !strMethod.equals(HttpMethods.HEAD)) {
                            request2 = null;
                        } else if (!this.f57421a.followRedirects() || (strHeader = response.header("Location")) == null) {
                            request2 = null;
                        } else {
                            C13930p c13930pUrl3 = response.request().url();
                            c13930pUrl3.getClass();
                            try {
                                aVarM83053a = new C13930p.a().m83053a(c13930pUrl3, strHeader);
                            } catch (IllegalArgumentException unused) {
                                aVarM83053a = null;
                            }
                            if (aVarM83053a != null) {
                                c13930pM83055a = aVarM83053a.m83055a();
                            } else {
                                c13930pM83055a = null;
                            }
                            if (c13930pM83055a != null) {
                                request2 = null;
                            } else if (!c13930pM83055a.f57757a.equals(response.request().url().f57757a) || this.f57421a.followSslRedirects()) {
                                builderNewBuilder = response.request().newBuilder();
                                if (C13884d.m82870a(strMethod)) {
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
                                if (!C13869c.m82800a(response.request().url(), c13930pM83055a)) {
                                    builderNewBuilder.removeHeader("Authorization");
                                }
                                requestBuild = builderNewBuilder.url(c13930pM83055a).build();
                                request2 = requestBuild;
                            } else {
                                request2 = null;
                            }
                        }
                        if (request2 != null) {
                            RequestBody requestBodyBody3 = request2.body();
                            if (requestBodyBody3 == null || !requestBodyBody3.isOneShot()) {
                                C13869c.m82798a(response.body());
                                if (c13883jTransmitter.m82865c()) {
                                    c13875b.f57329e.cancel();
                                    c13875b.f57325a.m82859a(c13875b, true, true, null);
                                }
                                i++;
                                if (i > 20) {
                                    f7b0.m124433a("Too many follow-up requests: ", i);
                                    return null;
                                }
                            }
                        } else if (c13875b != null && c13875b.f57330f) {
                            if (c13883jTransmitter.f57405n) {
                                wpg0.m207458a();
                                return null;
                            }
                            c13883jTransmitter.f57405n = true;
                            c13883jTransmitter.f57396e.m83077i();
                        }
                        return response;
                    } catch (Throwable th) {
                        c13883jTransmitter.m82864b();
                        throw th;
                    }
                } catch (C13881h e) {
                    if (!m82872a(e.f57380b, c13883jTransmitter, false, request2)) {
                        throw e.f57379a;
                    }
                    c13883jTransmitter.m82864b();
                }
            } catch (IOException e2) {
                if (!m82872a(e2, c13883jTransmitter, !(e2 instanceof C13891a), request2)) {
                    throw e2;
                }
                c13883jTransmitter.m82864b();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m82871a(Response response, int i) {
        String strHeader = response.header(HttpHeaders.RETRY_AFTER);
        if (strHeader == null) {
            return i;
        }
        return strHeader.matches("\\d+") ? Integer.valueOf(strHeader).intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }
}
