package com.p051p1.mobile.putong.core.p058ui.purchase.intlpage;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
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
import p151v.VText;
import p153l.bnl0;
import p153l.d0p;
import p153l.jbc0;
import p153l.n6p;
import p153l.qa00;
import p153l.wib0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\nJ\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\nJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00102\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00105\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101¨\u00066"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchaseExclusivePrivilegeItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "b", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)V", "", "content", "", "show", "animateShow", "e", "(Ljava/lang/CharSequence;ZZ)V", "c", Constants.INAPP_DATA_TAG, "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Lv/VIcon;", "Lv/VIcon;", "get_icon", "()Lv/VIcon;", "set_icon", "(Lv/VIcon;)V", "_icon", "Lv/VLinear;", "Lv/VLinear;", "get_content_layout", "()Lv/VLinear;", "set_content_layout", "(Lv/VLinear;)V", "_content_layout", "Lv/VText;", "Lv/VText;", "get_privilege", "()Lv/VText;", "set_privilege", "(Lv/VText;)V", "_privilege", "get_privilege_desc", "set_privilege_desc", "_privilege_desc", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlPurchaseExclusivePrivilegeItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VIcon _icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VLinear _content_layout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _privilege;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _privilege_desc;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public IntlPurchaseExclusivePrivilegeItemView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m55014a(View view) {
        n6p.m161795a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m55015b(@NotNull PurchaseType purchaseType, @NotNull Privilege privilege) {
        purchaseType.getClass();
        privilege.getClass();
        if (wib0.m206573q(purchaseType)) {
            get_icon().setImageResource(jbc0.f119806w1);
            get_privilege().setTextColor(Color.parseColor("#FFD0B585"));
            get_privilege_desc().setTextColor(Color.parseColor("#4DE8CA8A"));
        } else if (wib0.m206578v(purchaseType)) {
            bnl0.m105505C0(get_icon(), qa00.m175859d(18.0f));
            bnl0.m105507D0(qa00.m175859d(18.0f), get_icon());
            get_icon().setImageResource(jbc0.f119834y1);
            get_privilege().setTextColor(Color.parseColor("#F9E7FF"));
            get_privilege_desc().setTextColor(Color.parseColor("#66F9E7FF"));
        } else {
            get_icon().setImageResource(jbc0.f119144A1);
            get_privilege().setTextColor(Color.parseColor("#B3000000"));
            get_privilege_desc().setTextColor(Color.parseColor("#66000000"));
        }
        get_privilege().setText(d0p.m113420b(purchaseType, privilege).m96311q());
        get_privilege_desc().setText(d0p.m113420b(purchaseType, privilege).m96294d());
        bnl0.m105540X(get_privilege(), 0);
        bnl0.m105538V(get_content_layout(), qa00.f156324k);
    }

    /* JADX INFO: renamed from: c */
    public final void m55016c() {
        get_icon().setImageResource(jbc0.f119820x1);
        get_privilege().setTextColor(Color.parseColor("#FFD0B585"));
        get_privilege_desc().setTextColor(Color.parseColor("#E8CA8A4D"));
        VText vText = get_privilege();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getContext().getString(R$string.f28337j4);
        string.getClass();
        vText.setText(String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(PurchaseType.TYPE_GET_VIP.getPrivilegeDataForGP(null).size())}, 1)));
        bnl0.m105540X(get_privilege(), qa00.m175859d(3.0f));
        bnl0.m105524M(get_privilege_desc(), false);
    }

    /* JADX INFO: renamed from: d */
    public final void m55017d() {
        get_icon().setImageResource(jbc0.f119848z1);
        get_privilege().setTextColor(Color.parseColor("#F9E7FF"));
        VText vText = get_privilege();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getContext().getString(R$string.f28120Q5);
        string.getClass();
        vText.setText(String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(null).size())}, 1)));
        bnl0.m105540X(get_privilege(), qa00.m175859d(3.0f));
        bnl0.m105538V(get_content_layout(), qa00.f156322i);
        bnl0.m105524M(get_privilege_desc(), false);
    }

    /* JADX INFO: renamed from: e */
    public final void m55018e(@Nullable CharSequence content, boolean show, boolean animateShow) {
        if (!show) {
            get_privilege_desc().animate().cancel();
            get_privilege_desc().setAlpha(1.0f);
            bnl0.m105524M(get_privilege_desc(), false);
        } else {
            if (!animateShow) {
                get_privilege_desc().animate().cancel();
                get_privilege_desc().setAlpha(1.0f);
                get_privilege_desc().setText(content);
                bnl0.m105524M(get_privilege_desc(), true);
                return;
            }
            get_privilege_desc().setAlpha(0.0f);
            bnl0.m105524M(get_privilege_desc(), true);
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
        Intrinsics.m88391r("_content_layout");
        return null;
    }

    @NotNull
    public final VIcon get_icon() {
        VIcon vIcon = this._icon;
        if (vIcon != null) {
            return vIcon;
        }
        Intrinsics.m88391r("_icon");
        return null;
    }

    @NotNull
    public final VText get_privilege() {
        VText vText = this._privilege;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_privilege");
        return null;
    }

    @NotNull
    public final VText get_privilege_desc() {
        VText vText = this._privilege_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_privilege_desc");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55014a(this);
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
