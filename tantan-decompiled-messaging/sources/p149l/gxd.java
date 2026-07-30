package p149l;

import android.app.Instrumentation;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.util.ArrayMap;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes13.dex */
public class gxd {
    /* JADX INFO: renamed from: f */
    public static Map<String, Object> m128548f(final Context context) {
        final TreeMap treeMap = new TreeMap();
        m128555m(new Runnable() { // from class: l.bxd
            @Override // java.lang.Runnable
            public final void run() {
                gxd.m128553k(treeMap);
            }
        });
        m128555m(new Runnable() { // from class: l.cxd
            @Override // java.lang.Runnable
            public final void run() {
                gxd.m128550h(treeMap);
            }
        });
        m128555m(new Runnable() { // from class: l.dxd
            @Override // java.lang.Runnable
            public final void run() {
                gxd.m128552j(context, treeMap);
            }
        });
        m128555m(new Runnable() { // from class: l.exd
            @Override // java.lang.Runnable
            public final void run() {
                gxd.m128549g(treeMap);
            }
        });
        m128555m(new Runnable() { // from class: l.fxd
            @Override // java.lang.Runnable
            public final void run() {
                gxd.m128551i(context, treeMap);
            }
        });
        return treeMap;
    }

    /* JADX INFO: renamed from: g */
    public static void m128549g(Map<String, Object> map) {
        Class<?> clsM128554l = m128554l();
        if (clsM128554l == null) {
            return;
        }
        ArrayMap arrayMap = (ArrayMap) kmc0.m146494l(kmc0.m146493k(clsM128554l).m146501b("currentActivityThread").m146506h()).m146504e("mActivities").m146506h();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getValue().toString());
        }
        map.put("runningActivities", arrayList);
    }

    /* JADX INFO: renamed from: h */
    public static void m128550h(Map<String, Object> map) {
        Class<?> clsM128554l = m128554l();
        if (clsM128554l == null) {
            return;
        }
        Object objM146506h = kmc0.m146493k(clsM128554l).m146501b("currentActivityThread").m146506h();
        Instrumentation instrumentation = (Instrumentation) kmc0.m146494l(objM146506h).m146501b("getInstrumentation").m146506h();
        Handler handler = (Handler) kmc0.m146494l(objM146506h).m146501b("getHandler").m146506h();
        map.put("instrumentation", instrumentation.getClass().getName());
        map.put("ActivityThread.H", handler.getClass().getName());
    }

    /* JADX INFO: renamed from: i */
    public static void m128551i(Context context, Map<String, Object> map) {
        AssetManager assets = context.getAssets();
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 28) {
            Object[] objArr = (Object[]) kmc0.m146494l(assets).m146501b("getApkAssets").m146506h();
            if (objArr != null) {
                for (Object obj : objArr) {
                    hashSet.add((String) kmc0.m146494l(obj).m146501b("getAssetPath").m146506h());
                }
            }
        } else {
            Object[] objArr2 = (Object[]) kmc0.m146494l(assets).m146504e("mStringBlocks").m146506h();
            if (objArr2 != null && objArr2.length > 0) {
                int length = objArr2.length;
                for (int i = 1; i <= length; i++) {
                    try {
                        hashSet.add((String) kmc0.m146494l(assets).m146502c("getCookieName", Integer.valueOf(i)).m146506h());
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        map.put("app_resource", hashSet);
    }

    /* JADX INFO: renamed from: j */
    public static void m128552j(Context context, Map<String, Object> map) {
        map.put("context.getCacheDir", context.getCacheDir().getAbsolutePath());
        map.put("context.getFilesDir", context.getFilesDir().getAbsolutePath());
        try {
            map.put("context.getExternalCacheDir", context.getExternalCacheDir().getAbsolutePath());
            map.put("context.getExternalFilesDir", context.getExternalFilesDir(null).getAbsolutePath());
        } catch (Throwable unused) {
        }
        if ("mounted".equals(Environment.getExternalStorageState())) {
            map.put("Environment.getExternalStorageDirectory", Environment.getRootDirectory().getAbsolutePath());
            map.put("Environment.getDataDirectory", Environment.getDataDirectory().getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m128553k(Map<String, Object> map) {
        Object objM146506h = kmc0.m146494l(gxd.class.getClassLoader()).m146504e("pathList").m146506h();
        Object[] objArr = (Object[]) kmc0.m146494l(objM146506h).m146504e("dexElements").m146506h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj.toString());
            }
        }
        map.put("dexElements", arrayList);
        Object objM146506h2 = kmc0.m146494l(objM146506h).m146504e("nativeLibraryDirectories").m146506h();
        ArrayList arrayList2 = new ArrayList();
        if (objM146506h2 instanceof List) {
            for (File file : (List) objM146506h2) {
                if (file != null) {
                    arrayList2.add(file.getAbsolutePath());
                }
            }
        } else {
            for (File file2 : (File[]) objM146506h2) {
                if (file2 != null) {
                    arrayList2.add(file2.getAbsolutePath());
                }
            }
        }
        map.put("nativeLibraryDirectories", arrayList2);
        List<File> list = (List) kmc0.m146494l(objM146506h).m146504e("systemNativeLibraryDirectories").m146506h();
        ArrayList arrayList3 = new ArrayList();
        for (File file3 : list) {
            if (file3 != null) {
                arrayList3.add(file3.getAbsolutePath());
            }
        }
        map.put("systemNativeLibraryDirectories", arrayList3);
        Object objM146506h3 = kmc0.m146494l(objM146506h).m146504e("nativeLibraryPathElements").m146506h();
        int length = Array.getLength(objM146506h3);
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(objM146506h3, i);
            if (obj2 != null) {
                arrayList4.add(obj2.toString());
            }
        }
        map.put("nativeLibraryPathElements", arrayList4);
    }

    /* JADX INFO: renamed from: l */
    public static Class<?> m128554l() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m128555m(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable unused) {
        }
    }
}
