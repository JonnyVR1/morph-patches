package p149l;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.apm.lite.CrashType;
import com.apm.lite.nativecrash.NativeImpl;
import com.apm.lite.p009j.C0922e;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class biq0 {

    /* JADX INFO: renamed from: D */
    private static volatile boolean f75794D = false;

    /* JADX INFO: renamed from: E */
    static volatile boolean f75795E = true;

    /* JADX INFO: renamed from: a */
    private klq0 f75799a;

    /* JADX INFO: renamed from: b */
    private final Context f75800b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f75801c;

    /* JADX INFO: renamed from: g */
    private JSONObject f75805g;

    /* JADX INFO: renamed from: h */
    private JSONObject f75806h;

    /* JADX INFO: renamed from: m */
    private JSONArray f75811m;

    /* JADX INFO: renamed from: n */
    private JSONObject f75812n;

    /* JADX INFO: renamed from: q */
    private JSONArray f75815q;

    /* JADX INFO: renamed from: r */
    private JSONArray f75816r;

    /* JADX INFO: renamed from: s */
    private JSONObject f75817s;

    /* JADX INFO: renamed from: t */
    private boolean f75818t;

    /* JADX INFO: renamed from: v */
    private volatile boolean f75820v;

    /* JADX INFO: renamed from: d */
    private long f75802d = -1;

    /* JADX INFO: renamed from: e */
    private File f75803e = null;

    /* JADX INFO: renamed from: f */
    private boolean f75804f = true;

    /* JADX INFO: renamed from: i */
    private String f75807i = "unknown";

    /* JADX INFO: renamed from: j */
    private String f75808j = "unknown";

    /* JADX INFO: renamed from: k */
    private String f75809k = "unknown";

    /* JADX INFO: renamed from: l */
    private String f75810l = "npth_inner_default";

    /* JADX INFO: renamed from: o */
    private int f75813o = 0;

    /* JADX INFO: renamed from: p */
    private long f75814p = -1;

    /* JADX INFO: renamed from: u */
    private final Object f75819u = new Object();

    /* JADX INFO: renamed from: w */
    private long f75821w = -1;

    /* JADX INFO: renamed from: x */
    private long f75822x = 0;

    /* JADX INFO: renamed from: y */
    private final Runnable f75823y = new RunnableC15870b();

    /* JADX INFO: renamed from: z */
    private int f75824z = 0;

    /* JADX INFO: renamed from: A */
    private List<Pattern> f75796A = null;

    /* JADX INFO: renamed from: B */
    Pattern f75797B = null;

    /* JADX INFO: renamed from: C */
    private File f75798C = null;

    /* JADX INFO: renamed from: l.biq0$a */
    public class C15869a implements plq0.InterfaceC19277a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f75825a;

        public C15869a(long j) {
            this.f75825a = j;
        }

        @Override // p149l.plq0.InterfaceC19277a
        /* JADX INFO: renamed from: a */
        public void mo97441a(JSONObject jSONObject) {
            soq0.m185294a().m185295b(jSONObject, this.f75825a, biq0.this.f75804f);
        }
    }

    /* JADX INFO: renamed from: l.biq0$b */
    public class RunnableC15870b implements Runnable {
        public RunnableC15870b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                biq0.this.m102108h(200, 25);
            } catch (Throwable th) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", th);
            }
        }
    }

    public biq0(Context context) {
        this.f75800b = context;
    }

    /* JADX INFO: renamed from: a */
    private static String m102089a(float f) {
        if (f <= 0.0f) {
            return "0%";
        }
        if (f <= 0.1f) {
            return "0% - 10%";
        }
        if (f <= 0.3f) {
            return "10% - 30%";
        }
        if (f <= 0.6f) {
            return "30% - 60%";
        }
        return f <= 0.9f ? "60% - 90%" : "90% - 100%";
    }

    /* JADX INFO: renamed from: b */
    private static String m102090b(float f, float f2) {
        if (f2 > 0.0f) {
            return m102089a(f / f2);
        }
        return f > 0.0f ? "100%" : "0%";
    }

    /* JADX INFO: renamed from: c */
    private JSONObject m102091c(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayM161749b = nvq0.m161749b(256, 128, jSONArray);
        if (jSONArrayM161749b.length() != jSONArray.length()) {
            this.f75813o++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", jSONArrayM161749b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x024e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0251 A[PHI: r29
      0x0251: PHI (r29v3 java.lang.String[]) = (r29v2 java.lang.String[]), (r29v10 java.lang.String[]) binds: [B:130:0x024c, B:120:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:134:0x025b  */
    /* JADX WARN: Code duplicated, block: B:135:0x025e A[PHI: r29
      0x025e: PHI (r29v4 java.lang.String[]) = (r29v3 java.lang.String[]), (r29v11 java.lang.String[]) binds: [B:133:0x0259, B:119:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:137:0x0266  */
    /* JADX WARN: Code duplicated, block: B:138:0x0268 A[PHI: r29
      0x0268: PHI (r29v7 java.lang.String[]) = (r29v4 java.lang.String[]), (r29v12 java.lang.String[]) binds: [B:136:0x0264, B:117:0x0218] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:140:0x0270  */
    /* JADX WARN: Code duplicated, block: B:143:0x0275  */
    /* JADX WARN: Code duplicated, block: B:146:0x0296  */
    /* JADX WARN: Code duplicated, block: B:147:0x0297 A[Catch: all -> 0x02a9, TryCatch #2 {all -> 0x02a9, blocks: (B:144:0x0277, B:148:0x02a0, B:147:0x0297), top: B:222:0x0277 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x02c0 A[LOOP:2: B:104:0x0200->B:153:0x02c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x035b  */
    /* JADX WARN: Code duplicated, block: B:183:0x036b  */
    /* JADX WARN: Code duplicated, block: B:185:0x037d  */
    /* JADX WARN: Code duplicated, block: B:188:0x0382 A[LOOP:4: B:186:0x037f->B:188:0x0382, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:191:0x0394  */
    /* JADX WARN: Code duplicated, block: B:199:0x03cc A[PHI: r7 r22 r23 r24 r25
      0x03cc: PHI (r7v4 java.lang.String) = (r7v3 java.lang.String), (r7v5 java.lang.String), (r7v28 java.lang.String), (r7v29 java.lang.String) binds: [B:197:0x03bf, B:194:0x03a1, B:20:0x008f, B:16:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x03cc: PHI (r22v2 char) = (r22v0 char), (r22v3 char), (r22v6 char), (r22v7 char) binds: [B:197:0x03bf, B:194:0x03a1, B:20:0x008f, B:16:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x03cc: PHI (r23v4 int) = (r23v0 int), (r23v5 int), (r23v9 int), (r23v10 int) binds: [B:197:0x03bf, B:194:0x03a1, B:20:0x008f, B:16:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x03cc: PHI (r24v6 java.util.HashMap) = (r24v2 java.util.HashMap), (r24v7 java.util.HashMap), (r24v20 java.util.HashMap), (r24v22 java.util.HashMap) binds: [B:197:0x03bf, B:194:0x03a1, B:20:0x008f, B:16:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x03cc: PHI (r25v6 java.util.HashMap) = (r25v2 java.util.HashMap), (r25v7 java.util.HashMap), (r25v16 java.util.HashMap), (r25v18 java.util.HashMap) binds: [B:197:0x03bf, B:194:0x03a1, B:20:0x008f, B:16:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x008b  */
    /* JADX WARN: Code duplicated, block: B:229:0x008f A[EDGE_INSN: B:229:0x008f->B:20:0x008f BREAK  A[LOOP:2: B:104:0x0200->B:153:0x02c0], SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    private void m102092e(String str, JSONObject jSONObject) throws JSONException {
        HashMap map;
        HashMap map2;
        float[] fArr;
        char c;
        int i;
        String str2;
        char c2;
        boolean z;
        String str3;
        String str4;
        String strTrim;
        String[] strArrSplit;
        int i2;
        String strConcat;
        HashMap map3;
        int i3;
        int i4;
        String[] strArr;
        float fFloatValue;
        SystemClock.uptimeMillis();
        String[] strArrSplit2 = str.split(SignParameters.NEW_LINE);
        Float fValueOf = Float.valueOf(-1.0f);
        int i5 = 0;
        float[] fArr2 = {-1.0f, -1.0f, -1.0f};
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        HashMap map7 = new HashMap();
        HashMap map8 = new HashMap();
        int length = strArrSplit2.length;
        char c3 = 0;
        boolean z2 = false;
        String strTrim2 = "unknown";
        String str5 = strTrim2;
        while (true) {
            if (i5 >= length) {
                map = map5;
                map2 = map7;
                break;
            }
            String strTrim3 = strArrSplit2[i5];
            if (!TextUtils.isEmpty(strTrim3)) {
                fArr = fArr2;
                if (c3 == 0) {
                    c = c3;
                    i = i5;
                    map = map5;
                    map2 = map7;
                    str2 = strTrim2;
                    String strTrim4 = strTrim3.trim();
                    if (strTrim4.startsWith("tag:")) {
                        strTrim2 = strTrim4.replace("tag:", "").trim();
                        c2 = 4;
                        c3 = 1;
                    } else {
                        strTrim2 = str2;
                        c3 = c;
                        c2 = 4;
                    }
                } else if (c3 == 1) {
                    c = c3;
                    i = i5;
                    map = map5;
                    map2 = map7;
                    strTrim3 = strTrim3.trim();
                    String lowerCase = strTrim3.toLowerCase();
                    if (lowerCase.startsWith("shortmsg")) {
                        strTrim3.substring(strTrim3.indexOf(58));
                        z = false;
                    } else {
                        if (lowerCase.startsWith("reason:")) {
                            strTrim3.substring(strTrim3.indexOf(58));
                            z = true;
                        } else {
                            str2 = strTrim2;
                            if (lowerCase.contains("appfreeze")) {
                                str5 = "AppFreeze";
                                c3 = '\n';
                                strTrim2 = str2;
                            } else {
                                strTrim2 = str2;
                                c3 = c;
                            }
                        }
                        c2 = 4;
                    }
                    if (lowerCase.contains("input dispatch")) {
                        str4 = "Input dispatching timed out";
                    } else {
                        if (lowerCase.contains("broadcast of intent")) {
                            str4 = "Broadcast of Intent";
                        } else if (lowerCase.contains("executing service")) {
                            str3 = strTrim2;
                            if ("null".equalsIgnoreCase(str3)) {
                                strTrim2 = strTrim3.substring(strTrim3.indexOf("service ") + 8).trim();
                                str5 = "executing service";
                            } else {
                                str5 = "executing service";
                                strTrim2 = str3;
                            }
                        } else {
                            str3 = strTrim2;
                            if (lowerCase.contains("service.startforeground")) {
                                str5 = "not call Service.startForeground";
                                strTrim2 = str3;
                            } else {
                                strTrim2 = str3;
                                str5 = "unknown";
                            }
                        }
                        if (z) {
                            c2 = 4;
                            c3 = 2;
                        }
                        strTrim = strTrim3.trim();
                        if (strTrim.startsWith("Load:")) {
                            strArrSplit = strTrim.replace("Load:", "").trim().split("/");
                            if (3 == strArrSplit.length) {
                                for (i2 = 0; i2 < strArrSplit.length; i2++) {
                                    fArr[i2] = Float.valueOf(strArrSplit[i2]).floatValue();
                                }
                            }
                            c3 = 3;
                        } else {
                            c3 = c;
                        }
                        c2 = 4;
                    }
                    str5 = str4;
                    if (z) {
                        c2 = 4;
                        c3 = 2;
                    }
                    strTrim = strTrim3.trim();
                    if (strTrim.startsWith("Load:")) {
                        strArrSplit = strTrim.replace("Load:", "").trim().split("/");
                        if (3 == strArrSplit.length) {
                            while (i2 < strArrSplit.length) {
                                fArr[i2] = Float.valueOf(strArrSplit[i2]).floatValue();
                            }
                        }
                        c3 = 3;
                    } else {
                        c3 = c;
                    }
                    c2 = 4;
                } else if (c3 != 2) {
                    if (c3 != 3) {
                        c = c3;
                        i = i5;
                        map = map5;
                        map2 = map7;
                        str2 = strTrim2;
                    } else {
                        String[] strArrSplit3 = strTrim3.split("\\s");
                        c = c3;
                        i = i5;
                        if (strArrSplit3.length >= 2) {
                            if ("CPU".equalsIgnoreCase(strArrSplit3[0]) && "usage".equalsIgnoreCase(strArrSplit3[1])) {
                                if (strTrim3.contains("ago")) {
                                    z2 = true;
                                }
                                if (map4.isEmpty() && map5.isEmpty() && map6.isEmpty() && map8.isEmpty() && map7.isEmpty()) {
                                    map = map5;
                                    map2 = map7;
                                    c3 = c;
                                    c2 = 4;
                                }
                            } else if (map4.isEmpty() || map5.isEmpty() || map6.isEmpty() || map8.isEmpty() || map7.isEmpty()) {
                                if (map4.isEmpty() && strArrSplit3[1].equalsIgnoreCase("TOTAL:")) {
                                    strConcat = "";
                                    map3 = map4;
                                } else if (strTrim3.contains(this.f75800b.getPackageName())) {
                                    int i6 = 0;
                                    strConcat = "";
                                    while (i6 < strArrSplit3.length) {
                                        int i7 = i6;
                                        if (strArrSplit3[i6].contains(this.f75800b.getPackageName())) {
                                            String str6 = strArrSplit3[i7];
                                            strConcat = str6.substring(str6.indexOf(47) + 1, strArrSplit3[i7].length() - 1).concat("_");
                                        }
                                        i6 = i7 + 1;
                                    }
                                    map3 = map6;
                                } else if (map5.isEmpty() && strTrim3.contains("system_server:")) {
                                    strConcat = "";
                                    map3 = map5;
                                } else if (map8.isEmpty() && strTrim3.contains("kswapd")) {
                                    strConcat = "";
                                    map3 = map8;
                                } else if (map7.isEmpty() && strTrim3.contains("dex2oat")) {
                                    strConcat = "";
                                    map3 = map7;
                                } else {
                                    strConcat = "";
                                    map3 = null;
                                }
                                if (map3 != null) {
                                    int i8 = 0;
                                    while (true) {
                                        int i9 = i8;
                                        if (strArrSplit3[i8].contains("%")) {
                                            map = map5;
                                            i3 = i9;
                                            break;
                                        }
                                        i3 = i9 + 1;
                                        map = map5;
                                        if (i3 >= strArrSplit3.length) {
                                            break;
                                        }
                                        i8 = i3;
                                        map5 = map;
                                    }
                                    try {
                                        float fFloatValue2 = Float.valueOf(strArrSplit3[i3].replace("%", "")).floatValue();
                                        i4 = i3;
                                        try {
                                            String str7 = strConcat + "total";
                                            if (map3 != map4) {
                                                fFloatValue2 /= loq0.m150796i();
                                            }
                                            map3.put(str7, Float.valueOf(fFloatValue2));
                                        } catch (Throwable unused) {
                                            map3.put(strConcat + "total", fValueOf);
                                        }
                                    } catch (Throwable unused2) {
                                        i4 = i3;
                                    }
                                    int i10 = i4 + 3;
                                    char c4 = 0;
                                    map2 = map7;
                                    while (i10 < strArrSplit3.length) {
                                        String str8 = "softirq";
                                        int i11 = i10;
                                        if (c4 != 0) {
                                            if (c4 == 1) {
                                                strArr = strArrSplit3;
                                            } else if (c4 == 2) {
                                                strArr = strArrSplit3;
                                                if ("iowait".equalsIgnoreCase(strArr[i11])) {
                                                    str8 = "iowait";
                                                    c4 = 3;
                                                } else if ("irq".equalsIgnoreCase(strArr[i11])) {
                                                    str8 = "irq";
                                                    c4 = 4;
                                                } else if ("softirq".equalsIgnoreCase(strArr[i11])) {
                                                    c4 = 5;
                                                } else if ("softirq".equalsIgnoreCase(strArr[i11])) {
                                                    c4 = 6;
                                                }
                                                if (str8 != null) {
                                                    fFloatValue = Float.valueOf(strArr[i11 - 1].replace("%", "")).floatValue();
                                                    String str9 = strConcat + str8;
                                                    if (map3 != map4) {
                                                        fFloatValue /= loq0.m150796i();
                                                    }
                                                    map3.put(str9, Float.valueOf(fFloatValue));
                                                }
                                                if (c4 >= 6) {
                                                    break;
                                                    break;
                                                } else {
                                                    i10 = i11 + 3;
                                                    strArrSplit3 = strArr;
                                                }
                                            } else if (c4 == 3) {
                                                strArr = strArrSplit3;
                                                if ("irq".equalsIgnoreCase(strArr[i11])) {
                                                    str8 = "irq";
                                                    c4 = 4;
                                                } else if ("softirq".equalsIgnoreCase(strArr[i11])) {
                                                    c4 = 5;
                                                } else if ("softirq".equalsIgnoreCase(strArr[i11])) {
                                                    c4 = 6;
                                                }
                                                if (str8 != null) {
                                                    fFloatValue = Float.valueOf(strArr[i11 - 1].replace("%", "")).floatValue();
                                                    String str10 = strConcat + str8;
                                                    if (map3 != map4) {
                                                        fFloatValue /= loq0.m150796i();
                                                    }
                                                    map3.put(str10, Float.valueOf(fFloatValue));
                                                }
                                                if (c4 >= 6) {
                                                    break;
                                                    break;
                                                } else {
                                                    i10 = i11 + 3;
                                                    strArrSplit3 = strArr;
                                                }
                                            } else if (c4 != 4) {
                                                strArr = strArrSplit3;
                                                if (c4 == 5) {
                                                    if ("softirq".equalsIgnoreCase(strArr[i11])) {
                                                        c4 = 6;
                                                    }
                                                }
                                                if (str8 != null) {
                                                    try {
                                                        fFloatValue = Float.valueOf(strArr[i11 - 1].replace("%", "")).floatValue();
                                                        String str11 = strConcat + str8;
                                                        if (map3 != map4) {
                                                            fFloatValue /= loq0.m150796i();
                                                        }
                                                        map3.put(str11, Float.valueOf(fFloatValue));
                                                    } catch (Throwable unused3) {
                                                        map3.put(strConcat + str8, fValueOf);
                                                    }
                                                }
                                                if (c4 >= 6) {
                                                    break;
                                                }
                                                i10 = i11 + 3;
                                                strArrSplit3 = strArr;
                                            } else {
                                                strArr = strArrSplit3;
                                                if ("softirq".equalsIgnoreCase(strArr[i11])) {
                                                    c4 = 5;
                                                } else if ("softirq".equalsIgnoreCase(strArr[i11])) {
                                                    c4 = 6;
                                                }
                                                if (str8 != null) {
                                                    fFloatValue = Float.valueOf(strArr[i11 - 1].replace("%", "")).floatValue();
                                                    String str12 = strConcat + str8;
                                                    if (map3 != map4) {
                                                        fFloatValue /= loq0.m150796i();
                                                    }
                                                    map3.put(str12, Float.valueOf(fFloatValue));
                                                }
                                                if (c4 >= 6) {
                                                    break;
                                                    break;
                                                } else {
                                                    i10 = i11 + 3;
                                                    strArrSplit3 = strArr;
                                                }
                                            }
                                            str8 = null;
                                            if (str8 != null) {
                                                fFloatValue = Float.valueOf(strArr[i11 - 1].replace("%", "")).floatValue();
                                                String str13 = strConcat + str8;
                                                if (map3 != map4) {
                                                    fFloatValue /= loq0.m150796i();
                                                }
                                                map3.put(str13, Float.valueOf(fFloatValue));
                                            }
                                            if (c4 >= 6) {
                                                break;
                                                break;
                                            } else {
                                                i10 = i11 + 3;
                                                strArrSplit3 = strArr;
                                            }
                                        } else {
                                            strArr = strArrSplit3;
                                            if ("user".equalsIgnoreCase(strArrSplit3[i11])) {
                                                str8 = "user";
                                                c4 = 1;
                                            }
                                            if (str8 != null) {
                                                fFloatValue = Float.valueOf(strArr[i11 - 1].replace("%", "")).floatValue();
                                                String str14 = strConcat + str8;
                                                if (map3 != map4) {
                                                    fFloatValue /= loq0.m150796i();
                                                }
                                                map3.put(str14, Float.valueOf(fFloatValue));
                                            }
                                            if (c4 >= 6) {
                                                break;
                                                break;
                                            } else {
                                                i10 = i11 + 3;
                                                strArrSplit3 = strArr;
                                            }
                                        }
                                        if ("kernel".equalsIgnoreCase(strArr[i11])) {
                                            str8 = "kernel";
                                            c4 = 2;
                                        } else if ("iowait".equalsIgnoreCase(strArr[i11])) {
                                            str8 = "iowait";
                                            c4 = 3;
                                        } else if ("irq".equalsIgnoreCase(strArr[i11])) {
                                            str8 = "irq";
                                            c4 = 4;
                                        } else if ("softirq".equalsIgnoreCase(strArr[i11])) {
                                            c4 = 5;
                                        } else if ("softirq".equalsIgnoreCase(strArr[i11])) {
                                            c4 = 6;
                                        } else {
                                            str8 = null;
                                        }
                                        if (str8 != null) {
                                            fFloatValue = Float.valueOf(strArr[i11 - 1].replace("%", "")).floatValue();
                                            String str15 = strConcat + str8;
                                            if (map3 != map4) {
                                                fFloatValue /= loq0.m150796i();
                                            }
                                            map3.put(str15, Float.valueOf(fFloatValue));
                                        }
                                        if (c4 >= 6) {
                                            break;
                                            break;
                                        } else {
                                            i10 = i11 + 3;
                                            strArrSplit3 = strArr;
                                        }
                                    }
                                } else {
                                    map = map5;
                                    map2 = map7;
                                }
                            }
                            map = map5;
                            map2 = map7;
                            c2 = 4;
                            c3 = 4;
                        } else {
                            map = map5;
                            map2 = map7;
                        }
                        str2 = strTrim2;
                    }
                    strTrim2 = str2;
                    c3 = c;
                    c2 = 4;
                } else {
                    c = c3;
                    i = i5;
                    map = map5;
                    map2 = map7;
                    strTrim = strTrim3.trim();
                    if (strTrim.startsWith("Load:")) {
                        strArrSplit = strTrim.replace("Load:", "").trim().split("/");
                        if (3 == strArrSplit.length) {
                            while (i2 < strArrSplit.length) {
                                fArr[i2] = Float.valueOf(strArrSplit[i2]).floatValue();
                            }
                        }
                        c3 = 3;
                    } else {
                        c3 = c;
                    }
                    c2 = 4;
                }
                if (c3 >= c2) {
                    break;
                }
            } else {
                fArr = fArr2;
                i = i5;
                map = map5;
                map2 = map7;
            }
            i5 = i + 1;
            strArrSplit2 = strArrSplit2;
            fArr2 = fArr;
            map7 = map2;
            map5 = map;
        }
        String str16 = str5;
        jSONObject.put("anr_tag", strTrim2);
        jSONObject.put("anr_has_ago", String.valueOf(z2));
        jSONObject.put("anr_reason", str16);
        m102093f(map6, jSONObject, "app");
        m102093f(map4, jSONObject, "total");
        if (map.isEmpty()) {
            jSONObject.put("npth_anr_systemserver_total", "not found");
        } else {
            jSONObject.put("npth_anr_systemserver_total", m102098l(owq0.m166425a(map).floatValue()));
        }
        if (map8.isEmpty()) {
            jSONObject.put("npth_anr_kswapd_total", "not found");
        } else {
            jSONObject.put("npth_anr_kswapd_total", m102098l(owq0.m166425a(map8).floatValue()));
        }
        if (map2.isEmpty()) {
            jSONObject.put("npth_anr_dex2oat_total", "not found");
        } else {
            jSONObject.put("npth_anr_dex2oat_total", m102098l(owq0.m166425a(map2).floatValue()));
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m102093f(HashMap<String, Float> map, JSONObject jSONObject, String str) throws JSONException {
        String strConcat;
        String strM102090b;
        String str2 = "npth_anr_" + str;
        if (map.isEmpty()) {
            strConcat = str2.concat("_total");
            strM102090b = "not found";
        } else {
            float fFloatValue = 0.0f;
            float fFloatValue2 = 0.0f;
            float fFloatValue3 = 0.0f;
            float fFloatValue4 = 0.0f;
            float fFloatValue5 = 0.0f;
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key.endsWith("user")) {
                    fFloatValue += entry.getValue().floatValue();
                } else if (key.endsWith("kernel")) {
                    fFloatValue2 += entry.getValue().floatValue();
                } else if (key.endsWith("iowait")) {
                    fFloatValue3 += entry.getValue().floatValue();
                } else if (key.endsWith("irq")) {
                    fFloatValue4 += entry.getValue().floatValue();
                } else if (key.endsWith("softirq")) {
                    fFloatValue5 += entry.getValue().floatValue();
                }
            }
            float f = fFloatValue + fFloatValue2 + fFloatValue3 + fFloatValue4 + fFloatValue5;
            jSONObject.put(str2.concat("_total"), m102098l(f));
            jSONObject.put(str2.concat("_kernel_user_ratio"), m102090b(fFloatValue2, f));
            strConcat = str2.concat("_iowait_user_ratio");
            strM102090b = m102090b(fFloatValue3, f);
        }
        jSONObject.put(strConcat, strM102090b);
    }

    /* JADX INFO: renamed from: g */
    private void m102094g(JSONArray jSONArray) {
        int i;
        int[] iArrM102101p;
        int[] iArrM102101p2;
        if (jSONArray == null) {
            return;
        }
        this.f75805g = null;
        this.f75812n = null;
        this.f75813o = 0;
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        this.f75807i = "unknown";
        this.f75808j = "unknown";
        this.f75809k = "unknown";
        int[] iArr = new int[3];
        iArr[0] = 0;
        iArr[1] = 0;
        int i2 = 2;
        iArr[2] = 0;
        JSONArray jSONArray5 = jSONArray4;
        String strSubstring = null;
        int i3 = 0;
        boolean z = false;
        while (i3 < jSONArray.length()) {
            String strOptString = jSONArray.optString(i3);
            int i4 = i2;
            if (TextUtils.isEmpty(strOptString)) {
                if (jSONArray5.length() > 0 && !TextUtils.isEmpty(strSubstring)) {
                    if (this.f75805g == null && BLiveTraceServerLocation.main.equals(strSubstring)) {
                        this.f75805g = m102103r(jSONArray5);
                    } else {
                        jSONArray2.put(m102091c(strSubstring, jSONArray5));
                    }
                    try {
                        if (!BLiveTraceServerLocation.main.equals(strSubstring)) {
                            strSubstring = strSubstring.substring(0, strSubstring.indexOf(40)).trim();
                        }
                    } catch (Throwable unused) {
                    }
                    String str = strSubstring;
                    if (!m102096j(str)) {
                        try {
                            iArrM102101p2 = m102101p(jSONArray5);
                        } catch (IllegalArgumentException e) {
                            jnq0.m142383a();
                            jnq0.m142384b("NPTH_CATCH", e);
                            iArrM102101p2 = null;
                        } catch (Throwable unused2) {
                            iArrM102101p2 = null;
                        }
                        if (iArrM102101p2 != null) {
                            int i5 = iArrM102101p2[0];
                            if (i5 > iArr[0]) {
                                iArr[0] = i5;
                                this.f75807i = str;
                            }
                            int i6 = iArrM102101p2[1];
                            if (i6 > iArr[1]) {
                                iArr[1] = i6;
                                this.f75808j = str;
                            }
                            int i7 = iArrM102101p2[i4];
                            if (i7 > iArr[i4]) {
                                iArr[i4] = i7;
                                this.f75809k = str;
                            }
                        }
                    }
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new JSONArray();
                }
                i = i4;
                strSubstring = null;
            } else {
                if (!z) {
                    i = i4;
                    if (strOptString.startsWith("DALVIK THREADS") || strOptString.startsWith("suspend") || strOptString.startsWith("\"")) {
                        z = true;
                    }
                } else if (!z) {
                    i = i4;
                } else {
                    if (strOptString.contains(" prio=")) {
                        if (jSONArray5.length() > 0 && !TextUtils.isEmpty(strSubstring)) {
                            if (this.f75805g == null && BLiveTraceServerLocation.main.equals(strSubstring)) {
                                this.f75805g = m102103r(jSONArray5);
                            } else {
                                jSONArray2.put(m102091c(strSubstring, jSONArray5));
                            }
                            try {
                                if (!BLiveTraceServerLocation.main.equals(strSubstring)) {
                                    strSubstring = strSubstring.substring(0, strSubstring.indexOf(40)).trim();
                                }
                            } catch (Throwable unused3) {
                            }
                            String str2 = strSubstring;
                            if (!m102096j(str2)) {
                                try {
                                    iArrM102101p = m102101p(jSONArray5);
                                } catch (IllegalArgumentException e2) {
                                    jnq0.m142383a();
                                    jnq0.m142384b("NPTH_CATCH", e2);
                                    iArrM102101p = null;
                                } catch (Throwable unused4) {
                                    iArrM102101p = null;
                                }
                                if (iArrM102101p != null) {
                                    int i8 = iArrM102101p[0];
                                    if (i8 > iArr[0]) {
                                        iArr[0] = i8;
                                        this.f75807i = str2;
                                    }
                                    int i9 = iArrM102101p[1];
                                    if (i9 > iArr[1]) {
                                        iArr[1] = i9;
                                        this.f75808j = str2;
                                    }
                                    int i10 = iArrM102101p[i4];
                                    if (i10 > iArr[i4]) {
                                        iArr[i4] = i10;
                                        this.f75809k = str2;
                                    }
                                }
                            }
                            strSubstring = str2;
                        }
                        try {
                            strSubstring = strOptString.substring(1, strOptString.indexOf(34, 1));
                            if (BLiveTraceServerLocation.main.equals(strSubstring)) {
                                i = i4;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append(strSubstring);
                                sb.append("  (");
                                i = i4;
                                try {
                                    sb.append(strOptString.substring(strOptString.indexOf(34, i) + 1));
                                    sb.append(" )");
                                    strSubstring = sb.toString();
                                } catch (Throwable unused5) {
                                }
                            }
                        } catch (Throwable unused6) {
                        }
                        if (jSONArray5.length() > 0) {
                            jSONArray5 = new JSONArray();
                        }
                    } else {
                        i = i4;
                        if (TextUtils.isEmpty(strSubstring)) {
                        }
                    }
                    jSONArray5.put(strOptString);
                }
                jSONArray3.put(strOptString);
            }
            i3++;
            i2 = i;
        }
        if (jSONArray2.length() > 0) {
            this.f75811m = jSONArray3;
            try {
                JSONObject jSONObject = new JSONObject();
                this.f75812n = jSONObject;
                jSONObject.put("thread_all_count", jSONArray2.length());
                this.f75812n.put("thread_stacks", jSONArray2);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private boolean m102095i(long j) {
        if (this.f75820v) {
            this.f75820v = false;
            m102099n(j);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    private boolean m102096j(String str) {
        if (this.f75796A == null) {
            JSONArray jSONArrayM136435j = iiq0.m136435j();
            if (jSONArrayM136435j != null) {
                this.f75796A = new LinkedList();
                this.f75810l = jSONArrayM136435j.optString(0);
                for (int i = 1; i < jSONArrayM136435j.length(); i++) {
                    try {
                        this.f75796A.add(Pattern.compile(jSONArrayM136435j.optString(i)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.f75796A == null) {
                LinkedList linkedList = new LinkedList();
                this.f75796A = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.f75796A.add(Pattern.compile("^default_npth_thread$"));
                this.f75796A.add(Pattern.compile("^RenderThread$"));
                this.f75796A.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        Iterator<Pattern> it = this.f75796A.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    private static String m102098l(float f) {
        return m102089a(f / 100.0f);
    }

    /* JADX INFO: renamed from: n */
    private void m102099n(long j) {
        if (this.f75822x != this.f75821w) {
            try {
                this.f75814p = System.currentTimeMillis();
                this.f75816r = poq0.m170635b();
                this.f75815q = nsq0.m160791a(100, j);
                this.f75806h = poq0.m170636c(j);
                JSONObject jSONObject = new JSONObject();
                this.f75817s = jSONObject;
                giq0.m126389d(this.f75800b, jSONObject);
                this.f75818t = m102104u();
                this.f75804f = !mu40.m156373b();
            } catch (Throwable unused) {
            }
            try {
                this.f75802d = this.f75814p;
                String strM113923k = dwq0.m113923k();
                File file = new File(new File(dwq0.m113933u(this.f75800b), strM113923k), "trace_" + giq0.m126397l(this.f75800b).replace(':', '_') + ".txt");
                file.getParentFile().mkdirs();
                luq0.m151796j(file, clq0.m107577a().format(new Date(System.currentTimeMillis())) + SignParameters.NEW_LINE, false);
                bwq0.m104241d("anr_trace", strM113923k);
                NativeImpl.m5156d(file.getAbsolutePath());
                try {
                    JSONArray jSONArrayM151807u = luq0.m151807u(file.getAbsolutePath());
                    this.f75811m = jSONArrayM151807u;
                    m102094g(jSONArrayM151807u);
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    jnq0.m142383a();
                    jnq0.m142384b("NPTH_CATCH", th);
                }
                if (this.f75805g == null) {
                    this.f75805g = anq0.m97805c(true);
                }
            } catch (Throwable th2) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", th2);
            }
            jsq0.m143056b();
        } else {
            try {
                this.f75802d = this.f75814p;
                String strM113923k2 = dwq0.m113923k();
                File file2 = new File(new File(dwq0.m113933u(this.f75800b), strM113923k2), "trace" + giq0.m126397l(this.f75800b).replace(':', '_') + ".txt");
                file2.getParentFile().mkdirs();
                luq0.m151796j(file2, clq0.m107577a().format(new Date(System.currentTimeMillis())) + SignParameters.NEW_LINE, false);
                bwq0.m104241d("anr_trace", strM113923k2);
                NativeImpl.m5156d(file2.getAbsolutePath());
                try {
                    JSONArray jSONArrayM151807u2 = luq0.m151807u(file2.getAbsolutePath());
                    this.f75811m = jSONArrayM151807u2;
                    m102094g(jSONArrayM151807u2);
                } catch (IOException unused3) {
                } catch (Throwable th3) {
                    jnq0.m142383a();
                    jnq0.m142384b("NPTH_CATCH", th3);
                }
                if (this.f75805g == null) {
                    this.f75805g = anq0.m97805c(true);
                }
            } catch (Throwable th4) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", th4);
            }
        }
        long j2 = this.f75821w;
        this.f75822x = j2;
        this.f75821w = -1L;
        if (j2 == -1) {
            this.f75822x = (-1) - 1;
        }
    }

    /* JADX INFO: renamed from: o */
    private static void m102100o(String str) {
        Iterator<gpl> it = mvq0.m156578a().m137162d().iterator();
        while (it.hasNext()) {
            try {
                it.next().m127358a(CrashType.ANR, str, null);
            } catch (Throwable th) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", th);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private int[] m102101p(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            int iIndexOf = (strOptString == null || strOptString.isEmpty()) ? -1 : strOptString.indexOf("utm=");
            if (iIndexOf > 0) {
                if (this.f75797B == null) {
                    this.f75797B = Pattern.compile("[^0-9]+");
                }
                String[] strArrSplit = this.f75797B.split(strOptString.substring(iIndexOf));
                if (strArrSplit == null || strArrSplit.length < 2) {
                    break;
                    break;
                }
                try {
                    int iIntValue = Integer.decode(strArrSplit[1]).intValue();
                    int iIntValue2 = Integer.decode(strArrSplit[2]).intValue();
                    return new int[]{iIntValue, iIntValue2, iIntValue + iIntValue2};
                } catch (Throwable unused) {
                    ig3.m135964a("Err stack line: ".concat(strOptString));
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    private String m102102q(long j) {
        long jM132703l = j - hrq0.m132703l();
        if (jM132703l < HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
            return "0 - 30s";
        }
        if (jM132703l < Constants.ONE_MIN_IN_MILLIS) {
            return "30s - 1min";
        }
        if (jM132703l < 120000) {
            return "1min - 2min";
        }
        if (jM132703l < Constants.INBOX_V2_THROTTLE_WINDOW_MS) {
            return "2min - 5min";
        }
        if (jM132703l < AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED) {
            return "5min - 10min";
        }
        if (jM132703l < 1800000) {
            return "10min - 30min";
        }
        return jM132703l < 3600000 ? "30min - 1h" : "1h - ";
    }

    /* JADX INFO: renamed from: r */
    private JSONObject m102103r(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayM161749b = nvq0.m161749b(256, 128, jSONArray);
        if (jSONArrayM161749b.length() != jSONArray.length()) {
            this.f75813o++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < jSONArrayM161749b.length(); i++) {
                sb.append(jSONArrayM161749b.getString(i));
                sb.append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: u */
    private boolean m102104u() {
        boolean zM126392g = giq0.m126392g(this.f75800b);
        boolean z = !zM126392g;
        if (zM126392g || ykq0.m215154A().m215204B() > 2000) {
            return z;
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    private File m102105v() {
        if (this.f75798C == null) {
            this.f75798C = new File(this.f75800b.getFilesDir(), "has_anr_signal_" + giq0.m126397l(this.f75800b).replaceAll(":", "_"));
        }
        return this.f75798C;
    }

    /* JADX INFO: renamed from: w */
    private boolean m102106w() {
        return iiq0.m136440o();
    }

    /* JADX INFO: renamed from: d */
    public void m102107d() {
        if (this.f75801c) {
            return;
        }
        this.f75799a = new klq0(this);
        this.f75802d = hrq0.m132703l();
        this.f75801c = true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX INFO: renamed from: h */
    public boolean m102108h(int i, int i2) {
        boolean z;
        boolean z2;
        JSONArray jSONArrayM160791a;
        JSONObject jSONObject;
        JSONObject jSONObjectM170636c;
        JSONArray jSONArrayM170635b;
        boolean z3;
        JSONArray jSONArray;
        boolean z4;
        JSONObject jSONObjectM97805c;
        boolean z5;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        boolean zM219872a = zqq0.m219872a();
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean zM102095i = m102095i(jUptimeMillis);
        String strM97804b = anq0.m97804b(this.f75800b, 1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = "normal";
        boolean z6 = TextUtils.isEmpty(strM97804b) && zM102095i;
        String str2 = "unknown";
        String str3 = "unknown";
        String str4 = "unknown";
        if (zM102095i || !TextUtils.isEmpty(strM97804b)) {
            synchronized (this.f75819u) {
                z = !z6;
            }
            if (this.f75805g != null) {
                z2 = z;
                if (System.currentTimeMillis() - this.f75802d <= 20000) {
                    str = z6 ? "trace_only" : "trace_last";
                }
                JSONObject jSONObject4 = this.f75805g;
                str2 = this.f75807i;
                str3 = this.f75808j;
                str4 = this.f75809k;
                JSONArray jSONArray2 = this.f75811m;
                JSONArray jSONArray3 = this.f75816r;
                jSONArrayM160791a = this.f75815q;
                jSONObject = this.f75817s;
                jSONObjectM170636c = this.f75806h;
                boolean z7 = this.f75818t;
                jSONArrayM170635b = jSONArray3;
                long j = this.f75814p;
                if (!z6) {
                    this.f75805g = null;
                    this.f75811m = null;
                    this.f75815q = null;
                    this.f75806h = null;
                    this.f75816r = null;
                    this.f75807i = "unknown";
                    this.f75808j = "unknown";
                    this.f75809k = "unknown";
                    this.f75813o = 0;
                }
                z3 = z7;
                jSONArray = jSONArray2;
                z4 = z2;
                jCurrentTimeMillis = j;
                jSONObjectM97805c = jSONObject4;
            } else {
                z2 = z;
            }
            if (this.f75820v) {
                this.f75820v = false;
                str = "trace_after";
            }
            m102099n(jUptimeMillis);
            JSONObject jSONObject5 = this.f75805g;
            str2 = this.f75807i;
            str3 = this.f75808j;
            str4 = this.f75809k;
            JSONArray jSONArray4 = this.f75811m;
            JSONArray jSONArray5 = this.f75816r;
            jSONArrayM160791a = this.f75815q;
            jSONObject = this.f75817s;
            jSONObjectM170636c = this.f75806h;
            boolean z8 = this.f75818t;
            jSONArrayM170635b = jSONArray5;
            long j2 = this.f75814p;
            if (!z6) {
                this.f75805g = null;
                this.f75811m = null;
                this.f75815q = null;
                this.f75806h = null;
                this.f75816r = null;
                this.f75807i = "unknown";
                this.f75808j = "unknown";
                this.f75809k = "unknown";
                this.f75813o = 0;
            }
            z3 = z8;
            jSONArray = jSONArray4;
            z4 = z2;
            jCurrentTimeMillis = j2;
            jSONObjectM97805c = jSONObject5;
        } else {
            z4 = false;
            z3 = false;
            jSONArray = null;
            jSONObjectM97805c = null;
            jSONObject = null;
            jSONArrayM160791a = null;
            jSONObjectM170636c = null;
            jSONArrayM170635b = null;
        }
        if (!z6 && TextUtils.isEmpty(strM97804b)) {
            if (this.f75805g == null || System.currentTimeMillis() - this.f75802d <= 20000) {
                if (this.f75805g == null || System.currentTimeMillis() - this.f75802d <= 2000 || !NativeImpl.m5167o()) {
                    return false;
                }
                luq0.m151804r(m102105v());
                return false;
            }
            this.f75805g = null;
            this.f75811m = null;
            this.f75815q = null;
            this.f75806h = null;
            this.f75816r = null;
            this.f75807i = "unknown";
            this.f75808j = "unknown";
            this.f75809k = "unknown";
            this.f75813o = 0;
            File file = this.f75803e;
            if (file != null) {
                luq0.m151804r(file);
            }
            this.f75803e = null;
            return false;
        }
        if (jSONObjectM97805c == null) {
            if (jSONArrayM160791a == null) {
                try {
                    jSONArrayM170635b = poq0.m170635b();
                    z5 = z4;
                    try {
                        jSONArrayM160791a = nsq0.m160791a(100, jUptimeMillis);
                        jSONObjectM170636c = poq0.m170636c(jUptimeMillis);
                        JSONObject jSONObject6 = new JSONObject();
                        try {
                            giq0.m126389d(this.f75800b, jSONObject6);
                            jSONObject = jSONObject6;
                        } catch (Throwable unused) {
                            jSONObject = jSONObject6;
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    z5 = z4;
                }
            } else {
                z5 = z4;
            }
            jSONObjectM97805c = anq0.m97805c(f75795E);
        } else {
            z5 = z4;
        }
        JSONObject jSONObject7 = jSONObjectM170636c;
        JSONArray jSONArray6 = jSONArrayM170635b;
        if (jSONObjectM97805c != null && jSONObjectM97805c.length() > 0) {
            try {
                boolean z9 = z6;
                jSONObjectM97805c.put("pid", Process.myPid());
                jSONObjectM97805c.put("package", this.f75800b.getPackageName());
                jSONObjectM97805c.put("is_remote_process", 0);
                jSONObjectM97805c.put("is_new_stack", 10);
                bjq0 bjq0Var = new bjq0(new JSONObject());
                JSONObject jSONObject8 = jSONObjectM97805c;
                bjq0Var.m102217j("data", jSONObject8.toString());
                bjq0Var.m102217j("is_anr", 1);
                bjq0Var.m102217j("anrType", str);
                bjq0Var.m102217j("history_message", jSONArray6);
                bjq0Var.m102217j("current_message", jSONObject7);
                bjq0Var.m102217j("pending_messages", jSONArrayM160791a);
                bjq0Var.m102217j("anr_time", Long.valueOf(System.currentTimeMillis()));
                bjq0Var.m102217j("crash_time", Long.valueOf(jCurrentTimeMillis));
                bjq0Var.m102225y(jSONObject);
                bjq0Var.m102217j("anr_info", z9 ? "no anr info" : strM97804b);
                if (jSONArray != null) {
                    bjq0Var.m102217j("dump_trace", jSONArray);
                }
                bjq0Var.m102217j("all_thread_stacks", (z9 || !((jSONObject3 = this.f75812n) == null || jSONObject3.length() == 0)) ? this.f75812n : xwq0.m211375r(null));
                erq0 erq0VarM117871d = erq0.m117871d();
                CrashType crashType = CrashType.ANR;
                bjq0 bjq0VarM117872a = erq0VarM117871d.m117872a(crashType, bjq0Var);
                bjq0VarM117872a.m102217j("is_background", Boolean.valueOf(z3));
                bjq0VarM117872a.m102217j("logcat", bvq0.m104074b(hrq0.m132699h()));
                bjq0VarM117872a.m102217j("has_dump", "true");
                bjq0VarM117872a.m102217j("crash_uuid", hrq0.m132692a(jCurrentTimeMillis, crashType, false, false));
                bjq0VarM117872a.m102217j("jiffy", Long.valueOf(yvq0.m216227a()));
                JSONObject jSONObjectOptJSONObject = bjq0VarM117872a.m102206G().optJSONObject("filters");
                if (jSONObjectOptJSONObject == null) {
                    try {
                        jSONObject2 = new JSONObject();
                        try {
                            bjq0VarM117872a.m102217j("filters", jSONObject2);
                        } catch (Throwable unused4) {
                            jSONObjectOptJSONObject = jSONObject2;
                            jSONObject2 = jSONObjectOptJSONObject;
                        }
                    } catch (Throwable unused5) {
                        jSONObject2 = jSONObjectOptJSONObject;
                    }
                } else {
                    jSONObject2 = jSONObjectOptJSONObject;
                }
                jSONObject2.put("anrType", str);
                jSONObject2.put("max_utm_thread", str2);
                jSONObject2.put("max_stm_thread", str3);
                jSONObject2.put("max_utm_stm_thread", str4);
                jSONObject2.put("max_utm_thread_version", this.f75810l);
                jSONObject2.put("crash_length", m102102q(jCurrentTimeMillis));
                jSONObject2.put("disable_looper_monitor", String.valueOf(iiq0.m136437l()));
                jSONObject2.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, "0.0.2");
                jSONObject2.put("has_logcat", String.valueOf(bjq0VarM117872a.m102218o()));
                jSONObject2.put("memory_leak", String.valueOf(bjq0VarM117872a.m102204E()));
                jSONObject2.put("fd_leak", String.valueOf(bjq0VarM117872a.m102201A()));
                jSONObject2.put("threads_leak", String.valueOf(bjq0VarM117872a.m102203D()));
                jSONObject2.put("is_64_devices", String.valueOf(bnq0.m102836f()));
                jSONObject2.put("is_64_runtime", String.valueOf(NativeImpl.m5166n()));
                jSONObject2.put("is_x86_devices", String.valueOf(bnq0.m102840j()));
                jSONObject2.put("has_meminfo_file", String.valueOf(bjq0VarM117872a.m102205F()));
                jSONObject2.put("is_root", hnq0.m131989y() ? "true" : "false");
                jSONObject2.put("anr_normal_trace", String.valueOf(!this.f75820v));
                jSONObject2.put("anr_no_run", String.valueOf(zM219872a));
                jSONObject2.put("crash_after_crash", mu40.m156373b() ? "true" : "false");
                jSONObject2.put("from_file", String.valueOf(anq0.m97806d()));
                jSONObject2.put("has_dump", "true");
                jSONObject2.put("from_kill", String.valueOf(z9));
                jSONObject2.put("last_resume_activity", ykq0.m215154A().m215207K());
                int i3 = this.f75813o;
                if (i3 > 0) {
                    jSONObject2.put("may_have_stack_overflow", String.valueOf(i3));
                }
                if (!z9) {
                    try {
                        m102092e(strM97804b, jSONObject2);
                    } catch (Throwable th) {
                        jnq0.m142383a();
                        jnq0.m142384b("NPTH_CATCH", th);
                    }
                } else if (!m102106w()) {
                    jSONObject2.put("aid", String.valueOf(bjq0VarM117872a.m102207H().m102857s().opt("aid")));
                }
                if (z9) {
                    String strM5131s = C0922e.m5131s();
                    File file2 = new File(dwq0.m113914b(this.f75800b), hrq0.m132692a(jCurrentTimeMillis, CrashType.ANR, false, false));
                    this.f75803e = file2;
                    luq0.m151790d(file2, file2.getName(), strM5131s, bjq0VarM117872a.m102206G(), C0922e.m5129q());
                } else {
                    File file3 = this.f75803e;
                    if (file3 != null) {
                        luq0.m151804r(file3);
                        this.f75803e = null;
                    }
                    wiq0.m203345a().m203346b(CrashType.ANR, jCurrentTimeMillis, hrq0.m132698g());
                    try {
                        if (jsq0.m143061g().length() > 1024) {
                            bjq0VarM117872a.m102210c("has_system_traces", "true");
                        }
                    } catch (Throwable unused6) {
                    }
                    try {
                        JSONArray jSONArrayM189920b = toq0.m189920b(dwq0.m113929q(hrq0.m132699h()), dwq0.m113932t(hrq0.m132699h()));
                        jSONObject2.put("leak_threads_count", String.valueOf(jSONArrayM189920b.length()));
                        if (jSONArrayM189920b.length() > 0) {
                            luq0.m151798l(dwq0.m113935w(hrq0.m132699h()), jSONArrayM189920b, false);
                        }
                    } catch (Throwable unused7) {
                    }
                    plq0.m170249h(bjq0VarM117872a.m102206G(), plq0.m170245d(jSONObject8.optString("mainStackFromTrace")), new C15869a(jCurrentTimeMillis));
                    m102100o(strM97804b);
                }
            } catch (Throwable th2) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", th2);
            }
        }
        return z5;
    }

    /* JADX INFO: renamed from: m */
    public void m102109m() {
        klq0 klq0Var = this.f75799a;
        if (klq0Var != null) {
            klq0Var.m146436b();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m102110s() {
        if (f75794D) {
            return;
        }
        synchronized (this.f75819u) {
            try {
                if (f75794D) {
                    return;
                }
                this.f75823y.run();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m102111t() {
        File fileM102105v = m102105v();
        try {
            int iIntValue = Integer.decode(luq0.m151812z(fileM102105v.getAbsolutePath())).intValue();
            this.f75824z = iIntValue;
            if (iIntValue >= 2) {
                NativeImpl.m5172t(false);
            } else {
                NativeImpl.m5172t(true);
            }
        } catch (IOException unused) {
            NativeImpl.m5172t(true);
        } catch (Throwable unused2) {
            luq0.m151804r(fileM102105v);
        }
    }
}
