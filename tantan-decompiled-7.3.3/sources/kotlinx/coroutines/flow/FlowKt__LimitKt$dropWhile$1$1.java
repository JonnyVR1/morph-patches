package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bui;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class FlowKt__LimitKt$dropWhile$1$1<T> implements bui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.BooleanRef f67497a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bui<T> f67498b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> f67499c;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1(Ref.BooleanRef booleanRef, bui<? super T> buiVar, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        this.f67497a = booleanRef;
        this.f67498b = buiVar;
        this.f67499c = function2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L32;
     */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        if (continuation instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) continuation;
            int i = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, continuation);
            }
        } else {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, continuation);
        }
        Object objInvoke = flowKt__LimitKt$dropWhile$1$1$emit$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(objInvoke);
            if (this.f67497a.element) {
                bui<T> buiVar = this.f67498b;
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = 1;
            } else {
                Function2<T, Continuation<? super Boolean>, Object> function2 = this.f67499c;
                flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = this;
                flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = t;
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = 2;
                objInvoke = function2.invoke(t, flowKt__LimitKt$dropWhile$1$1$emit$1);
                if (objInvoke != objM198688e) {
                    if (!((Boolean) objInvoke).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    this.f67497a.element = true;
                    bui<T> buiVar2 = this.f67498b;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = null;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
                }
            }
            return objM198688e;
        }
        if (i2 == 1) {
            ResultKt.m88128b(objInvoke);
            return Unit.INSTANCE;
        }
        if (i2 == 2) {
            t = (T) flowKt__LimitKt$dropWhile$1$1$emit$1.L$1;
            this = (FlowKt__LimitKt$dropWhile$1$1) flowKt__LimitKt$dropWhile$1$1$emit$1.L$0;
            ResultKt.m88128b(objInvoke);
            if (!((Boolean) objInvoke).booleanValue()) {
                return Unit.INSTANCE;
            }
            this.f67497a.element = true;
            bui<T> buiVar3 = this.f67498b;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
        } else {
            if (i2 != 3) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(objInvoke);
        }
        return Unit.INSTANCE;
    }
}
