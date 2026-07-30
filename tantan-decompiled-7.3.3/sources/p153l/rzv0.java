package p153l;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbze;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class rzv0 {

    /* JADX INFO: renamed from: a */
    public final zzbze f165632a;

    /* JADX INFO: renamed from: b */
    public final int f165633b;

    public rzv0(zzbze zzbzeVar, int i) {
        this.f165632a = zzbzeVar;
        this.f165633b = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m183853a() {
        return this.f165633b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final PackageInfo m183854b() {
        return this.f165632a.zzf;
    }

    /* JADX INFO: renamed from: c */
    public final String m183855c() {
        return this.f165632a.zzd;
    }

    /* JADX INFO: renamed from: d */
    public final String m183856d() {
        return epw0.m121874c(this.f165632a.zza.getString("ms"));
    }

    /* JADX INFO: renamed from: e */
    public final String m183857e() {
        return this.f165632a.zzh;
    }

    /* JADX INFO: renamed from: f */
    public final List m183858f() {
        return this.f165632a.zze;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m183859g() {
        return this.f165632a.zzl;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m183860h() {
        return this.f165632a.zza.getBoolean("is_gbid");
    }

    /* JADX INFO: renamed from: i */
    public final boolean m183861i() {
        return this.f165632a.zzk;
    }
}
