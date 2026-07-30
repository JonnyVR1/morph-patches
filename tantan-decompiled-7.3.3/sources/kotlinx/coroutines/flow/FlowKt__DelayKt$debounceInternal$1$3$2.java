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
import kotlinx.coroutines.channels.C15521a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bui;
import p153l.h350;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/a;", "", "value", "", "<anonymous>", "(Lkotlinx/coroutines/channels/a;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", m88263f = "Delay.kt", m88264l = {236}, m88265m = "invokeSuspend")
@SourceDebugExtension
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements Function2<C15521a<? extends Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ bui<Object> $downstream;
    final /* synthetic */ Ref.ObjectRef<Object> $lastValue;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(Ref.ObjectRef<Object> objectRef, bui<Object> buiVar, Continuation<? super FlowKt__DelayKt$debounceInternal$1$3$2> continuation) {
        super(2, continuation);
        this.$lastValue = objectRef;
        this.$downstream = buiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.$lastValue, this.$downstream, continuation);
        flowKt__DelayKt$debounceInternal$1$3$2.L$0 = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(C15521a<? extends Object> c15521a, Continuation<? super Unit> continuation) {
        return m225911invokeWpGqRn0(c15521a.getHolder(), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m225911invokeWpGqRn0(@NotNull Object obj, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(C15521a.m94883b(obj), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [T, l.goh0] */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Ref.ObjectRef<Object> objectRef;
        Ref.ObjectRef<Object> objectRef2;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            ?? holder = ((C15521a) this.L$0).getHolder();
            objectRef = this.$lastValue;
            boolean z = holder instanceof C15521a.c;
            if (!z) {
                objectRef.element = holder;
            }
            bui<Object> buiVar = this.$downstream;
            if (z) {
                Throwable thM94886e = C15521a.m94886e(holder);
                if (thM94886e != null) {
                    throw thM94886e;
                }
                Object obj2 = objectRef.element;
                if (obj2 != null) {
                    Object obj3 = obj2 != h350.f107614a ? obj2 : null;
                    this.L$0 = holder;
                    this.L$1 = objectRef;
                    this.label = 1;
                    if (buiVar.emit(obj3, this) == objM198688e) {
                        return objM198688e;
                    }
                    objectRef2 = objectRef;
                }
                objectRef.element = h350.f107616c;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        objectRef2 = (Ref.ObjectRef) this.L$1;
        ResultKt.m88128b(obj);
        objectRef = objectRef2;
        objectRef.element = h350.f107616c;
        return Unit.INSTANCE;
    }
}
