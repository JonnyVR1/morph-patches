package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.bde0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
public /* synthetic */ class LazyActorCoroutine$onSend$1 extends FunctionReferenceImpl implements Function3<LazyActorCoroutine<?>, bde0<?>, Object, Unit> {
    public static final LazyActorCoroutine$onSend$1 INSTANCE = new LazyActorCoroutine$onSend$1();

    public LazyActorCoroutine$onSend$1() {
        super(3, LazyActorCoroutine.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyActorCoroutine<?> lazyActorCoroutine, bde0<?> bde0Var, Object obj) throws Throwable {
        invoke2(lazyActorCoroutine, bde0Var, obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LazyActorCoroutine<?> lazyActorCoroutine, @NotNull bde0<?> bde0Var, @Nullable Object obj) throws Throwable {
        lazyActorCoroutine.m93978k1(bde0Var, obj);
    }
}
