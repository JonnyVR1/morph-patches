package p149l;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public final class ork {

    /* JADX INFO: renamed from: a */
    private static final Gson f145333a = m165669a(true);

    /* JADX INFO: renamed from: b */
    private static final Gson f145334b = m165669a(false);

    /* JADX INFO: renamed from: a */
    private static Gson m165669a(boolean z) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        if (z) {
            gsonBuilder.serializeNulls();
        }
        return gsonBuilder.create();
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m165670b(String str, Class<T> cls) {
        return (T) f145333a.fromJson(str, (Class) cls);
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m165671c(String str, Type type) {
        return (T) f145333a.fromJson(str, type);
    }

    /* JADX INFO: renamed from: d */
    public static String m165672d(Object obj) {
        return m165673e(obj, true);
    }

    /* JADX INFO: renamed from: e */
    public static String m165673e(Object obj, boolean z) {
        return (z ? f145333a : f145334b).toJson(obj);
    }
}
