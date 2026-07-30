package p153l;

import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/zj0;", "", "Lkotlin/ranges/IntRange;", "resultRange", "", "", "resultIndices", "<init>", "(Lkotlin/ranges/IntRange;Ljava/util/List;)V", "a", "Lkotlin/ranges/IntRange;", "b", "()Lkotlin/ranges/IntRange;", "Ljava/util/List;", "()Ljava/util/List;", "room-common"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class zj0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntRange resultRange;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<Integer> resultIndices;

    public zj0(@NotNull IntRange intRange, @NotNull List<Integer> list) {
        intRange.getClass();
        list.getClass();
        this.resultRange = intRange;
        this.resultIndices = list;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<Integer> m219959a() {
        return this.resultIndices;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final IntRange getResultRange() {
        return this.resultRange;
    }
}
