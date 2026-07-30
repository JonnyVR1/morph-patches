package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes6.dex */
public final class dss0 implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tct0 f90515a;

    public dss0(ess0 ess0Var, tct0 tct0Var) {
        this.f90515a = tct0Var;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f90515a.m190495c(new RuntimeException("Connection failed."));
    }
}
