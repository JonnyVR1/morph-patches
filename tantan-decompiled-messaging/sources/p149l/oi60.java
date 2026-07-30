package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Ll/oi60;", "", "", "messageId", "Lorg/json/JSONObject;", Constants.KEY_WZRK_PARAMS, "", "expiresAt", "<init>", "(Ljava/lang/String;Lorg/json/JSONObject;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "c", "J", "getExpiresAt", "()J", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class oi60 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String messageId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final JSONObject wzrkParams;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long expiresAt;

    public oi60(@NotNull String str, @Nullable JSONObject jSONObject, long j) {
        str.getClass();
        this.messageId = str;
        this.wzrkParams = jSONObject;
        this.expiresAt = j;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final JSONObject getWzrkParams() {
        return this.wzrkParams;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof oi60)) {
            return false;
        }
        oi60 oi60Var = (oi60) other;
        return Intrinsics.m87488d(this.messageId, oi60Var.messageId) && Intrinsics.m87488d(this.wzrkParams, oi60Var.wzrkParams) && this.expiresAt == oi60Var.expiresAt;
    }

    public int hashCode() {
        int iHashCode = this.messageId.hashCode() * 31;
        JSONObject jSONObject = this.wzrkParams;
        return ((iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31) + Long.hashCode(this.expiresAt);
    }

    @NotNull
    public String toString() {
        return "PendingDelete(messageId=" + this.messageId + ", wzrkParams=" + this.wzrkParams + ", expiresAt=" + this.expiresAt + ')';
    }
}
