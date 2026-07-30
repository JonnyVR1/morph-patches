package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "R", "invoke", "()[Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 176)
@SourceDebugExtension
public final class FlowKt__ZipKt$combine$5$1 extends Lambda implements Function0<Object[]> {
    final /* synthetic */ eri<Object>[] $flows;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$5$1(eri<Object>[] eriVarArr) {
        super(0);
        this.$flows = eriVarArr;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object[] invoke() {
        int length = this.$flows.length;
        Intrinsics.m87493i(0, "T?");
        return new Object[length];
    }
}
