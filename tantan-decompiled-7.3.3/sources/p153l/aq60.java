package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Ll/aq60;", "Ll/r4;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Ll/fq60;", SocialConstants.TYPE_REQUEST, "", "e", "(Ll/fq60;)Z", "Ll/gq60;", "response", "", "b", "(Ll/fq60;Ll/gq60;)V", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class aq60 extends AbstractC19757r4 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq60(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        super(str);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
    }

    @Override // p153l.AbstractC19757r4
    /* JADX INFO: renamed from: b */
    public void mo99414b(@NotNull fq60 request, @NotNull gq60 response) {
        String strString;
        request.getClass();
        response.getClass();
        if (wib0.m206565i(this.purchaseType)) {
            response.m131354m(true);
            C8928d.a aVarM179724g = m179724g(request.getPurchaseSection());
            String str = getNumberFormat().format(aVarM179724g.m54736I() ? aVarM179724g.m54784s().getFirstCouponPrice() : aVarM179724g.m54784s().defaultStockKeepUnit.prices.price);
            str.getClass();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strString = String.format("%1$s%2$s %3$s", Arrays.copyOf(new Object[]{aVarM179724g.m54766h(), str, this.act.string(R$string.f28513y8)}, 3));
        } else {
            strString = this.act.string(R$string.f28513y8);
            strString.getClass();
        }
        response.m131357p(strString);
    }

    @Override // p153l.AbstractC19757r4
    /* JADX INFO: renamed from: e */
    public boolean mo99415e(@NotNull fq60 request) {
        request.getClass();
        return (wib0.m206573q(this.purchaseType) || wib0.m206565i(this.purchaseType)) && C8929e.m54833x(getFrom());
    }
}
