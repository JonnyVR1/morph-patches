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
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class qhs {

    /* JADX INFO: renamed from: a */
    public final LiveVChatGiftItemView f154510a;

    /* JADX INFO: renamed from: b */
    public ObjectAnimator f154511b;

    /* JADX INFO: renamed from: c */
    public ObjectAnimator f154512c;

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f154513d;

    /* JADX INFO: renamed from: e */
    public AnimatorSet f154514e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f154515f;

    /* JADX INFO: renamed from: g */
    public AnimatorSet f154516g;

    /* JADX INFO: renamed from: h */
    public final csl f154517h;

    public qhs(LiveVChatGiftItemView liveVChatGiftItemView, csl cslVar) {
        this.f154510a = liveVChatGiftItemView;
        this.f154517h = cslVar;
    }

    /* JADX INFO: renamed from: d */
    public final LongLinkChatMessage.LiveChatShadingConfig m174584d(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        LongLinkChatMessage.LiveChatShadingConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveChatShadingConfig.newBuilder();
        builderNewBuilder.setBackgroundColorConfig(m174585e(bLiveGiftShowTipsConfig));
        builderNewBuilder.setBorderColorConfig(m174588h(bLiveGiftShowTipsConfig));
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: e */
    public final LongLinkChatMessage.LiveBackgroundColorConfig m174585e(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        LongLinkChatMessage.LiveBackgroundColorConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveBackgroundColorConfig.newBuilder();
        builderNewBuilder.setGradientDirection(2L);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.background.startColor);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.background.endColor);
        builderNewBuilder.setTransparency(0L);
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: f */
    public final ObjectAnimator m174586f() {
        return ObjectAnimator.ofFloat(this.f154510a.f45189d, (Property<VDraweeView, Float>) View.ALPHA, 1.0f, 0.6f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.6f, 1.0f);
    }

    /* JADX INFO: renamed from: g */
    public final ObjectAnimator m174587g() {
        return ObjectAnimator.ofFloat(this.f154510a.f45189d, (Property<VDraweeView, Float>) View.ROTATION_Y, 0.0f, 90.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 90.0f, 0.0f);
    }

    /* JADX INFO: renamed from: h */
    public final LongLinkChatMessage.LiveBackgroundColorConfig m174588h(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        LongLinkChatMessage.LiveBackgroundColorConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveBackgroundColorConfig.newBuilder();
        builderNewBuilder.setGradientDirection(2L);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.strokeColor);
        builderNewBuilder.addColors(bLiveGiftShowTipsConfig.strokeColor);
        builderNewBuilder.setTransparency(0L);
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: i */
    public final ObjectAnimator m174589i() {
        return ObjectAnimator.ofFloat(this.f154510a.f45209x, (Property<VText, Float>) View.ALPHA, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f);
    }

    /* JADX INFO: renamed from: j */
    public final AnimatorSet m174590j() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f154510a.f45209x, (Property<VText, Float>) View.SCALE_X, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f154510a.f45209x, (Property<VText, Float>) View.SCALE_Y, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f154514e = animatorSet;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.f154514e.setDuration(4200L);
        return this.f154514e;
    }

    /* JADX INFO: renamed from: k */
    public final void m174591k() {
        dt0.m113503C(this.f154515f);
    }

    /* JADX INFO: renamed from: l */
    public void m174592l() {
        m174591k();
        m174593m();
    }

    /* JADX INFO: renamed from: m */
    public final void m174593m() {
        dt0.m113503C(this.f154516g);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m174594n(BLiveGiftItem bLiveGiftItem) {
        csl cslVar = this.f154517h;
        if (cslVar != null) {
            cslVar.mo108515p(bLiveGiftItem.f44377id);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Drawable m174595o(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig) {
        return m25.m152651a(m174584d(bLiveGiftShowTipsConfig), this.f154510a.f45209x, t100.m186890d(4.0f));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m174596p(Drawable drawable) {
        this.f154510a.f45209x.setBackground(drawable);
        if (this.f154513d == null) {
            this.f154513d = m174589i();
        }
        if (this.f154514e == null) {
            this.f154514e = m174590j();
        }
        if (this.f154516g == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f154516g = animatorSet;
            animatorSet.playTogether(this.f154513d, this.f154514e);
            this.f154516g.setDuration(4200L);
            this.f154516g.setStartDelay(600L);
        }
        this.f154516g.start();
    }

    /* JADX INFO: renamed from: q */
    public void m174597q(BLiveGiftItem bLiveGiftItem) {
        csl cslVar = this.f154517h;
        if (cslVar == null || !cslVar.mo108514o(bLiveGiftItem.f44377id)) {
            m174598r(bLiveGiftItem);
            m174599s(bLiveGiftItem);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m174598r(final BLiveGiftItem bLiveGiftItem) {
        m174591k();
        if (this.f154511b == null) {
            this.f154511b = m174586f();
        }
        if (this.f154512c == null) {
            this.f154512c = m174587g();
        }
        if (this.f154515f == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f154515f = animatorSet;
            animatorSet.setDuration(4200L);
            this.f154515f.playTogether(this.f154511b, this.f154512c);
            this.f154515f.setStartDelay(600L);
            bt0.m103733f(this.f154515f, new Runnable() { // from class: l.ohs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144044a.m174594n(bLiveGiftItem);
                }
            });
        }
        this.f154515f.start();
    }

    /* JADX INFO: renamed from: s */
    public final void m174599s(BLiveGiftItem bLiveGiftItem) {
        m174593m();
        BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig = bLiveGiftItem.showAnimRules.banner;
        if (TextUtils.isEmpty(bLiveGiftShowTipsConfig.content)) {
            return;
        }
        xdl0.m208344M(this.f154510a.f45209x, true);
        this.f154510a.f45209x.setAlpha(0.0f);
        this.f154510a.f45209x.setText(bLiveGiftShowTipsConfig.content);
        try {
            this.f154510a.f45209x.setTextColor(Color.parseColor(bLiveGiftShowTipsConfig.textColor));
        } catch (Exception unused) {
        }
        C22306c.just(bLiveGiftShowTipsConfig).compose(mkd0.m154965Q()).map(new w9j() { // from class: l.khs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f123205a.m174595o((BLiveGiftShowTipsConfig) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.mhs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133907a.m174596p((Drawable) obj);
            }
        }));
    }
}
