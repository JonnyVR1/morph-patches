package com.p000p1.mobile.putong.core.p001ui.match.view;

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
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageHalfPageComposerAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.ddj0;
import l.i0g0;
import l.jjb0;
import l.o6j0;
import l.qib0;
import l.rzb0;
import l.t100;
import l.tz00;
import l.wqf0;
import l.xdl0;
import l.zdx;
import p003l.awl;
import p003l.eqh0;
import p003l.pxe;
import p003l.zvl;
import p028v.VDraweeView;
import p028v.VFrame;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MatchSuccessPopView extends ConstraintLayout implements awl {

    /* JADX INFO: renamed from: A */
    public SVGAnimationView f441A;

    /* JADX INFO: renamed from: B */
    public zvl f442B;

    /* JADX INFO: renamed from: d */
    public MatchSuccessPopView f443d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f444e;

    /* JADX INFO: renamed from: f */
    public VImage f445f;

    /* JADX INFO: renamed from: g */
    public VText f446g;

    /* JADX INFO: renamed from: h */
    public VText f447h;

    /* JADX INFO: renamed from: i */
    public VText f448i;

    /* JADX INFO: renamed from: j */
    public VText f449j;

    /* JADX INFO: renamed from: k */
    public VLinear f450k;

    /* JADX INFO: renamed from: l */
    public VText f451l;

    /* JADX INFO: renamed from: m */
    public VLinear f452m;

    /* JADX INFO: renamed from: n */
    public VText f453n;

    /* JADX INFO: renamed from: o */
    public VLinear f454o;

    /* JADX INFO: renamed from: p */
    public VText f455p;

    /* JADX INFO: renamed from: q */
    public VLinear f456q;

    /* JADX INFO: renamed from: r */
    public VText f457r;

    /* JADX INFO: renamed from: s */
    public Guideline f458s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f459t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f460u;

    /* JADX INFO: renamed from: v */
    public VDraweeView f461v;

    /* JADX INFO: renamed from: w */
    public View f462w;

    /* JADX INFO: renamed from: x */
    public VFrame f463x;

    /* JADX INFO: renamed from: y */
    public VImage f464y;

    /* JADX INFO: renamed from: z */
    public VImage f465z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$a */
    public class ViewOnClickListenerC0041a implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MatchSuccessPopView.this.f442B.m9485a(MatchSuccessPopView.this.act(), true);
            }
        }

        public ViewOnClickListenerC0041a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o6j0.c("e_match_emoji", "p_successful_match_view", new o6j0.a[]{o6j0.a.f("select_emoji", 1)});
            pxe.m6948c().m6959l("NEW_EMOJI_HAHE");
            tz00.h(MatchSuccessPopView.this.act(), MatchSuccessPopView.this.f442B.m9488f(), MatchSuccessPopView.this.f451l.getText().toString(), false, new a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$b */
    public class AnimationAnimationListenerC0042b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f468a;

        public AnimationAnimationListenerC0042b(Runnable runnable) {
            this.f468a = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (NullChecker.a(this.f468a)) {
                this.f468a.run();
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
    public class ViewOnClickListenerC0043c implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MatchSuccessPopView.this.f442B.m9485a(MatchSuccessPopView.this.act(), true);
            }
        }

        public ViewOnClickListenerC0043c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o6j0.c("e_match_emoji", "p_successful_match_view", new o6j0.a[]{o6j0.a.f("select_emoji", 2)});
            pxe.m6948c().m6959l("EMOJI_63");
            tz00.h(MatchSuccessPopView.this.act(), MatchSuccessPopView.this.f442B.m9488f(), MatchSuccessPopView.this.f453n.getText().toString(), false, new a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$d */
    public class ViewOnClickListenerC0044d implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$d$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MatchSuccessPopView.this.f442B.m9485a(MatchSuccessPopView.this.act(), true);
            }
        }

        public ViewOnClickListenerC0044d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o6j0.c("e_match_emoji", "p_successful_match_view", new o6j0.a[]{o6j0.a.f("select_emoji", 3)});
            pxe.m6948c().m6959l("NEW_EMOJI_BEER");
            tz00.h(MatchSuccessPopView.this.act(), MatchSuccessPopView.this.f442B.m9488f(), MatchSuccessPopView.this.f455p.getText().toString(), false, new a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$e */
    public class ViewOnClickListenerC0045e implements View.OnClickListener {
        public ViewOnClickListenerC0045e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MatchSuccessPopView.this.f442B.m9488f() == null) {
                return;
            }
            o6j0.c("e_matched_text_box", "p_successful_match_view", new o6j0.a[0]);
            o6j0.h("e_matched_send_message", "p_successful_match_view", new o6j0.a[0]);
            MatchSuccessPopView.this.f442B.m9486b(true);
            MatchSuccessPopView.this.act().startActivityForResult(MessageHalfPageComposerAct.m1973l2(MatchSuccessPopView.this.act(), ((DbObject) MatchSuccessPopView.this.f442B.m9488f()).id, MessageHalfPageComposerAct.f1498r), 112);
            MatchSuccessPopView.this.act().overridePendingTransition(rzb0.p, rzb0.q);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$f */
    public class ViewOnClickListenerC0046f implements View.OnClickListener {
        public ViewOnClickListenerC0046f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o6j0.c("e_matched_later", "p_successful_match_view", new o6j0.a[0]);
            MatchSuccessPopView.this.f442B.m9487c(true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$g */
    public class RunnableC0047g implements Runnable {
        public RunnableC0047g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xdl0.M(MatchSuccessPopView.this.f463x, false);
            xdl0.M(MatchSuccessPopView.this.f462w, false);
            xdl0.M(MatchSuccessPopView.this.f459t, true);
            xdl0.M(MatchSuccessPopView.this.f461v, true);
            MatchSuccessPopView.this.mo818s();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$h */
    public class RunnableC0048h implements Runnable {
        public RunnableC0048h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MatchSuccessPopView.this.m813m0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$i */
    public class RunnableC0049i implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f478a;

        public RunnableC0049i(Animator animator) {
            this.f478a = animator;
        }

        @Override // java.lang.Runnable
        public void run() {
            xdl0.M(MatchSuccessPopView.this.f460u, true);
            xdl0.M(MatchSuccessPopView.this.f446g, true);
            xdl0.M(MatchSuccessPopView.this.f448i, true);
            xdl0.M(MatchSuccessPopView.this.f462w, false);
            xdl0.M(MatchSuccessPopView.this.f463x, false);
            this.f478a.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopView$j */
    public class RunnableC0050j implements Runnable {
        public RunnableC0050j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MatchSuccessPopView.this.m816p0();
            MatchSuccessPopView.this.m813m0();
        }
    }

    public MatchSuccessPopView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public Act act() {
        return xdl0.D(getContext());
    }

    @Override // p003l.awl
    /* JADX INFO: renamed from: E */
    public void mo808E(User user) {
        mo819w(user, true);
        xdl0.M(this.f460u, false);
        xdl0.M(this.f446g, false);
        xdl0.M(this.f448i, false);
        Property property = View.ALPHA;
        Animator animatorL = bt0.l(this.f461v, property, 0L, 300L, new LinearInterpolator(), new float[]{1.0f, 0.0f});
        Animator animatorL2 = bt0.l(this.f447h, property, 0L, 300L, new LinearInterpolator(), new float[]{1.0f, 0.0f});
        Animator animatorL3 = bt0.l(this.f449j, property, 0L, 300L, new LinearInterpolator(), new float[]{1.0f, 0.0f});
        SimpleDraweeView simpleDraweeView = this.f461v;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        float[] fArr = {0.0f, -t100.d(15.0f)};
        Property property2 = View.TRANSLATION_Y;
        Animator animatorZ = bt0.z(new Animator[]{animatorL, animatorL2, animatorL3, bt0.l(simpleDraweeView, property2, 0L, 300L, linearInterpolator, fArr), bt0.l(this.f447h, property2, 0L, 300L, new LinearInterpolator(), new float[]{0.0f, -t100.d(5.0f)}), bt0.l(this.f449j, property2, 0L, 300L, new LinearInterpolator(), new float[]{0.0f, -t100.d(5.0f)})});
        Animator animatorZ2 = bt0.z(new Animator[]{bt0.l(this.f460u, property, 0L, 300L, new LinearInterpolator(), new float[]{0.0f, 1.0f}), bt0.l(this.f446g, property, 0L, 300L, new LinearInterpolator(), new float[]{0.0f, 1.0f}), bt0.l(this.f448i, property, 0L, 300L, new LinearInterpolator(), new float[]{0.0f, 1.0f}), bt0.l(this.f460u, property2, 0L, 300L, new LinearInterpolator(), new float[]{t100.d(15.0f), 0.0f}), bt0.l(this.f446g, property2, 0L, 300L, new LinearInterpolator(), new float[]{t100.d(5.0f), 0.0f}), bt0.l(this.f448i, property2, 0L, 300L, new LinearInterpolator(), new float[]{t100.d(5.0f), 0.0f})});
        bt0.f(animatorZ, new RunnableC0049i(animatorZ2));
        bt0.f(animatorZ2, new RunnableC0050j());
        animatorZ.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.awl
    /* JADX INFO: renamed from: N */
    public void mo809N(Runnable runnable) {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), rzb0.f);
        animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC0042b(runnable));
        getRootView().startAnimation(animationLoadAnimation);
    }

    @Override // p003l.awl
    /* JADX INFO: renamed from: V */
    public void mo810V() {
        m815o0();
        m814n0();
    }

    @Override // p003l.awl
    /* JADX INFO: renamed from: a0 */
    public boolean mo811a0() {
        return this.f443d == null || this.f444e == null || this.f445f == null || this.f446g == null || this.f447h == null || this.f448i == null || this.f449j == null || this.f450k == null || this.f451l == null || this.f452m == null || this.f453n == null || this.f454o == null || this.f455p == null || this.f456q == null || this.f457r == null || this.f458s == null || this.f459t == null || this.f460u == null || this.f461v == null || this.f462w == null || this.f464y == null || this.f463x == null || this.f465z == null || this.f441A == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.awl
    public View getRootView() {
        return this;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m812l0(View view) {
        zdx.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public final void m813m0() {
        if (this.f442B.m9488f() != null && jjb0.b()) {
            CoreModule.K().showUserVerificationLogo(getContext(), this.f442B.m9488f(), this.f464y);
            xdl0.M(this.f465z, false);
            xdl0.M(this.f463x, xdl0.O0(this.f464y));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m814n0() {
        if (mo811a0()) {
            return;
        }
        wqf0 wqf0Var = new wqf0(0.5f);
        SimpleDraweeView simpleDraweeView = this.f459t;
        float[] fArr = {-t100.d(60.0f), t100.d(10.0f)};
        Property property = View.TRANSLATION_X;
        Animator animatorL = bt0.l(simpleDraweeView, property, 200L, 1500L, wqf0Var, fArr);
        Animator animatorL2 = bt0.l(this.f461v, property, 200L, 1500L, wqf0Var, new float[]{t100.d(60.0f), -t100.d(10.0f)});
        Property property2 = View.ALPHA;
        Animator animatorL3 = bt0.l(this.f459t, property2, 200L, 100L, new LinearInterpolator(), new float[]{0.0f, 1.0f});
        Animator animatorL4 = bt0.l(this.f461v, property2, 200L, 100L, new LinearInterpolator(), new float[]{0.0f, 1.0f});
        bt0.v(animatorL, new RunnableC0047g());
        bt0.f(animatorL, new RunnableC0048h());
        bt0.z(new Animator[]{animatorL, animatorL2, animatorL3, animatorL4}).start();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m815o0() {
        if (mo811a0()) {
            return;
        }
        bt0.z(new Animator[]{bt0.l(this.f443d, View.ALPHA, 0L, 300L, new DecelerateInterpolator(), new float[]{0.0f, 1.0f}), bt0.l(this.f443d, View.TRANSLATION_Y, 0L, 300L, new DecelerateInterpolator(), new float[]{-t100.d(20.0f), 0.0f})}).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m812l0(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, v.VDraweeView] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, v.VText] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, v.VText] */
    /* JADX INFO: renamed from: p0 */
    public final void m816p0() {
        if (mo811a0()) {
            return;
        }
        ?? r0 = this.f461v;
        this.f461v = this.f460u;
        this.f460u = r0;
        xdl0.M((View) r0, false);
        ?? r1 = this.f447h;
        this.f447h = this.f446g;
        this.f446g = r1;
        xdl0.M((View) r1, false);
        ?? r2 = this.f449j;
        this.f449j = this.f448i;
        this.f448i = r2;
        xdl0.M((View) r2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.awl
    /* JADX INFO: renamed from: r */
    public void mo817r() {
        this.f447h.setTypeface(eqh0.m3924c(3), 1);
        this.f446g.setTypeface(eqh0.m3924c(3), 1);
        this.f457r.setTypeface(eqh0.m3924c(3), 1);
        this.f451l.setText("[" + getContext().getString(R.string.lj) + "]");
        this.f453n.setText("[" + getContext().getString(R.string.g4) + "]");
        this.f455p.setText("[" + getContext().getString(R.string.kj) + "]");
        xdl0.E0(this.f450k, new ViewOnClickListenerC0041a());
        xdl0.E0(this.f452m, new ViewOnClickListenerC0043c());
        xdl0.E0(this.f454o, new ViewOnClickListenerC0044d());
        xdl0.E0(this.f456q, new ViewOnClickListenerC0045e());
        xdl0.E0(this.f445f, new ViewOnClickListenerC0046f());
    }

    @Override // p003l.awl
    /* JADX INFO: renamed from: s */
    public void mo818s() {
        if (mo811a0()) {
            return;
        }
        SVGALoader.with(this.f441A.getContext()).from("https://auto.tancdn.com/v1/raw/43f6acda-0599-43c7-95cb-4b2b00f758ba11.so").autoPlay(true).repeatCount(1).into(this.f441A);
    }

    @Override // p003l.awl
    /* JADX INFO: renamed from: w */
    public void mo819w(User user, boolean z) {
        StringBuilder sb = new StringBuilder("新配对");
        if (TextUtils.isEmpty(user.description)) {
            if (!TextUtils.isEmpty(user.location.region.city) && !user.isHideLocationFromSVip()) {
                sb.append(" · ");
                sb.append(user.location.region.city);
                String strP = i0g0.p(user.location.distance, true);
                if (!TextUtils.isEmpty(strP)) {
                    sb.append("(");
                    sb.append(strP);
                    sb.append(")");
                }
            }
            if (!TextUtils.isEmpty(i0g0.j0(user.profile.zodiac))) {
                sb.append(" · ");
                sb.append(i0g0.j0(user.profile.zodiac));
            }
            if (user.age.intValue() > 0 && !user.isHideAgeFromSVip()) {
                sb.append(" · ");
                sb.append(user.age);
                sb.append("岁");
            }
        } else {
            sb.append(" · ");
            sb.append(ddj0.e(user.description));
        }
        if (z) {
            this.f446g.setText(user.name);
            this.f448i.setText(sb.toString());
            qib0.G.J0(this.f460u, user.fp().profileMiddle(), false);
        } else {
            this.f447h.setText(user.name);
            this.f449j.setText(sb.toString());
            qib0.G.J0(this.f461v, user.fp().profileMiddle(), false);
        }
        qib0.G.J0(this.f459t, CoreModule.K().me_().fp().profileMiddle(), false);
    }

    @Override // p003l.awl
    /* JADX INFO: renamed from: x */
    public void mo820x(zvl zvlVar) {
        super.mo820x(zvlVar);
        this.f442B = zvlVar;
    }

    public MatchSuccessPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MatchSuccessPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
