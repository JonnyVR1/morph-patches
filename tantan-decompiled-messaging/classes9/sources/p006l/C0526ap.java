package p006l;

import android.content.Context;
import android.text.TextUtils;
import com.momo.mcamera.filtermanager.MMFilter;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.momo.mcamera.filtermanager.MMPresetFilterStore;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import l.e30;
import l.e51;

/* JADX INFO: renamed from: l.ap */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0526ap {

    /* JADX INFO: renamed from: e */
    public static C0526ap f8425e;

    /* JADX INFO: renamed from: f */
    public static int f8426f;

    /* JADX INFO: renamed from: g */
    public static List<MMPresetFilter> f8427g = new ArrayList();

    /* JADX INFO: renamed from: a */
    public List<MMPresetFilter> f8428a;

    /* JADX INFO: renamed from: c */
    public boolean f8430c;

    /* JADX INFO: renamed from: b */
    public List<MMPresetFilter> f8429b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public AtomicBoolean f8431d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m12156d(MMPresetFilter mMPresetFilter, MMPresetFilter mMPresetFilter2) {
        return Integer.valueOf(mMPresetFilter.postionInList).intValue() - Integer.valueOf(mMPresetFilter2.postionInList).intValue();
    }

    /* JADX INFO: renamed from: f */
    public static void m12158f() {
        f8426f++;
    }

    /* JADX INFO: renamed from: j */
    public static C0526ap m12159j() {
        if (f8425e == null) {
            f8425e = new C0526ap();
        }
        return f8425e;
    }

    /* JADX INFO: renamed from: u */
    public static void m12160u() {
        int i = f8426f;
        if (i > 0) {
            f8426f = i - 1;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m12161g(List<MMPresetFilter> list, MMPresetFilter mMPresetFilter) {
        Iterator<MMPresetFilter> it = list.iterator();
        while (it.hasNext()) {
            if (mMPresetFilter.lookupUrl.equals(it.next().lookupUrl)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void m12162h() {
        if (NullChecker.a(this.f8428a)) {
            this.f8428a.clear();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m12163i(final Context context, final e30<List<MMPresetFilter>> e30Var) {
        if (this.f8431d.compareAndSet(false, true)) {
            e51.y(new Runnable() { // from class: l.wo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25260a.m12169p(context, e30Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public final List<MMPresetFilter> m12164k(Context context) {
        int iIndexOf;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        File[] fileArrListFiles = C0983lo.m18897e().listFiles();
        if (fileArrListFiles != null) {
            Arrays.sort(fileArrListFiles);
            for (File file : fileArrListFiles) {
                MMPresetFilter mMPresetFilter = new MMPresetFilter(context);
                if (!TextUtils.isEmpty(file.getName()) && (iIndexOf = file.getName().indexOf("_") + 1) > 0 && iIndexOf < file.getName().length()) {
                    String strSubstring = file.getName().substring(iIndexOf);
                    ((MMFilter) mMPresetFilter).mFilterName = strSubstring;
                    mMPresetFilter.mFilterId = strSubstring;
                }
                if (file.list() != null) {
                    MMPresetFilterStore.generateFilter(context, file, mMPresetFilter);
                    File file2 = new File(file.getPath() + "/icon.jpg");
                    if (file2.exists() && file2.length() > 0) {
                        mMPresetFilter.isIconLocal = true;
                        mMPresetFilter.mFilterIcon = file.getPath() + "/icon.jpg";
                        mMPresetFilter.lookupUrl = file.getPath() + "/Lookup.png";
                        if (m12167n(mMPresetFilter) >= 0 && !m12161g(copyOnWriteArrayList, mMPresetFilter)) {
                            copyOnWriteArrayList.add(mMPresetFilter);
                        }
                    }
                }
            }
        }
        return copyOnWriteArrayList;
    }

    /* JADX INFO: renamed from: l */
    public final List<MMPresetFilter> m12165l(Context context, File[] fileArr) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        Arrays.sort(fileArr);
        for (File file : fileArr) {
            MMPresetFilter mMPresetFilter = new MMPresetFilter(context);
            String[] strArrSplit = file.getName().split("_");
            if (strArrSplit.length > 1) {
                str = strArrSplit[0];
                str2 = strArrSplit[1];
            } else {
                str = "";
                str2 = "";
            }
            if (!file.getPath().toLowerCase().endsWith("__macosx")) {
                ((MMFilter) mMPresetFilter).mFilterName = str2;
                mMPresetFilter.mFilterId = str;
                mMPresetFilter.lookupUrl = file.getPath() + "/lookup.png";
                mMPresetFilter.manifestUrl = file.getPath() + "/manifest.json";
                File file2 = new File(mMPresetFilter.lookupUrl);
                File file3 = new File(mMPresetFilter.manifestUrl);
                if ((!file2.exists() || file2.length() <= 0) && (!file3.exists() || file3.length() <= 0)) {
                    mMPresetFilter.isFilterFileExist = false;
                } else {
                    mMPresetFilter.isFilterFileExist = true;
                    MMPresetFilterStore.generateFilter(context, file, mMPresetFilter);
                    if (NullChecker.b(f8427g) && f8427g.size() > 0) {
                        int size = f8427g.size();
                        for (int i = 0; i < size; i++) {
                            MMPresetFilter mMPresetFilter2 = f8427g.get(i);
                            if (mMPresetFilter2.mFilterId.equals(str)) {
                                mMPresetFilter.isIconLocal = false;
                                mMPresetFilter.mFilterIcon = mMPresetFilter2.getIconUrl();
                                mMPresetFilter.setTag(mMPresetFilter2.getTag());
                                mMPresetFilter2.isFilterFileExist = mMPresetFilter.isFilterFileExist;
                                break;
                            }
                        }
                    }
                    if (m12167n(mMPresetFilter) >= 0) {
                        arrayList.add(mMPresetFilter);
                    }
                }
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: l.zo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C0526ap.m12156d((MMPresetFilter) obj, (MMPresetFilter) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public void m12166m(Context context, final e30<List<MMPresetFilter>> e30Var) {
        List<MMPresetFilter> list = this.f8428a;
        if (list == null || list.size() == 0) {
            m12163i(context, e30Var);
        } else if (NullChecker.a(e30Var)) {
            e51.M(new Runnable() { // from class: l.vo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24395a.m12170q(e30Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m12167n(MMPresetFilter mMPresetFilter) {
        for (int i = 0; i < this.f8429b.size(); i++) {
            MMPresetFilter mMPresetFilter2 = this.f8429b.get(i);
            if (TextUtils.equals(mMPresetFilter2.mFilterId, mMPresetFilter.mFilterId)) {
                if (!TextUtils.isEmpty(mMPresetFilter2.mFilterIcon)) {
                    mMPresetFilter.mFilterIcon = mMPresetFilter2.mFilterIcon;
                }
                if (!TextUtils.isEmpty(((MMFilter) mMPresetFilter2).mFilterName)) {
                    ((MMFilter) mMPresetFilter).mFilterName = ((MMFilter) this.f8429b.get(i)).mFilterName;
                }
                mMPresetFilter.postionInList = String.valueOf(i);
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public boolean m12168o() {
        return this.f8430c;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m12169p(Context context, final e30 e30Var) {
        final List<MMPresetFilter> listM12164k = m12164k(context);
        File[] fileArrListFiles = C0983lo.m18896d().listFiles();
        if (fileArrListFiles == null) {
            this.f8428a = listM12164k;
            if (NullChecker.a(e30Var)) {
                e51.G(new Runnable() { // from class: l.xo
                    @Override // java.lang.Runnable
                    public final void run() {
                        e30Var.call(listM12164k);
                    }
                });
            }
            this.f8431d.set(false);
            return;
        }
        List<MMPresetFilter> listM12165l = m12165l(context, fileArrListFiles);
        if (NullChecker.a(listM12165l) && listM12165l.size() > 0) {
            listM12164k.addAll(listM12164k.size(), listM12165l);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MMPresetFilter mMPresetFilter : listM12164k) {
            linkedHashMap.put(mMPresetFilter.mFilterId, mMPresetFilter);
        }
        final ArrayList arrayList = new ArrayList(linkedHashMap.values());
        this.f8428a = arrayList;
        if (NullChecker.a(e30Var)) {
            e51.G(new Runnable() { // from class: l.yo
                @Override // java.lang.Runnable
                public final void run() {
                    e30Var.call(arrayList);
                }
            });
        }
        this.f8431d.set(false);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m12170q(e30 e30Var) {
        e30Var.call(this.f8428a);
    }

    /* JADX INFO: renamed from: r */
    public void m12171r() {
        if (f8426f == 0 && NullChecker.a(this.f8428a)) {
            this.f8428a.clear();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m12172s(boolean z) {
        this.f8430c = z;
    }

    /* JADX INFO: renamed from: t */
    public void m12173t(List<MMPresetFilter> list) {
        this.f8429b = list;
        this.f8428a = null;
        this.f8430c = true;
    }
}
