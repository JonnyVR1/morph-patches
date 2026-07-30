package kotlinx.coroutines.sync;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15407c;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.C21643z7;
import p149l.b2s;
import p149l.bde0;
import p149l.bf4;
import p149l.cde0;
import p149l.df4;
import p149l.l4e;
import p149l.mce0;
import p149l.nnq;
import p149l.o8c;
import p149l.ofp0;
import p149l.ot10;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002/+B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\u000b2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0004\b\u001e\u0010\rJ\u0019\u0010\u001f\u001a\u00020\u001b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u001dRq\u0010*\u001a_\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0011¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000b0%0 j\u0002`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070.8\u0002X\u0082\u0004¨\u00060"}, m87232d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/SemaphoreImpl;", "Ll/ot10;", "", "locked", "<init>", "(Z)V", "", Owner.TYPE, BaseSei.f13930X, "(Ljava/lang/Object;)Z", "", "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "D", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)V", "Ll/bde0;", "select", b2s.C_ZONE, "(Ll/bde0;Ljava/lang/Object;)V", LovePlanetStage.result, "B", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", BaseSei.f13931Y, "(Ljava/lang/Object;)I", "A", "E", "Lkotlin/Function3;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "param", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "h", "Lkotlin/jvm/functions/Function3;", "onSelectCancellationUnlockConstructor", "a", "()Z", "isLocked", "Lkotlinx/atomicfu/AtomicRef;", "CancellableContinuationWithOwner", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public class MutexImpl extends SemaphoreImpl implements ot10 {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66975i = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Function3<bde0<?>, Object, Object, Function1<Throwable, Unit>> onSelectCancellationUnlockConstructor;
    private volatile /* synthetic */ Object owner$volatile;

    @Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0017\u001a\u00020\u00022'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00020\u0012j\u0002`\u0015H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u0011J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010!\u001a\u00020\u0002*\u00020\u001f2\u0006\u0010 \u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u001c\u0010#\u001a\u00020\u0002*\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b#\u0010$J$\u0010)\u001a\u00020\u00022\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%2\u0006\u0010(\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b)\u0010*JH\u0010-\u001a\u0004\u0018\u00010\u00062\u0006\u0010 \u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u00062#\u0010,\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012H\u0016¢\u0006\u0004\b-\u0010.J<\u0010/\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022#\u0010,\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012H\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u00101R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u00102R\u0014\u00106\u001a\u0002038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, m87232d2 = {"Lkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner;", "Ll/bf4;", "", "Ll/ofp0;", "Lkotlinx/coroutines/c;", "cont", "", Owner.TYPE, "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/c;Ljava/lang/Object;)V", "", "cause", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/Throwable;)Z", "token", "w", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "Lkotlinx/coroutines/CompletionHandler;", "handler", BaseSei.f13930X, "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Result;", LovePlanetStage.result, "resumeWith", "exception", BaseSei.f13931Y, "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineDispatcher;", "value", "c", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/Unit;)V", "a", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "Ll/mce0;", "segment", "", FirebaseAnalytics.Param.INDEX, "g", "(Ll/mce0;I)V", "idempotent", "onCancellation", Constants.INAPP_DATA_TAG, "(Lkotlin/Unit;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "b", "(Lkotlin/Unit;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/c;", "Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "m", "()Z", "isCompleted", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public final class CancellableContinuationWithOwner implements bf4<Unit>, ofp0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final C15407c<Unit> cont;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Object owner;

        /* JADX WARN: Multi-variable type inference failed */
        public CancellableContinuationWithOwner(@Nullable C15407c<? super Unit> c15407c, Object obj) {
            this.cont = c15407c;
            this.owner = obj;
        }

        @Override // p149l.bf4
        /* JADX INFO: renamed from: a */
        public void mo93759a(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Throwable th) {
            this.cont.mo93759a(coroutineDispatcher, th);
        }

        @Override // p149l.bf4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo93764f(@NotNull Unit value, @Nullable Function1<? super Throwable, Unit> onCancellation) {
            MutexImpl.m94346w().set(MutexImpl.this, this.owner);
            C15407c<Unit> c15407c = this.cont;
            final MutexImpl mutexImpl = MutexImpl.this;
            c15407c.mo93764f(value, new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$resume$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    mutexImpl.mo94355d(this.owner);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            });
        }

        @Override // p149l.bf4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo93743B(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Unit unit) {
            this.cont.mo93743B(coroutineDispatcher, unit);
        }

        @Override // p149l.bf4
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object mo93742A(@NotNull Unit value, @Nullable Object idempotent, @Nullable Function1<? super Throwable, Unit> onCancellation) {
            C15407c<Unit> c15407c = this.cont;
            final MutexImpl mutexImpl = MutexImpl.this;
            Object objMo93742A = c15407c.mo93742A(value, idempotent, new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$tryResume$token$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    MutexImpl.m94346w().set(mutexImpl, this.owner);
                    mutexImpl.mo94355d(this.owner);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            });
            if (objMo93742A != null) {
                MutexImpl.m94346w().set(MutexImpl.this, this.owner);
            }
            return objMo93742A;
        }

        @Override // p149l.ofp0
        /* JADX INFO: renamed from: g */
        public void mo93765g(@NotNull mce0<?> segment, int index) {
            this.cont.mo93765g(segment, index);
        }

        @Override // kotlin.coroutines.Continuation
        @NotNull
        public CoroutineContext getContext() {
            return this.cont.getContext();
        }

        @Override // p149l.bf4
        /* JADX INFO: renamed from: i */
        public boolean mo93766i(@Nullable Throwable cause) {
            return this.cont.mo93766i(cause);
        }

        @Override // p149l.bf4
        /* JADX INFO: renamed from: m */
        public boolean mo93770m() {
            return this.cont.mo93770m();
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object result) {
            this.cont.resumeWith(result);
        }

        @Override // p149l.bf4
        /* JADX INFO: renamed from: w */
        public void mo93779w(@NotNull Object token) {
            this.cont.mo93779w(token);
        }

        @Override // p149l.bf4
        /* JADX INFO: renamed from: x */
        public void mo93780x(@NotNull Function1<? super Throwable, Unit> handler) {
            this.cont.mo93780x(handler);
        }

        @Override // p149l.bf4
        @Nullable
        /* JADX INFO: renamed from: y */
        public Object mo93781y(@NotNull Throwable exception) {
            return this.cont.mo93781y(exception);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.MutexImpl$a */
    @Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0011\u001a\u00020\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m87232d2 = {"Lkotlinx/coroutines/sync/MutexImpl$a;", "Q", "Ll/cde0;", "select", "", Owner.TYPE, "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Ll/cde0;Ljava/lang/Object;)V", "Ll/l4e;", "disposableHandle", "", "b", "(Ll/l4e;)V", "Ll/mce0;", "segment", "", FirebaseAnalytics.Param.INDEX, "g", "(Ll/mce0;I)V", "clauseObject", LovePlanetStage.result, "", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "internalResult", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)V", "a", "Ll/cde0;", "Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    @SourceDebugExtension
    public final class C15500a<Q> implements cde0<Q> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final cde0<Q> select;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Object owner;

        public C15500a(@Nullable cde0<Q> cde0Var, Object obj) {
            this.select = cde0Var;
            this.owner = obj;
        }

        @Override // p149l.bde0
        /* JADX INFO: renamed from: b */
        public void mo94308b(@NotNull l4e disposableHandle) {
            this.select.mo94308b(disposableHandle);
        }

        @Override // p149l.bde0
        /* JADX INFO: renamed from: d */
        public void mo94310d(@Nullable Object internalResult) {
            MutexImpl.m94346w().set(MutexImpl.this, this.owner);
            this.select.mo94310d(internalResult);
        }

        @Override // p149l.bde0
        /* JADX INFO: renamed from: f */
        public boolean mo94312f(@NotNull Object clauseObject, @Nullable Object result) {
            boolean zMo94312f = this.select.mo94312f(clauseObject, result);
            MutexImpl mutexImpl = MutexImpl.this;
            if (zMo94312f) {
                MutexImpl.m94346w().set(mutexImpl, this.owner);
            }
            return zMo94312f;
        }

        @Override // p149l.ofp0
        /* JADX INFO: renamed from: g */
        public void mo93765g(@NotNull mce0<?> segment, int index) {
            this.select.mo93765g(segment, index);
        }

        @Override // p149l.bde0
        @NotNull
        public CoroutineContext getContext() {
            return this.select.getContext();
        }
    }

    public MutexImpl(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : MutexKt.f66983a;
        this.onSelectCancellationUnlockConstructor = new Function3<bde0<?>, Object, Object, Function1<? super Throwable, ? extends Unit>>() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            @NotNull
            public final Function1<Throwable, Unit> invoke(@NotNull bde0<?> bde0Var, @Nullable final Object obj, @Nullable Object obj2) {
                final MutexImpl mutexImpl = this.this$0;
                return new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Throwable th) {
                        mutexImpl.mo94355d(obj);
                    }
                };
            }
        };
    }

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m94346w() {
        return f66975i;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Object m94347z(MutexImpl mutexImpl, Object obj, Continuation<? super Unit> continuation) {
        if (mutexImpl.m94351D(obj)) {
            return Unit.INSTANCE;
        }
        Object objM94348A = mutexImpl.m94348A(obj, continuation);
        return objM94348A == uwp.m196133e() ? objM94348A : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final Object m94348A(Object obj, Continuation<? super Unit> continuation) {
        C15407c c15407cM111430b = df4.m111430b(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation));
        try {
            m94374f(new CancellableContinuationWithOwner(c15407cM111430b, obj));
            Object objM93778v = c15407cM111430b.m93778v();
            if (objM93778v == uwp.m196133e()) {
                DebugProbesKt.m87383c(continuation);
            }
            return objM93778v == uwp.m196133e() ? objM93778v : Unit.INSTANCE;
        } catch (Throwable th) {
            c15407cM111430b.m93752O();
            throw th;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public Object m94349B(@Nullable Object owner, @Nullable Object result) {
        if (!Intrinsics.m87488d(result, MutexKt.f66984b)) {
            return this;
        }
        nnq.m160357a("This mutex is already locked by the specified owner: ", owner);
        return null;
    }

    /* JADX INFO: renamed from: C */
    public void m94350C(@NotNull bde0<?> select, @Nullable Object owner) {
        if (owner != null && m94356x(owner)) {
            select.mo94310d(MutexKt.f66984b);
        } else {
            select.getClass();
            m94380r(new C15500a((cde0) select, owner), owner);
        }
    }

    /* JADX INFO: renamed from: D */
    public boolean m94351D(@Nullable Object owner) {
        int iM94352E = m94352E(owner);
        if (iM94352E == 0) {
            return true;
        }
        if (iM94352E == 1) {
            return false;
        }
        if (iM94352E != 2) {
            qkq0.m175383a("unexpected");
            return false;
        }
        nnq.m160357a("This mutex is already locked by the specified owner: ", owner);
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final int m94352E(Object owner) {
        while (!m94381s()) {
            if (owner == null) {
                return 1;
            }
            int iM94357y = m94357y(owner);
            if (iM94357y == 1) {
                return 2;
            }
            if (iM94357y == 2) {
                return 1;
            }
        }
        f66975i.set(this, owner);
        return 0;
    }

    @Override // p149l.ot10
    /* JADX INFO: renamed from: a */
    public boolean mo94353a() {
        return m94379l() == 0;
    }

    @Override // p149l.ot10
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo94354c(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
        return m94347z(this, obj, continuation);
    }

    @Override // p149l.ot10
    /* JADX INFO: renamed from: d */
    public void mo94355d(@Nullable Object owner) {
        while (mo94353a()) {
            Object obj = f66975i.get(this);
            if (obj != MutexKt.f66983a) {
                if (obj != owner && owner != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj + ", but " + owner + " is expected").toString());
                }
                if (C21643z7.m217426a(f66975i, this, obj, MutexKt.f66983a)) {
                    release();
                    return;
                }
            }
        }
        qkq0.m175383a("This mutex is not locked");
    }

    @NotNull
    public String toString() {
        return "Mutex@" + o8c.m163112b(this) + "[isLocked=" + mo94353a() + ",owner=" + f66975i.get(this) + ']';
    }

    /* JADX INFO: renamed from: x */
    public boolean m94356x(@NotNull Object owner) {
        return m94357y(owner) == 1;
    }

    /* JADX INFO: renamed from: y */
    public final int m94357y(Object owner) {
        while (mo94353a()) {
            Object obj = f66975i.get(this);
            if (obj != MutexKt.f66983a) {
                return obj == owner ? 1 : 2;
            }
        }
        return 0;
    }
}
