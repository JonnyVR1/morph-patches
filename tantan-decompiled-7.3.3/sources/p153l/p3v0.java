package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class p3v0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f150469e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f150470f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ xhu0 f150471g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ zyu0 f150472h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3v0(zyu0 zyu0Var, String str, String str2, xhu0 xhu0Var) {
        super(zyu0Var);
        this.f150469e = str;
        this.f150470f = str2;
        this.f150471g = xhu0Var;
        this.f150472h = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f150472h.f206644i)).getConditionalUserProperties(this.f150469e, this.f150470f, this.f150471g);
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: b */
    public final void mo106547b() {
        this.f150471g.zza(null);
    }
}
