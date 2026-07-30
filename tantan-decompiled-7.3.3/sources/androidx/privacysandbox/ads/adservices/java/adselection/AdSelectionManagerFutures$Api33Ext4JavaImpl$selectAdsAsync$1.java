package androidx.privacysandbox.ads.adservices.java.adselection;

import androidx.privacysandbox.ads.adservices.adselection.AbstractC0526a;
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
import p153l.drb;
import p153l.t70;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1", m88263f = "AdSelectionManagerFutures.kt", m88264l = {EACTags.LOGIN_DATA}, m88265m = "invokeSuspend")
final class AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1 extends SuspendLambda implements Function2<drb, Continuation<Object>, Object> {
    final /* synthetic */ t70 $adSelectionConfig;
    int label;
    final /* synthetic */ AbstractC0530a.a this$0;

    public AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1(AbstractC0530a.a aVar, t70 t70Var, Continuation<? super AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1(null, null, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<Object> continuation) {
        return ((AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
        AbstractC0526a abstractC0526aM3200a = AbstractC0530a.a.m3200a(null);
        abstractC0526aM3200a.getClass();
        this.label = 1;
        Object objM3197b = abstractC0526aM3200a.m3197b(null, this);
        return objM3197b == objM198688e ? objM198688e : objM3197b;
    }
}
