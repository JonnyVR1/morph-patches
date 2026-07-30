package p153l;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbbz;

/* JADX INFO: loaded from: classes6.dex */
public final class hju0 implements i6u0, efu0 {

    /* JADX INFO: renamed from: a */
    public final o9t0 f110323a;

    /* JADX INFO: renamed from: b */
    public final Context f110324b;

    /* JADX INFO: renamed from: c */
    public final s9t0 f110325c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final View f110326d;

    /* JADX INFO: renamed from: e */
    public String f110327e;

    /* JADX INFO: renamed from: f */
    public final zzbbz f110328f;

    public hju0(o9t0 o9t0Var, Context context, s9t0 s9t0Var, @Nullable View view, zzbbz zzbbzVar) {
        this.f110323a = o9t0Var;
        this.f110324b = context;
        this.f110325c = s9t0Var;
        this.f110326d = view;
        this.f110328f = zzbbzVar;
    }

    @Override // p153l.i6u0
    /* JADX INFO: renamed from: i */
    public final void mo107087i(f5t0 f5t0Var, String str, String str2) {
        if (this.f110325c.m185241p(this.f110324b)) {
            try {
                s9t0 s9t0Var = this.f110325c;
                Context context = this.f110324b;
                s9t0Var.m185237l(context, s9t0Var.m185226a(context), this.f110323a.m166810b(), f5t0Var.zzc(), f5t0Var.zzb());
            } catch (RemoteException e) {
                dct0.m115299h("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // p153l.i6u0
    public final void zza() {
        this.f110323a.m166811i(false);
    }

    @Override // p153l.i6u0
    public final void zzc() {
        View view = this.f110326d;
        if (view != null && this.f110327e != null) {
            this.f110325c.m185240o(view.getContext(), this.f110327e);
        }
        this.f110323a.m166811i(true);
    }

    @Override // p153l.efu0
    public final void zzl() {
        if (this.f110328f == zzbbz.APP_OPEN) {
            return;
        }
        String strM185228c = this.f110325c.m185228c(this.f110324b);
        this.f110327e = strM185228c;
        this.f110327e = String.valueOf(strM185228c).concat(this.f110328f == zzbbz.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // p153l.i6u0
    public final void zzb() {
    }

    @Override // p153l.i6u0
    public final void zze() {
    }

    @Override // p153l.i6u0
    public final void zzf() {
    }

    @Override // p153l.efu0
    public final void zzk() {
    }
}
