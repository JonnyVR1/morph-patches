package p153l;

import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class ve60 {

    /* JADX INFO: renamed from: a */
    public static ArrayList<ue60> f183704a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public static ArrayList<ue60> f183705b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public static ue60 f183706c;

    /* JADX INFO: renamed from: d */
    public static c2m f183707d;

    /* JADX INFO: renamed from: a */
    public static void m201034a(ue60 ue60Var) {
        if (ue60Var == null || TextUtils.isEmpty(ue60Var.m195739c())) {
            return;
        }
        v11.m198965a("addPageInfo::" + ue60Var.m195739c());
        f183704a.add(ue60Var);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m201035b(ue60 ue60Var) {
        try {
            if (!f183705b.contains(ue60Var)) {
                f183705b.add(ue60Var);
            }
            c2m c2mVar = f183707d;
            if (c2mVar != null) {
                c2mVar.mo107721b(ue60Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static ue60 m201036c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList<ue60> arrayList = Looper.myLooper() == Looper.getMainLooper() ? f183704a : new ArrayList<>(f183704a);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ue60 ue60Var = arrayList.get(size);
            if (ue60Var != null && str.equals(ue60Var.m195739c())) {
                return ue60Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static ue60 m201037d() {
        return f183706c;
    }

    /* JADX INFO: renamed from: e */
    public static String m201038e() {
        ue60 ue60Var = f183706c;
        return ue60Var != null ? ue60Var.m195739c() : "";
    }

    /* JADX INFO: renamed from: f */
    public static String m201039f() {
        ue60 ue60Var = f183706c;
        return ue60Var != null ? ue60Var.m195742f() : "";
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static synchronized ue60 m201040g() {
        int size = f183705b.size();
        if (size <= 0) {
            return null;
        }
        return f183705b.get(size - 1);
    }

    /* JADX INFO: renamed from: h */
    public static void m201041h(String str, String str2, String str3) {
        v11.m198965a("refreshPageRequestId::" + str3);
        if (!TextUtils.isEmpty(str)) {
            for (int size = f183704a.size() - 1; size >= 0; size--) {
                ue60 ue60Var = f183704a.get(size);
                if (TextUtils.equals(str, ue60Var.m195742f())) {
                    ue60Var.m195745i(str2);
                }
            }
            return;
        }
        for (int size2 = f183704a.size() - 1; size2 >= 0; size2--) {
            ue60 ue60Var2 = f183704a.get(size2);
            if (ue60Var2.m195739c().equals(str3)) {
                ue60Var2.m195745i(str2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m201042i(ue60 ue60Var) {
        if (ue60Var == null || TextUtils.isEmpty(ue60Var.m195739c())) {
            return;
        }
        v11.m198965a("removePageInfo::" + ue60Var.m195739c());
        Iterator<ue60> it = f183704a.iterator();
        while (it.hasNext()) {
            ue60 next = it.next();
            if (TextUtils.isEmpty(next.m195742f())) {
                if (next.m195739c().equals(ue60Var.m195739c())) {
                    it.remove();
                }
            } else if (next.m195742f().equals(ue60Var.m195742f())) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static synchronized void m201043j(ue60 ue60Var) {
        f183705b.remove(ue60Var);
        c2m c2mVar = f183707d;
        if (c2mVar != null) {
            c2mVar.mo107722c(ue60Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m201044k(String str, String str2) {
        c2m c2mVar = f183707d;
        if (c2mVar != null) {
            c2mVar.mo107720a(str, str2);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m201045l(ue60 ue60Var) {
        String strM195739c;
        String strM195742f;
        v11.m198965a("setLastPage::" + ue60Var.m195739c());
        for (int size = f183704a.size() + (-1); size >= 0; size--) {
            if (TextUtils.equals(ue60Var.m195742f(), f183704a.get(size).m195742f())) {
                ue60 ue60Var2 = f183706c;
                if (ue60Var2 != null) {
                    strM195739c = ue60Var2.m195739c();
                    strM195742f = f183706c.m195742f();
                } else {
                    strM195739c = "";
                    strM195742f = strM195739c;
                }
                f183706c = new ue60(ue60Var.m195739c(), ue60Var.m195742f(), strM195739c, strM195742f, ue60Var.m195737a(), ue60Var.m195738b());
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static synchronized void m201046m(c2m c2mVar) {
        f183707d = c2mVar;
    }
}
