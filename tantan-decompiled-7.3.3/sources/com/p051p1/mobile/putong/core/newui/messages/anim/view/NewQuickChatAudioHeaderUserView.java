package com.p051p1.mobile.putong.core.newui.messages.anim.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.NewQuickChatAudioHeaderUserView;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchMatchUser;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.ah40;
import p153l.bnl0;
import p153l.dbc0;
import p153l.nrb0;
import p153l.p9r;
import p153l.tv50;
import p153l.upm;
import p153l.uqb0;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010D\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u00103\u001a\u0004\bB\u00105\"\u0004\bC\u00107R\"\u0010H\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u00103\u001a\u0004\bF\u00105\"\u0004\bG\u00107R\"\u0010L\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u00103\u001a\u0004\bJ\u00105\"\u0004\bK\u00107R\"\u0010P\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010;\u001a\u0004\bN\u0010=\"\u0004\bO\u0010?R\"\u0010X\u001a\u00020Q8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Y"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeaderUserView;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatAudioBaseHeaderUserView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "n0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;", "onlineMatchPushUser", "", "isMatch", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;", "matchUser", "Ll/z20;", "", "click", "Ll/y20;", "close", "", "j0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;ZLcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchMatchUser;Ll/z20;Ll/y20;)V", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "get_mark", "()Landroid/widget/TextView;", "set_mark", "(Landroid/widget/TextView;)V", "_mark", "Lv/VDraweeView;", "g", "Lv/VDraweeView;", "get_profile_user", "()Lv/VDraweeView;", "set_profile_user", "(Lv/VDraweeView;)V", "_profile_user", "Lv/VText;", "h", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", "Lv/VImage;", RXScreenCaptureService.KEY_INDEX, "Lv/VImage;", "get_avatar_icon", "()Lv/VImage;", "set_avatar_icon", "(Lv/VImage;)V", "_avatar_icon", "j", "get_age", "set_age", "_age", "k", "get_say_hi", "set_say_hi", "_say_hi", BLiveStormDanmakuGiftResourceType.f45292l, "get_gotochat", "set_gotochat", "_gotochat", "m", "get_close", "set_close", "_close", "", "n", "J", "getBroadcastTextTimerValue", "()J", "setBroadcastTextTimerValue", "(J)V", "broadcastTextTimerValue", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class NewQuickChatAudioHeaderUserView extends QuickChatAudioBaseHeaderUserView {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _mark;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VDraweeView _profile_user;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VImage _avatar_icon;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _age;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _say_hi;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VText _gotochat;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public long broadcastTextTimerValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewQuickChatAudioHeaderUserView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getContext());
        layoutInflaterM171370a.getClass();
        m43010n0(layoutInflaterM171370a, this);
        this.broadcastTextTimerValue = -1L;
    }

    /* JADX INFO: renamed from: k0 */
    public static void m43006k0(z20 z20Var, boolean z, View view) {
        z20Var.call(Boolean.valueOf(z), "");
    }

    /* JADX INFO: renamed from: l0 */
    public static void m43007l0(y20 y20Var, boolean z, View view) {
        y20Var.call(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: m0 */
    public static void m43008m0(z20 z20Var, boolean z, View view) {
        z20Var.call(Boolean.valueOf(z), "");
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioBaseHeaderUserView
    public long getBroadcastTextTimerValue() {
        return this.broadcastTextTimerValue;
    }

    @NotNull
    public final VText get_age() {
        VText vText = this._age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_age");
        return null;
    }

    @NotNull
    public final VImage get_avatar_icon() {
        VImage vImage = this._avatar_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_avatar_icon");
        return null;
    }

    @NotNull
    public final VImage get_close() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    public final VText get_gotochat() {
        VText vText = this._gotochat;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_gotochat");
        return null;
    }

    @NotNull
    public final TextView get_mark() {
        TextView textView = this._mark;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_mark");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_name");
        return null;
    }

    @NotNull
    public final VDraweeView get_profile_user() {
        VDraweeView vDraweeView = this._profile_user;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_profile_user");
        return null;
    }

    @NotNull
    public final VText get_say_hi() {
        VText vText = this._say_hi;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_say_hi");
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioBaseHeaderUserView
    /* JADX INFO: renamed from: j0 */
    public void mo43009j0(@Nullable Act act, @Nullable OnlineMatchPushUser onlineMatchPushUser, final boolean isMatch, @Nullable OnlineMatchMatchUser matchUser, @NotNull final z20<Boolean, String> click, @NotNull final y20<Boolean> close) {
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
        uqb0.f180374G.m127120O(get_profile_user(), user.m61308fp().profileSmall().formatted(), 4, user.isFemale() ? 4 : 8);
        bnl0.m105515H0(get_name(), user.name);
        upm.m197135c0(user, get_age());
        if (nrb0.m164466b()) {
            get_name().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            uqb0.f180396b0.f170325b.showUserVerificationLogo(getContext(), user, get_avatar_icon());
        } else if (user.isIdAndPicBothVerified()) {
            get_name().setCompoundDrawablesWithIntrinsicBounds(0, 0, dbc0.f86259Iq, 0);
        } else if (user.isPicVerificationVerified()) {
            get_name().setCompoundDrawablesWithIntrinsicBounds(0, 0, dbc0.f86103Du, 0);
        } else {
            get_name().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        get_say_hi().setText(tv50.INSTANCE.m192776a(user));
        get_gotochat().setText("和" + (user.isFemale() ? "她" : "他") + "聊聊");
        setOnClickListener(new View.OnClickListener() { // from class: l.xg40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewQuickChatAudioHeaderUserView.m43008m0(click, isMatch, view);
            }
        });
        get_gotochat().setOnClickListener(new View.OnClickListener() { // from class: l.yg40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewQuickChatAudioHeaderUserView.m43006k0(click, isMatch, view);
            }
        });
        get_close().setOnClickListener(new View.OnClickListener() { // from class: l.zg40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewQuickChatAudioHeaderUserView.m43007l0(close, isMatch, view);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final View m43010n0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM97785b = ah40.m97785b(this, inflater, parent);
        viewM97785b.getClass();
        return viewM97785b;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioBaseHeaderUserView
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

    public final void set_close(@NotNull VImage vImage) {
        vImage.getClass();
        this._close = vImage;
    }

    public final void set_gotochat(@NotNull VText vText) {
        vText.getClass();
        this._gotochat = vText;
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewQuickChatAudioHeaderUserView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewQuickChatAudioHeaderUserView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ NewQuickChatAudioHeaderUserView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
