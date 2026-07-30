package p149l;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class gtr0 extends tvr0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f104345b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f104346c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ons0 f104347d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ mur0 f104348e;

    public gtr0(mur0 mur0Var, Context context, String str, ons0 ons0Var) {
        this.f104345b = context;
        this.f104346c = str;
        this.f104347d = ons0Var;
        this.f104348e = mur0Var;
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96268a() {
        mur0.m156440q(this.f104345b, "rewarded");
        return new esv0();
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96269b(n2t0 n2t0Var) throws RemoteException {
        return n2t0Var.mo12242W2(s050.m181848Y2(this.f104345b), this.f104346c, this.f104347d, 240304000);
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96270c() throws RemoteException {
        return rys0.m181711a(this.f104345b, this.f104346c, this.f104347d);
    }
}
