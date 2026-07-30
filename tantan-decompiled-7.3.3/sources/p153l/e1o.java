package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VMarqueeText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\tJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b \u0010\u000eJ\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010h\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010o\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010pR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010qR\u0016\u0010s\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010rR\u0018\u0010w\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010y\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010v¨\u0006z"}, m88121d2 = {"Ll/e1o;", "Ll/iam;", "Ll/x0o;", "Landroid/widget/FrameLayout;", "container", "<init>", "(Landroid/widget/FrameLayout;)V", "", BLiveStormDanmakuGiftResourceType.f45292l, "()V", "r", "Lcom/p1/mobile/longlink/msg/intl_light_push/LongLinkIntlLightPushMessage$IntlLightPushInfo;", "pushInfo", c4s.C_ZONE, "(Lcom/p1/mobile/longlink/msg/intl_light_push/LongLinkIntlLightPushMessage$IntlLightPushInfo;)V", "m", "p", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", RXScreenCaptureService.KEY_INDEX, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "j", "(Ll/x0o;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "F", "", "k", "()Z", "", "B", "(I)V", "a", "Landroid/widget/FrameLayout;", "getContainer", "()Landroid/widget/FrameLayout;", "Landroid/widget/RelativeLayout;", "b", "Landroid/widget/RelativeLayout;", BaseSei.f14624X, "()Landroid/widget/RelativeLayout;", "set_root", "(Landroid/widget/RelativeLayout;)V", "_root", "Lv/VFrame;", "c", "Lv/VFrame;", "get_head_container", "()Lv/VFrame;", "set_head_container", "(Lv/VFrame;)V", "_head_container", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", BLiveStormDanmakuGiftResourceType.f45294s, "()Lv/VDraweeView;", "set_avatar", "(Lv/VDraweeView;)V", "_avatar", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "e", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", BaseSei.f14626Z, "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_svga_player", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_svga_player", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "w", "()Landroid/widget/LinearLayout;", "set_ll_text", "(Landroid/widget/LinearLayout;)V", "_ll_text", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "A", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VMarqueeText;", "h", "Lv/VMarqueeText;", ResourceDirection.f39656v, "()Lv/VMarqueeText;", "set_content", "(Lv/VMarqueeText;)V", "_content", "Landroid/view/View;", BaseSei.f14625Y, "()Landroid/view/View;", "set_space_view", "(Landroid/view/View;)V", "_space_view", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "u", "()Landroid/widget/ImageView;", "set_close", "(Landroid/widget/ImageView;)V", "_close", "Ll/x0o;", "Lcom/p1/mobile/longlink/msg/intl_light_push/LongLinkIntlLightPushMessage$IntlLightPushInfo;", "Z", "isPlayingAnim", "Landroid/animation/Animator;", "n", "Landroid/animation/Animator;", "showAni", "o", "dismissAnim", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class e1o implements iam<x0o> {

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
    public x0o presenter;

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

    public e1o(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this.container = frameLayout;
    }

    /* JADX INFO: renamed from: E */
    public static final void m118993E(e1o e1oVar) {
        e1oVar.m119012p();
    }

    /* JADX INFO: renamed from: a */
    public static Unit m118994a(e1o e1oVar, View view) {
        view.getClass();
        e1oVar.m119012p();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m118997d(e1o e1oVar, View view) {
        view.getClass();
        LongLinkIntlLightPushMessage.IntlLightPushInfo intlLightPushInfo = e1oVar.pushInfo;
        if (intlLightPushInfo != null) {
            x0o x0oVar = e1oVar.presenter;
            if (x0oVar == null) {
                Intrinsics.m88391r("presenter");
                x0oVar = null;
            }
            x0oVar.m208889d4(intlLightPushInfo.getTextSchema());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m118998e(e1o e1oVar, View view) {
        view.getClass();
        LongLinkIntlLightPushMessage.IntlLightPushInfo intlLightPushInfo = e1oVar.pushInfo;
        if (intlLightPushInfo != null) {
            x0o x0oVar = e1oVar.presenter;
            if (x0oVar == null) {
                Intrinsics.m88391r("presenter");
                x0oVar = null;
            }
            x0oVar.m208889d4(intlLightPushInfo.getIconSchema());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final void m119000n(e1o e1oVar) {
        e1oVar.isPlayingAnim = true;
        e1oVar.container.setVisibility(0);
    }

    /* JADX INFO: renamed from: q */
    public static final void m119001q(e1o e1oVar) {
        e1oVar.m119019z().m69688o();
        e1oVar.isPlayingAnim = false;
        e1oVar.container.setVisibility(8);
        x0o x0oVar = e1oVar.presenter;
        if (x0oVar == null) {
            Intrinsics.m88391r("presenter");
            x0oVar = null;
        }
        x0oVar.m208888c4();
    }

    /* JADX INFO: renamed from: r */
    private final void m119002r() {
        czq.m113347c(m119013s(), new Function1() { // from class: l.y0o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1o.m118998e(this.f197026a, (View) obj);
            }
        });
        czq.m113347c(m119016w(), new Function1() { // from class: l.z0o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1o.m118997d(this.f202361a, (View) obj);
            }
        });
        czq.m113347c(m119014u(), new Function1() { // from class: l.a1o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1o.m118994a(this.f67826a, (View) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final TextView m119003A() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final void m119004B(int i) {
        this.container.setTranslationY(i);
    }

    /* JADX INFO: renamed from: C */
    public final void m119005C(LongLinkIntlLightPushMessage.IntlLightPushInfo pushInfo) {
        m119017x().setBackground(fc2.m124981k(n3d0.m161283g(pushInfo.getBackgroundStartColor()), n3d0.m161283g(pushInfo.getBackgroundEndColor()), 0, GradientDrawable.Orientation.LEFT_RIGHT));
        m119003A().setText(pushInfo.getTextFirst());
        m119003A().setTextColor(n3d0.m161283g(pushInfo.getTextFirstColor()));
        m119015v().setText(pushInfo.getTextSecond());
        m119015v().setTextColor(n3d0.m161283g(pushInfo.getTextSecondColor()));
        m119014u().setVisibility(!pushInfo.getCloseAuto() ? 0 : 8);
        m119018y().setVisibility(pushInfo.getCloseAuto() ? 0 : 8);
        if (pushInfo.getCloseAuto()) {
            l51.m152888H(getContext(), new Runnable() { // from class: l.b1o
                @Override // java.lang.Runnable
                public final void run() {
                    e1o.m118993E(this.f74388a);
                }
            }, pushInfo.getCloseTimeOutMs() == 0 ? 3000L : pushInfo.getCloseTimeOutMs());
        }
        m119013s().setVisibility(!pushInfo.getSvga() ? 0 : 8);
        m119019z().setVisibility(pushInfo.getSvga() ? 0 : 8);
        if (pushInfo.getSvga()) {
            m119019z().m69683j(pushInfo.getIcon(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } else {
            izs.m142871v("context_single_room", m119013s(), pushInfo.getIcon(), txq.m193530c(40), txq.m193530c(40), false, false, true, null);
        }
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        x0o x0oVar = this.presenter;
        if (x0oVar == null) {
            Intrinsics.m88391r("presenter");
            x0oVar = null;
        }
        Act act = x0oVar.act();
        act.getClass();
        return act;
    }

    /* JADX INFO: renamed from: F */
    public final void m119006F(@NotNull LongLinkIntlLightPushMessage.IntlLightPushInfo pushInfo) {
        pushInfo.getClass();
        this.pushInfo = pushInfo;
        m119010l();
        m119005C(pushInfo);
        m119011m();
    }

    @Override // p153l.iam
    public void destroy() {
        it0.m142007A(this.showAni);
        it0.m142007A(this.dismissAnim);
        this.container.setVisibility(0);
        this.container.removeAllViews();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final View m119007i(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM123582b = f1o.m123582b(this, inflater, parent);
        viewM123582b.getClass();
        return viewM123582b;
    }

    @Override // p153l.iam
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull x0o presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m119009k() {
        return !this.isPlayingAnim;
    }

    /* JADX INFO: renamed from: l */
    public final void m119010l() {
        if (this.container.getChildCount() <= 0) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            layoutInflaterFrom.getClass();
            View viewM119007i = m119007i(layoutInflaterFrom, null);
            qnp0.m177260c1(m119017x(), 0, 0, txq.m193530c(-12), 0, txq.m193530c(12));
            this.container.addView(viewM119007i);
            m119002r();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m119011m() {
        it0.m142007A(this.showAni);
        FrameLayout frameLayout = this.container;
        Animator animatorM132171q = gt0.m132171q(frameLayout, "translationX", ((float) frameLayout.getWidth()) == 0.0f ? txq.m193530c(183) : this.container.getWidth(), -txq.m193530c(36), 0.0f);
        this.showAni = animatorM132171q;
        if (animatorM132171q != null) {
            animatorM132171q.setDuration(600L).setInterpolator(new OvershootInterpolator());
            gt0.m132176v(this.showAni, new Runnable() { // from class: l.c1o
                @Override // java.lang.Runnable
                public final void run() {
                    e1o.m119000n(this.f79415a);
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m119012p() {
        it0.m142007A(this.dismissAnim);
        FrameLayout frameLayout = this.container;
        Animator animatorM132171q = gt0.m132171q(frameLayout, "translationX", 0.0f, frameLayout.getWidth());
        this.dismissAnim = animatorM132171q;
        if (animatorM132171q != null) {
            animatorM132171q.setDuration(150L);
            gt0.m132160f(this.dismissAnim, new Runnable() { // from class: l.d1o
                @Override // java.lang.Runnable
                public final void run() {
                    e1o.m119001q(this.f84704a);
                }
            });
            animatorM132171q.start();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VDraweeView m119013s() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final ImageView m119014u() {
        ImageView imageView = this._close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VMarqueeText m119015v() {
        VMarqueeText vMarqueeText = this._content;
        if (vMarqueeText != null) {
            return vMarqueeText;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final LinearLayout m119016w() {
        LinearLayout linearLayout = this._ll_text;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_ll_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final RelativeLayout m119017x() {
        RelativeLayout relativeLayout = this._root;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final View m119018y() {
        View view = this._space_view;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_space_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final AnimEffectPlayer m119019z() {
        AnimEffectPlayer animEffectPlayer = this._svga_player;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.m88391r("_svga_player");
        return null;
    }
}
