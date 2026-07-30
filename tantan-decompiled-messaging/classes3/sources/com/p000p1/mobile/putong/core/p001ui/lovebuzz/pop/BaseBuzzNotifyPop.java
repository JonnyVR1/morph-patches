package com.p000p1.mobile.putong.core.p001ui.lovebuzz.pop;

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
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.pop.BaseBuzzNotifyPop;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.BuzzProgressBar;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.core.buzz.R;
import com.p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;
import l.hvc0;
import l.j8w;
import l.kp3;
import l.m6w;
import l.mqi0;
import l.o7r;
import l.p9w;
import l.sf2;
import l.t100;
import l.u9w;
import l.vwb;
import l.x0c0;
import l.xdl0;
import l.y2c0;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.fourthline.cling.support.messagebox.parser.MessageElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.seamless.xhtml.XHTMLElement;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\b\u0005*\u0002\u008f\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013JA\u0010\u001f\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J?\u0010'\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010$2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010$H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0003¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00103\u001a\u00020!2\u0006\u00100\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104JG\u00107\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u00106\u001a\u0002052\u0006\u0010\u0018\u001a\u00020\u00172\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010$2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010$¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\u00020\r2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\r¢\u0006\u0004\b=\u0010\u000fJ9\u0010C\u001a\u00020\r2\b\u0010>\u001a\u0004\u0018\u00010\u00102\u0006\u0010?\u001a\u00020)2\u0006\u0010@\u001a\u00020)2\u0006\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u00020)H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\rH\u0015¢\u0006\u0004\bE\u0010\u000fJ\u000f\u0010F\u001a\u00020\rH\u0016¢\u0006\u0004\bF\u0010\u000fR\"\u0010M\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010T\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010c\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010g\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010H\u001a\u0004\be\u0010J\"\u0004\bf\u0010LR\"\u0010k\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010^\u001a\u0004\bi\u0010`\"\u0004\bj\u0010bR\"\u0010o\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010^\u001a\u0004\bm\u0010`\"\u0004\bn\u0010bR\"\u0010s\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010^\u001a\u0004\bq\u0010`\"\u0004\br\u0010bR\"\u0010{\u001a\u00020t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR%\u0010\u0082\u0001\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0085\u0001\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0088\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R'\u0010\u0011\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0089\u0001\u0010\u0084\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0005\b\u008c\u0001\u0010\u0013R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0084\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0093\u0001"}, d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/BaseBuzzNotifyPop;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/p1/mobile/putong/core/api/c0$c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "p0", "()V", "", IjkMediaMeta.IJKM_KEY_TYPE, "t0", "(Ljava/lang/String;)V", "s0", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/data/User;", "user", "Lv/VText;", "info", "Lv/VImage;", "region", "Lcom/tantan/library/svga/SVGAnimationView;", "avatar", "u0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/data/User;Lv/VText;Lv/VImage;Lcom/tantan/library/svga/SVGAnimationView;)V", "Landroid/view/View;", "start", HttpHeaderValues.CLOSE, "Lkotlin/Function0;", "onAccept", "onRefuse", "m0", "(Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "lastTime", "r0", "(J)V", "q0", "()I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "j0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;", "data", "v0", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;Lcom/p1/mobile/putong/data/User;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "enable", "n0", "(Z)V", "o0", "key", "currentTime", "beginTime", "endTime", "registerTime", "u", "(Ljava/lang/String;JJJJ)V", "onDetachedFromWindow", "clearAnimation", "d", "Lv/VImage;", "get_front_bg", "()Lv/VImage;", "set_front_bg", "(Lv/VImage;)V", "_front_bg", "e", "Lcom/tantan/library/svga/SVGAnimationView;", "get_peer_avatar_anim", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_peer_avatar_anim", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_peer_avatar_anim", "Lv/VLinear;", "f", "Lv/VLinear;", "get_peer_info_ll", "()Lv/VLinear;", "set_peer_info_ll", "(Lv/VLinear;)V", "_peer_info_ll", "g", "Lv/VText;", "get_peer_info_ll_peer_info", "()Lv/VText;", "set_peer_info_ll_peer_info", "(Lv/VText;)V", "_peer_info_ll_peer_info", XHTMLElement.XPATH_PREFIX, "get_peer_info_ll_peer_region", "set_peer_info_ll_peer_region", "_peer_info_ll_peer_region", "i", "get_peer_info_ll_buzz_desc", "set_peer_info_ll_buzz_desc", "_peer_info_ll_buzz_desc", "j", "get_refuse_buzz", "set_refuse_buzz", "_refuse_buzz", "k", "get_accept_buzz", "set_accept_buzz", "_accept_buzz", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzProgressBar;", "l", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzProgressBar;", "get_buzz_progress_bar", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzProgressBar;", "set_buzz_progress_bar", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzProgressBar;)V", "_buzz_progress_bar", MessageElement.XPATH_PREFIX, "Landroid/view/View;", "get_close_buzz", "()Landroid/view/View;", "set_close_buzz", "(Landroid/view/View;)V", "_close_buzz", "n", "Ljava/lang/String;", "MEDIA_BUZZ_ACCEPT_KEY", "o", "Z", "buzzHandled", "p", "getType$buzz_intlGmsRelease", "()Ljava/lang/String;", "setType$buzz_intlGmsRelease", "q", "mediaAcceptStr", "com/p1/mobile/putong/core/ui/lovebuzz/pop/BaseBuzzNotifyPop$a", "r", "Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/BaseBuzzNotifyPop$a;", "animatorListenerAdapter", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class BaseBuzzNotifyPop extends ConstraintLayout implements c0.c {

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
    public final C0001a animatorListenerAdapter;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.pop.BaseBuzzNotifyPop$a */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p1/mobile/putong/core/ui/lovebuzz/pop/BaseBuzzNotifyPop$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0001a extends AnimatorListenerAdapter {
        public C0001a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            if (Intrinsics.d(BaseBuzzNotifyPop.this.getType(), "textBuzz")) {
                m6w m6wVar = m6w.INSTANCE;
                m6wVar.j(new View[]{BaseBuzzNotifyPop.this.get_buzz_progress_bar(), BaseBuzzNotifyPop.this.get_close_buzz()});
                m6wVar.l(new View[]{BaseBuzzNotifyPop.this.get_accept_buzz(), BaseBuzzNotifyPop.this.get_refuse_buzz()});
            } else {
                if (!BaseBuzzNotifyPop.this.buzzHandled) {
                    p9w.INSTANCE.W(BaseBuzzNotifyPop.this.getType());
                }
                CoreModule.c.t1.u(BaseBuzzNotifyPop.this.MEDIA_BUZZ_ACCEPT_KEY);
                j8w.Companion.a().G0().onNext(vwb.Y("intl.text.lovebuzz.close.notify", (Object) null));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseBuzzNotifyPop(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.MEDIA_BUZZ_ACCEPT_KEY = "media_buzz_accept_key" + mqi0.o();
        LayoutInflater layoutInflaterA = o7r.a(getContext());
        layoutInflaterA.getClass();
        m35j0(layoutInflaterA, this);
        m39p0();
        this.type = "UNKNOWN";
        this.animatorListenerAdapter = new C0001a();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m30h0(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m31i0(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: r0 */
    private final void m34r0(long lastTime) {
        get_accept_buzz().setText(this.mediaAcceptStr + " (" + (lastTime / 1000) + "s)");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void clearAnimation() {
        get_buzz_progress_bar().m194g();
        super/*android.view.View*/.clearAnimation();
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
        Intrinsics.r("_accept_buzz");
        return null;
    }

    @NotNull
    public final BuzzProgressBar get_buzz_progress_bar() {
        BuzzProgressBar buzzProgressBar = this._buzz_progress_bar;
        if (buzzProgressBar != null) {
            return buzzProgressBar;
        }
        Intrinsics.r("_buzz_progress_bar");
        return null;
    }

    @NotNull
    public final View get_close_buzz() {
        View view = this._close_buzz;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_close_buzz");
        return null;
    }

    @NotNull
    public final VImage get_front_bg() {
        VImage vImage = this._front_bg;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_front_bg");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_peer_avatar_anim() {
        SVGAnimationView sVGAnimationView = this._peer_avatar_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_peer_avatar_anim");
        return null;
    }

    @NotNull
    public final VLinear get_peer_info_ll() {
        VLinear vLinear = this._peer_info_ll;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_peer_info_ll");
        return null;
    }

    @NotNull
    public final VText get_peer_info_ll_buzz_desc() {
        VText vText = this._peer_info_ll_buzz_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_peer_info_ll_buzz_desc");
        return null;
    }

    @NotNull
    public final VText get_peer_info_ll_peer_info() {
        VText vText = this._peer_info_ll_peer_info;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_peer_info_ll_peer_info");
        return null;
    }

    @NotNull
    public final VImage get_peer_info_ll_peer_region() {
        VImage vImage = this._peer_info_ll_peer_region;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_peer_info_ll_peer_region");
        return null;
    }

    @NotNull
    public final VText get_refuse_buzz() {
        VText vText = this._refuse_buzz;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_refuse_buzz");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final View m35j0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = sf2.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m36m0(View start, View close, final Function0<Unit> onAccept, final Function0<Unit> onRefuse) {
        xdl0.E0(start, new View.OnClickListener() { // from class: l.qf2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseBuzzNotifyPop.m31i0(onAccept, view);
            }
        });
        xdl0.E0(close, new View.OnClickListener() { // from class: l.rf2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseBuzzNotifyPop.m30h0(onRefuse, view);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m37n0(boolean enable) {
        get_accept_buzz().setEnabled(enable);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m38o0() {
        this.buzzHandled = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"MissingSuperCall"})
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        CoreModule.c.t1.u(this.MEDIA_BUZZ_ACCEPT_KEY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public final void m39p0() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int i = t100.q;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(i);
        setLayoutParams(layoutParams);
        setElevation(t100.h);
        setPadding(0, 0, 0, t100.o);
    }

    /* JADX INFO: renamed from: q0 */
    public final int m40q0() {
        int iJ = a.j(new IntRange(0, 5), Random.Default);
        if (iJ == 0) {
            return R.string.n0;
        }
        if (iJ == 1) {
            return R.string.o0;
        }
        if (iJ == 2) {
            return R.string.p0;
        }
        if (iJ != 3) {
            return iJ != 4 ? R.string.s0 : R.string.r0;
        }
        return R.string.q0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    public final void m41s0(String type) {
        int i;
        int i2;
        int i3;
        int i4;
        Integer numValueOf;
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
                    i = x0c0.l;
                    i2 = y2c0.k;
                    i3 = y2c0.h0;
                    i4 = y2c0.g0;
                    numValueOf = Integer.valueOf(y2c0.l);
                } else {
                    i = x0c0.k;
                    i2 = y2c0.t;
                    i3 = y2c0.n0;
                    i4 = y2c0.m0;
                    numValueOf = Integer.valueOf(y2c0.u);
                }
            } else if (type.equals("videoBuzz")) {
                i = x0c0.h;
                i2 = y2c0.v;
                i3 = y2c0.r0;
                i4 = y2c0.o0;
                numValueOf = Integer.valueOf(y2c0.w);
            } else {
                i = x0c0.k;
                i2 = y2c0.t;
                i3 = y2c0.n0;
                i4 = y2c0.m0;
                numValueOf = Integer.valueOf(y2c0.u);
            }
        } else if (type.equals("voiceBuzz")) {
            i = x0c0.g;
            i2 = y2c0.x;
            i3 = y2c0.w0;
            i4 = y2c0.t0;
            numValueOf = Integer.valueOf(y2c0.y);
        } else {
            i = x0c0.k;
            i2 = y2c0.t;
            i3 = y2c0.n0;
            i4 = y2c0.m0;
            numValueOf = Integer.valueOf(y2c0.u);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setColors(new int[]{hvc0.a(i), -1});
        gradientDrawable.setCornerRadius(t100.o);
        setBackground(gradientDrawable);
        get_front_bg().setBackgroundResource(i2);
        get_refuse_buzz().setBackgroundResource(i3);
        get_accept_buzz().setBackgroundResource(i4);
        int iIntValue = numValueOf.intValue();
        BuzzProgressBar buzzProgressBar = get_buzz_progress_bar();
        Drawable drawableB = hvc0.b(iIntValue);
        drawableB.getClass();
        buzzProgressBar.setProgressDrawable(drawableB);
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
    public final void m42t0(String type) {
        this.mediaAcceptStr = TextUtils.equals(type, "bundle") ? hvc0.c(R.string.T) : hvc0.c(R.string.W);
    }

    /* JADX INFO: renamed from: u */
    public void m43u(@Nullable String key, long currentTime, long beginTime, long endTime, long registerTime) {
        long j = endTime - currentTime;
        if (TextUtils.equals(key, this.MEDIA_BUZZ_ACCEPT_KEY)) {
            m34r0(j);
        }
        if (j <= 0) {
            if (!this.buzzHandled) {
                p9w.INSTANCE.W(this.type);
            }
            CoreModule.c.t1.u(this.MEDIA_BUZZ_ACCEPT_KEY);
            j8w.Companion.a().G0().onNext(vwb.Y("intl.text.lovebuzz.close.notify", (Object) null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public final void m44u0(Act act, String type, User user, VText info, VImage region, SVGAnimationView avatar) {
        String strK;
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        if (!Intrinsics.d(type, "memojiBuzz")) {
            u9w u9wVar = u9w.INSTANCE;
            String str = u9wVar.j(user).profileSmall().formatted();
            str.getClass();
            u9wVar.s(act, sVGADynamicEntity, str, "user1_avatar");
        }
        if (!avatar.isAnimating()) {
            avatar.stopAnimation(true);
        }
        u9w.INSTANCE.p(user, region);
        boolean zEquals = TEnum.equals(user.gender, "female");
        Drawable drawableB = hvc0.b(!zEquals ? y2c0.F : y2c0.N);
        drawableB.getClass();
        int i = t100.n;
        drawableB.setBounds(0, 0, i, i);
        xdl0.l(info, drawableB);
        info.setText(user.name);
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
                    get_peer_info_ll_buzz_desc().setText(hvc0.c(R.string.y));
                    strK = zEquals ? kp3.INSTANCE.e() : kp3.INSTANCE.f();
                } else {
                    get_peer_info_ll_buzz_desc().setText(getContext().getString(m40q0()));
                    strK = kp3.INSTANCE.i();
                }
            } else if (type.equals("videoBuzz")) {
                get_peer_info_ll_buzz_desc().setText(hvc0.c(R.string.x0));
                strK = kp3.INSTANCE.j();
            } else {
                get_peer_info_ll_buzz_desc().setText(getContext().getString(m40q0()));
                strK = kp3.INSTANCE.i();
            }
        } else if (type.equals("voiceBuzz")) {
            get_peer_info_ll_buzz_desc().setText(hvc0.c(R.string.X0));
            strK = kp3.INSTANCE.k();
        } else {
            get_peer_info_ll_buzz_desc().setText(getContext().getString(m40q0()));
            strK = kp3.INSTANCE.i();
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from(strK).repeatCount(1).dynamic(sVGADynamicEntity).autoPlay(true).into(avatar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    public final void m45v0(@Nullable Act act, @NotNull LoveBuzzPushData data, @NotNull User user, @Nullable Function0<Unit> onAccept, @Nullable Function0<Unit> onRefuse) {
        data.getClass();
        user.getClass();
        String str = data.biz;
        str.getClass();
        this.type = str;
        this.buzzHandled = false;
        m37n0(true);
        m41s0(this.type);
        m44u0(act, this.type, user, get_peer_info_ll_peer_info(), get_peer_info_ll_peer_region(), get_peer_avatar_anim());
        m42t0(data.subType);
        m6w m6wVar = m6w.INSTANCE;
        m6wVar.l(new View[]{get_buzz_progress_bar(), get_close_buzz()});
        m6wVar.j(new View[]{get_accept_buzz(), get_refuse_buzz()});
        m36m0(get_buzz_progress_bar(), get_close_buzz(), onAccept, onRefuse);
        m36m0(get_accept_buzz(), get_refuse_buzz(), onAccept, onRefuse);
        get_buzz_progress_bar().setAnimatorListenerAdapter(this.animatorListenerAdapter);
        get_buzz_progress_bar().m193e(this.type, this.mediaAcceptStr);
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
