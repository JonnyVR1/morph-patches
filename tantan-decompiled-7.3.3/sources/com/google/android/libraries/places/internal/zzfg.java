package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.C0922d;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import java.util.Map;
import p153l.b3d0;
import p153l.cl20;
import p153l.gg4;
import p153l.sni0;
import p153l.yo50;

/* JADX INFO: loaded from: classes7.dex */
public final class zzfg {
    private final b3d0 zza;

    public zzfg(b3d0 b3d0Var) {
        this.zza = b3d0Var;
    }

    public static /* synthetic */ void zza(sni0 sni0Var, VolleyError volleyError) {
        ApiException apiExceptionZza;
        try {
            cl20 cl20Var = volleyError.networkResponse;
            if (cl20Var != null) {
                int i = cl20Var.f82338a;
                if (i != 400) {
                    apiExceptionZza = i != 403 ? zzeu.zza(volleyError) : new ApiException(new Status(PlacesStatusCodes.REQUEST_DENIED, "The provided API key is invalid."));
                } else {
                    apiExceptionZza = new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "The provided parameters are invalid (did you include a max width or height?)."));
                }
            }
            sni0Var.m186942d(apiExceptionZza);
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    public static /* synthetic */ void zzc(zzhs zzhsVar, sni0 sni0Var, Bitmap bitmap) {
        try {
            zzhsVar.zzb(bitmap);
            sni0Var.m186943e(zzhsVar.zza());
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    public final Task zzb(zzfi zzfiVar, final zzhs zzhsVar) {
        String strZzc = zzfiVar.zzc();
        Map mapZzd = zzfiVar.zzd();
        gg4 gg4VarZza = zzfiVar.zza();
        final sni0 sni0Var = gg4VarZza != null ? new sni0(gg4VarZza) : new sni0();
        final zzff zzffVar = new zzff(this, strZzc, new C0922d.b() { // from class: com.google.android.libraries.places.internal.zzfc
            @Override // com.android.volley.C0922d.b
            public final void onResponse(Object obj) {
                zzfg.zzc(zzhsVar, sni0Var, (Bitmap) obj);
            }
        }, 0, 0, ImageView.ScaleType.CENTER, Bitmap.Config.ARGB_8888, new C0922d.a() { // from class: com.google.android.libraries.places.internal.zzfd
            @Override // com.android.volley.C0922d.a
            public final void onErrorResponse(VolleyError volleyError) {
                zzfg.zza(sni0Var, volleyError);
            }
        }, mapZzd);
        if (gg4VarZza != null) {
            gg4VarZza.mo130139b(new yo50() { // from class: com.google.android.libraries.places.internal.zzfe
                @Override // p153l.yo50
                public final void onCanceled() {
                    zzffVar.cancel();
                }
            });
        }
        this.zza.m102278a(zzffVar);
        return sni0Var.m186939a();
    }
}
