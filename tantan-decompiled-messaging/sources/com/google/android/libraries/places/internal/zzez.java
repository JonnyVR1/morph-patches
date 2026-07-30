package com.google.android.libraries.places.internal;

import com.android.volley.C0918d;
import java.util.Map;
import org.json.JSONObject;
import p149l.qpq;

/* JADX INFO: loaded from: classes7.dex */
final class zzez extends qpq {
    final /* synthetic */ Map zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzez(zzfa zzfaVar, int i, String str, JSONObject jSONObject, C0918d.b bVar, C0918d.a aVar, Map map) {
        super(0, str, null, bVar, aVar);
        this.zza = map;
    }

    @Override // com.android.volley.Request
    public final Map getHeaders() {
        return this.zza;
    }
}
