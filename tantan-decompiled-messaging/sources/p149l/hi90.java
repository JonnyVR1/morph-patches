package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/hi90;", "", Constants.KEY_OLD_VALUE, Constants.KEY_NEW_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class hi90 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Object oldValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Object newValue;

    public hi90(@Nullable Object obj, @Nullable Object obj2) {
        this.oldValue = obj;
        this.newValue = obj2;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getNewValue() {
        return this.newValue;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getOldValue() {
        return this.oldValue;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof hi90)) {
            return false;
        }
        hi90 hi90Var = (hi90) other;
        return Intrinsics.m87488d(this.oldValue, hi90Var.oldValue) && Intrinsics.m87488d(this.newValue, hi90Var.newValue);
    }

    public int hashCode() {
        Object obj = this.oldValue;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.newValue;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProfileChange(oldValue=" + this.oldValue + ", newValue=" + this.newValue + ')';
    }
}
