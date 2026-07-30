package com.p051p1.mobile.putong.core.p058ui.banner.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VCheckBox;
import p151v.VText;
import p153l.n3m;
import p153l.w990;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010-\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00109\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u0010!\u001a\u0004\b7\u0010#\"\u0004\b8\u0010%¨\u0006:"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePaymentView;", "Landroid/widget/LinearLayout;", "Ll/n3m;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Landroid/widget/RelativeLayout;", "Landroid/widget/RelativeLayout;", "get_pay_way", "()Landroid/widget/RelativeLayout;", "set_pay_way", "(Landroid/widget/RelativeLayout;)V", "_pay_way", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "get_pay_way_txt", "()Landroid/widget/TextView;", "set_pay_way_txt", "(Landroid/widget/TextView;)V", "_pay_way_txt", "Lv/VText;", "c", "Lv/VText;", "get_prom_text", "()Lv/VText;", "set_prom_text", "(Lv/VText;)V", "_prom_text", Constants.INAPP_DATA_TAG, "Landroid/widget/LinearLayout;", "get_origin_proto", "()Landroid/widget/LinearLayout;", "set_origin_proto", "(Landroid/widget/LinearLayout;)V", "_origin_proto", "Lv/VCheckBox;", "e", "Lv/VCheckBox;", "get_check", "()Lv/VCheckBox;", "set_check", "(Lv/VCheckBox;)V", "_check", "f", "get_member_protocol", "set_member_protocol", "_member_protocol", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PrivilegeEntrancePaymentView extends LinearLayout implements n3m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public RelativeLayout _pay_way;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _pay_way_txt;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _prom_text;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public LinearLayout _origin_proto;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VCheckBox _check;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _member_protocol;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PrivilegeEntrancePaymentView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m45576a(View view) {
        w990.m205568a(this, view);
    }

    @NotNull
    public final VCheckBox get_check() {
        VCheckBox vCheckBox = this._check;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.m88391r("_check");
        return null;
    }

    @NotNull
    public final VText get_member_protocol() {
        VText vText = this._member_protocol;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_member_protocol");
        return null;
    }

    @NotNull
    public final LinearLayout get_origin_proto() {
        LinearLayout linearLayout = this._origin_proto;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_origin_proto");
        return null;
    }

    @NotNull
    public final RelativeLayout get_pay_way() {
        RelativeLayout relativeLayout = this._pay_way;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m88391r("_pay_way");
        return null;
    }

    @NotNull
    public final TextView get_pay_way_txt() {
        TextView textView = this._pay_way_txt;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_pay_way_txt");
        return null;
    }

    @NotNull
    public final VText get_prom_text() {
        VText vText = this._prom_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_prom_text");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45576a(this);
    }

    public final void set_check(@NotNull VCheckBox vCheckBox) {
        vCheckBox.getClass();
        this._check = vCheckBox;
    }

    public final void set_member_protocol(@NotNull VText vText) {
        vText.getClass();
        this._member_protocol = vText;
    }

    public final void set_origin_proto(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._origin_proto = linearLayout;
    }

    public final void set_pay_way(@NotNull RelativeLayout relativeLayout) {
        relativeLayout.getClass();
        this._pay_way = relativeLayout;
    }

    public final void set_pay_way_txt(@NotNull TextView textView) {
        textView.getClass();
        this._pay_way_txt = textView;
    }

    public final void set_prom_text(@NotNull VText vText) {
        vText.getClass();
        this._prom_text = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrivilegeEntrancePaymentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PrivilegeEntrancePaymentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
