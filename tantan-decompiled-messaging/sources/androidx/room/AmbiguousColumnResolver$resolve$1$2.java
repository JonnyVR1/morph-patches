package androidx.room;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import p149l.dk0;
import p149l.lmr;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m87232d2 = {"<anonymous>", "", "indices", "", "", "invoke"}, m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
final class AmbiguousColumnResolver$resolve$1$2 extends Lambda implements Function1<List<? extends Integer>, Unit> {
    final /* synthetic */ int $mappingIndex;
    final /* synthetic */ List<List<dk0>> $mappingMatches;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AmbiguousColumnResolver$resolve$1$2(List<? extends List<dk0>> list, int i) {
        super(1);
        this.$mappingMatches = list;
        this.$mappingIndex = i;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull List<Integer> list) {
        list.getClass();
        List<Integer> list2 = list;
        Iterator<T> it = list2.iterator();
        if (!it.hasNext()) {
            lmr.m150601a();
            return;
        }
        int iIntValue = ((Number) it.next()).intValue();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            if (iIntValue > iIntValue2) {
                iIntValue = iIntValue2;
            }
        }
        Iterator<T> it2 = list2.iterator();
        if (!it2.hasNext()) {
            lmr.m150601a();
            return;
        }
        int iIntValue3 = ((Number) it2.next()).intValue();
        while (it2.hasNext()) {
            int iIntValue4 = ((Number) it2.next()).intValue();
            if (iIntValue3 < iIntValue4) {
                iIntValue3 = iIntValue4;
            }
        }
        this.$mappingMatches.get(this.$mappingIndex).add(new dk0(new IntRange(iIntValue, iIntValue3), list));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Integer> list) {
        invoke2((List<Integer>) list);
        return Unit.INSTANCE;
    }
}
