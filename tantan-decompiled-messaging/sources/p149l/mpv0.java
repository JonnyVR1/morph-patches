package p149l;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class mpv0 extends o21<Void> implements SignInConnectionListener {

    /* JADX INFO: renamed from: o */
    public Semaphore f135089o;

    /* JADX INFO: renamed from: p */
    public Set<GoogleApiClient> f135090p;

    public mpv0(Context context, Set<GoogleApiClient> set) {
        super(context);
        this.f135089o = new Semaphore(0);
        this.f135090p = set;
    }

    @Override // p149l.o21
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final Void mo138795F() {
        Iterator<GoogleApiClient> it = this.f135090p.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().maybeSignIn(this)) {
                i++;
            }
        }
        try {
            this.f135089o.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.f135089o.release();
    }

    @Override // p149l.trv
    /* JADX INFO: renamed from: r */
    public final void mo138803r() {
        this.f135089o.drainPermits();
        m190453h();
    }
}
