package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes6.dex */
public final class a2s0 implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ b2s0 f67289a;

    public a2s0(b2s0 b2s0Var) {
        this.f67289a = b2s0Var;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        synchronized (this.f67289a.f72746c) {
            try {
                this.f67289a.f72749f = null;
                b2s0 b2s0Var = this.f67289a;
                if (b2s0Var.f72747d != null) {
                    b2s0Var.f72747d = null;
                }
                this.f67289a.f72746c.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
