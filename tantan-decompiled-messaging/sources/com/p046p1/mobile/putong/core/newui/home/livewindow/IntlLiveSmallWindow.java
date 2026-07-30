package com.p046p1.mobile.putong.core.newui.home.livewindow;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.livewindow.IntlLiveSmallWindow;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VTexturePlayer;
import p149l.d30;
import p149l.lzn;
import p149l.qib0;
import p149l.ttn;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010 \u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010\u001dJ\u000f\u0010#\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\u001dJ\u000f\u0010$\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\u001dJ\u000f\u0010&\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010\u001dJ\u000f\u0010'\u001a\u00020\u000fH\u0016¢\u0006\u0004\b'\u0010\u001dJ\u000f\u0010(\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u001dJ\u001f\u0010+\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000fH\u0014¢\u0006\u0004\b-\u0010\u001dR\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010BR\u0014\u0010F\u001a\u00020D8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010E¨\u0006G"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/home/livewindow/IntlLiveSmallWindow;", "Landroid/widget/FrameLayout;", "Lv/VTexturePlayer$b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "c", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/data/User;", "user", "Lcom/p1/mobile/putong/data/Live;", "live", "g", "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/data/Live;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "f", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;)V", "onFinishInflate", "()V", "Ll/d30;", "action", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/data/Live;Ll/d30;)V", "e", BaseSei.f13931Y, "h", Constants.INAPP_DATA_TAG, "onResume", "onComplete", "onPause", "what", "extra", "onError", "(II)V", "onDetachedFromWindow", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", "get_close", "()Landroid/widget/ImageView;", "set_close", "(Landroid/widget/ImageView;)V", "_close", "Lcom/p1/mobile/putong/data/Media;", "Lcom/p1/mobile/putong/data/Media;", "media", "Lv/VTexturePlayer;", "Lv/VTexturePlayer;", "_texture", "", "Ljava/lang/String;", "TAG", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class IntlLiveSmallWindow extends FrameLayout implements VTexturePlayer.InterfaceC22583b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ImageView _close;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public Media media;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VTexturePlayer _texture;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlLiveSmallWindow(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.TAG = "IntlLiveSmallWindow";
    }

    /* JADX INFO: renamed from: a */
    public static void m38733a(IntlLiveSmallWindow intlLiveSmallWindow, Act act, User user, View view) {
        intlLiveSmallWindow.m38737f(act, user);
    }

    /* JADX INFO: renamed from: b */
    public static void m38734b(d30 d30Var, View view) {
        d30Var.call();
    }

    /* JADX INFO: renamed from: c */
    public final void m38735c(View view) {
        lzn.m152351a(this, view);
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: d */
    public void mo36116d() {
    }

    /* JADX INFO: renamed from: e */
    public final void m38736e() {
        VTexturePlayer vTexturePlayer = this._texture;
        if (vTexturePlayer != null) {
            if (vTexturePlayer == null) {
                Intrinsics.m87502r("_texture");
                vTexturePlayer = null;
            }
            vTexturePlayer.m223299j();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m38737f(Act act, User user) {
        zvf0.m220396r("e_intl_swipe_live_small", "p_suggest_users_home_view");
        try {
            CoreModule.m29936Q().startAudienceLive(act, CoreModule.m29936Q().getUserLiveId(user.f56011id), "suggest-card", null);
            ttn.m190607a("p_suggest_users_home_view", user);
            CoreModule.f17545c.f19663m0.m31093d8(user.f56011id);
            CoreModule.f17545c.f19663m0.f19414g2.onNext(SwipeDirection.RIGHT);
        } catch (Exception e) {
            e.toString();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m38738g(User user, Live live) {
        String str;
        if ((live != null ? live.coverPicUrl : null) != null) {
            Media media = live.coverPicUrl;
            media.getClass();
            str = media.url;
        } else {
            str = (vwb.m200296J(user.pictures) || !NullChecker.m81303a(user.picture(0).cover())) ? "" : user.picture(0).cover().url;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        qib0.f154691G.m102331L0(get_image(), str);
    }

    @NotNull
    public final ImageView get_close() {
        ImageView imageView = this._close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    public final VDraweeView get_image() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_image");
        return null;
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: h */
    public void mo36117h() {
    }

    /* JADX INFO: renamed from: i */
    public final void m38739i(@NotNull final Act act, @NotNull final User user, @NotNull Live live, @NotNull final d30 action) {
        act.getClass();
        user.getClass();
        live.getClass();
        action.getClass();
        Media media = live.videoCapture;
        media.getClass();
        this.media = media;
        if (NullChecker.m81303a(user)) {
            xdl0.m208329E0(get_close(), new View.OnClickListener() { // from class: l.jzn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntlLiveSmallWindow.m38734b(action, view);
                }
            });
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.kzn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntlLiveSmallWindow.m38733a(this.f125396a, act, user, view);
                }
            });
        }
        zvf0.m220402x("e_intl_swipe_live_small", "p_suggest_users_home_view");
        m38738g(user, live);
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onComplete() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m38736e();
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onError(int what, int extra) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38735c(this);
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onPause() {
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onResume() {
    }

    public final void set_close(@NotNull ImageView imageView) {
        imageView.getClass();
        this._close = imageView;
    }

    public final void set_image(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image = vDraweeView;
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: y */
    public void mo36127y() {
        VTexturePlayer vTexturePlayer = this._texture;
        VTexturePlayer vTexturePlayer2 = null;
        if (vTexturePlayer == null) {
            Intrinsics.m87502r("_texture");
            vTexturePlayer = null;
        }
        vTexturePlayer.setVisibility(0);
        VTexturePlayer vTexturePlayer3 = this._texture;
        if (vTexturePlayer3 == null) {
            Intrinsics.m87502r("_texture");
            vTexturePlayer3 = null;
        }
        vTexturePlayer3.setVolume(true);
        VTexturePlayer vTexturePlayer4 = this._texture;
        if (vTexturePlayer4 == null) {
            Intrinsics.m87502r("_texture");
        } else {
            vTexturePlayer2 = vTexturePlayer4;
        }
        vTexturePlayer2.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlLiveSmallWindow(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlLiveSmallWindow(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
