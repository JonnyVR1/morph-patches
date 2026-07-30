package p153l;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class lrq0 {

    /* JADX INFO: renamed from: a */
    private static String f133351a = null;

    /* JADX INFO: renamed from: b */
    private static Class<?> f133352b = null;

    /* JADX INFO: renamed from: c */
    private static Field f133353c = null;

    /* JADX INFO: renamed from: d */
    private static Field f133354d = null;

    /* JADX INFO: renamed from: e */
    private static boolean f133355e = false;

    /* JADX INFO: renamed from: a */
    private static long m155637a(int i) {
        if (i < 0) {
            return 0L;
        }
        return ((long) i) * 1024;
    }

    /* JADX INFO: renamed from: b */
    public static ActivityManager.ProcessErrorStateInfo m155638b(Context context, int i) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        int iMyPid = Process.myPid();
        int i2 = 0;
        while (i2 < i) {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.pid == iMyPid && processErrorStateInfo.condition == 2) {
                        return processErrorStateInfo;
                    }
                }
            }
            i2++;
            if (i == i2 || f0r0.m123511a()) {
                break;
            }
            SystemClock.sleep(200L);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static String m155639c() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m155640d(Context context, JSONObject jSONObject) {
        try {
            m155641e(jSONObject);
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                m155645i(jSONObject, activityManager);
            }
            m155642f(jSONObject, activityManager);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m155641e(JSONObject jSONObject) throws JSONException {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("dalvikPrivateDirty", m155637a(memoryInfo.dalvikPrivateDirty));
        jSONObject2.put("dalvikPss", m155637a(memoryInfo.dalvikPss));
        jSONObject2.put("dalvikSharedDirty", m155637a(memoryInfo.dalvikSharedDirty));
        jSONObject2.put("nativePrivateDirty", m155637a(memoryInfo.nativePrivateDirty));
        jSONObject2.put("nativePss", m155637a(memoryInfo.nativePss));
        jSONObject2.put("nativeSharedDirty", m155637a(memoryInfo.nativeSharedDirty));
        jSONObject2.put("otherPrivateDirty", m155637a(memoryInfo.otherPrivateDirty));
        jSONObject2.put("otherPss", m155637a(memoryInfo.otherPss));
        jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
        try {
            String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
            if (!TextUtils.isEmpty(memoryStat)) {
                jSONObject2.put("summary.graphics", m155637a(Integer.parseInt(memoryStat)));
            }
        } catch (Throwable unused) {
        }
        jSONObject2.put("totalPrivateClean", mwq0.m160584a(memoryInfo));
        jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
        jSONObject2.put("totalPss", m155637a(memoryInfo.getTotalPss()));
        jSONObject2.put("totalSharedClean", mwq0.m160585b(memoryInfo));
        jSONObject2.put("totalSharedDirty", m155637a(memoryInfo.getTotalSharedDirty()));
        jSONObject2.put("totalSwappablePss", m155637a(mwq0.m160586c(memoryInfo)));
        jSONObject.put("memory_info", jSONObject2);
    }

    /* JADX INFO: renamed from: f */
    private static void m155642f(JSONObject jSONObject, ActivityManager activityManager) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        gsq0.m132112k(jSONObject, "filters", "native_heap_leak", String.valueOf(Debug.getNativeHeapAllocatedSize() > 209715200));
        jSONObject2.put("native_heap_size", Debug.getNativeHeapSize());
        jSONObject2.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
        jSONObject2.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory();
        long jFreeMemory = runtime.freeMemory();
        long j = runtime.totalMemory();
        jSONObject2.put("max_memory", jMaxMemory);
        jSONObject2.put("free_memory", jFreeMemory);
        jSONObject2.put("total_memory", j);
        gsq0.m132112k(jSONObject, "filters", "java_heap_leak", String.valueOf(((float) (j - jFreeMemory)) > ((float) jMaxMemory) * 0.95f));
        if (activityManager != null) {
            jSONObject2.put("memory_class", activityManager.getMemoryClass());
            jSONObject2.put("large_memory_class", activityManager.getLargeMemoryClass());
        }
        jSONObject.put("app_memory_info", jSONObject2);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m155643g(Context context) {
        if (context == null) {
            return euq0.m122681A().m122732H();
        }
        return euq0.m122681A().m122732H() || m155651o(context);
    }

    /* JADX INFO: renamed from: h */
    private static String m155644h() {
        try {
            return (String) hsq0.m137029b("android.app.ActivityThread", "currentProcessName", new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m155645i(JSONObject jSONObject, ActivityManager activityManager) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        jSONObject2.put("availMem", memoryInfo.availMem);
        jSONObject2.put("lowMemory", memoryInfo.lowMemory);
        jSONObject2.put("threshold", memoryInfo.threshold);
        jSONObject2.put("totalMem", d5r0.m114317a(memoryInfo));
        jSONObject.put("sys_memory_info", jSONObject2);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m155646j(Context context) {
        String strM155648l = m155648l(context);
        if (strM155648l != null && strM155648l.contains(":")) {
            return false;
        }
        if (strM155648l == null || !strM155648l.equals(context.getPackageName())) {
            return strM155648l != null && strM155648l.equals(context.getApplicationInfo().processName);
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    private static String m155647k() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int i = bufferedReader.read();
                    if (i <= 0) {
                        String string = sb.toString();
                        m4r0.m157051a(bufferedReader);
                        return string;
                    }
                    sb.append((char) i);
                }
            } catch (Throwable unused) {
                m4r0.m157051a(bufferedReader);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m155648l(Context context) {
        if (!TextUtils.isEmpty(f133351a)) {
            return f133351a;
        }
        String strM155639c = m155639c();
        f133351a = strM155639c;
        if (!TextUtils.isEmpty(strM155639c)) {
            return f133351a;
        }
        String strM155644h = m155644h();
        f133351a = strM155644h;
        if (!TextUtils.isEmpty(strM155644h)) {
            return f133351a;
        }
        String strM155647k = m155647k();
        f133351a = strM155647k;
        return strM155647k;
    }

    /* JADX INFO: renamed from: m */
    public static String m155649m(Context context) {
        Class<?> clsM155652p = m155652p(context);
        if (f133353c == null && clsM155652p != null) {
            try {
                f133353c = clsM155652p.getDeclaredField("VERSION_NAME");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f133353c;
        if (field == null) {
            return "";
        }
        try {
            return String.valueOf(field.get(null));
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m155650n(Context context) {
        Class<?> clsM155652p = m155652p(context);
        if (f133354d == null && clsM155652p != null) {
            try {
                f133354d = clsM155652p.getDeclaredField("VERSION_CODE");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f133354d;
        if (field == null) {
            return -1;
        }
        try {
            return ((Integer) field.get(null)).intValue();
        } catch (Throwable unused2) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: o */
    private static boolean m155651o(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ComponentName componentName;
        String packageName = context.getPackageName();
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || runningTasks.isEmpty() || (componentName = runningTasks.get(0).topActivity) == null || !packageName.equals(componentName.getPackageName())) ? false : true;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    private static Class<?> m155652p(Context context) {
        if (f133352b == null && !f133355e) {
            try {
                f133352b = Class.forName(context.getPackageName() + ".BuildConfig");
            } catch (ClassNotFoundException unused) {
            }
            f133355e = true;
        }
        return f133352b;
    }
}
