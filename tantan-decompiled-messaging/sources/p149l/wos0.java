package p149l;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class wos0 implements bzx, ezx, gzx {

    /* JADX INFO: renamed from: a */
    public final dos0 f187465a;

    /* JADX INFO: renamed from: b */
    public koj0 f187466b;

    /* JADX INFO: renamed from: c */
    public wcs0 f187467c;

    public wos0(dos0 dos0Var) {
        this.f187465a = dos0Var;
    }

    @Override // p149l.gzx
    /* JADX INFO: renamed from: a */
    public final void mo128925a(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        x2t0.m206864b("Adapter called onAdOpened.");
        try {
            this.f187465a.zzp();
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.gzx
    /* JADX INFO: renamed from: b */
    public final void mo128926b(MediationNativeAdapter mediationNativeAdapter, wcs0 wcs0Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        x2t0.m206864b("Adapter called onAdLoaded with template id ".concat(String.valueOf(wcs0Var.m202678b())));
        this.f187467c = wcs0Var;
        try {
            this.f187465a.zzo();
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.bzx
    /* JADX INFO: renamed from: c */
    public final void mo104701c(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        x2t0.m206864b("Adapter called onAdClicked.");
        try {
            this.f187465a.zze();
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.bzx
    /* JADX INFO: renamed from: d */
    public final void mo104702d(MediationBannerAdapter mediationBannerAdapter, f70 f70Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        x2t0.m206864b("Adapter called onAdFailedToLoad with error. ErrorCode: " + f70Var.m119703a() + ". ErrorMessage: " + f70Var.m119705c() + ". ErrorDomain: " + f70Var.m119704b());
        try {
            this.f187465a.mo105942N4(f70Var.m119706d());
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.gzx
    /* JADX INFO: renamed from: e */
    public final void mo128927e(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        x2t0.m206864b("Adapter called onAdClosed.");
        try {
            this.f187465a.zzf();
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.bzx
    /* JADX INFO: renamed from: f */
    public final void mo104703f(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        x2t0.m206864b("Adapter called onAdLoaded.");
        try {
            this.f187465a.zzo();
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.bzx
    /* JADX INFO: renamed from: g */
    public final void mo104704g(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        x2t0.m206864b("Adapter called onAdOpened.");
        try {
            this.f187465a.zzp();
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.gzx
    /* JADX INFO: renamed from: h */
    public final void mo128928h(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        koj0 koj0Var = this.f187466b;
        if (this.f187467c == null) {
            if (koj0Var == null) {
                x2t0.m206871i("#007 Could not call remote method.", null);
                return;
            } else if (!koj0Var.m146738m()) {
                x2t0.m206864b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        x2t0.m206864b("Adapter called onAdImpression.");
        try {
            this.f187465a.zzm();
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.bzx
    /* JADX INFO: renamed from: i */
    public final void mo104705i(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        x2t0.m206864b("Adapter called onAdClosed.");
        try {
            this.f187465a.zzf();
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.gzx
    /* JADX INFO: renamed from: j */
    public final void mo128929j(MediationNativeAdapter mediationNativeAdapter, koj0 koj0Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        x2t0.m206864b("Adapter called onAdLoaded.");
        this.f187466b = koj0Var;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            q3l0 q3l0Var = new q3l0();
            q3l0Var.m172884c(new mos0());
            if (koj0Var != null && koj0Var.m146743r()) {
                koj0Var.m146725K(q3l0Var);
            }
        }
        try {
            this.f187465a.zzo();
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.ezx
    /* JADX INFO: renamed from: k */
    public final void mo119022k(MediationInterstitialAdapter mediationInterstitialAdapter, f70 f70Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        x2t0.m206864b("Adapter called onAdFailedToLoad with error. ErrorCode: " + f70Var.m119703a() + ". ErrorMessage: " + f70Var.m119705c() + ". ErrorDomain: " + f70Var.m119704b());
        try {
            this.f187465a.mo105942N4(f70Var.m119706d());
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.gzx
    /* JADX INFO: renamed from: l */
    public final void mo128930l(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        koj0 koj0Var = this.f187466b;
        if (this.f187467c == null) {
            if (koj0Var == null) {
                x2t0.m206871i("#007 Could not call remote method.", null);
                return;
            } else if (!koj0Var.m146737l()) {
                x2t0.m206864b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        x2t0.m206864b("Adapter called onAdClicked.");
        try {
            this.f187465a.zze();
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.ezx
    /* JADX INFO: renamed from: m */
    public final void mo119023m(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        x2t0.m206864b("Adapter called onAdLoaded.");
        try {
            this.f187465a.zzo();
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.gzx
    /* JADX INFO: renamed from: n */
    public final void mo128931n(MediationNativeAdapter mediationNativeAdapter, wcs0 wcs0Var, String str) {
        try {
            this.f187465a.mo105945h3(wcs0Var.m202677a(), str);
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.ezx
    /* JADX INFO: renamed from: o */
    public final void mo119024o(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        x2t0.m206864b("Adapter called onAdOpened.");
        try {
            this.f187465a.zzp();
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.ezx
    /* JADX INFO: renamed from: p */
    public final void mo119025p(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        x2t0.m206864b("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.f187465a.zzg(i);
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.gzx
    /* JADX INFO: renamed from: q */
    public final void mo128932q(MediationNativeAdapter mediationNativeAdapter, f70 f70Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        x2t0.m206864b("Adapter called onAdFailedToLoad with error. ErrorCode: " + f70Var.m119703a() + ". ErrorMessage: " + f70Var.m119705c() + ". ErrorDomain: " + f70Var.m119704b());
        try {
            this.f187465a.mo105942N4(f70Var.m119706d());
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.bzx
    /* JADX INFO: renamed from: r */
    public final void mo104706r(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        x2t0.m206864b("Adapter called onAppEvent.");
        try {
            this.f187465a.mo105940L7(str, str2);
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.ezx
    /* JADX INFO: renamed from: s */
    public final void mo119026s(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        x2t0.m206864b("Adapter called onAdClosed.");
        try {
            this.f187465a.zzf();
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: t */
    public final koj0 m204871t() {
        return this.f187466b;
    }

    /* JADX INFO: renamed from: u */
    public final wcs0 m204872u() {
        return this.f187467c;
    }
}
