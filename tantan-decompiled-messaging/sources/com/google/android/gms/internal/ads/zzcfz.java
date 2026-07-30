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
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.internal.Preconditions;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.HashMap;
import p149l.a5t0;
import p149l.d1s0;
import p149l.e8s0;
import p149l.i3t0;
import p149l.m7s0;
import p149l.t4t0;
import p149l.u4t0;
import p149l.u5t0;
import p149l.v5t0;
import p149l.vny0;
import p149l.w5t0;
import p149l.x2t0;
import p149l.x5t0;
import p149l.x6s0;
import p149l.xsu0;
import p149l.y4t0;
import p149l.z4t0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzcfz extends FrameLayout implements t4t0 {

    /* JADX INFO: renamed from: a */
    public final v5t0 f10136a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f10137b;

    /* JADX INFO: renamed from: c */
    public final View f10138c;

    /* JADX INFO: renamed from: d */
    public final e8s0 f10139d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public final x5t0 f10140e;

    /* JADX INFO: renamed from: f */
    public final long f10141f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final zzcfr f10142g;

    /* JADX INFO: renamed from: h */
    public boolean f10143h;

    /* JADX INFO: renamed from: i */
    public boolean f10144i;

    /* JADX INFO: renamed from: j */
    public boolean f10145j;

    /* JADX INFO: renamed from: k */
    public boolean f10146k;

    /* JADX INFO: renamed from: l */
    public long f10147l;

    /* JADX INFO: renamed from: m */
    public long f10148m;

    /* JADX INFO: renamed from: n */
    public String f10149n;

    /* JADX INFO: renamed from: o */
    public String[] f10150o;

    /* JADX INFO: renamed from: p */
    public Bitmap f10151p;

    /* JADX INFO: renamed from: q */
    public final ImageView f10152q;

    /* JADX INFO: renamed from: r */
    public boolean f10153r;

    public zzcfz(Context context, v5t0 v5t0Var, int i, boolean z, e8s0 e8s0Var, u5t0 u5t0Var) {
        zzcfr zzcfpVar;
        e8s0 e8s0Var2;
        super(context);
        this.f10136a = v5t0Var;
        this.f10139d = e8s0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10137b = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(v5t0Var.zzj());
        u4t0 u4t0Var = v5t0Var.zzj().f201010a;
        w5t0 w5t0Var = new w5t0(context, v5t0Var.zzn(), v5t0Var.mo13709s0(), e8s0Var, v5t0Var.zzk());
        if (i == 2) {
            zzcfpVar = new zzchd(context, w5t0Var, v5t0Var, z, u4t0.m191771a(v5t0Var), u5t0Var);
            e8s0Var2 = e8s0Var;
        } else {
            e8s0Var2 = e8s0Var;
            zzcfpVar = new zzcfp(context, v5t0Var, z, u4t0.m191771a(v5t0Var), u5t0Var, new w5t0(context, v5t0Var.zzn(), v5t0Var.mo13709s0(), e8s0Var, v5t0Var.zzk()));
        }
        this.f10142g = zzcfpVar;
        View view = new View(context);
        this.f10138c = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcfpVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131904F)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131868C)).booleanValue()) {
            m13611q();
        }
        this.f10152q = new ImageView(context);
        this.f10141f = ((Long) d1s0.m109677c().m144697a(m7s0.f131940I)).longValue();
        boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f131892E)).booleanValue();
        this.f10146k = zBooleanValue;
        if (e8s0Var2 != null) {
            e8s0Var.m115282d("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.f10140e = new x5t0(this);
        zzcfpVar.mo13580u(this);
    }

    /* JADX INFO: renamed from: A */
    public final void m13592A(MotionEvent motionEvent) {
        zzcfr zzcfrVar = this.f10142g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: B */
    public final void m13593B(int i) {
        zzcfr zzcfrVar = this.f10142g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.mo13590z(i);
    }

    /* JADX INFO: renamed from: C */
    public final void m13594C(int i) {
        zzcfr zzcfrVar = this.f10142g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.mo13584A(i);
    }

    @Override // p149l.t4t0
    /* JADX INFO: renamed from: a */
    public final void mo13595a(int i, int i2) {
        if (this.f10146k) {
            x6s0 x6s0Var = m7s0.f131928H;
            int iMax = Math.max(i / ((Integer) d1s0.m109677c().m144697a(x6s0Var)).intValue(), 1);
            int iMax2 = Math.max(i2 / ((Integer) d1s0.m109677c().m144697a(x6s0Var)).intValue(), 1);
            Bitmap bitmap = this.f10151p;
            if (bitmap != null && bitmap.getWidth() == iMax && this.f10151p.getHeight() == iMax2) {
                return;
            }
            this.f10151p = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.f10153r = false;
        }
    }

    @Override // p149l.t4t0
    /* JADX INFO: renamed from: b */
    public final void mo13596b(String str, @Nullable String str2) {
        m13608m("error", "what", str, "extra", str2);
    }

    /* JADX INFO: renamed from: c */
    public final void m13597c(int i) {
        zzcfr zzcfrVar = this.f10142g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.mo13585B(i);
    }

    /* JADX INFO: renamed from: d */
    public final void m13598d(int i) {
        zzcfr zzcfrVar = this.f10142g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.mo13586f(i);
    }

    @Override // p149l.t4t0
    /* JADX INFO: renamed from: d0 */
    public final void mo13599d0(String str, @Nullable String str2) {
        m13608m("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    /* JADX INFO: renamed from: e */
    public final void m13600e(int i) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131904F)).booleanValue()) {
            this.f10137b.setBackgroundColor(i);
            this.f10138c.setBackgroundColor(i);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m13601f(int i) {
        zzcfr zzcfrVar = this.f10142g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.mo13587g(i);
    }

    public final void finalize() throws Throwable {
        try {
            this.f10140e.m207143a();
            final zzcfr zzcfrVar = this.f10142g;
            if (zzcfrVar != null) {
                i3t0.f111376e.execute(new Runnable() { // from class: l.v4t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcfrVar.mo13582w();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m13602g(String str, String[] strArr) {
        this.f10149n = str;
        this.f10150o = strArr;
    }

    /* JADX INFO: renamed from: h */
    public final void m13603h(int i, int i2, int i3, int i4) {
        if (xsu0.m210836m()) {
            xsu0.m210834k("Set video bounds to x:" + i + ";y:" + i2 + ";w:" + i3 + ";h:" + i4);
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.f10137b.setLayoutParams(layoutParams);
        requestLayout();
    }

    /* JADX INFO: renamed from: i */
    public final void m13604i(float f) {
        zzcfr zzcfrVar = this.f10142g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.f10135b.m217374e(f);
        zzcfrVar.zzn();
    }

    /* JADX INFO: renamed from: j */
    public final void m13605j(float f, float f2) {
        zzcfr zzcfrVar = this.f10142g;
        if (zzcfrVar != null) {
            zzcfrVar.mo13583x(f, f2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m13606k() {
        zzcfr zzcfrVar = this.f10142g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.f10135b.m217373d(false);
        zzcfrVar.zzn();
    }

    /* JADX INFO: renamed from: l */
    public final void m13607l() {
        if (this.f10136a.zzi() == null || !this.f10144i || this.f10145j) {
            return;
        }
        this.f10136a.zzi().getWindow().clearFlags(128);
        this.f10144i = false;
    }

    /* JADX INFO: renamed from: m */
    public final void m13608m(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numM13610o = m13610o();
        if (numM13610o != null) {
            map.put("playerId", numM13610o.toString());
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
        this.f10136a.mo13674Z("onVideoEvent", map);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m13609n() {
        return this.f10152q.getParent() != null;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final Integer m13610o() {
        zzcfr zzcfrVar = this.f10142g;
        if (zzcfrVar != null) {
            return zzcfrVar.mo13589y();
        }
        return null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        x5t0 x5t0Var = this.f10140e;
        if (z) {
            x5t0Var.m207144b();
        } else {
            x5t0Var.m207143a();
            this.f10148m = this.f10147l;
        }
        C2075b.f9714l.post(new Runnable() { // from class: l.x4t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f191059a.m13614t(z);
            }
        });
    }

    @Override // android.view.View, p149l.t4t0
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        x5t0 x5t0Var = this.f10140e;
        if (i == 0) {
            x5t0Var.m207144b();
            z = true;
        } else {
            x5t0Var.m207143a();
            this.f10148m = this.f10147l;
            z = false;
        }
        C2075b.f9714l.post(new a5t0(this, z));
    }

    /* JADX INFO: renamed from: q */
    public final void m13611q() {
        zzcfr zzcfrVar = this.f10142g;
        if (zzcfrVar == null) {
            return;
        }
        TextView textView = new TextView(zzcfrVar.getContext());
        Resources resourcesM212276e = vny0.m199079q().m212276e();
        textView.setText(String.valueOf(resourcesM212276e == null ? "AdMob - " : resourcesM212276e.getString(R$string.f9675t)).concat(this.f10142g.mo13576q()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f10137b.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f10137b.bringChildToFront(textView);
    }

    /* JADX INFO: renamed from: r */
    public final void m13612r() {
        this.f10140e.m207143a();
        zzcfr zzcfrVar = this.f10142g;
        if (zzcfrVar != null) {
            zzcfrVar.mo13582w();
        }
        m13607l();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m13613s() {
        m13608m("firstFrameRendered", new String[0]);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m13614t(boolean z) {
        m13608m("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    /* JADX INFO: renamed from: u */
    public final void m13615u(Integer num) {
        if (this.f10142g == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f10149n)) {
            m13608m("no_src", new String[0]);
        } else {
            this.f10142g.mo13588h(this.f10149n, this.f10150o, num);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m13616v() {
        zzcfr zzcfrVar = this.f10142g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.f10135b.m217373d(true);
        zzcfrVar.zzn();
    }

    /* JADX INFO: renamed from: w */
    public final void m13617w() {
        zzcfr zzcfrVar = this.f10142g;
        if (zzcfrVar == null) {
            return;
        }
        long jMo13568i = zzcfrVar.mo13568i();
        if (this.f10147l == jMo13568i || jMo13568i <= 0) {
            return;
        }
        float f = jMo13568i / 1000.0f;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132038Q1)).booleanValue()) {
            m13608m("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.f10142g.mo13575p()), "qoeCachedBytes", String.valueOf(this.f10142g.mo13573n()), "qoeLoadedBytes", String.valueOf(this.f10142g.mo13574o()), "droppedFrames", String.valueOf(this.f10142g.mo13569j()), "reportTime", String.valueOf(vny0.m199064b().currentTimeMillis()));
        } else {
            m13608m("timeupdate", "time", String.valueOf(f));
        }
        this.f10147l = jMo13568i;
    }

    /* JADX INFO: renamed from: x */
    public final void m13618x() {
        zzcfr zzcfrVar = this.f10142g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.mo13577r();
    }

    /* JADX INFO: renamed from: y */
    public final void m13619y() {
        zzcfr zzcfrVar = this.f10142g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.mo13578s();
    }

    /* JADX INFO: renamed from: z */
    public final void m13620z(int i) {
        zzcfr zzcfrVar = this.f10142g;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.mo13579t(i);
    }

    @Override // p149l.t4t0
    public final void zza() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132062S1)).booleanValue()) {
            this.f10140e.m207143a();
        }
        m13608m("ended", new String[0]);
        m13607l();
    }

    @Override // p149l.t4t0
    public final void zzd() {
        m13608m("pause", new String[0]);
        m13607l();
        this.f10143h = false;
    }

    @Override // p149l.t4t0
    public final void zze() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132062S1)).booleanValue()) {
            this.f10140e.m207144b();
        }
        if (this.f10136a.zzi() != null && !this.f10144i) {
            boolean z = (this.f10136a.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.f10145j = z;
            if (!z) {
                this.f10136a.zzi().getWindow().addFlags(128);
                this.f10144i = true;
            }
        }
        this.f10143h = true;
    }

    @Override // p149l.t4t0
    public final void zzf() {
        zzcfr zzcfrVar = this.f10142g;
        if (zzcfrVar != null && this.f10148m == 0) {
            float fMo13570k = zzcfrVar.mo13570k();
            zzcfr zzcfrVar2 = this.f10142g;
            m13608m("canplaythrough", BLiveOperationTitleShowType.duration, String.valueOf(fMo13570k / 1000.0f), "videoWidth", String.valueOf(zzcfrVar2.mo13572m()), "videoHeight", String.valueOf(zzcfrVar2.mo13571l()));
        }
    }

    @Override // p149l.t4t0
    public final void zzg() {
        this.f10138c.setVisibility(4);
        C2075b.f9714l.post(new Runnable() { // from class: l.w4t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f184602a.m13613s();
            }
        });
    }

    @Override // p149l.t4t0
    public final void zzh() {
        this.f10140e.m207144b();
        C2075b.f9714l.post(new y4t0(this));
    }

    @Override // p149l.t4t0
    public final void zzi() {
        if (this.f10153r && this.f10151p != null && !m13609n()) {
            this.f10152q.setImageBitmap(this.f10151p);
            this.f10152q.invalidate();
            this.f10137b.addView(this.f10152q, new FrameLayout.LayoutParams(-1, -1));
            this.f10137b.bringChildToFront(this.f10152q);
        }
        this.f10140e.m207143a();
        this.f10148m = this.f10147l;
        C2075b.f9714l.post(new z4t0(this));
    }

    @Override // p149l.t4t0
    public final void zzk() {
        if (this.f10143h && m13609n()) {
            this.f10137b.removeView(this.f10152q);
        }
        if (this.f10142g == null || this.f10151p == null) {
            return;
        }
        long jElapsedRealtime = vny0.m199064b().elapsedRealtime();
        if (this.f10142g.getBitmap(this.f10151p) != null) {
            this.f10153r = true;
        }
        long jElapsedRealtime2 = vny0.m199064b().elapsedRealtime() - jElapsedRealtime;
        if (xsu0.m210836m()) {
            xsu0.m210834k("Spinner frame grab took " + jElapsedRealtime2 + "ms");
        }
        if (jElapsedRealtime2 > this.f10141f) {
            x2t0.m206869g("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.f10146k = false;
            this.f10151p = null;
            e8s0 e8s0Var = this.f10139d;
            if (e8s0Var != null) {
                e8s0Var.m115282d("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }
}
