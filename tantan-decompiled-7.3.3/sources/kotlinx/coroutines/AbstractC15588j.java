package kotlinx.coroutines;

import com.clevertap.android.sdk.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.arb;
import p153l.kni0;
import p153l.l5e;
import p153l.l6f;
import p153l.n5e;
import p153l.p7f;
import p153l.to5;
import p153l.twj0;
import p153l.vni0;

/* JADX INFO: renamed from: kotlinx.coroutines.j */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH ¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006!"}, m88121d2 = {"Lkotlinx/coroutines/j;", p7f.GPS_DIRECTION_TRUE, "Ll/kni0;", "Lkotlinx/coroutines/SchedulerTask;", "", "resumeMode", "<init>", "(I)V", "", "j", "()Ljava/lang/Object;", "takenState", "", "cause", "", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "()V", "exception", "finallyException", "h", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "c", "I", "Lkotlin/coroutines/Continuation;", "()Lkotlin/coroutines/Continuation;", "delegate", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@PublishedApi
@SourceDebugExtension
public abstract class AbstractC15588j<T> extends kni0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    public int resumeMode;

    public AbstractC15588j(int i) {
        this.resumeMode = i;
    }

    /* JADX INFO: renamed from: b */
    public void mo94652b(@Nullable Object takenState, @NotNull Throwable cause) {
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract Continuation<T> mo94653c();

    @Nullable
    /* JADX INFO: renamed from: d */
    public Throwable mo94654d(@Nullable Object state) {
        to5 to5Var = state instanceof to5 ? (to5) state : null;
        if (to5Var != null) {
            return to5Var.cause;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public <T> T mo94655e(@Nullable Object state) {
        return state;
    }

    /* JADX INFO: renamed from: h */
    public final void m95111h(@Nullable Throwable exception, @Nullable Throwable finallyException) throws IllegalAccessException, InvocationTargetException {
        if (exception == null && finallyException == null) {
            return;
        }
        if (exception != null && finallyException != null) {
            l6f.m153058a(exception, finallyException);
        }
        if (exception == null) {
            exception = finallyException;
        }
        exception.getClass();
        arb.m99658a(mo94653c().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", exception));
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public abstract Object mo94659j();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        Object objM225066constructorimpl;
        Object objM225066constructorimpl2;
        vni0 vni0Var = this.taskContext;
        try {
            Continuation<T> continuationMo94653c = mo94653c();
            continuationMo94653c.getClass();
            l5e l5eVar = (l5e) continuationMo94653c;
            Continuation<T> continuation = l5eVar.continuation;
            Object obj = l5eVar.countOrElement;
            CoroutineContext context = continuation.getContext();
            Object objM95110c = ThreadContextKt.m95110c(context, obj);
            twj0<?> twj0VarM94500g = objM95110c != ThreadContextKt.f67579a ? CoroutineContextKt.m94500g(continuation, context, objM95110c) : null;
            try {
                CoroutineContext context2 = continuation.getContext();
                Object objMo94659j = mo94659j();
                Throwable thMo94654d = mo94654d(objMo94659j);
                InterfaceC15593o interfaceC15593o = (thMo94654d == null && n5e.m161706b(this.resumeMode)) ? (InterfaceC15593o) context2.get(InterfaceC15593o.INSTANCE) : null;
                if (interfaceC15593o != null && !interfaceC15593o.mo94581k()) {
                    CancellationException cancellationExceptionMo94544M = interfaceC15593o.mo94544M();
                    mo94652b(objMo94659j, cancellationExceptionMo94544M);
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m225066constructorimpl(ResultKt.m88127a(cancellationExceptionMo94544M)));
                } else if (thMo94654d != null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    continuation.resumeWith(Result.m225066constructorimpl(ResultKt.m88127a(thMo94654d)));
                } else {
                    Result.Companion companion3 = Result.INSTANCE;
                    continuation.resumeWith(Result.m225066constructorimpl(mo94655e(objMo94659j)));
                }
                Unit unit = Unit.INSTANCE;
                if (twj0VarM94500g == null || twj0VarM94500g.m193347h1()) {
                    ThreadContextKt.m95108a(context, objM95110c);
                }
                try {
                    vni0Var.mo201995a();
                    objM225066constructorimpl2 = Result.m225066constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM225066constructorimpl2 = Result.m225066constructorimpl(ResultKt.m88127a(th));
                }
                m95111h(null, Result.m225069exceptionOrNullimpl(objM225066constructorimpl2));
            } catch (Throwable th2) {
                if (twj0VarM94500g == null || twj0VarM94500g.m193347h1()) {
                    ThreadContextKt.m95108a(context, objM95110c);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                vni0Var.mo201995a();
                objM225066constructorimpl = Result.m225066constructorimpl(Unit.INSTANCE);
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th4));
            }
            m95111h(th3, Result.m225069exceptionOrNullimpl(objM225066constructorimpl));
        }
    }
}
