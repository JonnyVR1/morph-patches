package com.p046p1.mobile.putong.core.newui.messages.anim.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioNewUiHeaderUserView;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchMatchUser;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
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
import p149l.e30;
import p149l.f30;
import p149l.jjb0;
import p149l.nn50;
import p149l.o7r;
import p149l.qib0;
import p149l.snm;
import p149l.wsb0;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0013JW\u0010#\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0!H\u0016¢\u0006\u0004\b#\u0010$R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010P\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010?\u001a\u0004\bN\u0010A\"\u0004\bO\u0010CR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010?\u001a\u0004\bZ\u0010A\"\u0004\b[\u0010CR\"\u0010`\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010CR\"\u0010d\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010S\u001a\u0004\bb\u0010U\"\u0004\bc\u0010WR\"\u0010h\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010?\u001a\u0004\bf\u0010A\"\u0004\bg\u0010CR\"\u0010p\u001a\u00020i8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o¨\u0006q"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioNewUiHeaderUserView;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioBaseHeaderUserView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "n0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "init", "()V", "i0", "h0", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;", "onlineMatchPushUser", "", "isMatch", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;", "matchUser", "Ll/f30;", "", "click", "Ll/e30;", "close", "j0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;ZLcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;Ll/f30;Ll/e30;)V", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "get_mark", "()Landroid/widget/TextView;", "set_mark", "(Landroid/widget/TextView;)V", "_mark", "Lv/VFrame;", "g", "Lv/VFrame;", "get_avatar_layout", "()Lv/VFrame;", "set_avatar_layout", "(Lv/VFrame;)V", "_avatar_layout", "Lv/VDraweeView;", "h", "Lv/VDraweeView;", "get_profile_user", "()Lv/VDraweeView;", "set_profile_user", "(Lv/VDraweeView;)V", "_profile_user", "Lv/VText;", RXScreenCaptureService.KEY_INDEX, "Lv/VText;", "get_green", "()Lv/VText;", "set_green", "(Lv/VText;)V", "_green", "Landroid/widget/LinearLayout;", "j", "Landroid/widget/LinearLayout;", "get_text_layout", "()Landroid/widget/LinearLayout;", "set_text_layout", "(Landroid/widget/LinearLayout;)V", "_text_layout", "k", "get_name", "set_name", "_name", "Lv/VImage;", BLiveStormDanmakuGiftResourceType.f44444l, "Lv/VImage;", "get_avatar_icon", "()Lv/VImage;", "set_avatar_icon", "(Lv/VImage;)V", "_avatar_icon", "m", "get_age", "set_age", "_age", "n", "get_say_hi", "set_say_hi", "_say_hi", "o", "get_close", "set_close", "_close", "p", "get_gotochat", "set_gotochat", "_gotochat", "", "q", "J", "getBroadcastTextTimerValue", "()J", "setBroadcastTextTimerValue", "(J)V", "broadcastTextTimerValue", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class QuickChatAudioNewUiHeaderUserView extends QuickChatAudioBaseHeaderUserView {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _mark;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VFrame _avatar_layout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VDraweeView _profile_user;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _green;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public LinearLayout _text_layout;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VImage _avatar_icon;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _age;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VText _say_hi;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VText _gotochat;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public long broadcastTextTimerValue;

    public /* synthetic */ QuickChatAudioNewUiHeaderUserView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m42070k0(f30 f30Var, boolean z, View view) {
        f30Var.call(Boolean.valueOf(z), "");
    }

    /* JADX INFO: renamed from: l0 */
    public static void m42071l0(f30 f30Var, boolean z, View view) {
        f30Var.call(Boolean.valueOf(z), "");
    }

    /* JADX INFO: renamed from: m0 */
    public static void m42072m0(e30 e30Var, boolean z, View view) {
        e30Var.call(Boolean.valueOf(z));
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioBaseHeaderUserView
    public long getBroadcastTextTimerValue() {
        return this.broadcastTextTimerValue;
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

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioBaseHeaderUserView
    /* JADX INFO: renamed from: h0 */
    public void mo42012h0() {
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioBaseHeaderUserView
    /* JADX INFO: renamed from: i0 */
    public void mo42013i0() {
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioBaseHeaderUserView
    public void init() {
        removeAllViews();
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(getContext());
        layoutInflaterM163037a.getClass();
        m42073n0(layoutInflaterM163037a, this);
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioBaseHeaderUserView
    /* JADX INFO: renamed from: j0 */
    public void mo41998j0(@Nullable Act act, @Nullable OnlineMatchPushUser onlineMatchPushUser, final boolean isMatch, @Nullable OnlineMatchMatchUser matchUser, @NotNull final f30<Boolean, String> click, @NotNull final e30<Boolean> close) {
        click.getClass();
        close.getClass();
        User user = null;
        if (isMatch) {
            if (matchUser != null) {
                user = matchUser.user;
            }
        } else if (onlineMatchPushUser != null) {
            user = onlineMatchPushUser.user;
        }
        if (user == null) {
            return;
        }
        qib0.f154691G.m102336O(get_profile_user(), user.m60124fp().profileSmall().formatted(), 4, user.isFemale() ? 4 : 8);
        xdl0.m208335H0(get_name(), user.name);
        snm.m185101c0(user, get_age());
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
        get_say_hi().setText(nn50.INSTANCE.m160194a(user));
        get_gotochat().setText("和" + (user.isFemale() ? "她" : "他") + "聊聊");
        setOnClickListener(new View.OnClickListener() { // from class: l.tsb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatAudioNewUiHeaderUserView.m42071l0(click, isMatch, view);
            }
        });
        get_gotochat().setOnClickListener(new View.OnClickListener() { // from class: l.usb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatAudioNewUiHeaderUserView.m42070k0(click, isMatch, view);
            }
        });
        get_close().setOnClickListener(new View.OnClickListener() { // from class: l.vsb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickChatAudioNewUiHeaderUserView.m42072m0(close, isMatch, view);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final View m42073n0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM205474b = wsb0.m205474b(this, inflater, parent);
        viewM205474b.getClass();
        return viewM205474b;
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioBaseHeaderUserView
    public void setBroadcastTextTimerValue(long j) {
        this.broadcastTextTimerValue = j;
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
    public QuickChatAudioNewUiHeaderUserView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatAudioNewUiHeaderUserView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.broadcastTextTimerValue = -1L;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatAudioNewUiHeaderUserView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
