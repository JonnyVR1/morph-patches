package kotlinx.coroutines.sync;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlinx.coroutines.C15514c;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.C20511u7;
import p153l.ag4;
import p153l.c4s;
import p153l.cg4;
import p153l.gle0;
import p153l.hle0;
import p153l.mpq;
import p153l.rke0;
import p153l.sop0;
import p153l.u9c;
import p153l.uyp;
import p153l.w120;
import p153l.wtq0;
import p153l.z5e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002/+B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\u000b2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0004\b\u001e\u0010\rJ\u0019\u0010\u001f\u001a\u00020\u001b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u001dRq\u0010*\u001a_\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0011¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000b0%0 j\u0002`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070.8\u0002X\u0082\u0004¨\u00060"}, m88121d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/SemaphoreImpl;", "Ll/w120;", "", "locked", "<init>", "(Z)V", "", Owner.TYPE, BaseSei.f14624X, "(Ljava/lang/Object;)Z", "", "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "D", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)V", "Ll/gle0;", "select", c4s.C_ZONE, "(Ll/gle0;Ljava/lang/Object;)V", LovePlanetStage.result, "B", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", BaseSei.f14625Y, "(Ljava/lang/Object;)I", "A", "E", "Lkotlin/Function3;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "param", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "h", "Lkotlin/jvm/functions/Function3;", "onSelectCancellationUnlockConstructor", "a", "()Z", "isLocked", "Lkotlinx/atomicfu/AtomicRef;", "CancellableContinuationWithOwner", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public class MutexImpl extends SemaphoreImpl implements w120 {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67649i = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Function3<gle0<?>, Object, Object, Function1<Throwable, Unit>> onSelectCancellationUnlockConstructor;
    private volatile /* synthetic */ Object owner$volatile;

    @Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0017\u001a\u00020\u00022'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00020\u0012j\u0002`\u0015H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u0011J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010!\u001a\u00020\u0002*\u00020\u001f2\u0006\u0010 \u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u001c\u0010#\u001a\u00020\u0002*\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b#\u0010$J$\u0010)\u001a\u00020\u00022\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%2\u0006\u0010(\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b)\u0010*JH\u0010-\u001a\u0004\u0018\u00010\u00062\u0006\u0010 \u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u00062#\u0010,\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012H\u0016¢\u0006\u0004\b-\u0010.J<\u0010/\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022#\u0010,\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012H\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u00101R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u00102R\u0014\u00106\u001a\u0002038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, m88121d2 = {"Lkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner;", "Ll/ag4;", "", "Ll/sop0;", "Lkotlinx/coroutines/c;", "cont", "", Owner.TYPE, "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/c;Ljava/lang/Object;)V", "", "cause", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/Throwable;)Z", "token", "w", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "Lkotlinx/coroutines/CompletionHandler;", "handler", BaseSei.f14624X, "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Result;", LovePlanetStage.result, "resumeWith", "exception", BaseSei.f14625Y, "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineDispatcher;", "value", "c", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/Unit;)V", "a", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "Ll/rke0;", "segment", "", FirebaseAnalytics.Param.INDEX, "g", "(Ll/rke0;I)V", "idempotent", "onCancellation", Constants.INAPP_DATA_TAG, "(Lkotlin/Unit;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "b", "(Lkotlin/Unit;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/c;", "Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "m", "()Z", "isCompleted", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public final class CancellableContinuationWithOwner implements ag4<Unit>, sop0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final C15514c<Unit> cont;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Object owner;

        /* JADX WARN: Multi-variable type inference failed */
        public CancellableContinuationWithOwner(@Nullable C15514c<? super Unit> c15514c, Object obj) {
            this.cont = c15514c;
            this.owner = obj;
        }

        @Override // p153l.ag4
        /* JADX INFO: renamed from: a */
        public void mo94651a(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Throwable th) {
            this.cont.mo94651a(coroutineDispatcher, th);
        }

        @Override // p153l.ag4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo94656f(@NotNull Unit value, @Nullable Function1<? super Throwable, Unit> onCancellation) {
            MutexImpl.m95239w().set(MutexImpl.this, this.owner);
            C15514c<Unit> c15514c = this.cont;
            final MutexImpl mutexImpl = MutexImpl.this;
            c15514c.mo94656f(value, new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$resume$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    mutexImpl.mo95248d(this.owner);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            });
        }

        @Override // p153l.ag4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo94635B(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Unit unit) {
            this.cont.mo94635B(coroutineDispatcher, unit);
        }

        @Override // p153l.ag4
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object mo94634A(@NotNull Unit value, @Nullable Object idempotent, @Nullable Function1<? super Throwable, Unit> onCancellation) {
            C15514c<Unit> c15514c = this.cont;
            final MutexImpl mutexImpl = MutexImpl.this;
            Object objMo94634A = c15514c.mo94634A(value, idempotent, new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$tryResume$token$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    MutexImpl.m95239w().set(mutexImpl, this.owner);
                    mutexImpl.mo95248d(this.owner);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            });
            if (objMo94634A != null) {
                MutexImpl.m95239w().set(MutexImpl.this, this.owner);
            }
            return objMo94634A;
        }

        @Override // p153l.sop0
        /* JADX INFO: renamed from: g */
        public void mo94657g(@NotNull rke0<?> segment, int index) {
            this.cont.mo94657g(segment, index);
        }

        @Override // kotlin.coroutines.Continuation
        @NotNull
        public CoroutineContext getContext() {
            return this.cont.getContext();
        }

        @Override // p153l.ag4
        /* JADX INFO: renamed from: i */
        public boolean mo94658i(@Nullable Throwable cause) {
            return this.cont.mo94658i(cause);
        }

        @Override // p153l.ag4
        /* JADX INFO: renamed from: m */
        public boolean mo94662m() {
            return this.cont.mo94662m();
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object result) {
            this.cont.resumeWith(result);
        }

        @Override // p153l.ag4
        /* JADX INFO: renamed from: w */
        public void mo94671w(@NotNull Object token) {
            this.cont.mo94671w(token);
        }

        @Override // p153l.ag4
        /* JADX INFO: renamed from: x */
        public void mo94672x(@NotNull Function1<? super Throwable, Unit> handler) {
            this.cont.mo94672x(handler);
        }

        @Override // p153l.ag4
        @Nullable
        /* JADX INFO: renamed from: y */
        public Object mo94673y(@NotNull Throwable exception) {
            return this.cont.mo94673y(exception);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.MutexImpl$a */
    @Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0011\u001a\u00020\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m88121d2 = {"Lkotlinx/coroutines/sync/MutexImpl$a;", "Q", "Ll/hle0;", "select", "", Owner.TYPE, "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Ll/hle0;Ljava/lang/Object;)V", "Ll/z5e;", "disposableHandle", "", "b", "(Ll/z5e;)V", "Ll/rke0;", "segment", "", FirebaseAnalytics.Param.INDEX, "g", "(Ll/rke0;I)V", "clauseObject", LovePlanetStage.result, "", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "internalResult", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)V", "a", "Ll/hle0;", "Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public final class C15607a<Q> implements hle0<Q> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final hle0<Q> select;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Object owner;

        public C15607a(@Nullable hle0<Q> hle0Var, Object obj) {
            this.select = hle0Var;
            this.owner = obj;
        }

        @Override // p153l.gle0
        /* JADX INFO: renamed from: b */
        public void mo95201b(@NotNull z5e disposableHandle) {
            this.select.mo95201b(disposableHandle);
        }

        @Override // p153l.gle0
        /* JADX INFO: renamed from: d */
        public void mo95203d(@Nullable Object internalResult) {
            MutexImpl.m95239w().set(MutexImpl.this, this.owner);
            this.select.mo95203d(internalResult);
        }

        @Override // p153l.gle0
        /* JADX INFO: renamed from: f */
        public boolean mo95205f(@NotNull Object clauseObject, @Nullable Object result) {
            boolean zMo95205f = this.select.mo95205f(clauseObject, result);
            MutexImpl mutexImpl = MutexImpl.this;
            if (zMo95205f) {
                MutexImpl.m95239w().set(mutexImpl, this.owner);
            }
            return zMo95205f;
        }

        @Override // p153l.sop0
        /* JADX INFO: renamed from: g */
        public void mo94657g(@NotNull rke0<?> segment, int index) {
            this.select.mo94657g(segment, index);
        }

        @Override // p153l.gle0
        @NotNull
        public CoroutineContext getContext() {
            return this.select.getContext();
        }
    }

    public MutexImpl(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : MutexKt.f67657a;
        this.onSelectCancellationUnlockConstructor = new Function3<gle0<?>, Object, Object, Function1<? super Throwable, ? extends Unit>>() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            @NotNull
            public final Function1<Throwable, Unit> invoke(@NotNull gle0<?> gle0Var, @Nullable final Object obj, @Nullable Object obj2) {
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
                        mutexImpl.mo95248d(obj);
                    }
                };
            }
        };
    }

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m95239w() {
        return f67649i;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Object m95240z(MutexImpl mutexImpl, Object obj, Continuation<? super Unit> continuation) {
        if (mutexImpl.m95244D(obj)) {
            return Unit.INSTANCE;
        }
        Object objM95241A = mutexImpl.m95241A(obj, continuation);
        return objM95241A == uyp.m198688e() ? objM95241A : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final Object m95241A(Object obj, Continuation<? super Unit> continuation) {
        C15514c c15514cM109664b = cg4.m109664b(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation));
        try {
            m95267f(new CancellableContinuationWithOwner(c15514cM109664b, obj));
            Object objM94670v = c15514cM109664b.m94670v();
            if (objM94670v == uyp.m198688e()) {
                DebugProbesKt.m88272c(continuation);
            }
            return objM94670v == uyp.m198688e() ? objM94670v : Unit.INSTANCE;
        } catch (Throwable th) {
            c15514cM109664b.m94644O();
            throw th;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public Object m95242B(@Nullable Object owner, @Nullable Object result) {
        if (!Intrinsics.m88377d(result, MutexKt.f67658b)) {
            return this;
        }
        mpq.m159379a("This mutex is already locked by the specified owner: ", owner);
        return null;
    }

    /* JADX INFO: renamed from: C */
    public void m95243C(@NotNull gle0<?> select, @Nullable Object owner) {
        if (owner != null && m95249x(owner)) {
            select.mo95203d(MutexKt.f67658b);
        } else {
            select.getClass();
            m95273r(new C15607a((hle0) select, owner), owner);
        }
    }

    /* JADX INFO: renamed from: D */
    public boolean m95244D(@Nullable Object owner) {
        int iM95245E = m95245E(owner);
        if (iM95245E == 0) {
            return true;
        }
        if (iM95245E == 1) {
            return false;
        }
        if (iM95245E != 2) {
            wtq0.m207906a("unexpected");
            return false;
        }
        mpq.m159379a("This mutex is already locked by the specified owner: ", owner);
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final int m95245E(Object owner) {
        while (!m95274s()) {
            if (owner == null) {
                return 1;
            }
            int iM95250y = m95250y(owner);
            if (iM95250y == 1) {
                return 2;
            }
            if (iM95250y == 2) {
                return 1;
            }
        }
        f67649i.set(this, owner);
        return 0;
    }

    @Override // p153l.w120
    /* JADX INFO: renamed from: a */
    public boolean mo95246a() {
        return m95272l() == 0;
    }

    @Override // p153l.w120
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo95247c(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
        return m95240z(this, obj, continuation);
    }

    @Override // p153l.w120
    /* JADX INFO: renamed from: d */
    public void mo95248d(@Nullable Object owner) {
        while (mo95246a()) {
            Object obj = f67649i.get(this);
            if (obj != MutexKt.f67657a) {
                if (obj != owner && owner != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj + ", but " + owner + " is expected").toString());
                }
                if (C20511u7.m194801a(f67649i, this, obj, MutexKt.f67657a)) {
                    release();
                    return;
                }
            }
        }
        wtq0.m207906a("This mutex is not locked");
    }

    @NotNull
    public String toString() {
        return "Mutex@" + u9c.m195087b(this) + "[isLocked=" + mo95246a() + ",owner=" + f67649i.get(this) + ']';
    }

    /* JADX INFO: renamed from: x */
    public boolean m95249x(@NotNull Object owner) {
        return m95250y(owner) == 1;
    }

    /* JADX INFO: renamed from: y */
    public final int m95250y(Object owner) {
        while (mo95246a()) {
            Object obj = f67649i.get(this);
            if (obj != MutexKt.f67657a) {
                return obj == owner ? 1 : 2;
            }
        }
        return 0;
    }
}
