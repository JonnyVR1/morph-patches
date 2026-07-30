package p149l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/xge0;", "", "Lorg/json/JSONObject;", "queueHeader", "Lorg/json/JSONArray;", "queue", "<init>", "(Lorg/json/JSONObject;Lorg/json/JSONArray;)V", "", "toString", "()Ljava/lang/String;", "a", "Lorg/json/JSONObject;", "b", "()Lorg/json/JSONObject;", "Lorg/json/JSONArray;", "()Lorg/json/JSONArray;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class xge0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final JSONObject queueHeader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final JSONArray queue;

    public xge0(@Nullable JSONObject jSONObject, @NotNull JSONArray jSONArray) {
        jSONArray.getClass();
        this.queueHeader = jSONObject;
        this.queue = jSONArray;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final JSONArray getQueue() {
        return this.queue;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final JSONObject getQueueHeader() {
        return this.queueHeader;
    }

    @NotNull
    public String toString() {
        if (this.queueHeader == null) {
            String string = this.queue.toString();
            string.getClass();
            return string;
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.queueHeader);
        sb.append(',');
        String string2 = this.queue.toString();
        string2.getClass();
        sb.append(string2.substring(1));
        return sb.toString();
    }
}
