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
import p149l.h5f;
import p149l.j6f;
import p149l.kei0;
import p149l.mpb;
import p149l.pn5;
import p149l.qnj0;
import p149l.vei0;
import p149l.x3e;
import p149l.z3e;

/* JADX INFO: renamed from: kotlinx.coroutines.j */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH ¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006!"}, m87232d2 = {"Lkotlinx/coroutines/j;", j6f.GPS_DIRECTION_TRUE, "Ll/kei0;", "Lkotlinx/coroutines/SchedulerTask;", "", "resumeMode", "<init>", "(I)V", "", "j", "()Ljava/lang/Object;", "takenState", "", "cause", "", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "()V", "exception", "finallyException", "h", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "c", "I", "Lkotlin/coroutines/Continuation;", "()Lkotlin/coroutines/Continuation;", "delegate", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@PublishedApi
@SourceDebugExtension
public abstract class AbstractC15481j<T> extends kei0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    public int resumeMode;

    public AbstractC15481j(int i) {
        this.resumeMode = i;
    }

    /* JADX INFO: renamed from: b */
    public void mo93760b(@Nullable Object takenState, @NotNull Throwable cause) {
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract Continuation<T> mo93761c();

    @Nullable
    /* JADX INFO: renamed from: d */
    public Throwable mo93762d(@Nullable Object state) {
        pn5 pn5Var = state instanceof pn5 ? (pn5) state : null;
        if (pn5Var != null) {
            return pn5Var.cause;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public <T> T mo93763e(@Nullable Object state) {
        return state;
    }

    /* JADX INFO: renamed from: h */
    public final void m94218h(@Nullable Throwable exception, @Nullable Throwable finallyException) throws IllegalAccessException, InvocationTargetException {
        if (exception == null && finallyException == null) {
            return;
        }
        if (exception != null && finallyException != null) {
            h5f.m129395a(exception, finallyException);
        }
        if (exception == null) {
            exception = finallyException;
        }
        exception.getClass();
        mpb.m155795a(mo93761c().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", exception));
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public abstract Object mo93767j();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        Object objM223820constructorimpl;
        Object objM223820constructorimpl2;
        vei0 vei0Var = this.taskContext;
        try {
            Continuation<T> continuationMo93761c = mo93761c();
            continuationMo93761c.getClass();
            x3e x3eVar = (x3e) continuationMo93761c;
            Continuation<T> continuation = x3eVar.continuation;
            Object obj = x3eVar.countOrElement;
            CoroutineContext context = continuation.getContext();
            Object objM94217c = ThreadContextKt.m94217c(context, obj);
            qnj0<?> qnj0VarM93609g = objM94217c != ThreadContextKt.f66905a ? CoroutineContextKt.m93609g(continuation, context, objM94217c) : null;
            try {
                CoroutineContext context2 = continuation.getContext();
                Object objMo93767j = mo93767j();
                Throwable thMo93762d = mo93762d(objMo93767j);
                InterfaceC15486o interfaceC15486o = (thMo93762d == null && z3e.m217026b(this.resumeMode)) ? (InterfaceC15486o) context2.get(InterfaceC15486o.INSTANCE) : null;
                if (interfaceC15486o != null && !interfaceC15486o.mo93690k()) {
                    CancellationException cancellationExceptionMo93653M = interfaceC15486o.mo93653M();
                    mo93760b(objMo93767j, cancellationExceptionMo93653M);
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m223820constructorimpl(ResultKt.m87238a(cancellationExceptionMo93653M)));
                } else if (thMo93762d != null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    continuation.resumeWith(Result.m223820constructorimpl(ResultKt.m87238a(thMo93762d)));
                } else {
                    Result.Companion companion3 = Result.INSTANCE;
                    continuation.resumeWith(Result.m223820constructorimpl(mo93763e(objMo93767j)));
                }
                Unit unit = Unit.INSTANCE;
                if (qnj0VarM93609g == null || qnj0VarM93609g.m175681h1()) {
                    ThreadContextKt.m94215a(context, objM94217c);
                }
                try {
                    vei0Var.mo198199a();
                    objM223820constructorimpl2 = Result.m223820constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM223820constructorimpl2 = Result.m223820constructorimpl(ResultKt.m87238a(th));
                }
                m94218h(null, Result.m223823exceptionOrNullimpl(objM223820constructorimpl2));
            } catch (Throwable th2) {
                if (qnj0VarM93609g == null || qnj0VarM93609g.m175681h1()) {
                    ThreadContextKt.m94215a(context, objM94217c);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                vei0Var.mo198199a();
                objM223820constructorimpl = Result.m223820constructorimpl(Unit.INSTANCE);
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th4));
            }
            m94218h(th3, Result.m223823exceptionOrNullimpl(objM223820constructorimpl));
        }
    }
}
