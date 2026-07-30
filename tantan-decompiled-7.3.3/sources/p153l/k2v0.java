package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class k2v0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f123650e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f123651f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f123652g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f123653h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ zyu0 f123654i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2v0(zyu0 zyu0Var, String str, String str2, Object obj, boolean z) {
        super(zyu0Var);
        this.f123650e = str;
        this.f123651f = str2;
        this.f123652g = obj;
        this.f123653h = z;
        this.f123654i = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f123654i.f206644i)).setUserProperty(this.f123650e, this.f123651f, h950.m134038Y2(this.f123652g), this.f123653h, this.f206645a);
    }
}
