package com.p000p1.mobile.putong.core.p004ui.purchase.showcase;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.MembershipUpgradeDurationInfo;
import com.p1.mobile.putong.core.data.MembershipUpgradeInfo;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.dd40;
import l.vwb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.ura;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/showcase/NewUiGPPurchaseUpgradeTip;", "Lv/VLinear;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "upgradeSections", "Q", "(Ljava/util/List;)V", "Landroid/view/View;", "view", "P", "(Landroid/view/View;)V", "Lv/VText;", "c", "Lv/VText;", "get_upgrade_tip", "()Lv/VText;", "set_upgrade_tip", "(Lv/VText;)V", "_upgrade_tip", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class NewUiGPPurchaseUpgradeTip extends VLinear {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _upgrade_tip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewUiGPPurchaseUpgradeTip(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: renamed from: P */
    public final void m7704P(View view) {
        dd40.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final void m7705Q(@Nullable List<d> upgradeSections) {
        if (vwb.J(upgradeSections)) {
            return;
        }
        upgradeSections.getClass();
        String string = "";
        String strG = "";
        for (d dVar : upgradeSections) {
            dVar.getClass();
            d dVar2 = dVar;
            d.a aVarD = dVar2.d();
            if (aVarD == null) {
                aVarD = dVar2.b();
            }
            if (aVarD.w() == 1) {
                strG = aVarD.g();
                strG.getClass();
            }
        }
        MembershipUpgradeInfo membershipUpgradeInfo = CoreModule.f1534c.f3558G2.f9573R;
        if (membershipUpgradeInfo == null) {
            return;
        }
        Iterator it = membershipUpgradeInfo.duration.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = ((MembershipUpgradeDurationInfo) it.next()).count;
            if (i2 > i) {
                i = i2;
            }
        }
        int color = Color.parseColor("#80D0B585");
        if (ura.m25555e().m25559d().m5847qq()) {
            color = Color.parseColor("#4D000000");
        }
        d.a aVarD2 = upgradeSections.get(0).d();
        if (aVarD2 == null) {
            aVarD2 = upgradeSections.get(0).b();
        }
        ProductCategory productCategoryF = aVarD2 != null ? aVarD2.f() : null;
        if (TEnum.equals(productCategoryF, "tttVipUpgradeToPremium")) {
            string = getContext().getString(R.string.x3, strG, Integer.valueOf(i), "VIP");
            string.getClass();
        } else if (TEnum.equals(productCategoryF, "tttSeeUpgradeToPremium")) {
            string = getContext().getString(R.string.x3, strG, Integer.valueOf(i), getContext().getString(R.string.t7));
            string.getClass();
        } else if (TEnum.equals(productCategoryF, "tttPremiumUpgradeToUltra") || TEnum.equals(productCategoryF, "Promo_premiumUpgradeToUltra")) {
            color = ura.m25555e().m25559d().m5847qq() ? Color.parseColor("#66402A4A") : Color.parseColor("#663D2747");
            string = getContext().getString(R.string.z3, strG, Integer.valueOf(i));
            string.getClass();
        }
        get_upgrade_tip().setTextColor(color);
        get_upgrade_tip().setText(string);
    }

    @NotNull
    public final VText get_upgrade_tip() {
        VText vText = this._upgrade_tip;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_upgrade_tip");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7704P(this);
    }

    public final void set_upgrade_tip(@NotNull VText vText) {
        vText.getClass();
        this._upgrade_tip = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewUiGPPurchaseUpgradeTip(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
