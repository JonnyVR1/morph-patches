package p149l;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;

/* JADX INFO: loaded from: classes6.dex */
public final class lbt0 extends IStatusCallback.Stub {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f127334a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sei0 f127335b;

    public lbt0(zvt0 zvt0Var, Object obj, sei0 sei0Var) {
        this.f127334a = obj;
        this.f127335b = sei0Var;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        TaskUtil.setResultOrApiException(status, this.f127334a, this.f127335b);
    }
}
