package p149l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.validation.pipeline.RemovalReason;
import com.p046p1.mobile.putong.core.data.Reason;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, m87232d2 = {"Ll/yqc0;", "", "", Constants.KEY_KEY, "Lcom/clevertap/android/sdk/validation/pipeline/RemovalReason;", Reason.TYPE, "originalValue", "<init>", "(Ljava/lang/String;Lcom/clevertap/android/sdk/validation/pipeline/RemovalReason;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/clevertap/android/sdk/validation/pipeline/RemovalReason;", "c", "()Lcom/clevertap/android/sdk/validation/pipeline/RemovalReason;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class yqc0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final RemovalReason reason;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final Object originalValue;

    public yqc0(@NotNull String str, @NotNull RemovalReason removalReason, @Nullable Object obj) {
        str.getClass();
        removalReason.getClass();
        this.key = str;
        this.reason = removalReason;
        this.originalValue = obj;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getOriginalValue() {
        return this.originalValue;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final RemovalReason getReason() {
        return this.reason;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof yqc0)) {
            return false;
        }
        yqc0 yqc0Var = (yqc0) other;
        return Intrinsics.m87488d(this.key, yqc0Var.key) && this.reason == yqc0Var.reason && Intrinsics.m87488d(this.originalValue, yqc0Var.originalValue);
    }

    public int hashCode() {
        int iHashCode = ((this.key.hashCode() * 31) + this.reason.hashCode()) * 31;
        Object obj = this.originalValue;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public String toString() {
        return "RemovedItem(key=" + this.key + ", reason=" + this.reason + ", originalValue=" + this.originalValue + ')';
    }
}
