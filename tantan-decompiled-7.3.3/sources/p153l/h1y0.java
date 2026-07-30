package p153l;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdw;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class h1y0 {

    /* JADX INFO: renamed from: a */
    public final Context f107498a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f107499b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f107500c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public String f107501d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Boolean f107502e;

    /* JADX INFO: renamed from: f */
    public long f107503f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public zzdw f107504g;

    /* JADX INFO: renamed from: h */
    public boolean f107505h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Long f107506i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public String f107507j;

    @VisibleForTesting
    public h1y0(Context context, @Nullable zzdw zzdwVar, @Nullable Long l2) {
        this.f107505h = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f107498a = applicationContext;
        this.f107506i = l2;
        if (zzdwVar != null) {
            this.f107504g = zzdwVar;
            this.f107499b = zzdwVar.zzf;
            this.f107500c = zzdwVar.zze;
            this.f107501d = zzdwVar.zzd;
            this.f107505h = zzdwVar.zzc;
            this.f107503f = zzdwVar.zzb;
            this.f107507j = zzdwVar.zzh;
            Bundle bundle = zzdwVar.zzg;
            if (bundle != null) {
                this.f107502e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
