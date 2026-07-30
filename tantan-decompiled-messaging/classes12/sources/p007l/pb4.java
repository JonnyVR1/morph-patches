package p007l;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Pair;
import com.momo.mcamera.filtermanager.MMFilter;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.CameraCategory;
import com.p000p1.mobile.putong.feed.data.CameraFilter;
import com.p000p1.mobile.putong.feed.data.CameraSticker;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.p1.mobile.putong.ui.download.a;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.SharePatchFileUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import l.e30;
import l.f30;
import l.k9j;
import l.lsi0;
import l.mkd0;
import l.ogw;
import l.qib0;
import l.rhi;
import l.w9j;
import l.z3g0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class pb4 {

    /* JADX INFO: renamed from: f */
    public static String f11761f;

    /* JADX INFO: renamed from: g */
    public static final String f11762g;

    /* JADX INFO: renamed from: h */
    public static final String f11763h;

    /* JADX INFO: renamed from: i */
    public static final String f11764i;

    /* JADX INFO: renamed from: j */
    public static final String f11765j;

    /* JADX INFO: renamed from: k */
    public static final String f11766k;

    /* JADX INFO: renamed from: l */
    public static final String f11767l;

    /* JADX INFO: renamed from: m */
    public static final String f11768m;

    /* JADX INFO: renamed from: n */
    public static final String f11769n;

    /* JADX INFO: renamed from: o */
    public static final String f11770o;

    /* JADX INFO: renamed from: p */
    public static pb4 f11771p;

    /* JADX INFO: renamed from: a */
    public List<CameraCategory> f11772a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<CameraCategory> f11773b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ArrayList<String> f11774c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public HashMap<String, c<File>> f11775d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public HashMap<String, c<File>> f11776e = new HashMap<>();

    static {
        if (NullChecker.a(FeedModule.f313a.getExternalCacheDir())) {
            f11761f = FeedModule.f313a.getExternalCacheDir().getAbsolutePath();
        } else {
            f11761f = FeedModule.f313a.getCacheDir().getAbsolutePath();
        }
        f11762g = f11761f + "/zip/filter";
        f11763h = f11761f + "/zip/sticker";
        f11764i = f11761f + "/zip/makeup";
        f11765j = f11761f + "/zip";
        f11766k = f11761f + "/filterData/filterImg";
        f11767l = f11761f + "/moment";
        f11768m = f11761f + "/music";
        f11769n = f11761f + "/musictemp";
        f11770o = f11761f + "/makeup";
        f11771p = null;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m12952B(File file, String str) {
        return SharePatchFileUtil.isLegalFile(file) && TextUtils.equals(str, ogw.d(file));
    }

    /* JADX INFO: renamed from: C */
    public static boolean m12953C(String str, String str2, String str3) {
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
        if (!rhi.c(str + str4 + str3, string)) {
            return false;
        }
        try {
            File file3 = new File(string + str4 + str3);
            rhi.g(file3, file3.getParentFile());
            return true;
        } catch (Exception e) {
            CrashHelper.c(new Exception(e.getMessage() + ", AvailableBytes: " + m12959L(), e));
            return false;
        }
    }

    /* JADX INFO: renamed from: D */
    public static String m12954D(String str) {
        File file = new File(f11769n);
        if (!file.exists()) {
            file.mkdirs();
        }
        String name = new File(str).getName();
        String strE = ogw.e(str);
        rhi.c(str, file.getAbsolutePath());
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(name);
        new File(sb.toString()).renameTo(new File(file.getAbsolutePath() + str2 + strE));
        return file.getAbsolutePath() + str2 + strE;
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
    public static void m12955E() throws Throwable {
        ?? r3;
        InputStream inputStreamOpen;
        ?? r4;
        ?? fileOutputStream;
        IOException e;
        ?? fileOutputStream2;
        boolean zA;
        ?? r5;
        ?? r6;
        ?? r1;
        File file = new File(f11761f + "/filterData/local_filter", "0_0");
        if (!file.exists()) {
            try {
                k9j.H(file);
            } catch (Exception e2) {
                CrashHelper.c(e2);
            }
        }
        ?? file2 = new File(file, "icon.jpg");
        ?? Open = "lookup.png";
        File file3 = new File(file, "lookup.png");
        if (m12952B(file2, "B3BCF8C6AB5A320D178220CAA774D0E4") && m12952B(file3, "B8C760C8247CCB75E02A8A3910B86073")) {
            return;
        }
        try {
            try {
                try {
                    Open = FeedModule.f313a.getResources().getAssets().open("origin_icon_v2.jpg");
                    try {
                        inputStreamOpen = FeedModule.f313a.getResources().getAssets().open("origin_lookup.png");
                        try {
                            fileOutputStream = new FileOutputStream((File) file2);
                            try {
                                rhi.f((InputStream) Open, (OutputStream) fileOutputStream);
                                fileOutputStream2 = new FileOutputStream(file3);
                                try {
                                    rhi.f(inputStreamOpen, (OutputStream) fileOutputStream2);
                                    if (NullChecker.a((Object) Open)) {
                                        Open.close();
                                    }
                                    if (NullChecker.a((Object) fileOutputStream)) {
                                        fileOutputStream.close();
                                    }
                                    if (NullChecker.a(inputStreamOpen)) {
                                        inputStreamOpen.close();
                                    }
                                    boolean zA2 = NullChecker.a((Object) fileOutputStream2);
                                    r1 = fileOutputStream2;
                                    r6 = Open;
                                    r5 = fileOutputStream;
                                    file2 = fileOutputStream2;
                                    Open = Open;
                                    fileOutputStream = fileOutputStream;
                                    if (zA2) {
                                        r1.close();
                                        file2 = r1;
                                        Open = r6;
                                        fileOutputStream = r5;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    CrashHelper.c(e);
                                    if (NullChecker.a((Object) Open)) {
                                        Open.close();
                                    }
                                    if (NullChecker.a((Object) fileOutputStream)) {
                                        fileOutputStream.close();
                                    }
                                    if (NullChecker.a(inputStreamOpen)) {
                                        inputStreamOpen.close();
                                    }
                                    zA = NullChecker.a((Object) fileOutputStream2);
                                    r1 = fileOutputStream2;
                                    r6 = Open;
                                    r5 = fileOutputStream;
                                    file2 = fileOutputStream2;
                                    Open = Open;
                                    fileOutputStream = fileOutputStream;
                                    if (zA) {
                                    }
                                }
                            } catch (IOException e4) {
                                fileOutputStream2 = 0;
                                e = e4;
                            } catch (Throwable th) {
                                file2 = 0;
                                th = th;
                                try {
                                    if (NullChecker.a((Object) Open)) {
                                        Open.close();
                                    }
                                    if (NullChecker.a((Object) fileOutputStream)) {
                                        fileOutputStream.close();
                                    }
                                    if (NullChecker.a(inputStreamOpen)) {
                                        inputStreamOpen.close();
                                    }
                                    if (NullChecker.a((Object) file2)) {
                                        file2.close();
                                    }
                                } catch (IOException e5) {
                                    CrashHelper.c(e5);
                                }
                                throw th;
                            }
                        } catch (IOException e6) {
                            e = e6;
                            fileOutputStream = 0;
                            Open = Open;
                            e = e;
                            fileOutputStream2 = fileOutputStream;
                            CrashHelper.c(e);
                            if (NullChecker.a((Object) Open)) {
                                Open.close();
                            }
                            if (NullChecker.a((Object) fileOutputStream)) {
                                fileOutputStream.close();
                            }
                            if (NullChecker.a(inputStreamOpen)) {
                                inputStreamOpen.close();
                            }
                            zA = NullChecker.a((Object) fileOutputStream2);
                            r1 = fileOutputStream2;
                            r6 = Open;
                            r5 = fileOutputStream;
                            file2 = fileOutputStream2;
                            Open = Open;
                            fileOutputStream = fileOutputStream;
                            if (zA) {
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
                            if (NullChecker.a((Object) Open)) {
                                Open.close();
                            }
                            if (NullChecker.a((Object) fileOutputStream)) {
                                fileOutputStream.close();
                            }
                            if (NullChecker.a(inputStreamOpen)) {
                                inputStreamOpen.close();
                            }
                            if (NullChecker.a((Object) file2)) {
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
                        CrashHelper.c(e);
                        if (NullChecker.a((Object) Open)) {
                            Open.close();
                        }
                        if (NullChecker.a((Object) fileOutputStream)) {
                            fileOutputStream.close();
                        }
                        if (NullChecker.a(inputStreamOpen)) {
                            inputStreamOpen.close();
                        }
                        zA = NullChecker.a((Object) fileOutputStream2);
                        r1 = fileOutputStream2;
                        r6 = Open;
                        r5 = fileOutputStream;
                        file2 = fileOutputStream2;
                        Open = Open;
                        fileOutputStream = fileOutputStream;
                        if (zA) {
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
                        if (NullChecker.a((Object) Open)) {
                            Open.close();
                        }
                        if (NullChecker.a((Object) fileOutputStream)) {
                            fileOutputStream.close();
                        }
                        if (NullChecker.a(inputStreamOpen)) {
                            inputStreamOpen.close();
                        }
                        if (NullChecker.a((Object) file2)) {
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
            CrashHelper.c(e9);
        }
    }

    /* JADX INFO: renamed from: F */
    public static DownloadTask m12956F(String str, String str2, final e30<File> e30Var) {
        try {
            k9j.H(new File(str2).getParentFile());
            return new DownloadTask.b(qib0.H.getDownloadHttp()).q(str).o(str2).j(new f30() { // from class: l.ab4
                public final void call(Object obj, Object obj2) {
                    e30Var.call((File) obj2);
                }
            }).f(new f30() { // from class: l.cb4
                public final void call(Object obj, Object obj2) {
                    e30Var.call((Object) null);
                }
            }).d(new e30() { // from class: l.db4
                public final void call(Object obj) {
                    e30Var.call((Object) null);
                }
            }).a();
        } catch (RuntimeException e) {
            CrashHelper.d(e, 100);
            e30Var.call((Object) null);
            return null;
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m12957G(File file) {
        if (!file.isDirectory()) {
            if (file.exists()) {
                file.delete();
            }
        } else {
            for (File file2 : file.listFiles()) {
                m12957G(file2);
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m12958H() {
        m12957G(new File(f11769n));
    }

    /* JADX INFO: renamed from: L */
    public static long m12959L() {
        try {
            return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes();
        } catch (Exception e) {
            CrashHelper.c(new RuntimeException("getAvailableBytes error.", e));
            return 0L;
        }
    }

    /* JADX INFO: renamed from: N */
    public static String m12960N(CameraFilter cameraFilter) {
        return cameraFilter.f679id + "_" + ogw.e(cameraFilter.name) + "_" + cameraFilter.minVersion;
    }

    /* JADX INFO: renamed from: O */
    public static pb4 m12961O() {
        if (f11771p == null) {
            synchronized (pb4.class) {
                try {
                    if (f11771p == null) {
                        f11771p = new pb4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11771p;
    }

    /* JADX INFO: renamed from: P */
    public static String m12962P(CameraSticker cameraSticker) {
        return cameraSticker.f680id + "_" + ogw.e(cameraSticker.name) + "_" + cameraSticker.minVersion;
    }

    /* JADX INFO: renamed from: Q */
    public static String m12963Q(Music music) {
        return ogw.e(music.audio.url);
    }

    /* JADX INFO: renamed from: R */
    public static List<MMPresetFilter> m12964R() {
        ArrayList arrayList = new ArrayList();
        MMPresetFilter mMPresetFilter = new MMPresetFilter();
        ((MMFilter) mMPresetFilter).mFilterName = "原图";
        mMPresetFilter.mFilterId = "0";
        arrayList.add(mMPresetFilter);
        return arrayList;
    }

    /* JADX INFO: renamed from: S */
    public static String m12965S(CameraSticker cameraSticker) {
        return ogw.e(m12966T(cameraSticker));
    }

    /* JADX INFO: renamed from: T */
    public static String m12966T(CameraSticker cameraSticker) {
        return cameraSticker.f680id + "_" + cameraSticker.name + "_" + cameraSticker.minVersion;
    }

    /* JADX INFO: renamed from: U */
    public static boolean m12967U(int i, String str, e30<File> e30Var) {
        String str2;
        switch (i) {
            case 10:
                str2 = f11766k;
                break;
            case 11:
                str2 = f11767l;
                break;
            case 12:
                str2 = f11768m;
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdirs();
                }
                break;
            case 13:
                str2 = f11770o;
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
        e30Var.call(file3);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m12970c(CameraFilter cameraFilter, CameraFilter cameraFilter2) {
        if (cameraFilter == null || cameraFilter2 == null) {
            return 0;
        }
        return cameraFilter.index - cameraFilter2.index;
    }

    /* JADX INFO: renamed from: d0 */
    public static c<List<MMPresetFilter>> m12972d0(List<CameraFilter> list) {
        List<MMPresetFilter> listM12964R = m12964R();
        hli.m10655j().m10669t(listM12964R);
        return list.isEmpty() ? c.just(listM12964R) : c.from(list).flatMap(new w9j() { // from class: l.hb4
            public final Object call(Object obj) {
                return pb4.m12974e0((CameraFilter) obj);
            }
        }).map(new w9j() { // from class: l.ib4
            public final Object call(Object obj) {
                return pb4.m12986m0((Pair) obj);
            }
        }).toList().map(new w9j() { // from class: l.jb4
            public final Object call(Object obj) {
                return pb4.m12980i0((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m12973e(z3g0 z3g0Var, CameraFilter cameraFilter, File file) {
        z3g0Var.onNext(new Pair(cameraFilter, file));
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: e0 */
    public static c<Pair<CameraFilter, File>> m12974e0(final CameraFilter cameraFilter) {
        final String strM12960N = m12960N(cameraFilter);
        return c.create(new c.a() { // from class: l.lb4
            public final void call(Object obj) {
                pb4.m12993t(strM12960N, cameraFilter, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m12975f(z3g0 z3g0Var, CameraFilter cameraFilter, File file) {
        z3g0Var.onNext(new Pair(cameraFilter, file));
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: f0 */
    public static void m12976f0(CameraSticker cameraSticker, final z3g0<? super File> z3g0Var) {
        String strM12962P = m12962P(cameraSticker);
        if (m12967U(13, strM12962P, new e30() { // from class: l.qa4
            public final void call(Object obj) {
                pb4.m12996w(z3g0Var, (File) obj);
            }
        })) {
            return;
        }
        a.u().o(m12956F(cameraSticker.resource, f11764i + File.separator + strM12962P, new e30() { // from class: l.bb4
            public final void call(Object obj) {
                pb4.m12998y(z3g0Var, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m12978h(z3g0 z3g0Var, File file) {
        z3g0Var.onNext(file);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: i0 */
    public static List<MMPresetFilter> m12980i0(List<CameraFilter> list) {
        Collections.sort(list, new Comparator() { // from class: l.kb4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return pb4.m12970c((CameraFilter) obj, (CameraFilter) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        MMPresetFilter mMPresetFilter = new MMPresetFilter();
        ((MMFilter) mMPresetFilter).mFilterName = "原图";
        mMPresetFilter.mFilterId = "0";
        arrayList.add(mMPresetFilter);
        for (CameraFilter cameraFilter : list) {
            if (NullChecker.a(cameraFilter)) {
                MMPresetFilter mMPresetFilter2 = new MMPresetFilter();
                mMPresetFilter2.mFilterId = cameraFilter.f679id;
                mMPresetFilter2.mFilterIcon = cameraFilter.icon;
                ((MMFilter) mMPresetFilter2).mFilterName = cameraFilter.name;
                arrayList.add(mMPresetFilter2);
            }
        }
        hli.m10655j().m10669t(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    public static String m12983k0(String str) {
        File file = new File(f11770o + File.separator + str);
        File file2 = new File(file, file.getName());
        if (file2.exists() && file2.isFile()) {
            rhi.m(file2.getAbsolutePath());
        }
        File file3 = new File(file, "__MACOSX");
        if (file3.isDirectory()) {
            rhi.k(file3);
        }
        File[] fileArrListFiles = file.listFiles();
        return (fileArrListFiles == null || fileArrListFiles.length <= 0) ? "" : fileArrListFiles[0].getAbsolutePath();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m12984l(z3g0 z3g0Var, File file) {
        z3g0Var.onNext(Boolean.valueOf(file != null));
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m12985m(z3g0 z3g0Var, File file) {
        z3g0Var.onNext(Boolean.TRUE);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: m0 */
    public static CameraFilter m12986m0(Pair<CameraFilter, File> pair) {
        File file = (File) pair.second;
        if (NullChecker.a(file)) {
            String absolutePath = file.getParentFile().getAbsolutePath();
            String str = f11762g;
            if (TextUtils.equals(absolutePath, str)) {
                m12953C(str, f11766k, file.getName());
            }
        }
        if (file != null) {
            return (CameraFilter) pair.first;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m12988o(MusicContent musicContent) {
        if (musicContent == null) {
            lsi0.h(R$string.f592q1);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m12990q(z3g0 z3g0Var, File file) {
        z3g0Var.onNext(file);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m12993t(String str, final CameraFilter cameraFilter, final z3g0 z3g0Var) {
        if (m12967U(10, str, new e30() { // from class: l.ua4
            public final void call(Object obj) {
                pb4.m12975f(z3g0Var, cameraFilter, (File) obj);
            }
        })) {
            return;
        }
        a.u().o(m12956F(cameraFilter.resource, f11762g + File.separator + str, new e30() { // from class: l.va4
            public final void call(Object obj) {
                pb4.m12973e(z3g0Var, cameraFilter, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m12996w(z3g0 z3g0Var, File file) {
        z3g0Var.onNext(file);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m12998y(z3g0 z3g0Var, File file) {
        z3g0Var.onNext(file);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: A */
    public void m12999A(List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            StringBuilder sb = new StringBuilder();
            String str = f11767l;
            sb.append(str);
            String str2 = File.separator;
            sb.append(str2);
            sb.append(m12966T(cameraSticker));
            File file = new File(sb.toString());
            File file2 = new File(str + str2 + m12965S(cameraSticker));
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
    public c<File> m13000I(final CameraSticker cameraSticker) {
        if (NullChecker.a(this.f11776e.get(cameraSticker.resource))) {
            return this.f11776e.get(cameraSticker.resource);
        }
        c<File> map = c.create(new c.a() { // from class: l.eb4
            public final void call(Object obj) {
                pb4.m12976f0(cameraSticker, (z3g0) obj);
            }
        }).map(new w9j() { // from class: l.fb4
            public final Object call(Object obj) {
                return this.f8060a.m13005W(cameraSticker, (File) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.gb4
            public final Object call(Object obj) {
                return this.f8413a.m13006X(cameraSticker, (File) obj);
            }
        });
        this.f11776e.put(cameraSticker.resource, map);
        return map;
    }

    /* JADX INFO: renamed from: J */
    public c<MusicContent> m13001J(final Music music) {
        if (this.f11774c.indexOf(music.audio.url) != -1) {
            return c.just((Object) null);
        }
        this.f11774c.add(music.audio.url);
        return c.create(new c.a() { // from class: l.mb4
            public final void call(Object obj) {
                this.f10408a.m13008Z(music, (z3g0) obj);
            }
        }).map(new w9j() { // from class: l.nb4
            public final Object call(Object obj) {
                return this.f10731a.m13007Y(music, (Boolean) obj);
            }
        }).compose(mkd0.C()).doOnNext(new e30() { // from class: l.ob4
            public final void call(Object obj) {
                pb4.m12988o((MusicContent) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public c<File> m13002K(final CameraSticker cameraSticker) {
        if (NullChecker.a(this.f11775d.get(cameraSticker.resource))) {
            return this.f11775d.get(cameraSticker.resource);
        }
        c<File> map = c.create(new c.a() { // from class: l.ra4
            public final void call(Object obj) {
                this.f12571a.m13009a0(cameraSticker, (z3g0) obj);
            }
        }).map(new w9j() { // from class: l.sa4
            public final Object call(Object obj) {
                return this.f12851a.m13010b0(cameraSticker, (File) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.ta4
            public final Object call(Object obj) {
                return this.f13243a.m13011c0(cameraSticker, (File) obj);
            }
        });
        this.f11775d.put(cameraSticker.resource, map);
        return map;
    }

    /* JADX INFO: renamed from: M */
    public List<CameraCategory> m13003M() {
        return this.f11772a;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m13004V(File file, String str) {
        return TextUtils.equals(file.getParentFile().getAbsolutePath(), str);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ File m13005W(CameraSticker cameraSticker, File file) {
        boolean z = file != null && file.exists() && m13016n0(file);
        File file2 = new File(f11770o + File.separator + m12962P(cameraSticker));
        if (z && file2.exists()) {
            return new File(m12983k0(m12962P(cameraSticker)));
        }
        return null;
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ File m13006X(CameraSticker cameraSticker, File file) {
        this.f11776e.remove(cameraSticker.resource);
        return file;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ MusicContent m13007Y(Music music, Boolean bool) {
        this.f11774c.remove(music.audio.url);
        if (!bool.booleanValue()) {
            return null;
        }
        File file = new File(f11768m + File.separator + m12963Q(music));
        if (file.exists()) {
            return up10.m15127a(file.getAbsolutePath(), music);
        }
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ File m13010b0(CameraSticker cameraSticker, File file) {
        boolean z = file != null && file.exists() && m13017o0(file);
        File file2 = new File(f11767l + File.separator + m12965S(cameraSticker));
        if (!z || !file2.exists()) {
            return null;
        }
        if (cameraSticker.isBeautySticker()) {
            m13015l0(file2);
        }
        return file2;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ File m13011c0(CameraSticker cameraSticker, File file) {
        this.f11775d.remove(cameraSticker.resource);
        return file;
    }

    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void m13008Z(Music music, final z3g0<? super Boolean> z3g0Var) {
        String strM12963Q = m12963Q(music);
        if (m12967U(12, strM12963Q, new e30() { // from class: l.wa4
            public final void call(Object obj) {
                pb4.m12985m(z3g0Var, (File) obj);
            }
        })) {
            return;
        }
        a.u().o(m12956F(music.audio.url, f11768m + File.separator + strM12963Q, new e30() { // from class: l.xa4
            public final void call(Object obj) {
                pb4.m12984l(z3g0Var, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final void m13009a0(CameraSticker cameraSticker, final z3g0<? super File> z3g0Var) {
        String strM12965S = m12965S(cameraSticker);
        if (m12967U(11, strM12965S, new e30() { // from class: l.ya4
            public final void call(Object obj) {
                pb4.m12978h(z3g0Var, (File) obj);
            }
        })) {
            return;
        }
        a.u().o(m12956F(cameraSticker.resource, f11763h + File.separator + strM12965S, new e30() { // from class: l.za4
            public final void call(Object obj) {
                pb4.m12990q(z3g0Var, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public void m13014j0(List<CameraCategory> list) {
        this.f11772a = list;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m13015l0(File file) {
        File file2 = new File(file, file.getName());
        if (file2.exists()) {
            rhi.m(file2.getAbsolutePath());
        }
        File file3 = new File(file, "__MACOSX");
        if (file3.isDirectory()) {
            rhi.k(file3);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m13016n0(File file) {
        String str = f11770o;
        return m13004V(file, str) || m12953C(f11764i, str, file.getName());
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m13017o0(File file) {
        String str = f11767l;
        return m13004V(file, str) || m12953C(f11763h, str, file.getName());
    }

    /* JADX INFO: renamed from: z */
    public void m13018z(List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            if (new File(f11770o + File.separator + m12962P(cameraSticker)).exists()) {
                cameraSticker.hasModelFile = true;
                cameraSticker.modelFilePath = m12983k0(m12962P(cameraSticker));
                cameraSticker.state = 3;
            }
        }
    }
}
