package p149l;

import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class s9j0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public WeakReference<mls> f163192a;

    /* JADX INFO: renamed from: b */
    public final dis f163193b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f163194c = true;

    public s9j0(dis disVar, mls mlsVar) {
        this.f163193b = disVar;
        this.f163192a = new WeakReference<>(mlsVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m182732b(LiveGiftTraysPresenter.TrayType trayType) {
        mls mlsVar;
        GiftTrayData giftTrayDataM111926o = this.f163193b.m111926o(trayType);
        if (giftTrayDataM111926o == null || giftTrayDataM111926o.m74167t() || (mlsVar = this.f163192a.get()) == null) {
            return;
        }
        mlsVar.m155281z3(giftTrayDataM111926o, trayType);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m182733c() {
        mls mlsVar;
        WeakReference<mls> weakReference = this.f163192a;
        if (weakReference == null || (mlsVar = weakReference.get()) == null) {
            return;
        }
        LiveGiftTraysPresenter.TrayType trayType = LiveGiftTraysPresenter.TrayType.bottom;
        if (!mlsVar.m155271p3(trayType)) {
            m182732b(trayType);
        }
        LiveGiftTraysPresenter.TrayType trayType2 = LiveGiftTraysPresenter.TrayType.top;
        if (mlsVar.m155271p3(trayType2)) {
            return;
        }
        m182732b(trayType2);
    }

    /* JADX INFO: renamed from: d */
    public void m182734d() {
        WeakReference<mls> weakReference = this.f163192a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f163192a = null;
        this.f163194c = false;
        synchronized (this.f163193b) {
            this.f163193b.notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.f163194c) {
            if (this.f163193b.m111923l()) {
                try {
                    synchronized (this.f163193b) {
                        try {
                            this.f163193b.wait();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (InterruptedException e) {
                    CrashHelper.m81296c(e);
                }
            } else {
                e51.m114742G(new Runnable() { // from class: l.r9j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f158382a.m182733c();
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
