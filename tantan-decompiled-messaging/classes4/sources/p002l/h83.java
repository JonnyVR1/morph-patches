package p002l;

import kotlin.Metadata;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Ll/h83;", "", "<init>", "()V", "Lkotlin/ranges/IntRange;", "a", "Lkotlin/ranges/IntRange;", "()Lkotlin/ranges/IntRange;", "HIGH_WILLING_LEVEL_RANGE", "b", "LOW_WILLING_LEVEL_RANGE", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h83 {

    @NotNull
    public static final h83 INSTANCE = new h83();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final IntRange HIGH_WILLING_LEVEL_RANGE = new IntRange(1, 3);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final IntRange LOW_WILLING_LEVEL_RANGE = new IntRange(4, 10);

    @NotNull
    /* JADX INFO: renamed from: a */
    public final IntRange m14281a() {
        return HIGH_WILLING_LEVEL_RANGE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final IntRange m14282b() {
        return LOW_WILLING_LEVEL_RANGE;
    }
}
