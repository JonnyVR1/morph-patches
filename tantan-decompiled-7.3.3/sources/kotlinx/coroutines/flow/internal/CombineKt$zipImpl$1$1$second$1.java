package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.asn1.eac.EACTags;
import p153l.aui;
import p153l.bui;
import p153l.el90;
import p153l.h350;
import p153l.sme0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m88121d2 = {"T1", "T2", "R", "Ll/el90;", "", "", "<anonymous>", "(Ll/el90;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", m88263f = "Combine.kt", m88264l = {EACTags.TRACK1_APPLICATION}, m88265m = "invokeSuspend")
public final class CombineKt$zipImpl$1$1$second$1 extends SuspendLambda implements Function2<el90<? super Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ aui<Object> $flow2;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1 */
    @Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m88121d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class C155821<T> implements bui {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ el90<Object> f67567a;

        public C155821(el90<Object> el90Var) {
            this.f67567a = el90Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p153l.bui
        @Nullable
        public final Object emit(Object obj, @NotNull Continuation<? super Unit> continuation) throws Throwable {
            CombineKt$zipImpl$1$1$second$1$1$emit$1 combineKt$zipImpl$1$1$second$1$1$emit$1;
            if (continuation instanceof CombineKt$zipImpl$1$1$second$1$1$emit$1) {
                combineKt$zipImpl$1$1$second$1$1$emit$1 = (CombineKt$zipImpl$1$1$second$1$1$emit$1) continuation;
                int i = combineKt$zipImpl$1$1$second$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    combineKt$zipImpl$1$1$second$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    combineKt$zipImpl$1$1$second$1$1$emit$1 = new CombineKt$zipImpl$1$1$second$1$1$emit$1(this, continuation);
                }
            } else {
                combineKt$zipImpl$1$1$second$1$1$emit$1 = new CombineKt$zipImpl$1$1$second$1$1$emit$1(this, continuation);
            }
            Object obj2 = combineKt$zipImpl$1$1$second$1$1$emit$1.result;
            Object objM198688e = uyp.m198688e();
            int i2 = combineKt$zipImpl$1$1$second$1$1$emit$1.label;
            if (i2 == 0) {
                ResultKt.m88128b(obj2);
                sme0<Object> channel = this.f67567a.getChannel();
                if (obj == null) {
                    obj = h350.f107614a;
                }
                combineKt$zipImpl$1$1$second$1$1$emit$1.label = 1;
                if (channel.mo94679E(obj, combineKt$zipImpl$1$1$second$1$1$emit$1) == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i2 != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1$second$1(aui<Object> auiVar, Continuation<? super CombineKt$zipImpl$1$1$second$1> continuation) {
        super(2, continuation);
        this.$flow2 = auiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CombineKt$zipImpl$1$1$second$1 combineKt$zipImpl$1$1$second$1 = new CombineKt$zipImpl$1$1$second$1(this.$flow2, continuation);
        combineKt$zipImpl$1$1$second$1.L$0 = obj;
        return combineKt$zipImpl$1$1$second$1;
    }

    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull el90<Object> el90Var, @Nullable Continuation<? super Unit> continuation) {
        return ((CombineKt$zipImpl$1$1$second$1) create(el90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            el90 el90Var = (el90) this.L$0;
            aui<Object> auiVar = this.$flow2;
            C155821 c155821 = new C155821(el90Var);
            this.label = 1;
            if (auiVar.collect(c155821, this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(el90<? super Object> el90Var, Continuation<? super Unit> continuation) {
        return invoke2((el90<Object>) el90Var, continuation);
    }
}
