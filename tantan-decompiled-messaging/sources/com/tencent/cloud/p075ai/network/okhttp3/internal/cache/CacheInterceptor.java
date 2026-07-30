package com.tencent.cloud.p075ai.network.okhttp3.internal.cache;

import com.tencent.cloud.p075ai.network.okhttp3.C13698d;
import com.tencent.cloud.p075ai.network.okhttp3.C13766o;
import com.tencent.cloud.p075ai.network.okhttp3.C13767p;
import com.tencent.cloud.p075ai.network.okhttp3.EnumC13768q;
import com.tencent.cloud.p075ai.network.okhttp3.Interceptor;
import com.tencent.cloud.p075ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p075ai.network.okhttp3.Request;
import com.tencent.cloud.p075ai.network.okhttp3.Response;
import com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractC13704a;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http.C13723b;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http.C13724c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http.C13725d;
import com.tencent.cloud.p075ai.network.okio.C13785n;
import com.tencent.cloud.p075ai.network.okio.C13789r;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13793v;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: loaded from: classes13.dex */
public final class CacheInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13710d f56466a;

    public CacheInterceptor(InterfaceC13710d interfaceC13710d) {
        this.f56466a = interfaceC13710d;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m81629a(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m81630b(String str) {
        return ("Connection".equalsIgnoreCase(str) || HttpHeaders.KEEP_ALIVE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHENTICATE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHORIZATION.equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || HttpHeaders.TRANSFER_ENCODING.equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:113:0x0235  */
    /* JADX WARN: Code duplicated, block: B:81:0x018a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0198  */
    /* JADX WARN: Code duplicated, block: B:85:0x019e  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c8  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.tencent.cloud.ai.network.okhttp3.Request, com.tencent.cloud.ai.network.okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // com.tencent.cloud.p075ai.network.okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        int i;
        long jSentRequestAtMillis;
        long time;
        String str;
        String str2;
        String str3;
        Date dateM81698a;
        Date dateM81698a2;
        Date dateM81698a3;
        ?? r8;
        C13709c c13709c;
        String string;
        long j;
        long time2;
        int i2;
        int i3;
        long millis;
        long millis2;
        String str4;
        long j2;
        Response.Builder builderNewBuilder;
        int i4;
        InterfaceC13793v interfaceC13793vM81632a;
        InterfaceC13710d interfaceC13710d = this.f56466a;
        Response responseM81640b = interfaceC13710d != null ? interfaceC13710d.m81640b(chain.request()) : null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Request request = chain.request();
        if (responseM81640b != null) {
            jSentRequestAtMillis = responseM81640b.sentRequestAtMillis();
            time = responseM81640b.receivedResponseAtMillis();
            C13766o c13766oHeaders = responseM81640b.headers();
            int iM81845b = c13766oHeaders.m81845b();
            int iM81700a = -1;
            str = null;
            str2 = null;
            str3 = null;
            dateM81698a = null;
            dateM81698a2 = null;
            dateM81698a3 = null;
            for (int i5 = 0; i5 < iM81845b; i5++) {
                String strM81844a = c13766oHeaders.m81844a(i5);
                String strM81846b = c13766oHeaders.m81846b(i5);
                if ("Date".equalsIgnoreCase(strM81844a)) {
                    dateM81698a = C13723b.m81698a(strM81846b);
                    str3 = strM81846b;
                } else if ("Expires".equalsIgnoreCase(strM81844a)) {
                    dateM81698a2 = C13723b.m81698a(strM81846b);
                } else if ("Last-Modified".equalsIgnoreCase(strM81844a)) {
                    dateM81698a3 = C13723b.m81698a(strM81846b);
                    str2 = strM81846b;
                } else if ("ETag".equalsIgnoreCase(strM81844a)) {
                    str = strM81846b;
                } else if (HttpHeaders.AGE.equalsIgnoreCase(strM81844a)) {
                    iM81700a = C13724c.m81700a(strM81846b, -1);
                }
            }
            i = iM81700a;
        } else {
            i = -1;
            jSentRequestAtMillis = 0;
            time = 0;
            str = null;
            str2 = null;
            str3 = null;
            dateM81698a = null;
            dateM81698a2 = null;
            dateM81698a3 = null;
        }
        if (responseM81640b == null) {
            r8 = 0;
            c13709c = new C13709c(request, null);
        } else {
            r8 = 0;
            r8 = 0;
            if (!(request.isHttps() && responseM81640b.handshake() == null) && C13709c.m81634a(responseM81640b, request)) {
                C13698d c13698dCacheControl = request.cacheControl();
                if (!c13698dCacheControl.f56407a && request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) {
                    C13698d c13698dCacheControl2 = responseM81640b.cacheControl();
                    long jMax = dateM81698a != null ? Math.max(0L, time - dateM81698a.getTime()) : 0L;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    if (i != -1) {
                        jMax = Math.max(jMax, timeUnit.toMillis(i));
                    }
                    long j3 = jMax + (time - jSentRequestAtMillis) + (jCurrentTimeMillis - time);
                    int i6 = responseM81640b.cacheControl().f56409c;
                    if (i6 != -1) {
                        time2 = timeUnit.toMillis(i6);
                    } else {
                        if (dateM81698a2 != null) {
                            if (dateM81698a != null) {
                                time = dateM81698a.getTime();
                            }
                            time2 = dateM81698a2.getTime() - time;
                            if (time2 > 0) {
                            }
                            i2 = c13698dCacheControl.f56409c;
                            if (i2 != -1) {
                                time2 = Math.min(time2, timeUnit.toMillis(i2));
                            }
                            i3 = c13698dCacheControl.f56415i;
                            if (i3 != -1) {
                                millis = timeUnit.toMillis(i3);
                            } else {
                                millis = j;
                            }
                            if (!c13698dCacheControl2.f56413g || (i4 = c13698dCacheControl.f56414h) == -1) {
                                millis2 = j;
                            } else {
                                millis2 = timeUnit.toMillis(i4);
                            }
                            if (c13698dCacheControl2.f56407a) {
                                if (str != null) {
                                    str4 = "If-None-Match";
                                } else if (dateM81698a3 != null) {
                                    str4 = "If-Modified-Since";
                                    str = str2;
                                } else if (dateM81698a != null) {
                                    str4 = r9;
                                    str = str3;
                                } else {
                                    r8 = 0;
                                    c13709c = new C13709c(request, null);
                                }
                                C13766o.a aVarM81843a = request.headers().m81843a();
                                ((OkHttpClient.C13689a) AbstractC13704a.f56453a).getClass();
                                aVarM81843a.f56907a.add(str4);
                                aVarM81843a.f56907a.add(str.trim());
                                c13709c = new C13709c(request.newBuilder().headers(new C13766o(aVarM81843a)).build(), responseM81640b);
                                r8 = 0;
                            } else {
                                j2 = j3 + millis;
                                if (j2 < millis2 + time2) {
                                    builderNewBuilder = responseM81640b.newBuilder();
                                    if (j2 >= time2) {
                                        builderNewBuilder.addHeader(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (j3 > 86400000 && responseM81640b.cacheControl().f56409c == -1 && dateM81698a2 == null) {
                                        builderNewBuilder.addHeader(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                    r8 = 0;
                                    c13709c = new C13709c(null, builderNewBuilder.build());
                                } else {
                                    if (str != null) {
                                        str4 = "If-None-Match";
                                    } else if (dateM81698a3 != null) {
                                        str4 = "If-Modified-Since";
                                        str = str2;
                                    } else if (dateM81698a != null) {
                                        str4 = r9;
                                        str = str3;
                                    } else {
                                        r8 = 0;
                                        c13709c = new C13709c(request, null);
                                    }
                                    C13766o.a aVarM81843a2 = request.headers().m81843a();
                                    ((OkHttpClient.C13689a) AbstractC13704a.f56453a).getClass();
                                    aVarM81843a2.f56907a.add(str4);
                                    aVarM81843a2.f56907a.add(str.trim());
                                    c13709c = new C13709c(request.newBuilder().headers(new C13766o(aVarM81843a2)).build(), responseM81640b);
                                    r8 = 0;
                                }
                            }
                        } else {
                            if (dateM81698a3 != null) {
                                C13767p c13767pUrl = responseM81640b.request().url();
                                if (c13767pUrl.f56914f == null) {
                                    string = null;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    C13767p.m81857a(sb, c13767pUrl.f56914f);
                                    string = sb.toString();
                                }
                                if (string == null) {
                                    long time3 = (dateM81698a != null ? dateM81698a.getTime() : jSentRequestAtMillis) - dateM81698a3.getTime();
                                    j = 0;
                                    if (time3 > 0) {
                                        time2 = time3 / 10;
                                    }
                                }
                                time2 = j;
                            }
                            i2 = c13698dCacheControl.f56409c;
                            if (i2 != -1) {
                                time2 = Math.min(time2, timeUnit.toMillis(i2));
                            }
                            i3 = c13698dCacheControl.f56415i;
                            if (i3 != -1) {
                                millis = timeUnit.toMillis(i3);
                            } else {
                                millis = j;
                            }
                            if (c13698dCacheControl2.f56413g) {
                                millis2 = j;
                            } else {
                                millis2 = j;
                            }
                            if (c13698dCacheControl2.f56407a) {
                                j2 = j3 + millis;
                                if (j2 < millis2 + time2) {
                                    builderNewBuilder = responseM81640b.newBuilder();
                                    if (j2 >= time2) {
                                        builderNewBuilder.addHeader(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (j3 > 86400000) {
                                        builderNewBuilder.addHeader(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                    r8 = 0;
                                    c13709c = new C13709c(null, builderNewBuilder.build());
                                } else {
                                    if (str != null) {
                                        str4 = "If-None-Match";
                                    } else if (dateM81698a3 != null) {
                                        str4 = "If-Modified-Since";
                                        str = str2;
                                    } else if (dateM81698a != null) {
                                        str4 = r9;
                                        str = str3;
                                    } else {
                                        r8 = 0;
                                        c13709c = new C13709c(request, null);
                                    }
                                    C13766o.a aVarM81843a3 = request.headers().m81843a();
                                    ((OkHttpClient.C13689a) AbstractC13704a.f56453a).getClass();
                                    aVarM81843a3.f56907a.add(str4);
                                    aVarM81843a3.f56907a.add(str.trim());
                                    c13709c = new C13709c(request.newBuilder().headers(new C13766o(aVarM81843a3)).build(), responseM81640b);
                                    r8 = 0;
                                }
                            } else {
                                if (str != null) {
                                    str4 = "If-None-Match";
                                } else if (dateM81698a3 != null) {
                                    str4 = "If-Modified-Since";
                                    str = str2;
                                } else if (dateM81698a != null) {
                                    str4 = r9;
                                    str = str3;
                                } else {
                                    r8 = 0;
                                    c13709c = new C13709c(request, null);
                                }
                                C13766o.a aVarM81843a4 = request.headers().m81843a();
                                ((OkHttpClient.C13689a) AbstractC13704a.f56453a).getClass();
                                aVarM81843a4.f56907a.add(str4);
                                aVarM81843a4.f56907a.add(str.trim());
                                c13709c = new C13709c(request.newBuilder().headers(new C13766o(aVarM81843a4)).build(), responseM81640b);
                                r8 = 0;
                            }
                        }
                        j = 0;
                        time2 = j;
                        i2 = c13698dCacheControl.f56409c;
                        if (i2 != -1) {
                            time2 = Math.min(time2, timeUnit.toMillis(i2));
                        }
                        i3 = c13698dCacheControl.f56415i;
                        if (i3 != -1) {
                            millis = timeUnit.toMillis(i3);
                        } else {
                            millis = j;
                        }
                        if (c13698dCacheControl2.f56413g) {
                            millis2 = j;
                        } else {
                            millis2 = j;
                        }
                        if (c13698dCacheControl2.f56407a) {
                            j2 = j3 + millis;
                            if (j2 < millis2 + time2) {
                                builderNewBuilder = responseM81640b.newBuilder();
                                if (j2 >= time2) {
                                    builderNewBuilder.addHeader(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j3 > 86400000) {
                                    builderNewBuilder.addHeader(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                r8 = 0;
                                c13709c = new C13709c(null, builderNewBuilder.build());
                            } else {
                                if (str != null) {
                                    str4 = "If-None-Match";
                                } else if (dateM81698a3 != null) {
                                    str4 = "If-Modified-Since";
                                    str = str2;
                                } else if (dateM81698a != null) {
                                    str4 = r9;
                                    str = str3;
                                } else {
                                    r8 = 0;
                                    c13709c = new C13709c(request, null);
                                }
                                C13766o.a aVarM81843a5 = request.headers().m81843a();
                                ((OkHttpClient.C13689a) AbstractC13704a.f56453a).getClass();
                                aVarM81843a5.f56907a.add(str4);
                                aVarM81843a5.f56907a.add(str.trim());
                                c13709c = new C13709c(request.newBuilder().headers(new C13766o(aVarM81843a5)).build(), responseM81640b);
                                r8 = 0;
                            }
                        } else {
                            if (str != null) {
                                str4 = "If-None-Match";
                            } else if (dateM81698a3 != null) {
                                str4 = "If-Modified-Since";
                                str = str2;
                            } else if (dateM81698a != null) {
                                str4 = r9;
                                str = str3;
                            } else {
                                r8 = 0;
                                c13709c = new C13709c(request, null);
                            }
                            C13766o.a aVarM81843a6 = request.headers().m81843a();
                            ((OkHttpClient.C13689a) AbstractC13704a.f56453a).getClass();
                            aVarM81843a6.f56907a.add(str4);
                            aVarM81843a6.f56907a.add(str.trim());
                            c13709c = new C13709c(request.newBuilder().headers(new C13766o(aVarM81843a6)).build(), responseM81640b);
                            r8 = 0;
                        }
                    }
                    j = 0;
                    i2 = c13698dCacheControl.f56409c;
                    if (i2 != -1) {
                        time2 = Math.min(time2, timeUnit.toMillis(i2));
                    }
                    i3 = c13698dCacheControl.f56415i;
                    if (i3 != -1) {
                        millis = timeUnit.toMillis(i3);
                    } else {
                        millis = j;
                    }
                    if (c13698dCacheControl2.f56413g) {
                        millis2 = j;
                    } else {
                        millis2 = j;
                    }
                    if (c13698dCacheControl2.f56407a) {
                        j2 = j3 + millis;
                        if (j2 < millis2 + time2) {
                            builderNewBuilder = responseM81640b.newBuilder();
                            if (j2 >= time2) {
                                builderNewBuilder.addHeader(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                            }
                            if (j3 > 86400000) {
                                builderNewBuilder.addHeader(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                            }
                            r8 = 0;
                            c13709c = new C13709c(null, builderNewBuilder.build());
                        } else {
                            if (str != null) {
                                str4 = "If-None-Match";
                            } else if (dateM81698a3 != null) {
                                str4 = "If-Modified-Since";
                                str = str2;
                            } else if (dateM81698a != null) {
                                str4 = r9;
                                str = str3;
                            } else {
                                r8 = 0;
                                c13709c = new C13709c(request, null);
                            }
                            C13766o.a aVarM81843a7 = request.headers().m81843a();
                            ((OkHttpClient.C13689a) AbstractC13704a.f56453a).getClass();
                            aVarM81843a7.f56907a.add(str4);
                            aVarM81843a7.f56907a.add(str.trim());
                            c13709c = new C13709c(request.newBuilder().headers(new C13766o(aVarM81843a7)).build(), responseM81640b);
                            r8 = 0;
                        }
                    } else {
                        if (str != null) {
                            str4 = "If-None-Match";
                        } else if (dateM81698a3 != null) {
                            str4 = "If-Modified-Since";
                            str = str2;
                        } else if (dateM81698a != null) {
                            str4 = r9;
                            str = str3;
                        } else {
                            r8 = 0;
                            c13709c = new C13709c(request, null);
                        }
                        C13766o.a aVarM81843a8 = request.headers().m81843a();
                        ((OkHttpClient.C13689a) AbstractC13704a.f56453a).getClass();
                        aVarM81843a8.f56907a.add(str4);
                        aVarM81843a8.f56907a.add(str.trim());
                        c13709c = new C13709c(request.newBuilder().headers(new C13766o(aVarM81843a8)).build(), responseM81640b);
                        r8 = 0;
                    }
                } else {
                    r8 = 0;
                    c13709c = new C13709c(request, null);
                }
            } else {
                c13709c = new C13709c(request, null);
            }
        }
        if (c13709c.f56471a != null && request.cacheControl().f56416j) {
            c13709c = new C13709c(r8, r8);
        }
        Request request2 = c13709c.f56471a;
        Response response = c13709c.f56472b;
        InterfaceC13710d interfaceC13710d2 = this.f56466a;
        if (interfaceC13710d2 != null) {
            interfaceC13710d2.m81639a(c13709c);
        }
        if (responseM81640b != null && response == null) {
            C13706c.m81615a(responseM81640b.body());
        }
        if (request2 == null && response == null) {
            return new Response.Builder().request(chain.request()).protocol(EnumC13768q.HTTP_1_1).code(HttpStatus.GATEWAY_TIMEOUT_504).message("Unsatisfiable Request (only-if-cached)").body(C13706c.f56457c).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
        }
        if (request2 == null) {
            return response.newBuilder().cacheResponse(m81628a(response)).build();
        }
        try {
            Response responseProceed = chain.proceed(request2);
            if (responseProceed == null && responseM81640b != null) {
                C13706c.m81615a(responseM81640b.body());
            }
            if (response != null) {
                if (responseProceed.code() == 304) {
                    Response.Builder builderNewBuilder2 = response.newBuilder();
                    C13766o c13766oHeaders2 = response.headers();
                    C13766o c13766oHeaders3 = responseProceed.headers();
                    C13766o.a aVar = new C13766o.a();
                    int iM81845b2 = c13766oHeaders2.m81845b();
                    for (int i7 = 0; i7 < iM81845b2; i7++) {
                        String strM81844a2 = c13766oHeaders2.m81844a(i7);
                        String strM81846b2 = c13766oHeaders2.m81846b(i7);
                        if ((!HttpHeaders.WARNING.equalsIgnoreCase(strM81844a2) || !strM81846b2.startsWith("1")) && (m81629a(strM81844a2) || !m81630b(strM81844a2) || c13766oHeaders3.m81847b(strM81844a2) == null)) {
                            AbstractC13704a.f56453a.mo81584a(aVar, strM81844a2, strM81846b2);
                        }
                    }
                    int iM81845b3 = c13766oHeaders3.m81845b();
                    for (int i8 = 0; i8 < iM81845b3; i8++) {
                        String strM81844a3 = c13766oHeaders3.m81844a(i8);
                        if (!m81629a(strM81844a3) && m81630b(strM81844a3)) {
                            AbstractC13704a.f56453a.mo81584a(aVar, strM81844a3, c13766oHeaders3.m81846b(i8));
                        }
                    }
                    Response responseBuild = builderNewBuilder2.headers(new C13766o(aVar)).sentRequestAtMillis(responseProceed.sentRequestAtMillis()).receivedResponseAtMillis(responseProceed.receivedResponseAtMillis()).cacheResponse(m81628a(response)).networkResponse(m81628a(responseProceed)).build();
                    responseProceed.body().close();
                    this.f56466a.m81636a();
                    this.f56466a.m81638a(response, responseBuild);
                    return responseBuild;
                }
                C13706c.m81615a(response.body());
            }
            Response responseBuild2 = responseProceed.newBuilder().cacheResponse(m81628a(response)).networkResponse(m81628a(responseProceed)).build();
            if (this.f56466a != null) {
                if (C13724c.m81706b(responseBuild2) && C13709c.m81634a(responseBuild2, request2)) {
                    InterfaceC13708b interfaceC13708bM81635a = this.f56466a.m81635a(responseBuild2);
                    if (interfaceC13708bM81635a != null && (interfaceC13793vM81632a = interfaceC13708bM81635a.m81632a()) != null) {
                        return responseBuild2.newBuilder().body(new C13725d(responseBuild2.header("Content-Type"), responseBuild2.body().contentLength(), new C13789r(new C13707a(this, responseBuild2.body().source(), interfaceC13708bM81635a, C13785n.m81960a(interfaceC13793vM81632a))))).build();
                    }
                } else {
                    String strMethod = request2.method();
                    if (!strMethod.equals("POST") && !strMethod.equals("PATCH") && !strMethod.equals(HttpMethods.PUT) && !strMethod.equals(HttpMethods.DELETE) && !strMethod.equals(HttpMethods.MOVE)) {
                        return responseBuild2;
                    }
                    try {
                        this.f56466a.m81637a(request2);
                    } catch (IOException unused) {
                    }
                }
            }
            return responseBuild2;
        } catch (Throwable th) {
            if (responseM81640b != null) {
                C13706c.m81615a(responseM81640b.body());
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Response m81628a(Response response) {
        return (response == null || response.body() == null) ? response : response.newBuilder().body(null).build();
    }
}
