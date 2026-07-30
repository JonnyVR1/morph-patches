package p153l;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public final class euk {

    /* JADX INFO: renamed from: a */
    private static final Gson f95880a = m122575a(true);

    /* JADX INFO: renamed from: b */
    private static final Gson f95881b = m122575a(false);

    /* JADX INFO: renamed from: a */
    private static Gson m122575a(boolean z) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        if (z) {
            gsonBuilder.serializeNulls();
        }
        return gsonBuilder.create();
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m122576b(String str, Class<T> cls) {
        return (T) f95880a.fromJson(str, (Class) cls);
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m122577c(String str, Type type) {
        return (T) f95880a.fromJson(str, type);
    }

    /* JADX INFO: renamed from: d */
    public static String m122578d(Object obj) {
        return m122579e(obj, true);
    }

    /* JADX INFO: renamed from: e */
    public static String m122579e(Object obj, boolean z) {
        return (z ? f95880a : f95881b).toJson(obj);
    }
}
