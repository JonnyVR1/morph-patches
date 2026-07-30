package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.util.PlatformVersion;

/* JADX INFO: loaded from: classes6.dex */
public final class a8y0 {
    /* JADX INFO: renamed from: a */
    public static final void m95388a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.zzk != 4 || adOverlayInfoParcel.zzc != null) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
            intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzm.zzd);
            intent.putExtra("shouldCallOnOverlayOpened", z);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
            intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
            if (!PlatformVersion.isAtLeastLollipop()) {
                intent.addFlags(524288);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            vny0.m199080r();
            C2075b.m12326s(context, intent);
            return;
        }
        b1r0 b1r0Var = adOverlayInfoParcel.zzb;
        if (b1r0Var != null) {
            b1r0Var.onAdClicked();
        }
        a7u0 a7u0Var = adOverlayInfoParcel.zzu;
        if (a7u0Var != null) {
            a7u0Var.zzs();
        }
        Activity activityZzi = adOverlayInfoParcel.zzd.zzi();
        zzc zzcVar = adOverlayInfoParcel.zza;
        if (zzcVar != null && zzcVar.zzj && activityZzi != null) {
            context = activityZzi;
        }
        vny0.m199072j();
        zzc zzcVar2 = adOverlayInfoParcel.zza;
        c1r0.m104874b(context, zzcVar2, adOverlayInfoParcel.zzi, zzcVar2 != null ? zzcVar2.zzi : null);
    }
}
