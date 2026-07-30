package p153l;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.apm.lite.CrashType;
import com.apm.lite.nativecrash.NativeImpl;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.tencent.connect.common.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class nwq0 {

    /* JADX INFO: renamed from: d */
    private static Boolean f143990d;

    /* JADX INFO: renamed from: a */
    private final Context f143991a;

    /* JADX INFO: renamed from: b */
    private JSONObject f143992b = null;

    /* JADX INFO: renamed from: c */
    private C18969b f143993c;

    /* JADX INFO: renamed from: l.nwq0$a */
    public static class C18968a {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static String m165033b(File file) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        m4r0.m157051a(bufferedReader2);
                        return "";
                    }
                    if (line.startsWith("[FATAL:jni_android.cc") && line.contains("Please include Java exception stack in crash report ttwebview:")) {
                        StringBuilder sb = new StringBuilder();
                        int iIndexOf = line.indexOf(" ttwebview:");
                        sb.append("Caused by: ");
                        sb.append("Please include Java exception stack in crash report");
                        sb.append(SignParameters.NEW_LINE);
                        String strSubstring = line.substring(iIndexOf + 11);
                        do {
                            sb.append(strSubstring);
                            sb.append(SignParameters.NEW_LINE);
                            strSubstring = bufferedReader2.readLine();
                        } while (strSubstring != null);
                        String string = sb.toString();
                        m4r0.m157051a(bufferedReader2);
                        return string;
                    }
                    m4r0.m157051a(bufferedReader2);
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        pwq0.m174074a();
                        pwq0.m174075b("NPTH_CATCH", th);
                    } finally {
                        m4r0.m157051a(bufferedReader);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            return "";
        }
    }

    /* JADX INFO: renamed from: l.nwq0$b */
    public class C18969b {

        /* JADX INFO: renamed from: a */
        private final i0r0 f143994a;

        /* JADX INFO: renamed from: b */
        private final mrq0 f143995b;

        /* JADX INFO: renamed from: c */
        private final File f143996c;

        /* JADX INFO: renamed from: d */
        private final File f143997d;

        public C18969b(File file) {
            this.f143996c = file;
            this.f143997d = j5r0.m143567c(n0r0.m161022i(), file.getName());
            mrq0 mrq0Var = new mrq0(file);
            this.f143995b = mrq0Var;
            i0r0 i0r0Var = new i0r0(file);
            this.f143994a = i0r0Var;
            if (mrq0Var.m159709a() && i0r0Var.m138037a() == null) {
                i0r0Var.m138038b(file);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code duplicated, block: B:9:0x001a A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:4:0x0008, B:6:0x000e, B:9:0x001a), top: B:15:0x0008 }] */
        /* JADX INFO: renamed from: a */
        public long m165037a() {
            String str;
            Map<String, String> mapM159711c = this.f143995b.m159711c();
            if (mapM159711c != null) {
                try {
                    if (mapM159711c.isEmpty()) {
                        str = null;
                    } else {
                        str = mapM159711c.get("start_time");
                    }
                    if (str != null) {
                        return Long.parseLong(str);
                    }
                } catch (Throwable th) {
                    pwq0.m174074a();
                    pwq0.m174075b("NPTH_CATCH", th);
                }
            } else {
                str = null;
                if (str != null) {
                    return Long.parseLong(str);
                }
            }
            return System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: c */
        public File m165038c() {
            return this.f143996c;
        }

        /* JADX INFO: renamed from: f */
        public boolean m165039f() {
            return this.f143995b.m159709a();
        }
    }

    /* JADX INFO: renamed from: l.nwq0$c */
    public class C18970c extends C18972e {
        public C18970c() {
            super();
            this.f144002b = "Total FD Count:";
            this.f144001a = j5r0.m143555C(nwq0.this.f143993c.m165038c());
            this.f144003c = ":";
            this.f144004d = -2;
        }
    }

    /* JADX INFO: renamed from: l.nwq0$d */
    public class C18971d extends C18972e {
        public C18971d() {
            super();
            this.f144002b = "VmSize:";
            this.f144001a = j5r0.m143559G(nwq0.this.f143993c.m165038c());
            this.f144003c = "\\s+";
            this.f144004d = -1;
        }
    }

    /* JADX INFO: renamed from: l.nwq0$e */
    public class C18972e {

        /* JADX INFO: renamed from: a */
        protected File f144001a;

        /* JADX INFO: renamed from: b */
        protected String f144002b;

        /* JADX INFO: renamed from: c */
        protected String f144003c;

        /* JADX INFO: renamed from: d */
        protected int f144004d;

        public C18972e() {
        }

        /* JADX INFO: renamed from: a */
        public int m165040a() {
            int i = -1;
            if (!this.f144001a.exists() || !this.f144001a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f144001a));
                int iM165041b = -1;
                do {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        iM165041b = m165041b(line);
                    } catch (Throwable th) {
                        th = th;
                        i = iM165041b;
                        bufferedReader = bufferedReader2;
                        try {
                            pwq0.m174074a();
                            pwq0.m174075b("NPTH_CATCH", th);
                            return i;
                        } finally {
                            if (bufferedReader != null) {
                                m4r0.m157051a(bufferedReader);
                            }
                        }
                    }
                } while (iM165041b == -1);
                m4r0.m157051a(bufferedReader2);
                return iM165041b;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX INFO: renamed from: b */
        public int m165041b(String str) {
            int i = this.f144004d;
            if (!str.startsWith(this.f144002b)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.f144003c)[1].trim());
            } catch (NumberFormatException e) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", e);
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: l.nwq0$f */
    public class C18973f extends C18972e {
        public C18973f() {
            super();
            this.f144002b = "Total Threads Count:";
            this.f144001a = j5r0.m143556D(nwq0.this.f143993c.m165038c());
            this.f144003c = ":";
            this.f144004d = -2;
        }
    }

    public nwq0(Context context) {
        this.f143991a = context;
    }

    /* JADX INFO: renamed from: A */
    private int m165003A() {
        return new C18970c().m165040a();
    }

    /* JADX INFO: renamed from: B */
    private int m165004B() {
        return new C18973f().m165040a();
    }

    /* JADX INFO: renamed from: C */
    private int m165005C() {
        return new C18971d().m165040a();
    }

    /* JADX INFO: renamed from: a */
    private String m165006a(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append((CharSequence) str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable th) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", th);
        }
        return sb.toString().toUpperCase();
    }

    /* JADX INFO: renamed from: e */
    private void m165008e(Map<String, String> map) {
        map.put("has_fds_file", j5r0.m143555C(this.f143993c.m165038c()).exists() ? "true" : "false");
        File fileM143553A = j5r0.m143553A(this.f143993c.m165038c());
        map.put("has_logcat_file", (!fileM143553A.exists() || fileM143553A.length() <= 128) ? "false" : "true");
        map.put("has_maps_file", j5r0.m143580p(this.f143993c.m165038c()).exists() ? "true" : "false");
        map.put("has_tombstone_file", j5r0.m143573i(this.f143993c.m165038c()).exists() ? "true" : "false");
        map.put("has_meminfo_file", j5r0.m143559G(this.f143993c.m165038c()).exists() ? "true" : "false");
        map.put("has_threads_file", j5r0.m143556D(this.f143993c.m165038c()).exists() ? "true" : "false");
    }

    /* JADX INFO: renamed from: f */
    private void m165009f(gsq0 gsq0Var) {
        gsq0Var.m132134h(m165019z());
        gsq0Var.m132136j("is_native_crash", 1);
        gsq0Var.m132136j("repack_time", Long.valueOf(System.currentTimeMillis()));
        gsq0Var.m132136j("crash_uuid", this.f143993c.m165038c().getName());
        gsq0Var.m132136j("jiffy", Long.valueOf(e5r0.m119551a()));
    }

    /* JADX INFO: renamed from: h */
    private void m165010h(gsq0 gsq0Var) {
        HashMap map = new HashMap();
        if (m165018y()) {
            map.put("is_root", "true");
            gsq0Var.m132136j("is_root", "true");
        } else {
            map.put("is_root", "false");
            gsq0Var.m132136j("is_root", "false");
        }
        m165008e(map);
        int iM165003A = m165003A();
        if (iM165003A > 0) {
            if (iM165003A > 960) {
                map.put("fd_leak", "true");
            } else {
                map.put("fd_leak", "false");
            }
            gsq0Var.m132136j("fd_count", Integer.valueOf(iM165003A));
        }
        int iM165004B = m165004B();
        if (iM165004B > 0) {
            if (iM165004B > 350) {
                map.put("threads_leak", "true");
            } else {
                map.put("threads_leak", "false");
            }
            gsq0Var.m132136j("threads_count", Integer.valueOf(iM165004B));
        }
        int iM165005C = m165005C();
        if (iM165005C > 0) {
            if (iM165005C > m165017u()) {
                map.put("memory_leak", "true");
            } else {
                map.put("memory_leak", "false");
            }
            gsq0Var.m132136j("memory_size", Integer.valueOf(iM165005C));
        }
        map.put(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, "0.0.2");
        map.put("has_java_stack", String.valueOf(gsq0Var.m132125G().opt("java_data") != null));
        JSONArray jSONArrayM222065b = zxq0.m222065b(j5r0.m143561I(this.f143993c.f143996c), j5r0.m143562J(this.f143993c.f143996c));
        map.put("leak_threads_count", String.valueOf(jSONArrayM222065b.length()));
        if (jSONArrayM222065b.length() > 0) {
            try {
                r3r0.m179686l(j5r0.m143563K(this.f143993c.f143996c), jSONArrayM222065b, false);
            } catch (Throwable unused) {
            }
        }
        gsq0Var.m132141t();
        gsq0Var.m132143x();
        gsq0Var.m132142w(map);
    }

    /* JADX INFO: renamed from: i */
    private void m165011i(gsq0 gsq0Var) {
        Map<String, String> mapM138039c = this.f143993c.f143994a.m138039c();
        if (mapM138039c.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : mapM138039c.keySet()) {
            String strM165006a = m165006a(mapM138039c.get(str));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lib_name", str);
                jSONObject.put("lib_uuid", strM165006a);
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", e);
            }
        }
        gsq0Var.m132136j("crash_lib_uuid", jSONArray);
    }

    /* JADX INFO: renamed from: l */
    private void m165012l(gsq0 gsq0Var) {
        File fileM143583s = j5r0.m143583s(this.f143993c.m165038c());
        if (!fileM143583s.exists() && this.f143992b == null) {
            gsq0Var.m132140s(l6r0.m153085b(n0r0.m161022i()));
            gsq0Var.m132129c("has_callback", "false");
            return;
        }
        try {
            JSONObject jSONObject = this.f143992b;
            if (jSONObject == null) {
                jSONObject = new JSONObject(r3r0.m179700z(fileM143583s.getAbsolutePath()));
            }
            gsq0Var.m132144y(jSONObject);
            gsq0Var.m132129c("has_callback", "true");
            if (gsq0Var.m132125G().opt(PlaceTypes.STORAGE) == null) {
                gsq0Var.m132140s(l6r0.m153085b(n0r0.m161022i()));
            }
            x5r0.m209428a(gsq0Var, gsq0Var.m132126H(), CrashType.NATIVE);
        } catch (Throwable th) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", th);
        }
        long j = -1;
        long jOptLong = gsq0Var.m132125G().optLong("crash_time", -1L);
        long jOptLong2 = gsq0Var.m132125G().optLong("java_end", -1L);
        if (jOptLong2 != -1 && jOptLong != -1) {
            j = jOptLong2 - jOptLong;
        }
        try {
            gsq0Var.m132138q("total_cost", String.valueOf(j));
            gsq0Var.m132129c("total_cost", String.valueOf(j / 1000));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    private void m165013n(gsq0 gsq0Var) {
        String strM114506a;
        File fileM143589y = j5r0.m143589y(this.f143993c.m165038c());
        if (fileM143589y.exists()) {
            try {
                strM114506a = d6r0.m114506a(fileM143589y.getAbsolutePath());
            } catch (Throwable th) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", th);
                strM114506a = "";
            }
        } else {
            strM114506a = "";
        }
        File fileM143564L = j5r0.m143564L(this.f143993c.m165038c());
        if (fileM143564L.exists()) {
            String strM165033b = C18968a.m165033b(fileM143564L);
            if (strM114506a.isEmpty()) {
                strM114506a = strM165033b;
            } else {
                strM114506a = strM114506a + SignParameters.NEW_LINE + strM165033b;
            }
        }
        try {
            if (strM114506a.isEmpty()) {
                return;
            }
            gsq0Var.m132136j("java_data", strM114506a);
        } catch (Throwable th2) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", th2);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m165014o(gsq0 gsq0Var) {
        File fileM143568d = j5r0.m143568d(this.f143993c.m165038c());
        if (fileM143568d.exists()) {
            try {
                gsq0Var.m132136j("native_log", r3r0.m179696v(r3r0.m179679e(fileM143568d.getAbsolutePath(), SignParameters.NEW_LINE), SignParameters.NEW_LINE));
            } catch (Throwable th) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", th);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private void m165015q(gsq0 gsq0Var) {
        File fileM143553A = j5r0.m143553A(this.f143993c.m165038c());
        if (!fileM143553A.exists()) {
            NativeImpl.m5169g(fileM143553A.getAbsolutePath(), String.valueOf(n0r0.m161024k().m169523f()), String.valueOf(n0r0.m161024k().m169524g()));
        }
        JSONArray jSONArray = new JSONArray();
        String str = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f143993c.f143995b.m159711c().get("pid") + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(fileM143553A));
            try {
                if (fileM143553A.length() > 512000) {
                    bufferedReader2.skip(fileM143553A.length() - 512000);
                }
                while (true) {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        break;
                    }
                    if ((line.length() > 32 ? line.substring(0, 31) : line).contains(str)) {
                        jSONArray.put(line);
                    }
                }
                m4r0.m157051a(bufferedReader2);
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                m4r0.m157051a(bufferedReader);
            }
        } catch (Throwable unused2) {
        }
        gsq0Var.m132136j("logcat", jSONArray);
    }

    /* JADX INFO: renamed from: t */
    private void m165016t(gsq0 gsq0Var) {
        Map<String, String> mapM165020b = m165020b();
        if (mapM165020b == null || gsq0Var == null) {
            return;
        }
        String str = mapM165020b.get("process_name");
        if (str != null) {
            gsq0Var.m132136j("process_name", str);
        }
        String str2 = mapM165020b.get("start_time");
        if (str2 != null) {
            try {
                gsq0Var.m132128b(Long.decode(str2).longValue());
            } catch (Throwable th) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", th);
            }
        }
        String str3 = mapM165020b.get("pid");
        if (str3 != null) {
            try {
                gsq0Var.m132136j("pid", Long.decode(str3));
            } catch (Throwable th2) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", th2);
            }
        }
        String str4 = mapM165020b.get("crash_thread_name");
        if (str4 != null) {
            gsq0Var.m132136j("crash_thread_name", str4);
        }
        String str5 = mapM165020b.get("crash_time");
        if (str5 != null) {
            try {
                gsq0Var.m132136j("crash_time", Long.decode(str5));
            } catch (Throwable th3) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", th3);
            }
        }
        gsq0Var.m132136j("data", m165022g());
    }

    /* JADX INFO: renamed from: u */
    public static long m165017u() {
        if (NativeImpl.m5176n()) {
            return Long.MAX_VALUE;
        }
        return hwq0.m137480f() ? 3891200L : 2867200L;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m165018y() {
        Boolean bool = f143990d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        for (int i = 0; i < 11; i++) {
            try {
                if (new File(strArr[i]).exists()) {
                    f143990d = Boolean.TRUE;
                    return true;
                }
                continue;
            } catch (Throwable th) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", th);
            }
        }
        f143990d = Boolean.FALSE;
        return false;
    }

    /* JADX INFO: renamed from: z */
    private hwq0 m165019z() {
        hwq0 hwq0Var = new hwq0(this.f143991a);
        JSONObject jSONObjectM148487d = k5r0.m148477c().m148487d(this.f143993c.m165037a());
        if (jSONObjectM148487d != null) {
            hwq0Var.m137497l(jSONObjectM148487d);
            hwq0Var.m137499o();
            hwq0Var.m137500q();
        }
        hwq0.m137482h(hwq0Var);
        return hwq0Var;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, String> m165020b() {
        C18969b c18969b = this.f143993c;
        if (c18969b != null) {
            return c18969b.f143995b.m159711c();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m165021d(File file) {
        this.f143993c = new C18969b(file);
    }

    /* JADX INFO: renamed from: g */
    public String m165022g() {
        C18969b c18969b = this.f143993c;
        if (c18969b == null) {
            return null;
        }
        String strM138040d = c18969b.f143994a.m138040d();
        return (strM138040d == null || strM138040d.isEmpty()) ? this.f143993c.f143995b.m159710b() : strM138040d;
    }

    /* JADX INFO: renamed from: j */
    public boolean m165023j() {
        C18969b c18969b = this.f143993c;
        if (c18969b != null) {
            return c18969b.m165039f();
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public JSONObject m165024k() {
        File fileM143586v = j5r0.m143586v(this.f143993c.m165038c());
        if (!fileM143586v.exists()) {
            return null;
        }
        try {
            String strM179700z = r3r0.m179700z(fileM143586v.getAbsolutePath());
            if (strM179700z != null && !strM179700z.isEmpty()) {
                return new JSONObject(strM179700z);
            }
        } catch (Throwable th) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", th);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m165025m() {
        try {
            File fileM143583s = j5r0.m143583s(this.f143993c.m165038c());
            File file = new File(fileM143583s.getAbsolutePath() + ".tmp'");
            if (file.exists()) {
                file.delete();
            }
            int i = 0;
            if (fileM143583s.exists()) {
                while (i < juq0.m146994a()) {
                    File file2 = new File(fileM143583s.getAbsolutePath() + '.' + i);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    i++;
                }
                return;
            }
            gsq0 gsq0Var = new gsq0();
            for (int i2 = 0; i2 < juq0.m146994a(); i2++) {
                File file3 = new File(fileM143583s.getAbsolutePath() + '.' + i2);
                if (file3.exists()) {
                    try {
                        String strM179700z = r3r0.m179700z(file3.getAbsolutePath());
                        if (!TextUtils.isEmpty(strM179700z)) {
                            JSONObject jSONObject = new JSONObject(strM179700z);
                            if (jSONObject.length() > 0) {
                                gsq0Var.m132144y(jSONObject);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
            JSONObject jSONObjectM132125G = gsq0Var.m132125G();
            try {
                if (jSONObjectM132125G.length() != 0 && jSONObjectM132125G.opt(PlaceTypes.STORAGE) == null) {
                    gsq0.m132115n(jSONObjectM132125G, l6r0.m153085b(n0r0.m161022i()));
                }
            } catch (Throwable unused2) {
            }
            if (jSONObjectM132125G.length() != 0) {
                this.f143992b = jSONObjectM132125G;
                r3r0.m179697w(file, jSONObjectM132125G, false);
                if (file.renameTo(fileM143583s)) {
                    while (i < juq0.m146994a()) {
                        File file4 = new File(fileM143583s.getAbsolutePath() + '.' + i);
                        if (file4.exists()) {
                            file4.delete();
                        }
                        i++;
                    }
                }
            }
        } catch (IOException e) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", e);
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m165026p() {
        n0r0.m161017d().m182827d();
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean m165027r() {
        return dsq0.m117772a().m117776d(j5r0.m143586v(this.f143993c.m165038c()).getAbsolutePath());
    }

    /* JADX INFO: renamed from: s */
    public void m165028s() {
        dsq0.m117772a().m117775c(esq0.m122389a(j5r0.m143586v(this.f143993c.m165038c()).getAbsolutePath()));
    }

    /* JADX INFO: renamed from: v */
    public JSONObject m165029v() {
        try {
            gsq0 gsq0Var = new gsq0();
            m165009f(gsq0Var);
            m165016t(gsq0Var);
            m165011i(gsq0Var);
            m165012l(gsq0Var);
            m165013n(gsq0Var);
            m165015q(gsq0Var);
            m165014o(gsq0Var);
            m165010h(gsq0Var);
            File fileM143586v = j5r0.m143586v(this.f143993c.m165038c());
            JSONObject jSONObjectM132125G = gsq0Var.m132125G();
            r3r0.m179687m(fileM143586v, jSONObjectM132125G, false);
            return jSONObjectM132125G;
        } catch (Throwable th) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public boolean m165030w() {
        return r3r0.m179692r(this.f143993c.m165038c());
    }

    /* JADX INFO: renamed from: x */
    public void m165031x() {
        try {
            r3r0.m179668A(this.f143993c.m165038c().getAbsolutePath(), Environment.getExternalStorageDirectory().getAbsolutePath() + "/localDebug/" + n0r0.m161022i().getPackageName() + "/" + this.f143993c.m165038c().getName() + ".zip");
        } catch (Throwable th) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", th);
        }
    }
}
