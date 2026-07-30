package p149l;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;

/* JADX INFO: loaded from: classes6.dex */
public final class i7r0 extends IStatusCallback.Stub {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sei0 f111935a;

    public i7r0(aar0 aar0Var, sei0 sei0Var) {
        this.f111935a = sei0Var;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        TaskUtil.setResultOrApiException(status, this.f111935a);
    }
}
