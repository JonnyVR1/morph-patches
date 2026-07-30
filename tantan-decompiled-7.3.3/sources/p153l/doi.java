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

/* JADX INFO: loaded from: classes13.dex */
public class doi {

    /* JADX INFO: renamed from: e */
    public static doi f89958e;

    /* JADX INFO: renamed from: f */
    public static int f89959f;

    /* JADX INFO: renamed from: g */
    public static List<MMPresetFilter> f89960g = new ArrayList();

    /* JADX INFO: renamed from: a */
    public List<MMPresetFilter> f89961a;

    /* JADX INFO: renamed from: c */
    public boolean f89963c;

    /* JADX INFO: renamed from: b */
    public List<MMPresetFilter> f89962b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public AtomicBoolean f89964d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m117274d(MMPresetFilter mMPresetFilter, MMPresetFilter mMPresetFilter2) {
        return Integer.valueOf(mMPresetFilter.postionInList).intValue() - Integer.valueOf(mMPresetFilter2.postionInList).intValue();
    }

    /* JADX INFO: renamed from: f */
    public static void m117276f() {
        f89959f++;
    }

    /* JADX INFO: renamed from: j */
    public static doi m117277j() {
        if (f89958e == null) {
            f89958e = new doi();
        }
        return f89958e;
    }

    /* JADX INFO: renamed from: u */
    public static void m117278u() {
        int i = f89959f;
        if (i > 0) {
            f89959f = i - 1;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m117279g(List<MMPresetFilter> list, MMPresetFilter mMPresetFilter) {
        Iterator<MMPresetFilter> it = list.iterator();
        while (it.hasNext()) {
            if (mMPresetFilter.lookupUrl.equals(it.next().lookupUrl)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void m117280h() {
        if (NullChecker.m82486a(this.f89961a)) {
            this.f89961a.clear();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m117281i(final Context context, final y20<List<MMPresetFilter>> y20Var) {
        if (this.f89964d.compareAndSet(false, true)) {
            l51.m152919y(new Runnable() { // from class: l.rni
                @Override // java.lang.Runnable
                public final void run() {
                    this.f164048a.m117287p(context, y20Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public final List<MMPresetFilter> m117282k(Context context) {
        int iIndexOf;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        File[] fileArrListFiles = uli.m196556e().listFiles();
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
                        if (m117285n(mMPresetFilter) >= 0 && !m117279g(copyOnWriteArrayList, mMPresetFilter)) {
                            copyOnWriteArrayList.add(mMPresetFilter);
                        }
                    }
                }
            }
        }
        return copyOnWriteArrayList;
    }

    /* JADX INFO: renamed from: l */
    public final List<MMPresetFilter> m117283l(Context context, File[] fileArr) {
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
                    if (NullChecker.m82487b(f89960g) && f89960g.size() > 0) {
                        int size = f89960g.size();
                        for (int i = 0; i < size; i++) {
                            MMPresetFilter mMPresetFilter2 = f89960g.get(i);
                            if (mMPresetFilter2.mFilterId.equals(str)) {
                                mMPresetFilter.isIconLocal = false;
                                mMPresetFilter.mFilterIcon = mMPresetFilter2.getIconUrl();
                                mMPresetFilter.setTag(mMPresetFilter2.getTag());
                                mMPresetFilter2.isFilterFileExist = mMPresetFilter.isFilterFileExist;
                                break;
                            }
                        }
                    }
                    if (m117285n(mMPresetFilter) >= 0) {
                        arrayList.add(mMPresetFilter);
                    }
                }
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: l.xni
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return doi.m117274d((MMPresetFilter) obj, (MMPresetFilter) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public void m117284m(Context context, final y20<List<MMPresetFilter>> y20Var) {
        List<MMPresetFilter> list = this.f89961a;
        if (list == null || list.size() == 0) {
            m117281i(context, y20Var);
        } else if (NullChecker.m82486a(y20Var)) {
            l51.m152893M(new Runnable() { // from class: l.pni
                @Override // java.lang.Runnable
                public final void run() {
                    this.f153308a.m117288q(y20Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m117285n(MMPresetFilter mMPresetFilter) {
        for (int i = 0; i < this.f89962b.size(); i++) {
            MMPresetFilter mMPresetFilter2 = this.f89962b.get(i);
            if (TextUtils.equals(mMPresetFilter2.mFilterId, mMPresetFilter.mFilterId)) {
                if (!TextUtils.isEmpty(mMPresetFilter2.mFilterIcon)) {
                    mMPresetFilter.mFilterIcon = mMPresetFilter2.mFilterIcon;
                }
                if (!TextUtils.isEmpty(mMPresetFilter2.mFilterName)) {
                    mMPresetFilter.mFilterName = this.f89962b.get(i).mFilterName;
                }
                mMPresetFilter.postionInList = String.valueOf(i);
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public boolean m117286o() {
        return this.f89963c;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m117287p(Context context, final y20 y20Var) {
        final List<MMPresetFilter> listM117282k = m117282k(context);
        File[] fileArrListFiles = uli.m196555d().listFiles();
        if (fileArrListFiles == null) {
            this.f89961a = listM117282k;
            if (NullChecker.m82486a(y20Var)) {
                l51.m152887G(new Runnable() { // from class: l.tni
                    @Override // java.lang.Runnable
                    public final void run() {
                        y20Var.call(listM117282k);
                    }
                });
            }
            this.f89964d.set(false);
            return;
        }
        List<MMPresetFilter> listM117283l = m117283l(context, fileArrListFiles);
        if (NullChecker.m82486a(listM117283l) && listM117283l.size() > 0) {
            listM117282k.addAll(listM117282k.size(), listM117283l);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MMPresetFilter mMPresetFilter : listM117282k) {
            linkedHashMap.put(mMPresetFilter.mFilterId, mMPresetFilter);
        }
        final ArrayList arrayList = new ArrayList(linkedHashMap.values());
        this.f89961a = arrayList;
        if (NullChecker.m82486a(y20Var)) {
            l51.m152887G(new Runnable() { // from class: l.vni
                @Override // java.lang.Runnable
                public final void run() {
                    y20Var.call(arrayList);
                }
            });
        }
        this.f89964d.set(false);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m117288q(y20 y20Var) {
        y20Var.call(this.f89961a);
    }

    /* JADX INFO: renamed from: r */
    public void m117289r() {
        if (f89959f == 0 && NullChecker.m82486a(this.f89961a)) {
            this.f89961a.clear();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m117290s(boolean z) {
        this.f89963c = z;
    }

    /* JADX INFO: renamed from: t */
    public void m117291t(List<MMPresetFilter> list) {
        this.f89962b = list;
        this.f89961a = null;
        this.f89963c = true;
    }
}
