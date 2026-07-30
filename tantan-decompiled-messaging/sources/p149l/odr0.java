package p149l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class odr0 extends tvr0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f143233b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzq f143234c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f143235d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ons0 f143236e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ mur0 f143237f;

    public odr0(mur0 mur0Var, Context context, zzq zzqVar, String str, ons0 ons0Var) {
        this.f143233b = context;
        this.f143234c = zzqVar;
        this.f143235d = str;
        this.f143236e = ons0Var;
        this.f143237f = mur0Var;
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96268a() {
        mur0.m156440q(this.f143233b, "banner");
        return new tjv0();
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96269b(n2t0 n2t0Var) throws RemoteException {
        return n2t0Var.mo12239Q2(s050.m181848Y2(this.f143233b), this.f143234c, this.f143235d, this.f143236e, 240304000);
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96270c() throws RemoteException {
        return this.f143237f.f135835a.m143346a(this.f143233b, this.f143234c, this.f143235d, this.f143236e, 1);
    }
}
