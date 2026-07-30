package com.p046p1.mobile.putong.core.p053ui.visitor.myvisitors;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.visitor.myvisitors.MyVisitorRecoverHideFootPrintView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.d30;
import p149l.q120;
import p149l.xdl0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\"\u00100\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00103\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010 \u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R\"\u00107\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010 \u001a\u0004\b5\u0010\"\"\u0004\b6\u0010$R\"\u0010;\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010+\u001a\u0004\b9\u0010-\"\u0004\b:\u0010/R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010O\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010\u0018\u001a\u0004\bM\u0010\u001a\"\u0004\bN\u0010\u001c¨\u0006P"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorRecoverHideFootPrintView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/data/User;", "user", "Ll/d30;", "confirmClick", "closeClick", "e", "(Lcom/p1/mobile/putong/data/User;Ll/d30;Ll/d30;)V", "Lv/VImage;", "a", "Lv/VImage;", "get_image", "()Lv/VImage;", "set_image", "(Lv/VImage;)V", "_image", "Lv/VText;", "b", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "c", "get_subtitle", "set_subtitle", "_subtitle", "Lv/VLinear;", "Lv/VLinear;", "get_confirm", "()Lv/VLinear;", "set_confirm", "(Lv/VLinear;)V", "_confirm", "get_confirm_title", "set_confirm_title", "_confirm_title", "f", "get_confirm_subtitle", "set_confirm_subtitle", "_confirm_subtitle", "g", "get_v_checkbox", "set_v_checkbox", "_v_checkbox", "Lv/VCheckBox;", "h", "Lv/VCheckBox;", "get_v_checkbox_check", "()Lv/VCheckBox;", "set_v_checkbox_check", "(Lv/VCheckBox;)V", "_v_checkbox_check", "Landroid/widget/TextView;", RXScreenCaptureService.KEY_INDEX, "Landroid/widget/TextView;", "get_v_checkbox_reminder", "()Landroid/widget/TextView;", "set_v_checkbox_reminder", "(Landroid/widget/TextView;)V", "_v_checkbox_reminder", "j", "get_close", "set_close", "_close", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class MyVisitorRecoverHideFootPrintView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VImage _image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VLinear _confirm;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _confirm_title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _confirm_subtitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VLinear _v_checkbox;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VCheckBox _v_checkbox_check;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public TextView _v_checkbox_reminder;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VImage _close;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public MyVisitorRecoverHideFootPrintView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static void m58028a(CompoundButton compoundButton, boolean z) {
        CoreModule.f17545c.f19668n2.m175460k4(z);
    }

    /* JADX INFO: renamed from: b */
    public static void m58029b(d30 d30Var, View view) {
        zvf0.m220396r("e_recover_records_confirm", "p_recover_records_confirm");
        d30Var.call();
    }

    /* JADX INFO: renamed from: c */
    public static void m58030c(d30 d30Var, View view) {
        d30Var.call();
    }

    /* JADX INFO: renamed from: d */
    public final void m58031d(View view) {
        q120.m172369a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m58032e(@NotNull User user, @NotNull final d30 confirmClick, @NotNull final d30 closeClick) {
        user.getClass();
        confirmClick.getClass();
        closeClick.getClass();
        get_title().setText("确认恢复访问足迹？");
        String str = user.isFemale() ? "她" : "他";
        get_subtitle().setText("恢复后，对方将看到你的访问次数，下次隐藏对" + str + "的访问痕迹将扣减次数");
        get_confirm_title().setText("恢复访问足迹");
        get_confirm_subtitle().setText("本月剩余" + xma.m210038A4() + "次隐藏足迹特权");
        get_v_checkbox_reminder().setText("不再提醒");
        get_v_checkbox_check().setChecked(CoreModule.f17545c.f19668n2.m175459j4());
        get_v_checkbox_check().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.n120
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MyVisitorRecoverHideFootPrintView.m58028a(compoundButton, z);
            }
        });
        xdl0.m208342L(get_confirm(), new View.OnClickListener() { // from class: l.o120
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyVisitorRecoverHideFootPrintView.m58029b(confirmClick, view);
            }
        });
        xdl0.m208342L(get_close(), new View.OnClickListener() { // from class: l.p120
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyVisitorRecoverHideFootPrintView.m58030c(closeClick, view);
            }
        });
    }

    @NotNull
    public final VImage get_close() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    public final VLinear get_confirm() {
        VLinear vLinear = this._confirm;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_confirm");
        return null;
    }

    @NotNull
    public final VText get_confirm_subtitle() {
        VText vText = this._confirm_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_confirm_subtitle");
        return null;
    }

    @NotNull
    public final VText get_confirm_title() {
        VText vText = this._confirm_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_confirm_title");
        return null;
    }

    @NotNull
    public final VImage get_image() {
        VImage vImage = this._image;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_image");
        return null;
    }

    @NotNull
    public final VText get_subtitle() {
        VText vText = this._subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_subtitle");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    @NotNull
    public final VLinear get_v_checkbox() {
        VLinear vLinear = this._v_checkbox;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_v_checkbox");
        return null;
    }

    @NotNull
    public final VCheckBox get_v_checkbox_check() {
        VCheckBox vCheckBox = this._v_checkbox_check;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.m87502r("_v_checkbox_check");
        return null;
    }

    @NotNull
    public final TextView get_v_checkbox_reminder() {
        TextView textView = this._v_checkbox_reminder;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_v_checkbox_reminder");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58031d(this);
    }

    public final void set_close(@NotNull VImage vImage) {
        vImage.getClass();
        this._close = vImage;
    }

    public final void set_confirm(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._confirm = vLinear;
    }

    public final void set_confirm_subtitle(@NotNull VText vText) {
        vText.getClass();
        this._confirm_subtitle = vText;
    }

    public final void set_confirm_title(@NotNull VText vText) {
        vText.getClass();
        this._confirm_title = vText;
    }

    public final void set_image(@NotNull VImage vImage) {
        vImage.getClass();
        this._image = vImage;
    }

    public final void set_subtitle(@NotNull VText vText) {
        vText.getClass();
        this._subtitle = vText;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    public final void set_v_checkbox(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._v_checkbox = vLinear;
    }

    public final void set_v_checkbox_check(@NotNull VCheckBox vCheckBox) {
        vCheckBox.getClass();
        this._v_checkbox_check = vCheckBox;
    }

    public final void set_v_checkbox_reminder(@NotNull TextView textView) {
        textView.getClass();
        this._v_checkbox_reminder = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MyVisitorRecoverHideFootPrintView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ MyVisitorRecoverHideFootPrintView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
