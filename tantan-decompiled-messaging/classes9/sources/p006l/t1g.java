package p006l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import l.bt0;
import l.eqh0;
import l.i0g0;
import l.jqf0;
import l.lqf0;
import l.ohf0;
import l.s7m;
import l.u1g;
import l.vwb;
import l.xdl0;
import l.zqf0;
import v.VButton;
import v.VButton_FakeShadow;
import v.VDraweeView;
import v.VLinear;
import v.VLinear_FillerMeasure;
import v.VScroll_Horizontal;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class t1g implements s7m<n1g> {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f21806a;

    /* JADX INFO: renamed from: b */
    public View f21807b;

    /* JADX INFO: renamed from: c */
    public View f21808c;

    /* JADX INFO: renamed from: d */
    public View f21809d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f21810e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f21811f;

    /* JADX INFO: renamed from: g */
    public VText f21812g;

    /* JADX INFO: renamed from: h */
    public VLinear_FillerMeasure f21813h;

    /* JADX INFO: renamed from: i */
    public VText f21814i;

    /* JADX INFO: renamed from: j */
    public VText f21815j;

    /* JADX INFO: renamed from: k */
    public VText f21816k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f21817l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f21818m;

    /* JADX INFO: renamed from: n */
    public VText f21819n;

    /* JADX INFO: renamed from: o */
    public VButton_FakeShadow f21820o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f21821p;

    /* JADX INFO: renamed from: q */
    public VButton f21822q;

    /* JADX INFO: renamed from: r */
    public VButton f21823r;

    /* JADX INFO: renamed from: s */
    public VScroll_Horizontal f21824s;

    /* JADX INFO: renamed from: t */
    public VLinear f21825t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f21826u;

    /* JADX INFO: renamed from: v */
    public VText f21827v;

    /* JADX INFO: renamed from: w */
    public Act f21828w;

    /* JADX INFO: renamed from: x */
    public n1g f21829x;

    /* JADX INFO: renamed from: l.t1g$a */
    public class C1296a extends ohf0 {

        /* JADX INFO: renamed from: a */
        public int f21830a = xdl0.y0();

        public C1296a() {
        }

        /* JADX INFO: renamed from: c */
        public void m24431c(jqf0 jqf0Var) {
            float fD = 1.0f - ((float) jqf0Var.d());
            t1g.this.f21820o.setTranslationX(this.f21830a * fD);
            t1g.this.f21819n.setTranslationX((-fD) * this.f21830a);
        }
    }

    public t1g(Act act) {
        this.f21828w = act;
    }

    /* JADX INFO: renamed from: j */
    private boolean m24419j(User user) {
        return TEnum.equals(user.gender, "female");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m24420k(jqf0 jqf0Var) {
        jqf0Var.a(new C1296a());
        jqf0Var.o(1.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m24421l() {
        this.f21829x.m19639s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m24422m(View view) {
        this.f21829x.m19640t0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m24423n(View view) {
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m24424p(View view) {
        act().finish();
    }

    /* JADX INFO: renamed from: r */
    private void m24425r() {
        xdl0.E0(this.f21820o, new View.OnClickListener() { // from class: l.s1g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20975a.m24424p(view);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m24426C0() {
        return this.f21828w;
    }

    public Animator enterAnimation() {
        final jqf0 jqf0VarC = zqf0.h().c();
        jqf0VarC.p(new lqf0(300.0d, 13.0d));
        act().postDelayed(new Runnable() { // from class: l.r1g
            @Override // java.lang.Runnable
            public final void run() {
                this.f20239a.m24420k(jqf0VarC);
            }
        }, 600L);
        AnticipateInterpolator anticipateInterpolator = new AnticipateInterpolator();
        VText vText = this.f21827v;
        Property property = View.ALPHA;
        ArrayList arrayListF0 = vwb.f0(new Animator[]{bt0.l(vText, property, 0L, 600L, anticipateInterpolator, new float[]{1.0f}), bt0.l(this.f21810e, property, 0L, 480L, (Interpolator) null, new float[]{1.0f}), bt0.l(this.f21811f, property, 0L, 480L, (Interpolator) null, new float[]{1.0f}), bt0.l(this.f21810e, bt0.i, 200L, 800L, new OvershootInterpolator(2.0f), new float[]{1.0f}), bt0.l(this.f21811f, bt0.i, 200L, 800L, new OvershootInterpolator(2.0f), new float[]{1.0f})});
        return bt0.b(this.f21810e, bt0.z((Animator[]) arrayListF0.toArray(new Animator[arrayListF0.size()])));
    }

    public Animator exitAnimation() {
        AnticipateInterpolator anticipateInterpolator = new AnticipateInterpolator();
        ArrayList arrayListF0 = vwb.f0(new Animator[]{bt0.l(this.f21810e, bt0.i, 0L, 500L, anticipateInterpolator, new float[]{0.0f}), bt0.p(this.f21810e, "alpha", 0L, 500L, anticipateInterpolator, new float[]{0.0f}), bt0.l(this.f21811f, bt0.i, 0L, 500L, anticipateInterpolator, new float[]{0.0f}), bt0.p(this.f21811f, "alpha", 0L, 500L, anticipateInterpolator, new float[]{0.0f})});
        Animator animatorZ = bt0.z((Animator[]) arrayListF0.toArray(new Animator[arrayListF0.size()]));
        if (this.f21829x.m19634l0()) {
            return bt0.b(this.f21810e, animatorZ);
        }
        xdl0.M0(this.f21820o, false);
        VText vText = this.f21819n;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vText, "x", -vText.getWidth());
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        bt0.f(animatorSet, new Runnable() { // from class: l.o1g
            @Override // java.lang.Runnable
            public final void run() {
                this.f17979a.m24421l();
            }
        });
        animatorSet.play(animatorZ).after(objectAnimatorOfFloat);
        return animatorSet;
    }

    /* JADX INFO: renamed from: f */
    public View m24427f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u1g.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m24429i1(n1g n1gVar) {
        this.f21829x = n1gVar;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM24427f = m24427f(layoutInflater, viewGroup);
        m24425r();
        xdl0.E0(this.f21819n, new View.OnClickListener() { // from class: l.p1g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18552a.m24422m(view);
            }
        });
        xdl0.E0(viewM24427f, new View.OnClickListener() { // from class: l.q1g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19514a.m24423n(view);
            }
        });
        return viewM24427f;
    }

    public void initAnimationState() {
        this.f21827v.setAlpha(0.0f);
        this.f21810e.setAlpha(0.0f);
        xdl0.t0(this.f21810e, 0.1f);
        this.f21811f.setAlpha(0.0f);
        xdl0.t0(this.f21811f, 0.1f);
        int iY0 = xdl0.y0();
        this.f21820o.setTranslationX(iY0);
        this.f21819n.setTranslationX(-iY0);
    }

    /* JADX INFO: renamed from: q */
    public void m24430q(User user, User user2) {
        qib0.f19782G.m12744L0(this.f21810e, user2.fp().profileBig().formatted());
        qib0.f19782G.m12749O(this.f21811f, user.fp().profileBig().formatted(), 2, 100);
        this.f21814i.setText(user.name);
        this.f21816k.setText(i0g0.b0(this.f21828w.getResources().getString(m24419j(user) ? R.string.J0 : R.string.I0), vwb.f0(new String[]{this.f21828w.getResources().getString(R.string.K0)}), Color.parseColor("#ffc96b"), eqh0.c(2)));
        this.f21820o.setText(this.f21828w.getResources().getText(m24419j(user) ? R.string.H0 : R.string.G0));
        xdl0.M(this.f21812g, tae0.m24555q(user));
    }

    public void destroy() {
    }
}
