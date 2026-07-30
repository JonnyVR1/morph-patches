package p153l;

import com.p051p1.mobile.putong.api.api.PaymentApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, m88121d2 = {"Ll/tvl;", "", "", "sku", "Ll/x20;", "gpOrderSuccessTrack", "Lrx/c;", "Lcom/p1/mobile/putong/api/api/PaymentApi$PaymentResultStatus;", "c", "(Ljava/lang/String;Ll/x20;)Lrx/c;", "oldSku", "b", "(Ljava/lang/String;Ljava/lang/String;Ll/x20;)Lrx/c;", "a", "()Lrx/c;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface tvl {
    @Nullable
    /* JADX INFO: renamed from: a */
    C22421c<PaymentApi.PaymentResultStatus> mo192810a();

    @Nullable
    /* JADX INFO: renamed from: b */
    C22421c<PaymentApi.PaymentResultStatus> mo192811b(@NotNull String sku, @Nullable String oldSku, @Nullable x20 gpOrderSuccessTrack);

    @Nullable
    /* JADX INFO: renamed from: c */
    C22421c<PaymentApi.PaymentResultStatus> mo192812c(@NotNull String sku, @Nullable x20 gpOrderSuccessTrack);
}
