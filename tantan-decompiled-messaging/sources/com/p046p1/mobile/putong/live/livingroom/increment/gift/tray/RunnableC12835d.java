package com.p046p1.mobile.putong.live.livingroom.increment.gift.tray;

import com.tantanapp.common.utils.CrashHelper;
import java.lang.ref.WeakReference;
import p149l.dis;
import p149l.e51;
import p149l.wrj;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.d */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC12835d implements Runnable {

    /* JADX INFO: renamed from: a */
    public WeakReference<LiveGiftTraysPresenter> f50167a;

    /* JADX INFO: renamed from: b */
    public final dis f50168b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f50169c = true;

    public RunnableC12835d(dis disVar, LiveGiftTraysPresenter liveGiftTraysPresenter) {
        this.f50168b = disVar;
        this.f50167a = new WeakReference<>(liveGiftTraysPresenter);
    }

    /* JADX INFO: renamed from: b */
    public final void m74288b(LiveGiftTraysPresenter.TrayType trayType) {
        GiftTrayData giftTrayDataM111926o = this.f50168b.m111926o(trayType);
        if (giftTrayDataM111926o == null || giftTrayDataM111926o.m74167t()) {
            return;
        }
        wrj.m205213T(giftTrayDataM111926o, trayType);
        LiveGiftTraysPresenter liveGiftTraysPresenter = this.f50167a.get();
        if (liveGiftTraysPresenter != null) {
            liveGiftTraysPresenter.m74243u4(giftTrayDataM111926o, trayType);
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m74289c() {
        LiveGiftTraysPresenter liveGiftTraysPresenter;
        WeakReference<LiveGiftTraysPresenter> weakReference = this.f50167a;
        if (weakReference == null || (liveGiftTraysPresenter = weakReference.get()) == null) {
            return;
        }
        LiveGiftTraysPresenter.TrayType trayType = LiveGiftTraysPresenter.TrayType.bottom;
        if (!liveGiftTraysPresenter.m74235j4(trayType)) {
            m74288b(trayType);
        }
        LiveGiftTraysPresenter.TrayType trayType2 = LiveGiftTraysPresenter.TrayType.top;
        if (liveGiftTraysPresenter.m74235j4(trayType2)) {
            return;
        }
        m74288b(trayType2);
    }

    /* JADX INFO: renamed from: d */
    public void m74290d() {
        WeakReference<LiveGiftTraysPresenter> weakReference = this.f50167a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f50167a = null;
        this.f50169c = false;
        synchronized (this.f50168b) {
            this.f50168b.notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.f50169c) {
            if (this.f50168b.m111923l()) {
                try {
                    synchronized (this.f50168b) {
                        try {
                            this.f50168b.wait();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (InterruptedException e) {
                    CrashHelper.m81296c(e);
                }
            } else {
                e51.m114742G(new Runnable() { // from class: l.q9j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f153441a.m74289c();
                    }
                });
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e2) {
                    CrashHelper.m81296c(e2);
                }
            }
        }
    }
}
