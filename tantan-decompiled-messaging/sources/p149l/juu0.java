package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class juu0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f119813e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f119814f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ r8u0 f119815g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ tpu0 f119816h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juu0(tpu0 tpu0Var, String str, String str2, r8u0 r8u0Var) {
        super(tpu0Var);
        this.f119813e = str;
        this.f119814f = str2;
        this.f119815g = r8u0Var;
        this.f119816h = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f119816h.f171518i)).getConditionalUserProperties(this.f119813e, this.f119814f, this.f119815g);
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: b */
    public final void mo102712b() {
        this.f119815g.zza(null);
    }
}
