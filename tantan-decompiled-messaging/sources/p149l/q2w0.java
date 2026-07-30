package p149l;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class q2w0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Activity f152322e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tpu0.C20240d f152323f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2w0(tpu0.C20240d c20240d, Activity activity) {
        super(tpu0.this);
        this.f152322e = activity;
        this.f152323f = c20240d;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(tpu0.this.f171518i)).onActivityDestroyed(s050.m181848Y2(this.f152322e), this.f171520b);
    }
}
