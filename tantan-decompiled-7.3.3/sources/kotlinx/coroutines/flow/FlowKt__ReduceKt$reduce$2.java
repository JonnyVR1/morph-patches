package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bui;
import p153l.h350;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {"<anonymous>", "", p7f.LATITUDE_SOUTH, p7f.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class FlowKt__ReduceKt$reduce$2<T> implements bui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.ObjectRef<Object> f67519a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function3<S, T, Continuation<? super S>, Object> f67520b;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ReduceKt$reduce$2(Ref.ObjectRef<Object> objectRef, Function3<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> function3) {
        this.f67519a = objectRef;
        this.f67520b = function3;
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
    @Override // p153l.bui
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__ReduceKt$reduce$2$emit$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj3);
            objectRef = this.f67519a;
            Object obj4 = objectRef.element;
            if (obj4 != h350.f107614a) {
                Function3<S, T, Continuation<? super S>, Object> function3 = this.f67520b;
                flowKt__ReduceKt$reduce$2$emit$1.L$0 = objectRef;
                flowKt__ReduceKt$reduce$2$emit$1.label = 1;
                Object objInvoke = function3.invoke((S) obj4, t, flowKt__ReduceKt$reduce$2$emit$1);
                if (objInvoke == objM198688e) {
                    obj2 = t;
                    return objM198688e;
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
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        objectRef2 = (Ref.ObjectRef) flowKt__ReduceKt$reduce$2$emit$1.L$0;
        ResultKt.m88128b(obj3);
        obj = (T) obj3;
        objectRef = objectRef2;
        obj2 = obj;
        obj2 = t;
        objectRef.element = (T) obj2;
        return Unit.INSTANCE;
    }
}
