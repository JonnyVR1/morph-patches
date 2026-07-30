package p153l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
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

/* JADX INFO: loaded from: classes11.dex */
public class k450 implements iam<e450> {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f123829a;

    /* JADX INFO: renamed from: b */
    public View f123830b;

    /* JADX INFO: renamed from: c */
    public View f123831c;

    /* JADX INFO: renamed from: d */
    public View f123832d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f123833e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f123834f;

    /* JADX INFO: renamed from: g */
    public VText f123835g;

    /* JADX INFO: renamed from: h */
    public VLinear_FillerMeasure f123836h;

    /* JADX INFO: renamed from: i */
    public VText f123837i;

    /* JADX INFO: renamed from: j */
    public VText f123838j;

    /* JADX INFO: renamed from: k */
    public VText f123839k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f123840l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f123841m;

    /* JADX INFO: renamed from: n */
    public VText f123842n;

    /* JADX INFO: renamed from: o */
    public VButton_FakeShadow f123843o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f123844p;

    /* JADX INFO: renamed from: q */
    public VButton f123845q;

    /* JADX INFO: renamed from: r */
    public VButton f123846r;

    /* JADX INFO: renamed from: s */
    public VScroll_Horizontal f123847s;

    /* JADX INFO: renamed from: t */
    public VLinear f123848t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f123849u;

    /* JADX INFO: renamed from: v */
    public VText f123850v;

    /* JADX INFO: renamed from: w */
    public Act f123851w;

    /* JADX INFO: renamed from: x */
    public e450 f123852x;

    /* JADX INFO: renamed from: l.k450$a */
    public class C18090a extends wpf0 {

        /* JADX INFO: renamed from: a */
        public int f123853a = bnl0.m105592y0();

        public C18090a() {
        }

        @Override // p153l.wpf0, p153l.gzf0
        /* JADX INFO: renamed from: c */
        public void mo9296c(syf0 syf0Var) {
            float fM188550d = 1.0f - ((float) syf0Var.m188550d());
            k450.this.f123843o.setTranslationX(this.f123853a * fM188550d);
            k450.this.f123842n.setTranslationX((-fM188550d) * this.f123853a);
        }
    }

    public k450(Act act) {
        this.f123851w = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m148227m(View view) {
        this.f123852x.m119377r0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m148228n(View view) {
        act().m51642n2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m148229p(View view) {
        act().m51642n2();
    }

    /* JADX INFO: renamed from: r */
    private void m148230r() {
        bnl0.m105509E0(this.f123843o, new View.OnClickListener() { // from class: l.j450
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118262a.m148229p(view);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f123851w;
    }

    public Animator enterAnimation() {
        final syf0 syf0VarM187585c = izf0.m142800h().m187585c();
        syf0VarM187585c.m188562p(new uyf0(300.0d, 13.0d));
        act().postDelayed(new Runnable() { // from class: l.g450
            @Override // java.lang.Runnable
            public final void run() {
                this.f102134a.m148234k(syf0VarM187585c);
            }
        }, 600L);
        AnticipateInterpolator anticipateInterpolator = new AnticipateInterpolator();
        VText vText = this.f123850v;
        Property property = View.ALPHA;
        ArrayList arrayListM147507f0 = jyb.m147507f0(gt0.m132166l(vText, property, 0L, 600L, anticipateInterpolator, 1.0f), gt0.m132166l(this.f123833e, property, 0L, 480L, null, 1.0f), gt0.m132166l(this.f123834f, property, 0L, 480L, null, 1.0f), gt0.m132166l(this.f123833e, gt0.f106354i, 200L, 800L, new OvershootInterpolator(2.0f), 1.0f), gt0.m132166l(this.f123834f, gt0.f106354i, 200L, 800L, new OvershootInterpolator(2.0f), 1.0f));
        return gt0.m132156b(this.f123833e, gt0.m132180z((Animator[]) arrayListM147507f0.toArray(new Animator[arrayListM147507f0.size()])));
    }

    public Animator exitAnimation() {
        AnticipateInterpolator anticipateInterpolator = new AnticipateInterpolator();
        ArrayList arrayListM147507f0 = jyb.m147507f0(gt0.m132166l(this.f123833e, gt0.f106354i, 0L, 500L, anticipateInterpolator, 0.0f), gt0.m132170p(this.f123833e, "alpha", 0L, 500L, anticipateInterpolator, 0.0f), gt0.m132166l(this.f123834f, gt0.f106354i, 0L, 500L, anticipateInterpolator, 0.0f), gt0.m132170p(this.f123834f, "alpha", 0L, 500L, anticipateInterpolator, 0.0f));
        Animator animatorM132180z = gt0.m132180z((Animator[]) arrayListM147507f0.toArray(new Animator[arrayListM147507f0.size()]));
        if (this.f123852x.m119372k0()) {
            return gt0.m132156b(this.f123833e, animatorM132180z);
        }
        bnl0.m105525M0(this.f123843o, false);
        VText vText = this.f123842n;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vText, BaseSei.f14624X, -vText.getWidth());
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        gt0.m132160f(animatorSet, new Runnable() { // from class: l.f450
            @Override // java.lang.Runnable
            public final void run() {
                this.f97051a.m148235l();
            }
        });
        animatorSet.play(animatorM132180z).after(objectAnimatorOfFloat);
        return animatorSet;
    }

    /* JADX INFO: renamed from: f */
    public View m148231f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l450.m152747b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(e450 e450Var) {
        this.f123852x = e450Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM148231f = m148231f(layoutInflater, viewGroup);
        m148230r();
        bnl0.m105509E0(this.f123842n, new View.OnClickListener() { // from class: l.h450
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107753a.m148227m(view);
            }
        });
        bnl0.m105509E0(viewM148231f, new View.OnClickListener() { // from class: l.i450
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112832a.m148228n(view);
            }
        });
        return viewM148231f;
    }

    public void initAnimationState() {
        this.f123850v.setAlpha(0.0f);
        this.f123833e.setAlpha(0.0f);
        bnl0.m105582t0(this.f123833e, 0.1f);
        this.f123834f.setAlpha(0.0f);
        bnl0.m105582t0(this.f123834f, 0.1f);
        int iM105592y0 = bnl0.m105592y0();
        this.f123843o.setTranslationX(iM105592y0);
        this.f123842n.setTranslationX(-iM105592y0);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m148233j(User user) {
        return TEnum.equals(user.gender, "female");
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m148234k(syf0 syf0Var) {
        syf0Var.m188547a(new C18090a());
        syf0Var.m188561o(1.0d);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m148235l() {
        this.f123852x.m119376q0();
    }

    /* JADX INFO: renamed from: q */
    public void m148236q(User user, User user2) {
        uqb0.f180374G.m127115L0(this.f123833e, user2.m61308fp().profileMiddle().formatted());
        uqb0.f180374G.m127109I0(this.f123834f, user.m61308fp().profileMiddle().formatted(), 2, 100);
        this.f123837i.setText(user.name);
        this.f123839k.setText(String.format("开通黑金会员立即与%s聊天！", user.isFemale() ? "她" : "他"));
        this.f123843o.setText(this.f123851w.getResources().getText(m148233j(user) ? R$string.f21327H0 : R$string.f21324G0));
        bnl0.m105524M(this.f123835g, yie0.m216084q(user));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
