package com.p051p1.mobile.putong.core.p058ui.intl.greet.head;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.head.IntlUserGreetHeadView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.fsb0;
import p153l.ibc0;
import p153l.lmp;
import p153l.qa00;
import p153l.rvl;
import p153l.uqb0;
import p153l.ux6;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010%R\"\u0010+\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010B\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006Q"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/intl/greet/head/IntlUserGreetHeadView;", "Lv/VLinear;", "Ll/rvl;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnAvatarClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/view/View;", "outAvatar", "Lv/VImage;", "outIcon", "Lv/VText;", "outName", "scrollY", "b", "(Landroid/view/View;Lv/VImage;Lv/VText;I)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "isAnonymous", "c", "(Lcom/p1/mobile/putong/data/User;Z)V", OMSTemplateModeType.view, "R", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/ui/intl/greet/head/IntlUserGreetHeadView;", "get_root", "()Lcom/p1/mobile/putong/core/ui/intl/greet/head/IntlUserGreetHeadView;", "set_root", "(Lcom/p1/mobile/putong/core/ui/intl/greet/head/IntlUserGreetHeadView;)V", "_root", "Lv/VFrame;", Constants.INAPP_DATA_TAG, "Lv/VFrame;", "get_avatar_container", "()Lv/VFrame;", "set_avatar_container", "(Lv/VFrame;)V", "_avatar_container", "Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "e", "Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "get_avatar_wrapper", "()Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "set_avatar_wrapper", "(Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;)V", "_avatar_wrapper", "f", "Lv/VImage;", "get_hand_ic", "()Lv/VImage;", "set_hand_ic", "(Lv/VImage;)V", "_hand_ic", "g", "Lv/VText;", "get_username", "()Lv/VText;", "set_username", "(Lv/VText;)V", "_username", "Lv/VDraweeView;", "h", "Lv/VDraweeView;", "_avatar", RXScreenCaptureService.KEY_INDEX, "Landroid/view/View$OnClickListener;", "avatarClickListener", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlUserGreetHeadView extends VLinear implements rvl {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public IntlUserGreetHeadView _root;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VFrame _avatar_container;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public HeaderFrameWrapper _avatar_wrapper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _hand_ic;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _username;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public VDraweeView _avatar;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public View.OnClickListener avatarClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlUserGreetHeadView(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: renamed from: P */
    public static void m47334P(IntlUserGreetHeadView intlUserGreetHeadView, View view) {
        if (NullChecker.m82486a(intlUserGreetHeadView.avatarClickListener)) {
            View.OnClickListener onClickListener = intlUserGreetHeadView.avatarClickListener;
            onClickListener.getClass();
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m47335Q(IntlUserGreetHeadView intlUserGreetHeadView, View view) {
        if (NullChecker.m82486a(intlUserGreetHeadView.avatarClickListener)) {
            View.OnClickListener onClickListener = intlUserGreetHeadView.avatarClickListener;
            onClickListener.getClass();
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m47336R(View view) {
        lmp.m154877a(this, view);
    }

    @Override // p153l.rvl
    /* JADX INFO: renamed from: b */
    public void mo47337b(@NotNull View outAvatar, @NotNull VImage outIcon, @NotNull VText outName, int scrollY) {
        outAvatar.getClass();
        outIcon.getClass();
        outName.getClass();
        int i = qa00.f156333t;
        float fMax = Math.max(1.0f - ((scrollY * 1.0f) / i), 0.0f);
        float fMin = Math.min(Math.max(((scrollY - i) * 1.0f) / i, 0.0f), 1.0f);
        outAvatar.setAlpha(fMin);
        outName.setAlpha(fMin);
        get_avatar_wrapper().setAlpha(fMax);
        get_username().setAlpha(fMax);
        outIcon.setAlpha(fMin);
        get_hand_ic().setAlpha(fMax);
    }

    @Override // p153l.rvl
    /* JADX INFO: renamed from: c */
    public void mo47338c(@NotNull User user, boolean isAnonymous) {
        user.getClass();
        bnl0.m105524M(get_avatar_container(), true);
        bnl0.m105524M(get_username(), true);
        bnl0.m105524M(get_hand_ic(), true);
        if (isAnonymous) {
            fsb0 fsb0Var = uqb0.f180374G;
            VDraweeView vDraweeView = this._avatar;
            String anonymousUrl = user.getAnonymousUrl();
            int i = qa00.f156298K;
            fsb0Var.m127109I0(vDraweeView, anonymousUrl, i, i);
            get_avatar_wrapper().m80878G0(false);
        } else {
            uqb0.f180374G.m127111J0(this._avatar, ux6.m198404b(user).profileSize(80), false);
            get_avatar_wrapper().m80885n0(user);
        }
        get_username().setText(user.name);
    }

    @NotNull
    public final VFrame get_avatar_container() {
        VFrame vFrame = this._avatar_container;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_avatar_container");
        return null;
    }

    @NotNull
    public final HeaderFrameWrapper get_avatar_wrapper() {
        HeaderFrameWrapper headerFrameWrapper = this._avatar_wrapper;
        if (headerFrameWrapper != null) {
            return headerFrameWrapper;
        }
        Intrinsics.m88391r("_avatar_wrapper");
        return null;
    }

    @NotNull
    public final VImage get_hand_ic() {
        VImage vImage = this._hand_ic;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_hand_ic");
        return null;
    }

    @NotNull
    public final IntlUserGreetHeadView get_root() {
        IntlUserGreetHeadView intlUserGreetHeadView = this._root;
        if (intlUserGreetHeadView != null) {
            return intlUserGreetHeadView;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    public final VText get_username() {
        VText vText = this._username;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_username");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47336R(this);
        this._avatar = get_avatar_wrapper().get_pic();
        bnl0.m105509E0(get_avatar_container(), new View.OnClickListener() { // from class: l.jmp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlUserGreetHeadView.m47335Q(this.f121693a, view);
            }
        });
        bnl0.m105509E0(get_username(), new View.OnClickListener() { // from class: l.kmp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlUserGreetHeadView.m47334P(this.f127526a, view);
            }
        });
        if (NullChecker.m82486a(get_hand_ic())) {
            get_hand_ic().setImageResource(ibc0.f113928V0);
        }
    }

    @Override // p153l.rvl
    public void setOnAvatarClickListener(@Nullable View.OnClickListener listener) {
        this.avatarClickListener = listener;
    }

    public final void set_avatar_container(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._avatar_container = vFrame;
    }

    public final void set_avatar_wrapper(@NotNull HeaderFrameWrapper headerFrameWrapper) {
        headerFrameWrapper.getClass();
        this._avatar_wrapper = headerFrameWrapper;
    }

    public final void set_hand_ic(@NotNull VImage vImage) {
        vImage.getClass();
        this._hand_ic = vImage;
    }

    public final void set_root(@NotNull IntlUserGreetHeadView intlUserGreetHeadView) {
        intlUserGreetHeadView.getClass();
        this._root = intlUserGreetHeadView;
    }

    public final void set_username(@NotNull VText vText) {
        vText.getClass();
        this._username = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlUserGreetHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlUserGreetHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
