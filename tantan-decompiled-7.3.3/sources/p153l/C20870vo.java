package p153l;

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

/* JADX INFO: renamed from: l.vo */
/* JADX INFO: loaded from: classes9.dex */
public class C20870vo {

    /* JADX INFO: renamed from: e */
    public static C20870vo f184936e;

    /* JADX INFO: renamed from: f */
    public static int f184937f;

    /* JADX INFO: renamed from: g */
    public static List<MMPresetFilter> f184938g = new ArrayList();

    /* JADX INFO: renamed from: a */
    public List<MMPresetFilter> f184939a;

    /* JADX INFO: renamed from: c */
    public boolean f184941c;

    /* JADX INFO: renamed from: b */
    public List<MMPresetFilter> f184940b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public AtomicBoolean f184942d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m202028d(MMPresetFilter mMPresetFilter, MMPresetFilter mMPresetFilter2) {
        return Integer.valueOf(mMPresetFilter.postionInList).intValue() - Integer.valueOf(mMPresetFilter2.postionInList).intValue();
    }

    /* JADX INFO: renamed from: f */
    public static void m202030f() {
        f184937f++;
    }

    /* JADX INFO: renamed from: j */
    public static C20870vo m202031j() {
        if (f184936e == null) {
            f184936e = new C20870vo();
        }
        return f184936e;
    }

    /* JADX INFO: renamed from: u */
    public static void m202032u() {
        int i = f184937f;
        if (i > 0) {
            f184937f = i - 1;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m202033g(List<MMPresetFilter> list, MMPresetFilter mMPresetFilter) {
        Iterator<MMPresetFilter> it = list.iterator();
        while (it.hasNext()) {
            if (mMPresetFilter.lookupUrl.equals(it.next().lookupUrl)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void m202034h() {
        if (NullChecker.m82486a(this.f184939a)) {
            this.f184939a.clear();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m202035i(final Context context, final y20<List<MMPresetFilter>> y20Var) {
        if (this.f184942d.compareAndSet(false, true)) {
            l51.m152919y(new Runnable() { // from class: l.ro
                @Override // java.lang.Runnable
                public final void run() {
                    this.f164138a.m202041p(context, y20Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public final List<MMPresetFilter> m202036k(Context context) {
        int iIndexOf;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        File[] fileArrListFiles = C17263go.m131011e().listFiles();
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
                        if (m202039n(mMPresetFilter) >= 0 && !m202033g(copyOnWriteArrayList, mMPresetFilter)) {
                            copyOnWriteArrayList.add(mMPresetFilter);
                        }
                    }
                }
            }
        }
        return copyOnWriteArrayList;
    }

    /* JADX INFO: renamed from: l */
    public final List<MMPresetFilter> m202037l(Context context, File[] fileArr) {
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
                    if (NullChecker.m82487b(f184938g) && f184938g.size() > 0) {
                        int size = f184938g.size();
                        for (int i = 0; i < size; i++) {
                            MMPresetFilter mMPresetFilter2 = f184938g.get(i);
                            if (mMPresetFilter2.mFilterId.equals(str)) {
                                mMPresetFilter.isIconLocal = false;
                                mMPresetFilter.mFilterIcon = mMPresetFilter2.getIconUrl();
                                mMPresetFilter.setTag(mMPresetFilter2.getTag());
                                mMPresetFilter2.isFilterFileExist = mMPresetFilter.isFilterFileExist;
                                break;
                            }
                        }
                    }
                    if (m202039n(mMPresetFilter) >= 0) {
                        arrayList.add(mMPresetFilter);
                    }
                }
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: l.uo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C20870vo.m202028d((MMPresetFilter) obj, (MMPresetFilter) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public void m202038m(Context context, final y20<List<MMPresetFilter>> y20Var) {
        List<MMPresetFilter> list = this.f184939a;
        if (list == null || list.size() == 0) {
            m202035i(context, y20Var);
        } else if (NullChecker.m82486a(y20Var)) {
            l51.m152893M(new Runnable() { // from class: l.qo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f158675a.m202042q(y20Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m202039n(MMPresetFilter mMPresetFilter) {
        for (int i = 0; i < this.f184940b.size(); i++) {
            MMPresetFilter mMPresetFilter2 = this.f184940b.get(i);
            if (TextUtils.equals(mMPresetFilter2.mFilterId, mMPresetFilter.mFilterId)) {
                if (!TextUtils.isEmpty(mMPresetFilter2.mFilterIcon)) {
                    mMPresetFilter.mFilterIcon = mMPresetFilter2.mFilterIcon;
                }
                if (!TextUtils.isEmpty(mMPresetFilter2.mFilterName)) {
                    mMPresetFilter.mFilterName = this.f184940b.get(i).mFilterName;
                }
                mMPresetFilter.postionInList = String.valueOf(i);
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public boolean m202040o() {
        return this.f184941c;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m202041p(Context context, final y20 y20Var) {
        final List<MMPresetFilter> listM202036k = m202036k(context);
        File[] fileArrListFiles = C17263go.m131010d().listFiles();
        if (fileArrListFiles == null) {
            this.f184939a = listM202036k;
            if (NullChecker.m82486a(y20Var)) {
                l51.m152887G(new Runnable() { // from class: l.so
                    @Override // java.lang.Runnable
                    public final void run() {
                        y20Var.call(listM202036k);
                    }
                });
            }
            this.f184942d.set(false);
            return;
        }
        List<MMPresetFilter> listM202037l = m202037l(context, fileArrListFiles);
        if (NullChecker.m82486a(listM202037l) && listM202037l.size() > 0) {
            listM202036k.addAll(listM202036k.size(), listM202037l);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MMPresetFilter mMPresetFilter : listM202036k) {
            linkedHashMap.put(mMPresetFilter.mFilterId, mMPresetFilter);
        }
        final ArrayList arrayList = new ArrayList(linkedHashMap.values());
        this.f184939a = arrayList;
        if (NullChecker.m82486a(y20Var)) {
            l51.m152887G(new Runnable() { // from class: l.to
                @Override // java.lang.Runnable
                public final void run() {
                    y20Var.call(arrayList);
                }
            });
        }
        this.f184942d.set(false);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m202042q(y20 y20Var) {
        y20Var.call(this.f184939a);
    }

    /* JADX INFO: renamed from: r */
    public void m202043r() {
        if (f184937f == 0 && NullChecker.m82486a(this.f184939a)) {
            this.f184939a.clear();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m202044s(boolean z) {
        this.f184941c = z;
    }

    /* JADX INFO: renamed from: t */
    public void m202045t(List<MMPresetFilter> list) {
        this.f184940b = list;
        this.f184939a = null;
        this.f184941c = true;
    }
}
