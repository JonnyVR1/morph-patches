package p149l;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: classes6.dex */
public final class buu0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f77371a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f77372b;

    public buu0(ehx0 ehx0Var, ehx0 ehx0Var2) {
        this.f77371a = ehx0Var;
        this.f77372b = ehx0Var2;
    }

    @Override // p149l.ehx0
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return Wrappers.packageManager((Context) this.f77371a.zzb()).getPackageInfo(((xtu0) this.f77372b).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
