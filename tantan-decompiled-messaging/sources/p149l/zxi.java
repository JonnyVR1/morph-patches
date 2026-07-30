package p149l;

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
public class zxi {

    /* JADX INFO: renamed from: a */
    public static final zew<String, Typeface> f205443a = new zew<>(16);

    /* JADX INFO: renamed from: b */
    public static final ExecutorService f205444b = auc0.m98964a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c */
    public static final Object f205445c = new Object();

    /* JADX INFO: renamed from: d */
    @GuardedBy("LOCK")
    public static final hgf0<String, ArrayList<wz5<C21809e>>> f205446d = new hgf0<>();

    /* JADX INFO: renamed from: l.zxi$a */
    public class CallableC21805a implements Callable<C21809e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f205447a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f205448b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ xxi f205449c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f205450d;

        public CallableC21805a(String str, Context context, xxi xxiVar, int i) {
            this.f205447a = str;
            this.f205448b = context;
            this.f205449c = xxiVar;
            this.f205450d = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C21809e call() {
            return zxi.m220828c(this.f205447a, this.f205448b, this.f205449c, this.f205450d);
        }
    }

    /* JADX INFO: renamed from: l.zxi$b */
    public class C21806b implements wz5<C21809e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d84 f205451a;

        public C21806b(d84 d84Var) {
            this.f205451a = d84Var;
        }

        @Override // p149l.wz5
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(C21809e c21809e) {
            if (c21809e == null) {
                c21809e = new C21809e(-3);
            }
            this.f205451a.m110263b(c21809e);
        }
    }

    /* JADX INFO: renamed from: l.zxi$c */
    public class CallableC21807c implements Callable<C21809e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f205452a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f205453b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ xxi f205454c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f205455d;

        public CallableC21807c(String str, Context context, xxi xxiVar, int i) {
            this.f205452a = str;
            this.f205453b = context;
            this.f205454c = xxiVar;
            this.f205455d = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C21809e call() {
            try {
                return zxi.m220828c(this.f205452a, this.f205453b, this.f205454c, this.f205455d);
            } catch (Throwable unused) {
                return new C21809e(-3);
            }
        }
    }

    /* JADX INFO: renamed from: l.zxi$d */
    public class C21808d implements wz5<C21809e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f205456a;

        public C21808d(String str) {
            this.f205456a = str;
        }

        @Override // p149l.wz5
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(C21809e c21809e) {
            synchronized (zxi.f205445c) {
                try {
                    hgf0<String, ArrayList<wz5<C21809e>>> hgf0Var = zxi.f205446d;
                    ArrayList<wz5<C21809e>> arrayList = hgf0Var.get(this.f205456a);
                    if (arrayList == null) {
                        return;
                    }
                    hgf0Var.remove(this.f205456a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList.get(i).accept(c21809e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m220826a(@NonNull xxi xxiVar, int i) {
        return xxiVar.m211493d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: b */
    public static int m220827b(@NonNull byi.C16013a c16013a) {
        int i = 1;
        if (c16013a.m104463c() != 0) {
            return c16013a.m104463c() != 1 ? -3 : -2;
        }
        byi.C16014b[] c16014bArrM104462b = c16013a.m104462b();
        if (c16014bArrM104462b != null && c16014bArrM104462b.length != 0) {
            i = 0;
            for (byi.C16014b c16014b : c16014bArrM104462b) {
                int iM104465b = c16014b.m104465b();
                if (iM104465b != 0) {
                    if (iM104465b < 0) {
                        return -3;
                    }
                    return iM104465b;
                }
            }
        }
        return i;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C21809e m220828c(@NonNull String str, @NonNull Context context, @NonNull xxi xxiVar, int i) {
        zew<String, Typeface> zewVar = f205443a;
        Typeface typefaceM218420d = zewVar.m218420d(str);
        if (typefaceM218420d != null) {
            return new C21809e(typefaceM218420d);
        }
        try {
            byi.C16013a c16013aM206006e = wxi.m206006e(context, xxiVar, null);
            int iM220827b = m220827b(c16013aM206006e);
            if (iM220827b != 0) {
                return new C21809e(iM220827b);
            }
            Typeface typefaceM101538b = bfj0.m101538b(context, null, c16013aM206006e.m104462b(), i);
            if (typefaceM101538b == null) {
                return new C21809e(-3);
            }
            zewVar.m218421e(str, typefaceM101538b);
            return new C21809e(typefaceM101538b);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C21809e(-1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static Typeface m220829d(@NonNull Context context, @NonNull xxi xxiVar, int i, @Nullable Executor executor, @NonNull d84 d84Var) {
        String strM220826a = m220826a(xxiVar, i);
        Typeface typefaceM218420d = f205443a.m218420d(strM220826a);
        if (typefaceM218420d != null) {
            d84Var.m110263b(new C21809e(typefaceM218420d));
            return typefaceM218420d;
        }
        C21806b c21806b = new C21806b(d84Var);
        synchronized (f205445c) {
            try {
                hgf0<String, ArrayList<wz5<C21809e>>> hgf0Var = f205446d;
                ArrayList<wz5<C21809e>> arrayList = hgf0Var.get(strM220826a);
                if (arrayList != null) {
                    arrayList.add(c21806b);
                    return null;
                }
                ArrayList<wz5<C21809e>> arrayList2 = new ArrayList<>();
                arrayList2.add(c21806b);
                hgf0Var.put(strM220826a, arrayList2);
                CallableC21807c callableC21807c = new CallableC21807c(strM220826a, context, xxiVar, i);
                if (executor == null) {
                    executor = f205444b;
                }
                auc0.m98965b(executor, callableC21807c, new C21808d(strM220826a));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static Typeface m220830e(@NonNull Context context, @NonNull xxi xxiVar, @NonNull d84 d84Var, int i, int i2) {
        String strM220826a = m220826a(xxiVar, i);
        Typeface typefaceM218420d = f205443a.m218420d(strM220826a);
        if (typefaceM218420d != null) {
            d84Var.m110263b(new C21809e(typefaceM218420d));
            return typefaceM218420d;
        }
        if (i2 == -1) {
            C21809e c21809eM220828c = m220828c(strM220826a, context, xxiVar, i);
            d84Var.m110263b(c21809eM220828c);
            return c21809eM220828c.f205457a;
        }
        try {
            C21809e c21809e = (C21809e) auc0.m98966c(f205444b, new CallableC21805a(strM220826a, context, xxiVar, i), i2);
            d84Var.m110263b(c21809e);
            return c21809e.f205457a;
        } catch (InterruptedException unused) {
            d84Var.m110263b(new C21809e(-3));
            return null;
        }
    }

    /* JADX INFO: renamed from: l.zxi$e */
    public static final class C21809e {

        /* JADX INFO: renamed from: a */
        public final Typeface f205457a;

        /* JADX INFO: renamed from: b */
        public final int f205458b;

        public C21809e(int i) {
            this.f205457a = null;
            this.f205458b = i;
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: a */
        public boolean m220835a() {
            return this.f205458b == 0;
        }

        @SuppressLint({"WrongConstant"})
        public C21809e(@NonNull Typeface typeface) {
            this.f205457a = typeface;
            this.f205458b = 0;
        }
    }
}
