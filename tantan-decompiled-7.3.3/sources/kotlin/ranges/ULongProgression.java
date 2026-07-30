package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ppj0;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0017\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b \u0010\u001b¨\u0006\""}, m88121d2 = {"Lkotlin/ranges/ULongProgression;", "", "Lkotlin/ULong;", "start", "endInclusive", "", "step", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "iterator", "()Ljava/util/Iterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "()J", "first", "b", "c", "last", "getStep", "Companion", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class ULongProgression implements Iterable<ULong>, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long first;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long last;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long step;

    public ULongProgression(long j, long j2, long j3) {
        if (j3 == 0) {
            wg3.m206174a("Step must be non-zero.");
            throw null;
        }
        if (j3 == Long.MIN_VALUE) {
            wg3.m206174a("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.first = j;
        this.last = UProgressionUtilKt.m88286c(j, j2, j3);
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
        if (!(other instanceof ULongProgression)) {
            return false;
        }
        if (isEmpty() && ((ULongProgression) other).isEmpty()) {
            return true;
        }
        ULongProgression uLongProgression = (ULongProgression) other;
        return this.first == uLongProgression.first && this.last == uLongProgression.last && this.step == uLongProgression.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.first;
        int iM88177b = ((int) ULong.m88177b(j ^ ULong.m88177b(j >>> 32))) * 31;
        long j2 = this.last;
        int iM88177b2 = (iM88177b + ((int) ULong.m88177b(j2 ^ ULong.m88177b(j2 >>> 32)))) * 31;
        long j3 = this.step;
        return iM88177b2 + ((int) ((j3 >>> 32) ^ j3));
    }

    public boolean isEmpty() {
        long j = this.step;
        int iCompare = Long.compare(this.first ^ Long.MIN_VALUE, this.last ^ Long.MIN_VALUE);
        if (j > 0) {
            return iCompare > 0;
        }
        return iCompare < 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<ULong> iterator() {
        return new ppj0(this.first, this.last, this.step, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        long j;
        long j2 = this.step;
        long j3 = this.first;
        if (j2 > 0) {
            sb = new StringBuilder();
            sb.append((Object) ULong.m88180h(j3));
            sb.append("..");
            sb.append((Object) ULong.m88180h(this.last));
            sb.append(" step ");
            j = this.step;
        } else {
            sb = new StringBuilder();
            sb.append((Object) ULong.m88180h(j3));
            sb.append(" downTo ");
            sb.append((Object) ULong.m88180h(this.last));
            sb.append(" step ");
            j = -this.step;
        }
        sb.append(j);
        return sb.toString();
    }

    public /* synthetic */ ULongProgression(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }
}
