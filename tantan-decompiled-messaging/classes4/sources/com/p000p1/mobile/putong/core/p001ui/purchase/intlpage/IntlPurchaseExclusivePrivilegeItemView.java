package com.p000p1.mobile.putong.core.p001ui.purchase.intlpage;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
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
import l.n4p;
import l.sab0;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VIcon;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\nJ\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\nJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00102\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00105\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101¨\u00066"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchaseExclusivePrivilegeItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "b", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)V", "", "content", "", "show", "animateShow", "e", "(Ljava/lang/CharSequence;ZZ)V", "c", "d", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)V", "Lv/VIcon;", "Lv/VIcon;", "get_icon", "()Lv/VIcon;", "set_icon", "(Lv/VIcon;)V", "_icon", "Lv/VLinear;", "Lv/VLinear;", "get_content_layout", "()Lv/VLinear;", "set_content_layout", "(Lv/VLinear;)V", "_content_layout", "Lv/VText;", "Lv/VText;", "get_privilege", "()Lv/VText;", "set_privilege", "(Lv/VText;)V", "_privilege", "get_privilege_desc", "set_privilege_desc", "_privilege_desc", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlPurchaseExclusivePrivilegeItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VIcon _icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VLinear _content_layout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _privilege;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _privilege_desc;

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public IntlPurchaseExclusivePrivilegeItemView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m4397a(View view) {
        n4p.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m4398b(@NotNull PurchaseType purchaseType, @NotNull Privilege privilege) {
        purchaseType.getClass();
        privilege.getClass();
        if (sab0.q(purchaseType)) {
            get_icon().setImageResource(d3c0.w1);
            get_privilege().setTextColor(Color.parseColor("#FFD0B585"));
            get_privilege_desc().setTextColor(Color.parseColor("#4DE8CA8A"));
        } else if (sab0.v(purchaseType)) {
            xdl0.C0(get_icon(), t100.d(18.0f));
            xdl0.D0(t100.d(18.0f), new View[]{get_icon()});
            get_icon().setImageResource(d3c0.y1);
            get_privilege().setTextColor(Color.parseColor("#F9E7FF"));
            get_privilege_desc().setTextColor(Color.parseColor("#66F9E7FF"));
        } else {
            get_icon().setImageResource(d3c0.A1);
            get_privilege().setTextColor(Color.parseColor("#B3000000"));
            get_privilege_desc().setTextColor(Color.parseColor("#66000000"));
        }
        get_privilege().setText(dyo.b(purchaseType, privilege).q());
        get_privilege_desc().setText(dyo.b(purchaseType, privilege).d());
        xdl0.X(get_privilege(), 0);
        xdl0.V(get_content_layout(), t100.k);
    }

    /* JADX INFO: renamed from: c */
    public final void m4399c() {
        get_icon().setImageResource(d3c0.x1);
        get_privilege().setTextColor(Color.parseColor("#FFD0B585"));
        get_privilege_desc().setTextColor(Color.parseColor("#E8CA8A4D"));
        VText vText = get_privilege();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getContext().getString(R.string.j4);
        string.getClass();
        vText.setText(String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(PurchaseType.TYPE_GET_VIP.getPrivilegeDataForGP((Gender) null).size())}, 1)));
        xdl0.X(get_privilege(), t100.d(3.0f));
        xdl0.M(get_privilege_desc(), false);
    }

    /* JADX INFO: renamed from: d */
    public final void m4400d() {
        get_icon().setImageResource(d3c0.z1);
        get_privilege().setTextColor(Color.parseColor("#F9E7FF"));
        VText vText = get_privilege();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getContext().getString(R.string.Q5);
        string.getClass();
        vText.setText(String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP((Gender) null).size())}, 1)));
        xdl0.X(get_privilege(), t100.d(3.0f));
        xdl0.V(get_content_layout(), t100.i);
        xdl0.M(get_privilege_desc(), false);
    }

    /* JADX INFO: renamed from: e */
    public final void m4401e(@Nullable CharSequence content, boolean show, boolean animateShow) {
        if (!show) {
            get_privilege_desc().animate().cancel();
            get_privilege_desc().setAlpha(1.0f);
            xdl0.M(get_privilege_desc(), false);
        } else {
            if (!animateShow) {
                get_privilege_desc().animate().cancel();
                get_privilege_desc().setAlpha(1.0f);
                get_privilege_desc().setText(content);
                xdl0.M(get_privilege_desc(), true);
                return;
            }
            get_privilege_desc().setAlpha(0.0f);
            xdl0.M(get_privilege_desc(), true);
            get_privilege_desc().setText(content);
            get_privilege_desc().animate().cancel();
            get_privilege_desc().animate().alpha(1.0f).setDuration(180L).start();
        }
    }

    @NotNull
    public final VLinear get_content_layout() {
        VLinear vLinear = this._content_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_content_layout");
        return null;
    }

    @NotNull
    public final VIcon get_icon() {
        VIcon vIcon = this._icon;
        if (vIcon != null) {
            return vIcon;
        }
        Intrinsics.r("_icon");
        return null;
    }

    @NotNull
    public final VText get_privilege() {
        VText vText = this._privilege;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_privilege");
        return null;
    }

    @NotNull
    public final VText get_privilege_desc() {
        VText vText = this._privilege_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_privilege_desc");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4397a(this);
    }

    public final void set_content_layout(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._content_layout = vLinear;
    }

    public final void set_icon(@NotNull VIcon vIcon) {
        vIcon.getClass();
        this._icon = vIcon;
    }

    public final void set_privilege(@NotNull VText vText) {
        vText.getClass();
        this._privilege = vText;
    }

    public final void set_privilege_desc(@NotNull VText vText) {
        vText.getClass();
        this._privilege_desc = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlPurchaseExclusivePrivilegeItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ IntlPurchaseExclusivePrivilegeItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
