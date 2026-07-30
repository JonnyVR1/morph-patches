package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class iyu0 {

    /* JADX INFO: renamed from: a */
    public final grs0 f117638a;

    public iyu0(grs0 grs0Var) {
        this.f117638a = grs0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m142726a() throws RemoteException {
        m142744s(new hyu0("initialize", null));
    }

    /* JADX INFO: renamed from: b */
    public final void m142727b(long j) throws RemoteException {
        hyu0 hyu0Var = new hyu0("interstitial", null);
        hyu0Var.f112163a = Long.valueOf(j);
        hyu0Var.f112165c = "onAdClicked";
        this.f117638a.zzb(hyu0.m137775a(hyu0Var));
    }

    /* JADX INFO: renamed from: c */
    public final void m142728c(long j) throws RemoteException {
        hyu0 hyu0Var = new hyu0("interstitial", null);
        hyu0Var.f112163a = Long.valueOf(j);
        hyu0Var.f112165c = "onAdClosed";
        m142744s(hyu0Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m142729d(long j, int i) throws RemoteException {
        hyu0 hyu0Var = new hyu0("interstitial", null);
        hyu0Var.f112163a = Long.valueOf(j);
        hyu0Var.f112165c = "onAdFailedToLoad";
        hyu0Var.f112166d = Integer.valueOf(i);
        m142744s(hyu0Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m142730e(long j) throws RemoteException {
        hyu0 hyu0Var = new hyu0("interstitial", null);
        hyu0Var.f112163a = Long.valueOf(j);
        hyu0Var.f112165c = "onAdLoaded";
        m142744s(hyu0Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m142731f(long j) throws RemoteException {
        hyu0 hyu0Var = new hyu0("interstitial", null);
        hyu0Var.f112163a = Long.valueOf(j);
        hyu0Var.f112165c = "onNativeAdObjectNotAvailable";
        m142744s(hyu0Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m142732g(long j) throws RemoteException {
        hyu0 hyu0Var = new hyu0("interstitial", null);
        hyu0Var.f112163a = Long.valueOf(j);
        hyu0Var.f112165c = "onAdOpened";
        m142744s(hyu0Var);
    }

    /* JADX INFO: renamed from: h */
    public final void m142733h(long j) throws RemoteException {
        hyu0 hyu0Var = new hyu0("creation", null);
        hyu0Var.f112163a = Long.valueOf(j);
        hyu0Var.f112165c = "nativeObjectCreated";
        m142744s(hyu0Var);
    }

    /* JADX INFO: renamed from: i */
    public final void m142734i(long j) throws RemoteException {
        hyu0 hyu0Var = new hyu0("creation", null);
        hyu0Var.f112163a = Long.valueOf(j);
        hyu0Var.f112165c = "nativeObjectNotCreated";
        m142744s(hyu0Var);
    }

    /* JADX INFO: renamed from: j */
    public final void m142735j(long j) throws RemoteException {
        hyu0 hyu0Var = new hyu0("rewarded", null);
        hyu0Var.f112163a = Long.valueOf(j);
        hyu0Var.f112165c = "onAdClicked";
        m142744s(hyu0Var);
    }

    /* JADX INFO: renamed from: k */
    public final void m142736k(long j) throws RemoteException {
        hyu0 hyu0Var = new hyu0("rewarded", null);
        hyu0Var.f112163a = Long.valueOf(j);
        hyu0Var.f112165c = "onRewardedAdClosed";
        m142744s(hyu0Var);
    }

    /* JADX INFO: renamed from: l */
    public final void m142737l(long j, i7t0 i7t0Var) throws RemoteException {
        hyu0 hyu0Var = new hyu0("rewarded", null);
        hyu0Var.f112163a = Long.valueOf(j);
        hyu0Var.f112165c = "onUserEarnedReward";
        hyu0Var.f112167e = i7t0Var.zzf();
        hyu0Var.f112168f = Integer.valueOf(i7t0Var.zze());
        m142744s(hyu0Var);
    }

    /* JADX INFO: renamed from: m */
    public final void m142738m(long j, int i) throws RemoteException {
        hyu0 hyu0Var = new hyu0("rewarded", null);
        hyu0Var.f112163a = Long.valueOf(j);
        hyu0Var.f112165c = "onRewardedAdFailedToLoad";
        hyu0Var.f112166d = Integer.valueOf(i);
        m142744s(hyu0Var);
    }

    /* JADX INFO: renamed from: n */
    public final void m142739n(long j, int i) throws RemoteException {
        hyu0 hyu0Var = new hyu0("rewarded", null);
        hyu0Var.f112163a = Long.valueOf(j);
        hyu0Var.f112165c = "onRewardedAdFailedToShow";
        hyu0Var.f112166d = Integer.valueOf(i);
        m142744s(hyu0Var);
    }

    /* JADX INFO: renamed from: o */
    public final void m142740o(long j) throws RemoteException {
        hyu0 hyu0Var = new hyu0("rewarded", null);
        hyu0Var.f112163a = Long.valueOf(j);
        hyu0Var.f112165c = "onAdImpression";
        m142744s(hyu0Var);
    }

    /* JADX INFO: renamed from: p */
    public final void m142741p(long j) throws RemoteException {
        hyu0 hyu0Var = new hyu0("rewarded", null);
        hyu0Var.f112163a = Long.valueOf(j);
        hyu0Var.f112165c = "onRewardedAdLoaded";
        m142744s(hyu0Var);
    }

    /* JADX INFO: renamed from: q */
    public final void m142742q(long j) throws RemoteException {
        hyu0 hyu0Var = new hyu0("rewarded", null);
        hyu0Var.f112163a = Long.valueOf(j);
        hyu0Var.f112165c = "onNativeAdObjectNotAvailable";
        m142744s(hyu0Var);
    }

    /* JADX INFO: renamed from: r */
    public final void m142743r(long j) throws RemoteException {
        hyu0 hyu0Var = new hyu0("rewarded", null);
        hyu0Var.f112163a = Long.valueOf(j);
        hyu0Var.f112165c = "onRewardedAdOpened";
        m142744s(hyu0Var);
    }

    /* JADX INFO: renamed from: s */
    public final void m142744s(hyu0 hyu0Var) throws RemoteException {
        String strM137775a = hyu0.m137775a(hyu0Var);
        dct0.m115297f("Dispatching AFMA event on publisher webview: ".concat(strM137775a));
        this.f117638a.zzb(strM137775a);
    }
}
