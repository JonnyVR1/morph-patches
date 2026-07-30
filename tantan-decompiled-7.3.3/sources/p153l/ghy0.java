package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.util.PlatformVersion;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class ghy0 {
    /* JADX INFO: renamed from: a */
    public static final void m130283a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
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
                intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            }
            bxy0.m106934r();
            C2098b.m12380s(context, intent);
            return;
        }
        har0 har0Var = adOverlayInfoParcel.zzb;
        if (har0Var != null) {
            har0Var.onAdClicked();
        }
        ggu0 ggu0Var = adOverlayInfoParcel.zzu;
        if (ggu0Var != null) {
            ggu0Var.zzs();
        }
        Activity activityZzi = adOverlayInfoParcel.zzd.zzi();
        zzc zzcVar = adOverlayInfoParcel.zza;
        if (zzcVar != null && zzcVar.zzj && activityZzi != null) {
            context = activityZzi;
        }
        bxy0.m106926j();
        zzc zzcVar2 = adOverlayInfoParcel.zza;
        iar0.m139205b(context, zzcVar2, adOverlayInfoParcel.zzi, zzcVar2 != null ? zzcVar2.zzi : null);
    }
}
