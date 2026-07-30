package p149l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/sh80;", "", "", Constants.KEY_KEY, "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final /* data */ class sh80 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Long value;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sh80(@NotNull String str, boolean z) {
        this(str, Long.valueOf(z ? 1L : 0L));
        str.getClass();
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getValue() {
        return this.value;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof sh80)) {
            return false;
        }
        sh80 sh80Var = (sh80) other;
        return Intrinsics.m87488d(this.key, sh80Var.key) && Intrinsics.m87488d(this.value, sh80Var.value);
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        Long l2 = this.value;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }

    @NotNull
    public String toString() {
        return "Preference(key=" + this.key + ", value=" + this.value + ')';
    }

    public sh80(@NotNull String str, @Nullable Long l2) {
        str.getClass();
        this.key = str;
        this.value = l2;
    }
}
