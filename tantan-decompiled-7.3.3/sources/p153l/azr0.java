package p153l;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class azr0 extends z4s0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FrameLayout f74178b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FrameLayout f74179c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f74180d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ s3s0 f74181e;

    public azr0(s3s0 s3s0Var, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f74178b = frameLayout;
        this.f74179c = frameLayout2;
        this.f74180d = context;
        this.f74181e = s3s0Var;
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96776a() {
        s3s0.m184296q(this.f74180d, "native_ad_view_delegate");
        return new qwv0();
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96777b(tbt0 tbt0Var) throws RemoteException {
        return tbt0Var.mo12298b1(h950.m134038Y2(this.f74178b), h950.m134038Y2(this.f74179c));
    }

    @Override // p153l.z4s0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96778c() throws RemoteException {
        sgs0.m185829a(this.f74180d);
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168342ia)).booleanValue()) {
            s3s0 s3s0Var = this.f74181e;
            return s3s0Var.f166031d.m173082a(this.f74180d, this.f74178b, this.f74179c);
        }
        try {
            return dls0.m116863o8(((hls0) gct0.m129904b(this.f74180d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new fct0() { // from class: l.sxr0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p153l.fct0
                public final Object zza(Object obj) {
                    return gls0.m130697o8(obj);
                }
            })).mo126168i1(h950.m134038Y2(this.f74180d), h950.m134038Y2(this.f74178b), h950.m134038Y2(this.f74179c), 240304000));
        } catch (RemoteException | zzcef | NullPointerException e) {
            this.f74181e.f166035h = w2t0.m204592c(this.f74180d);
            this.f74181e.f166035h.mo204598b(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
