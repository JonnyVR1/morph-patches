package p153l;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;

/* JADX INFO: loaded from: classes6.dex */
public final class rkt0 extends IStatusCallback.Stub {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f163642a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sni0 f163643b;

    public rkt0(f5u0 f5u0Var, Object obj, sni0 sni0Var) {
        this.f163642a = obj;
        this.f163643b = sni0Var;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        TaskUtil.setResultOrApiException(status, this.f163642a, this.f163643b);
    }
}
