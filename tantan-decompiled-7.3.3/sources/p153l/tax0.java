package p153l;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbf;

/* JADX INFO: loaded from: classes6.dex */
public final class tax0 {

    /* JADX INFO: renamed from: a */
    @NonNull
    public String f172809a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public String f172810b;

    /* JADX INFO: renamed from: c */
    public long f172811c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public Bundle f172812d;

    public tax0(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j) {
        this.f172809a = str;
        this.f172810b = str2;
        this.f172812d = bundle == null ? new Bundle() : bundle;
        this.f172811c = j;
    }

    /* JADX INFO: renamed from: b */
    public static tax0 m189960b(zzbf zzbfVar) {
        return new tax0(zzbfVar.zza, zzbfVar.zzc, zzbfVar.zzb.m15378F(), zzbfVar.zzd);
    }

    /* JADX INFO: renamed from: a */
    public final zzbf m189961a() {
        return new zzbf(this.f172809a, new zzbe(new Bundle(this.f172812d)), this.f172810b, this.f172811c);
    }

    public final String toString() {
        return "origin=" + this.f172810b + ",name=" + this.f172809a + ",params=" + String.valueOf(this.f172812d);
    }
}
