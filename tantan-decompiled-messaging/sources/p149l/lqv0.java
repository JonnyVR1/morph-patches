package p149l;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbze;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class lqv0 {

    /* JADX INFO: renamed from: a */
    public final zzbze f129439a;

    /* JADX INFO: renamed from: b */
    public final int f129440b;

    public lqv0(zzbze zzbzeVar, int i) {
        this.f129439a = zzbzeVar;
        this.f129440b = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m151096a() {
        return this.f129440b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final PackageInfo m151097b() {
        return this.f129439a.zzf;
    }

    /* JADX INFO: renamed from: c */
    public final String m151098c() {
        return this.f129439a.zzd;
    }

    /* JADX INFO: renamed from: d */
    public final String m151099d() {
        return yfw0.m214595c(this.f129439a.zza.getString("ms"));
    }

    /* JADX INFO: renamed from: e */
    public final String m151100e() {
        return this.f129439a.zzh;
    }

    /* JADX INFO: renamed from: f */
    public final List m151101f() {
        return this.f129439a.zze;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m151102g() {
        return this.f129439a.zzl;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m151103h() {
        return this.f129439a.zza.getBoolean("is_gbid");
    }

    /* JADX INFO: renamed from: i */
    public final boolean m151104i() {
        return this.f129439a.zzk;
    }
}
