package kotlinx.coroutines.debug.internal;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.feed.data.Frame;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.InterfaceC15486o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.tsf0;
import p149l.z01;

/* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\fH\u0082\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u00062\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001d\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00050\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010&\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\"\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010'R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020)0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u000b\u0010,\u001a\u00020+8\u0002X\u0082\u0004R\u000b\u0010.\u001a\u00020-8\u0002X\u0082\u0004¨\u0006/"}, m87232d2 = {"Lkotlinx/coroutines/debug/internal/a;", "", "<init>", "()V", "Lkotlin/Function1;", "", "", Constants.INAPP_DATA_TAG, "()Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/debug/internal/a$a;", "e", "(Lkotlinx/coroutines/debug/internal/a$a;)Z", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "g", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", Owner.TYPE, "f", "(Lkotlinx/coroutines/debug/internal/a$a;)V", "Ljava/lang/StackTraceElement;", "a", "Ljava/lang/StackTraceElement;", "ARTIFICIAL_FRAME", "Ljava/text/SimpleDateFormat;", "b", "Ljava/text/SimpleDateFormat;", "dateFormat", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "c", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "capturedCoroutinesMap", "Z", "getSanitizeStackTraces$kotlinx_coroutines_core", "()Z", "setSanitizeStackTraces$kotlinx_coroutines_core", "(Z)V", "sanitizeStackTraces", "getIgnoreCoroutinesWithEmptyContext", "setIgnoreCoroutinesWithEmptyContext", "ignoreCoroutinesWithEmptyContext", "Lkotlin/jvm/functions/Function1;", "dynamicAttach", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "callerInfoCache", "Lkotlinx/atomicfu/AtomicInt;", "installations", "Lkotlinx/atomicfu/AtomicLong;", "sequenceNumber", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@PublishedApi
@SourceDebugExtension
public final class C15422a {

    @NotNull
    public static final C15422a INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final StackTraceElement ARTIFICIAL_FRAME;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final SimpleDateFormat dateFormat;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentWeakMap<a<?>, Boolean> capturedCoroutinesMap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static boolean sanitizeStackTraces;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static boolean ignoreCoroutinesWithEmptyContext;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public static final Function1<Boolean, Unit> dynamicAttach;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentWeakMap<CoroutineStackFrame, DebugCoroutineInfoImpl> callerInfoCache;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ b f66786h;

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.a$a */
    @Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001e¨\u0006 "}, m87232d2 = {"Lkotlinx/coroutines/debug/internal/a$a;", j6f.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", LovePlanetStage.result, "", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "b", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", BaseSei.INFO, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Ll/tsf0;", "()Ll/tsf0;", Frame.TYPE, "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class a<T> implements Continuation<T>, CoroutineStackFrame {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final Continuation<T> delegate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final DebugCoroutineInfoImpl info;

        /* JADX INFO: renamed from: b */
        public final tsf0 m94054b() {
            this.info.m94041d();
            return null;
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Nullable
        public CoroutineStackFrame getCallerFrame() {
            m94054b();
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        @NotNull
        /* JADX INFO: renamed from: getContext */
        public CoroutineContext getF63379a() {
            return this.delegate.getF63379a();
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Nullable
        public StackTraceElement getStackTraceElement() {
            m94054b();
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object result) {
            C15422a.INSTANCE.m94052f(this);
            this.delegate.resumeWith(result);
        }

        @NotNull
        public String toString() {
            return this.delegate.toString();
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.a$b */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f66789a = AtomicIntegerFieldUpdater.newUpdater(b.class, "installations$volatile");

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ AtomicLongFieldUpdater f66790b = AtomicLongFieldUpdater.newUpdater(b.class, "sequenceNumber$volatile");
        private volatile /* synthetic */ int installations$volatile;
        private volatile /* synthetic */ long sequenceNumber$volatile;

        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C15422a c15422a = new C15422a();
        INSTANCE = c15422a;
        ARTIFICIAL_FRAME = new z01().m216714b();
        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        DefaultConstructorMarker defaultConstructorMarker = null;
        capturedCoroutinesMap = new ConcurrentWeakMap<>(false, 1, defaultConstructorMarker);
        sanitizeStackTraces = true;
        ignoreCoroutinesWithEmptyContext = true;
        dynamicAttach = c15422a.m94050d();
        callerInfoCache = new ConcurrentWeakMap<>(true);
        f66786h = new b(defaultConstructorMarker);
    }

    /* JADX INFO: renamed from: d */
    public final Function1<Boolean, Unit> m94050d() {
        Object objM223820constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            objNewInstance.getClass();
            objM223820constructorimpl = Result.m223820constructorimpl((Function1) TypeIntrinsics.m87540g(objNewInstance, 1));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
        return (Function1) (Result.m223826isFailureimpl(objM223820constructorimpl) ? null : objM223820constructorimpl);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m94051e(a<?> aVar) {
        InterfaceC15486o interfaceC15486o;
        CoroutineContext coroutineContextM94040c = aVar.info.m94040c();
        if (coroutineContextM94040c == null || (interfaceC15486o = (InterfaceC15486o) coroutineContextM94040c.get(InterfaceC15486o.INSTANCE)) == null || !interfaceC15486o.mo93693m()) {
            return false;
        }
        capturedCoroutinesMap.remove(aVar);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m94052f(a<?> owner) {
        CoroutineStackFrame coroutineStackFrameM94053g;
        capturedCoroutinesMap.remove(owner);
        CoroutineStackFrame coroutineStackFrameM94043f = owner.info.m94043f();
        if (coroutineStackFrameM94043f == null || (coroutineStackFrameM94053g = m94053g(coroutineStackFrameM94043f)) == null) {
            return;
        }
        callerInfoCache.remove(coroutineStackFrameM94053g);
    }

    /* JADX INFO: renamed from: g */
    public final CoroutineStackFrame m94053g(CoroutineStackFrame coroutineStackFrame) {
        do {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        } while (coroutineStackFrame.getStackTraceElement() == null);
        return coroutineStackFrame;
    }
}
