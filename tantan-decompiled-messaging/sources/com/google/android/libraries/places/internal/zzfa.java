package com.google.android.libraries.places.internal;

import com.android.volley.C0918d;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import org.json.JSONObject;
import p149l.hf4;
import p149l.sei0;
import p149l.sg50;
import p149l.yuc0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzfa {
    private final yuc0 zza;
    private final zzij zzb;

    public zzfa(yuc0 yuc0Var, zzij zzijVar) {
        this.zza = yuc0Var;
        this.zzb = zzijVar;
    }

    public static /* synthetic */ void zzc(sei0 sei0Var, VolleyError volleyError) {
        try {
            sei0Var.m183660d(zzeu.zza(volleyError));
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    public final Task zza(zzfi zzfiVar, final Class cls) {
        String strZzc = zzfiVar.zzc();
        Map mapZzd = zzfiVar.zzd();
        hf4 hf4VarZza = zzfiVar.zza();
        final sei0 sei0Var = hf4VarZza != null ? new sei0(hf4VarZza) : new sei0();
        final zzez zzezVar = new zzez(this, 0, strZzc, null, new C0918d.b() { // from class: com.google.android.libraries.places.internal.zzew
            @Override // com.android.volley.C0918d.b
            public final void onResponse(Object obj) {
                this.zza.zzb(cls, sei0Var, (JSONObject) obj);
            }
        }, new C0918d.a() { // from class: com.google.android.libraries.places.internal.zzex
            @Override // com.android.volley.C0918d.a
            public final void onErrorResponse(VolleyError volleyError) {
                zzfa.zzc(sei0Var, volleyError);
            }
        }, mapZzd);
        if (hf4VarZza != null) {
            hf4VarZza.mo130732b(new sg50() { // from class: com.google.android.libraries.places.internal.zzey
                @Override // p149l.sg50
                public final void onCanceled() {
                    zzezVar.cancel();
                }
            });
        }
        this.zza.m216099a(zzezVar);
        return sei0Var.m183657a();
    }

    public final /* synthetic */ void zzb(Class cls, sei0 sei0Var, JSONObject jSONObject) {
        try {
            try {
                sei0Var.m183661e((zzfj) this.zzb.zza(jSONObject.toString(), cls));
            } catch (Error | RuntimeException e) {
                zzkd.zzb(e);
                throw e;
            }
        } catch (zzfk e2) {
            sei0Var.m183660d(new ApiException(new Status(8, e2.getMessage())));
        }
    }
}
