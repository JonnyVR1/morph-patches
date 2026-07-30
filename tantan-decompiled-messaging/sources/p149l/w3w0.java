package p149l;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class w3w0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Activity f184449e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ r8u0 f184450f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ tpu0.C20240d f184451g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3w0(tpu0.C20240d c20240d, Activity activity, r8u0 r8u0Var) {
        super(tpu0.this);
        this.f184449e = activity;
        this.f184450f = r8u0Var;
        this.f184451g = c20240d;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(tpu0.this.f171518i)).onActivitySaveInstanceState(s050.m181848Y2(this.f184449e), this.f184450f, this.f171520b);
    }
}
