package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class blp0 {

    /* JADX INFO: renamed from: d */
    private static volatile blp0 f76202d;

    /* JADX INFO: renamed from: a */
    private final HashMap<String, MKWebView> f76203a = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private final HashMap<MKWebView, ArrayList<MKWebView>> f76205c = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private final HashMap<MKWebView, String> f76204b = new HashMap<>();

    private blp0() {
    }

    /* JADX INFO: renamed from: a */
    private void m102550a() {
        ArrayList arrayList = new ArrayList();
        for (MKWebView mKWebView : this.f76205c.keySet()) {
            ArrayList<MKWebView> arrayList2 = this.f76205c.get(mKWebView);
            if (arrayList2 == null || arrayList2.isEmpty()) {
                arrayList.add(mKWebView);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f76205c.remove(arrayList.get(i));
        }
    }

    /* JADX INFO: renamed from: e */
    public static blp0 m102551e() {
        if (f76202d == null) {
            synchronized (blp0.class) {
                try {
                    if (f76202d == null) {
                        f76202d = new blp0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f76202d;
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m102552b(String str) {
        return this.f76203a.containsKey(str);
    }

    /* JADX INFO: renamed from: c */
    public List<MKWebView> m102553c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f76203a.values());
        arrayList.addAll(this.f76204b.keySet());
        arrayList.addAll(this.f76205c.keySet());
        Iterator<ArrayList<MKWebView>> it = this.f76205c.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public synchronized a860 m102554d(String str) {
        a860 a860Var;
        try {
            a860Var = new a860();
            MKWebView mKWebViewRemove = this.f76203a.remove(str);
            a860Var.f67999b = mKWebViewRemove;
            if (mKWebViewRemove != null) {
                this.f76204b.remove(mKWebViewRemove);
                for (MKWebView mKWebView : this.f76205c.keySet()) {
                    ArrayList<MKWebView> arrayList = this.f76205c.get(mKWebView);
                    if (arrayList != null && !arrayList.isEmpty() && arrayList.remove(mKWebViewRemove)) {
                        a860Var.f67998a = mKWebView;
                        break;
                    }
                }
                m102550a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a860Var;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m102555f(@NonNull MKWebView mKWebView, @NonNull String str, @NonNull MKWebView mKWebView2) {
        try {
            this.f76203a.put(str, mKWebView2);
            this.f76204b.put(mKWebView2, str);
            ArrayList<MKWebView> arrayList = this.f76205c.get(mKWebView);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f76205c.put(mKWebView, arrayList);
            }
            arrayList.add(mKWebView2);
        } catch (Throwable th) {
            throw th;
        }
    }
}
