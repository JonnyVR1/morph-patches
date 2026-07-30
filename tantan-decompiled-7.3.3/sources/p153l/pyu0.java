package p153l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class pyu0 implements dyu0 {

    /* JADX INFO: renamed from: a */
    public final long f154693a;

    /* JADX INFO: renamed from: b */
    public final emv0 f154694b;

    public pyu0(long j, Context context, iyu0 iyu0Var, dlt0 dlt0Var, String str) {
        this.f154693a = j;
        m4w0 m4w0VarMo116891y = dlt0Var.mo116891y();
        m4w0VarMo116891y.zzc(context);
        m4w0VarMo116891y.mo157064a(new zzq());
        m4w0VarMo116891y.zzb(str);
        emv0 emv0VarZza = m4w0VarMo116891y.zzd().zza();
        this.f154694b = emv0VarZza;
        emv0VarZza.mo113778x2(new oyu0(this, iyu0Var));
    }

    @Override // p153l.dyu0
    /* JADX INFO: renamed from: a */
    public final void mo118725a(zzl zzlVar) {
        this.f154694b.mo113762f2(zzlVar);
    }

    @Override // p153l.dyu0
    public final void zza() {
        this.f154694b.mo113764g();
    }

    @Override // p153l.dyu0
    public final void zzc() {
        this.f154694b.mo113756P7(h950.m134038Y2(null));
    }
}
