package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "invoke"}, m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
final class PruneWorkRunnableKt$pruneWork$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ WorkDatabase $this_pruneWork;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PruneWorkRunnableKt$pruneWork$1(WorkDatabase workDatabase) {
        super(0);
        this.$this_pruneWork = workDatabase;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$this_pruneWork.workSpecDao().mo163436a();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
