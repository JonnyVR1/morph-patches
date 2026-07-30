package kotlinx.coroutines.flow;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.internal.SafeCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.j6f;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H¦@¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m87232d2 = {"Lkotlinx/coroutines/flow/AbstractFlow;", j6f.GPS_DIRECTION_TRUE, "Ll/eri;", "", "<init>", "()V", "Ll/fri;", "collector", "", "collect", "(Ll/fri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constants.INAPP_DATA_TAG, "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public abstract class AbstractFlow<T> implements eri<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.AbstractFlow$collect$1 */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "kotlinx.coroutines.flow.AbstractFlow", m87374f = "Flow.kt", m87375l = {226}, m87376m = "collect")
    public static final class C154251 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AbstractFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C154251(AbstractFlow<T> abstractFlow, Continuation<? super C154251> continuation) {
            super(continuation);
            this.this$0 = abstractFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p149l.eri
    @Nullable
    public final Object collect(@NotNull fri<? super T> friVar, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C154251 c154251;
        SafeCollector safeCollector;
        if (continuation instanceof C154251) {
            c154251 = (C154251) continuation;
            int i = c154251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c154251.label = i - Integer.MIN_VALUE;
            } else {
                c154251 = new C154251(this, continuation);
            }
        } else {
            c154251 = new C154251(this, continuation);
        }
        Object obj = c154251.result;
        Object objM196133e = uwp.m196133e();
        int i2 = c154251.label;
        if (i2 != 0) {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            safeCollector = (SafeCollector) c154251.L$0;
            try {
                ResultKt.m87239b(obj);
                safeCollector.releaseIntercepted();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                safeCollector.releaseIntercepted();
                throw th;
            }
        }
        ResultKt.m87239b(obj);
        SafeCollector safeCollector2 = new SafeCollector(friVar, c154251.getF63443a());
        try {
            c154251.L$0 = safeCollector2;
            c154251.label = 1;
            if (mo94062d(safeCollector2, c154251) == objM196133e) {
                return objM196133e;
            }
            safeCollector = safeCollector2;
            safeCollector.releaseIntercepted();
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            safeCollector = safeCollector2;
            safeCollector.releaseIntercepted();
            throw th;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public abstract Object mo94062d(@NotNull fri<? super T> friVar, @NotNull Continuation<? super Unit> continuation);
}
