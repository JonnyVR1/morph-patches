package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class ndv0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f138553e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f138554f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f138555g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ r8u0 f138556h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ tpu0 f138557i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndv0(tpu0 tpu0Var, String str, String str2, boolean z, r8u0 r8u0Var) {
        super(tpu0Var);
        this.f138553e = str;
        this.f138554f = str2;
        this.f138555g = z;
        this.f138556h = r8u0Var;
        this.f138557i = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f138557i.f171518i)).getUserProperties(this.f138553e, this.f138554f, this.f138555g, this.f138556h);
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: b */
    public final void mo102712b() {
        this.f138556h.zza(null);
    }
}
