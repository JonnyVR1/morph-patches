package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Ll/ay90;", "", "<init>", "()V", "", "accessToken", "Lorg/json/JSONObject;", "a", "(Ljava/lang/String;)Lorg/json/JSONObject;", Constants.KEY_KEY, "value", "", "b", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "infoCache", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class ay90 {

    @NotNull
    public static final ay90 INSTANCE = new ay90();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, JSONObject> infoCache = new ConcurrentHashMap<>();

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final JSONObject m100866a(@NotNull String accessToken) {
        accessToken.getClass();
        return infoCache.get(accessToken);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m100867b(@NotNull String key, @NotNull JSONObject value) {
        key.getClass();
        value.getClass();
        infoCache.put(key, value);
    }
}
