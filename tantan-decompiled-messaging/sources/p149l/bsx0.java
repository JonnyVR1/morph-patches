package p149l;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdw;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class bsx0 {

    /* JADX INFO: renamed from: a */
    public final Context f77135a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f77136b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f77137c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public String f77138d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Boolean f77139e;

    /* JADX INFO: renamed from: f */
    public long f77140f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public zzdw f77141g;

    /* JADX INFO: renamed from: h */
    public boolean f77142h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Long f77143i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public String f77144j;

    @VisibleForTesting
    public bsx0(Context context, @Nullable zzdw zzdwVar, @Nullable Long l2) {
        this.f77142h = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f77135a = applicationContext;
        this.f77143i = l2;
        if (zzdwVar != null) {
            this.f77141g = zzdwVar;
            this.f77136b = zzdwVar.zzf;
            this.f77137c = zzdwVar.zze;
            this.f77138d = zzdwVar.zzd;
            this.f77142h = zzdwVar.zzc;
            this.f77140f = zzdwVar.zzb;
            this.f77144j = zzdwVar.zzh;
            Bundle bundle = zzdwVar.zzg;
            if (bundle != null) {
                this.f77139e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
