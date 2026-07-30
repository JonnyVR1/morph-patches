package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m88121d2 = {"Ll/iq60;", "Ll/k2m;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "b", "(Lcom/p1/mobile/putong/data/PayMethod;)Z", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "newFilterRule", "Lkotlin/Pair;", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;Z)Lkotlin/Pair;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class iq60 implements k2m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String from;

    public iq60(@NotNull PurchaseType purchaseType, @Nullable String str) {
        purchaseType.getClass();
        this.purchaseType = purchaseType;
        this.from = str;
    }

    @Override // p153l.k2m
    @NotNull
    /* JADX INFO: renamed from: a */
    public Pair<CharSequence, Boolean> mo136600a(@NotNull PayMethod payMethod, @NotNull C8928d section, boolean newFilterRule) {
        payMethod.getClass();
        section.getClass();
        if (!newFilterRule) {
            return TEnum.equals(payMethod, "alipay") ? new Pair<>(CoreModule.m30933P().m143405a().mo34305D6(), Boolean.TRUE) : new Pair<>("随机立减最高8元", Boolean.FALSE);
        }
        List<PayMethod> listM189833x = tab0.m189811h().m189833x(mo136602c(section, this.purchaseType, this.from).m54784s());
        listM189833x.getClass();
        return (TEnum.equals(payMethod, "alipay") && listM189833x.contains(PayMethod.get("alipay"))) ? new Pair<>(CoreModule.m30933P().m143405a().mo34305D6(), Boolean.TRUE) : new Pair<>("", Boolean.TRUE);
    }

    @Override // p153l.k2m
    /* JADX INFO: renamed from: b */
    public boolean mo136601b(@NotNull PayMethod payMethod) {
        payMethod.getClass();
        return CoreModule.m30933P().m143405a().mo34528jh() && TEnum.equals(payMethod, "alipay");
    }

    @Override // p153l.k2m
    @NotNull
    /* JADX INFO: renamed from: c */
    public /* bridge */ C8928d.a mo136602c(@NotNull C8928d c8928d, @NotNull PurchaseType purchaseType, @Nullable String str) {
        return super.mo136602c(c8928d, purchaseType, str);
    }
}
