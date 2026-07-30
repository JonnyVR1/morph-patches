package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C15531f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.fs4;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 5, 1})
@DebugMetadata(m88262c = "androidx.datastore.core.SimpleActor$offer$2", m88263f = "SimpleActor.kt", m88264l = {122, 122}, m88265m = "invokeSuspend")
public final class SimpleActor$offer$2 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SimpleActor<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(SimpleActor<T> simpleActor, Continuation<? super SimpleActor$offer$2> continuation) {
        super(2, continuation);
        this.this$0 = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SimpleActor$offer$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((SimpleActor$offer$2) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[PHI: r1 r6
      0x0055: PHI (r1v1 kotlin.jvm.functions.Function2) = (r1v2 kotlin.jvm.functions.Function2), (r1v4 kotlin.jvm.functions.Function2) binds: [B:17:0x0052, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r6v7 java.lang.Object) = (r6v14 java.lang.Object), (r6v0 java.lang.Object) binds: [B:17:0x0052, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r1.invoke(r6, r5) == r0) goto L21;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005e -> B:22:0x0061). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Function2 function2;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            if (!(this.this$0.remainingMessages.get() > 0)) {
                wtq0.m207906a("Check failed.");
                return null;
            }
            C15531f.m94952f(this.this$0.scope);
            function2 = this.this$0.consumeMessage;
            fs4 fs4Var = this.this$0.messageQueue;
            this.L$0 = function2;
            this.label = 1;
            obj = fs4Var.mo94727C(this);
            if (obj != objM198688e) {
                this.L$0 = null;
                this.label = 2;
            }
            return objM198688e;
        }
        if (i == 1) {
            function2 = (Function2) this.L$0;
            ResultKt.m88128b(obj);
            this.L$0 = null;
            this.label = 2;
        } else {
            if (i != 2) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        if (this.this$0.remainingMessages.decrementAndGet() == 0) {
            return Unit.INSTANCE;
        }
        C15531f.m94952f(this.this$0.scope);
        function2 = this.this$0.consumeMessage;
        fs4 fs4Var2 = this.this$0.messageQueue;
        this.L$0 = function2;
        this.label = 1;
        obj = fs4Var2.mo94727C(this);
        if (obj != objM198688e) {
            this.L$0 = null;
            this.label = 2;
        }
        return objM198688e;
    }
}
