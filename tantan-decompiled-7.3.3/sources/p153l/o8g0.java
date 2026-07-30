package p153l;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0007*\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Lcom/google/gson/Gson;", "b", "()Lcom/google/gson/Gson;", "", "", "c", "(Ljava/lang/Object;)Ljava/lang/String;", p7f.GPS_DIRECTION_TRUE, "Ljava/lang/reflect/Type;", "type", "a", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "sharedlibrarymanager_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class o8g0 {
    /* JADX INFO: renamed from: a */
    public static final <T> T m166573a(@NotNull String str, @NotNull Type type) {
        str.getClass();
        type.getClass();
        return (T) m166574b().fromJson(str, type);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Gson m166574b() {
        Gson gsonCreate = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().disableHtmlEscaping().create();
        gsonCreate.getClass();
        return gsonCreate;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m166575c(@NotNull Object obj) {
        obj.getClass();
        String json = m166574b().toJson(obj);
        json.getClass();
        return json;
    }
}
