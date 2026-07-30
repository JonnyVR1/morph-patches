package p007l;

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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class hli {

    /* JADX INFO: renamed from: e */
    public static hli f8762e;

    /* JADX INFO: renamed from: f */
    public static int f8763f;

    /* JADX INFO: renamed from: g */
    public static List<MMPresetFilter> f8764g = new ArrayList();

    /* JADX INFO: renamed from: a */
    public List<MMPresetFilter> f8765a;

    /* JADX INFO: renamed from: c */
    public boolean f8767c;

    /* JADX INFO: renamed from: b */
    public List<MMPresetFilter> f8766b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public AtomicBoolean f8768d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m10652d(MMPresetFilter mMPresetFilter, MMPresetFilter mMPresetFilter2) {
        return Integer.valueOf(mMPresetFilter.postionInList).intValue() - Integer.valueOf(mMPresetFilter2.postionInList).intValue();
    }

    /* JADX INFO: renamed from: f */
    public static void m10654f() {
        f8763f++;
    }

    /* JADX INFO: renamed from: j */
    public static hli m10655j() {
        if (f8762e == null) {
            f8762e = new hli();
        }
        return f8762e;
    }

    /* JADX INFO: renamed from: u */
    public static void m10656u() {
        int i = f8763f;
        if (i > 0) {
            f8763f = i - 1;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m10657g(List<MMPresetFilter> list, MMPresetFilter mMPresetFilter) {
        Iterator<MMPresetFilter> it = list.iterator();
        while (it.hasNext()) {
            if (mMPresetFilter.lookupUrl.equals(it.next().lookupUrl)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void m10658h() {
        if (NullChecker.a(this.f8765a)) {
            this.f8765a.clear();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m10659i(final Context context, final e30<List<MMPresetFilter>> e30Var) {
        if (this.f8768d.compareAndSet(false, true)) {
            e51.y(new Runnable() { // from class: l.vki
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14185a.m10665p(context, e30Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public final List<MMPresetFilter> m10660k(Context context) {
        int iIndexOf;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        File[] fileArrListFiles = xii.m16788e().listFiles();
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
                        if (m10663n(mMPresetFilter) >= 0 && !m10657g(copyOnWriteArrayList, mMPresetFilter)) {
                            copyOnWriteArrayList.add(mMPresetFilter);
                        }
                    }
                }
            }
        }
        return copyOnWriteArrayList;
    }

    /* JADX INFO: renamed from: l */
    public final List<MMPresetFilter> m10661l(Context context, File[] fileArr) {
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
                    if (NullChecker.b(f8764g) && f8764g.size() > 0) {
                        int size = f8764g.size();
                        for (int i = 0; i < size; i++) {
                            MMPresetFilter mMPresetFilter2 = f8764g.get(i);
                            if (mMPresetFilter2.mFilterId.equals(str)) {
                                mMPresetFilter.isIconLocal = false;
                                mMPresetFilter.mFilterIcon = mMPresetFilter2.getIconUrl();
                                mMPresetFilter.setTag(mMPresetFilter2.getTag());
                                mMPresetFilter2.isFilterFileExist = mMPresetFilter.isFilterFileExist;
                                break;
                            }
                        }
                    }
                    if (m10663n(mMPresetFilter) >= 0) {
                        arrayList.add(mMPresetFilter);
                    }
                }
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: l.bli
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return hli.m10652d((MMPresetFilter) obj, (MMPresetFilter) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public void m10662m(Context context, final e30<List<MMPresetFilter>> e30Var) {
        List<MMPresetFilter> list = this.f8765a;
        if (list == null || list.size() == 0) {
            m10659i(context, e30Var);
        } else if (NullChecker.a(e30Var)) {
            e51.M(new Runnable() { // from class: l.tki
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13325a.m10666q(e30Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m10663n(MMPresetFilter mMPresetFilter) {
        for (int i = 0; i < this.f8766b.size(); i++) {
            MMPresetFilter mMPresetFilter2 = this.f8766b.get(i);
            if (TextUtils.equals(mMPresetFilter2.mFilterId, mMPresetFilter.mFilterId)) {
                if (!TextUtils.isEmpty(mMPresetFilter2.mFilterIcon)) {
                    mMPresetFilter.mFilterIcon = mMPresetFilter2.mFilterIcon;
                }
                if (!TextUtils.isEmpty(((MMFilter) mMPresetFilter2).mFilterName)) {
                    ((MMFilter) mMPresetFilter).mFilterName = ((MMFilter) this.f8766b.get(i)).mFilterName;
                }
                mMPresetFilter.postionInList = String.valueOf(i);
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public boolean m10664o() {
        return this.f8767c;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m10665p(Context context, final e30 e30Var) {
        final List<MMPresetFilter> listM10660k = m10660k(context);
        File[] fileArrListFiles = xii.m16787d().listFiles();
        if (fileArrListFiles == null) {
            this.f8765a = listM10660k;
            if (NullChecker.a(e30Var)) {
                e51.G(new Runnable() { // from class: l.xki
                    @Override // java.lang.Runnable
                    public final void run() {
                        e30Var.call(listM10660k);
                    }
                });
            }
            this.f8768d.set(false);
            return;
        }
        List<MMPresetFilter> listM10661l = m10661l(context, fileArrListFiles);
        if (NullChecker.a(listM10661l) && listM10661l.size() > 0) {
            listM10660k.addAll(listM10660k.size(), listM10661l);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MMPresetFilter mMPresetFilter : listM10660k) {
            linkedHashMap.put(mMPresetFilter.mFilterId, mMPresetFilter);
        }
        final ArrayList arrayList = new ArrayList(linkedHashMap.values());
        this.f8765a = arrayList;
        if (NullChecker.a(e30Var)) {
            e51.G(new Runnable() { // from class: l.zki
                @Override // java.lang.Runnable
                public final void run() {
                    e30Var.call(arrayList);
                }
            });
        }
        this.f8768d.set(false);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m10666q(e30 e30Var) {
        e30Var.call(this.f8765a);
    }

    /* JADX INFO: renamed from: r */
    public void m10667r() {
        if (f8763f == 0 && NullChecker.a(this.f8765a)) {
            this.f8765a.clear();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m10668s(boolean z) {
        this.f8767c = z;
    }

    /* JADX INFO: renamed from: t */
    public void m10669t(List<MMPresetFilter> list) {
        this.f8766b = list;
        this.f8765a = null;
        this.f8767c = true;
    }
}
