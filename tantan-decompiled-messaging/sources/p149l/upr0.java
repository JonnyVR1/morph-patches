package p149l;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class upr0 extends tvr0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FrameLayout f177661b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FrameLayout f177662c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f177663d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ mur0 f177664e;

    public upr0(mur0 mur0Var, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f177661b = frameLayout;
        this.f177662c = frameLayout2;
        this.f177663d = context;
        this.f177664e = mur0Var;
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96268a() {
        mur0.m156440q(this.f177663d, "native_ad_view_delegate");
        return new knv0();
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96269b(n2t0 n2t0Var) throws RemoteException {
        return n2t0Var.mo12244b1(s050.m181848Y2(this.f177661b), s050.m181848Y2(this.f177662c));
    }

    @Override // p149l.tvr0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96270c() throws RemoteException {
        m7s0.m153417a(this.f177663d);
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132271ia)).booleanValue()) {
            mur0 mur0Var = this.f177664e;
            return mur0Var.f135838d.m141161a(this.f177663d, this.f177661b, this.f177662c);
        }
        try {
            return xbs0.m207734o8(((bcs0) a3t0.m94733b(this.f177663d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new z2t0() { // from class: l.mor0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p149l.z2t0
                public final Object zza(Object obj) {
                    return acs0.m95835o8(obj);
                }
            })).mo101123i1(s050.m181848Y2(this.f177663d), s050.m181848Y2(this.f177661b), s050.m181848Y2(this.f177662c), 240304000));
        } catch (RemoteException | zzcef | NullPointerException e) {
            this.f177664e.f135842h = qts0.m176477c(this.f177663d);
            this.f177664e.f135842h.mo176483b(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
