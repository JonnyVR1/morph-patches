package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.location.CurrentLocationRequest;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class shs0 implements RemoteCall {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CurrentLocationRequest f168742a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gg4 f168743b;

    public /* synthetic */ shs0(CurrentLocationRequest currentLocationRequest, gg4 gg4Var) {
        this.f168742a = currentLocationRequest;
        this.f168743b = gg4Var;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) throws RemoteException {
        Api.ClientKey clientKey = vrs0.f185519a;
        ((f5u0) obj).m124240k(this.f168742a, this.f168743b, (sni0) obj2);
    }
}
