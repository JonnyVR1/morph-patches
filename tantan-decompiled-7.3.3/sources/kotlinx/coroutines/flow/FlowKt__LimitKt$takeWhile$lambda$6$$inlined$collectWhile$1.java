package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.bui;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006¸\u0006\u0000"}, m88121d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Ll/bui;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1<T> implements bui<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function2 f67502a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bui f67503b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1 */
    @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    @DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", m88263f = "Limit.kt", m88264l = {CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, 140}, m88265m = "emit")
    @SourceDebugExtension
    public static final class C155461 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C155461(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.this.emit(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1(Function2 function2, bui buiVar) {
        this.f67502a = function2;
        this.f67503b = buiVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r8.emit(r7, r0) == r1) goto L23;
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
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C155461 c155461;
        if (continuation instanceof C155461) {
            c155461 = (C155461) continuation;
            int i = c155461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c155461.label = i - Integer.MIN_VALUE;
            } else {
                c155461 = new C155461(continuation);
            }
        } else {
            c155461 = new C155461(continuation);
        }
        Object objInvoke = c155461.result;
        Object objM198688e = uyp.m198688e();
        int i2 = c155461.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.m88128b(objInvoke);
            Function2 function2 = this.f67502a;
            c155461.L$0 = this;
            c155461.L$1 = t;
            c155461.label = 1;
            InlineMarker.m88373c(6);
            objInvoke = function2.invoke(t, c155461);
            InlineMarker.m88373c(7);
            if (objInvoke != objM198688e) {
            }
            return objM198688e;
        }
        if (i2 == 1) {
            t = (T) c155461.L$1;
            this = (FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) c155461.L$0;
            ResultKt.m88128b(objInvoke);
        } else {
            if (i2 != 2) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) c155461.L$0;
            ResultKt.m88128b(objInvoke);
        }
        if (z) {
            return Unit.INSTANCE;
        }
        throw new AbortFlowException(this);
        if (((Boolean) objInvoke).booleanValue()) {
            bui buiVar = this.f67503b;
            c155461.L$0 = this;
            c155461.L$1 = null;
            c155461.label = 2;
        } else {
            z = false;
        }
        if (z) {
            return Unit.INSTANCE;
        }
        throw new AbortFlowException(this);
    }
}
