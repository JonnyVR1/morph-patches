package com.p000p1.mobile.putong.core.newui.messages;

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
import com.p000p1.mobile.putong.core.newui.messages.ConversationMatchItemLayout;
import com.p000p1.mobile.putong.core.newui.view.LightningView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.bt0;
import l.d30;
import l.e30;
import l.e51;
import l.f8c;
import l.gi6;
import l.jo0;
import l.lig;
import l.mkd0;
import l.o6j0;
import l.qib0;
import l.sw6;
import l.t100;
import l.upa;
import l.x2c0;
import l.xaj0;
import l.xdl0;
import l.y9j;
import p009l.hb30;
import rx.c;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationMatchItemLayout extends BaseConversationMatchItemLayout {

    /* JADX INFO: renamed from: k */
    public VFrame f3772k;

    /* JADX INFO: renamed from: l */
    public View f3773l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f3774m;

    /* JADX INFO: renamed from: n */
    public VFrame f3775n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f3776o;

    /* JADX INFO: renamed from: p */
    public VFrame f3777p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f3778q;

    /* JADX INFO: renamed from: r */
    public View f3779r;

    /* JADX INFO: renamed from: s */
    public VFrame f3780s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f3781t;

    /* JADX INFO: renamed from: u */
    public VFrame f3782u;

    /* JADX INFO: renamed from: v */
    public VImage f3783v;

    /* JADX INFO: renamed from: w */
    public VText f3784w;

    /* JADX INFO: renamed from: x */
    public LightningView f3785x;

    /* JADX INFO: renamed from: y */
    public final String f3786y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationMatchItemLayout$a */
    public class C0287a extends bt0.j {
        public C0287a() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ConversationMatchItemLayout.this.m4658R();
        }
    }

    public ConversationMatchItemLayout(Context context) {
        super(context);
        this.f3786y = "ConversationMatchItemLayout";
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m5314X(Conversation conversation) {
        Conversation conversationClone = conversation.clone();
        conversationClone.otherStatus = "invalid";
        CoreModule.k.m.upsert(conversationClone);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m5315Y(Runnable runnable) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m5321f0(xaj0 xaj0Var) {
        final Conversation conversationZp = CoreModule.c.f0.zp(((DbObject) ((User) xaj0Var.b)).id);
        if (NullChecker.a(conversationZp)) {
            f8c.o().B(new d30() { // from class: l.zh6
                public final void call() {
                    ConversationMatchItemLayout.m5314X(conversationZp);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private float getTitleRemoveWidth() {
        return this.f3383c.f3522e.getPaint().measureText(getResources().getString(R.string.ij)) + t100.d(42.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    private void m5322v0() {
        postDelayed(new Runnable() { // from class: l.wh6
            @Override // java.lang.Runnable
            public final void run() {
                this.f22108a.m5332r0();
            }
        }, 100L);
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.BaseConversationMatchItemLayout
    /* JADX INFO: renamed from: C */
    public void mo4647C(final Runnable runnable) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(m5324h0(), m5325j0(true));
        bt0.v(animatorSet, new Runnable() { // from class: l.ai6
            @Override // java.lang.Runnable
            public final void run() {
                this.f9529a.m5327l0();
            }
        });
        bt0.f(animatorSet, new Runnable() { // from class: l.bi6
            @Override // java.lang.Runnable
            public final void run() {
                ConversationMatchItemLayout.m5315Y(runnable);
            }
        });
        animatorSet.start();
        m5336w0();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.p000p1.mobile.putong.core.newui.messages.BaseConversationMatchItemLayout
    /* JADX INFO: renamed from: P */
    public void mo4656P(Act act, ConversationHeadRecommendLayout conversationHeadRecommendLayout, final ConversationHeadRecommendLayout.C0279c c0279c) {
        this.f3383c = conversationHeadRecommendLayout;
        if (NullChecker.a(c0279c) && NullChecker.a(c0279c.f3555d)) {
            this.f3773l.setBackgroundResource(x2c0.h1);
            if (c0279c.f3552a != 14) {
                this.f3383c.f3530m.c(act, mkd0.s(CoreModule.c.e0.o9(), CoreModule.c.e0.Ka(c0279c.f3555d), (TextUtils.isEmpty(c0279c.f3571t) || c0279c.f3552a != ConversationHeadRecommendLayout.C0279c.f3547F) ? c.just((Object) null) : CoreModule.c.e0.Ka(c0279c.f3571t), new y9j() { // from class: l.uh6
                    /* JADX INFO: renamed from: a */
                    public final Object m23023a(Object obj, Object obj2, Object obj3) {
                        return new xaj0((User) obj, (User) obj2, (User) obj3);
                    }
                })).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.xh6
                    public final void call(Object obj) {
                        this.f22607a.m5331q0(c0279c, (xaj0) obj);
                    }
                }));
                return;
            }
            if (NullChecker.a(c0279c.f3577z)) {
                m5335u0();
                this.f3773l.setBackgroundResource(x2c0.j1);
                xdl0.D0(t100.d(115.0f), new View[]{this.f3772k});
                hb30.m15498x(act, c0279c, this.f3781t, this.f3784w, this.f3783v, this.f3785x, this.f3772k);
                this.f3785x.setTextColor(Color.parseColor("#EAB442"));
                return;
            }
            if (NullChecker.a(c0279c.f3575x)) {
                m5335u0();
                this.f3773l.setBackgroundResource(x2c0.i1);
                xdl0.D0(t100.d(115.0f), new View[]{this.f3772k});
                hb30.m15497w(act, this.f3383c.f3530m, c0279c, this.f3781t, this.f3784w, this.f3783v, this.f3785x, this.f3772k);
                this.f3785x.setTextColor(Color.parseColor("#75C4FF"));
                return;
            }
            if (NullChecker.a(c0279c.f3576y)) {
                m5335u0();
                this.f3773l.setBackgroundResource(x2c0.h1);
                xdl0.D0(t100.d(115.0f), new View[]{this.f3772k});
                hb30.m15496v(act, this.f3383c.f3530m, c0279c, this.f3781t, this.f3784w, this.f3783v, this.f3785x, this.f3772k);
                this.f3785x.setTextColor(Color.parseColor("#FF8231"));
                return;
            }
            m5335u0();
            this.f3773l.setBackgroundResource(x2c0.h1);
            xdl0.D0(t100.d(115.0f), new View[]{this.f3772k});
            hb30.m15495u(act, c0279c, this.f3781t, this.f3784w, this.f3783v, this.f3785x, this.f3772k);
            this.f3785x.setTextColor(Color.parseColor("#FF8231"));
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m5323g0(View view) {
        gi6.a(this, view);
    }

    /* JADX INFO: renamed from: h0 */
    public Animator m5324h0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(bt0.o(this.f3772k, BaseConversationMatchItemLayout.f3380j, new int[]{0, t100.d(115.0f)}));
        arrayList.add(ObjectAnimator.ofFloat(this.f3772k, "alpha", 0.0f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f3774m, "translationX", this.f3389i));
        arrayList.add(ObjectAnimator.ofFloat(this.f3774m, "translationY", this.f3389i));
        arrayList.add(ObjectAnimator.ofFloat(this.f3774m, "scaleX", this.f3385e));
        arrayList.add(ObjectAnimator.ofFloat(this.f3774m, "scaleY", this.f3385e));
        arrayList.add(ObjectAnimator.ofFloat(this.f3777p, "translationX", this.f3388h));
        arrayList.add(ObjectAnimator.ofFloat(this.f3777p, "translationY", this.f3389i));
        arrayList.add(ObjectAnimator.ofFloat(this.f3777p, "scaleX", this.f3385e));
        arrayList.add(ObjectAnimator.ofFloat(this.f3777p, "scaleY", this.f3385e));
        arrayList.add(ObjectAnimator.ofFloat(this.f3785x, "translationY", this.f3389i));
        arrayList.add(ObjectAnimator.ofFloat(this.f3785x, "scaleX", this.f3385e));
        arrayList.add(ObjectAnimator.ofFloat(this.f3785x, "scaleY", this.f3385e));
        arrayList.add(ObjectAnimator.ofFloat(this.f3785x, "alpha", this.f3386f));
        arrayList.add(ObjectAnimator.ofFloat(this.f3383c.f3519b, "translationX", -getTitleRemoveWidth(), 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f3383c.f3523f, "alpha", this.f3387g));
        arrayList.add(ObjectAnimator.ofFloat(this.f3383c.f3522e, "alpha", this.f3386f));
        arrayList.add(ObjectAnimator.ofFloat(this.f3383c.f3520c, "alpha", this.f3386f));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(300L);
        animatorSet.addListener(new C0287a());
        animatorSet.setInterpolator(new DecelerateInterpolator());
        return animatorSet;
    }

    /* JADX INFO: renamed from: j0 */
    public AnimatorSet m5325j0(boolean z) {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("translationX", 0.0f, t100.d(6.0f), 0.0f);
        PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat("translationX", 0.0f, -t100.d(6.0f), 0.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f3774m, propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(z ? 2 : 1);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.f3777p, propertyValuesHolderOfFloat2);
        objectAnimatorOfPropertyValuesHolder2.setRepeatCount(z ? 2 : 1);
        bt0.v(objectAnimatorOfPropertyValuesHolder2, new Runnable() { // from class: l.ei6
            @Override // java.lang.Runnable
            public final void run() {
                this.f12577a.m5328m0();
            }
        });
        bt0.r(objectAnimatorOfPropertyValuesHolder2, new Runnable() { // from class: l.fi6
            @Override // java.lang.Runnable
            public final void run() {
                this.f13023a.m5330p0();
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
    public Picture.ImageUri m5326k0(User user) {
        return sw6.b(user).profileSmall();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m5327l0() {
        xdl0.M(this.f3772k, true);
        xdl0.M(this.f3383c.f3520c, true);
        xdl0.M(this.f3383c.f3522e, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m5328m0() {
        ViewGroup.LayoutParams layoutParams = this.f3772k.getLayoutParams();
        if (layoutParams.width < t100.d(100.0f)) {
            layoutParams.width = t100.d(115.0f);
            this.f3772k.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m5329o0() {
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/2940b12f-9afb-4c57-8783-a2c4e0ab501710.so").autoPlay(true).repeatCount(1).into(this.f3383c.f3527j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5323g0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m5330p0() {
        if (!NullChecker.a(ConversationHeadRecommendLayout.f3517x) || ConversationHeadRecommendLayout.f3517x.f3552a == ConversationHeadRecommendLayout.C0279c.f3547F) {
            return;
        }
        postDelayed(new Runnable() { // from class: l.vh6
            @Override // java.lang.Runnable
            public final void run() {
                this.f21579a.m5329o0();
            }
        }, 600L);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m5331q0(ConversationHeadRecommendLayout.C0279c c0279c, final xaj0 xaj0Var) {
        if (NullChecker.a(xaj0Var.b) && ((User) xaj0Var.b).isBanedOrInactivated()) {
            e51.y(new Runnable() { // from class: l.yh6
                @Override // java.lang.Runnable
                public final void run() {
                    ConversationMatchItemLayout.m5321f0(xaj0Var);
                }
            });
            return;
        }
        this.f3774m.setPivotX(t100.d(19.0f));
        this.f3774m.setPivotY(t100.d(19.0f));
        this.f3777p.setPivotX(t100.d(28.0f));
        this.f3777p.setPivotY(t100.d(28.0f));
        this.f3773l.setPivotX(t100.d(57.5f));
        this.f3773l.setPivotY(t100.d(57.5f));
        VText vText = this.f3785x;
        vText.setPivotX(vText.getWidth() / 2.0f);
        VText vText2 = this.f3785x;
        vText2.setPivotY(vText2.getHeight() / 2.0f);
        xdl0.M(this.f3780s, false);
        xdl0.M(this.f3782u, true);
        xdl0.M(this.f3774m, true);
        xdl0.M(this.f3775n, true);
        xdl0.M(this.f3777p, true);
        int i = c0279c.f3552a;
        int i2 = ConversationHeadRecommendLayout.C0279c.f3547F;
        View view = this.f3773l;
        if (i == i2) {
            view.setBackgroundResource(x2c0.v);
            this.f3785x.setTextColor(Color.parseColor("#66000000"));
        } else {
            view.setBackgroundResource(x2c0.h1);
            this.f3785x.setTextColor(Color.parseColor("#ff8231"));
        }
        xdl0.M(this.f3779r, c0279c.f3552a == ConversationHeadRecommendLayout.C0279c.f3545D);
        if (xdl0.O0(this.f3779r)) {
            o6j0.h("e_new_match_red_dot", "p_messages_view", new o6j0.a[0]);
        }
        if (NullChecker.a(xaj0Var.c)) {
            qib0.G.Q0(this.f3774m, m5326k0((User) xaj0Var.c));
        } else if (c0279c.f3552a == ConversationHeadRecommendLayout.C0279c.f3547F) {
            qib0.G.Q0(this.f3781t, m5326k0((User) xaj0Var.b));
            xdl0.M(this.f3780s, true);
            xdl0.M(this.f3782u, false);
            xdl0.M(this.f3774m, false);
            xdl0.M(this.f3775n, false);
            xdl0.M(this.f3777p, false);
        } else {
            qib0.G.Q0(this.f3774m, m5326k0((User) xaj0Var.a));
        }
        if (!this.f3384d && (TextUtils.isEmpty(this.f3382b) || TextUtils.equals(this.f3382b, c0279c.f3555d))) {
            m4655O((User) xaj0Var.b, this.f3778q);
            m4655O((User) xaj0Var.b, this.f3776o);
        }
        m5337x0(c0279c);
        xdl0.M0(this.f3775n, false);
        m4649F(this.f3772k, c0279c);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m5332r0() {
        this.f3785x.m7981w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m5333s0() {
        SVGALoader.with(getContext()).from(upa.z() ? "https://auto.tancdn.com/v1/raw/e46ccc9d-2050-4521-a0c0-a238b0ef7d8914.svga" : "https://auto.tancdn.com/v1/raw/026b84ba-0fad-4b15-b804-22929bfdce5110.so").autoPlay(true).repeatCount(1).frameMode(SVGAnimationView.FrameMode.BEFORE).into(this.f3383c.f3521d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m5334t0() {
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/a24ee24d-d950-42f6-b25e-af45e09f756810.so").autoPlay(true).repeatCount(1).into(this.f3383c.f3527j);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m5335u0() {
        xdl0.M(this.f3774m, false);
        xdl0.M(this.f3775n, false);
        xdl0.M(this.f3777p, false);
        xdl0.M(this.f3780s, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w0 */
    public final void m5336w0() {
        post(new Runnable() { // from class: l.ci6
            @Override // java.lang.Runnable
            public final void run() {
                this.f10612a.m5333s0();
            }
        });
        if (NullChecker.a(ConversationHeadRecommendLayout.f3517x) && ConversationHeadRecommendLayout.f3517x.f3552a != ConversationHeadRecommendLayout.C0279c.f3547F) {
            postDelayed(new Runnable() { // from class: l.di6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11847a.m5334t0();
                }
            }, 200L);
        }
        m5322v0();
    }

    /* JADX INFO: renamed from: x0 */
    public void m5337x0(ConversationHeadRecommendLayout.C0279c c0279c) {
        if (NullChecker.a(this.f3785x)) {
            this.f3785x.setText("你有1个新配对");
        }
    }

    public ConversationMatchItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3786y = "ConversationMatchItemLayout";
    }

    public ConversationMatchItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3786y = "ConversationMatchItemLayout";
    }
}
