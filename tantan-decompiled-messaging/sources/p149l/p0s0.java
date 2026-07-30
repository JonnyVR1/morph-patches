package p149l;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class p0s0 extends Thread {

    /* JADX INFO: renamed from: a */
    public final WeakReference<AdvertisingIdClient> f146619a;

    /* JADX INFO: renamed from: b */
    public final long f146620b;

    /* JADX INFO: renamed from: c */
    public final CountDownLatch f146621c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d */
    public boolean f146622d = false;

    public p0s0(AdvertisingIdClient advertisingIdClient, long j) {
        this.f146619a = new WeakReference<>(advertisingIdClient);
        this.f146620b = j;
        start();
    }

    /* JADX INFO: renamed from: a */
    public final void m166992a() {
        AdvertisingIdClient advertisingIdClient = this.f146619a.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.f146622d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f146621c.await(this.f146620b, TimeUnit.MILLISECONDS)) {
                return;
            }
            m166992a();
        } catch (InterruptedException unused) {
            m166992a();
        }
    }
}
