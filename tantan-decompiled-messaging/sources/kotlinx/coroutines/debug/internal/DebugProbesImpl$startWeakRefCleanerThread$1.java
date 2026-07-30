package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m87232d2 = {"<anonymous>", "", "invoke"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
final class DebugProbesImpl$startWeakRefCleanerThread$1 extends Lambda implements Function0<Unit> {
    public static final DebugProbesImpl$startWeakRefCleanerThread$1 INSTANCE = new DebugProbesImpl$startWeakRefCleanerThread$1();

    public DebugProbesImpl$startWeakRefCleanerThread$1() {
        super(0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C15422a.callerInfoCache.m94021j();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
