package com.p046p1.mobile.putong.core.p053ui.purchase.showcase;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.MembershipUpgradeDurationInfo;
import com.p046p1.mobile.putong.core.data.MembershipUpgradeInfo;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VLinear;
import p147v.VText;
import p149l.dd40;
import p149l.ura;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/showcase/NewUiGPPurchaseUpgradeTip;", "Lv/VLinear;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "upgradeSections", "Q", "(Ljava/util/List;)V", "Landroid/view/View;", OMSTemplateModeType.view, "P", "(Landroid/view/View;)V", "Lv/VText;", "c", "Lv/VText;", "get_upgrade_tip", "()Lv/VText;", "set_upgrade_tip", "(Lv/VText;)V", "_upgrade_tip", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public final void m54369P(View view) {
        dd40.m110892a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final void m54370Q(@Nullable List<C8765d> upgradeSections) {
        if (vwb.m200296J(upgradeSections)) {
            return;
        }
        upgradeSections.getClass();
        String string = "";
        String strM53581g = "";
        for (C8765d c8765d : upgradeSections) {
            c8765d.getClass();
            C8765d c8765d2 = c8765d;
            C8765d.a aVarM53522d = c8765d2.m53522d();
            if (aVarM53522d == null) {
                aVarM53522d = c8765d2.m53520b();
            }
            if (aVarM53522d.m53605w() == 1) {
                strM53581g = aVarM53522d.m53581g();
                strM53581g.getClass();
            }
        }
        MembershipUpgradeInfo membershipUpgradeInfo = CoreModule.f17545c.f19569G2.f80117R;
        if (membershipUpgradeInfo == null) {
            return;
        }
        Iterator<MembershipUpgradeDurationInfo> it = membershipUpgradeInfo.duration.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = it.next().count;
            if (i2 > i) {
                i = i2;
            }
        }
        int color = Color.parseColor("#80D0B585");
        if (ura.m195053e().m195057d().mo33910qq()) {
            color = Color.parseColor("#4D000000");
        }
        C8765d.a aVarM53522d2 = upgradeSections.get(0).m53522d();
        if (aVarM53522d2 == null) {
            aVarM53522d2 = upgradeSections.get(0).m53520b();
        }
        ProductCategory productCategoryM53579f = aVarM53522d2 != null ? aVarM53522d2.m53579f() : null;
        if (TEnum.equals(productCategoryM53579f, ProductCategory.tttVipUpgradeToPremium)) {
            string = getContext().getString(R$string.f27649x3, strM53581g, Integer.valueOf(i), "VIP");
            string.getClass();
        } else if (TEnum.equals(productCategoryM53579f, ProductCategory.tttSeeUpgradeToPremium)) {
            string = getContext().getString(R$string.f27649x3, strM53581g, Integer.valueOf(i), getContext().getString(R$string.f27609t7));
            string.getClass();
        } else if (TEnum.equals(productCategoryM53579f, ProductCategory.tttPremiumUpgradeToUltra) || TEnum.equals(productCategoryM53579f, ProductCategory.Promo_premiumUpgradeToUltra)) {
            color = ura.m195053e().m195057d().mo33910qq() ? Color.parseColor("#66402A4A") : Color.parseColor("#663D2747");
            string = getContext().getString(R$string.f27671z3, strM53581g, Integer.valueOf(i));
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
        Intrinsics.m87502r("_upgrade_tip");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54369P(this);
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
