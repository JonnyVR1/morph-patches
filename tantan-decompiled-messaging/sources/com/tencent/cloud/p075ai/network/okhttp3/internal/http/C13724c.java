package com.tencent.cloud.p075ai.network.okhttp3.internal.http;

import com.google.android.gms.common.api.Api;
import com.tencent.cloud.p075ai.network.okhttp3.C13700f;
import com.tencent.cloud.p075ai.network.okhttp3.C13762k;
import com.tencent.cloud.p075ai.network.okhttp3.C13766o;
import com.tencent.cloud.p075ai.network.okhttp3.C13767p;
import com.tencent.cloud.p075ai.network.okhttp3.InterfaceC13763l;
import com.tencent.cloud.p075ai.network.okhttp3.Response;
import com.tencent.cloud.p075ai.network.okio.ByteString;
import com.tencent.cloud.p075ai.network.okio.C13776e;
import com.tencent.cloud.p075ai.network.okio.C13796y;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpMethods;
import p149l.shg0;
import p149l.x9g0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http.c */
/* JADX INFO: loaded from: classes13.dex */
public final class C13724c {

    /* JADX INFO: renamed from: a */
    public static final ByteString f56577a = ByteString.encodeUtf8("\"\\");

    /* JADX INFO: renamed from: b */
    public static final ByteString f56578b = ByteString.encodeUtf8("\t ,=");

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
    public static List<C13700f> m81704a(C13766o c13766o, String str) {
        boolean zM81707b;
        String strM81703a;
        byte b;
        int iM81699a;
        int iM81699a2;
        String str2;
        String str3;
        int i;
        String strM81703a2;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < c13766o.m81845b(); i2++) {
            if (str.equalsIgnoreCase(c13766o.m81844a(i2))) {
                C13776e c13776eMo81909a = new C13776e().mo81909a(c13766o.m81846b(i2));
                String str4 = null;
                while (true) {
                    String strM81703a3 = str4;
                    while (true) {
                        if (strM81703a3 == null) {
                            m81707b(c13776eMo81909a);
                            strM81703a3 = m81703a(c13776eMo81909a);
                            if (strM81703a3 == null) {
                                break;
                            }
                            zM81707b = m81707b(c13776eMo81909a);
                            strM81703a = m81703a(c13776eMo81909a);
                            if (strM81703a == null) {
                                if (c13776eMo81909a.mo81935g()) {
                                    break;
                                }
                                arrayList.add(new C13700f(strM81703a3, Collections.EMPTY_MAP));
                                break;
                            }
                            b = 61;
                            iM81699a = m81699a(c13776eMo81909a, (byte) 61);
                            boolean zM81707b2 = m81707b(c13776eMo81909a);
                            if (zM81707b && (zM81707b2 || c13776eMo81909a.mo81935g())) {
                                char[] cArr = new char[iM81699a];
                                Arrays.fill(cArr, '=');
                                arrayList.add(new C13700f(strM81703a3, Collections.singletonMap(str4, strM81703a.concat(new String(cArr)))));
                            } else {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                iM81699a2 = iM81699a + m81699a(c13776eMo81909a, (byte) 61);
                                while (true) {
                                    if (strM81703a == null) {
                                        strM81703a = m81703a(c13776eMo81909a);
                                        if (m81707b(c13776eMo81909a)) {
                                            break;
                                        }
                                        iM81699a2 = m81699a(c13776eMo81909a, b);
                                    }
                                    if (iM81699a2 == 0) {
                                        break;
                                    }
                                    if (iM81699a2 <= 1 || m81707b(c13776eMo81909a)) {
                                        break;
                                    }
                                    if (c13776eMo81909a.mo81935g() && c13776eMo81909a.m81937h(0L) == 34) {
                                        if (c13776eMo81909a.readByte() != 34) {
                                            ?? r16 = str4;
                                            x9g0.m207497a();
                                            return r16;
                                        }
                                        C13776e c13776e = new C13776e();
                                        while (true) {
                                            long jM81900a = c13776eMo81909a.m81900a(f56577a);
                                            if (jM81900a == -1) {
                                                str2 = str4;
                                                str3 = strM81703a3;
                                                i = iM81699a2;
                                            } else {
                                                if (c13776eMo81909a.m81937h(jM81900a) == 34) {
                                                    c13776e.write(c13776eMo81909a, jM81900a);
                                                    c13776eMo81909a.readByte();
                                                    strM81703a2 = c13776e.m81947n();
                                                    str2 = str4;
                                                    str3 = strM81703a3;
                                                    i = iM81699a2;
                                                    break;
                                                }
                                                str2 = str4;
                                                str3 = strM81703a3;
                                                i = iM81699a2;
                                                if (c13776eMo81909a.f56970b != jM81900a + 1) {
                                                    c13776e.write(c13776eMo81909a, jM81900a);
                                                    c13776eMo81909a.readByte();
                                                    c13776e.write(c13776eMo81909a, 1L);
                                                    strM81703a3 = str3;
                                                    str4 = str2;
                                                    iM81699a2 = i;
                                                }
                                            }
                                            strM81703a2 = str2;
                                            break;
                                        }
                                    } else {
                                        str2 = str4;
                                        str3 = strM81703a3;
                                        i = iM81699a2;
                                        strM81703a2 = m81703a(c13776eMo81909a);
                                    }
                                    if (strM81703a2 != null || ((String) linkedHashMap.put(strM81703a, strM81703a2)) != null || (!m81707b(c13776eMo81909a) && !c13776eMo81909a.mo81935g())) {
                                        break;
                                    }
                                    strM81703a3 = str3;
                                    str4 = str2;
                                    strM81703a = str4;
                                    iM81699a2 = i;
                                    b = 61;
                                }
                                arrayList.add(new C13700f(strM81703a3, linkedHashMap));
                                strM81703a3 = strM81703a;
                            }
                        } else {
                            zM81707b = m81707b(c13776eMo81909a);
                            strM81703a = m81703a(c13776eMo81909a);
                            if (strM81703a == null) {
                                if (c13776eMo81909a.mo81935g()) {
                                    arrayList.add(new C13700f(strM81703a3, Collections.EMPTY_MAP));
                                    break;
                                    break;
                                }
                                break;
                                break;
                            }
                            b = 61;
                            iM81699a = m81699a(c13776eMo81909a, (byte) 61);
                            boolean zM81707b3 = m81707b(c13776eMo81909a);
                            if (zM81707b) {
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            iM81699a2 = iM81699a + m81699a(c13776eMo81909a, (byte) 61);
                            while (true) {
                                if (strM81703a == null) {
                                    strM81703a = m81703a(c13776eMo81909a);
                                    if (m81707b(c13776eMo81909a)) {
                                        break;
                                        break;
                                    }
                                    iM81699a2 = m81699a(c13776eMo81909a, b);
                                }
                                if (iM81699a2 == 0) {
                                    break;
                                    break;
                                }
                                if (iM81699a2 <= 1) {
                                    break;
                                }
                                if (c13776eMo81909a.mo81935g()) {
                                    str2 = str4;
                                    str3 = strM81703a3;
                                    i = iM81699a2;
                                    strM81703a2 = m81703a(c13776eMo81909a);
                                } else {
                                    str2 = str4;
                                    str3 = strM81703a3;
                                    i = iM81699a2;
                                    strM81703a2 = m81703a(c13776eMo81909a);
                                }
                                if (strM81703a2 != null) {
                                    break;
                                }
                                strM81703a3 = str3;
                                str4 = str2;
                                strM81703a = str4;
                                iM81699a2 = i;
                                b = 61;
                            }
                            arrayList.add(new C13700f(strM81703a3, linkedHashMap2));
                            strM81703a3 = strM81703a;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m81706b(Response response) {
        if (response.request().method().equals(HttpMethods.HEAD)) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && m81702a(response) == -1 && !HttpHeaderValues.CHUNKED.equalsIgnoreCase(response.header(HttpHeaders.TRANSFER_ENCODING))) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m81707b(C13776e c13776e) {
        boolean z = false;
        while (!c13776e.mo81935g()) {
            byte bM81937h = c13776e.m81937h(0L);
            if (bM81937h != 44) {
                if (bM81937h != 32 && bM81937h != 9) {
                    break;
                }
                c13776e.readByte();
            } else {
                c13776e.readByte();
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public static long m81702a(Response response) {
        String strM81847b = response.headers().m81847b("Content-Length");
        if (strM81847b == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strM81847b);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m81699a(C13776e c13776e, byte b) {
        int i = 0;
        while (!c13776e.mo81935g() && c13776e.m81937h(0L) == b) {
            i++;
            c13776e.readByte();
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static String m81703a(C13776e c13776e) {
        try {
            long jM81900a = c13776e.m81900a(f56578b);
            if (jM81900a == -1) {
                jM81900a = c13776e.f56970b;
            }
            if (jM81900a != 0) {
                return c13776e.m81911a(jM81900a, C13796y.f57020a);
            }
            return null;
        } catch (EOFException unused) {
            shg0.m184191a();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m81705a(InterfaceC13763l interfaceC13763l, C13767p c13767p, C13766o c13766o) {
        if (interfaceC13763l == InterfaceC13763l.f56900a || C13762k.m81835a(c13767p, c13766o).isEmpty()) {
            return;
        }
        ((InterfaceC13763l.a) interfaceC13763l).getClass();
    }

    /* JADX INFO: renamed from: a */
    public static int m81701a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static int m81700a(String str, int i) {
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
