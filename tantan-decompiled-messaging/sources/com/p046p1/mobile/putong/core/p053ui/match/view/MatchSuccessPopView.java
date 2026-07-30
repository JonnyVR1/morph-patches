package com.p046p1.mobile.putong.core.p053ui.match.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageHalfPageComposerAct;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.awl;
import p149l.bt0;
import p149l.ddj0;
import p149l.eqh0;
import p149l.i0g0;
import p149l.jjb0;
import p149l.o6j0;
import p149l.pxe;
import p149l.qib0;
import p149l.rzb0;
import p149l.t100;
import p149l.tz00;
import p149l.wqf0;
import p149l.xdl0;
import p149l.zdx;
import p149l.zvl;

/* JADX INFO: loaded from: classes3.dex */
public class MatchSuccessPopView extends ConstraintLayout implements awl {

    /* JADX INFO: renamed from: A */
    public SVGAnimationView f30550A;

    /* JADX INFO: renamed from: B */
    public zvl f30551B;

    /* JADX INFO: renamed from: d */
    public MatchSuccessPopView f30552d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f30553e;

    /* JADX INFO: renamed from: f */
    public VImage f30554f;

    /* JADX INFO: renamed from: g */
    public VText f30555g;

    /* JADX INFO: renamed from: h */
    public VText f30556h;

    /* JADX INFO: renamed from: i */
    public VText f30557i;

    /* JADX INFO: renamed from: j */
    public VText f30558j;

    /* JADX INFO: renamed from: k */
    public VLinear f30559k;

    /* JADX INFO: renamed from: l */
    public VText f30560l;

    /* JADX INFO: renamed from: m */
    public VLinear f30561m;

    /* JADX INFO: renamed from: n */
    public VText f30562n;

    /* JADX INFO: renamed from: o */
    public VLinear f30563o;

    /* JADX INFO: renamed from: p */
    public VText f30564p;

    /* JADX INFO: renamed from: q */
    public VLinear f30565q;

    /* JADX INFO: renamed from: r */
    public VText f30566r;

    /* JADX INFO: renamed from: s */
    public Guideline f30567s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f30568t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f30569u;

    /* JADX INFO: renamed from: v */
    public VDraweeView f30570v;

    /* JADX INFO: renamed from: w */
    public View f30571w;

    /* JADX INFO: renamed from: x */
    public VFrame f30572x;

    /* JADX INFO: renamed from: y */
    public VImage f30573y;

    /* JADX INFO: renamed from: z */
    public VImage f30574z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$a */
    public class ViewOnClickListenerC8458a implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MatchSuccessPopView.this.f30551B.mo208467a(MatchSuccessPopView.this.act(), true);
            }
        }

        public ViewOnClickListenerC8458a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o6j0.m162859c("e_match_emoji", "p_successful_match_view", o6j0.C18854a.m162876f("select_emoji", 1));
            pxe.m171835c().m171846l("NEW_EMOJI_HAHE");
            tz00.m191126h(MatchSuccessPopView.this.act(), MatchSuccessPopView.this.f30551B.mo208470f(), MatchSuccessPopView.this.f30560l.getText().toString(), false, new a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$b */
    public class AnimationAnimationListenerC8459b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f30577a;

        public AnimationAnimationListenerC8459b(Runnable runnable) {
            this.f30577a = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (NullChecker.m81303a(this.f30577a)) {
                this.f30577a.run();
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
    public class ViewOnClickListenerC8460c implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MatchSuccessPopView.this.f30551B.mo208467a(MatchSuccessPopView.this.act(), true);
            }
        }

        public ViewOnClickListenerC8460c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o6j0.m162859c("e_match_emoji", "p_successful_match_view", o6j0.C18854a.m162876f("select_emoji", 2));
            pxe.m171835c().m171846l("EMOJI_63");
            tz00.m191126h(MatchSuccessPopView.this.act(), MatchSuccessPopView.this.f30551B.mo208470f(), MatchSuccessPopView.this.f30562n.getText().toString(), false, new a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$d */
    public class ViewOnClickListenerC8461d implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$d$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MatchSuccessPopView.this.f30551B.mo208467a(MatchSuccessPopView.this.act(), true);
            }
        }

        public ViewOnClickListenerC8461d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o6j0.m162859c("e_match_emoji", "p_successful_match_view", o6j0.C18854a.m162876f("select_emoji", 3));
            pxe.m171835c().m171846l("NEW_EMOJI_BEER");
            tz00.m191126h(MatchSuccessPopView.this.act(), MatchSuccessPopView.this.f30551B.mo208470f(), MatchSuccessPopView.this.f30564p.getText().toString(), false, new a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$e */
    public class ViewOnClickListenerC8462e implements View.OnClickListener {
        public ViewOnClickListenerC8462e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MatchSuccessPopView.this.f30551B.mo208470f() == null) {
                return;
            }
            o6j0.m162859c("e_matched_text_box", "p_successful_match_view", new o6j0.C18854a[0]);
            o6j0.m162864h("e_matched_send_message", "p_successful_match_view", new o6j0.C18854a[0]);
            MatchSuccessPopView.this.f30551B.mo208468b(true);
            MatchSuccessPopView.this.act().startActivityForResult(MessageHalfPageComposerAct.m48886l2(MatchSuccessPopView.this.act(), MatchSuccessPopView.this.f30551B.mo208470f().f56011id, MessageHalfPageComposerAct.f31607r), 112);
            MatchSuccessPopView.this.act().overridePendingTransition(rzb0.f161644p, rzb0.f161645q);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$f */
    public class ViewOnClickListenerC8463f implements View.OnClickListener {
        public ViewOnClickListenerC8463f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o6j0.m162859c("e_matched_later", "p_successful_match_view", new o6j0.C18854a[0]);
            MatchSuccessPopView.this.f30551B.mo208469c(true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$g */
    public class RunnableC8464g implements Runnable {
        public RunnableC8464g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xdl0.m208344M(MatchSuccessPopView.this.f30572x, false);
            xdl0.m208344M(MatchSuccessPopView.this.f30571w, false);
            xdl0.m208344M(MatchSuccessPopView.this.f30568t, true);
            xdl0.m208344M(MatchSuccessPopView.this.f30570v, true);
            MatchSuccessPopView.this.mo47754s();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$h */
    public class RunnableC8465h implements Runnable {
        public RunnableC8465h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MatchSuccessPopView.this.m47749m0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$i */
    public class RunnableC8466i implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f30587a;

        public RunnableC8466i(Animator animator) {
            this.f30587a = animator;
        }

        @Override // java.lang.Runnable
        public void run() {
            xdl0.m208344M(MatchSuccessPopView.this.f30569u, true);
            xdl0.m208344M(MatchSuccessPopView.this.f30555g, true);
            xdl0.m208344M(MatchSuccessPopView.this.f30557i, true);
            xdl0.m208344M(MatchSuccessPopView.this.f30571w, false);
            xdl0.m208344M(MatchSuccessPopView.this.f30572x, false);
            this.f30587a.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$j */
    public class RunnableC8467j implements Runnable {
        public RunnableC8467j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MatchSuccessPopView.this.m47752p0();
            MatchSuccessPopView.this.m47749m0();
        }
    }

    public MatchSuccessPopView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Act act() {
        return (Act) xdl0.m208326D(getContext());
    }

    @Override // p149l.awl
    /* JADX INFO: renamed from: E */
    public void mo47744E(User user) {
        mo47755w(user, true);
        xdl0.m208344M(this.f30569u, false);
        xdl0.m208344M(this.f30555g, false);
        xdl0.m208344M(this.f30557i, false);
        Property property = View.ALPHA;
        Animator animatorM103739l = bt0.m103739l(this.f30570v, property, 0L, 300L, new LinearInterpolator(), 1.0f, 0.0f);
        Animator animatorM103739l2 = bt0.m103739l(this.f30556h, property, 0L, 300L, new LinearInterpolator(), 1.0f, 0.0f);
        Animator animatorM103739l3 = bt0.m103739l(this.f30558j, property, 0L, 300L, new LinearInterpolator(), 1.0f, 0.0f);
        VDraweeView vDraweeView = this.f30570v;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float[] fArr = {0.0f, -t100.m186890d(15.0f)};
        Property property2 = View.TRANSLATION_Y;
        Animator animatorM103753z = bt0.m103753z(animatorM103739l, animatorM103739l2, animatorM103739l3, bt0.m103739l(vDraweeView, property2, 0L, 300L, linearInterpolator, fArr), bt0.m103739l(this.f30556h, property2, 0L, 300L, new LinearInterpolator(), 0.0f, -t100.m186890d(5.0f)), bt0.m103739l(this.f30558j, property2, 0L, 300L, new LinearInterpolator(), 0.0f, -t100.m186890d(5.0f)));
        Animator animatorM103753z2 = bt0.m103753z(bt0.m103739l(this.f30569u, property, 0L, 300L, new LinearInterpolator(), 0.0f, 1.0f), bt0.m103739l(this.f30555g, property, 0L, 300L, new LinearInterpolator(), 0.0f, 1.0f), bt0.m103739l(this.f30557i, property, 0L, 300L, new LinearInterpolator(), 0.0f, 1.0f), bt0.m103739l(this.f30569u, property2, 0L, 300L, new LinearInterpolator(), t100.m186890d(15.0f), 0.0f), bt0.m103739l(this.f30555g, property2, 0L, 300L, new LinearInterpolator(), t100.m186890d(5.0f), 0.0f), bt0.m103739l(this.f30557i, property2, 0L, 300L, new LinearInterpolator(), t100.m186890d(5.0f), 0.0f));
        bt0.m103733f(animatorM103753z, new RunnableC8466i(animatorM103753z2));
        bt0.m103733f(animatorM103753z2, new RunnableC8467j());
        animatorM103753z.start();
    }

    @Override // p149l.awl
    /* JADX INFO: renamed from: N */
    public void mo47745N(Runnable runnable) {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), rzb0.f161634f);
        animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC8459b(runnable));
        getRootView().startAnimation(animationLoadAnimation);
    }

    @Override // p149l.awl
    /* JADX INFO: renamed from: V */
    public void mo47746V() {
        m47751o0();
        m47750n0();
    }

    @Override // p149l.awl
    /* JADX INFO: renamed from: a0 */
    public boolean mo47747a0() {
        return this.f30552d == null || this.f30553e == null || this.f30554f == null || this.f30555g == null || this.f30556h == null || this.f30557i == null || this.f30558j == null || this.f30559k == null || this.f30560l == null || this.f30561m == null || this.f30562n == null || this.f30563o == null || this.f30564p == null || this.f30565q == null || this.f30566r == null || this.f30567s == null || this.f30568t == null || this.f30569u == null || this.f30570v == null || this.f30571w == null || this.f30573y == null || this.f30572x == null || this.f30574z == null || this.f30550A == null;
    }

    @Override // android.view.View, p149l.awl
    public View getRootView() {
        return this;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m47748l0(View view) {
        zdx.m218243a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m47749m0() {
        if (this.f30551B.mo208470f() != null && jjb0.m141784b()) {
            CoreModule.m29932K().showUserVerificationLogo(getContext(), this.f30551B.mo208470f(), this.f30573y);
            xdl0.m208344M(this.f30574z, false);
            xdl0.m208344M(this.f30572x, xdl0.m208349O0(this.f30573y));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m47750n0() {
        if (mo47747a0()) {
            return;
        }
        wqf0 wqf0Var = new wqf0(0.5f);
        VDraweeView vDraweeView = this.f30568t;
        float[] fArr = {-t100.m186890d(60.0f), t100.m186890d(10.0f)};
        Property property = View.TRANSLATION_X;
        Animator animatorM103739l = bt0.m103739l(vDraweeView, property, 200L, 1500L, wqf0Var, fArr);
        Animator animatorM103739l2 = bt0.m103739l(this.f30570v, property, 200L, 1500L, wqf0Var, t100.m186890d(60.0f), -t100.m186890d(10.0f));
        Property property2 = View.ALPHA;
        Animator animatorM103739l3 = bt0.m103739l(this.f30568t, property2, 200L, 100L, new LinearInterpolator(), 0.0f, 1.0f);
        Animator animatorM103739l4 = bt0.m103739l(this.f30570v, property2, 200L, 100L, new LinearInterpolator(), 0.0f, 1.0f);
        bt0.m103749v(animatorM103739l, new RunnableC8464g());
        bt0.m103733f(animatorM103739l, new RunnableC8465h());
        bt0.m103753z(animatorM103739l, animatorM103739l2, animatorM103739l3, animatorM103739l4).start();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m47751o0() {
        if (mo47747a0()) {
            return;
        }
        bt0.m103753z(bt0.m103739l(this.f30552d, View.ALPHA, 0L, 300L, new DecelerateInterpolator(), 0.0f, 1.0f), bt0.m103739l(this.f30552d, View.TRANSLATION_Y, 0L, 300L, new DecelerateInterpolator(), -t100.m186890d(20.0f), 0.0f)).start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47748l0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m47752p0() {
        if (mo47747a0()) {
            return;
        }
        VDraweeView vDraweeView = this.f30570v;
        this.f30570v = this.f30569u;
        this.f30569u = vDraweeView;
        xdl0.m208344M(vDraweeView, false);
        VText vText = this.f30556h;
        this.f30556h = this.f30555g;
        this.f30555g = vText;
        xdl0.m208344M(vText, false);
        VText vText2 = this.f30558j;
        this.f30558j = this.f30557i;
        this.f30557i = vText2;
        xdl0.m208344M(vText2, false);
    }

    @Override // p149l.awl
    /* JADX INFO: renamed from: r */
    public void mo47753r() {
        this.f30556h.setTypeface(eqh0.m117752c(3), 1);
        this.f30555g.setTypeface(eqh0.m117752c(3), 1);
        this.f30566r.setTypeface(eqh0.m117752c(3), 1);
        this.f30560l.setText("[" + getContext().getString(R$string.f18704lj) + Constants.AES_SUFFIX);
        this.f30562n.setText("[" + getContext().getString(R$string.f18536g4) + Constants.AES_SUFFIX);
        this.f30564p.setText("[" + getContext().getString(R$string.f18673kj) + Constants.AES_SUFFIX);
        xdl0.m208329E0(this.f30559k, new ViewOnClickListenerC8458a());
        xdl0.m208329E0(this.f30561m, new ViewOnClickListenerC8460c());
        xdl0.m208329E0(this.f30563o, new ViewOnClickListenerC8461d());
        xdl0.m208329E0(this.f30565q, new ViewOnClickListenerC8462e());
        xdl0.m208329E0(this.f30554f, new ViewOnClickListenerC8463f());
    }

    @Override // p149l.awl
    /* JADX INFO: renamed from: s */
    public void mo47754s() {
        if (mo47747a0()) {
            return;
        }
        SVGALoader.with(this.f30550A.getContext()).from("https://auto.tancdn.com/v1/raw/43f6acda-0599-43c7-95cb-4b2b00f758ba11.so").autoPlay(true).repeatCount(1).into(this.f30550A);
    }

    @Override // p149l.awl
    /* JADX INFO: renamed from: w */
    public void mo47755w(User user, boolean z) {
        StringBuilder sb = new StringBuilder("新配对");
        if (TextUtils.isEmpty(user.description)) {
            if (!TextUtils.isEmpty(user.location.region.city) && !user.isHideLocationFromSVip()) {
                sb.append(" · ");
                sb.append(user.location.region.city);
                String strM133876p = i0g0.m133876p(user.location.distance, true);
                if (!TextUtils.isEmpty(strM133876p)) {
                    sb.append("(");
                    sb.append(strM133876p);
                    sb.append(")");
                }
            }
            if (!TextUtils.isEmpty(i0g0.m133869j0(user.profile.zodiac))) {
                sb.append(" · ");
                sb.append(i0g0.m133869j0(user.profile.zodiac));
            }
            if (user.age.intValue() > 0 && !user.isHideAgeFromSVip()) {
                sb.append(" · ");
                sb.append(user.age);
                sb.append("岁");
            }
        } else {
            sb.append(" · ");
            sb.append(ddj0.m111024e(user.description));
        }
        if (z) {
            this.f30555g.setText(user.name);
            this.f30557i.setText(sb.toString());
            qib0.f154691G.m102327J0(this.f30569u, user.m60124fp().profileMiddle(), false);
        } else {
            this.f30556h.setText(user.name);
            this.f30558j.setText(sb.toString());
            qib0.f154691G.m102327J0(this.f30570v, user.m60124fp().profileMiddle(), false);
        }
        qib0.f154691G.m102327J0(this.f30568t, CoreModule.m29932K().me_().m60124fp().profileMiddle(), false);
    }

    @Override // p149l.awl
    /* JADX INFO: renamed from: x */
    public void mo47756x(zvl zvlVar) {
        super.mo47756x(zvlVar);
        this.f30551B = zvlVar;
    }

    public MatchSuccessPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MatchSuccessPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
