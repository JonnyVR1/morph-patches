package p149l;

import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class jhg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Message f117939a;

    public jhg0(Message message) {
        this.f117939a = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw new AssertionError("Unknown handler message received: " + this.f117939a.what);
    }
}
