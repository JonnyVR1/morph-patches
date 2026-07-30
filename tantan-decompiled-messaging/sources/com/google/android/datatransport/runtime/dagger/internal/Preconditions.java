package com.google.android.datatransport.runtime.dagger.internal;

import p149l.ig3;
import p149l.jfd0;
import p149l.kjc0;

/* JADX INFO: loaded from: classes6.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static <T> void checkBuilderRequirement(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        kjc0.m146216a(cls.getCanonicalName(), " must be set");
    }

    public static <T> T checkNotNull(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        if (!str.contains("%s")) {
            ig3.m135964a("errorMessageTemplate has no format specifiers");
            return null;
        }
        if (str.indexOf("%s") == str.lastIndexOf("%s")) {
            jfd0.m141176a(str.replace("%s", obj instanceof Class ? ((Class) obj).getCanonicalName() : String.valueOf(obj)));
            return null;
        }
        ig3.m135964a("errorMessageTemplate has more than one format specifier");
        return null;
    }

    public static <T> T checkNotNullFromComponent(T t) {
        if (t != null) {
            return t;
        }
        jfd0.m141176a("Cannot return null from a non-@Nullable component method");
        return null;
    }

    public static <T> T checkNotNullFromProvides(T t) {
        if (t != null) {
            return t;
        }
        jfd0.m141176a("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        jfd0.m141176a(str);
        return null;
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }
}
