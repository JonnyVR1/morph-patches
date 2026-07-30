package com.p051p1.mobile.putong.core.newui.messages;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.messages.ConversationMatchItemLayout;
import com.p051p1.mobile.putong.core.newui.view.LightningView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.fo0;
import p153l.gra;
import p153l.gt0;
import p153l.jj6;
import p153l.l51;
import p153l.l9c;
import p153l.psd0;
import p153l.qa00;
import p153l.scj;
import p153l.sfj0;
import p153l.uqb0;
import p153l.vj30;
import p153l.vx6;
import p153l.x20;
import p153l.y20;
import p153l.zjg;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationMatchItemLayout extends BaseConversationMatchItemLayout {

    /* JADX INFO: renamed from: k */
    public VFrame f25736k;

    /* JADX INFO: renamed from: l */
    public View f25737l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f25738m;

    /* JADX INFO: renamed from: n */
    public VFrame f25739n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f25740o;

    /* JADX INFO: renamed from: p */
    public VFrame f25741p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f25742q;

    /* JADX INFO: renamed from: r */
    public View f25743r;

    /* JADX INFO: renamed from: s */
    public VFrame f25744s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f25745t;

    /* JADX INFO: renamed from: u */
    public VFrame f25746u;

    /* JADX INFO: renamed from: v */
    public VImage f25747v;

    /* JADX INFO: renamed from: w */
    public VText f25748w;

    /* JADX INFO: renamed from: x */
    public LightningView f25749x;

    /* JADX INFO: renamed from: y */
    public final String f25750y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationMatchItemLayout$a */
    public class C8274a extends gt0.C17308j {
        public C8274a() {
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ConversationMatchItemLayout.this.m41576R();
        }
    }

    public ConversationMatchItemLayout(Context context) {
        super(context);
        this.f25750y = "ConversationMatchItemLayout";
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m42219X(Conversation conversation) {
        Conversation conversationMo225055clone = conversation.mo225055clone();
        conversationMo225055clone.otherStatus = "invalid";
        CoreModule.f18272k.f115545m.upsert(conversationMo225055clone);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m42220Y(Runnable runnable) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m42226f0(bkj0 bkj0Var) {
        final Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(((User) bkj0Var.f77082b).f56859id);
        if (NullChecker.m82486a(conversationM34219zp)) {
            l9c.m153394o().m153397B(new x20() { // from class: l.cj6
                @Override // p153l.x20
                public final void call() {
                    ConversationMatchItemLayout.m42219X(conversationM34219zp);
                }
            });
        }
    }

    private float getTitleRemoveWidth() {
        return this.f25347c.f25486e.getPaint().measureText(getResources().getString(R$string.f18429Ej)) + qa00.m175859d(42.0f);
    }

    /* JADX INFO: renamed from: v0 */
    private void m42227v0() {
        postDelayed(new Runnable() { // from class: l.zi6
            @Override // java.lang.Runnable
            public final void run() {
                this.f204494a.m42237r0();
            }
        }, 100L);
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.BaseConversationMatchItemLayout
    /* JADX INFO: renamed from: C */
    public void mo41565C(final Runnable runnable) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(m42229h0(), m42230j0(true));
        gt0.m132176v(animatorSet, new Runnable() { // from class: l.dj6
            @Override // java.lang.Runnable
            public final void run() {
                this.f88781a.m42232l0();
            }
        });
        gt0.m132160f(animatorSet, new Runnable() { // from class: l.ej6
            @Override // java.lang.Runnable
            public final void run() {
                ConversationMatchItemLayout.m42220Y(runnable);
            }
        });
        animatorSet.start();
        m42241w0();
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.BaseConversationMatchItemLayout
    /* JADX INFO: renamed from: P */
    public void mo41574P(Act act, ConversationHeadRecommendLayout conversationHeadRecommendLayout, final ConversationHeadRecommendLayout.C8266c c8266c) {
        this.f25347c = conversationHeadRecommendLayout;
        if (NullChecker.m82486a(c8266c) && NullChecker.m82486a(c8266c.f25519d)) {
            this.f25737l.setBackgroundResource(dbc0.f87073i1);
            if (c8266c.f25516a != 14) {
                this.f25347c.f25494m.mo68557c(act, psd0.m173626s(CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20381e0.m116483Ka(c8266c.f25519d), (TextUtils.isEmpty(c8266c.f25535t) || c8266c.f25516a != ConversationHeadRecommendLayout.C8266c.f25511F) ? C22421c.just(null) : CoreModule.f18264c.f20381e0.m116483Ka(c8266c.f25535t), new scj() { // from class: l.xi6
                    @Override // p153l.scj
                    /* JADX INFO: renamed from: a */
                    public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                        return new bkj0((User) obj, (User) obj2, (User) obj3);
                    }
                })).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.aj6
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f71790a.m42236q0(c8266c, (bkj0) obj);
                    }
                }));
                return;
            }
            if (NullChecker.m82486a(c8266c.f25541z)) {
                m42240u0();
                this.f25737l.setBackgroundResource(dbc0.f87137k1);
                bnl0.m105507D0(qa00.m175859d(115.0f), this.f25736k);
                vj30.m201486x(act, c8266c, this.f25745t, this.f25748w, this.f25747v, this.f25749x, this.f25736k);
                this.f25749x.setTextColor(Color.parseColor("#EAB442"));
                return;
            }
            if (NullChecker.m82486a(c8266c.f25539x)) {
                m42240u0();
                this.f25737l.setBackgroundResource(dbc0.f87104j1);
                bnl0.m105507D0(qa00.m175859d(115.0f), this.f25736k);
                vj30.m201485w(act, this.f25347c.f25494m, c8266c, this.f25745t, this.f25748w, this.f25747v, this.f25749x, this.f25736k);
                this.f25749x.setTextColor(Color.parseColor("#75C4FF"));
                return;
            }
            if (NullChecker.m82486a(c8266c.f25540y)) {
                m42240u0();
                this.f25737l.setBackgroundResource(dbc0.f87073i1);
                bnl0.m105507D0(qa00.m175859d(115.0f), this.f25736k);
                vj30.m201484v(act, this.f25347c.f25494m, c8266c, this.f25745t, this.f25748w, this.f25747v, this.f25749x, this.f25736k);
                this.f25749x.setTextColor(Color.parseColor("#FF8231"));
                return;
            }
            m42240u0();
            this.f25737l.setBackgroundResource(dbc0.f87073i1);
            bnl0.m105507D0(qa00.m175859d(115.0f), this.f25736k);
            vj30.m201483u(act, c8266c, this.f25745t, this.f25748w, this.f25747v, this.f25749x, this.f25736k);
            this.f25749x.setTextColor(Color.parseColor("#FF8231"));
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m42228g0(View view) {
        jj6.m145020a(this, view);
    }

    /* JADX INFO: renamed from: h0 */
    public Animator m42229h0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(gt0.m132169o(this.f25736k, BaseConversationMatchItemLayout.f25344j, 0, qa00.m175859d(115.0f)));
        arrayList.add(ObjectAnimator.ofFloat(this.f25736k, "alpha", 0.0f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f25738m, "translationX", this.f25353i));
        arrayList.add(ObjectAnimator.ofFloat(this.f25738m, "translationY", this.f25353i));
        arrayList.add(ObjectAnimator.ofFloat(this.f25738m, "scaleX", this.f25349e));
        arrayList.add(ObjectAnimator.ofFloat(this.f25738m, "scaleY", this.f25349e));
        arrayList.add(ObjectAnimator.ofFloat(this.f25741p, "translationX", this.f25352h));
        arrayList.add(ObjectAnimator.ofFloat(this.f25741p, "translationY", this.f25353i));
        arrayList.add(ObjectAnimator.ofFloat(this.f25741p, "scaleX", this.f25349e));
        arrayList.add(ObjectAnimator.ofFloat(this.f25741p, "scaleY", this.f25349e));
        arrayList.add(ObjectAnimator.ofFloat(this.f25749x, "translationY", this.f25353i));
        arrayList.add(ObjectAnimator.ofFloat(this.f25749x, "scaleX", this.f25349e));
        arrayList.add(ObjectAnimator.ofFloat(this.f25749x, "scaleY", this.f25349e));
        arrayList.add(ObjectAnimator.ofFloat(this.f25749x, "alpha", this.f25350f));
        arrayList.add(ObjectAnimator.ofFloat(this.f25347c.f25483b, "translationX", -getTitleRemoveWidth(), 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f25347c.f25487f, "alpha", this.f25351g));
        arrayList.add(ObjectAnimator.ofFloat(this.f25347c.f25486e, "alpha", this.f25350f));
        arrayList.add(ObjectAnimator.ofFloat(this.f25347c.f25484c, "alpha", this.f25350f));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(300L);
        animatorSet.addListener(new C8274a());
        animatorSet.setInterpolator(new DecelerateInterpolator());
        return animatorSet;
    }

    /* JADX INFO: renamed from: j0 */
    public AnimatorSet m42230j0(boolean z) {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("translationX", 0.0f, qa00.m175859d(6.0f), 0.0f);
        PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat("translationX", 0.0f, -qa00.m175859d(6.0f), 0.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f25738m, propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(z ? 2 : 1);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.f25741p, propertyValuesHolderOfFloat2);
        objectAnimatorOfPropertyValuesHolder2.setRepeatCount(z ? 2 : 1);
        gt0.m132176v(objectAnimatorOfPropertyValuesHolder2, new Runnable() { // from class: l.hj6
            @Override // java.lang.Runnable
            public final void run() {
                this.f110161a.m42233m0();
            }
        });
        gt0.m132172r(objectAnimatorOfPropertyValuesHolder2, new Runnable() { // from class: l.ij6
            @Override // java.lang.Runnable
            public final void run() {
                this.f115191a.m42235p0();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new zjg());
        animatorSet.setDuration(1600L);
        animatorSet.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        return animatorSet;
    }

    /* JADX INFO: renamed from: k0 */
    public Picture.ImageUri m42231k0(User user) {
        return vx6.m203838b(user).profileSmall();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m42232l0() {
        bnl0.m105524M(this.f25736k, true);
        bnl0.m105524M(this.f25347c.f25484c, true);
        bnl0.m105524M(this.f25347c.f25486e, true);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m42233m0() {
        ViewGroup.LayoutParams layoutParams = this.f25736k.getLayoutParams();
        if (layoutParams.width < qa00.m175859d(100.0f)) {
            layoutParams.width = qa00.m175859d(115.0f);
            this.f25736k.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m42234o0() {
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/2940b12f-9afb-4c57-8783-a2c4e0ab501710.so").autoPlay(true).repeatCount(1).into(this.f25347c.f25491j);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42228g0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m42235p0() {
        if (!NullChecker.m82486a(ConversationHeadRecommendLayout.f25481x) || ConversationHeadRecommendLayout.f25481x.f25516a == ConversationHeadRecommendLayout.C8266c.f25511F) {
            return;
        }
        postDelayed(new Runnable() { // from class: l.yi6
            @Override // java.lang.Runnable
            public final void run() {
                this.f200018a.m42234o0();
            }
        }, 600L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m42236q0(ConversationHeadRecommendLayout.C8266c c8266c, final bkj0 bkj0Var) {
        if (NullChecker.m82486a(bkj0Var.f77082b) && ((User) bkj0Var.f77082b).isBanedOrInactivated()) {
            l51.m152919y(new Runnable() { // from class: l.bj6
                @Override // java.lang.Runnable
                public final void run() {
                    ConversationMatchItemLayout.m42226f0(bkj0Var);
                }
            });
            return;
        }
        this.f25738m.setPivotX(qa00.m175859d(19.0f));
        this.f25738m.setPivotY(qa00.m175859d(19.0f));
        this.f25741p.setPivotX(qa00.m175859d(28.0f));
        this.f25741p.setPivotY(qa00.m175859d(28.0f));
        this.f25737l.setPivotX(qa00.m175859d(57.5f));
        this.f25737l.setPivotY(qa00.m175859d(57.5f));
        LightningView lightningView = this.f25749x;
        lightningView.setPivotX(lightningView.getWidth() / 2.0f);
        LightningView lightningView2 = this.f25749x;
        lightningView2.setPivotY(lightningView2.getHeight() / 2.0f);
        bnl0.m105524M(this.f25744s, false);
        bnl0.m105524M(this.f25746u, true);
        bnl0.m105524M(this.f25738m, true);
        bnl0.m105524M(this.f25739n, true);
        bnl0.m105524M(this.f25741p, true);
        int i = c8266c.f25516a;
        int i2 = ConversationHeadRecommendLayout.C8266c.f25511F;
        View view = this.f25737l;
        if (i == i2) {
            view.setBackgroundResource(dbc0.f87529w);
            this.f25749x.setTextColor(Color.parseColor("#66000000"));
        } else {
            view.setBackgroundResource(dbc0.f87073i1);
            this.f25749x.setTextColor(Color.parseColor("#ff8231"));
        }
        bnl0.m105524M(this.f25743r, c8266c.f25516a == ConversationHeadRecommendLayout.C8266c.f25509D);
        if (bnl0.m105529O0(this.f25743r)) {
            sfj0.m185601h("e_new_match_red_dot", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
        }
        if (NullChecker.m82486a(bkj0Var.f77083c)) {
            uqb0.f180374G.m127125Q0(this.f25738m, m42231k0((User) bkj0Var.f77083c));
        } else if (c8266c.f25516a == ConversationHeadRecommendLayout.C8266c.f25511F) {
            uqb0.f180374G.m127125Q0(this.f25745t, m42231k0((User) bkj0Var.f77082b));
            bnl0.m105524M(this.f25744s, true);
            bnl0.m105524M(this.f25746u, false);
            bnl0.m105524M(this.f25738m, false);
            bnl0.m105524M(this.f25739n, false);
            bnl0.m105524M(this.f25741p, false);
        } else {
            uqb0.f180374G.m127125Q0(this.f25738m, m42231k0((User) bkj0Var.f77081a));
        }
        if (!this.f25348d && (TextUtils.isEmpty(this.f25346b) || TextUtils.equals(this.f25346b, c8266c.f25519d))) {
            m41573O((User) bkj0Var.f77082b, this.f25742q);
            m41573O((User) bkj0Var.f77082b, this.f25740o);
        }
        m42242x0(c8266c);
        bnl0.m105525M0(this.f25739n, false);
        m41567F(this.f25736k, c8266c);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m42237r0() {
        this.f25749x.m44903w();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m42238s0() {
        SVGALoader.with(getContext()).from(gra.m131778z() ? "https://auto.tancdn.com/v1/raw/e46ccc9d-2050-4521-a0c0-a238b0ef7d8914.svga" : "https://auto.tancdn.com/v1/raw/026b84ba-0fad-4b15-b804-22929bfdce5110.so").autoPlay(true).repeatCount(1).frameMode(SVGAnimationView.FrameMode.BEFORE).into(this.f25347c.f25485d);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m42239t0() {
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/a24ee24d-d950-42f6-b25e-af45e09f756810.so").autoPlay(true).repeatCount(1).into(this.f25347c.f25491j);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m42240u0() {
        bnl0.m105524M(this.f25738m, false);
        bnl0.m105524M(this.f25739n, false);
        bnl0.m105524M(this.f25741p, false);
        bnl0.m105524M(this.f25744s, true);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m42241w0() {
        post(new Runnable() { // from class: l.fj6
            @Override // java.lang.Runnable
            public final void run() {
                this.f99302a.m42238s0();
            }
        });
        if (NullChecker.m82486a(ConversationHeadRecommendLayout.f25481x) && ConversationHeadRecommendLayout.f25481x.f25516a != ConversationHeadRecommendLayout.C8266c.f25511F) {
            postDelayed(new Runnable() { // from class: l.gj6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f104603a.m42239t0();
                }
            }, 200L);
        }
        m42227v0();
    }

    /* JADX INFO: renamed from: x0 */
    public void m42242x0(ConversationHeadRecommendLayout.C8266c c8266c) {
        if (NullChecker.m82486a(this.f25749x)) {
            this.f25749x.setText("你有1个新配对");
        }
    }

    public ConversationMatchItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25750y = "ConversationMatchItemLayout";
    }

    public ConversationMatchItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25750y = "ConversationMatchItemLayout";
    }
}
