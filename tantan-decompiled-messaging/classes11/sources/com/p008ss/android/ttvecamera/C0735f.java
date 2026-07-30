package com.p008ss.android.ttvecamera;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Range;
import android.util.Size;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.f */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0735f {

    /* JADX INFO: renamed from: a */
    private static String f9102a = null;

    /* JADX INFO: renamed from: b */
    private static boolean f9103b = false;

    /* JADX INFO: renamed from: e */
    private static boolean f9106e;

    /* JADX INFO: renamed from: c */
    private static String[] f9104c = {"SDM632", "SDM636", "SDM638", "SDM660", "SDM670", "SDM710", "SDM720", "MSM8996", "MSM8998", "SDM845", "KIRIN980", "KIRIN970", "KIRIN710", "HI3660", "MT6771", "Exynos 9810", "Exynos 8895"};

    /* JADX INFO: renamed from: d */
    private static String[] f9105d = {"BAC-AL00", "ANE-AL00", "HWI-AL00"};

    /* JADX INFO: renamed from: f */
    private static Class f9107f = null;

    /* JADX INFO: renamed from: g */
    private static Field f9108g = null;

    /* JADX INFO: renamed from: h */
    private static Method f9109h = null;

    /* JADX INFO: renamed from: i */
    public static byte f9110i = 0;

    /* JADX INFO: renamed from: j */
    static final ArrayList<TEFrameSizei> f9111j = new ArrayList<>(Arrays.asList(new TEFrameSizei(160, 120), new TEFrameSizei(240, 160), new TEFrameSizei(320, 240), new TEFrameSizei(400, 240), new TEFrameSizei(480, 320), new TEFrameSizei(640, 360), new TEFrameSizei(640, 480), new TEFrameSizei(768, 480), new TEFrameSizei(854, 480), new TEFrameSizei(800, 600), new TEFrameSizei(960, 540), new TEFrameSizei(960, 640), new TEFrameSizei(1024, 576), new TEFrameSizei(1024, 600), new TEFrameSizei(1280, 720), new TEFrameSizei(1280, 1024), new TEFrameSizei(WBConstants.SDK_NEW_PAY_VERSION, 1080), new TEFrameSizei(WBConstants.SDK_NEW_PAY_VERSION, 1440), new TEFrameSizei(2560, 1440), new TEFrameSizei(3840, 2160)));

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.f$a */
    public static class a implements Comparator<TEFrameSizei> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
            return (tEFrameSizei2.width * tEFrameSizei2.height) - (tEFrameSizei.width * tEFrameSizei.height);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.f$b */
    public static class b implements Comparator<TEFrameSizei> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
            return (tEFrameSizei2.width * tEFrameSizei2.height) - (tEFrameSizei.width * tEFrameSizei.height);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.f$c */
    public static class c implements Comparator<int[]> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr2[0] - iArr[0];
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.f$d */
    public static class d implements Comparator<int[]> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int[] f9112a;

        public d(int[] iArr) {
            this.f9112a = iArr;
        }

        /* JADX INFO: renamed from: b */
        private int m11076b(int[] iArr) {
            int[] iArr2 = this.f9112a;
            int i = iArr2[0];
            int i2 = iArr[0];
            int i3 = i > i2 ? (i - i2) * 2 : (i2 - i) * 3;
            int i4 = iArr2[1];
            int i5 = iArr[1];
            return i3 + (i4 > i5 ? (i4 - i5) * 4 : i5 - i4);
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return m11076b(iArr) - m11076b(iArr2);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.f$e */
    public static class e implements Comparator<int[]> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr2[1] - iArr[1];
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.f$f */
    public static class f implements Comparator<TEFrameSizei> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
            return (tEFrameSizei2.width * tEFrameSizei2.height) - (tEFrameSizei.width * tEFrameSizei.height);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.f$g */
    public static class g implements Comparator<TEFrameSizei> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
            return (tEFrameSizei2.width * tEFrameSizei2.height) - (tEFrameSizei.width * tEFrameSizei.height);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.f$h */
    public static class h implements Comparator<TEFrameSizei> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
            return (tEFrameSizei2.width * tEFrameSizei2.height) - (tEFrameSizei.width * tEFrameSizei.height);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.f$i */
    public static class i implements Comparator<TEFrameSizei> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
            return (tEFrameSizei2.width * tEFrameSizei2.height) - (tEFrameSizei.width * tEFrameSizei.height);
        }
    }

    static {
        f9106e = false;
        String strM11061l = m11061l();
        if (!TextUtils.isEmpty(strM11061l)) {
            strM11061l = strM11061l.toUpperCase();
            for (String str : f9104c) {
                if (strM11061l.contains(str)) {
                    f9103b = true;
                    break;
                }
            }
        }
        String upperCase = Build.MODEL;
        if (!TextUtils.isEmpty(upperCase)) {
            upperCase = upperCase.toUpperCase();
            for (String str2 : f9105d) {
                if (str2.equals(upperCase)) {
                    f9106e = true;
                    break;
                }
            }
        }
        C0743g.m11169e("TECameraUtils", "cpuHardware: " + strM11061l + ", isHighPerformanceCpu: " + f9103b + "model: " + upperCase + ", isInAbortCapturesBlockList: " + f9106e);
    }

    /* JADX INFO: renamed from: a */
    private static TEFrameSizei m11050a(@NonNull List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        TEFrameSizei tEFrameSizei2 = null;
        for (TEFrameSizei tEFrameSizei3 : list) {
            int i2 = tEFrameSizei3.width;
            if (i2 > tEFrameSizei.width && tEFrameSizei3.height > tEFrameSizei.height && (tEFrameSizei2 == null || i2 < tEFrameSizei2.width)) {
                tEFrameSizei2 = tEFrameSizei3;
            }
        }
        if (tEFrameSizei2 != null) {
            return tEFrameSizei2;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static TEFrameSizei m11051b(@NonNull List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        int i2;
        TEFrameSizei tEFrameSizei2 = null;
        if (list != null && list.size() > 0) {
            int i3 = tEFrameSizei.width;
            int i4 = tEFrameSizei.height;
            float f2 = i3 / i4;
            ArrayList<TEFrameSizei> arrayList = new ArrayList();
            ArrayList<TEFrameSizei> arrayList2 = new ArrayList();
            for (TEFrameSizei tEFrameSizei3 : list) {
                if (Float.compare(f2, tEFrameSizei3.width / tEFrameSizei3.height) == 0) {
                    arrayList.add(tEFrameSizei3);
                } else {
                    arrayList2.add(tEFrameSizei3);
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, new h());
                for (TEFrameSizei tEFrameSizei4 : arrayList) {
                    if (tEFrameSizei2 != null) {
                        int i5 = tEFrameSizei4.width;
                        if (i5 == i3 && tEFrameSizei4.height == i4) {
                            return tEFrameSizei4;
                        }
                        if (i5 <= i3 || i5 >= tEFrameSizei2.width) {
                            if (i5 < i3) {
                                break;
                            }
                        }
                    }
                    tEFrameSizei2 = tEFrameSizei4;
                }
                return tEFrameSizei2;
            }
            Collections.sort(arrayList2, new i());
            for (TEFrameSizei tEFrameSizei5 : arrayList2) {
                if (tEFrameSizei2 != null && ((i2 = tEFrameSizei5.width) < i3 || tEFrameSizei5.height < i4)) {
                    if (i2 < i3 && tEFrameSizei5.height < i4) {
                        break;
                    }
                } else {
                    tEFrameSizei2 = tEFrameSizei5;
                }
            }
        }
        return tEFrameSizei2;
    }

    /* JADX INFO: renamed from: c */
    public static TEFrameSizei m11052c(List<TEFrameSizei> list, float f2) {
        if (f2 <= 0.0f || list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (TEFrameSizei tEFrameSizei : list) {
            if (Float.compare(f2, tEFrameSizei.width / tEFrameSizei.height) == 0) {
                arrayList.add(tEFrameSizei);
            } else {
                arrayList2.add(tEFrameSizei);
            }
        }
        if (arrayList.isEmpty()) {
            ArrayList<TEFrameSizei> arrayList3 = f9111j;
            if (arrayList2.contains(arrayList3.get(14))) {
                return arrayList3.get(14);
            }
            if (arrayList.contains(arrayList3.get(16))) {
                return arrayList3.get(16);
            }
            Collections.sort(arrayList2, new b());
            return (TEFrameSizei) arrayList.get(arrayList.size() / 2);
        }
        ArrayList<TEFrameSizei> arrayList4 = f9111j;
        if (arrayList.contains(arrayList4.get(14))) {
            return arrayList4.get(14);
        }
        if (arrayList.contains(arrayList4.get(16))) {
            return arrayList4.get(16);
        }
        Collections.sort(arrayList, new a());
        return (TEFrameSizei) arrayList.get(0);
    }

    /* JADX INFO: renamed from: d */
    public static int m11053d(int i2) {
        return m11054e(i2, -1000, 1000);
    }

    /* JADX INFO: renamed from: e */
    public static int m11054e(int i2, int i3, int i4) {
        if (i2 > i4) {
            return i4;
        }
        return i2 < i3 ? i3 : i2;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m11055f(int[] iArr, int i2) {
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m11056g(String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: h */
    public static List<TEFrameRateRange> m11057h(Range<Integer>[] rangeArr) {
        if (rangeArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(rangeArr.length);
        for (Range<Integer> range : rangeArr) {
            arrayList.add(new TEFrameRateRange(((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()));
        }
        return arrayList;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: i */
    public static List<TEFrameSizei> m11058i(Size[] sizeArr) {
        if (sizeArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(sizeArr.length);
        for (Size size : sizeArr) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: j */
    public static Object m11059j(String str, int i2, Context context, AbstractC0726c.a aVar, Handler handler, AbstractC0726c.d dVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object objInvoke = null;
        try {
            Method method = Class.forName(str).getMethod("create", Integer.TYPE, Context.class, AbstractC0726c.a.class, Handler.class, AbstractC0726c.d.class);
            method.setAccessible(true);
            objInvoke = method.invoke(null, Integer.valueOf(i2), context, aVar, handler, dVar);
        } catch (Exception unused) {
        }
        C0743g.m11169e("TECameraUtils", "createCameraInstance for " + str + ", cost time = " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms, cameraInstance = " + objInvoke);
        return objInvoke;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m11060k(Object obj) {
        try {
            if (f9107f == null || f9108g == null || f9109h == null) {
                f9107f = Class.forName("android.hardware.camera2.impl.CameraMetadataNative");
                f9108g = obj.getClass().getSuperclass().getDeclaredField("mResults");
                Method declaredMethod = f9107f.getDeclaredMethod("finalize", null);
                f9109h = declaredMethod;
                declaredMethod.setAccessible(true);
                f9108g.setAccessible(true);
            }
            f9109h.invoke(f9108g.get(obj), null);
            return true;
        } catch (ClassNotFoundException unused) {
            C0743g.m11174j("TECameraUtils", "CameraMetadataNative class not found");
            return false;
        } catch (IllegalAccessException unused2) {
            C0743g.m11174j("TECameraUtils", "illegal access");
            return false;
        } catch (NoSuchFieldException unused3) {
            C0743g.m11174j("TECameraUtils", "mResults field not found");
            return false;
        } catch (NoSuchMethodException unused4) {
            C0743g.m11174j("TECameraUtils", "finalize method not found");
            return false;
        } catch (InvocationTargetException unused5) {
            C0743g.m11174j("TECameraUtils", "method invoke error");
            return false;
        } catch (Exception unused6) {
            C0743g.m11174j("TECameraUtils", "unknown error");
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: l */
    public static String m11061l() throws Throwable {
        String[] strArrSplit;
        if (!TextUtils.isEmpty(f9102a)) {
            return f9102a;
        }
        ?? r1 = 0;
        ?? StartsWith = 0;
        r1 = 0;
        r1 = 0;
        try {
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                bufferedReader.close();
                                r1 = StartsWith;
                                break;
                            }
                            StartsWith = line.startsWith("Hardware");
                            if (StartsWith != 0 && (StartsWith = (strArrSplit = line.split(":")).length) > 1) {
                                String strTrim = strArrSplit[1].trim();
                                f9102a = strTrim;
                                try {
                                    bufferedReader.close();
                                    return strTrim;
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                    return strTrim;
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            r1 = bufferedReader;
                            e.printStackTrace();
                            if (r1 != 0) {
                                r1.close();
                                r1 = r1;
                            }
                            String str = Build.HARDWARE;
                            f9102a = str;
                            return str;
                        } catch (Throwable th) {
                            th = th;
                            r1 = bufferedReader;
                            if (r1 != 0) {
                                try {
                                    r1.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        }
        String str2 = Build.HARDWARE;
        f9102a = str2;
        return str2;
    }

    /* JADX INFO: renamed from: m */
    public static int[] m11062m(int[] iArr, List<int[]> list) {
        int[] iArrM11063n;
        if (list == null || list.size() <= 0) {
            C0743g.m11165a("TECameraUtils", "supported fpsRange is null,use [7,30]");
            return new int[]{7, 30};
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int[] iArr2 : list) {
            if (iArr[0] > 1000) {
                if (iArr2[1] == 30000) {
                    arrayList.add(iArr2);
                } else {
                    arrayList2.add(iArr2);
                }
            } else if (iArr2[1] == 30) {
                arrayList.add(iArr2);
            } else {
                arrayList2.add(iArr2);
            }
        }
        if (arrayList.isEmpty()) {
            iArrM11063n = null;
            break;
        }
        Collections.sort(arrayList, new c());
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                iArrM11063n = null;
                break;
            }
            iArrM11063n = (int[]) it.next();
        } while (iArrM11063n[0] > iArr[0]);
        if (iArrM11063n == null) {
            iArrM11063n = m11063n(iArr, list);
        }
        C0743g.m11165a("TECameraUtils", "calculate fps range = [" + iArrM11063n[0] + "," + iArrM11063n[1] + "]");
        return iArrM11063n;
    }

    /* JADX INFO: renamed from: n */
    public static int[] m11063n(int[] iArr, List<int[]> list) {
        return (int[]) Collections.min(list, new d(iArr));
    }

    /* JADX INFO: renamed from: o */
    public static TEFrameSizei m11064o(@NonNull List<TEFrameSizei> list, TEFrameSizei tEFrameSizei, @NonNull int i2, float f2) {
        TEFrameSizei next;
        TEFrameSizei tEFrameSizeiM11050a;
        if (tEFrameSizei != null && tEFrameSizei.m10891a()) {
            Iterator<TEFrameSizei> it = list.iterator();
            float f3 = (tEFrameSizei.width * 1.0f) / tEFrameSizei.height;
            while (it.hasNext()) {
                TEFrameSizei next2 = it.next();
                if (Math.abs(f3 - ((next2.width * 1.0f) / next2.height)) > f2) {
                    it.remove();
                }
            }
        }
        Collections.sort(list, new g());
        Iterator<TEFrameSizei> it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (next.width > i2);
        if ((f9110i & 8) == 0 ? (next == null || next.width < tEFrameSizei.width || next.height < tEFrameSizei.height) && (tEFrameSizeiM11050a = m11050a(list, tEFrameSizei)) != null : (next == null || next.width <= tEFrameSizei.width || next.height <= tEFrameSizei.height) && (tEFrameSizeiM11050a = m11050a(list, tEFrameSizei)) != null) {
            next = tEFrameSizeiM11050a;
        }
        if (next == null) {
            C0743g.m11166b("TECameraUtils", "getClosestSupportedSize failed, maxWidth: " + i2 + ", accuracy: " + f2 + ", previewSize: " + tEFrameSizei);
        }
        return next;
    }

    /* JADX INFO: renamed from: p */
    public static TEFrameSizei m11065p(@NonNull List<TEFrameSizei> list, TEFrameSizei tEFrameSizei, @NonNull TEFrameSizei tEFrameSizei2) {
        if (tEFrameSizei != null && tEFrameSizei.m10891a()) {
            if (tEFrameSizei.equals(tEFrameSizei2) && list.contains(tEFrameSizei2)) {
                return tEFrameSizei2;
            }
            Iterator<TEFrameSizei> it = list.iterator();
            while (it.hasNext()) {
                TEFrameSizei next = it.next();
                if (next.width * tEFrameSizei.height != next.height * tEFrameSizei.width) {
                    it.remove();
                }
            }
        }
        Collections.sort(list, new f());
        TEFrameSizei tEFrameSizei3 = null;
        for (TEFrameSizei tEFrameSizei4 : list) {
            if (tEFrameSizei3 != null) {
                if (tEFrameSizei4.width == tEFrameSizei2.width && tEFrameSizei4.height == tEFrameSizei2.height) {
                    return tEFrameSizei4;
                }
                int i2 = tEFrameSizei4.height;
                int i3 = tEFrameSizei2.height;
                if (i2 <= i3 || i2 >= tEFrameSizei3.height) {
                    if (i2 < i3) {
                        break;
                    }
                }
            }
            tEFrameSizei3 = tEFrameSizei4;
        }
        return tEFrameSizei3;
    }

    /* JADX INFO: renamed from: q */
    public static int m11066q(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    /* JADX INFO: renamed from: r */
    public static int[] m11067r(int[] iArr, List<int[]> list) {
        int[] iArrM11063n;
        if (list == null || list.size() <= 0) {
            C0743g.m11165a("TECameraUtils", "supported fpsRange is null,use [30,30]");
            return new int[]{30, 30};
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int[] iArr2 : list) {
            if (iArr2[1] == iArr2[0]) {
                arrayList.add(iArr2);
            } else {
                arrayList2.add(iArr2);
            }
        }
        if (arrayList.isEmpty()) {
            iArrM11063n = null;
            break;
        }
        Collections.sort(arrayList, new e());
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                iArrM11063n = null;
                break;
            }
            iArrM11063n = (int[]) it.next();
            int i2 = iArrM11063n[0];
            if ((i2 >= 15 && i2 <= 30) || (i2 >= 15000 && iArrM11063n[1] <= 30000)) {
                if (iArr[1] == iArrM11063n[1]) {
                    break;
                }
            }
        }
        if (iArrM11063n == null) {
            iArrM11063n = m11063n(iArr, list);
        }
        C0743g.m11165a("TECameraUtils", "calculate fps range = [" + iArrM11063n[0] + "," + iArrM11063n[1] + "]");
        return iArrM11063n;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    public static int[] m11068s(int i2, int i3, int[] iArr, List<int[]> list) {
        int[] iArr2;
        C0743g.m11165a("TECameraUtils", "requiredFpsRange : [" + iArr[0] + "," + iArr[1] + "]");
        if (i2 == 1) {
            C0743g.m11165a("TECameraUtils", "fixed framerate for all cameras");
            return m11067r(iArr, list);
        }
        if (i2 == 2) {
            if (i3 == 0) {
                C0743g.m11165a("TECameraUtils", "fixed framerate for rear camera");
                return m11067r(iArr, list);
            }
            C0743g.m11165a("TECameraUtils", "dynamic framerate for front camera");
            return m11062m(iArr, list);
        }
        if (i2 == 3) {
            C0743g.m11165a("TECameraUtils", "dynamic framerate without select");
            return m11063n(iArr, list);
        }
        if (i2 != 4) {
            C0743g.m11165a("TECameraUtils", "dynamic framerate");
            return m11062m(iArr, list);
        }
        C0743g.m11165a("TECameraUtils", "framerate by user");
        for (int[] iArr3 : list) {
            if (iArr3[0] == iArr[0] && iArr3[1] == iArr[1]) {
                iArr2 = iArr;
                if (iArr2 == null) {
                    return m11062m(iArr, list);
                }
                return iArr2;
            }
        }
        iArr2 = null;
        if (iArr2 == null) {
            return m11062m(iArr, list);
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: t */
    public static List<TEFrameSizei> m11069t(List<TEFrameSizei> list, List<TEFrameSizei> list2) {
        list.retainAll(list2);
        return list;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m11070u(Context context) {
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 28 && (i2 != 27 || Build.VERSION.PREVIEW_SDK_INT <= 0)) {
                Method declaredMethod = cameraManager.getClass().getDeclaredMethod("supportsCamera2ApiLocked", String.class);
                declaredMethod.setAccessible(true);
                return ((Boolean) declaredMethod.invoke(cameraManager, "0")).booleanValue();
            }
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cameraManager.getClass(), "supportsCamera2ApiLocked", String.class);
            method.setAccessible(true);
            return ((Boolean) method.invoke(cameraManager, "0")).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: renamed from: v */
    public static boolean m11071v(Rect rect) {
        return rect != null && !rect.isEmpty() && rect.left >= 0 && rect.right >= 0 && rect.top >= 0 && rect.bottom >= 0;
    }

    /* JADX INFO: renamed from: w */
    public static void m11072w(int i2, Rect rect, Rect rect2) {
        Matrix matrix = new Matrix();
        matrix.setRotate(-i2);
        RectF rectF = new RectF(rect);
        RectF rectF2 = new RectF(rect2);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        matrix.reset();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
    }
}
