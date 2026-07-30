package p153l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class zqr0 extends z4s0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f205653b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzq f205654c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f205655d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ uws0 f205656e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ s3s0 f205657f;

    public zqr0(s3s0 s3s0Var, Context context, zzq zzqVar, String str, uws0 uws0Var) {
        this.f205653b = context;
        this.f205654c = zzqVar;
        this.f205655d = str;
        this.f205656e = uws0Var;
        this.f205657f = s3s0Var;
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96776a() {
        s3s0.m184296q(this.f205653b, "interstitial");
        return new zsv0();
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96777b(tbt0 tbt0Var) throws RemoteException {
        return tbt0Var.mo12290E2(h950.m134038Y2(this.f205653b), this.f205654c, this.f205655d, this.f205656e, 240304000);
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96778c() throws RemoteException {
        return this.f205657f.f166028a.m170508a(this.f205653b, this.f205654c, this.f205655d, this.f205656e, 2);
    }
}
