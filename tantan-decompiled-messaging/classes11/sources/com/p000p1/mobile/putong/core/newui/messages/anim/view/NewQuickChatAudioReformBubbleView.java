package com.p000p1.mobile.putong.core.newui.messages.anim.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.NewQuickChatAudioReformBubbleView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchMatchUser;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.User;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.c940;
import l.e30;
import l.f30;
import l.qib0;
import l.x2c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.dtb0;
import p009l.o7r;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 JW\u0010-\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000f0)2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0+H\u0016¢\u0006\u0004\b-\u0010.R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010J\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u00101\u001a\u0004\bH\u00103\"\u0004\bI\u00105R\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010^\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u00109\u001a\u0004\b\\\u0010;\"\u0004\b]\u0010=R\"\u0010b\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u00109\u001a\u0004\b`\u0010;\"\u0004\ba\u0010=R\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006g"}, d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioReformBubbleView;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioBaseHeaderUserView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "r0", "(Lcom/p1/mobile/putong/data/User;)V", "", "friendPurpose", "s0", "(Ljava/lang/String;)V", "q0", "p0", "(Lcom/p1/mobile/putong/data/User;)Ljava/lang/String;", "Lcom/p1/mobile/putong/data/Location;", "location", "o0", "(Lcom/p1/mobile/putong/data/Location;)Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "n0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;", "onlineMatchPushUser", "", "isMatch", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;", "matchUser", "Ll/f30;", "click", "Ll/e30;", "close", "j0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;ZLcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;Ll/f30;Ll/e30;)V", "Lv/VDraweeView;", "f", "Lv/VDraweeView;", "get_bg", "()Lv/VDraweeView;", "set_bg", "(Lv/VDraweeView;)V", "_bg", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "get_mark", "()Landroid/widget/TextView;", "set_mark", "(Landroid/widget/TextView;)V", "_mark", "Lv/VImage;", "h", "Lv/VImage;", "get_close", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "i", "get_profile_user", "set_profile_user", "_profile_user", "Lv/VText;", "j", "Lv/VText;", "get_name_age_info", "()Lv/VText;", "set_name_age_info", "(Lv/VText;)V", "_name_age_info", "Landroid/widget/ImageView;", "k", "Landroid/widget/ImageView;", "get_quick_chat_pop_icon", "()Landroid/widget/ImageView;", "set_quick_chat_pop_icon", "(Landroid/widget/ImageView;)V", "_quick_chat_pop_icon", "l", "get_quick_chat_pop_info", "set_quick_chat_pop_info", "_quick_chat_pop_info", "m", "get_gotochat", "set_gotochat", "_gotochat", "Ljava/text/DecimalFormat;", "n", "Ljava/text/DecimalFormat;", "floatFormat", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewQuickChatAudioReformBubbleView extends QuickChatAudioBaseHeaderUserView {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VDraweeView _bg;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _mark;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VDraweeView _profile_user;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _name_age_info;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public ImageView _quick_chat_pop_icon;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public TextView _quick_chat_pop_info;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public TextView _gotochat;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final DecimalFormat floatFormat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public NewQuickChatAudioReformBubbleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterM19649a = o7r.m19649a(getContext());
        layoutInflaterM19649a.getClass();
        m6146n0(layoutInflaterM19649a, this);
        this.floatFormat = new DecimalFormat("#.0");
    }

    /* JADX INFO: renamed from: k0 */
    public static void m6142k0(f30 f30Var, boolean z, View view) {
        f30Var.call(Boolean.valueOf(z), "");
    }

    /* JADX INFO: renamed from: l0 */
    public static void m6143l0(f30 f30Var, boolean z, View view) {
        f30Var.call(Boolean.valueOf(z), "");
    }

    /* JADX INFO: renamed from: m0 */
    public static void m6144m0(e30 e30Var, boolean z, View view) {
        e30Var.call(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: o0 */
    private final String m6145o0(Location location) {
        int i;
        if (location == null || (i = location.distance) <= 0 || i < 1000) {
            return "1km";
        }
        return this.floatFormat.format(Float.valueOf(i / 1000.0f)) + "km";
    }

    @NotNull
    public final VDraweeView get_bg() {
        VDraweeView vDraweeView = this._bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_bg");
        return null;
    }

    @NotNull
    public final VImage get_close() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    public final TextView get_gotochat() {
        TextView textView = this._gotochat;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_gotochat");
        return null;
    }

    @NotNull
    public final TextView get_mark() {
        TextView textView = this._mark;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_mark");
        return null;
    }

    @NotNull
    public final VText get_name_age_info() {
        VText vText = this._name_age_info;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_name_age_info");
        return null;
    }

    @NotNull
    public final VDraweeView get_profile_user() {
        VDraweeView vDraweeView = this._profile_user;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_profile_user");
        return null;
    }

    @NotNull
    public final ImageView get_quick_chat_pop_icon() {
        ImageView imageView = this._quick_chat_pop_icon;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_quick_chat_pop_icon");
        return null;
    }

    @NotNull
    public final TextView get_quick_chat_pop_info() {
        TextView textView = this._quick_chat_pop_info;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_quick_chat_pop_info");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioBaseHeaderUserView
    /* JADX INFO: renamed from: j0 */
    public void mo6140j0(@Nullable Act act, @Nullable OnlineMatchPushUser onlineMatchPushUser, final boolean isMatch, @Nullable OnlineMatchMatchUser matchUser, @NotNull final f30<Boolean, String> click, @NotNull final e30<Boolean> close) {
        User user;
        click.getClass();
        close.getClass();
        if (isMatch) {
            if (matchUser != null) {
                user = matchUser.user;
            } else {
                user = null;
            }
        } else if (onlineMatchPushUser != null) {
            user = onlineMatchPushUser.user;
        } else {
            user = null;
        }
        if (user == null) {
            return;
        }
        qib0.G.O(get_profile_user(), user.fp().profileSmall().formatted(), 4, user.isFemale() ? 4 : 8);
        get_name_age_info().setText(m6147p0(user));
        String str = onlineMatchPushUser != null ? onlineMatchPushUser.fitReason : null;
        if (Intrinsics.d(str, "distance")) {
            m6149r0(user);
        } else if (Intrinsics.d(str, "friendPurpose")) {
            m6150s0(onlineMatchPushUser.friendPurpose);
        } else {
            m6148q0(user);
        }
        get_gotochat().setText("立即和" + (user.isFemale() ? "她" : "他") + "聊");
        setOnClickListener(new View.OnClickListener() { // from class: l.z840
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewQuickChatAudioReformBubbleView.m6143l0(click, isMatch, view);
            }
        });
        get_gotochat().setOnClickListener(new View.OnClickListener() { // from class: l.a940
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewQuickChatAudioReformBubbleView.m6142k0(click, isMatch, view);
            }
        });
        get_close().setOnClickListener(new View.OnClickListener() { // from class: l.b940
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewQuickChatAudioReformBubbleView.m6144m0(close, isMatch, view);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final View m6146n0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = c940.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: p0 */
    public final String m6147p0(User user) {
        int length = user.name.length();
        String str = user.name;
        if (length <= 15) {
            return str + "·" + user.age;
        }
        str.getClass();
        return str.substring(0, 15) + "...·" + user.age;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m6148q0(User user) {
        get_quick_chat_pop_icon().setImageResource(x2c0.bo);
        get_quick_chat_pop_info().setText("附近的" + (user.isFemale() ? "她" : "他") + "刚发来一条消息");
    }

    /* JADX INFO: renamed from: r0 */
    public final void m6149r0(User user) {
        get_quick_chat_pop_icon().setImageResource(x2c0.co);
        get_quick_chat_pop_info().setText("与你相距" + m6145o0(user.location));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m6150s0(String friendPurpose) {
        get_quick_chat_pop_icon().setImageResource(x2c0.eo);
        get_quick_chat_pop_info().setText(dtb0.INSTANCE.m13473a(friendPurpose));
    }

    public final void set_bg(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._bg = vDraweeView;
    }

    public final void set_close(@NotNull VImage vImage) {
        vImage.getClass();
        this._close = vImage;
    }

    public final void set_gotochat(@NotNull TextView textView) {
        textView.getClass();
        this._gotochat = textView;
    }

    public final void set_mark(@NotNull TextView textView) {
        textView.getClass();
        this._mark = textView;
    }

    public final void set_name_age_info(@NotNull VText vText) {
        vText.getClass();
        this._name_age_info = vText;
    }

    public final void set_profile_user(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._profile_user = vDraweeView;
    }

    public final void set_quick_chat_pop_icon(@NotNull ImageView imageView) {
        imageView.getClass();
        this._quick_chat_pop_icon = imageView;
    }

    public final void set_quick_chat_pop_info(@NotNull TextView textView) {
        textView.getClass();
        this._quick_chat_pop_info = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewQuickChatAudioReformBubbleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewQuickChatAudioReformBubbleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ NewQuickChatAudioReformBubbleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
