package p153l;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.CameraCategory;
import com.p051p1.mobile.putong.feed.data.CameraFilter;
import com.p051p1.mobile.putong.feed.data.CameraSticker;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.SharePatchFileUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class oc4 {

    /* JADX INFO: renamed from: f */
    public static String f146645f;

    /* JADX INFO: renamed from: g */
    public static final String f146646g;

    /* JADX INFO: renamed from: h */
    public static final String f146647h;

    /* JADX INFO: renamed from: i */
    public static final String f146648i;

    /* JADX INFO: renamed from: j */
    public static final String f146649j;

    /* JADX INFO: renamed from: k */
    public static final String f146650k;

    /* JADX INFO: renamed from: l */
    public static final String f146651l;

    /* JADX INFO: renamed from: m */
    public static final String f146652m;

    /* JADX INFO: renamed from: n */
    public static final String f146653n;

    /* JADX INFO: renamed from: o */
    public static final String f146654o;

    /* JADX INFO: renamed from: p */
    public static oc4 f146655p;

    /* JADX INFO: renamed from: a */
    public List<CameraCategory> f146656a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<CameraCategory> f146657b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ArrayList<String> f146658c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public HashMap<String, C22421c<File>> f146659d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public HashMap<String, C22421c<File>> f146660e = new HashMap<>();

    static {
        if (NullChecker.m82486a(FeedModule.f39700a.getExternalCacheDir())) {
            f146645f = FeedModule.f39700a.getExternalCacheDir().getAbsolutePath();
        } else {
            f146645f = FeedModule.f39700a.getCacheDir().getAbsolutePath();
        }
        f146646g = f146645f + "/zip/filter";
        f146647h = f146645f + "/zip/sticker";
        f146648i = f146645f + "/zip/makeup";
        f146649j = f146645f + "/zip";
        f146650k = f146645f + "/filterData/filterImg";
        f146651l = f146645f + "/moment";
        f146652m = f146645f + "/music";
        f146653n = f146645f + "/musictemp";
        f146654o = f146645f + "/makeup";
        f146655p = null;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m167072B(File file, String str) {
        return SharePatchFileUtil.isLegalFile(file) && TextUtils.equals(str, niw.m163314d(file));
    }

    /* JADX INFO: renamed from: C */
    public static boolean m167073C(String str, String str2, String str3) {
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        String str4 = File.separator;
        sb.append(str4);
        sb.append(str3);
        String string = sb.toString();
        File file2 = new File(string);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        if (!oki.m168015c(str + str4 + str3, string)) {
            return false;
        }
        try {
            File file3 = new File(string + str4 + str3);
            oki.m168019g(file3, file3.getParentFile());
            return true;
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception(e.getMessage() + ", AvailableBytes: " + m167079L(), e));
            return false;
        }
    }

    /* JADX INFO: renamed from: D */
    public static String m167074D(String str) {
        File file = new File(f146653n);
        if (!file.exists()) {
            file.mkdirs();
        }
        String name = new File(str).getName();
        String strM163315e = niw.m163315e(str);
        oki.m168015c(str, file.getAbsolutePath());
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(name);
        new File(sb.toString()).renameTo(new File(file.getAbsolutePath() + str2 + strM163315e));
        return file.getAbsolutePath() + str2 + strM163315e;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009a A[Catch: IOException -> 0x009f, PHI: r1 r3 r4 r5
      0x009a: PHI (r1v18 ??) = (r1v28 ??), (r1v29 ??) binds: [B:69:0x00f0, B:29:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r3v11 ??) = (r3v16 ??), (r3v17 ??) binds: [B:69:0x00f0, B:29:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r4v10 java.io.InputStream) = (r4v8 java.io.InputStream), (r4v17 java.io.InputStream) binds: [B:69:0x00f0, B:29:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r5v8 ??) = (r5v13 ??), (r5v14 ??) binds: [B:69:0x00f0, B:29:0x0098] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #9 {IOException -> 0x009f, blocks: (B:19:0x0079, B:21:0x007f, B:22:0x0082, B:24:0x0088, B:25:0x008b, B:27:0x0091, B:28:0x0094, B:30:0x009a, B:59:0x00d1, B:61:0x00d7, B:62:0x00da, B:64:0x00e0, B:65:0x00e3, B:67:0x00e9, B:68:0x00ec), top: B:94:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d7 A[Catch: IOException -> 0x009f, TryCatch #9 {IOException -> 0x009f, blocks: (B:19:0x0079, B:21:0x007f, B:22:0x0082, B:24:0x0088, B:25:0x008b, B:27:0x0091, B:28:0x0094, B:30:0x009a, B:59:0x00d1, B:61:0x00d7, B:62:0x00da, B:64:0x00e0, B:65:0x00e3, B:67:0x00e9, B:68:0x00ec), top: B:94:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e0 A[Catch: IOException -> 0x009f, TryCatch #9 {IOException -> 0x009f, blocks: (B:19:0x0079, B:21:0x007f, B:22:0x0082, B:24:0x0088, B:25:0x008b, B:27:0x0091, B:28:0x0094, B:30:0x009a, B:59:0x00d1, B:61:0x00d7, B:62:0x00da, B:64:0x00e0, B:65:0x00e3, B:67:0x00e9, B:68:0x00ec), top: B:94:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e9 A[Catch: IOException -> 0x009f, TryCatch #9 {IOException -> 0x009f, blocks: (B:19:0x0079, B:21:0x007f, B:22:0x0082, B:24:0x0088, B:25:0x008b, B:27:0x0091, B:28:0x0094, B:30:0x009a, B:59:0x00d1, B:61:0x00d7, B:62:0x00da, B:64:0x00e0, B:65:0x00e3, B:67:0x00e9, B:68:0x00ec), top: B:94:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa A[Catch: IOException -> 0x00fe, TryCatch #11 {IOException -> 0x00fe, blocks: (B:72:0x00f4, B:74:0x00fa, B:77:0x0100, B:79:0x0106, B:80:0x0109, B:82:0x010f, B:83:0x0112, B:85:0x0118), top: B:98:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0106 A[Catch: IOException -> 0x00fe, TryCatch #11 {IOException -> 0x00fe, blocks: (B:72:0x00f4, B:74:0x00fa, B:77:0x0100, B:79:0x0106, B:80:0x0109, B:82:0x010f, B:83:0x0112, B:85:0x0118), top: B:98:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x010f A[Catch: IOException -> 0x00fe, TryCatch #11 {IOException -> 0x00fe, blocks: (B:72:0x00f4, B:74:0x00fa, B:77:0x0100, B:79:0x0106, B:80:0x0109, B:82:0x010f, B:83:0x0112, B:85:0x0118), top: B:98:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0118 A[Catch: IOException -> 0x00fe, TRY_LEAVE, TryCatch #11 {IOException -> 0x00fe, blocks: (B:72:0x00f4, B:74:0x00fa, B:77:0x0100, B:79:0x0106, B:80:0x0109, B:82:0x010f, B:83:0x0112, B:85:0x0118), top: B:98:0x00f4 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.io.FileOutputStream, java.io.OutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.io.FileOutputStream, java.io.OutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX INFO: renamed from: E */
    public static void m167075E() {
        ?? r3;
        InputStream inputStreamOpen;
        ?? r4;
        ?? fileOutputStream;
        IOException e;
        ?? fileOutputStream2;
        boolean zM82486a;
        ?? r5;
        ?? r6;
        ?? r1;
        File file = new File(f146645f + "/filterData/local_filter", Constants.TEST_IDENTIFIER);
        if (!file.exists()) {
            try {
                ecj.m120374H(file);
            } catch (Exception e2) {
                CrashHelper.m82479c(e2);
            }
        }
        ?? file2 = new File(file, "icon.jpg");
        ?? Open = "lookup.png";
        File file3 = new File(file, "lookup.png");
        if (m167072B(file2, "B3BCF8C6AB5A320D178220CAA774D0E4") && m167072B(file3, "B8C760C8247CCB75E02A8A3910B86073")) {
            return;
        }
        try {
            try {
                try {
                    Open = FeedModule.f39700a.getResources().getAssets().open("origin_icon_v2.jpg");
                    try {
                        inputStreamOpen = FeedModule.f39700a.getResources().getAssets().open("origin_lookup.png");
                        try {
                            fileOutputStream = new FileOutputStream((File) file2);
                            try {
                                oki.m168018f(Open, fileOutputStream);
                                fileOutputStream2 = new FileOutputStream(file3);
                                try {
                                    oki.m168018f(inputStreamOpen, fileOutputStream2);
                                    if (NullChecker.m82486a(Open)) {
                                        Open.close();
                                    }
                                    if (NullChecker.m82486a(fileOutputStream)) {
                                        fileOutputStream.close();
                                    }
                                    if (NullChecker.m82486a(inputStreamOpen)) {
                                        inputStreamOpen.close();
                                    }
                                    boolean zM82486a2 = NullChecker.m82486a(fileOutputStream2);
                                    r1 = fileOutputStream2;
                                    r6 = Open;
                                    r5 = fileOutputStream;
                                    file2 = fileOutputStream2;
                                    Open = Open;
                                    fileOutputStream = fileOutputStream;
                                    if (zM82486a2) {
                                        r1.close();
                                        file2 = r1;
                                        Open = r6;
                                        fileOutputStream = r5;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    CrashHelper.m82479c(e);
                                    if (NullChecker.m82486a(Open)) {
                                        Open.close();
                                    }
                                    if (NullChecker.m82486a(fileOutputStream)) {
                                        fileOutputStream.close();
                                    }
                                    if (NullChecker.m82486a(inputStreamOpen)) {
                                        inputStreamOpen.close();
                                    }
                                    zM82486a = NullChecker.m82486a(fileOutputStream2);
                                    r1 = fileOutputStream2;
                                    r6 = Open;
                                    r5 = fileOutputStream;
                                    file2 = fileOutputStream2;
                                    Open = Open;
                                    fileOutputStream = fileOutputStream;
                                    if (zM82486a) {
                                    }
                                }
                            } catch (IOException e4) {
                                fileOutputStream2 = 0;
                                e = e4;
                            } catch (Throwable th) {
                                file2 = 0;
                                th = th;
                                try {
                                    if (NullChecker.m82486a(Open)) {
                                        Open.close();
                                    }
                                    if (NullChecker.m82486a(fileOutputStream)) {
                                        fileOutputStream.close();
                                    }
                                    if (NullChecker.m82486a(inputStreamOpen)) {
                                        inputStreamOpen.close();
                                    }
                                    if (NullChecker.m82486a(file2)) {
                                        file2.close();
                                    }
                                } catch (IOException e5) {
                                    CrashHelper.m82479c(e5);
                                }
                                throw th;
                            }
                        } catch (IOException e6) {
                            e = e6;
                            fileOutputStream = 0;
                            Open = Open;
                            e = e;
                            fileOutputStream2 = fileOutputStream;
                            CrashHelper.m82479c(e);
                            if (NullChecker.m82486a(Open)) {
                                Open.close();
                            }
                            if (NullChecker.m82486a(fileOutputStream)) {
                                fileOutputStream.close();
                            }
                            if (NullChecker.m82486a(inputStreamOpen)) {
                                inputStreamOpen.close();
                            }
                            zM82486a = NullChecker.m82486a(fileOutputStream2);
                            r1 = fileOutputStream2;
                            r6 = Open;
                            r5 = fileOutputStream;
                            file2 = fileOutputStream2;
                            Open = Open;
                            fileOutputStream = fileOutputStream;
                            if (zM82486a) {
                                r1.close();
                                file2 = r1;
                                Open = r6;
                                fileOutputStream = r5;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = 0;
                            Open = Open;
                            th = th;
                            file2 = fileOutputStream;
                            if (NullChecker.m82486a(Open)) {
                                Open.close();
                            }
                            if (NullChecker.m82486a(fileOutputStream)) {
                                fileOutputStream.close();
                            }
                            if (NullChecker.m82486a(inputStreamOpen)) {
                                inputStreamOpen.close();
                            }
                            if (NullChecker.m82486a(file2)) {
                                file2.close();
                            }
                            throw th;
                        }
                    } catch (IOException e7) {
                        e = e7;
                        inputStreamOpen = null;
                        r4 = Open;
                        fileOutputStream = inputStreamOpen;
                        Open = r4;
                        e = e;
                        fileOutputStream2 = fileOutputStream;
                        CrashHelper.m82479c(e);
                        if (NullChecker.m82486a(Open)) {
                            Open.close();
                        }
                        if (NullChecker.m82486a(fileOutputStream)) {
                            fileOutputStream.close();
                        }
                        if (NullChecker.m82486a(inputStreamOpen)) {
                            inputStreamOpen.close();
                        }
                        zM82486a = NullChecker.m82486a(fileOutputStream2);
                        r1 = fileOutputStream2;
                        r6 = Open;
                        r5 = fileOutputStream;
                        file2 = fileOutputStream2;
                        Open = Open;
                        fileOutputStream = fileOutputStream;
                        if (zM82486a) {
                            r1.close();
                            file2 = r1;
                            Open = r6;
                            fileOutputStream = r5;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamOpen = null;
                        r3 = Open;
                        fileOutputStream = inputStreamOpen;
                        Open = r3;
                        th = th;
                        file2 = fileOutputStream;
                        if (NullChecker.m82486a(Open)) {
                            Open.close();
                        }
                        if (NullChecker.m82486a(fileOutputStream)) {
                            fileOutputStream.close();
                        }
                        if (NullChecker.m82486a(inputStreamOpen)) {
                            inputStreamOpen.close();
                        }
                        if (NullChecker.m82486a(file2)) {
                            file2.close();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (IOException e8) {
                e = e8;
                r4 = 0;
                inputStreamOpen = null;
            } catch (Throwable th5) {
                th = th5;
                r3 = 0;
                inputStreamOpen = null;
            }
        } catch (IOException e9) {
            CrashHelper.m82479c(e9);
        }
    }

    /* JADX INFO: renamed from: F */
    public static DownloadTask m167076F(String str, String str2, final y20<File> y20Var) {
        try {
            ecj.m120374H(new File(str2).getParentFile());
            return new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str).m80823o(str2).m80818j(new z20() { // from class: l.zb4
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    y20Var.call((File) obj2);
                }
            }).m80814f(new z20() { // from class: l.bc4
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    y20Var.call(null);
                }
            }).m80812d(new y20() { // from class: l.cc4
                @Override // p153l.y20
                public final void call(Object obj) {
                    y20Var.call(null);
                }
            }).m80809a();
        } catch (RuntimeException e) {
            CrashHelper.m82480d(e, 100);
            y20Var.call(null);
            return null;
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m167077G(File file) {
        if (!file.isDirectory()) {
            if (file.exists()) {
                file.delete();
            }
        } else {
            for (File file2 : file.listFiles()) {
                m167077G(file2);
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m167078H() {
        m167077G(new File(f146653n));
    }

    /* JADX INFO: renamed from: L */
    public static long m167079L() {
        try {
            return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes();
        } catch (Exception e) {
            CrashHelper.m82479c(new RuntimeException("getAvailableBytes error.", e));
            return 0L;
        }
    }

    /* JADX INFO: renamed from: N */
    public static String m167080N(CameraFilter cameraFilter) {
        return cameraFilter.f40066id + "_" + niw.m163315e(cameraFilter.name) + "_" + cameraFilter.minVersion;
    }

    /* JADX INFO: renamed from: O */
    public static oc4 m167081O() {
        if (f146655p == null) {
            synchronized (oc4.class) {
                try {
                    if (f146655p == null) {
                        f146655p = new oc4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f146655p;
    }

    /* JADX INFO: renamed from: P */
    public static String m167082P(CameraSticker cameraSticker) {
        return cameraSticker.f40067id + "_" + niw.m163315e(cameraSticker.name) + "_" + cameraSticker.minVersion;
    }

    /* JADX INFO: renamed from: Q */
    public static String m167083Q(Music music) {
        return niw.m163315e(music.audio.url);
    }

    /* JADX INFO: renamed from: R */
    public static List<MMPresetFilter> m167084R() {
        ArrayList arrayList = new ArrayList();
        MMPresetFilter mMPresetFilter = new MMPresetFilter();
        mMPresetFilter.mFilterName = "原图";
        mMPresetFilter.mFilterId = "0";
        arrayList.add(mMPresetFilter);
        return arrayList;
    }

    /* JADX INFO: renamed from: S */
    public static String m167085S(CameraSticker cameraSticker) {
        return niw.m163315e(m167086T(cameraSticker));
    }

    /* JADX INFO: renamed from: T */
    public static String m167086T(CameraSticker cameraSticker) {
        return cameraSticker.f40067id + "_" + cameraSticker.name + "_" + cameraSticker.minVersion;
    }

    /* JADX INFO: renamed from: U */
    public static boolean m167087U(int i, String str, y20<File> y20Var) {
        String str2;
        switch (i) {
            case 10:
                str2 = f146650k;
                break;
            case 11:
                str2 = f146651l;
                break;
            case 12:
                str2 = f146652m;
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdirs();
                }
                break;
            case 13:
                str2 = f146654o;
                File file2 = new File(str2);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                break;
            default:
                str2 = "";
                break;
        }
        File file3 = new File(str2 + File.separator + str);
        if (!file3.exists()) {
            return false;
        }
        y20Var.call(file3);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m167090c(CameraFilter cameraFilter, CameraFilter cameraFilter2) {
        if (cameraFilter == null || cameraFilter2 == null) {
            return 0;
        }
        return cameraFilter.index - cameraFilter2.index;
    }

    /* JADX INFO: renamed from: d0 */
    public static C22421c<List<MMPresetFilter>> m167092d0(List<CameraFilter> list) {
        List<MMPresetFilter> listM167084R = m167084R();
        doi.m117277j().m117291t(listM167084R);
        return list.isEmpty() ? C22421c.just(listM167084R) : C22421c.from(list).flatMap(new qcj() { // from class: l.gc4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return oc4.m167094e0((CameraFilter) obj);
            }
        }).map(new qcj() { // from class: l.hc4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return oc4.m167106m0((Pair) obj);
            }
        }).toList().map(new qcj() { // from class: l.ic4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return oc4.m167100i0((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m167093e(gcg0 gcg0Var, CameraFilter cameraFilter, File file) {
        gcg0Var.onNext(new Pair(cameraFilter, file));
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: e0 */
    public static C22421c<Pair<CameraFilter, File>> m167094e0(final CameraFilter cameraFilter) {
        final String strM167080N = m167080N(cameraFilter);
        return C22421c.create(new C22421c.a() { // from class: l.kc4
            @Override // p153l.y20
            public final void call(Object obj) {
                oc4.m167113t(strM167080N, cameraFilter, (gcg0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m167095f(gcg0 gcg0Var, CameraFilter cameraFilter, File file) {
        gcg0Var.onNext(new Pair(cameraFilter, file));
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: f0 */
    public static void m167096f0(CameraSticker cameraSticker, final gcg0<? super File> gcg0Var) {
        String strM167082P = m167082P(cameraSticker);
        if (m167087U(13, strM167082P, new y20() { // from class: l.pb4
            @Override // p153l.y20
            public final void call(Object obj) {
                oc4.m167116w(gcg0Var, (File) obj);
            }
        })) {
            return;
        }
        C13274a.m80837u().m80848o(m167076F(cameraSticker.resource, f146648i + File.separator + strM167082P, new y20() { // from class: l.ac4
            @Override // p153l.y20
            public final void call(Object obj) {
                oc4.m167118y(gcg0Var, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m167098h(gcg0 gcg0Var, File file) {
        gcg0Var.onNext(file);
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: i0 */
    public static List<MMPresetFilter> m167100i0(List<CameraFilter> list) {
        Collections.sort(list, new Comparator() { // from class: l.jc4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return oc4.m167090c((CameraFilter) obj, (CameraFilter) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        MMPresetFilter mMPresetFilter = new MMPresetFilter();
        mMPresetFilter.mFilterName = "原图";
        mMPresetFilter.mFilterId = "0";
        arrayList.add(mMPresetFilter);
        for (CameraFilter cameraFilter : list) {
            if (NullChecker.m82486a(cameraFilter)) {
                MMPresetFilter mMPresetFilter2 = new MMPresetFilter();
                mMPresetFilter2.mFilterId = cameraFilter.f40066id;
                mMPresetFilter2.mFilterIcon = cameraFilter.icon;
                mMPresetFilter2.mFilterName = cameraFilter.name;
                arrayList.add(mMPresetFilter2);
            }
        }
        doi.m117277j().m117291t(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    public static String m167103k0(String str) {
        File file = new File(f146654o + File.separator + str);
        File file2 = new File(file, file.getName());
        if (file2.exists() && file2.isFile()) {
            oki.m168025m(file2.getAbsolutePath());
        }
        File file3 = new File(file, "__MACOSX");
        if (file3.isDirectory()) {
            oki.m168023k(file3);
        }
        File[] fileArrListFiles = file.listFiles();
        return (fileArrListFiles == null || fileArrListFiles.length <= 0) ? "" : fileArrListFiles[0].getAbsolutePath();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m167104l(gcg0 gcg0Var, File file) {
        gcg0Var.onNext(Boolean.valueOf(file != null));
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m167105m(gcg0 gcg0Var, File file) {
        gcg0Var.onNext(Boolean.TRUE);
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: m0 */
    public static CameraFilter m167106m0(Pair<CameraFilter, File> pair) {
        File file = (File) pair.second;
        if (NullChecker.m82486a(file)) {
            String absolutePath = file.getParentFile().getAbsolutePath();
            String str = f146646g;
            if (TextUtils.equals(absolutePath, str)) {
                m167073C(str, f146650k, file.getName());
            }
        }
        if (file != null) {
            return (CameraFilter) pair.first;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m167108o(MusicContent musicContent) {
        if (musicContent == null) {
            o1j0.m165634h(R$string.f39979q1);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m167110q(gcg0 gcg0Var, File file) {
        gcg0Var.onNext(file);
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m167113t(String str, final CameraFilter cameraFilter, final gcg0 gcg0Var) {
        if (m167087U(10, str, new y20() { // from class: l.tb4
            @Override // p153l.y20
            public final void call(Object obj) {
                oc4.m167095f(gcg0Var, cameraFilter, (File) obj);
            }
        })) {
            return;
        }
        C13274a.m80837u().m80848o(m167076F(cameraFilter.resource, f146646g + File.separator + str, new y20() { // from class: l.ub4
            @Override // p153l.y20
            public final void call(Object obj) {
                oc4.m167093e(gcg0Var, cameraFilter, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m167116w(gcg0 gcg0Var, File file) {
        gcg0Var.onNext(file);
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m167118y(gcg0 gcg0Var, File file) {
        gcg0Var.onNext(file);
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: A */
    public void m167119A(List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            StringBuilder sb = new StringBuilder();
            String str = f146651l;
            sb.append(str);
            String str2 = File.separator;
            sb.append(str2);
            sb.append(m167086T(cameraSticker));
            File file = new File(sb.toString());
            File file2 = new File(str + str2 + m167085S(cameraSticker));
            if (file.exists()) {
                cameraSticker.hasModelFile = true;
                cameraSticker.modelFilePath = file.renameTo(file2) ? file2.getAbsolutePath() : file.getAbsolutePath();
            } else if (file2.exists()) {
                cameraSticker.hasModelFile = true;
                cameraSticker.modelFilePath = file2.getAbsolutePath();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public C22421c<File> m167120I(final CameraSticker cameraSticker) {
        if (NullChecker.m82486a(this.f146660e.get(cameraSticker.resource))) {
            return this.f146660e.get(cameraSticker.resource);
        }
        C22421c<File> map = C22421c.create(new C22421c.a() { // from class: l.dc4
            @Override // p153l.y20
            public final void call(Object obj) {
                oc4.m167096f0(cameraSticker, (gcg0) obj);
            }
        }).map(new qcj() { // from class: l.ec4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f93005a.m167125W(cameraSticker, (File) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.fc4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f98176a.m167126X(cameraSticker, (File) obj);
            }
        });
        this.f146660e.put(cameraSticker.resource, map);
        return map;
    }

    /* JADX INFO: renamed from: J */
    public C22421c<MusicContent> m167121J(final Music music) {
        if (this.f146658c.indexOf(music.audio.url) != -1) {
            return C22421c.just(null);
        }
        this.f146658c.add(music.audio.url);
        return C22421c.create(new C22421c.a() { // from class: l.lc4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131271a.m167128Z(music, (gcg0) obj);
            }
        }).map(new qcj() { // from class: l.mc4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f135792a.m167127Y(music, (Boolean) obj);
            }
        }).compose(psd0.m173592C()).doOnNext(new y20() { // from class: l.nc4
            @Override // p153l.y20
            public final void call(Object obj) {
                oc4.m167108o((MusicContent) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public C22421c<File> m167122K(final CameraSticker cameraSticker) {
        if (NullChecker.m82486a(this.f146659d.get(cameraSticker.resource))) {
            return this.f146659d.get(cameraSticker.resource);
        }
        C22421c<File> map = C22421c.create(new C22421c.a() { // from class: l.qb4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156452a.m167129a0(cameraSticker, (gcg0) obj);
            }
        }).map(new qcj() { // from class: l.rb4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f161978a.m167130b0(cameraSticker, (File) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.sb4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f167104a.m167131c0(cameraSticker, (File) obj);
            }
        });
        this.f146659d.put(cameraSticker.resource, map);
        return map;
    }

    /* JADX INFO: renamed from: M */
    public List<CameraCategory> m167123M() {
        return this.f146656a;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m167124V(File file, String str) {
        return TextUtils.equals(file.getParentFile().getAbsolutePath(), str);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ File m167125W(CameraSticker cameraSticker, File file) {
        boolean z = file != null && file.exists() && m167136n0(file);
        File file2 = new File(f146654o + File.separator + m167082P(cameraSticker));
        if (z && file2.exists()) {
            return new File(m167103k0(m167082P(cameraSticker)));
        }
        return null;
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ File m167126X(CameraSticker cameraSticker, File file) {
        this.f146660e.remove(cameraSticker.resource);
        return file;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ MusicContent m167127Y(Music music, Boolean bool) {
        this.f146658c.remove(music.audio.url);
        if (!bool.booleanValue()) {
            return null;
        }
        File file = new File(f146652m + File.separator + m167083Q(music));
        if (file.exists()) {
            return cy10.m113085a(file.getAbsolutePath(), music);
        }
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ File m167130b0(CameraSticker cameraSticker, File file) {
        boolean z = file != null && file.exists() && m167137o0(file);
        File file2 = new File(f146651l + File.separator + m167085S(cameraSticker));
        if (!z || !file2.exists()) {
            return null;
        }
        if (cameraSticker.isBeautySticker()) {
            m167135l0(file2);
        }
        return file2;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ File m167131c0(CameraSticker cameraSticker, File file) {
        this.f146659d.remove(cameraSticker.resource);
        return file;
    }

    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void m167128Z(Music music, final gcg0<? super Boolean> gcg0Var) {
        String strM167083Q = m167083Q(music);
        if (m167087U(12, strM167083Q, new y20() { // from class: l.vb4
            @Override // p153l.y20
            public final void call(Object obj) {
                oc4.m167105m(gcg0Var, (File) obj);
            }
        })) {
            return;
        }
        C13274a.m80837u().m80848o(m167076F(music.audio.url, f146652m + File.separator + strM167083Q, new y20() { // from class: l.wb4
            @Override // p153l.y20
            public final void call(Object obj) {
                oc4.m167104l(gcg0Var, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final void m167129a0(CameraSticker cameraSticker, final gcg0<? super File> gcg0Var) {
        String strM167085S = m167085S(cameraSticker);
        if (m167087U(11, strM167085S, new y20() { // from class: l.xb4
            @Override // p153l.y20
            public final void call(Object obj) {
                oc4.m167098h(gcg0Var, (File) obj);
            }
        })) {
            return;
        }
        C13274a.m80837u().m80848o(m167076F(cameraSticker.resource, f146647h + File.separator + strM167085S, new y20() { // from class: l.yb4
            @Override // p153l.y20
            public final void call(Object obj) {
                oc4.m167110q(gcg0Var, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public void m167134j0(List<CameraCategory> list) {
        this.f146656a = list;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m167135l0(File file) {
        File file2 = new File(file, file.getName());
        if (file2.exists()) {
            oki.m168025m(file2.getAbsolutePath());
        }
        File file3 = new File(file, "__MACOSX");
        if (file3.isDirectory()) {
            oki.m168023k(file3);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m167136n0(File file) {
        String str = f146654o;
        return m167124V(file, str) || m167073C(f146648i, str, file.getName());
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m167137o0(File file) {
        String str = f146651l;
        return m167124V(file, str) || m167073C(f146647h, str, file.getName());
    }

    /* JADX INFO: renamed from: z */
    public void m167138z(List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            if (new File(f146654o + File.separator + m167082P(cameraSticker)).exists()) {
                cameraSticker.hasModelFile = true;
                cameraSticker.modelFilePath = m167103k0(m167082P(cameraSticker));
                cameraSticker.state = 3;
            }
        }
    }
}
