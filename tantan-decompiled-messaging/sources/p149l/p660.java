package p149l;

import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class p660 {

    /* JADX INFO: renamed from: a */
    public static ArrayList<o660> f147372a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public static ArrayList<o660> f147373b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public static o660 f147374c;

    /* JADX INFO: renamed from: d */
    public static izl f147375d;

    /* JADX INFO: renamed from: a */
    public static void m167642a(o660 o660Var) {
        if (o660Var == null || TextUtils.isEmpty(o660Var.m162820c())) {
            return;
        }
        o11.m162219a("addPageInfo::" + o660Var.m162820c());
        f147372a.add(o660Var);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m167643b(o660 o660Var) {
        try {
            if (!f147373b.contains(o660Var)) {
                f147373b.add(o660Var);
            }
            izl izlVar = f147375d;
            if (izlVar != null) {
                izlVar.mo139068b(o660Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static o660 m167644c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList<o660> arrayList = Looper.myLooper() == Looper.getMainLooper() ? f147372a : new ArrayList<>(f147372a);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o660 o660Var = arrayList.get(size);
            if (o660Var != null && str.equals(o660Var.m162820c())) {
                return o660Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static o660 m167645d() {
        return f147374c;
    }

    /* JADX INFO: renamed from: e */
    public static String m167646e() {
        o660 o660Var = f147374c;
        return o660Var != null ? o660Var.m162820c() : "";
    }

    /* JADX INFO: renamed from: f */
    public static String m167647f() {
        o660 o660Var = f147374c;
        return o660Var != null ? o660Var.m162823f() : "";
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static synchronized o660 m167648g() {
        int size = f147373b.size();
        if (size <= 0) {
            return null;
        }
        return f147373b.get(size - 1);
    }

    /* JADX INFO: renamed from: h */
    public static void m167649h(String str, String str2, String str3) {
        o11.m162219a("refreshPageRequestId::" + str3);
        if (!TextUtils.isEmpty(str)) {
            for (int size = f147372a.size() - 1; size >= 0; size--) {
                o660 o660Var = f147372a.get(size);
                if (TextUtils.equals(str, o660Var.m162823f())) {
                    o660Var.m162826i(str2);
                }
            }
            return;
        }
        for (int size2 = f147372a.size() - 1; size2 >= 0; size2--) {
            o660 o660Var2 = f147372a.get(size2);
            if (o660Var2.m162820c().equals(str3)) {
                o660Var2.m162826i(str2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m167650i(o660 o660Var) {
        if (o660Var == null || TextUtils.isEmpty(o660Var.m162820c())) {
            return;
        }
        o11.m162219a("removePageInfo::" + o660Var.m162820c());
        Iterator<o660> it = f147372a.iterator();
        while (it.hasNext()) {
            o660 next = it.next();
            if (TextUtils.isEmpty(next.m162823f())) {
                if (next.m162820c().equals(o660Var.m162820c())) {
                    it.remove();
                }
            } else if (next.m162823f().equals(o660Var.m162823f())) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static synchronized void m167651j(o660 o660Var) {
        f147373b.remove(o660Var);
        izl izlVar = f147375d;
        if (izlVar != null) {
            izlVar.mo139069c(o660Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m167652k(String str, String str2) {
        izl izlVar = f147375d;
        if (izlVar != null) {
            izlVar.mo139067a(str, str2);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m167653l(o660 o660Var) {
        String strM162820c;
        String strM162823f;
        o11.m162219a("setLastPage::" + o660Var.m162820c());
        for (int size = f147372a.size() + (-1); size >= 0; size--) {
            if (TextUtils.equals(o660Var.m162823f(), f147372a.get(size).m162823f())) {
                o660 o660Var2 = f147374c;
                if (o660Var2 != null) {
                    strM162820c = o660Var2.m162820c();
                    strM162823f = f147374c.m162823f();
                } else {
                    strM162820c = "";
                    strM162823f = strM162820c;
                }
                f147374c = new o660(o660Var.m162820c(), o660Var.m162823f(), strM162820c, strM162823f, o660Var.m162818a(), o660Var.m162819b());
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static synchronized void m167654m(izl izlVar) {
        f147375d = izlVar;
    }
}
