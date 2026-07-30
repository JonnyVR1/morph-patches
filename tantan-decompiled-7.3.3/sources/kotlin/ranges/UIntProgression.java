package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.opj0;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0017\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001e\u0010\u0014¨\u0006 "}, m88121d2 = {"Lkotlin/ranges/UIntProgression;", "", "Lkotlin/UInt;", "start", "endInclusive", "", "step", "<init>", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "iterator", "()Ljava/util/Iterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "first", "b", "c", "last", "getStep", "Companion", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class UIntProgression implements Iterable<UInt>, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int first;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int last;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int step;

    public UIntProgression(int i, int i2, int i3) {
        if (i3 == 0) {
            wg3.m206174a("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            wg3.m206174a("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.first = i;
        this.last = UProgressionUtilKt.m88287d(i, i2, i3);
        this.step = i3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getLast() {
        return this.last;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof UIntProgression)) {
            return false;
        }
        if (isEmpty() && ((UIntProgression) other).isEmpty()) {
            return true;
        }
        UIntProgression uIntProgression = (UIntProgression) other;
        return this.first == uIntProgression.first && this.last == uIntProgression.last && this.step == uIntProgression.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }

    public boolean isEmpty() {
        int i = this.step;
        int iCompare = Integer.compare(this.first ^ Integer.MIN_VALUE, this.last ^ Integer.MIN_VALUE);
        if (i > 0) {
            return iCompare > 0;
        }
        return iCompare < 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<UInt> iterator() {
        return new opj0(this.first, this.last, this.step, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i;
        int i2 = this.step;
        int i3 = this.first;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append((Object) UInt.m88157h(i3));
            sb.append("..");
            sb.append((Object) UInt.m88157h(this.last));
            sb.append(" step ");
            i = this.step;
        } else {
            sb = new StringBuilder();
            sb.append((Object) UInt.m88157h(i3));
            sb.append(" downTo ");
            sb.append((Object) UInt.m88157h(this.last));
            sb.append(" step ");
            i = -this.step;
        }
        sb.append(i);
        return sb.toString();
    }

    public /* synthetic */ UIntProgression(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }
}
