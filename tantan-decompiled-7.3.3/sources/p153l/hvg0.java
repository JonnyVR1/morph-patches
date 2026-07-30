package p153l;

import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class hvg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Message f111759a;

    public hvg0(Message message) {
        this.f111759a = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw new AssertionError("Unhandled stats message." + this.f111759a.what);
    }
}
