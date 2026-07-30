package androidx.privacysandbox.ads.adservices.java.adid;

import androidx.privacysandbox.ads.adservices.adid.AbstractC0525a;
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
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.privacysandbox.ads.adservices.java.adid.AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1", m88263f = "AdIdManagerFutures.kt", m88264l = {54}, m88265m = "invokeSuspend")
final class AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1 extends SuspendLambda implements Function2<drb, Continuation<Object>, Object> {
    int label;
    final /* synthetic */ AbstractC0528a.a this$0;

    public AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1(AbstractC0528a.a aVar, Continuation<? super AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1(null, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<Object> continuation) {
        return ((AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
        AbstractC0525a abstractC0525aM3199a = AbstractC0528a.a.m3199a(null);
        this.label = 1;
        Object objM3195a = abstractC0525aM3199a.m3195a(this);
        return objM3195a == objM198688e ? objM198688e : objM3195a;
    }
}
