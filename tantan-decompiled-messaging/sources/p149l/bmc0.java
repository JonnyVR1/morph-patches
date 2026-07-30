package p149l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, m87232d2 = {"Ll/bmc0;", "", "", "w", "h", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* data */ class bmc0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int w;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int h;

    public bmc0(int i, int i2) {
        this.w = i;
        this.h = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getW() {
        return this.w;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof bmc0)) {
            return false;
        }
        bmc0 bmc0Var = (bmc0) other;
        return this.w == bmc0Var.w && this.h == bmc0Var.h;
    }

    public int hashCode() {
        return (Integer.hashCode(this.w) * 31) + Integer.hashCode(this.h);
    }

    @NotNull
    public String toString() {
        return "RefVec2(w=" + this.w + ", h=" + this.h + ")";
    }
}
