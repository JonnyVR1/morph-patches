package p149l;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.C2154h1;
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
public final class z8t0 extends m5t0 implements vjx0, x6y0 {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f202211w = 0;

    /* JADX INFO: renamed from: c */
    public final Context f202212c;

    /* JADX INFO: renamed from: d */
    public final k8t0 f202213d;

    /* JADX INFO: renamed from: e */
    public final fwy0 f202214e;

    /* JADX INFO: renamed from: f */
    public final u5t0 f202215f;

    /* JADX INFO: renamed from: g */
    public final WeakReference f202216g;

    /* JADX INFO: renamed from: h */
    public final yry0 f202217h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public grx0 f202218i;

    /* JADX INFO: renamed from: j */
    public ByteBuffer f202219j;

    /* JADX INFO: renamed from: k */
    public boolean f202220k;

    /* JADX INFO: renamed from: l */
    public l5t0 f202221l;

    /* JADX INFO: renamed from: m */
    public int f202222m;

    /* JADX INFO: renamed from: n */
    public int f202223n;

    /* JADX INFO: renamed from: o */
    public long f202224o;

    /* JADX INFO: renamed from: p */
    public final String f202225p;

    /* JADX INFO: renamed from: q */
    public final int f202226q;

    /* JADX INFO: renamed from: s */
    @Nullable
    public Integer f202228s;

    /* JADX INFO: renamed from: t */
    public final ArrayList f202229t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public volatile m8t0 f202230u;

    /* JADX INFO: renamed from: r */
    public final Object f202227r = new Object();

    /* JADX INFO: renamed from: v */
    public final Set f202231v = new HashSet();

    /* JADX WARN: Code duplicated, block: B:22:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e8  */
    public z8t0(Context context, u5t0 u5t0Var, v5t0 v5t0Var, @Nullable Integer num) {
        final boolean z;
        final e4x0 e4x0Var;
        this.f202212c = context;
        this.f202215f = u5t0Var;
        this.f202228s = num;
        this.f202216g = new WeakReference(v5t0Var);
        k8t0 k8t0Var = new k8t0();
        this.f202213d = k8t0Var;
        fwy0 fwy0Var = new fwy0(context);
        this.f202214e = fwy0Var;
        if (xsu0.m210836m()) {
            xsu0.m210834k("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        m5t0.m153151u().incrementAndGet();
        d6y0 d6y0Var = new d6y0(context, new w8t0(this));
        d6y0Var.m110203b(fwy0Var);
        d6y0Var.m110202a(k8t0Var);
        g6y0 g6y0VarM110204c = d6y0Var.m110204c();
        this.f202218i = g6y0VarM110204c;
        g6y0VarM110204c.mo124676h(this);
        this.f202222m = 0;
        this.f202224o = 0L;
        this.f202223n = 0;
        this.f202229t = new ArrayList();
        this.f202230u = null;
        this.f202225p = (String) zzfwz.zzd(v5t0Var != null ? v5t0Var.zzr() : null).zzb("");
        this.f202226q = v5t0Var != null ? v5t0Var.zzf() : 0;
        final String strM12335E = vny0.m199080r().m12335E(context, v5t0Var.zzn().zza);
        if (!this.f202220k || this.f202219j.limit() <= 0) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132134Y1)).booleanValue()) {
                if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132038Q1)).booleanValue()) {
                    z = u5t0Var.f174766j ? false : true;
                }
            } else if (u5t0Var.f174766j) {
            }
            final e4x0 e4x0Var2 = u5t0Var.f174769m ? new e4x0() { // from class: l.q8t0
                @Override // p149l.e4x0
                public final z4x0 zza() {
                    return this.f153334a.m217635W(strM12335E, z);
                }
            } : u5t0Var.f174765i > 0 ? new e4x0() { // from class: l.r8t0
                @Override // p149l.e4x0
                public final z4x0 zza() {
                    return this.f158251a.m217636X(strM12335E, z);
                }
            } : new e4x0() { // from class: l.s8t0
                @Override // p149l.e4x0
                public final z4x0 zza() {
                    return this.f163110a.m217637Y(strM12335E, z);
                }
            };
            e4x0Var = u5t0Var.f174766j ? new e4x0() { // from class: l.t8t0
                @Override // p149l.e4x0
                public final z4x0 zza() {
                    return this.f168961a.m217638Z(e4x0Var2);
                }
            } : e4x0Var2;
            ByteBuffer byteBuffer = this.f202219j;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.f202219j.limit()];
                this.f202219j.get(bArr);
                e4x0Var = new e4x0() { // from class: l.u8t0
                    @Override // p149l.e4x0
                    public final z4x0 zza() {
                        int i = z8t0.f202211w;
                        z4x0 z4x0VarZza = e4x0Var.zza();
                        byte[] bArr2 = bArr;
                        return new n8t0(new k0x0(bArr2), bArr2.length, z4x0VarZza);
                    }
                };
            }
        } else {
            final byte[] bArr2 = new byte[this.f202219j.limit()];
            this.f202219j.get(bArr2);
            e4x0Var = new e4x0() { // from class: l.o8t0
                @Override // p149l.e4x0
                public final z4x0 zza() {
                    return new k0x0(bArr2);
                }
            };
        }
        this.f202217h = new yry0(e4x0Var, new xry0(((Boolean) d1s0.m109677c().m144697a(m7s0.f132338o)).booleanValue() ? new c6r0() { // from class: l.y8t0
            @Override // p149l.c6r0
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ j5r0[] mo95449a(Uri uri, Map map) {
                int i = b6r0.f73876a;
                int i2 = z8t0.f202211w;
                return new j5r0[]{new wdr0(), new tbr0(0), new rdr0()};
            }
        } : new c6r0() { // from class: l.p8t0
            @Override // p149l.c6r0
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ j5r0[] mo95449a(Uri uri, Map map) {
                int i = b6r0.f73876a;
                int i2 = z8t0.f202211w;
                return new j5r0[]{new wdr0(), new tbr0(0)};
            }
        }));
    }

    /* JADX INFO: renamed from: d0 */
    private final boolean m217634d0() {
        return this.f202230u != null && this.f202230u.m153511s();
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: A */
    public final void mo153153A(int i) {
        this.f202213d.m144973e(i);
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: B */
    public final void mo153154B(int i) {
        this.f202213d.m144974f(i);
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: C */
    public final void mo153155C(l5t0 l5t0Var) {
        this.f202221l = l5t0Var;
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: D */
    public final void mo153156D(int i) {
        this.f202213d.m144975g(i);
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: E */
    public final void mo153157E(int i) {
        this.f202213d.m144976h(i);
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: F */
    public final void mo153158F(boolean z) {
        this.f202218i.mo124672d(z);
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: G */
    public final void mo153159G(@Nullable Integer num) {
        this.f202228s = num;
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: H */
    public final void mo153160H(boolean z) {
        if (this.f202218i == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.f202218i.mo124681r();
            if (i >= 2) {
                return;
            }
            fwy0 fwy0Var = this.f202214e;
            zuy0 zuy0VarM104098c = fwy0Var.m123593m().m104098c();
            zuy0VarM104098c.m220284p(i, !z);
            fwy0Var.m123594r(zuy0VarM104098c);
            i++;
        }
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: I */
    public final void mo153161I(int i) {
        Iterator it = this.f202231v.iterator();
        while (it.hasNext()) {
            j8t0 j8t0Var = (j8t0) ((WeakReference) it.next()).get();
            if (j8t0Var != null) {
                j8t0Var.m140345o(i);
            }
        }
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: J */
    public final void mo153162J(Surface surface, boolean z) {
        grx0 grx0Var = this.f202218i;
        if (grx0Var != null) {
            grx0Var.mo124671c(surface);
        }
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: K */
    public final void mo153163K(float f, boolean z) {
        grx0 grx0Var = this.f202218i;
        if (grx0Var != null) {
            grx0Var.mo124674f(f);
        }
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: L */
    public final void mo153164L() {
        this.f202218i.zzu();
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: M */
    public final boolean mo153165M() {
        return this.f202218i != null;
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: N */
    public final int mo153166N() {
        return this.f202223n;
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: P */
    public final int mo153167P() {
        return this.f202218i.zzf();
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: R */
    public final long mo153168R() {
        return this.f202218i.zzi();
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: S */
    public final long mo153169S() {
        return this.f202222m;
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: T */
    public final long mo153170T() {
        if (m217634d0() && this.f202230u.m153510r()) {
            return Math.min(this.f202222m, this.f202230u.m153505m());
        }
        return 0L;
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: U */
    public final long mo153171U() {
        return this.f202218i.zzk();
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: V */
    public final long mo153172V() {
        return this.f202218i.zzl();
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ z4x0 m217635W(String str, boolean z) {
        z8t0 z8t0Var = true != z ? null : this;
        u5t0 u5t0Var = this.f202215f;
        return new C2154h1(str, z8t0Var, u5t0Var.f174760d, u5t0Var.f174762f, u5t0Var.f174770n, u5t0Var.f174771o);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ z4x0 m217636X(String str, boolean z) {
        z8t0 z8t0Var = true != z ? null : this;
        u5t0 u5t0Var = this.f202215f;
        j8t0 j8t0Var = new j8t0(str, z8t0Var, u5t0Var.f174760d, u5t0Var.f174762f, u5t0Var.f174765i);
        this.f202231v.add(new WeakReference(j8t0Var));
        return j8t0Var;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ z4x0 m217637Y(String str, boolean z) {
        tdx0 tdx0Var = new tdx0();
        tdx0Var.m188468e(str);
        tdx0Var.m188467d(true != z ? null : this);
        tdx0Var.m188465b(this.f202215f.f174760d);
        tdx0Var.m188466c(this.f202215f.f174762f);
        tdx0Var.m188464a(true);
        return tdx0Var.zza();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ z4x0 m217638Z(e4x0 e4x0Var) {
        z4x0 z4x0VarZza = e4x0Var.zza();
        x8t0 x8t0Var = new x8t0(this);
        return new m8t0(this.f202212c, z4x0VarZza, this.f202225p, this.f202226q, this, x8t0Var);
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: a */
    public final void mo154344a(s6y0 s6y0Var, mhr0 mhr0Var, @Nullable tnx0 tnx0Var) {
        v5t0 v5t0Var = (v5t0) this.f202216g.get();
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132038Q1)).booleanValue() || v5t0Var == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = mhr0Var.f133891k;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = mhr0Var.f133892l;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = mhr0Var.f133889i;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        v5t0Var.mo13674Z("onMetadataEvent", map);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a0 */
    public final gqy0 m217639a0(Uri uri) {
        for0 for0Var = new for0();
        for0Var.m122517b(uri);
        nis0 nis0VarM122518c = for0Var.m122518c();
        yry0 yry0Var = this.f202217h;
        yry0Var.m215873a(this.f202215f.f174763g);
        return yry0Var.m215874b(nis0VarM122518c);
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: b */
    public final void mo154345b(s6y0 s6y0Var, Object obj, long j) {
        l5t0 l5t0Var = this.f202221l;
        if (l5t0Var != null) {
            l5t0Var.mo13647b();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m217640b0(boolean z, long j) {
        l5t0 l5t0Var = this.f202221l;
        if (l5t0Var != null) {
            l5t0Var.mo13650d(z, j);
        }
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: c */
    public final void mo154346c(s6y0 s6y0Var, zzce zzceVar) {
        l5t0 l5t0Var = this.f202221l;
        if (l5t0Var != null) {
            l5t0Var.mo13651e("onPlayerError", zzceVar);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ p5y0[] m217641c0(Handler handler, p3r0 p3r0Var, bhy0 bhy0Var, mty0 mty0Var, moy0 moy0Var) {
        xny0 xny0Var = xny0.f193766a;
        tfy0 tfy0Var = tfy0.f170032c;
        qju0[] qju0VarArr = new qju0[0];
        ziy0 ziy0Var = new ziy0();
        if (tfy0Var == null && tfy0Var == null) {
            jfd0.m141176a("Both parameters are null");
            return null;
        }
        Context context = this.f202212c;
        ziy0Var.m219079c(tfy0Var);
        ziy0Var.m219080d(qju0VarArr);
        dky0 dky0VarM219081e = ziy0Var.m219081e();
        tmy0 tmy0Var = tmy0.f171199a;
        return new p5y0[]{new jky0(context, tmy0Var, xny0Var, false, handler, bhy0Var, dky0VarM219081e), new b2r0(this.f202212c, tmy0Var, xny0Var, 0L, false, handler, p3r0Var, -1, 30.0f)};
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: e */
    public final void mo154348e(s6y0 s6y0Var, vpy0 vpy0Var, aqy0 aqy0Var, IOException iOException, boolean z) {
        l5t0 l5t0Var = this.f202221l;
        if (l5t0Var != null) {
            if (this.f202215f.f174767k) {
                l5t0Var.mo13649c("onLoadException", iOException);
            } else {
                l5t0Var.mo13651e("onLoadError", iOException);
            }
        }
    }

    public final void finalize() {
        m5t0.m153151u().decrementAndGet();
        if (xsu0.m210836m()) {
            xsu0.m210834k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: g */
    public final void mo154350g(s6y0 s6y0Var, mhr0 mhr0Var, @Nullable tnx0 tnx0Var) {
        v5t0 v5t0Var = (v5t0) this.f202216g.get();
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132038Q1)).booleanValue() || v5t0Var == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(mhr0Var.f133899s));
        map.put("bitRate", String.valueOf(mhr0Var.f133888h));
        map.put("resolution", mhr0Var.f133897q + BaseSei.f13930X + mhr0Var.f133898r);
        String str = mhr0Var.f133891k;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = mhr0Var.f133892l;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = mhr0Var.f133889i;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        v5t0Var.mo13674Z("onMetadataEvent", map);
    }

    @Override // p149l.vjx0
    /* JADX INFO: renamed from: i */
    public final void mo115286i(z4x0 z4x0Var, uax0 uax0Var, boolean z) {
        if (z4x0Var instanceof djx0) {
            synchronized (this.f202227r) {
                this.f202229t.add((djx0) z4x0Var);
            }
        } else if (z4x0Var instanceof m8t0) {
            this.f202230u = (m8t0) z4x0Var;
            final v5t0 v5t0Var = (v5t0) this.f202216g.get();
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132038Q1)).booleanValue() && v5t0Var != null && this.f202230u.m153508p()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.f202230u.m153510r()));
                map.put("gcacheDownloaded", String.valueOf(this.f202230u.m153509q()));
                C2075b.f9714l.post(new Runnable() { // from class: l.v8t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = z8t0.f202211w;
                        v5t0Var.mo13674Z("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: j */
    public final void mo154353j(s6y0 s6y0Var, int i, long j) {
        this.f202223n += i;
    }

    @Override // p149l.vjx0
    /* JADX INFO: renamed from: n */
    public final void mo115289n(z4x0 z4x0Var, uax0 uax0Var, boolean z, int i) {
        this.f202222m += i;
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: o */
    public final void mo154357o(s6y0 s6y0Var, int i) {
        l5t0 l5t0Var = this.f202221l;
        if (l5t0Var != null) {
            l5t0Var.zzm(i);
        }
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: q */
    public final void mo154359q(s6y0 s6y0Var, ueu0 ueu0Var) {
        l5t0 l5t0Var = this.f202221l;
        if (l5t0Var != null) {
            l5t0Var.mo13645a(ueu0Var.f176206a, ueu0Var.f176207b);
        }
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: r */
    public final long mo153173r() {
        if (m217634d0()) {
            return 0L;
        }
        return this.f202222m;
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: s */
    public final long mo153174s() {
        if (m217634d0()) {
            return this.f202230u.m153506n();
        }
        synchronized (this.f202227r) {
            while (!this.f202229t.isEmpty()) {
                long j = this.f202224o;
                Map mapZze = ((djx0) this.f202229t.remove(0)).zze();
                long j2 = 0;
                if (mapZze != null) {
                    for (Map.Entry entry : mapZze.entrySet()) {
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && qew0.m174259c("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.f202224o = j + j2;
            }
        }
        return this.f202224o;
    }

    @Override // p149l.m5t0
    @Nullable
    /* JADX INFO: renamed from: t */
    public final Integer mo153175t() {
        return this.f202228s;
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: w */
    public final void mo153176w(Uri[] uriArr, String str) {
        mo153177x(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: x */
    public final void mo153177x(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        gqy0 jry0Var;
        if (this.f202218i != null) {
            this.f202219j = byteBuffer;
            this.f202220k = z;
            int length = uriArr.length;
            if (length == 1) {
                jry0Var = m217639a0(uriArr[0]);
            } else {
                gqy0[] gqy0VarArr = new gqy0[length];
                for (int i = 0; i < uriArr.length; i++) {
                    gqy0VarArr[i] = m217639a0(uriArr[i]);
                }
                jry0Var = new jry0(false, false, gqy0VarArr);
            }
            this.f202218i.mo124677i(jry0Var);
            this.f202218i.zzp();
            m5t0.m153152v().incrementAndGet();
        }
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: y */
    public final void mo153178y() {
        grx0 grx0Var = this.f202218i;
        if (grx0Var != null) {
            grx0Var.mo124673e(this);
            this.f202218i.mo124669a();
            this.f202218i = null;
            m5t0.m153152v().decrementAndGet();
        }
    }

    @Override // p149l.m5t0
    /* JADX INFO: renamed from: z */
    public final void mo153179z(long j) {
        u4y0 u4y0Var = (u4y0) this.f202218i;
        u4y0Var.mo124678j(u4y0Var.zzd(), j, 5, false);
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo154347d(ift0 ift0Var, v6y0 v6y0Var) {
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo154349f(s6y0 s6y0Var, aqy0 aqy0Var) {
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void mo154358p(s6y0 s6y0Var, pnx0 pnx0Var) {
    }

    @Override // p149l.vjx0
    /* JADX INFO: renamed from: k */
    public final void mo115287k(z4x0 z4x0Var, uax0 uax0Var, boolean z) {
    }

    @Override // p149l.vjx0
    /* JADX INFO: renamed from: l */
    public final void mo115288l(z4x0 z4x0Var, uax0 uax0Var, boolean z) {
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void mo154351h(s6y0 s6y0Var, int i, long j, long j2) {
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo154356m(s6y0 s6y0Var, aet0 aet0Var, aet0 aet0Var2, int i) {
    }
}
