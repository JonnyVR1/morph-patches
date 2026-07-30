package p003l;

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
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.member.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import l.bt0;
import l.jqf0;
import l.lqf0;
import l.ohf0;
import l.qib0;
import l.s7m;
import l.tae0;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vv40 implements s7m<pv40> {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f8050a;

    /* JADX INFO: renamed from: b */
    public View f8051b;

    /* JADX INFO: renamed from: c */
    public View f8052c;

    /* JADX INFO: renamed from: d */
    public View f8053d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f8054e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f8055f;

    /* JADX INFO: renamed from: g */
    public VText f8056g;

    /* JADX INFO: renamed from: h */
    public VLinear_FillerMeasure f8057h;

    /* JADX INFO: renamed from: i */
    public VText f8058i;

    /* JADX INFO: renamed from: j */
    public VText f8059j;

    /* JADX INFO: renamed from: k */
    public VText f8060k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f8061l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f8062m;

    /* JADX INFO: renamed from: n */
    public VText f8063n;

    /* JADX INFO: renamed from: o */
    public VButton_FakeShadow f8064o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f8065p;

    /* JADX INFO: renamed from: q */
    public VButton f8066q;

    /* JADX INFO: renamed from: r */
    public VButton f8067r;

    /* JADX INFO: renamed from: s */
    public VScroll_Horizontal f8068s;

    /* JADX INFO: renamed from: t */
    public VLinear f8069t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f8070u;

    /* JADX INFO: renamed from: v */
    public VText f8071v;

    /* JADX INFO: renamed from: w */
    public Act f8072w;

    /* JADX INFO: renamed from: x */
    public pv40 f8073x;

    /* JADX INFO: renamed from: l.vv40$a */
    public class C3455a extends ohf0 {

        /* JADX INFO: renamed from: a */
        public int f8074a = xdl0.y0();

        public C3455a() {
        }

        /* JADX INFO: renamed from: c */
        public void m10384c(jqf0 jqf0Var) {
            float fD = 1.0f - ((float) jqf0Var.d());
            vv40.this.f8064o.setTranslationX(this.f8074a * fD);
            vv40.this.f8063n.setTranslationX((-fD) * this.f8074a);
        }
    }

    public vv40(Act act) {
        this.f8072w = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m10372m(View view) {
        this.f8073x.m8811r0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m10373n(View view) {
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m10374p(View view) {
        act().finish();
    }

    /* JADX INFO: renamed from: r */
    private void m10375r() {
        xdl0.E0(this.f8064o, new View.OnClickListener() { // from class: l.uv40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7825a.m10374p(view);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m10376C0() {
        return this.f8072w;
    }

    public Animator enterAnimation() {
        final jqf0 jqf0VarC = zqf0.h().c();
        jqf0VarC.p(new lqf0(300.0d, 13.0d));
        act().postDelayed(new Runnable() { // from class: l.rv40
            @Override // java.lang.Runnable
            public final void run() {
                this.f7245a.m10381k(jqf0VarC);
            }
        }, 600L);
        AnticipateInterpolator anticipateInterpolator = new AnticipateInterpolator();
        VText vText = this.f8071v;
        Property property = View.ALPHA;
        ArrayList arrayListF0 = vwb.f0(new Animator[]{bt0.l(vText, property, 0L, 600L, anticipateInterpolator, new float[]{1.0f}), bt0.l(this.f8054e, property, 0L, 480L, (Interpolator) null, new float[]{1.0f}), bt0.l(this.f8055f, property, 0L, 480L, (Interpolator) null, new float[]{1.0f}), bt0.l(this.f8054e, bt0.i, 200L, 800L, new OvershootInterpolator(2.0f), new float[]{1.0f}), bt0.l(this.f8055f, bt0.i, 200L, 800L, new OvershootInterpolator(2.0f), new float[]{1.0f})});
        return bt0.b(this.f8054e, bt0.z((Animator[]) arrayListF0.toArray(new Animator[arrayListF0.size()])));
    }

    public Animator exitAnimation() {
        AnticipateInterpolator anticipateInterpolator = new AnticipateInterpolator();
        ArrayList arrayListF0 = vwb.f0(new Animator[]{bt0.l(this.f8054e, bt0.i, 0L, 500L, anticipateInterpolator, new float[]{0.0f}), bt0.p(this.f8054e, "alpha", 0L, 500L, anticipateInterpolator, new float[]{0.0f}), bt0.l(this.f8055f, bt0.i, 0L, 500L, anticipateInterpolator, new float[]{0.0f}), bt0.p(this.f8055f, "alpha", 0L, 500L, anticipateInterpolator, new float[]{0.0f})});
        Animator animatorZ = bt0.z((Animator[]) arrayListF0.toArray(new Animator[arrayListF0.size()]));
        if (this.f8073x.m8806k0()) {
            return bt0.b(this.f8054e, animatorZ);
        }
        xdl0.M0(this.f8064o, false);
        VText vText = this.f8063n;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vText, "x", -vText.getWidth());
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        bt0.f(animatorSet, new Runnable() { // from class: l.qv40
            @Override // java.lang.Runnable
            public final void run() {
                this.f7096a.m10382l();
            }
        });
        animatorSet.play(animatorZ).after(objectAnimatorOfFloat);
        return animatorSet;
    }

    /* JADX INFO: renamed from: f */
    public View m10377f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wv40.m10566b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m10379i1(pv40 pv40Var) {
        this.f8073x = pv40Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM10377f = m10377f(layoutInflater, viewGroup);
        m10375r();
        xdl0.E0(this.f8063n, new View.OnClickListener() { // from class: l.sv40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7468a.m10372m(view);
            }
        });
        xdl0.E0(viewM10377f, new View.OnClickListener() { // from class: l.tv40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7628a.m10373n(view);
            }
        });
        return viewM10377f;
    }

    public void initAnimationState() {
        this.f8071v.setAlpha(0.0f);
        this.f8054e.setAlpha(0.0f);
        xdl0.t0(this.f8054e, 0.1f);
        this.f8055f.setAlpha(0.0f);
        xdl0.t0(this.f8055f, 0.1f);
        int iY0 = xdl0.y0();
        this.f8064o.setTranslationX(iY0);
        this.f8063n.setTranslationX(-iY0);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m10380j(User user) {
        return TEnum.equals(user.gender, "female");
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m10381k(jqf0 jqf0Var) {
        jqf0Var.a(new C3455a());
        jqf0Var.o(1.0d);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m10382l() {
        this.f8073x.m8810q0();
    }

    /* JADX INFO: renamed from: q */
    public void m10383q(User user, User user2) {
        qib0.G.L0(this.f8054e, user2.fp().profileMiddle().formatted());
        qib0.G.I0(this.f8055f, user.fp().profileMiddle().formatted(), 2, 100);
        this.f8058i.setText(user.name);
        this.f8060k.setText(String.format("开通黑金会员立即与%s聊天！", user.isFemale() ? "她" : "他"));
        this.f8064o.setText(this.f8072w.getResources().getText(m10380j(user) ? R$string.f247H0 : R$string.f244G0));
        xdl0.M(this.f8056g, tae0.q(user));
    }

    public void destroy() {
    }
}
