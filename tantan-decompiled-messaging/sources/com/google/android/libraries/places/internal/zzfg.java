package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.C0918d;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import java.util.Map;
import p149l.hf4;
import p149l.sc20;
import p149l.sei0;
import p149l.sg50;
import p149l.yuc0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzfg {
    private final yuc0 zza;

    public zzfg(yuc0 yuc0Var) {
        this.zza = yuc0Var;
    }

    public static /* synthetic */ void zza(sei0 sei0Var, VolleyError volleyError) {
        ApiException apiExceptionZza;
        try {
            sc20 sc20Var = volleyError.networkResponse;
            if (sc20Var != null) {
                int i = sc20Var.f163698a;
                if (i != 400) {
                    apiExceptionZza = i != 403 ? zzeu.zza(volleyError) : new ApiException(new Status(PlacesStatusCodes.REQUEST_DENIED, "The provided API key is invalid."));
                } else {
                    apiExceptionZza = new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "The provided parameters are invalid (did you include a max width or height?)."));
                }
            }
            sei0Var.m183660d(apiExceptionZza);
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    public static /* synthetic */ void zzc(zzhs zzhsVar, sei0 sei0Var, Bitmap bitmap) {
        try {
            zzhsVar.zzb(bitmap);
            sei0Var.m183661e(zzhsVar.zza());
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    public final Task zzb(zzfi zzfiVar, final zzhs zzhsVar) {
        String strZzc = zzfiVar.zzc();
        Map mapZzd = zzfiVar.zzd();
        hf4 hf4VarZza = zzfiVar.zza();
        final sei0 sei0Var = hf4VarZza != null ? new sei0(hf4VarZza) : new sei0();
        final zzff zzffVar = new zzff(this, strZzc, new C0918d.b() { // from class: com.google.android.libraries.places.internal.zzfc
            @Override // com.android.volley.C0918d.b
            public final void onResponse(Object obj) {
                zzfg.zzc(zzhsVar, sei0Var, (Bitmap) obj);
            }
        }, 0, 0, ImageView.ScaleType.CENTER, Bitmap.Config.ARGB_8888, new C0918d.a() { // from class: com.google.android.libraries.places.internal.zzfd
            @Override // com.android.volley.C0918d.a
            public final void onErrorResponse(VolleyError volleyError) {
                zzfg.zza(sei0Var, volleyError);
            }
        }, mapZzd);
        if (hf4VarZza != null) {
            hf4VarZza.mo130732b(new sg50() { // from class: com.google.android.libraries.places.internal.zzfe
                @Override // p149l.sg50
                public final void onCanceled() {
                    zzffVar.cancel();
                }
            });
        }
        this.zza.m216099a(zzffVar);
        return sei0Var.m183657a();
    }
}
