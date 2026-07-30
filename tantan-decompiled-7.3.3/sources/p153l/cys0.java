package p153l;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class cys0 implements y7y, b8y, d8y {

    /* JADX INFO: renamed from: a */
    public final jxs0 f84402a;

    /* JADX INFO: renamed from: b */
    public nxj0 f84403b;

    /* JADX INFO: renamed from: c */
    public cms0 f84404c;

    public cys0(jxs0 jxs0Var) {
        this.f84402a = jxs0Var;
    }

    @Override // p153l.d8y
    /* JADX INFO: renamed from: a */
    public final void mo113232a(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        dct0.m115293b("Adapter called onAdOpened.");
        try {
            this.f84402a.zzp();
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.d8y
    /* JADX INFO: renamed from: b */
    public final void mo113233b(MediationNativeAdapter mediationNativeAdapter, cms0 cms0Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        dct0.m115293b("Adapter called onAdLoaded with template id ".concat(String.valueOf(cms0Var.m111315b())));
        this.f84404c = cms0Var;
        try {
            this.f84402a.zzo();
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.y7y
    /* JADX INFO: renamed from: c */
    public final void mo113234c(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        dct0.m115293b("Adapter called onAdClicked.");
        try {
            this.f84402a.zze();
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.y7y
    /* JADX INFO: renamed from: d */
    public final void mo113235d(MediationBannerAdapter mediationBannerAdapter, b70 b70Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        dct0.m115293b("Adapter called onAdFailedToLoad with error. ErrorCode: " + b70Var.m102802a() + ". ErrorMessage: " + b70Var.m102804c() + ". ErrorDomain: " + b70Var.m102803b());
        try {
            this.f84402a.mo118717N4(b70Var.m102805d());
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.d8y
    /* JADX INFO: renamed from: e */
    public final void mo113236e(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        dct0.m115293b("Adapter called onAdClosed.");
        try {
            this.f84402a.zzf();
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.y7y
    /* JADX INFO: renamed from: f */
    public final void mo113237f(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        dct0.m115293b("Adapter called onAdLoaded.");
        try {
            this.f84402a.zzo();
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.y7y
    /* JADX INFO: renamed from: g */
    public final void mo113238g(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        dct0.m115293b("Adapter called onAdOpened.");
        try {
            this.f84402a.zzp();
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.d8y
    /* JADX INFO: renamed from: h */
    public final void mo113239h(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        nxj0 nxj0Var = this.f84403b;
        if (this.f84404c == null) {
            if (nxj0Var == null) {
                dct0.m115300i("#007 Could not call remote method.", null);
                return;
            } else if (!nxj0Var.m165145m()) {
                dct0.m115293b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        dct0.m115293b("Adapter called onAdImpression.");
        try {
            this.f84402a.zzm();
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.y7y
    /* JADX INFO: renamed from: i */
    public final void mo113240i(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        dct0.m115293b("Adapter called onAdClosed.");
        try {
            this.f84402a.zzf();
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.d8y
    /* JADX INFO: renamed from: j */
    public final void mo113241j(MediationNativeAdapter mediationNativeAdapter, nxj0 nxj0Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        dct0.m115293b("Adapter called onAdLoaded.");
        this.f84403b = nxj0Var;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            vcl0 vcl0Var = new vcl0();
            vcl0Var.m200829c(new sxs0());
            if (nxj0Var != null && nxj0Var.m165150r()) {
                nxj0Var.m165132K(vcl0Var);
            }
        }
        try {
            this.f84402a.zzo();
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.b8y
    /* JADX INFO: renamed from: k */
    public final void mo103045k(MediationInterstitialAdapter mediationInterstitialAdapter, b70 b70Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        dct0.m115293b("Adapter called onAdFailedToLoad with error. ErrorCode: " + b70Var.m102802a() + ". ErrorMessage: " + b70Var.m102804c() + ". ErrorDomain: " + b70Var.m102803b());
        try {
            this.f84402a.mo118717N4(b70Var.m102805d());
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.d8y
    /* JADX INFO: renamed from: l */
    public final void mo113242l(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        nxj0 nxj0Var = this.f84403b;
        if (this.f84404c == null) {
            if (nxj0Var == null) {
                dct0.m115300i("#007 Could not call remote method.", null);
                return;
            } else if (!nxj0Var.m165144l()) {
                dct0.m115293b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        dct0.m115293b("Adapter called onAdClicked.");
        try {
            this.f84402a.zze();
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.b8y
    /* JADX INFO: renamed from: m */
    public final void mo103046m(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        dct0.m115293b("Adapter called onAdLoaded.");
        try {
            this.f84402a.zzo();
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.d8y
    /* JADX INFO: renamed from: n */
    public final void mo113243n(MediationNativeAdapter mediationNativeAdapter, cms0 cms0Var, String str) {
        try {
            this.f84402a.mo118719h3(cms0Var.m111314a(), str);
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.b8y
    /* JADX INFO: renamed from: o */
    public final void mo103047o(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        dct0.m115293b("Adapter called onAdOpened.");
        try {
            this.f84402a.zzp();
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.b8y
    /* JADX INFO: renamed from: p */
    public final void mo103048p(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        dct0.m115293b("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.f84402a.zzg(i);
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.d8y
    /* JADX INFO: renamed from: q */
    public final void mo113244q(MediationNativeAdapter mediationNativeAdapter, b70 b70Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        dct0.m115293b("Adapter called onAdFailedToLoad with error. ErrorCode: " + b70Var.m102802a() + ". ErrorMessage: " + b70Var.m102804c() + ". ErrorDomain: " + b70Var.m102803b());
        try {
            this.f84402a.mo118717N4(b70Var.m102805d());
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.y7y
    /* JADX INFO: renamed from: r */
    public final void mo113245r(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        dct0.m115293b("Adapter called onAppEvent.");
        try {
            this.f84402a.mo118715L7(str, str2);
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.b8y
    /* JADX INFO: renamed from: s */
    public final void mo103049s(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        dct0.m115293b("Adapter called onAdClosed.");
        try {
            this.f84402a.zzf();
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: t */
    public final nxj0 m113246t() {
        return this.f84403b;
    }

    /* JADX INFO: renamed from: u */
    public final cms0 m113247u() {
        return this.f84404c;
    }
}
