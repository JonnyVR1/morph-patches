package p153l;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class v9s0 extends Thread {

    /* JADX INFO: renamed from: a */
    public final WeakReference<AdvertisingIdClient> f183035a;

    /* JADX INFO: renamed from: b */
    public final long f183036b;

    /* JADX INFO: renamed from: c */
    public final CountDownLatch f183037c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d */
    public boolean f183038d = false;

    public v9s0(AdvertisingIdClient advertisingIdClient, long j) {
        this.f183035a = new WeakReference<>(advertisingIdClient);
        this.f183036b = j;
        start();
    }

    /* JADX INFO: renamed from: a */
    public final void m200462a() {
        AdvertisingIdClient advertisingIdClient = this.f183035a.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.f183038d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f183037c.await(this.f183036b, TimeUnit.MILLISECONDS)) {
                return;
            }
            m200462a();
        } catch (InterruptedException unused) {
            m200462a();
        }
    }
}
