package com.p074ss.android.ttvecamera;

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
import com.clevertap.android.sdk.Constants;
import com.cosmos.photon.push.service.PushService;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.liteav.audio.TXEAudioDef;
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
/* JADX INFO: loaded from: classes11.dex */
public class C13496f {

    /* JADX INFO: renamed from: a */
    private static String f56344a = null;

    /* JADX INFO: renamed from: b */
    private static boolean f56345b = false;

    /* JADX INFO: renamed from: e */
    private static boolean f56348e;

    /* JADX INFO: renamed from: c */
    private static String[] f56346c = {"SDM632", "SDM636", "SDM638", "SDM660", "SDM670", "SDM710", "SDM720", "MSM8996", "MSM8998", "SDM845", "KIRIN980", "KIRIN970", "KIRIN710", "HI3660", "MT6771", "Exynos 9810", "Exynos 8895"};

    /* JADX INFO: renamed from: d */
    private static String[] f56347d = {"BAC-AL00", "ANE-AL00", "HWI-AL00"};

    /* JADX INFO: renamed from: f */
    private static Class f56349f = null;

    /* JADX INFO: renamed from: g */
    private static Field f56350g = null;

    /* JADX INFO: renamed from: h */
    private static Method f56351h = null;

    /* JADX INFO: renamed from: i */
    public static byte f56352i = 0;

    /* JADX INFO: renamed from: j */
    static final ArrayList<TEFrameSizei> f56353j = new ArrayList<>(Arrays.asList(new TEFrameSizei(160, 120), new TEFrameSizei(240, 160), new TEFrameSizei(320, 240), new TEFrameSizei(400, 240), new TEFrameSizei(480, 320), new TEFrameSizei(640, 360), new TEFrameSizei(640, 480), new TEFrameSizei(768, 480), new TEFrameSizei(854, 480), new TEFrameSizei(800, 600), new TEFrameSizei(TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 540), new TEFrameSizei(TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 640), new TEFrameSizei(1024, 576), new TEFrameSizei(1024, 600), new TEFrameSizei(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, 720), new TEFrameSizei(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, 1024), new TEFrameSizei(WBConstants.SDK_NEW_PAY_VERSION, 1080), new TEFrameSizei(WBConstants.SDK_NEW_PAY_VERSION, 1440), new TEFrameSizei(2560, 1440), new TEFrameSizei(3840, 2160)));

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
        final /* synthetic */ int[] f56354a;

        public d(int[] iArr) {
            this.f56354a = iArr;
        }

        /* JADX INFO: renamed from: b */
        private int m81908b(int[] iArr) {
            int[] iArr2 = this.f56354a;
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
            return m81908b(iArr) - m81908b(iArr2);
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
        f56348e = false;
        String strM81893l = m81893l();
        if (!TextUtils.isEmpty(strM81893l)) {
            strM81893l = strM81893l.toUpperCase();
            for (String str : f56346c) {
                if (strM81893l.contains(str)) {
                    f56345b = true;
                    break;
                }
            }
        }
        String upperCase = Build.MODEL;
        if (!TextUtils.isEmpty(upperCase)) {
            upperCase = upperCase.toUpperCase();
            for (String str2 : f56347d) {
                if (str2.equals(upperCase)) {
                    f56348e = true;
                    break;
                }
            }
        }
        C13504g.m82001e("TECameraUtils", "cpuHardware: " + strM81893l + ", isHighPerformanceCpu: " + f56345b + "model: " + upperCase + ", isInAbortCapturesBlockList: " + f56348e);
    }

    /* JADX INFO: renamed from: a */
    private static TEFrameSizei m81882a(@NonNull List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
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
    public static TEFrameSizei m81883b(@NonNull List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
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
    public static TEFrameSizei m81884c(List<TEFrameSizei> list, float f2) {
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
            ArrayList<TEFrameSizei> arrayList3 = f56353j;
            if (arrayList2.contains(arrayList3.get(14))) {
                return arrayList3.get(14);
            }
            if (arrayList.contains(arrayList3.get(16))) {
                return arrayList3.get(16);
            }
            Collections.sort(arrayList2, new b());
            return (TEFrameSizei) arrayList.get(arrayList.size() / 2);
        }
        ArrayList<TEFrameSizei> arrayList4 = f56353j;
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
    public static int m81885d(int i2) {
        return m81886e(i2, -1000, 1000);
    }

    /* JADX INFO: renamed from: e */
    public static int m81886e(int i2, int i3, int i4) {
        if (i2 > i4) {
            return i4;
        }
        return i2 < i3 ? i3 : i2;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m81887f(int[] iArr, int i2) {
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
    public static boolean m81888g(String[] strArr, String str) {
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
    public static List<TEFrameRateRange> m81889h(Range<Integer>[] rangeArr) {
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
    public static List<TEFrameSizei> m81890i(Size[] sizeArr) {
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
    public static Object m81891j(String str, int i2, Context context, AbstractC13487c.a aVar, Handler handler, AbstractC13487c.d dVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object objInvoke = null;
        try {
            Method method = Class.forName(str).getMethod(PushService.COMMAND_CREATE, Integer.TYPE, Context.class, AbstractC13487c.a.class, Handler.class, AbstractC13487c.d.class);
            method.setAccessible(true);
            objInvoke = method.invoke(null, Integer.valueOf(i2), context, aVar, handler, dVar);
        } catch (Exception unused) {
        }
        C13504g.m82001e("TECameraUtils", "createCameraInstance for " + str + ", cost time = " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms, cameraInstance = " + objInvoke);
        return objInvoke;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m81892k(Object obj) {
        try {
            if (f56349f == null || f56350g == null || f56351h == null) {
                f56349f = Class.forName("android.hardware.camera2.impl.CameraMetadataNative");
                f56350g = obj.getClass().getSuperclass().getDeclaredField("mResults");
                Method declaredMethod = f56349f.getDeclaredMethod("finalize", null);
                f56351h = declaredMethod;
                declaredMethod.setAccessible(true);
                f56350g.setAccessible(true);
            }
            f56351h.invoke(f56350g.get(obj), null);
            return true;
        } catch (ClassNotFoundException unused) {
            C13504g.m82006j("TECameraUtils", "CameraMetadataNative class not found");
            return false;
        } catch (IllegalAccessException unused2) {
            C13504g.m82006j("TECameraUtils", "illegal access");
            return false;
        } catch (NoSuchFieldException unused3) {
            C13504g.m82006j("TECameraUtils", "mResults field not found");
            return false;
        } catch (NoSuchMethodException unused4) {
            C13504g.m82006j("TECameraUtils", "finalize method not found");
            return false;
        } catch (InvocationTargetException unused5) {
            C13504g.m82006j("TECameraUtils", "method invoke error");
            return false;
        } catch (Exception unused6) {
            C13504g.m82006j("TECameraUtils", "unknown error");
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
    public static String m81893l() throws Throwable {
        String[] strArrSplit;
        if (!TextUtils.isEmpty(f56344a)) {
            return f56344a;
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
                                f56344a = strTrim;
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
                            f56344a = str;
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
        f56344a = str2;
        return str2;
    }

    /* JADX INFO: renamed from: m */
    public static int[] m81894m(int[] iArr, List<int[]> list) {
        int[] iArrM81895n;
        if (list == null || list.size() <= 0) {
            C13504g.m81997a("TECameraUtils", "supported fpsRange is null,use [7,30]");
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
            iArrM81895n = null;
            break;
        }
        Collections.sort(arrayList, new c());
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                iArrM81895n = null;
                break;
            }
            iArrM81895n = (int[]) it.next();
        } while (iArrM81895n[0] > iArr[0]);
        if (iArrM81895n == null) {
            iArrM81895n = m81895n(iArr, list);
        }
        C13504g.m81997a("TECameraUtils", "calculate fps range = [" + iArrM81895n[0] + Constants.SEPARATOR_COMMA + iArrM81895n[1] + Constants.AES_SUFFIX);
        return iArrM81895n;
    }

    /* JADX INFO: renamed from: n */
    public static int[] m81895n(int[] iArr, List<int[]> list) {
        return (int[]) Collections.min(list, new d(iArr));
    }

    /* JADX INFO: renamed from: o */
    public static TEFrameSizei m81896o(@NonNull List<TEFrameSizei> list, TEFrameSizei tEFrameSizei, @NonNull int i2, float f2) {
        TEFrameSizei next;
        TEFrameSizei tEFrameSizeiM81882a;
        if (tEFrameSizei != null && tEFrameSizei.m81723a()) {
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
        if ((f56352i & 8) == 0 ? (next == null || next.width < tEFrameSizei.width || next.height < tEFrameSizei.height) && (tEFrameSizeiM81882a = m81882a(list, tEFrameSizei)) != null : (next == null || next.width <= tEFrameSizei.width || next.height <= tEFrameSizei.height) && (tEFrameSizeiM81882a = m81882a(list, tEFrameSizei)) != null) {
            next = tEFrameSizeiM81882a;
        }
        if (next == null) {
            C13504g.m81998b("TECameraUtils", "getClosestSupportedSize failed, maxWidth: " + i2 + ", accuracy: " + f2 + ", previewSize: " + tEFrameSizei);
        }
        return next;
    }

    /* JADX INFO: renamed from: p */
    public static TEFrameSizei m81897p(@NonNull List<TEFrameSizei> list, TEFrameSizei tEFrameSizei, @NonNull TEFrameSizei tEFrameSizei2) {
        if (tEFrameSizei != null && tEFrameSizei.m81723a()) {
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
    public static int m81898q(Context context) {
        int rotation = ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    /* JADX INFO: renamed from: r */
    public static int[] m81899r(int[] iArr, List<int[]> list) {
        int[] iArrM81895n;
        if (list == null || list.size() <= 0) {
            C13504g.m81997a("TECameraUtils", "supported fpsRange is null,use [30,30]");
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
            iArrM81895n = null;
            break;
        }
        Collections.sort(arrayList, new e());
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                iArrM81895n = null;
                break;
            }
            iArrM81895n = (int[]) it.next();
            int i2 = iArrM81895n[0];
            if ((i2 >= 15 && i2 <= 30) || (i2 >= 15000 && iArrM81895n[1] <= 30000)) {
                if (iArr[1] == iArrM81895n[1]) {
                    break;
                }
            }
        }
        if (iArrM81895n == null) {
            iArrM81895n = m81895n(iArr, list);
        }
        C13504g.m81997a("TECameraUtils", "calculate fps range = [" + iArrM81895n[0] + Constants.SEPARATOR_COMMA + iArrM81895n[1] + Constants.AES_SUFFIX);
        return iArrM81895n;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    public static int[] m81900s(int i2, int i3, int[] iArr, List<int[]> list) {
        int[] iArr2;
        C13504g.m81997a("TECameraUtils", "requiredFpsRange : [" + iArr[0] + Constants.SEPARATOR_COMMA + iArr[1] + Constants.AES_SUFFIX);
        if (i2 == 1) {
            C13504g.m81997a("TECameraUtils", "fixed framerate for all cameras");
            return m81899r(iArr, list);
        }
        if (i2 == 2) {
            if (i3 == 0) {
                C13504g.m81997a("TECameraUtils", "fixed framerate for rear camera");
                return m81899r(iArr, list);
            }
            C13504g.m81997a("TECameraUtils", "dynamic framerate for front camera");
            return m81894m(iArr, list);
        }
        if (i2 == 3) {
            C13504g.m81997a("TECameraUtils", "dynamic framerate without select");
            return m81895n(iArr, list);
        }
        if (i2 != 4) {
            C13504g.m81997a("TECameraUtils", "dynamic framerate");
            return m81894m(iArr, list);
        }
        C13504g.m81997a("TECameraUtils", "framerate by user");
        for (int[] iArr3 : list) {
            if (iArr3[0] == iArr[0] && iArr3[1] == iArr[1]) {
                iArr2 = iArr;
                if (iArr2 == null) {
                    return m81894m(iArr, list);
                }
                return iArr2;
            }
        }
        iArr2 = null;
        if (iArr2 == null) {
            return m81894m(iArr, list);
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: t */
    public static List<TEFrameSizei> m81901t(List<TEFrameSizei> list, List<TEFrameSizei> list2) {
        list.retainAll(list2);
        return list;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m81902u(Context context) {
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
    public static boolean m81903v(Rect rect) {
        return rect != null && !rect.isEmpty() && rect.left >= 0 && rect.right >= 0 && rect.top >= 0 && rect.bottom >= 0;
    }

    /* JADX INFO: renamed from: w */
    public static void m81904w(int i2, Rect rect, Rect rect2) {
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
