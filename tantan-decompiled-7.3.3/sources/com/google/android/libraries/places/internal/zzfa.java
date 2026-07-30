package com.google.android.libraries.places.internal;

import com.android.volley.C0922d;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import org.json.JSONObject;
import p153l.b3d0;
import p153l.gg4;
import p153l.sni0;
import p153l.yo50;

/* JADX INFO: loaded from: classes7.dex */
public final class zzfa {
    private final b3d0 zza;
    private final zzij zzb;

    public zzfa(b3d0 b3d0Var, zzij zzijVar) {
        this.zza = b3d0Var;
        this.zzb = zzijVar;
    }

    public static /* synthetic */ void zzc(sni0 sni0Var, VolleyError volleyError) {
        try {
            sni0Var.m186942d(zzeu.zza(volleyError));
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    public final Task zza(zzfi zzfiVar, final Class cls) {
        String strZzc = zzfiVar.zzc();
        Map mapZzd = zzfiVar.zzd();
        gg4 gg4VarZza = zzfiVar.zza();
        final sni0 sni0Var = gg4VarZza != null ? new sni0(gg4VarZza) : new sni0();
        final zzez zzezVar = new zzez(this, 0, strZzc, null, new C0922d.b() { // from class: com.google.android.libraries.places.internal.zzew
            @Override // com.android.volley.C0922d.b
            public final void onResponse(Object obj) {
                this.zza.zzb(cls, sni0Var, (JSONObject) obj);
            }
        }, new C0922d.a() { // from class: com.google.android.libraries.places.internal.zzex
            @Override // com.android.volley.C0922d.a
            public final void onErrorResponse(VolleyError volleyError) {
                zzfa.zzc(sni0Var, volleyError);
            }
        }, mapZzd);
        if (gg4VarZza != null) {
            gg4VarZza.mo130139b(new yo50() { // from class: com.google.android.libraries.places.internal.zzey
                @Override // p153l.yo50
                public final void onCanceled() {
                    zzezVar.cancel();
                }
            });
        }
        this.zza.m102278a(zzezVar);
        return sni0Var.m186939a();
    }

    public final /* synthetic */ void zzb(Class cls, sni0 sni0Var, JSONObject jSONObject) {
        try {
            try {
                sni0Var.m186943e((zzfj) this.zzb.zza(jSONObject.toString(), cls));
            } catch (Error | RuntimeException e) {
                zzkd.zzb(e);
                throw e;
            }
        } catch (zzfk e2) {
            sni0Var.m186942d(new ApiException(new Status(8, e2.getMessage())));
        }
    }
}
