package p153l;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class a6v0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Activity f68764e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f68765f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f68766g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ zyu0 f68767h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6v0(zyu0 zyu0Var, Activity activity, String str, String str2) {
        super(zyu0Var);
        this.f68764e = activity;
        this.f68765f = str;
        this.f68766g = str2;
        this.f68767h = zyu0Var;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        ((pgu0) Preconditions.checkNotNull(this.f68767h.f206644i)).setCurrentScreen(h950.m134038Y2(this.f68764e), this.f68765f, this.f68766g, this.f206645a);
    }
}
