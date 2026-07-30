package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.apm.lite.CrashType;
import com.apm.lite.nativecrash.NativeImpl;
import com.apm.lite.p010j.C0926e;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.tencent.connect.common.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class guq0 {

    /* JADX INFO: renamed from: h */
    private static volatile guq0 f106533h;

    /* JADX INFO: renamed from: a */
    private Context f106534a;

    /* JADX INFO: renamed from: c */
    private C17321f f106536c;

    /* JADX INFO: renamed from: d */
    private HashMap<String, C17321f> f106537d;

    /* JADX INFO: renamed from: b */
    private int f106535b = -1;

    /* JADX INFO: renamed from: e */
    private volatile boolean f106538e = false;

    /* JADX INFO: renamed from: f */
    private Runnable f106539f = new RunnableC17318c();

    /* JADX INFO: renamed from: g */
    private Runnable f106540g = new RunnableC17319d();

    /* JADX INFO: renamed from: l.guq0$a */
    public class C17316a implements vuq0.InterfaceC20938a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ wxq0 f106541a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ File f106542b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C17321f f106543c;

        public C17316a(wxq0 wxq0Var, File file, C17321f c17321f) {
            this.f106541a = wxq0Var;
            this.f106542b = file;
            this.f106543c = c17321f;
        }

        @Override // p153l.vuq0.InterfaceC20938a
        /* JADX INFO: renamed from: a */
        public void mo131857a(JSONObject jSONObject) {
            C0926e.m5129g(this.f106541a.m208424a(), jSONObject.toString(), new File(this.f106542b, "logZip"), j5r0.m143567c(guq0.this.f106534a, this.f106543c.f106555a));
        }
    }

    /* JADX INFO: renamed from: l.guq0$b */
    public class C17317b implements vuq0.InterfaceC20938a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ File f106545a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C17321f f106546b;

        public C17317b(File file, C17321f c17321f) {
            this.f106545a = file;
            this.f106546b = c17321f;
        }

        @Override // p153l.vuq0.InterfaceC20938a
        /* JADX INFO: renamed from: a */
        public void mo131857a(JSONObject jSONObject) {
            yxq0.m217735a().m217737c(jSONObject, this.f106545a, j5r0.m143567c(guq0.this.f106534a, this.f106546b.f106555a));
        }
    }

    /* JADX INFO: renamed from: l.guq0$c */
    public class RunnableC17318c implements Runnable {
        public RunnableC17318c() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            guq0.this.m132378w();
        }
    }

    /* JADX INFO: renamed from: l.guq0$d */
    public class RunnableC17319d implements Runnable {
        public RunnableC17319d() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            guq0.this.m132376u();
        }
    }

    /* JADX INFO: renamed from: l.guq0$f */
    public static class C17321f {

        /* JADX INFO: renamed from: a */
        String f106555a;

        /* JADX INFO: renamed from: d */
        C17320e f106558d;

        /* JADX INFO: renamed from: e */
        C17320e f106559e;

        /* JADX INFO: renamed from: b */
        List<C17320e> f106556b = new ArrayList();

        /* JADX INFO: renamed from: c */
        List<C17320e> f106557c = new ArrayList();

        /* JADX INFO: renamed from: f */
        boolean f106560f = false;

        /* JADX INFO: renamed from: g */
        int f106561g = 0;

        public C17321f(String str) {
            this.f106555a = str;
        }
    }

    private guq0(Context context) {
        this.f106534a = context;
    }

    /* JADX INFO: renamed from: a */
    public static guq0 m132359a() {
        if (f106533h == null) {
            synchronized (guq0.class) {
                try {
                    if (f106533h == null) {
                        f106533h = new guq0(n0r0.m161022i());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f106533h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private wxq0 m132360b(File file, CrashType crashType, String str, long j, long j2) {
        wxq0 wxq0Var;
        Object obj = crashType;
        try {
            try {
                if (file.isFile()) {
                    r3r0.m179692r(file);
                    return null;
                }
                boolean z = obj == CrashType.LAUNCH;
                if (obj == null) {
                    try {
                        return r3r0.m179670C(new File(file, file.getName()).getAbsolutePath());
                    } catch (Throwable th) {
                        th = th;
                        wxq0Var = 0;
                        r3r0.m179692r(file);
                        pwq0.m174074a();
                        pwq0.m174075b("NPTH_CATCH", th);
                        return wxq0Var;
                    }
                }
                wxq0 wxq0VarM179681g = r3r0.m179681g(file, crashType);
                try {
                    JSONObject jSONObjectM208429f = wxq0VarM179681g.m208429f();
                    try {
                        if (wxq0VarM179681g.m208429f() != null) {
                            boolean z2 = z;
                            if (obj == CrashType.ANR) {
                                return wxq0VarM179681g;
                            }
                            jSONObjectM208429f.put("crash_time", j);
                            try {
                                jSONObjectM208429f.put("app_start_time", j2);
                                JSONObject jSONObjectOptJSONObject = jSONObjectM208429f.optJSONObject("header");
                                try {
                                    if (jSONObjectOptJSONObject == null) {
                                        jSONObjectOptJSONObject = hwq0.m137477b(this.f106534a, j).m137501s();
                                    } else if (z2) {
                                        jSONObjectM208429f.remove("header");
                                    }
                                    String strOptString = jSONObjectOptJSONObject.optString("sdk_version_name", null);
                                    if (strOptString == null) {
                                        strOptString = "0.0.2";
                                    }
                                    gsq0.m132112k(jSONObjectM208429f, "filters", Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, strOptString);
                                    if (r3r0.m179694t(jSONObjectM208429f.optJSONArray("logcat"))) {
                                        jSONObjectM208429f.put("logcat", h4r0.m133594b(str));
                                    }
                                    gsq0.m132112k(jSONObjectM208429f, "filters", "has_dump", "true");
                                    gsq0.m132112k(jSONObjectM208429f, "filters", "has_logcat", String.valueOf(!t4r0.m189304h(jSONObjectM208429f, "logcat")));
                                    gsq0.m132112k(jSONObjectM208429f, "filters", "memory_leak", String.valueOf(gsq0.m132118v(str)));
                                    gsq0.m132112k(jSONObjectM208429f, "filters", "fd_leak", String.valueOf(gsq0.m132119z(str)));
                                    gsq0.m132112k(jSONObjectM208429f, "filters", "threads_leak", String.valueOf(gsq0.m132111B(str)));
                                    gsq0.m132112k(jSONObjectM208429f, "filters", "is_64_devices", String.valueOf(hwq0.m137480f()));
                                    gsq0.m132112k(jSONObjectM208429f, "filters", "is_64_runtime", String.valueOf(NativeImpl.m5176n()));
                                    gsq0.m132112k(jSONObjectM208429f, "filters", "is_x86_devices", String.valueOf(hwq0.m137484j()));
                                    gsq0.m132112k(jSONObjectM208429f, "filters", "has_meminfo_file", String.valueOf(gsq0.m132116p(str)));
                                    gsq0.m132112k(jSONObjectM208429f, "filters", "is_root", String.valueOf(nwq0.m165018y()));
                                    jSONObjectM208429f.put("launch_did", hrq0.m136919a(this.f106534a));
                                    jSONObjectM208429f.put("crash_uuid", file.getName());
                                    jSONObjectM208429f.put("jiffy", e5r0.m119551a());
                                    try {
                                        long j3 = Long.parseLong(kuq0.m151619a(j, str));
                                        gsq0.m132112k(jSONObjectM208429f, "filters", "lastAliveTime", Math.abs(j3 - j) < com.clevertap.android.sdk.Constants.ONE_MIN_IN_MILLIS ? "< 60s" : "> 60s");
                                        jSONObjectM208429f.put("lastAliveTime", String.valueOf(j3));
                                    } catch (Throwable unused) {
                                        jSONObjectM208429f.put("lastAliveTime", "unknown");
                                        gsq0.m132112k(jSONObjectM208429f, "filters", "lastAliveTime", "unknown");
                                    }
                                    jSONObjectM208429f.put("has_dump", "true");
                                    if (jSONObjectM208429f.opt(PlaceTypes.STORAGE) == null) {
                                        gsq0.m132115n(jSONObjectM208429f, l6r0.m153085b(n0r0.m161022i()));
                                    }
                                    if (hwq0.m137486n(jSONObjectOptJSONObject)) {
                                        gsq0.m132112k(jSONObjectM208429f, "filters", "unauthentic_version", "unauthentic_version");
                                    }
                                    wxq0VarM179681g.m208429f().put("upload_scene", "launch_scan");
                                    if (z2) {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObjectM208429f.put("event_type", "start_crash");
                                        jSONObjectM208429f.put("stack", jSONObjectM208429f.remove("data"));
                                        jSONObject.put("data", new JSONArray().put(jSONObjectM208429f));
                                        jSONObject.put("header", jSONObjectOptJSONObject);
                                        wxq0 wxq0Var2 = wxq0VarM179681g;
                                        wxq0Var2.m208427d(jSONObject);
                                        obj = wxq0Var2;
                                    } else {
                                        obj = wxq0VarM179681g;
                                        jSONObjectM208429f.put("isJava", 1);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    wxq0Var = wxq0VarM179681g;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                obj = wxq0VarM179681g;
                                wxq0Var = obj;
                            }
                            wxq0Var = obj;
                        } else {
                            obj = wxq0VarM179681g;
                            r3r0.m179692r(file);
                        }
                        return obj;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    obj = wxq0VarM179681g;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            wxq0Var = 0;
        }
        r3r0.m179692r(file);
        pwq0.m174074a();
        pwq0.m174075b("NPTH_CATCH", th);
        return wxq0Var;
    }

    /* JADX INFO: renamed from: c */
    private JSONObject m132361c(nwq0 nwq0Var) {
        JSONObject jSONObjectM165024k = nwq0Var.m165024k();
        if (jSONObjectM165024k != null && jSONObjectM165024k.length() != 0) {
            return jSONObjectM165024k;
        }
        if (n0r0.m161019f()) {
            nwq0Var.m165031x();
        }
        if (!nwq0Var.m165023j()) {
            nwq0Var.m165030w();
            return null;
        }
        if (!nwq0Var.m165026p()) {
            nwq0Var.m165030w();
            return null;
        }
        if (nwq0Var.m165027r()) {
            nwq0Var.m165030w();
            return null;
        }
        nwq0Var.m165025m();
        return nwq0Var.m165029v();
    }

    /* JADX INFO: renamed from: e */
    private void m132363e(HashMap<String, C17321f> map) {
        File[] fileArrListFiles = j5r0.m143585u(this.f106534a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length && i < 5; i++) {
            File file = fileArrListFiles[i];
            try {
                if (file.isDirectory() && file.getName().endsWith("G")) {
                    String name = file.getName();
                    C17321f c17321f = map.get(name);
                    if (c17321f == null) {
                        c17321f = new C17321f(name);
                        map.put(name, c17321f);
                    }
                    JSONArray jSONArrayM222065b = zxq0.m222065b(j5r0.m143561I(file), j5r0.m143562J(file));
                    int length = jSONArrayM222065b.length();
                    c17321f.f106561g = length;
                    if (length > 0) {
                        try {
                            r3r0.m179686l(j5r0.m143563K(file), jSONArrayM222065b, false);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    r3r0.m179692r(file);
                }
            } catch (Throwable th) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", th);
                r3r0.m179692r(file);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private void m132364f(HashMap<String, C17321f> map, C17321f c17321f) {
        File[] fileArrListFiles = j5r0.m143579o(this.f106534a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length && i < 5; i++) {
            File file = fileArrListFiles[i];
            try {
                if (file.isDirectory() && file.getName().endsWith("G")) {
                    String name = file.getName();
                    C17321f c17321f2 = map.get(name);
                    if (c17321f2 == null) {
                        c17321f2 = new C17321f(name);
                        map.put(name, c17321f2);
                    }
                    c17321f2.f106557c.add(new C17320e(file, CrashType.NATIVE));
                } else {
                    r3r0.m179692r(file);
                }
            } catch (Throwable th) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", th);
                r3r0.m179692r(file);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m132365g(HashMap<String, C17321f> map, C17321f c17321f, File file, String str) {
        if (!str.endsWith("G")) {
            r3r0.m179692r(file);
            return;
        }
        String[] strArrSplit = str.split("_");
        CrashType crashType = null;
        if (strArrSplit.length < 5) {
            c17321f.f106556b.add(new C17320e(file, null));
            return;
        }
        try {
            long j = Long.parseLong(strArrSplit[0]);
            long j2 = Long.parseLong(strArrSplit[4]);
            String str2 = strArrSplit[2];
            String str3 = strArrSplit[1];
            str3.getClass();
            switch (str3) {
                case "launch":
                    crashType = CrashType.LAUNCH;
                    break;
                case "anr":
                    crashType = CrashType.ANR;
                    break;
                case "java":
                    crashType = CrashType.JAVA;
                    break;
            }
            C17321f c17321f2 = map.get(str2);
            if (c17321f2 == null) {
                c17321f2 = new C17321f(str2);
                map.put(str2, c17321f2);
            }
            C17320e c17320e = new C17320e(file, j, crashType);
            c17320e.f106552c = j2;
            C17320e c17320e2 = c17321f2.f106558d;
            if ((c17320e2 == null || c17320e2.f106551b > c17320e.f106551b) && crashType != null && crashType != CrashType.ANR && !str.contains("ignore")) {
                c17321f2.f106558d = c17320e;
            }
            c17321f2.f106556b.add(c17320e);
        } catch (Throwable unused) {
            c17321f.f106556b.add(new C17320e(file, null));
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", new RuntimeException("err format crashTime:".concat(str)));
        }
    }

    /* JADX INFO: renamed from: h */
    private void m132366h(C17321f c17321f) {
        r3r0.m179692r(j5r0.m143567c(this.f106534a, c17321f.f106555a));
        r3r0.m179692r(j5r0.m143572h(this.f106534a, c17321f.f106555a));
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0135 A[Catch: all -> 0x0145, TryCatch #2 {all -> 0x0145, blocks: (B:66:0x0129, B:68:0x0135, B:71:0x0147), top: B:82:0x0129 }] */
    /* JADX INFO: renamed from: i */
    private void m132367i(C17321f c17321f, boolean z, d3r0 d3r0Var) {
        Iterator<C17320e> it;
        if (c17321f.f106556b.isEmpty()) {
            return;
        }
        if (c17321f.f106559e == null) {
            c17321f.f106559e = c17321f.f106558d;
        }
        Iterator<C17320e> it2 = c17321f.f106556b.iterator();
        while (it2.hasNext()) {
            C17320e next = it2.next();
            try {
                File file = next.f106550a;
                CrashType crashType = next.f106553d;
                try {
                    wxq0 wxq0VarM132360b = m132360b(file, crashType, c17321f.f106555a, next.f106551b, next.f106552c);
                    if (wxq0VarM132360b != null) {
                        JSONObject jSONObjectM208429f = wxq0VarM132360b.m208429f();
                        if (jSONObjectM208429f != null) {
                            JSONObject jSONObjectOptJSONObject = jSONObjectM208429f.optJSONObject("header");
                            if (jSONObjectOptJSONObject != null) {
                                if (crashType != null || (!new File(file, file.getName()).exists() && file.getName().split("_").length >= 5)) {
                                    File fileM202877a = vuq0.m202877a(file);
                                    if (fileM202877a.exists()) {
                                        try {
                                            JSONArray jSONArray = new JSONArray(r3r0.m179699y(fileM202877a));
                                            JSONObject jSONObjectOptJSONObject2 = crashType == CrashType.LAUNCH ? ((JSONArray) jSONObjectM208429f.opt("data")).optJSONObject(0) : jSONObjectM208429f;
                                            try {
                                                if (z) {
                                                    it = it2;
                                                } else {
                                                    it = it2;
                                                    try {
                                                        if (c17321f.f106559e == next) {
                                                        }
                                                        try {
                                                            gsq0.m132112k(jSONObjectOptJSONObject2, "filters", "aid", String.valueOf(jSONObjectOptJSONObject.opt("aid")));
                                                            gsq0.m132112k(jSONObjectOptJSONObject2, "filters", "has_ignore", String.valueOf(next.f106554e.contains("ignore")));
                                                        } catch (Throwable th) {
                                                            pwq0.m174074a();
                                                            pwq0.m174075b("NPTH_CATCH", th);
                                                        }
                                                        gsq0.m132112k(jSONObjectOptJSONObject2, "filters", "start_uuid", c17321f.f106555a);
                                                        gsq0.m132112k(jSONObjectOptJSONObject2, "filters", "leak_threads_count", String.valueOf(c17321f.f106561g));
                                                        gsq0.m132112k(jSONObjectOptJSONObject2, "filters", "crash_thread_name", jSONObjectOptJSONObject2.optString("crash_thread_name", "unknown"));
                                                        vuq0.m202884h(jSONObjectM208429f, jSONArray, new C17316a(wxq0VarM132360b, file, c17321f));
                                                        if (!r3r0.m179692r(file)) {
                                                            dsq0.m117772a().m117775c(esq0.m122389a(file.getAbsolutePath()));
                                                        }
                                                        s2r0.m184134b(j5r0.m143572h(n0r0.m161022i(), c17321f.f106555a), file.getName());
                                                        lwq0.m156088b(crashType, jSONObjectM208429f);
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        pwq0.m174074a();
                                                        pwq0.m174075b("NPTH_CATCH", th);
                                                        r3r0.m179692r(next.f106550a);
                                                        it2 = it;
                                                    }
                                                    it2 = it;
                                                }
                                                if (next.f106554e.contains("ignore")) {
                                                    gsq0.m132112k(jSONObjectOptJSONObject2, "filters", "aid", String.valueOf(jSONObjectOptJSONObject.opt("aid")));
                                                    gsq0.m132112k(jSONObjectOptJSONObject2, "filters", "has_ignore", String.valueOf(next.f106554e.contains("ignore")));
                                                } else {
                                                    if (d3r0Var != null && !d3r0Var.m113897c(jSONObjectOptJSONObject2.optString("crash_md5", "default"))) {
                                                        r3r0.m179692r(next.f106550a);
                                                    }
                                                    it2 = it;
                                                }
                                                vuq0.m202884h(jSONObjectM208429f, jSONArray, new C17316a(wxq0VarM132360b, file, c17321f));
                                                if (!r3r0.m179692r(file)) {
                                                    dsq0.m117772a().m117775c(esq0.m122389a(file.getAbsolutePath()));
                                                }
                                                s2r0.m184134b(j5r0.m143572h(n0r0.m161022i(), c17321f.f106555a), file.getName());
                                                lwq0.m156088b(crashType, jSONObjectM208429f);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                pwq0.m174074a();
                                                pwq0.m174075b("NPTH_CATCH", th);
                                                r3r0.m179692r(next.f106550a);
                                            }
                                            gsq0.m132112k(jSONObjectOptJSONObject2, "filters", "start_uuid", c17321f.f106555a);
                                            gsq0.m132112k(jSONObjectOptJSONObject2, "filters", "leak_threads_count", String.valueOf(c17321f.f106561g));
                                            gsq0.m132112k(jSONObjectOptJSONObject2, "filters", "crash_thread_name", jSONObjectOptJSONObject2.optString("crash_thread_name", "unknown"));
                                        } catch (Throwable unused) {
                                            it = it2;
                                        }
                                        it2 = it;
                                    }
                                } else if (C0926e.m5127e(wxq0VarM132360b.m208424a(), jSONObjectM208429f.toString(), false).m179816a()) {
                                }
                            }
                        }
                    }
                    r3r0.m179692r(file);
                } catch (Throwable th4) {
                    th = th4;
                    it = it2;
                }
            } catch (Throwable th5) {
                th = th5;
                it = it2;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private boolean m132369l(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    private void m132370n(HashMap<String, C17321f> map, C17321f c17321f) {
        File[] fileArrListFiles = j5r0.m143566b(this.f106534a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        Arrays.sort(fileArrListFiles, Collections.reverseOrder());
        for (File file : fileArrListFiles) {
            try {
                if (dsq0.m117772a().m117776d(file.getAbsolutePath())) {
                    r3r0.m179692r(file);
                } else if (!r3r0.m179674G(file) && !frq0.m126955e().m126976p(file.getName())) {
                    if (file.isFile()) {
                        r3r0.m179692r(file);
                    } else {
                        m132365g(map, c17321f, file, file.getName());
                    }
                }
            } catch (Throwable th) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", th);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private void m132371o(C17321f c17321f, boolean z, d3r0 d3r0Var) {
        boolean z2;
        if (c17321f.f106557c.size() <= 1 && c17321f.f106557c.isEmpty()) {
            c17321f.f106559e = c17321f.f106558d;
            return;
        }
        boolean zM152978c = l5r0.m152978c(this.f106534a);
        c17321f.f106559e = c17321f.f106558d;
        nwq0 nwq0Var = new nwq0(this.f106534a);
        for (C17320e c17320e : c17321f.f106557c) {
            File file = c17320e.f106550a;
            try {
                nwq0Var.m165021d(file);
                JSONObject jSONObjectM132361c = m132361c(nwq0Var);
                if (jSONObjectM132361c == null || jSONObjectM132361c.length() == 0) {
                    z2 = zM152978c;
                    nwq0Var.m165030w();
                    zM152978c = z2;
                } else {
                    if (jSONObjectM132361c.length() != 0) {
                        if (z) {
                            z2 = zM152978c;
                            if (d3r0Var != null && !d3r0Var.m113897c("default")) {
                                nwq0Var.m165030w();
                            }
                        } else {
                            long jOptLong = jSONObjectM132361c.optLong("crash_time");
                            try {
                                C17320e c17320e2 = c17321f.f106559e;
                                if (c17320e2 == null) {
                                    c17321f.f106559e = c17320e;
                                    c17321f.f106560f = true;
                                    if (d3r0Var == null || d3r0Var.m113897c("default")) {
                                        z2 = zM152978c;
                                    } else {
                                        nwq0Var.m165030w();
                                    }
                                    pwq0.m174074a();
                                    pwq0.m174075b("NPTH_CATCH", th);
                                    r3r0.m179692r(file);
                                } else {
                                    z2 = zM152978c;
                                    try {
                                        if (c17321f.f106560f || jOptLong >= c17320e2.f106551b) {
                                            gsq0.m132112k(jSONObjectM132361c, "filters", "aid", String.valueOf(jSONObjectM132361c.optJSONObject("header").opt("aid")));
                                        } else {
                                            c17321f.f106559e = c17320e;
                                            if (d3r0Var == null || d3r0Var.m113897c("default")) {
                                                if (!m132369l(file)) {
                                                    m132362d(file, c17321f);
                                                }
                                                c17321f.f106560f = true;
                                            } else {
                                                nwq0Var.m165030w();
                                                zM152978c = z2;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z2 = zM152978c;
                            }
                        }
                        try {
                            gsq0.m132112k(jSONObjectM132361c, "filters", "start_uuid", c17321f.f106555a);
                            gsq0.m132112k(jSONObjectM132361c, "filters", "crash_thread_name", jSONObjectM132361c.optString("crash_thread_name", "unknown"));
                            if (z2) {
                                lwq0.C18475b c18475b = new lwq0.C18475b(jSONObjectM132361c, CrashType.NATIVE);
                                File fileM202877a = vuq0.m202877a(file);
                                JSONArray jSONArrayM148490h = null;
                                try {
                                    if (fileM202877a.exists()) {
                                        jSONArrayM148490h = new JSONArray(r3r0.m179699y(fileM202877a));
                                    }
                                } catch (Throwable unused) {
                                }
                                if (jSONArrayM148490h == null) {
                                    jSONArrayM148490h = k5r0.m148477c().m148490h(c18475b.m156091b() == -1 ? System.currentTimeMillis() : c18475b.m156091b());
                                }
                                vuq0.m202884h(jSONObjectM132361c, vuq0.m202881e(c18475b.m156092c(), c18475b.m156090a(), jSONArrayM148490h), new C17317b(file, c17321f));
                                if (!nwq0Var.m165030w()) {
                                    nwq0Var.m165028s();
                                }
                                s2r0.m184134b(j5r0.m143572h(n0r0.m161022i(), c17321f.f106555a), file.getName());
                            }
                            lwq0.m156088b(CrashType.NATIVE, jSONObjectM132361c);
                        } catch (Throwable th3) {
                            th = th3;
                            pwq0.m174074a();
                            pwq0.m174075b("NPTH_CATCH", th);
                            r3r0.m179692r(file);
                        }
                    } else {
                        z2 = zM152978c;
                    }
                    zM152978c = z2;
                }
            } catch (Throwable th4) {
                th = th4;
                z2 = zM152978c;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private void m132374r(HashMap<String, C17321f> map, C17321f c17321f) {
        r3r0.m179692r(j5r0.m143571g(this.f106534a));
    }

    /* JADX INFO: renamed from: t */
    private void m132375t() throws Throwable {
        if (this.f106536c != null) {
            return;
        }
        this.f106536c = new C17321f("old_uuid");
        HashMap<String, C17321f> map = new HashMap<>();
        this.f106537d = map;
        m132363e(map);
        m132370n(this.f106537d, this.f106536c);
        m132374r(this.f106537d, this.f106536c);
        m132364f(this.f106537d, this.f106536c);
        m132371o(this.f106536c, true, null);
        m132367i(this.f106536c, true, null);
        this.f106536c = null;
        if (this.f106537d.isEmpty()) {
            m132377v();
        } else {
            m132378w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m132376u() throws Throwable {
        if (this.f106538e || this.f106537d == null) {
            return;
        }
        if (!l5r0.m152978c(this.f106534a)) {
            m132377v();
        }
        boolean zM132379x = m132379x();
        d3r0 d3r0Var = new d3r0(this.f106534a);
        Iterator<C17321f> it = this.f106537d.values().iterator();
        while (it.hasNext()) {
            m132371o(it.next(), zM132379x, d3r0Var);
        }
        Iterator<C17321f> it2 = this.f106537d.values().iterator();
        while (it2.hasNext()) {
            m132367i(it2.next(), zM132379x, d3r0Var);
        }
        Iterator<C17321f> it3 = this.f106537d.values().iterator();
        while (it3.hasNext()) {
            m132366h(it3.next());
        }
        r3r0.m179692r(j5r0.m143560H(this.f106534a));
        d3r0Var.m113896a();
        kuq0.m151620b();
        m132377v();
    }

    /* JADX INFO: renamed from: v */
    private void m132377v() {
        this.f106538e = true;
        this.f106537d = null;
        NativeImpl.m5183u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public void m132378w() throws Throwable {
        if (this.f106538e) {
            return;
        }
        if (!l5r0.m152978c(this.f106534a) || (System.currentTimeMillis() - n0r0.m161025l() <= com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS && !b350.m102270b())) {
            c5r0.m108080b().m179946f(this.f106539f, com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        } else {
            m132376u();
        }
    }

    /* JADX INFO: renamed from: x */
    private boolean m132379x() {
        if (this.f106535b == -1) {
            if (nrq0.m164511h() && nrq0.m164517n()) {
                this.f106535b = 1;
            } else {
                this.f106535b = 0;
            }
        }
        return this.f106535b == 1;
    }

    /* JADX INFO: renamed from: y */
    private void m132380y() {
        File[] fileArrListFiles = j5r0.m143554B(this.f106534a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length && i < 5; i++) {
            File file = fileArrListFiles[i];
            if (file.getName().endsWith(".atmp")) {
                bsq0.m106310a().m106312c(file.getAbsolutePath());
            } else {
                try {
                    wxq0 wxq0VarM179672E = r3r0.m179672E(file.getAbsolutePath());
                    if (wxq0VarM179672E != null) {
                        if (wxq0VarM179672E.m208429f() != null) {
                            wxq0VarM179672E.m208429f().put("upload_scene", "launch_scan");
                        }
                        if (C0926e.m5132j(C0926e.m5143u(), wxq0VarM179672E.m208435l(), wxq0VarM179672E.m208433j(), wxq0VarM179672E.m208437n(), wxq0VarM179672E.m208438o())) {
                            r3r0.m179692r(file);
                            r3r0.m179693s(wxq0VarM179672E.m208431h());
                        }
                    } else {
                        r3r0.m179692r(file);
                    }
                } catch (Throwable th) {
                    pwq0.m174074a();
                    pwq0.m174075b("NPTH_CATCH", th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m132381k(boolean z) throws Throwable {
        if (!b350.m102272d() && z) {
            m132375t();
            m132380y();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m132382m() {
        try {
            if (!this.f106538e && lrq0.m155646j(n0r0.m161022i())) {
                c5r0.m108080b().m179945e(this.f106540g);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m132383s() {
        return this.f106538e;
    }

    /* JADX INFO: renamed from: l.guq0$e */
    public static class C17320e {

        /* JADX INFO: renamed from: a */
        File f106550a;

        /* JADX INFO: renamed from: b */
        long f106551b;

        /* JADX INFO: renamed from: c */
        long f106552c;

        /* JADX INFO: renamed from: d */
        CrashType f106553d;

        /* JADX INFO: renamed from: e */
        String f106554e;

        public C17320e(File file, long j, CrashType crashType) {
            this.f106552c = -1L;
            this.f106550a = file;
            this.f106551b = j;
            this.f106553d = crashType;
            this.f106554e = file.getName();
        }

        public C17320e(File file, CrashType crashType) {
            this.f106551b = -1L;
            this.f106552c = -1L;
            this.f106550a = file;
            this.f106553d = crashType;
            this.f106554e = file.getName();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m132362d(File file, C17321f c17321f) {
    }
}
