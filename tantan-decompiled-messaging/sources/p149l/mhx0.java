package p149l;

import android.content.Context;
import com.google.common.base.Optional;
import com.google.common.base.Suppliers;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mhx0<T> {

    /* JADX INFO: renamed from: h */
    public static final Object f133914h = new Object();

    /* JADX INFO: renamed from: i */
    public static volatile ejx0 f133915i;

    /* JADX INFO: renamed from: j */
    public static sjx0 f133916j;

    /* JADX INFO: renamed from: k */
    public static final AtomicInteger f133917k;

    /* JADX INFO: renamed from: a */
    public final uix0 f133918a;

    /* JADX INFO: renamed from: b */
    public final String f133919b;

    /* JADX INFO: renamed from: c */
    public Object f133920c;

    /* JADX INFO: renamed from: d */
    public volatile int f133921d;

    /* JADX INFO: renamed from: e */
    public volatile T f133922e;

    /* JADX INFO: renamed from: f */
    public final boolean f133923f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f133924g;

    static {
        new AtomicReference();
        f133916j = new sjx0(new pjx0() { // from class: l.kix0
            @Override // p149l.pjx0
            public final boolean zza() {
                return mhx0.m154650n();
            }
        });
        f133917k = new AtomicInteger();
    }

    public mhx0(uix0 uix0Var, String str, T t, boolean z) {
        this.f133921d = -1;
        String str2 = uix0Var.f176699a;
        if (str2 == null && uix0Var.f176700b == null) {
            ig3.m135964a("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw null;
        }
        if (str2 != null && uix0Var.f176700b != null) {
            ig3.m135964a("Must pass one of SharedPreferences file name or ContentProvider URI");
            throw null;
        }
        this.f133918a = uix0Var;
        this.f133919b = str;
        this.f133920c = t;
        this.f133923f = z;
        this.f133924g = false;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ mhx0 m154644f(uix0 uix0Var, String str, Boolean bool, boolean z) {
        return new rix0(uix0Var, str, bool, true);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ mhx0 m154645g(uix0 uix0Var, String str, Double d, boolean z) {
        return new oix0(uix0Var, str, d, true);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ mhx0 m154646h(uix0 uix0Var, String str, Long l2, boolean z) {
        return new gix0(uix0Var, str, l2, true);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ mhx0 m154647i(uix0 uix0Var, String str, String str2, boolean z) {
        return new vix0(uix0Var, str, str2, true);
    }

    /* JADX INFO: renamed from: l */
    public static void m154648l(final Context context) {
        if (f133915i != null || context == null) {
            return;
        }
        Object obj = f133914h;
        synchronized (obj) {
            try {
                if (f133915i == null) {
                    synchronized (obj) {
                        try {
                            ejx0 ejx0Var = f133915i;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (ejx0Var == null || ejx0Var.mo94946a() != context) {
                                if (ejx0Var != null) {
                                    e3x0.m114637d();
                                    mjx0.m154920c();
                                    qbx0.m173855b();
                                }
                                f133915i = new a4x0(context, Suppliers.m15424a(new tyg0() { // from class: l.xhx0
                                    @Override // p149l.tyg0
                                    public final Object get() {
                                        return gfx0.C17069a.m125935a(context);
                                    }
                                }));
                                f133917k.incrementAndGet();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m154649m() {
        f133917k.incrementAndGet();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m154650n() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007c A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0029, B:14:0x0039, B:20:0x0055, B:22:0x0060, B:35:0x0080, B:38:0x0088, B:39:0x008d, B:40:0x0091, B:25:0x0067, B:34:0x007c, B:28:0x006e, B:31:0x0075, B:41:0x0095), top: B:47:0x001c }] */
    /* JADX INFO: renamed from: b */
    public final T m154651b() {
        T tM154654j;
        if (!this.f133923f) {
            sf80.m183901w(f133916j.m184566a(this.f133919b), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i = f133917k.get();
        if (this.f133921d < i) {
            synchronized (this) {
                try {
                    if (this.f133921d < i) {
                        ejx0 ejx0Var = f133915i;
                        Optional<hgx0> optionalAbsent = Optional.absent();
                        String strMo95307a = null;
                        if (ejx0Var != null) {
                            optionalAbsent = ejx0Var.mo94947b().get();
                            if (optionalAbsent.isPresent()) {
                                hgx0 hgx0Var = optionalAbsent.get();
                                uix0 uix0Var = this.f133918a;
                                strMo95307a = hgx0Var.mo95307a(uix0Var.f176700b, uix0Var.f176699a, uix0Var.f176702d, this.f133919b);
                            }
                        }
                        sf80.m183901w(ejx0Var != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        if (this.f133918a.f176704f) {
                            tM154654j = m154652d(ejx0Var);
                            if (tM154654j == null && (tM154654j = m154654j(ejx0Var)) == null) {
                                tM154654j = m154656o();
                            }
                        } else {
                            tM154654j = m154654j(ejx0Var);
                            if (tM154654j == null && (tM154654j = m154652d(ejx0Var)) == null) {
                                tM154654j = m154656o();
                            }
                        }
                        if (optionalAbsent.isPresent()) {
                            tM154654j = strMo95307a == null ? m154656o() : mo126416c(strMo95307a);
                        }
                        this.f133922e = tM154654j;
                        this.f133921d = i;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f133922e;
    }

    /* JADX INFO: renamed from: c */
    public abstract T mo126416c(Object obj);

    /* JADX INFO: renamed from: d */
    public final T m154652d(ejx0 ejx0Var) {
        gaj<Context, Boolean> gajVar;
        uix0 uix0Var = this.f133918a;
        if (!uix0Var.f176703e && ((gajVar = uix0Var.f176707i) == null || gajVar.apply(ejx0Var.mo94946a()).booleanValue())) {
            qbx0 qbx0VarM173854a = qbx0.m173854a(ejx0Var.mo94946a());
            uix0 uix0Var2 = this.f133918a;
            Object objZza = qbx0VarM173854a.zza(uix0Var2.f176703e ? null : m154653e(uix0Var2.f176701c));
            if (objZza != null) {
                return mo126416c(objZza);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final String m154653e(String str) {
        if (str != null && str.isEmpty()) {
            return this.f133919b;
        }
        return str + this.f133919b;
    }

    /* JADX INFO: renamed from: j */
    public final T m154654j(ejx0 ejx0Var) {
        qax0 qax0VarM154919b;
        Object objZza;
        if (this.f133918a.f176700b == null) {
            qax0VarM154919b = mjx0.m154919b(ejx0Var.mo94946a(), this.f133918a.f176699a, new Runnable() { // from class: l.yhx0
                @Override // java.lang.Runnable
                public final void run() {
                    mhx0.m154649m();
                }
            });
        } else if (hhx0.m131194b(ejx0Var.mo94946a(), this.f133918a.f176700b)) {
            qax0VarM154919b = this.f133918a.f176706h ? e3x0.m114636b(ejx0Var.mo94946a().getContentResolver(), rhx0.m179466a(rhx0.m179467b(ejx0Var.mo94946a(), this.f133918a.f176700b.getLastPathSegment())), new Runnable() { // from class: l.yhx0
                @Override // java.lang.Runnable
                public final void run() {
                    mhx0.m154649m();
                }
            }) : e3x0.m114636b(ejx0Var.mo94946a().getContentResolver(), this.f133918a.f176700b, new Runnable() { // from class: l.yhx0
                @Override // java.lang.Runnable
                public final void run() {
                    mhx0.m154649m();
                }
            });
        } else {
            qax0VarM154919b = null;
        }
        if (qax0VarM154919b == null || (objZza = qax0VarM154919b.zza(m154655k())) == null) {
            return null;
        }
        return mo126416c(objZza);
    }

    /* JADX INFO: renamed from: k */
    public final String m154655k() {
        return m154653e(this.f133918a.f176702d);
    }

    /* JADX INFO: renamed from: o */
    public final T m154656o() {
        return (T) this.f133920c;
    }
}
