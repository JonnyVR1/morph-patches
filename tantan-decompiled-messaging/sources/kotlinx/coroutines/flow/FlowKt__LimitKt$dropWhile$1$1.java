package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import p149l.fri;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class FlowKt__LimitKt$dropWhile$1$1<T> implements fri {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.BooleanRef f66823a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fri<T> f66824b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> f66825c;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1(Ref.BooleanRef booleanRef, fri<? super T> friVar, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        this.f66823a = booleanRef;
        this.f66824b = friVar;
        this.f66825c = function2;
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
    @Override // p149l.fri
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p149l.uwp.m196133e()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L44
            if (r2 == r6) goto L40
            if (r2 == r5) goto L36
            if (r2 != r4) goto L30
            kotlin.ResultKt.m87239b(r9)
            goto L85
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p149l.qkq0.m175383a(r7)
            return r3
        L36:
            java.lang.Object r8 = r0.L$1
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1 r7 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1) r7
            kotlin.ResultKt.m87239b(r9)
            goto L6a
        L40:
            kotlin.ResultKt.m87239b(r9)
            goto L58
        L44:
            kotlin.ResultKt.m87239b(r9)
            kotlin.jvm.internal.Ref$BooleanRef r9 = r7.f66823a
            boolean r9 = r9.element
            if (r9 == 0) goto L5b
            l.fri<T> r7 = r7.f66824b
            r0.label = r6
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L58
            goto L84
        L58:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L5b:
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r9 = r7.f66825c
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r1) goto L6a
            goto L84
        L6a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L88
            kotlin.jvm.internal.Ref$BooleanRef r9 = r7.f66823a
            r9.element = r6
            l.fri<T> r7 = r7.f66824b
            r0.L$0 = r3
            r0.L$1 = r3
            r0.label = r4
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L85
        L84:
            return r1
        L85:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L88:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
