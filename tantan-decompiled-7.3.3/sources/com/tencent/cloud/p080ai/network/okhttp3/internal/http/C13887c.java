package com.tencent.cloud.p080ai.network.okhttp3.internal.http;

import com.google.android.gms.common.api.Api;
import com.tencent.cloud.p080ai.network.okhttp3.C13863f;
import com.tencent.cloud.p080ai.network.okhttp3.C13925k;
import com.tencent.cloud.p080ai.network.okhttp3.C13929o;
import com.tencent.cloud.p080ai.network.okhttp3.C13930p;
import com.tencent.cloud.p080ai.network.okhttp3.InterfaceC13926l;
import com.tencent.cloud.p080ai.network.okhttp3.Response;
import com.tencent.cloud.p080ai.network.okio.ByteString;
import com.tencent.cloud.p080ai.network.okio.C13939e;
import com.tencent.cloud.p080ai.network.okio.C13959y;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpMethods;
import p153l.aqg0;
import p153l.fig0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http.c */
/* JADX INFO: loaded from: classes12.dex */
public final class C13887c {

    /* JADX INFO: renamed from: a */
    public static final ByteString f57425a = ByteString.encodeUtf8("\"\\");

    /* JADX INFO: renamed from: b */
    public static final ByteString f57426b = ByteString.encodeUtf8("\t ,=");

    /* JADX WARN: Code duplicated, block: B:13:0x0036 A[PHI: r6
      0x0036: PHI (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v8 java.lang.String) binds: [B:9:0x0029, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x0124  */
    /* JADX WARN: Code duplicated, block: B:77:0x0150 A[EDGE_INSN: B:77:0x0150->B:70:0x0150 BREAK  A[LOOP:1: B:8:0x0028->B:24:0x0068], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00a0 A[EDGE_INSN: B:86:0x00a0->B:32:0x00a0 BREAK  A[LOOP:3: B:26:0x008d->B:69:0x0146], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00a0 A[EDGE_INSN: B:87:0x00a0->B:32:0x00a0 BREAK  A[LOOP:3: B:26:0x008d->B:69:0x0146], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.util.List<com.tencent.cloud.ai.network.okhttp3.f>] */
    /* JADX INFO: renamed from: a */
    public static List<C13863f> m82887a(C13929o c13929o, String str) {
        boolean zM82890b;
        String strM82886a;
        byte b;
        int iM82882a;
        int iM82882a2;
        String str2;
        String str3;
        int i;
        String strM82886a2;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < c13929o.m83028b(); i2++) {
            if (str.equalsIgnoreCase(c13929o.m83027a(i2))) {
                C13939e c13939eMo83092a = new C13939e().mo83092a(c13929o.m83029b(i2));
                String str4 = null;
                while (true) {
                    String strM82886a3 = str4;
                    while (true) {
                        if (strM82886a3 == null) {
                            m82890b(c13939eMo83092a);
                            strM82886a3 = m82886a(c13939eMo83092a);
                            if (strM82886a3 == null) {
                                break;
                            }
                            zM82890b = m82890b(c13939eMo83092a);
                            strM82886a = m82886a(c13939eMo83092a);
                            if (strM82886a == null) {
                                if (c13939eMo83092a.mo83118g()) {
                                    break;
                                }
                                arrayList.add(new C13863f(strM82886a3, Collections.EMPTY_MAP));
                                break;
                            }
                            b = 61;
                            iM82882a = m82882a(c13939eMo83092a, (byte) 61);
                            boolean zM82890b2 = m82890b(c13939eMo83092a);
                            if (zM82890b && (zM82890b2 || c13939eMo83092a.mo83118g())) {
                                char[] cArr = new char[iM82882a];
                                Arrays.fill(cArr, '=');
                                arrayList.add(new C13863f(strM82886a3, Collections.singletonMap(str4, strM82886a.concat(new String(cArr)))));
                            } else {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                iM82882a2 = iM82882a + m82882a(c13939eMo83092a, (byte) 61);
                                while (true) {
                                    if (strM82886a == null) {
                                        strM82886a = m82886a(c13939eMo83092a);
                                        if (m82890b(c13939eMo83092a)) {
                                            break;
                                        }
                                        iM82882a2 = m82882a(c13939eMo83092a, b);
                                    }
                                    if (iM82882a2 == 0) {
                                        break;
                                    }
                                    if (iM82882a2 <= 1 || m82890b(c13939eMo83092a)) {
                                        break;
                                    }
                                    if (c13939eMo83092a.mo83118g() && c13939eMo83092a.m83120h(0L) == 34) {
                                        if (c13939eMo83092a.readByte() != 34) {
                                            ?? r16 = str4;
                                            fig0.m125680a();
                                            return r16;
                                        }
                                        C13939e c13939e = new C13939e();
                                        while (true) {
                                            long jM83083a = c13939eMo83092a.m83083a(f57425a);
                                            if (jM83083a == -1) {
                                                str2 = str4;
                                                str3 = strM82886a3;
                                                i = iM82882a2;
                                            } else {
                                                if (c13939eMo83092a.m83120h(jM83083a) == 34) {
                                                    c13939e.write(c13939eMo83092a, jM83083a);
                                                    c13939eMo83092a.readByte();
                                                    strM82886a2 = c13939e.m83130n();
                                                    str2 = str4;
                                                    str3 = strM82886a3;
                                                    i = iM82882a2;
                                                    break;
                                                }
                                                str2 = str4;
                                                str3 = strM82886a3;
                                                i = iM82882a2;
                                                if (c13939eMo83092a.f57818b != jM83083a + 1) {
                                                    c13939e.write(c13939eMo83092a, jM83083a);
                                                    c13939eMo83092a.readByte();
                                                    c13939e.write(c13939eMo83092a, 1L);
                                                    strM82886a3 = str3;
                                                    str4 = str2;
                                                    iM82882a2 = i;
                                                }
                                            }
                                            strM82886a2 = str2;
                                            break;
                                        }
                                    } else {
                                        str2 = str4;
                                        str3 = strM82886a3;
                                        i = iM82882a2;
                                        strM82886a2 = m82886a(c13939eMo83092a);
                                    }
                                    if (strM82886a2 != null || ((String) linkedHashMap.put(strM82886a, strM82886a2)) != null || (!m82890b(c13939eMo83092a) && !c13939eMo83092a.mo83118g())) {
                                        break;
                                    }
                                    strM82886a3 = str3;
                                    str4 = str2;
                                    strM82886a = str4;
                                    iM82882a2 = i;
                                    b = 61;
                                }
                                arrayList.add(new C13863f(strM82886a3, linkedHashMap));
                                strM82886a3 = strM82886a;
                            }
                        } else {
                            zM82890b = m82890b(c13939eMo83092a);
                            strM82886a = m82886a(c13939eMo83092a);
                            if (strM82886a == null) {
                                if (c13939eMo83092a.mo83118g()) {
                                    arrayList.add(new C13863f(strM82886a3, Collections.EMPTY_MAP));
                                    break;
                                    break;
                                }
                                break;
                                break;
                            }
                            b = 61;
                            iM82882a = m82882a(c13939eMo83092a, (byte) 61);
                            boolean zM82890b3 = m82890b(c13939eMo83092a);
                            if (zM82890b) {
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            iM82882a2 = iM82882a + m82882a(c13939eMo83092a, (byte) 61);
                            while (true) {
                                if (strM82886a == null) {
                                    strM82886a = m82886a(c13939eMo83092a);
                                    if (m82890b(c13939eMo83092a)) {
                                        break;
                                        break;
                                    }
                                    iM82882a2 = m82882a(c13939eMo83092a, b);
                                }
                                if (iM82882a2 == 0) {
                                    break;
                                    break;
                                }
                                if (iM82882a2 <= 1) {
                                    break;
                                }
                                if (c13939eMo83092a.mo83118g()) {
                                    str2 = str4;
                                    str3 = strM82886a3;
                                    i = iM82882a2;
                                    strM82886a2 = m82886a(c13939eMo83092a);
                                } else {
                                    str2 = str4;
                                    str3 = strM82886a3;
                                    i = iM82882a2;
                                    strM82886a2 = m82886a(c13939eMo83092a);
                                }
                                if (strM82886a2 != null) {
                                    break;
                                }
                                strM82886a3 = str3;
                                str4 = str2;
                                strM82886a = str4;
                                iM82882a2 = i;
                                b = 61;
                            }
                            arrayList.add(new C13863f(strM82886a3, linkedHashMap2));
                            strM82886a3 = strM82886a;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m82889b(Response response) {
        if (response.request().method().equals(HttpMethods.HEAD)) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && m82885a(response) == -1 && !HttpHeaderValues.CHUNKED.equalsIgnoreCase(response.header(HttpHeaders.TRANSFER_ENCODING))) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m82890b(C13939e c13939e) {
        boolean z = false;
        while (!c13939e.mo83118g()) {
            byte bM83120h = c13939e.m83120h(0L);
            if (bM83120h != 44) {
                if (bM83120h != 32 && bM83120h != 9) {
                    break;
                }
                c13939e.readByte();
            } else {
                c13939e.readByte();
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public static long m82885a(Response response) {
        String strM83030b = response.headers().m83030b("Content-Length");
        if (strM83030b == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strM83030b);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m82882a(C13939e c13939e, byte b) {
        int i = 0;
        while (!c13939e.mo83118g() && c13939e.m83120h(0L) == b) {
            i++;
            c13939e.readByte();
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static String m82886a(C13939e c13939e) {
        try {
            long jM83083a = c13939e.m83083a(f57426b);
            if (jM83083a == -1) {
                jM83083a = c13939e.f57818b;
            }
            if (jM83083a != 0) {
                return c13939e.m83094a(jM83083a, C13959y.f57868a);
            }
            return null;
        } catch (EOFException unused) {
            aqg0.m99478a();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m82888a(InterfaceC13926l interfaceC13926l, C13930p c13930p, C13929o c13929o) {
        if (interfaceC13926l == InterfaceC13926l.f57748a || C13925k.m83018a(c13930p, c13929o).isEmpty()) {
            return;
        }
        ((InterfaceC13926l.a) interfaceC13926l).getClass();
    }

    /* JADX INFO: renamed from: a */
    public static int m82884a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static int m82883a(String str, int i) {
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
