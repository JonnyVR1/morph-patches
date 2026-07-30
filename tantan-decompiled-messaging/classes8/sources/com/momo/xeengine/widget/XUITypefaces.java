package com.momo.xeengine.widget;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.Keep;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class XUITypefaces {
    private static final HashMap<String, Typeface> sTypefaceCache = new HashMap<>();

    public static synchronized Typeface get(Context context, String str) {
        HashMap<String, Typeface> map;
        try {
            map = sTypefaceCache;
            if (!map.containsKey(str)) {
                map.put(str, str.startsWith("/") ? Typeface.createFromFile(str) : Typeface.createFromAsset(context.getAssets(), str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return map.get(str);
    }
}
