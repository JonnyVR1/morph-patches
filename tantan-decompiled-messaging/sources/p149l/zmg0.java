package p149l;

import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class zmg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Message f203719a;

    public zmg0(Message message) {
        this.f203719a = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw new AssertionError("Unhandled stats message." + this.f203719a.what);
    }
}
