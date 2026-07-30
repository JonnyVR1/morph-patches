package p153l;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.RankLevel;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import com.xiaomi.push.service.C15004b;
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
public class xwq0 {

    /* JADX INFO: renamed from: a */
    protected static Context f196521a;

    /* JADX INFO: renamed from: a */
    private static InterfaceC21466c f196522a;

    /* JADX INFO: renamed from: a */
    private static xwq0 f196523a;

    /* JADX INFO: renamed from: c */
    private static String f196526c;

    /* JADX INFO: renamed from: d */
    private static String f196527d;

    /* JADX INFO: renamed from: a */
    private long f196528a;

    /* JADX INFO: renamed from: a */
    private String f196529a;

    /* JADX INFO: renamed from: a */
    protected final Map<String, twq0> f196530a;

    /* JADX INFO: renamed from: a */
    private vwq0 f196531a;

    /* JADX INFO: renamed from: a */
    protected InterfaceC21467d f196532a;

    /* JADX INFO: renamed from: b */
    private final long f196533b;

    /* JADX INFO: renamed from: b */
    private String f196534b;

    /* JADX INFO: renamed from: c */
    private long f196535c;

    /* JADX INFO: renamed from: b */
    protected static final Map<String, swq0> f196525b = new HashMap();

    /* JADX INFO: renamed from: a */
    protected static boolean f196524a = false;

    /* JADX INFO: renamed from: l.xwq0$a */
    public class C21464a implements vwq0 {
        public C21464a() {
        }

        @Override // p153l.vwq0
        /* JADX INFO: renamed from: a */
        public boolean mo203171a(String str) {
            return true;
        }
    }

    /* JADX INFO: renamed from: l.xwq0$b */
    public class C21465b extends swq0 {

        /* JADX INFO: renamed from: o */
        swq0 f196537o;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ swq0 f196538p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21465b(String str, swq0 swq0Var) {
            super(str);
            this.f196538p = swq0Var;
            this.f196537o = swq0Var;
            this.f170990d = this.f170990d;
            if (swq0Var != null) {
                this.f170994h = swq0Var.f170994h;
            }
        }

        @Override // p153l.swq0
        /* JADX INFO: renamed from: d */
        public synchronized ArrayList<String> mo188337d(boolean z) {
            ArrayList<String> arrayList;
            try {
                arrayList = new ArrayList<>();
                swq0 swq0Var = this.f196537o;
                if (swq0Var != null) {
                    arrayList.addAll(swq0Var.mo188337d(true));
                }
                Map<String, swq0> map = xwq0.f196525b;
                synchronized (map) {
                    try {
                        swq0 swq0Var2 = map.get(this.f170990d);
                        if (swq0Var2 != null) {
                            for (String str : swq0Var2.mo188337d(true)) {
                                if (arrayList.indexOf(str) == -1) {
                                    arrayList.add(str);
                                }
                            }
                            arrayList.remove(this.f170990d);
                            arrayList.add(this.f170990d);
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

        @Override // p153l.swq0
        /* JADX INFO: renamed from: m */
        public synchronized void mo188346m(String str, rwq0 rwq0Var) {
            swq0 swq0Var = this.f196537o;
            if (swq0Var != null) {
                swq0Var.mo188346m(str, rwq0Var);
            }
        }

        @Override // p153l.swq0
        /* JADX INFO: renamed from: u */
        public boolean mo188354u() {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.xwq0$c */
    public interface InterfaceC21466c {
        /* JADX INFO: renamed from: a */
        xwq0 mo87709a(Context context, vwq0 vwq0Var, InterfaceC21467d interfaceC21467d, String str);
    }

    /* JADX INFO: renamed from: l.xwq0$d */
    public interface InterfaceC21467d {
        /* JADX INFO: renamed from: a */
        String mo87711a(String str);
    }

    public xwq0(Context context, vwq0 vwq0Var, InterfaceC21467d interfaceC21467d, String str, String str2, String str3) {
        this.f196530a = new HashMap();
        this.f196529a = "0";
        this.f196528a = 0L;
        this.f196533b = 15L;
        this.f196535c = 0L;
        this.f196534b = "isp_prov_city_country_ip";
        this.f196532a = interfaceC21467d;
        if (vwq0Var == null) {
            this.f196531a = new C21464a();
        } else {
            this.f196531a = vwq0Var;
        }
        this.f196529a = str;
        f196526c = str2 == null ? context.getPackageName() : str2;
        f196527d = str3 == null ? m213401g() : str3;
    }

    /* JADX INFO: renamed from: a */
    private ArrayList<swq0> m213394a(ArrayList<String> arrayList) {
        JSONObject jSONObject;
        m213421e();
        synchronized (this.f196530a) {
            try {
                m213408a();
                for (String str : this.f196530a.keySet()) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Map<String, swq0> map = f196525b;
        synchronized (map) {
            try {
                for (Object obj : map.values().toArray()) {
                    swq0 swq0Var = (swq0) obj;
                    if (!swq0Var.mo188354u()) {
                        f196525b.remove(swq0Var.f170990d);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!arrayList.contains(m213409b())) {
            arrayList.add(m213409b());
        }
        ArrayList<swq0> arrayList2 = new ArrayList<>(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(null);
        }
        try {
            String str2 = mtq0.m160048x(f196521a) ? "wifi" : "wap";
            String strMo87712a = mo87712a(arrayList, str2, this.f196529a, true);
            if (!TextUtils.isEmpty(strMo87712a)) {
                JSONObject jSONObject2 = new JSONObject(strMo87712a);
                ouq0.m169403w(strMo87712a);
                if ("OK".equalsIgnoreCase(jSONObject2.getString(p7f.LATITUDE_SOUTH))) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("R");
                    String string = jSONObject3.getString(RankLevel.province);
                    String string2 = jSONObject3.getString(RankLevel.city);
                    String string3 = jSONObject3.getString("isp");
                    String string4 = jSONObject3.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                    String string5 = jSONObject3.getString("country");
                    JSONObject jSONObject4 = jSONObject3.getJSONObject(str2);
                    ouq0.m169406z("get bucket: net=" + string3 + ", hosts=" + jSONObject4.toString());
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        String str3 = arrayList.get(i2);
                        JSONArray jSONArrayOptJSONArray = jSONObject4.optJSONArray(str3);
                        if (jSONArrayOptJSONArray == null) {
                            ouq0.m169393m("no bucket found for " + str3);
                            jSONObject = jSONObject4;
                        } else {
                            swq0 swq0Var2 = new swq0(str3);
                            int i3 = 0;
                            while (i3 < jSONArrayOptJSONArray.length()) {
                                String string6 = jSONArrayOptJSONArray.getString(i3);
                                if (!TextUtils.isEmpty(string6)) {
                                    swq0Var2.m188347n(new axq0(string6, jSONArrayOptJSONArray.length() - i3));
                                }
                                i3++;
                                jSONObject4 = jSONObject4;
                            }
                            jSONObject = jSONObject4;
                            arrayList2.set(i2, swq0Var2);
                            swq0Var2.f170995i = string5;
                            swq0Var2.f170991e = string;
                            swq0Var2.f170993g = string3;
                            swq0Var2.f170994h = string4;
                            swq0Var2.f170992f = string2;
                            if (jSONObject3.has("stat-percent")) {
                                swq0Var2.m188340g(jSONObject3.getDouble("stat-percent"));
                            }
                            if (jSONObject3.has("stat-domain")) {
                                swq0Var2.m188351r(jSONObject3.getString("stat-domain"));
                            }
                            if (jSONObject3.has("ttl")) {
                                swq0Var2.m188341h(((long) jSONObject3.getInt("ttl")) * 1000);
                            }
                            m213406a(swq0Var2.m188334a());
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
                                ouq0.m169393m("no bucket found for " + next);
                            } else {
                                swq0 swq0Var3 = new swq0(next);
                                swq0Var3.m188341h(j);
                                for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                                    String string7 = jSONArrayOptJSONArray2.getString(i4);
                                    if (!TextUtils.isEmpty(string7)) {
                                        swq0Var3.m188347n(new axq0(string7, jSONArrayOptJSONArray2.length() - i4));
                                    }
                                }
                                Map<String, swq0> map2 = f196525b;
                                synchronized (map2) {
                                    try {
                                        if (this.f196531a.mo203171a(next)) {
                                            map2.put(next, swq0Var3);
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
            ouq0.m169393m("failed to get bucket " + e.getMessage());
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            swq0 swq0Var4 = arrayList2.get(i5);
            if (swq0Var4 != null) {
                m213407a(arrayList.get(i5), swq0Var4);
            }
        }
        m213415c();
        return arrayList2;
    }

    /* JADX INFO: renamed from: f */
    private String m213400f() {
        return "host_fallbacks";
    }

    /* JADX INFO: renamed from: g */
    private String m213401g() {
        try {
            PackageInfo packageInfo = f196521a.getPackageManager().getPackageInfo(f196521a.getPackageName(), 16384);
            return packageInfo != null ? packageInfo.versionName : "0";
        } catch (Exception unused) {
            return "0";
        }
    }

    /* JADX INFO: renamed from: b */
    public void m213412b(String str) {
        synchronized (this.f196530a) {
            try {
                this.f196530a.clear();
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt("ver") != 2) {
                    throw new JSONException("Bad version");
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        twq0 twq0VarM193362d = new twq0().m193362d(jSONArrayOptJSONArray.getJSONObject(i));
                        this.f196530a.put(twq0VarM193362d.m193359a(), twq0VarM193362d);
                    }
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("reserved");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i2);
                        String strOptString = jSONObject2.optString("host");
                        if (!TextUtils.isEmpty(strOptString)) {
                            try {
                                swq0 swq0VarM188338e = new swq0(strOptString).m188338e(jSONObject2);
                                f196525b.put(swq0VarM188338e.f170990d, swq0VarM188338e);
                                ouq0.m169393m("load local reserved host for " + swq0VarM188338e.f170990d);
                            } catch (JSONException unused) {
                                ouq0.m169393m("parse reserved host fail.");
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
    public void m213415c() {
        ?? OpenFileOutput = "persist host fallbacks = ";
        synchronized (this.f196530a) {
            BufferedOutputStream bufferedOutputStream = null;
            try {
                try {
                    try {
                        String string = m213404a().toString();
                        ouq0.m169403w("persist host fallbacks = " + string);
                        if (TextUtils.isEmpty(string)) {
                            OpenFileOutput = 0;
                        } else {
                            OpenFileOutput = f196521a.openFileOutput(m213400f(), 0);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(OpenFileOutput);
                                try {
                                    bufferedOutputStream2.write(g3r0.m128758c(m213399a(), string.getBytes(StandardCharsets.UTF_8)));
                                    bufferedOutputStream2.flush();
                                    bufferedOutputStream = bufferedOutputStream2;
                                    OpenFileOutput = OpenFileOutput;
                                } catch (Exception e) {
                                    e = e;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    ouq0.m169393m("persist bucket failure: " + e.getMessage());
                                    OpenFileOutput = OpenFileOutput;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    j6r0.m143691b(bufferedOutputStream);
                                    j6r0.m143691b(OpenFileOutput);
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
                j6r0.m143691b(bufferedOutputStream);
                j6r0.m143691b(OpenFileOutput);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public String m213416d() {
        BufferedInputStream bufferedInputStream;
        FileInputStream fileInputStream;
        try {
            File file = new File(f196521a.getFilesDir(), m213400f());
            try {
                if (!file.isFile()) {
                    j6r0.m143691b(null);
                    j6r0.m143691b(null);
                    return null;
                }
                fileInputStream = new FileInputStream(file);
                try {
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                    try {
                        String str = new String(g3r0.m128757b(m213399a(), j6r0.m143696g(bufferedInputStream)), StandardCharsets.UTF_8);
                        ouq0.m169403w("load host fallbacks = ".concat(str));
                        j6r0.m143691b(bufferedInputStream);
                        j6r0.m143691b(fileInputStream);
                        return str;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = null;
                }
                ouq0.m169393m("load host exception " + th.getMessage());
                return null;
            } finally {
                j6r0.m143691b(bufferedInputStream);
                j6r0.m143691b(fileInputStream);
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
            fileInputStream = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m213421e() {
        String next;
        synchronized (this.f196530a) {
            try {
                Iterator<twq0> it = this.f196530a.values().iterator();
                while (it.hasNext()) {
                    it.next().m193365g(true);
                }
                while (true) {
                    Iterator<String> it2 = this.f196530a.keySet().iterator();
                    do {
                        if (it2.hasNext()) {
                            next = it2.next();
                        }
                    } while (!this.f196530a.get(next).m193360b().isEmpty());
                    this.f196530a.remove(next);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public xwq0(Context context, vwq0 vwq0Var, InterfaceC21467d interfaceC21467d, String str) {
        this(context, vwq0Var, interfaceC21467d, str, null, null);
    }

    /* JADX INFO: renamed from: e */
    public String m213419e() {
        if ("com.xiaomi.xmsf".equals(f196526c)) {
            return f196526c;
        }
        return f196526c + ":pushservice";
    }

    /* JADX INFO: renamed from: e */
    public swq0 m213420e(String str) {
        if (System.currentTimeMillis() - this.f196535c <= this.f196528a * Constants.ONE_MIN_IN_MILLIS) {
            return null;
        }
        this.f196535c = System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        swq0 swq0Var = m213394a(arrayList).get(0);
        if (swq0Var != null) {
            this.f196528a = 0L;
            return swq0Var;
        }
        long j = this.f196528a;
        if (j >= 15) {
            return null;
        }
        this.f196528a = j + 1;
        return null;
    }

    /* JADX INFO: renamed from: d */
    public swq0 m213417d(String str) {
        swq0 swq0Var;
        Map<String, swq0> map = f196525b;
        synchronized (map) {
            swq0Var = map.get(str);
        }
        return swq0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m213418d() {
        String strM213419e = m213419e();
        try {
            File file = new File(f196521a.getFilesDir(), strM213419e);
            if (file.exists()) {
                boolean zDelete = file.delete();
                StringBuilder sb = new StringBuilder("Delete old host fallbacks file ");
                sb.append(strM213419e);
                sb.append(zDelete ? " successful." : " failed.");
                ouq0.m169393m(sb.toString());
                return;
            }
            ouq0.m169403w("Old host fallbacks file " + strM213419e + " does not exist.");
        } catch (Exception e) {
            ouq0.m169393m("Delete old host fallbacks file " + strM213419e + " error: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public String m213413c() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.f196530a) {
            try {
                for (Map.Entry<String, twq0> entry : this.f196530a.entrySet()) {
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
    public swq0 m213414c(String str) {
        twq0 twq0Var;
        swq0 swq0VarM193361c;
        synchronized (this.f196530a) {
            m213408a();
            twq0Var = this.f196530a.get(str);
        }
        if (twq0Var == null || (swq0VarM193361c = twq0Var.m193361c()) == null) {
            return null;
        }
        return swq0VarM193361c;
    }

    /* JADX INFO: renamed from: b */
    public String m213409b() {
        return "resolver.msg.xiaomi.net";
    }

    /* JADX INFO: renamed from: b */
    public void m213411b() {
        ArrayList<String> arrayList;
        synchronized (this.f196530a) {
            try {
                m213408a();
                arrayList = new ArrayList<>(this.f196530a.keySet());
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    twq0 twq0Var = this.f196530a.get(arrayList.get(size));
                    if (twq0Var != null && twq0Var.m193361c() != null) {
                        arrayList.remove(size);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList<swq0> arrayListM213394a = m213394a(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayListM213394a.get(i) != null) {
                m213407a(arrayList.get(i), arrayListM213394a.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public swq0 m213410b(String str) {
        return m213403a(str, true);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m213398a(InterfaceC21466c interfaceC21466c) {
        f196522a = interfaceC21466c;
        f196523a = null;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m213396a(Context context, vwq0 vwq0Var, InterfaceC21467d interfaceC21467d, String str, String str2, String str3) {
        try {
            Context applicationContext = context.getApplicationContext();
            f196521a = applicationContext;
            if (applicationContext == null) {
                f196521a = context;
            }
            if (f196523a == null) {
                InterfaceC21466c interfaceC21466c = f196522a;
                if (interfaceC21466c == null) {
                    f196523a = new xwq0(context, vwq0Var, interfaceC21467d, str, str2, str3);
                } else {
                    f196523a = interfaceC21466c.mo87709a(context, vwq0Var, interfaceC21467d, str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m213392a() {
        if (f196521a == null) {
            return "unknown";
        }
        try {
            ntq0 ntq0VarM160040p = mtq0.m160040p();
            if (ntq0VarM160040p == null) {
                return "unknown";
            }
            if (ntq0VarM160040p.m164750a() == 1) {
                return "WIFI-UNKNOWN";
            }
            return ntq0VarM160040p.m164753e() + "-" + ntq0VarM160040p.m164756h();
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* JADX INFO: renamed from: a */
    public swq0 m213402a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return m213403a(new URL(str).getHost(), true);
        }
        wg3.m206174a("the url is empty");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public swq0 m213403a(String str, boolean z) {
        swq0 swq0VarM213420e;
        ouq0.m169405y("HostManager", "-->getFallbacksByHost(): host=", str, ", fetchRemoteIfNeed=", Boolean.valueOf(z));
        if (!TextUtils.isEmpty(str)) {
            if (!this.f196531a.mo203171a(str)) {
                return null;
            }
            swq0 swq0VarM213414c = m213414c(str);
            if (swq0VarM213414c == null || !swq0VarM213414c.mo188354u()) {
                return (z && mtq0.m160044t(f196521a) && (swq0VarM213420e = m213420e(str)) != null) ? swq0VarM213420e : new C21465b(str, swq0VarM213414c);
            }
            return swq0VarM213414c;
        }
        wg3.m206174a("the host is empty");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized xwq0 m213395a() {
        xwq0 xwq0Var;
        xwq0Var = f196523a;
        if (xwq0Var == null) {
            throw new IllegalStateException("the host manager is not initialized yet.");
        }
        return xwq0Var;
    }

    /* JADX INFO: renamed from: a */
    public String mo87712a(ArrayList<String> arrayList, String str, String str2, boolean z) throws IOException {
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<ltq0> arrayList3 = new ArrayList();
        arrayList3.add(new jtq0("type", str));
        if (str.equals("wap")) {
            arrayList3.add(new jtq0("conpt", m213393a(mtq0.m160029e(f196521a))));
        }
        if (z) {
            arrayList3.add(new jtq0("reserved", "1"));
        }
        arrayList3.add(new jtq0("uuid", str2));
        arrayList3.add(new jtq0("list", bvq0.m106590d(arrayList, Constants.SEPARATOR_COMMA)));
        arrayList3.add(new jtq0("countrycode", C15004b.m87775a(f196521a).m87780b()));
        arrayList3.add(new jtq0("push_sdk_vc", String.valueOf(50909)));
        String strM213409b = m213409b();
        swq0 swq0VarM213414c = m213414c(strM213409b);
        String str3 = String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", strM213409b);
        if (swq0VarM213414c == null) {
            arrayList2.add(str3);
            Map<String, swq0> map = f196525b;
            synchronized (map) {
                try {
                    swq0 swq0Var = map.get(strM213409b);
                    if (swq0Var != null) {
                        Iterator<String> it = swq0Var.mo188337d(true).iterator();
                        while (it.hasNext()) {
                            arrayList2.add(String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", it.next()));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            arrayList2 = swq0VarM213414c.m188336c(str3);
        }
        Iterator<String> it2 = arrayList2.iterator();
        IOException e = null;
        while (it2.hasNext()) {
            Uri.Builder builderBuildUpon = Uri.parse(it2.next()).buildUpon();
            for (ltq0 ltq0Var : arrayList3) {
                builderBuildUpon.appendQueryParameter(ltq0Var.mo146917a(), ltq0Var.mo146918b());
            }
            try {
                InterfaceC21467d interfaceC21467d = this.f196532a;
                if (interfaceC21467d == null) {
                    return mtq0.m160030f(f196521a, new URL(builderBuildUpon.toString()));
                }
                return interfaceC21467d.mo87711a(builderBuildUpon.toString());
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        ouq0.m169393m("network exception: " + e.getMessage());
        throw e;
    }

    /* JADX INFO: renamed from: a */
    public void m213405a() {
        synchronized (this.f196530a) {
            this.f196530a.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m213407a(String str, swq0 swq0Var) {
        if (!TextUtils.isEmpty(str) && swq0Var != null) {
            if (this.f196531a.mo203171a(str)) {
                synchronized (this.f196530a) {
                    try {
                        m213408a();
                        if (this.f196530a.containsKey(str)) {
                            this.f196530a.get(str).m193364f(swq0Var);
                        } else {
                            twq0 twq0Var = new twq0(str);
                            twq0Var.m193364f(swq0Var);
                            this.f196530a.put(str, twq0Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        wwq0.m208289a("the argument is invalid ", str, ", ", swq0Var);
    }

    /* JADX INFO: renamed from: a */
    public boolean m213408a() {
        synchronized (this.f196530a) {
            try {
                if (f196524a) {
                    return true;
                }
                f196524a = true;
                this.f196530a.clear();
                try {
                    String strM213416d = m213416d();
                    if (!TextUtils.isEmpty(strM213416d)) {
                        m213412b(strM213416d);
                        ouq0.m169403w("loading the new hosts succeed");
                        return true;
                    }
                } catch (Throwable th) {
                    ouq0.m169393m("load bucket failure: " + th.getMessage());
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m213397a(String str, String str2) {
        Map<String, swq0> map = f196525b;
        swq0 swq0Var = map.get(str);
        synchronized (map) {
            try {
                if (swq0Var == null) {
                    swq0 swq0Var2 = new swq0(str);
                    swq0Var2.m188341h(604800000L);
                    swq0Var2.m188342i(str2);
                    map.put(str, swq0Var2);
                } else {
                    swq0Var.m188342i(str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private byte[] m213399a() {
        return zuq0.m221702c(f196521a.getPackageName() + "_key_salt");
    }

    /* JADX INFO: renamed from: a */
    public static String m213393a(String str) {
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
    public void m213406a(String str) {
        this.f196534b = str;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m213404a() {
        JSONObject jSONObject;
        synchronized (this.f196530a) {
            try {
                jSONObject = new JSONObject();
                jSONObject.put("ver", 2);
                JSONArray jSONArray = new JSONArray();
                Iterator<twq0> it = this.f196530a.values().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().m193363e());
                }
                jSONObject.put("data", jSONArray);
                JSONArray jSONArray2 = new JSONArray();
                Iterator<swq0> it2 = f196525b.values().iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next().m188339f());
                }
                jSONObject.put("reserved", jSONArray2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject;
    }
}
