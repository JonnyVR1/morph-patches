package p153l;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: classes6.dex */
public final class h3v0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f107697a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f107698b;

    public h3v0(kqx0 kqx0Var, kqx0 kqx0Var2) {
        this.f107697a = kqx0Var;
        this.f107698b = kqx0Var2;
    }

    @Override // p153l.kqx0
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return Wrappers.packageManager((Context) this.f107697a.zzb()).getPackageInfo(((d3v0) this.f107698b).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
