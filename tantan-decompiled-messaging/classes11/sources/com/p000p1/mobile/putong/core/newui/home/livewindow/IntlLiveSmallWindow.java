package com.p000p1.mobile.putong.core.newui.home.livewindow;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p000p1.mobile.putong.core.newui.home.livewindow.IntlLiveSmallWindow;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.Live;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.lzn;
import l.qib0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.ttn;
import v.VDraweeView;
import v.VTexturePlayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010 \u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010\u001dJ\u000f\u0010#\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\u001dJ\u000f\u0010$\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\u001dJ\u000f\u0010&\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010\u001dJ\u000f\u0010'\u001a\u00020\u000fH\u0016¢\u0006\u0004\b'\u0010\u001dJ\u000f\u0010(\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u001dJ\u001f\u0010+\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000fH\u0014¢\u0006\u0004\b-\u0010\u001dR\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010BR\u0014\u0010F\u001a\u00020D8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010E¨\u0006G"}, d2 = {"Lcom/p1/mobile/putong/core/newui/home/livewindow/IntlLiveSmallWindow;", "Landroid/widget/FrameLayout;", "Lv/VTexturePlayer$b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "", "c", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/data/User;", "user", "Lcom/p1/mobile/putong/data/Live;", "live", "g", "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/data/Live;)V", "Lcom/p1/mobile/android/app/Act;", "act", "f", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;)V", "onFinishInflate", "()V", "Ll/d30;", "action", "i", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/data/Live;Ll/d30;)V", "e", "y", "h", "d", "onResume", "onComplete", "onPause", "what", "extra", "onError", "(II)V", "onDetachedFromWindow", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", "get_close", "()Landroid/widget/ImageView;", "set_close", "(Landroid/widget/ImageView;)V", "_close", "Lcom/p1/mobile/putong/data/Media;", "Lcom/p1/mobile/putong/data/Media;", "media", "Lv/VTexturePlayer;", "Lv/VTexturePlayer;", "_texture", "", "Ljava/lang/String;", "TAG", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlLiveSmallWindow extends FrameLayout implements VTexturePlayer.b {

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
    public static void m2719a(IntlLiveSmallWindow intlLiveSmallWindow, Act act, User user, View view) {
        intlLiveSmallWindow.m2724f(act, user);
    }

    /* JADX INFO: renamed from: b */
    public static void m2720b(d30 d30Var, View view) {
        d30Var.call();
    }

    /* JADX INFO: renamed from: c */
    public final void m2721c(View view) {
        lzn.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m2722d() {
    }

    /* JADX INFO: renamed from: e */
    public final void m2723e() {
        VTexturePlayer vTexturePlayer = this._texture;
        if (vTexturePlayer != null) {
            if (vTexturePlayer == null) {
                Intrinsics.r("_texture");
                vTexturePlayer = null;
            }
            vTexturePlayer.j();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2724f(Act act, User user) {
        zvf0.r("e_intl_swipe_live_small", "p_suggest_users_home_view");
        try {
            CoreModule.Q().startAudienceLive(act, CoreModule.Q().getUserLiveId(((DbObject) user).id), "suggest-card", null);
            ttn.m22660a("p_suggest_users_home_view", user);
            CoreModule.c.m0.d8(((DbObject) user).id);
            CoreModule.c.m0.g2.onNext(SwipeDirection.RIGHT);
        } catch (Exception e) {
            e.toString();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2725g(User user, Live live) {
        String str;
        if ((live != null ? live.coverPicUrl : null) != null) {
            Media media = live.coverPicUrl;
            media.getClass();
            str = media.url;
        } else {
            str = (vwb.J(user.pictures) || !NullChecker.a(user.picture(0).cover())) ? "" : ((Media) user.picture(0).cover()).url;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        qib0.G.L0(get_image(), str);
    }

    @NotNull
    public final ImageView get_close() {
        ImageView imageView = this._close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    public final VDraweeView get_image() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_image");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public void m2726h() {
    }

    /* JADX INFO: renamed from: i */
    public final void m2727i(@NotNull final Act act, @NotNull final User user, @NotNull Live live, @NotNull final d30 action) {
        act.getClass();
        user.getClass();
        live.getClass();
        action.getClass();
        Media media = live.videoCapture;
        media.getClass();
        this.media = media;
        if (NullChecker.a(user)) {
            xdl0.E0(get_close(), new View.OnClickListener() { // from class: l.jzn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntlLiveSmallWindow.m2720b(action, view);
                }
            });
            xdl0.E0(this, new View.OnClickListener() { // from class: l.kzn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntlLiveSmallWindow.m2719a(this.f15889a, act, user, view);
                }
            });
        }
        zvf0.x("e_intl_swipe_live_small", "p_suggest_users_home_view");
        m2725g(user, live);
    }

    public void onComplete() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2723e();
    }

    public void onError(int what, int extra) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2721c(this);
    }

    public void onPause() {
    }

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

    /* JADX INFO: renamed from: y */
    public void m2728y() {
        View view = this._texture;
        View view2 = null;
        if (view == null) {
            Intrinsics.r("_texture");
            view = null;
        }
        view.setVisibility(0);
        VTexturePlayer vTexturePlayer = this._texture;
        if (vTexturePlayer == null) {
            Intrinsics.r("_texture");
            vTexturePlayer = null;
        }
        vTexturePlayer.setVolume(true);
        View view3 = this._texture;
        if (view3 == null) {
            Intrinsics.r("_texture");
        } else {
            view2 = view3;
        }
        view2.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
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
