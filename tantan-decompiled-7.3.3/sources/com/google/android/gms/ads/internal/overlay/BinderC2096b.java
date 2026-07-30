package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.internal.ads.zzcei;
import java.util.Collections;
import org.eclipse.jetty.http.MimeTypes;
import p153l.acc0;
import p153l.aos0;
import p153l.bxy0;
import p153l.c7u0;
import p153l.dct0;
import p153l.fcs0;
import p153l.ggu0;
import p153l.h950;
import p153l.har0;
import p153l.hfw0;
import p153l.igr0;
import p153l.jas0;
import p153l.jjt0;
import p153l.joy0;
import p153l.k1t0;
import p153l.lkt0;
import p153l.nkt0;
import p153l.oyv0;
import p153l.p1m;
import p153l.q1t0;
import p153l.rar0;
import p153l.rbv0;
import p153l.s0t0;
import p153l.sbv0;
import p153l.sgs0;
import p153l.u8y0;
import p153l.ukw0;
import p153l.wit0;
import p153l.xkt0;
import p153l.xsy0;
import p153l.yns0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.overlay.b */
/* JADX INFO: loaded from: classes6.dex */
public class BinderC2096b extends q1t0 implements igr0 {

    /* JADX INFO: renamed from: w */
    @VisibleForTesting
    public static final int f9719w = Color.argb(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final Activity f9720a;

    /* JADX INFO: renamed from: b */
    @Nullable
    @VisibleForTesting
    public AdOverlayInfoParcel f9721b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public wit0 f9722c;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public C2095a f9723d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public zzs f9724e;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public FrameLayout f9726g;

    /* JADX INFO: renamed from: h */
    @VisibleForTesting
    public WebChromeClient.CustomViewCallback f9727h;

    /* JADX INFO: renamed from: k */
    @VisibleForTesting
    public zzh f9730k;

    /* JADX INFO: renamed from: o */
    public Runnable f9734o;

    /* JADX INFO: renamed from: p */
    public boolean f9735p;

    /* JADX INFO: renamed from: q */
    public boolean f9736q;

    /* JADX INFO: renamed from: u */
    public Toolbar f9740u;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public boolean f9725f = false;

    /* JADX INFO: renamed from: i */
    @VisibleForTesting
    public boolean f9728i = false;

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public boolean f9729j = false;

    /* JADX INFO: renamed from: l */
    @VisibleForTesting
    public boolean f9731l = false;

    /* JADX INFO: renamed from: v */
    @VisibleForTesting
    public int f9741v = 1;

    /* JADX INFO: renamed from: m */
    public final Object f9732m = new Object();

    /* JADX INFO: renamed from: n */
    public final View.OnClickListener f9733n = new oyv0(this);

    /* JADX INFO: renamed from: r */
    public boolean f9737r = false;

    /* JADX INFO: renamed from: s */
    public boolean f9738s = false;

    /* JADX INFO: renamed from: t */
    public boolean f9739t = true;

    public BinderC2096b(Activity activity) {
        this.f9720a = activity;
    }

    /* JADX INFO: renamed from: v8 */
    public static final void m12314v8(@Nullable hfw0 hfw0Var, @Nullable View view) {
        if (hfw0Var == null || view == null) {
            return;
        }
        bxy0.m106917a().mo144391e(hfw0Var, view);
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: C */
    public final void mo12315C(p1m p1mVar) {
        m12330u8((Configuration) h950.m134037P2(p1mVar));
    }

    /* JADX INFO: renamed from: G */
    public final void m12316G() {
        this.f9730k.removeView(this.f9724e);
        m12321d6(true);
    }

    /* JADX INFO: renamed from: M */
    public final void m12317M() {
        synchronized (this.f9732m) {
            try {
                this.f9735p = true;
                Runnable runnable = this.f9734o;
                if (runnable != null) {
                    ukw0 ukw0Var = C2098b.f9751l;
                    ukw0Var.removeCallbacks(runnable);
                    ukw0Var.post(this.f9734o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: T6 */
    public final void mo12318T6(int i, int i2, Intent intent) {
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: a */
    public final void mo12319a() {
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: b */
    public final void mo12320b() {
        joy0 joy0Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9721b;
        if (adOverlayInfoParcel == null || (joy0Var = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        joy0Var.mo113768m4();
    }

    /* JADX INFO: renamed from: d6 */
    public final void m12321d6(boolean z) {
        if (this.f9721b.zzw) {
            return;
        }
        int iIntValue = ((Integer) jas0.m144075c().m176505a(sgs0.f168076N4)).intValue();
        boolean z2 = ((Boolean) jas0.m144075c().m176505a(sgs0.f168229a1)).booleanValue() || z;
        xsy0 xsy0Var = new xsy0();
        xsy0Var.f196150d = 50;
        xsy0Var.f196147a = true != z2 ? 0 : iIntValue;
        xsy0Var.f196148b = true != z2 ? iIntValue : 0;
        xsy0Var.f196149c = iIntValue;
        this.f9724e = new zzs(this.f9720a, xsy0Var, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        m12333x8(z, this.f9721b.zzg);
        this.f9730k.addView(this.f9724e, layoutParams);
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: g */
    public final void mo12322g() {
        this.f9736q = true;
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: g1 */
    public final void mo12323g1(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.f9720a;
            rbv0 rbv0VarM185334e = sbv0.m185334e();
            rbv0VarM185334e.mo166853a(activity);
            rbv0VarM185334e.mo166854b(this.f9721b.zzk == 5 ? this : null);
            try {
                this.f9721b.zzv.mo138150O0(strArr, iArr, h950.m134038Y2(rbv0VarM185334e.mo166857e()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: o */
    public final boolean mo12324o() {
        this.f9741v = 1;
        if (this.f9722c == null) {
            return true;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168080N8)).booleanValue() && this.f9722c.canGoBack()) {
            this.f9722c.goBack();
            return false;
        }
        boolean zMo13727Y = this.f9722c.mo13727Y();
        if (!zMo13727Y) {
            this.f9722c.mo13728Z("onbackblocked", Collections.EMPTY_MAP);
        }
        return zMo13727Y;
    }

    /* JADX INFO: renamed from: p8 */
    public final void m12325p8(int i) {
        if (this.f9720a.getApplicationInfo().targetSdkVersion >= ((Integer) jas0.m144075c().m176505a(sgs0.f168209Y5)).intValue()) {
            if (this.f9720a.getApplicationInfo().targetSdkVersion <= ((Integer) jas0.m144075c().m176505a(sgs0.f168221Z5)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) jas0.m144075c().m176505a(sgs0.f168234a6)).intValue()) {
                    if (i2 <= ((Integer) jas0.m144075c().m176505a(sgs0.f168247b6)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f9720a.setRequestedOrientation(i);
        } catch (Throwable th) {
            bxy0.m106933q().m120274v(th, "AdOverlay.setRequestedOrientation");
        }
    }

    /* JADX INFO: renamed from: q8 */
    public final void m12326q8(boolean z) {
        zzh zzhVar = this.f9730k;
        if (z) {
            zzhVar.setBackgroundColor(0);
        } else {
            zzhVar.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    /* JADX INFO: renamed from: r8 */
    public final void m12327r8(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f9720a);
        this.f9726g = frameLayout;
        frameLayout.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f9726g.addView(view, -1, -1);
        this.f9720a.setContentView(this.f9726g);
        this.f9736q = true;
        this.f9727h = customViewCallback;
        this.f9725f = true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX INFO: renamed from: s8 */
    public final void m12328s8(boolean z) throws zzg {
        boolean z2;
        if (!this.f9736q) {
            this.f9720a.requestWindowFeature(1);
        }
        Window window = this.f9720a.getWindow();
        if (window == null) {
            throw new zzg("Invalid activity, no window available.");
        }
        wit0 wit0Var = this.f9721b.zzd;
        nkt0 nkt0VarZzN = wit0Var != null ? wit0Var.zzN() : null;
        boolean z3 = nkt0VarZzN != null && nkt0VarZzN.zzL();
        this.f9731l = false;
        if (z3) {
            int i = this.f9721b.zzj;
            if (i == 6) {
                z2 = this.f9720a.getResources().getConfiguration().orientation == 1;
                this.f9731l = z2;
            } else if (i == 7) {
                z2 = this.f9720a.getResources().getConfiguration().orientation == 2;
                this.f9731l = z2;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        dct0.m115293b("Delay onShow to next orientation change: " + z2);
        m12325p8(this.f9721b.zzj);
        window.setFlags(16777216, 16777216);
        dct0.m115293b("Hardware acceleration on the AdActivity window enabled.");
        boolean z4 = this.f9729j;
        zzh zzhVar = this.f9730k;
        if (z4) {
            zzhVar.setBackgroundColor(f9719w);
        } else {
            zzhVar.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
        this.f9720a.setContentView(this.f9730k);
        this.f9736q = true;
        if (z) {
            try {
                bxy0.m106916B();
                Activity activity = this.f9720a;
                wit0 wit0Var2 = this.f9721b.zzd;
                xkt0 xkt0VarZzO = wit0Var2 != null ? wit0Var2.zzO() : null;
                wit0 wit0Var3 = this.f9721b.zzd;
                String strMo13737e = wit0Var3 != null ? wit0Var3.mo13737e() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.f9721b;
                zzcei zzceiVar = adOverlayInfoParcel.zzm;
                wit0 wit0Var4 = adOverlayInfoParcel.zzd;
                wit0 wit0VarM145141a = jjt0.m145141a(activity, xkt0VarZzO, strMo13737e, true, z3, null, null, zzceiVar, null, null, wit0Var4 != null ? wit0Var4.zzj() : null, fcs0.m125045a(), null, null, null, null);
                this.f9722c = wit0VarM145141a;
                nkt0 nkt0VarZzN2 = wit0VarM145141a.zzN();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f9721b;
                yns0 yns0Var = adOverlayInfoParcel2.zzp;
                aos0 aos0Var = adOverlayInfoParcel2.zze;
                rar0 rar0Var = adOverlayInfoParcel2.zzi;
                wit0 wit0Var5 = adOverlayInfoParcel2.zzd;
                nkt0VarZzN2.zzN(null, yns0Var, null, aos0Var, rar0Var, true, null, wit0Var5 != null ? wit0Var5.zzN().zzd() : null, null, null, null, null, null, null, null, null, null, null, null);
                this.f9722c.zzN().zzB(new lkt0() { // from class: l.c2v0
                    @Override // p153l.lkt0
                    /* JADX INFO: renamed from: a */
                    public final void mo99557a(boolean z5, int i2, String str, String str2) {
                        wit0 wit0Var6 = this.f79526a.f9722c;
                        if (wit0Var6 != null) {
                            wit0Var6.mo13754n0();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.f9721b;
                String str = adOverlayInfoParcel3.zzl;
                if (str != null) {
                    this.f9722c.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.zzh;
                    if (str2 == null) {
                        throw new zzg("No URL or HTML to display in ad overlay.");
                    }
                    this.f9722c.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, MimeTypes.TEXT_HTML, "UTF-8", null);
                }
                wit0 wit0Var6 = this.f9721b.zzd;
                if (wit0Var6 != null) {
                    wit0Var6.mo13711H(this);
                }
            } catch (Exception e) {
                dct0.m115296e("Error obtaining webview.", e);
                throw new zzg("Could not obtain webview for the overlay.", e);
            }
        } else {
            wit0 wit0Var7 = this.f9721b.zzd;
            this.f9722c = wit0Var7;
            wit0Var7.mo13742g0(this.f9720a);
        }
        if (this.f9721b.zzw) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f9722c.mo13715L(), false);
        }
        this.f9722c.mo13726X(this);
        wit0 wit0Var8 = this.f9721b.zzd;
        if (wit0Var8 != null) {
            m12314v8(wit0Var8.mo13753n(), this.f9730k);
        }
        if (this.f9721b.zzk != 5) {
            ViewParent parent = this.f9722c.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.f9722c.zzF());
            }
            if (this.f9729j) {
                this.f9722c.mo13768v();
            }
            if (this.f9721b.zzw) {
                Toolbar toolbar = new Toolbar(this.f9720a);
                this.f9740u = toolbar;
                toolbar.setId(View.generateViewId());
                this.f9722c.zzF().setId(View.generateViewId());
                this.f9740u.setBackgroundColor(-12303292);
                this.f9740u.setVisibility(0);
                this.f9740u.setNavigationIcon(bxy0.m106933q().m120261e().getDrawable(acc0.f69697c));
                this.f9740u.setNavigationOnClickListener(this.f9733n);
                this.f9740u.setTitleMarginStart(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10);
                this.f9730k.addView(this.f9740u, layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, this.f9740u.getId());
                layoutParams2.addRule(12);
                this.f9730k.addView(this.f9722c.zzF(), layoutParams2);
            } else {
                this.f9730k.addView(this.f9722c.zzF(), -1, -1);
            }
        }
        if (!z && !this.f9731l) {
            zze();
        }
        if (this.f9721b.zzk != 5) {
            m12321d6(z3);
            if (this.f9722c.mo13746j()) {
                m12333x8(z3, true);
                return;
            }
            return;
        }
        Activity activity2 = this.f9720a;
        rbv0 rbv0VarM185334e = sbv0.m185334e();
        rbv0VarM185334e.mo166853a(activity2);
        rbv0VarM185334e.mo166854b(this);
        rbv0VarM185334e.mo166855c(this.f9721b.zzq);
        rbv0VarM185334e.mo166856d(this.f9721b.zzr);
        try {
            m12332w8(rbv0VarM185334e.mo166857e());
        } catch (RemoteException | zzg e2) {
            throw new zzg(e2.getMessage(), e2);
        }
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: t8 */
    public final void m12329t8(String str) {
        Toolbar toolbar = this.f9740u;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX INFO: renamed from: u8 */
    public final void m12330u8(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzj zzjVar;
        int i;
        zzj zzjVar2;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f9721b;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel2 == null || (zzjVar2 = adOverlayInfoParcel2.zzo) == null || !zzjVar2.zzb) ? false : true;
        boolean zMo107475d = bxy0.m106935s().mo107475d(this.f9720a, configuration);
        if (!this.f9729j || z3) {
            if (zMo107475d) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f167964E0)).booleanValue()) {
                    z = false;
                }
            }
            adOverlayInfoParcel = this.f9721b;
            if (adOverlayInfoParcel != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzg) {
                z2 = true;
            }
        } else if (((Boolean) jas0.m144075c().m176505a(sgs0.f167976F0)).booleanValue()) {
            if (zMo107475d) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f167964E0)).booleanValue()) {
                    z = false;
                }
            }
            adOverlayInfoParcel = this.f9721b;
            if (adOverlayInfoParcel != null) {
                z2 = true;
            }
        } else {
            z = false;
        }
        Window window = this.f9720a.getWindow();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168281e1)).booleanValue()) {
            View decorView = window.getDecorView();
            if (z) {
                i = z2 ? 5894 : 5380;
            } else {
                i = 256;
            }
            decorView.setSystemUiVisibility(i);
            return;
        }
        if (!z) {
            window.addFlags(2048);
            window.clearFlags(1024);
            return;
        }
        window.addFlags(1024);
        window.clearFlags(2048);
        if (z2) {
            window.getDecorView().setSystemUiVisibility(4098);
        }
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: v0 */
    public final void mo12331v0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f9728i);
    }

    /* JADX INFO: renamed from: w8 */
    public final void m12332w8(sbv0 sbv0Var) throws RemoteException, zzg {
        k1t0 k1t0Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9721b;
        if (adOverlayInfoParcel == null || (k1t0Var = adOverlayInfoParcel.zzv) == null) {
            throw new zzg("noioou");
        }
        k1t0Var.mo138151Y(h950.m134038Y2(sbv0Var));
    }

    /* JADX INFO: renamed from: x8 */
    public final void m12333x8(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        zzj zzjVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) jas0.m144075c().m176505a(sgs0.f168204Y0)).booleanValue() && (adOverlayInfoParcel2 = this.f9721b) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh;
        boolean z5 = ((Boolean) jas0.m144075c().m176505a(sgs0.f168216Z0)).booleanValue() && (adOverlayInfoParcel = this.f9721b) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi;
        if (z && z2 && z4 && !z5) {
            new s0t0(this.f9722c, "useCustomClose").m183979c("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzs zzsVar = this.f9724e;
        if (zzsVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzsVar.m12336b(z3);
        }
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: z5 */
    public void mo12334z5(Bundle bundle) {
        if (!this.f9736q) {
            this.f9720a.requestWindowFeature(1);
        }
        this.f9728i = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelM12313g = AdOverlayInfoParcel.m12313g(this.f9720a.getIntent());
            this.f9721b = adOverlayInfoParcelM12313g;
            if (adOverlayInfoParcelM12313g == null) {
                throw new zzg("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelM12313g.zzw) {
                int i = Build.VERSION.SDK_INT;
                Activity activity = this.f9720a;
                if (i >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.f9721b.zzm.zzc > 7500000) {
                this.f9741v = 4;
            }
            if (this.f9720a.getIntent() != null) {
                this.f9739t = this.f9720a.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f9721b;
            zzj zzjVar = adOverlayInfoParcel.zzo;
            if (zzjVar != null) {
                boolean z = zzjVar.zza;
                this.f9729j = z;
                if (z) {
                    if (adOverlayInfoParcel.zzk != 5 && zzjVar.zzf != -1) {
                        new u8y0(this, null).mo96667b();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.f9729j = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new u8y0(this, null).mo96667b();
                }
            } else {
                this.f9729j = false;
            }
            if (bundle == null) {
                if (this.f9739t) {
                    c7u0 c7u0Var = this.f9721b.zzt;
                    if (c7u0Var != null) {
                        c7u0Var.zze();
                    }
                    joy0 joy0Var = this.f9721b.zzc;
                    if (joy0Var != null) {
                        joy0Var.mo113755P2();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f9721b;
                if (adOverlayInfoParcel2.zzk != 1) {
                    har0 har0Var = adOverlayInfoParcel2.zzb;
                    if (har0Var != null) {
                        har0Var.onAdClicked();
                    }
                    ggu0 ggu0Var = this.f9721b.zzu;
                    if (ggu0Var != null) {
                        ggu0Var.zzs();
                    }
                }
            }
            Activity activity2 = this.f9720a;
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f9721b;
            zzh zzhVar = new zzh(activity2, adOverlayInfoParcel3.zzn, adOverlayInfoParcel3.zzm.zza, adOverlayInfoParcel3.zzs);
            this.f9730k = zzhVar;
            zzhVar.setId(1000);
            bxy0.m106935s().mo109058j(this.f9720a);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f9721b;
            int i2 = adOverlayInfoParcel4.zzk;
            if (i2 == 1) {
                m12328s8(false);
                return;
            }
            if (i2 == 2) {
                this.f9723d = new C2095a(adOverlayInfoParcel4.zzd);
                m12328s8(false);
            } else if (i2 == 3) {
                m12328s8(true);
            } else {
                if (i2 != 5) {
                    throw new zzg("Could not determine ad overlay type.");
                }
                m12328s8(false);
            }
        } catch (zzg e) {
            dct0.m115298g(e.getMessage());
            this.f9741v = 4;
            this.f9720a.finish();
        }
    }

    public final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        joy0 joy0Var;
        if (!this.f9720a.isFinishing() || this.f9737r) {
            return;
        }
        this.f9737r = true;
        wit0 wit0Var = this.f9722c;
        if (wit0Var != null) {
            wit0Var.mo13738e0(this.f9741v - 1);
            synchronized (this.f9732m) {
                try {
                    if (!this.f9735p && this.f9722c.zzaz()) {
                        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168016I4)).booleanValue() && !this.f9738s && (adOverlayInfoParcel = this.f9721b) != null && (joy0Var = adOverlayInfoParcel.zzc) != null) {
                            joy0Var.mo113754O();
                        }
                        Runnable runnable = new Runnable() { // from class: l.y4u0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f197517a.zzc();
                            }
                        };
                        this.f9734o = runnable;
                        C2098b.f9751l.postDelayed(runnable, ((Long) jas0.m144075c().m176505a(sgs0.f168192X0)).longValue());
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zzc();
    }

    public final void zzb() {
        this.f9741v = 3;
        this.f9720a.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9721b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.f9720a.overridePendingTransition(0, 0);
    }

    @VisibleForTesting
    public final void zzc() {
        wit0 wit0Var;
        joy0 joy0Var;
        if (this.f9738s) {
            return;
        }
        this.f9738s = true;
        wit0 wit0Var2 = this.f9722c;
        if (wit0Var2 != null) {
            this.f9730k.removeView(wit0Var2.zzF());
            C2095a c2095a = this.f9723d;
            if (c2095a != null) {
                this.f9722c.mo13742g0(c2095a.f9718d);
                this.f9722c.mo13775y0(false);
                ViewGroup viewGroup = this.f9723d.f9717c;
                View viewZzF = this.f9722c.zzF();
                C2095a c2095a2 = this.f9723d;
                viewGroup.addView(viewZzF, c2095a2.f9715a, c2095a2.f9716b);
                this.f9723d = null;
            } else if (this.f9720a.getApplicationContext() != null) {
                this.f9722c.mo13742g0(this.f9720a.getApplicationContext());
            }
            this.f9722c = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9721b;
        if (adOverlayInfoParcel != null && (joy0Var = adOverlayInfoParcel.zzc) != null) {
            joy0Var.mo113769m5(this.f9741v);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f9721b;
        if (adOverlayInfoParcel2 == null || (wit0Var = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        m12314v8(wit0Var.mo13753n(), this.f9721b.zzd.zzF());
    }

    public final void zzd() {
        this.f9730k.f9743b = true;
    }

    public final void zze() {
        this.f9722c.mo13754n0();
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9721b;
        if (adOverlayInfoParcel != null && this.f9725f) {
            m12325p8(adOverlayInfoParcel.zzj);
        }
        if (this.f9726g != null) {
            this.f9720a.setContentView(this.f9730k);
            this.f9736q = true;
            this.f9726g.removeAllViews();
            this.f9726g = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f9727h;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f9727h = null;
        }
        this.f9725f = false;
    }

    @Override // p153l.r1t0
    public final void zzi() {
        this.f9741v = 1;
    }

    @Override // p153l.igr0
    public final void zzj() {
        this.f9741v = 2;
        this.f9720a.finish();
    }

    @Override // p153l.r1t0
    public final void zzm() {
        wit0 wit0Var = this.f9722c;
        if (wit0Var != null) {
            try {
                this.f9730k.removeView(wit0Var.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.f9731l) {
            this.f9731l = false;
            zze();
        }
    }

    @Override // p153l.r1t0
    public final void zzo() {
        joy0 joy0Var;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9721b;
        if (adOverlayInfoParcel != null && (joy0Var = adOverlayInfoParcel.zzc) != null) {
            joy0Var.mo113753M6();
        }
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168040K4)).booleanValue() && this.f9722c != null && (!this.f9720a.isFinishing() || this.f9723d == null)) {
            this.f9722c.onPause();
        }
        zzF();
    }

    @Override // p153l.r1t0
    public final void zzr() {
        joy0 joy0Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9721b;
        if (adOverlayInfoParcel != null && (joy0Var = adOverlayInfoParcel.zzc) != null) {
            joy0Var.mo113765g7();
        }
        m12330u8(this.f9720a.getResources().getConfiguration());
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168040K4)).booleanValue()) {
            return;
        }
        wit0 wit0Var = this.f9722c;
        if (wit0Var == null || wit0Var.mo13724V()) {
            dct0.m115298g("The webview does not exist. Ignoring action.");
        } else {
            this.f9722c.onResume();
        }
    }

    @Override // p153l.r1t0
    public final void zzt() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168040K4)).booleanValue()) {
            wit0 wit0Var = this.f9722c;
            if (wit0Var == null || wit0Var.mo13724V()) {
                dct0.m115298g("The webview does not exist. Ignoring action.");
            } else {
                this.f9722c.onResume();
            }
        }
    }

    @Override // p153l.r1t0
    public final void zzu() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168040K4)).booleanValue() && this.f9722c != null && (!this.f9720a.isFinishing() || this.f9723d == null)) {
            this.f9722c.onPause();
        }
        zzF();
    }
}
