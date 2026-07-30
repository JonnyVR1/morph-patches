package com.p051p1.mobile.putong.live.livingroom.increment.gift.tray;

import com.tantanapp.common.utils.CrashHelper;
import java.lang.ref.WeakReference;
import p153l.eks;
import p153l.l51;
import p153l.muj;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.d */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC12998d implements Runnable {

    /* JADX INFO: renamed from: a */
    public WeakReference<LiveGiftTraysPresenter> f51015a;

    /* JADX INFO: renamed from: b */
    public final eks f51016b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f51017c = true;

    public RunnableC12998d(eks eksVar, LiveGiftTraysPresenter liveGiftTraysPresenter) {
        this.f51016b = eksVar;
        this.f51015a = new WeakReference<>(liveGiftTraysPresenter);
    }

    /* JADX INFO: renamed from: b */
    public final void m75471b(LiveGiftTraysPresenter.TrayType trayType) {
        GiftTrayData giftTrayDataM121083o = this.f51016b.m121083o(trayType);
        if (giftTrayDataM121083o == null || giftTrayDataM121083o.m75350t()) {
            return;
        }
        muj.m160177T(giftTrayDataM121083o, trayType);
        LiveGiftTraysPresenter liveGiftTraysPresenter = this.f51015a.get();
        if (liveGiftTraysPresenter != null) {
            liveGiftTraysPresenter.m75426u4(giftTrayDataM121083o, trayType);
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m75472c() {
        LiveGiftTraysPresenter liveGiftTraysPresenter;
        WeakReference<LiveGiftTraysPresenter> weakReference = this.f51015a;
        if (weakReference == null || (liveGiftTraysPresenter = weakReference.get()) == null) {
            return;
        }
        LiveGiftTraysPresenter.TrayType trayType = LiveGiftTraysPresenter.TrayType.bottom;
        if (!liveGiftTraysPresenter.m75418j4(trayType)) {
            m75471b(trayType);
        }
        LiveGiftTraysPresenter.TrayType trayType2 = LiveGiftTraysPresenter.TrayType.top;
        if (liveGiftTraysPresenter.m75418j4(trayType2)) {
            return;
        }
        m75471b(trayType2);
    }

    /* JADX INFO: renamed from: d */
    public void m75473d() {
        WeakReference<LiveGiftTraysPresenter> weakReference = this.f51015a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f51015a = null;
        this.f51017c = false;
        synchronized (this.f51016b) {
            this.f51016b.notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.f51017c) {
            if (this.f51016b.m121080l()) {
                try {
                    synchronized (this.f51016b) {
                        try {
                            this.f51016b.wait();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (InterruptedException e) {
                    CrashHelper.m82479c(e);
                }
            } else {
                l51.m152887G(new Runnable() { // from class: l.uij0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f179131a.m75472c();
                    }
                });
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e2) {
                    CrashHelper.m82479c(e2);
                }
            }
        }
    }
}
