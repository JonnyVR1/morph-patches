package com.google.android.libraries.places.internal;

import android.content.Context;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.ProductData;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.runtime.TransportRuntime;

/* JADX INFO: loaded from: classes7.dex */
public final class zzkf implements zzkg {
    private static final Integer zza = 79508299;
    private final Transport zzb;

    public zzkf(Context context) {
        TransportRuntime.initialize(context.getApplicationContext());
        this.zzb = TransportRuntime.getInstance().newFactory("cct").getTransport("LE", zzsm.class, new Transformer() { // from class: com.google.android.libraries.places.internal.zzke
            @Override // com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                return ((zzsm) obj).zzao();
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzkg
    public final void zza(zzsm zzsmVar) {
        this.zzb.send(Event.ofData(zzsmVar, ProductData.withProductId(zza)));
    }
}
