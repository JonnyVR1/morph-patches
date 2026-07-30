package p153l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public final class ppr0 extends z4s0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f153577b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzq f153578c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f153579d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ s3s0 f153580e;

    public ppr0(s3s0 s3s0Var, Context context, zzq zzqVar, String str) {
        this.f153577b = context;
        this.f153578c = zzqVar;
        this.f153579d = str;
        this.f153580e = s3s0Var;
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96776a() {
        s3s0.m184296q(this.f153577b, FirebaseAnalytics.Event.SEARCH);
        return new zsv0();
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96777b(tbt0 tbt0Var) throws RemoteException {
        return tbt0Var.mo12291E7(h950.m134038Y2(this.f153577b), this.f153578c, this.f153579d, 240304000);
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96778c() throws RemoteException {
        return this.f153580e.f166028a.m170508a(this.f153577b, this.f153578c, this.f153579d, null, 3);
    }
}
