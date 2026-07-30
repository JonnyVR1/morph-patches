package p153l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class luv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f133660a;

    /* JADX INFO: renamed from: b */
    public final Context f133661b;

    /* JADX INFO: renamed from: c */
    public final zzcei f133662c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f133663d;

    public luv0(xvw0 xvw0Var, Context context, zzcei zzceiVar, @Nullable String str) {
        this.f133660a = xvw0Var;
        this.f133661b = context;
        this.f133662c = zzceiVar;
        this.f133663d = str;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ muv0 m155968a() throws Exception {
        boolean zIsCallerInstantApp = Wrappers.packageManager(this.f133661b).isCallerInstantApp();
        bxy0.m106934r();
        boolean zM12365d = C2098b.m12365d(this.f133661b);
        String str = this.f133662c.zza;
        bxy0.m106934r();
        boolean zM12366e = C2098b.m12366e();
        bxy0.m106934r();
        ApplicationInfo applicationInfo = this.f133661b.getApplicationInfo();
        int i = applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
        Context context = this.f133661b;
        return new muv0(zIsCallerInstantApp, zM12365d, str, zM12366e, i, DynamiteModule.m12529c(context, ModuleDescriptor.MODULE_ID), DynamiteModule.m12528a(context, ModuleDescriptor.MODULE_ID), this.f133663d);
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 35;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f133660a.mo155969R(new Callable() { // from class: l.kuv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f128926a.m155968a();
            }
        });
    }
}
