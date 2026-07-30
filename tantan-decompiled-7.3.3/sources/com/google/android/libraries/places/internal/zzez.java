package com.google.android.libraries.places.internal;

import com.android.volley.C0922d;
import java.util.Map;
import org.json.JSONObject;
import p153l.qrq;

/* JADX INFO: loaded from: classes7.dex */
final class zzez extends qrq {
    final /* synthetic */ Map zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzez(zzfa zzfaVar, int i, String str, JSONObject jSONObject, C0922d.b bVar, C0922d.a aVar, Map map) {
        super(0, str, null, bVar, aVar);
        this.zza = map;
    }

    @Override // com.android.volley.Request
    public final Map getHeaders() {
        return this.zza;
    }
}
