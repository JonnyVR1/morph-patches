package p149l;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Pair;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.data.CameraCategory;
import com.p046p1.mobile.putong.account.data.CameraFilter;
import com.p046p1.mobile.putong.account.data.CameraSticker;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: renamed from: l.sj */
/* JADX INFO: loaded from: classes9.dex */
public class C19952sj {

    /* JADX INFO: renamed from: f */
    public static String f164753f;

    /* JADX INFO: renamed from: g */
    public static final String f164754g;

    /* JADX INFO: renamed from: h */
    public static final String f164755h;

    /* JADX INFO: renamed from: i */
    public static final String f164756i;

    /* JADX INFO: renamed from: j */
    public static final String f164757j;

    /* JADX INFO: renamed from: k */
    public static final String f164758k;

    /* JADX INFO: renamed from: l */
    public static final String f164759l;

    /* JADX INFO: renamed from: m */
    public static final String f164760m;

    /* JADX INFO: renamed from: n */
    public static final String f164761n;

    /* JADX INFO: renamed from: o */
    public static final String f164762o;

    /* JADX INFO: renamed from: p */
    public static C19952sj f164763p;

    /* JADX INFO: renamed from: a */
    public List<CameraCategory> f164764a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<CameraCategory> f164765b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ArrayList<String> f164766c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public HashMap<String, C22306c<File>> f164767d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public HashMap<String, C22306c<File>> f164768e = new HashMap<>();

    static {
        if (NullChecker.m81303a(AccountModule.f16035a.getExternalCacheDir())) {
            f164753f = AccountModule.f16035a.getExternalCacheDir().getAbsolutePath();
        } else {
            f164753f = AccountModule.f16035a.getCacheDir().getAbsolutePath();
        }
        f164754g = f164753f + "/zip/filter";
        f164755h = f164753f + "/zip/sticker";
        f164756i = f164753f + "/zip/makeup";
        f164757j = f164753f + "/zip";
        f164758k = f164753f + "/filterData/filterImg";
        f164759l = f164753f + "/moment";
        f164760m = f164753f + "/music";
        f164761n = f164753f + "/musictemp";
        f164762o = f164753f + "/makeup";
        f164763p = null;
    }

    /* JADX INFO: renamed from: A */
    public static long m184356A() {
        try {
            return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes();
        } catch (Exception e) {
            CrashHelper.m81296c(new RuntimeException("getAvailableBytes error.", e));
            return 0L;
        }
    }

    /* JADX INFO: renamed from: B */
    public static String m184357B(CameraFilter cameraFilter) {
        return cameraFilter.f16343id + "_" + ogw.m164284e(cameraFilter.name) + "_" + cameraFilter.minVersion;
    }

    /* JADX INFO: renamed from: C */
    public static C19952sj m184358C() {
        if (f164763p == null) {
            synchronized (C19952sj.class) {
                try {
                    if (f164763p == null) {
                        f164763p = new C19952sj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f164763p;
    }

    /* JADX INFO: renamed from: D */
    public static String m184359D(CameraSticker cameraSticker) {
        return cameraSticker.f16344id + "_" + ogw.m164284e(cameraSticker.name) + "_" + cameraSticker.minVersion;
    }

    /* JADX INFO: renamed from: E */
    public static List<MMPresetFilter> m184360E() {
        ArrayList arrayList = new ArrayList();
        MMPresetFilter mMPresetFilter = new MMPresetFilter();
        mMPresetFilter.mFilterName = "原图";
        mMPresetFilter.mFilterId = "0";
        arrayList.add(mMPresetFilter);
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public static String m184361F(CameraSticker cameraSticker) {
        return ogw.m164284e(m184362G(cameraSticker));
    }

    /* JADX INFO: renamed from: G */
    public static String m184362G(CameraSticker cameraSticker) {
        return cameraSticker.f16344id + "_" + cameraSticker.name + "_" + cameraSticker.minVersion;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m184363H(int i, String str, e30<File> e30Var) {
        String str2;
        switch (i) {
            case 10:
                str2 = f164758k;
                break;
            case 11:
                str2 = f164759l;
                break;
            case 12:
                str2 = f164760m;
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdirs();
                }
                break;
            case 13:
                str2 = f164762o;
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

    /* JADX INFO: renamed from: O */
    public static C22306c<List<MMPresetFilter>> m184364O(List<CameraFilter> list) {
        List<MMPresetFilter> listM184360E = m184360E();
        C15686ap.m98009j().m98023t(listM184360E);
        return list.isEmpty() ? C22306c.just(listM184360E) : C22306c.from(list).flatMap(new w9j() { // from class: l.nj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C19952sj.m184365P((CameraFilter) obj);
            }
        }).map(new w9j() { // from class: l.oj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C19952sj.m184369W((Pair) obj);
            }
        }).toList().map(new w9j() { // from class: l.pj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C19952sj.m184367S((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static C22306c<Pair<CameraFilter, File>> m184365P(final CameraFilter cameraFilter) {
        final String strM184357B = m184357B(cameraFilter);
        return C22306c.create(new C22306c.a() { // from class: l.aj
            @Override // p149l.e30
            public final void call(Object obj) {
                C19952sj.m184383n(strM184357B, cameraFilter, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public static void m184366Q(CameraSticker cameraSticker, final z3g0<? super File> z3g0Var) {
        String strM184359D = m184359D(cameraSticker);
        if (m184363H(13, strM184359D, new e30() { // from class: l.yi
            @Override // p149l.e30
            public final void call(Object obj) {
                C19952sj.m184382m(z3g0Var, (File) obj);
            }
        })) {
            return;
        }
        C13111a.m79654u().m79665o(m184391x(cameraSticker.resource, f164756i + File.separator + strM184359D, new e30() { // from class: l.jj
            @Override // p149l.e30
            public final void call(Object obj) {
                C19952sj.m184379j(z3g0Var, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public static List<MMPresetFilter> m184367S(List<CameraFilter> list) {
        Collections.sort(list, new Comparator() { // from class: l.zi
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C19952sj.m184372c((CameraFilter) obj, (CameraFilter) obj2);
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
                mMPresetFilter2.mFilterId = cameraFilter.f16343id;
                mMPresetFilter2.mFilterIcon = cameraFilter.icon;
                mMPresetFilter2.mFilterName = cameraFilter.name;
                arrayList.add(mMPresetFilter2);
            }
        }
        C15686ap.m98009j().m98023t(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: U */
    public static String m184368U(String str) {
        File file = new File(f164762o + File.separator + str);
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

    /* JADX INFO: renamed from: W */
    public static CameraFilter m184369W(Pair<CameraFilter, File> pair) {
        File file = (File) pair.second;
        if (NullChecker.m81303a(file)) {
            String absolutePath = file.getParentFile().getAbsolutePath();
            String str = f164754g;
            if (TextUtils.equals(absolutePath, str)) {
                m184390w(str, f164758k, file.getName());
            }
        }
        if (file != null) {
            return (CameraFilter) pair.first;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m184371b(z3g0 z3g0Var, CameraFilter cameraFilter, File file) {
        z3g0Var.m132487l(new Pair(cameraFilter, file));
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m184372c(CameraFilter cameraFilter, CameraFilter cameraFilter2) {
        if (cameraFilter == null || cameraFilter2 == null) {
            return 0;
        }
        return cameraFilter.index - cameraFilter2.index;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m184379j(z3g0 z3g0Var, File file) {
        z3g0Var.m132487l(file);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m184380k(z3g0 z3g0Var, File file) {
        z3g0Var.m132487l(file);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m184382m(z3g0 z3g0Var, File file) {
        z3g0Var.m132487l(file);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m184383n(String str, final CameraFilter cameraFilter, final z3g0 z3g0Var) {
        if (m184363H(10, str, new e30() { // from class: l.bj
            @Override // p149l.e30
            public final void call(Object obj) {
                C19952sj.m184384o(z3g0Var, cameraFilter, (File) obj);
            }
        })) {
            return;
        }
        C13111a.m79654u().m79665o(m184391x(cameraFilter.resource, f164754g + File.separator + str, new e30() { // from class: l.cj
            @Override // p149l.e30
            public final void call(Object obj) {
                C19952sj.m184371b(z3g0Var, cameraFilter, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m184384o(z3g0 z3g0Var, CameraFilter cameraFilter, File file) {
        z3g0Var.m132487l(new Pair(cameraFilter, file));
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m184388s(z3g0 z3g0Var, File file) {
        z3g0Var.m132487l(file);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: w */
    public static boolean m184390w(String str, String str2, String str3) {
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
            CrashHelper.m81296c(new Exception(e.getMessage() + ", AvailableBytes: " + m184356A(), e));
            return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public static DownloadTask m184391x(String str, String str2, final e30<File> e30Var) {
        try {
            k9j.m145076H(new File(str2).getParentFile());
            return new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str).m79640o(str2).m79635j(new f30() { // from class: l.dj
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    e30Var.call((File) obj2);
                }
            }).m79631f(new f30() { // from class: l.ej
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    e30Var.call(null);
                }
            }).m79629d(new e30() { // from class: l.fj
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

    /* JADX INFO: renamed from: I */
    public final boolean m184392I(File file, String str) {
        return TextUtils.equals(file.getParentFile().getAbsolutePath(), str);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ File m184393J(CameraSticker cameraSticker, File file) {
        boolean z = file != null && file.exists() && m184401X(file);
        File file2 = new File(f164762o + File.separator + m184359D(cameraSticker));
        if (z && file2.exists()) {
            return new File(m184368U(m184359D(cameraSticker)));
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ File m184394K(CameraSticker cameraSticker, File file) {
        this.f164768e.remove(cameraSticker.resource);
        return file;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ File m184396M(CameraSticker cameraSticker, File file) {
        boolean z = file != null && file.exists() && m184402Y(file);
        File file2 = new File(f164759l + File.separator + m184361F(cameraSticker));
        if (!z || !file2.exists()) {
            return null;
        }
        if (cameraSticker.isBeautySticker()) {
            m184400V(file2);
        }
        return file2;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ File m184397N(CameraSticker cameraSticker, File file) {
        this.f164767d.remove(cameraSticker.resource);
        return file;
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void m184395L(CameraSticker cameraSticker, final z3g0<? super File> z3g0Var) {
        String strM184361F = m184361F(cameraSticker);
        if (m184363H(11, strM184361F, new e30() { // from class: l.qj
            @Override // p149l.e30
            public final void call(Object obj) {
                C19952sj.m184388s(z3g0Var, (File) obj);
            }
        })) {
            return;
        }
        C13111a.m79654u().m79665o(m184391x(cameraSticker.resource, f164755h + File.separator + strM184361F, new e30() { // from class: l.rj
            @Override // p149l.e30
            public final void call(Object obj) {
                C19952sj.m184380k(z3g0Var, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m184399T(List<CameraCategory> list) {
        this.f164764a = list;
    }

    /* JADX INFO: renamed from: V */
    public final void m184400V(File file) {
        File file2 = new File(file, file.getName());
        if (file2.exists()) {
            rhi.m179369m(file2.getAbsolutePath());
        }
        File file3 = new File(file, "__MACOSX");
        if (file3.isDirectory()) {
            rhi.m179367k(file3);
        }
    }

    /* JADX INFO: renamed from: X */
    public final boolean m184401X(File file) {
        String str = f164762o;
        return m184392I(file, str) || m184390w(f164756i, str, file.getName());
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m184402Y(File file) {
        String str = f164759l;
        return m184392I(file, str) || m184390w(f164755h, str, file.getName());
    }

    /* JADX INFO: renamed from: u */
    public void m184403u(List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            if (new File(f164762o + File.separator + m184359D(cameraSticker)).exists()) {
                cameraSticker.hasModelFile = true;
                cameraSticker.modelFilePath = m184368U(m184359D(cameraSticker));
                cameraSticker.state = 3;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m184404v(List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            StringBuilder sb = new StringBuilder();
            String str = f164759l;
            sb.append(str);
            String str2 = File.separator;
            sb.append(str2);
            sb.append(m184362G(cameraSticker));
            File file = new File(sb.toString());
            File file2 = new File(str + str2 + m184361F(cameraSticker));
            if (file.exists()) {
                cameraSticker.hasModelFile = true;
                cameraSticker.modelFilePath = file.renameTo(file2) ? file2.getAbsolutePath() : file.getAbsolutePath();
            } else if (file2.exists()) {
                cameraSticker.hasModelFile = true;
                cameraSticker.modelFilePath = file2.getAbsolutePath();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public C22306c<File> m184405y(final CameraSticker cameraSticker) {
        if (NullChecker.m81303a(this.f164768e.get(cameraSticker.resource))) {
            return this.f164768e.get(cameraSticker.resource);
        }
        C22306c<File> map = C22306c.create(new C22306c.a() { // from class: l.gj
            @Override // p149l.e30
            public final void call(Object obj) {
                C19952sj.m184366Q(cameraSticker, (z3g0) obj);
            }
        }).map(new w9j() { // from class: l.hj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f107990a.m184393J(cameraSticker, (File) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.ij
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f113478a.m184394K(cameraSticker, (File) obj);
            }
        });
        this.f164768e.put(cameraSticker.resource, map);
        return map;
    }

    /* JADX INFO: renamed from: z */
    public C22306c<File> m184406z(final CameraSticker cameraSticker) {
        if (NullChecker.m81303a(this.f164767d.get(cameraSticker.resource))) {
            return this.f164767d.get(cameraSticker.resource);
        }
        C22306c<File> map = C22306c.create(new C22306c.a() { // from class: l.kj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123418a.m184395L(cameraSticker, (z3g0) obj);
            }
        }).map(new w9j() { // from class: l.lj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f128271a.m184396M(cameraSticker, (File) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.mj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f134084a.m184397N(cameraSticker, (File) obj);
            }
        });
        this.f164767d.put(cameraSticker.resource, map);
        return map;
    }
}
