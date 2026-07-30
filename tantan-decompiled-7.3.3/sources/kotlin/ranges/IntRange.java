package kotlin.ranges;

import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001bB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001c"}, m88121d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "<init>", "(II)V", "value", "", RXScreenCaptureService.KEY_INDEX, "(I)Z", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f45292l, "()Ljava/lang/Integer;", "j", "Companion", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntRange extends IntProgression implements ClosedRange<Integer>, OpenEndRange<Integer> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final IntRange f64228d = new IntRange(1, 0);

    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lkotlin/ranges/IntRange$Companion;", "", "<init>", "()V", "Lkotlin/ranges/IntRange;", "EMPTY", "Lkotlin/ranges/IntRange;", "a", "()Lkotlin/ranges/IntRange;", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final IntRange m88477a() {
            return IntRange.f64228d;
        }

        private Companion() {
        }
    }

    public IntRange(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // kotlin.ranges.IntProgression
    public boolean equals(@Nullable Object other) {
        if (!(other instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) other).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) other;
        return getFirst() == intRange.getFirst() && getLast() == intRange.getLast();
    }

    @Override // kotlin.ranges.IntProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    /* JADX INFO: renamed from: i */
    public boolean m88474i(int value) {
        return getFirst() <= value && value <= getLast();
    }

    @Override // kotlin.ranges.IntProgression
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public Integer m88475j() {
        return Integer.valueOf(getLast());
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public Integer m88476l() {
        return Integer.valueOf(getFirst());
    }

    @Override // kotlin.ranges.IntProgression
    @NotNull
    public String toString() {
        return getFirst() + ".." + getLast();
    }
}
