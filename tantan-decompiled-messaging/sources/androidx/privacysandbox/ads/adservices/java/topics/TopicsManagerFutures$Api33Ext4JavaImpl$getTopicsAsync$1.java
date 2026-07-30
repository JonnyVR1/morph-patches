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
import p149l.gkj;
import p149l.hkj;
import p149l.m4j0;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "Ll/hkj;", "<anonymous>", "(Ll/ppb;)Ll/hkj;"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1", m87374f = "TopicsManagerFutures.kt", m87375l = {56}, m87376m = "invokeSuspend")
public final class TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1 extends SuspendLambda implements Function2<ppb, Continuation<? super hkj>, Object> {
    final /* synthetic */ gkj $request;
    int label;
    final /* synthetic */ TopicsManagerFutures.Api33Ext4JavaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1(TopicsManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, gkj gkjVar, Continuation<? super TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = api33Ext4JavaImpl;
        this.$request = gkjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super hkj> continuation) {
        return ((TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.m87239b(obj);
                return obj;
            }
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        m4j0 m4j0Var = this.this$0.mTopicsManager;
        gkj gkjVar = this.$request;
        this.label = 1;
        Object objMo3217a = m4j0Var.mo3217a(gkjVar, this);
        return objMo3217a == objM196133e ? objM196133e : objMo3217a;
    }
}
