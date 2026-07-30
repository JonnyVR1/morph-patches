package p153l;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class syv0 extends v21<Void> implements SignInConnectionListener {

    /* JADX INFO: renamed from: o */
    public Semaphore f171320o;

    /* JADX INFO: renamed from: p */
    public Set<GoogleApiClient> f171321p;

    public syv0(Context context, Set<GoogleApiClient> set) {
        super(context);
        this.f171320o = new Semaphore(0);
        this.f171321p = set;
    }

    @Override // p153l.v21
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final Void mo188605F() {
        Iterator<GoogleApiClient> it = this.f171321p.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().maybeSignIn(this)) {
                i++;
            }
        }
        try {
            this.f171320o.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.f171320o.release();
    }

    @Override // p153l.utv
    /* JADX INFO: renamed from: r */
    public final void mo188607r() {
        this.f171320o.drainPermits();
        m198092h();
    }
}
