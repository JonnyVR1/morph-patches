package p153l;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.beatles.NetConnectivityReceiver;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class du2 {

    /* JADX INFO: renamed from: a */
    public static boolean f90720a = false;

    /* JADX INFO: renamed from: b */
    public static syv f90721b = null;

    /* JADX INFO: renamed from: c */
    public static cjk0 f90722c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f90723d = false;

    /* JADX INFO: renamed from: e */
    public static Context f90724e = null;

    /* JADX INFO: renamed from: f */
    public static long f90725f = 0;

    /* JADX INFO: renamed from: g */
    public static int f90726g = 0;

    /* JADX INFO: renamed from: h */
    public static String f90727h = "";

    /* JADX INFO: renamed from: i */
    public static boolean f90728i;

    /* JADX INFO: renamed from: k */
    public static hvl f90730k;

    /* JADX INFO: renamed from: l */
    public static String f90731l;

    /* JADX INFO: renamed from: m */
    public static q3k0 f90732m;

    /* JADX INFO: renamed from: o */
    public static volatile boolean f90734o;

    /* JADX INFO: renamed from: p */
    public static String f90735p;

    /* JADX INFO: renamed from: q */
    public static String f90736q;

    /* JADX INFO: renamed from: r */
    public static ywd0 f90737r;

    /* JADX INFO: renamed from: j */
    public static ArrayList<Class> f90729j = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    public static yqf0<Object> f90733n = new C16630a();

    /* JADX INFO: renamed from: l.du2$a */
    public class C16630a extends yqf0<Object> {
    }

    /* JADX INFO: renamed from: A */
    public static void m118032A(Date date, String str, long j, @Nullable b3k0 b3k0Var) {
        syv syvVar = f90721b;
        if (syvVar == null) {
            f610.m124264b("Please init Beatles!!!", new Object[0]);
        } else {
            syvVar.m188601m(date, str, j, b3k0Var);
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m118033B(List<Date> list, @Nullable String str, @Nullable long j, @Nullable b3k0 b3k0Var) {
        if (list == null || list.size() < 1) {
            return;
        }
        Iterator<Date> it = list.iterator();
        while (it.hasNext()) {
            m118032A(it.next(), str, j, b3k0Var);
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m118034C(boolean z) {
        f90734o = z;
    }

    /* JADX INFO: renamed from: D */
    public static void m118035D(hvl hvlVar) {
        f90730k = hvlVar;
    }

    /* JADX INFO: renamed from: E */
    public static void m118036E(boolean z) {
        f90728i = z;
    }

    /* JADX INFO: renamed from: F */
    public static void m118037F(String str) {
        f90736q = str;
    }

    /* JADX INFO: renamed from: G */
    public static void m118038G(String str) {
        f90735p = str;
    }

    /* JADX INFO: renamed from: H */
    public static void m118039H(int i) {
        f90726g = i;
    }

    /* JADX INFO: renamed from: I */
    public static void m118040I(String str) {
        f90727h = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m118041a(Class... clsArr) {
        if (clsArr != null) {
            f90729j.addAll(Arrays.asList(clsArr));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m118042b(ioi0... ioi0VarArr) {
        if (ioi0VarArr == null) {
            return;
        }
        if (!f90723d) {
            f610.m124264b("Please init Beatles first!", new Object[0]);
            return;
        }
        for (ioi0 ioi0Var : ioi0VarArr) {
            f90722c.m110255k().add(ioi0Var);
            ioi0Var.m141315n(f90724e);
            m1c.m156638b().m156639a(ioi0Var.mo82325k());
        }
    }

    /* JADX INFO: renamed from: c */
    public static List<Date> m118043c() {
        syv syvVar = f90721b;
        if (syvVar != null) {
            return syvVar.m188598j();
        }
        f610.m124264b("Please init Beatles and Enable log!!!", new Object[0]);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m118044d() {
        return f90731l;
    }

    /* JADX INFO: renamed from: e */
    public static Context m118045e() {
        return f90724e;
    }

    /* JADX INFO: renamed from: f */
    public static String m118046f() {
        r4f r4fVarM110248d;
        return (f90723d && (r4fVarM110248d = f90722c.m110248d()) != null) ? r4fVarM110248d.mo132266c() : "";
    }

    /* JADX INFO: renamed from: g */
    public static ArrayList<Class> m118047g() {
        return f90729j;
    }

    /* JADX INFO: renamed from: h */
    public static rg50 m118048h() {
        hvl hvlVar = f90730k;
        if (hvlVar == null) {
            return null;
        }
        return hvlVar.mo137325a();
    }

    /* JADX INFO: renamed from: i */
    public static hvl m118049i() {
        return f90730k;
    }

    /* JADX INFO: renamed from: j */
    public static String m118050j() {
        return f90736q;
    }

    /* JADX INFO: renamed from: k */
    public static String m118051k() {
        return f90735p;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static c610 m118052l(String str) {
        if (f90723d) {
            return f90722c.m110252h(str);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static <T> j5m<T> m118053m() {
        cjk0 cjk0Var = f90722c;
        if (cjk0Var.f82183j) {
            return cjk0Var.f82184k;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static ywd0 m118054n() {
        return f90737r;
    }

    /* JADX INFO: renamed from: o */
    public static q3k0 m118055o() {
        return f90732m;
    }

    /* JADX INFO: renamed from: p */
    public static cjk0 m118056p() {
        return f90722c;
    }

    /* JADX INFO: renamed from: q */
    public static int m118057q() {
        return f90726g;
    }

    /* JADX INFO: renamed from: r */
    public static String m118058r() {
        return f90727h;
    }

    /* JADX INFO: renamed from: s */
    public static void m118059s(Context context, String str, @NonNull cjk0 cjk0Var, boolean z, ywd0 ywd0Var) {
        if (f90723d) {
            return;
        }
        f90737r = ywd0Var;
        f90720a = z;
        f90731l = str;
        f610.m124267e(z);
        if (context == null) {
            f610.m124264b("[init] context of init() is null, check it.", new Object[0]);
            return;
        }
        if (cjk0Var == null) {
            f610.m124264b("[init] userStrategy of init() is null, check it.", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(cjk0Var.m110249e())) {
            f610.m124264b("[init] fileDir is invalid, check it.", new Object[0]);
            return;
        }
        f90724e = context;
        f90722c = cjk0Var;
        vc60.m200792g(context);
        f90732m = new q3k0(cjk0Var.m110250f());
        zy0.m222098f((Application) context);
        for (c610 c610Var : cjk0Var.m110253i()) {
            c610Var.mo82295g(context, cjk0Var.m110247c());
            m118064x(c610Var);
        }
        if (f90722c.m110246b() && f90722c.m110251g() != null) {
            f90721b = new syv(context, f90722c);
            for (c610 c610Var2 : f90722c.m110253i()) {
                m118062v("[beatles]", c610Var2.mo82290a() + " inited:" + c610Var2.m108090h());
            }
        }
        a5f.m96060m().m96066l();
        NetConnectivityReceiver.registerConnectivityReceiver(context);
        f90723d = true;
        f90725f = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m118060t() {
        return f90734o;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m118061u() {
        return f90720a;
    }

    /* JADX INFO: renamed from: v */
    public static void m118062v(String str, String str2) {
        syv syvVar = f90721b;
        if (syvVar == null) {
            f610.m124264b("Please init Beatles and Enable log!!!", new Object[0]);
        } else {
            syvVar.m188600l(str, str2);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m118063w() {
        if (f90723d) {
            a5f.m96060m().m96068o();
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m118064x(c610 c610Var) {
        x2f x2fVarMo82292d = c610Var.mo82292d();
        if (x2fVarMo82292d != null) {
            w2f.m204575b(x2fVarMo82292d);
        }
        String eventType = c610Var.getEventType();
        if (TextUtils.isEmpty(eventType)) {
            return;
        }
        f90732m.m175139n(eventType);
    }

    /* JADX INFO: renamed from: y */
    public static void m118065y(String str, long j) {
        if (str == null) {
            return;
        }
        fki.m126004b(str, j);
    }

    /* JADX INFO: renamed from: z */
    public static void m118066z(List<File> list, @Nullable long j) {
        if (list == null) {
            return;
        }
        fki.m126005c(list, j);
    }
}
