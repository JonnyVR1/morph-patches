package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.IdealTypes;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VText;
import p149l.qib0;
import p149l.ru80;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/privilege/PrivilegeDescListCustomModelItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/IdealTypes;", "customModel", "i0", "(Lcom/p1/mobile/putong/core/data/IdealTypes;)V", "Landroid/view/View;", OMSTemplateModeType.view, "h0", "(Landroid/view/View;)V", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_header_pic", "()Lv/VDraweeView;", "set_header_pic", "(Lv/VDraweeView;)V", "_header_pic", "e", "get_mask", "set_mask", "_mask", "Lv/VText;", "f", "Lv/VText;", "get_label", "()Lv/VText;", "set_label", "(Lv/VText;)V", "_label", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PrivilegeDescListCustomModelItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _header_pic;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _mask;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _label;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PrivilegeDescListCustomModelItem(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @NotNull
    public final VDraweeView get_header_pic() {
        VDraweeView vDraweeView = this._header_pic;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_header_pic");
        return null;
    }

    @NotNull
    public final VText get_label() {
        VText vText = this._label;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_label");
        return null;
    }

    @NotNull
    public final VDraweeView get_mask() {
        VDraweeView vDraweeView = this._mask;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_mask");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m54233h0(View view) {
        ru80.m180863a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m54234i0(@NotNull IdealTypes customModel) {
        customModel.getClass();
        qib0.f154691G.m102331L0(get_header_pic(), customModel.img);
        get_label().setText(customModel.value);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54233h0(this);
    }

    public final void set_header_pic(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._header_pic = vDraweeView;
    }

    public final void set_label(@NotNull VText vText) {
        vText.getClass();
        this._label = vText;
    }

    public final void set_mask(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._mask = vDraweeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrivilegeDescListCustomModelItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PrivilegeDescListCustomModelItem(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
