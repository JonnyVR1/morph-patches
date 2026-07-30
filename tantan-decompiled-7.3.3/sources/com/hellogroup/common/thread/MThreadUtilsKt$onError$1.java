package com.hellogroup.common.thread;

import com.p051p1.mobile.putong.data.Careers;
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
import p153l.drb;
import p153l.l4k;
import p153l.p7f;
import p153l.r5e;
import p153l.utd;
import p153l.uyp;
import p153l.wtq0;
import p153l.xh3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, Careers.f39580it, "", "invoke"}, m88122k = 3, m88123mv = {1, 1, 16})
final class MThreadUtilsKt$onError$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ Function2 $block;
    final /* synthetic */ utd $this_onError;

    /* JADX INFO: renamed from: com.hellogroup.common.thread.MThreadUtilsKt$onError$1$1 */
    @Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
    @DebugMetadata(m88262c = "com.hellogroup.common.thread.MThreadUtilsKt$onError$1$1", m88263f = "MThreadUtils.kt", m88264l = {CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256}, m88265m = "invokeSuspend")
    public static final class C34801 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef $exception;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: p$ */
        private drb f11869p$;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34801(Ref.ObjectRef objectRef, Continuation continuation) {
            super(2, continuation);
            this.$exception = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            continuation.getClass();
            C34801 c34801 = MThreadUtilsKt$onError$1.this.new C34801(this.$exception, continuation);
            c34801.f11869p$ = (drb) obj;
            return c34801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
            return ((C34801) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m88128b(obj);
                drb drbVar = this.f11869p$;
                Function2 function2 = MThreadUtilsKt$onError$1.this.$block;
                Throwable th = (Throwable) this.$exception.element;
                this.L$0 = drbVar;
                this.label = 1;
                if (function2.invoke(th, this) == objM198688e) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MThreadUtilsKt$onError$1(utd utdVar, Function2 function2) {
        super(1);
        this.$this_onError = utdVar;
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
            xh3.m210980d(l4k.INSTANCE, r5e.m179862c(), null, new C34801(objectRef, null), 2, null);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }
}
