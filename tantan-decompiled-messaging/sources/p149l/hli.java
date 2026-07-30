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

/* JADX INFO: loaded from: classes12.dex */
public class hli {

    /* JADX INFO: renamed from: e */
    public static hli f108346e;

    /* JADX INFO: renamed from: f */
    public static int f108347f;

    /* JADX INFO: renamed from: g */
    public static List<MMPresetFilter> f108348g = new ArrayList();

    /* JADX INFO: renamed from: a */
    public List<MMPresetFilter> f108349a;

    /* JADX INFO: renamed from: c */
    public boolean f108351c;

    /* JADX INFO: renamed from: b */
    public List<MMPresetFilter> f108350b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public AtomicBoolean f108352d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m131658d(MMPresetFilter mMPresetFilter, MMPresetFilter mMPresetFilter2) {
        return Integer.valueOf(mMPresetFilter.postionInList).intValue() - Integer.valueOf(mMPresetFilter2.postionInList).intValue();
    }

    /* JADX INFO: renamed from: f */
    public static void m131660f() {
        f108347f++;
    }

    /* JADX INFO: renamed from: j */
    public static hli m131661j() {
        if (f108346e == null) {
            f108346e = new hli();
        }
        return f108346e;
    }

    /* JADX INFO: renamed from: u */
    public static void m131662u() {
        int i = f108347f;
        if (i > 0) {
            f108347f = i - 1;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m131663g(List<MMPresetFilter> list, MMPresetFilter mMPresetFilter) {
        Iterator<MMPresetFilter> it = list.iterator();
        while (it.hasNext()) {
            if (mMPresetFilter.lookupUrl.equals(it.next().lookupUrl)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void m131664h() {
        if (NullChecker.m81303a(this.f108349a)) {
            this.f108349a.clear();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m131665i(final Context context, final e30<List<MMPresetFilter>> e30Var) {
        if (this.f108352d.compareAndSet(false, true)) {
            e51.m114774y(new Runnable() { // from class: l.vki
                @Override // java.lang.Runnable
                public final void run() {
                    this.f181805a.m131671p(context, e30Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public final List<MMPresetFilter> m131666k(Context context) {
        int iIndexOf;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        File[] fileArrListFiles = xii.m209652e().listFiles();
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
                        if (m131669n(mMPresetFilter) >= 0 && !m131663g(copyOnWriteArrayList, mMPresetFilter)) {
                            copyOnWriteArrayList.add(mMPresetFilter);
                        }
                    }
                }
            }
        }
        return copyOnWriteArrayList;
    }

    /* JADX INFO: renamed from: l */
    public final List<MMPresetFilter> m131667l(Context context, File[] fileArr) {
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
                    if (NullChecker.m81304b(f108348g) && f108348g.size() > 0) {
                        int size = f108348g.size();
                        for (int i = 0; i < size; i++) {
                            MMPresetFilter mMPresetFilter2 = f108348g.get(i);
                            if (mMPresetFilter2.mFilterId.equals(str)) {
                                mMPresetFilter.isIconLocal = false;
                                mMPresetFilter.mFilterIcon = mMPresetFilter2.getIconUrl();
                                mMPresetFilter.setTag(mMPresetFilter2.getTag());
                                mMPresetFilter2.isFilterFileExist = mMPresetFilter.isFilterFileExist;
                                break;
                            }
                        }
                    }
                    if (m131669n(mMPresetFilter) >= 0) {
                        arrayList.add(mMPresetFilter);
                    }
                }
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: l.bli
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return hli.m131658d((MMPresetFilter) obj, (MMPresetFilter) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public void m131668m(Context context, final e30<List<MMPresetFilter>> e30Var) {
        List<MMPresetFilter> list = this.f108349a;
        if (list == null || list.size() == 0) {
            m131665i(context, e30Var);
        } else if (NullChecker.m81303a(e30Var)) {
            e51.m114748M(new Runnable() { // from class: l.tki
                @Override // java.lang.Runnable
                public final void run() {
                    this.f170871a.m131672q(e30Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m131669n(MMPresetFilter mMPresetFilter) {
        for (int i = 0; i < this.f108350b.size(); i++) {
            MMPresetFilter mMPresetFilter2 = this.f108350b.get(i);
            if (TextUtils.equals(mMPresetFilter2.mFilterId, mMPresetFilter.mFilterId)) {
                if (!TextUtils.isEmpty(mMPresetFilter2.mFilterIcon)) {
                    mMPresetFilter.mFilterIcon = mMPresetFilter2.mFilterIcon;
                }
                if (!TextUtils.isEmpty(mMPresetFilter2.mFilterName)) {
                    mMPresetFilter.mFilterName = this.f108350b.get(i).mFilterName;
                }
                mMPresetFilter.postionInList = String.valueOf(i);
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public boolean m131670o() {
        return this.f108351c;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m131671p(Context context, final e30 e30Var) {
        final List<MMPresetFilter> listM131666k = m131666k(context);
        File[] fileArrListFiles = xii.m209651d().listFiles();
        if (fileArrListFiles == null) {
            this.f108349a = listM131666k;
            if (NullChecker.m81303a(e30Var)) {
                e51.m114742G(new Runnable() { // from class: l.xki
                    @Override // java.lang.Runnable
                    public final void run() {
                        e30Var.call(listM131666k);
                    }
                });
            }
            this.f108352d.set(false);
            return;
        }
        List<MMPresetFilter> listM131667l = m131667l(context, fileArrListFiles);
        if (NullChecker.m81303a(listM131667l) && listM131667l.size() > 0) {
            listM131666k.addAll(listM131666k.size(), listM131667l);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MMPresetFilter mMPresetFilter : listM131666k) {
            linkedHashMap.put(mMPresetFilter.mFilterId, mMPresetFilter);
        }
        final ArrayList arrayList = new ArrayList(linkedHashMap.values());
        this.f108349a = arrayList;
        if (NullChecker.m81303a(e30Var)) {
            e51.m114742G(new Runnable() { // from class: l.zki
                @Override // java.lang.Runnable
                public final void run() {
                    e30Var.call(arrayList);
                }
            });
        }
        this.f108352d.set(false);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m131672q(e30 e30Var) {
        e30Var.call(this.f108349a);
    }

    /* JADX INFO: renamed from: r */
    public void m131673r() {
        if (f108347f == 0 && NullChecker.m81303a(this.f108349a)) {
            this.f108349a.clear();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m131674s(boolean z) {
        this.f108351c = z;
    }

    /* JADX INFO: renamed from: t */
    public void m131675t(List<MMPresetFilter> list) {
        this.f108350b = list;
        this.f108349a = null;
        this.f108351c = true;
    }
}
