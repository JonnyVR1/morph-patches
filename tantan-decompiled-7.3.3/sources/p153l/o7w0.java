package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class o7w0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final zzfk f145315a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final zzbpp f145316b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final wlv0 f145317c;

    /* JADX INFO: renamed from: d */
    public final zzl f145318d;

    /* JADX INFO: renamed from: e */
    public final zzq f145319e;

    /* JADX INFO: renamed from: f */
    public final String f145320f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f145321g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f145322h;

    /* JADX INFO: renamed from: i */
    public final zzbjb f145323i;

    /* JADX INFO: renamed from: j */
    public final zzw f145324j;

    /* JADX INFO: renamed from: k */
    public final int f145325k;

    /* JADX INFO: renamed from: l */
    public final AdManagerAdViewOptions f145326l;

    /* JADX INFO: renamed from: m */
    public final PublisherAdViewOptions f145327m;

    /* JADX INFO: renamed from: n */
    public final y7t0 f145328n;

    /* JADX INFO: renamed from: o */
    public final x6w0 f145329o;

    /* JADX INFO: renamed from: p */
    public final boolean f145330p;

    /* JADX INFO: renamed from: q */
    public final boolean f145331q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public final zct0 f145332r;

    public /* synthetic */ o7w0(m7w0 m7w0Var, n7w0 n7w0Var) {
        this.f145319e = m7w0Var.f135114b;
        this.f145320f = m7w0Var.f135115c;
        this.f145332r = m7w0Var.f135131s;
        int i = m7w0Var.f135113a.zza;
        long j = m7w0Var.f135113a.zzb;
        Bundle bundle = m7w0Var.f135113a.zzc;
        int i2 = m7w0Var.f135113a.zzd;
        List list = m7w0Var.f135113a.zze;
        boolean z = m7w0Var.f135113a.zzf;
        int i3 = m7w0Var.f135113a.zzg;
        boolean z2 = true;
        if (!m7w0Var.f135113a.zzh && !m7w0Var.f135117e) {
            z2 = false;
        }
        this.f145318d = new zzl(i, j, bundle, i2, list, z, i3, z2, m7w0Var.f135113a.zzi, m7w0Var.f135113a.zzj, m7w0Var.f135113a.zzk, m7w0Var.f135113a.zzl, m7w0Var.f135113a.zzm, m7w0Var.f135113a.zzn, m7w0Var.f135113a.zzo, m7w0Var.f135113a.zzp, m7w0Var.f135113a.zzq, m7w0Var.f135113a.zzr, m7w0Var.f135113a.zzs, m7w0Var.f135113a.zzt, m7w0Var.f135113a.zzu, m7w0Var.f135113a.zzv, C2098b.m12344A(m7w0Var.f135113a.zzw), m7w0Var.f135113a.zzx, m7w0Var.f135113a.zzy);
        this.f145315a = m7w0Var.f135116d != null ? m7w0Var.f135116d : m7w0Var.f135120h != null ? m7w0Var.f135120h.zzf : null;
        this.f145321g = m7w0Var.f135118f;
        this.f145322h = m7w0Var.f135119g;
        this.f145323i = m7w0Var.f135118f == null ? null : m7w0Var.f135120h == null ? new zzbjb(new pd20.C19353a().m171774a()) : m7w0Var.f135120h;
        this.f145324j = m7w0Var.f135121i;
        this.f145325k = m7w0Var.f135125m;
        this.f145326l = m7w0Var.f135122j;
        this.f145327m = m7w0Var.f135123k;
        this.f145328n = m7w0Var.f135124l;
        this.f145316b = m7w0Var.f135126n;
        this.f145329o = new x6w0(m7w0Var.f135127o, null);
        this.f145330p = m7w0Var.f135128p;
        this.f145317c = m7w0Var.f135129q;
        this.f145331q = m7w0Var.f135130r;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final ins0 m166385a() {
        PublisherAdViewOptions publisherAdViewOptions = this.f145327m;
        if (publisherAdViewOptions == null && this.f145326l == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.m12286H() : this.f145326l.m12284H();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m166386b() {
        return this.f145320f.matches((String) jas0.m144075c().m176505a(sgs0.f168182W2));
    }
}
