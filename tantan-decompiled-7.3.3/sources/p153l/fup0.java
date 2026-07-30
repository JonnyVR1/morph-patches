package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
class fup0 {

    /* JADX INFO: renamed from: d */
    private static volatile fup0 f100930d;

    /* JADX INFO: renamed from: a */
    private final HashMap<String, MKWebView> f100931a = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private final HashMap<MKWebView, ArrayList<MKWebView>> f100933c = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private final HashMap<MKWebView, String> f100932b = new HashMap<>();

    private fup0() {
    }

    /* JADX INFO: renamed from: a */
    private void m127519a() {
        ArrayList arrayList = new ArrayList();
        for (MKWebView mKWebView : this.f100933c.keySet()) {
            ArrayList<MKWebView> arrayList2 = this.f100933c.get(mKWebView);
            if (arrayList2 == null || arrayList2.isEmpty()) {
                arrayList.add(mKWebView);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f100933c.remove(arrayList.get(i));
        }
    }

    /* JADX INFO: renamed from: e */
    public static fup0 m127520e() {
        if (f100930d == null) {
            synchronized (fup0.class) {
                try {
                    if (f100930d == null) {
                        f100930d = new fup0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f100930d;
    }

    /* JADX INFO: renamed from: b */
    public synchronized List<MKWebView> m127521b(@NonNull MKWebView mKWebView) {
        ArrayList<MKWebView> arrayListRemove;
        arrayListRemove = this.f100933c.remove(mKWebView);
        if (arrayListRemove != null) {
            int size = arrayListRemove.size();
            for (int i = 0; i < size; i++) {
                MKWebView mKWebView2 = arrayListRemove.get(i);
                if (mKWebView2 != null) {
                    this.f100931a.remove(this.f100932b.remove(mKWebView2));
                }
            }
        }
        return arrayListRemove;
    }

    /* JADX INFO: renamed from: c */
    public List<MKWebView> m127522c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f100931a.values());
        arrayList.addAll(this.f100932b.keySet());
        arrayList.addAll(this.f100933c.keySet());
        Iterator<ArrayList<MKWebView>> it = this.f100933c.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public synchronized fg60 m127523d(String str) {
        fg60 fg60Var;
        try {
            fg60Var = new fg60();
            MKWebView mKWebViewRemove = this.f100931a.remove(str);
            fg60Var.f98889b = mKWebViewRemove;
            if (mKWebViewRemove != null) {
                this.f100932b.remove(mKWebViewRemove);
                for (MKWebView mKWebView : this.f100933c.keySet()) {
                    ArrayList<MKWebView> arrayList = this.f100933c.get(mKWebView);
                    if (arrayList != null && !arrayList.isEmpty() && arrayList.remove(mKWebViewRemove)) {
                        fg60Var.f98888a = mKWebView;
                        break;
                    }
                }
                m127519a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return fg60Var;
    }
}
