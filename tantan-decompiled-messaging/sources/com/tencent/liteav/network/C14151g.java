package com.tencent.liteav.network;

import android.content.Context;
import android.os.Handler;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p089d.C14025c;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXHttpRequest;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.Vector;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: renamed from: com.tencent.liteav.network.g */
/* JADX INFO: loaded from: classes2.dex */
public class C14151g {

    /* JADX INFO: renamed from: a */
    private final int f59532a = 5;

    /* JADX INFO: renamed from: b */
    private final int f59533b = 2;

    /* JADX INFO: renamed from: c */
    private String f59534c = "";

    /* JADX INFO: renamed from: d */
    private String f59535d = "";

    /* JADX INFO: renamed from: e */
    private int f59536e = 0;

    /* JADX INFO: renamed from: f */
    private String f59537f = "";

    /* JADX INFO: renamed from: g */
    private Handler f59538g;

    /* JADX INFO: renamed from: com.tencent.liteav.network.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo83671a(int i, String str, Vector<C14149e> vector);
    }

    public C14151g(Context context) {
        if (context != null) {
            this.f59538g = new Handler(context.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public long m83728e() {
        return C14025c.m82853a().m82878a("Network", "AccRetryCountWithoutSecret");
    }

    /* JADX INFO: renamed from: a */
    public int m83729a(String str, int i, final a aVar) {
        this.f59534c = "";
        this.f59535d = "";
        this.f59536e = 0;
        this.f59537f = "";
        if (str == null || str.isEmpty()) {
            return -1;
        }
        final String streamIDByStreamUrl = TXCCommonUtil.getStreamIDByStreamUrl(str);
        if (streamIDByStreamUrl == null || streamIDByStreamUrl.isEmpty()) {
            return -2;
        }
        final String strM83721a = m83721a("bizid", str);
        final String strM83721a2 = m83721a("txSecret", str);
        final String strM83721a3 = m83721a("txTime", str);
        if (!m83724a(true, strM83721a, strM83721a3, strM83721a2)) {
            return -3;
        }
        m83722a(streamIDByStreamUrl, strM83721a, strM83721a2, strM83721a3, i, new a() { // from class: com.tencent.liteav.network.g.1
            @Override // com.tencent.liteav.network.C14151g.a
            /* JADX INFO: renamed from: a */
            public void mo83671a(int i2, String str2, Vector<C14149e> vector) {
                C14151g.this.f59534c = streamIDByStreamUrl;
                C14151g.this.f59535d = strM83721a;
                C14151g.this.f59536e = i2;
                C14151g.this.f59537f = str2;
                if (vector == null || vector.isEmpty()) {
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo83671a(i2, str2, null);
                        return;
                    }
                    return;
                }
                Vector<C14149e> vector2 = new Vector<>();
                for (C14149e c14149e : vector) {
                    String strSubstring = c14149e.f59530a;
                    if (strSubstring.indexOf("?") != -1) {
                        strSubstring = strSubstring.substring(0, strSubstring.indexOf("?"));
                    }
                    vector2.add(new C14149e(strSubstring + "?txSecret=" + strM83721a2 + "&txTime=" + strM83721a3 + "&bizid=" + strM83721a, c14149e.f59531b));
                }
                if (aVar != null) {
                    for (C14149e c14149e2 : vector2) {
                        TXCLog.m82966e("TXRTMPAccUrlFetcher", "accurl = " + c14149e2.f59530a + " quic = " + c14149e2.f59531b);
                    }
                    aVar.mo83671a(i2, str2, vector2);
                }
            }
        });
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public String m83733d() {
        return this.f59537f;
    }

    /* JADX INFO: renamed from: c */
    public int m83732c() {
        return this.f59536e;
    }

    /* JADX INFO: renamed from: b */
    public String m83731b() {
        return this.f59535d;
    }

    /* JADX INFO: renamed from: a */
    public String m83730a() {
        return this.f59534c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m83724a(boolean z, String str, String str2, String str3) {
        if (z) {
            return (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || str3 == null || str3.isEmpty()) ? false : true;
        }
        return (str == null || str2 == null || str3 == null) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    private void m83722a(final String str, final String str2, final String str3, final String str4, final int i, final a aVar) {
        new Thread("getRTMPAccUrl") { // from class: com.tencent.liteav.network.g.2
            /* JADX WARN: Code duplicated, block: B:107:0x023a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:110:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:116:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:118:0x021d A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:122:0x0240 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:123:0x026b A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:126:0x011a A[EDGE_INSN: B:126:0x011a->B:28:0x011a BREAK  A[LOOP:1: B:25:0x0104->B:27:0x010a], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:19:0x0074  */
            /* JADX WARN: Code duplicated, block: B:23:0x007f  */
            /* JADX WARN: Code duplicated, block: B:27:0x010a A[Catch: Exception -> 0x0077, LOOP:1: B:25:0x0104->B:27:0x010a, LOOP_END, TryCatch #5 {Exception -> 0x0077, blocks: (B:17:0x004a, B:24:0x0081, B:25:0x0104, B:27:0x010a, B:28:0x011a, B:30:0x013f, B:32:0x0145, B:34:0x014b, B:35:0x014f, B:36:0x016b, B:38:0x0171), top: B:116:0x004a }] */
            /* JADX WARN: Code duplicated, block: B:30:0x013f A[Catch: Exception -> 0x0077, TryCatch #5 {Exception -> 0x0077, blocks: (B:17:0x004a, B:24:0x0081, B:25:0x0104, B:27:0x010a, B:28:0x011a, B:30:0x013f, B:32:0x0145, B:34:0x014b, B:35:0x014f, B:36:0x016b, B:38:0x0171), top: B:116:0x004a }] */
            /* JADX WARN: Code duplicated, block: B:32:0x0145 A[Catch: Exception -> 0x0077, TryCatch #5 {Exception -> 0x0077, blocks: (B:17:0x004a, B:24:0x0081, B:25:0x0104, B:27:0x010a, B:28:0x011a, B:30:0x013f, B:32:0x0145, B:34:0x014b, B:35:0x014f, B:36:0x016b, B:38:0x0171), top: B:116:0x004a }] */
            /* JADX WARN: Code duplicated, block: B:34:0x014b A[Catch: Exception -> 0x0077, TryCatch #5 {Exception -> 0x0077, blocks: (B:17:0x004a, B:24:0x0081, B:25:0x0104, B:27:0x010a, B:28:0x011a, B:30:0x013f, B:32:0x0145, B:34:0x014b, B:35:0x014f, B:36:0x016b, B:38:0x0171), top: B:116:0x004a }] */
            /* JADX WARN: Code duplicated, block: B:38:0x0171 A[Catch: Exception -> 0x0077, TRY_LEAVE, TryCatch #5 {Exception -> 0x0077, blocks: (B:17:0x004a, B:24:0x0081, B:25:0x0104, B:27:0x010a, B:28:0x011a, B:30:0x013f, B:32:0x0145, B:34:0x014b, B:35:0x014f, B:36:0x016b, B:38:0x0171), top: B:116:0x004a }] */
            /* JADX WARN: Code duplicated, block: B:42:0x0187  */
            /* JADX WARN: Code duplicated, block: B:43:0x018d  */
            /* JADX WARN: Code duplicated, block: B:46:0x0194 A[Catch: Exception -> 0x01fb, TryCatch #2 {Exception -> 0x01fb, blocks: (B:40:0x0181, B:44:0x018e, B:46:0x0194, B:48:0x019c), top: B:110:0x0181 }] */
            /* JADX WARN: Code duplicated, block: B:48:0x019c A[Catch: Exception -> 0x01fb, TRY_LEAVE, TryCatch #2 {Exception -> 0x01fb, blocks: (B:40:0x0181, B:44:0x018e, B:46:0x0194, B:48:0x019c), top: B:110:0x0181 }] */
            /* JADX WARN: Code duplicated, block: B:52:0x01af  */
            /* JADX WARN: Code duplicated, block: B:53:0x01b1  */
            /* JADX WARN: Code duplicated, block: B:69:0x01ff  */
            /* JADX WARN: Code duplicated, block: B:78:0x0223 A[Catch: Exception -> 0x0232, TRY_LEAVE, TryCatch #6 {Exception -> 0x0232, blocks: (B:76:0x021d, B:78:0x0223), top: B:118:0x021d }] */
            /* JADX WARN: Code duplicated, block: B:83:0x0237  */
            /* JADX WARN: Code duplicated, block: B:90:0x0251 A[Catch: Exception -> 0x024f, TryCatch #0 {Exception -> 0x024f, blocks: (B:85:0x023a, B:87:0x0240, B:90:0x0251, B:91:0x0255, B:93:0x025b, B:94:0x0265, B:96:0x026b), top: B:107:0x023a }] */
            /* JADX WARN: Code duplicated, block: B:93:0x025b A[Catch: Exception -> 0x024f, LOOP:2: B:91:0x0255->B:93:0x025b, LOOP_END, TryCatch #0 {Exception -> 0x024f, blocks: (B:85:0x023a, B:87:0x0240, B:90:0x0251, B:91:0x0255, B:93:0x025b, B:94:0x0265, B:96:0x026b), top: B:107:0x023a }] */
            /* JADX WARN: Code duplicated, block: B:98:0x027a  */
            /* JADX WARN: Instruction removed from duplicated block: B:27:0x010a, please report this as an issue */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v0 */
            /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
            /* JADX WARN: Type inference failed for: r11v14 */
            /* JADX WARN: Type inference failed for: r11v15 */
            /* JADX WARN: Type inference failed for: r11v16 */
            /* JADX WARN: Type inference failed for: r11v17 */
            /* JADX WARN: Type inference failed for: r11v18 */
            /* JADX WARN: Type inference failed for: r11v2 */
            /* JADX WARN: Type inference failed for: r11v20 */
            /* JADX WARN: Type inference failed for: r11v21 */
            /* JADX WARN: Type inference failed for: r11v22 */
            /* JADX WARN: Type inference failed for: r11v23 */
            /* JADX WARN: Type inference failed for: r11v24 */
            /* JADX WARN: Type inference failed for: r11v3 */
            /* JADX WARN: Type inference failed for: r11v4 */
            /* JADX WARN: Type inference failed for: r11v5 */
            /* JADX WARN: Type inference failed for: r11v6 */
            /* JADX WARN: Type inference failed for: r8v8, types: [java.net.HttpURLConnection, java.net.URLConnection, javax.net.ssl.HttpsURLConnection] */
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                int iM83728e;
                int i2;
                final int i3;
                final String string;
                int i4;
                String str5;
                String str6;
                ?? r11;
                ?? r12;
                String str7;
                BufferedReader bufferedReader;
                String str8;
                String line;
                JSONObject jSONObject;
                ?? r13;
                final Vector vector;
                final Vector vector2;
                JSONArray jSONArray;
                int i5;
                JSONObject jSONObject2;
                JSONArray jSONArray2;
                String string2;
                boolean z;
                String streamIDByStreamUrl;
                int i6;
                Iterator it;
                String str9 = "pull_addr";
                String str10 = "message";
                String str11 = str2;
                boolean z2 = false;
                int iIntValue = (str11 == null || str11.isEmpty()) ? 0 : Integer.valueOf(str2).intValue();
                ?? r14 = 1;
                if (!C14151g.this.m83724a(true, str2, str4, str3)) {
                    iM83728e = (int) C14151g.this.m83728e();
                    if (iM83728e <= 0) {
                        iM83728e = 1;
                        i2 = 1;
                    }
                    i3 = -1;
                    string = "";
                    i4 = iM83728e + i2;
                    while (i4 >= r14) {
                        try {
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("bizid", iIntValue);
                                jSONObject3.put("stream_id", str);
                                jSONObject3.put("txSecret", str3);
                                jSONObject3.put("txTime", str4);
                                jSONObject3.put("type", r14 == true ? 1 : 0);
                                String string3 = jSONObject3.toString();
                                if (i4 > i2) {
                                    str7 = "https://livepull.myqcloud.com/getpulladdr";
                                } else {
                                    str7 = "https://livepullipv6.myqcloud.com/getpulladdr";
                                }
                                ?? r8 = (HttpsURLConnection) new URL(str7).openConnection();
                                r8.setSSLSocketFactory(TXHttpRequest.createSSLSocketFactory());
                                r8.setHostnameVerifier(TXHttpRequest.C14045c.f58484a);
                                r8.setDoOutput(r14);
                                r8.setDoInput(r14);
                                r8.setUseCaches(z2);
                                r8.setConnectTimeout(5000);
                                r8.setReadTimeout(5000);
                                r8.setRequestMethod("POST");
                                r8.setRequestProperty("Charsert", "UTF-8");
                                r8.setRequestProperty("Content-Type", "text/plain;");
                                r8.setRequestProperty("Content-Length", String.valueOf(string3.length()));
                                TXCLog.m82966e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl: sendHttpRequest[ " + string3 + "] retryIndex = " + i4);
                                new DataOutputStream(r8.getOutputStream()).write(string3.getBytes());
                                bufferedReader = new BufferedReader(new InputStreamReader(r8.getInputStream()));
                                str8 = "";
                                while (true) {
                                    line = bufferedReader.readLine();
                                    if (line != null) {
                                        break;
                                    }
                                    str8 = str8 + line;
                                }
                                TXCLog.m82966e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl: receive response, strResponse = " + str8);
                                jSONObject = (JSONObject) new JSONTokener(str8).nextValue();
                                if (jSONObject.has("code")) {
                                    i3 = jSONObject.getInt("code");
                                }
                                if (i3 != 0) {
                                    if (jSONObject.has(str10)) {
                                        string = jSONObject.getString(str10);
                                    }
                                    TXCLog.m82966e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl: errorCode = " + i3 + " errorMessage = " + string);
                                }
                                if (jSONObject.has(str9)) {
                                    vector = new Vector();
                                    vector2 = new Vector();
                                    jSONArray = jSONObject.getJSONArray(str9);
                                    if (jSONArray == null) {
                                        try {
                                            if (jSONArray.length() == 0) {
                                                str5 = str9;
                                                str6 = str10;
                                                TXCLog.m82966e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl: no pull_addr");
                                            } else {
                                                i5 = 0;
                                                while (i5 < jSONArray.length()) {
                                                    jSONObject2 = (JSONObject) jSONArray.get(i5);
                                                    if (jSONObject2 != null) {
                                                        jSONArray2 = jSONArray;
                                                        string2 = jSONObject2.getString("rtmp_url");
                                                        str5 = str9;
                                                        try {
                                                            if (jSONObject2.getInt("proto") == 1) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            StringBuilder sb = new StringBuilder();
                                                            str6 = str10;
                                                            try {
                                                                sb.append("getAccelerateStreamPlayUrl: streamUrl = ");
                                                                sb.append(string2);
                                                                sb.append(" Q channel = ");
                                                                sb.append(z);
                                                                TXCLog.m82966e("TXRTMPAccUrlFetcher", sb.toString());
                                                                streamIDByStreamUrl = TXCCommonUtil.getStreamIDByStreamUrl(string2);
                                                                if (streamIDByStreamUrl == null && streamIDByStreamUrl.equalsIgnoreCase(str)) {
                                                                    if (z) {
                                                                        vector.add(new C14149e(string2, z));
                                                                    } else {
                                                                        vector2.add(new C14149e(string2, z));
                                                                    }
                                                                }
                                                            } catch (Exception e) {
                                                                e = e;
                                                                r11 = 1;
                                                                TXCLog.m82966e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl exception:" + e.toString());
                                                                r12 = r11;
                                                                z2 = false;
                                                                Thread.sleep(1000L, 0);
                                                                i4--;
                                                                str9 = str5;
                                                                str10 = str6;
                                                                r14 = r12;
                                                            }
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            str6 = str10;
                                                            r11 = 1;
                                                            TXCLog.m82966e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl exception:" + e.toString());
                                                            r12 = r11;
                                                            z2 = false;
                                                            Thread.sleep(1000L, 0);
                                                            i4--;
                                                            str9 = str5;
                                                            str10 = str6;
                                                            r14 = r12;
                                                        }
                                                    } else {
                                                        jSONArray2 = jSONArray;
                                                        str5 = str9;
                                                        str6 = str10;
                                                    }
                                                    i5++;
                                                    jSONArray = jSONArray2;
                                                    str9 = str5;
                                                    str10 = str6;
                                                }
                                                str5 = str9;
                                                str6 = str10;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            str5 = str9;
                                        }
                                    } else {
                                        str5 = str9;
                                        str6 = str10;
                                        TXCLog.m82966e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl: no pull_addr");
                                    }
                                    i6 = i;
                                    r14 = 1;
                                    r12 = 1;
                                    r12 = 1;
                                    r11 = 1;
                                    r13 = 1;
                                    if (i6 == 1) {
                                        try {
                                            if (vector2.size() > 0) {
                                                C14151g.this.f59538g.post(new Runnable() { // from class: com.tencent.liteav.network.g.2.1
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        a aVar2 = aVar;
                                                        if (aVar2 != null) {
                                                            aVar2.mo83671a(0, "Success", vector2);
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            r11 = r14;
                                            TXCLog.m82966e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl exception:" + e.toString());
                                            r12 = r11;
                                        }
                                    } else if (i6 != 2) {
                                        try {
                                            if (vector.size() > 0) {
                                                C14151g.this.f59538g.post(new Runnable() { // from class: com.tencent.liteav.network.g.2.2
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        a aVar2 = aVar;
                                                        if (aVar2 != null) {
                                                            aVar2.mo83671a(0, "Success", vector);
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            TXCLog.m82966e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl exception:" + e.toString());
                                            r12 = r11;
                                        }
                                    } else {
                                        it = vector2.iterator();
                                        while (it.hasNext()) {
                                            vector.add((C14149e) it.next());
                                        }
                                        if (vector.size() > 0) {
                                            C14151g.this.f59538g.post(new Runnable() { // from class: com.tencent.liteav.network.g.2.3
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    a aVar2 = aVar;
                                                    if (aVar2 != null) {
                                                        aVar2.mo83671a(0, "Success", vector);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                                    z2 = false;
                                    Thread.sleep(1000L, 0);
                                    i4--;
                                    str9 = str5;
                                    str10 = str6;
                                    r14 = r12;
                                } else {
                                    str5 = str9;
                                    str6 = str10;
                                    r13 = r14;
                                }
                                r12 = r13;
                            } catch (Exception e6) {
                                e = e6;
                                str5 = str9;
                                str6 = str10;
                            }
                            Thread.sleep(1000L, 0);
                        } catch (Exception unused) {
                            TXCLog.m82966e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl exception sleep");
                        }
                        z2 = false;
                        i4--;
                        str9 = str5;
                        str10 = str6;
                        r14 = r12;
                    }
                    C14151g.this.f59538g.post(new Runnable() { // from class: com.tencent.liteav.network.g.2.4
                        @Override // java.lang.Runnable
                        public void run() {
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.mo83671a(i3, string, null);
                            }
                        }
                    });
                }
                iM83728e = 5;
                i2 = 2;
                i3 = -1;
                string = "";
                i4 = iM83728e + i2;
                while (i4 >= r14) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("bizid", iIntValue);
                    jSONObject4.put("stream_id", str);
                    jSONObject4.put("txSecret", str3);
                    jSONObject4.put("txTime", str4);
                    jSONObject4.put("type", r14 == true ? 1 : 0);
                    String string4 = jSONObject4.toString();
                    if (i4 > i2) {
                        str7 = "https://livepull.myqcloud.com/getpulladdr";
                    } else {
                        str7 = "https://livepullipv6.myqcloud.com/getpulladdr";
                    }
                    ?? r9 = (HttpsURLConnection) new URL(str7).openConnection();
                    r9.setSSLSocketFactory(TXHttpRequest.createSSLSocketFactory());
                    r9.setHostnameVerifier(TXHttpRequest.C14045c.f58484a);
                    r9.setDoOutput(r14);
                    r9.setDoInput(r14);
                    r9.setUseCaches(z2);
                    r9.setConnectTimeout(5000);
                    r9.setReadTimeout(5000);
                    r9.setRequestMethod("POST");
                    r9.setRequestProperty("Charsert", "UTF-8");
                    r9.setRequestProperty("Content-Type", "text/plain;");
                    r9.setRequestProperty("Content-Length", String.valueOf(string4.length()));
                    TXCLog.m82966e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl: sendHttpRequest[ " + string4 + "] retryIndex = " + i4);
                    new DataOutputStream(r9.getOutputStream()).write(string4.getBytes());
                    bufferedReader = new BufferedReader(new InputStreamReader(r9.getInputStream()));
                    str8 = "";
                    while (true) {
                        line = bufferedReader.readLine();
                        if (line != null) {
                            break;
                            break;
                        }
                        str8 = str8 + line;
                    }
                    TXCLog.m82966e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl: receive response, strResponse = " + str8);
                    jSONObject = (JSONObject) new JSONTokener(str8).nextValue();
                    if (jSONObject.has("code")) {
                        i3 = jSONObject.getInt("code");
                    }
                    if (i3 != 0) {
                        if (jSONObject.has(str10)) {
                            string = jSONObject.getString(str10);
                        }
                        TXCLog.m82966e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl: errorCode = " + i3 + " errorMessage = " + string);
                    }
                    if (jSONObject.has(str9)) {
                        vector = new Vector();
                        vector2 = new Vector();
                        jSONArray = jSONObject.getJSONArray(str9);
                        if (jSONArray == null) {
                            str5 = str9;
                            str6 = str10;
                            TXCLog.m82966e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl: no pull_addr");
                        } else if (jSONArray.length() == 0) {
                            str5 = str9;
                            str6 = str10;
                            TXCLog.m82966e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl: no pull_addr");
                        } else {
                            i5 = 0;
                            while (i5 < jSONArray.length()) {
                                jSONObject2 = (JSONObject) jSONArray.get(i5);
                                if (jSONObject2 != null) {
                                    jSONArray2 = jSONArray;
                                    string2 = jSONObject2.getString("rtmp_url");
                                    str5 = str9;
                                    if (jSONObject2.getInt("proto") == 1) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    str6 = str10;
                                    sb2.append("getAccelerateStreamPlayUrl: streamUrl = ");
                                    sb2.append(string2);
                                    sb2.append(" Q channel = ");
                                    sb2.append(z);
                                    TXCLog.m82966e("TXRTMPAccUrlFetcher", sb2.toString());
                                    streamIDByStreamUrl = TXCCommonUtil.getStreamIDByStreamUrl(string2);
                                    if (streamIDByStreamUrl == null) {
                                    }
                                } else {
                                    jSONArray2 = jSONArray;
                                    str5 = str9;
                                    str6 = str10;
                                }
                                i5++;
                                jSONArray = jSONArray2;
                                str9 = str5;
                                str10 = str6;
                            }
                            str5 = str9;
                            str6 = str10;
                        }
                        i6 = i;
                        r14 = 1;
                        r12 = 1;
                        r12 = 1;
                        r11 = 1;
                        r13 = 1;
                        if (i6 == 1) {
                            if (vector2.size() > 0) {
                                C14151g.this.f59538g.post(new Runnable() { // from class: com.tencent.liteav.network.g.2.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        a aVar2 = aVar;
                                        if (aVar2 != null) {
                                            aVar2.mo83671a(0, "Success", vector2);
                                        }
                                    }
                                });
                                return;
                            }
                        } else if (i6 != 2) {
                            it = vector2.iterator();
                            while (it.hasNext()) {
                                vector.add((C14149e) it.next());
                            }
                            if (vector.size() > 0) {
                                C14151g.this.f59538g.post(new Runnable() { // from class: com.tencent.liteav.network.g.2.3
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        a aVar2 = aVar;
                                        if (aVar2 != null) {
                                            aVar2.mo83671a(0, "Success", vector);
                                        }
                                    }
                                });
                                return;
                            }
                        } else if (vector.size() > 0) {
                            C14151g.this.f59538g.post(new Runnable() { // from class: com.tencent.liteav.network.g.2.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    a aVar2 = aVar;
                                    if (aVar2 != null) {
                                        aVar2.mo83671a(0, "Success", vector);
                                    }
                                }
                            });
                            return;
                        }
                        z2 = false;
                        Thread.sleep(1000L, 0);
                        i4--;
                        str9 = str5;
                        str10 = str6;
                        r14 = r12;
                    } else {
                        str5 = str9;
                        str6 = str10;
                        r13 = r14;
                    }
                    r12 = r13;
                    z2 = false;
                    Thread.sleep(1000L, 0);
                    i4--;
                    str9 = str5;
                    str10 = str6;
                    r14 = r12;
                }
                C14151g.this.f59538g.post(new Runnable() { // from class: com.tencent.liteav.network.g.2.4
                    @Override // java.lang.Runnable
                    public void run() {
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.mo83671a(i3, string, null);
                        }
                    }
                });
            }
        }.start();
    }

    /* JADX INFO: renamed from: a */
    private String m83721a(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        for (String str3 : str2.split("[?&]")) {
            if (str3.indexOf("=") != -1) {
                String[] strArrSplit = str3.split("[=]");
                if (strArrSplit.length == 2) {
                    String str4 = strArrSplit[0];
                    String str5 = strArrSplit[1];
                    if (str4 != null && str4.toLowerCase().equalsIgnoreCase(lowerCase)) {
                        return str5;
                    }
                } else {
                    continue;
                }
            }
        }
        return "";
    }
}
