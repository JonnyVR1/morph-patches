package p006l;

import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import java.text.DecimalFormat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import l.sab0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ll/qh60;", "Ll/t4;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Ll/ai60;", "request", "", "e", "(Ll/ai60;)Z", "Ll/bi60;", "response", "", "b", "(Ll/ai60;Ll/bi60;)V", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "d", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class qh60 extends AbstractC1297t4 {

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

    @Override // p006l.AbstractC1297t4
    /* JADX INFO: renamed from: b */
    public void mo16653b(@NotNull ai60 request, @NotNull bi60 response) {
        request.getClass();
        response.getClass();
        if ((sab0.i(this.purchaseType) || sab0.j(this.purchaseType)) && request.getRefundAmount() > 0.0d && !xma.m27351F3()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("支付返￥%s", Arrays.copyOf(new Object[]{new DecimalFormat("#.#").format(request.getRefundAmount())}, 1));
            if (TextUtils.equals(getFrom(), "purchasePage")) {
                response.m12697k(str);
                return;
            } else {
                response.m12700n(str);
                return;
            }
        }
        if (!sab0.q(this.purchaseType) || ((long) Math.floor(request.getRefundAmount())) <= 0 || xma.m27355L3()) {
            return;
        }
        response.m12701o(this.act.getString(R.string.t1, String.valueOf((long) Math.floor(request.getRefundAmount()))));
    }

    @Override // p006l.AbstractC1297t4
    /* JADX INFO: renamed from: e */
    public boolean mo16654e(@NotNull ai60 request) {
        request.getClass();
        if (request.getRefundAmount() > 0.0d) {
            return sab0.q(this.purchaseType) || sab0.i(this.purchaseType) || sab0.j(this.purchaseType);
        }
        return false;
    }
}
