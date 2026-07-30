package p153l;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class m2s0 extends z4s0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f134610b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f134611c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uws0 f134612d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ s3s0 f134613e;

    public m2s0(s3s0 s3s0Var, Context context, String str, uws0 uws0Var) {
        this.f134610b = context;
        this.f134611c = str;
        this.f134612d = uws0Var;
        this.f134613e = s3s0Var;
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96776a() {
        s3s0.m184296q(this.f134610b, "rewarded");
        return new k1w0();
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96777b(tbt0 tbt0Var) throws RemoteException {
        return tbt0Var.mo12296W2(h950.m134038Y2(this.f134610b), this.f134611c, this.f134612d, 240304000);
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96778c() throws RemoteException {
        return x7t0.m209651a(this.f134610b, this.f134611c, this.f134612d);
    }
}
