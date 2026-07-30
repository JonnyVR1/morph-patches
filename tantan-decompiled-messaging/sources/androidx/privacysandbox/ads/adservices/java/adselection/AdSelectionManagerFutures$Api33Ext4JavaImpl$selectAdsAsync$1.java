package androidx.privacysandbox.ads.adservices.java.adselection;

import androidx.privacysandbox.ads.adservices.adselection.AbstractC0525a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.asn1.eac.EACTags;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;
import p149l.x70;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1", m87374f = "AdSelectionManagerFutures.kt", m87375l = {EACTags.LOGIN_DATA}, m87376m = "invokeSuspend")
final class AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1 extends SuspendLambda implements Function2<ppb, Continuation<Object>, Object> {
    final /* synthetic */ x70 $adSelectionConfig;
    int label;
    final /* synthetic */ AbstractC0529a.a this$0;

    public AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1(AbstractC0529a.a aVar, x70 x70Var, Continuation<? super AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1(null, null, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<Object> continuation) {
        return ((AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
        AbstractC0525a abstractC0525aM3199a = AbstractC0529a.a.m3199a(null);
        abstractC0525aM3199a.getClass();
        this.label = 1;
        Object objM3196b = abstractC0525aM3199a.m3196b(null, this);
        return objM3196b == objM196133e ? objM196133e : objM3196b;
    }
}
