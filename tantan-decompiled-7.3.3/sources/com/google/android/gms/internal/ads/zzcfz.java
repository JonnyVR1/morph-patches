package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.impl.R$string;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.internal.Preconditions;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.HashMap;
import p153l.aet0;
import p153l.aft0;
import p153l.bft0;
import p153l.bxy0;
import p153l.cft0;
import p153l.d2v0;
import p153l.dct0;
import p153l.dft0;
import p153l.dgs0;
import p153l.eet0;
import p153l.fet0;
import p153l.get0;
import p153l.jas0;
import p153l.khs0;
import p153l.oct0;
import p153l.sgs0;
import p153l.zdt0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzcfz extends FrameLayout implements zdt0 {

    /* JADX INFO: renamed from: a */
    public final bft0 f10173a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f10174b;

    /* JADX INFO: renamed from: c */
    public final View f10175c;

    /* JADX INFO: renamed from: d */
    public final khs0 f10176d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public final dft0 f10177e;

    /* JADX INFO: renamed from: f */
    public final long f10178f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final zzcfr f10179g;

    /* JADX INFO: renamed from: h */
    public boolean f10180h;

    /* JADX INFO: renamed from: i */
    public boolean f10181i;

    /* JADX INFO: renamed from: j */
    public boolean f10182j;

    /* JADX INFO: renamed from: k */
    public boolean f10183k;

    /* JADX INFO: renamed from: l */
    public long f10184l;

    /* JADX INFO: renamed from: m */
    public long f10185m;

    /* JADX INFO: renamed from: n */
    public String f10186n;

    /* JADX INFO: renamed from: o */
    public String[] f10187o;

    /* JADX INFO: renamed from: p */
    public Bitmap f10188p;

    /* JADX INFO: renamed from: q */
    public final ImageView f10189q;

    /* JADX INFO: renamed from: r */
    public boolean f10190r;

    public zzcfz(Context context, bft0 bft0Var, int i, boolean z, khs0 khs0Var, aft0 aft0Var) {
        zzcfr zzcfpVar;
        khs0 khs0Var2;
        super(context);
        this.f10173a = bft0Var;
        this.f10176d = khs0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10174b = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(bft0Var.zzj());
        aet0 aet0Var = bft0Var.zzj().f98005a;
        cft0 cft0Var = new cft0(context, bft0Var.zzn(), bft0Var.mo13763s0(), khs0Var, bft0Var.zzk());
        if (i == 2) {
            zzcfpVar = new zzchd(context, cft0Var, bft0Var, z, aet0.m97261a(bft0Var), aft0Var);
            khs0Var2 = khs0Var;
        } else {
            khs0Var2 = khs0Var;
            zzcfpVar = new zzcfp(context, bft0Var, z, aet0.m97261a(bft0Var), aft0Var, new cft0(context, bft0Var.zzn(), bft0Var.mo13763s0(), khs0Var, bft0Var.zzk()));
        }
        this.f10179g = zzcfpVar;
        View view = new View(context);
        this.f10175c = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcfpVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167975F)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167939C)).booleanValue()) {
            m13665q();
        }
        this.f10189q = new ImageView(context);
        this.f10178f = ((Long) jas0.m144075c().m176505a(sgs0.f168011I)).longValue();
        boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f167963E)).booleanValue();
        this.f10183k = zBooleanValue;
        if (khs0Var2 != null) {
            khs0Var.m149821d("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.f10177e = new dft0(this);
        zzcfpVar.mo13634u(this);
    }

    /* JADX INFO: renamed from: A */
    public final void m13646A(MotionEvent motionEvent) {
        zzcfr zzcfrVar = this.f10179g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: B */
    public final void m13647B(int i) {
        zzcfr zzcfrVar = this.f10179g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.mo13644z(i);
    }

    /* JADX INFO: renamed from: C */
    public final void m13648C(int i) {
        zzcfr zzcfrVar = this.f10179g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.mo13638A(i);
    }

    @Override // p153l.zdt0
    /* JADX INFO: renamed from: a */
    public final void mo13649a(int i, int i2) {
        if (this.f10183k) {
            dgs0 dgs0Var = sgs0.f167999H;
            int iMax = Math.max(i / ((Integer) jas0.m144075c().m176505a(dgs0Var)).intValue(), 1);
            int iMax2 = Math.max(i2 / ((Integer) jas0.m144075c().m176505a(dgs0Var)).intValue(), 1);
            Bitmap bitmap = this.f10188p;
            if (bitmap != null && bitmap.getWidth() == iMax && this.f10188p.getHeight() == iMax2) {
                return;
            }
            this.f10188p = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.f10190r = false;
        }
    }

    @Override // p153l.zdt0
    /* JADX INFO: renamed from: b */
    public final void mo13650b(String str, @Nullable String str2) {
        m13662m("error", "what", str, "extra", str2);
    }

    /* JADX INFO: renamed from: c */
    public final void m13651c(int i) {
        zzcfr zzcfrVar = this.f10179g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.mo13639B(i);
    }

    /* JADX INFO: renamed from: d */
    public final void m13652d(int i) {
        zzcfr zzcfrVar = this.f10179g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.mo13640f(i);
    }

    @Override // p153l.zdt0
    /* JADX INFO: renamed from: d0 */
    public final void mo13653d0(String str, @Nullable String str2) {
        m13662m("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    /* JADX INFO: renamed from: e */
    public final void m13654e(int i) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167975F)).booleanValue()) {
            this.f10174b.setBackgroundColor(i);
            this.f10175c.setBackgroundColor(i);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m13655f(int i) {
        zzcfr zzcfrVar = this.f10179g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.mo13641g(i);
    }

    public final void finalize() throws Throwable {
        try {
            this.f10177e.m115541a();
            final zzcfr zzcfrVar = this.f10179g;
            if (zzcfrVar != null) {
                oct0.f146737e.execute(new Runnable() { // from class: l.bet0
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcfrVar.mo13636w();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m13656g(String str, String[] strArr) {
        this.f10186n = str;
        this.f10187o = strArr;
    }

    /* JADX INFO: renamed from: h */
    public final void m13657h(int i, int i2, int i3, int i4) {
        if (d2v0.m113739m()) {
            d2v0.m113737k("Set video bounds to x:" + i + ";y:" + i2 + ";w:" + i3 + ";h:" + i4);
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.f10174b.setLayoutParams(layoutParams);
        requestLayout();
    }

    /* JADX INFO: renamed from: i */
    public final void m13658i(float f) {
        zzcfr zzcfrVar = this.f10179g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.f10172b.m125423e(f);
        zzcfrVar.zzn();
    }

    /* JADX INFO: renamed from: j */
    public final void m13659j(float f, float f2) {
        zzcfr zzcfrVar = this.f10179g;
        if (zzcfrVar != null) {
            zzcfrVar.mo13637x(f, f2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m13660k() {
        zzcfr zzcfrVar = this.f10179g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.f10172b.m125422d(false);
        zzcfrVar.zzn();
    }

    /* JADX INFO: renamed from: l */
    public final void m13661l() {
        if (this.f10173a.zzi() == null || !this.f10181i || this.f10182j) {
            return;
        }
        this.f10173a.zzi().getWindow().clearFlags(128);
        this.f10181i = false;
    }

    /* JADX INFO: renamed from: m */
    public final void m13662m(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numM13664o = m13664o();
        if (numM13664o != null) {
            map.put("playerId", numM13664o.toString());
        }
        map.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.f10173a.mo13728Z("onVideoEvent", map);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m13663n() {
        return this.f10189q.getParent() != null;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final Integer m13664o() {
        zzcfr zzcfrVar = this.f10179g;
        if (zzcfrVar != null) {
            return zzcfrVar.mo13643y();
        }
        return null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        dft0 dft0Var = this.f10177e;
        if (z) {
            dft0Var.m115542b();
        } else {
            dft0Var.m115541a();
            this.f10185m = this.f10184l;
        }
        C2098b.f9751l.post(new Runnable() { // from class: l.det0
            @Override // java.lang.Runnable
            public final void run() {
                this.f88084a.m13668t(z);
            }
        });
    }

    @Override // android.view.View, p153l.zdt0
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        dft0 dft0Var = this.f10177e;
        if (i == 0) {
            dft0Var.m115542b();
            z = true;
        } else {
            dft0Var.m115541a();
            this.f10185m = this.f10184l;
            z = false;
        }
        C2098b.f9751l.post(new get0(this, z));
    }

    /* JADX INFO: renamed from: q */
    public final void m13665q() {
        zzcfr zzcfrVar = this.f10179g;
        if (zzcfrVar == null) {
            return;
        }
        TextView textView = new TextView(zzcfrVar.getContext());
        Resources resourcesM120261e = bxy0.m106933q().m120261e();
        textView.setText(String.valueOf(resourcesM120261e == null ? "AdMob - " : resourcesM120261e.getString(R$string.f9712t)).concat(this.f10179g.mo13630q()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f10174b.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f10174b.bringChildToFront(textView);
    }

    /* JADX INFO: renamed from: r */
    public final void m13666r() {
        this.f10177e.m115541a();
        zzcfr zzcfrVar = this.f10179g;
        if (zzcfrVar != null) {
            zzcfrVar.mo13636w();
        }
        m13661l();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m13667s() {
        m13662m("firstFrameRendered", new String[0]);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m13668t(boolean z) {
        m13662m("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    /* JADX INFO: renamed from: u */
    public final void m13669u(Integer num) {
        if (this.f10179g == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f10186n)) {
            m13662m("no_src", new String[0]);
        } else {
            this.f10179g.mo13642h(this.f10186n, this.f10187o, num);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m13670v() {
        zzcfr zzcfrVar = this.f10179g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.f10172b.m125422d(true);
        zzcfrVar.zzn();
    }

    /* JADX INFO: renamed from: w */
    public final void m13671w() {
        zzcfr zzcfrVar = this.f10179g;
        if (zzcfrVar == null) {
            return;
        }
        long jMo13622i = zzcfrVar.mo13622i();
        if (this.f10184l == jMo13622i || jMo13622i <= 0) {
            return;
        }
        float f = jMo13622i / 1000.0f;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168109Q1)).booleanValue()) {
            m13662m("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.f10179g.mo13629p()), "qoeCachedBytes", String.valueOf(this.f10179g.mo13627n()), "qoeLoadedBytes", String.valueOf(this.f10179g.mo13628o()), "droppedFrames", String.valueOf(this.f10179g.mo13623j()), "reportTime", String.valueOf(bxy0.m106918b().currentTimeMillis()));
        } else {
            m13662m("timeupdate", "time", String.valueOf(f));
        }
        this.f10184l = jMo13622i;
    }

    /* JADX INFO: renamed from: x */
    public final void m13672x() {
        zzcfr zzcfrVar = this.f10179g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.mo13631r();
    }

    /* JADX INFO: renamed from: y */
    public final void m13673y() {
        zzcfr zzcfrVar = this.f10179g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.mo13632s();
    }

    /* JADX INFO: renamed from: z */
    public final void m13674z(int i) {
        zzcfr zzcfrVar = this.f10179g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.mo13633t(i);
    }

    @Override // p153l.zdt0
    public final void zza() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168133S1)).booleanValue()) {
            this.f10177e.m115541a();
        }
        m13662m("ended", new String[0]);
        m13661l();
    }

    @Override // p153l.zdt0
    public final void zzd() {
        m13662m("pause", new String[0]);
        m13661l();
        this.f10180h = false;
    }

    @Override // p153l.zdt0
    public final void zze() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168133S1)).booleanValue()) {
            this.f10177e.m115542b();
        }
        if (this.f10173a.zzi() != null && !this.f10181i) {
            boolean z = (this.f10173a.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.f10182j = z;
            if (!z) {
                this.f10173a.zzi().getWindow().addFlags(128);
                this.f10181i = true;
            }
        }
        this.f10180h = true;
    }

    @Override // p153l.zdt0
    public final void zzf() {
        zzcfr zzcfrVar = this.f10179g;
        if (zzcfrVar != null && this.f10185m == 0) {
            float fMo13624k = zzcfrVar.mo13624k();
            zzcfr zzcfrVar2 = this.f10179g;
            m13662m("canplaythrough", BLiveOperationTitleShowType.duration, String.valueOf(fMo13624k / 1000.0f), "videoWidth", String.valueOf(zzcfrVar2.mo13626m()), "videoHeight", String.valueOf(zzcfrVar2.mo13625l()));
        }
    }

    @Override // p153l.zdt0
    public final void zzg() {
        this.f10175c.setVisibility(4);
        C2098b.f9751l.post(new Runnable() { // from class: l.cet0
            @Override // java.lang.Runnable
            public final void run() {
                this.f81415a.m13667s();
            }
        });
    }

    @Override // p153l.zdt0
    public final void zzh() {
        this.f10177e.m115542b();
        C2098b.f9751l.post(new eet0(this));
    }

    @Override // p153l.zdt0
    public final void zzi() {
        if (this.f10190r && this.f10188p != null && !m13663n()) {
            this.f10189q.setImageBitmap(this.f10188p);
            this.f10189q.invalidate();
            this.f10174b.addView(this.f10189q, new FrameLayout.LayoutParams(-1, -1));
            this.f10174b.bringChildToFront(this.f10189q);
        }
        this.f10177e.m115541a();
        this.f10185m = this.f10184l;
        C2098b.f9751l.post(new fet0(this));
    }

    @Override // p153l.zdt0
    public final void zzk() {
        if (this.f10180h && m13663n()) {
            this.f10174b.removeView(this.f10189q);
        }
        if (this.f10179g == null || this.f10188p == null) {
            return;
        }
        long jElapsedRealtime = bxy0.m106918b().elapsedRealtime();
        if (this.f10179g.getBitmap(this.f10188p) != null) {
            this.f10190r = true;
        }
        long jElapsedRealtime2 = bxy0.m106918b().elapsedRealtime() - jElapsedRealtime;
        if (d2v0.m113739m()) {
            d2v0.m113737k("Spinner frame grab took " + jElapsedRealtime2 + "ms");
        }
        if (jElapsedRealtime2 > this.f10178f) {
            dct0.m115298g("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.f10183k = false;
            this.f10188p = null;
            khs0 khs0Var = this.f10176d;
            if (khs0Var != null) {
                khs0Var.m149821d("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }
}
