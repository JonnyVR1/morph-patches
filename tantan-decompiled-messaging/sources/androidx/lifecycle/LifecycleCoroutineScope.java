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
import kotlinx.coroutines.InterfaceC15486o;
import org.jetbrains.annotations.NotNull;
import p149l.jh3;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000b\u001a\u00020\n2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ8\u0010\r\u001a\u00020\n2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\r\u0010\fJ8\u0010\u000e\u001a\u00020\n2'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u000f8 X \u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m87232d2 = {"Landroidx/lifecycle/LifecycleCoroutineScope;", "Ll/ppb;", "<init>", "()V", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/coroutines/o;", "launchWhenCreated", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/o;", "launchWhenStarted", "launchWhenResumed", "Landroidx/lifecycle/Lifecycle;", "getLifecycle$lifecycle_common", "()Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "lifecycle-common"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public abstract class LifecycleCoroutineScope implements ppb {

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
    @DebugMetadata(m87373c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", m87374f = "Lifecycle.jvm.kt", m87375l = {68}, m87376m = "invokeSuspend")
    public static final class C04571 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<ppb, Continuation<? super Unit>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04571(Function2<? super ppb, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C04571> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LifecycleCoroutineScope.this.new C04571(this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return ((C04571) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle();
                Function2<ppb, Continuation<? super Unit>, Object> function2 = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.m2991a(lifecycle$lifecycle_common, function2, this) == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
    @DebugMetadata(m87373c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", m87374f = "Lifecycle.jvm.kt", m87375l = {108}, m87376m = "invokeSuspend")
    public static final class C04581 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<ppb, Continuation<? super Unit>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04581(Function2<? super ppb, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C04581> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LifecycleCoroutineScope.this.new C04581(this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return ((C04581) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle();
                Function2<ppb, Continuation<? super Unit>, Object> function2 = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.m2992b(lifecycle$lifecycle_common, function2, this) == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
    @DebugMetadata(m87373c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", m87374f = "Lifecycle.jvm.kt", m87375l = {88}, m87376m = "invokeSuspend")
    public static final class C04591 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<ppb, Continuation<? super Unit>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04591(Function2<? super ppb, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C04591> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LifecycleCoroutineScope.this.new C04591(this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return ((C04591) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle();
                Function2<ppb, Continuation<? super Unit>, Object> function2 = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.m2993c(lifecycle$lifecycle_common, function2, this) == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getLifecycle$lifecycle_common */
    public abstract Lifecycle getLifecycle();

    @Deprecated
    @NotNull
    public final InterfaceC15486o launchWhenCreated(@NotNull Function2<? super ppb, ? super Continuation<? super Unit>, ? extends Object> block) {
        block.getClass();
        return jh3.m141367d(this, null, null, new C04571(block, null), 3, null);
    }

    @Deprecated
    @NotNull
    public final InterfaceC15486o launchWhenResumed(@NotNull Function2<? super ppb, ? super Continuation<? super Unit>, ? extends Object> block) {
        block.getClass();
        return jh3.m141367d(this, null, null, new C04581(block, null), 3, null);
    }

    @Deprecated
    @NotNull
    public final InterfaceC15486o launchWhenStarted(@NotNull Function2<? super ppb, ? super Continuation<? super Unit>, ? extends Object> block) {
        block.getClass();
        return jh3.m141367d(this, null, null, new C04591(block, null), 3, null);
    }
}
