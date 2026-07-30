package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes6.dex */
public final class xis0 implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ n3t0 f193153a;

    public xis0(yis0 yis0Var, n3t0 n3t0Var) {
        this.f193153a = n3t0Var;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f193153a.m157775c(new RuntimeException("Connection failed."));
    }
}
