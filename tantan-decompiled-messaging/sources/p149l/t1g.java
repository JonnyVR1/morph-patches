package p149l;

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
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import p147v.VButton;
import p147v.VButton_FakeShadow;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VLinear_FillerMeasure;
import p147v.VScroll_Horizontal;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class t1g implements s7m<n1g> {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f167316a;

    /* JADX INFO: renamed from: b */
    public View f167317b;

    /* JADX INFO: renamed from: c */
    public View f167318c;

    /* JADX INFO: renamed from: d */
    public View f167319d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f167320e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f167321f;

    /* JADX INFO: renamed from: g */
    public VText f167322g;

    /* JADX INFO: renamed from: h */
    public VLinear_FillerMeasure f167323h;

    /* JADX INFO: renamed from: i */
    public VText f167324i;

    /* JADX INFO: renamed from: j */
    public VText f167325j;

    /* JADX INFO: renamed from: k */
    public VText f167326k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f167327l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f167328m;

    /* JADX INFO: renamed from: n */
    public VText f167329n;

    /* JADX INFO: renamed from: o */
    public VButton_FakeShadow f167330o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f167331p;

    /* JADX INFO: renamed from: q */
    public VButton f167332q;

    /* JADX INFO: renamed from: r */
    public VButton f167333r;

    /* JADX INFO: renamed from: s */
    public VScroll_Horizontal f167334s;

    /* JADX INFO: renamed from: t */
    public VLinear f167335t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f167336u;

    /* JADX INFO: renamed from: v */
    public VText f167337v;

    /* JADX INFO: renamed from: w */
    public Act f167338w;

    /* JADX INFO: renamed from: x */
    public n1g f167339x;

    /* JADX INFO: renamed from: l.t1g$a */
    public class C20093a extends ohf0 {

        /* JADX INFO: renamed from: a */
        public int f167340a = xdl0.m208412y0();

        public C20093a() {
        }

        @Override // p149l.ohf0, p149l.xqf0
        /* JADX INFO: renamed from: c */
        public void mo9242c(jqf0 jqf0Var) {
            float fM142793d = 1.0f - ((float) jqf0Var.m142793d());
            t1g.this.f167330o.setTranslationX(this.f167340a * fM142793d);
            t1g.this.f167329n.setTranslationX((-fM142793d) * this.f167340a);
        }
    }

    public t1g(Act act) {
        this.f167338w = act;
    }

    /* JADX INFO: renamed from: j */
    private boolean m186903j(User user) {
        return TEnum.equals(user.gender, "female");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m186904k(jqf0 jqf0Var) {
        jqf0Var.m142790a(new C20093a());
        jqf0Var.m142804o(1.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m186905l() {
        this.f167339x.m157361s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m186906m(View view) {
        this.f167339x.m157362t0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m186907n(View view) {
        act().m50458m2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m186908p(View view) {
        act().m50458m2();
    }

    /* JADX INFO: renamed from: r */
    private void m186909r() {
        xdl0.m208329E0(this.f167330o, new View.OnClickListener() { // from class: l.s1g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161888a.m186908p(view);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f167338w;
    }

    public Animator enterAnimation() {
        final jqf0 jqf0VarM108322c = zqf0.m219852h().m108322c();
        jqf0VarM108322c.m142805p(new lqf0(300.0d, 13.0d));
        act().postDelayed(new Runnable() { // from class: l.r1g
            @Override // java.lang.Runnable
            public final void run() {
                this.f157273a.m186904k(jqf0VarM108322c);
            }
        }, 600L);
        AnticipateInterpolator anticipateInterpolator = new AnticipateInterpolator();
        VText vText = this.f167337v;
        Property property = View.ALPHA;
        ArrayList arrayListM200324f0 = vwb.m200324f0(bt0.m103739l(vText, property, 0L, 600L, anticipateInterpolator, 1.0f), bt0.m103739l(this.f167320e, property, 0L, 480L, null, 1.0f), bt0.m103739l(this.f167321f, property, 0L, 480L, null, 1.0f), bt0.m103739l(this.f167320e, bt0.f77162i, 200L, 800L, new OvershootInterpolator(2.0f), 1.0f), bt0.m103739l(this.f167321f, bt0.f77162i, 200L, 800L, new OvershootInterpolator(2.0f), 1.0f));
        return bt0.m103729b(this.f167320e, bt0.m103753z((Animator[]) arrayListM200324f0.toArray(new Animator[arrayListM200324f0.size()])));
    }

    public Animator exitAnimation() {
        AnticipateInterpolator anticipateInterpolator = new AnticipateInterpolator();
        ArrayList arrayListM200324f0 = vwb.m200324f0(bt0.m103739l(this.f167320e, bt0.f77162i, 0L, 500L, anticipateInterpolator, 0.0f), bt0.m103743p(this.f167320e, "alpha", 0L, 500L, anticipateInterpolator, 0.0f), bt0.m103739l(this.f167321f, bt0.f77162i, 0L, 500L, anticipateInterpolator, 0.0f), bt0.m103743p(this.f167321f, "alpha", 0L, 500L, anticipateInterpolator, 0.0f));
        Animator animatorM103753z = bt0.m103753z((Animator[]) arrayListM200324f0.toArray(new Animator[arrayListM200324f0.size()]));
        if (this.f167339x.m157356l0()) {
            return bt0.m103729b(this.f167320e, animatorM103753z);
        }
        xdl0.m208345M0(this.f167330o, false);
        VText vText = this.f167329n;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vText, BaseSei.f13930X, -vText.getWidth());
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        bt0.m103733f(animatorSet, new Runnable() { // from class: l.o1g
            @Override // java.lang.Runnable
            public final void run() {
                this.f141428a.m186905l();
            }
        });
        animatorSet.play(animatorM103753z).after(objectAnimatorOfFloat);
        return animatorSet;
    }

    /* JADX INFO: renamed from: f */
    public View m186910f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u1g.m191415b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(n1g n1gVar) {
        this.f167339x = n1gVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM186910f = m186910f(layoutInflater, viewGroup);
        m186909r();
        xdl0.m208329E0(this.f167329n, new View.OnClickListener() { // from class: l.p1g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146673a.m186906m(view);
            }
        });
        xdl0.m208329E0(viewM186910f, new View.OnClickListener() { // from class: l.q1g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152129a.m186907n(view);
            }
        });
        return viewM186910f;
    }

    public void initAnimationState() {
        this.f167337v.setAlpha(0.0f);
        this.f167320e.setAlpha(0.0f);
        xdl0.m208402t0(this.f167320e, 0.1f);
        this.f167321f.setAlpha(0.0f);
        xdl0.m208402t0(this.f167321f, 0.1f);
        int iM208412y0 = xdl0.m208412y0();
        this.f167330o.setTranslationX(iM208412y0);
        this.f167329n.setTranslationX(-iM208412y0);
    }

    /* JADX INFO: renamed from: q */
    public void m186912q(User user, User user2) {
        qib0.f154691G.m102331L0(this.f167320e, user2.m60124fp().profileBig().formatted());
        qib0.f154691G.m102336O(this.f167321f, user.m60124fp().profileBig().formatted(), 2, 100);
        this.f167324i.setText(user.name);
        this.f167326k.setText(i0g0.m133861b0(this.f167338w.getResources().getString(m186903j(user) ? R$string.f20591J0 : R$string.f20588I0), vwb.m200324f0(this.f167338w.getResources().getString(R$string.f20594K0)), Color.parseColor("#ffc96b"), eqh0.m117752c(2)));
        this.f167330o.setText(this.f167338w.getResources().getText(m186903j(user) ? R$string.f20585H0 : R$string.f20582G0));
        xdl0.m208344M(this.f167322g, tae0.m187713q(user));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
