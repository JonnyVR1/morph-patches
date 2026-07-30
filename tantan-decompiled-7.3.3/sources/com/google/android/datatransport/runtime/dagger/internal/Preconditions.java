package com.google.android.datatransport.runtime.dagger.internal;

import p153l.mnd0;
import p153l.rrc0;
import p153l.wg3;

/* JADX INFO: loaded from: classes6.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static <T> void checkBuilderRequirement(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        rrc0.m182720a(cls.getCanonicalName(), " must be set");
    }

    public static <T> T checkNotNull(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        if (!str.contains("%s")) {
            wg3.m206174a("errorMessageTemplate has no format specifiers");
            return null;
        }
        if (str.indexOf("%s") == str.lastIndexOf("%s")) {
            mnd0.m159157a(str.replace("%s", obj instanceof Class ? ((Class) obj).getCanonicalName() : String.valueOf(obj)));
            return null;
        }
        wg3.m206174a("errorMessageTemplate has more than one format specifier");
        return null;
    }

    public static <T> T checkNotNullFromComponent(T t) {
        if (t != null) {
            return t;
        }
        mnd0.m159157a("Cannot return null from a non-@Nullable component method");
        return null;
    }

    public static <T> T checkNotNullFromProvides(T t) {
        if (t != null) {
            return t;
        }
        mnd0.m159157a("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        mnd0.m159157a(str);
        return null;
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }
}
