package p153l;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class abr0 extends z4s0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f69647b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s3s0 f69648c;

    public abr0(s3s0 s3s0Var, Activity activity) {
        this.f69647b = activity;
        this.f69648c = s3s0Var;
    }

    @Override // p153l.z4s0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96776a() {
        s3s0.m184296q(this.f69647b, "ad_overlay");
        return null;
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96777b(tbt0 tbt0Var) throws RemoteException {
        return tbt0Var.mo12300g0(h950.m134038Y2(this.f69647b));
    }

    @Override // p153l.z4s0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96778c() throws RemoteException {
        sgs0.m185829a(this.f69647b);
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168342ia)).booleanValue()) {
            s3s0 s3s0Var = this.f69648c;
            return s3s0Var.f166033f.m165683a(this.f69647b);
        }
        try {
            return q1t0.m174929o8(((u1t0) gct0.m129904b(this.f69647b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new fct0() { // from class: l.q6z0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p153l.fct0
                public final Object zza(Object obj) {
                    return t1t0.m188933o8(obj);
                }
            })).zze(h950.m134038Y2(this.f69647b)));
        } catch (RemoteException | zzcef | NullPointerException e) {
            this.f69648c.f166035h = w2t0.m204592c(this.f69647b.getApplicationContext());
            this.f69648c.f166035h.mo204598b(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
