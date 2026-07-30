package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fri;
import p149l.j6f;
import p149l.qkq0;
import p149l.su40;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m87232d2 = {"<anonymous>", "", j6f.LATITUDE_SOUTH, j6f.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class FlowKt__ReduceKt$reduce$2<T> implements fri {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.ObjectRef<Object> f66845a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function3<S, T, Continuation<? super S>, Object> f66846b;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ReduceKt$reduce$2(Ref.ObjectRef<Object> objectRef, Function3<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> function3) {
        this.f66845a = objectRef;
        this.f66846b = function3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
    @Override // p149l.fri
    @Nullable
    public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        FlowKt__ReduceKt$reduce$2$emit$1 flowKt__ReduceKt$reduce$2$emit$1;
        Ref.ObjectRef<Object> objectRef;
        Object obj;
        Ref.ObjectRef<Object> objectRef2;
        Object obj2;
        if (continuation instanceof FlowKt__ReduceKt$reduce$2$emit$1) {
            flowKt__ReduceKt$reduce$2$emit$1 = (FlowKt__ReduceKt$reduce$2$emit$1) continuation;
            int i = flowKt__ReduceKt$reduce$2$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$reduce$2$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$reduce$2$emit$1 = new FlowKt__ReduceKt$reduce$2$emit$1(this, continuation);
            }
        } else {
            flowKt__ReduceKt$reduce$2$emit$1 = new FlowKt__ReduceKt$reduce$2$emit$1(this, continuation);
        }
        Object obj3 = flowKt__ReduceKt$reduce$2$emit$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__ReduceKt$reduce$2$emit$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj3);
            objectRef = this.f66845a;
            Object obj4 = objectRef.element;
            if (obj4 != su40.f166433a) {
                Function3<S, T, Continuation<? super S>, Object> function3 = this.f66846b;
                flowKt__ReduceKt$reduce$2$emit$1.L$0 = objectRef;
                flowKt__ReduceKt$reduce$2$emit$1.label = 1;
                Object objInvoke = function3.invoke((S) obj4, t, flowKt__ReduceKt$reduce$2$emit$1);
                if (objInvoke == objM196133e) {
                    obj2 = t;
                    return objM196133e;
                }
                obj2 = t;
                obj = objInvoke;
                objectRef2 = objectRef;
            }
            obj2 = t;
            objectRef.element = (T) obj2;
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        objectRef2 = (Ref.ObjectRef) flowKt__ReduceKt$reduce$2$emit$1.L$0;
        ResultKt.m87239b(obj3);
        obj = (T) obj3;
        objectRef = objectRef2;
        obj2 = obj;
        obj2 = t;
        objectRef.element = (T) obj2;
        return Unit.INSTANCE;
    }
}
