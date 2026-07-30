package com.p000p1.mobile.putong.live.livingroom.increment.gift.tray;

import com.tantanapp.common.utils.CrashHelper;
import java.lang.ref.WeakReference;
import l.e51;
import p002l.dis;
import p002l.wrj;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class RunnableC0424d implements Runnable {

    /* JADX INFO: renamed from: a */
    public WeakReference<LiveGiftTraysPresenter> f6209a;

    /* JADX INFO: renamed from: b */
    public final dis f6210b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f6211c = true;

    public RunnableC0424d(dis disVar, LiveGiftTraysPresenter liveGiftTraysPresenter) {
        this.f6210b = disVar;
        this.f6209a = new WeakReference<>(liveGiftTraysPresenter);
    }

    /* JADX INFO: renamed from: b */
    public final void m7869b(LiveGiftTraysPresenter.TrayType trayType) {
        GiftTrayData giftTrayDataM11921o = this.f6210b.m11921o(trayType);
        if (giftTrayDataM11921o == null || giftTrayDataM11921o.m7732t()) {
            return;
        }
        wrj.m25385T(giftTrayDataM11921o, trayType);
        LiveGiftTraysPresenter liveGiftTraysPresenter = this.f6209a.get();
        if (liveGiftTraysPresenter != null) {
            liveGiftTraysPresenter.m7814u4(giftTrayDataM11921o, trayType);
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m7870c() {
        LiveGiftTraysPresenter liveGiftTraysPresenter;
        WeakReference<LiveGiftTraysPresenter> weakReference = this.f6209a;
        if (weakReference == null || (liveGiftTraysPresenter = weakReference.get()) == null) {
            return;
        }
        LiveGiftTraysPresenter.TrayType trayType = LiveGiftTraysPresenter.TrayType.bottom;
        if (!liveGiftTraysPresenter.m7805j4(trayType)) {
            m7869b(trayType);
        }
        LiveGiftTraysPresenter.TrayType trayType2 = LiveGiftTraysPresenter.TrayType.top;
        if (liveGiftTraysPresenter.m7805j4(trayType2)) {
            return;
        }
        m7869b(trayType2);
    }

    /* JADX INFO: renamed from: d */
    public void m7871d() {
        WeakReference<LiveGiftTraysPresenter> weakReference = this.f6209a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f6209a = null;
        this.f6211c = false;
        synchronized (this.f6210b) {
            this.f6210b.notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.f6211c) {
            if (this.f6210b.m11918l()) {
                try {
                    synchronized (this.f6210b) {
                        try {
                            this.f6210b.wait();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (InterruptedException e) {
                    CrashHelper.c(e);
                }
            } else {
                e51.G(new Runnable() { // from class: l.q9j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17880a.m7870c();
                    }
                });
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e2) {
                    CrashHelper.c(e2);
                }
            }
        }
    }
}
