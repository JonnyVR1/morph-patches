package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Reason;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m88121d2 = {"Ll/zpm;", "", Constants.INAPP_DATA_TAG, "c", "a", "b", "Ll/zpm$a;", "Ll/zpm$b;", "Ll/zpm$c;", "Ll/zpm$d;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface zpm {

    /* JADX INFO: renamed from: l.zpm$a */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Ll/zpm$a;", "Ll/zpm;", "", "targetId", "J", "a", "()J", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final /* data */ class C21855a implements zpm {
        /* JADX INFO: renamed from: a */
        public final long m220849a() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: l.zpm$b */
    @Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m88121d2 = {"Ll/zpm$b;", "Ll/zpm;", "", "targetId", "", Reason.TYPE, "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "Ljava/lang/String;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final /* data */ class C21856b implements zpm {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long targetId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String reason;

        public C21856b(long j, @NotNull String str) {
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
            if (!(other instanceof C21856b)) {
                return false;
            }
            C21856b c21856b = (C21856b) other;
            return this.targetId == c21856b.targetId && Intrinsics.m88377d(this.reason, c21856b.reason);
        }

        public int hashCode() {
            return (Long.hashCode(this.targetId) * 31) + this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "Discarded(targetId=" + this.targetId + ", reason=" + this.reason + ')';
        }
    }

    /* JADX INFO: renamed from: l.zpm$c */
    @Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m88121d2 = {"Ll/zpm$c;", "Ll/zpm;", "", "targetId", "", "message", "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "Ljava/lang/String;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final /* data */ class C21857c implements zpm {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long targetId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String message;

        public C21857c(long j, @NotNull String str) {
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
            if (!(other instanceof C21857c)) {
                return false;
            }
            C21857c c21857c = (C21857c) other;
            return this.targetId == c21857c.targetId && Intrinsics.m88377d(this.message, c21857c.message);
        }

        public int hashCode() {
            return (Long.hashCode(this.targetId) * 31) + this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(targetId=" + this.targetId + ", message=" + this.message + ')';
        }
    }

    /* JADX INFO: renamed from: l.zpm$d */
    @Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m88121d2 = {"Ll/zpm$d;", "Ll/zpm;", "", "targetId", "Lorg/json/JSONObject;", "metadata", "<init>", "(JLorg/json/JSONObject;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Lorg/json/JSONObject;", "getMetadata", "()Lorg/json/JSONObject;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final /* data */ class C21858d implements zpm {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long targetId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final JSONObject metadata;

        public C21858d(long j, @NotNull JSONObject jSONObject) {
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
            if (!(other instanceof C21858d)) {
                return false;
            }
            C21858d c21858d = (C21858d) other;
            return this.targetId == c21858d.targetId && Intrinsics.m88377d(this.metadata, c21858d.metadata);
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
