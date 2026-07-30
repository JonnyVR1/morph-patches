package p149l;

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
public final class m8t0 extends gzw0 {

    /* JADX INFO: renamed from: e */
    public final Context f132616e;

    /* JADX INFO: renamed from: f */
    public final z4x0 f132617f;

    /* JADX INFO: renamed from: g */
    public final String f132618g;

    /* JADX INFO: renamed from: h */
    public final int f132619h;

    /* JADX INFO: renamed from: i */
    public final boolean f132620i;

    /* JADX INFO: renamed from: j */
    public InputStream f132621j;

    /* JADX INFO: renamed from: k */
    public boolean f132622k;

    /* JADX INFO: renamed from: l */
    public Uri f132623l;

    /* JADX INFO: renamed from: m */
    public volatile zzbbb f132624m;

    /* JADX INFO: renamed from: n */
    public boolean f132625n;

    /* JADX INFO: renamed from: o */
    public boolean f132626o;

    /* JADX INFO: renamed from: p */
    public boolean f132627p;

    /* JADX INFO: renamed from: q */
    public boolean f132628q;

    /* JADX INFO: renamed from: r */
    public long f132629r;

    /* JADX INFO: renamed from: s */
    public gnr f132630s;

    /* JADX INFO: renamed from: t */
    public final AtomicLong f132631t;

    /* JADX INFO: renamed from: u */
    public final x8t0 f132632u;

    public m8t0(Context context, z4x0 z4x0Var, String str, int i, vjx0 vjx0Var, x8t0 x8t0Var) {
        super(false);
        this.f132616e = context;
        this.f132617f = z4x0Var;
        this.f132632u = x8t0Var;
        this.f132618g = str;
        this.f132619h = i;
        this.f132625n = false;
        this.f132626o = false;
        this.f132627p = false;
        this.f132628q = false;
        this.f132629r = 0L;
        this.f132631t = new AtomicLong(-1L);
        this.f132630s = null;
        this.f132620i = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132038Q1)).booleanValue();
        mo128921f(vjx0Var);
    }

    @Override // p149l.hpy0
    /* JADX INFO: renamed from: a */
    public final int mo12727a(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f132622k) {
            rhg0.m179353a("Attempt to read closed GcacheDataSource.");
            return 0;
        }
        InputStream inputStream = this.f132621j;
        int iMo12727a = inputStream != null ? inputStream.read(bArr, i, i2) : this.f132617f.mo12727a(bArr, i, i2);
        if (this.f132620i && this.f132621j == null) {
            return iMo12727a;
        }
        zzg(iMo12727a);
        return iMo12727a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [l.z8t0] */
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
    @Override // p149l.z4x0
    /* JADX INFO: renamed from: e */
    public final long mo12728e(uax0 uax0Var) throws Throwable {
        zzbay zzbayVarM100027b;
        Long l2;
        Throwable th;
        boolean z;
        boolean z2;
        long jElapsedRealtime;
        StringBuilder sb;
        if (this.f132622k) {
            rhg0.m179353a("Attempt to open an already open GcacheDataSource.");
            return 0L;
        }
        ?? r3 = 1;
        this.f132622k = true;
        this.f132623l = uax0Var.f175648a;
        if (!this.f132620i) {
            m128924l(uax0Var);
        }
        this.f132624m = zzbbb.m13546g(uax0Var.f175648a);
        boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132278j4)).booleanValue();
        zzbbb zzbbbVar = this.f132624m;
        if (!zBooleanValue) {
            if (zzbbbVar != null) {
                this.f132624m.zzh = uax0Var.f175653f;
                this.f132624m.zzi = yfw0.m214595c(this.f132618g);
                this.f132624m.zzj = this.f132619h;
                zzbayVarM100027b = vny0.m199067e().m100027b(this.f132624m);
            } else {
                zzbayVarM100027b = null;
            }
            if (zzbayVarM100027b != null && zzbayVarM100027b.zze()) {
                this.f132625n = zzbayVarM100027b.zzd();
                this.f132627p = zzbayVarM100027b.m13545g0();
                this.f132628q = zzbayVarM100027b.m13544J();
                this.f132629r = zzbayVarM100027b.m13541F();
                this.f132626o = true;
                if (!m153512t()) {
                    this.f132621j = zzbayVarM100027b.m13543I();
                    if (this.f132620i) {
                        m128924l(uax0Var);
                    }
                    return -1L;
                }
            }
        } else if (zzbbbVar != null) {
            this.f132624m.zzh = uax0Var.f175653f;
            this.f132624m.zzi = yfw0.m214595c(this.f132618g);
            this.f132624m.zzj = this.f132619h;
            if (this.f132624m.zzg) {
                l2 = (Long) d1s0.m109677c().m144697a(m7s0.f132304l4);
            } else {
                l2 = (Long) d1s0.m109677c().m144697a(m7s0.f132291k4);
            }
            long jLongValue = l2.longValue();
            long jElapsedRealtime2 = vny0.m199064b().elapsedRealtime();
            vny0.m199068f();
            Context context = this.f132616e;
            ?? r4 = this.f132624m;
            Future futureM201215a = w2s0.m201215a(context, r4);
            try {
                try {
                    x2s0 x2s0Var = (x2s0) futureM201215a.get(jLongValue, TimeUnit.MILLISECONDS);
                    try {
                        this.f132625n = x2s0Var.m206860d();
                        this.f132627p = x2s0Var.m206862f();
                        this.f132628q = x2s0Var.m206861e();
                        this.f132629r = x2s0Var.m206858a();
                        if (!m153512t()) {
                            this.f132621j = x2s0Var.m206859c();
                            if (this.f132620i) {
                                m128924l(uax0Var);
                            }
                            long jElapsedRealtime3 = vny0.m199064b().elapsedRealtime() - jElapsedRealtime2;
                            this.f132632u.f191547a.m217640b0(true, jElapsedRealtime3);
                            this.f132626o = true;
                            xsu0.m210834k("Cache connection took " + jElapsedRealtime3 + "ms");
                            return -1L;
                        }
                        long jElapsedRealtime4 = vny0.m199064b().elapsedRealtime() - jElapsedRealtime2;
                        this.f132632u.f191547a.m217640b0(true, jElapsedRealtime4);
                        this.f132626o = true;
                        sb = new StringBuilder("Cache connection took ");
                        sb.append(jElapsedRealtime4);
                    } catch (InterruptedException unused) {
                        z2 = true;
                        futureM201215a.cancel(true);
                        Thread.currentThread().interrupt();
                        jElapsedRealtime = vny0.m199064b().elapsedRealtime() - jElapsedRealtime2;
                        this.f132632u.f191547a.m217640b0(z2, jElapsedRealtime);
                        this.f132626o = z2;
                        sb = new StringBuilder("Cache connection took ");
                        r4 = z2;
                        sb.append(jElapsedRealtime);
                    } catch (ExecutionException | TimeoutException unused2) {
                        z = true;
                        futureM201215a.cancel(true);
                        jElapsedRealtime = vny0.m199064b().elapsedRealtime() - jElapsedRealtime2;
                        this.f132632u.f191547a.m217640b0(z, jElapsedRealtime);
                        this.f132626o = z;
                        sb = new StringBuilder("Cache connection took ");
                        r4 = z;
                        sb.append(jElapsedRealtime);
                    } catch (Throwable th2) {
                        th = th2;
                        long jElapsedRealtime5 = vny0.m199064b().elapsedRealtime() - jElapsedRealtime2;
                        this.f132632u.f191547a.m217640b0(r3, jElapsedRealtime5);
                        this.f132626o = r3;
                        xsu0.m210834k("Cache connection took " + jElapsedRealtime5 + "ms");
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
            xsu0.m210834k(sb.toString());
        }
        this.f132626o = false;
        if (this.f132624m != null) {
            uax0Var = new uax0(Uri.parse(this.f132624m.zza), null, uax0Var.f175652e, uax0Var.f175653f, uax0Var.f175654g, null, uax0Var.f175656i);
        }
        return this.f132617f.mo12728e(uax0Var);
    }

    /* JADX INFO: renamed from: m */
    public final long m153505m() {
        return this.f132629r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final long m153506n() {
        if (this.f132624m != null) {
            if (this.f132631t.get() != -1) {
                return this.f132631t.get();
            }
            synchronized (this) {
                try {
                    if (this.f132630s == null) {
                        this.f132630s = i3t0.f111372a.mo122102R(new Callable() { // from class: l.l8t0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.f126854a.m153507o();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f132630s.isDone()) {
                try {
                    this.f132631t.compareAndSet(-1L, ((Long) this.f132630s.get()).longValue());
                    return this.f132631t.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Long m153507o() throws Exception {
        return Long.valueOf(vny0.m199067e().m100026a(this.f132624m));
    }

    /* JADX INFO: renamed from: p */
    public final boolean m153508p() {
        return this.f132625n;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m153509q() {
        return this.f132628q;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m153510r() {
        return this.f132627p;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m153511s() {
        return this.f132626o;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m153512t() {
        if (!this.f132620i) {
            return false;
        }
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132317m4)).booleanValue() || this.f132627p) {
            return ((Boolean) d1s0.m109677c().m144697a(m7s0.f132330n4)).booleanValue() && !this.f132628q;
        }
        return true;
    }

    @Override // p149l.z4x0
    public final Uri zzc() {
        return this.f132623l;
    }

    @Override // p149l.z4x0
    public final void zzd() throws IOException {
        if (!this.f132622k) {
            rhg0.m179353a("Attempt to close an already closed GcacheDataSource.");
            return;
        }
        this.f132622k = false;
        this.f132623l = null;
        boolean z = (this.f132620i && this.f132621j == null) ? false : true;
        InputStream inputStream = this.f132621j;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.f132621j = null;
        } else {
            this.f132617f.zzd();
        }
        if (z) {
            m128922j();
        }
    }
}
