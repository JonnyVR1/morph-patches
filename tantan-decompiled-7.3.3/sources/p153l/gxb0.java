package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u000fR\"\u0010\u0019\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, m88121d2 = {"Ll/gxb0;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "Lorg/json/JSONArray;", "a", "Lorg/json/JSONArray;", "()Lorg/json/JSONArray;", "data", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "eventIds", "c", Constants.INAPP_DATA_TAG, "profileEventIds", "", "Z", "()Z", "f", "(Z)V", "hasMore", "e", "isEmpty", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class gxb0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final JSONArray data = new JSONArray();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<String> eventIds = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<String> profileEventIds = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean hasMore;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final JSONArray getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<String> m132815b() {
        return this.eventIds;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<String> m132817d() {
        return this.profileEventIds;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m132818e() {
        return this.data.length() <= 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m132819f(boolean z) {
        this.hasMore = z;
    }

    @NotNull
    public String toString() {
        return "QueueData: numItems=" + this.data.length() + ", eventIds=" + this.eventIds.size() + ", profileEventIds=" + this.profileEventIds.size();
    }
}
