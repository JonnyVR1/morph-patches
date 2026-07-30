package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.C0922d;
import java.util.Map;
import p153l.lkm;

/* JADX INFO: loaded from: classes7.dex */
final class zzff extends lkm {
    final /* synthetic */ Map zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzff(zzfg zzfgVar, String str, C0922d.b bVar, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, C0922d.a aVar, Map map) {
        super(str, bVar, 0, 0, scaleType, config, aVar);
        this.zza = map;
    }

    @Override // com.android.volley.Request
    public final Map getHeaders() {
        return this.zza;
    }
}
