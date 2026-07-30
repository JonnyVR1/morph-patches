package com.p000p1.mobile.putong.core.p001ui.purchase.intlpage;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.Gender;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import l.d3c0;
import l.dyo;
import l.ecp;
import l.sab0;
import l.t100;
import l.wx80;
import l.xdl0;
import l.z4c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VIcon;
import v.VLinear;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\nR\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPremiumDiscountExclusivePrivilegeItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "b", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)V", "c", "a", "Lv/VIcon;", "Lv/VIcon;", "_icon", "Lv/VLinear;", "Lv/VLinear;", "_content_layout", "Lv/VText_NoTopPadding;", "Lv/VText_NoTopPadding;", "_privilege", "d", "_privilege_desc", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlPremiumDiscountExclusivePrivilegeItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VIcon _icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VLinear _content_layout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText_NoTopPadding _privilege;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText_NoTopPadding _privilege_desc;

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public IntlPremiumDiscountExclusivePrivilegeItemView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m4283a() {
        AppCompatImageView appCompatImageView = this._icon;
        TextView textView = null;
        if (appCompatImageView == null) {
            Intrinsics.r("_icon");
            appCompatImageView = null;
        }
        appCompatImageView.setImageResource(d3c0.W0);
        ImageView imageView = this._icon;
        if (imageView == null) {
            Intrinsics.r("_icon");
            imageView = null;
        }
        imageView.clearColorFilter();
        TextView textView2 = this._privilege;
        if (textView2 == null) {
            Intrinsics.r("_privilege");
            textView2 = null;
        }
        textView2.setTextColor(Color.parseColor("#E6CF9C"));
        TextView textView3 = this._privilege_desc;
        if (textView3 == null) {
            Intrinsics.r("_privilege_desc");
        } else {
            textView = textView3;
        }
        textView.setTextColor(Color.parseColor("#99E6CF9C"));
    }

    /* JADX INFO: renamed from: b */
    public final void m4284b(@NotNull PurchaseType purchaseType, @NotNull Privilege privilege) {
        String string;
        String string2;
        purchaseType.getClass();
        privilege.getClass();
        m4283a();
        if (sab0.q(purchaseType)) {
            Act context = getContext();
            context.getClass();
            ecp.b bVarF = ecp.f(context, purchaseType, privilege);
            string = bVarF.a;
            string.getClass();
            string2 = bVarF.b;
            string2.getClass();
        } else {
            wx80 wx80VarB = dyo.b(purchaseType, privilege);
            string = wx80VarB.q().toString();
            string2 = wx80VarB.d().toString();
        }
        TextView textView = this._privilege;
        View view = null;
        if (textView == null) {
            Intrinsics.r("_privilege");
            textView = null;
        }
        textView.setText(string);
        if ((privilege == Privilege.tribe || privilege == Privilege.premium_compliment) && !TextUtils.isEmpty(string2)) {
            TextView textView2 = this._privilege_desc;
            if (textView2 == null) {
                Intrinsics.r("_privilege_desc");
                textView2 = null;
            }
            textView2.setText(string2);
            View view2 = this._privilege_desc;
            if (view2 == null) {
                Intrinsics.r("_privilege_desc");
                view2 = null;
            }
            xdl0.M(view2, true);
        } else {
            View view3 = this._privilege_desc;
            if (view3 == null) {
                Intrinsics.r("_privilege_desc");
                view3 = null;
            }
            xdl0.M(view3, false);
            TextView textView3 = this._privilege_desc;
            if (textView3 == null) {
                Intrinsics.r("_privilege_desc");
                textView3 = null;
            }
            textView3.setText("");
        }
        View view4 = this._privilege;
        if (view4 == null) {
            Intrinsics.r("_privilege");
            view4 = null;
        }
        xdl0.X(view4, 0);
        View view5 = this._content_layout;
        if (view5 == null) {
            Intrinsics.r("_content_layout");
        } else {
            view = view5;
        }
        xdl0.V(view, t100.j);
    }

    /* JADX INFO: renamed from: c */
    public final void m4285c() {
        m4283a();
        TextView textView = this._privilege;
        View view = null;
        if (textView == null) {
            Intrinsics.r("_privilege");
            textView = null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getContext().getString(R.string.Q5);
        string.getClass();
        textView.setText(String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP((Gender) null).size())}, 1)));
        View view2 = this._privilege;
        if (view2 == null) {
            Intrinsics.r("_privilege");
            view2 = null;
        }
        xdl0.X(view2, t100.d(2.0f));
        View view3 = this._privilege_desc;
        if (view3 == null) {
            Intrinsics.r("_privilege_desc");
        } else {
            view = view3;
        }
        xdl0.M(view, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        VIcon vIconFindViewById = findViewById(z4c0.Z);
        vIconFindViewById.getClass();
        this._icon = vIconFindViewById;
        VLinear vLinearFindViewById = findViewById(z4c0.x);
        vLinearFindViewById.getClass();
        this._content_layout = vLinearFindViewById;
        VText_NoTopPadding vText_NoTopPaddingFindViewById = findViewById(z4c0.x0);
        vText_NoTopPaddingFindViewById.getClass();
        this._privilege = vText_NoTopPaddingFindViewById;
        VText_NoTopPadding vText_NoTopPaddingFindViewById2 = findViewById(z4c0.y0);
        vText_NoTopPaddingFindViewById2.getClass();
        this._privilege_desc = vText_NoTopPaddingFindViewById2;
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
