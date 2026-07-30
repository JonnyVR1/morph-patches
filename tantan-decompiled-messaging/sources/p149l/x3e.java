package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
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
import kotlinx.coroutines.AbstractC15481j;
import kotlinx.coroutines.C15407c;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u001aH\u0010¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00028\u0000H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001e\u00109\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b6\u00107\u0012\u0004\b8\u0010\u0014R\u0014\u0010;\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b:\u00107R\u0014\u0010+\u001a\u00020*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001c\u0010@\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0018R\u0013\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0F8\u0002X\u0082\u0004¨\u0006H"}, m87232d2 = {"Ll/x3e;", j6f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/j;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "q", "()Z", "", "k", "()V", BLiveStormDanmakuGiftResourceType.f44446s, "Lkotlinx/coroutines/c;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lkotlinx/coroutines/c;", "Ll/bf4;", "", Constants.KEY_T, "(Ll/bf4;)Ljava/lang/Throwable;", "cause", "r", "(Ljava/lang/Throwable;)Z", "", "j", "()Ljava/lang/Object;", "Lkotlin/Result;", LovePlanetStage.result, "resumeWith", "(Ljava/lang/Object;)V", "takenState", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "n", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Lkotlinx/coroutines/CoroutineDispatcher;", "e", "Lkotlin/coroutines/Continuation;", "f", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "g", "countOrElement", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "c", "()Lkotlin/coroutines/Continuation;", "delegate", "o", "reusableCancellableContinuation", "Lkotlinx/atomicfu/AtomicRef;", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@PublishedApi
@SourceDebugExtension
public final class x3e<T> extends AbstractC15481j<T> implements CoroutineStackFrame, Continuation<T> {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f190882h = AtomicReferenceFieldUpdater.newUpdater(x3e.class, Object.class, "_reusableCancellableContinuation$volatile");
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
    public x3e(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super T> continuation) {
        super(-1);
        this.dispatcher = coroutineDispatcher;
        this.continuation = continuation;
        this._state = y3e.f195793a;
        this.countOrElement = ThreadContextKt.m94216b(getContext());
    }

    @Override // kotlinx.coroutines.AbstractC15481j
    /* JADX INFO: renamed from: b */
    public void mo93760b(@Nullable Object takenState, @NotNull Throwable cause) {
        if (takenState instanceof qn5) {
            ((qn5) takenState).onCancellation.invoke(cause);
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

    @Override // kotlinx.coroutines.AbstractC15481j
    @Nullable
    /* JADX INFO: renamed from: j */
    public Object mo93767j() {
        Object obj = this._state;
        this._state = y3e.f195793a;
        return obj;
    }

    /* JADX INFO: renamed from: k */
    public final void m206900k() {
        while (f190882h.get(this) == y3e.f195794b) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final C15407c<T> m206901l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f190882h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f190882h.set(this, y3e.f195794b);
                return null;
            }
            if (obj instanceof C15407c) {
                if (C21643z7.m217426a(f190882h, this, obj, y3e.f195794b)) {
                    return (C15407c) obj;
                }
            } else if (obj != y3e.f195794b && !(obj instanceof Throwable)) {
                nnq.m160357a("Inconsistent state ", obj);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m206902n(@NotNull CoroutineContext context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.dispatchYield(context, this);
    }

    /* JADX INFO: renamed from: o */
    public final C15407c<?> m206903o() {
        Object obj = f190882h.get(this);
        if (obj instanceof C15407c) {
            return (C15407c) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m206904q() {
        return f190882h.get(this) != null;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m206905r(@NotNull Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f190882h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            yfh0 yfh0Var = y3e.f195794b;
            if (Intrinsics.m87488d(obj, yfh0Var)) {
                if (C21643z7.m217426a(f190882h, this, yfh0Var, cause)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (C21643z7.m217426a(f190882h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object result) {
        CoroutineContext context = this.continuation.getContext();
        Object objM185034d = sn5.m185034d(result, null, 1, null);
        if (this.dispatcher.isDispatchNeeded(context)) {
            this._state = objM185034d;
            this.resumeMode = 0;
            this.dispatcher.dispatch(context, this);
            return;
        }
        s3f s3fVarM189886b = toi0.INSTANCE.m189886b();
        if (s3fVarM189886b.m182156h0()) {
            this._state = objM185034d;
            this.resumeMode = 0;
            s3fVarM189886b.m182153Z(this);
            return;
        }
        s3fVarM189886b.m182155d0(true);
        try {
            CoroutineContext context2 = getContext();
            Object objM94217c = ThreadContextKt.m94217c(context2, this.countOrElement);
            try {
                this.continuation.resumeWith(result);
                Unit unit = Unit.INSTANCE;
                ThreadContextKt.m94215a(context2, objM94217c);
                while (s3fVarM189886b.m182158k0()) {
                }
            } catch (Throwable th) {
                ThreadContextKt.m94215a(context2, objM94217c);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                m94218h(th2, null);
            } finally {
                s3fVarM189886b.m182154d(true);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m206906s() {
        m206900k();
        C15407c<?> c15407cM206903o = m206903o();
        if (c15407cM206903o != null) {
            c15407cM206903o.m93774q();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final Throwable m206907t(@NotNull bf4<?> continuation) {
        yfh0 yfh0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f190882h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            yfh0Var = y3e.f195794b;
            if (obj != yfh0Var) {
                if (!(obj instanceof Throwable)) {
                    nnq.m160357a("Inconsistent state ", obj);
                    return null;
                }
                if (C21643z7.m217426a(f190882h, this, obj, null)) {
                    return (Throwable) obj;
                }
                ig3.m135964a("Failed requirement.");
                return null;
            }
        } while (!C21643z7.m217426a(f190882h, this, yfh0Var, continuation));
        return null;
    }

    @NotNull
    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + o8c.m163113c(this.continuation) + ']';
    }

    @Override // kotlinx.coroutines.AbstractC15481j
    @NotNull
    /* JADX INFO: renamed from: c */
    public Continuation<T> mo93761c() {
        return this;
    }
}
