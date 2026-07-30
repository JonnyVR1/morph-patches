package p149l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class pjv0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Bundle f149880e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ r8u0 f149881f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ tpu0 f149882g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjv0(tpu0 tpu0Var, Bundle bundle, r8u0 r8u0Var) {
        super(tpu0Var);
        this.f149880e = bundle;
        this.f149881f = r8u0Var;
        this.f149882g = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f149882g.f171518i)).performAction(this.f149880e, this.f149881f, this.f171519a);
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: b */
    public final void mo102712b() {
        this.f149881f.zza(null);
    }
}
