package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes6.dex */
public final class acs0 implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tct0 f69757a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bcs0 f69758b;

    public acs0(bcs0 bcs0Var, tct0 tct0Var) {
        this.f69757a = tct0Var;
        this.f69758b = bcs0Var;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        synchronized (this.f69758b.f76198d) {
            this.f69757a.m190495c(new RuntimeException("Connection failed."));
        }
    }
}
