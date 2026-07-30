package p149l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class flv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f98224a;

    /* JADX INFO: renamed from: b */
    public final Context f98225b;

    /* JADX INFO: renamed from: c */
    public final zzcei f98226c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f98227d;

    public flv0(rmw0 rmw0Var, Context context, zzcei zzceiVar, @Nullable String str) {
        this.f98224a = rmw0Var;
        this.f98225b = context;
        this.f98226c = zzceiVar;
        this.f98227d = str;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ glv0 m122101a() throws Exception {
        boolean zIsCallerInstantApp = Wrappers.packageManager(this.f98225b).isCallerInstantApp();
        vny0.m199080r();
        boolean zM12311d = C2075b.m12311d(this.f98225b);
        String str = this.f98226c.zza;
        vny0.m199080r();
        boolean zM12312e = C2075b.m12312e();
        vny0.m199080r();
        ApplicationInfo applicationInfo = this.f98225b.getApplicationInfo();
        int i = applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
        Context context = this.f98225b;
        return new glv0(zIsCallerInstantApp, zM12311d, str, zM12312e, i, DynamiteModule.m12475c(context, ModuleDescriptor.MODULE_ID), DynamiteModule.m12474a(context, ModuleDescriptor.MODULE_ID), this.f98227d);
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 35;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f98224a.mo122102R(new Callable() { // from class: l.elv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f92145a.m122101a();
            }
        });
    }
}
