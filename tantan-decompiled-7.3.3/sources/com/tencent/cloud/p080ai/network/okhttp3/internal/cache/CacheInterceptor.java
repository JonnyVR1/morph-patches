package com.tencent.cloud.p080ai.network.okhttp3.internal.cache;

import com.tencent.cloud.p080ai.network.okhttp3.C13861d;
import com.tencent.cloud.p080ai.network.okhttp3.C13929o;
import com.tencent.cloud.p080ai.network.okhttp3.C13930p;
import com.tencent.cloud.p080ai.network.okhttp3.EnumC13931q;
import com.tencent.cloud.p080ai.network.okhttp3.Interceptor;
import com.tencent.cloud.p080ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p080ai.network.okhttp3.Request;
import com.tencent.cloud.p080ai.network.okhttp3.Response;
import com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractC13867a;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http.C13886b;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http.C13887c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http.C13888d;
import com.tencent.cloud.p080ai.network.okio.C13948n;
import com.tencent.cloud.p080ai.network.okio.C13952r;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13956v;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: loaded from: classes12.dex */
public final class CacheInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13873d f57314a;

    public CacheInterceptor(InterfaceC13873d interfaceC13873d) {
        this.f57314a = interfaceC13873d;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m82812a(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m82813b(String str) {
        return (HttpHeaders.CONNECTION.equalsIgnoreCase(str) || HttpHeaders.KEEP_ALIVE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHENTICATE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHORIZATION.equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || HttpHeaders.TRANSFER_ENCODING.equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
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
    @Override // com.tencent.cloud.p080ai.network.okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        int i;
        long jSentRequestAtMillis;
        long time;
        String str;
        String str2;
        String str3;
        Date dateM82881a;
        Date dateM82881a2;
        Date dateM82881a3;
        ?? r8;
        C13872c c13872c;
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
        InterfaceC13956v interfaceC13956vM82815a;
        InterfaceC13873d interfaceC13873d = this.f57314a;
        Response responseM82823b = interfaceC13873d != null ? interfaceC13873d.m82823b(chain.request()) : null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Request request = chain.request();
        if (responseM82823b != null) {
            jSentRequestAtMillis = responseM82823b.sentRequestAtMillis();
            time = responseM82823b.receivedResponseAtMillis();
            C13929o c13929oHeaders = responseM82823b.headers();
            int iM83028b = c13929oHeaders.m83028b();
            int iM82883a = -1;
            str = null;
            str2 = null;
            str3 = null;
            dateM82881a = null;
            dateM82881a2 = null;
            dateM82881a3 = null;
            for (int i5 = 0; i5 < iM83028b; i5++) {
                String strM83027a = c13929oHeaders.m83027a(i5);
                String strM83029b = c13929oHeaders.m83029b(i5);
                if ("Date".equalsIgnoreCase(strM83027a)) {
                    dateM82881a = C13886b.m82881a(strM83029b);
                    str3 = strM83029b;
                } else if ("Expires".equalsIgnoreCase(strM83027a)) {
                    dateM82881a2 = C13886b.m82881a(strM83029b);
                } else if ("Last-Modified".equalsIgnoreCase(strM83027a)) {
                    dateM82881a3 = C13886b.m82881a(strM83029b);
                    str2 = strM83029b;
                } else if ("ETag".equalsIgnoreCase(strM83027a)) {
                    str = strM83029b;
                } else if (HttpHeaders.AGE.equalsIgnoreCase(strM83027a)) {
                    iM82883a = C13887c.m82883a(strM83029b, -1);
                }
            }
            i = iM82883a;
        } else {
            i = -1;
            jSentRequestAtMillis = 0;
            time = 0;
            str = null;
            str2 = null;
            str3 = null;
            dateM82881a = null;
            dateM82881a2 = null;
            dateM82881a3 = null;
        }
        if (responseM82823b == null) {
            r8 = 0;
            c13872c = new C13872c(request, null);
        } else {
            r8 = 0;
            r8 = 0;
            if (!(request.isHttps() && responseM82823b.handshake() == null) && C13872c.m82817a(responseM82823b, request)) {
                C13861d c13861dCacheControl = request.cacheControl();
                if (!c13861dCacheControl.f57255a && request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) {
                    C13861d c13861dCacheControl2 = responseM82823b.cacheControl();
                    long jMax = dateM82881a != null ? Math.max(0L, time - dateM82881a.getTime()) : 0L;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    if (i != -1) {
                        jMax = Math.max(jMax, timeUnit.toMillis(i));
                    }
                    long j3 = jMax + (time - jSentRequestAtMillis) + (jCurrentTimeMillis - time);
                    int i6 = responseM82823b.cacheControl().f57257c;
                    if (i6 != -1) {
                        time2 = timeUnit.toMillis(i6);
                    } else {
                        if (dateM82881a2 != null) {
                            if (dateM82881a != null) {
                                time = dateM82881a.getTime();
                            }
                            time2 = dateM82881a2.getTime() - time;
                            if (time2 > 0) {
                            }
                            i2 = c13861dCacheControl.f57257c;
                            if (i2 != -1) {
                                time2 = Math.min(time2, timeUnit.toMillis(i2));
                            }
                            i3 = c13861dCacheControl.f57263i;
                            if (i3 != -1) {
                                millis = timeUnit.toMillis(i3);
                            } else {
                                millis = j;
                            }
                            if (!c13861dCacheControl2.f57261g || (i4 = c13861dCacheControl.f57262h) == -1) {
                                millis2 = j;
                            } else {
                                millis2 = timeUnit.toMillis(i4);
                            }
                            if (c13861dCacheControl2.f57255a) {
                                if (str != null) {
                                    str4 = "If-None-Match";
                                } else if (dateM82881a3 != null) {
                                    str4 = "If-Modified-Since";
                                    str = str2;
                                } else if (dateM82881a != null) {
                                    str4 = r9;
                                    str = str3;
                                } else {
                                    r8 = 0;
                                    c13872c = new C13872c(request, null);
                                }
                                C13929o.a aVarM83026a = request.headers().m83026a();
                                ((OkHttpClient.C13852a) AbstractC13867a.f57301a).getClass();
                                aVarM83026a.f57755a.add(str4);
                                aVarM83026a.f57755a.add(str.trim());
                                c13872c = new C13872c(request.newBuilder().headers(new C13929o(aVarM83026a)).build(), responseM82823b);
                                r8 = 0;
                            } else {
                                j2 = j3 + millis;
                                if (j2 < millis2 + time2) {
                                    builderNewBuilder = responseM82823b.newBuilder();
                                    if (j2 >= time2) {
                                        builderNewBuilder.addHeader(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (j3 > 86400000 && responseM82823b.cacheControl().f57257c == -1 && dateM82881a2 == null) {
                                        builderNewBuilder.addHeader(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                    r8 = 0;
                                    c13872c = new C13872c(null, builderNewBuilder.build());
                                } else {
                                    if (str != null) {
                                        str4 = "If-None-Match";
                                    } else if (dateM82881a3 != null) {
                                        str4 = "If-Modified-Since";
                                        str = str2;
                                    } else if (dateM82881a != null) {
                                        str4 = r9;
                                        str = str3;
                                    } else {
                                        r8 = 0;
                                        c13872c = new C13872c(request, null);
                                    }
                                    C13929o.a aVarM83026a2 = request.headers().m83026a();
                                    ((OkHttpClient.C13852a) AbstractC13867a.f57301a).getClass();
                                    aVarM83026a2.f57755a.add(str4);
                                    aVarM83026a2.f57755a.add(str.trim());
                                    c13872c = new C13872c(request.newBuilder().headers(new C13929o(aVarM83026a2)).build(), responseM82823b);
                                    r8 = 0;
                                }
                            }
                        } else {
                            if (dateM82881a3 != null) {
                                C13930p c13930pUrl = responseM82823b.request().url();
                                if (c13930pUrl.f57762f == null) {
                                    string = null;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    C13930p.m83040a(sb, c13930pUrl.f57762f);
                                    string = sb.toString();
                                }
                                if (string == null) {
                                    long time3 = (dateM82881a != null ? dateM82881a.getTime() : jSentRequestAtMillis) - dateM82881a3.getTime();
                                    j = 0;
                                    if (time3 > 0) {
                                        time2 = time3 / 10;
                                    }
                                }
                                time2 = j;
                            }
                            i2 = c13861dCacheControl.f57257c;
                            if (i2 != -1) {
                                time2 = Math.min(time2, timeUnit.toMillis(i2));
                            }
                            i3 = c13861dCacheControl.f57263i;
                            if (i3 != -1) {
                                millis = timeUnit.toMillis(i3);
                            } else {
                                millis = j;
                            }
                            if (c13861dCacheControl2.f57261g) {
                                millis2 = j;
                            } else {
                                millis2 = j;
                            }
                            if (c13861dCacheControl2.f57255a) {
                                j2 = j3 + millis;
                                if (j2 < millis2 + time2) {
                                    builderNewBuilder = responseM82823b.newBuilder();
                                    if (j2 >= time2) {
                                        builderNewBuilder.addHeader(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (j3 > 86400000) {
                                        builderNewBuilder.addHeader(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                    r8 = 0;
                                    c13872c = new C13872c(null, builderNewBuilder.build());
                                } else {
                                    if (str != null) {
                                        str4 = "If-None-Match";
                                    } else if (dateM82881a3 != null) {
                                        str4 = "If-Modified-Since";
                                        str = str2;
                                    } else if (dateM82881a != null) {
                                        str4 = r9;
                                        str = str3;
                                    } else {
                                        r8 = 0;
                                        c13872c = new C13872c(request, null);
                                    }
                                    C13929o.a aVarM83026a3 = request.headers().m83026a();
                                    ((OkHttpClient.C13852a) AbstractC13867a.f57301a).getClass();
                                    aVarM83026a3.f57755a.add(str4);
                                    aVarM83026a3.f57755a.add(str.trim());
                                    c13872c = new C13872c(request.newBuilder().headers(new C13929o(aVarM83026a3)).build(), responseM82823b);
                                    r8 = 0;
                                }
                            } else {
                                if (str != null) {
                                    str4 = "If-None-Match";
                                } else if (dateM82881a3 != null) {
                                    str4 = "If-Modified-Since";
                                    str = str2;
                                } else if (dateM82881a != null) {
                                    str4 = r9;
                                    str = str3;
                                } else {
                                    r8 = 0;
                                    c13872c = new C13872c(request, null);
                                }
                                C13929o.a aVarM83026a4 = request.headers().m83026a();
                                ((OkHttpClient.C13852a) AbstractC13867a.f57301a).getClass();
                                aVarM83026a4.f57755a.add(str4);
                                aVarM83026a4.f57755a.add(str.trim());
                                c13872c = new C13872c(request.newBuilder().headers(new C13929o(aVarM83026a4)).build(), responseM82823b);
                                r8 = 0;
                            }
                        }
                        j = 0;
                        time2 = j;
                        i2 = c13861dCacheControl.f57257c;
                        if (i2 != -1) {
                            time2 = Math.min(time2, timeUnit.toMillis(i2));
                        }
                        i3 = c13861dCacheControl.f57263i;
                        if (i3 != -1) {
                            millis = timeUnit.toMillis(i3);
                        } else {
                            millis = j;
                        }
                        if (c13861dCacheControl2.f57261g) {
                            millis2 = j;
                        } else {
                            millis2 = j;
                        }
                        if (c13861dCacheControl2.f57255a) {
                            j2 = j3 + millis;
                            if (j2 < millis2 + time2) {
                                builderNewBuilder = responseM82823b.newBuilder();
                                if (j2 >= time2) {
                                    builderNewBuilder.addHeader(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j3 > 86400000) {
                                    builderNewBuilder.addHeader(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                r8 = 0;
                                c13872c = new C13872c(null, builderNewBuilder.build());
                            } else {
                                if (str != null) {
                                    str4 = "If-None-Match";
                                } else if (dateM82881a3 != null) {
                                    str4 = "If-Modified-Since";
                                    str = str2;
                                } else if (dateM82881a != null) {
                                    str4 = r9;
                                    str = str3;
                                } else {
                                    r8 = 0;
                                    c13872c = new C13872c(request, null);
                                }
                                C13929o.a aVarM83026a5 = request.headers().m83026a();
                                ((OkHttpClient.C13852a) AbstractC13867a.f57301a).getClass();
                                aVarM83026a5.f57755a.add(str4);
                                aVarM83026a5.f57755a.add(str.trim());
                                c13872c = new C13872c(request.newBuilder().headers(new C13929o(aVarM83026a5)).build(), responseM82823b);
                                r8 = 0;
                            }
                        } else {
                            if (str != null) {
                                str4 = "If-None-Match";
                            } else if (dateM82881a3 != null) {
                                str4 = "If-Modified-Since";
                                str = str2;
                            } else if (dateM82881a != null) {
                                str4 = r9;
                                str = str3;
                            } else {
                                r8 = 0;
                                c13872c = new C13872c(request, null);
                            }
                            C13929o.a aVarM83026a6 = request.headers().m83026a();
                            ((OkHttpClient.C13852a) AbstractC13867a.f57301a).getClass();
                            aVarM83026a6.f57755a.add(str4);
                            aVarM83026a6.f57755a.add(str.trim());
                            c13872c = new C13872c(request.newBuilder().headers(new C13929o(aVarM83026a6)).build(), responseM82823b);
                            r8 = 0;
                        }
                    }
                    j = 0;
                    i2 = c13861dCacheControl.f57257c;
                    if (i2 != -1) {
                        time2 = Math.min(time2, timeUnit.toMillis(i2));
                    }
                    i3 = c13861dCacheControl.f57263i;
                    if (i3 != -1) {
                        millis = timeUnit.toMillis(i3);
                    } else {
                        millis = j;
                    }
                    if (c13861dCacheControl2.f57261g) {
                        millis2 = j;
                    } else {
                        millis2 = j;
                    }
                    if (c13861dCacheControl2.f57255a) {
                        j2 = j3 + millis;
                        if (j2 < millis2 + time2) {
                            builderNewBuilder = responseM82823b.newBuilder();
                            if (j2 >= time2) {
                                builderNewBuilder.addHeader(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                            }
                            if (j3 > 86400000) {
                                builderNewBuilder.addHeader(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                            }
                            r8 = 0;
                            c13872c = new C13872c(null, builderNewBuilder.build());
                        } else {
                            if (str != null) {
                                str4 = "If-None-Match";
                            } else if (dateM82881a3 != null) {
                                str4 = "If-Modified-Since";
                                str = str2;
                            } else if (dateM82881a != null) {
                                str4 = r9;
                                str = str3;
                            } else {
                                r8 = 0;
                                c13872c = new C13872c(request, null);
                            }
                            C13929o.a aVarM83026a7 = request.headers().m83026a();
                            ((OkHttpClient.C13852a) AbstractC13867a.f57301a).getClass();
                            aVarM83026a7.f57755a.add(str4);
                            aVarM83026a7.f57755a.add(str.trim());
                            c13872c = new C13872c(request.newBuilder().headers(new C13929o(aVarM83026a7)).build(), responseM82823b);
                            r8 = 0;
                        }
                    } else {
                        if (str != null) {
                            str4 = "If-None-Match";
                        } else if (dateM82881a3 != null) {
                            str4 = "If-Modified-Since";
                            str = str2;
                        } else if (dateM82881a != null) {
                            str4 = r9;
                            str = str3;
                        } else {
                            r8 = 0;
                            c13872c = new C13872c(request, null);
                        }
                        C13929o.a aVarM83026a8 = request.headers().m83026a();
                        ((OkHttpClient.C13852a) AbstractC13867a.f57301a).getClass();
                        aVarM83026a8.f57755a.add(str4);
                        aVarM83026a8.f57755a.add(str.trim());
                        c13872c = new C13872c(request.newBuilder().headers(new C13929o(aVarM83026a8)).build(), responseM82823b);
                        r8 = 0;
                    }
                } else {
                    r8 = 0;
                    c13872c = new C13872c(request, null);
                }
            } else {
                c13872c = new C13872c(request, null);
            }
        }
        if (c13872c.f57319a != null && request.cacheControl().f57264j) {
            c13872c = new C13872c(r8, r8);
        }
        Request request2 = c13872c.f57319a;
        Response response = c13872c.f57320b;
        InterfaceC13873d interfaceC13873d2 = this.f57314a;
        if (interfaceC13873d2 != null) {
            interfaceC13873d2.m82822a(c13872c);
        }
        if (responseM82823b != null && response == null) {
            C13869c.m82798a(responseM82823b.body());
        }
        if (request2 == null && response == null) {
            return new Response.Builder().request(chain.request()).protocol(EnumC13931q.HTTP_1_1).code(HttpStatus.GATEWAY_TIMEOUT_504).message("Unsatisfiable Request (only-if-cached)").body(C13869c.f57305c).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
        }
        if (request2 == null) {
            return response.newBuilder().cacheResponse(m82811a(response)).build();
        }
        try {
            Response responseProceed = chain.proceed(request2);
            if (responseProceed == null && responseM82823b != null) {
                C13869c.m82798a(responseM82823b.body());
            }
            if (response != null) {
                if (responseProceed.code() == 304) {
                    Response.Builder builderNewBuilder2 = response.newBuilder();
                    C13929o c13929oHeaders2 = response.headers();
                    C13929o c13929oHeaders3 = responseProceed.headers();
                    C13929o.a aVar = new C13929o.a();
                    int iM83028b2 = c13929oHeaders2.m83028b();
                    for (int i7 = 0; i7 < iM83028b2; i7++) {
                        String strM83027a2 = c13929oHeaders2.m83027a(i7);
                        String strM83029b2 = c13929oHeaders2.m83029b(i7);
                        if ((!HttpHeaders.WARNING.equalsIgnoreCase(strM83027a2) || !strM83029b2.startsWith("1")) && (m82812a(strM83027a2) || !m82813b(strM83027a2) || c13929oHeaders3.m83030b(strM83027a2) == null)) {
                            AbstractC13867a.f57301a.mo82767a(aVar, strM83027a2, strM83029b2);
                        }
                    }
                    int iM83028b3 = c13929oHeaders3.m83028b();
                    for (int i8 = 0; i8 < iM83028b3; i8++) {
                        String strM83027a3 = c13929oHeaders3.m83027a(i8);
                        if (!m82812a(strM83027a3) && m82813b(strM83027a3)) {
                            AbstractC13867a.f57301a.mo82767a(aVar, strM83027a3, c13929oHeaders3.m83029b(i8));
                        }
                    }
                    Response responseBuild = builderNewBuilder2.headers(new C13929o(aVar)).sentRequestAtMillis(responseProceed.sentRequestAtMillis()).receivedResponseAtMillis(responseProceed.receivedResponseAtMillis()).cacheResponse(m82811a(response)).networkResponse(m82811a(responseProceed)).build();
                    responseProceed.body().close();
                    this.f57314a.m82819a();
                    this.f57314a.m82821a(response, responseBuild);
                    return responseBuild;
                }
                C13869c.m82798a(response.body());
            }
            Response responseBuild2 = responseProceed.newBuilder().cacheResponse(m82811a(response)).networkResponse(m82811a(responseProceed)).build();
            if (this.f57314a != null) {
                if (C13887c.m82889b(responseBuild2) && C13872c.m82817a(responseBuild2, request2)) {
                    InterfaceC13871b interfaceC13871bM82818a = this.f57314a.m82818a(responseBuild2);
                    if (interfaceC13871bM82818a != null && (interfaceC13956vM82815a = interfaceC13871bM82818a.m82815a()) != null) {
                        return responseBuild2.newBuilder().body(new C13888d(responseBuild2.header("Content-Type"), responseBuild2.body().contentLength(), new C13952r(new C13870a(this, responseBuild2.body().source(), interfaceC13871bM82818a, C13948n.m83143a(interfaceC13956vM82815a))))).build();
                    }
                } else {
                    String strMethod = request2.method();
                    if (!strMethod.equals("POST") && !strMethod.equals("PATCH") && !strMethod.equals(HttpMethods.PUT) && !strMethod.equals(HttpMethods.DELETE) && !strMethod.equals(HttpMethods.MOVE)) {
                        return responseBuild2;
                    }
                    try {
                        this.f57314a.m82820a(request2);
                    } catch (IOException unused) {
                    }
                }
            }
            return responseBuild2;
        } catch (Throwable th) {
            if (responseM82823b != null) {
                C13869c.m82798a(responseM82823b.body());
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Response m82811a(Response response) {
        return (response == null || response.body() == null) ? response : response.newBuilder().body(null).build();
    }
}
