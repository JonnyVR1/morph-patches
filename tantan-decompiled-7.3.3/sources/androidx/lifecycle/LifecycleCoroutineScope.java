package androidx.lifecycle;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import p153l.drb;
import p153l.uyp;
import p153l.wtq0;
import p153l.xh3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000b\u001a\u00020\n2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ8\u0010\r\u001a\u00020\n2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\r\u0010\fJ8\u0010\u000e\u001a\u00020\n2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u000f8 X \u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Landroidx/lifecycle/LifecycleCoroutineScope;", "Ll/drb;", "<init>", "()V", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/coroutines/o;", "launchWhenCreated", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/o;", "launchWhenStarted", "launchWhenResumed", "Landroidx/lifecycle/Lifecycle;", "getLifecycle$lifecycle_common", "()Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "lifecycle-common"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public abstract class LifecycleCoroutineScope implements drb {

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
    @DebugMetadata(m88262c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", m88263f = "Lifecycle.jvm.kt", m88264l = {68}, m88265m = "invokeSuspend")
    public static final class C04581 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<drb, Continuation<? super Unit>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04581(Function2<? super drb, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C04581> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LifecycleCoroutineScope.this.new C04581(this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
            return ((C04581) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m88128b(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle();
                Function2<drb, Continuation<? super Unit>, Object> function2 = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.m2992a(lifecycle$lifecycle_common, function2, this) == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
    @DebugMetadata(m88262c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", m88263f = "Lifecycle.jvm.kt", m88264l = {108}, m88265m = "invokeSuspend")
    public static final class C04591 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<drb, Continuation<? super Unit>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04591(Function2<? super drb, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C04591> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LifecycleCoroutineScope.this.new C04591(this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
            return ((C04591) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m88128b(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle();
                Function2<drb, Continuation<? super Unit>, Object> function2 = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.m2993b(lifecycle$lifecycle_common, function2, this) == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
    @DebugMetadata(m88262c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", m88263f = "Lifecycle.jvm.kt", m88264l = {88}, m88265m = "invokeSuspend")
    public static final class C04601 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<drb, Continuation<? super Unit>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04601(Function2<? super drb, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C04601> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LifecycleCoroutineScope.this.new C04601(this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
            return ((C04601) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m88128b(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle();
                Function2<drb, Continuation<? super Unit>, Object> function2 = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.m2994c(lifecycle$lifecycle_common, function2, this) == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getLifecycle$lifecycle_common */
    public abstract Lifecycle getLifecycle();

    @Deprecated
    @NotNull
    public final InterfaceC15593o launchWhenCreated(@NotNull Function2<? super drb, ? super Continuation<? super Unit>, ? extends Object> block) {
        block.getClass();
        return xh3.m210980d(this, null, null, new C04581(block, null), 3, null);
    }

    @Deprecated
    @NotNull
    public final InterfaceC15593o launchWhenResumed(@NotNull Function2<? super drb, ? super Continuation<? super Unit>, ? extends Object> block) {
        block.getClass();
        return xh3.m210980d(this, null, null, new C04591(block, null), 3, null);
    }

    @Deprecated
    @NotNull
    public final InterfaceC15593o launchWhenStarted(@NotNull Function2<? super drb, ? super Continuation<? super Unit>, ? extends Object> block) {
        block.getClass();
        return xh3.m210980d(this, null, null, new C04601(block, null), 3, null);
    }
}
