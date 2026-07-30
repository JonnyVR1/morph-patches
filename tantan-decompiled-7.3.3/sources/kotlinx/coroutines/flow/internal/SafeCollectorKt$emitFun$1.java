package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bui;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements Function3<bui<? super Object>, Object, Continuation<? super Unit>, Object>, SuspendFunction {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, bui.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(bui<? super Object> buiVar, Object obj, Continuation<? super Unit> continuation) {
        return invoke2((bui<Object>) buiVar, obj, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull bui<Object> buiVar, @Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
        return buiVar.emit(obj, continuation);
    }
}
