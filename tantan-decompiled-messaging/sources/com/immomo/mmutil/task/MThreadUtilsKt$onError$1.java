package com.immomo.mmutil.task;

import com.p046p1.mobile.putong.data.Careers;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.d4e;
import p149l.gsd;
import p149l.j6f;
import p149l.jh3;
import p149l.ppb;
import p149l.qkq0;
import p149l.t1k;
import p149l.uwp;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, Careers.f38732it, "", "invoke"}, m87233k = 3, m87234mv = {1, 1, 16})
final class MThreadUtilsKt$onError$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ Function2 $block;
    final /* synthetic */ gsd $this_onError;

    /* JADX INFO: renamed from: com.immomo.mmutil.task.MThreadUtilsKt$onError$1$1 */
    @Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/ppb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m87233k = 3, m87234mv = {1, 4, 0})
    @DebugMetadata(m87373c = "com.immomo.mmutil.task.MThreadUtilsKt$onError$1$1", m87374f = "MThreadUtils.kt", m87375l = {CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256}, m87376m = "invokeSuspend")
    public static final class C37981 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef $exception;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: p$ */
        private ppb f12986p$;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37981(Ref.ObjectRef objectRef, Continuation continuation) {
            super(2, continuation);
            this.$exception = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            continuation.getClass();
            C37981 c37981 = MThreadUtilsKt$onError$1.this.new C37981(this.$exception, continuation);
            c37981.f12986p$ = (ppb) obj;
            return c37981;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return ((C37981) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                ppb ppbVar = this.f12986p$;
                Function2 function2 = MThreadUtilsKt$onError$1.this.$block;
                Throwable th = (Throwable) this.$exception.element;
                this.L$0 = ppbVar;
                this.label = 1;
                if (function2.invoke(th, this) == objM196133e) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MThreadUtilsKt$onError$1(gsd gsdVar, Function2 function2) {
        super(1);
        this.$this_onError = gsdVar;
        this.$block = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v8, types: [T, java.lang.Throwable] */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = th;
        if (!this.$this_onError.isCancelled()) {
            T t = objectRef.element;
            if (((Throwable) t) instanceof CancellationException) {
                objectRef.element = ((Throwable) t).getCause();
            }
        }
        if (((Throwable) objectRef.element) != null) {
            jh3.m141367d(t1k.INSTANCE, d4e.m109982c(), null, new C37981(objectRef, null), 2, null);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }
}
