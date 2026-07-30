package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
final class zzhr extends zzik {
    public zzhr(FetchPhotoRequest fetchPhotoRequest, String str, boolean z, zzki zzkiVar) {
        super(fetchPhotoRequest, null, str, false, zzkiVar);
    }

    @Override // com.google.android.libraries.places.internal.zzik
    public final String zze() {
        return ReminderAction.photo;
    }

    @Override // com.google.android.libraries.places.internal.zzik
    public final Map zzf() {
        FetchPhotoRequest fetchPhotoRequest = (FetchPhotoRequest) zzb();
        PhotoMetadata photoMetadata = fetchPhotoRequest.getPhotoMetadata();
        HashMap map = new HashMap();
        zzik.zzg(map, "maxheight", fetchPhotoRequest.getMaxHeight(), null);
        zzik.zzg(map, "maxwidth", fetchPhotoRequest.getMaxWidth(), null);
        map.put("photoreference", photoMetadata.zzb());
        return map;
    }
}
