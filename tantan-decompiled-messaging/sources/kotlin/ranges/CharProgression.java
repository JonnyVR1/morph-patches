package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\b\u0016\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006\""}, m87232d2 = {"Lkotlin/ranges/CharProgression;", "", "", "start", "endInclusive", "", "step", "<init>", "(CCI)V", "Lkotlin/collections/CharIterator;", "f", "()Lkotlin/collections/CharIterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", b2s.C_ZONE, "()C", "first", "b", "c", "last", "I", "getStep", "Companion", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class CharProgression implements Iterable<Character>, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final char first;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final char last;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int step;

    public CharProgression(char c, char c2, int i) {
        if (i == 0) {
            ig3.m135964a("Step must be non-zero.");
            throw null;
        }
        if (i == Integer.MIN_VALUE) {
            ig3.m135964a("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.first = c;
        this.last = (char) ProgressionUtilKt.m87391c(c, c2, i);
        this.step = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final char getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final char getLast() {
        return this.last;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof CharProgression)) {
            return false;
        }
        if (isEmpty() && ((CharProgression) other).isEmpty()) {
            return true;
        }
        CharProgression charProgression = (CharProgression) other;
        return this.first == charProgression.first && this.last == charProgression.last && this.step == charProgression.step;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public CharIterator iterator() {
        return new CharProgressionIterator(this.first, this.last, this.step);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }

    public boolean isEmpty() {
        int i = this.step;
        int iM87489e = Intrinsics.m87489e(this.first, this.last);
        if (i > 0) {
            return iM87489e > 0;
        }
        return iM87489e < 0;
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i;
        int i2 = this.step;
        char c = this.first;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(c);
            sb.append("..");
            sb.append(this.last);
            sb.append(" step ");
            i = this.step;
        } else {
            sb = new StringBuilder();
            sb.append(c);
            sb.append(" downTo ");
            sb.append(this.last);
            sb.append(" step ");
            i = -this.step;
        }
        sb.append(i);
        return sb.toString();
    }
}
