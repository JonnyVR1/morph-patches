package p149l;

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
public final class giq0 {

    /* JADX INFO: renamed from: a */
    private static String f102955a = null;

    /* JADX INFO: renamed from: b */
    private static Class<?> f102956b = null;

    /* JADX INFO: renamed from: c */
    private static Field f102957c = null;

    /* JADX INFO: renamed from: d */
    private static Field f102958d = null;

    /* JADX INFO: renamed from: e */
    private static boolean f102959e = false;

    /* JADX INFO: renamed from: a */
    private static long m126386a(int i) {
        if (i < 0) {
            return 0L;
        }
        return ((long) i) * 1024;
    }

    /* JADX INFO: renamed from: b */
    public static ActivityManager.ProcessErrorStateInfo m126387b(Context context, int i) {
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
            if (i == i2 || zqq0.m219872a()) {
                break;
            }
            SystemClock.sleep(200L);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static String m126388c() {
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
    public static void m126389d(Context context, JSONObject jSONObject) {
        try {
            m126390e(jSONObject);
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                m126394i(jSONObject, activityManager);
            }
            m126391f(jSONObject, activityManager);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m126390e(JSONObject jSONObject) throws JSONException {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("dalvikPrivateDirty", m126386a(memoryInfo.dalvikPrivateDirty));
        jSONObject2.put("dalvikPss", m126386a(memoryInfo.dalvikPss));
        jSONObject2.put("dalvikSharedDirty", m126386a(memoryInfo.dalvikSharedDirty));
        jSONObject2.put("nativePrivateDirty", m126386a(memoryInfo.nativePrivateDirty));
        jSONObject2.put("nativePss", m126386a(memoryInfo.nativePss));
        jSONObject2.put("nativeSharedDirty", m126386a(memoryInfo.nativeSharedDirty));
        jSONObject2.put("otherPrivateDirty", m126386a(memoryInfo.otherPrivateDirty));
        jSONObject2.put("otherPss", m126386a(memoryInfo.otherPss));
        jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
        try {
            String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
            if (!TextUtils.isEmpty(memoryStat)) {
                jSONObject2.put("summary.graphics", m126386a(Integer.parseInt(memoryStat)));
            }
        } catch (Throwable unused) {
        }
        jSONObject2.put("totalPrivateClean", gnq0.m127175a(memoryInfo));
        jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
        jSONObject2.put("totalPss", m126386a(memoryInfo.getTotalPss()));
        jSONObject2.put("totalSharedClean", gnq0.m127176b(memoryInfo));
        jSONObject2.put("totalSharedDirty", m126386a(memoryInfo.getTotalSharedDirty()));
        jSONObject2.put("totalSwappablePss", m126386a(gnq0.m127177c(memoryInfo)));
        jSONObject.put("memory_info", jSONObject2);
    }

    /* JADX INFO: renamed from: f */
    private static void m126391f(JSONObject jSONObject, ActivityManager activityManager) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        bjq0.m102193k(jSONObject, "filters", "native_heap_leak", String.valueOf(Debug.getNativeHeapAllocatedSize() > 209715200));
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
        bjq0.m102193k(jSONObject, "filters", "java_heap_leak", String.valueOf(((float) (j - jFreeMemory)) > ((float) jMaxMemory) * 0.95f));
        if (activityManager != null) {
            jSONObject2.put("memory_class", activityManager.getMemoryClass());
            jSONObject2.put("large_memory_class", activityManager.getLargeMemoryClass());
        }
        jSONObject.put("app_memory_info", jSONObject2);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m126392g(Context context) {
        if (context == null) {
            return ykq0.m215154A().m215205H();
        }
        return ykq0.m215154A().m215205H() || m126400o(context);
    }

    /* JADX INFO: renamed from: h */
    private static String m126393h() {
        try {
            return (String) cjq0.m107234b("android.app.ActivityThread", "currentProcessName", new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m126394i(JSONObject jSONObject, ActivityManager activityManager) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        jSONObject2.put("availMem", memoryInfo.availMem);
        jSONObject2.put("lowMemory", memoryInfo.lowMemory);
        jSONObject2.put("threshold", memoryInfo.threshold);
        jSONObject2.put("totalMem", xvq0.m211303a(memoryInfo));
        jSONObject.put("sys_memory_info", jSONObject2);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m126395j(Context context) {
        String strM126397l = m126397l(context);
        if (strM126397l != null && strM126397l.contains(":")) {
            return false;
        }
        if (strM126397l == null || !strM126397l.equals(context.getPackageName())) {
            return strM126397l != null && strM126397l.equals(context.getApplicationInfo().processName);
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    private static String m126396k() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int i = bufferedReader.read();
                    if (i <= 0) {
                        String string = sb.toString();
                        gvq0.m128290a(bufferedReader);
                        return string;
                    }
                    sb.append((char) i);
                }
            } catch (Throwable unused) {
                gvq0.m128290a(bufferedReader);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m126397l(Context context) {
        if (!TextUtils.isEmpty(f102955a)) {
            return f102955a;
        }
        String strM126388c = m126388c();
        f102955a = strM126388c;
        if (!TextUtils.isEmpty(strM126388c)) {
            return f102955a;
        }
        String strM126393h = m126393h();
        f102955a = strM126393h;
        if (!TextUtils.isEmpty(strM126393h)) {
            return f102955a;
        }
        String strM126396k = m126396k();
        f102955a = strM126396k;
        return strM126396k;
    }

    /* JADX INFO: renamed from: m */
    public static String m126398m(Context context) {
        Class<?> clsM126401p = m126401p(context);
        if (f102957c == null && clsM126401p != null) {
            try {
                f102957c = clsM126401p.getDeclaredField("VERSION_NAME");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f102957c;
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
    public static int m126399n(Context context) {
        Class<?> clsM126401p = m126401p(context);
        if (f102958d == null && clsM126401p != null) {
            try {
                f102958d = clsM126401p.getDeclaredField("VERSION_CODE");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f102958d;
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
    private static boolean m126400o(Context context) {
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
    private static Class<?> m126401p(Context context) {
        if (f102956b == null && !f102959e) {
            try {
                f102956b = Class.forName(context.getPackageName() + ".BuildConfig");
            } catch (ClassNotFoundException unused) {
            }
            f102959e = true;
        }
        return f102956b;
    }
}
