package p153l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftShowTipsConfig;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class qjs {

    /* JADX INFO: renamed from: a */
    public final LiveGiftItemView f158032a;

    /* JADX INFO: renamed from: b */
    public ObjectAnimator f158033b;

    /* JADX INFO: renamed from: c */
    public ObjectAnimator f158034c;

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f158035d;

    /* JADX INFO: renamed from: e */
    public AnimatorSet f158036e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f158037f;

    /* JADX INFO: renamed from: g */
    public AnimatorSet f158038g;

    /* JADX INFO: renamed from: h */
    public final qul f158039h;

    public qjs(LiveGiftItemView liveGiftItemView, qul qulVar) {
        this.f158032a = liveGiftItemView;
        this.f158039h = qulVar;
    }

    /* JADX INFO: renamed from: d */
    public final LongLinkChatMessage.LiveChatShadingConfig m176863d(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        LongLinkChatMessage.LiveChatShadingConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveChatShadingConfig.newBuilder();
        builderNewBuilder.setBackgroundColorConfig(m176864e(bLiveGiftShowTipsConfig));
        builderNewBuilder.setBorderColorConfig(m176867h(bLiveGiftShowTipsConfig));
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: e */
    public final LongLinkChatMessage.LiveBackgroundColorConfig m176864e(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        LongLinkChatMessage.LiveBackgroundColorConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveBackgroundColorConfig.newBuilder();
        builderNewBuilder.setGradientDirection(2L);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.background.startColor);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.background.endColor);
        builderNewBuilder.setTransparency(0L);
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: f */
    public final ObjectAnimator m176865f() {
        return ObjectAnimator.ofFloat(this.f158032a.f50362d, (Property<VDraweeView, Float>) View.ALPHA, 1.0f, 0.6f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.6f, 1.0f);
    }

    /* JADX INFO: renamed from: g */
    public final ObjectAnimator m176866g() {
        return ObjectAnimator.ofFloat(this.f158032a.f50362d, (Property<VDraweeView, Float>) View.ROTATION_Y, 0.0f, 90.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 90.0f, 0.0f);
    }

    /* JADX INFO: renamed from: h */
    public final LongLinkChatMessage.LiveBackgroundColorConfig m176867h(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        LongLinkChatMessage.LiveBackgroundColorConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveBackgroundColorConfig.newBuilder();
        builderNewBuilder.setGradientDirection(2L);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.strokeColor);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.strokeColor);
        builderNewBuilder.setTransparency(0L);
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: i */
    public final ObjectAnimator m176868i() {
        return ObjectAnimator.ofFloat(this.f158032a.f50382x, (Property<VText, Float>) View.ALPHA, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f);
    }

    /* JADX INFO: renamed from: j */
    public final AnimatorSet m176869j() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f158032a.f50382x, (Property<VText, Float>) View.SCALE_X, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f158032a.f50382x, (Property<VText, Float>) View.SCALE_Y, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f158036e = animatorSet;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.f158036e.setDuration(4200L);
        return this.f158036e;
    }

    /* JADX INFO: renamed from: k */
    public final void m176870k() {
        it0.m142009C(this.f158037f);
    }

    /* JADX INFO: renamed from: l */
    public void m176871l() {
        m176870k();
        m176872m();
    }

    /* JADX INFO: renamed from: m */
    public final void m176872m() {
        it0.m142009C(this.f158038g);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m176873n(BLiveGiftItem bLiveGiftItem) {
        qul qulVar = this.f158039h;
        if (qulVar != null) {
            qulVar.mo178159p(bLiveGiftItem.f45225id);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Drawable m176874o(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        return l35.m152669a(m176863d(bLiveGiftShowTipsConfig), this.f158032a.f50382x, qa00.m175859d(4.0f));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m176875p(Drawable drawable) {
        this.f158032a.f50382x.setBackground(drawable);
        if (this.f158035d == null) {
            this.f158035d = m176868i();
        }
        if (this.f158036e == null) {
            this.f158036e = m176869j();
        }
        if (this.f158038g == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f158038g = animatorSet;
            animatorSet.playTogether(this.f158035d, this.f158036e);
            this.f158038g.setDuration(4200L);
            this.f158038g.setStartDelay(600L);
        }
        this.f158038g.start();
    }

    /* JADX INFO: renamed from: q */
    public void m176876q(BLiveGiftItem bLiveGiftItem) {
        qul qulVar = this.f158039h;
        if (qulVar == null || !qulVar.mo178158o(bLiveGiftItem.f45225id)) {
            m176877r(bLiveGiftItem);
            m176878s(bLiveGiftItem);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m176877r(final BLiveGiftItem bLiveGiftItem) {
        m176870k();
        if (this.f158033b == null) {
            this.f158033b = m176865f();
        }
        if (this.f158034c == null) {
            this.f158034c = m176866g();
        }
        if (this.f158037f == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f158037f = animatorSet;
            animatorSet.setDuration(4200L);
            this.f158037f.playTogether(this.f158033b, this.f158034c);
            this.f158037f.setStartDelay(600L);
            gt0.m132160f(this.f158037f, new Runnable() { // from class: l.ojs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f147708a.m176873n(bLiveGiftItem);
                }
            });
        }
        this.f158037f.start();
    }

    /* JADX INFO: renamed from: s */
    public final void m176878s(BLiveGiftItem bLiveGiftItem) {
        m176872m();
        BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig = bLiveGiftItem.showAnimRules.banner;
        if (TextUtils.isEmpty(bLiveGiftShowTipsConfig.content)) {
            return;
        }
        bnl0.m105524M(this.f158032a.f50382x, true);
        this.f158032a.f50382x.setAlpha(0.0f);
        this.f158032a.f50382x.setText(bLiveGiftShowTipsConfig.content);
        try {
            this.f158032a.f50382x.setTextColor(Color.parseColor(bLiveGiftShowTipsConfig.textColor));
        } catch (Exception unused) {
        }
        C22421c.just(bLiveGiftShowTipsConfig).compose(psd0.m173606Q()).map(new qcj() { // from class: l.kjs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f127138a.m176874o((BLiveGiftShowTipsConfig) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.mjs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137159a.m176875p((Drawable) obj);
            }
        }));
    }
}
