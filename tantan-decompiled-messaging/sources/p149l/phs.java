package p149l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftShowTipsConfig;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class phs {

    /* JADX INFO: renamed from: a */
    public final LiveGiftItemView f149042a;

    /* JADX INFO: renamed from: b */
    public ObjectAnimator f149043b;

    /* JADX INFO: renamed from: c */
    public ObjectAnimator f149044c;

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f149045d;

    /* JADX INFO: renamed from: e */
    public AnimatorSet f149046e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f149047f;

    /* JADX INFO: renamed from: g */
    public AnimatorSet f149048g;

    /* JADX INFO: renamed from: h */
    public final csl f149049h;

    public phs(LiveGiftItemView liveGiftItemView, csl cslVar) {
        this.f149042a = liveGiftItemView;
        this.f149049h = cslVar;
    }

    /* JADX INFO: renamed from: d */
    public final LongLinkChatMessage.LiveChatShadingConfig m169130d(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        LongLinkChatMessage.LiveChatShadingConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveChatShadingConfig.newBuilder();
        builderNewBuilder.setBackgroundColorConfig(m169131e(bLiveGiftShowTipsConfig));
        builderNewBuilder.setBorderColorConfig(m169134h(bLiveGiftShowTipsConfig));
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: e */
    public final LongLinkChatMessage.LiveBackgroundColorConfig m169131e(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        LongLinkChatMessage.LiveBackgroundColorConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveBackgroundColorConfig.newBuilder();
        builderNewBuilder.setGradientDirection(2L);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.background.startColor);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.background.endColor);
        builderNewBuilder.setTransparency(0L);
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: f */
    public final ObjectAnimator m169132f() {
        return ObjectAnimator.ofFloat(this.f149042a.f49514d, (Property<VDraweeView, Float>) View.ALPHA, 1.0f, 0.6f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.6f, 1.0f);
    }

    /* JADX INFO: renamed from: g */
    public final ObjectAnimator m169133g() {
        return ObjectAnimator.ofFloat(this.f149042a.f49514d, (Property<VDraweeView, Float>) View.ROTATION_Y, 0.0f, 90.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 90.0f, 0.0f);
    }

    /* JADX INFO: renamed from: h */
    public final LongLinkChatMessage.LiveBackgroundColorConfig m169134h(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        LongLinkChatMessage.LiveBackgroundColorConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveBackgroundColorConfig.newBuilder();
        builderNewBuilder.setGradientDirection(2L);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.strokeColor);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.strokeColor);
        builderNewBuilder.setTransparency(0L);
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: i */
    public final ObjectAnimator m169135i() {
        return ObjectAnimator.ofFloat(this.f149042a.f49534x, (Property<VText, Float>) View.ALPHA, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f);
    }

    /* JADX INFO: renamed from: j */
    public final AnimatorSet m169136j() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f149042a.f49534x, (Property<VText, Float>) View.SCALE_X, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f149042a.f49534x, (Property<VText, Float>) View.SCALE_Y, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f149046e = animatorSet;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.f149046e.setDuration(4200L);
        return this.f149046e;
    }

    /* JADX INFO: renamed from: k */
    public final void m169137k() {
        dt0.m113503C(this.f149047f);
    }

    /* JADX INFO: renamed from: l */
    public void m169138l() {
        m169137k();
        m169139m();
    }

    /* JADX INFO: renamed from: m */
    public final void m169139m() {
        dt0.m113503C(this.f149048g);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m169140n(BLiveGiftItem bLiveGiftItem) {
        csl cslVar = this.f149049h;
        if (cslVar != null) {
            cslVar.mo108515p(bLiveGiftItem.f44377id);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Drawable m169141o(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        return m25.m152651a(m169130d(bLiveGiftShowTipsConfig), this.f149042a.f49534x, t100.m186890d(4.0f));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m169142p(Drawable drawable) {
        this.f149042a.f49534x.setBackground(drawable);
        if (this.f149045d == null) {
            this.f149045d = m169135i();
        }
        if (this.f149046e == null) {
            this.f149046e = m169136j();
        }
        if (this.f149048g == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f149048g = animatorSet;
            animatorSet.playTogether(this.f149045d, this.f149046e);
            this.f149048g.setDuration(4200L);
            this.f149048g.setStartDelay(600L);
        }
        this.f149048g.start();
    }

    /* JADX INFO: renamed from: q */
    public void m169143q(BLiveGiftItem bLiveGiftItem) {
        csl cslVar = this.f149049h;
        if (cslVar == null || !cslVar.mo108514o(bLiveGiftItem.f44377id)) {
            m169144r(bLiveGiftItem);
            m169145s(bLiveGiftItem);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m169144r(final BLiveGiftItem bLiveGiftItem) {
        m169137k();
        if (this.f149043b == null) {
            this.f149043b = m169132f();
        }
        if (this.f149044c == null) {
            this.f149044c = m169133g();
        }
        if (this.f149047f == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f149047f = animatorSet;
            animatorSet.setDuration(4200L);
            this.f149047f.playTogether(this.f149043b, this.f149044c);
            this.f149047f.setStartDelay(600L);
            bt0.m103733f(this.f149047f, new Runnable() { // from class: l.nhs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f139029a.m169140n(bLiveGiftItem);
                }
            });
        }
        this.f149047f.start();
    }

    /* JADX INFO: renamed from: s */
    public final void m169145s(BLiveGiftItem bLiveGiftItem) {
        m169139m();
        BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig = bLiveGiftItem.showAnimRules.banner;
        if (TextUtils.isEmpty(bLiveGiftShowTipsConfig.content)) {
            return;
        }
        xdl0.m208344M(this.f149042a.f49534x, true);
        this.f149042a.f49534x.setAlpha(0.0f);
        this.f149042a.f49534x.setText(bLiveGiftShowTipsConfig.content);
        try {
            this.f149042a.f49534x.setTextColor(Color.parseColor(bLiveGiftShowTipsConfig.textColor));
        } catch (Exception unused) {
        }
        C22306c.just(bLiveGiftShowTipsConfig).compose(mkd0.m154965Q()).map(new w9j() { // from class: l.jhs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f118014a.m169141o((BLiveGiftShowTipsConfig) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.lhs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128136a.m169142p((Drawable) obj);
            }
        }));
    }
}
