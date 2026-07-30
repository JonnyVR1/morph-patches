package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC15588j;
import kotlinx.coroutines.C15514c;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u001aH\u0010¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00028\u0000H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001e\u00109\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b6\u00107\u0012\u0004\b8\u0010\u0014R\u0014\u0010;\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b:\u00107R\u0014\u0010+\u001a\u00020*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001c\u0010@\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0018R\u0013\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0F8\u0002X\u0082\u0004¨\u0006H"}, m88121d2 = {"Ll/l5e;", p7f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/j;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "q", "()Z", "", "k", "()V", BLiveStormDanmakuGiftResourceType.f45294s, "Lkotlinx/coroutines/c;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lkotlinx/coroutines/c;", "Ll/ag4;", "", Constants.KEY_T, "(Ll/ag4;)Ljava/lang/Throwable;", "cause", "r", "(Ljava/lang/Throwable;)Z", "", "j", "()Ljava/lang/Object;", "Lkotlin/Result;", LovePlanetStage.result, "resumeWith", "(Ljava/lang/Object;)V", "takenState", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "n", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Lkotlinx/coroutines/CoroutineDispatcher;", "e", "Lkotlin/coroutines/Continuation;", "f", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "g", "countOrElement", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "c", "()Lkotlin/coroutines/Continuation;", "delegate", "o", "reusableCancellableContinuation", "Lkotlinx/atomicfu/AtomicRef;", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@PublishedApi
@SourceDebugExtension
public final class l5e<T> extends AbstractC15588j<T> implements CoroutineStackFrame, Continuation<T> {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f130103h = AtomicReferenceFieldUpdater.newUpdater(l5e.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Continuation<T> continuation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public Object _state;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Object countOrElement;

    /* JADX WARN: Multi-variable type inference failed */
    public l5e(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super T> continuation) {
        super(-1);
        this.dispatcher = coroutineDispatcher;
        this.continuation = continuation;
        this._state = m5e.f134888a;
        this.countOrElement = ThreadContextKt.m95109b(getContext());
    }

    @Override // kotlinx.coroutines.AbstractC15588j
    /* JADX INFO: renamed from: b */
    public void mo94652b(@Nullable Object takenState, @NotNull Throwable cause) {
        if (takenState instanceof uo5) {
            ((uo5) takenState).onCancellation.invoke(cause);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.continuation;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.continuation.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC15588j
    @Nullable
    /* JADX INFO: renamed from: j */
    public Object mo94659j() {
        Object obj = this._state;
        this._state = m5e.f134888a;
        return obj;
    }

    /* JADX INFO: renamed from: k */
    public final void m152933k() {
        while (f130103h.get(this) == m5e.f134889b) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final C15514c<T> m152934l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f130103h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f130103h.set(this, m5e.f134889b);
                return null;
            }
            if (obj instanceof C15514c) {
                if (C20511u7.m194801a(f130103h, this, obj, m5e.f134889b)) {
                    return (C15514c) obj;
                }
            } else if (obj != m5e.f134889b && !(obj instanceof Throwable)) {
                mpq.m159379a("Inconsistent state ", obj);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m152935n(@NotNull CoroutineContext context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.dispatchYield(context, this);
    }

    /* JADX INFO: renamed from: o */
    public final C15514c<?> m152936o() {
        Object obj = f130103h.get(this);
        if (obj instanceof C15514c) {
            return (C15514c) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m152937q() {
        return f130103h.get(this) != null;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m152938r(@NotNull Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f130103h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            goh0 goh0Var = m5e.f134889b;
            if (Intrinsics.m88377d(obj, goh0Var)) {
                if (C20511u7.m194801a(f130103h, this, goh0Var, cause)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (C20511u7.m194801a(f130103h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object result) {
        CoroutineContext context = this.continuation.getContext();
        Object objM207263d = wo5.m207263d(result, null, 1, null);
        if (this.dispatcher.isDispatchNeeded(context)) {
            this._state = objM207263d;
            this.resumeMode = 0;
            this.dispatcher.dispatch(context, this);
            return;
        }
        w4f w4fVarM203845b = vxi0.INSTANCE.m203845b();
        if (w4fVarM203845b.m204880i0()) {
            this._state = objM207263d;
            this.resumeMode = 0;
            w4fVarM203845b.m204877a0(this);
            return;
        }
        w4fVarM203845b.m204879e0(true);
        try {
            CoroutineContext context2 = getContext();
            Object objM95110c = ThreadContextKt.m95110c(context2, this.countOrElement);
            try {
                this.continuation.resumeWith(result);
                Unit unit = Unit.INSTANCE;
                ThreadContextKt.m95108a(context2, objM95110c);
                while (w4fVarM203845b.m204882l0()) {
                }
            } catch (Throwable th) {
                ThreadContextKt.m95108a(context2, objM95110c);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                m95111h(th2, null);
            } finally {
                w4fVarM203845b.m204878d(true);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m152939s() {
        m152933k();
        C15514c<?> c15514cM152936o = m152936o();
        if (c15514cM152936o != null) {
            c15514cM152936o.m94666q();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final Throwable m152940t(@NotNull ag4<?> continuation) {
        goh0 goh0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f130103h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            goh0Var = m5e.f134889b;
            if (obj != goh0Var) {
                if (!(obj instanceof Throwable)) {
                    mpq.m159379a("Inconsistent state ", obj);
                    return null;
                }
                if (C20511u7.m194801a(f130103h, this, obj, null)) {
                    return (Throwable) obj;
                }
                wg3.m206174a("Failed requirement.");
                return null;
            }
        } while (!C20511u7.m194801a(f130103h, this, goh0Var, continuation));
        return null;
    }

    @NotNull
    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + u9c.m195088c(this.continuation) + ']';
    }

    @Override // kotlinx.coroutines.AbstractC15588j
    @NotNull
    /* JADX INFO: renamed from: c */
    public Continuation<T> mo94653c() {
        return this;
    }
}
