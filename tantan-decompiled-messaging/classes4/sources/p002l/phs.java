package p002l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGiftShowTipsConfig;
import l.bt0;
import l.dt0;
import l.e30;
import l.ffw;
import l.jo0;
import l.mkd0;
import l.t100;
import l.w9j;
import l.xdl0;
import rx.c;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class phs {

    /* JADX INFO: renamed from: a */
    public final LiveGiftItemView f17372a;

    /* JADX INFO: renamed from: b */
    public ObjectAnimator f17373b;

    /* JADX INFO: renamed from: c */
    public ObjectAnimator f17374c;

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f17375d;

    /* JADX INFO: renamed from: e */
    public AnimatorSet f17376e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f17377f;

    /* JADX INFO: renamed from: g */
    public AnimatorSet f17378g;

    /* JADX INFO: renamed from: h */
    public final csl f17379h;

    public phs(LiveGiftItemView liveGiftItemView, csl cslVar) {
        this.f17372a = liveGiftItemView;
        this.f17379h = cslVar;
    }

    /* JADX INFO: renamed from: d */
    public final LongLinkChatMessage.LiveChatShadingConfig m20317d(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        LongLinkChatMessage.LiveChatShadingConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveChatShadingConfig.newBuilder();
        builderNewBuilder.setBackgroundColorConfig(m20318e(bLiveGiftShowTipsConfig));
        builderNewBuilder.setBorderColorConfig(m20321h(bLiveGiftShowTipsConfig));
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: e */
    public final LongLinkChatMessage.LiveBackgroundColorConfig m20318e(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        LongLinkChatMessage.LiveBackgroundColorConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveBackgroundColorConfig.newBuilder();
        builderNewBuilder.setGradientDirection(2L);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.background.startColor);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.background.endColor);
        builderNewBuilder.setTransparency(0L);
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: f */
    public final ObjectAnimator m20319f() {
        return ObjectAnimator.ofFloat(this.f17372a.f5556d, (Property<VDraweeView, Float>) View.ALPHA, 1.0f, 0.6f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.6f, 1.0f);
    }

    /* JADX INFO: renamed from: g */
    public final ObjectAnimator m20320g() {
        return ObjectAnimator.ofFloat(this.f17372a.f5556d, (Property<VDraweeView, Float>) View.ROTATION_Y, 0.0f, 90.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 90.0f, 0.0f);
    }

    /* JADX INFO: renamed from: h */
    public final LongLinkChatMessage.LiveBackgroundColorConfig m20321h(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        LongLinkChatMessage.LiveBackgroundColorConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveBackgroundColorConfig.newBuilder();
        builderNewBuilder.setGradientDirection(2L);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.strokeColor);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.strokeColor);
        builderNewBuilder.setTransparency(0L);
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: i */
    public final ObjectAnimator m20322i() {
        return ObjectAnimator.ofFloat(this.f17372a.f5576x, (Property<VText, Float>) View.ALPHA, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f);
    }

    /* JADX INFO: renamed from: j */
    public final AnimatorSet m20323j() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17372a.f5576x, (Property<VText, Float>) View.SCALE_X, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f17372a.f5576x, (Property<VText, Float>) View.SCALE_Y, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f17376e = animatorSet;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.f17376e.setDuration(4200L);
        return this.f17376e;
    }

    /* JADX INFO: renamed from: k */
    public final void m20324k() {
        dt0.C(this.f17377f);
    }

    /* JADX INFO: renamed from: l */
    public void m20325l() {
        m20324k();
        m20326m();
    }

    /* JADX INFO: renamed from: m */
    public final void m20326m() {
        dt0.C(this.f17378g);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m20327n(BLiveGiftItem bLiveGiftItem) {
        csl cslVar = this.f17379h;
        if (cslVar != null) {
            cslVar.mo11348p(bLiveGiftItem.id);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Drawable m20328o(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        return m25.m17669a(m20317d(bLiveGiftShowTipsConfig), this.f17372a.f5576x, t100.d(4.0f));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m20329p(Drawable drawable) {
        this.f17372a.f5576x.setBackground(drawable);
        if (this.f17375d == null) {
            this.f17375d = m20322i();
        }
        if (this.f17376e == null) {
            this.f17376e = m20323j();
        }
        if (this.f17378g == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f17378g = animatorSet;
            animatorSet.playTogether(this.f17375d, this.f17376e);
            this.f17378g.setDuration(4200L);
            this.f17378g.setStartDelay(600L);
        }
        this.f17378g.start();
    }

    /* JADX INFO: renamed from: q */
    public void m20330q(BLiveGiftItem bLiveGiftItem) {
        csl cslVar = this.f17379h;
        if (cslVar == null || !cslVar.mo11347o(bLiveGiftItem.id)) {
            m20331r(bLiveGiftItem);
            m20332s(bLiveGiftItem);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m20331r(final BLiveGiftItem bLiveGiftItem) {
        m20324k();
        if (this.f17373b == null) {
            this.f17373b = m20319f();
        }
        if (this.f17374c == null) {
            this.f17374c = m20320g();
        }
        if (this.f17377f == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f17377f = animatorSet;
            animatorSet.setDuration(4200L);
            this.f17377f.playTogether(this.f17373b, this.f17374c);
            this.f17377f.setStartDelay(600L);
            bt0.f(this.f17377f, new Runnable() { // from class: l.nhs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16039a.m20327n(bLiveGiftItem);
                }
            });
        }
        this.f17377f.start();
    }

    /* JADX INFO: renamed from: s */
    public final void m20332s(BLiveGiftItem bLiveGiftItem) {
        m20326m();
        BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig = bLiveGiftItem.showAnimRules.banner;
        if (TextUtils.isEmpty(bLiveGiftShowTipsConfig.content)) {
            return;
        }
        xdl0.M(this.f17372a.f5576x, true);
        this.f17372a.f5576x.setAlpha(0.0f);
        this.f17372a.f5576x.setText(bLiveGiftShowTipsConfig.content);
        try {
            this.f17372a.f5576x.setTextColor(Color.parseColor(bLiveGiftShowTipsConfig.textColor));
        } catch (Exception unused) {
        }
        c.just(bLiveGiftShowTipsConfig).compose(mkd0.Q()).map(new w9j() { // from class: l.jhs
            public final Object call(Object obj) {
                return this.f13777a.m20328o((BLiveGiftShowTipsConfig) obj);
            }
        }).observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.lhs
            public final void call(Object obj) {
                this.f14879a.m20329p((Drawable) obj);
            }
        }));
    }
}
