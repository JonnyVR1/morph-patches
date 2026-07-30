package p153l;

import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public class wij0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public WeakReference<nns> f189366a;

    /* JADX INFO: renamed from: b */
    public final eks f189367b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f189368c = true;

    public wij0(eks eksVar, nns nnsVar) {
        this.f189367b = eksVar;
        this.f189366a = new WeakReference<>(nnsVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m206588b(LiveGiftTraysPresenter.TrayType trayType) {
        nns nnsVar;
        GiftTrayData giftTrayDataM121083o = this.f189367b.m121083o(trayType);
        if (giftTrayDataM121083o == null || giftTrayDataM121083o.m75350t() || (nnsVar = this.f189366a.get()) == null) {
            return;
        }
        nnsVar.m163995z3(giftTrayDataM121083o, trayType);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m206589c() {
        nns nnsVar;
        WeakReference<nns> weakReference = this.f189366a;
        if (weakReference == null || (nnsVar = weakReference.get()) == null) {
            return;
        }
        LiveGiftTraysPresenter.TrayType trayType = LiveGiftTraysPresenter.TrayType.bottom;
        if (!nnsVar.m163985p3(trayType)) {
            m206588b(trayType);
        }
        LiveGiftTraysPresenter.TrayType trayType2 = LiveGiftTraysPresenter.TrayType.top;
        if (nnsVar.m163985p3(trayType2)) {
            return;
        }
        m206588b(trayType2);
    }

    /* JADX INFO: renamed from: d */
    public void m206590d() {
        WeakReference<nns> weakReference = this.f189366a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f189366a = null;
        this.f189368c = false;
        synchronized (this.f189367b) {
            this.f189367b.notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.f189368c) {
            if (this.f189367b.m121080l()) {
                try {
                    synchronized (this.f189367b) {
                        try {
                            this.f189367b.wait();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (InterruptedException e) {
                    CrashHelper.m82479c(e);
                }
            } else {
                l51.m152887G(new Runnable() { // from class: l.vij0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f184252a.m206589c();
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
