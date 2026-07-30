package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class v0j {

    /* JADX INFO: renamed from: a */
    public static final xgw<String, Typeface> f181862a = new xgw<>(16);

    /* JADX INFO: renamed from: b */
    public static final ExecutorService f181863b = d2d0.m113686a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c */
    public static final Object f181864c = new Object();

    /* JADX INFO: renamed from: d */
    @GuardedBy("LOCK")
    public static final oof0<String, ArrayList<b16<C20715e>>> f181865d = new oof0<>();

    /* JADX INFO: renamed from: l.v0j$a */
    public class CallableC20711a implements Callable<C20715e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f181866a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f181867b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ t0j f181868c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f181869d;

        public CallableC20711a(String str, Context context, t0j t0jVar, int i) {
            this.f181866a = str;
            this.f181867b = context;
            this.f181868c = t0jVar;
            this.f181869d = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C20715e call() {
            return v0j.m198902c(this.f181866a, this.f181867b, this.f181868c, this.f181869d);
        }
    }

    /* JADX INFO: renamed from: l.v0j$b */
    public class C20712b implements b16<C20715e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c94 f181870a;

        public C20712b(c94 c94Var) {
            this.f181870a = c94Var;
        }

        @Override // p153l.b16
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(C20715e c20715e) {
            if (c20715e == null) {
                c20715e = new C20715e(-3);
            }
            this.f181870a.m108405b(c20715e);
        }
    }

    /* JADX INFO: renamed from: l.v0j$c */
    public class CallableC20713c implements Callable<C20715e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f181871a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f181872b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ t0j f181873c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f181874d;

        public CallableC20713c(String str, Context context, t0j t0jVar, int i) {
            this.f181871a = str;
            this.f181872b = context;
            this.f181873c = t0jVar;
            this.f181874d = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C20715e call() {
            try {
                return v0j.m198902c(this.f181871a, this.f181872b, this.f181873c, this.f181874d);
            } catch (Throwable unused) {
                return new C20715e(-3);
            }
        }
    }

    /* JADX INFO: renamed from: l.v0j$d */
    public class C20714d implements b16<C20715e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f181875a;

        public C20714d(String str) {
            this.f181875a = str;
        }

        @Override // p153l.b16
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(C20715e c20715e) {
            synchronized (v0j.f181864c) {
                try {
                    oof0<String, ArrayList<b16<C20715e>>> oof0Var = v0j.f181865d;
                    ArrayList<b16<C20715e>> arrayList = oof0Var.get(this.f181875a);
                    if (arrayList == null) {
                        return;
                    }
                    oof0Var.remove(this.f181875a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList.get(i).accept(c20715e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m198900a(@NonNull t0j t0jVar, int i) {
        return t0jVar.m188776d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: b */
    public static int m198901b(@NonNull x0j.C21222a c21222a) {
        int i = 1;
        if (c21222a.m208860c() != 0) {
            return c21222a.m208860c() != 1 ? -3 : -2;
        }
        x0j.C21223b[] c21223bArrM208859b = c21222a.m208859b();
        if (c21223bArrM208859b != null && c21223bArrM208859b.length != 0) {
            i = 0;
            for (x0j.C21223b c21223b : c21223bArrM208859b) {
                int iM208862b = c21223b.m208862b();
                if (iM208862b != 0) {
                    if (iM208862b < 0) {
                        return -3;
                    }
                    return iM208862b;
                }
            }
        }
        return i;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C20715e m198902c(@NonNull String str, @NonNull Context context, @NonNull t0j t0jVar, int i) {
        xgw<String, Typeface> xgwVar = f181862a;
        Typeface typefaceM210954d = xgwVar.m210954d(str);
        if (typefaceM210954d != null) {
            return new C20715e(typefaceM210954d);
        }
        try {
            x0j.C21222a c21222aM183955e = s0j.m183955e(context, t0jVar, null);
            int iM198901b = m198901b(c21222aM183955e);
            if (iM198901b != 0) {
                return new C20715e(iM198901b);
            }
            Typeface typefaceM126457b = foj0.m126457b(context, null, c21222aM183955e.m208859b(), i);
            if (typefaceM126457b == null) {
                return new C20715e(-3);
            }
            xgwVar.m210955e(str, typefaceM126457b);
            return new C20715e(typefaceM126457b);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C20715e(-1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static Typeface m198903d(@NonNull Context context, @NonNull t0j t0jVar, int i, @Nullable Executor executor, @NonNull c94 c94Var) {
        String strM198900a = m198900a(t0jVar, i);
        Typeface typefaceM210954d = f181862a.m210954d(strM198900a);
        if (typefaceM210954d != null) {
            c94Var.m108405b(new C20715e(typefaceM210954d));
            return typefaceM210954d;
        }
        C20712b c20712b = new C20712b(c94Var);
        synchronized (f181864c) {
            try {
                oof0<String, ArrayList<b16<C20715e>>> oof0Var = f181865d;
                ArrayList<b16<C20715e>> arrayList = oof0Var.get(strM198900a);
                if (arrayList != null) {
                    arrayList.add(c20712b);
                    return null;
                }
                ArrayList<b16<C20715e>> arrayList2 = new ArrayList<>();
                arrayList2.add(c20712b);
                oof0Var.put(strM198900a, arrayList2);
                CallableC20713c callableC20713c = new CallableC20713c(strM198900a, context, t0jVar, i);
                if (executor == null) {
                    executor = f181863b;
                }
                d2d0.m113687b(executor, callableC20713c, new C20714d(strM198900a));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static Typeface m198904e(@NonNull Context context, @NonNull t0j t0jVar, @NonNull c94 c94Var, int i, int i2) {
        String strM198900a = m198900a(t0jVar, i);
        Typeface typefaceM210954d = f181862a.m210954d(strM198900a);
        if (typefaceM210954d != null) {
            c94Var.m108405b(new C20715e(typefaceM210954d));
            return typefaceM210954d;
        }
        if (i2 == -1) {
            C20715e c20715eM198902c = m198902c(strM198900a, context, t0jVar, i);
            c94Var.m108405b(c20715eM198902c);
            return c20715eM198902c.f181876a;
        }
        try {
            C20715e c20715e = (C20715e) d2d0.m113688c(f181863b, new CallableC20711a(strM198900a, context, t0jVar, i), i2);
            c94Var.m108405b(c20715e);
            return c20715e.f181876a;
        } catch (InterruptedException unused) {
            c94Var.m108405b(new C20715e(-3));
            return null;
        }
    }

    /* JADX INFO: renamed from: l.v0j$e */
    public static final class C20715e {

        /* JADX INFO: renamed from: a */
        public final Typeface f181876a;

        /* JADX INFO: renamed from: b */
        public final int f181877b;

        public C20715e(int i) {
            this.f181876a = null;
            this.f181877b = i;
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: a */
        public boolean m198909a() {
            return this.f181877b == 0;
        }

        @SuppressLint({"WrongConstant"})
        public C20715e(@NonNull Typeface typeface) {
            this.f181876a = typeface;
            this.f181877b = 0;
        }
    }
}
