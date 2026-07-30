package p153l;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbbb;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public final class sht0 extends m8x0 {

    /* JADX INFO: renamed from: e */
    public final Context f168745e;

    /* JADX INFO: renamed from: f */
    public final fex0 f168746f;

    /* JADX INFO: renamed from: g */
    public final String f168747g;

    /* JADX INFO: renamed from: h */
    public final int f168748h;

    /* JADX INFO: renamed from: i */
    public final boolean f168749i;

    /* JADX INFO: renamed from: j */
    public InputStream f168750j;

    /* JADX INFO: renamed from: k */
    public boolean f168751k;

    /* JADX INFO: renamed from: l */
    public Uri f168752l;

    /* JADX INFO: renamed from: m */
    public volatile zzbbb f168753m;

    /* JADX INFO: renamed from: n */
    public boolean f168754n;

    /* JADX INFO: renamed from: o */
    public boolean f168755o;

    /* JADX INFO: renamed from: p */
    public boolean f168756p;

    /* JADX INFO: renamed from: q */
    public boolean f168757q;

    /* JADX INFO: renamed from: r */
    public long f168758r;

    /* JADX INFO: renamed from: s */
    public hpr f168759s;

    /* JADX INFO: renamed from: t */
    public final AtomicLong f168760t;

    /* JADX INFO: renamed from: u */
    public final dit0 f168761u;

    public sht0(Context context, fex0 fex0Var, String str, int i, btx0 btx0Var, dit0 dit0Var) {
        super(false);
        this.f168745e = context;
        this.f168746f = fex0Var;
        this.f168761u = dit0Var;
        this.f168747g = str;
        this.f168748h = i;
        this.f168754n = false;
        this.f168755o = false;
        this.f168756p = false;
        this.f168757q = false;
        this.f168758r = 0L;
        this.f168760t = new AtomicLong(-1L);
        this.f168759s = null;
        this.f168749i = ((Boolean) jas0.m144075c().m176505a(sgs0.f168109Q1)).booleanValue();
        mo101236f(btx0Var);
    }

    @Override // p153l.nyy0
    /* JADX INFO: renamed from: a */
    public final int mo12781a(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f168751k) {
            zpg0.m220844a("Attempt to read closed GcacheDataSource.");
            return 0;
        }
        InputStream inputStream = this.f168750j;
        int iMo12781a = inputStream != null ? inputStream.read(bArr, i, i2) : this.f168746f.mo12781a(bArr, i, i2);
        if (this.f168749i && this.f168750j == null) {
            return iMo12781a;
        }
        zzg(iMo12781a);
        return iMo12781a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [l.fit0] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.zzbbb] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p153l.fex0
    /* JADX INFO: renamed from: e */
    public final long mo12782e(akx0 akx0Var) throws Throwable {
        zzbay zzbayVarM134422b;
        Long l2;
        Throwable th;
        boolean z;
        boolean z2;
        long jElapsedRealtime;
        StringBuilder sb;
        if (this.f168751k) {
            zpg0.m220844a("Attempt to open an already open GcacheDataSource.");
            return 0L;
        }
        ?? r3 = 1;
        this.f168751k = true;
        this.f168752l = akx0Var.f72047a;
        if (!this.f168749i) {
            m157523l(akx0Var);
        }
        this.f168753m = zzbbb.m13600g(akx0Var.f72047a);
        boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168349j4)).booleanValue();
        zzbbb zzbbbVar = this.f168753m;
        if (!zBooleanValue) {
            if (zzbbbVar != null) {
                this.f168753m.zzh = akx0Var.f72052f;
                this.f168753m.zzi = epw0.m121874c(this.f168747g);
                this.f168753m.zzj = this.f168748h;
                zzbayVarM134422b = bxy0.m106921e().m134422b(this.f168753m);
            } else {
                zzbayVarM134422b = null;
            }
            if (zzbayVarM134422b != null && zzbayVarM134422b.zze()) {
                this.f168754n = zzbayVarM134422b.zzd();
                this.f168756p = zzbayVarM134422b.m13599h0();
                this.f168757q = zzbayVarM134422b.m13598J();
                this.f168758r = zzbayVarM134422b.m13595F();
                this.f168755o = true;
                if (!m185943t()) {
                    this.f168750j = zzbayVarM134422b.m13597I();
                    if (this.f168749i) {
                        m157523l(akx0Var);
                    }
                    return -1L;
                }
            }
        } else if (zzbbbVar != null) {
            this.f168753m.zzh = akx0Var.f72052f;
            this.f168753m.zzi = epw0.m121874c(this.f168747g);
            this.f168753m.zzj = this.f168748h;
            if (this.f168753m.zzg) {
                l2 = (Long) jas0.m144075c().m176505a(sgs0.f168375l4);
            } else {
                l2 = (Long) jas0.m144075c().m176505a(sgs0.f168362k4);
            }
            long jLongValue = l2.longValue();
            long jElapsedRealtime2 = bxy0.m106918b().elapsedRealtime();
            bxy0.m106922f();
            Context context = this.f168745e;
            ?? r4 = this.f168753m;
            Future futureM109060a = ccs0.m109060a(context, r4);
            try {
                try {
                    dcs0 dcs0Var = (dcs0) futureM109060a.get(jLongValue, TimeUnit.MILLISECONDS);
                    try {
                        this.f168754n = dcs0Var.m115286d();
                        this.f168756p = dcs0Var.m115288f();
                        this.f168757q = dcs0Var.m115287e();
                        this.f168758r = dcs0Var.m115284a();
                        if (!m185943t()) {
                            this.f168750j = dcs0Var.m115285c();
                            if (this.f168749i) {
                                m157523l(akx0Var);
                            }
                            long jElapsedRealtime3 = bxy0.m106918b().elapsedRealtime() - jElapsedRealtime2;
                            this.f168761u.f88709a.m125751b0(true, jElapsedRealtime3);
                            this.f168755o = true;
                            d2v0.m113737k("Cache connection took " + jElapsedRealtime3 + "ms");
                            return -1L;
                        }
                        long jElapsedRealtime4 = bxy0.m106918b().elapsedRealtime() - jElapsedRealtime2;
                        this.f168761u.f88709a.m125751b0(true, jElapsedRealtime4);
                        this.f168755o = true;
                        sb = new StringBuilder("Cache connection took ");
                        sb.append(jElapsedRealtime4);
                    } catch (InterruptedException unused) {
                        z2 = true;
                        futureM109060a.cancel(true);
                        Thread.currentThread().interrupt();
                        jElapsedRealtime = bxy0.m106918b().elapsedRealtime() - jElapsedRealtime2;
                        this.f168761u.f88709a.m125751b0(z2, jElapsedRealtime);
                        this.f168755o = z2;
                        sb = new StringBuilder("Cache connection took ");
                        r4 = z2;
                        sb.append(jElapsedRealtime);
                    } catch (ExecutionException | TimeoutException unused2) {
                        z = true;
                        futureM109060a.cancel(true);
                        jElapsedRealtime = bxy0.m106918b().elapsedRealtime() - jElapsedRealtime2;
                        this.f168761u.f88709a.m125751b0(z, jElapsedRealtime);
                        this.f168755o = z;
                        sb = new StringBuilder("Cache connection took ");
                        r4 = z;
                        sb.append(jElapsedRealtime);
                    } catch (Throwable th2) {
                        th = th2;
                        long jElapsedRealtime5 = bxy0.m106918b().elapsedRealtime() - jElapsedRealtime2;
                        this.f168761u.f88709a.m125751b0(r3, jElapsedRealtime5);
                        this.f168755o = r3;
                        d2v0.m113737k("Cache connection took " + jElapsedRealtime5 + "ms");
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r3 = r4;
                }
            } catch (InterruptedException unused3) {
                z2 = false;
            } catch (ExecutionException | TimeoutException unused4) {
                z = false;
            } catch (Throwable th4) {
                th = th4;
                r3 = 0;
            }
            sb.append("ms");
            d2v0.m113737k(sb.toString());
        }
        this.f168755o = false;
        if (this.f168753m != null) {
            akx0Var = new akx0(Uri.parse(this.f168753m.zza), null, akx0Var.f72051e, akx0Var.f72052f, akx0Var.f72053g, null, akx0Var.f72055i);
        }
        return this.f168746f.mo12782e(akx0Var);
    }

    /* JADX INFO: renamed from: m */
    public final long m185936m() {
        return this.f168758r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final long m185937n() {
        if (this.f168753m != null) {
            if (this.f168760t.get() != -1) {
                return this.f168760t.get();
            }
            synchronized (this) {
                try {
                    if (this.f168759s == null) {
                        this.f168759s = oct0.f146733a.mo155969R(new Callable() { // from class: l.rht0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.f163197a.m185938o();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f168759s.isDone()) {
                try {
                    this.f168760t.compareAndSet(-1L, ((Long) this.f168759s.get()).longValue());
                    return this.f168760t.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Long m185938o() throws Exception {
        return Long.valueOf(bxy0.m106921e().m134421a(this.f168753m));
    }

    /* JADX INFO: renamed from: p */
    public final boolean m185939p() {
        return this.f168754n;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m185940q() {
        return this.f168757q;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m185941r() {
        return this.f168756p;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m185942s() {
        return this.f168755o;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m185943t() {
        if (!this.f168749i) {
            return false;
        }
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168388m4)).booleanValue() || this.f168756p) {
            return ((Boolean) jas0.m144075c().m176505a(sgs0.f168401n4)).booleanValue() && !this.f168757q;
        }
        return true;
    }

    @Override // p153l.fex0
    public final Uri zzc() {
        return this.f168752l;
    }

    @Override // p153l.fex0
    public final void zzd() throws IOException {
        if (!this.f168751k) {
            zpg0.m220844a("Attempt to close an already closed GcacheDataSource.");
            return;
        }
        this.f168751k = false;
        this.f168752l = null;
        boolean z = (this.f168749i && this.f168750j == null) ? false : true;
        InputStream inputStream = this.f168750j;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.f168750j = null;
        } else {
            this.f168746f.zzd();
        }
        if (z) {
            m157521j();
        }
    }
}
