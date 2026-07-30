package p149l;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: loaded from: classes6.dex */
public final class sey0 extends x8x0 {

    /* JADX INFO: renamed from: a */
    public BaseImplementation.ResultHolder<Status> f164185a;

    public sey0(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f164185a = resultHolder;
    }

    @Override // p149l.x8x0, p149l.bry0
    /* JADX INFO: renamed from: D2 */
    public final void mo103604D2(Status status) {
        this.f164185a.setResult(status);
    }
}
