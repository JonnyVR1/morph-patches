package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1vSDK {
    @NotNull
    public static final JSONArray getMonetizationNetwork(@NotNull List<AFd1gSDK> list) {
        list.getClass();
        List<AFd1gSDK> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AFd1gSDK) it.next()).AFAdRevenueData());
        }
        return new JSONArray((Collection) arrayList);
    }

    public static final boolean getRevenue(@NotNull HttpURLConnection httpURLConnection) {
        httpURLConnection.getClass();
        return httpURLConnection.getResponseCode() / 100 == 2;
    }
}
