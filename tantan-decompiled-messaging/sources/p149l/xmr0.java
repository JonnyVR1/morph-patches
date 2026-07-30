package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes6.dex */
public final class xmr0 extends qqr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f193575a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmr0(rrr0 rrr0Var, GoogleApiClient googleApiClient, boolean z) {
        super(googleApiClient);
        this.f193575a = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zvt0) anyClient).m220468c(this.f193575a, rrr0.m180569a(this));
    }
}
