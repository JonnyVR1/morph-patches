package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes6.dex */
public final class u2s0 implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ n3t0 f173516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v2s0 f173517b;

    public u2s0(v2s0 v2s0Var, n3t0 n3t0Var) {
        this.f173516a = n3t0Var;
        this.f173517b = v2s0Var;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        synchronized (this.f173517b.f179606d) {
            this.f173516a.m157775c(new RuntimeException("Connection failed."));
        }
    }
}
