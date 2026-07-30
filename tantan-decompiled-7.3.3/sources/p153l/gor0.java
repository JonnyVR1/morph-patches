package p153l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public final class gor0 extends z4s0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f105338b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzq f105339c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f105340d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ uws0 f105341e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ s3s0 f105342f;

    public gor0(s3s0 s3s0Var, Context context, zzq zzqVar, String str, uws0 uws0Var) {
        this.f105338b = context;
        this.f105339c = zzqVar;
        this.f105340d = str;
        this.f105341e = uws0Var;
        this.f105342f = s3s0Var;
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96776a() {
        s3s0.m184296q(this.f105338b, FirebaseAnalytics.Event.APP_OPEN);
        return new zsv0();
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96777b(tbt0 tbt0Var) throws RemoteException {
        return tbt0Var.mo12299b4(h950.m134038Y2(this.f105338b), this.f105339c, this.f105340d, this.f105341e, 240304000);
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96778c() throws RemoteException {
        return this.f105342f.f166028a.m170508a(this.f105338b, this.f105339c, this.f105340d, this.f105341e, 4);
    }
}
