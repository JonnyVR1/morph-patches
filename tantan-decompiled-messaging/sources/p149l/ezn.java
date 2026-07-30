package p149l;

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
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VMarqueeText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\tJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b \u0010\u000eJ\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010h\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010o\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010pR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010qR\u0016\u0010s\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010rR\u0018\u0010w\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010y\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010v¨\u0006z"}, m87232d2 = {"Ll/ezn;", "Ll/s7m;", "Ll/xyn;", "Landroid/widget/FrameLayout;", "container", "<init>", "(Landroid/widget/FrameLayout;)V", "", BLiveStormDanmakuGiftResourceType.f44444l, "()V", "r", "Lcom/p1/mobile/longlink/msg/intl_light_push/LongLinkIntlLightPushMessage$IntlLightPushInfo;", "pushInfo", b2s.C_ZONE, "(Lcom/p1/mobile/longlink/msg/intl_light_push/LongLinkIntlLightPushMessage$IntlLightPushInfo;)V", "m", "p", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", RXScreenCaptureService.KEY_INDEX, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "j", "(Ll/xyn;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "F", "", "k", "()Z", "", "B", "(I)V", "a", "Landroid/widget/FrameLayout;", "getContainer", "()Landroid/widget/FrameLayout;", "Landroid/widget/RelativeLayout;", "b", "Landroid/widget/RelativeLayout;", BaseSei.f13930X, "()Landroid/widget/RelativeLayout;", "set_root", "(Landroid/widget/RelativeLayout;)V", "_root", "Lv/VFrame;", "c", "Lv/VFrame;", "get_head_container", "()Lv/VFrame;", "set_head_container", "(Lv/VFrame;)V", "_head_container", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", BLiveStormDanmakuGiftResourceType.f44446s, "()Lv/VDraweeView;", "set_avatar", "(Lv/VDraweeView;)V", "_avatar", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "e", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", BaseSei.f13932Z, "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_svga_player", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_svga_player", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "w", "()Landroid/widget/LinearLayout;", "set_ll_text", "(Landroid/widget/LinearLayout;)V", "_ll_text", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "A", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VMarqueeText;", "h", "Lv/VMarqueeText;", ResourceDirection.f38808v, "()Lv/VMarqueeText;", "set_content", "(Lv/VMarqueeText;)V", "_content", "Landroid/view/View;", BaseSei.f13931Y, "()Landroid/view/View;", "set_space_view", "(Landroid/view/View;)V", "_space_view", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "u", "()Landroid/widget/ImageView;", "set_close", "(Landroid/widget/ImageView;)V", "_close", "Ll/xyn;", "Lcom/p1/mobile/longlink/msg/intl_light_push/LongLinkIntlLightPushMessage$IntlLightPushInfo;", "Z", "isPlayingAnim", "Landroid/animation/Animator;", "n", "Landroid/animation/Animator;", "showAni", "o", "dismissAnim", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static final void m118982E(ezn eznVar) {
        eznVar.m119001p();
    }

    /* JADX INFO: renamed from: a */
    public static Unit m118983a(ezn eznVar, View view) {
        view.getClass();
        eznVar.m119001p();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m118986d(ezn eznVar, View view) {
        view.getClass();
        LongLinkIntlLightPushMessage.IntlLightPushInfo intlLightPushInfo = eznVar.pushInfo;
        if (intlLightPushInfo != null) {
            xyn xynVar = eznVar.presenter;
            if (xynVar == null) {
                Intrinsics.m87502r("presenter");
                xynVar = null;
            }
            xynVar.m211860d4(intlLightPushInfo.getTextSchema());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m118987e(ezn eznVar, View view) {
        view.getClass();
        LongLinkIntlLightPushMessage.IntlLightPushInfo intlLightPushInfo = eznVar.pushInfo;
        if (intlLightPushInfo != null) {
            xyn xynVar = eznVar.presenter;
            if (xynVar == null) {
                Intrinsics.m87502r("presenter");
                xynVar = null;
            }
            xynVar.m211860d4(intlLightPushInfo.getIconSchema());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final void m118989n(ezn eznVar) {
        eznVar.isPlayingAnim = true;
        eznVar.container.setVisibility(0);
    }

    /* JADX INFO: renamed from: q */
    public static final void m118990q(ezn eznVar) {
        eznVar.m119008z().m68505o();
        eznVar.isPlayingAnim = false;
        eznVar.container.setVisibility(8);
        xyn xynVar = eznVar.presenter;
        if (xynVar == null) {
            Intrinsics.m87502r("presenter");
            xynVar = null;
        }
        xynVar.m211859c4();
    }

    /* JADX INFO: renamed from: r */
    private final void m118991r() {
        cxq.m109105c(m119002s(), new Function1() { // from class: l.yyn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ezn.m118987e(this.f200783a, (View) obj);
            }
        });
        cxq.m109105c(m119005w(), new Function1() { // from class: l.zyn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ezn.m118986d(this.f205702a, (View) obj);
            }
        });
        cxq.m109105c(m119003u(), new Function1() { // from class: l.azn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ezn.m118983a(this.f72366a, (View) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final TextView m118992A() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final void m118993B(int i) {
        this.container.setTranslationY(i);
    }

    /* JADX INFO: renamed from: C */
    public final void m118994C(LongLinkIntlLightPushMessage.IntlLightPushInfo pushInfo) {
        m119006x().setBackground(yb2.m213886k(kvc0.m147358g(pushInfo.getBackgroundStartColor()), kvc0.m147358g(pushInfo.getBackgroundEndColor()), 0, GradientDrawable.Orientation.LEFT_RIGHT));
        m118992A().setText(pushInfo.getTextFirst());
        m118992A().setTextColor(kvc0.m147358g(pushInfo.getTextFirstColor()));
        m119004v().setText(pushInfo.getTextSecond());
        m119004v().setTextColor(kvc0.m147358g(pushInfo.getTextSecondColor()));
        m119003u().setVisibility(!pushInfo.getCloseAuto() ? 0 : 8);
        m119007y().setVisibility(pushInfo.getCloseAuto() ? 0 : 8);
        if (pushInfo.getCloseAuto()) {
            e51.m114743H(getContext(), new Runnable() { // from class: l.bzn
                @Override // java.lang.Runnable
                public final void run() {
                    ezn.m118982E(this.f78046a);
                }
            }, pushInfo.getCloseTimeOutMs() == 0 ? 3000L : pushInfo.getCloseTimeOutMs());
        }
        m119002s().setVisibility(!pushInfo.getSvga() ? 0 : 8);
        m119008z().setVisibility(pushInfo.getSvga() ? 0 : 8);
        if (pushInfo.getSvga()) {
            m119008z().m68500j(pushInfo.getIcon(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } else {
            hxs.m133409v("context_single_room", m119002s(), pushInfo.getIcon(), svq.m186103c(40), svq.m186103c(40), false, false, true, null);
        }
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        xyn xynVar = this.presenter;
        if (xynVar == null) {
            Intrinsics.m87502r("presenter");
            xynVar = null;
        }
        Act act = xynVar.act();
        act.getClass();
        return act;
    }

    /* JADX INFO: renamed from: F */
    public final void m118995F(@NotNull LongLinkIntlLightPushMessage.IntlLightPushInfo pushInfo) {
        pushInfo.getClass();
        this.pushInfo = pushInfo;
        m118999l();
        m118994C(pushInfo);
        m119000m();
    }

    @Override // p149l.s7m
    public void destroy() {
        dt0.m113501A(this.showAni);
        dt0.m113501A(this.dismissAnim);
        this.container.setVisibility(0);
        this.container.removeAllViews();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final View m118996i(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM123886b = fzn.m123886b(this, inflater, parent);
        viewM123886b.getClass();
        return viewM123886b;
    }

    @Override // p149l.s7m
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull xyn presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m118998k() {
        return !this.isPlayingAnim;
    }

    /* JADX INFO: renamed from: l */
    public final void m118999l() {
        if (this.container.getChildCount() <= 0) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            layoutInflaterFrom.getClass();
            View viewM118996i = m118996i(layoutInflaterFrom, null);
            mep0.m154301c1(m119006x(), 0, 0, svq.m186103c(-12), 0, svq.m186103c(12));
            this.container.addView(viewM118996i);
            m118991r();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m119000m() {
        dt0.m113501A(this.showAni);
        FrameLayout frameLayout = this.container;
        Animator animatorM103744q = bt0.m103744q(frameLayout, "translationX", ((float) frameLayout.getWidth()) == 0.0f ? svq.m186103c(183) : this.container.getWidth(), -svq.m186103c(36), 0.0f);
        this.showAni = animatorM103744q;
        if (animatorM103744q != null) {
            animatorM103744q.setDuration(600L).setInterpolator(new OvershootInterpolator());
            bt0.m103749v(this.showAni, new Runnable() { // from class: l.czn
                @Override // java.lang.Runnable
                public final void run() {
                    ezn.m118989n(this.f83100a);
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m119001p() {
        dt0.m113501A(this.dismissAnim);
        FrameLayout frameLayout = this.container;
        Animator animatorM103744q = bt0.m103744q(frameLayout, "translationX", 0.0f, frameLayout.getWidth());
        this.dismissAnim = animatorM103744q;
        if (animatorM103744q != null) {
            animatorM103744q.setDuration(150L);
            bt0.m103733f(this.dismissAnim, new Runnable() { // from class: l.dzn
                @Override // java.lang.Runnable
                public final void run() {
                    ezn.m118990q(this.f88496a);
                }
            });
            animatorM103744q.start();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VDraweeView m119002s() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final ImageView m119003u() {
        ImageView imageView = this._close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VMarqueeText m119004v() {
        VMarqueeText vMarqueeText = this._content;
        if (vMarqueeText != null) {
            return vMarqueeText;
        }
        Intrinsics.m87502r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final LinearLayout m119005w() {
        LinearLayout linearLayout = this._ll_text;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_ll_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final RelativeLayout m119006x() {
        RelativeLayout relativeLayout = this._root;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final View m119007y() {
        View view = this._space_view;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_space_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final AnimEffectPlayer m119008z() {
        AnimEffectPlayer animEffectPlayer = this._svga_player;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.m87502r("_svga_player");
        return null;
    }
}
