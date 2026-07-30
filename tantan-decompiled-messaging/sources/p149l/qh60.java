package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.tencent.open.SocialConstants;
import java.text.DecimalFormat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Ll/qh60;", "Ll/t4;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Ll/ai60;", SocialConstants.TYPE_REQUEST, "", "e", "(Ll/ai60;)Z", "Ll/bi60;", "response", "", "b", "(Ll/ai60;Ll/bi60;)V", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class qh60 extends AbstractC20103t4 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh60(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        super(str);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
    }

    @Override // p149l.AbstractC20103t4
    /* JADX INFO: renamed from: b */
    public void mo136186b(@NotNull ai60 request, @NotNull bi60 response) {
        request.getClass();
        response.getClass();
        if ((sab0.m182891i(this.purchaseType) || sab0.m182892j(this.purchaseType)) && request.getRefundAmount() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && !xma.m210043F3()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("支付返￥%s", Arrays.copyOf(new Object[]{new DecimalFormat("#.#").format(request.getRefundAmount())}, 1));
            if (TextUtils.equals(getFrom(), "purchasePage")) {
                response.m101981k(str);
                return;
            } else {
                response.m101984n(str);
                return;
            }
        }
        if (!sab0.m182899q(this.purchaseType) || ((long) Math.floor(request.getRefundAmount())) <= 0 || xma.m210047L3()) {
            return;
        }
        response.m101985o(this.act.getString(R$string.f27603t1, String.valueOf((long) Math.floor(request.getRefundAmount()))));
    }

    @Override // p149l.AbstractC20103t4
    /* JADX INFO: renamed from: e */
    public boolean mo136187e(@NotNull ai60 request) {
        request.getClass();
        if (request.getRefundAmount() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return sab0.m182899q(this.purchaseType) || sab0.m182891i(this.purchaseType) || sab0.m182892j(this.purchaseType);
        }
        return false;
    }
}
