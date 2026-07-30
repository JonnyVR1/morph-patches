package p149l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public final class afr0 extends tvr0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f69208b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzq f69209c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f69210d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ons0 f69211e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ mur0 f69212f;

    public afr0(mur0 mur0Var, Context context, zzq zzqVar, String str, ons0 ons0Var) {
        this.f69208b = context;
        this.f69209c = zzqVar;
        this.f69210d = str;
        this.f69211e = ons0Var;
        this.f69212f = mur0Var;
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96268a() {
        mur0.m156440q(this.f69208b, FirebaseAnalytics.Event.APP_OPEN);
        return new tjv0();
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96269b(n2t0 n2t0Var) throws RemoteException {
        return n2t0Var.mo12245b4(s050.m181848Y2(this.f69208b), this.f69209c, this.f69210d, this.f69211e, 240304000);
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96270c() throws RemoteException {
        return this.f69212f.f135835a.m143346a(this.f69208b, this.f69209c, this.f69210d, this.f69211e, 4);
    }
}
