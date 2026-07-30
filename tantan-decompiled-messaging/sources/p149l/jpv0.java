package p149l;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.util.C2075b;

/* JADX INFO: loaded from: classes6.dex */
public final class jpv0 extends obw0 {
    public jpv0(Looper looper) {
        super(looper);
    }

    @Override // p149l.obw0
    /* JADX INFO: renamed from: a */
    public final void mo142760a(Message message) {
        try {
            super.mo142760a(message);
        } catch (Throwable th) {
            vny0.m199080r();
            C2075b.m12319l(vny0.m199079q().m212275d(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            vny0.m199079q().m212290w(e, "AdMobHandler.handleMessage");
        }
    }
}
