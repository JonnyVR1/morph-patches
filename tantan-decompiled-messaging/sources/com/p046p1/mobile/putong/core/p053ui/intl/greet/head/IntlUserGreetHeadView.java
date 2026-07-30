package com.p046p1.mobile.putong.core.p053ui.intl.greet.head;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.head.IntlUserGreetHeadView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.bkb0;
import p149l.c3c0;
import p149l.dtl;
import p149l.lkp;
import p149l.qib0;
import p149l.rw6;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010%R\"\u0010+\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010B\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006Q"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/intl/greet/head/IntlUserGreetHeadView;", "Lv/VLinear;", "Ll/dtl;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnAvatarClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/view/View;", "outAvatar", "Lv/VImage;", "outIcon", "Lv/VText;", "outName", "scrollY", "b", "(Landroid/view/View;Lv/VImage;Lv/VText;I)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "isAnonymous", "c", "(Lcom/p1/mobile/putong/data/User;Z)V", OMSTemplateModeType.view, "R", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/ui/intl/greet/head/IntlUserGreetHeadView;", "get_root", "()Lcom/p1/mobile/putong/core/ui/intl/greet/head/IntlUserGreetHeadView;", "set_root", "(Lcom/p1/mobile/putong/core/ui/intl/greet/head/IntlUserGreetHeadView;)V", "_root", "Lv/VFrame;", Constants.INAPP_DATA_TAG, "Lv/VFrame;", "get_avatar_container", "()Lv/VFrame;", "set_avatar_container", "(Lv/VFrame;)V", "_avatar_container", "Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "e", "Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "get_avatar_wrapper", "()Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;", "set_avatar_wrapper", "(Lcom/p1/mobile/putong/ui/headframe/HeaderFrameWrapper;)V", "_avatar_wrapper", "f", "Lv/VImage;", "get_hand_ic", "()Lv/VImage;", "set_hand_ic", "(Lv/VImage;)V", "_hand_ic", "g", "Lv/VText;", "get_username", "()Lv/VText;", "set_username", "(Lv/VText;)V", "_username", "Lv/VDraweeView;", "h", "Lv/VDraweeView;", "_avatar", RXScreenCaptureService.KEY_INDEX, "Landroid/view/View$OnClickListener;", "avatarClickListener", "message_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class IntlUserGreetHeadView extends VLinear implements dtl {

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
    public static void m46151P(IntlUserGreetHeadView intlUserGreetHeadView, View view) {
        if (NullChecker.m81303a(intlUserGreetHeadView.avatarClickListener)) {
            View.OnClickListener onClickListener = intlUserGreetHeadView.avatarClickListener;
            onClickListener.getClass();
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m46152Q(IntlUserGreetHeadView intlUserGreetHeadView, View view) {
        if (NullChecker.m81303a(intlUserGreetHeadView.avatarClickListener)) {
            View.OnClickListener onClickListener = intlUserGreetHeadView.avatarClickListener;
            onClickListener.getClass();
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m46153R(View view) {
        lkp.m150378a(this, view);
    }

    @Override // p149l.dtl
    /* JADX INFO: renamed from: b */
    public void mo46154b(@NotNull View outAvatar, @NotNull VImage outIcon, @NotNull VText outName, int scrollY) {
        outAvatar.getClass();
        outIcon.getClass();
        outName.getClass();
        int i = t100.f167271t;
        float fMax = Math.max(1.0f - ((scrollY * 1.0f) / i), 0.0f);
        float fMin = Math.min(Math.max(((scrollY - i) * 1.0f) / i, 0.0f), 1.0f);
        outAvatar.setAlpha(fMin);
        outName.setAlpha(fMin);
        get_avatar_wrapper().setAlpha(fMax);
        get_username().setAlpha(fMax);
        outIcon.setAlpha(fMin);
        get_hand_ic().setAlpha(fMax);
    }

    @Override // p149l.dtl
    /* JADX INFO: renamed from: c */
    public void mo46155c(@NotNull User user, boolean isAnonymous) {
        user.getClass();
        xdl0.m208344M(get_avatar_container(), true);
        xdl0.m208344M(get_username(), true);
        xdl0.m208344M(get_hand_ic(), true);
        if (isAnonymous) {
            bkb0 bkb0Var = qib0.f154691G;
            VDraweeView vDraweeView = this._avatar;
            String anonymousUrl = user.getAnonymousUrl();
            int i = t100.f167236K;
            bkb0Var.m102325I0(vDraweeView, anonymousUrl, i, i);
            get_avatar_wrapper().m79695G0(false);
        } else {
            qib0.f154691G.m102327J0(this._avatar, rw6.m181386b(user).profileSize(80), false);
            get_avatar_wrapper().m79702n0(user);
        }
        get_username().setText(user.name);
    }

    @NotNull
    public final VFrame get_avatar_container() {
        VFrame vFrame = this._avatar_container;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_avatar_container");
        return null;
    }

    @NotNull
    public final HeaderFrameWrapper get_avatar_wrapper() {
        HeaderFrameWrapper headerFrameWrapper = this._avatar_wrapper;
        if (headerFrameWrapper != null) {
            return headerFrameWrapper;
        }
        Intrinsics.m87502r("_avatar_wrapper");
        return null;
    }

    @NotNull
    public final VImage get_hand_ic() {
        VImage vImage = this._hand_ic;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_hand_ic");
        return null;
    }

    @NotNull
    public final IntlUserGreetHeadView get_root() {
        IntlUserGreetHeadView intlUserGreetHeadView = this._root;
        if (intlUserGreetHeadView != null) {
            return intlUserGreetHeadView;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    public final VText get_username() {
        VText vText = this._username;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_username");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46153R(this);
        this._avatar = get_avatar_wrapper().get_pic();
        xdl0.m208329E0(get_avatar_container(), new View.OnClickListener() { // from class: l.jkp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlUserGreetHeadView.m46152Q(this.f118402a, view);
            }
        });
        xdl0.m208329E0(get_username(), new View.OnClickListener() { // from class: l.kkp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlUserGreetHeadView.m46151P(this.f123581a, view);
            }
        });
        if (NullChecker.m81303a(get_hand_ic())) {
            get_hand_ic().setImageResource(c3c0.f78653V0);
        }
    }

    @Override // p149l.dtl
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
