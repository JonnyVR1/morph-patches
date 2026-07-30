package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.location.CurrentLocationRequest;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m8s0 implements RemoteCall {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CurrentLocationRequest f132613a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hf4 f132614b;

    public /* synthetic */ m8s0(CurrentLocationRequest currentLocationRequest, hf4 hf4Var) {
        this.f132613a = currentLocationRequest;
        this.f132614b = hf4Var;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) throws RemoteException {
        Api.ClientKey clientKey = pis0.f149684a;
        ((zvt0) obj).m220476k(this.f132613a, this.f132614b, (sei0) obj2);
    }
}
