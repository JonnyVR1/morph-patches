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
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.internal.ads.zzcei;
import java.util.Collections;
import org.eclipse.jetty.http.MimeTypes;
import p149l.a7u0;
import p149l.b1r0;
import p149l.b6w0;
import p149l.c7r0;
import p149l.d1s0;
import p149l.dat0;
import p149l.dfy0;
import p149l.ess0;
import p149l.fbt0;
import p149l.hbt0;
import p149l.ipv0;
import p149l.kss0;
import p149l.l1r0;
import p149l.l2v0;
import p149l.m2v0;
import p149l.m7s0;
import p149l.mrs0;
import p149l.obw0;
import p149l.ozx0;
import p149l.q9t0;
import p149l.rbt0;
import p149l.rjy0;
import p149l.s050;
import p149l.ses0;
import p149l.u3c0;
import p149l.ues0;
import p149l.uyl;
import p149l.vny0;
import p149l.wxt0;
import p149l.x2t0;
import p149l.z2s0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.overlay.b */
/* JADX INFO: loaded from: classes6.dex */
public class BinderC2073b extends kss0 implements c7r0 {

    /* JADX INFO: renamed from: w */
    @VisibleForTesting
    public static final int f9682w = Color.argb(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final Activity f9683a;

    /* JADX INFO: renamed from: b */
    @Nullable
    @VisibleForTesting
    public AdOverlayInfoParcel f9684b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public q9t0 f9685c;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public C2072a f9686d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public zzs f9687e;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public FrameLayout f9689g;

    /* JADX INFO: renamed from: h */
    @VisibleForTesting
    public WebChromeClient.CustomViewCallback f9690h;

    /* JADX INFO: renamed from: k */
    @VisibleForTesting
    public zzh f9693k;

    /* JADX INFO: renamed from: o */
    public Runnable f9697o;

    /* JADX INFO: renamed from: p */
    public boolean f9698p;

    /* JADX INFO: renamed from: q */
    public boolean f9699q;

    /* JADX INFO: renamed from: u */
    public Toolbar f9703u;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public boolean f9688f = false;

    /* JADX INFO: renamed from: i */
    @VisibleForTesting
    public boolean f9691i = false;

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public boolean f9692j = false;

    /* JADX INFO: renamed from: l */
    @VisibleForTesting
    public boolean f9694l = false;

    /* JADX INFO: renamed from: v */
    @VisibleForTesting
    public int f9704v = 1;

    /* JADX INFO: renamed from: m */
    public final Object f9695m = new Object();

    /* JADX INFO: renamed from: n */
    public final View.OnClickListener f9696n = new ipv0(this);

    /* JADX INFO: renamed from: r */
    public boolean f9700r = false;

    /* JADX INFO: renamed from: s */
    public boolean f9701s = false;

    /* JADX INFO: renamed from: t */
    public boolean f9702t = true;

    public BinderC2073b(Activity activity) {
        this.f9683a = activity;
    }

    /* JADX INFO: renamed from: v8 */
    public static final void m12260v8(@Nullable b6w0 b6w0Var, @Nullable View view) {
        if (b6w0Var == null || view == null) {
            return;
        }
        vny0.m199063a().mo109956e(b6w0Var, view);
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: C */
    public final void mo12261C(uyl uylVar) {
        m12276u8((Configuration) s050.m181847P2(uylVar));
    }

    /* JADX INFO: renamed from: G */
    public final void m12262G() {
        this.f9693k.removeView(this.f9687e);
        m12267d6(true);
    }

    /* JADX INFO: renamed from: M */
    public final void m12263M() {
        synchronized (this.f9695m) {
            try {
                this.f9698p = true;
                Runnable runnable = this.f9697o;
                if (runnable != null) {
                    obw0 obw0Var = C2075b.f9714l;
                    obw0Var.removeCallbacks(runnable);
                    obw0Var.post(this.f9697o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: T6 */
    public final void mo12264T6(int i, int i2, Intent intent) {
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: a */
    public final void mo12265a() {
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: b */
    public final void mo12266b() {
        dfy0 dfy0Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9684b;
        if (adOverlayInfoParcel == null || (dfy0Var = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        dfy0Var.mo102686m4();
    }

    /* JADX INFO: renamed from: d6 */
    public final void m12267d6(boolean z) {
        if (this.f9684b.zzw) {
            return;
        }
        int iIntValue = ((Integer) d1s0.m109677c().m144697a(m7s0.f132005N4)).intValue();
        boolean z2 = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132158a1)).booleanValue() || z;
        rjy0 rjy0Var = new rjy0();
        rjy0Var.f159763d = 50;
        rjy0Var.f159760a = true != z2 ? 0 : iIntValue;
        rjy0Var.f159761b = true != z2 ? iIntValue : 0;
        rjy0Var.f159762c = iIntValue;
        this.f9687e = new zzs(this.f9683a, rjy0Var, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        m12279x8(z, this.f9684b.zzg);
        this.f9693k.addView(this.f9687e, layoutParams);
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: g */
    public final void mo12268g() {
        this.f9699q = true;
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: g1 */
    public final void mo12269g1(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.f9683a;
            l2v0 l2v0VarM152718e = m2v0.m152718e();
            l2v0VarM152718e.mo134009a(activity);
            l2v0VarM152718e.mo134010b(this.f9684b.zzk == 5 ? this : null);
            try {
                this.f9684b.zzv.mo108558O0(strArr, iArr, s050.m181848Y2(l2v0VarM152718e.mo134013e()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: o */
    public final boolean mo12270o() {
        this.f9704v = 1;
        if (this.f9685c == null) {
            return true;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132009N8)).booleanValue() && this.f9685c.canGoBack()) {
            this.f9685c.goBack();
            return false;
        }
        boolean zMo13673Y = this.f9685c.mo13673Y();
        if (!zMo13673Y) {
            this.f9685c.mo13674Z("onbackblocked", Collections.EMPTY_MAP);
        }
        return zMo13673Y;
    }

    /* JADX INFO: renamed from: p8 */
    public final void m12271p8(int i) {
        if (this.f9683a.getApplicationInfo().targetSdkVersion >= ((Integer) d1s0.m109677c().m144697a(m7s0.f132138Y5)).intValue()) {
            if (this.f9683a.getApplicationInfo().targetSdkVersion <= ((Integer) d1s0.m109677c().m144697a(m7s0.f132150Z5)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) d1s0.m109677c().m144697a(m7s0.f132163a6)).intValue()) {
                    if (i2 <= ((Integer) d1s0.m109677c().m144697a(m7s0.f132176b6)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f9683a.setRequestedOrientation(i);
        } catch (Throwable th) {
            vny0.m199079q().m212289v(th, "AdOverlay.setRequestedOrientation");
        }
    }

    /* JADX INFO: renamed from: q8 */
    public final void m12272q8(boolean z) {
        zzh zzhVar = this.f9693k;
        if (z) {
            zzhVar.setBackgroundColor(0);
        } else {
            zzhVar.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    /* JADX INFO: renamed from: r8 */
    public final void m12273r8(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f9683a);
        this.f9689g = frameLayout;
        frameLayout.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f9689g.addView(view, -1, -1);
        this.f9683a.setContentView(this.f9689g);
        this.f9699q = true;
        this.f9690h = customViewCallback;
        this.f9688f = true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX INFO: renamed from: s8 */
    public final void m12274s8(boolean z) throws zzg {
        boolean z2;
        if (!this.f9699q) {
            this.f9683a.requestWindowFeature(1);
        }
        Window window = this.f9683a.getWindow();
        if (window == null) {
            throw new zzg("Invalid activity, no window available.");
        }
        q9t0 q9t0Var = this.f9684b.zzd;
        hbt0 hbt0VarZzN = q9t0Var != null ? q9t0Var.zzN() : null;
        boolean z3 = hbt0VarZzN != null && hbt0VarZzN.zzL();
        this.f9694l = false;
        if (z3) {
            int i = this.f9684b.zzj;
            if (i == 6) {
                z2 = this.f9683a.getResources().getConfiguration().orientation == 1;
                this.f9694l = z2;
            } else if (i == 7) {
                z2 = this.f9683a.getResources().getConfiguration().orientation == 2;
                this.f9694l = z2;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        x2t0.m206864b("Delay onShow to next orientation change: " + z2);
        m12271p8(this.f9684b.zzj);
        window.setFlags(16777216, 16777216);
        x2t0.m206864b("Hardware acceleration on the AdActivity window enabled.");
        boolean z4 = this.f9692j;
        zzh zzhVar = this.f9693k;
        if (z4) {
            zzhVar.setBackgroundColor(f9682w);
        } else {
            zzhVar.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
        this.f9683a.setContentView(this.f9693k);
        this.f9699q = true;
        if (z) {
            try {
                vny0.m199062B();
                Activity activity = this.f9683a;
                q9t0 q9t0Var2 = this.f9684b.zzd;
                rbt0 rbt0VarZzO = q9t0Var2 != null ? q9t0Var2.zzO() : null;
                q9t0 q9t0Var3 = this.f9684b.zzd;
                String strMo13683e = q9t0Var3 != null ? q9t0Var3.mo13683e() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.f9684b;
                zzcei zzceiVar = adOverlayInfoParcel.zzm;
                q9t0 q9t0Var4 = adOverlayInfoParcel.zzd;
                q9t0 q9t0VarM110631a = dat0.m110631a(activity, rbt0VarZzO, strMo13683e, true, z3, null, null, zzceiVar, null, null, q9t0Var4 != null ? q9t0Var4.zzj() : null, z2s0.m216992a(), null, null, null, null);
                this.f9685c = q9t0VarM110631a;
                hbt0 hbt0VarZzN2 = q9t0VarM110631a.zzN();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f9684b;
                ses0 ses0Var = adOverlayInfoParcel2.zzp;
                ues0 ues0Var = adOverlayInfoParcel2.zze;
                l1r0 l1r0Var = adOverlayInfoParcel2.zzi;
                q9t0 q9t0Var5 = adOverlayInfoParcel2.zzd;
                hbt0VarZzN2.zzN(null, ses0Var, null, ues0Var, l1r0Var, true, null, q9t0Var5 != null ? q9t0Var5.zzN().zzd() : null, null, null, null, null, null, null, null, null, null, null, null);
                this.f9685c.zzN().zzB(new fbt0() { // from class: l.wsu0
                    @Override // p149l.fbt0
                    /* JADX INFO: renamed from: a */
                    public final void mo96131a(boolean z5, int i2, String str, String str2) {
                        q9t0 q9t0Var6 = this.f187977a.f9685c;
                        if (q9t0Var6 != null) {
                            q9t0Var6.mo13700n0();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.f9684b;
                String str = adOverlayInfoParcel3.zzl;
                if (str != null) {
                    this.f9685c.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.zzh;
                    if (str2 == null) {
                        throw new zzg("No URL or HTML to display in ad overlay.");
                    }
                    this.f9685c.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, MimeTypes.TEXT_HTML, "UTF-8", null);
                }
                q9t0 q9t0Var6 = this.f9684b.zzd;
                if (q9t0Var6 != null) {
                    q9t0Var6.mo13657H(this);
                }
            } catch (Exception e) {
                x2t0.m206867e("Error obtaining webview.", e);
                throw new zzg("Could not obtain webview for the overlay.", e);
            }
        } else {
            q9t0 q9t0Var7 = this.f9684b.zzd;
            this.f9685c = q9t0Var7;
            q9t0Var7.mo13688g0(this.f9683a);
        }
        if (this.f9684b.zzw) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f9685c.mo13661L(), false);
        }
        this.f9685c.mo13672X(this);
        q9t0 q9t0Var8 = this.f9684b.zzd;
        if (q9t0Var8 != null) {
            m12260v8(q9t0Var8.mo13699n(), this.f9693k);
        }
        if (this.f9684b.zzk != 5) {
            ViewParent parent = this.f9685c.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.f9685c.zzF());
            }
            if (this.f9692j) {
                this.f9685c.mo13714v();
            }
            if (this.f9684b.zzw) {
                Toolbar toolbar = new Toolbar(this.f9683a);
                this.f9703u = toolbar;
                toolbar.setId(View.generateViewId());
                this.f9685c.zzF().setId(View.generateViewId());
                this.f9703u.setBackgroundColor(-12303292);
                this.f9703u.setVisibility(0);
                this.f9703u.setNavigationIcon(vny0.m199079q().m212276e().getDrawable(u3c0.f173593c));
                this.f9703u.setNavigationOnClickListener(this.f9696n);
                this.f9703u.setTitleMarginStart(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10);
                this.f9693k.addView(this.f9703u, layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, this.f9703u.getId());
                layoutParams2.addRule(12);
                this.f9693k.addView(this.f9685c.zzF(), layoutParams2);
            } else {
                this.f9693k.addView(this.f9685c.zzF(), -1, -1);
            }
        }
        if (!z && !this.f9694l) {
            zze();
        }
        if (this.f9684b.zzk != 5) {
            m12267d6(z3);
            if (this.f9685c.mo13692j()) {
                m12279x8(z3, true);
                return;
            }
            return;
        }
        Activity activity2 = this.f9683a;
        l2v0 l2v0VarM152718e = m2v0.m152718e();
        l2v0VarM152718e.mo134009a(activity2);
        l2v0VarM152718e.mo134010b(this);
        l2v0VarM152718e.mo134011c(this.f9684b.zzq);
        l2v0VarM152718e.mo134012d(this.f9684b.zzr);
        try {
            m12278w8(l2v0VarM152718e.mo134013e());
        } catch (RemoteException | zzg e2) {
            throw new zzg(e2.getMessage(), e2);
        }
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: t8 */
    public final void m12275t8(String str) {
        Toolbar toolbar = this.f9703u;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX INFO: renamed from: u8 */
    public final void m12276u8(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzj zzjVar;
        int i;
        zzj zzjVar2;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f9684b;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel2 == null || (zzjVar2 = adOverlayInfoParcel2.zzo) == null || !zzjVar2.zzb) ? false : true;
        boolean zMo201214d = vny0.m199081s().mo201214d(this.f9683a, configuration);
        if (!this.f9692j || z3) {
            if (zMo201214d) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131893E0)).booleanValue()) {
                    z = false;
                }
            }
            adOverlayInfoParcel = this.f9684b;
            if (adOverlayInfoParcel != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzg) {
                z2 = true;
            }
        } else if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131905F0)).booleanValue()) {
            if (zMo201214d) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131893E0)).booleanValue()) {
                    z = false;
                }
            }
            adOverlayInfoParcel = this.f9684b;
            if (adOverlayInfoParcel != null) {
                z2 = true;
            }
        } else {
            z = false;
        }
        Window window = this.f9683a.getWindow();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132210e1)).booleanValue()) {
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

    @Override // p149l.lss0
    /* JADX INFO: renamed from: v0 */
    public final void mo12277v0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f9691i);
    }

    /* JADX INFO: renamed from: w8 */
    public final void m12278w8(m2v0 m2v0Var) throws RemoteException, zzg {
        ess0 ess0Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9684b;
        if (adOverlayInfoParcel == null || (ess0Var = adOverlayInfoParcel.zzv) == null) {
            throw new zzg("noioou");
        }
        ess0Var.mo108559Y(s050.m181848Y2(m2v0Var));
    }

    /* JADX INFO: renamed from: x8 */
    public final void m12279x8(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        zzj zzjVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132133Y0)).booleanValue() && (adOverlayInfoParcel2 = this.f9684b) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh;
        boolean z5 = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132145Z0)).booleanValue() && (adOverlayInfoParcel = this.f9684b) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi;
        if (z && z2 && z4 && !z5) {
            new mrs0(this.f9685c, "useCustomClose").m156080c("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzs zzsVar = this.f9687e;
        if (zzsVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzsVar.m12282b(z3);
        }
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: z5 */
    public void mo12280z5(Bundle bundle) {
        if (!this.f9699q) {
            this.f9683a.requestWindowFeature(1);
        }
        this.f9691i = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelM12259g = AdOverlayInfoParcel.m12259g(this.f9683a.getIntent());
            this.f9684b = adOverlayInfoParcelM12259g;
            if (adOverlayInfoParcelM12259g == null) {
                throw new zzg("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelM12259g.zzw) {
                int i = Build.VERSION.SDK_INT;
                Activity activity = this.f9683a;
                if (i >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.f9684b.zzm.zzc > 7500000) {
                this.f9704v = 4;
            }
            if (this.f9683a.getIntent() != null) {
                this.f9702t = this.f9683a.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f9684b;
            zzj zzjVar = adOverlayInfoParcel.zzo;
            if (zzjVar != null) {
                boolean z = zzjVar.zza;
                this.f9692j = z;
                if (z) {
                    if (adOverlayInfoParcel.zzk != 5 && zzjVar.zzf != -1) {
                        new ozx0(this, null).mo124731b();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.f9692j = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new ozx0(this, null).mo124731b();
                }
            } else {
                this.f9692j = false;
            }
            if (bundle == null) {
                if (this.f9702t) {
                    wxt0 wxt0Var = this.f9684b.zzt;
                    if (wxt0Var != null) {
                        wxt0Var.zze();
                    }
                    dfy0 dfy0Var = this.f9684b.zzc;
                    if (dfy0Var != null) {
                        dfy0Var.mo102681P2();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f9684b;
                if (adOverlayInfoParcel2.zzk != 1) {
                    b1r0 b1r0Var = adOverlayInfoParcel2.zzb;
                    if (b1r0Var != null) {
                        b1r0Var.onAdClicked();
                    }
                    a7u0 a7u0Var = this.f9684b.zzu;
                    if (a7u0Var != null) {
                        a7u0Var.zzs();
                    }
                }
            }
            Activity activity2 = this.f9683a;
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f9684b;
            zzh zzhVar = new zzh(activity2, adOverlayInfoParcel3.zzn, adOverlayInfoParcel3.zzm.zza, adOverlayInfoParcel3.zzs);
            this.f9693k = zzhVar;
            zzhVar.setId(1000);
            vny0.m199081s().mo176737j(this.f9683a);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f9684b;
            int i2 = adOverlayInfoParcel4.zzk;
            if (i2 == 1) {
                m12274s8(false);
                return;
            }
            if (i2 == 2) {
                this.f9686d = new C2072a(adOverlayInfoParcel4.zzd);
                m12274s8(false);
            } else if (i2 == 3) {
                m12274s8(true);
            } else {
                if (i2 != 5) {
                    throw new zzg("Could not determine ad overlay type.");
                }
                m12274s8(false);
            }
        } catch (zzg e) {
            x2t0.m206869g(e.getMessage());
            this.f9704v = 4;
            this.f9683a.finish();
        }
    }

    public final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        dfy0 dfy0Var;
        if (!this.f9683a.isFinishing() || this.f9700r) {
            return;
        }
        this.f9700r = true;
        q9t0 q9t0Var = this.f9685c;
        if (q9t0Var != null) {
            q9t0Var.mo13684e0(this.f9704v - 1);
            synchronized (this.f9695m) {
                try {
                    if (!this.f9698p && this.f9685c.zzaz()) {
                        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131945I4)).booleanValue() && !this.f9701s && (adOverlayInfoParcel = this.f9684b) != null && (dfy0Var = adOverlayInfoParcel.zzc) != null) {
                            dfy0Var.mo102679O();
                        }
                        Runnable runnable = new Runnable() { // from class: l.svt0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f166593a.zzc();
                            }
                        };
                        this.f9697o = runnable;
                        C2075b.f9714l.postDelayed(runnable, ((Long) d1s0.m109677c().m144697a(m7s0.f132121X0)).longValue());
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
        this.f9704v = 3;
        this.f9683a.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9684b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.f9683a.overridePendingTransition(0, 0);
    }

    @VisibleForTesting
    public final void zzc() {
        q9t0 q9t0Var;
        dfy0 dfy0Var;
        if (this.f9701s) {
            return;
        }
        this.f9701s = true;
        q9t0 q9t0Var2 = this.f9685c;
        if (q9t0Var2 != null) {
            this.f9693k.removeView(q9t0Var2.zzF());
            C2072a c2072a = this.f9686d;
            if (c2072a != null) {
                this.f9685c.mo13688g0(c2072a.f9681d);
                this.f9685c.mo13721y0(false);
                ViewGroup viewGroup = this.f9686d.f9680c;
                View viewZzF = this.f9685c.zzF();
                C2072a c2072a2 = this.f9686d;
                viewGroup.addView(viewZzF, c2072a2.f9678a, c2072a2.f9679b);
                this.f9686d = null;
            } else if (this.f9683a.getApplicationContext() != null) {
                this.f9685c.mo13688g0(this.f9683a.getApplicationContext());
            }
            this.f9685c = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9684b;
        if (adOverlayInfoParcel != null && (dfy0Var = adOverlayInfoParcel.zzc) != null) {
            dfy0Var.mo102687m5(this.f9704v);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f9684b;
        if (adOverlayInfoParcel2 == null || (q9t0Var = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        m12260v8(q9t0Var.mo13699n(), this.f9684b.zzd.zzF());
    }

    public final void zzd() {
        this.f9693k.f9706b = true;
    }

    public final void zze() {
        this.f9685c.mo13700n0();
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9684b;
        if (adOverlayInfoParcel != null && this.f9688f) {
            m12271p8(adOverlayInfoParcel.zzj);
        }
        if (this.f9689g != null) {
            this.f9683a.setContentView(this.f9693k);
            this.f9699q = true;
            this.f9689g.removeAllViews();
            this.f9689g = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f9690h;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f9690h = null;
        }
        this.f9688f = false;
    }

    @Override // p149l.lss0
    public final void zzi() {
        this.f9704v = 1;
    }

    @Override // p149l.c7r0
    public final void zzj() {
        this.f9704v = 2;
        this.f9683a.finish();
    }

    @Override // p149l.lss0
    public final void zzm() {
        q9t0 q9t0Var = this.f9685c;
        if (q9t0Var != null) {
            try {
                this.f9693k.removeView(q9t0Var.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.f9694l) {
            this.f9694l = false;
            zze();
        }
    }

    @Override // p149l.lss0
    public final void zzo() {
        dfy0 dfy0Var;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9684b;
        if (adOverlayInfoParcel != null && (dfy0Var = adOverlayInfoParcel.zzc) != null) {
            dfy0Var.mo102678M6();
        }
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f131969K4)).booleanValue() && this.f9685c != null && (!this.f9683a.isFinishing() || this.f9686d == null)) {
            this.f9685c.onPause();
        }
        zzF();
    }

    @Override // p149l.lss0
    public final void zzr() {
        dfy0 dfy0Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f9684b;
        if (adOverlayInfoParcel != null && (dfy0Var = adOverlayInfoParcel.zzc) != null) {
            dfy0Var.mo102683g7();
        }
        m12276u8(this.f9683a.getResources().getConfiguration());
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131969K4)).booleanValue()) {
            return;
        }
        q9t0 q9t0Var = this.f9685c;
        if (q9t0Var == null || q9t0Var.mo13670V()) {
            x2t0.m206869g("The webview does not exist. Ignoring action.");
        } else {
            this.f9685c.onResume();
        }
    }

    @Override // p149l.lss0
    public final void zzt() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131969K4)).booleanValue()) {
            q9t0 q9t0Var = this.f9685c;
            if (q9t0Var == null || q9t0Var.mo13670V()) {
                x2t0.m206869g("The webview does not exist. Ignoring action.");
            } else {
                this.f9685c.onResume();
            }
        }
    }

    @Override // p149l.lss0
    public final void zzu() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131969K4)).booleanValue() && this.f9685c != null && (!this.f9683a.isFinishing() || this.f9686d == null)) {
            this.f9685c.onPause();
        }
        zzF();
    }
}
