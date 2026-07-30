package p149l;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes6.dex */
public final class wis0 implements BaseGmsClient.BaseConnectionCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ n3t0 f186568a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yis0 f186569b;

    public wis0(yis0 yis0Var, n3t0 n3t0Var) {
        this.f186568a = n3t0Var;
        this.f186569b = yis0Var;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        try {
            this.f186568a.m157774b(this.f186569b.f198545a.m111927c());
        } catch (DeadObjectException e) {
            this.f186568a.m157775c(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.f186568a.m157775c(new RuntimeException("onConnectionSuspended: " + i));
    }
}
