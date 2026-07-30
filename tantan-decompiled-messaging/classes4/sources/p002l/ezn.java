package p002l;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.bt0;
import l.cxq;
import l.dt0;
import l.e51;
import l.hxs;
import l.kvc0;
import l.mep0;
import l.s7m;
import l.svq;
import l.yb2;
import l.ym2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;
import v.VFrame;
import v.VMarqueeText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\tJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b \u0010\u000eJ\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010h\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010o\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010pR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010qR\u0016\u0010s\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010rR\u0018\u0010w\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010y\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010v¨\u0006z"}, d2 = {"Ll/ezn;", "Ll/s7m;", "Ll/xyn;", "Landroid/widget/FrameLayout;", "container", "<init>", "(Landroid/widget/FrameLayout;)V", "", "l", "()V", "r", "Lcom/p1/mobile/longlink/msg/intl_light_push/LongLinkIntlLightPushMessage$IntlLightPushInfo;", "pushInfo", "C", "(Lcom/p1/mobile/longlink/msg/intl_light_push/LongLinkIntlLightPushMessage$IntlLightPushInfo;)V", "m", "p", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "i", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "j", "(Ll/xyn;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "F", "", "k", "()Z", "", "B", "(I)V", "a", "Landroid/widget/FrameLayout;", "getContainer", "()Landroid/widget/FrameLayout;", "Landroid/widget/RelativeLayout;", "b", "Landroid/widget/RelativeLayout;", "x", "()Landroid/widget/RelativeLayout;", "set_root", "(Landroid/widget/RelativeLayout;)V", "_root", "Lv/VFrame;", "c", "Lv/VFrame;", "get_head_container", "()Lv/VFrame;", "set_head_container", "(Lv/VFrame;)V", "_head_container", "Lv/VDraweeView;", "d", "Lv/VDraweeView;", "s", "()Lv/VDraweeView;", "set_avatar", "(Lv/VDraweeView;)V", "_avatar", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "e", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "z", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_svga_player", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_svga_player", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "w", "()Landroid/widget/LinearLayout;", "set_ll_text", "(Landroid/widget/LinearLayout;)V", "_ll_text", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "A", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VMarqueeText;", "h", "Lv/VMarqueeText;", "v", "()Lv/VMarqueeText;", "set_content", "(Lv/VMarqueeText;)V", "_content", "Landroid/view/View;", "y", "()Landroid/view/View;", "set_space_view", "(Landroid/view/View;)V", "_space_view", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "u", "()Landroid/widget/ImageView;", "set_close", "(Landroid/widget/ImageView;)V", "_close", "Ll/xyn;", "Lcom/p1/mobile/longlink/msg/intl_light_push/LongLinkIntlLightPushMessage$IntlLightPushInfo;", "Z", "isPlayingAnim", "Landroid/animation/Animator;", "n", "Landroid/animation/Animator;", "showAni", "o", "dismissAnim", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class ezn implements s7m<xyn> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final FrameLayout container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public RelativeLayout _root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VFrame _head_container;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _avatar;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public AnimEffectPlayer _svga_player;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public LinearLayout _ll_text;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VMarqueeText _content;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public View _space_view;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public ImageView _close;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public xyn presenter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public LongLinkIntlLightPushMessage.IntlLightPushInfo pushInfo;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isPlayingAnim;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public Animator showAni;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public Animator dismissAnim;

    public ezn(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this.container = frameLayout;
    }

    /* JADX INFO: renamed from: E */
    public static final void m12846E(ezn eznVar) {
        eznVar.m12867p();
    }

    /* JADX INFO: renamed from: a */
    public static Unit m12847a(ezn eznVar, View view) {
        view.getClass();
        eznVar.m12867p();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m12850d(ezn eznVar, View view) {
        view.getClass();
        LongLinkIntlLightPushMessage.IntlLightPushInfo intlLightPushInfo = eznVar.pushInfo;
        if (intlLightPushInfo != null) {
            xyn xynVar = eznVar.presenter;
            if (xynVar == null) {
                Intrinsics.r("presenter");
                xynVar = null;
            }
            xynVar.m26271d4(intlLightPushInfo.getTextSchema());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m12851e(ezn eznVar, View view) {
        view.getClass();
        LongLinkIntlLightPushMessage.IntlLightPushInfo intlLightPushInfo = eznVar.pushInfo;
        if (intlLightPushInfo != null) {
            xyn xynVar = eznVar.presenter;
            if (xynVar == null) {
                Intrinsics.r("presenter");
                xynVar = null;
            }
            xynVar.m26271d4(intlLightPushInfo.getIconSchema());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final void m12853n(ezn eznVar) {
        eznVar.isPlayingAnim = true;
        eznVar.container.setVisibility(0);
    }

    /* JADX INFO: renamed from: q */
    public static final void m12854q(ezn eznVar) {
        eznVar.m12874z().o();
        eznVar.isPlayingAnim = false;
        eznVar.container.setVisibility(8);
        xyn xynVar = eznVar.presenter;
        if (xynVar == null) {
            Intrinsics.r("presenter");
            xynVar = null;
        }
        xynVar.m26270c4();
    }

    /* JADX INFO: renamed from: r */
    private final void m12855r() {
        cxq.c(m12868s(), new Function1() { // from class: l.yyn
            public final Object invoke(Object obj) {
                return ezn.m12851e(this.f23146a, (View) obj);
            }
        });
        cxq.c(m12871w(), new Function1() { // from class: l.zyn
            public final Object invoke(Object obj) {
                return ezn.m12850d(this.f23673a, (View) obj);
            }
        });
        cxq.c(m12869u(), new Function1() { // from class: l.azn
            public final Object invoke(Object obj) {
                return ezn.m12847a(this.f7935a, (View) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final TextView m12856A() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final void m12857B(int i) {
        this.container.setTranslationY(i);
    }

    /* JADX INFO: renamed from: C */
    public final void m12858C(LongLinkIntlLightPushMessage.IntlLightPushInfo pushInfo) {
        m12872x().setBackground(yb2.k(kvc0.g(pushInfo.getBackgroundStartColor()), kvc0.g(pushInfo.getBackgroundEndColor()), 0, GradientDrawable.Orientation.LEFT_RIGHT));
        m12856A().setText(pushInfo.getTextFirst());
        m12856A().setTextColor(kvc0.g(pushInfo.getTextFirstColor()));
        m12870v().setText(pushInfo.getTextSecond());
        m12870v().setTextColor(kvc0.g(pushInfo.getTextSecondColor()));
        m12869u().setVisibility(!pushInfo.getCloseAuto() ? 0 : 8);
        m12873y().setVisibility(pushInfo.getCloseAuto() ? 0 : 8);
        if (pushInfo.getCloseAuto()) {
            e51.H(m12859C0(), new Runnable() { // from class: l.bzn
                @Override // java.lang.Runnable
                public final void run() {
                    ezn.m12846E(this.f8429a);
                }
            }, pushInfo.getCloseTimeOutMs() == 0 ? 3000L : pushInfo.getCloseTimeOutMs());
        }
        m12868s().setVisibility(!pushInfo.getSvga() ? 0 : 8);
        m12874z().setVisibility(pushInfo.getSvga() ? 0 : 8);
        if (pushInfo.getSvga()) {
            m12874z().j(pushInfo.getIcon(), Integer.MAX_VALUE);
        } else {
            hxs.v("context_single_room", m12868s(), pushInfo.getIcon(), svq.c(40), svq.c(40), false, false, true, (ym2) null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m12859C0() {
        xyn xynVar = this.presenter;
        if (xynVar == null) {
            Intrinsics.r("presenter");
            xynVar = null;
        }
        Act act = xynVar.act();
        act.getClass();
        return act;
    }

    /* JADX INFO: renamed from: F */
    public final void m12860F(@NotNull LongLinkIntlLightPushMessage.IntlLightPushInfo pushInfo) {
        pushInfo.getClass();
        this.pushInfo = pushInfo;
        m12865l();
        m12858C(pushInfo);
        m12866m();
    }

    public void destroy() {
        dt0.A(this.showAni);
        dt0.A(this.dismissAnim);
        this.container.setVisibility(0);
        this.container.removeAllViews();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final View m12861i(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM13516b = fzn.m13516b(this, inflater, parent);
        viewM13516b.getClass();
        return viewM13516b;
    }

    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m12862i1(@NotNull xyn presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m12864k() {
        return !this.isPlayingAnim;
    }

    /* JADX INFO: renamed from: l */
    public final void m12865l() {
        if (this.container.getChildCount() <= 0) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(m12859C0());
            layoutInflaterFrom.getClass();
            View viewM12861i = m12861i(layoutInflaterFrom, null);
            mep0.c1(m12872x(), 0, 0, svq.c(-12), 0, svq.c(12));
            this.container.addView(viewM12861i);
            m12855r();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m12866m() {
        dt0.A(this.showAni);
        FrameLayout frameLayout = this.container;
        Animator animatorQ = bt0.q(frameLayout, "translationX", new float[]{((float) frameLayout.getWidth()) == 0.0f ? svq.c(183) : this.container.getWidth(), -svq.c(36), 0.0f});
        this.showAni = animatorQ;
        if (animatorQ != null) {
            animatorQ.setDuration(600L).setInterpolator(new OvershootInterpolator());
            bt0.v(this.showAni, new Runnable() { // from class: l.czn
                @Override // java.lang.Runnable
                public final void run() {
                    ezn.m12853n(this.f9003a);
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m12867p() {
        dt0.A(this.dismissAnim);
        FrameLayout frameLayout = this.container;
        Animator animatorQ = bt0.q(frameLayout, "translationX", new float[]{0.0f, frameLayout.getWidth()});
        this.dismissAnim = animatorQ;
        if (animatorQ != null) {
            animatorQ.setDuration(150L);
            bt0.f(this.dismissAnim, new Runnable() { // from class: l.dzn
                @Override // java.lang.Runnable
                public final void run() {
                    ezn.m12854q(this.f9496a);
                }
            });
            animatorQ.start();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VDraweeView m12868s() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final ImageView m12869u() {
        ImageView imageView = this._close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VMarqueeText m12870v() {
        VMarqueeText vMarqueeText = this._content;
        if (vMarqueeText != null) {
            return vMarqueeText;
        }
        Intrinsics.r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final LinearLayout m12871w() {
        LinearLayout linearLayout = this._ll_text;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_ll_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final RelativeLayout m12872x() {
        RelativeLayout relativeLayout = this._root;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final View m12873y() {
        View view = this._space_view;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_space_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final AnimEffectPlayer m12874z() {
        AnimEffectPlayer animEffectPlayer = this._svga_player;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.r("_svga_player");
        return null;
    }
}
