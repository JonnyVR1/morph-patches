package p149l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class i4w0 implements y5u0, zxt0, j6u0 {

    /* JADX INFO: renamed from: a */
    public final w4w0 f111487a;

    /* JADX INFO: renamed from: b */
    public final l4w0 f111488b;

    public i4w0(Context context, w4w0 w4w0Var) {
        this.f111487a = w4w0Var;
        this.f111488b = k4w0.m144514a(context, 13);
    }

    @Override // p149l.zxt0
    /* JADX INFO: renamed from: k */
    public final void mo134396k(zze zzeVar) {
        if (((Boolean) l9s0.f127143d.m115379e()).booleanValue()) {
            w4w0 w4w0Var = this.f111487a;
            l4w0 l4w0Var = this.f111488b;
            l4w0Var.zzc(zzeVar.m12250F().toString());
            l4w0Var.mo129461S(false);
            w4w0Var.m201583a(l4w0Var);
        }
    }

    @Override // p149l.j6u0
    public final void zzb() {
        if (((Boolean) l9s0.f127143d.m115379e()).booleanValue()) {
            w4w0 w4w0Var = this.f111487a;
            l4w0 l4w0Var = this.f111488b;
            l4w0Var.mo129461S(true);
            w4w0Var.m201583a(l4w0Var);
        }
    }

    @Override // p149l.y5u0
    public final void zzl() {
        if (((Boolean) l9s0.f127143d.m115379e()).booleanValue()) {
            this.f111488b.zzh();
        }
    }

    @Override // p149l.j6u0
    public final void zza() {
    }

    @Override // p149l.y5u0
    public final void zzk() {
    }
}
