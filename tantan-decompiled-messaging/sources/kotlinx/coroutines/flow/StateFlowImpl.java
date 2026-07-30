package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.AbstractC15825b8;
import p149l.eri;
import p149l.hvf0;
import p149l.ivf0;
import p149l.j6f;
import p149l.mt10;
import p149l.raj;
import p149l.su40;
import p149l.yfh0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u00052\u0006\u0010(\u001a\u00020\u0005H\u0002¢\u0006\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R$\u0010\n\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\tR\u0011\u00102\u001a\b\u0012\u0004\u0012\u00020\u0005018\u0002X\u0082\u0004¨\u00063"}, m87232d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", j6f.GPS_DIRECTION_TRUE, "Ll/b8;", "Ll/ivf0;", "Ll/mt10;", "", "Ll/raj;", "initialState", "<init>", "(Ljava/lang/Object;)V", "value", "", "c", "(Ljava/lang/Object;)Z", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "()V", "Ll/fri;", "collector", "", "collect", "(Ll/fri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "m", "()Ll/ivf0;", "", "size", "", "n", "(I)[Ll/ivf0;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Ll/eri;", "a", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Ll/eri;", "expectedState", "newState", "p", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "e", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "Lkotlinx/atomicfu/AtomicRef;", "_state", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class StateFlowImpl<T> extends AbstractC15825b8<ivf0> implements mt10<T>, eri, raj<T> {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66870f = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int sequence;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1 */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "kotlinx.coroutines.flow.StateFlowImpl", m87374f = "StateFlow.kt", m87375l = {384, 396, 401}, m87376m = "collect")
    public static final class C154671 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ StateFlowImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C154671(StateFlowImpl<T> stateFlowImpl, Continuation<? super C154671> continuation) {
            super(continuation);
            this.this$0 = stateFlowImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    public StateFlowImpl(@NotNull Object obj) {
        this._state$volatile = obj;
    }

    @Override // p149l.raj
    @NotNull
    /* JADX INFO: renamed from: a */
    public eri<T> mo94146a(@NotNull CoroutineContext context, int capacity, @NotNull BufferOverflow onBufferOverflow) {
        return hvf0.m133166d(this, context, capacity, onBufferOverflow);
    }

    @Override // p149l.lt10
    /* JADX INFO: renamed from: b */
    public void mo94147b() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // p149l.lt10
    /* JADX INFO: renamed from: c */
    public boolean mo94148c(T value) {
        setValue(value);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b1 A[Catch: all -> 0x009e, PHI: r2 r6 r10 r11 r12
      0x00b1: PHI (r2v7 ??) = (r2v18 ??), (r2v19 ??), (r2v20 ??), (r2v21 ??) binds: [B:53:0x00e9, B:55:0x00fb, B:36:0x00a2, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r6v3 ??) = (r6v10 ??), (r6v11 ??), (r6v5 ??), (r6v12 ??) binds: [B:53:0x00e9, B:55:0x00fb, B:36:0x00a2, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r10v7 'this' kotlinx.coroutines.flow.StateFlowImpl<T>) = 
      (r10v6 'this' kotlinx.coroutines.flow.StateFlowImpl<T>)
      (r10v6 'this' kotlinx.coroutines.flow.StateFlowImpl<T>)
      (r10v9 'this' kotlinx.coroutines.flow.StateFlowImpl<T>)
      (r10v14 'this' kotlinx.coroutines.flow.StateFlowImpl<T>)
     binds: [B:53:0x00e9, B:55:0x00fb, B:36:0x00a2, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r11v4 kotlinx.coroutines.o) = (r11v3 kotlinx.coroutines.o), (r11v3 kotlinx.coroutines.o), (r11v6 kotlinx.coroutines.o), (r11v10 kotlinx.coroutines.o) binds: [B:53:0x00e9, B:55:0x00fb, B:36:0x00a2, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r12v9 java.lang.Object) = (r12v8 java.lang.Object), (r12v8 java.lang.Object), (r12v18 java.lang.Object), (r12v19 java.lang.Object) binds: [B:53:0x00e9, B:55:0x00fb, B:36:0x00a2, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x009e, blocks: (B:37:0x00b1, B:39:0x00bb, B:41:0x00c0, B:52:0x00e5, B:54:0x00eb, B:43:0x00c6, B:47:0x00cd, B:36:0x00a2, B:29:0x0087, B:31:0x008b), top: B:62:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bb A[Catch: all -> 0x009e, TryCatch #2 {all -> 0x009e, blocks: (B:37:0x00b1, B:39:0x00bb, B:41:0x00c0, B:52:0x00e5, B:54:0x00eb, B:43:0x00c6, B:47:0x00cd, B:36:0x00a2, B:29:0x0087, B:31:0x008b), top: B:62:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0 A[Catch: all -> 0x009e, TryCatch #2 {all -> 0x009e, blocks: (B:37:0x00b1, B:39:0x00bb, B:41:0x00c0, B:52:0x00e5, B:54:0x00eb, B:43:0x00c6, B:47:0x00cd, B:36:0x00a2, B:29:0x0087, B:31:0x008b), top: B:62:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #2 {all -> 0x009e, blocks: (B:37:0x00b1, B:39:0x00bb, B:41:0x00c0, B:52:0x00e5, B:54:0x00eb, B:43:0x00c6, B:47:0x00cd, B:36:0x00a2, B:29:0x0087, B:31:0x008b), top: B:62:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14, types: [l.ivf0] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, l.ivf0] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3, types: [l.d8] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, l.ivf0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, l.fri] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00e9 -> B:37:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00fb -> B:37:0x00b1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p149l.dve0, p149l.eri
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull p149l.fri<? super T> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r12) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(l.fri, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // p149l.fri
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        setValue(t);
        return Unit.INSTANCE;
    }

    @Override // p149l.mt10
    public T getValue() {
        yfh0 yfh0Var = su40.f166433a;
        T t = (T) f66870f.get(this);
        if (t == yfh0Var) {
            return null;
        }
        return t;
    }

    @Override // p149l.AbstractC15825b8
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ivf0 mo94149h() {
        return new ivf0();
    }

    @Override // p149l.AbstractC15825b8
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ivf0[] mo94150i(int size) {
        return new ivf0[size];
    }

    /* JADX INFO: renamed from: p */
    public final boolean m94159p(Object expectedState, Object newState) {
        int i;
        ivf0[] ivf0VarArrM100709l;
        synchronized (this) {
            Object obj = f66870f.get(this);
            if (expectedState != null && !Intrinsics.m87488d(obj, expectedState)) {
                return false;
            }
            if (Intrinsics.m87488d(obj, newState)) {
                return true;
            }
            f66870f.set(this, newState);
            int i2 = this.sequence;
            if ((i2 & 1) != 0) {
                this.sequence = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.sequence = i3;
            ivf0[] ivf0VarArrM100709l2 = m100709l();
            Unit unit = Unit.INSTANCE;
            while (true) {
                ivf0[] ivf0VarArr = ivf0VarArrM100709l2;
                if (ivf0VarArr != null) {
                    for (ivf0 ivf0Var : ivf0VarArr) {
                        if (ivf0Var != null) {
                            ivf0Var.m138620g();
                        }
                    }
                }
                synchronized (this) {
                    i = this.sequence;
                    if (i == i3) {
                        this.sequence = i3 + 1;
                        return true;
                    }
                    ivf0VarArrM100709l = m100709l();
                    Unit unit2 = Unit.INSTANCE;
                }
                ivf0VarArrM100709l2 = ivf0VarArrM100709l;
                i3 = i;
            }
        }
    }

    @Override // p149l.mt10
    public void setValue(T t) {
        if (t == null) {
            t = (T) su40.f166433a;
        }
        m94159p(null, t);
    }
}
