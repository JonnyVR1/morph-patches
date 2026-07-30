package com.p051p1.mobile.putong.core.p058ui.match.view;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageHalfPageComposerAct;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.d810;
import p153l.fzf0;
import p153l.gt0;
import p153l.hmj0;
import p153l.lyh0;
import p153l.nrb0;
import p153l.q8g0;
import p153l.qa00;
import p153l.ryl;
import p153l.sfj0;
import p153l.syl;
import p153l.tye;
import p153l.uqb0;
import p153l.x7c0;
import p153l.ygx;

/* JADX INFO: loaded from: classes3.dex */
public class MatchSuccessPopView extends ConstraintLayout implements syl {

    /* JADX INFO: renamed from: A */
    public SVGAnimationView f31398A;

    /* JADX INFO: renamed from: B */
    public ryl f31399B;

    /* JADX INFO: renamed from: d */
    public MatchSuccessPopView f31400d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f31401e;

    /* JADX INFO: renamed from: f */
    public VImage f31402f;

    /* JADX INFO: renamed from: g */
    public VText f31403g;

    /* JADX INFO: renamed from: h */
    public VText f31404h;

    /* JADX INFO: renamed from: i */
    public VText f31405i;

    /* JADX INFO: renamed from: j */
    public VText f31406j;

    /* JADX INFO: renamed from: k */
    public VLinear f31407k;

    /* JADX INFO: renamed from: l */
    public VText f31408l;

    /* JADX INFO: renamed from: m */
    public VLinear f31409m;

    /* JADX INFO: renamed from: n */
    public VText f31410n;

    /* JADX INFO: renamed from: o */
    public VLinear f31411o;

    /* JADX INFO: renamed from: p */
    public VText f31412p;

    /* JADX INFO: renamed from: q */
    public VLinear f31413q;

    /* JADX INFO: renamed from: r */
    public VText f31414r;

    /* JADX INFO: renamed from: s */
    public Guideline f31415s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f31416t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f31417u;

    /* JADX INFO: renamed from: v */
    public VDraweeView f31418v;

    /* JADX INFO: renamed from: w */
    public View f31419w;

    /* JADX INFO: renamed from: x */
    public VFrame f31420x;

    /* JADX INFO: renamed from: y */
    public VImage f31421y;

    /* JADX INFO: renamed from: z */
    public VImage f31422z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$a */
    public class ViewOnClickListenerC8621a implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MatchSuccessPopView.this.f31399B.mo183612a(MatchSuccessPopView.this.act(), true);
            }
        }

        public ViewOnClickListenerC8621a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            sfj0.m185596c("e_match_emoji", "p_successful_match_view", sfj0.C20032a.m185613f("select_emoji", 1));
            tye.m193572c().m193583l("NEW_EMOJI_HAHE");
            d810.m114775h(MatchSuccessPopView.this.act(), MatchSuccessPopView.this.f31399B.mo183615f(), MatchSuccessPopView.this.f31408l.getText().toString(), false, new a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$b */
    public class AnimationAnimationListenerC8622b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f31425a;

        public AnimationAnimationListenerC8622b(Runnable runnable) {
            this.f31425a = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (NullChecker.m82486a(this.f31425a)) {
                this.f31425a.run();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$c */
    public class ViewOnClickListenerC8623c implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MatchSuccessPopView.this.f31399B.mo183612a(MatchSuccessPopView.this.act(), true);
            }
        }

        public ViewOnClickListenerC8623c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            sfj0.m185596c("e_match_emoji", "p_successful_match_view", sfj0.C20032a.m185613f("select_emoji", 2));
            tye.m193572c().m193583l("EMOJI_63");
            d810.m114775h(MatchSuccessPopView.this.act(), MatchSuccessPopView.this.f31399B.mo183615f(), MatchSuccessPopView.this.f31410n.getText().toString(), false, new a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$d */
    public class ViewOnClickListenerC8624d implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$d$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MatchSuccessPopView.this.f31399B.mo183612a(MatchSuccessPopView.this.act(), true);
            }
        }

        public ViewOnClickListenerC8624d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            sfj0.m185596c("e_match_emoji", "p_successful_match_view", sfj0.C20032a.m185613f("select_emoji", 3));
            tye.m193572c().m193583l("NEW_EMOJI_BEER");
            d810.m114775h(MatchSuccessPopView.this.act(), MatchSuccessPopView.this.f31399B.mo183615f(), MatchSuccessPopView.this.f31412p.getText().toString(), false, new a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$e */
    public class ViewOnClickListenerC8625e implements View.OnClickListener {
        public ViewOnClickListenerC8625e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MatchSuccessPopView.this.f31399B.mo183615f() == null) {
                return;
            }
            sfj0.m185596c("e_matched_text_box", "p_successful_match_view", new sfj0.C20032a[0]);
            sfj0.m185601h("e_matched_send_message", "p_successful_match_view", new sfj0.C20032a[0]);
            MatchSuccessPopView.this.f31399B.mo183613b(true);
            MatchSuccessPopView.this.act().startActivityForResult(MessageHalfPageComposerAct.m50069m2(MatchSuccessPopView.this.act(), MatchSuccessPopView.this.f31399B.mo183615f().f56859id, MessageHalfPageComposerAct.f32455r), 112);
            MatchSuccessPopView.this.act().overridePendingTransition(x7c0.f192701p, x7c0.f192702q);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$f */
    public class ViewOnClickListenerC8626f implements View.OnClickListener {
        public ViewOnClickListenerC8626f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            sfj0.m185596c("e_matched_later", "p_successful_match_view", new sfj0.C20032a[0]);
            MatchSuccessPopView.this.f31399B.mo183614c(true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$g */
    public class RunnableC8627g implements Runnable {
        public RunnableC8627g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            bnl0.m105524M(MatchSuccessPopView.this.f31420x, false);
            bnl0.m105524M(MatchSuccessPopView.this.f31419w, false);
            bnl0.m105524M(MatchSuccessPopView.this.f31416t, true);
            bnl0.m105524M(MatchSuccessPopView.this.f31418v, true);
            MatchSuccessPopView.this.mo48937s();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$h */
    public class RunnableC8628h implements Runnable {
        public RunnableC8628h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MatchSuccessPopView.this.m48932m0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$i */
    public class RunnableC8629i implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f31435a;

        public RunnableC8629i(Animator animator) {
            this.f31435a = animator;
        }

        @Override // java.lang.Runnable
        public void run() {
            bnl0.m105524M(MatchSuccessPopView.this.f31417u, true);
            bnl0.m105524M(MatchSuccessPopView.this.f31403g, true);
            bnl0.m105524M(MatchSuccessPopView.this.f31405i, true);
            bnl0.m105524M(MatchSuccessPopView.this.f31419w, false);
            bnl0.m105524M(MatchSuccessPopView.this.f31420x, false);
            this.f31435a.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$j */
    public class RunnableC8630j implements Runnable {
        public RunnableC8630j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MatchSuccessPopView.this.m48935p0();
            MatchSuccessPopView.this.m48932m0();
        }
    }

    public MatchSuccessPopView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Act act() {
        return (Act) bnl0.m105506D(getContext());
    }

    @Override // p153l.syl
    /* JADX INFO: renamed from: E */
    public void mo48927E(User user) {
        mo48938w(user, true);
        bnl0.m105524M(this.f31417u, false);
        bnl0.m105524M(this.f31403g, false);
        bnl0.m105524M(this.f31405i, false);
        Property property = View.ALPHA;
        Animator animatorM132166l = gt0.m132166l(this.f31418v, property, 0L, 300L, new LinearInterpolator(), 1.0f, 0.0f);
        Animator animatorM132166l2 = gt0.m132166l(this.f31404h, property, 0L, 300L, new LinearInterpolator(), 1.0f, 0.0f);
        Animator animatorM132166l3 = gt0.m132166l(this.f31406j, property, 0L, 300L, new LinearInterpolator(), 1.0f, 0.0f);
        VDraweeView vDraweeView = this.f31418v;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float[] fArr = {0.0f, -qa00.m175859d(15.0f)};
        Property property2 = View.TRANSLATION_Y;
        Animator animatorM132180z = gt0.m132180z(animatorM132166l, animatorM132166l2, animatorM132166l3, gt0.m132166l(vDraweeView, property2, 0L, 300L, linearInterpolator, fArr), gt0.m132166l(this.f31404h, property2, 0L, 300L, new LinearInterpolator(), 0.0f, -qa00.m175859d(5.0f)), gt0.m132166l(this.f31406j, property2, 0L, 300L, new LinearInterpolator(), 0.0f, -qa00.m175859d(5.0f)));
        Animator animatorM132180z2 = gt0.m132180z(gt0.m132166l(this.f31417u, property, 0L, 300L, new LinearInterpolator(), 0.0f, 1.0f), gt0.m132166l(this.f31403g, property, 0L, 300L, new LinearInterpolator(), 0.0f, 1.0f), gt0.m132166l(this.f31405i, property, 0L, 300L, new LinearInterpolator(), 0.0f, 1.0f), gt0.m132166l(this.f31417u, property2, 0L, 300L, new LinearInterpolator(), qa00.m175859d(15.0f), 0.0f), gt0.m132166l(this.f31403g, property2, 0L, 300L, new LinearInterpolator(), qa00.m175859d(5.0f), 0.0f), gt0.m132166l(this.f31405i, property2, 0L, 300L, new LinearInterpolator(), qa00.m175859d(5.0f), 0.0f));
        gt0.m132160f(animatorM132180z, new RunnableC8629i(animatorM132180z2));
        gt0.m132160f(animatorM132180z2, new RunnableC8630j());
        animatorM132180z.start();
    }

    @Override // p153l.syl
    /* JADX INFO: renamed from: N */
    public void mo48928N(Runnable runnable) {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), x7c0.f192691f);
        animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC8622b(runnable));
        getRootView().startAnimation(animationLoadAnimation);
    }

    @Override // p153l.syl
    /* JADX INFO: renamed from: V */
    public void mo48929V() {
        m48934o0();
        m48933n0();
    }

    @Override // p153l.syl
    /* JADX INFO: renamed from: a0 */
    public boolean mo48930a0() {
        return this.f31400d == null || this.f31401e == null || this.f31402f == null || this.f31403g == null || this.f31404h == null || this.f31405i == null || this.f31406j == null || this.f31407k == null || this.f31408l == null || this.f31409m == null || this.f31410n == null || this.f31411o == null || this.f31412p == null || this.f31413q == null || this.f31414r == null || this.f31415s == null || this.f31416t == null || this.f31417u == null || this.f31418v == null || this.f31419w == null || this.f31421y == null || this.f31420x == null || this.f31422z == null || this.f31398A == null;
    }

    @Override // android.view.View, p153l.syl
    public View getRootView() {
        return this;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m48931l0(View view) {
        ygx.m215882a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m48932m0() {
        if (this.f31399B.mo183615f() != null && nrb0.m164466b()) {
            CoreModule.m30930K().showUserVerificationLogo(getContext(), this.f31399B.mo183615f(), this.f31421y);
            bnl0.m105524M(this.f31422z, false);
            bnl0.m105524M(this.f31420x, bnl0.m105529O0(this.f31421y));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m48933n0() {
        if (mo48930a0()) {
            return;
        }
        fzf0 fzf0Var = new fzf0(0.5f);
        VDraweeView vDraweeView = this.f31416t;
        float[] fArr = {-qa00.m175859d(60.0f), qa00.m175859d(10.0f)};
        Property property = View.TRANSLATION_X;
        Animator animatorM132166l = gt0.m132166l(vDraweeView, property, 200L, 1500L, fzf0Var, fArr);
        Animator animatorM132166l2 = gt0.m132166l(this.f31418v, property, 200L, 1500L, fzf0Var, qa00.m175859d(60.0f), -qa00.m175859d(10.0f));
        Property property2 = View.ALPHA;
        Animator animatorM132166l3 = gt0.m132166l(this.f31416t, property2, 200L, 100L, new LinearInterpolator(), 0.0f, 1.0f);
        Animator animatorM132166l4 = gt0.m132166l(this.f31418v, property2, 200L, 100L, new LinearInterpolator(), 0.0f, 1.0f);
        gt0.m132176v(animatorM132166l, new RunnableC8627g());
        gt0.m132160f(animatorM132166l, new RunnableC8628h());
        gt0.m132180z(animatorM132166l, animatorM132166l2, animatorM132166l3, animatorM132166l4).start();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m48934o0() {
        if (mo48930a0()) {
            return;
        }
        gt0.m132180z(gt0.m132166l(this.f31400d, View.ALPHA, 0L, 300L, new DecelerateInterpolator(), 0.0f, 1.0f), gt0.m132166l(this.f31400d, View.TRANSLATION_Y, 0L, 300L, new DecelerateInterpolator(), -qa00.m175859d(20.0f), 0.0f)).start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48931l0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m48935p0() {
        if (mo48930a0()) {
            return;
        }
        VDraweeView vDraweeView = this.f31418v;
        this.f31418v = this.f31417u;
        this.f31417u = vDraweeView;
        bnl0.m105524M(vDraweeView, false);
        VText vText = this.f31404h;
        this.f31404h = this.f31403g;
        this.f31403g = vText;
        bnl0.m105524M(vText, false);
        VText vText2 = this.f31406j;
        this.f31406j = this.f31405i;
        this.f31405i = vText2;
        bnl0.m105524M(vText2, false);
    }

    @Override // p153l.syl
    /* JADX INFO: renamed from: r */
    public void mo48936r() {
        this.f31404h.setTypeface(lyh0.m156283c(3), 1);
        this.f31403g.setTypeface(lyh0.m156283c(3), 1);
        this.f31414r.setTypeface(lyh0.m156283c(3), 1);
        this.f31408l.setText("[" + getContext().getString(R$string.f18522Hj) + Constants.AES_SUFFIX);
        this.f31410n.setText("[" + getContext().getString(R$string.f19328i4) + Constants.AES_SUFFIX);
        this.f31412p.setText("[" + getContext().getString(R$string.f18491Gj) + Constants.AES_SUFFIX);
        bnl0.m105509E0(this.f31407k, new ViewOnClickListenerC8621a());
        bnl0.m105509E0(this.f31409m, new ViewOnClickListenerC8623c());
        bnl0.m105509E0(this.f31411o, new ViewOnClickListenerC8624d());
        bnl0.m105509E0(this.f31413q, new ViewOnClickListenerC8625e());
        bnl0.m105509E0(this.f31402f, new ViewOnClickListenerC8626f());
    }

    @Override // p153l.syl
    /* JADX INFO: renamed from: s */
    public void mo48937s() {
        if (mo48930a0()) {
            return;
        }
        SVGALoader.with(this.f31398A.getContext()).from("https://auto.tancdn.com/v1/raw/43f6acda-0599-43c7-95cb-4b2b00f758ba11.so").autoPlay(true).repeatCount(1).into(this.f31398A);
    }

    @Override // p153l.syl
    /* JADX INFO: renamed from: w */
    public void mo48938w(User user, boolean z) {
        StringBuilder sb = new StringBuilder("新配对");
        if (TextUtils.isEmpty(user.description)) {
            if (!TextUtils.isEmpty(user.location.region.city) && !user.isHideLocationFromSVip()) {
                sb.append(" · ");
                sb.append(user.location.region.city);
                String strM175811p = q8g0.m175811p(user.location.distance, true);
                if (!TextUtils.isEmpty(strM175811p)) {
                    sb.append("(");
                    sb.append(strM175811p);
                    sb.append(")");
                }
            }
            if (!TextUtils.isEmpty(q8g0.m175804j0(user.profile.zodiac))) {
                sb.append(" · ");
                sb.append(q8g0.m175804j0(user.profile.zodiac));
            }
            if (user.age.intValue() > 0 && !user.isHideAgeFromSVip()) {
                sb.append(" · ");
                sb.append(user.age);
                sb.append("岁");
            }
        } else {
            sb.append(" · ");
            sb.append(hmj0.m135869e(user.description));
        }
        if (z) {
            this.f31403g.setText(user.name);
            this.f31405i.setText(sb.toString());
            uqb0.f180374G.m127111J0(this.f31417u, user.m61308fp().profileMiddle(), false);
        } else {
            this.f31404h.setText(user.name);
            this.f31406j.setText(sb.toString());
            uqb0.f180374G.m127111J0(this.f31418v, user.m61308fp().profileMiddle(), false);
        }
        uqb0.f180374G.m127111J0(this.f31416t, CoreModule.m30930K().me_().m61308fp().profileMiddle(), false);
    }

    @Override // p153l.syl
    /* JADX INFO: renamed from: x */
    public void mo48939x(ryl rylVar) {
        super.mo48939x(rylVar);
        this.f31399B = rylVar;
    }

    public MatchSuccessPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MatchSuccessPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
