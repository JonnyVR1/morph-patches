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
import p149l.d4e;
import p149l.gnr;
import p149l.nyi;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001c\u001a\u00020\u00168\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m87232d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/b;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", CommandMessage.PARAMS, "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Ll/gnr;", "Landroidx/work/b$a;", "startWork", "()Ll/gnr;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/nyi;", Constants.INAPP_DATA_TAG, "getForegroundInfoAsync", "", "onStopped", "()V", "e", "Landroidx/work/WorkerParameters;", "Lkotlinx/coroutines/CoroutineDispatcher;", "f", "Lkotlinx/coroutines/CoroutineDispatcher;", "c", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext$annotations", "coroutineContext", "a", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public abstract class CoroutineWorker extends AbstractC0762b {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final WorkerParameters params;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final CoroutineDispatcher coroutineContext;

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$a */
    @Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m87232d2 = {"Landroidx/work/CoroutineWorker$a;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "isDispatchNeeded", "(Lkotlin/coroutines/CoroutineContext;)Z", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C0750a extends CoroutineDispatcher {

        @NotNull
        public static final C0750a INSTANCE = new C0750a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final CoroutineDispatcher dispatcher = d4e.m109980a();

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
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "Ll/nyi;", "<anonymous>", "(Ll/ppb;)Ll/nyi;"}, m87233k = 3, m87234mv = {1, 8, 0})
    @DebugMetadata(m87373c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", m87374f = "CoroutineWorker.kt", m87375l = {121}, m87376m = "invokeSuspend")
    public static final class C07511 extends SuspendLambda implements Function2<ppb, Continuation<? super nyi>, Object> {
        int label;

        public C07511(Continuation<? super C07511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CoroutineWorker.this.new C07511(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super nyi> continuation) {
            return ((C07511) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.m87239b(obj);
                    return obj;
                }
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.label = 1;
            Object objM4312d = coroutineWorker.m4312d(this);
            return objM4312d == objM196133e ? objM196133e : objM4312d;
        }
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$startWork$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "Landroidx/work/b$a;", "<anonymous>", "(Ll/ppb;)Landroidx/work/b$a;"}, m87233k = 3, m87234mv = {1, 8, 0})
    @DebugMetadata(m87373c = "androidx.work.CoroutineWorker$startWork$1", m87374f = "CoroutineWorker.kt", m87375l = {67}, m87376m = "invokeSuspend")
    public static final class C07521 extends SuspendLambda implements Function2<ppb, Continuation<? super AbstractC0762b.a>, Object> {
        int label;

        public C07521(Continuation<? super C07521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CoroutineWorker.this.new C07521(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super AbstractC0762b.a> continuation) {
            return ((C07521) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.m87239b(obj);
                    return obj;
                }
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.label = 1;
            Object objMo4310b = coroutineWorker.mo4310b(this);
            return objMo4310b == objM196133e ? objM196133e : objMo4310b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.params = workerParameters;
        this.coroutineContext = C0750a.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m4309e(CoroutineWorker coroutineWorker, Continuation<? super nyi> continuation) {
        throw new IllegalStateException("Not implemented");
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract Object mo4310b(@NotNull Continuation<? super AbstractC0762b.a> continuation);

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public CoroutineDispatcher getCoroutineContext() {
        return this.coroutineContext;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public Object m4312d(@NotNull Continuation<? super nyi> continuation) {
        return m4309e(this, continuation);
    }

    @Override // androidx.work.AbstractC0762b
    @NotNull
    public final gnr<nyi> getForegroundInfoAsync() {
        return ListenableFutureKt.m4341h(getCoroutineContext().plus(JobKt__JobKt.m93616b(null, 1, null)), null, new C07511(null), 2, null);
    }

    @Override // androidx.work.AbstractC0762b
    public final void onStopped() {
        super.onStopped();
    }

    @Override // androidx.work.AbstractC0762b
    @NotNull
    public final gnr<AbstractC0762b.a> startWork() {
        CoroutineContext coroutineContext = !Intrinsics.m87488d(getCoroutineContext(), C0750a.INSTANCE) ? getCoroutineContext() : this.params.m4370l();
        coroutineContext.getClass();
        return ListenableFutureKt.m4341h(coroutineContext.plus(JobKt__JobKt.m93616b(null, 1, null)), null, new C07521(null), 2, null);
    }
}
