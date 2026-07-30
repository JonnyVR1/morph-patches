package p149l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class thr0 extends tvr0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f170275b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzq f170276c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f170277d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ons0 f170278e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ mur0 f170279f;

    public thr0(mur0 mur0Var, Context context, zzq zzqVar, String str, ons0 ons0Var) {
        this.f170275b = context;
        this.f170276c = zzqVar;
        this.f170277d = str;
        this.f170278e = ons0Var;
        this.f170279f = mur0Var;
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96268a() {
        mur0.m156440q(this.f170275b, "interstitial");
        return new tjv0();
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96269b(n2t0 n2t0Var) throws RemoteException {
        return n2t0Var.mo12236E2(s050.m181848Y2(this.f170275b), this.f170276c, this.f170277d, this.f170278e, 240304000);
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96270c() throws RemoteException {
        return this.f170279f.f135835a.m143346a(this.f170275b, this.f170276c, this.f170277d, this.f170278e, 2);
    }
}
