package p149l;

import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, m87232d2 = {"Ll/u4f;", "", "Lorg/json/JSONObject;", "header", NotificationCompat.CATEGORY_EVENT, "<init>", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "", "a", "()Ljava/lang/String;", "Lorg/json/JSONObject;", "b", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class u4f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final JSONObject header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final JSONObject event;

    public u4f(@NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2) {
        jSONObject.getClass();
        jSONObject2.getClass();
        this.header = jSONObject;
        this.event = jSONObject2;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m191730a() {
        String string = new JSONArray().put(this.header).put(this.event).toString();
        string.getClass();
        return string;
    }
}
