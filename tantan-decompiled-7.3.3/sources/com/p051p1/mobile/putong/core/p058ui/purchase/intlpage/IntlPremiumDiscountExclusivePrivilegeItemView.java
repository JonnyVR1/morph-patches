package com.p051p1.mobile.putong.core.p058ui.purchase.intlpage;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VIcon;
import p151v.VLinear;
import p151v.VText_NoTopPadding;
import p153l.a690;
import p153l.bnl0;
import p153l.d0p;
import p153l.eep;
import p153l.fdc0;
import p153l.jbc0;
import p153l.qa00;
import p153l.wib0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\nR\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPremiumDiscountExclusivePrivilegeItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "b", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)V", "c", "a", "Lv/VIcon;", "Lv/VIcon;", "_icon", "Lv/VLinear;", "Lv/VLinear;", "_content_layout", "Lv/VText_NoTopPadding;", "Lv/VText_NoTopPadding;", "_privilege", Constants.INAPP_DATA_TAG, "_privilege_desc", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlPremiumDiscountExclusivePrivilegeItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VIcon _icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VLinear _content_layout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText_NoTopPadding _privilege;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText_NoTopPadding _privilege_desc;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public IntlPremiumDiscountExclusivePrivilegeItemView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m54900a() {
        VIcon vIcon = this._icon;
        VText_NoTopPadding vText_NoTopPadding = null;
        if (vIcon == null) {
            Intrinsics.m88391r("_icon");
            vIcon = null;
        }
        vIcon.setImageResource(jbc0.f119445W0);
        VIcon vIcon2 = this._icon;
        if (vIcon2 == null) {
            Intrinsics.m88391r("_icon");
            vIcon2 = null;
        }
        vIcon2.clearColorFilter();
        VText_NoTopPadding vText_NoTopPadding2 = this._privilege;
        if (vText_NoTopPadding2 == null) {
            Intrinsics.m88391r("_privilege");
            vText_NoTopPadding2 = null;
        }
        vText_NoTopPadding2.setTextColor(Color.parseColor("#E6CF9C"));
        VText_NoTopPadding vText_NoTopPadding3 = this._privilege_desc;
        if (vText_NoTopPadding3 == null) {
            Intrinsics.m88391r("_privilege_desc");
        } else {
            vText_NoTopPadding = vText_NoTopPadding3;
        }
        vText_NoTopPadding.setTextColor(Color.parseColor("#99E6CF9C"));
    }

    /* JADX INFO: renamed from: b */
    public final void m54901b(@NotNull PurchaseType purchaseType, @NotNull Privilege privilege) {
        String string;
        String string2;
        purchaseType.getClass();
        privilege.getClass();
        m54900a();
        if (wib0.m206573q(purchaseType)) {
            Context context = getContext();
            context.getClass();
            eep.C16763b c16763bM120558f = eep.m120558f((Act) context, purchaseType, privilege);
            string = c16763bM120558f.f93656a;
            string.getClass();
            string2 = c16763bM120558f.f93657b;
            string2.getClass();
        } else {
            a690 a690VarM113420b = d0p.m113420b(purchaseType, privilege);
            string = a690VarM113420b.m96311q().toString();
            string2 = a690VarM113420b.m96294d().toString();
        }
        VText_NoTopPadding vText_NoTopPadding = this._privilege;
        VLinear vLinear = null;
        if (vText_NoTopPadding == null) {
            Intrinsics.m88391r("_privilege");
            vText_NoTopPadding = null;
        }
        vText_NoTopPadding.setText(string);
        if ((privilege == Privilege.tribe || privilege == Privilege.premium_compliment) && !TextUtils.isEmpty(string2)) {
            VText_NoTopPadding vText_NoTopPadding2 = this._privilege_desc;
            if (vText_NoTopPadding2 == null) {
                Intrinsics.m88391r("_privilege_desc");
                vText_NoTopPadding2 = null;
            }
            vText_NoTopPadding2.setText(string2);
            VText_NoTopPadding vText_NoTopPadding3 = this._privilege_desc;
            if (vText_NoTopPadding3 == null) {
                Intrinsics.m88391r("_privilege_desc");
                vText_NoTopPadding3 = null;
            }
            bnl0.m105524M(vText_NoTopPadding3, true);
        } else {
            VText_NoTopPadding vText_NoTopPadding4 = this._privilege_desc;
            if (vText_NoTopPadding4 == null) {
                Intrinsics.m88391r("_privilege_desc");
                vText_NoTopPadding4 = null;
            }
            bnl0.m105524M(vText_NoTopPadding4, false);
            VText_NoTopPadding vText_NoTopPadding5 = this._privilege_desc;
            if (vText_NoTopPadding5 == null) {
                Intrinsics.m88391r("_privilege_desc");
                vText_NoTopPadding5 = null;
            }
            vText_NoTopPadding5.setText("");
        }
        VText_NoTopPadding vText_NoTopPadding6 = this._privilege;
        if (vText_NoTopPadding6 == null) {
            Intrinsics.m88391r("_privilege");
            vText_NoTopPadding6 = null;
        }
        bnl0.m105540X(vText_NoTopPadding6, 0);
        VLinear vLinear2 = this._content_layout;
        if (vLinear2 == null) {
            Intrinsics.m88391r("_content_layout");
        } else {
            vLinear = vLinear2;
        }
        bnl0.m105538V(vLinear, qa00.f156323j);
    }

    /* JADX INFO: renamed from: c */
    public final void m54902c() {
        m54900a();
        VText_NoTopPadding vText_NoTopPadding = this._privilege;
        VText_NoTopPadding vText_NoTopPadding2 = null;
        if (vText_NoTopPadding == null) {
            Intrinsics.m88391r("_privilege");
            vText_NoTopPadding = null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getContext().getString(R$string.f28120Q5);
        string.getClass();
        vText_NoTopPadding.setText(String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(null).size())}, 1)));
        VText_NoTopPadding vText_NoTopPadding3 = this._privilege;
        if (vText_NoTopPadding3 == null) {
            Intrinsics.m88391r("_privilege");
            vText_NoTopPadding3 = null;
        }
        bnl0.m105540X(vText_NoTopPadding3, qa00.m175859d(2.0f));
        VText_NoTopPadding vText_NoTopPadding4 = this._privilege_desc;
        if (vText_NoTopPadding4 == null) {
            Intrinsics.m88391r("_privilege_desc");
        } else {
            vText_NoTopPadding2 = vText_NoTopPadding4;
        }
        bnl0.m105524M(vText_NoTopPadding2, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(fdc0.f98384Z);
        viewFindViewById.getClass();
        this._icon = (VIcon) viewFindViewById;
        View viewFindViewById2 = findViewById(fdc0.f98448x);
        viewFindViewById2.getClass();
        this._content_layout = (VLinear) viewFindViewById2;
        View viewFindViewById3 = findViewById(fdc0.f98449x0);
        viewFindViewById3.getClass();
        this._privilege = (VText_NoTopPadding) viewFindViewById3;
        View viewFindViewById4 = findViewById(fdc0.f98451y0);
        viewFindViewById4.getClass();
        this._privilege_desc = (VText_NoTopPadding) viewFindViewById4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlPremiumDiscountExclusivePrivilegeItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ IntlPremiumDiscountExclusivePrivilegeItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
