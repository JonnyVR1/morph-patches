package com.momo.xeengine.utils;

import androidx.annotation.Keep;
import java.util.Collection;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class CollectionUtil {
    private CollectionUtil() {
    }

    public static boolean isEmpty(Collection collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }
}
