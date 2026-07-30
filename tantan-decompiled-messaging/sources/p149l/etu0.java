package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class etu0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f93173e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f93174f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f93175g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f93176h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ tpu0 f93177i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etu0(tpu0 tpu0Var, String str, String str2, Object obj, boolean z) {
        super(tpu0Var);
        this.f93173e = str;
        this.f93174f = str2;
        this.f93175g = obj;
        this.f93176h = z;
        this.f93177i = tpu0Var;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        ((j7u0) Preconditions.checkNotNull(this.f93177i.f171518i)).setUserProperty(this.f93173e, this.f93174f, s050.m181848Y2(this.f93175g), this.f93176h, this.f171519a);
    }
}
