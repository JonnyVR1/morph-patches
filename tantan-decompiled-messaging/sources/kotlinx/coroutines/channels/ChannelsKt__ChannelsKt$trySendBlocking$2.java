package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.nee0;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"E", "Ll/ppb;", "Lkotlinx/coroutines/channels/a;", "", "<anonymous>", "(Ll/ppb;)Lkotlinx/coroutines/channels/a;"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", m87374f = "Channels.kt", m87375l = {39}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements Function2<ppb, Continuation<? super C15414a<? extends Unit>>, Object> {
    final /* synthetic */ E $element;
    final /* synthetic */ nee0<E> $this_trySendBlocking;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(nee0<? super E> nee0Var, E e, Continuation<? super ChannelsKt__ChannelsKt$trySendBlocking$2> continuation) {
        super(2, continuation);
        this.$this_trySendBlocking = nee0Var;
        this.$element = e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.$this_trySendBlocking, this.$element, continuation);
        channelsKt__ChannelsKt$trySendBlocking$2.L$0 = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull ppb ppbVar, @Nullable Continuation<? super C15414a<Unit>> continuation) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM223820constructorimpl;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.m87239b(obj);
                nee0<E> nee0Var = this.$this_trySendBlocking;
                E e = this.$element;
                Result.Companion companion = Result.INSTANCE;
                this.label = 1;
                if (nee0Var.mo93787E(e, this) == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
            }
            objM223820constructorimpl = Result.m223820constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
        return C15414a.m93991b(Result.m223827isSuccessimpl(objM223820constructorimpl) ? C15414a.INSTANCE.m94003c(Unit.INSTANCE) : C15414a.INSTANCE.m94001a(Result.m223823exceptionOrNullimpl(objM223820constructorimpl)));
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ppb ppbVar, Continuation<? super C15414a<? extends Unit>> continuation) {
        return invoke2(ppbVar, (Continuation<? super C15414a<Unit>>) continuation);
    }
}
