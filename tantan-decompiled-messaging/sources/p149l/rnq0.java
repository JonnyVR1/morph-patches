package p149l;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.RankLevel;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import com.xiaomi.push.service.C14856b;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class rnq0 {

    /* JADX INFO: renamed from: a */
    protected static Context f160290a;

    /* JADX INFO: renamed from: a */
    private static InterfaceC19742c f160291a;

    /* JADX INFO: renamed from: a */
    private static rnq0 f160292a;

    /* JADX INFO: renamed from: c */
    private static String f160295c;

    /* JADX INFO: renamed from: d */
    private static String f160296d;

    /* JADX INFO: renamed from: a */
    private long f160297a;

    /* JADX INFO: renamed from: a */
    private String f160298a;

    /* JADX INFO: renamed from: a */
    protected final Map<String, nnq0> f160299a;

    /* JADX INFO: renamed from: a */
    private pnq0 f160300a;

    /* JADX INFO: renamed from: a */
    protected InterfaceC19743d f160301a;

    /* JADX INFO: renamed from: b */
    private final long f160302b;

    /* JADX INFO: renamed from: b */
    private String f160303b;

    /* JADX INFO: renamed from: c */
    private long f160304c;

    /* JADX INFO: renamed from: b */
    protected static final Map<String, mnq0> f160294b = new HashMap();

    /* JADX INFO: renamed from: a */
    protected static boolean f160293a = false;

    /* JADX INFO: renamed from: l.rnq0$a */
    public class C19740a implements pnq0 {
        public C19740a() {
        }

        @Override // p149l.pnq0
        /* JADX INFO: renamed from: a */
        public boolean mo170442a(String str) {
            return true;
        }
    }

    /* JADX INFO: renamed from: l.rnq0$b */
    public class C19741b extends mnq0 {

        /* JADX INFO: renamed from: o */
        mnq0 f160306o;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ mnq0 f160307p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19741b(String str, mnq0 mnq0Var) {
            super(str);
            this.f160307p = mnq0Var;
            this.f160306o = mnq0Var;
            this.f134774d = this.f134774d;
            if (mnq0Var != null) {
                this.f134778h = mnq0Var.f134778h;
            }
        }

        @Override // p149l.mnq0
        /* JADX INFO: renamed from: d */
        public synchronized ArrayList<String> mo155537d(boolean z) {
            ArrayList<String> arrayList;
            try {
                arrayList = new ArrayList<>();
                mnq0 mnq0Var = this.f160306o;
                if (mnq0Var != null) {
                    arrayList.addAll(mnq0Var.mo155537d(true));
                }
                Map<String, mnq0> map = rnq0.f160294b;
                synchronized (map) {
                    try {
                        mnq0 mnq0Var2 = map.get(this.f134774d);
                        if (mnq0Var2 != null) {
                            for (String str : mnq0Var2.mo155537d(true)) {
                                if (arrayList.indexOf(str) == -1) {
                                    arrayList.add(str);
                                }
                            }
                            arrayList.remove(this.f134774d);
                            arrayList.add(this.f134774d);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return arrayList;
        }

        @Override // p149l.mnq0
        /* JADX INFO: renamed from: m */
        public synchronized void mo155546m(String str, lnq0 lnq0Var) {
            mnq0 mnq0Var = this.f160306o;
            if (mnq0Var != null) {
                mnq0Var.mo155546m(str, lnq0Var);
            }
        }

        @Override // p149l.mnq0
        /* JADX INFO: renamed from: u */
        public boolean mo155554u() {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.rnq0$c */
    public interface InterfaceC19742c {
        /* JADX INFO: renamed from: a */
        rnq0 mo86538a(Context context, pnq0 pnq0Var, InterfaceC19743d interfaceC19743d, String str);
    }

    /* JADX INFO: renamed from: l.rnq0$d */
    public interface InterfaceC19743d {
        /* JADX INFO: renamed from: a */
        String mo86540a(String str);
    }

    public rnq0(Context context, pnq0 pnq0Var, InterfaceC19743d interfaceC19743d, String str, String str2, String str3) {
        this.f160299a = new HashMap();
        this.f160298a = "0";
        this.f160297a = 0L;
        this.f160302b = 15L;
        this.f160304c = 0L;
        this.f160303b = "isp_prov_city_country_ip";
        this.f160301a = interfaceC19743d;
        if (pnq0Var == null) {
            this.f160300a = new C19740a();
        } else {
            this.f160300a = pnq0Var;
        }
        this.f160298a = str;
        f160295c = str2 == null ? context.getPackageName() : str2;
        f160296d = str3 == null ? m180132g() : str3;
    }

    /* JADX INFO: renamed from: a */
    private ArrayList<mnq0> m180125a(ArrayList<String> arrayList) {
        JSONObject jSONObject;
        m180152e();
        synchronized (this.f160299a) {
            try {
                m180139a();
                for (String str : this.f160299a.keySet()) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Map<String, mnq0> map = f160294b;
        synchronized (map) {
            try {
                for (Object obj : map.values().toArray()) {
                    mnq0 mnq0Var = (mnq0) obj;
                    if (!mnq0Var.mo155554u()) {
                        f160294b.remove(mnq0Var.f134774d);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!arrayList.contains(m180140b())) {
            arrayList.add(m180140b());
        }
        ArrayList<mnq0> arrayList2 = new ArrayList<>(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(null);
        }
        try {
            String str2 = gkq0.m126695x(f160290a) ? "wifi" : "wap";
            String strMo86541a = mo86541a(arrayList, str2, this.f160298a, true);
            if (!TextUtils.isEmpty(strMo86541a)) {
                JSONObject jSONObject2 = new JSONObject(strMo86541a);
                ilq0.m137050w(strMo86541a);
                if ("OK".equalsIgnoreCase(jSONObject2.getString(j6f.LATITUDE_SOUTH))) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("R");
                    String string = jSONObject3.getString(RankLevel.province);
                    String string2 = jSONObject3.getString(RankLevel.city);
                    String string3 = jSONObject3.getString("isp");
                    String string4 = jSONObject3.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                    String string5 = jSONObject3.getString("country");
                    JSONObject jSONObject4 = jSONObject3.getJSONObject(str2);
                    ilq0.m137053z("get bucket: net=" + string3 + ", hosts=" + jSONObject4.toString());
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        String str3 = arrayList.get(i2);
                        JSONArray jSONArrayOptJSONArray = jSONObject4.optJSONArray(str3);
                        if (jSONArrayOptJSONArray == null) {
                            ilq0.m137040m("no bucket found for " + str3);
                            jSONObject = jSONObject4;
                        } else {
                            mnq0 mnq0Var2 = new mnq0(str3);
                            int i3 = 0;
                            while (i3 < jSONArrayOptJSONArray.length()) {
                                String string6 = jSONArrayOptJSONArray.getString(i3);
                                if (!TextUtils.isEmpty(string6)) {
                                    mnq0Var2.m155547n(new unq0(string6, jSONArrayOptJSONArray.length() - i3));
                                }
                                i3++;
                                jSONObject4 = jSONObject4;
                            }
                            jSONObject = jSONObject4;
                            arrayList2.set(i2, mnq0Var2);
                            mnq0Var2.f134779i = string5;
                            mnq0Var2.f134775e = string;
                            mnq0Var2.f134777g = string3;
                            mnq0Var2.f134778h = string4;
                            mnq0Var2.f134776f = string2;
                            if (jSONObject3.has("stat-percent")) {
                                mnq0Var2.m155540g(jSONObject3.getDouble("stat-percent"));
                            }
                            if (jSONObject3.has("stat-domain")) {
                                mnq0Var2.m155551r(jSONObject3.getString("stat-domain"));
                            }
                            if (jSONObject3.has("ttl")) {
                                mnq0Var2.m155541h(((long) jSONObject3.getInt("ttl")) * 1000);
                            }
                            m180137a(mnq0Var2.m155534a());
                        }
                        i2++;
                        jSONObject4 = jSONObject;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("reserved");
                    if (jSONObjectOptJSONObject != null) {
                        long j = jSONObject3.has("reserved-ttl") ? ((long) jSONObject3.getInt("reserved-ttl")) * 1000 : 604800000L;
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(next);
                            if (jSONArrayOptJSONArray2 == null) {
                                ilq0.m137040m("no bucket found for " + next);
                            } else {
                                mnq0 mnq0Var3 = new mnq0(next);
                                mnq0Var3.m155541h(j);
                                for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                                    String string7 = jSONArrayOptJSONArray2.getString(i4);
                                    if (!TextUtils.isEmpty(string7)) {
                                        mnq0Var3.m155547n(new unq0(string7, jSONArrayOptJSONArray2.length() - i4));
                                    }
                                }
                                Map<String, mnq0> map2 = f160294b;
                                synchronized (map2) {
                                    try {
                                        if (this.f160300a.mo170442a(next)) {
                                            map2.put(next, mnq0Var3);
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            ilq0.m137040m("failed to get bucket " + e.getMessage());
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            mnq0 mnq0Var4 = arrayList2.get(i5);
            if (mnq0Var4 != null) {
                m180138a(arrayList.get(i5), mnq0Var4);
            }
        }
        m180146c();
        return arrayList2;
    }

    /* JADX INFO: renamed from: f */
    private String m180131f() {
        return "host_fallbacks";
    }

    /* JADX INFO: renamed from: g */
    private String m180132g() {
        try {
            PackageInfo packageInfo = f160290a.getPackageManager().getPackageInfo(f160290a.getPackageName(), 16384);
            return packageInfo != null ? packageInfo.versionName : "0";
        } catch (Exception unused) {
            return "0";
        }
    }

    /* JADX INFO: renamed from: b */
    public void m180143b(String str) {
        synchronized (this.f160299a) {
            try {
                this.f160299a.clear();
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt("ver") != 2) {
                    throw new JSONException("Bad version");
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        nnq0 nnq0VarM160361d = new nnq0().m160361d(jSONArrayOptJSONArray.getJSONObject(i));
                        this.f160299a.put(nnq0VarM160361d.m160358a(), nnq0VarM160361d);
                    }
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("reserved");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i2);
                        String strOptString = jSONObject2.optString("host");
                        if (!TextUtils.isEmpty(strOptString)) {
                            try {
                                mnq0 mnq0VarM155538e = new mnq0(strOptString).m155538e(jSONObject2);
                                f160294b.put(mnq0VarM155538e.f134774d, mnq0VarM155538e);
                                ilq0.m137040m("load local reserved host for " + mnq0VarM155538e.f134774d);
                            } catch (JSONException unused) {
                                ilq0.m137040m("parse reserved host fail.");
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX INFO: renamed from: c */
    public void m180146c() {
        ?? OpenFileOutput = "persist host fallbacks = ";
        synchronized (this.f160299a) {
            BufferedOutputStream bufferedOutputStream = null;
            try {
                try {
                    try {
                        String string = m180135a().toString();
                        ilq0.m137050w("persist host fallbacks = " + string);
                        if (TextUtils.isEmpty(string)) {
                            OpenFileOutput = 0;
                        } else {
                            OpenFileOutput = f160290a.openFileOutput(m180131f(), 0);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(OpenFileOutput);
                                try {
                                    bufferedOutputStream2.write(auq0.m99036c(m180130a(), string.getBytes(StandardCharsets.UTF_8)));
                                    bufferedOutputStream2.flush();
                                    bufferedOutputStream = bufferedOutputStream2;
                                    OpenFileOutput = OpenFileOutput;
                                } catch (Exception e) {
                                    e = e;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    ilq0.m137040m("persist bucket failure: " + e.getMessage());
                                    OpenFileOutput = OpenFileOutput;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    dxq0.m114018b(bufferedOutputStream);
                                    dxq0.m114018b(OpenFileOutput);
                                    throw th;
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    OpenFileOutput = 0;
                } catch (Throwable th3) {
                    th = th3;
                    OpenFileOutput = 0;
                }
                dxq0.m114018b(bufferedOutputStream);
                dxq0.m114018b(OpenFileOutput);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public String m180147d() {
        BufferedInputStream bufferedInputStream;
        FileInputStream fileInputStream;
        try {
            File file = new File(f160290a.getFilesDir(), m180131f());
            try {
                if (!file.isFile()) {
                    dxq0.m114018b(null);
                    dxq0.m114018b(null);
                    return null;
                }
                fileInputStream = new FileInputStream(file);
                try {
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                    try {
                        String str = new String(auq0.m99035b(m180130a(), dxq0.m114023g(bufferedInputStream)), StandardCharsets.UTF_8);
                        ilq0.m137050w("load host fallbacks = ".concat(str));
                        dxq0.m114018b(bufferedInputStream);
                        dxq0.m114018b(fileInputStream);
                        return str;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = null;
                }
                ilq0.m137040m("load host exception " + th.getMessage());
                return null;
            } finally {
                dxq0.m114018b(bufferedInputStream);
                dxq0.m114018b(fileInputStream);
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
            fileInputStream = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m180152e() {
        String next;
        synchronized (this.f160299a) {
            try {
                Iterator<nnq0> it = this.f160299a.values().iterator();
                while (it.hasNext()) {
                    it.next().m160364g(true);
                }
                while (true) {
                    Iterator<String> it2 = this.f160299a.keySet().iterator();
                    do {
                        if (it2.hasNext()) {
                            next = it2.next();
                        }
                    } while (!this.f160299a.get(next).m160359b().isEmpty());
                    this.f160299a.remove(next);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public rnq0(Context context, pnq0 pnq0Var, InterfaceC19743d interfaceC19743d, String str) {
        this(context, pnq0Var, interfaceC19743d, str, null, null);
    }

    /* JADX INFO: renamed from: e */
    public String m180150e() {
        if ("com.xiaomi.xmsf".equals(f160295c)) {
            return f160295c;
        }
        return f160295c + ":pushservice";
    }

    /* JADX INFO: renamed from: e */
    public mnq0 m180151e(String str) {
        if (System.currentTimeMillis() - this.f160304c <= this.f160297a * Constants.ONE_MIN_IN_MILLIS) {
            return null;
        }
        this.f160304c = System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        mnq0 mnq0Var = m180125a(arrayList).get(0);
        if (mnq0Var != null) {
            this.f160297a = 0L;
            return mnq0Var;
        }
        long j = this.f160297a;
        if (j >= 15) {
            return null;
        }
        this.f160297a = j + 1;
        return null;
    }

    /* JADX INFO: renamed from: d */
    public mnq0 m180148d(String str) {
        mnq0 mnq0Var;
        Map<String, mnq0> map = f160294b;
        synchronized (map) {
            mnq0Var = map.get(str);
        }
        return mnq0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m180149d() {
        String strM180150e = m180150e();
        try {
            File file = new File(f160290a.getFilesDir(), strM180150e);
            if (file.exists()) {
                boolean zDelete = file.delete();
                StringBuilder sb = new StringBuilder("Delete old host fallbacks file ");
                sb.append(strM180150e);
                sb.append(zDelete ? " successful." : " failed.");
                ilq0.m137040m(sb.toString());
                return;
            }
            ilq0.m137050w("Old host fallbacks file " + strM180150e + " does not exist.");
        } catch (Exception e) {
            ilq0.m137040m("Delete old host fallbacks file " + strM180150e + " error: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public String m180144c() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.f160299a) {
            try {
                for (Map.Entry<String, nnq0> entry : this.f160299a.entrySet()) {
                    sb.append(entry.getKey());
                    sb.append(":\n");
                    sb.append(entry.getValue().toString());
                    sb.append(SignParameters.NEW_LINE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public mnq0 m180145c(String str) {
        nnq0 nnq0Var;
        mnq0 mnq0VarM160360c;
        synchronized (this.f160299a) {
            m180139a();
            nnq0Var = this.f160299a.get(str);
        }
        if (nnq0Var == null || (mnq0VarM160360c = nnq0Var.m160360c()) == null) {
            return null;
        }
        return mnq0VarM160360c;
    }

    /* JADX INFO: renamed from: b */
    public String m180140b() {
        return "resolver.msg.xiaomi.net";
    }

    /* JADX INFO: renamed from: b */
    public void m180142b() {
        ArrayList<String> arrayList;
        synchronized (this.f160299a) {
            try {
                m180139a();
                arrayList = new ArrayList<>(this.f160299a.keySet());
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    nnq0 nnq0Var = this.f160299a.get(arrayList.get(size));
                    if (nnq0Var != null && nnq0Var.m160360c() != null) {
                        arrayList.remove(size);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList<mnq0> arrayListM180125a = m180125a(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayListM180125a.get(i) != null) {
                m180138a(arrayList.get(i), arrayListM180125a.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public mnq0 m180141b(String str) {
        return m180134a(str, true);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m180129a(InterfaceC19742c interfaceC19742c) {
        f160291a = interfaceC19742c;
        f160292a = null;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m180127a(Context context, pnq0 pnq0Var, InterfaceC19743d interfaceC19743d, String str, String str2, String str3) {
        try {
            Context applicationContext = context.getApplicationContext();
            f160290a = applicationContext;
            if (applicationContext == null) {
                f160290a = context;
            }
            if (f160292a == null) {
                InterfaceC19742c interfaceC19742c = f160291a;
                if (interfaceC19742c == null) {
                    f160292a = new rnq0(context, pnq0Var, interfaceC19743d, str, str2, str3);
                } else {
                    f160292a = interfaceC19742c.mo86538a(context, pnq0Var, interfaceC19743d, str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m180123a() {
        if (f160290a == null) {
            return "unknown";
        }
        try {
            hkq0 hkq0VarM126687p = gkq0.m126687p();
            if (hkq0VarM126687p == null) {
                return "unknown";
            }
            if (hkq0VarM126687p.m131578a() == 1) {
                return "WIFI-UNKNOWN";
            }
            return hkq0VarM126687p.m131581e() + "-" + hkq0VarM126687p.m131584h();
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* JADX INFO: renamed from: a */
    public mnq0 m180133a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return m180134a(new URL(str).getHost(), true);
        }
        ig3.m135964a("the url is empty");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public mnq0 m180134a(String str, boolean z) {
        mnq0 mnq0VarM180151e;
        ilq0.m137052y("HostManager", "-->getFallbacksByHost(): host=", str, ", fetchRemoteIfNeed=", Boolean.valueOf(z));
        if (!TextUtils.isEmpty(str)) {
            if (!this.f160300a.mo170442a(str)) {
                return null;
            }
            mnq0 mnq0VarM180145c = m180145c(str);
            if (mnq0VarM180145c == null || !mnq0VarM180145c.mo155554u()) {
                return (z && gkq0.m126691t(f160290a) && (mnq0VarM180151e = m180151e(str)) != null) ? mnq0VarM180151e : new C19741b(str, mnq0VarM180145c);
            }
            return mnq0VarM180145c;
        }
        ig3.m135964a("the host is empty");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized rnq0 m180126a() {
        rnq0 rnq0Var;
        rnq0Var = f160292a;
        if (rnq0Var == null) {
            throw new IllegalStateException("the host manager is not initialized yet.");
        }
        return rnq0Var;
    }

    /* JADX INFO: renamed from: a */
    public String mo86541a(ArrayList<String> arrayList, String str, String str2, boolean z) throws IOException {
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<fkq0> arrayList3 = new ArrayList();
        arrayList3.add(new dkq0("type", str));
        if (str.equals("wap")) {
            arrayList3.add(new dkq0("conpt", m180124a(gkq0.m126676e(f160290a))));
        }
        if (z) {
            arrayList3.add(new dkq0("reserved", "1"));
        }
        arrayList3.add(new dkq0("uuid", str2));
        arrayList3.add(new dkq0("list", vlq0.m198841d(arrayList, Constants.SEPARATOR_COMMA)));
        arrayList3.add(new dkq0("countrycode", C14856b.m86604a(f160290a).m86609b()));
        arrayList3.add(new dkq0("push_sdk_vc", String.valueOf(50909)));
        String strM180140b = m180140b();
        mnq0 mnq0VarM180145c = m180145c(strM180140b);
        String str3 = String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", strM180140b);
        if (mnq0VarM180145c == null) {
            arrayList2.add(str3);
            Map<String, mnq0> map = f160294b;
            synchronized (map) {
                try {
                    mnq0 mnq0Var = map.get(strM180140b);
                    if (mnq0Var != null) {
                        Iterator<String> it = mnq0Var.mo155537d(true).iterator();
                        while (it.hasNext()) {
                            arrayList2.add(String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", it.next()));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            arrayList2 = mnq0VarM180145c.m155536c(str3);
        }
        Iterator<String> it2 = arrayList2.iterator();
        IOException e = null;
        while (it2.hasNext()) {
            Uri.Builder builderBuildUpon = Uri.parse(it2.next()).buildUpon();
            for (fkq0 fkq0Var : arrayList3) {
                builderBuildUpon.appendQueryParameter(fkq0Var.mo112271a(), fkq0Var.mo112272b());
            }
            try {
                InterfaceC19743d interfaceC19743d = this.f160301a;
                if (interfaceC19743d == null) {
                    return gkq0.m126677f(f160290a, new URL(builderBuildUpon.toString()));
                }
                return interfaceC19743d.mo86540a(builderBuildUpon.toString());
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        ilq0.m137040m("network exception: " + e.getMessage());
        throw e;
    }

    /* JADX INFO: renamed from: a */
    public void m180136a() {
        synchronized (this.f160299a) {
            this.f160299a.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m180138a(String str, mnq0 mnq0Var) {
        if (!TextUtils.isEmpty(str) && mnq0Var != null) {
            if (this.f160300a.mo170442a(str)) {
                synchronized (this.f160299a) {
                    try {
                        m180139a();
                        if (this.f160299a.containsKey(str)) {
                            this.f160299a.get(str).m160363f(mnq0Var);
                        } else {
                            nnq0 nnq0Var = new nnq0(str);
                            nnq0Var.m160363f(mnq0Var);
                            this.f160299a.put(str, nnq0Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        qnq0.m175688a("the argument is invalid ", str, ", ", mnq0Var);
    }

    /* JADX INFO: renamed from: a */
    public boolean m180139a() {
        synchronized (this.f160299a) {
            try {
                if (f160293a) {
                    return true;
                }
                f160293a = true;
                this.f160299a.clear();
                try {
                    String strM180147d = m180147d();
                    if (!TextUtils.isEmpty(strM180147d)) {
                        m180143b(strM180147d);
                        ilq0.m137050w("loading the new hosts succeed");
                        return true;
                    }
                } catch (Throwable th) {
                    ilq0.m137040m("load bucket failure: " + th.getMessage());
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m180128a(String str, String str2) {
        Map<String, mnq0> map = f160294b;
        mnq0 mnq0Var = map.get(str);
        synchronized (map) {
            try {
                if (mnq0Var == null) {
                    mnq0 mnq0Var2 = new mnq0(str);
                    mnq0Var2.m155541h(604800000L);
                    mnq0Var2.m155542i(str2);
                    map.put(str, mnq0Var2);
                } else {
                    mnq0Var.m155542i(str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private byte[] m180130a() {
        return tlq0.m189624c(f160290a.getPackageName() + "_key_salt");
    }

    /* JADX INFO: renamed from: a */
    public static String m180124a(String str) {
        try {
            int length = str.length();
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                byte b = bytes[i];
                int i2 = b & 240;
                if (i2 != 240) {
                    bytes[i] = (byte) (((b & 15) ^ ((byte) (((b >> 4) + length) & 15))) | i2);
                }
            }
            return new String(bytes);
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m180137a(String str) {
        this.f160303b = str;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m180135a() {
        JSONObject jSONObject;
        synchronized (this.f160299a) {
            try {
                jSONObject = new JSONObject();
                jSONObject.put("ver", 2);
                JSONArray jSONArray = new JSONArray();
                Iterator<nnq0> it = this.f160299a.values().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().m160362e());
                }
                jSONObject.put("data", jSONArray);
                JSONArray jSONArray2 = new JSONArray();
                Iterator<mnq0> it2 = f160294b.values().iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next().m155539f());
                }
                jSONObject.put("reserved", jSONArray2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject;
    }
}
