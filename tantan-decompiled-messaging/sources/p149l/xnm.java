package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Reason;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m87232d2 = {"Ll/xnm;", "", Constants.INAPP_DATA_TAG, "c", "a", "b", "Ll/xnm$a;", "Ll/xnm$b;", "Ll/xnm$c;", "Ll/xnm$d;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface xnm {

    /* JADX INFO: renamed from: l.xnm$a */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Ll/xnm$a;", "Ll/xnm;", "", "targetId", "J", "a", "()J", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final /* data */ class C21183a implements xnm {
        /* JADX INFO: renamed from: a */
        public final long m210183a() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: l.xnm$b */
    @Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m87232d2 = {"Ll/xnm$b;", "Ll/xnm;", "", "targetId", "", Reason.TYPE, "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "Ljava/lang/String;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final /* data */ class C21184b implements xnm {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long targetId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String reason;

        public C21184b(long j, @NotNull String str) {
            str.getClass();
            this.targetId = j;
            this.reason = str;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTargetId() {
            return this.targetId;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C21184b)) {
                return false;
            }
            C21184b c21184b = (C21184b) other;
            return this.targetId == c21184b.targetId && Intrinsics.m87488d(this.reason, c21184b.reason);
        }

        public int hashCode() {
            return (Long.hashCode(this.targetId) * 31) + this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "Discarded(targetId=" + this.targetId + ", reason=" + this.reason + ')';
        }
    }

    /* JADX INFO: renamed from: l.xnm$c */
    @Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m87232d2 = {"Ll/xnm$c;", "Ll/xnm;", "", "targetId", "", "message", "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "Ljava/lang/String;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final /* data */ class C21185c implements xnm {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long targetId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String message;

        public C21185c(long j, @NotNull String str) {
            str.getClass();
            this.targetId = j;
            this.message = str;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTargetId() {
            return this.targetId;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C21185c)) {
                return false;
            }
            C21185c c21185c = (C21185c) other;
            return this.targetId == c21185c.targetId && Intrinsics.m87488d(this.message, c21185c.message);
        }

        public int hashCode() {
            return (Long.hashCode(this.targetId) * 31) + this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(targetId=" + this.targetId + ", message=" + this.message + ')';
        }
    }

    /* JADX INFO: renamed from: l.xnm$d */
    @Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m87232d2 = {"Ll/xnm$d;", "Ll/xnm;", "", "targetId", "Lorg/json/JSONObject;", "metadata", "<init>", "(JLorg/json/JSONObject;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Lorg/json/JSONObject;", "getMetadata", "()Lorg/json/JSONObject;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final /* data */ class C21186d implements xnm {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long targetId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final JSONObject metadata;

        public C21186d(long j, @NotNull JSONObject jSONObject) {
            jSONObject.getClass();
            this.targetId = j;
            this.metadata = jSONObject;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getTargetId() {
            return this.targetId;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C21186d)) {
                return false;
            }
            C21186d c21186d = (C21186d) other;
            return this.targetId == c21186d.targetId && Intrinsics.m87488d(this.metadata, c21186d.metadata);
        }

        public int hashCode() {
            return (Long.hashCode(this.targetId) * 31) + this.metadata.hashCode();
        }

        @NotNull
        public String toString() {
            return "ReadyToFetch(targetId=" + this.targetId + ", metadata=" + this.metadata + ')';
        }
    }
}
