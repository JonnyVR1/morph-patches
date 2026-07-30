package p153l;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, m88121d2 = {"Ll/gfq0;", "", "", "type", "msg", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "b", "getMsg", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class gfq0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final String msg;

    public /* synthetic */ gfq0(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof gfq0)) {
            return false;
        }
        gfq0 gfq0Var = (gfq0) other;
        return Intrinsics.m88377d(this.type, gfq0Var.type) && Intrinsics.m88377d(this.msg, gfq0Var.msg);
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.msg;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "&&&" + this.type + '=' + this.msg;
    }

    public gfq0(@Nullable String str, @Nullable String str2) {
        this.type = str;
        this.msg = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gfq0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
