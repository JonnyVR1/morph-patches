package p149l;

import kotlin.Metadata;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, m87232d2 = {"Ll/ma5;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "", "a", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "D", "_start", "b", "_endInclusive", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ma5 implements ClosedFloatingPointRange<Double> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final double _start;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final double _endInclusive;

    /* JADX INFO: renamed from: a */
    public boolean m153637a() {
        return this._start > this._endInclusive;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof ma5)) {
            return false;
        }
        if (m153637a() && ((ma5) other).m153637a()) {
            return true;
        }
        ma5 ma5Var = (ma5) other;
        return this._start == ma5Var._start && this._endInclusive == ma5Var._endInclusive;
    }

    public int hashCode() {
        if (m153637a()) {
            return -1;
        }
        return (Double.hashCode(this._start) * 31) + Double.hashCode(this._endInclusive);
    }

    @NotNull
    public String toString() {
        return this._start + ".." + this._endInclusive;
    }
}
