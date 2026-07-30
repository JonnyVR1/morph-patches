package com.p046p1.mobile.putong.core.p053ui.purchase.intlpage;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VIcon;
import p147v.VLinear;
import p147v.VText_NoTopPadding;
import p149l.d3c0;
import p149l.dyo;
import p149l.ecp;
import p149l.sab0;
import p149l.t100;
import p149l.wx80;
import p149l.xdl0;
import p149l.z4c0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\nR\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPremiumDiscountExclusivePrivilegeItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "b", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)V", "c", "a", "Lv/VIcon;", "Lv/VIcon;", "_icon", "Lv/VLinear;", "Lv/VLinear;", "_content_layout", "Lv/VText_NoTopPadding;", "Lv/VText_NoTopPadding;", "_privilege", Constants.INAPP_DATA_TAG, "_privilege_desc", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public final void m53717a() {
        VIcon vIcon = this._icon;
        VText_NoTopPadding vText_NoTopPadding = null;
        if (vIcon == null) {
            Intrinsics.m87502r("_icon");
            vIcon = null;
        }
        vIcon.setImageResource(d3c0.f83790W0);
        VIcon vIcon2 = this._icon;
        if (vIcon2 == null) {
            Intrinsics.m87502r("_icon");
            vIcon2 = null;
        }
        vIcon2.clearColorFilter();
        VText_NoTopPadding vText_NoTopPadding2 = this._privilege;
        if (vText_NoTopPadding2 == null) {
            Intrinsics.m87502r("_privilege");
            vText_NoTopPadding2 = null;
        }
        vText_NoTopPadding2.setTextColor(Color.parseColor("#E6CF9C"));
        VText_NoTopPadding vText_NoTopPadding3 = this._privilege_desc;
        if (vText_NoTopPadding3 == null) {
            Intrinsics.m87502r("_privilege_desc");
        } else {
            vText_NoTopPadding = vText_NoTopPadding3;
        }
        vText_NoTopPadding.setTextColor(Color.parseColor("#99E6CF9C"));
    }

    /* JADX INFO: renamed from: b */
    public final void m53718b(@NotNull PurchaseType purchaseType, @NotNull Privilege privilege) {
        String string;
        String string2;
        purchaseType.getClass();
        privilege.getClass();
        m53717a();
        if (sab0.m182899q(purchaseType)) {
            Context context = getContext();
            context.getClass();
            ecp.C16575b c16575bM115745f = ecp.m115745f((Act) context, purchaseType, privilege);
            string = c16575bM115745f.f90557a;
            string.getClass();
            string2 = c16575bM115745f.f90558b;
            string2.getClass();
        } else {
            wx80 wx80VarM114088b = dyo.m114088b(purchaseType, privilege);
            string = wx80VarM114088b.m205965q().toString();
            string2 = wx80VarM114088b.m205948d().toString();
        }
        VText_NoTopPadding vText_NoTopPadding = this._privilege;
        VLinear vLinear = null;
        if (vText_NoTopPadding == null) {
            Intrinsics.m87502r("_privilege");
            vText_NoTopPadding = null;
        }
        vText_NoTopPadding.setText(string);
        if ((privilege == Privilege.tribe || privilege == Privilege.premium_compliment) && !TextUtils.isEmpty(string2)) {
            VText_NoTopPadding vText_NoTopPadding2 = this._privilege_desc;
            if (vText_NoTopPadding2 == null) {
                Intrinsics.m87502r("_privilege_desc");
                vText_NoTopPadding2 = null;
            }
            vText_NoTopPadding2.setText(string2);
            VText_NoTopPadding vText_NoTopPadding3 = this._privilege_desc;
            if (vText_NoTopPadding3 == null) {
                Intrinsics.m87502r("_privilege_desc");
                vText_NoTopPadding3 = null;
            }
            xdl0.m208344M(vText_NoTopPadding3, true);
        } else {
            VText_NoTopPadding vText_NoTopPadding4 = this._privilege_desc;
            if (vText_NoTopPadding4 == null) {
                Intrinsics.m87502r("_privilege_desc");
                vText_NoTopPadding4 = null;
            }
            xdl0.m208344M(vText_NoTopPadding4, false);
            VText_NoTopPadding vText_NoTopPadding5 = this._privilege_desc;
            if (vText_NoTopPadding5 == null) {
                Intrinsics.m87502r("_privilege_desc");
                vText_NoTopPadding5 = null;
            }
            vText_NoTopPadding5.setText("");
        }
        VText_NoTopPadding vText_NoTopPadding6 = this._privilege;
        if (vText_NoTopPadding6 == null) {
            Intrinsics.m87502r("_privilege");
            vText_NoTopPadding6 = null;
        }
        xdl0.m208360X(vText_NoTopPadding6, 0);
        VLinear vLinear2 = this._content_layout;
        if (vLinear2 == null) {
            Intrinsics.m87502r("_content_layout");
        } else {
            vLinear = vLinear2;
        }
        xdl0.m208358V(vLinear, t100.f167261j);
    }

    /* JADX INFO: renamed from: c */
    public final void m53719c() {
        m53717a();
        VText_NoTopPadding vText_NoTopPadding = this._privilege;
        VText_NoTopPadding vText_NoTopPadding2 = null;
        if (vText_NoTopPadding == null) {
            Intrinsics.m87502r("_privilege");
            vText_NoTopPadding = null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getContext().getString(R$string.f27272Q5);
        string.getClass();
        vText_NoTopPadding.setText(String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(null).size())}, 1)));
        VText_NoTopPadding vText_NoTopPadding3 = this._privilege;
        if (vText_NoTopPadding3 == null) {
            Intrinsics.m87502r("_privilege");
            vText_NoTopPadding3 = null;
        }
        xdl0.m208360X(vText_NoTopPadding3, t100.m186890d(2.0f));
        VText_NoTopPadding vText_NoTopPadding4 = this._privilege_desc;
        if (vText_NoTopPadding4 == null) {
            Intrinsics.m87502r("_privilege_desc");
        } else {
            vText_NoTopPadding2 = vText_NoTopPadding4;
        }
        xdl0.m208344M(vText_NoTopPadding2, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(z4c0.f201508Z);
        viewFindViewById.getClass();
        this._icon = (VIcon) viewFindViewById;
        View viewFindViewById2 = findViewById(z4c0.f201572x);
        viewFindViewById2.getClass();
        this._content_layout = (VLinear) viewFindViewById2;
        View viewFindViewById3 = findViewById(z4c0.f201573x0);
        viewFindViewById3.getClass();
        this._privilege = (VText_NoTopPadding) viewFindViewById3;
        View viewFindViewById4 = findViewById(z4c0.f201575y0);
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
