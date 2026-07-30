package p149l;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0007*\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Lcom/google/gson/Gson;", "b", "()Lcom/google/gson/Gson;", "", "", "c", "(Ljava/lang/Object;)Ljava/lang/String;", j6f.GPS_DIRECTION_TRUE, "Ljava/lang/reflect/Type;", "type", "a", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "sharedlibrarymanager_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class g0g0 {
    /* JADX INFO: renamed from: a */
    public static final <T> T m123971a(@NotNull String str, @NotNull Type type) {
        str.getClass();
        type.getClass();
        return (T) m123972b().fromJson(str, type);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Gson m123972b() {
        Gson gsonCreate = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().disableHtmlEscaping().create();
        gsonCreate.getClass();
        return gsonCreate;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m123973c(@NotNull Object obj) {
        obj.getClass();
        String json = m123972b().toJson(obj);
        json.getClass();
        return json;
    }
}
