package p153l;

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

/* JADX INFO: loaded from: classes11.dex */
public class uyd {
    /* JADX INFO: renamed from: f */
    public static Map<String, Object> m198592f(final Context context) {
        final TreeMap treeMap = new TreeMap();
        m198599m(new Runnable() { // from class: l.pyd
            @Override // java.lang.Runnable
            public final void run() {
                uyd.m198597k(treeMap);
            }
        });
        m198599m(new Runnable() { // from class: l.qyd
            @Override // java.lang.Runnable
            public final void run() {
                uyd.m198594h(treeMap);
            }
        });
        m198599m(new Runnable() { // from class: l.ryd
            @Override // java.lang.Runnable
            public final void run() {
                uyd.m198596j(context, treeMap);
            }
        });
        m198599m(new Runnable() { // from class: l.syd
            @Override // java.lang.Runnable
            public final void run() {
                uyd.m198593g(treeMap);
            }
        });
        m198599m(new Runnable() { // from class: l.tyd
            @Override // java.lang.Runnable
            public final void run() {
                uyd.m198595i(context, treeMap);
            }
        });
        return treeMap;
    }

    /* JADX INFO: renamed from: g */
    public static void m198593g(Map<String, Object> map) {
        Class<?> clsM198598l = m198598l();
        if (clsM198598l == null) {
            return;
        }
        ArrayMap arrayMap = (ArrayMap) puc0.m173843l(puc0.m173842k(clsM198598l).m173850b("currentActivityThread").m173855h()).m173853e("mActivities").m173855h();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getValue().toString());
        }
        map.put("runningActivities", arrayList);
    }

    /* JADX INFO: renamed from: h */
    public static void m198594h(Map<String, Object> map) {
        Class<?> clsM198598l = m198598l();
        if (clsM198598l == null) {
            return;
        }
        Object objM173855h = puc0.m173842k(clsM198598l).m173850b("currentActivityThread").m173855h();
        Instrumentation instrumentation = (Instrumentation) puc0.m173843l(objM173855h).m173850b("getInstrumentation").m173855h();
        Handler handler = (Handler) puc0.m173843l(objM173855h).m173850b("getHandler").m173855h();
        map.put("instrumentation", instrumentation.getClass().getName());
        map.put("ActivityThread.H", handler.getClass().getName());
    }

    /* JADX INFO: renamed from: i */
    public static void m198595i(Context context, Map<String, Object> map) {
        AssetManager assets = context.getAssets();
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 28) {
            Object[] objArr = (Object[]) puc0.m173843l(assets).m173850b("getApkAssets").m173855h();
            if (objArr != null) {
                for (Object obj : objArr) {
                    hashSet.add((String) puc0.m173843l(obj).m173850b("getAssetPath").m173855h());
                }
            }
        } else {
            Object[] objArr2 = (Object[]) puc0.m173843l(assets).m173853e("mStringBlocks").m173855h();
            if (objArr2 != null && objArr2.length > 0) {
                int length = objArr2.length;
                for (int i = 1; i <= length; i++) {
                    try {
                        hashSet.add((String) puc0.m173843l(assets).m173851c("getCookieName", Integer.valueOf(i)).m173855h());
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        map.put("app_resource", hashSet);
    }

    /* JADX INFO: renamed from: j */
    public static void m198596j(Context context, Map<String, Object> map) {
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
    public static void m198597k(Map<String, Object> map) {
        Object objM173855h = puc0.m173843l(uyd.class.getClassLoader()).m173853e("pathList").m173855h();
        Object[] objArr = (Object[]) puc0.m173843l(objM173855h).m173853e("dexElements").m173855h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj.toString());
            }
        }
        map.put("dexElements", arrayList);
        Object objM173855h2 = puc0.m173843l(objM173855h).m173853e("nativeLibraryDirectories").m173855h();
        ArrayList arrayList2 = new ArrayList();
        if (objM173855h2 instanceof List) {
            for (File file : (List) objM173855h2) {
                if (file != null) {
                    arrayList2.add(file.getAbsolutePath());
                }
            }
        } else {
            for (File file2 : (File[]) objM173855h2) {
                if (file2 != null) {
                    arrayList2.add(file2.getAbsolutePath());
                }
            }
        }
        map.put("nativeLibraryDirectories", arrayList2);
        List<File> list = (List) puc0.m173843l(objM173855h).m173853e("systemNativeLibraryDirectories").m173855h();
        ArrayList arrayList3 = new ArrayList();
        for (File file3 : list) {
            if (file3 != null) {
                arrayList3.add(file3.getAbsolutePath());
            }
        }
        map.put("systemNativeLibraryDirectories", arrayList3);
        Object objM173855h3 = puc0.m173843l(objM173855h).m173853e("nativeLibraryPathElements").m173855h();
        int length = Array.getLength(objM173855h3);
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(objM173855h3, i);
            if (obj2 != null) {
                arrayList4.add(obj2.toString());
            }
        }
        map.put("nativeLibraryPathElements", arrayList4);
    }

    /* JADX INFO: renamed from: l */
    public static Class<?> m198598l() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m198599m(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable unused) {
        }
    }
}
