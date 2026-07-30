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
import p149l.ad90;
import p149l.eri;
import p149l.fri;
import p149l.nee0;
import p149l.qkq0;
import p149l.su40;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m87232d2 = {"T1", "T2", "R", "Ll/ad90;", "", "", "<anonymous>", "(Ll/ad90;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", m87374f = "Combine.kt", m87375l = {EACTags.TRACK1_APPLICATION}, m87376m = "invokeSuspend")
public final class CombineKt$zipImpl$1$1$second$1 extends SuspendLambda implements Function2<ad90<? super Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ eri<Object> $flow2;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1 */
    @Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m87232d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class C154751<T> implements fri {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ad90<Object> f66893a;

        public C154751(ad90<Object> ad90Var) {
            this.f66893a = ad90Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p149l.fri
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
            Object objM196133e = uwp.m196133e();
            int i2 = combineKt$zipImpl$1$1$second$1$1$emit$1.label;
            if (i2 == 0) {
                ResultKt.m87239b(obj2);
                nee0<Object> channel = this.f66893a.getChannel();
                if (obj == null) {
                    obj = su40.f166433a;
                }
                combineKt$zipImpl$1$1$second$1$1$emit$1.label = 1;
                if (channel.mo93787E(obj, combineKt$zipImpl$1$1$second$1$1$emit$1) == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i2 != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1$second$1(eri<Object> eriVar, Continuation<? super CombineKt$zipImpl$1$1$second$1> continuation) {
        super(2, continuation);
        this.$flow2 = eriVar;
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
    public final Object invoke2(@NotNull ad90<Object> ad90Var, @Nullable Continuation<? super Unit> continuation) {
        return ((CombineKt$zipImpl$1$1$second$1) create(ad90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            ad90 ad90Var = (ad90) this.L$0;
            eri<Object> eriVar = this.$flow2;
            C154751 c154751 = new C154751(ad90Var);
            this.label = 1;
            if (eriVar.collect(c154751, this) == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ad90<? super Object> ad90Var, Continuation<? super Unit> continuation) {
        return invoke2((ad90<Object>) ad90Var, continuation);
    }
}
