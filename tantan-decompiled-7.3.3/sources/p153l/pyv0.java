package p153l;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.util.C2098b;

/* JADX INFO: loaded from: classes6.dex */
public final class pyv0 extends ukw0 {
    public pyv0(Looper looper) {
        super(looper);
    }

    @Override // p153l.ukw0
    /* JADX INFO: renamed from: a */
    public final void mo174324a(Message message) {
        try {
            super.mo174324a(message);
        } catch (Throwable th) {
            bxy0.m106934r();
            C2098b.m12373l(bxy0.m106933q().m120260d(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            bxy0.m106933q().m120275w(e, "AdMobHandler.handleMessage");
        }
    }
}
