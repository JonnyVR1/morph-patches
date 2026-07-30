package kotlinx.coroutines.flow;

import com.p051p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bui;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "R", "Ll/bui;", "", Careers.f39580it, "", "<anonymous>", "(Ll/bui;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", m88263f = "Zip.kt", m88264l = {329, 258}, m88265m = "invokeSuspend")
@SourceDebugExtension
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 extends SuspendLambda implements Function3<bui<Object>, Object[], Continuation<? super Unit>, Object> {
    final /* synthetic */ Function6 $transform$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2(Continuation continuation, Function6 function6) {
        super(3, continuation);
        this.$transform$inlined = function6;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull bui<Object> buiVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 = new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2(continuation, this.$transform$inlined);
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.L$0 = buiVar;
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.L$1 = objArr;
        return flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (r1.emit(r13, r11) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        bui buiVar;
        FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                buiVar = (bui) this.L$0;
                ResultKt.m88128b(obj);
                flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 = this;
            } else {
                if (i != 2) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.m88128b(obj);
        buiVar = (bui) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        Function6 function6 = this.$transform$inlined;
        Object obj2 = objArr[0];
        Object obj3 = objArr[1];
        Object obj4 = objArr[2];
        Object obj5 = objArr[3];
        Object obj6 = objArr[4];
        this.L$0 = buiVar;
        this.label = 1;
        InlineMarker.m88373c(6);
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 = this;
        obj = function6.invoke(obj2, obj3, obj4, obj5, obj6, flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2);
        InlineMarker.m88373c(7);
        if (obj != objM198688e) {
        }
        return objM198688e;
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.L$0 = null;
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.label = 2;
    }
}
