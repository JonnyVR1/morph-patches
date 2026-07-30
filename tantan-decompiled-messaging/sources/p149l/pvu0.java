package p149l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class pvu0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f151506e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f151507f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Bundle f151508g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ tpu0 f151509h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvu0(tpu0 tpu0Var, String str, String str2, Bundle bundle) {
        super(tpu0Var);
        this.f151506e = str;
        this.f151507f = str2;
        this.f151508g = bundle;
        this.f151509h = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f151509h.f171518i)).clearConditionalUserProperty(this.f151506e, this.f151507f, this.f151508g);
    }
}
