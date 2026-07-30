package p149l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public final class jgr0 extends tvr0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f117822b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzq f117823c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f117824d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ mur0 f117825e;

    public jgr0(mur0 mur0Var, Context context, zzq zzqVar, String str) {
        this.f117822b = context;
        this.f117823c = zzqVar;
        this.f117824d = str;
        this.f117825e = mur0Var;
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96268a() {
        mur0.m156440q(this.f117822b, FirebaseAnalytics.Event.SEARCH);
        return new tjv0();
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96269b(n2t0 n2t0Var) throws RemoteException {
        return n2t0Var.mo12237E7(s050.m181848Y2(this.f117822b), this.f117823c, this.f117824d, 240304000);
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96270c() throws RemoteException {
        return this.f117825e.f135835a.m143346a(this.f117822b, this.f117823c, this.f117824d, null, 3);
    }
}
