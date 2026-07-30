package kotlinx.coroutines.flow;

import com.p051p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bui;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u008a@¢\u0006\u0004\b\b\u0010\t"}, m88121d2 = {"T1", "T2", "R", "Ll/bui;", "", "", Careers.f39580it, "", "<anonymous>", "(Ll/bui;Lkotlin/Array;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", m88263f = "Zip.kt", m88264l = {29, 29}, m88265m = "invokeSuspend")
final class FlowKt__ZipKt$combine$1$1 extends SuspendLambda implements Function3<bui<Object>, Object[], Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<Object, Object, Continuation<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$1$1(Function3<Object, Object, ? super Continuation<Object>, ? extends Object> function3, Continuation<? super FlowKt__ZipKt$combine$1$1> continuation) {
        super(3, continuation);
        this.$transform = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull bui<Object> buiVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.$transform, continuation);
        flowKt__ZipKt$combine$1$1.L$0 = buiVar;
        flowKt__ZipKt$combine$1$1.L$1 = objArr;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        bui buiVar;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                buiVar = (bui) this.L$0;
                ResultKt.m88128b(obj);
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
        Function3<Object, Object, Continuation<Object>, Object> function3 = this.$transform;
        Object obj2 = objArr[0];
        Object obj3 = objArr[1];
        this.L$0 = buiVar;
        this.label = 1;
        obj = function3.invoke(obj2, obj3, this);
        if (obj != objM198688e) {
        }
        return objM198688e;
        this.L$0 = null;
        this.label = 2;
    }
}
