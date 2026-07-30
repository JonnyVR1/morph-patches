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
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class rjs {

    /* JADX INFO: renamed from: a */
    public final LiveVChatGiftItemView f163504a;

    /* JADX INFO: renamed from: b */
    public ObjectAnimator f163505b;

    /* JADX INFO: renamed from: c */
    public ObjectAnimator f163506c;

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f163507d;

    /* JADX INFO: renamed from: e */
    public AnimatorSet f163508e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f163509f;

    /* JADX INFO: renamed from: g */
    public AnimatorSet f163510g;

    /* JADX INFO: renamed from: h */
    public final qul f163511h;

    public rjs(LiveVChatGiftItemView liveVChatGiftItemView, qul qulVar) {
        this.f163504a = liveVChatGiftItemView;
        this.f163511h = qulVar;
    }

    /* JADX INFO: renamed from: d */
    public final LongLinkChatMessage.LiveChatShadingConfig m181746d(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        LongLinkChatMessage.LiveChatShadingConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveChatShadingConfig.newBuilder();
        builderNewBuilder.setBackgroundColorConfig(m181747e(bLiveGiftShowTipsConfig));
        builderNewBuilder.setBorderColorConfig(m181750h(bLiveGiftShowTipsConfig));
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: e */
    public final LongLinkChatMessage.LiveBackgroundColorConfig m181747e(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        LongLinkChatMessage.LiveBackgroundColorConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveBackgroundColorConfig.newBuilder();
        builderNewBuilder.setGradientDirection(2L);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.background.startColor);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.background.endColor);
        builderNewBuilder.setTransparency(0L);
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: f */
    public final ObjectAnimator m181748f() {
        return ObjectAnimator.ofFloat(this.f163504a.f46037d, (Property<VDraweeView, Float>) View.ALPHA, 1.0f, 0.6f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.6f, 1.0f);
    }

    /* JADX INFO: renamed from: g */
    public final ObjectAnimator m181749g() {
        return ObjectAnimator.ofFloat(this.f163504a.f46037d, (Property<VDraweeView, Float>) View.ROTATION_Y, 0.0f, 90.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 90.0f, 0.0f);
    }

    /* JADX INFO: renamed from: h */
    public final LongLinkChatMessage.LiveBackgroundColorConfig m181750h(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        LongLinkChatMessage.LiveBackgroundColorConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveBackgroundColorConfig.newBuilder();
        builderNewBuilder.setGradientDirection(2L);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.strokeColor);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.strokeColor);
        builderNewBuilder.setTransparency(0L);
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: i */
    public final ObjectAnimator m181751i() {
        return ObjectAnimator.ofFloat(this.f163504a.f46057x, (Property<VText, Float>) View.ALPHA, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f);
    }

    /* JADX INFO: renamed from: j */
    public final AnimatorSet m181752j() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f163504a.f46057x, (Property<VText, Float>) View.SCALE_X, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f163504a.f46057x, (Property<VText, Float>) View.SCALE_Y, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f163508e = animatorSet;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.f163508e.setDuration(4200L);
        return this.f163508e;
    }

    /* JADX INFO: renamed from: k */
    public final void m181753k() {
        it0.m142009C(this.f163509f);
    }

    /* JADX INFO: renamed from: l */
    public void m181754l() {
        m181753k();
        m181755m();
    }

    /* JADX INFO: renamed from: m */
    public final void m181755m() {
        it0.m142009C(this.f163510g);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m181756n(BLiveGiftItem bLiveGiftItem) {
        qul qulVar = this.f163511h;
        if (qulVar != null) {
            qulVar.mo178159p(bLiveGiftItem.f45225id);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Drawable m181757o(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        return l35.m152669a(m181746d(bLiveGiftShowTipsConfig), this.f163504a.f46057x, qa00.m175859d(4.0f));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m181758p(Drawable drawable) {
        this.f163504a.f46057x.setBackground(drawable);
        if (this.f163507d == null) {
            this.f163507d = m181751i();
        }
        if (this.f163508e == null) {
            this.f163508e = m181752j();
        }
        if (this.f163510g == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f163510g = animatorSet;
            animatorSet.playTogether(this.f163507d, this.f163508e);
            this.f163510g.setDuration(4200L);
            this.f163510g.setStartDelay(600L);
        }
        this.f163510g.start();
    }

    /* JADX INFO: renamed from: q */
    public void m181759q(BLiveGiftItem bLiveGiftItem) {
        qul qulVar = this.f163511h;
        if (qulVar == null || !qulVar.mo178158o(bLiveGiftItem.f45225id)) {
            m181760r(bLiveGiftItem);
            m181761s(bLiveGiftItem);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m181760r(final BLiveGiftItem bLiveGiftItem) {
        m181753k();
        if (this.f163505b == null) {
            this.f163505b = m181748f();
        }
        if (this.f163506c == null) {
            this.f163506c = m181749g();
        }
        if (this.f163509f == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f163509f = animatorSet;
            animatorSet.setDuration(4200L);
            this.f163509f.playTogether(this.f163505b, this.f163506c);
            this.f163509f.setStartDelay(600L);
            gt0.m132160f(this.f163509f, new Runnable() { // from class: l.pjs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f152737a.m181756n(bLiveGiftItem);
                }
            });
        }
        this.f163509f.start();
    }

    /* JADX INFO: renamed from: s */
    public final void m181761s(BLiveGiftItem bLiveGiftItem) {
        m181755m();
        BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig = bLiveGiftItem.showAnimRules.banner;
        if (TextUtils.isEmpty(bLiveGiftShowTipsConfig.content)) {
            return;
        }
        bnl0.m105524M(this.f163504a.f46057x, true);
        this.f163504a.f46057x.setAlpha(0.0f);
        this.f163504a.f46057x.setText(bLiveGiftShowTipsConfig.content);
        try {
            this.f163504a.f46057x.setTextColor(Color.parseColor(bLiveGiftShowTipsConfig.textColor));
        } catch (Exception unused) {
        }
        C22421c.just(bLiveGiftShowTipsConfig).compose(psd0.m173606Q()).map(new qcj() { // from class: l.ljs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f132387a.m181757o((BLiveGiftShowTipsConfig) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.njs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142336a.m181758p((Drawable) obj);
            }
        }));
    }
}
