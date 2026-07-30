package com.p046p1.mobile.android.geocoding;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¨\u0006\u0006"}, m87232d2 = {"pnpoly", "", "Lcom/p1/mobile/android/geocoding/Geocoding$Ring;", "lat", "", "lon", "geocoding_release"}, m87233k = 2, m87234mv = {1, 1, 13})
public final class GeocoderKt {
    public static final boolean pnpoly(@NotNull Geocoding.Ring ring, float f, float f2) {
        ring.getClass();
        List<Float> latitudeList = ring.getLatitudeList();
        List<Float> longitudeList = ring.getLongitudeList();
        int size = latitudeList.size() - 1;
        boolean z = false;
        for (int i = 0; i < latitudeList.size(); i++) {
            if ((latitudeList.get(i).floatValue() > f) != (latitudeList.get(size).floatValue() > f)) {
                float fFloatValue = longitudeList.get(size).floatValue();
                Float f3 = longitudeList.get(i);
                f3.getClass();
                float fFloatValue2 = fFloatValue - f3.floatValue();
                Float f4 = latitudeList.get(i);
                f4.getClass();
                float fFloatValue3 = fFloatValue2 * (f - f4.floatValue());
                float fFloatValue4 = latitudeList.get(size).floatValue();
                Float f5 = latitudeList.get(i);
                f5.getClass();
                float fFloatValue5 = fFloatValue3 / (fFloatValue4 - f5.floatValue());
                Float f6 = longitudeList.get(i);
                f6.getClass();
                if (f2 < fFloatValue5 + f6.floatValue()) {
                    z = !z;
                }
            }
            size = i;
        }
        return z;
    }
}
