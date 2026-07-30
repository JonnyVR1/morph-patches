package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import p151v.VButton;
import p151v.VButton_FakeShadow;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VLinear_FillerMeasure;
import p151v.VScroll_Horizontal;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class h3g implements iam<b3g> {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f107639a;

    /* JADX INFO: renamed from: b */
    public View f107640b;

    /* JADX INFO: renamed from: c */
    public View f107641c;

    /* JADX INFO: renamed from: d */
    public View f107642d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f107643e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f107644f;

    /* JADX INFO: renamed from: g */
    public VText f107645g;

    /* JADX INFO: renamed from: h */
    public VLinear_FillerMeasure f107646h;

    /* JADX INFO: renamed from: i */
    public VText f107647i;

    /* JADX INFO: renamed from: j */
    public VText f107648j;

    /* JADX INFO: renamed from: k */
    public VText f107649k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f107650l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f107651m;

    /* JADX INFO: renamed from: n */
    public VText f107652n;

    /* JADX INFO: renamed from: o */
    public VButton_FakeShadow f107653o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f107654p;

    /* JADX INFO: renamed from: q */
    public VButton f107655q;

    /* JADX INFO: renamed from: r */
    public VButton f107656r;

    /* JADX INFO: renamed from: s */
    public VScroll_Horizontal f107657s;

    /* JADX INFO: renamed from: t */
    public VLinear f107658t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f107659u;

    /* JADX INFO: renamed from: v */
    public VText f107660v;

    /* JADX INFO: renamed from: w */
    public Act f107661w;

    /* JADX INFO: renamed from: x */
    public b3g f107662x;

    /* JADX INFO: renamed from: l.h3g$a */
    public class C17379a extends wpf0 {

        /* JADX INFO: renamed from: a */
        public int f107663a = bnl0.m105592y0();

        public C17379a() {
        }

        @Override // p153l.wpf0, p153l.gzf0
        /* JADX INFO: renamed from: c */
        public void mo9296c(syf0 syf0Var) {
            float fM188550d = 1.0f - ((float) syf0Var.m188550d());
            h3g.this.f107653o.setTranslationX(this.f107663a * fM188550d);
            h3g.this.f107652n.setTranslationX((-fM188550d) * this.f107663a);
        }
    }

    public h3g(Act act) {
        this.f107661w = act;
    }

    /* JADX INFO: renamed from: j */
    private boolean m133472j(User user) {
        return TEnum.equals(user.gender, "female");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m133473k(syf0 syf0Var) {
        syf0Var.m188547a(new C17379a());
        syf0Var.m188561o(1.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m133474l() {
        this.f107662x.m102330s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m133475m(View view) {
        this.f107662x.m102331t0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m133476n(View view) {
        act().m51642n2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m133477p(View view) {
        act().m51642n2();
    }

    /* JADX INFO: renamed from: r */
    private void m133478r() {
        bnl0.m105509E0(this.f107653o, new View.OnClickListener() { // from class: l.g3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101984a.m133477p(view);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f107661w;
    }

    public Animator enterAnimation() {
        final syf0 syf0VarM187585c = izf0.m142800h().m187585c();
        syf0VarM187585c.m188562p(new uyf0(300.0d, 13.0d));
        act().postDelayed(new Runnable() { // from class: l.f3g
            @Override // java.lang.Runnable
            public final void run() {
                this.f96989a.m133473k(syf0VarM187585c);
            }
        }, 600L);
        AnticipateInterpolator anticipateInterpolator = new AnticipateInterpolator();
        VText vText = this.f107660v;
        Property property = View.ALPHA;
        ArrayList arrayListM147507f0 = jyb.m147507f0(gt0.m132166l(vText, property, 0L, 600L, anticipateInterpolator, 1.0f), gt0.m132166l(this.f107643e, property, 0L, 480L, null, 1.0f), gt0.m132166l(this.f107644f, property, 0L, 480L, null, 1.0f), gt0.m132166l(this.f107643e, gt0.f106354i, 200L, 800L, new OvershootInterpolator(2.0f), 1.0f), gt0.m132166l(this.f107644f, gt0.f106354i, 200L, 800L, new OvershootInterpolator(2.0f), 1.0f));
        return gt0.m132156b(this.f107643e, gt0.m132180z((Animator[]) arrayListM147507f0.toArray(new Animator[arrayListM147507f0.size()])));
    }

    public Animator exitAnimation() {
        AnticipateInterpolator anticipateInterpolator = new AnticipateInterpolator();
        ArrayList arrayListM147507f0 = jyb.m147507f0(gt0.m132166l(this.f107643e, gt0.f106354i, 0L, 500L, anticipateInterpolator, 0.0f), gt0.m132170p(this.f107643e, "alpha", 0L, 500L, anticipateInterpolator, 0.0f), gt0.m132166l(this.f107644f, gt0.f106354i, 0L, 500L, anticipateInterpolator, 0.0f), gt0.m132170p(this.f107644f, "alpha", 0L, 500L, anticipateInterpolator, 0.0f));
        Animator animatorM132180z = gt0.m132180z((Animator[]) arrayListM147507f0.toArray(new Animator[arrayListM147507f0.size()]));
        if (this.f107662x.m102325l0()) {
            return gt0.m132156b(this.f107643e, animatorM132180z);
        }
        bnl0.m105525M0(this.f107653o, false);
        VText vText = this.f107652n;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vText, BaseSei.f14624X, -vText.getWidth());
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        gt0.m132160f(animatorSet, new Runnable() { // from class: l.c3g
            @Override // java.lang.Runnable
            public final void run() {
                this.f79601a.m133474l();
            }
        });
        animatorSet.play(animatorM132180z).after(objectAnimatorOfFloat);
        return animatorSet;
    }

    /* JADX INFO: renamed from: f */
    public View m133479f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i3g.m138286b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(b3g b3gVar) {
        this.f107662x = b3gVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM133479f = m133479f(layoutInflater, viewGroup);
        m133478r();
        bnl0.m105509E0(this.f107652n, new View.OnClickListener() { // from class: l.d3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84894a.m133475m(view);
            }
        });
        bnl0.m105509E0(viewM133479f, new View.OnClickListener() { // from class: l.e3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91953a.m133476n(view);
            }
        });
        return viewM133479f;
    }

    public void initAnimationState() {
        this.f107660v.setAlpha(0.0f);
        this.f107643e.setAlpha(0.0f);
        bnl0.m105582t0(this.f107643e, 0.1f);
        this.f107644f.setAlpha(0.0f);
        bnl0.m105582t0(this.f107644f, 0.1f);
        int iM105592y0 = bnl0.m105592y0();
        this.f107653o.setTranslationX(iM105592y0);
        this.f107652n.setTranslationX(-iM105592y0);
    }

    /* JADX INFO: renamed from: q */
    public void m133481q(User user, User user2) {
        uqb0.f180374G.m127115L0(this.f107643e, user2.m61308fp().profileBig().formatted());
        uqb0.f180374G.m127120O(this.f107644f, user.m61308fp().profileBig().formatted(), 2, 100);
        this.f107647i.setText(user.name);
        this.f107649k.setText(q8g0.m175796b0(this.f107661w.getResources().getString(m133472j(user) ? R$string.f21333J0 : R$string.f21330I0), jyb.m147507f0(this.f107661w.getResources().getString(R$string.f21336K0)), Color.parseColor("#ffc96b"), lyh0.m156283c(2)));
        this.f107653o.setText(this.f107661w.getResources().getText(m133472j(user) ? R$string.f21327H0 : R$string.f21324G0));
        bnl0.m105524M(this.f107645g, yie0.m216084q(user));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
