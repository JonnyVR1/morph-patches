package p153l;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.C2177h1;
import com.google.android.gms.internal.ads.zzce;
import com.google.android.gms.internal.ads.zzfwz;
import com.immomo.momomediaext.sei.BaseSei;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class fit0 extends set0 implements btx0, dgy0 {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f99245w = 0;

    /* JADX INFO: renamed from: c */
    public final Context f99246c;

    /* JADX INFO: renamed from: d */
    public final qht0 f99247d;

    /* JADX INFO: renamed from: e */
    public final l5z0 f99248e;

    /* JADX INFO: renamed from: f */
    public final aft0 f99249f;

    /* JADX INFO: renamed from: g */
    public final WeakReference f99250g;

    /* JADX INFO: renamed from: h */
    public final e1z0 f99251h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public m0y0 f99252i;

    /* JADX INFO: renamed from: j */
    public ByteBuffer f99253j;

    /* JADX INFO: renamed from: k */
    public boolean f99254k;

    /* JADX INFO: renamed from: l */
    public ret0 f99255l;

    /* JADX INFO: renamed from: m */
    public int f99256m;

    /* JADX INFO: renamed from: n */
    public int f99257n;

    /* JADX INFO: renamed from: o */
    public long f99258o;

    /* JADX INFO: renamed from: p */
    public final String f99259p;

    /* JADX INFO: renamed from: q */
    public final int f99260q;

    /* JADX INFO: renamed from: s */
    @Nullable
    public Integer f99262s;

    /* JADX INFO: renamed from: t */
    public final ArrayList f99263t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public volatile sht0 f99264u;

    /* JADX INFO: renamed from: r */
    public final Object f99261r = new Object();

    /* JADX INFO: renamed from: v */
    public final Set f99265v = new HashSet();

    /* JADX WARN: Code duplicated, block: B:22:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e8  */
    public fit0(Context context, aft0 aft0Var, bft0 bft0Var, @Nullable Integer num) {
        final boolean z;
        final kdx0 kdx0Var;
        this.f99246c = context;
        this.f99249f = aft0Var;
        this.f99262s = num;
        this.f99250g = new WeakReference(bft0Var);
        qht0 qht0Var = new qht0();
        this.f99247d = qht0Var;
        l5z0 l5z0Var = new l5z0(context);
        this.f99248e = l5z0Var;
        if (d2v0.m113739m()) {
            d2v0.m113737k("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        set0.m185574u().incrementAndGet();
        jfy0 jfy0Var = new jfy0(context, new cit0(this));
        jfy0Var.m144740b(l5z0Var);
        jfy0Var.m144739a(qht0Var);
        mfy0 mfy0VarM144741c = jfy0Var.m144741c();
        this.f99252i = mfy0VarM144741c;
        mfy0VarM144741c.mo156547h(this);
        this.f99256m = 0;
        this.f99258o = 0L;
        this.f99257n = 0;
        this.f99263t = new ArrayList();
        this.f99264u = null;
        this.f99259p = (String) zzfwz.zzd(bft0Var != null ? bft0Var.zzr() : null).zzb("");
        this.f99260q = bft0Var != null ? bft0Var.zzf() : 0;
        final String strM12389E = bxy0.m106934r().m12389E(context, bft0Var.zzn().zza);
        if (!this.f99254k || this.f99253j.limit() <= 0) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168205Y1)).booleanValue()) {
                if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168109Q1)).booleanValue()) {
                    z = aft0Var.f71061j ? false : true;
                }
            } else if (aft0Var.f71061j) {
            }
            final kdx0 kdx0Var2 = aft0Var.f71064m ? new kdx0() { // from class: l.wht0
                @Override // p153l.kdx0
                public final fex0 zza() {
                    return this.f189310a.m125746W(strM12389E, z);
                }
            } : aft0Var.f71060i > 0 ? new kdx0() { // from class: l.xht0
                @Override // p153l.kdx0
                public final fex0 zza() {
                    return this.f194400a.m125747X(strM12389E, z);
                }
            } : new kdx0() { // from class: l.yht0
                @Override // p153l.kdx0
                public final fex0 zza() {
                    return this.f199986a.m125748Y(strM12389E, z);
                }
            };
            kdx0Var = aft0Var.f71061j ? new kdx0() { // from class: l.zht0
                @Override // p153l.kdx0
                public final fex0 zza() {
                    return this.f204459a.m125749Z(kdx0Var2);
                }
            } : kdx0Var2;
            ByteBuffer byteBuffer = this.f99253j;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.f99253j.limit()];
                this.f99253j.get(bArr);
                kdx0Var = new kdx0() { // from class: l.ait0
                    @Override // p153l.kdx0
                    public final fex0 zza() {
                        int i = fit0.f99245w;
                        fex0 fex0VarZza = kdx0Var.zza();
                        byte[] bArr2 = bArr;
                        return new tht0(new q9x0(bArr2), bArr2.length, fex0VarZza);
                    }
                };
            }
        } else {
            final byte[] bArr2 = new byte[this.f99253j.limit()];
            this.f99253j.get(bArr2);
            kdx0Var = new kdx0() { // from class: l.uht0
                @Override // p153l.kdx0
                public final fex0 zza() {
                    return new q9x0(bArr2);
                }
            };
        }
        this.f99251h = new e1z0(kdx0Var, new d1z0(((Boolean) jas0.m144075c().m176505a(sgs0.f168409o)).booleanValue() ? new ifr0() { // from class: l.eit0
            @Override // p153l.ifr0
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ per0[] mo99028a(Uri uri, Map map) {
                int i = hfr0.f109341a;
                int i2 = fit0.f99245w;
                return new per0[]{new cnr0(), new zkr0(0), new xmr0()};
            }
        } : new ifr0() { // from class: l.vht0
            @Override // p153l.ifr0
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ per0[] mo99028a(Uri uri, Map map) {
                int i = hfr0.f109341a;
                int i2 = fit0.f99245w;
                return new per0[]{new cnr0(), new zkr0(0)};
            }
        }));
    }

    /* JADX INFO: renamed from: d0 */
    private final boolean m125725d0() {
        return this.f99264u != null && this.f99264u.m185942s();
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: A */
    public final void mo125726A(int i) {
        this.f99247d.m176617e(i);
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: B */
    public final void mo125727B(int i) {
        this.f99247d.m176618f(i);
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: C */
    public final void mo125728C(ret0 ret0Var) {
        this.f99255l = ret0Var;
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: D */
    public final void mo125729D(int i) {
        this.f99247d.m176619g(i);
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: E */
    public final void mo125730E(int i) {
        this.f99247d.m176620h(i);
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: F */
    public final void mo125731F(boolean z) {
        this.f99252i.mo158178d(z);
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: G */
    public final void mo125732G(@Nullable Integer num) {
        this.f99262s = num;
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: H */
    public final void mo125733H(boolean z) {
        if (this.f99252i == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.f99252i.mo156549r();
            if (i >= 2) {
                return;
            }
            l5z0 l5z0Var = this.f99248e;
            f4z0 f4z0VarM133601c = l5z0Var.m153042m().m133601c();
            f4z0VarM133601c.m124104p(i, !z);
            l5z0Var.m153043r(f4z0VarM133601c);
            i++;
        }
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: I */
    public final void mo125734I(int i) {
        Iterator it = this.f99265v.iterator();
        while (it.hasNext()) {
            pht0 pht0Var = (pht0) ((WeakReference) it.next()).get();
            if (pht0Var != null) {
                pht0Var.m172335o(i);
            }
        }
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: J */
    public final void mo125735J(Surface surface, boolean z) {
        m0y0 m0y0Var = this.f99252i;
        if (m0y0Var != null) {
            m0y0Var.mo158177c(surface);
        }
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: K */
    public final void mo125736K(float f, boolean z) {
        m0y0 m0y0Var = this.f99252i;
        if (m0y0Var != null) {
            m0y0Var.mo158179f(f);
        }
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: L */
    public final void mo125737L() {
        this.f99252i.zzu();
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: M */
    public final boolean mo125738M() {
        return this.f99252i != null;
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: N */
    public final int mo125739N() {
        return this.f99257n;
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: P */
    public final int mo125740P() {
        return this.f99252i.zzf();
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: R */
    public final long mo125741R() {
        return this.f99252i.zzi();
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: S */
    public final long mo125742S() {
        return this.f99256m;
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: T */
    public final long mo125743T() {
        if (m125725d0() && this.f99264u.m185941r()) {
            return Math.min(this.f99256m, this.f99264u.m185936m());
        }
        return 0L;
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: U */
    public final long mo125744U() {
        return this.f99252i.zzk();
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: V */
    public final long mo125745V() {
        return this.f99252i.zzl();
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ fex0 m125746W(String str, boolean z) {
        fit0 fit0Var = true != z ? null : this;
        aft0 aft0Var = this.f99249f;
        return new C2177h1(str, fit0Var, aft0Var.f71055d, aft0Var.f71057f, aft0Var.f71065n, aft0Var.f71066o);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ fex0 m125747X(String str, boolean z) {
        fit0 fit0Var = true != z ? null : this;
        aft0 aft0Var = this.f99249f;
        pht0 pht0Var = new pht0(str, fit0Var, aft0Var.f71055d, aft0Var.f71057f, aft0Var.f71060i);
        this.f99265v.add(new WeakReference(pht0Var));
        return pht0Var;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ fex0 m125748Y(String str, boolean z) {
        zmx0 zmx0Var = new zmx0();
        zmx0Var.m220530e(str);
        zmx0Var.m220529d(true != z ? null : this);
        zmx0Var.m220527b(this.f99249f.f71055d);
        zmx0Var.m220528c(this.f99249f.f71057f);
        zmx0Var.m220526a(true);
        return zmx0Var.zza();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ fex0 m125749Z(kdx0 kdx0Var) {
        fex0 fex0VarZza = kdx0Var.zza();
        dit0 dit0Var = new dit0(this);
        return new sht0(this.f99246c, fex0VarZza, this.f99259p, this.f99260q, this, dit0Var);
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: a */
    public final void mo115767a(yfy0 yfy0Var, sqr0 sqr0Var, @Nullable zwx0 zwx0Var) {
        bft0 bft0Var = (bft0) this.f99250g.get();
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168109Q1)).booleanValue() || bft0Var == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = sqr0Var.f170250k;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = sqr0Var.f170251l;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = sqr0Var.f170248i;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        bft0Var.mo13728Z("onMetadataEvent", map);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a0 */
    public final mzy0 m125750a0(Uri uri) {
        lxr0 lxr0Var = new lxr0();
        lxr0Var.m156236b(uri);
        trs0 trs0VarM156237c = lxr0Var.m156237c();
        e1z0 e1z0Var = this.f99251h;
        e1z0Var.m119038a(this.f99249f.f71058g);
        return e1z0Var.m119039b(trs0VarM156237c);
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: b */
    public final void mo115768b(yfy0 yfy0Var, Object obj, long j) {
        ret0 ret0Var = this.f99255l;
        if (ret0Var != null) {
            ret0Var.mo13701b();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m125751b0(boolean z, long j) {
        ret0 ret0Var = this.f99255l;
        if (ret0Var != null) {
            ret0Var.mo13704d(z, j);
        }
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: c */
    public final void mo115769c(yfy0 yfy0Var, zzce zzceVar) {
        ret0 ret0Var = this.f99255l;
        if (ret0Var != null) {
            ret0Var.mo13705e("onPlayerError", zzceVar);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ vey0[] m125752c0(Handler handler, vcr0 vcr0Var, hqy0 hqy0Var, s2z0 s2z0Var, sxy0 sxy0Var) {
        dxy0 dxy0Var = dxy0.f91125a;
        zoy0 zoy0Var = zoy0.f205401c;
        wsu0[] wsu0VarArr = new wsu0[0];
        fsy0 fsy0Var = new fsy0();
        if (zoy0Var == null && zoy0Var == null) {
            mnd0.m159157a("Both parameters are null");
            return null;
        }
        Context context = this.f99246c;
        fsy0Var.m127277c(zoy0Var);
        fsy0Var.m127278d(wsu0VarArr);
        jty0 jty0VarM127279e = fsy0Var.m127279e();
        zvy0 zvy0Var = zvy0.f206304a;
        return new vey0[]{new pty0(context, zvy0Var, dxy0Var, false, handler, hqy0Var, jty0VarM127279e), new hbr0(this.f99246c, zvy0Var, dxy0Var, 0L, false, handler, vcr0Var, -1, 30.0f)};
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: e */
    public final void mo115771e(yfy0 yfy0Var, bzy0 bzy0Var, gzy0 gzy0Var, IOException iOException, boolean z) {
        ret0 ret0Var = this.f99255l;
        if (ret0Var != null) {
            if (this.f99249f.f71062k) {
                ret0Var.mo13703c("onLoadException", iOException);
            } else {
                ret0Var.mo13705e("onLoadError", iOException);
            }
        }
    }

    public final void finalize() {
        set0.m185574u().decrementAndGet();
        if (d2v0.m113739m()) {
            d2v0.m113737k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: g */
    public final void mo115773g(yfy0 yfy0Var, sqr0 sqr0Var, @Nullable zwx0 zwx0Var) {
        bft0 bft0Var = (bft0) this.f99250g.get();
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168109Q1)).booleanValue() || bft0Var == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(sqr0Var.f170258s));
        map.put("bitRate", String.valueOf(sqr0Var.f170247h));
        map.put("resolution", sqr0Var.f170256q + BaseSei.f14624X + sqr0Var.f170257r);
        String str = sqr0Var.f170250k;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = sqr0Var.f170251l;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = sqr0Var.f170248i;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        bft0Var.mo13728Z("onMetadataEvent", map);
    }

    @Override // p153l.btx0
    /* JADX INFO: renamed from: i */
    public final void mo106410i(fex0 fex0Var, akx0 akx0Var, boolean z) {
        if (fex0Var instanceof jsx0) {
            synchronized (this.f99261r) {
                this.f99263t.add((jsx0) fex0Var);
            }
        } else if (fex0Var instanceof sht0) {
            this.f99264u = (sht0) fex0Var;
            final bft0 bft0Var = (bft0) this.f99250g.get();
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168109Q1)).booleanValue() && bft0Var != null && this.f99264u.m185939p()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.f99264u.m185941r()));
                map.put("gcacheDownloaded", String.valueOf(this.f99264u.m185940q()));
                C2098b.f9751l.post(new Runnable() { // from class: l.bit0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = fit0.f99245w;
                        bft0Var.mo13728Z("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: j */
    public final void mo115775j(yfy0 yfy0Var, int i, long j) {
        this.f99257n += i;
    }

    @Override // p153l.btx0
    /* JADX INFO: renamed from: n */
    public final void mo106413n(fex0 fex0Var, akx0 akx0Var, boolean z, int i) {
        this.f99256m += i;
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: o */
    public final void mo115777o(yfy0 yfy0Var, int i) {
        ret0 ret0Var = this.f99255l;
        if (ret0Var != null) {
            ret0Var.zzm(i);
        }
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: q */
    public final void mo115779q(yfy0 yfy0Var, aou0 aou0Var) {
        ret0 ret0Var = this.f99255l;
        if (ret0Var != null) {
            ret0Var.mo13699a(aou0Var.f72646a, aou0Var.f72647b);
        }
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: r */
    public final long mo125753r() {
        if (m125725d0()) {
            return 0L;
        }
        return this.f99256m;
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: s */
    public final long mo125754s() {
        if (m125725d0()) {
            return this.f99264u.m185937n();
        }
        synchronized (this.f99261r) {
            while (!this.f99263t.isEmpty()) {
                long j = this.f99258o;
                Map mapZze = ((jsx0) this.f99263t.remove(0)).zze();
                long j2 = 0;
                if (mapZze != null) {
                    for (Map.Entry entry : mapZze.entrySet()) {
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && wnw0.m207230c("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.f99258o = j + j2;
            }
        }
        return this.f99258o;
    }

    @Override // p153l.set0
    @Nullable
    /* JADX INFO: renamed from: t */
    public final Integer mo125755t() {
        return this.f99262s;
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: w */
    public final void mo125756w(Uri[] uriArr, String str) {
        mo125757x(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: x */
    public final void mo125757x(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        mzy0 p0z0Var;
        if (this.f99252i != null) {
            this.f99253j = byteBuffer;
            this.f99254k = z;
            int length = uriArr.length;
            if (length == 1) {
                p0z0Var = m125750a0(uriArr[0]);
            } else {
                mzy0[] mzy0VarArr = new mzy0[length];
                for (int i = 0; i < uriArr.length; i++) {
                    mzy0VarArr[i] = m125750a0(uriArr[i]);
                }
                p0z0Var = new p0z0(false, false, mzy0VarArr);
            }
            this.f99252i.mo156548i(p0z0Var);
            this.f99252i.zzp();
            set0.m185575v().incrementAndGet();
        }
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: y */
    public final void mo125758y() {
        m0y0 m0y0Var = this.f99252i;
        if (m0y0Var != null) {
            m0y0Var.mo156546e(this);
            this.f99252i.mo158175a();
            this.f99252i = null;
            set0.m185575v().decrementAndGet();
        }
    }

    @Override // p153l.set0
    /* JADX INFO: renamed from: z */
    public final void mo125759z(long j) {
        aey0 aey0Var = (aey0) this.f99252i;
        aey0Var.mo97263j(aey0Var.zzd(), j, 5, false);
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo115770d(oot0 oot0Var, bgy0 bgy0Var) {
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo115772f(yfy0 yfy0Var, gzy0 gzy0Var) {
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void mo115778p(yfy0 yfy0Var, vwx0 vwx0Var) {
    }

    @Override // p153l.btx0
    /* JADX INFO: renamed from: k */
    public final void mo106411k(fex0 fex0Var, akx0 akx0Var, boolean z) {
    }

    @Override // p153l.btx0
    /* JADX INFO: renamed from: l */
    public final void mo106412l(fex0 fex0Var, akx0 akx0Var, boolean z) {
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void mo115774h(yfy0 yfy0Var, int i, long j, long j2) {
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo115776m(yfy0 yfy0Var, gnt0 gnt0Var, gnt0 gnt0Var2, int i) {
    }
}
