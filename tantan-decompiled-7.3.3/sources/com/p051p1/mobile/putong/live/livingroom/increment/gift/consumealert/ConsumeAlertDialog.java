package com.p051p1.mobile.putong.live.livingroom.increment.gift.consumealert;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.consumealert.ConsumeAlertDialog;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.civ;
import p153l.htd0;
import p153l.o06;
import p153l.pzi0;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0018\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0012R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010<\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010+\u001a\u0004\b:\u0010-\"\u0004\b;\u0010/R\"\u0010@\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010#\u001a\u0004\b>\u0010%\"\u0004\b?\u0010'¨\u0006A"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/consumealert/ConsumeAlertDialog;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", OMSTemplateType.dialog, "k0", "(Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;)V", "Landroid/view/View;", OMSTemplateModeType.view, "j0", "(Landroid/view/View;)V", Constants.INAPP_DATA_TAG, "Landroid/view/View;", "get_alert_root", "()Landroid/view/View;", "set_alert_root", "_alert_root", "Lv/VImage;", "e", "Lv/VImage;", "get_alert_icon", "()Lv/VImage;", "set_alert_icon", "(Lv/VImage;)V", "_alert_icon", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "get_alert_title", "()Landroid/widget/TextView;", "set_alert_title", "(Landroid/widget/TextView;)V", "_alert_title", "Lv/VText;", "g", "Lv/VText;", "get_alert_sub_title", "()Lv/VText;", "set_alert_sub_title", "(Lv/VText;)V", "_alert_sub_title", "Lv/VCheckBox;", "h", "Lv/VCheckBox;", "get_alert_check_box", "()Lv/VCheckBox;", "set_alert_check_box", "(Lv/VCheckBox;)V", "_alert_check_box", RXScreenCaptureService.KEY_INDEX, "get_alert_check_box_text", "set_alert_check_box_text", "_alert_check_box_text", "j", "get_confirm_button", "set_confirm_button", "_confirm_button", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ConsumeAlertDialog extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public View _alert_root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _alert_icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _alert_title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _alert_sub_title;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VCheckBox _alert_check_box;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _alert_check_box_text;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public TextView _confirm_button;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ConsumeAlertDialog(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m74674h0(ConsumeAlertDialog consumeAlertDialog, DialogInterface dialogInterface) {
        if (consumeAlertDialog.get_alert_check_box().isChecked()) {
            ((civ) zrv.m221194l(htd0.f111524f)).m109978v(pzi0.m174459t());
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m74675i0(DialogC12774a dialogC12774a, View view) {
        dialogC12774a.dismiss();
    }

    @NotNull
    public final VCheckBox get_alert_check_box() {
        VCheckBox vCheckBox = this._alert_check_box;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.m88391r("_alert_check_box");
        return null;
    }

    @NotNull
    public final VText get_alert_check_box_text() {
        VText vText = this._alert_check_box_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_alert_check_box_text");
        return null;
    }

    @NotNull
    public final VImage get_alert_icon() {
        VImage vImage = this._alert_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_alert_icon");
        return null;
    }

    @NotNull
    public final View get_alert_root() {
        View view = this._alert_root;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_alert_root");
        return null;
    }

    @NotNull
    public final VText get_alert_sub_title() {
        VText vText = this._alert_sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_alert_sub_title");
        return null;
    }

    @NotNull
    public final TextView get_alert_title() {
        TextView textView = this._alert_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_alert_title");
        return null;
    }

    @NotNull
    public final TextView get_confirm_button() {
        TextView textView = this._confirm_button;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_confirm_button");
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m74676j0(View view) {
        o06.m165423a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m74677k0(@NotNull final DialogC12774a dialog) {
        dialog.getClass();
        bnl0.m105509E0(get_confirm_button(), new View.OnClickListener() { // from class: l.m06
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConsumeAlertDialog.m74675i0(dialog, view);
            }
        });
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.n06
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ConsumeAlertDialog.m74674h0(this.f139590a, dialogInterface);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74676j0(this);
    }

    public final void set_alert_check_box(@NotNull VCheckBox vCheckBox) {
        vCheckBox.getClass();
        this._alert_check_box = vCheckBox;
    }

    public final void set_alert_check_box_text(@NotNull VText vText) {
        vText.getClass();
        this._alert_check_box_text = vText;
    }

    public final void set_alert_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._alert_icon = vImage;
    }

    public final void set_alert_root(@NotNull View view) {
        view.getClass();
        this._alert_root = view;
    }

    public final void set_alert_sub_title(@NotNull VText vText) {
        vText.getClass();
        this._alert_sub_title = vText;
    }

    public final void set_alert_title(@NotNull TextView textView) {
        textView.getClass();
        this._alert_title = textView;
    }

    public final void set_confirm_button(@NotNull TextView textView) {
        textView.getClass();
        this._confirm_button = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ConsumeAlertDialog(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ ConsumeAlertDialog(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
