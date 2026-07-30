package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import l.p2b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ll/ci60;", "Ll/qzl;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "b", "(Lcom/p1/mobile/putong/data/PayMethod;)Z", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "newFilterRule", "Lkotlin/Pair;", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;Z)Lkotlin/Pair;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ci60 implements qzl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String from;

    public ci60(@NotNull PurchaseType purchaseType, @Nullable String str) {
        purchaseType.getClass();
        this.purchaseType = purchaseType;
        this.from = str;
    }

    @Override // p006l.qzl
    @NotNull
    /* JADX INFO: renamed from: a */
    public Pair<CharSequence, Boolean> mo13456a(@NotNull PayMethod payMethod, @NotNull d section, boolean newFilterRule) {
        payMethod.getClass();
        section.getClass();
        if (!newFilterRule) {
            return TEnum.equals(payMethod, "alipay") ? new Pair<>(CoreModule.m1854P().m11706a().m5259G8(), Boolean.TRUE) : new Pair<>(CoreModule.m1854P().m11706a().m5563xb(), Boolean.TRUE);
        }
        List listX = p2b0.h().x(mo13458c(section, this.purchaseType, this.from).s());
        listX.getClass();
        if (TEnum.equals(payMethod, "alipay") && listX.contains(PayMethod.get("alipay"))) {
            return new Pair<>(CoreModule.m1854P().m11706a().m5259G8(), Boolean.TRUE);
        }
        return (TEnum.equals(payMethod, "wechat") && listX.contains(PayMethod.get("wechat"))) ? new Pair<>(CoreModule.m1854P().m11706a().m5563xb(), Boolean.TRUE) : new Pair<>("", Boolean.TRUE);
    }

    @Override // p006l.qzl
    /* JADX INFO: renamed from: b */
    public boolean mo13457b(@NotNull PayMethod payMethod) {
        payMethod.getClass();
        if (!CoreModule.m1854P().m11706a().m5306Mi()) {
            return false;
        }
        if (TEnum.equals(payMethod, "alipay")) {
            return true;
        }
        return TEnum.equals(payMethod, "wechat") && !TextUtils.isEmpty(CoreModule.m1854P().m11706a().m5563xb());
    }

    @Override // p006l.qzl
    @NotNull
    /* JADX INFO: renamed from: c */
    public /* bridge */ d.a mo13458c(@NotNull d dVar, @NotNull PurchaseType purchaseType, @Nullable String str) {
        return super.mo13458c(dVar, purchaseType, str);
    }
}
