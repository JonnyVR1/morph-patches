package com.p051p1.mobile.putong.core.p058ui.lovebuzz.pop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.pop.BaseBuzzNotifyPop;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzProgressBar;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.C15274a;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.d9c0;
import p153l.ebc0;
import p153l.haw;
import p153l.jyb;
import p153l.k3d0;
import p153l.k8w;
import p153l.kq3;
import p153l.nbw;
import p153l.p9r;
import p153l.pzi0;
import p153l.qa00;
import p153l.sbw;
import p153l.zf2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\b\u0005*\u0002\u008f\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013JA\u0010\u001f\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J?\u0010'\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010$2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010$H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0003¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00103\u001a\u00020!2\u0006\u00100\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104JG\u00107\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u00106\u001a\u0002052\u0006\u0010\u0018\u001a\u00020\u00172\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010$2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010$¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\u00020\r2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\r¢\u0006\u0004\b=\u0010\u000fJ9\u0010C\u001a\u00020\r2\b\u0010>\u001a\u0004\u0018\u00010\u00102\u0006\u0010?\u001a\u00020)2\u0006\u0010@\u001a\u00020)2\u0006\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u00020)H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\rH\u0015¢\u0006\u0004\bE\u0010\u000fJ\u000f\u0010F\u001a\u00020\rH\u0016¢\u0006\u0004\bF\u0010\u000fR\"\u0010M\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010T\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010c\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010g\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010H\u001a\u0004\be\u0010J\"\u0004\bf\u0010LR\"\u0010k\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010^\u001a\u0004\bi\u0010`\"\u0004\bj\u0010bR\"\u0010o\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010^\u001a\u0004\bm\u0010`\"\u0004\bn\u0010bR\"\u0010s\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010^\u001a\u0004\bq\u0010`\"\u0004\br\u0010bR\"\u0010{\u001a\u00020t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR%\u0010\u0082\u0001\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0085\u0001\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0088\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R'\u0010\u0011\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0089\u0001\u0010\u0084\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0005\b\u008c\u0001\u0010\u0013R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0084\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0093\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/BaseBuzzNotifyPop;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/p1/mobile/putong/core/api/c0$c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "p0", "()V", "", "type", "t0", "(Ljava/lang/String;)V", "s0", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/User;", "user", "Lv/VText;", BaseSei.INFO, "Lv/VImage;", "region", "Lcom/tantan/library/svga/SVGAnimationView;", "avatar", "u0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/data/User;Lv/VText;Lv/VImage;Lcom/tantan/library/svga/SVGAnimationView;)V", "Landroid/view/View;", "start", "close", "Lkotlin/Function0;", "onAccept", "onRefuse", "m0", "(Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "lastTime", "r0", "(J)V", "q0", "()I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "j0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;", "data", "v0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;Lcom/p1/mobile/putong/data/User;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "enable", "n0", "(Z)V", "o0", Constants.KEY_KEY, "currentTime", "beginTime", "endTime", "registerTime", "u", "(Ljava/lang/String;JJJJ)V", "onDetachedFromWindow", "clearAnimation", Constants.INAPP_DATA_TAG, "Lv/VImage;", "get_front_bg", "()Lv/VImage;", "set_front_bg", "(Lv/VImage;)V", "_front_bg", "e", "Lcom/tantan/library/svga/SVGAnimationView;", "get_peer_avatar_anim", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_peer_avatar_anim", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_peer_avatar_anim", "Lv/VLinear;", "f", "Lv/VLinear;", "get_peer_info_ll", "()Lv/VLinear;", "set_peer_info_ll", "(Lv/VLinear;)V", "_peer_info_ll", "g", "Lv/VText;", "get_peer_info_ll_peer_info", "()Lv/VText;", "set_peer_info_ll_peer_info", "(Lv/VText;)V", "_peer_info_ll_peer_info", "h", "get_peer_info_ll_peer_region", "set_peer_info_ll_peer_region", "_peer_info_ll_peer_region", RXScreenCaptureService.KEY_INDEX, "get_peer_info_ll_buzz_desc", "set_peer_info_ll_buzz_desc", "_peer_info_ll_buzz_desc", "j", "get_refuse_buzz", "set_refuse_buzz", "_refuse_buzz", "k", "get_accept_buzz", "set_accept_buzz", "_accept_buzz", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzProgressBar;", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzProgressBar;", "get_buzz_progress_bar", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzProgressBar;", "set_buzz_progress_bar", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzProgressBar;)V", "_buzz_progress_bar", "m", "Landroid/view/View;", "get_close_buzz", "()Landroid/view/View;", "set_close_buzz", "(Landroid/view/View;)V", "_close_buzz", "n", "Ljava/lang/String;", "MEDIA_BUZZ_ACCEPT_KEY", "o", "Z", "buzzHandled", "p", "getType$buzz_intlGmsRelease", "()Ljava/lang/String;", "setType$buzz_intlGmsRelease", "q", "mediaAcceptStr", "com/p1/mobile/putong/core/ui/lovebuzz/pop/BaseBuzzNotifyPop$a", "r", "Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/BaseBuzzNotifyPop$a;", "animatorListenerAdapter", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class BaseBuzzNotifyPop extends ConstraintLayout implements RunnableC4884c0.c {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _front_bg;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public SVGAnimationView _peer_avatar_anim;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VLinear _peer_info_ll;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _peer_info_ll_peer_info;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VImage _peer_info_ll_peer_region;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _peer_info_ll_buzz_desc;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _refuse_buzz;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _accept_buzz;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public BuzzProgressBar _buzz_progress_bar;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public View _close_buzz;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final String MEDIA_BUZZ_ACCEPT_KEY;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean buzzHandled;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public String type;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public String mediaAcceptStr;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final C8581a animatorListenerAdapter;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.pop.BaseBuzzNotifyPop$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"com/p1/mobile/putong/core/ui/lovebuzz/pop/BaseBuzzNotifyPop$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8581a extends AnimatorListenerAdapter {
        public C8581a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            if (Intrinsics.m88377d(BaseBuzzNotifyPop.this.getType(), "textBuzz")) {
                k8w k8wVar = k8w.INSTANCE;
                k8wVar.m148761j(BaseBuzzNotifyPop.this.get_buzz_progress_bar(), BaseBuzzNotifyPop.this.get_close_buzz());
                k8wVar.m148763l(BaseBuzzNotifyPop.this.get_accept_buzz(), BaseBuzzNotifyPop.this.get_refuse_buzz());
            } else {
                if (!BaseBuzzNotifyPop.this.buzzHandled) {
                    nbw.INSTANCE.m162227W(BaseBuzzNotifyPop.this.getType());
                }
                CoreModule.f18264c.f20427t1.m32519u(BaseBuzzNotifyPop.this.MEDIA_BUZZ_ACCEPT_KEY);
                haw.INSTANCE.m134320a().m134269G0().onNext(jyb.m147494Y("intl.text.lovebuzz.close.notify", null));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBuzzNotifyPop(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.MEDIA_BUZZ_ACCEPT_KEY = "media_buzz_accept_key" + pzi0.m174454o();
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getContext());
        layoutInflaterM171370a.getClass();
        m48207j0(layoutInflaterM171370a, this);
        m48211p0();
        this.type = "UNKNOWN";
        this.animatorListenerAdapter = new C8581a();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m48202h0(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m48203i0(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: r0 */
    private final void m48206r0(long lastTime) {
        get_accept_buzz().setText(this.mediaAcceptStr + " (" + (lastTime / 1000) + "s)");
    }

    @Override // android.view.View
    public void clearAnimation() {
        get_buzz_progress_bar().m48351g();
        super.clearAnimation();
    }

    @NotNull
    /* JADX INFO: renamed from: getType$buzz_intlGmsRelease, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final VText get_accept_buzz() {
        VText vText = this._accept_buzz;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_accept_buzz");
        return null;
    }

    @NotNull
    public final BuzzProgressBar get_buzz_progress_bar() {
        BuzzProgressBar buzzProgressBar = this._buzz_progress_bar;
        if (buzzProgressBar != null) {
            return buzzProgressBar;
        }
        Intrinsics.m88391r("_buzz_progress_bar");
        return null;
    }

    @NotNull
    public final View get_close_buzz() {
        View view = this._close_buzz;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_close_buzz");
        return null;
    }

    @NotNull
    public final VImage get_front_bg() {
        VImage vImage = this._front_bg;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_front_bg");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_peer_avatar_anim() {
        SVGAnimationView sVGAnimationView = this._peer_avatar_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_peer_avatar_anim");
        return null;
    }

    @NotNull
    public final VLinear get_peer_info_ll() {
        VLinear vLinear = this._peer_info_ll;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_peer_info_ll");
        return null;
    }

    @NotNull
    public final VText get_peer_info_ll_buzz_desc() {
        VText vText = this._peer_info_ll_buzz_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_peer_info_ll_buzz_desc");
        return null;
    }

    @NotNull
    public final VText get_peer_info_ll_peer_info() {
        VText vText = this._peer_info_ll_peer_info;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_peer_info_ll_peer_info");
        return null;
    }

    @NotNull
    public final VImage get_peer_info_ll_peer_region() {
        VImage vImage = this._peer_info_ll_peer_region;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_peer_info_ll_peer_region");
        return null;
    }

    @NotNull
    public final VText get_refuse_buzz() {
        VText vText = this._refuse_buzz;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_refuse_buzz");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final View m48207j0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM219521b = zf2.m219521b(this, inflater, parent);
        viewM219521b.getClass();
        return viewM219521b;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m48208m0(View start, View close, final Function0<Unit> onAccept, final Function0<Unit> onRefuse) {
        bnl0.m105509E0(start, new View.OnClickListener() { // from class: l.xf2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseBuzzNotifyPop.m48203i0(onAccept, view);
            }
        });
        bnl0.m105509E0(close, new View.OnClickListener() { // from class: l.yf2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseBuzzNotifyPop.m48202h0(onRefuse, view);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m48209n0(boolean enable) {
        get_accept_buzz().setEnabled(enable);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m48210o0() {
        this.buzzHandled = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoreModule.f18264c.f20427t1.m32519u(this.MEDIA_BUZZ_ACCEPT_KEY);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m48211p0() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int i = qa00.f156330q;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(i);
        setLayoutParams(layoutParams);
        setElevation(qa00.f156321h);
        setPadding(0, 0, 0, qa00.f156328o);
    }

    /* JADX INFO: renamed from: q0 */
    public final int m48212q0() {
        int iM88495k = C15274a.m88495k(new IntRange(0, 5), Random.INSTANCE);
        if (iM88495k == 0) {
            return R$string.f20985n0;
        }
        if (iM88495k == 1) {
            return R$string.f20987o0;
        }
        if (iM88495k == 2) {
            return R$string.f20989p0;
        }
        if (iM88495k != 3) {
            return iM88495k != 4 ? R$string.f20995s0 : R$string.f20993r0;
        }
        return R$string.f20991q0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX INFO: renamed from: s0 */
    public final void m48213s0(String type) {
        int i;
        int i2;
        int i3;
        int i4;
        Integer numValueOf;
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
                    i = d9c0.f85755l;
                    i2 = ebc0.f92888k;
                    i3 = ebc0.f92883h0;
                    i4 = ebc0.f92881g0;
                    numValueOf = Integer.valueOf(ebc0.f92890l);
                } else {
                    i = d9c0.f85754k;
                    i2 = ebc0.f92906t;
                    i3 = ebc0.f92895n0;
                    i4 = ebc0.f92893m0;
                    numValueOf = Integer.valueOf(ebc0.f92908u);
                }
            } else if (type.equals("videoBuzz")) {
                i = d9c0.f85751h;
                i2 = ebc0.f92910v;
                i3 = ebc0.f92903r0;
                i4 = ebc0.f92897o0;
                numValueOf = Integer.valueOf(ebc0.f92912w);
            } else {
                i = d9c0.f85754k;
                i2 = ebc0.f92906t;
                i3 = ebc0.f92895n0;
                i4 = ebc0.f92893m0;
                numValueOf = Integer.valueOf(ebc0.f92908u);
            }
        } else if (type.equals("voiceBuzz")) {
            i = d9c0.f85750g;
            i2 = ebc0.f92914x;
            i3 = ebc0.f92913w0;
            i4 = ebc0.f92907t0;
            numValueOf = Integer.valueOf(ebc0.f92916y);
        } else {
            i = d9c0.f85754k;
            i2 = ebc0.f92906t;
            i3 = ebc0.f92895n0;
            i4 = ebc0.f92893m0;
            numValueOf = Integer.valueOf(ebc0.f92908u);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setColors(new int[]{k3d0.m148005a(i), -1});
        gradientDrawable.setCornerRadius(qa00.f156328o);
        setBackground(gradientDrawable);
        get_front_bg().setBackgroundResource(i2);
        get_refuse_buzz().setBackgroundResource(i3);
        get_accept_buzz().setBackgroundResource(i4);
        int iIntValue = numValueOf.intValue();
        BuzzProgressBar buzzProgressBar = get_buzz_progress_bar();
        Drawable drawableM148006b = k3d0.m148006b(iIntValue);
        drawableM148006b.getClass();
        buzzProgressBar.setProgressDrawable(drawableM148006b);
    }

    public final void setType$buzz_intlGmsRelease(@NotNull String str) {
        str.getClass();
        this.type = str;
    }

    public final void set_accept_buzz(@NotNull VText vText) {
        vText.getClass();
        this._accept_buzz = vText;
    }

    public final void set_buzz_progress_bar(@NotNull BuzzProgressBar buzzProgressBar) {
        buzzProgressBar.getClass();
        this._buzz_progress_bar = buzzProgressBar;
    }

    public final void set_close_buzz(@NotNull View view) {
        view.getClass();
        this._close_buzz = view;
    }

    public final void set_front_bg(@NotNull VImage vImage) {
        vImage.getClass();
        this._front_bg = vImage;
    }

    public final void set_peer_avatar_anim(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._peer_avatar_anim = sVGAnimationView;
    }

    public final void set_peer_info_ll(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._peer_info_ll = vLinear;
    }

    public final void set_peer_info_ll_buzz_desc(@NotNull VText vText) {
        vText.getClass();
        this._peer_info_ll_buzz_desc = vText;
    }

    public final void set_peer_info_ll_peer_info(@NotNull VText vText) {
        vText.getClass();
        this._peer_info_ll_peer_info = vText;
    }

    public final void set_peer_info_ll_peer_region(@NotNull VImage vImage) {
        vImage.getClass();
        this._peer_info_ll_peer_region = vImage;
    }

    public final void set_refuse_buzz(@NotNull VText vText) {
        vText.getClass();
        this._refuse_buzz = vText;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m48214t0(String type) {
        this.mediaAcceptStr = TextUtils.equals(type, StickerBundle.TYPE) ? k3d0.m148007c(R$string.f20932T) : k3d0.m148007c(R$string.f20938W);
    }

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: u */
    public void mo32530u(@Nullable String key, long currentTime, long beginTime, long endTime, long registerTime) {
        long j = endTime - currentTime;
        if (TextUtils.equals(key, this.MEDIA_BUZZ_ACCEPT_KEY)) {
            m48206r0(j);
        }
        if (j <= 0) {
            if (!this.buzzHandled) {
                nbw.INSTANCE.m162227W(this.type);
            }
            CoreModule.f18264c.f20427t1.m32519u(this.MEDIA_BUZZ_ACCEPT_KEY);
            haw.INSTANCE.m134320a().m134269G0().onNext(jyb.m147494Y("intl.text.lovebuzz.close.notify", null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c7  */
    /* JADX INFO: renamed from: u0 */
    public final void m48215u0(Act act, String type, User user, VText info, VImage region, SVGAnimationView avatar) {
        String strM150817k;
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        if (!Intrinsics.m88377d(type, "memojiBuzz")) {
            sbw sbwVar = sbw.INSTANCE;
            String str = sbwVar.m185345j(user).profileSmall().formatted();
            str.getClass();
            sbwVar.m185354s(act, sVGADynamicEntity, str, "user1_avatar");
        }
        if (!avatar.isAnimating()) {
            avatar.stopAnimation(true);
        }
        sbw.INSTANCE.m185351p(user, region);
        boolean zEquals = TEnum.equals(user.gender, "female");
        Drawable drawableM148006b = k3d0.m148006b(!zEquals ? ebc0.f92847F : ebc0.f92855N);
        drawableM148006b.getClass();
        int i = qa00.f156327n;
        drawableM148006b.setBounds(0, 0, i, i);
        bnl0.m105565l(info, drawableM148006b);
        info.setText(user.name);
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
                    get_peer_info_ll_buzz_desc().setText(k3d0.m148007c(R$string.f21006y));
                    strM150817k = zEquals ? kq3.INSTANCE.m150811e() : kq3.INSTANCE.m150812f();
                } else {
                    get_peer_info_ll_buzz_desc().setText(getContext().getString(m48212q0()));
                    strM150817k = kq3.INSTANCE.m150815i();
                }
            } else if (type.equals("videoBuzz")) {
                get_peer_info_ll_buzz_desc().setText(k3d0.m148007c(R$string.f21005x0));
                strM150817k = kq3.INSTANCE.m150816j();
            } else {
                get_peer_info_ll_buzz_desc().setText(getContext().getString(m48212q0()));
                strM150817k = kq3.INSTANCE.m150815i();
            }
        } else if (type.equals("voiceBuzz")) {
            get_peer_info_ll_buzz_desc().setText(k3d0.m148007c(R$string.f20941X0));
            strM150817k = kq3.INSTANCE.m150817k();
        } else {
            get_peer_info_ll_buzz_desc().setText(getContext().getString(m48212q0()));
            strM150817k = kq3.INSTANCE.m150815i();
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from(strM150817k).repeatCount(1).dynamic(sVGADynamicEntity).autoPlay(true).into(avatar);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m48216v0(@Nullable Act act, @NotNull LoveBuzzPushData data, @NotNull User user, @Nullable Function0<Unit> onAccept, @Nullable Function0<Unit> onRefuse) {
        data.getClass();
        user.getClass();
        String str = data.biz;
        str.getClass();
        this.type = str;
        this.buzzHandled = false;
        m48209n0(true);
        m48213s0(this.type);
        m48215u0(act, this.type, user, get_peer_info_ll_peer_info(), get_peer_info_ll_peer_region(), get_peer_avatar_anim());
        m48214t0(data.subType);
        k8w k8wVar = k8w.INSTANCE;
        k8wVar.m148763l(get_buzz_progress_bar(), get_close_buzz());
        k8wVar.m148761j(get_accept_buzz(), get_refuse_buzz());
        m48208m0(get_buzz_progress_bar(), get_close_buzz(), onAccept, onRefuse);
        m48208m0(get_accept_buzz(), get_refuse_buzz(), onAccept, onRefuse);
        get_buzz_progress_bar().setAnimatorListenerAdapter(this.animatorListenerAdapter);
        get_buzz_progress_bar().m48350e(this.type, this.mediaAcceptStr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseBuzzNotifyPop(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseBuzzNotifyPop(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
