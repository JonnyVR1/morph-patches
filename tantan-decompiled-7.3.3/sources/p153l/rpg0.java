package p153l;

import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class rpg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Message f164365a;

    public rpg0(Message message) {
        this.f164365a = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw new AssertionError("Unknown handler message received: " + this.f164365a.what);
    }
}
