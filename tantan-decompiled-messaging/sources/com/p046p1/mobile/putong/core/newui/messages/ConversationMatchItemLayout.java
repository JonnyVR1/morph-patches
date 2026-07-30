package com.p046p1.mobile.putong.core.newui.messages;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.messages.ConversationMatchItemLayout;
import com.p046p1.mobile.putong.core.newui.view.LightningView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p149l.bt0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.f8c;
import p149l.gi6;
import p149l.hb30;
import p149l.jo0;
import p149l.lig;
import p149l.mkd0;
import p149l.o6j0;
import p149l.qib0;
import p149l.sw6;
import p149l.t100;
import p149l.upa;
import p149l.x2c0;
import p149l.xaj0;
import p149l.xdl0;
import p149l.y9j;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationMatchItemLayout extends BaseConversationMatchItemLayout {

    /* JADX INFO: renamed from: k */
    public VFrame f24994k;

    /* JADX INFO: renamed from: l */
    public View f24995l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f24996m;

    /* JADX INFO: renamed from: n */
    public VFrame f24997n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f24998o;

    /* JADX INFO: renamed from: p */
    public VFrame f24999p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f25000q;

    /* JADX INFO: renamed from: r */
    public View f25001r;

    /* JADX INFO: renamed from: s */
    public VFrame f25002s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f25003t;

    /* JADX INFO: renamed from: u */
    public VFrame f25004u;

    /* JADX INFO: renamed from: v */
    public VImage f25005v;

    /* JADX INFO: renamed from: w */
    public VText f25006w;

    /* JADX INFO: renamed from: x */
    public LightningView f25007x;

    /* JADX INFO: renamed from: y */
    public final String f25008y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationMatchItemLayout$a */
    public class C8123a extends bt0.C15966j {
        public C8123a() {
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ConversationMatchItemLayout.this.m40565R();
        }
    }

    public ConversationMatchItemLayout(Context context) {
        super(context);
        this.f25008y = "ConversationMatchItemLayout";
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m41208X(Conversation conversation) {
        Conversation conversationMo223809clone = conversation.mo223809clone();
        conversationMo223809clone.otherStatus = "invalid";
        CoreModule.f17553k.f91950m.upsert(conversationMo223809clone);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m41209Y(Runnable runnable) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m41215f0(xaj0 xaj0Var) {
        final Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(((User) xaj0Var.f191752b).f56011id);
        if (NullChecker.m81303a(conversationM33216zp)) {
            f8c.m119878o().m119881B(new d30() { // from class: l.zh6
                @Override // p149l.d30
                public final void call() {
                    ConversationMatchItemLayout.m41208X(conversationM33216zp);
                }
            });
        }
    }

    private float getTitleRemoveWidth() {
        return this.f24605c.f24744e.getPaint().measureText(getResources().getString(R$string.f18612ij)) + t100.m186890d(42.0f);
    }

    /* JADX INFO: renamed from: v0 */
    private void m41216v0() {
        postDelayed(new Runnable() { // from class: l.wh6
            @Override // java.lang.Runnable
            public final void run() {
                this.f186367a.m41226r0();
            }
        }, 100L);
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.BaseConversationMatchItemLayout
    /* JADX INFO: renamed from: C */
    public void mo40554C(final Runnable runnable) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(m41218h0(), m41219j0(true));
        bt0.m103749v(animatorSet, new Runnable() { // from class: l.ai6
            @Override // java.lang.Runnable
            public final void run() {
                this.f69955a.m41221l0();
            }
        });
        bt0.m103733f(animatorSet, new Runnable() { // from class: l.bi6
            @Override // java.lang.Runnable
            public final void run() {
                ConversationMatchItemLayout.m41209Y(runnable);
            }
        });
        animatorSet.start();
        m41230w0();
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.BaseConversationMatchItemLayout
    /* JADX INFO: renamed from: P */
    public void mo40563P(Act act, ConversationHeadRecommendLayout conversationHeadRecommendLayout, final ConversationHeadRecommendLayout.C8115c c8115c) {
        this.f24605c = conversationHeadRecommendLayout;
        if (NullChecker.m81303a(c8115c) && NullChecker.m81303a(c8115c.f24777d)) {
            this.f24995l.setBackgroundResource(x2c0.f190190h1);
            if (c8115c.f24774a != 14) {
                this.f24605c.f24752m.mo67374c(act, mkd0.m154985s(CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19639e0.m169410Ka(c8115c.f24777d), (TextUtils.isEmpty(c8115c.f24793t) || c8115c.f24774a != ConversationHeadRecommendLayout.C8115c.f24769F) ? C22306c.just(null) : CoreModule.f17545c.f19639e0.m169410Ka(c8115c.f24793t), new y9j() { // from class: l.uh6
                    @Override // p149l.y9j
                    /* JADX INFO: renamed from: a */
                    public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                        return new xaj0((User) obj, (User) obj2, (User) obj3);
                    }
                })).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.xh6
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f192860a.m41225q0(c8115c, (xaj0) obj);
                    }
                }));
                return;
            }
            if (NullChecker.m81303a(c8115c.f24799z)) {
                m41229u0();
                this.f24995l.setBackgroundResource(x2c0.f190252j1);
                xdl0.m208327D0(t100.m186890d(115.0f), this.f24994k);
                hb30.m130318x(act, c8115c, this.f25003t, this.f25006w, this.f25005v, this.f25007x, this.f24994k);
                this.f25007x.setTextColor(Color.parseColor("#EAB442"));
                return;
            }
            if (NullChecker.m81303a(c8115c.f24797x)) {
                m41229u0();
                this.f24995l.setBackgroundResource(x2c0.f190222i1);
                xdl0.m208327D0(t100.m186890d(115.0f), this.f24994k);
                hb30.m130317w(act, this.f24605c.f24752m, c8115c, this.f25003t, this.f25006w, this.f25005v, this.f25007x, this.f24994k);
                this.f25007x.setTextColor(Color.parseColor("#75C4FF"));
                return;
            }
            if (NullChecker.m81303a(c8115c.f24798y)) {
                m41229u0();
                this.f24995l.setBackgroundResource(x2c0.f190190h1);
                xdl0.m208327D0(t100.m186890d(115.0f), this.f24994k);
                hb30.m130316v(act, this.f24605c.f24752m, c8115c, this.f25003t, this.f25006w, this.f25005v, this.f25007x, this.f24994k);
                this.f25007x.setTextColor(Color.parseColor("#FF8231"));
                return;
            }
            m41229u0();
            this.f24995l.setBackgroundResource(x2c0.f190190h1);
            xdl0.m208327D0(t100.m186890d(115.0f), this.f24994k);
            hb30.m130315u(act, c8115c, this.f25003t, this.f25006w, this.f25005v, this.f25007x, this.f24994k);
            this.f25007x.setTextColor(Color.parseColor("#FF8231"));
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m41217g0(View view) {
        gi6.m126255a(this, view);
    }

    /* JADX INFO: renamed from: h0 */
    public Animator m41218h0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(bt0.m103742o(this.f24994k, BaseConversationMatchItemLayout.f24602j, 0, t100.m186890d(115.0f)));
        arrayList.add(ObjectAnimator.ofFloat(this.f24994k, "alpha", 0.0f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f24996m, "translationX", this.f24611i));
        arrayList.add(ObjectAnimator.ofFloat(this.f24996m, "translationY", this.f24611i));
        arrayList.add(ObjectAnimator.ofFloat(this.f24996m, "scaleX", this.f24607e));
        arrayList.add(ObjectAnimator.ofFloat(this.f24996m, "scaleY", this.f24607e));
        arrayList.add(ObjectAnimator.ofFloat(this.f24999p, "translationX", this.f24610h));
        arrayList.add(ObjectAnimator.ofFloat(this.f24999p, "translationY", this.f24611i));
        arrayList.add(ObjectAnimator.ofFloat(this.f24999p, "scaleX", this.f24607e));
        arrayList.add(ObjectAnimator.ofFloat(this.f24999p, "scaleY", this.f24607e));
        arrayList.add(ObjectAnimator.ofFloat(this.f25007x, "translationY", this.f24611i));
        arrayList.add(ObjectAnimator.ofFloat(this.f25007x, "scaleX", this.f24607e));
        arrayList.add(ObjectAnimator.ofFloat(this.f25007x, "scaleY", this.f24607e));
        arrayList.add(ObjectAnimator.ofFloat(this.f25007x, "alpha", this.f24608f));
        arrayList.add(ObjectAnimator.ofFloat(this.f24605c.f24741b, "translationX", -getTitleRemoveWidth(), 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f24605c.f24745f, "alpha", this.f24609g));
        arrayList.add(ObjectAnimator.ofFloat(this.f24605c.f24744e, "alpha", this.f24608f));
        arrayList.add(ObjectAnimator.ofFloat(this.f24605c.f24742c, "alpha", this.f24608f));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(300L);
        animatorSet.addListener(new C8123a());
        animatorSet.setInterpolator(new DecelerateInterpolator());
        return animatorSet;
    }

    /* JADX INFO: renamed from: j0 */
    public AnimatorSet m41219j0(boolean z) {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("translationX", 0.0f, t100.m186890d(6.0f), 0.0f);
        PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat("translationX", 0.0f, -t100.m186890d(6.0f), 0.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f24996m, propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(z ? 2 : 1);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.f24999p, propertyValuesHolderOfFloat2);
        objectAnimatorOfPropertyValuesHolder2.setRepeatCount(z ? 2 : 1);
        bt0.m103749v(objectAnimatorOfPropertyValuesHolder2, new Runnable() { // from class: l.ei6
            @Override // java.lang.Runnable
            public final void run() {
                this.f91551a.m41222m0();
            }
        });
        bt0.m103745r(objectAnimatorOfPropertyValuesHolder2, new Runnable() { // from class: l.fi6
            @Override // java.lang.Runnable
            public final void run() {
                this.f97626a.m41224p0();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new lig());
        animatorSet.setDuration(1600L);
        animatorSet.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        return animatorSet;
    }

    /* JADX INFO: renamed from: k0 */
    public Picture.ImageUri m41220k0(User user) {
        return sw6.m186127b(user).profileSmall();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m41221l0() {
        xdl0.m208344M(this.f24994k, true);
        xdl0.m208344M(this.f24605c.f24742c, true);
        xdl0.m208344M(this.f24605c.f24744e, true);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m41222m0() {
        ViewGroup.LayoutParams layoutParams = this.f24994k.getLayoutParams();
        if (layoutParams.width < t100.m186890d(100.0f)) {
            layoutParams.width = t100.m186890d(115.0f);
            this.f24994k.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m41223o0() {
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/2940b12f-9afb-4c57-8783-a2c4e0ab501710.so").autoPlay(true).repeatCount(1).into(this.f24605c.f24749j);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41217g0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m41224p0() {
        if (!NullChecker.m81303a(ConversationHeadRecommendLayout.f24739x) || ConversationHeadRecommendLayout.f24739x.f24774a == ConversationHeadRecommendLayout.C8115c.f24769F) {
            return;
        }
        postDelayed(new Runnable() { // from class: l.vh6
            @Override // java.lang.Runnable
            public final void run() {
                this.f181472a.m41223o0();
            }
        }, 600L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m41225q0(ConversationHeadRecommendLayout.C8115c c8115c, final xaj0 xaj0Var) {
        if (NullChecker.m81303a(xaj0Var.f191752b) && ((User) xaj0Var.f191752b).isBanedOrInactivated()) {
            e51.m114774y(new Runnable() { // from class: l.yh6
                @Override // java.lang.Runnable
                public final void run() {
                    ConversationMatchItemLayout.m41215f0(xaj0Var);
                }
            });
            return;
        }
        this.f24996m.setPivotX(t100.m186890d(19.0f));
        this.f24996m.setPivotY(t100.m186890d(19.0f));
        this.f24999p.setPivotX(t100.m186890d(28.0f));
        this.f24999p.setPivotY(t100.m186890d(28.0f));
        this.f24995l.setPivotX(t100.m186890d(57.5f));
        this.f24995l.setPivotY(t100.m186890d(57.5f));
        LightningView lightningView = this.f25007x;
        lightningView.setPivotX(lightningView.getWidth() / 2.0f);
        LightningView lightningView2 = this.f25007x;
        lightningView2.setPivotY(lightningView2.getHeight() / 2.0f);
        xdl0.m208344M(this.f25002s, false);
        xdl0.m208344M(this.f25004u, true);
        xdl0.m208344M(this.f24996m, true);
        xdl0.m208344M(this.f24997n, true);
        xdl0.m208344M(this.f24999p, true);
        int i = c8115c.f24774a;
        int i2 = ConversationHeadRecommendLayout.C8115c.f24769F;
        View view = this.f24995l;
        if (i == i2) {
            view.setBackgroundResource(x2c0.f190634v);
            this.f25007x.setTextColor(Color.parseColor("#66000000"));
        } else {
            view.setBackgroundResource(x2c0.f190190h1);
            this.f25007x.setTextColor(Color.parseColor("#ff8231"));
        }
        xdl0.m208344M(this.f25001r, c8115c.f24774a == ConversationHeadRecommendLayout.C8115c.f24767D);
        if (xdl0.m208349O0(this.f25001r)) {
            o6j0.m162864h("e_new_match_red_dot", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
        }
        if (NullChecker.m81303a(xaj0Var.f191753c)) {
            qib0.f154691G.m102341Q0(this.f24996m, m41220k0((User) xaj0Var.f191753c));
        } else if (c8115c.f24774a == ConversationHeadRecommendLayout.C8115c.f24769F) {
            qib0.f154691G.m102341Q0(this.f25003t, m41220k0((User) xaj0Var.f191752b));
            xdl0.m208344M(this.f25002s, true);
            xdl0.m208344M(this.f25004u, false);
            xdl0.m208344M(this.f24996m, false);
            xdl0.m208344M(this.f24997n, false);
            xdl0.m208344M(this.f24999p, false);
        } else {
            qib0.f154691G.m102341Q0(this.f24996m, m41220k0((User) xaj0Var.f191751a));
        }
        if (!this.f24606d && (TextUtils.isEmpty(this.f24604b) || TextUtils.equals(this.f24604b, c8115c.f24777d))) {
            m40562O((User) xaj0Var.f191752b, this.f25000q);
            m40562O((User) xaj0Var.f191752b, this.f24998o);
        }
        m41231x0(c8115c);
        xdl0.m208345M0(this.f24997n, false);
        m40556F(this.f24994k, c8115c);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m41226r0() {
        this.f25007x.m43717w();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m41227s0() {
        SVGALoader.with(getContext()).from(upa.m194847z() ? "https://auto.tancdn.com/v1/raw/e46ccc9d-2050-4521-a0c0-a238b0ef7d8914.svga" : "https://auto.tancdn.com/v1/raw/026b84ba-0fad-4b15-b804-22929bfdce5110.so").autoPlay(true).repeatCount(1).frameMode(SVGAnimationView.FrameMode.BEFORE).into(this.f24605c.f24743d);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m41228t0() {
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/a24ee24d-d950-42f6-b25e-af45e09f756810.so").autoPlay(true).repeatCount(1).into(this.f24605c.f24749j);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m41229u0() {
        xdl0.m208344M(this.f24996m, false);
        xdl0.m208344M(this.f24997n, false);
        xdl0.m208344M(this.f24999p, false);
        xdl0.m208344M(this.f25002s, true);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m41230w0() {
        post(new Runnable() { // from class: l.ci6
            @Override // java.lang.Runnable
            public final void run() {
                this.f81037a.m41227s0();
            }
        });
        if (NullChecker.m81303a(ConversationHeadRecommendLayout.f24739x) && ConversationHeadRecommendLayout.f24739x.f24774a != ConversationHeadRecommendLayout.C8115c.f24769F) {
            postDelayed(new Runnable() { // from class: l.di6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86356a.m41228t0();
                }
            }, 200L);
        }
        m41216v0();
    }

    /* JADX INFO: renamed from: x0 */
    public void m41231x0(ConversationHeadRecommendLayout.C8115c c8115c) {
        if (NullChecker.m81303a(this.f25007x)) {
            this.f25007x.setText("你有1个新配对");
        }
    }

    public ConversationMatchItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25008y = "ConversationMatchItemLayout";
    }

    public ConversationMatchItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25008y = "ConversationMatchItemLayout";
    }
}
