package p153l;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes6.dex */
public final class css0 implements BaseGmsClient.BaseConnectionCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tct0 f83486a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ess0 f83487b;

    public css0(ess0 ess0Var, tct0 tct0Var) {
        this.f83486a = tct0Var;
        this.f83487b = ess0Var;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        try {
            this.f83486a.m190494b(this.f83487b.f95652a.m146820c());
        } catch (DeadObjectException e) {
            this.f83486a.m190495c(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.f83486a.m190495c(new RuntimeException("onConnectionSuspended: " + i));
    }
}
