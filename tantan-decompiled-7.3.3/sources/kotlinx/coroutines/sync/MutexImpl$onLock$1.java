package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.gle0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
final /* synthetic */ class MutexImpl$onLock$1 extends FunctionReferenceImpl implements Function3<MutexImpl, gle0<?>, Object, Unit> {
    public static final MutexImpl$onLock$1 INSTANCE = new MutexImpl$onLock$1();

    public MutexImpl$onLock$1() {
        super(3, MutexImpl.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(MutexImpl mutexImpl, gle0<?> gle0Var, Object obj) {
        invoke2(mutexImpl, gle0Var, obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull MutexImpl mutexImpl, @NotNull gle0<?> gle0Var, @Nullable Object obj) {
        mutexImpl.m95243C(gle0Var, obj);
    }
}
