package p149l;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.CameraCategory;
import com.p046p1.mobile.putong.feed.data.CameraFilter;
import com.p046p1.mobile.putong.feed.data.CameraSticker;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class pb4 {

    /* JADX INFO: renamed from: f */
    public static String f148046f;

    /* JADX INFO: renamed from: g */
    public static final String f148047g;

    /* JADX INFO: renamed from: h */
    public static final String f148048h;

    /* JADX INFO: renamed from: i */
    public static final String f148049i;

    /* JADX INFO: renamed from: j */
    public static final String f148050j;

    /* JADX INFO: renamed from: k */
    public static final String f148051k;

    /* JADX INFO: renamed from: l */
    public static final String f148052l;

    /* JADX INFO: renamed from: m */
    public static final String f148053m;

    /* JADX INFO: renamed from: n */
    public static final String f148054n;

    /* JADX INFO: renamed from: o */
    public static final String f148055o;

    /* JADX INFO: renamed from: p */
    public static pb4 f148056p;

    /* JADX INFO: renamed from: a */
    public List<CameraCategory> f148057a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<CameraCategory> f148058b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ArrayList<String> f148059c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public HashMap<String, C22306c<File>> f148060d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public HashMap<String, C22306c<File>> f148061e = new HashMap<>();

    static {
        if (NullChecker.m81303a(FeedModule.f38852a.getExternalCacheDir())) {
            f148046f = FeedModule.f38852a.getExternalCacheDir().getAbsolutePath();
        } else {
            f148046f = FeedModule.f38852a.getCacheDir().getAbsolutePath();
        }
        f148047g = f148046f + "/zip/filter";
        f148048h = f148046f + "/zip/sticker";
        f148049i = f148046f + "/zip/makeup";
        f148050j = f148046f + "/zip";
        f148051k = f148046f + "/filterData/filterImg";
        f148052l = f148046f + "/moment";
        f148053m = f148046f + "/music";
        f148054n = f148046f + "/musictemp";
        f148055o = f148046f + "/makeup";
        f148056p = null;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m168133B(File file, String str) {
        return SharePatchFileUtil.isLegalFile(file) && TextUtils.equals(str, ogw.m164283d(file));
    }

    /* JADX INFO: renamed from: C */
    public static boolean m168134C(String str, String str2, String str3) {
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
        if (!rhi.m179359c(str + str4 + str3, string)) {
            return false;
        }
        try {
            File file3 = new File(string + str4 + str3);
            rhi.m179363g(file3, file3.getParentFile());
            return true;
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception(e.getMessage() + ", AvailableBytes: " + m168140L(), e));
            return false;
        }
    }

    /* JADX INFO: renamed from: D */
    public static String m168135D(String str) {
        File file = new File(f148054n);
        if (!file.exists()) {
            file.mkdirs();
        }
        String name = new File(str).getName();
        String strM164284e = ogw.m164284e(str);
        rhi.m179359c(str, file.getAbsolutePath());
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(name);
        new File(sb.toString()).renameTo(new File(file.getAbsolutePath() + str2 + strM164284e));
        return file.getAbsolutePath() + str2 + strM164284e;
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
    public static void m168136E() {
        ?? r3;
        InputStream inputStreamOpen;
        ?? r4;
        ?? fileOutputStream;
        IOException e;
        ?? fileOutputStream2;
        boolean zM81303a;
        ?? r5;
        ?? r6;
        ?? r1;
        File file = new File(f148046f + "/filterData/local_filter", Constants.TEST_IDENTIFIER);
        if (!file.exists()) {
            try {
                k9j.m145076H(file);
            } catch (Exception e2) {
                CrashHelper.m81296c(e2);
            }
        }
        ?? file2 = new File(file, "icon.jpg");
        ?? Open = "lookup.png";
        File file3 = new File(file, "lookup.png");
        if (m168133B(file2, "B3BCF8C6AB5A320D178220CAA774D0E4") && m168133B(file3, "B8C760C8247CCB75E02A8A3910B86073")) {
            return;
        }
        try {
            try {
                try {
                    Open = FeedModule.f38852a.getResources().getAssets().open("origin_icon_v2.jpg");
                    try {
                        inputStreamOpen = FeedModule.f38852a.getResources().getAssets().open("origin_lookup.png");
                        try {
                            fileOutputStream = new FileOutputStream((File) file2);
                            try {
                                rhi.m179362f(Open, fileOutputStream);
                                fileOutputStream2 = new FileOutputStream(file3);
                                try {
                                    rhi.m179362f(inputStreamOpen, fileOutputStream2);
                                    if (NullChecker.m81303a(Open)) {
                                        Open.close();
                                    }
                                    if (NullChecker.m81303a(fileOutputStream)) {
                                        fileOutputStream.close();
                                    }
                                    if (NullChecker.m81303a(inputStreamOpen)) {
                                        inputStreamOpen.close();
                                    }
                                    boolean zM81303a2 = NullChecker.m81303a(fileOutputStream2);
                                    r1 = fileOutputStream2;
                                    r6 = Open;
                                    r5 = fileOutputStream;
                                    file2 = fileOutputStream2;
                                    Open = Open;
                                    fileOutputStream = fileOutputStream;
                                    if (zM81303a2) {
                                        r1.close();
                                        file2 = r1;
                                        Open = r6;
                                        fileOutputStream = r5;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    CrashHelper.m81296c(e);
                                    if (NullChecker.m81303a(Open)) {
                                        Open.close();
                                    }
                                    if (NullChecker.m81303a(fileOutputStream)) {
                                        fileOutputStream.close();
                                    }
                                    if (NullChecker.m81303a(inputStreamOpen)) {
                                        inputStreamOpen.close();
                                    }
                                    zM81303a = NullChecker.m81303a(fileOutputStream2);
                                    r1 = fileOutputStream2;
                                    r6 = Open;
                                    r5 = fileOutputStream;
                                    file2 = fileOutputStream2;
                                    Open = Open;
                                    fileOutputStream = fileOutputStream;
                                    if (zM81303a) {
                                    }
                                }
                            } catch (IOException e4) {
                                fileOutputStream2 = 0;
                                e = e4;
                            } catch (Throwable th) {
                                file2 = 0;
                                th = th;
                                try {
                                    if (NullChecker.m81303a(Open)) {
                                        Open.close();
                                    }
                                    if (NullChecker.m81303a(fileOutputStream)) {
                                        fileOutputStream.close();
                                    }
                                    if (NullChecker.m81303a(inputStreamOpen)) {
                                        inputStreamOpen.close();
                                    }
                                    if (NullChecker.m81303a(file2)) {
                                        file2.close();
                                    }
                                } catch (IOException e5) {
                                    CrashHelper.m81296c(e5);
                                }
                                throw th;
                            }
                        } catch (IOException e6) {
                            e = e6;
                            fileOutputStream = 0;
                            Open = Open;
                            e = e;
                            fileOutputStream2 = fileOutputStream;
                            CrashHelper.m81296c(e);
                            if (NullChecker.m81303a(Open)) {
                                Open.close();
                            }
                            if (NullChecker.m81303a(fileOutputStream)) {
                                fileOutputStream.close();
                            }
                            if (NullChecker.m81303a(inputStreamOpen)) {
                                inputStreamOpen.close();
                            }
                            zM81303a = NullChecker.m81303a(fileOutputStream2);
                            r1 = fileOutputStream2;
                            r6 = Open;
                            r5 = fileOutputStream;
                            file2 = fileOutputStream2;
                            Open = Open;
                            fileOutputStream = fileOutputStream;
                            if (zM81303a) {
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
                            if (NullChecker.m81303a(Open)) {
                                Open.close();
                            }
                            if (NullChecker.m81303a(fileOutputStream)) {
                                fileOutputStream.close();
                            }
                            if (NullChecker.m81303a(inputStreamOpen)) {
                                inputStreamOpen.close();
                            }
                            if (NullChecker.m81303a(file2)) {
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
                        CrashHelper.m81296c(e);
                        if (NullChecker.m81303a(Open)) {
                            Open.close();
                        }
                        if (NullChecker.m81303a(fileOutputStream)) {
                            fileOutputStream.close();
                        }
                        if (NullChecker.m81303a(inputStreamOpen)) {
                            inputStreamOpen.close();
                        }
                        zM81303a = NullChecker.m81303a(fileOutputStream2);
                        r1 = fileOutputStream2;
                        r6 = Open;
                        r5 = fileOutputStream;
                        file2 = fileOutputStream2;
                        Open = Open;
                        fileOutputStream = fileOutputStream;
                        if (zM81303a) {
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
                        if (NullChecker.m81303a(Open)) {
                            Open.close();
                        }
                        if (NullChecker.m81303a(fileOutputStream)) {
                            fileOutputStream.close();
                        }
                        if (NullChecker.m81303a(inputStreamOpen)) {
                            inputStreamOpen.close();
                        }
                        if (NullChecker.m81303a(file2)) {
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
            CrashHelper.m81296c(e9);
        }
    }

    /* JADX INFO: renamed from: F */
    public static DownloadTask m168137F(String str, String str2, final e30<File> e30Var) {
        try {
            k9j.m145076H(new File(str2).getParentFile());
            return new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str).m79640o(str2).m79635j(new f30() { // from class: l.ab4
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    e30Var.call((File) obj2);
                }
            }).m79631f(new f30() { // from class: l.cb4
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    e30Var.call(null);
                }
            }).m79629d(new e30() { // from class: l.db4
                @Override // p149l.e30
                public final void call(Object obj) {
                    e30Var.call(null);
                }
            }).m79626a();
        } catch (RuntimeException e) {
            CrashHelper.m81297d(e, 100);
            e30Var.call(null);
            return null;
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m168138G(File file) {
        if (!file.isDirectory()) {
            if (file.exists()) {
                file.delete();
            }
        } else {
            for (File file2 : file.listFiles()) {
                m168138G(file2);
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m168139H() {
        m168138G(new File(f148054n));
    }

    /* JADX INFO: renamed from: L */
    public static long m168140L() {
        try {
            return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes();
        } catch (Exception e) {
            CrashHelper.m81296c(new RuntimeException("getAvailableBytes error.", e));
            return 0L;
        }
    }

    /* JADX INFO: renamed from: N */
    public static String m168141N(CameraFilter cameraFilter) {
        return cameraFilter.f39218id + "_" + ogw.m164284e(cameraFilter.name) + "_" + cameraFilter.minVersion;
    }

    /* JADX INFO: renamed from: O */
    public static pb4 m168142O() {
        if (f148056p == null) {
            synchronized (pb4.class) {
                try {
                    if (f148056p == null) {
                        f148056p = new pb4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f148056p;
    }

    /* JADX INFO: renamed from: P */
    public static String m168143P(CameraSticker cameraSticker) {
        return cameraSticker.f39219id + "_" + ogw.m164284e(cameraSticker.name) + "_" + cameraSticker.minVersion;
    }

    /* JADX INFO: renamed from: Q */
    public static String m168144Q(Music music) {
        return ogw.m164284e(music.audio.url);
    }

    /* JADX INFO: renamed from: R */
    public static List<MMPresetFilter> m168145R() {
        ArrayList arrayList = new ArrayList();
        MMPresetFilter mMPresetFilter = new MMPresetFilter();
        mMPresetFilter.mFilterName = "原图";
        mMPresetFilter.mFilterId = "0";
        arrayList.add(mMPresetFilter);
        return arrayList;
    }

    /* JADX INFO: renamed from: S */
    public static String m168146S(CameraSticker cameraSticker) {
        return ogw.m164284e(m168147T(cameraSticker));
    }

    /* JADX INFO: renamed from: T */
    public static String m168147T(CameraSticker cameraSticker) {
        return cameraSticker.f39219id + "_" + cameraSticker.name + "_" + cameraSticker.minVersion;
    }

    /* JADX INFO: renamed from: U */
    public static boolean m168148U(int i, String str, e30<File> e30Var) {
        String str2;
        switch (i) {
            case 10:
                str2 = f148051k;
                break;
            case 11:
                str2 = f148052l;
                break;
            case 12:
                str2 = f148053m;
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdirs();
                }
                break;
            case 13:
                str2 = f148055o;
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
    public static /* synthetic */ int m168151c(CameraFilter cameraFilter, CameraFilter cameraFilter2) {
        if (cameraFilter == null || cameraFilter2 == null) {
            return 0;
        }
        return cameraFilter.index - cameraFilter2.index;
    }

    /* JADX INFO: renamed from: d0 */
    public static C22306c<List<MMPresetFilter>> m168153d0(List<CameraFilter> list) {
        List<MMPresetFilter> listM168145R = m168145R();
        hli.m131661j().m131675t(listM168145R);
        return list.isEmpty() ? C22306c.just(listM168145R) : C22306c.from(list).flatMap(new w9j() { // from class: l.hb4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pb4.m168155e0((CameraFilter) obj);
            }
        }).map(new w9j() { // from class: l.ib4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pb4.m168167m0((Pair) obj);
            }
        }).toList().map(new w9j() { // from class: l.jb4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pb4.m168161i0((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m168154e(z3g0 z3g0Var, CameraFilter cameraFilter, File file) {
        z3g0Var.onNext(new Pair(cameraFilter, file));
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: e0 */
    public static C22306c<Pair<CameraFilter, File>> m168155e0(final CameraFilter cameraFilter) {
        final String strM168141N = m168141N(cameraFilter);
        return C22306c.create(new C22306c.a() { // from class: l.lb4
            @Override // p149l.e30
            public final void call(Object obj) {
                pb4.m168174t(strM168141N, cameraFilter, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m168156f(z3g0 z3g0Var, CameraFilter cameraFilter, File file) {
        z3g0Var.onNext(new Pair(cameraFilter, file));
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: f0 */
    public static void m168157f0(CameraSticker cameraSticker, final z3g0<? super File> z3g0Var) {
        String strM168143P = m168143P(cameraSticker);
        if (m168148U(13, strM168143P, new e30() { // from class: l.qa4
            @Override // p149l.e30
            public final void call(Object obj) {
                pb4.m168177w(z3g0Var, (File) obj);
            }
        })) {
            return;
        }
        C13111a.m79654u().m79665o(m168137F(cameraSticker.resource, f148049i + File.separator + strM168143P, new e30() { // from class: l.bb4
            @Override // p149l.e30
            public final void call(Object obj) {
                pb4.m168179y(z3g0Var, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m168159h(z3g0 z3g0Var, File file) {
        z3g0Var.onNext(file);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: i0 */
    public static List<MMPresetFilter> m168161i0(List<CameraFilter> list) {
        Collections.sort(list, new Comparator() { // from class: l.kb4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return pb4.m168151c((CameraFilter) obj, (CameraFilter) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        MMPresetFilter mMPresetFilter = new MMPresetFilter();
        mMPresetFilter.mFilterName = "原图";
        mMPresetFilter.mFilterId = "0";
        arrayList.add(mMPresetFilter);
        for (CameraFilter cameraFilter : list) {
            if (NullChecker.m81303a(cameraFilter)) {
                MMPresetFilter mMPresetFilter2 = new MMPresetFilter();
                mMPresetFilter2.mFilterId = cameraFilter.f39218id;
                mMPresetFilter2.mFilterIcon = cameraFilter.icon;
                mMPresetFilter2.mFilterName = cameraFilter.name;
                arrayList.add(mMPresetFilter2);
            }
        }
        hli.m131661j().m131675t(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    public static String m168164k0(String str) {
        File file = new File(f148055o + File.separator + str);
        File file2 = new File(file, file.getName());
        if (file2.exists() && file2.isFile()) {
            rhi.m179369m(file2.getAbsolutePath());
        }
        File file3 = new File(file, "__MACOSX");
        if (file3.isDirectory()) {
            rhi.m179367k(file3);
        }
        File[] fileArrListFiles = file.listFiles();
        return (fileArrListFiles == null || fileArrListFiles.length <= 0) ? "" : fileArrListFiles[0].getAbsolutePath();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m168165l(z3g0 z3g0Var, File file) {
        z3g0Var.onNext(Boolean.valueOf(file != null));
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m168166m(z3g0 z3g0Var, File file) {
        z3g0Var.onNext(Boolean.TRUE);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: m0 */
    public static CameraFilter m168167m0(Pair<CameraFilter, File> pair) {
        File file = (File) pair.second;
        if (NullChecker.m81303a(file)) {
            String absolutePath = file.getParentFile().getAbsolutePath();
            String str = f148047g;
            if (TextUtils.equals(absolutePath, str)) {
                m168134C(str, f148051k, file.getName());
            }
        }
        if (file != null) {
            return (CameraFilter) pair.first;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m168169o(MusicContent musicContent) {
        if (musicContent == null) {
            lsi0.m151578h(R$string.f39131q1);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m168171q(z3g0 z3g0Var, File file) {
        z3g0Var.onNext(file);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m168174t(String str, final CameraFilter cameraFilter, final z3g0 z3g0Var) {
        if (m168148U(10, str, new e30() { // from class: l.ua4
            @Override // p149l.e30
            public final void call(Object obj) {
                pb4.m168156f(z3g0Var, cameraFilter, (File) obj);
            }
        })) {
            return;
        }
        C13111a.m79654u().m79665o(m168137F(cameraFilter.resource, f148047g + File.separator + str, new e30() { // from class: l.va4
            @Override // p149l.e30
            public final void call(Object obj) {
                pb4.m168154e(z3g0Var, cameraFilter, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m168177w(z3g0 z3g0Var, File file) {
        z3g0Var.onNext(file);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m168179y(z3g0 z3g0Var, File file) {
        z3g0Var.onNext(file);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: A */
    public void m168180A(List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            StringBuilder sb = new StringBuilder();
            String str = f148052l;
            sb.append(str);
            String str2 = File.separator;
            sb.append(str2);
            sb.append(m168147T(cameraSticker));
            File file = new File(sb.toString());
            File file2 = new File(str + str2 + m168146S(cameraSticker));
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
    public C22306c<File> m168181I(final CameraSticker cameraSticker) {
        if (NullChecker.m81303a(this.f148061e.get(cameraSticker.resource))) {
            return this.f148061e.get(cameraSticker.resource);
        }
        C22306c<File> map = C22306c.create(new C22306c.a() { // from class: l.eb4
            @Override // p149l.e30
            public final void call(Object obj) {
                pb4.m168157f0(cameraSticker, (z3g0) obj);
            }
        }).map(new w9j() { // from class: l.fb4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f96692a.m168186W(cameraSticker, (File) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.gb4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f101804a.m168187X(cameraSticker, (File) obj);
            }
        });
        this.f148061e.put(cameraSticker.resource, map);
        return map;
    }

    /* JADX INFO: renamed from: J */
    public C22306c<MusicContent> m168182J(final Music music) {
        if (this.f148059c.indexOf(music.audio.url) != -1) {
            return C22306c.just(null);
        }
        this.f148059c.add(music.audio.url);
        return C22306c.create(new C22306c.a() { // from class: l.mb4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132988a.m168189Z(music, (z3g0) obj);
            }
        }).map(new w9j() { // from class: l.nb4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f138001a.m168188Y(music, (Boolean) obj);
            }
        }).compose(mkd0.m154951C()).doOnNext(new e30() { // from class: l.ob4
            @Override // p149l.e30
            public final void call(Object obj) {
                pb4.m168169o((MusicContent) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public C22306c<File> m168183K(final CameraSticker cameraSticker) {
        if (NullChecker.m81303a(this.f148060d.get(cameraSticker.resource))) {
            return this.f148060d.get(cameraSticker.resource);
        }
        C22306c<File> map = C22306c.create(new C22306c.a() { // from class: l.ra4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158472a.m168190a0(cameraSticker, (z3g0) obj);
            }
        }).map(new w9j() { // from class: l.sa4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f163258a.m168191b0(cameraSticker, (File) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.ta4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f169092a.m168192c0(cameraSticker, (File) obj);
            }
        });
        this.f148060d.put(cameraSticker.resource, map);
        return map;
    }

    /* JADX INFO: renamed from: M */
    public List<CameraCategory> m168184M() {
        return this.f148057a;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m168185V(File file, String str) {
        return TextUtils.equals(file.getParentFile().getAbsolutePath(), str);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ File m168186W(CameraSticker cameraSticker, File file) {
        boolean z = file != null && file.exists() && m168197n0(file);
        File file2 = new File(f148055o + File.separator + m168143P(cameraSticker));
        if (z && file2.exists()) {
            return new File(m168164k0(m168143P(cameraSticker)));
        }
        return null;
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ File m168187X(CameraSticker cameraSticker, File file) {
        this.f148061e.remove(cameraSticker.resource);
        return file;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ MusicContent m168188Y(Music music, Boolean bool) {
        this.f148059c.remove(music.audio.url);
        if (!bool.booleanValue()) {
            return null;
        }
        File file = new File(f148053m + File.separator + m168144Q(music));
        if (file.exists()) {
            return up10.m194583a(file.getAbsolutePath(), music);
        }
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ File m168191b0(CameraSticker cameraSticker, File file) {
        boolean z = file != null && file.exists() && m168198o0(file);
        File file2 = new File(f148052l + File.separator + m168146S(cameraSticker));
        if (!z || !file2.exists()) {
            return null;
        }
        if (cameraSticker.isBeautySticker()) {
            m168196l0(file2);
        }
        return file2;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ File m168192c0(CameraSticker cameraSticker, File file) {
        this.f148060d.remove(cameraSticker.resource);
        return file;
    }

    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void m168189Z(Music music, final z3g0<? super Boolean> z3g0Var) {
        String strM168144Q = m168144Q(music);
        if (m168148U(12, strM168144Q, new e30() { // from class: l.wa4
            @Override // p149l.e30
            public final void call(Object obj) {
                pb4.m168166m(z3g0Var, (File) obj);
            }
        })) {
            return;
        }
        C13111a.m79654u().m79665o(m168137F(music.audio.url, f148053m + File.separator + strM168144Q, new e30() { // from class: l.xa4
            @Override // p149l.e30
            public final void call(Object obj) {
                pb4.m168165l(z3g0Var, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final void m168190a0(CameraSticker cameraSticker, final z3g0<? super File> z3g0Var) {
        String strM168146S = m168146S(cameraSticker);
        if (m168148U(11, strM168146S, new e30() { // from class: l.ya4
            @Override // p149l.e30
            public final void call(Object obj) {
                pb4.m168159h(z3g0Var, (File) obj);
            }
        })) {
            return;
        }
        C13111a.m79654u().m79665o(m168137F(cameraSticker.resource, f148048h + File.separator + strM168146S, new e30() { // from class: l.za4
            @Override // p149l.e30
            public final void call(Object obj) {
                pb4.m168171q(z3g0Var, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public void m168195j0(List<CameraCategory> list) {
        this.f148057a = list;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m168196l0(File file) {
        File file2 = new File(file, file.getName());
        if (file2.exists()) {
            rhi.m179369m(file2.getAbsolutePath());
        }
        File file3 = new File(file, "__MACOSX");
        if (file3.isDirectory()) {
            rhi.m179367k(file3);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m168197n0(File file) {
        String str = f148055o;
        return m168185V(file, str) || m168134C(f148049i, str, file.getName());
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m168198o0(File file) {
        String str = f148052l;
        return m168185V(file, str) || m168134C(f148048h, str, file.getName());
    }

    /* JADX INFO: renamed from: z */
    public void m168199z(List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            if (new File(f148055o + File.separator + m168143P(cameraSticker)).exists()) {
                cameraSticker.hasModelFile = true;
                cameraSticker.modelFilePath = m168164k0(m168143P(cameraSticker));
                cameraSticker.state = 3;
            }
        }
    }
}
