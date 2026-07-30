package p149l;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbbz;

/* JADX INFO: loaded from: classes6.dex */
public final class bau0 implements cxt0, y5u0 {

    /* JADX INFO: renamed from: a */
    public final i0t0 f74723a;

    /* JADX INFO: renamed from: b */
    public final Context f74724b;

    /* JADX INFO: renamed from: c */
    public final m0t0 f74725c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final View f74726d;

    /* JADX INFO: renamed from: e */
    public String f74727e;

    /* JADX INFO: renamed from: f */
    public final zzbbz f74728f;

    public bau0(i0t0 i0t0Var, Context context, m0t0 m0t0Var, @Nullable View view, zzbbz zzbbzVar) {
        this.f74723a = i0t0Var;
        this.f74724b = context;
        this.f74725c = m0t0Var;
        this.f74726d = view;
        this.f74728f = zzbbzVar;
    }

    @Override // p149l.cxt0
    /* JADX INFO: renamed from: i */
    public final void mo100929i(zvs0 zvs0Var, String str, String str2) {
        if (this.f74725c.m152537p(this.f74724b)) {
            try {
                m0t0 m0t0Var = this.f74725c;
                Context context = this.f74724b;
                m0t0Var.m152533l(context, m0t0Var.m152522a(context), this.f74723a.m133931b(), zvs0Var.zzc(), zvs0Var.zzb());
            } catch (RemoteException e) {
                x2t0.m206870h("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // p149l.cxt0
    public final void zza() {
        this.f74723a.m133932i(false);
    }

    @Override // p149l.cxt0
    public final void zzc() {
        View view = this.f74726d;
        if (view != null && this.f74727e != null) {
            this.f74725c.m152536o(view.getContext(), this.f74727e);
        }
        this.f74723a.m133932i(true);
    }

    @Override // p149l.y5u0
    public final void zzl() {
        if (this.f74728f == zzbbz.APP_OPEN) {
            return;
        }
        String strM152524c = this.f74725c.m152524c(this.f74724b);
        this.f74727e = strM152524c;
        this.f74727e = String.valueOf(strM152524c).concat(this.f74728f == zzbbz.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // p149l.cxt0
    public final void zzb() {
    }

    @Override // p149l.cxt0
    public final void zze() {
    }

    @Override // p149l.cxt0
    public final void zzf() {
    }

    @Override // p149l.y5u0
    public final void zzk() {
    }
}
