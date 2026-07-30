package p149l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m87232d2 = {"Ll/j0f;", "Ll/i0f;", "", "data", "iv", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class j0f extends i0f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String iv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0f(@NotNull String str, @NotNull String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.data = str;
        this.iv = str2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getIv() {
        return this.iv;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof j0f)) {
            return false;
        }
        j0f j0fVar = (j0f) other;
        return Intrinsics.m87488d(this.data, j0fVar.data) && Intrinsics.m87488d(this.iv, j0fVar.iv);
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.iv.hashCode();
    }

    @NotNull
    public String toString() {
        return "EncryptionSuccess(data=" + this.data + ", iv=" + this.iv + ')';
    }
}
