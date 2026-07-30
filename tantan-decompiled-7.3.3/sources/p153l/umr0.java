package p153l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class umr0 extends z4s0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f179668b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzq f179669c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f179670d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ uws0 f179671e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ s3s0 f179672f;

    public umr0(s3s0 s3s0Var, Context context, zzq zzqVar, String str, uws0 uws0Var) {
        this.f179668b = context;
        this.f179669c = zzqVar;
        this.f179670d = str;
        this.f179671e = uws0Var;
        this.f179672f = s3s0Var;
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96776a() {
        s3s0.m184296q(this.f179668b, "banner");
        return new zsv0();
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96777b(tbt0 tbt0Var) throws RemoteException {
        return tbt0Var.mo12293Q2(h950.m134038Y2(this.f179668b), this.f179669c, this.f179670d, this.f179671e, 240304000);
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96778c() throws RemoteException {
        return this.f179672f.f166028a.m170508a(this.f179668b, this.f179669c, this.f179670d, this.f179671e, 1);
    }
}
