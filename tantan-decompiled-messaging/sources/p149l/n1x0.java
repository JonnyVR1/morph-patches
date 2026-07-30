package p149l;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbf;

/* JADX INFO: loaded from: classes6.dex */
public final class n1x0 {

    /* JADX INFO: renamed from: a */
    @NonNull
    public String f136731a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public String f136732b;

    /* JADX INFO: renamed from: c */
    public long f136733c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public Bundle f136734d;

    public n1x0(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j) {
        this.f136731a = str;
        this.f136732b = str2;
        this.f136734d = bundle == null ? new Bundle() : bundle;
        this.f136733c = j;
    }

    /* JADX INFO: renamed from: b */
    public static n1x0 m157515b(zzbf zzbfVar) {
        return new n1x0(zzbfVar.zza, zzbfVar.zzc, zzbfVar.zzb.m15324F(), zzbfVar.zzd);
    }

    /* JADX INFO: renamed from: a */
    public final zzbf m157516a() {
        return new zzbf(this.f136731a, new zzbe(new Bundle(this.f136734d)), this.f136732b, this.f136733c);
    }

    public final String toString() {
        return "origin=" + this.f136732b + ",name=" + this.f136731a + ",params=" + String.valueOf(this.f136734d);
    }
}
