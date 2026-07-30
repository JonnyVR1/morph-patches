package com.p051p1.mobile.putong.core.p058ui.purchase.showcase;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.MembershipUpgradeDurationInfo;
import com.p051p1.mobile.putong.core.data.MembershipUpgradeInfo;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VLinear;
import p151v.VText;
import p153l.gta;
import p153l.jyb;
import p153l.rl40;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/showcase/NewUiGPPurchaseUpgradeTip;", "Lv/VLinear;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "upgradeSections", "Q", "(Ljava/util/List;)V", "Landroid/view/View;", OMSTemplateModeType.view, "P", "(Landroid/view/View;)V", "Lv/VText;", "c", "Lv/VText;", "get_upgrade_tip", "()Lv/VText;", "set_upgrade_tip", "(Lv/VText;)V", "_upgrade_tip", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public final void m55552P(View view) {
        rl40.m181915a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final void m55553Q(@Nullable List<C8928d> upgradeSections) {
        if (jyb.m147479J(upgradeSections)) {
            return;
        }
        upgradeSections.getClass();
        String string = "";
        String strM54764g = "";
        for (C8928d c8928d : upgradeSections) {
            c8928d.getClass();
            C8928d c8928d2 = c8928d;
            C8928d.a aVarM54705d = c8928d2.m54705d();
            if (aVarM54705d == null) {
                aVarM54705d = c8928d2.m54703b();
            }
            if (aVarM54705d.m54788w() == 1) {
                strM54764g = aVarM54705d.m54764g();
                strM54764g.getClass();
            }
        }
        MembershipUpgradeInfo membershipUpgradeInfo = CoreModule.f18264c.f20311G2.f131283R;
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
        if (gta.m132210e().m132214d().mo34913qq()) {
            color = Color.parseColor("#4D000000");
        }
        C8928d.a aVarM54705d2 = upgradeSections.get(0).m54705d();
        if (aVarM54705d2 == null) {
            aVarM54705d2 = upgradeSections.get(0).m54703b();
        }
        ProductCategory productCategoryM54762f = aVarM54705d2 != null ? aVarM54705d2.m54762f() : null;
        if (TEnum.equals(productCategoryM54762f, ProductCategory.tttVipUpgradeToPremium)) {
            string = getContext().getString(R$string.f28497x3, strM54764g, Integer.valueOf(i), "VIP");
            string.getClass();
        } else if (TEnum.equals(productCategoryM54762f, ProductCategory.tttSeeUpgradeToPremium)) {
            string = getContext().getString(R$string.f28497x3, strM54764g, Integer.valueOf(i), getContext().getString(R$string.f28457t7));
            string.getClass();
        } else if (TEnum.equals(productCategoryM54762f, ProductCategory.tttPremiumUpgradeToUltra) || TEnum.equals(productCategoryM54762f, ProductCategory.Promo_premiumUpgradeToUltra)) {
            color = gta.m132210e().m132214d().mo34913qq() ? Color.parseColor("#66402A4A") : Color.parseColor("#663D2747");
            string = getContext().getString(R$string.f28519z3, strM54764g, Integer.valueOf(i));
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
        Intrinsics.m88391r("_upgrade_tip");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55552P(this);
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
