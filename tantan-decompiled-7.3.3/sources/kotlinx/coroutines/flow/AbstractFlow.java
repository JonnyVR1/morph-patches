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
import p153l.aui;
import p153l.bui;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H¦@¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m88121d2 = {"Lkotlinx/coroutines/flow/AbstractFlow;", p7f.GPS_DIRECTION_TRUE, "Ll/aui;", "", "<init>", "()V", "Ll/bui;", "collector", "", "collect", "(Ll/bui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constants.INAPP_DATA_TAG, "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public abstract class AbstractFlow<T> implements aui<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.AbstractFlow$collect$1 */
    @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    @DebugMetadata(m88262c = "kotlinx.coroutines.flow.AbstractFlow", m88263f = "Flow.kt", m88264l = {226}, m88265m = "collect")
    public static final class C155321 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AbstractFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C155321(AbstractFlow<T> abstractFlow, Continuation<? super C155321> continuation) {
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
    @Override // p153l.aui
    @Nullable
    public final Object collect(@NotNull bui<? super T> buiVar, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C155321 c155321;
        SafeCollector safeCollector;
        if (continuation instanceof C155321) {
            c155321 = (C155321) continuation;
            int i = c155321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c155321.label = i - Integer.MIN_VALUE;
            } else {
                c155321 = new C155321(this, continuation);
            }
        } else {
            c155321 = new C155321(this, continuation);
        }
        Object obj = c155321.result;
        Object objM198688e = uyp.m198688e();
        int i2 = c155321.label;
        if (i2 != 0) {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            safeCollector = (SafeCollector) c155321.L$0;
            try {
                ResultKt.m88128b(obj);
                safeCollector.releaseIntercepted();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                safeCollector.releaseIntercepted();
                throw th;
            }
        }
        ResultKt.m88128b(obj);
        SafeCollector safeCollector2 = new SafeCollector(buiVar, c155321.getF64117a());
        try {
            c155321.L$0 = safeCollector2;
            c155321.label = 1;
            if (mo94955d(safeCollector2, c155321) == objM198688e) {
                return objM198688e;
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
    public abstract Object mo94955d(@NotNull bui<? super T> buiVar, @NotNull Continuation<? super Unit> continuation);
}
