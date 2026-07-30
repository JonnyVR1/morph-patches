package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.C15414a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fri;
import p149l.j6f;
import p149l.qkq0;
import p149l.su40;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/a;", "", "value", "", "<anonymous>", "(Lkotlinx/coroutines/channels/a;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", m87374f = "Delay.kt", m87375l = {236}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements Function2<C15414a<? extends Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ fri<Object> $downstream;
    final /* synthetic */ Ref.ObjectRef<Object> $lastValue;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(Ref.ObjectRef<Object> objectRef, fri<Object> friVar, Continuation<? super FlowKt__DelayKt$debounceInternal$1$3$2> continuation) {
        super(2, continuation);
        this.$lastValue = objectRef;
        this.$downstream = friVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.$lastValue, this.$downstream, continuation);
        flowKt__DelayKt$debounceInternal$1$3$2.L$0 = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(C15414a<? extends Object> c15414a, Continuation<? super Unit> continuation) {
        return m224665invokeWpGqRn0(c15414a.getHolder(), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m224665invokeWpGqRn0(@NotNull Object obj, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(C15414a.m93991b(obj), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [T, l.yfh0] */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Ref.ObjectRef<Object> objectRef;
        Ref.ObjectRef<Object> objectRef2;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            ?? holder = ((C15414a) this.L$0).getHolder();
            objectRef = this.$lastValue;
            boolean z = holder instanceof C15414a.c;
            if (!z) {
                objectRef.element = holder;
            }
            fri<Object> friVar = this.$downstream;
            if (z) {
                Throwable thM93994e = C15414a.m93994e(holder);
                if (thM93994e != null) {
                    throw thM93994e;
                }
                Object obj2 = objectRef.element;
                if (obj2 != null) {
                    Object obj3 = obj2 != su40.f166433a ? obj2 : null;
                    this.L$0 = holder;
                    this.L$1 = objectRef;
                    this.label = 1;
                    if (friVar.emit(obj3, this) == objM196133e) {
                        return objM196133e;
                    }
                    objectRef2 = objectRef;
                }
                objectRef.element = su40.f166435c;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        objectRef2 = (Ref.ObjectRef) this.L$1;
        ResultKt.m87239b(obj);
        objectRef = objectRef2;
        objectRef.element = su40.f166435c;
        return Unit.INSTANCE;
    }
}
