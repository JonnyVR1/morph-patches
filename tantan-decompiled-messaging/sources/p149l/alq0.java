package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.apm.lite.CrashType;
import com.apm.lite.nativecrash.NativeImpl;
import com.apm.lite.p009j.C0922e;
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
public final class alq0 {

    /* JADX INFO: renamed from: h */
    private static volatile alq0 f70479h;

    /* JADX INFO: renamed from: a */
    private Context f70480a;

    /* JADX INFO: renamed from: c */
    private C15663f f70482c;

    /* JADX INFO: renamed from: d */
    private HashMap<String, C15663f> f70483d;

    /* JADX INFO: renamed from: b */
    private int f70481b = -1;

    /* JADX INFO: renamed from: e */
    private volatile boolean f70484e = false;

    /* JADX INFO: renamed from: f */
    private Runnable f70485f = new RunnableC15660c();

    /* JADX INFO: renamed from: g */
    private Runnable f70486g = new RunnableC15661d();

    /* JADX INFO: renamed from: l.alq0$a */
    public class C15658a implements plq0.InterfaceC19277a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ qoq0 f70487a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ File f70488b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C15663f f70489c;

        public C15658a(qoq0 qoq0Var, File file, C15663f c15663f) {
            this.f70487a = qoq0Var;
            this.f70488b = file;
            this.f70489c = c15663f;
        }

        @Override // p149l.plq0.InterfaceC19277a
        /* JADX INFO: renamed from: a */
        public void mo97441a(JSONObject jSONObject) {
            C0922e.m5119g(this.f70487a.m175754a(), jSONObject.toString(), new File(this.f70488b, "logZip"), dwq0.m113915c(alq0.this.f70480a, this.f70489c.f70501a));
        }
    }

    /* JADX INFO: renamed from: l.alq0$b */
    public class C15659b implements plq0.InterfaceC19277a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ File f70491a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C15663f f70492b;

        public C15659b(File file, C15663f c15663f) {
            this.f70491a = file;
            this.f70492b = c15663f;
        }

        @Override // p149l.plq0.InterfaceC19277a
        /* JADX INFO: renamed from: a */
        public void mo97441a(JSONObject jSONObject) {
            soq0.m185294a().m185296c(jSONObject, this.f70491a, dwq0.m113915c(alq0.this.f70480a, this.f70492b.f70501a));
        }
    }

    /* JADX INFO: renamed from: l.alq0$c */
    public class RunnableC15660c implements Runnable {
        public RunnableC15660c() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            alq0.this.m97435w();
        }
    }

    /* JADX INFO: renamed from: l.alq0$d */
    public class RunnableC15661d implements Runnable {
        public RunnableC15661d() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            alq0.this.m97433u();
        }
    }

    /* JADX INFO: renamed from: l.alq0$f */
    public static class C15663f {

        /* JADX INFO: renamed from: a */
        String f70501a;

        /* JADX INFO: renamed from: d */
        C15662e f70504d;

        /* JADX INFO: renamed from: e */
        C15662e f70505e;

        /* JADX INFO: renamed from: b */
        List<C15662e> f70502b = new ArrayList();

        /* JADX INFO: renamed from: c */
        List<C15662e> f70503c = new ArrayList();

        /* JADX INFO: renamed from: f */
        boolean f70506f = false;

        /* JADX INFO: renamed from: g */
        int f70507g = 0;

        public C15663f(String str) {
            this.f70501a = str;
        }
    }

    private alq0(Context context) {
        this.f70480a = context;
    }

    /* JADX INFO: renamed from: a */
    public static alq0 m97416a() {
        if (f70479h == null) {
            synchronized (alq0.class) {
                try {
                    if (f70479h == null) {
                        f70479h = new alq0(hrq0.m132700i());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f70479h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private qoq0 m97417b(File file, CrashType crashType, String str, long j, long j2) {
        qoq0 qoq0Var;
        Object obj = crashType;
        try {
            try {
                if (file.isFile()) {
                    luq0.m151804r(file);
                    return null;
                }
                boolean z = obj == CrashType.LAUNCH;
                if (obj == null) {
                    try {
                        return luq0.m151782C(new File(file, file.getName()).getAbsolutePath());
                    } catch (Throwable th) {
                        th = th;
                        qoq0Var = 0;
                        luq0.m151804r(file);
                        jnq0.m142383a();
                        jnq0.m142384b("NPTH_CATCH", th);
                        return qoq0Var;
                    }
                }
                qoq0 qoq0VarM151793g = luq0.m151793g(file, crashType);
                try {
                    JSONObject jSONObjectM175759f = qoq0VarM151793g.m175759f();
                    try {
                        if (qoq0VarM151793g.m175759f() != null) {
                            boolean z2 = z;
                            if (obj == CrashType.ANR) {
                                return qoq0VarM151793g;
                            }
                            jSONObjectM175759f.put("crash_time", j);
                            try {
                                jSONObjectM175759f.put("app_start_time", j2);
                                JSONObject jSONObjectOptJSONObject = jSONObjectM175759f.optJSONObject("header");
                                try {
                                    if (jSONObjectOptJSONObject == null) {
                                        jSONObjectOptJSONObject = bnq0.m102833b(this.f70480a, j).m102857s();
                                    } else if (z2) {
                                        jSONObjectM175759f.remove("header");
                                    }
                                    String strOptString = jSONObjectOptJSONObject.optString("sdk_version_name", null);
                                    if (strOptString == null) {
                                        strOptString = "0.0.2";
                                    }
                                    bjq0.m102193k(jSONObjectM175759f, "filters", Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, strOptString);
                                    if (luq0.m151806t(jSONObjectM175759f.optJSONArray("logcat"))) {
                                        jSONObjectM175759f.put("logcat", bvq0.m104074b(str));
                                    }
                                    bjq0.m102193k(jSONObjectM175759f, "filters", "has_dump", "true");
                                    bjq0.m102193k(jSONObjectM175759f, "filters", "has_logcat", String.valueOf(!nvq0.m161755h(jSONObjectM175759f, "logcat")));
                                    bjq0.m102193k(jSONObjectM175759f, "filters", "memory_leak", String.valueOf(bjq0.m102199v(str)));
                                    bjq0.m102193k(jSONObjectM175759f, "filters", "fd_leak", String.valueOf(bjq0.m102200z(str)));
                                    bjq0.m102193k(jSONObjectM175759f, "filters", "threads_leak", String.valueOf(bjq0.m102192B(str)));
                                    bjq0.m102193k(jSONObjectM175759f, "filters", "is_64_devices", String.valueOf(bnq0.m102836f()));
                                    bjq0.m102193k(jSONObjectM175759f, "filters", "is_64_runtime", String.valueOf(NativeImpl.m5166n()));
                                    bjq0.m102193k(jSONObjectM175759f, "filters", "is_x86_devices", String.valueOf(bnq0.m102840j()));
                                    bjq0.m102193k(jSONObjectM175759f, "filters", "has_meminfo_file", String.valueOf(bjq0.m102197p(str)));
                                    bjq0.m102193k(jSONObjectM175759f, "filters", "is_root", String.valueOf(hnq0.m131989y()));
                                    jSONObjectM175759f.put("launch_did", ciq0.m107095a(this.f70480a));
                                    jSONObjectM175759f.put("crash_uuid", file.getName());
                                    jSONObjectM175759f.put("jiffy", yvq0.m216227a());
                                    try {
                                        long j3 = Long.parseLong(elq0.m117151a(j, str));
                                        bjq0.m102193k(jSONObjectM175759f, "filters", "lastAliveTime", Math.abs(j3 - j) < com.clevertap.android.sdk.Constants.ONE_MIN_IN_MILLIS ? "< 60s" : "> 60s");
                                        jSONObjectM175759f.put("lastAliveTime", String.valueOf(j3));
                                    } catch (Throwable unused) {
                                        jSONObjectM175759f.put("lastAliveTime", "unknown");
                                        bjq0.m102193k(jSONObjectM175759f, "filters", "lastAliveTime", "unknown");
                                    }
                                    jSONObjectM175759f.put("has_dump", "true");
                                    if (jSONObjectM175759f.opt(PlaceTypes.STORAGE) == null) {
                                        bjq0.m102196n(jSONObjectM175759f, fxq0.m123680b(hrq0.m132700i()));
                                    }
                                    if (bnq0.m102842n(jSONObjectOptJSONObject)) {
                                        bjq0.m102193k(jSONObjectM175759f, "filters", "unauthentic_version", "unauthentic_version");
                                    }
                                    qoq0VarM151793g.m175759f().put("upload_scene", "launch_scan");
                                    if (z2) {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObjectM175759f.put("event_type", "start_crash");
                                        jSONObjectM175759f.put("stack", jSONObjectM175759f.remove("data"));
                                        jSONObject.put("data", new JSONArray().put(jSONObjectM175759f));
                                        jSONObject.put("header", jSONObjectOptJSONObject);
                                        qoq0 qoq0Var2 = qoq0VarM151793g;
                                        qoq0Var2.m175757d(jSONObject);
                                        obj = qoq0Var2;
                                    } else {
                                        obj = qoq0VarM151793g;
                                        jSONObjectM175759f.put("isJava", 1);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    qoq0Var = qoq0VarM151793g;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                obj = qoq0VarM151793g;
                                qoq0Var = obj;
                            }
                            qoq0Var = obj;
                        } else {
                            obj = qoq0VarM151793g;
                            luq0.m151804r(file);
                        }
                        return obj;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    obj = qoq0VarM151793g;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            qoq0Var = 0;
        }
        luq0.m151804r(file);
        jnq0.m142383a();
        jnq0.m142384b("NPTH_CATCH", th);
        return qoq0Var;
    }

    /* JADX INFO: renamed from: c */
    private JSONObject m97418c(hnq0 hnq0Var) {
        JSONObject jSONObjectM131995k = hnq0Var.m131995k();
        if (jSONObjectM131995k != null && jSONObjectM131995k.length() != 0) {
            return jSONObjectM131995k;
        }
        if (hrq0.m132697f()) {
            hnq0Var.m132002x();
        }
        if (!hnq0Var.m131994j()) {
            hnq0Var.m132001w();
            return null;
        }
        if (!hnq0Var.m131997p()) {
            hnq0Var.m132001w();
            return null;
        }
        if (hnq0Var.m131998r()) {
            hnq0Var.m132001w();
            return null;
        }
        hnq0Var.m131996m();
        return hnq0Var.m132000v();
    }

    /* JADX INFO: renamed from: e */
    private void m97420e(HashMap<String, C15663f> map) {
        File[] fileArrListFiles = dwq0.m113933u(this.f70480a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length && i < 5; i++) {
            File file = fileArrListFiles[i];
            try {
                if (file.isDirectory() && file.getName().endsWith("G")) {
                    String name = file.getName();
                    C15663f c15663f = map.get(name);
                    if (c15663f == null) {
                        c15663f = new C15663f(name);
                        map.put(name, c15663f);
                    }
                    JSONArray jSONArrayM189920b = toq0.m189920b(dwq0.m113909I(file), dwq0.m113910J(file));
                    int length = jSONArrayM189920b.length();
                    c15663f.f70507g = length;
                    if (length > 0) {
                        try {
                            luq0.m151798l(dwq0.m113911K(file), jSONArrayM189920b, false);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    luq0.m151804r(file);
                }
            } catch (Throwable th) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", th);
                luq0.m151804r(file);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private void m97421f(HashMap<String, C15663f> map, C15663f c15663f) {
        File[] fileArrListFiles = dwq0.m113927o(this.f70480a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length && i < 5; i++) {
            File file = fileArrListFiles[i];
            try {
                if (file.isDirectory() && file.getName().endsWith("G")) {
                    String name = file.getName();
                    C15663f c15663f2 = map.get(name);
                    if (c15663f2 == null) {
                        c15663f2 = new C15663f(name);
                        map.put(name, c15663f2);
                    }
                    c15663f2.f70503c.add(new C15662e(file, CrashType.NATIVE));
                } else {
                    luq0.m151804r(file);
                }
            } catch (Throwable th) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", th);
                luq0.m151804r(file);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m97422g(HashMap<String, C15663f> map, C15663f c15663f, File file, String str) {
        if (!str.endsWith("G")) {
            luq0.m151804r(file);
            return;
        }
        String[] strArrSplit = str.split("_");
        CrashType crashType = null;
        if (strArrSplit.length < 5) {
            c15663f.f70502b.add(new C15662e(file, null));
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
            C15663f c15663f2 = map.get(str2);
            if (c15663f2 == null) {
                c15663f2 = new C15663f(str2);
                map.put(str2, c15663f2);
            }
            C15662e c15662e = new C15662e(file, j, crashType);
            c15662e.f70498c = j2;
            C15662e c15662e2 = c15663f2.f70504d;
            if ((c15662e2 == null || c15662e2.f70497b > c15662e.f70497b) && crashType != null && crashType != CrashType.ANR && !str.contains("ignore")) {
                c15663f2.f70504d = c15662e;
            }
            c15663f2.f70502b.add(c15662e);
        } catch (Throwable unused) {
            c15663f.f70502b.add(new C15662e(file, null));
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", new RuntimeException("err format crashTime:".concat(str)));
        }
    }

    /* JADX INFO: renamed from: h */
    private void m97423h(C15663f c15663f) {
        luq0.m151804r(dwq0.m113915c(this.f70480a, c15663f.f70501a));
        luq0.m151804r(dwq0.m113920h(this.f70480a, c15663f.f70501a));
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0135 A[Catch: all -> 0x0145, TryCatch #2 {all -> 0x0145, blocks: (B:66:0x0129, B:68:0x0135, B:71:0x0147), top: B:82:0x0129 }] */
    /* JADX INFO: renamed from: i */
    private void m97424i(C15663f c15663f, boolean z, xtq0 xtq0Var) {
        Iterator<C15662e> it;
        if (c15663f.f70502b.isEmpty()) {
            return;
        }
        if (c15663f.f70505e == null) {
            c15663f.f70505e = c15663f.f70504d;
        }
        Iterator<C15662e> it2 = c15663f.f70502b.iterator();
        while (it2.hasNext()) {
            C15662e next = it2.next();
            try {
                File file = next.f70496a;
                CrashType crashType = next.f70499d;
                try {
                    qoq0 qoq0VarM97417b = m97417b(file, crashType, c15663f.f70501a, next.f70497b, next.f70498c);
                    if (qoq0VarM97417b != null) {
                        JSONObject jSONObjectM175759f = qoq0VarM97417b.m175759f();
                        if (jSONObjectM175759f != null) {
                            JSONObject jSONObjectOptJSONObject = jSONObjectM175759f.optJSONObject("header");
                            if (jSONObjectOptJSONObject != null) {
                                if (crashType != null || (!new File(file, file.getName()).exists() && file.getName().split("_").length >= 5)) {
                                    File fileM170242a = plq0.m170242a(file);
                                    if (fileM170242a.exists()) {
                                        try {
                                            JSONArray jSONArray = new JSONArray(luq0.m151811y(fileM170242a));
                                            JSONObject jSONObjectOptJSONObject2 = crashType == CrashType.LAUNCH ? ((JSONArray) jSONObjectM175759f.opt("data")).optJSONObject(0) : jSONObjectM175759f;
                                            try {
                                                if (z) {
                                                    it = it2;
                                                } else {
                                                    it = it2;
                                                    try {
                                                        if (c15663f.f70505e == next) {
                                                        }
                                                        try {
                                                            bjq0.m102193k(jSONObjectOptJSONObject2, "filters", "aid", String.valueOf(jSONObjectOptJSONObject.opt("aid")));
                                                            bjq0.m102193k(jSONObjectOptJSONObject2, "filters", "has_ignore", String.valueOf(next.f70500e.contains("ignore")));
                                                        } catch (Throwable th) {
                                                            jnq0.m142383a();
                                                            jnq0.m142384b("NPTH_CATCH", th);
                                                        }
                                                        bjq0.m102193k(jSONObjectOptJSONObject2, "filters", "start_uuid", c15663f.f70501a);
                                                        bjq0.m102193k(jSONObjectOptJSONObject2, "filters", "leak_threads_count", String.valueOf(c15663f.f70507g));
                                                        bjq0.m102193k(jSONObjectOptJSONObject2, "filters", "crash_thread_name", jSONObjectOptJSONObject2.optString("crash_thread_name", "unknown"));
                                                        plq0.m170249h(jSONObjectM175759f, jSONArray, new C15658a(qoq0VarM97417b, file, c15663f));
                                                        if (!luq0.m151804r(file)) {
                                                            yiq0.m215005a().m215008c(ziq0.m219063a(file.getAbsolutePath()));
                                                        }
                                                        mtq0.m156350b(dwq0.m113920h(hrq0.m132700i(), c15663f.f70501a), file.getName());
                                                        fnq0.m122341b(crashType, jSONObjectM175759f);
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        jnq0.m142383a();
                                                        jnq0.m142384b("NPTH_CATCH", th);
                                                        luq0.m151804r(next.f70496a);
                                                        it2 = it;
                                                    }
                                                    it2 = it;
                                                }
                                                if (next.f70500e.contains("ignore")) {
                                                    bjq0.m102193k(jSONObjectOptJSONObject2, "filters", "aid", String.valueOf(jSONObjectOptJSONObject.opt("aid")));
                                                    bjq0.m102193k(jSONObjectOptJSONObject2, "filters", "has_ignore", String.valueOf(next.f70500e.contains("ignore")));
                                                } else {
                                                    if (xtq0Var != null && !xtq0Var.m211020c(jSONObjectOptJSONObject2.optString("crash_md5", "default"))) {
                                                        luq0.m151804r(next.f70496a);
                                                    }
                                                    it2 = it;
                                                }
                                                plq0.m170249h(jSONObjectM175759f, jSONArray, new C15658a(qoq0VarM97417b, file, c15663f));
                                                if (!luq0.m151804r(file)) {
                                                    yiq0.m215005a().m215008c(ziq0.m219063a(file.getAbsolutePath()));
                                                }
                                                mtq0.m156350b(dwq0.m113920h(hrq0.m132700i(), c15663f.f70501a), file.getName());
                                                fnq0.m122341b(crashType, jSONObjectM175759f);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                jnq0.m142383a();
                                                jnq0.m142384b("NPTH_CATCH", th);
                                                luq0.m151804r(next.f70496a);
                                            }
                                            bjq0.m102193k(jSONObjectOptJSONObject2, "filters", "start_uuid", c15663f.f70501a);
                                            bjq0.m102193k(jSONObjectOptJSONObject2, "filters", "leak_threads_count", String.valueOf(c15663f.f70507g));
                                            bjq0.m102193k(jSONObjectOptJSONObject2, "filters", "crash_thread_name", jSONObjectOptJSONObject2.optString("crash_thread_name", "unknown"));
                                        } catch (Throwable unused) {
                                            it = it2;
                                        }
                                        it2 = it;
                                    }
                                } else if (C0922e.m5117e(qoq0VarM97417b.m175754a(), jSONObjectM175759f.toString(), false).m151903a()) {
                                }
                            }
                        }
                    }
                    luq0.m151804r(file);
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
    private boolean m97426l(File file) {
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
    private void m97427n(HashMap<String, C15663f> map, C15663f c15663f) {
        File[] fileArrListFiles = dwq0.m113914b(this.f70480a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        Arrays.sort(fileArrListFiles, Collections.reverseOrder());
        for (File file : fileArrListFiles) {
            try {
                if (yiq0.m215005a().m215009d(file.getAbsolutePath())) {
                    luq0.m151804r(file);
                } else if (!luq0.m151786G(file) && !aiq0.m96898e().m96919p(file.getName())) {
                    if (file.isFile()) {
                        luq0.m151804r(file);
                    } else {
                        m97422g(map, c15663f, file, file.getName());
                    }
                }
            } catch (Throwable th) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", th);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private void m97428o(C15663f c15663f, boolean z, xtq0 xtq0Var) {
        boolean z2;
        if (c15663f.f70503c.size() <= 1 && c15663f.f70503c.isEmpty()) {
            c15663f.f70505e = c15663f.f70504d;
            return;
        }
        boolean zM123554c = fwq0.m123554c(this.f70480a);
        c15663f.f70505e = c15663f.f70504d;
        hnq0 hnq0Var = new hnq0(this.f70480a);
        for (C15662e c15662e : c15663f.f70503c) {
            File file = c15662e.f70496a;
            try {
                hnq0Var.m131992d(file);
                JSONObject jSONObjectM97418c = m97418c(hnq0Var);
                if (jSONObjectM97418c == null || jSONObjectM97418c.length() == 0) {
                    z2 = zM123554c;
                    hnq0Var.m132001w();
                    zM123554c = z2;
                } else {
                    if (jSONObjectM97418c.length() != 0) {
                        if (z) {
                            z2 = zM123554c;
                            if (xtq0Var != null && !xtq0Var.m211020c("default")) {
                                hnq0Var.m132001w();
                            }
                        } else {
                            long jOptLong = jSONObjectM97418c.optLong("crash_time");
                            try {
                                C15662e c15662e2 = c15663f.f70505e;
                                if (c15662e2 == null) {
                                    c15663f.f70505e = c15662e;
                                    c15663f.f70506f = true;
                                    if (xtq0Var == null || xtq0Var.m211020c("default")) {
                                        z2 = zM123554c;
                                    } else {
                                        hnq0Var.m132001w();
                                    }
                                    jnq0.m142383a();
                                    jnq0.m142384b("NPTH_CATCH", th);
                                    luq0.m151804r(file);
                                } else {
                                    z2 = zM123554c;
                                    try {
                                        if (c15663f.f70506f || jOptLong >= c15662e2.f70497b) {
                                            bjq0.m102193k(jSONObjectM97418c, "filters", "aid", String.valueOf(jSONObjectM97418c.optJSONObject("header").opt("aid")));
                                        } else {
                                            c15663f.f70505e = c15662e;
                                            if (xtq0Var == null || xtq0Var.m211020c("default")) {
                                                if (!m97426l(file)) {
                                                    m97419d(file, c15663f);
                                                }
                                                c15663f.f70506f = true;
                                            } else {
                                                hnq0Var.m132001w();
                                                zM123554c = z2;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z2 = zM123554c;
                            }
                        }
                        try {
                            bjq0.m102193k(jSONObjectM97418c, "filters", "start_uuid", c15663f.f70501a);
                            bjq0.m102193k(jSONObjectM97418c, "filters", "crash_thread_name", jSONObjectM97418c.optString("crash_thread_name", "unknown"));
                            if (z2) {
                                fnq0.C16889b c16889b = new fnq0.C16889b(jSONObjectM97418c, CrashType.NATIVE);
                                File fileM170242a = plq0.m170242a(file);
                                JSONArray jSONArrayM118500h = null;
                                try {
                                    if (fileM170242a.exists()) {
                                        jSONArrayM118500h = new JSONArray(luq0.m151811y(fileM170242a));
                                    }
                                } catch (Throwable unused) {
                                }
                                if (jSONArrayM118500h == null) {
                                    jSONArrayM118500h = ewq0.m118487c().m118500h(c16889b.m122344b() == -1 ? System.currentTimeMillis() : c16889b.m122344b());
                                }
                                plq0.m170249h(jSONObjectM97418c, plq0.m170246e(c16889b.m122345c(), c16889b.m122343a(), jSONArrayM118500h), new C15659b(file, c15663f));
                                if (!hnq0Var.m132001w()) {
                                    hnq0Var.m131999s();
                                }
                                mtq0.m156350b(dwq0.m113920h(hrq0.m132700i(), c15663f.f70501a), file.getName());
                            }
                            fnq0.m122341b(CrashType.NATIVE, jSONObjectM97418c);
                        } catch (Throwable th3) {
                            th = th3;
                            jnq0.m142383a();
                            jnq0.m142384b("NPTH_CATCH", th);
                            luq0.m151804r(file);
                        }
                    } else {
                        z2 = zM123554c;
                    }
                    zM123554c = z2;
                }
            } catch (Throwable th4) {
                th = th4;
                z2 = zM123554c;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private void m97431r(HashMap<String, C15663f> map, C15663f c15663f) {
        luq0.m151804r(dwq0.m113919g(this.f70480a));
    }

    /* JADX INFO: renamed from: t */
    private void m97432t() throws Throwable {
        if (this.f70482c != null) {
            return;
        }
        this.f70482c = new C15663f("old_uuid");
        HashMap<String, C15663f> map = new HashMap<>();
        this.f70483d = map;
        m97420e(map);
        m97427n(this.f70483d, this.f70482c);
        m97431r(this.f70483d, this.f70482c);
        m97421f(this.f70483d, this.f70482c);
        m97428o(this.f70482c, true, null);
        m97424i(this.f70482c, true, null);
        this.f70482c = null;
        if (this.f70483d.isEmpty()) {
            m97434v();
        } else {
            m97435w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m97433u() throws Throwable {
        if (this.f70484e || this.f70483d == null) {
            return;
        }
        if (!fwq0.m123554c(this.f70480a)) {
            m97434v();
        }
        boolean zM97436x = m97436x();
        xtq0 xtq0Var = new xtq0(this.f70480a);
        Iterator<C15663f> it = this.f70483d.values().iterator();
        while (it.hasNext()) {
            m97428o(it.next(), zM97436x, xtq0Var);
        }
        Iterator<C15663f> it2 = this.f70483d.values().iterator();
        while (it2.hasNext()) {
            m97424i(it2.next(), zM97436x, xtq0Var);
        }
        Iterator<C15663f> it3 = this.f70483d.values().iterator();
        while (it3.hasNext()) {
            m97423h(it3.next());
        }
        luq0.m151804r(dwq0.m113908H(this.f70480a));
        xtq0Var.m211019a();
        elq0.m117152b();
        m97434v();
    }

    /* JADX INFO: renamed from: v */
    private void m97434v() {
        this.f70484e = true;
        this.f70483d = null;
        NativeImpl.m5173u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public void m97435w() throws Throwable {
        if (this.f70484e) {
            return;
        }
        if (!fwq0.m123554c(this.f70480a) || (System.currentTimeMillis() - hrq0.m132703l() <= com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS && !mu40.m156373b())) {
            wvq0.m205758b().m151993f(this.f70485f, com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        } else {
            m97433u();
        }
    }

    /* JADX INFO: renamed from: x */
    private boolean m97436x() {
        if (this.f70481b == -1) {
            if (iiq0.m136433h() && iiq0.m136439n()) {
                this.f70481b = 1;
            } else {
                this.f70481b = 0;
            }
        }
        return this.f70481b == 1;
    }

    /* JADX INFO: renamed from: y */
    private void m97437y() {
        File[] fileArrListFiles = dwq0.m113902B(this.f70480a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length && i < 5; i++) {
            File file = fileArrListFiles[i];
            if (file.getName().endsWith(".atmp")) {
                wiq0.m203345a().m203347c(file.getAbsolutePath());
            } else {
                try {
                    qoq0 qoq0VarM151784E = luq0.m151784E(file.getAbsolutePath());
                    if (qoq0VarM151784E != null) {
                        if (qoq0VarM151784E.m175759f() != null) {
                            qoq0VarM151784E.m175759f().put("upload_scene", "launch_scan");
                        }
                        if (C0922e.m5122j(C0922e.m5133u(), qoq0VarM151784E.m175765l(), qoq0VarM151784E.m175763j(), qoq0VarM151784E.m175767n(), qoq0VarM151784E.m175768o())) {
                            luq0.m151804r(file);
                            luq0.m151805s(qoq0VarM151784E.m175761h());
                        }
                    } else {
                        luq0.m151804r(file);
                    }
                } catch (Throwable th) {
                    jnq0.m142383a();
                    jnq0.m142384b("NPTH_CATCH", th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m97438k(boolean z) throws Throwable {
        if (!mu40.m156375d() && z) {
            m97432t();
            m97437y();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m97439m() {
        try {
            if (!this.f70484e && giq0.m126395j(hrq0.m132700i())) {
                wvq0.m205758b().m151992e(this.f70486g);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m97440s() {
        return this.f70484e;
    }

    /* JADX INFO: renamed from: l.alq0$e */
    public static class C15662e {

        /* JADX INFO: renamed from: a */
        File f70496a;

        /* JADX INFO: renamed from: b */
        long f70497b;

        /* JADX INFO: renamed from: c */
        long f70498c;

        /* JADX INFO: renamed from: d */
        CrashType f70499d;

        /* JADX INFO: renamed from: e */
        String f70500e;

        public C15662e(File file, long j, CrashType crashType) {
            this.f70498c = -1L;
            this.f70496a = file;
            this.f70497b = j;
            this.f70499d = crashType;
            this.f70500e = file.getName();
        }

        public C15662e(File file, CrashType crashType) {
            this.f70497b = -1L;
            this.f70498c = -1L;
            this.f70496a = file;
            this.f70499d = crashType;
            this.f70500e = file.getName();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m97419d(File file, C15663f c15663f) {
    }
}
