package p149l;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class k1w0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Activity f120662e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tpu0.C20240d f120663f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1w0(tpu0.C20240d c20240d, Activity activity) {
        super(tpu0.this);
        this.f120662e = activity;
        this.f120663f = c20240d;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(tpu0.this.f171518i)).onActivityPaused(s050.m181848Y2(this.f120662e), this.f171520b);
    }
}
