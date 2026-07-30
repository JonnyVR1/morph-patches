package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class cpu0 {

    /* JADX INFO: renamed from: a */
    public final ais0 f81998a;

    public cpu0(ais0 ais0Var) {
        this.f81998a = ais0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m108176a() throws RemoteException {
        m108194s(new bpu0("initialize", null));
    }

    /* JADX INFO: renamed from: b */
    public final void m108177b(long j) throws RemoteException {
        bpu0 bpu0Var = new bpu0("interstitial", null);
        bpu0Var.f76676a = Long.valueOf(j);
        bpu0Var.f76678c = "onAdClicked";
        this.f81998a.zzb(bpu0.m103088a(bpu0Var));
    }

    /* JADX INFO: renamed from: c */
    public final void m108178c(long j) throws RemoteException {
        bpu0 bpu0Var = new bpu0("interstitial", null);
        bpu0Var.f76676a = Long.valueOf(j);
        bpu0Var.f76678c = "onAdClosed";
        m108194s(bpu0Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m108179d(long j, int i) throws RemoteException {
        bpu0 bpu0Var = new bpu0("interstitial", null);
        bpu0Var.f76676a = Long.valueOf(j);
        bpu0Var.f76678c = "onAdFailedToLoad";
        bpu0Var.f76679d = Integer.valueOf(i);
        m108194s(bpu0Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m108180e(long j) throws RemoteException {
        bpu0 bpu0Var = new bpu0("interstitial", null);
        bpu0Var.f76676a = Long.valueOf(j);
        bpu0Var.f76678c = "onAdLoaded";
        m108194s(bpu0Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m108181f(long j) throws RemoteException {
        bpu0 bpu0Var = new bpu0("interstitial", null);
        bpu0Var.f76676a = Long.valueOf(j);
        bpu0Var.f76678c = "onNativeAdObjectNotAvailable";
        m108194s(bpu0Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m108182g(long j) throws RemoteException {
        bpu0 bpu0Var = new bpu0("interstitial", null);
        bpu0Var.f76676a = Long.valueOf(j);
        bpu0Var.f76678c = "onAdOpened";
        m108194s(bpu0Var);
    }

    /* JADX INFO: renamed from: h */
    public final void m108183h(long j) throws RemoteException {
        bpu0 bpu0Var = new bpu0("creation", null);
        bpu0Var.f76676a = Long.valueOf(j);
        bpu0Var.f76678c = "nativeObjectCreated";
        m108194s(bpu0Var);
    }

    /* JADX INFO: renamed from: i */
    public final void m108184i(long j) throws RemoteException {
        bpu0 bpu0Var = new bpu0("creation", null);
        bpu0Var.f76676a = Long.valueOf(j);
        bpu0Var.f76678c = "nativeObjectNotCreated";
        m108194s(bpu0Var);
    }

    /* JADX INFO: renamed from: j */
    public final void m108185j(long j) throws RemoteException {
        bpu0 bpu0Var = new bpu0("rewarded", null);
        bpu0Var.f76676a = Long.valueOf(j);
        bpu0Var.f76678c = "onAdClicked";
        m108194s(bpu0Var);
    }

    /* JADX INFO: renamed from: k */
    public final void m108186k(long j) throws RemoteException {
        bpu0 bpu0Var = new bpu0("rewarded", null);
        bpu0Var.f76676a = Long.valueOf(j);
        bpu0Var.f76678c = "onRewardedAdClosed";
        m108194s(bpu0Var);
    }

    /* JADX INFO: renamed from: l */
    public final void m108187l(long j, cys0 cys0Var) throws RemoteException {
        bpu0 bpu0Var = new bpu0("rewarded", null);
        bpu0Var.f76676a = Long.valueOf(j);
        bpu0Var.f76678c = "onUserEarnedReward";
        bpu0Var.f76680e = cys0Var.zzf();
        bpu0Var.f76681f = Integer.valueOf(cys0Var.zze());
        m108194s(bpu0Var);
    }

    /* JADX INFO: renamed from: m */
    public final void m108188m(long j, int i) throws RemoteException {
        bpu0 bpu0Var = new bpu0("rewarded", null);
        bpu0Var.f76676a = Long.valueOf(j);
        bpu0Var.f76678c = "onRewardedAdFailedToLoad";
        bpu0Var.f76679d = Integer.valueOf(i);
        m108194s(bpu0Var);
    }

    /* JADX INFO: renamed from: n */
    public final void m108189n(long j, int i) throws RemoteException {
        bpu0 bpu0Var = new bpu0("rewarded", null);
        bpu0Var.f76676a = Long.valueOf(j);
        bpu0Var.f76678c = "onRewardedAdFailedToShow";
        bpu0Var.f76679d = Integer.valueOf(i);
        m108194s(bpu0Var);
    }

    /* JADX INFO: renamed from: o */
    public final void m108190o(long j) throws RemoteException {
        bpu0 bpu0Var = new bpu0("rewarded", null);
        bpu0Var.f76676a = Long.valueOf(j);
        bpu0Var.f76678c = "onAdImpression";
        m108194s(bpu0Var);
    }

    /* JADX INFO: renamed from: p */
    public final void m108191p(long j) throws RemoteException {
        bpu0 bpu0Var = new bpu0("rewarded", null);
        bpu0Var.f76676a = Long.valueOf(j);
        bpu0Var.f76678c = "onRewardedAdLoaded";
        m108194s(bpu0Var);
    }

    /* JADX INFO: renamed from: q */
    public final void m108192q(long j) throws RemoteException {
        bpu0 bpu0Var = new bpu0("rewarded", null);
        bpu0Var.f76676a = Long.valueOf(j);
        bpu0Var.f76678c = "onNativeAdObjectNotAvailable";
        m108194s(bpu0Var);
    }

    /* JADX INFO: renamed from: r */
    public final void m108193r(long j) throws RemoteException {
        bpu0 bpu0Var = new bpu0("rewarded", null);
        bpu0Var.f76676a = Long.valueOf(j);
        bpu0Var.f76678c = "onRewardedAdOpened";
        m108194s(bpu0Var);
    }

    /* JADX INFO: renamed from: s */
    public final void m108194s(bpu0 bpu0Var) throws RemoteException {
        String strM103088a = bpu0.m103088a(bpu0Var);
        x2t0.m206868f("Dispatching AFMA event on publisher webview: ".concat(strM103088a));
        this.f81998a.zzb(strM103088a);
    }
}
