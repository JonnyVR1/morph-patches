package p153l;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.apm.lite.CrashType;
import com.apm.lite.nativecrash.NativeImpl;
import com.apm.lite.p010j.C0926e;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
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
public class grq0 {

    /* JADX INFO: renamed from: D */
    private static volatile boolean f106099D = false;

    /* JADX INFO: renamed from: E */
    static volatile boolean f106100E = true;

    /* JADX INFO: renamed from: a */
    private quq0 f106104a;

    /* JADX INFO: renamed from: b */
    private final Context f106105b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f106106c;

    /* JADX INFO: renamed from: g */
    private JSONObject f106110g;

    /* JADX INFO: renamed from: h */
    private JSONObject f106111h;

    /* JADX INFO: renamed from: m */
    private JSONArray f106116m;

    /* JADX INFO: renamed from: n */
    private JSONObject f106117n;

    /* JADX INFO: renamed from: q */
    private JSONArray f106120q;

    /* JADX INFO: renamed from: r */
    private JSONArray f106121r;

    /* JADX INFO: renamed from: s */
    private JSONObject f106122s;

    /* JADX INFO: renamed from: t */
    private boolean f106123t;

    /* JADX INFO: renamed from: v */
    private volatile boolean f106125v;

    /* JADX INFO: renamed from: d */
    private long f106107d = -1;

    /* JADX INFO: renamed from: e */
    private File f106108e = null;

    /* JADX INFO: renamed from: f */
    private boolean f106109f = true;

    /* JADX INFO: renamed from: i */
    private String f106112i = "unknown";

    /* JADX INFO: renamed from: j */
    private String f106113j = "unknown";

    /* JADX INFO: renamed from: k */
    private String f106114k = "unknown";

    /* JADX INFO: renamed from: l */
    private String f106115l = "npth_inner_default";

    /* JADX INFO: renamed from: o */
    private int f106118o = 0;

    /* JADX INFO: renamed from: p */
    private long f106119p = -1;

    /* JADX INFO: renamed from: u */
    private final Object f106124u = new Object();

    /* JADX INFO: renamed from: w */
    private long f106126w = -1;

    /* JADX INFO: renamed from: x */
    private long f106127x = 0;

    /* JADX INFO: renamed from: y */
    private final Runnable f106128y = new RunnableC17285b();

    /* JADX INFO: renamed from: z */
    private int f106129z = 0;

    /* JADX INFO: renamed from: A */
    private List<Pattern> f106101A = null;

    /* JADX INFO: renamed from: B */
    Pattern f106102B = null;

    /* JADX INFO: renamed from: C */
    private File f106103C = null;

    /* JADX INFO: renamed from: l.grq0$a */
    public class C17284a implements vuq0.InterfaceC20938a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f106130a;

        public C17284a(long j) {
            this.f106130a = j;
        }

        @Override // p153l.vuq0.InterfaceC20938a
        /* JADX INFO: renamed from: a */
        public void mo131857a(JSONObject jSONObject) {
            yxq0.m217735a().m217736b(jSONObject, this.f106130a, grq0.this.f106109f);
        }
    }

    /* JADX INFO: renamed from: l.grq0$b */
    public class RunnableC17285b implements Runnable {
        public RunnableC17285b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                grq0.this.m131853h(200, 25);
            } catch (Throwable th) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", th);
            }
        }
    }

    public grq0(Context context) {
        this.f106105b = context;
    }

    /* JADX INFO: renamed from: a */
    private static String m131834a(float f) {
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
    private static String m131835b(float f, float f2) {
        if (f2 > 0.0f) {
            return m131834a(f / f2);
        }
        return f > 0.0f ? "100%" : "0%";
    }

    /* JADX INFO: renamed from: c */
    private JSONObject m131836c(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayM189298b = t4r0.m189298b(256, 128, jSONArray);
        if (jSONArrayM189298b.length() != jSONArray.length()) {
            this.f106118o++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", jSONArrayM189298b);
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
    private void m131837e(String str, JSONObject jSONObject) throws JSONException {
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
                                } else if (strTrim3.contains(this.f106105b.getPackageName())) {
                                    int i6 = 0;
                                    strConcat = "";
                                    while (i6 < strArrSplit3.length) {
                                        int i7 = i6;
                                        if (strArrSplit3[i6].contains(this.f106105b.getPackageName())) {
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
                                                fFloatValue2 /= rxq0.m183563i();
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
                                                        fFloatValue /= rxq0.m183563i();
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
                                                        fFloatValue /= rxq0.m183563i();
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
                                                            fFloatValue /= rxq0.m183563i();
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
                                                        fFloatValue /= rxq0.m183563i();
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
                                                    fFloatValue /= rxq0.m183563i();
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
                                                    fFloatValue /= rxq0.m183563i();
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
                                                fFloatValue /= rxq0.m183563i();
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
        m131838f(map6, jSONObject, "app");
        m131838f(map4, jSONObject, "total");
        if (map.isEmpty()) {
            jSONObject.put("npth_anr_systemserver_total", "not found");
        } else {
            jSONObject.put("npth_anr_systemserver_total", m131843l(u5r0.m194617a(map).floatValue()));
        }
        if (map8.isEmpty()) {
            jSONObject.put("npth_anr_kswapd_total", "not found");
        } else {
            jSONObject.put("npth_anr_kswapd_total", m131843l(u5r0.m194617a(map8).floatValue()));
        }
        if (map2.isEmpty()) {
            jSONObject.put("npth_anr_dex2oat_total", "not found");
        } else {
            jSONObject.put("npth_anr_dex2oat_total", m131843l(u5r0.m194617a(map2).floatValue()));
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m131838f(HashMap<String, Float> map, JSONObject jSONObject, String str) throws JSONException {
        String strConcat;
        String strM131835b;
        String str2 = "npth_anr_" + str;
        if (map.isEmpty()) {
            strConcat = str2.concat("_total");
            strM131835b = "not found";
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
            jSONObject.put(str2.concat("_total"), m131843l(f));
            jSONObject.put(str2.concat("_kernel_user_ratio"), m131835b(fFloatValue2, f));
            strConcat = str2.concat("_iowait_user_ratio");
            strM131835b = m131835b(fFloatValue3, f);
        }
        jSONObject.put(strConcat, strM131835b);
    }

    /* JADX INFO: renamed from: g */
    private void m131839g(JSONArray jSONArray) {
        int i;
        int[] iArrM131846p;
        int[] iArrM131846p2;
        if (jSONArray == null) {
            return;
        }
        this.f106110g = null;
        this.f106117n = null;
        this.f106118o = 0;
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        this.f106112i = "unknown";
        this.f106113j = "unknown";
        this.f106114k = "unknown";
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
                    if (this.f106110g == null && BLiveTraceServerLocation.main.equals(strSubstring)) {
                        this.f106110g = m131848r(jSONArray5);
                    } else {
                        jSONArray2.put(m131836c(strSubstring, jSONArray5));
                    }
                    try {
                        if (!BLiveTraceServerLocation.main.equals(strSubstring)) {
                            strSubstring = strSubstring.substring(0, strSubstring.indexOf(40)).trim();
                        }
                    } catch (Throwable unused) {
                    }
                    String str = strSubstring;
                    if (!m131841j(str)) {
                        try {
                            iArrM131846p2 = m131846p(jSONArray5);
                        } catch (IllegalArgumentException e) {
                            pwq0.m174074a();
                            pwq0.m174075b("NPTH_CATCH", e);
                            iArrM131846p2 = null;
                        } catch (Throwable unused2) {
                            iArrM131846p2 = null;
                        }
                        if (iArrM131846p2 != null) {
                            int i5 = iArrM131846p2[0];
                            if (i5 > iArr[0]) {
                                iArr[0] = i5;
                                this.f106112i = str;
                            }
                            int i6 = iArrM131846p2[1];
                            if (i6 > iArr[1]) {
                                iArr[1] = i6;
                                this.f106113j = str;
                            }
                            int i7 = iArrM131846p2[i4];
                            if (i7 > iArr[i4]) {
                                iArr[i4] = i7;
                                this.f106114k = str;
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
                            if (this.f106110g == null && BLiveTraceServerLocation.main.equals(strSubstring)) {
                                this.f106110g = m131848r(jSONArray5);
                            } else {
                                jSONArray2.put(m131836c(strSubstring, jSONArray5));
                            }
                            try {
                                if (!BLiveTraceServerLocation.main.equals(strSubstring)) {
                                    strSubstring = strSubstring.substring(0, strSubstring.indexOf(40)).trim();
                                }
                            } catch (Throwable unused3) {
                            }
                            String str2 = strSubstring;
                            if (!m131841j(str2)) {
                                try {
                                    iArrM131846p = m131846p(jSONArray5);
                                } catch (IllegalArgumentException e2) {
                                    pwq0.m174074a();
                                    pwq0.m174075b("NPTH_CATCH", e2);
                                    iArrM131846p = null;
                                } catch (Throwable unused4) {
                                    iArrM131846p = null;
                                }
                                if (iArrM131846p != null) {
                                    int i8 = iArrM131846p[0];
                                    if (i8 > iArr[0]) {
                                        iArr[0] = i8;
                                        this.f106112i = str2;
                                    }
                                    int i9 = iArrM131846p[1];
                                    if (i9 > iArr[1]) {
                                        iArr[1] = i9;
                                        this.f106113j = str2;
                                    }
                                    int i10 = iArrM131846p[i4];
                                    if (i10 > iArr[i4]) {
                                        iArr[i4] = i10;
                                        this.f106114k = str2;
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
            this.f106116m = jSONArray3;
            try {
                JSONObject jSONObject = new JSONObject();
                this.f106117n = jSONObject;
                jSONObject.put("thread_all_count", jSONArray2.length());
                this.f106117n.put("thread_stacks", jSONArray2);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private boolean m131840i(long j) {
        if (this.f106125v) {
            this.f106125v = false;
            m131844n(j);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    private boolean m131841j(String str) {
        if (this.f106101A == null) {
            JSONArray jSONArrayM164513j = nrq0.m164513j();
            if (jSONArrayM164513j != null) {
                this.f106101A = new LinkedList();
                this.f106115l = jSONArrayM164513j.optString(0);
                for (int i = 1; i < jSONArrayM164513j.length(); i++) {
                    try {
                        this.f106101A.add(Pattern.compile(jSONArrayM164513j.optString(i)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.f106101A == null) {
                LinkedList linkedList = new LinkedList();
                this.f106101A = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.f106101A.add(Pattern.compile("^default_npth_thread$"));
                this.f106101A.add(Pattern.compile("^RenderThread$"));
                this.f106101A.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        Iterator<Pattern> it = this.f106101A.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    private static String m131843l(float f) {
        return m131834a(f / 100.0f);
    }

    /* JADX INFO: renamed from: n */
    private void m131844n(long j) {
        if (this.f106127x != this.f106126w) {
            try {
                this.f106119p = System.currentTimeMillis();
                this.f106121r = vxq0.m203870b();
                this.f106120q = t1r0.m188932a(100, j);
                this.f106111h = vxq0.m203871c(j);
                JSONObject jSONObject = new JSONObject();
                this.f106122s = jSONObject;
                lrq0.m155640d(this.f106105b, jSONObject);
                this.f106123t = m131849u();
                this.f106109f = !b350.m102270b();
            } catch (Throwable unused) {
            }
            try {
                this.f106107d = this.f106119p;
                String strM143575k = j5r0.m143575k();
                File file = new File(new File(j5r0.m143585u(this.f106105b), strM143575k), "trace_" + lrq0.m155648l(this.f106105b).replace(':', '_') + ".txt");
                file.getParentFile().mkdirs();
                r3r0.m179684j(file, iuq0.m142233a().format(new Date(System.currentTimeMillis())) + SignParameters.NEW_LINE, false);
                h5r0.m133674d("anr_trace", strM143575k);
                NativeImpl.m5166d(file.getAbsolutePath());
                try {
                    JSONArray jSONArrayM179695u = r3r0.m179695u(file.getAbsolutePath());
                    this.f106116m = jSONArrayM179695u;
                    m131839g(jSONArrayM179695u);
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    pwq0.m174074a();
                    pwq0.m174075b("NPTH_CATCH", th);
                }
                if (this.f106110g == null) {
                    this.f106110g = gwq0.m132690c(true);
                }
            } catch (Throwable th2) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", th2);
            }
            p1r0.m170260b();
        } else {
            try {
                this.f106107d = this.f106119p;
                String strM143575k2 = j5r0.m143575k();
                File file2 = new File(new File(j5r0.m143585u(this.f106105b), strM143575k2), "trace" + lrq0.m155648l(this.f106105b).replace(':', '_') + ".txt");
                file2.getParentFile().mkdirs();
                r3r0.m179684j(file2, iuq0.m142233a().format(new Date(System.currentTimeMillis())) + SignParameters.NEW_LINE, false);
                h5r0.m133674d("anr_trace", strM143575k2);
                NativeImpl.m5166d(file2.getAbsolutePath());
                try {
                    JSONArray jSONArrayM179695u2 = r3r0.m179695u(file2.getAbsolutePath());
                    this.f106116m = jSONArrayM179695u2;
                    m131839g(jSONArrayM179695u2);
                } catch (IOException unused3) {
                } catch (Throwable th3) {
                    pwq0.m174074a();
                    pwq0.m174075b("NPTH_CATCH", th3);
                }
                if (this.f106110g == null) {
                    this.f106110g = gwq0.m132690c(true);
                }
            } catch (Throwable th4) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", th4);
            }
        }
        long j2 = this.f106126w;
        this.f106127x = j2;
        this.f106126w = -1L;
        if (j2 == -1) {
            this.f106127x = (-1) - 1;
        }
    }

    /* JADX INFO: renamed from: o */
    private static void m131845o(String str) {
        Iterator<srl> it = s4r0.m184572a().m169615d().iterator();
        while (it.hasNext()) {
            try {
                it.next().m187630a(CrashType.ANR, str, null);
            } catch (Throwable th) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", th);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private int[] m131846p(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            int iIndexOf = (strOptString == null || strOptString.isEmpty()) ? -1 : strOptString.indexOf("utm=");
            if (iIndexOf > 0) {
                if (this.f106102B == null) {
                    this.f106102B = Pattern.compile("[^0-9]+");
                }
                String[] strArrSplit = this.f106102B.split(strOptString.substring(iIndexOf));
                if (strArrSplit == null || strArrSplit.length < 2) {
                    break;
                    break;
                }
                try {
                    int iIntValue = Integer.decode(strArrSplit[1]).intValue();
                    int iIntValue2 = Integer.decode(strArrSplit[2]).intValue();
                    return new int[]{iIntValue, iIntValue2, iIntValue + iIntValue2};
                } catch (Throwable unused) {
                    wg3.m206174a("Err stack line: ".concat(strOptString));
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    private String m131847q(long j) {
        long jM161025l = j - n0r0.m161025l();
        if (jM161025l < HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
            return "0 - 30s";
        }
        if (jM161025l < Constants.ONE_MIN_IN_MILLIS) {
            return "30s - 1min";
        }
        if (jM161025l < 120000) {
            return "1min - 2min";
        }
        if (jM161025l < Constants.INBOX_V2_THROTTLE_WINDOW_MS) {
            return "2min - 5min";
        }
        if (jM161025l < AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED) {
            return "5min - 10min";
        }
        if (jM161025l < 1800000) {
            return "10min - 30min";
        }
        return jM161025l < 3600000 ? "30min - 1h" : "1h - ";
    }

    /* JADX INFO: renamed from: r */
    private JSONObject m131848r(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayM189298b = t4r0.m189298b(256, 128, jSONArray);
        if (jSONArrayM189298b.length() != jSONArray.length()) {
            this.f106118o++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < jSONArrayM189298b.length(); i++) {
                sb.append(jSONArrayM189298b.getString(i));
                sb.append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: u */
    private boolean m131849u() {
        boolean zM155643g = lrq0.m155643g(this.f106105b);
        boolean z = !zM155643g;
        if (zM155643g || euq0.m122681A().m122731B() > 2000) {
            return z;
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    private File m131850v() {
        if (this.f106103C == null) {
            this.f106103C = new File(this.f106105b.getFilesDir(), "has_anr_signal_" + lrq0.m155648l(this.f106105b).replaceAll(":", "_"));
        }
        return this.f106103C;
    }

    /* JADX INFO: renamed from: w */
    private boolean m131851w() {
        return nrq0.m164518o();
    }

    /* JADX INFO: renamed from: d */
    public void m131852d() {
        if (this.f106106c) {
            return;
        }
        this.f106104a = new quq0(this);
        this.f106107d = n0r0.m161025l();
        this.f106106c = true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX INFO: renamed from: h */
    public boolean m131853h(int i, int i2) {
        boolean z;
        boolean z2;
        JSONArray jSONArrayM188932a;
        JSONObject jSONObject;
        JSONObject jSONObjectM203871c;
        JSONArray jSONArrayM203870b;
        boolean z3;
        JSONArray jSONArray;
        boolean z4;
        JSONObject jSONObjectM132690c;
        boolean z5;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        boolean zM123511a = f0r0.m123511a();
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean zM131840i = m131840i(jUptimeMillis);
        String strM132689b = gwq0.m132689b(this.f106105b, 1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = "normal";
        boolean z6 = TextUtils.isEmpty(strM132689b) && zM131840i;
        String str2 = "unknown";
        String str3 = "unknown";
        String str4 = "unknown";
        if (zM131840i || !TextUtils.isEmpty(strM132689b)) {
            synchronized (this.f106124u) {
                z = !z6;
            }
            if (this.f106110g != null) {
                z2 = z;
                if (System.currentTimeMillis() - this.f106107d <= 20000) {
                    str = z6 ? "trace_only" : "trace_last";
                }
                JSONObject jSONObject4 = this.f106110g;
                str2 = this.f106112i;
                str3 = this.f106113j;
                str4 = this.f106114k;
                JSONArray jSONArray2 = this.f106116m;
                JSONArray jSONArray3 = this.f106121r;
                jSONArrayM188932a = this.f106120q;
                jSONObject = this.f106122s;
                jSONObjectM203871c = this.f106111h;
                boolean z7 = this.f106123t;
                jSONArrayM203870b = jSONArray3;
                long j = this.f106119p;
                if (!z6) {
                    this.f106110g = null;
                    this.f106116m = null;
                    this.f106120q = null;
                    this.f106111h = null;
                    this.f106121r = null;
                    this.f106112i = "unknown";
                    this.f106113j = "unknown";
                    this.f106114k = "unknown";
                    this.f106118o = 0;
                }
                z3 = z7;
                jSONArray = jSONArray2;
                z4 = z2;
                jCurrentTimeMillis = j;
                jSONObjectM132690c = jSONObject4;
            } else {
                z2 = z;
            }
            if (this.f106125v) {
                this.f106125v = false;
                str = "trace_after";
            }
            m131844n(jUptimeMillis);
            JSONObject jSONObject5 = this.f106110g;
            str2 = this.f106112i;
            str3 = this.f106113j;
            str4 = this.f106114k;
            JSONArray jSONArray4 = this.f106116m;
            JSONArray jSONArray5 = this.f106121r;
            jSONArrayM188932a = this.f106120q;
            jSONObject = this.f106122s;
            jSONObjectM203871c = this.f106111h;
            boolean z8 = this.f106123t;
            jSONArrayM203870b = jSONArray5;
            long j2 = this.f106119p;
            if (!z6) {
                this.f106110g = null;
                this.f106116m = null;
                this.f106120q = null;
                this.f106111h = null;
                this.f106121r = null;
                this.f106112i = "unknown";
                this.f106113j = "unknown";
                this.f106114k = "unknown";
                this.f106118o = 0;
            }
            z3 = z8;
            jSONArray = jSONArray4;
            z4 = z2;
            jCurrentTimeMillis = j2;
            jSONObjectM132690c = jSONObject5;
        } else {
            z4 = false;
            z3 = false;
            jSONArray = null;
            jSONObjectM132690c = null;
            jSONObject = null;
            jSONArrayM188932a = null;
            jSONObjectM203871c = null;
            jSONArrayM203870b = null;
        }
        if (!z6 && TextUtils.isEmpty(strM132689b)) {
            if (this.f106110g == null || System.currentTimeMillis() - this.f106107d <= 20000) {
                if (this.f106110g == null || System.currentTimeMillis() - this.f106107d <= 2000 || !NativeImpl.m5177o()) {
                    return false;
                }
                r3r0.m179692r(m131850v());
                return false;
            }
            this.f106110g = null;
            this.f106116m = null;
            this.f106120q = null;
            this.f106111h = null;
            this.f106121r = null;
            this.f106112i = "unknown";
            this.f106113j = "unknown";
            this.f106114k = "unknown";
            this.f106118o = 0;
            File file = this.f106108e;
            if (file != null) {
                r3r0.m179692r(file);
            }
            this.f106108e = null;
            return false;
        }
        if (jSONObjectM132690c == null) {
            if (jSONArrayM188932a == null) {
                try {
                    jSONArrayM203870b = vxq0.m203870b();
                    z5 = z4;
                    try {
                        jSONArrayM188932a = t1r0.m188932a(100, jUptimeMillis);
                        jSONObjectM203871c = vxq0.m203871c(jUptimeMillis);
                        JSONObject jSONObject6 = new JSONObject();
                        try {
                            lrq0.m155640d(this.f106105b, jSONObject6);
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
            jSONObjectM132690c = gwq0.m132690c(f106100E);
        } else {
            z5 = z4;
        }
        JSONObject jSONObject7 = jSONObjectM203871c;
        JSONArray jSONArray6 = jSONArrayM203870b;
        if (jSONObjectM132690c != null && jSONObjectM132690c.length() > 0) {
            try {
                boolean z9 = z6;
                jSONObjectM132690c.put("pid", Process.myPid());
                jSONObjectM132690c.put("package", this.f106105b.getPackageName());
                jSONObjectM132690c.put("is_remote_process", 0);
                jSONObjectM132690c.put("is_new_stack", 10);
                gsq0 gsq0Var = new gsq0(new JSONObject());
                JSONObject jSONObject8 = jSONObjectM132690c;
                gsq0Var.m132136j("data", jSONObject8.toString());
                gsq0Var.m132136j("is_anr", 1);
                gsq0Var.m132136j("anrType", str);
                gsq0Var.m132136j("history_message", jSONArray6);
                gsq0Var.m132136j("current_message", jSONObject7);
                gsq0Var.m132136j("pending_messages", jSONArrayM188932a);
                gsq0Var.m132136j("anr_time", Long.valueOf(System.currentTimeMillis()));
                gsq0Var.m132136j("crash_time", Long.valueOf(jCurrentTimeMillis));
                gsq0Var.m132144y(jSONObject);
                gsq0Var.m132136j("anr_info", z9 ? "no anr info" : strM132689b);
                if (jSONArray != null) {
                    gsq0Var.m132136j("dump_trace", jSONArray);
                }
                gsq0Var.m132136j("all_thread_stacks", (z9 || !((jSONObject3 = this.f106117n) == null || jSONObject3.length() == 0)) ? this.f106117n : d6r0.m114523r(null));
                k0r0 k0r0VarM147834d = k0r0.m147834d();
                CrashType crashType = CrashType.ANR;
                gsq0 gsq0VarM147835a = k0r0VarM147834d.m147835a(crashType, gsq0Var);
                gsq0VarM147835a.m132136j("is_background", Boolean.valueOf(z3));
                gsq0VarM147835a.m132136j("logcat", h4r0.m133594b(n0r0.m161021h()));
                gsq0VarM147835a.m132136j("has_dump", "true");
                gsq0VarM147835a.m132136j("crash_uuid", n0r0.m161014a(jCurrentTimeMillis, crashType, false, false));
                gsq0VarM147835a.m132136j("jiffy", Long.valueOf(e5r0.m119551a()));
                JSONObject jSONObjectOptJSONObject = gsq0VarM147835a.m132125G().optJSONObject("filters");
                if (jSONObjectOptJSONObject == null) {
                    try {
                        jSONObject2 = new JSONObject();
                        try {
                            gsq0VarM147835a.m132136j("filters", jSONObject2);
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
                jSONObject2.put("max_utm_thread_version", this.f106115l);
                jSONObject2.put("crash_length", m131847q(jCurrentTimeMillis));
                jSONObject2.put("disable_looper_monitor", String.valueOf(nrq0.m164515l()));
                jSONObject2.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, "0.0.2");
                jSONObject2.put("has_logcat", String.valueOf(gsq0VarM147835a.m132137o()));
                jSONObject2.put("memory_leak", String.valueOf(gsq0VarM147835a.m132123E()));
                jSONObject2.put("fd_leak", String.valueOf(gsq0VarM147835a.m132120A()));
                jSONObject2.put("threads_leak", String.valueOf(gsq0VarM147835a.m132122D()));
                jSONObject2.put("is_64_devices", String.valueOf(hwq0.m137480f()));
                jSONObject2.put("is_64_runtime", String.valueOf(NativeImpl.m5176n()));
                jSONObject2.put("is_x86_devices", String.valueOf(hwq0.m137484j()));
                jSONObject2.put("has_meminfo_file", String.valueOf(gsq0VarM147835a.m132124F()));
                jSONObject2.put("is_root", nwq0.m165018y() ? "true" : "false");
                jSONObject2.put("anr_normal_trace", String.valueOf(!this.f106125v));
                jSONObject2.put("anr_no_run", String.valueOf(zM123511a));
                jSONObject2.put("crash_after_crash", b350.m102270b() ? "true" : "false");
                jSONObject2.put("from_file", String.valueOf(gwq0.m132691d()));
                jSONObject2.put("has_dump", "true");
                jSONObject2.put("from_kill", String.valueOf(z9));
                jSONObject2.put("last_resume_activity", euq0.m122681A().m122734K());
                int i3 = this.f106118o;
                if (i3 > 0) {
                    jSONObject2.put("may_have_stack_overflow", String.valueOf(i3));
                }
                if (!z9) {
                    try {
                        m131837e(strM132689b, jSONObject2);
                    } catch (Throwable th) {
                        pwq0.m174074a();
                        pwq0.m174075b("NPTH_CATCH", th);
                    }
                } else if (!m131851w()) {
                    jSONObject2.put("aid", String.valueOf(gsq0VarM147835a.m132126H().m137501s().opt("aid")));
                }
                if (z9) {
                    String strM5141s = C0926e.m5141s();
                    File file2 = new File(j5r0.m143566b(this.f106105b), n0r0.m161014a(jCurrentTimeMillis, CrashType.ANR, false, false));
                    this.f106108e = file2;
                    r3r0.m179678d(file2, file2.getName(), strM5141s, gsq0VarM147835a.m132125G(), C0926e.m5139q());
                } else {
                    File file3 = this.f106108e;
                    if (file3 != null) {
                        r3r0.m179692r(file3);
                        this.f106108e = null;
                    }
                    bsq0.m106310a().m106311b(CrashType.ANR, jCurrentTimeMillis, n0r0.m161020g());
                    try {
                        if (p1r0.m170265g().length() > 1024) {
                            gsq0VarM147835a.m132129c("has_system_traces", "true");
                        }
                    } catch (Throwable unused6) {
                    }
                    try {
                        JSONArray jSONArrayM222065b = zxq0.m222065b(j5r0.m143581q(n0r0.m161021h()), j5r0.m143584t(n0r0.m161021h()));
                        jSONObject2.put("leak_threads_count", String.valueOf(jSONArrayM222065b.length()));
                        if (jSONArrayM222065b.length() > 0) {
                            r3r0.m179686l(j5r0.m143587w(n0r0.m161021h()), jSONArrayM222065b, false);
                        }
                    } catch (Throwable unused7) {
                    }
                    vuq0.m202884h(gsq0VarM147835a.m132125G(), vuq0.m202880d(jSONObject8.optString("mainStackFromTrace")), new C17284a(jCurrentTimeMillis));
                    m131845o(strM132689b);
                }
            } catch (Throwable th2) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", th2);
            }
        }
        return z5;
    }

    /* JADX INFO: renamed from: m */
    public void m131854m() {
        quq0 quq0Var = this.f106104a;
        if (quq0Var != null) {
            quq0Var.m178223b();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m131855s() {
        if (f106099D) {
            return;
        }
        synchronized (this.f106124u) {
            try {
                if (f106099D) {
                    return;
                }
                this.f106128y.run();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m131856t() {
        File fileM131850v = m131850v();
        try {
            int iIntValue = Integer.decode(r3r0.m179700z(fileM131850v.getAbsolutePath())).intValue();
            this.f106129z = iIntValue;
            if (iIntValue >= 2) {
                NativeImpl.m5182t(false);
            } else {
                NativeImpl.m5182t(true);
            }
        } catch (IOException unused) {
            NativeImpl.m5182t(true);
        } catch (Throwable unused2) {
            r3r0.m179692r(fileM131850v);
        }
    }
}
