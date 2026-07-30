package p149l;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class uwu0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Activity f178678e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f178679f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f178680g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ tpu0 f178681h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwu0(tpu0 tpu0Var, Activity activity, String str, String str2) {
        super(tpu0Var);
        this.f178678e = activity;
        this.f178679f = str;
        this.f178680g = str2;
        this.f178681h = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f178681h.f171518i)).setCurrentScreen(s050.m181848Y2(this.f178678e), this.f178679f, this.f178680g, this.f171519a);
    }
}
