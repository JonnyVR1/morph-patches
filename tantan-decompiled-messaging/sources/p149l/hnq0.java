package p149l;

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
public final class hnq0 {

    /* JADX INFO: renamed from: d */
    private static Boolean f108662d;

    /* JADX INFO: renamed from: a */
    private final Context f108663a;

    /* JADX INFO: renamed from: b */
    private JSONObject f108664b = null;

    /* JADX INFO: renamed from: c */
    private C17351b f108665c;

    /* JADX INFO: renamed from: l.hnq0$a */
    public static class C17350a {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static String m132004b(File file) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        gvq0.m128290a(bufferedReader2);
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
                        gvq0.m128290a(bufferedReader2);
                        return string;
                    }
                    gvq0.m128290a(bufferedReader2);
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        jnq0.m142383a();
                        jnq0.m142384b("NPTH_CATCH", th);
                    } finally {
                        gvq0.m128290a(bufferedReader);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            return "";
        }
    }

    /* JADX INFO: renamed from: l.hnq0$b */
    public class C17351b {

        /* JADX INFO: renamed from: a */
        private final crq0 f108666a;

        /* JADX INFO: renamed from: b */
        private final hiq0 f108667b;

        /* JADX INFO: renamed from: c */
        private final File f108668c;

        /* JADX INFO: renamed from: d */
        private final File f108669d;

        public C17351b(File file) {
            this.f108668c = file;
            this.f108669d = dwq0.m113915c(hrq0.m132700i(), file.getName());
            hiq0 hiq0Var = new hiq0(file);
            this.f108667b = hiq0Var;
            crq0 crq0Var = new crq0(file);
            this.f108666a = crq0Var;
            if (hiq0Var.m131293a() && crq0Var.m108451a() == null) {
                crq0Var.m108452b(file);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code duplicated, block: B:9:0x001a A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:4:0x0008, B:6:0x000e, B:9:0x001a), top: B:15:0x0008 }] */
        /* JADX INFO: renamed from: a */
        public long m132008a() {
            String str;
            Map<String, String> mapM131295c = this.f108667b.m131295c();
            if (mapM131295c != null) {
                try {
                    if (mapM131295c.isEmpty()) {
                        str = null;
                    } else {
                        str = mapM131295c.get("start_time");
                    }
                    if (str != null) {
                        return Long.parseLong(str);
                    }
                } catch (Throwable th) {
                    jnq0.m142383a();
                    jnq0.m142384b("NPTH_CATCH", th);
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
        public File m132009c() {
            return this.f108668c;
        }

        /* JADX INFO: renamed from: f */
        public boolean m132010f() {
            return this.f108667b.m131293a();
        }
    }

    /* JADX INFO: renamed from: l.hnq0$c */
    public class C17352c extends C17354e {
        public C17352c() {
            super();
            this.f108674b = "Total FD Count:";
            this.f108673a = dwq0.m113903C(hnq0.this.f108665c.m132009c());
            this.f108675c = ":";
            this.f108676d = -2;
        }
    }

    /* JADX INFO: renamed from: l.hnq0$d */
    public class C17353d extends C17354e {
        public C17353d() {
            super();
            this.f108674b = "VmSize:";
            this.f108673a = dwq0.m113907G(hnq0.this.f108665c.m132009c());
            this.f108675c = "\\s+";
            this.f108676d = -1;
        }
    }

    /* JADX INFO: renamed from: l.hnq0$e */
    public class C17354e {

        /* JADX INFO: renamed from: a */
        protected File f108673a;

        /* JADX INFO: renamed from: b */
        protected String f108674b;

        /* JADX INFO: renamed from: c */
        protected String f108675c;

        /* JADX INFO: renamed from: d */
        protected int f108676d;

        public C17354e() {
        }

        /* JADX INFO: renamed from: a */
        public int m132011a() {
            int i = -1;
            if (!this.f108673a.exists() || !this.f108673a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f108673a));
                int iM132012b = -1;
                do {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        iM132012b = m132012b(line);
                    } catch (Throwable th) {
                        th = th;
                        i = iM132012b;
                        bufferedReader = bufferedReader2;
                        try {
                            jnq0.m142383a();
                            jnq0.m142384b("NPTH_CATCH", th);
                            return i;
                        } finally {
                            if (bufferedReader != null) {
                                gvq0.m128290a(bufferedReader);
                            }
                        }
                    }
                } while (iM132012b == -1);
                gvq0.m128290a(bufferedReader2);
                return iM132012b;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX INFO: renamed from: b */
        public int m132012b(String str) {
            int i = this.f108676d;
            if (!str.startsWith(this.f108674b)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.f108675c)[1].trim());
            } catch (NumberFormatException e) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", e);
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: l.hnq0$f */
    public class C17355f extends C17354e {
        public C17355f() {
            super();
            this.f108674b = "Total Threads Count:";
            this.f108673a = dwq0.m113904D(hnq0.this.f108665c.m132009c());
            this.f108675c = ":";
            this.f108676d = -2;
        }
    }

    public hnq0(Context context) {
        this.f108663a = context;
    }

    /* JADX INFO: renamed from: A */
    private int m131974A() {
        return new C17352c().m132011a();
    }

    /* JADX INFO: renamed from: B */
    private int m131975B() {
        return new C17355f().m132011a();
    }

    /* JADX INFO: renamed from: C */
    private int m131976C() {
        return new C17353d().m132011a();
    }

    /* JADX INFO: renamed from: a */
    private String m131977a(String str) {
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
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", th);
        }
        return sb.toString().toUpperCase();
    }

    /* JADX INFO: renamed from: e */
    private void m131979e(Map<String, String> map) {
        map.put("has_fds_file", dwq0.m113903C(this.f108665c.m132009c()).exists() ? "true" : "false");
        File fileM113901A = dwq0.m113901A(this.f108665c.m132009c());
        map.put("has_logcat_file", (!fileM113901A.exists() || fileM113901A.length() <= 128) ? "false" : "true");
        map.put("has_maps_file", dwq0.m113928p(this.f108665c.m132009c()).exists() ? "true" : "false");
        map.put("has_tombstone_file", dwq0.m113921i(this.f108665c.m132009c()).exists() ? "true" : "false");
        map.put("has_meminfo_file", dwq0.m113907G(this.f108665c.m132009c()).exists() ? "true" : "false");
        map.put("has_threads_file", dwq0.m113904D(this.f108665c.m132009c()).exists() ? "true" : "false");
    }

    /* JADX INFO: renamed from: f */
    private void m131980f(bjq0 bjq0Var) {
        bjq0Var.m102215h(m131990z());
        bjq0Var.m102217j("is_native_crash", 1);
        bjq0Var.m102217j("repack_time", Long.valueOf(System.currentTimeMillis()));
        bjq0Var.m102217j("crash_uuid", this.f108665c.m132009c().getName());
        bjq0Var.m102217j("jiffy", Long.valueOf(yvq0.m216227a()));
    }

    /* JADX INFO: renamed from: h */
    private void m131981h(bjq0 bjq0Var) {
        HashMap map = new HashMap();
        if (m131989y()) {
            map.put("is_root", "true");
            bjq0Var.m102217j("is_root", "true");
        } else {
            map.put("is_root", "false");
            bjq0Var.m102217j("is_root", "false");
        }
        m131979e(map);
        int iM131974A = m131974A();
        if (iM131974A > 0) {
            if (iM131974A > 960) {
                map.put("fd_leak", "true");
            } else {
                map.put("fd_leak", "false");
            }
            bjq0Var.m102217j("fd_count", Integer.valueOf(iM131974A));
        }
        int iM131975B = m131975B();
        if (iM131975B > 0) {
            if (iM131975B > 350) {
                map.put("threads_leak", "true");
            } else {
                map.put("threads_leak", "false");
            }
            bjq0Var.m102217j("threads_count", Integer.valueOf(iM131975B));
        }
        int iM131976C = m131976C();
        if (iM131976C > 0) {
            if (iM131976C > m131988u()) {
                map.put("memory_leak", "true");
            } else {
                map.put("memory_leak", "false");
            }
            bjq0Var.m102217j("memory_size", Integer.valueOf(iM131976C));
        }
        map.put(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, "0.0.2");
        map.put("has_java_stack", String.valueOf(bjq0Var.m102206G().opt("java_data") != null));
        JSONArray jSONArrayM189920b = toq0.m189920b(dwq0.m113909I(this.f108665c.f108668c), dwq0.m113910J(this.f108665c.f108668c));
        map.put("leak_threads_count", String.valueOf(jSONArrayM189920b.length()));
        if (jSONArrayM189920b.length() > 0) {
            try {
                luq0.m151798l(dwq0.m113911K(this.f108665c.f108668c), jSONArrayM189920b, false);
            } catch (Throwable unused) {
            }
        }
        bjq0Var.m102222t();
        bjq0Var.m102224x();
        bjq0Var.m102223w(map);
    }

    /* JADX INFO: renamed from: i */
    private void m131982i(bjq0 bjq0Var) {
        Map<String, String> mapM108453c = this.f108665c.f108666a.m108453c();
        if (mapM108453c.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : mapM108453c.keySet()) {
            String strM131977a = m131977a(mapM108453c.get(str));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lib_name", str);
                jSONObject.put("lib_uuid", strM131977a);
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", e);
            }
        }
        bjq0Var.m102217j("crash_lib_uuid", jSONArray);
    }

    /* JADX INFO: renamed from: l */
    private void m131983l(bjq0 bjq0Var) {
        File fileM113931s = dwq0.m113931s(this.f108665c.m132009c());
        if (!fileM113931s.exists() && this.f108664b == null) {
            bjq0Var.m102221s(fxq0.m123680b(hrq0.m132700i()));
            bjq0Var.m102210c("has_callback", "false");
            return;
        }
        try {
            JSONObject jSONObject = this.f108664b;
            if (jSONObject == null) {
                jSONObject = new JSONObject(luq0.m151812z(fileM113931s.getAbsolutePath()));
            }
            bjq0Var.m102225y(jSONObject);
            bjq0Var.m102210c("has_callback", "true");
            if (bjq0Var.m102206G().opt(PlaceTypes.STORAGE) == null) {
                bjq0Var.m102221s(fxq0.m123680b(hrq0.m132700i()));
            }
            rwq0.m181442a(bjq0Var, bjq0Var.m102207H(), CrashType.NATIVE);
        } catch (Throwable th) {
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", th);
        }
        long j = -1;
        long jOptLong = bjq0Var.m102206G().optLong("crash_time", -1L);
        long jOptLong2 = bjq0Var.m102206G().optLong("java_end", -1L);
        if (jOptLong2 != -1 && jOptLong != -1) {
            j = jOptLong2 - jOptLong;
        }
        try {
            bjq0Var.m102219q("total_cost", String.valueOf(j));
            bjq0Var.m102210c("total_cost", String.valueOf(j / 1000));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    private void m131984n(bjq0 bjq0Var) {
        String strM211358a;
        File fileM113937y = dwq0.m113937y(this.f108665c.m132009c());
        if (fileM113937y.exists()) {
            try {
                strM211358a = xwq0.m211358a(fileM113937y.getAbsolutePath());
            } catch (Throwable th) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", th);
                strM211358a = "";
            }
        } else {
            strM211358a = "";
        }
        File fileM113912L = dwq0.m113912L(this.f108665c.m132009c());
        if (fileM113912L.exists()) {
            String strM132004b = C17350a.m132004b(fileM113912L);
            if (strM211358a.isEmpty()) {
                strM211358a = strM132004b;
            } else {
                strM211358a = strM211358a + SignParameters.NEW_LINE + strM132004b;
            }
        }
        try {
            if (strM211358a.isEmpty()) {
                return;
            }
            bjq0Var.m102217j("java_data", strM211358a);
        } catch (Throwable th2) {
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", th2);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m131985o(bjq0 bjq0Var) {
        File fileM113916d = dwq0.m113916d(this.f108665c.m132009c());
        if (fileM113916d.exists()) {
            try {
                bjq0Var.m102217j("native_log", luq0.m151808v(luq0.m151791e(fileM113916d.getAbsolutePath(), SignParameters.NEW_LINE), SignParameters.NEW_LINE));
            } catch (Throwable th) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", th);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private void m131986q(bjq0 bjq0Var) {
        File fileM113901A = dwq0.m113901A(this.f108665c.m132009c());
        if (!fileM113901A.exists()) {
            NativeImpl.m5159g(fileM113901A.getAbsolutePath(), String.valueOf(hrq0.m132702k().m143402f()), String.valueOf(hrq0.m132702k().m143403g()));
        }
        JSONArray jSONArray = new JSONArray();
        String str = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f108665c.f108667b.m131295c().get("pid") + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(fileM113901A));
            try {
                if (fileM113901A.length() > 512000) {
                    bufferedReader2.skip(fileM113901A.length() - 512000);
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
                gvq0.m128290a(bufferedReader2);
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                gvq0.m128290a(bufferedReader);
            }
        } catch (Throwable unused2) {
        }
        bjq0Var.m102217j("logcat", jSONArray);
    }

    /* JADX INFO: renamed from: t */
    private void m131987t(bjq0 bjq0Var) {
        Map<String, String> mapM131991b = m131991b();
        if (mapM131991b == null || bjq0Var == null) {
            return;
        }
        String str = mapM131991b.get("process_name");
        if (str != null) {
            bjq0Var.m102217j("process_name", str);
        }
        String str2 = mapM131991b.get("start_time");
        if (str2 != null) {
            try {
                bjq0Var.m102209b(Long.decode(str2).longValue());
            } catch (Throwable th) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", th);
            }
        }
        String str3 = mapM131991b.get("pid");
        if (str3 != null) {
            try {
                bjq0Var.m102217j("pid", Long.decode(str3));
            } catch (Throwable th2) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", th2);
            }
        }
        String str4 = mapM131991b.get("crash_thread_name");
        if (str4 != null) {
            bjq0Var.m102217j("crash_thread_name", str4);
        }
        String str5 = mapM131991b.get("crash_time");
        if (str5 != null) {
            try {
                bjq0Var.m102217j("crash_time", Long.decode(str5));
            } catch (Throwable th3) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", th3);
            }
        }
        bjq0Var.m102217j("data", m131993g());
    }

    /* JADX INFO: renamed from: u */
    public static long m131988u() {
        if (NativeImpl.m5166n()) {
            return Long.MAX_VALUE;
        }
        return bnq0.m102836f() ? 3891200L : 2867200L;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m131989y() {
        Boolean bool = f108662d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        for (int i = 0; i < 11; i++) {
            try {
                if (new File(strArr[i]).exists()) {
                    f108662d = Boolean.TRUE;
                    return true;
                }
                continue;
            } catch (Throwable th) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", th);
            }
        }
        f108662d = Boolean.FALSE;
        return false;
    }

    /* JADX INFO: renamed from: z */
    private bnq0 m131990z() {
        bnq0 bnq0Var = new bnq0(this.f108663a);
        JSONObject jSONObjectM118497d = ewq0.m118487c().m118497d(this.f108665c.m132008a());
        if (jSONObjectM118497d != null) {
            bnq0Var.m102853l(jSONObjectM118497d);
            bnq0Var.m102855o();
            bnq0Var.m102856q();
        }
        bnq0.m102838h(bnq0Var);
        return bnq0Var;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, String> m131991b() {
        C17351b c17351b = this.f108665c;
        if (c17351b != null) {
            return c17351b.f108667b.m131295c();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m131992d(File file) {
        this.f108665c = new C17351b(file);
    }

    /* JADX INFO: renamed from: g */
    public String m131993g() {
        C17351b c17351b = this.f108665c;
        if (c17351b == null) {
            return null;
        }
        String strM108454d = c17351b.f108666a.m108454d();
        return (strM108454d == null || strM108454d.isEmpty()) ? this.f108665c.f108667b.m131294b() : strM108454d;
    }

    /* JADX INFO: renamed from: j */
    public boolean m131994j() {
        C17351b c17351b = this.f108665c;
        if (c17351b != null) {
            return c17351b.m132010f();
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public JSONObject m131995k() {
        File fileM113934v = dwq0.m113934v(this.f108665c.m132009c());
        if (!fileM113934v.exists()) {
            return null;
        }
        try {
            String strM151812z = luq0.m151812z(fileM113934v.getAbsolutePath());
            if (strM151812z != null && !strM151812z.isEmpty()) {
                return new JSONObject(strM151812z);
            }
        } catch (Throwable th) {
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", th);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m131996m() {
        try {
            File fileM113931s = dwq0.m113931s(this.f108665c.m132009c());
            File file = new File(fileM113931s.getAbsolutePath() + ".tmp'");
            if (file.exists()) {
                file.delete();
            }
            int i = 0;
            if (fileM113931s.exists()) {
                while (i < dlq0.m112411a()) {
                    File file2 = new File(fileM113931s.getAbsolutePath() + '.' + i);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    i++;
                }
                return;
            }
            bjq0 bjq0Var = new bjq0();
            for (int i2 = 0; i2 < dlq0.m112411a(); i2++) {
                File file3 = new File(fileM113931s.getAbsolutePath() + '.' + i2);
                if (file3.exists()) {
                    try {
                        String strM151812z = luq0.m151812z(file3.getAbsolutePath());
                        if (!TextUtils.isEmpty(strM151812z)) {
                            JSONObject jSONObject = new JSONObject(strM151812z);
                            if (jSONObject.length() > 0) {
                                bjq0Var.m102225y(jSONObject);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
            JSONObject jSONObjectM102206G = bjq0Var.m102206G();
            try {
                if (jSONObjectM102206G.length() != 0 && jSONObjectM102206G.opt(PlaceTypes.STORAGE) == null) {
                    bjq0.m102196n(jSONObjectM102206G, fxq0.m123680b(hrq0.m132700i()));
                }
            } catch (Throwable unused2) {
            }
            if (jSONObjectM102206G.length() != 0) {
                this.f108664b = jSONObjectM102206G;
                luq0.m151809w(file, jSONObjectM102206G, false);
                if (file.renameTo(fileM113931s)) {
                    while (i < dlq0.m112411a()) {
                        File file4 = new File(fileM113931s.getAbsolutePath() + '.' + i);
                        if (file4.exists()) {
                            file4.delete();
                        }
                        i++;
                    }
                }
            }
        } catch (IOException e) {
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", e);
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m131997p() {
        hrq0.m132695d().m154750d();
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean m131998r() {
        return yiq0.m215005a().m215009d(dwq0.m113934v(this.f108665c.m132009c()).getAbsolutePath());
    }

    /* JADX INFO: renamed from: s */
    public void m131999s() {
        yiq0.m215005a().m215008c(ziq0.m219063a(dwq0.m113934v(this.f108665c.m132009c()).getAbsolutePath()));
    }

    /* JADX INFO: renamed from: v */
    public JSONObject m132000v() {
        try {
            bjq0 bjq0Var = new bjq0();
            m131980f(bjq0Var);
            m131987t(bjq0Var);
            m131982i(bjq0Var);
            m131983l(bjq0Var);
            m131984n(bjq0Var);
            m131986q(bjq0Var);
            m131985o(bjq0Var);
            m131981h(bjq0Var);
            File fileM113934v = dwq0.m113934v(this.f108665c.m132009c());
            JSONObject jSONObjectM102206G = bjq0Var.m102206G();
            luq0.m151799m(fileM113934v, jSONObjectM102206G, false);
            return jSONObjectM102206G;
        } catch (Throwable th) {
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public boolean m132001w() {
        return luq0.m151804r(this.f108665c.m132009c());
    }

    /* JADX INFO: renamed from: x */
    public void m132002x() {
        try {
            luq0.m151780A(this.f108665c.m132009c().getAbsolutePath(), Environment.getExternalStorageDirectory().getAbsolutePath() + "/localDebug/" + hrq0.m132700i().getPackageName() + "/" + this.f108665c.m132009c().getName() + ".zip");
        } catch (Throwable th) {
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", th);
        }
    }
}
