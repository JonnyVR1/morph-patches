package com.p046p1.mobile.putong.core.newui.messages.anim.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioNewUiHeaderUserPeiLiaoView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p149l.d30;
import p149l.i0g0;
import p149l.jjb0;
import p149l.o7r;
import p149l.qib0;
import p149l.ssb0;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010E\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010Q\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010@\u001a\u0004\bO\u0010B\"\u0004\bP\u0010DR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010]\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010@\u001a\u0004\b[\u0010B\"\u0004\b\\\u0010DR\"\u0010a\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010@\u001a\u0004\b_\u0010B\"\u0004\b`\u0010DR\"\u0010e\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010T\u001a\u0004\bc\u0010V\"\u0004\bd\u0010XR\"\u0010i\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010@\u001a\u0004\bg\u0010B\"\u0004\bh\u0010D¨\u0006j"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioNewUiHeaderUserPeiLiaoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/p1/mobile/putong/data/User;", "user", "Lv/VText;", "tv", "", "l0", "(Lcom/p1/mobile/putong/data/User;Lv/VText;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "k0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "init", "()V", "Ll/d30;", "click", "close", "m0", "(Lcom/p1/mobile/putong/data/User;Ll/d30;Ll/d30;)V", "Landroid/widget/ImageView;", Constants.INAPP_DATA_TAG, "Landroid/widget/ImageView;", "get_img_icon", "()Landroid/widget/ImageView;", "set_img_icon", "(Landroid/widget/ImageView;)V", "_img_icon", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "get_mark", "()Landroid/widget/TextView;", "set_mark", "(Landroid/widget/TextView;)V", "_mark", "Lv/VFrame;", "f", "Lv/VFrame;", "get_avatar_layout", "()Lv/VFrame;", "set_avatar_layout", "(Lv/VFrame;)V", "_avatar_layout", "Lv/VDraweeView;", "g", "Lv/VDraweeView;", "get_profile_user", "()Lv/VDraweeView;", "set_profile_user", "(Lv/VDraweeView;)V", "_profile_user", "h", "Lv/VText;", "get_green", "()Lv/VText;", "set_green", "(Lv/VText;)V", "_green", "Landroid/widget/LinearLayout;", RXScreenCaptureService.KEY_INDEX, "Landroid/widget/LinearLayout;", "get_text_layout", "()Landroid/widget/LinearLayout;", "set_text_layout", "(Landroid/widget/LinearLayout;)V", "_text_layout", "j", "get_name", "set_name", "_name", "Lv/VImage;", "k", "Lv/VImage;", "get_avatar_icon", "()Lv/VImage;", "set_avatar_icon", "(Lv/VImage;)V", "_avatar_icon", BLiveStormDanmakuGiftResourceType.f44444l, "get_age", "set_age", "_age", "m", "get_say_hi", "set_say_hi", "_say_hi", "n", "get_close", "set_close", "_close", "o", "get_gotochat", "set_gotochat", "_gotochat", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class QuickChatAudioNewUiHeaderUserPeiLiaoView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ImageView _img_icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _mark;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VFrame _avatar_layout;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VDraweeView _profile_user;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _green;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public LinearLayout _text_layout;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VImage _avatar_icon;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VText _age;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _say_hi;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VText _gotochat;

    public /* synthetic */ QuickChatAudioNewUiHeaderUserPeiLiaoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m42064h0(d30 d30Var, View view) {
        d30Var.call();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m42065i0(d30 d30Var, View view) {
        d30Var.call();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m42066j0(d30 d30Var, View view) {
        d30Var.call();
    }

    @NotNull
    public final VText get_age() {
        VText vText = this._age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_age");
        return null;
    }

    @NotNull
    public final VImage get_avatar_icon() {
        VImage vImage = this._avatar_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_avatar_icon");
        return null;
    }

    @NotNull
    public final VFrame get_avatar_layout() {
        VFrame vFrame = this._avatar_layout;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_avatar_layout");
        return null;
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
    public final VText get_gotochat() {
        VText vText = this._gotochat;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_gotochat");
        return null;
    }

    @NotNull
    public final VText get_green() {
        VText vText = this._green;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_green");
        return null;
    }

    @NotNull
    public final ImageView get_img_icon() {
        ImageView imageView = this._img_icon;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_img_icon");
        return null;
    }

    @NotNull
    public final TextView get_mark() {
        TextView textView = this._mark;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_mark");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_name");
        return null;
    }

    @NotNull
    public final VDraweeView get_profile_user() {
        VDraweeView vDraweeView = this._profile_user;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_profile_user");
        return null;
    }

    @NotNull
    public final VText get_say_hi() {
        VText vText = this._say_hi;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_say_hi");
        return null;
    }

    @NotNull
    public final LinearLayout get_text_layout() {
        LinearLayout linearLayout = this._text_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_text_layout");
        return null;
    }

    public final void init() {
        removeAllViews();
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(getContext());
        layoutInflaterM163037a.getClass();
        m42067k0(layoutInflaterM163037a, this);
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final View m42067k0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM185716b = ssb0.m185716b(this, inflater, parent);
        viewM185716b.getClass();
        return viewM185716b;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m42068l0(User user, VText tv2) {
        StringBuilder sb = new StringBuilder();
        if (NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.zodiac)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(i0g0.m133869j0(user.profile.zodiac));
        }
        if (user.age.intValue() > 0 && !CoreModule.f17545c.f19561E0.m203803z3(user)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            Integer num = user.age;
            num.getClass();
            sb.append(num.intValue());
            sb.append("岁");
        }
        xdl0.m208335H0(tv2, sb.toString());
    }

    /* JADX INFO: renamed from: m0 */
    public final void m42069m0(@NotNull User user, @NotNull final d30 click, @NotNull final d30 close) {
        user.getClass();
        click.getClass();
        close.getClass();
        qib0.f154691G.m102331L0(get_profile_user(), user.m60124fp().profileMiddle().formatted());
        xdl0.m208335H0(get_name(), user.name);
        m42068l0(user, get_age());
        get_green().setTypeface(Typeface.DEFAULT_BOLD);
        if (jjb0.m141784b()) {
            get_name().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            qib0.f154713b0.f139231b.showUserVerificationLogo(getContext(), user, get_avatar_icon());
        } else if (user.isIdAndPicBothVerified()) {
            get_name().setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.f189805Up, 0);
        } else if (user.isPicVerificationVerified()) {
            get_name().setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.f189654Pt, 0);
        } else {
            get_name().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        get_say_hi().setText((user.isFemale() ? "她" : "他").concat("在等你聊天..."));
        get_gotochat().setText("免费和" + (user.isFemale() ? "她" : "他") + "聊");
        setOnClickListener(new View.OnClickListener() { // from class: l.psb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatAudioNewUiHeaderUserPeiLiaoView.m42064h0(click, view);
            }
        });
        get_gotochat().setOnClickListener(new View.OnClickListener() { // from class: l.qsb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatAudioNewUiHeaderUserPeiLiaoView.m42066j0(click, view);
            }
        });
        get_close().setOnClickListener(new View.OnClickListener() { // from class: l.rsb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatAudioNewUiHeaderUserPeiLiaoView.m42065i0(close, view);
            }
        });
    }

    public final void set_age(@NotNull VText vText) {
        vText.getClass();
        this._age = vText;
    }

    public final void set_avatar_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._avatar_icon = vImage;
    }

    public final void set_avatar_layout(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._avatar_layout = vFrame;
    }

    public final void set_close(@NotNull VImage vImage) {
        vImage.getClass();
        this._close = vImage;
    }

    public final void set_gotochat(@NotNull VText vText) {
        vText.getClass();
        this._gotochat = vText;
    }

    public final void set_green(@NotNull VText vText) {
        vText.getClass();
        this._green = vText;
    }

    public final void set_img_icon(@NotNull ImageView imageView) {
        imageView.getClass();
        this._img_icon = imageView;
    }

    public final void set_mark(@NotNull TextView textView) {
        textView.getClass();
        this._mark = textView;
    }

    public final void set_name(@NotNull VText vText) {
        vText.getClass();
        this._name = vText;
    }

    public final void set_profile_user(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._profile_user = vDraweeView;
    }

    public final void set_say_hi(@NotNull VText vText) {
        vText.getClass();
        this._say_hi = vText;
    }

    public final void set_text_layout(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._text_layout = linearLayout;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatAudioNewUiHeaderUserPeiLiaoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatAudioNewUiHeaderUserPeiLiaoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatAudioNewUiHeaderUserPeiLiaoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
