package androidx.work;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.CommandMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.hpr;
import p153l.i1j;
import p153l.r5e;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001c\u001a\u00020\u00168\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m88121d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/b;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", CommandMessage.PARAMS, "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Ll/hpr;", "Landroidx/work/b$a;", "startWork", "()Ll/hpr;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/i1j;", Constants.INAPP_DATA_TAG, "getForegroundInfoAsync", "", "onStopped", "()V", "e", "Landroidx/work/WorkerParameters;", "Lkotlinx/coroutines/CoroutineDispatcher;", "f", "Lkotlinx/coroutines/CoroutineDispatcher;", "c", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext$annotations", "coroutineContext", "a", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public abstract class CoroutineWorker extends AbstractC0764b {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final WorkerParameters params;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final CoroutineDispatcher coroutineContext;

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$a */
    @Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m88121d2 = {"Landroidx/work/CoroutineWorker$a;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "isDispatchNeeded", "(Lkotlin/coroutines/CoroutineContext;)Z", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C0752a extends CoroutineDispatcher {

        @NotNull
        public static final C0752a INSTANCE = new C0752a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final CoroutineDispatcher dispatcher = r5e.m179860a();

        @Override // kotlinx.coroutines.CoroutineDispatcher
        public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
            context.getClass();
            block.getClass();
            dispatcher.dispatch(context, block);
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        public boolean isDispatchNeeded(@NotNull CoroutineContext context) {
            context.getClass();
            return dispatcher.isDispatchNeeded(context);
        }
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$getForegroundInfoAsync$1 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "Ll/i1j;", "<anonymous>", "(Ll/drb;)Ll/i1j;"}, m88122k = 3, m88123mv = {1, 8, 0})
    @DebugMetadata(m88262c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", m88263f = "CoroutineWorker.kt", m88264l = {121}, m88265m = "invokeSuspend")
    public static final class C07531 extends SuspendLambda implements Function2<drb, Continuation<? super i1j>, Object> {
        int label;

        public C07531(Continuation<? super C07531> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CoroutineWorker.this.new C07531(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super i1j> continuation) {
            return ((C07531) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.m88128b(obj);
                    return obj;
                }
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.label = 1;
            Object objM4314d = coroutineWorker.m4314d(this);
            return objM4314d == objM198688e ? objM198688e : objM4314d;
        }
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$startWork$1 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "Landroidx/work/b$a;", "<anonymous>", "(Ll/drb;)Landroidx/work/b$a;"}, m88122k = 3, m88123mv = {1, 8, 0})
    @DebugMetadata(m88262c = "androidx.work.CoroutineWorker$startWork$1", m88263f = "CoroutineWorker.kt", m88264l = {67}, m88265m = "invokeSuspend")
    public static final class C07541 extends SuspendLambda implements Function2<drb, Continuation<? super AbstractC0764b.a>, Object> {
        int label;

        public C07541(Continuation<? super C07541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CoroutineWorker.this.new C07541(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super AbstractC0764b.a> continuation) {
            return ((C07541) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.m88128b(obj);
                    return obj;
                }
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.label = 1;
            Object objMo4312b = coroutineWorker.mo4312b(this);
            return objMo4312b == objM198688e ? objM198688e : objMo4312b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.params = workerParameters;
        this.coroutineContext = C0752a.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m4311e(CoroutineWorker coroutineWorker, Continuation<? super i1j> continuation) {
        throw new IllegalStateException("Not implemented");
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract Object mo4312b(@NotNull Continuation<? super AbstractC0764b.a> continuation);

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public CoroutineDispatcher getCoroutineContext() {
        return this.coroutineContext;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public Object m4314d(@NotNull Continuation<? super i1j> continuation) {
        return m4311e(this, continuation);
    }

    @Override // androidx.work.AbstractC0764b
    @NotNull
    public final hpr<i1j> getForegroundInfoAsync() {
        return ListenableFutureKt.m4343h(getCoroutineContext().plus(JobKt__JobKt.m94507b(null, 1, null)), null, new C07531(null), 2, null);
    }

    @Override // androidx.work.AbstractC0764b
    public final void onStopped() {
        super.onStopped();
    }

    @Override // androidx.work.AbstractC0764b
    @NotNull
    public final hpr<AbstractC0764b.a> startWork() {
        CoroutineContext coroutineContext = !Intrinsics.m88377d(getCoroutineContext(), C0752a.INSTANCE) ? getCoroutineContext() : this.params.m4372l();
        coroutineContext.getClass();
        return ListenableFutureKt.m4343h(coroutineContext.plus(JobKt__JobKt.m94507b(null, 1, null)), null, new C07541(null), 2, null);
    }
}
