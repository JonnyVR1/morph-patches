package p149l;

import android.content.Context;
import android.text.TextUtils;
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

/* JADX INFO: renamed from: l.ap */
/* JADX INFO: loaded from: classes9.dex */
public class C15686ap {

    /* JADX INFO: renamed from: e */
    public static C15686ap f70965e;

    /* JADX INFO: renamed from: f */
    public static int f70966f;

    /* JADX INFO: renamed from: g */
    public static List<MMPresetFilter> f70967g = new ArrayList();

    /* JADX INFO: renamed from: a */
    public List<MMPresetFilter> f70968a;

    /* JADX INFO: renamed from: c */
    public boolean f70970c;

    /* JADX INFO: renamed from: b */
    public List<MMPresetFilter> f70969b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public AtomicBoolean f70971d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m98006d(MMPresetFilter mMPresetFilter, MMPresetFilter mMPresetFilter2) {
        return Integer.valueOf(mMPresetFilter.postionInList).intValue() - Integer.valueOf(mMPresetFilter2.postionInList).intValue();
    }

    /* JADX INFO: renamed from: f */
    public static void m98008f() {
        f70966f++;
    }

    /* JADX INFO: renamed from: j */
    public static C15686ap m98009j() {
        if (f70965e == null) {
            f70965e = new C15686ap();
        }
        return f70965e;
    }

    /* JADX INFO: renamed from: u */
    public static void m98010u() {
        int i = f70966f;
        if (i > 0) {
            f70966f = i - 1;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m98011g(List<MMPresetFilter> list, MMPresetFilter mMPresetFilter) {
        Iterator<MMPresetFilter> it = list.iterator();
        while (it.hasNext()) {
            if (mMPresetFilter.lookupUrl.equals(it.next().lookupUrl)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void m98012h() {
        if (NullChecker.m81303a(this.f70968a)) {
            this.f70968a.clear();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m98013i(final Context context, final e30<List<MMPresetFilter>> e30Var) {
        if (this.f70971d.compareAndSet(false, true)) {
            e51.m114774y(new Runnable() { // from class: l.wo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f187367a.m98019p(context, e30Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public final List<MMPresetFilter> m98014k(Context context) {
        int iIndexOf;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        File[] fileArrListFiles = C18268lo.m150755e().listFiles();
        if (fileArrListFiles != null) {
            Arrays.sort(fileArrListFiles);
            for (File file : fileArrListFiles) {
                MMPresetFilter mMPresetFilter = new MMPresetFilter(context);
                if (!TextUtils.isEmpty(file.getName()) && (iIndexOf = file.getName().indexOf("_") + 1) > 0 && iIndexOf < file.getName().length()) {
                    String strSubstring = file.getName().substring(iIndexOf);
                    mMPresetFilter.mFilterName = strSubstring;
                    mMPresetFilter.mFilterId = strSubstring;
                }
                if (file.list() != null) {
                    MMPresetFilterStore.generateFilter(context, file, mMPresetFilter);
                    File file2 = new File(file.getPath() + "/icon.jpg");
                    if (file2.exists() && file2.length() > 0) {
                        mMPresetFilter.isIconLocal = true;
                        mMPresetFilter.mFilterIcon = file.getPath() + "/icon.jpg";
                        mMPresetFilter.lookupUrl = file.getPath() + "/Lookup.png";
                        if (m98017n(mMPresetFilter) >= 0 && !m98011g(copyOnWriteArrayList, mMPresetFilter)) {
                            copyOnWriteArrayList.add(mMPresetFilter);
                        }
                    }
                }
            }
        }
        return copyOnWriteArrayList;
    }

    /* JADX INFO: renamed from: l */
    public final List<MMPresetFilter> m98015l(Context context, File[] fileArr) {
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
                mMPresetFilter.mFilterName = str2;
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
                    if (NullChecker.m81304b(f70967g) && f70967g.size() > 0) {
                        int size = f70967g.size();
                        for (int i = 0; i < size; i++) {
                            MMPresetFilter mMPresetFilter2 = f70967g.get(i);
                            if (mMPresetFilter2.mFilterId.equals(str)) {
                                mMPresetFilter.isIconLocal = false;
                                mMPresetFilter.mFilterIcon = mMPresetFilter2.getIconUrl();
                                mMPresetFilter.setTag(mMPresetFilter2.getTag());
                                mMPresetFilter2.isFilterFileExist = mMPresetFilter.isFilterFileExist;
                                break;
                            }
                        }
                    }
                    if (m98017n(mMPresetFilter) >= 0) {
                        arrayList.add(mMPresetFilter);
                    }
                }
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: l.zo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C15686ap.m98006d((MMPresetFilter) obj, (MMPresetFilter) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public void m98016m(Context context, final e30<List<MMPresetFilter>> e30Var) {
        List<MMPresetFilter> list = this.f70968a;
        if (list == null || list.size() == 0) {
            m98013i(context, e30Var);
        } else if (NullChecker.m81303a(e30Var)) {
            e51.m114748M(new Runnable() { // from class: l.vo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f182323a.m98020q(e30Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m98017n(MMPresetFilter mMPresetFilter) {
        for (int i = 0; i < this.f70969b.size(); i++) {
            MMPresetFilter mMPresetFilter2 = this.f70969b.get(i);
            if (TextUtils.equals(mMPresetFilter2.mFilterId, mMPresetFilter.mFilterId)) {
                if (!TextUtils.isEmpty(mMPresetFilter2.mFilterIcon)) {
                    mMPresetFilter.mFilterIcon = mMPresetFilter2.mFilterIcon;
                }
                if (!TextUtils.isEmpty(mMPresetFilter2.mFilterName)) {
                    mMPresetFilter.mFilterName = this.f70969b.get(i).mFilterName;
                }
                mMPresetFilter.postionInList = String.valueOf(i);
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public boolean m98018o() {
        return this.f70970c;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m98019p(Context context, final e30 e30Var) {
        final List<MMPresetFilter> listM98014k = m98014k(context);
        File[] fileArrListFiles = C18268lo.m150754d().listFiles();
        if (fileArrListFiles == null) {
            this.f70968a = listM98014k;
            if (NullChecker.m81303a(e30Var)) {
                e51.m114742G(new Runnable() { // from class: l.xo
                    @Override // java.lang.Runnable
                    public final void run() {
                        e30Var.call(listM98014k);
                    }
                });
            }
            this.f70971d.set(false);
            return;
        }
        List<MMPresetFilter> listM98015l = m98015l(context, fileArrListFiles);
        if (NullChecker.m81303a(listM98015l) && listM98015l.size() > 0) {
            listM98014k.addAll(listM98014k.size(), listM98015l);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MMPresetFilter mMPresetFilter : listM98014k) {
            linkedHashMap.put(mMPresetFilter.mFilterId, mMPresetFilter);
        }
        final ArrayList arrayList = new ArrayList(linkedHashMap.values());
        this.f70968a = arrayList;
        if (NullChecker.m81303a(e30Var)) {
            e51.m114742G(new Runnable() { // from class: l.yo
                @Override // java.lang.Runnable
                public final void run() {
                    e30Var.call(arrayList);
                }
            });
        }
        this.f70971d.set(false);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m98020q(e30 e30Var) {
        e30Var.call(this.f70968a);
    }

    /* JADX INFO: renamed from: r */
    public void m98021r() {
        if (f70966f == 0 && NullChecker.m81303a(this.f70968a)) {
            this.f70968a.clear();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m98022s(boolean z) {
        this.f70970c = z;
    }

    /* JADX INFO: renamed from: t */
    public void m98023t(List<MMPresetFilter> list) {
        this.f70969b = list;
        this.f70968a = null;
        this.f70970c = true;
    }
}
