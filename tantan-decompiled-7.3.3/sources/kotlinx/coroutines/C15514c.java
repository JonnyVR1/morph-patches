package kotlinx.coroutines;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.C20511u7;
import p153l.ag4;
import p153l.arb;
import p153l.bg4;
import p153l.bu40;
import p153l.c4s;
import p153l.cg4;
import p153l.d40;
import p153l.e45;
import p153l.goh0;
import p153l.hx40;
import p153l.jg4;
import p153l.l5e;
import p153l.n5e;
import p153l.p7f;
import p153l.pr3;
import p153l.rke0;
import p153l.so5;
import p153l.sop0;
import p153l.to5;
import p153l.u9c;
import p153l.uyp;
import p153l.wo5;
import p153l.wtq0;
import p153l.z5e;

/* JADX INFO: renamed from: kotlinx.coroutines.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u0001\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0001\u0010\u000fJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010&JZ\u0010.\u001a\u0004\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\n\u001a\u00020\t2#\u0010,\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0016\u0018\u00010)2\b\u0010-\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b.\u0010/JH\u00100\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\n\u001a\u00020\t2%\b\u0002\u0010,\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0016\u0018\u00010)H\u0002¢\u0006\u0004\b0\u00101JJ\u00103\u001a\u0004\u0018\u0001022\b\u0010(\u001a\u0004\u0018\u00010\u001d2\b\u0010-\u001a\u0004\u0018\u00010\u001d2#\u0010,\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0016\u0018\u00010)H\u0002¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u0002052\b\u0010(\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0016H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0016H\u0016¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\rH\u0001¢\u0006\u0004\b;\u0010\u000fJ\u0017\u0010>\u001a\n\u0018\u00010<j\u0004\u0018\u0001`=H\u0016¢\u0006\u0004\b>\u0010?J\u0011\u0010@\u001a\u0004\u0018\u00010\u001dH\u0010¢\u0006\u0004\b@\u0010AJ!\u0010C\u001a\u00020\u00162\b\u0010B\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\bC\u0010DJ\u0019\u0010E\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\bE\u0010\u0013J\u0017\u0010F\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020H2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bI\u0010JJ8\u0010K\u001a\u00020\u00162!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00160)2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\u00102\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u0011\u0010Q\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0004\bQ\u0010AJ\u000f\u0010R\u001a\u00020\u0016H\u0000¢\u0006\u0004\bR\u00109J\u001d\u0010U\u001a\u00020\u00162\f\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000SH\u0016¢\u0006\u0004\bU\u0010 J<\u0010W\u001a\u00020\u00162\u0006\u0010V\u001a\u00028\u00002#\u0010,\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0016\u0018\u00010)H\u0016¢\u0006\u0004\bW\u0010XJ#\u0010Z\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010Y\u001a\u00020\tH\u0016¢\u0006\u0004\bZ\u0010[J8\u0010]\u001a\u00020\u00162'\u0010\u001e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00160)j\u0002`\\H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020HH\u0000¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u0016H\u0000¢\u0006\u0004\ba\u00109JH\u0010b\u001a\u0004\u0018\u00010\u001d2\u0006\u0010V\u001a\u00028\u00002\b\u0010-\u001a\u0004\u0018\u00010\u001d2#\u0010,\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0016\u0018\u00010)H\u0016¢\u0006\u0004\bb\u0010cJ\u0019\u0010e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010d\u001a\u00020\u0010H\u0016¢\u0006\u0004\be\u0010fJ\u0017\u0010h\u001a\u00020\u00162\u0006\u0010g\u001a\u00020\u001dH\u0016¢\u0006\u0004\bh\u0010 J\u001b\u0010j\u001a\u00020\u0016*\u00020i2\u0006\u0010V\u001a\u00028\u0000H\u0016¢\u0006\u0004\bj\u0010kJ\u001b\u0010l\u001a\u00020\u0016*\u00020i2\u0006\u0010d\u001a\u00020\u0010H\u0016¢\u0006\u0004\bl\u0010mJ\u001f\u0010n\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0010¢\u0006\u0004\bn\u0010oJ\u001b\u0010p\u001a\u0004\u0018\u00010\u00102\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0010¢\u0006\u0004\bp\u0010qJ\u000f\u0010s\u001a\u00020rH\u0016¢\u0006\u0004\bs\u0010tJ\u000f\u0010u\u001a\u00020rH\u0014¢\u0006\u0004\bu\u0010tR \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bp\u0010v\u001a\u0004\bw\u0010xR\u001a\u0010}\u001a\u00020y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010z\u001a\u0004\b{\u0010|R\u0016\u0010\u007f\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u001cR\u0016\u0010\u0081\u0001\u001a\u00020r8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010tR\u0017\u0010!\u001a\u0004\u0018\u00010\u001d8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010AR\u0016\u0010\u0084\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u000fR\u001f\u0010\u0087\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\r\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004R\u0015\u0010\u008b\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u008a\u00018\u0002X\u0082\u0004R\u0015\u0010\u008c\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u008a\u00018\u0002X\u0082\u0004¨\u0006\u008d\u0001"}, m88121d2 = {"Lkotlinx/coroutines/c;", p7f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/j;", "Ll/ag4;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ll/sop0;", "Lkotlin/coroutines/Continuation;", "delegate", "", "resumeMode", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "", "K", "()Z", "", "cause", "p", "(Ljava/lang/Throwable;)Z", "Ll/rke0;", "segment", "", "o", "(Ll/rke0;Ljava/lang/Throwable;)V", p7f.GPS_MEASUREMENT_INTERRUPTED, "Ll/z5e;", "H", "()Ll/z5e;", "", "handler", "I", "(Ljava/lang/Object;)V", "state", "L", "(Ljava/lang/Object;Ljava/lang/Object;)V", "mode", BLiveStormDanmakuGiftResourceType.f45294s, "(I)V", "Ll/hx40;", "proposedUpdate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "onCancellation", "idempotent", p7f.LATITUDE_SOUTH, "(Ll/hx40;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;", "Q", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)V", "Ll/goh0;", "U", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll/goh0;", "", "k", "(Ljava/lang/Object;)Ljava/lang/Void;", "r", "()V", "G", "P", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "j", "()Ljava/lang/Object;", "takenState", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", RXScreenCaptureService.KEY_INDEX, "N", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/b;", BLiveStormDanmakuGiftResourceType.f45292l, "(Lkotlinx/coroutines/b;Ljava/lang/Throwable;)V", "n", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/o;", "parent", Constants.KEY_T, "(Lkotlinx/coroutines/o;)Ljava/lang/Throwable;", ResourceDirection.f39656v, BloodType.f39576O, "Lkotlin/Result;", LovePlanetStage.result, "resumeWith", "value", "f", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", FirebaseAnalytics.Param.INDEX, "g", "(Ll/rke0;I)V", "Lkotlinx/coroutines/CompletionHandler;", BaseSei.f14624X, "(Lkotlin/jvm/functions/Function1;)V", "J", "(Lkotlinx/coroutines/b;)V", "q", "A", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "exception", BaseSei.f14625Y, "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "w", "Lkotlinx/coroutines/CoroutineDispatcher;", "B", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "a", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "M", "Lkotlin/coroutines/Continuation;", "c", "()Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "u", "parentHandle", c4s.C_ZONE, "stateDebugRepresentation", BaseSei.f14626Z, "m", "isCompleted", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "_parentHandle", "_state", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@PublishedApi
@SourceDebugExtension
public class C15514c<T> extends AbstractC15588j<T> implements ag4<T>, CoroutineStackFrame, sop0 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f67373f = AtomicIntegerFieldUpdater.newUpdater(C15514c.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67374g = AtomicReferenceFieldUpdater.newUpdater(C15514c.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67375h = AtomicReferenceFieldUpdater.newUpdater(C15514c.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Continuation<T> delegate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    /* JADX WARN: Multi-variable type inference failed */
    public C15514c(@NotNull Continuation<? super T> continuation, int i) {
        super(i);
        this.delegate = continuation;
        this.context = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = d40.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m94633R(C15514c c15514c, Object obj, int i, Function1 function1, int i2, Object obj2) {
        if (obj2 != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: resumeImpl");
            return;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        c15514c.m94646Q(obj, i, function1);
    }

    @Override // p153l.ag4
    @Nullable
    /* JADX INFO: renamed from: A */
    public Object mo94634A(T value, @Nullable Object idempotent, @Nullable Function1<? super Throwable, Unit> onCancellation) {
        return m94649U(value, idempotent, onCancellation);
    }

    @Override // p153l.ag4
    /* JADX INFO: renamed from: B */
    public void mo94635B(@NotNull CoroutineDispatcher coroutineDispatcher, T t) {
        Continuation<T> continuation = this.delegate;
        l5e l5eVar = continuation instanceof l5e ? (l5e) continuation : null;
        m94633R(this, t, (l5eVar != null ? l5eVar.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    /* JADX INFO: renamed from: C */
    public final String m94636C() {
        Object objM94674z = m94674z();
        if (objM94674z instanceof hx40) {
            return "Active";
        }
        return objM94674z instanceof jg4 ? "Cancelled" : "Completed";
    }

    /* JADX INFO: renamed from: G */
    public void m94637G() {
        z5e z5eVarM94638H = m94638H();
        if (z5eVarM94638H != null && mo94662m()) {
            z5eVarM94638H.dispose();
            f67375h.set(this, bu40.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: H */
    public final z5e m94638H() {
        InterfaceC15593o interfaceC15593o = (InterfaceC15593o) getContext().get(InterfaceC15593o.INSTANCE);
        if (interfaceC15593o == null) {
            return null;
        }
        z5e z5eVarM94518m = JobKt__JobKt.m94518m(interfaceC15593o, true, false, new e45(this), 2, null);
        C20511u7.m194801a(f67375h, this, null, z5eVarM94518m);
        return z5eVarM94518m;
    }

    /* JADX INFO: renamed from: I */
    public final void m94639I(Object handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67374g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof d40)) {
                if (obj instanceof InterfaceC15513b ? true : obj instanceof rke0) {
                    m94642L(handler, obj);
                } else {
                    if (obj instanceof to5) {
                        to5 to5Var = (to5) obj;
                        if (!to5Var.m192010c()) {
                            m94642L(handler, obj);
                        }
                        if (obj instanceof jg4) {
                            Throwable th = to5Var.cause;
                            if (handler instanceof InterfaceC15513b) {
                                m94661l((InterfaceC15513b) handler, th);
                                return;
                            } else {
                                handler.getClass();
                                m94664o((rke0) handler, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj instanceof so5) {
                        so5 so5Var = (so5) obj;
                        if (so5Var.cancelHandler != null) {
                            m94642L(handler, obj);
                        }
                        if (handler instanceof rke0) {
                            return;
                        }
                        handler.getClass();
                        InterfaceC15513b interfaceC15513b = (InterfaceC15513b) handler;
                        if (so5Var.m187154c()) {
                            m94661l(interfaceC15513b, so5Var.cancelCause);
                            return;
                        } else {
                            if (C20511u7.m194801a(f67374g, this, obj, so5.m187152b(so5Var, null, interfaceC15513b, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (handler instanceof rke0) {
                            return;
                        }
                        handler.getClass();
                        if (C20511u7.m194801a(f67374g, this, obj, new so5(obj, (InterfaceC15513b) handler, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (C20511u7.m194801a(f67374g, this, obj, handler)) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m94640J(@NotNull InterfaceC15513b handler) {
        m94639I(handler);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m94641K() {
        if (!n5e.m161707c(this.resumeMode)) {
            return false;
        }
        Continuation<T> continuation = this.delegate;
        continuation.getClass();
        return ((l5e) continuation).m152937q();
    }

    /* JADX INFO: renamed from: L */
    public final void m94642L(Object handler, Object state) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + handler + ", already has " + state).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public String mo94599M() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: N */
    public final void m94643N(@NotNull Throwable cause) {
        if (m94665p(cause)) {
            return;
        }
        mo94658i(cause);
        m94667r();
    }

    /* JADX INFO: renamed from: O */
    public final void m94644O() {
        Throwable thM152940t;
        Continuation<T> continuation = this.delegate;
        l5e l5eVar = continuation instanceof l5e ? (l5e) continuation : null;
        if (l5eVar == null || (thM152940t = l5eVar.m152940t(this)) == null) {
            return;
        }
        m94666q();
        mo94658i(thM152940t);
    }

    @JvmName
    /* JADX INFO: renamed from: P */
    public final boolean m94645P() {
        Object obj = f67374g.get(this);
        if ((obj instanceof so5) && ((so5) obj).idempotentResume != null) {
            m94666q();
            return false;
        }
        f67373f.set(this, 536870911);
        f67374g.set(this, d40.INSTANCE);
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public final void m94646Q(Object proposedUpdate, int resumeMode, Function1<? super Throwable, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67374g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof hx40)) {
                C15514c<T> c15514c = this;
                Object obj2 = proposedUpdate;
                Function1<? super Throwable, Unit> function1 = onCancellation;
                if (obj instanceof jg4) {
                    jg4 jg4Var = (jg4) obj;
                    if (jg4Var.m144751e()) {
                        if (function1 != null) {
                            c15514c.m94663n(function1, jg4Var.cause);
                            return;
                        }
                        return;
                    }
                }
                c15514c.m94660k(obj2);
                throw new KotlinNothingValueException();
            }
            C15514c<T> c15514c2 = this;
            Object obj3 = proposedUpdate;
            int i = resumeMode;
            Function1<? super Throwable, Unit> function2 = onCancellation;
            if (C20511u7.m194801a(f67374g, c15514c2, obj, c15514c2.m94647S((hx40) obj, obj3, i, function2, null))) {
                c15514c2.m94667r();
                c15514c2.m94668s(i);
                return;
            } else {
                this = c15514c2;
                proposedUpdate = obj3;
                resumeMode = i;
                onCancellation = function2;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final Object m94647S(hx40 state, Object proposedUpdate, int resumeMode, Function1<? super Throwable, Unit> onCancellation, Object idempotent) {
        if (proposedUpdate instanceof to5) {
            return proposedUpdate;
        }
        if ((n5e.m161706b(resumeMode) || idempotent != null) && !(onCancellation == null && !(state instanceof InterfaceC15513b) && idempotent == null)) {
            return new so5(proposedUpdate, state instanceof InterfaceC15513b ? (InterfaceC15513b) state : null, onCancellation, idempotent, null, 16, null);
        }
        return proposedUpdate;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m94648T() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f67373f;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                wtq0.m207906a("Already resumed");
                return false;
            }
        } while (!f67373f.compareAndSet(this, i, 1073741824 + (536870911 & i)));
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final goh0 m94649U(Object proposedUpdate, Object idempotent, Function1<? super Throwable, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67374g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof hx40)) {
                Object obj2 = idempotent;
                if ((obj instanceof so5) && obj2 != null && ((so5) obj).idempotentResume == obj2) {
                    return bg4.f76566a;
                }
                return null;
            }
            C15514c<T> c15514c = this;
            Object obj3 = proposedUpdate;
            Object obj4 = idempotent;
            Function1<? super Throwable, Unit> function1 = onCancellation;
            if (C20511u7.m194801a(f67374g, c15514c, obj, c15514c.m94647S((hx40) obj, obj3, this.resumeMode, function1, obj4))) {
                c15514c.m94667r();
                return bg4.f76566a;
            }
            this = c15514c;
            proposedUpdate = obj3;
            onCancellation = function1;
            idempotent = obj4;
        }
    }

    /* JADX INFO: renamed from: V */
    public final boolean m94650V() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f67373f;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                wtq0.m207906a("Already suspended");
                return false;
            }
        } while (!f67373f.compareAndSet(this, i, 536870912 + (536870911 & i)));
        return true;
    }

    @Override // p153l.ag4
    /* JADX INFO: renamed from: a */
    public void mo94651a(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Throwable th) {
        Continuation<T> continuation = this.delegate;
        l5e l5eVar = continuation instanceof l5e ? (l5e) continuation : null;
        m94633R(this, new to5(th, false, 2, null), (l5eVar != null ? l5eVar.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.AbstractC15588j
    /* JADX INFO: renamed from: b */
    public void mo94652b(@Nullable Object takenState, @NotNull Throwable cause) {
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67374g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof hx40) {
                wtq0.m207906a("Not completed");
                return;
            }
            if (obj instanceof to5) {
                return;
            }
            if (obj instanceof so5) {
                so5 so5Var = (so5) obj;
                if (so5Var.m187154c()) {
                    wtq0.m207906a("Must be called at most once");
                    return;
                }
                Throwable th2 = cause;
                th = th2;
                if (C20511u7.m194801a(f67374g, this, obj, so5.m187152b(so5Var, null, null, null, null, th2, 15, null))) {
                    so5Var.m187155d(this, th);
                    return;
                }
            } else {
                th = cause;
                if (C20511u7.m194801a(f67374g, this, obj, new so5(obj, null, null, null, th, 14, null))) {
                    return;
                }
            }
            cause = th;
        }
    }

    @Override // kotlinx.coroutines.AbstractC15588j
    @NotNull
    /* JADX INFO: renamed from: c */
    public final Continuation<T> mo94653c() {
        return this.delegate;
    }

    @Override // kotlinx.coroutines.AbstractC15588j
    @Nullable
    /* JADX INFO: renamed from: d */
    public Throwable mo94654d(@Nullable Object state) {
        Throwable thMo94654d = super.mo94654d(state);
        if (thMo94654d != null) {
            return thMo94654d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.AbstractC15588j
    /* JADX INFO: renamed from: e */
    public <T> T mo94655e(@Nullable Object state) {
        return state instanceof so5 ? (T) ((so5) state).com.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String : state;
    }

    @Override // p153l.ag4
    /* JADX INFO: renamed from: f */
    public void mo94656f(T value, @Nullable Function1<? super Throwable, Unit> onCancellation) {
        m94646Q(value, this.resumeMode, onCancellation);
    }

    @Override // p153l.sop0
    /* JADX INFO: renamed from: g */
    public void mo94657g(@NotNull rke0<?> segment, int index) {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f67373f;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & 536870911) != 536870911) {
                wtq0.m207906a("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, ((i >> 29) << 29) + index));
        m94639I(segment);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.delegate;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.context;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p153l.ag4
    /* JADX INFO: renamed from: i */
    public boolean mo94658i(@Nullable Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67374g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof hx40)) {
                return false;
            }
        } while (!C20511u7.m194801a(f67374g, this, obj, new jg4(this, cause, (obj instanceof InterfaceC15513b) || (obj instanceof rke0))));
        hx40 hx40Var = (hx40) obj;
        if (hx40Var instanceof InterfaceC15513b) {
            m94661l((InterfaceC15513b) obj, cause);
        } else if (hx40Var instanceof rke0) {
            m94664o((rke0) obj, cause);
        }
        m94667r();
        m94668s(this.resumeMode);
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC15588j
    @Nullable
    /* JADX INFO: renamed from: j */
    public Object mo94659j() {
        return m94674z();
    }

    /* JADX INFO: renamed from: k */
    public final Void m94660k(Object proposedUpdate) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + proposedUpdate).toString());
    }

    /* JADX INFO: renamed from: l */
    public final void m94661l(@NotNull InterfaceC15513b handler, @Nullable Throwable cause) {
        try {
            handler.mo94629a(cause);
        } catch (Throwable th) {
            arb.m99658a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    @Override // p153l.ag4
    /* JADX INFO: renamed from: m */
    public boolean mo94662m() {
        return !(m94674z() instanceof hx40);
    }

    /* JADX INFO: renamed from: n */
    public final void m94663n(@NotNull Function1<? super Throwable, Unit> onCancellation, @NotNull Throwable cause) {
        try {
            onCancellation.invoke(cause);
        } catch (Throwable th) {
            arb.m99658a(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m94664o(rke0<?> segment, Throwable cause) {
        int i = f67373f.get(this) & 536870911;
        if (i == 536870911) {
            wtq0.m207906a("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            segment.mo172933s(i, cause, getContext());
        } catch (Throwable th) {
            arb.m99658a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m94665p(Throwable cause) {
        if (!m94641K()) {
            return false;
        }
        Continuation<T> continuation = this.delegate;
        continuation.getClass();
        return ((l5e) continuation).m152938r(cause);
    }

    /* JADX INFO: renamed from: q */
    public final void m94666q() {
        z5e z5eVarM94669u = m94669u();
        if (z5eVarM94669u == null) {
            return;
        }
        z5eVarM94669u.dispose();
        f67375h.set(this, bu40.INSTANCE);
    }

    /* JADX INFO: renamed from: r */
    public final void m94667r() {
        if (m94641K()) {
            return;
        }
        m94666q();
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object result) {
        m94633R(this, wo5.m207262c(result, this), this.resumeMode, null, 4, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m94668s(int mode) {
        if (m94648T()) {
            return;
        }
        n5e.m161705a(this, mode);
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public Throwable mo94600t(@NotNull InterfaceC15593o parent) {
        return parent.mo94544M();
    }

    @NotNull
    public String toString() {
        return mo94599M() + '(' + u9c.m195088c(this.delegate) + "){" + m94636C() + "}@" + u9c.m195087b(this);
    }

    /* JADX INFO: renamed from: u */
    public final z5e m94669u() {
        return (z5e) f67375h.get(this);
    }

    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: v */
    public final Object m94670v() {
        InterfaceC15593o interfaceC15593o;
        boolean zM94641K = m94641K();
        if (m94650V()) {
            if (m94669u() == null) {
                m94638H();
            }
            if (zM94641K) {
                m94644O();
            }
            return uyp.m198688e();
        }
        if (zM94641K) {
            m94644O();
        }
        Object objM94674z = m94674z();
        if (objM94674z instanceof to5) {
            throw ((to5) objM94674z).cause;
        }
        if (!n5e.m161706b(this.resumeMode) || (interfaceC15593o = (InterfaceC15593o) getContext().get(InterfaceC15593o.INSTANCE)) == null || interfaceC15593o.mo94581k()) {
            return mo94655e(objM94674z);
        }
        CancellationException cancellationExceptionMo94544M = interfaceC15593o.mo94544M();
        mo94652b(objM94674z, cancellationExceptionMo94544M);
        throw cancellationExceptionMo94544M;
    }

    @Override // p153l.ag4
    /* JADX INFO: renamed from: w */
    public void mo94671w(@NotNull Object token) {
        m94668s(this.resumeMode);
    }

    @Override // p153l.ag4
    /* JADX INFO: renamed from: x */
    public void mo94672x(@NotNull Function1<? super Throwable, Unit> handler) {
        cg4.m109665c(this, new InterfaceC15513b.a(handler));
    }

    @Override // p153l.ag4
    @Nullable
    /* JADX INFO: renamed from: y */
    public Object mo94673y(@NotNull Throwable exception) {
        return m94649U(new to5(exception, false, 2, null), null, null);
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public final Object m94674z() {
        return f67374g.get(this);
    }
}
