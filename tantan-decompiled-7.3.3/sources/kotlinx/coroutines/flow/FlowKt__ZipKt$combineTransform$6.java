package kotlinx.coroutines.flow;

import com.p051p1.mobile.putong.data.Careers;
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
import p153l.aui;
import p153l.bui;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "R", "Ll/bui;", "", "<anonymous>", "(Ll/bui;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", m88263f = "Zip.kt", m88264l = {247}, m88265m = "invokeSuspend")
@SourceDebugExtension
public final class FlowKt__ZipKt$combineTransform$6 extends SuspendLambda implements Function2<bui<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ aui<Object>[] $flows;
    final /* synthetic */ Function3<bui<Object>, Object[], Continuation<? super Unit>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$1 */
    @Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "R", "invoke", "()[Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 176)
    @SourceDebugExtension
    public static final class C155651 extends Lambda implements Function0<Object[]> {
        final /* synthetic */ aui<Object>[] $flows;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C155651(aui<Object>[] auiVarArr) {
            super(0);
            this.$flows = auiVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object[] invoke() {
            int length = this.$flows.length;
            Intrinsics.m88382i(0, "T?");
            return new Object[length];
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2 */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "R", "Ll/bui;", "", Careers.f39580it, "", "<anonymous>", "(Ll/bui;Lkotlin/Array;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
    @DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", m88263f = "Zip.kt", m88264l = {247}, m88265m = "invokeSuspend")
    @SourceDebugExtension
    public static final class C155662 extends SuspendLambda implements Function3<bui<Object>, Object[], Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<bui<Object>, Object[], Continuation<? super Unit>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C155662(Function3<? super bui<Object>, ? super Object[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C155662> continuation) {
            super(3, continuation);
            this.$transform = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull bui<Object> buiVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
            Intrinsics.m88381h();
            C155662 c155662 = new C155662(this.$transform, continuation);
            c155662.L$0 = buiVar;
            c155662.L$1 = objArr;
            return c155662.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m88128b(obj);
                bui<Object> buiVar = (bui) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                Function3<bui<Object>, Object[], Continuation<? super Unit>, Object> function3 = this.$transform;
                this.L$0 = null;
                this.label = 1;
                if (function3.invoke(buiVar, objArr, this) == objM198688e) {
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

        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            this.$transform.invoke((bui) this.L$0, (Object[]) this.L$1, this);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineTransform$6(aui<Object>[] auiVarArr, Function3<? super bui<Object>, ? super Object[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super FlowKt__ZipKt$combineTransform$6> continuation) {
        super(2, continuation);
        this.$flows = auiVarArr;
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
    public final Object invoke(@NotNull bui<Object> buiVar, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__ZipKt$combineTransform$6) create(buiVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            bui buiVar = (bui) this.L$0;
            aui<Object>[] auiVarArr = this.$flows;
            Intrinsics.m88381h();
            C155651 c155651 = new C155651(this.$flows);
            Intrinsics.m88381h();
            C155662 c155662 = new C155662(this.$transform, null);
            this.label = 1;
            if (CombineKt.m95066a(buiVar, auiVarArr, c155651, c155662, this) == objM198688e) {
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

    @Nullable
    public final Object invokeSuspend$$forInline(@NotNull Object obj) {
        bui buiVar = (bui) this.L$0;
        aui<Object>[] auiVarArr = this.$flows;
        Intrinsics.m88381h();
        C155651 c155651 = new C155651(this.$flows);
        Intrinsics.m88381h();
        C155662 c155662 = new C155662(this.$transform, null);
        InlineMarker.m88373c(0);
        CombineKt.m95066a(buiVar, auiVarArr, c155651, c155662, this);
        InlineMarker.m88373c(1);
        return Unit.INSTANCE;
    }
}
