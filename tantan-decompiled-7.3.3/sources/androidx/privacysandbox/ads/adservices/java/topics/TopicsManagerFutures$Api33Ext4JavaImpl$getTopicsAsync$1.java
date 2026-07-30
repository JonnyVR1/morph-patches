package androidx.privacysandbox.ads.adservices.java.topics;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.qdj0;
import p153l.uyp;
import p153l.wmj;
import p153l.wtq0;
import p153l.xmj;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "Ll/xmj;", "<anonymous>", "(Ll/drb;)Ll/xmj;"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1", m88263f = "TopicsManagerFutures.kt", m88264l = {56}, m88265m = "invokeSuspend")
public final class TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1 extends SuspendLambda implements Function2<drb, Continuation<? super xmj>, Object> {
    final /* synthetic */ wmj $request;
    int label;
    final /* synthetic */ TopicsManagerFutures.Api33Ext4JavaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1(TopicsManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, wmj wmjVar, Continuation<? super TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = api33Ext4JavaImpl;
        this.$request = wmjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super xmj> continuation) {
        return ((TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.m88128b(obj);
                return obj;
            }
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        qdj0 qdj0Var = this.this$0.mTopicsManager;
        wmj wmjVar = this.$request;
        this.label = 1;
        Object objMo3218a = qdj0Var.mo3218a(wmjVar, this);
        return objMo3218a == objM198688e ? objM198688e : objMo3218a;
    }
}
