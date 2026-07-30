package p153l;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: loaded from: classes6.dex */
public final class yny0 extends dix0 {

    /* JADX INFO: renamed from: a */
    public BaseImplementation.ResultHolder<Status> f200932a;

    public yny0(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f200932a = resultHolder;
    }

    @Override // p153l.dix0, p153l.h0z0
    /* JADX INFO: renamed from: D2 */
    public final void mo96615D2(Status status) {
        this.f200932a.setResult(status);
    }
}
