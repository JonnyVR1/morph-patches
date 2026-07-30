package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C15274a;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1pSDK {
    private static final List<Object> getCurrencyIso4217Code(JSONArray jSONArray) throws JSONException {
        IntRange intRangeM88496l = C15274a.m88496l(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeM88496l, 10));
        Iterator<Integer> it = intRangeM88496l.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((IntIterator) it).nextInt());
            obj.getClass();
            arrayList.add(getRevenue(obj));
        }
        return arrayList;
    }

    @NotNull
    public static final Map<String, Object> getMonetizationNetwork(@NotNull JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        Sequence sequenceM94158g = SequencesKt__SequencesKt.m94158g(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceM94158g) {
            Object obj2 = jSONObject.get((String) obj);
            obj2.getClass();
            linkedHashMap.put(obj, getRevenue(obj2));
        }
        return linkedHashMap;
    }

    private static final Object getRevenue(Object obj) {
        if (obj instanceof JSONArray) {
            return getCurrencyIso4217Code((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return getMonetizationNetwork((JSONObject) obj);
        }
        if (Intrinsics.m88377d(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }
}
