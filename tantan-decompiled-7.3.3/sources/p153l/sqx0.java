package p153l;

import android.content.Context;
import com.google.common.base.Optional;
import com.google.common.base.Suppliers;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public abstract class sqx0<T> {

    /* JADX INFO: renamed from: h */
    public static final Object f170275h = new Object();

    /* JADX INFO: renamed from: i */
    public static volatile ksx0 f170276i;

    /* JADX INFO: renamed from: j */
    public static ysx0 f170277j;

    /* JADX INFO: renamed from: k */
    public static final AtomicInteger f170278k;

    /* JADX INFO: renamed from: a */
    public final asx0 f170279a;

    /* JADX INFO: renamed from: b */
    public final String f170280b;

    /* JADX INFO: renamed from: c */
    public Object f170281c;

    /* JADX INFO: renamed from: d */
    public volatile int f170282d;

    /* JADX INFO: renamed from: e */
    public volatile T f170283e;

    /* JADX INFO: renamed from: f */
    public final boolean f170284f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f170285g;

    static {
        new AtomicReference();
        f170277j = new ysx0(new vsx0() { // from class: l.qrx0
            @Override // p153l.vsx0
            public final boolean zza() {
                return sqx0.m187570n();
            }
        });
        f170278k = new AtomicInteger();
    }

    public sqx0(asx0 asx0Var, String str, T t, boolean z) {
        this.f170282d = -1;
        String str2 = asx0Var.f73189a;
        if (str2 == null && asx0Var.f73190b == null) {
            wg3.m206174a("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw null;
        }
        if (str2 != null && asx0Var.f73190b != null) {
            wg3.m206174a("Must pass one of SharedPreferences file name or ContentProvider URI");
            throw null;
        }
        this.f170279a = asx0Var;
        this.f170280b = str;
        this.f170281c = t;
        this.f170284f = z;
        this.f170285g = false;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ sqx0 m187564f(asx0 asx0Var, String str, Boolean bool, boolean z) {
        return new xrx0(asx0Var, str, bool, true);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ sqx0 m187565g(asx0 asx0Var, String str, Double d, boolean z) {
        return new urx0(asx0Var, str, d, true);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ sqx0 m187566h(asx0 asx0Var, String str, Long l2, boolean z) {
        return new mrx0(asx0Var, str, l2, true);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ sqx0 m187567i(asx0 asx0Var, String str, String str2, boolean z) {
        return new bsx0(asx0Var, str, str2, true);
    }

    /* JADX INFO: renamed from: l */
    public static void m187568l(final Context context) {
        if (f170276i != null || context == null) {
            return;
        }
        Object obj = f170275h;
        synchronized (obj) {
            try {
                if (f170276i == null) {
                    synchronized (obj) {
                        try {
                            ksx0 ksx0Var = f170276i;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (ksx0Var == null || ksx0Var.mo129957a() != context) {
                                if (ksx0Var != null) {
                                    kcx0.m149135d();
                                    ssx0.m187800c();
                                    wkx0.m206877b();
                                }
                                f170276i = new gdx0(context, Suppliers.m15478a(new b7h0() { // from class: l.drx0
                                    @Override // p153l.b7h0
                                    public final Object get() {
                                        return mox0.C18665a.m159324a(context);
                                    }
                                }));
                                f170278k.incrementAndGet();
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
    public static void m187569m() {
        f170278k.incrementAndGet();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m187570n() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007c A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0029, B:14:0x0039, B:20:0x0055, B:22:0x0060, B:35:0x0080, B:38:0x0088, B:39:0x008d, B:40:0x0091, B:25:0x0067, B:34:0x007c, B:28:0x006e, B:31:0x0075, B:41:0x0095), top: B:47:0x001c }] */
    /* JADX INFO: renamed from: b */
    public final T m187571b() {
        T tM187574j;
        if (!this.f170284f) {
            xn80.m212118w(f170277j.m217279a(this.f170280b), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i = f170278k.get();
        if (this.f170282d < i) {
            synchronized (this) {
                try {
                    if (this.f170282d < i) {
                        ksx0 ksx0Var = f170276i;
                        Optional<npx0> optionalAbsent = Optional.absent();
                        String strMo130198a = null;
                        if (ksx0Var != null) {
                            optionalAbsent = ksx0Var.mo129958b().get();
                            if (optionalAbsent.isPresent()) {
                                npx0 npx0Var = optionalAbsent.get();
                                asx0 asx0Var = this.f170279a;
                                strMo130198a = npx0Var.mo130198a(asx0Var.f73190b, asx0Var.f73189a, asx0Var.f73192d, this.f170280b);
                            }
                        }
                        xn80.m212118w(ksx0Var != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        if (this.f170279a.f73194f) {
                            tM187574j = m187572d(ksx0Var);
                            if (tM187574j == null && (tM187574j = m187574j(ksx0Var)) == null) {
                                tM187574j = m187576o();
                            }
                        } else {
                            tM187574j = m187574j(ksx0Var);
                            if (tM187574j == null && (tM187574j = m187572d(ksx0Var)) == null) {
                                tM187574j = m187576o();
                            }
                        }
                        if (optionalAbsent.isPresent()) {
                            tM187574j = strMo130198a == null ? m187576o() : mo106316c(strMo130198a);
                        }
                        this.f170283e = tM187574j;
                        this.f170282d = i;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f170283e;
    }

    /* JADX INFO: renamed from: c */
    public abstract T mo106316c(Object obj);

    /* JADX INFO: renamed from: d */
    public final T m187572d(ksx0 ksx0Var) {
        adj<Context, Boolean> adjVar;
        asx0 asx0Var = this.f170279a;
        if (!asx0Var.f73193e && ((adjVar = asx0Var.f73197i) == null || adjVar.apply(ksx0Var.mo129957a()).booleanValue())) {
            wkx0 wkx0VarM206876a = wkx0.m206876a(ksx0Var.mo129957a());
            asx0 asx0Var2 = this.f170279a;
            Object objZza = wkx0VarM206876a.zza(asx0Var2.f73193e ? null : m187573e(asx0Var2.f73191c));
            if (objZza != null) {
                return mo106316c(objZza);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final String m187573e(String str) {
        if (str != null && str.isEmpty()) {
            return this.f170280b;
        }
        return str + this.f170280b;
    }

    /* JADX INFO: renamed from: j */
    public final T m187574j(ksx0 ksx0Var) {
        wjx0 wjx0VarM187799b;
        Object objZza;
        if (this.f170279a.f73190b == null) {
            wjx0VarM187799b = ssx0.m187799b(ksx0Var.mo129957a(), this.f170279a.f73189a, new Runnable() { // from class: l.erx0
                @Override // java.lang.Runnable
                public final void run() {
                    sqx0.m187569m();
                }
            });
        } else if (nqx0.m164360b(ksx0Var.mo129957a(), this.f170279a.f73190b)) {
            wjx0VarM187799b = this.f170279a.f73196h ? kcx0.m149134b(ksx0Var.mo129957a().getContentResolver(), xqx0.m212767a(xqx0.m212768b(ksx0Var.mo129957a(), this.f170279a.f73190b.getLastPathSegment())), new Runnable() { // from class: l.erx0
                @Override // java.lang.Runnable
                public final void run() {
                    sqx0.m187569m();
                }
            }) : kcx0.m149134b(ksx0Var.mo129957a().getContentResolver(), this.f170279a.f73190b, new Runnable() { // from class: l.erx0
                @Override // java.lang.Runnable
                public final void run() {
                    sqx0.m187569m();
                }
            });
        } else {
            wjx0VarM187799b = null;
        }
        if (wjx0VarM187799b == null || (objZza = wjx0VarM187799b.zza(m187575k())) == null) {
            return null;
        }
        return mo106316c(objZza);
    }

    /* JADX INFO: renamed from: k */
    public final String m187575k() {
        return m187573e(this.f170279a.f73192d);
    }

    /* JADX INFO: renamed from: o */
    public final T m187576o() {
        return (T) this.f170281c;
    }
}
