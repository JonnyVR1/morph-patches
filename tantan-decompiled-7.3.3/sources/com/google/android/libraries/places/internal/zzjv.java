package com.google.android.libraries.places.internal;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class zzjv {
    private static final zznx zza = zznx.zzo("accessibilityOptions", "addressComponents", "attributions", "businessStatus", "curbsidePickup", "currentOpeningHours", "delivery", "dineIn", "displayName", "editorialSummary", "formattedAddress", "iconBackgroundColor", "iconMaskBaseUri", "id", "internationalPhoneNumber", "location", "photos", "plusCode", "priceLevel", "primaryType", "primaryTypeDisplayName", "rating", "regularOpeningHours", "regularSecondaryOpeningHours", "reservable", "reviews", "servesBeer", "servesBreakfast", "servesBrunch", "servesDinner", "servesLunch", "servesVegetarianFood", "servesWine", "takeout", "types", "userRatingCount", "utcOffsetMinutes", "viewport", "websiteUri");

    public static String zza(List list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add("attributions");
        return zzc(arrayList, true);
    }

    public static String zzb(List list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add("attributions");
        return zzc(arrayList, false);
    }

    private static String zzc(List list, boolean z) {
        if (list.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strConcat = (String) it.next();
            if (z) {
                strConcat = "places.".concat(String.valueOf(strConcat));
            }
            arrayList.add(strConcat);
        }
        return zzmh.zzc(Constants.SEPARATOR_COMMA).zzf(arrayList);
    }
}
