package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.LongIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0016\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001f\u0010\u001a¨\u0006!"}, m87232d2 = {"Lkotlin/ranges/LongProgression;", "", "", "start", "endInclusive", "step", "<init>", "(JJJ)V", "Lkotlin/collections/LongIterator;", "f", "()Lkotlin/collections/LongIterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "()J", "first", "b", "c", "last", "getStep", "Companion", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class LongProgression implements Iterable<Long>, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long first;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long last;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long step;

    public LongProgression(long j, long j2, long j3) {
        if (j3 == 0) {
            ig3.m135964a("Step must be non-zero.");
            throw null;
        }
        if (j3 == Long.MIN_VALUE) {
            ig3.m135964a("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.first = j;
        this.last = ProgressionUtilKt.m87392d(j, j2, j3);
        this.step = j3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getLast() {
        return this.last;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof LongProgression)) {
            return false;
        }
        if (isEmpty() && ((LongProgression) other).isEmpty()) {
            return true;
        }
        LongProgression longProgression = (LongProgression) other;
        return this.first == longProgression.first && this.last == longProgression.last && this.step == longProgression.step;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public LongIterator iterator() {
        return new LongProgressionIterator(this.first, this.last, this.step);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.first;
        long j2 = this.last;
        long j3 = 31 * (((j ^ (j >>> 32)) * 31) + (j2 ^ (j2 >>> 32)));
        long j4 = this.step;
        return (int) (j3 + (j4 ^ (j4 >>> 32)));
    }

    public boolean isEmpty() {
        long j = this.step;
        long j2 = this.first;
        long j3 = this.last;
        if (j > 0) {
            return j2 > j3;
        }
        return j2 < j3;
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        long j;
        long j2 = this.step;
        long j3 = this.first;
        if (j2 > 0) {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append("..");
            sb.append(this.last);
            sb.append(" step ");
            j = this.step;
        } else {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append(" downTo ");
            sb.append(this.last);
            sb.append(" step ");
            j = -this.step;
        }
        sb.append(j);
        return sb.toString();
    }
}
