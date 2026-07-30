package p006l;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Pair;
import com.momo.mcamera.filtermanager.MMFilter;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.data.CameraCategory;
import com.p000p1.mobile.putong.account.data.CameraFilter;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.p1.mobile.putong.ui.download.a;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import l.e30;
import l.f30;
import l.k9j;
import l.mkd0;
import l.ogw;
import l.rhi;
import l.w9j;
import l.z3g0;
import rx.c;

/* JADX INFO: renamed from: l.sj */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1262sj {

    /* JADX INFO: renamed from: f */
    public static String f21333f;

    /* JADX INFO: renamed from: g */
    public static final String f21334g;

    /* JADX INFO: renamed from: h */
    public static final String f21335h;

    /* JADX INFO: renamed from: i */
    public static final String f21336i;

    /* JADX INFO: renamed from: j */
    public static final String f21337j;

    /* JADX INFO: renamed from: k */
    public static final String f21338k;

    /* JADX INFO: renamed from: l */
    public static final String f21339l;

    /* JADX INFO: renamed from: m */
    public static final String f21340m;

    /* JADX INFO: renamed from: n */
    public static final String f21341n;

    /* JADX INFO: renamed from: o */
    public static final String f21342o;

    /* JADX INFO: renamed from: p */
    public static C1262sj f21343p;

    /* JADX INFO: renamed from: a */
    public List<CameraCategory> f21344a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<CameraCategory> f21345b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ArrayList<String> f21346c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public HashMap<String, c<File>> f21347d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public HashMap<String, c<File>> f21348e = new HashMap<>();

    static {
        if (NullChecker.a(AccountModule.f24a.getExternalCacheDir())) {
            f21333f = AccountModule.f24a.getExternalCacheDir().getAbsolutePath();
        } else {
            f21333f = AccountModule.f24a.getCacheDir().getAbsolutePath();
        }
        f21334g = f21333f + "/zip/filter";
        f21335h = f21333f + "/zip/sticker";
        f21336i = f21333f + "/zip/makeup";
        f21337j = f21333f + "/zip";
        f21338k = f21333f + "/filterData/filterImg";
        f21339l = f21333f + "/moment";
        f21340m = f21333f + "/music";
        f21341n = f21333f + "/musictemp";
        f21342o = f21333f + "/makeup";
        f21343p = null;
    }

    /* JADX INFO: renamed from: A */
    public static long m23763A() {
        try {
            return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes();
        } catch (Exception e) {
            CrashHelper.c(new RuntimeException("getAvailableBytes error.", e));
            return 0L;
        }
    }

    /* JADX INFO: renamed from: B */
    public static String m23764B(CameraFilter cameraFilter) {
        return cameraFilter.f332id + "_" + ogw.e(cameraFilter.name) + "_" + cameraFilter.minVersion;
    }

    /* JADX INFO: renamed from: C */
    public static C1262sj m23765C() {
        if (f21343p == null) {
            synchronized (C1262sj.class) {
                try {
                    if (f21343p == null) {
                        f21343p = new C1262sj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f21343p;
    }

    /* JADX INFO: renamed from: D */
    public static String m23766D(CameraSticker cameraSticker) {
        return cameraSticker.f333id + "_" + ogw.e(cameraSticker.name) + "_" + cameraSticker.minVersion;
    }

    /* JADX INFO: renamed from: E */
    public static List<MMPresetFilter> m23767E() {
        ArrayList arrayList = new ArrayList();
        MMPresetFilter mMPresetFilter = new MMPresetFilter();
        ((MMFilter) mMPresetFilter).mFilterName = "原图";
        mMPresetFilter.mFilterId = "0";
        arrayList.add(mMPresetFilter);
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public static String m23768F(CameraSticker cameraSticker) {
        return ogw.e(m23769G(cameraSticker));
    }

    /* JADX INFO: renamed from: G */
    public static String m23769G(CameraSticker cameraSticker) {
        return cameraSticker.f333id + "_" + cameraSticker.name + "_" + cameraSticker.minVersion;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m23770H(int i, String str, e30<File> e30Var) {
        String str2;
        switch (i) {
            case 10:
                str2 = f21338k;
                break;
            case 11:
                str2 = f21339l;
                break;
            case 12:
                str2 = f21340m;
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdirs();
                }
                break;
            case 13:
                str2 = f21342o;
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
    public static c<List<MMPresetFilter>> m23771O(List<CameraFilter> list) {
        List<MMPresetFilter> listM23767E = m23767E();
        C0526ap.m12159j().m12173t(listM23767E);
        return list.isEmpty() ? c.just(listM23767E) : c.from(list).flatMap(new w9j() { // from class: l.nj
            public final Object call(Object obj) {
                return C1262sj.m23772P((CameraFilter) obj);
            }
        }).map(new w9j() { // from class: l.oj
            public final Object call(Object obj) {
                return C1262sj.m23776W((Pair) obj);
            }
        }).toList().map(new w9j() { // from class: l.pj
            public final Object call(Object obj) {
                return C1262sj.m23774S((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static c<Pair<CameraFilter, File>> m23772P(final CameraFilter cameraFilter) {
        final String strM23764B = m23764B(cameraFilter);
        return c.create(new c.a() { // from class: l.aj
            public final void call(Object obj) {
                C1262sj.m23790n(strM23764B, cameraFilter, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public static void m23773Q(CameraSticker cameraSticker, final z3g0<? super File> z3g0Var) {
        String strM23766D = m23766D(cameraSticker);
        if (m23770H(13, strM23766D, new e30() { // from class: l.yi
            public final void call(Object obj) {
                C1262sj.m23789m(z3g0Var, (File) obj);
            }
        })) {
            return;
        }
        a.u().o(m23798x(cameraSticker.resource, f21336i + File.separator + strM23766D, new e30() { // from class: l.jj
            public final void call(Object obj) {
                C1262sj.m23786j(z3g0Var, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public static List<MMPresetFilter> m23774S(List<CameraFilter> list) {
        Collections.sort(list, new Comparator() { // from class: l.zi
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C1262sj.m23779c((CameraFilter) obj, (CameraFilter) obj2);
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
                mMPresetFilter2.mFilterId = cameraFilter.f332id;
                mMPresetFilter2.mFilterIcon = cameraFilter.icon;
                ((MMFilter) mMPresetFilter2).mFilterName = cameraFilter.name;
                arrayList.add(mMPresetFilter2);
            }
        }
        C0526ap.m12159j().m12173t(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: U */
    public static String m23775U(String str) {
        File file = new File(f21342o + File.separator + str);
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

    /* JADX INFO: renamed from: W */
    public static CameraFilter m23776W(Pair<CameraFilter, File> pair) {
        File file = (File) pair.second;
        if (NullChecker.a(file)) {
            String absolutePath = file.getParentFile().getAbsolutePath();
            String str = f21334g;
            if (TextUtils.equals(absolutePath, str)) {
                m23797w(str, f21338k, file.getName());
            }
        }
        if (file != null) {
            return (CameraFilter) pair.first;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m23778b(z3g0 z3g0Var, CameraFilter cameraFilter, File file) {
        z3g0Var.onNext(new Pair(cameraFilter, file));
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m23779c(CameraFilter cameraFilter, CameraFilter cameraFilter2) {
        if (cameraFilter == null || cameraFilter2 == null) {
            return 0;
        }
        return cameraFilter.index - cameraFilter2.index;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m23786j(z3g0 z3g0Var, File file) {
        z3g0Var.onNext(file);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m23787k(z3g0 z3g0Var, File file) {
        z3g0Var.onNext(file);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m23789m(z3g0 z3g0Var, File file) {
        z3g0Var.onNext(file);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m23790n(String str, final CameraFilter cameraFilter, final z3g0 z3g0Var) {
        if (m23770H(10, str, new e30() { // from class: l.bj
            public final void call(Object obj) {
                C1262sj.m23791o(z3g0Var, cameraFilter, (File) obj);
            }
        })) {
            return;
        }
        a.u().o(m23798x(cameraFilter.resource, f21334g + File.separator + str, new e30() { // from class: l.cj
            public final void call(Object obj) {
                C1262sj.m23778b(z3g0Var, cameraFilter, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m23791o(z3g0 z3g0Var, CameraFilter cameraFilter, File file) {
        z3g0Var.onNext(new Pair(cameraFilter, file));
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m23795s(z3g0 z3g0Var, File file) {
        z3g0Var.onNext(file);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: w */
    public static boolean m23797w(String str, String str2, String str3) {
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
            CrashHelper.c(new Exception(e.getMessage() + ", AvailableBytes: " + m23763A(), e));
            return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public static DownloadTask m23798x(String str, String str2, final e30<File> e30Var) {
        try {
            k9j.H(new File(str2).getParentFile());
            return new DownloadTask.b(qib0.f19784H.getDownloadHttp()).q(str).o(str2).j(new f30() { // from class: l.dj
                public final void call(Object obj, Object obj2) {
                    e30Var.call((File) obj2);
                }
            }).f(new f30() { // from class: l.ej
                public final void call(Object obj, Object obj2) {
                    e30Var.call((Object) null);
                }
            }).d(new e30() { // from class: l.fj
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

    /* JADX INFO: renamed from: I */
    public final boolean m23799I(File file, String str) {
        return TextUtils.equals(file.getParentFile().getAbsolutePath(), str);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ File m23800J(CameraSticker cameraSticker, File file) {
        boolean z = file != null && file.exists() && m23808X(file);
        File file2 = new File(f21342o + File.separator + m23766D(cameraSticker));
        if (z && file2.exists()) {
            return new File(m23775U(m23766D(cameraSticker)));
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ File m23801K(CameraSticker cameraSticker, File file) {
        this.f21348e.remove(cameraSticker.resource);
        return file;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ File m23803M(CameraSticker cameraSticker, File file) {
        boolean z = file != null && file.exists() && m23809Y(file);
        File file2 = new File(f21339l + File.separator + m23768F(cameraSticker));
        if (!z || !file2.exists()) {
            return null;
        }
        if (cameraSticker.isBeautySticker()) {
            m23807V(file2);
        }
        return file2;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ File m23804N(CameraSticker cameraSticker, File file) {
        this.f21347d.remove(cameraSticker.resource);
        return file;
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void m23802L(CameraSticker cameraSticker, final z3g0<? super File> z3g0Var) {
        String strM23768F = m23768F(cameraSticker);
        if (m23770H(11, strM23768F, new e30() { // from class: l.qj
            public final void call(Object obj) {
                C1262sj.m23795s(z3g0Var, (File) obj);
            }
        })) {
            return;
        }
        a.u().o(m23798x(cameraSticker.resource, f21335h + File.separator + strM23768F, new e30() { // from class: l.rj
            public final void call(Object obj) {
                C1262sj.m23787k(z3g0Var, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m23806T(List<CameraCategory> list) {
        this.f21344a = list;
    }

    /* JADX INFO: renamed from: V */
    public final void m23807V(File file) {
        File file2 = new File(file, file.getName());
        if (file2.exists()) {
            rhi.m(file2.getAbsolutePath());
        }
        File file3 = new File(file, "__MACOSX");
        if (file3.isDirectory()) {
            rhi.k(file3);
        }
    }

    /* JADX INFO: renamed from: X */
    public final boolean m23808X(File file) {
        String str = f21342o;
        return m23799I(file, str) || m23797w(f21336i, str, file.getName());
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m23809Y(File file) {
        String str = f21339l;
        return m23799I(file, str) || m23797w(f21335h, str, file.getName());
    }

    /* JADX INFO: renamed from: u */
    public void m23810u(List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            if (new File(f21342o + File.separator + m23766D(cameraSticker)).exists()) {
                cameraSticker.hasModelFile = true;
                cameraSticker.modelFilePath = m23775U(m23766D(cameraSticker));
                cameraSticker.state = 3;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m23811v(List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            StringBuilder sb = new StringBuilder();
            String str = f21339l;
            sb.append(str);
            String str2 = File.separator;
            sb.append(str2);
            sb.append(m23769G(cameraSticker));
            File file = new File(sb.toString());
            File file2 = new File(str + str2 + m23768F(cameraSticker));
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
    public c<File> m23812y(final CameraSticker cameraSticker) {
        if (NullChecker.a(this.f21348e.get(cameraSticker.resource))) {
            return this.f21348e.get(cameraSticker.resource);
        }
        c<File> map = c.create(new c.a() { // from class: l.gj
            public final void call(Object obj) {
                C1262sj.m23773Q(cameraSticker, (z3g0) obj);
            }
        }).map(new w9j() { // from class: l.hj
            public final Object call(Object obj) {
                return this.f13903a.m23800J(cameraSticker, (File) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.ij
            public final Object call(Object obj) {
                return this.f14497a.m23801K(cameraSticker, (File) obj);
            }
        });
        this.f21348e.put(cameraSticker.resource, map);
        return map;
    }

    /* JADX INFO: renamed from: z */
    public c<File> m23813z(final CameraSticker cameraSticker) {
        if (NullChecker.a(this.f21347d.get(cameraSticker.resource))) {
            return this.f21347d.get(cameraSticker.resource);
        }
        c<File> map = c.create(new c.a() { // from class: l.kj
            public final void call(Object obj) {
                this.f15850a.m23802L(cameraSticker, (z3g0) obj);
            }
        }).map(new w9j() { // from class: l.lj
            public final Object call(Object obj) {
                return this.f16438a.m23803M(cameraSticker, (File) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.mj
            public final Object call(Object obj) {
                return this.f16992a.m23804N(cameraSticker, (File) obj);
            }
        });
        this.f21347d.put(cameraSticker.resource, map);
        return map;
    }
}
