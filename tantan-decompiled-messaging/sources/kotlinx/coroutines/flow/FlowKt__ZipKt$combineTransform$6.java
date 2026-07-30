package kotlinx.coroutines.flow;

import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.j6f;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "R", "Ll/fri;", "", "<anonymous>", "(Ll/fri;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", m87374f = "Zip.kt", m87375l = {247}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class FlowKt__ZipKt$combineTransform$6 extends SuspendLambda implements Function2<fri<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ eri<Object>[] $flows;
    final /* synthetic */ Function3<fri<Object>, Object[], Continuation<? super Unit>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$1 */
    @Metadata(m87231d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "R", "invoke", "()[Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 176)
    @SourceDebugExtension
    public static final class C154581 extends Lambda implements Function0<Object[]> {
        final /* synthetic */ eri<Object>[] $flows;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C154581(eri<Object>[] eriVarArr) {
            super(0);
            this.$flows = eriVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object[] invoke() {
            int length = this.$flows.length;
            Intrinsics.m87493i(0, "T?");
            return new Object[length];
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2 */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "R", "Ll/fri;", "", Careers.f38732it, "", "<anonymous>", "(Ll/fri;Lkotlin/Array;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
    @DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", m87374f = "Zip.kt", m87375l = {247}, m87376m = "invokeSuspend")
    @SourceDebugExtension
    public static final class C154592 extends SuspendLambda implements Function3<fri<Object>, Object[], Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<fri<Object>, Object[], Continuation<? super Unit>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C154592(Function3<? super fri<Object>, ? super Object[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C154592> continuation) {
            super(3, continuation);
            this.$transform = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull fri<Object> friVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
            Intrinsics.m87492h();
            C154592 c154592 = new C154592(this.$transform, continuation);
            c154592.L$0 = friVar;
            c154592.L$1 = objArr;
            return c154592.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                fri<Object> friVar = (fri) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                Function3<fri<Object>, Object[], Continuation<? super Unit>, Object> function3 = this.$transform;
                this.L$0 = null;
                this.label = 1;
                if (function3.invoke(friVar, objArr, this) == objM196133e) {
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

        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            this.$transform.invoke((fri) this.L$0, (Object[]) this.L$1, this);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineTransform$6(eri<Object>[] eriVarArr, Function3<? super fri<Object>, ? super Object[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super FlowKt__ZipKt$combineTransform$6> continuation) {
        super(2, continuation);
        this.$flows = eriVarArr;
        this.$transform = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__ZipKt$combineTransform$6 flowKt__ZipKt$combineTransform$6 = new FlowKt__ZipKt$combineTransform$6(this.$flows, this.$transform, continuation);
        flowKt__ZipKt$combineTransform$6.L$0 = obj;
        return flowKt__ZipKt$combineTransform$6;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull fri<Object> friVar, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__ZipKt$combineTransform$6) create(friVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            fri friVar = (fri) this.L$0;
            eri<Object>[] eriVarArr = this.$flows;
            Intrinsics.m87492h();
            C154581 c154581 = new C154581(this.$flows);
            Intrinsics.m87492h();
            C154592 c154592 = new C154592(this.$transform, null);
            this.label = 1;
            if (CombineKt.m94173a(friVar, eriVarArr, c154581, c154592, this) == objM196133e) {
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

    @Nullable
    public final Object invokeSuspend$$forInline(@NotNull Object obj) {
        fri friVar = (fri) this.L$0;
        eri<Object>[] eriVarArr = this.$flows;
        Intrinsics.m87492h();
        C154581 c154581 = new C154581(this.$flows);
        Intrinsics.m87492h();
        C154592 c154592 = new C154592(this.$transform, null);
        InlineMarker.m87484c(0);
        CombineKt.m94173a(friVar, eriVarArr, c154581, c154592, this);
        InlineMarker.m87484c(1);
        return Unit.INSTANCE;
    }
}
