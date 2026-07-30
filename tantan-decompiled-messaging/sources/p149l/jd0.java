package p149l;

import android.graphics.Color;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Ll/jd0;", "Ll/hml;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Ll/fd0;", "requestData", "", "b", "(Ll/fd0;)Z", "", "a", "(Ll/fd0;)Ljava/lang/CharSequence;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class jd0 implements hml {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String from;

    public jd0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
    }

    @Override // p149l.hml
    @NotNull
    /* JADX INFO: renamed from: a */
    public CharSequence mo130527a(@NotNull fd0 requestData) {
        requestData.getClass();
        if (requestData.getVipFrag() && g6a.m124566o()) {
            CharSequence charSequenceM202836A = we60.m202836A(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String(), Color.parseColor("#735131"));
            charSequenceM202836A.getClass();
            return charSequenceM202836A;
        }
        if (requestData.getPurchasePageType()) {
            CharSequence charSequenceM202837B = we60.m202837B(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String());
            charSequenceM202837B.getClass();
            return charSequenceM202837B;
        }
        if (requestData.getPrivilegeStyle()) {
            CharSequence charSequenceM202836A2 = we60.m202836A(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String(), we60.m202852Q(true));
            charSequenceM202836A2.getClass();
            return charSequenceM202836A2;
        }
        CharSequence charSequenceM202836A3 = we60.m202836A(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String(), we60.m202852Q(false));
        charSequenceM202836A3.getClass();
        return charSequenceM202836A3;
    }

    @Override // p149l.hml
    /* JADX INFO: renamed from: b */
    public boolean mo130528b(@NotNull fd0 requestData) {
        requestData.getClass();
        return sab0.m182891i(this.purchaseType) && requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().autoRenewable();
    }
}
