package p149l;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes6.dex */
public final class z1s0 implements BaseGmsClient.BaseConnectionCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ b2s0 f201093a;

    public z1s0(b2s0 b2s0Var) {
        this.f201093a = b2s0Var;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.f201093a.f72746c) {
            try {
                b2s0 b2s0Var = this.f201093a;
                if (b2s0Var.f72747d != null) {
                    b2s0Var.f72749f = b2s0Var.f72747d.m148305d();
                }
            } catch (DeadObjectException e) {
                x2t0.m206867e("Unable to obtain a cache service instance.", e);
                b2s0.m100024h(this.f201093a);
            }
            this.f201093a.f72746c.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        synchronized (this.f201093a.f72746c) {
            this.f201093a.f72749f = null;
            this.f201093a.f72746c.notifyAll();
        }
    }
}
