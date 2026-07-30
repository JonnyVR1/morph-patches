package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class iyv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final zzfk f115491a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final zzbpp f115492b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final qcv0 f115493c;

    /* JADX INFO: renamed from: d */
    public final zzl f115494d;

    /* JADX INFO: renamed from: e */
    public final zzq f115495e;

    /* JADX INFO: renamed from: f */
    public final String f115496f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f115497g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f115498h;

    /* JADX INFO: renamed from: i */
    public final zzbjb f115499i;

    /* JADX INFO: renamed from: j */
    public final zzw f115500j;

    /* JADX INFO: renamed from: k */
    public final int f115501k;

    /* JADX INFO: renamed from: l */
    public final AdManagerAdViewOptions f115502l;

    /* JADX INFO: renamed from: m */
    public final PublisherAdViewOptions f115503m;

    /* JADX INFO: renamed from: n */
    public final sys0 f115504n;

    /* JADX INFO: renamed from: o */
    public final rxv0 f115505o;

    /* JADX INFO: renamed from: p */
    public final boolean f115506p;

    /* JADX INFO: renamed from: q */
    public final boolean f115507q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public final t3t0 f115508r;

    public /* synthetic */ iyv0(gyv0 gyv0Var, hyv0 hyv0Var) {
        this.f115495e = gyv0Var.f105047b;
        this.f115496f = gyv0Var.f105048c;
        this.f115508r = gyv0Var.f105064s;
        int i = gyv0Var.f105046a.zza;
        long j = gyv0Var.f105046a.zzb;
        Bundle bundle = gyv0Var.f105046a.zzc;
        int i2 = gyv0Var.f105046a.zzd;
        List list = gyv0Var.f105046a.zze;
        boolean z = gyv0Var.f105046a.zzf;
        int i3 = gyv0Var.f105046a.zzg;
        boolean z2 = true;
        if (!gyv0Var.f105046a.zzh && !gyv0Var.f105050e) {
            z2 = false;
        }
        this.f115494d = new zzl(i, j, bundle, i2, list, z, i3, z2, gyv0Var.f105046a.zzi, gyv0Var.f105046a.zzj, gyv0Var.f105046a.zzk, gyv0Var.f105046a.zzl, gyv0Var.f105046a.zzm, gyv0Var.f105046a.zzn, gyv0Var.f105046a.zzo, gyv0Var.f105046a.zzp, gyv0Var.f105046a.zzq, gyv0Var.f105046a.zzr, gyv0Var.f105046a.zzs, gyv0Var.f105046a.zzt, gyv0Var.f105046a.zzu, gyv0Var.f105046a.zzv, C2075b.m12290A(gyv0Var.f105046a.zzw), gyv0Var.f105046a.zzx, gyv0Var.f105046a.zzy);
        this.f115491a = gyv0Var.f105049d != null ? gyv0Var.f105049d : gyv0Var.f105053h != null ? gyv0Var.f105053h.zzf : null;
        this.f115497g = gyv0Var.f105051f;
        this.f115498h = gyv0Var.f105052g;
        this.f115499i = gyv0Var.f105051f == null ? null : gyv0Var.f105053h == null ? new zzbjb(new h520.C17226a().m129366a()) : gyv0Var.f105053h;
        this.f115500j = gyv0Var.f105054i;
        this.f115501k = gyv0Var.f105058m;
        this.f115502l = gyv0Var.f105055j;
        this.f115503m = gyv0Var.f105056k;
        this.f115504n = gyv0Var.f105057l;
        this.f115492b = gyv0Var.f105059n;
        this.f115505o = new rxv0(gyv0Var.f105060o, null);
        this.f115506p = gyv0Var.f105061p;
        this.f115493c = gyv0Var.f105062q;
        this.f115507q = gyv0Var.f105063r;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final ces0 m139021a() {
        PublisherAdViewOptions publisherAdViewOptions = this.f115503m;
        if (publisherAdViewOptions == null && this.f115502l == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.m12232H() : this.f115502l.m12230H();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m139022b() {
        return this.f115496f.matches((String) d1s0.m109677c().m144697a(m7s0.f132111W2));
    }
}
