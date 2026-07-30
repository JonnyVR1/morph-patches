package p153l;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Pair;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.data.CameraCategory;
import com.p051p1.mobile.putong.account.data.CameraFilter;
import com.p051p1.mobile.putong.account.data.CameraSticker;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: renamed from: l.nj */
/* JADX INFO: loaded from: classes9.dex */
public class C18882nj {

    /* JADX INFO: renamed from: f */
    public static String f142236f;

    /* JADX INFO: renamed from: g */
    public static final String f142237g;

    /* JADX INFO: renamed from: h */
    public static final String f142238h;

    /* JADX INFO: renamed from: i */
    public static final String f142239i;

    /* JADX INFO: renamed from: j */
    public static final String f142240j;

    /* JADX INFO: renamed from: k */
    public static final String f142241k;

    /* JADX INFO: renamed from: l */
    public static final String f142242l;

    /* JADX INFO: renamed from: m */
    public static final String f142243m;

    /* JADX INFO: renamed from: n */
    public static final String f142244n;

    /* JADX INFO: renamed from: o */
    public static final String f142245o;

    /* JADX INFO: renamed from: p */
    public static C18882nj f142246p;

    /* JADX INFO: renamed from: a */
    public List<CameraCategory> f142247a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<CameraCategory> f142248b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ArrayList<String> f142249c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public HashMap<String, C22421c<File>> f142250d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public HashMap<String, C22421c<File>> f142251e = new HashMap<>();

    static {
        if (NullChecker.m82486a(AccountModule.f16754a.getExternalCacheDir())) {
            f142236f = AccountModule.f16754a.getExternalCacheDir().getAbsolutePath();
        } else {
            f142236f = AccountModule.f16754a.getCacheDir().getAbsolutePath();
        }
        f142237g = f142236f + "/zip/filter";
        f142238h = f142236f + "/zip/sticker";
        f142239i = f142236f + "/zip/makeup";
        f142240j = f142236f + "/zip";
        f142241k = f142236f + "/filterData/filterImg";
        f142242l = f142236f + "/moment";
        f142243m = f142236f + "/music";
        f142244n = f142236f + "/musictemp";
        f142245o = f142236f + "/makeup";
        f142246p = null;
    }

    /* JADX INFO: renamed from: A */
    public static long m163350A() {
        try {
            return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes();
        } catch (Exception e) {
            CrashHelper.m82479c(new RuntimeException("getAvailableBytes error.", e));
            return 0L;
        }
    }

    /* JADX INFO: renamed from: B */
    public static String m163351B(CameraFilter cameraFilter) {
        return cameraFilter.f17062id + "_" + niw.m163315e(cameraFilter.name) + "_" + cameraFilter.minVersion;
    }

    /* JADX INFO: renamed from: C */
    public static C18882nj m163352C() {
        if (f142246p == null) {
            synchronized (C18882nj.class) {
                try {
                    if (f142246p == null) {
                        f142246p = new C18882nj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f142246p;
    }

    /* JADX INFO: renamed from: D */
    public static String m163353D(CameraSticker cameraSticker) {
        return cameraSticker.f17063id + "_" + niw.m163315e(cameraSticker.name) + "_" + cameraSticker.minVersion;
    }

    /* JADX INFO: renamed from: E */
    public static List<MMPresetFilter> m163354E() {
        ArrayList arrayList = new ArrayList();
        MMPresetFilter mMPresetFilter = new MMPresetFilter();
        mMPresetFilter.mFilterName = "原图";
        mMPresetFilter.mFilterId = "0";
        arrayList.add(mMPresetFilter);
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public static String m163355F(CameraSticker cameraSticker) {
        return niw.m163315e(m163356G(cameraSticker));
    }

    /* JADX INFO: renamed from: G */
    public static String m163356G(CameraSticker cameraSticker) {
        return cameraSticker.f17063id + "_" + cameraSticker.name + "_" + cameraSticker.minVersion;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m163357H(int i, String str, y20<File> y20Var) {
        String str2;
        switch (i) {
            case 10:
                str2 = f142241k;
                break;
            case 11:
                str2 = f142242l;
                break;
            case 12:
                str2 = f142243m;
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdirs();
                }
                break;
            case 13:
                str2 = f142245o;
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

    /* JADX INFO: renamed from: O */
    public static C22421c<List<MMPresetFilter>> m163358O(List<CameraFilter> list) {
        List<MMPresetFilter> listM163354E = m163354E();
        C20870vo.m202031j().m202045t(listM163354E);
        return list.isEmpty() ? C22421c.just(listM163354E) : C22421c.from(list).flatMap(new qcj() { // from class: l.ij
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C18882nj.m163359P((CameraFilter) obj);
            }
        }).map(new qcj() { // from class: l.jj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C18882nj.m163363W((Pair) obj);
            }
        }).toList().map(new qcj() { // from class: l.kj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C18882nj.m163361S((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static C22421c<Pair<CameraFilter, File>> m163359P(final CameraFilter cameraFilter) {
        final String strM163351B = m163351B(cameraFilter);
        return C22421c.create(new C22421c.a() { // from class: l.vi
            @Override // p153l.y20
            public final void call(Object obj) {
                C18882nj.m163377n(strM163351B, cameraFilter, (gcg0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public static void m163360Q(CameraSticker cameraSticker, final gcg0<? super File> gcg0Var) {
        String strM163353D = m163353D(cameraSticker);
        if (m163357H(13, strM163353D, new y20() { // from class: l.ti
            @Override // p153l.y20
            public final void call(Object obj) {
                C18882nj.m163376m(gcg0Var, (File) obj);
            }
        })) {
            return;
        }
        C13274a.m80837u().m80848o(m163385x(cameraSticker.resource, f142239i + File.separator + strM163353D, new y20() { // from class: l.ej
            @Override // p153l.y20
            public final void call(Object obj) {
                C18882nj.m163373j(gcg0Var, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public static List<MMPresetFilter> m163361S(List<CameraFilter> list) {
        Collections.sort(list, new Comparator() { // from class: l.ui
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C18882nj.m163366c((CameraFilter) obj, (CameraFilter) obj2);
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
                mMPresetFilter2.mFilterId = cameraFilter.f17062id;
                mMPresetFilter2.mFilterIcon = cameraFilter.icon;
                mMPresetFilter2.mFilterName = cameraFilter.name;
                arrayList.add(mMPresetFilter2);
            }
        }
        C20870vo.m202031j().m202045t(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: U */
    public static String m163362U(String str) {
        File file = new File(f142245o + File.separator + str);
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

    /* JADX INFO: renamed from: W */
    public static CameraFilter m163363W(Pair<CameraFilter, File> pair) {
        File file = (File) pair.second;
        if (NullChecker.m82486a(file)) {
            String absolutePath = file.getParentFile().getAbsolutePath();
            String str = f142237g;
            if (TextUtils.equals(absolutePath, str)) {
                m163384w(str, f142241k, file.getName());
            }
        }
        if (file != null) {
            return (CameraFilter) pair.first;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m163365b(gcg0 gcg0Var, CameraFilter cameraFilter, File file) {
        gcg0Var.m137019l(new Pair(cameraFilter, file));
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m163366c(CameraFilter cameraFilter, CameraFilter cameraFilter2) {
        if (cameraFilter == null || cameraFilter2 == null) {
            return 0;
        }
        return cameraFilter.index - cameraFilter2.index;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m163373j(gcg0 gcg0Var, File file) {
        gcg0Var.m137019l(file);
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m163374k(gcg0 gcg0Var, File file) {
        gcg0Var.m137019l(file);
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m163376m(gcg0 gcg0Var, File file) {
        gcg0Var.m137019l(file);
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m163377n(String str, final CameraFilter cameraFilter, final gcg0 gcg0Var) {
        if (m163357H(10, str, new y20() { // from class: l.wi
            @Override // p153l.y20
            public final void call(Object obj) {
                C18882nj.m163378o(gcg0Var, cameraFilter, (File) obj);
            }
        })) {
            return;
        }
        C13274a.m80837u().m80848o(m163385x(cameraFilter.resource, f142237g + File.separator + str, new y20() { // from class: l.xi
            @Override // p153l.y20
            public final void call(Object obj) {
                C18882nj.m163365b(gcg0Var, cameraFilter, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m163378o(gcg0 gcg0Var, CameraFilter cameraFilter, File file) {
        gcg0Var.m137019l(new Pair(cameraFilter, file));
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m163382s(gcg0 gcg0Var, File file) {
        gcg0Var.m137019l(file);
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: w */
    public static boolean m163384w(String str, String str2, String str3) {
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
            CrashHelper.m82479c(new Exception(e.getMessage() + ", AvailableBytes: " + m163350A(), e));
            return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public static DownloadTask m163385x(String str, String str2, final y20<File> y20Var) {
        try {
            ecj.m120374H(new File(str2).getParentFile());
            return new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str).m80823o(str2).m80818j(new z20() { // from class: l.yi
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    y20Var.call((File) obj2);
                }
            }).m80814f(new z20() { // from class: l.zi
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    y20Var.call(null);
                }
            }).m80812d(new y20() { // from class: l.aj
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

    /* JADX INFO: renamed from: I */
    public final boolean m163386I(File file, String str) {
        return TextUtils.equals(file.getParentFile().getAbsolutePath(), str);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ File m163387J(CameraSticker cameraSticker, File file) {
        boolean z = file != null && file.exists() && m163395X(file);
        File file2 = new File(f142245o + File.separator + m163353D(cameraSticker));
        if (z && file2.exists()) {
            return new File(m163362U(m163353D(cameraSticker)));
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ File m163388K(CameraSticker cameraSticker, File file) {
        this.f142251e.remove(cameraSticker.resource);
        return file;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ File m163390M(CameraSticker cameraSticker, File file) {
        boolean z = file != null && file.exists() && m163396Y(file);
        File file2 = new File(f142242l + File.separator + m163355F(cameraSticker));
        if (!z || !file2.exists()) {
            return null;
        }
        if (cameraSticker.isBeautySticker()) {
            m163394V(file2);
        }
        return file2;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ File m163391N(CameraSticker cameraSticker, File file) {
        this.f142250d.remove(cameraSticker.resource);
        return file;
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void m163389L(CameraSticker cameraSticker, final gcg0<? super File> gcg0Var) {
        String strM163355F = m163355F(cameraSticker);
        if (m163357H(11, strM163355F, new y20() { // from class: l.lj
            @Override // p153l.y20
            public final void call(Object obj) {
                C18882nj.m163382s(gcg0Var, (File) obj);
            }
        })) {
            return;
        }
        C13274a.m80837u().m80848o(m163385x(cameraSticker.resource, f142238h + File.separator + strM163355F, new y20() { // from class: l.mj
            @Override // p153l.y20
            public final void call(Object obj) {
                C18882nj.m163374k(gcg0Var, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m163393T(List<CameraCategory> list) {
        this.f142247a = list;
    }

    /* JADX INFO: renamed from: V */
    public final void m163394V(File file) {
        File file2 = new File(file, file.getName());
        if (file2.exists()) {
            oki.m168025m(file2.getAbsolutePath());
        }
        File file3 = new File(file, "__MACOSX");
        if (file3.isDirectory()) {
            oki.m168023k(file3);
        }
    }

    /* JADX INFO: renamed from: X */
    public final boolean m163395X(File file) {
        String str = f142245o;
        return m163386I(file, str) || m163384w(f142239i, str, file.getName());
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m163396Y(File file) {
        String str = f142242l;
        return m163386I(file, str) || m163384w(f142238h, str, file.getName());
    }

    /* JADX INFO: renamed from: u */
    public void m163397u(List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            if (new File(f142245o + File.separator + m163353D(cameraSticker)).exists()) {
                cameraSticker.hasModelFile = true;
                cameraSticker.modelFilePath = m163362U(m163353D(cameraSticker));
                cameraSticker.state = 3;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m163398v(List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            StringBuilder sb = new StringBuilder();
            String str = f142242l;
            sb.append(str);
            String str2 = File.separator;
            sb.append(str2);
            sb.append(m163356G(cameraSticker));
            File file = new File(sb.toString());
            File file2 = new File(str + str2 + m163355F(cameraSticker));
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
    public C22421c<File> m163399y(final CameraSticker cameraSticker) {
        if (NullChecker.m82486a(this.f142251e.get(cameraSticker.resource))) {
            return this.f142251e.get(cameraSticker.resource);
        }
        C22421c<File> map = C22421c.create(new C22421c.a() { // from class: l.bj
            @Override // p153l.y20
            public final void call(Object obj) {
                C18882nj.m163360Q(cameraSticker, (gcg0) obj);
            }
        }).map(new qcj() { // from class: l.cj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f82091a.m163387J(cameraSticker, (File) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.dj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f88767a.m163388K(cameraSticker, (File) obj);
            }
        });
        this.f142251e.put(cameraSticker.resource, map);
        return map;
    }

    /* JADX INFO: renamed from: z */
    public C22421c<File> m163400z(final CameraSticker cameraSticker) {
        if (NullChecker.m82486a(this.f142250d.get(cameraSticker.resource))) {
            return this.f142250d.get(cameraSticker.resource);
        }
        C22421c<File> map = C22421c.create(new C22421c.a() { // from class: l.fj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99282a.m163389L(cameraSticker, (gcg0) obj);
            }
        }).map(new qcj() { // from class: l.gj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f104542a.m163390M(cameraSticker, (File) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.hj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f110105a.m163391N(cameraSticker, (File) obj);
            }
        });
        this.f142250d.put(cameraSticker.resource, map);
        return map;
    }
}
