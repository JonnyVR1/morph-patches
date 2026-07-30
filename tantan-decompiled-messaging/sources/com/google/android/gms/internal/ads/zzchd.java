package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2075b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p149l.e8t0;
import p149l.h8t0;
import p149l.i3t0;
import p149l.l5t0;
import p149l.m5t0;
import p149l.o7t0;
import p149l.t4t0;
import p149l.t5t0;
import p149l.u5t0;
import p149l.v5t0;
import p149l.vny0;
import p149l.w5t0;
import p149l.x2t0;
import p149l.xsu0;
import p149l.z8t0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzchd extends zzcfr implements TextureView.SurfaceTextureListener, l5t0 {

    /* JADX INFO: renamed from: c */
    public final v5t0 f10154c;

    /* JADX INFO: renamed from: d */
    public final w5t0 f10155d;

    /* JADX INFO: renamed from: e */
    public final u5t0 f10156e;

    /* JADX INFO: renamed from: f */
    public t4t0 f10157f;

    /* JADX INFO: renamed from: g */
    public Surface f10158g;

    /* JADX INFO: renamed from: h */
    public m5t0 f10159h;

    /* JADX INFO: renamed from: i */
    public String f10160i;

    /* JADX INFO: renamed from: j */
    public String[] f10161j;

    /* JADX INFO: renamed from: k */
    public boolean f10162k;

    /* JADX INFO: renamed from: l */
    public int f10163l;

    /* JADX INFO: renamed from: m */
    public t5t0 f10164m;

    /* JADX INFO: renamed from: n */
    public final boolean f10165n;

    /* JADX INFO: renamed from: o */
    public boolean f10166o;

    /* JADX INFO: renamed from: p */
    public boolean f10167p;

    /* JADX INFO: renamed from: q */
    public int f10168q;

    /* JADX INFO: renamed from: r */
    public int f10169r;

    /* JADX INFO: renamed from: s */
    public float f10170s;

    public zzchd(Context context, w5t0 w5t0Var, v5t0 v5t0Var, boolean z, boolean z2, u5t0 u5t0Var) {
        super(context);
        this.f10163l = 1;
        this.f10154c = v5t0Var;
        this.f10155d = w5t0Var;
        this.f10165n = z;
        this.f10156e = u5t0Var;
        setSurfaceTextureListener(this);
        w5t0Var.m201687a(this);
    }

    /* JADX INFO: renamed from: R */
    public static String m13621R(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    /* JADX INFO: renamed from: S */
    private final void m13622S() {
        m5t0 m5t0Var = this.f10159h;
        if (m5t0Var != null) {
            m5t0Var.mo153160H(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: A */
    public final void mo13584A(int i) {
        m5t0 m5t0Var = this.f10159h;
        if (m5t0Var != null) {
            m5t0Var.mo153154B(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: B */
    public final void mo13585B(int i) {
        m5t0 m5t0Var = this.f10159h;
        if (m5t0Var != null) {
            m5t0Var.mo153156D(i);
        }
    }

    /* JADX INFO: renamed from: C */
    public final m5t0 m13623C(@Nullable Integer num) {
        u5t0 u5t0Var = this.f10156e;
        v5t0 v5t0Var = this.f10154c;
        z8t0 z8t0Var = new z8t0(v5t0Var.getContext(), u5t0Var, v5t0Var, num);
        x2t0.m206868f("ExoPlayerAdapter initialized.");
        return z8t0Var;
    }

    /* JADX INFO: renamed from: D */
    public final String m13624D() {
        v5t0 v5t0Var = this.f10154c;
        return vny0.m199080r().m12335E(v5t0Var.getContext(), v5t0Var.zzn().zza);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m13625E(String str) {
        t4t0 t4t0Var = this.f10157f;
        if (t4t0Var != null) {
            t4t0Var.mo13596b("ExoPlayerAdapter error", str);
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m13626F() {
        t4t0 t4t0Var = this.f10157f;
        if (t4t0Var != null) {
            t4t0Var.zza();
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m13627G() {
        t4t0 t4t0Var = this.f10157f;
        if (t4t0Var != null) {
            t4t0Var.zzf();
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m13628H(boolean z, long j) {
        this.f10154c.mo13660K(z, j);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m13629I(String str) {
        t4t0 t4t0Var = this.f10157f;
        if (t4t0Var != null) {
            t4t0Var.mo13599d0("ExoPlayerAdapter exception", str);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m13630J() {
        t4t0 t4t0Var = this.f10157f;
        if (t4t0Var != null) {
            t4t0Var.zzg();
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m13631K() {
        t4t0 t4t0Var = this.f10157f;
        if (t4t0Var != null) {
            t4t0Var.zzh();
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m13632L() {
        t4t0 t4t0Var = this.f10157f;
        if (t4t0Var != null) {
            t4t0Var.zzi();
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m13633M(int i, int i2) {
        t4t0 t4t0Var = this.f10157f;
        if (t4t0Var != null) {
            t4t0Var.mo13595a(i, i2);
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m13634N() {
        float fM217370a = this.f10135b.m217370a();
        m5t0 m5t0Var = this.f10159h;
        if (m5t0Var == null) {
            x2t0.m206869g("Trying to set volume before player is initialized.");
            return;
        }
        try {
            m5t0Var.mo153163K(fM217370a, false);
        } catch (IOException e) {
            x2t0.m206870h("", e);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m13635O(int i) {
        t4t0 t4t0Var = this.f10157f;
        if (t4t0Var != null) {
            t4t0Var.onWindowVisibilityChanged(i);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m13636P() {
        t4t0 t4t0Var = this.f10157f;
        if (t4t0Var != null) {
            t4t0Var.zzd();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m13637Q() {
        t4t0 t4t0Var = this.f10157f;
        if (t4t0Var != null) {
            t4t0Var.zze();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m13638T() {
        if (this.f10166o) {
            return;
        }
        this.f10166o = true;
        C2075b.f9714l.post(new Runnable() { // from class: l.v6t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f180225a.m13627G();
            }
        });
        zzn();
        this.f10155d.m201688b();
        if (this.f10167p) {
            mo13578s();
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m13639U(boolean z, @Nullable Integer num) {
        m5t0 m5t0Var = this.f10159h;
        if (m5t0Var != null && !z) {
            m5t0Var.mo153159G(num);
            return;
        }
        if (this.f10160i == null || this.f10158g == null) {
            return;
        }
        if (z) {
            if (!m13648b0()) {
                x2t0.m206869g("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                m5t0Var.mo153164L();
                m13641W();
            }
        }
        if (this.f10160i.startsWith("cache:")) {
            o7t0 o7t0VarMo13664P = this.f10154c.mo13664P(this.f10160i);
            if (o7t0VarMo13664P instanceof h8t0) {
                m5t0 m5t0VarM129904x = ((h8t0) o7t0VarMo13664P).m129904x();
                this.f10159h = m5t0VarM129904x;
                m5t0VarM129904x.mo153159G(num);
                if (!this.f10159h.mo153165M()) {
                    x2t0.m206869g("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(o7t0VarMo13664P instanceof e8t0)) {
                    x2t0.m206869g("Stream cache miss: ".concat(String.valueOf(this.f10160i)));
                    return;
                }
                e8t0 e8t0Var = (e8t0) o7t0VarMo13664P;
                String strM13624D = m13624D();
                ByteBuffer byteBufferM115291y = e8t0Var.m115291y();
                boolean zM115292z = e8t0Var.m115292z();
                String strM115290x = e8t0Var.m115290x();
                if (strM115290x == null) {
                    x2t0.m206869g("Stream cache URL is null.");
                    return;
                } else {
                    m5t0 m5t0VarM13623C = m13623C(num);
                    this.f10159h = m5t0VarM13623C;
                    m5t0VarM13623C.mo153177x(new Uri[]{Uri.parse(strM115290x)}, strM13624D, byteBufferM115291y, zM115292z);
                }
            }
        } else {
            this.f10159h = m13623C(num);
            String strM13624D2 = m13624D();
            Uri[] uriArr = new Uri[this.f10161j.length];
            int i = 0;
            while (true) {
                String[] strArr = this.f10161j;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            this.f10159h.mo153176w(uriArr, strM13624D2);
        }
        this.f10159h.mo153155C(this);
        m13642X(this.f10158g, false);
        if (this.f10159h.mo153165M()) {
            int iMo153167P = this.f10159h.mo153167P();
            this.f10163l = iMo153167P;
            if (iMo153167P == 3) {
                m13638T();
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m13640V() {
        m5t0 m5t0Var = this.f10159h;
        if (m5t0Var != null) {
            m5t0Var.mo153160H(false);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m13641W() {
        if (this.f10159h != null) {
            m13642X(null, true);
            m5t0 m5t0Var = this.f10159h;
            if (m5t0Var != null) {
                m5t0Var.mo153155C(null);
                this.f10159h.mo153178y();
                this.f10159h = null;
            }
            this.f10163l = 1;
            this.f10162k = false;
            this.f10166o = false;
            this.f10167p = false;
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m13642X(Surface surface, boolean z) {
        m5t0 m5t0Var = this.f10159h;
        if (m5t0Var == null) {
            x2t0.m206869g("Trying to set surface before player is initialized.");
            return;
        }
        try {
            m5t0Var.mo153162J(surface, z);
        } catch (IOException e) {
            x2t0.m206870h("", e);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m13643Y() {
        m13644Z(this.f10168q, this.f10169r);
    }

    /* JADX INFO: renamed from: Z */
    public final void m13644Z(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.f10170s != f) {
            this.f10170s = f;
            requestLayout();
        }
    }

    @Override // p149l.l5t0
    /* JADX INFO: renamed from: a */
    public final void mo13645a(int i, int i2) {
        this.f10168q = i;
        this.f10169r = i2;
        m13643Y();
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m13646a0() {
        return m13648b0() && this.f10163l != 1;
    }

    @Override // p149l.l5t0
    /* JADX INFO: renamed from: b */
    public final void mo13647b() {
        C2075b.f9714l.post(new Runnable() { // from class: l.a6t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f67801a.m13630J();
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m13648b0() {
        m5t0 m5t0Var = this.f10159h;
        return (m5t0Var == null || !m5t0Var.mo153165M() || this.f10162k) ? false : true;
    }

    @Override // p149l.l5t0
    /* JADX INFO: renamed from: c */
    public final void mo13649c(String str, Exception exc) {
        final String strM13621R = m13621R("onLoadException", exc);
        x2t0.m206869g("ExoPlayerAdapter exception: ".concat(strM13621R));
        vny0.m199079q().m212289v(exc, "AdExoPlayerView.onException");
        C2075b.f9714l.post(new Runnable() { // from class: l.h6t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f106117a.m13629I(strM13621R);
            }
        });
    }

    @Override // p149l.l5t0
    /* JADX INFO: renamed from: d */
    public final void mo13650d(final boolean z, final long j) {
        if (this.f10154c != null) {
            i3t0.f111376e.execute(new Runnable() { // from class: l.g6t0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f101305a.m13628H(z, j);
                }
            });
        }
    }

    @Override // p149l.l5t0
    /* JADX INFO: renamed from: e */
    public final void mo13651e(String str, Exception exc) {
        final String strM13621R = m13621R(str, exc);
        x2t0.m206869g("ExoPlayerAdapter error: ".concat(strM13621R));
        this.f10162k = true;
        if (this.f10156e.f174757a) {
            m13640V();
        }
        C2075b.f9714l.post(new Runnable() { // from class: l.t6t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f168641a.m13625E(strM13621R);
            }
        });
        vny0.m199079q().m212289v(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: f */
    public final void mo13586f(int i) {
        m5t0 m5t0Var = this.f10159h;
        if (m5t0Var != null) {
            m5t0Var.mo153157E(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: g */
    public final void mo13587g(int i) {
        m5t0 m5t0Var = this.f10159h;
        if (m5t0Var != null) {
            m5t0Var.mo153161I(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: h */
    public final void mo13588h(@Nullable String str, @Nullable String[] strArr, @Nullable Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f10161j = new String[]{str};
        } else {
            this.f10161j = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f10160i;
        boolean z = false;
        if (this.f10156e.f174768l && str2 != null && !str.equals(str2) && this.f10163l == 4) {
            z = true;
        }
        this.f10160i = str;
        m13639U(z, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: i */
    public final int mo13568i() {
        if (m13646a0()) {
            return (int) this.f10159h.mo153171U();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: j */
    public final int mo13569j() {
        m5t0 m5t0Var = this.f10159h;
        if (m5t0Var != null) {
            return m5t0Var.mo153166N();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: k */
    public final int mo13570k() {
        if (m13646a0()) {
            return (int) this.f10159h.mo153172V();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: l */
    public final int mo13571l() {
        return this.f10169r;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: m */
    public final int mo13572m() {
        return this.f10168q;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: n */
    public final long mo13573n() {
        m5t0 m5t0Var = this.f10159h;
        if (m5t0Var != null) {
            return m5t0Var.mo153170T();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: o */
    public final long mo13574o() {
        m5t0 m5t0Var = this.f10159h;
        if (m5t0Var != null) {
            return m5t0Var.mo153173r();
        }
        return -1L;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.f10170s;
        if (f != 0.0f && this.f10164m == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        t5t0 t5t0Var = this.f10164m;
        if (t5t0Var != null) {
            t5t0Var.m187345b(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f10165n) {
            t5t0 t5t0Var = new t5t0(getContext());
            this.f10164m = t5t0Var;
            t5t0Var.m187346c(surfaceTexture, i, i2);
            this.f10164m.start();
            SurfaceTexture surfaceTextureM187344a = this.f10164m.m187344a();
            if (surfaceTextureM187344a != null) {
                surfaceTexture = surfaceTextureM187344a;
            } else {
                this.f10164m.m187347d();
                this.f10164m = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f10158g = surface;
        if (this.f10159h == null) {
            m13639U(false, null);
        } else {
            m13642X(surface, true);
            if (!this.f10156e.f174757a) {
                m13622S();
            }
        }
        if (this.f10168q == 0 || this.f10169r == 0) {
            m13644Z(i, i2);
        } else {
            m13643Y();
        }
        C2075b.f9714l.post(new Runnable() { // from class: l.j6t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f116538a.m13631K();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo13577r();
        t5t0 t5t0Var = this.f10164m;
        if (t5t0Var != null) {
            t5t0Var.m187347d();
            this.f10164m = null;
        }
        if (this.f10159h != null) {
            m13640V();
            Surface surface = this.f10158g;
            if (surface != null) {
                surface.release();
            }
            this.f10158g = null;
            m13642X(null, true);
        }
        C2075b.f9714l.post(new Runnable() { // from class: l.f6t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f96167a.m13632L();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        t5t0 t5t0Var = this.f10164m;
        if (t5t0Var != null) {
            t5t0Var.m187345b(i, i2);
        }
        C2075b.f9714l.post(new Runnable() { // from class: l.e6t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f89635a.m13633M(i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f10155d.m201692f(this);
        this.f10134a.m167513a(surfaceTexture, this.f10157f);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        xsu0.m210834k("AdExoPlayerView3 window visibility changed to " + i);
        C2075b.f9714l.post(new Runnable() { // from class: l.d6t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f84663a.m13635O(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: p */
    public final long mo13575p() {
        m5t0 m5t0Var = this.f10159h;
        if (m5t0Var != null) {
            return m5t0Var.mo153174s();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: q */
    public final String mo13576q() {
        return "ExoPlayer/2".concat(true != this.f10165n ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: r */
    public final void mo13577r() {
        if (m13646a0()) {
            if (this.f10156e.f174757a) {
                m13640V();
            }
            this.f10159h.mo153158F(false);
            this.f10155d.m201691e();
            this.f10135b.m217372c();
            C2075b.f9714l.post(new Runnable() { // from class: l.i6t0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f111781a.m13636P();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: s */
    public final void mo13578s() {
        if (!m13646a0()) {
            this.f10167p = true;
            return;
        }
        if (this.f10156e.f174757a) {
            m13622S();
        }
        this.f10159h.mo153158F(true);
        this.f10155d.m201689c();
        this.f10135b.m217371b();
        this.f10134a.m167514b();
        C2075b.f9714l.post(new Runnable() { // from class: l.b6t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73880a.m13637Q();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: t */
    public final void mo13579t(int i) {
        if (m13646a0()) {
            this.f10159h.mo153179z(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: u */
    public final void mo13580u(t4t0 t4t0Var) {
        this.f10157f = t4t0Var;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: v */
    public final void mo13581v(@Nullable String str) {
        if (str != null) {
            mo13588h(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: w */
    public final void mo13582w() {
        if (m13648b0()) {
            this.f10159h.mo153164L();
            m13641W();
        }
        this.f10155d.m201691e();
        this.f10135b.m217372c();
        this.f10155d.m201690d();
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: x */
    public final void mo13583x(float f, float f2) {
        t5t0 t5t0Var = this.f10164m;
        if (t5t0Var != null) {
            t5t0Var.m187348e(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    @Nullable
    /* JADX INFO: renamed from: y */
    public final Integer mo13589y() {
        m5t0 m5t0Var = this.f10159h;
        if (m5t0Var != null) {
            return m5t0Var.mo153175t();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    /* JADX INFO: renamed from: z */
    public final void mo13590z(int i) {
        m5t0 m5t0Var = this.f10159h;
        if (m5t0Var != null) {
            m5t0Var.mo153153A(i);
        }
    }

    @Override // p149l.l5t0
    public final void zzm(int i) {
        if (this.f10163l != i) {
            this.f10163l = i;
            if (i == 3) {
                m13638T();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.f10156e.f174757a) {
                m13640V();
            }
            this.f10155d.m201691e();
            this.f10135b.m217372c();
            C2075b.f9714l.post(new Runnable() { // from class: l.u6t0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f174882a.m13626F();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfr, p149l.y5t0
    public final void zzn() {
        C2075b.f9714l.post(new Runnable() { // from class: l.c6t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79572a.m13634N();
            }
        });
    }
}
