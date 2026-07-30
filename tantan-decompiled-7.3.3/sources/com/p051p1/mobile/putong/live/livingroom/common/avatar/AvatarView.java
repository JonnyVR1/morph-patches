package com.p051p1.mobile.putong.live.livingroom.common.avatar;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.view.AvatarShineView;
import java.util.Map;
import p151v.VImage;
import p151v.VText;
import p153l.ak1;
import p153l.biv;
import p153l.bnl0;
import p153l.civ;
import p153l.fgt;
import p153l.gt0;
import p153l.htd0;
import p153l.iam;
import p153l.in1;
import p153l.ip1;
import p153l.jxd0;
import p153l.nsv;
import p153l.obc0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.qnp0;
import p153l.uhd0;
import p153l.uqb0;
import p153l.vxr;
import p153l.xau;
import p153l.y20;
import p153l.yau;
import p153l.ynp0;
import p153l.yo1;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class AvatarView extends FrameLayout implements iam<in1> {

    /* JADX INFO: renamed from: A */
    public static boolean f49246A = false;

    /* JADX INFO: renamed from: a */
    public AvatarView f49247a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f49248b;

    /* JADX INFO: renamed from: c */
    public VText f49249c;

    /* JADX INFO: renamed from: d */
    public VText f49250d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f49251e;

    /* JADX INFO: renamed from: f */
    public AvatarShineView f49252f;

    /* JADX INFO: renamed from: g */
    public VText f49253g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f49254h;

    /* JADX INFO: renamed from: i */
    public VImage f49255i;

    /* JADX INFO: renamed from: j */
    public VImage f49256j;

    /* JADX INFO: renamed from: k */
    public AnimEffectPlayer f49257k;

    /* JADX INFO: renamed from: l */
    public VText f49258l;

    /* JADX INFO: renamed from: m */
    public CommonMaskAvatarView f49259m;

    /* JADX INFO: renamed from: n */
    public String f49260n;

    /* JADX INFO: renamed from: o */
    public ak1 f49261o;

    /* JADX INFO: renamed from: p */
    public in1 f49262p;

    /* JADX INFO: renamed from: q */
    public Animator f49263q;

    /* JADX INFO: renamed from: r */
    public Animator f49264r;

    /* JADX INFO: renamed from: s */
    public Animator f49265s;

    /* JADX INFO: renamed from: t */
    public ValueAnimator f49266t;

    /* JADX INFO: renamed from: u */
    public ValueAnimator f49267u;

    /* JADX INFO: renamed from: v */
    public int f49268v;

    /* JADX INFO: renamed from: w */
    public final int f49269w;

    /* JADX INFO: renamed from: x */
    public int f49270x;

    /* JADX INFO: renamed from: y */
    public final long f49271y;

    /* JADX INFO: renamed from: z */
    public jxd0 f49272z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.avatar.AvatarView$a */
    public static class InterpolatorC12879a implements Interpolator {

        /* JADX INFO: renamed from: a */
        public boolean f49273a;

        public InterpolatorC12879a(boolean z) {
            this.f49273a = z;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            float fM175859d;
            int iM175859d;
            if (this.f49273a) {
                f2 = 0.7f;
                double d = f;
                if (d <= 0.25d) {
                    return qa00.m175859d(5.0f) * (f / 0.25f);
                }
                if (d <= 0.4d) {
                    return qa00.m175859d(5.0f) - (qa00.m175859d(7.0f) * ((f - 0.25f) / 0.15f));
                }
                if (d <= 0.55d) {
                    return (-qa00.m175859d(2.0f)) + (qa00.m175859d(3.0f) * ((f - 0.4f) / 0.15f));
                }
                if (d <= 0.7d) {
                    return qa00.m175859d(1.0f) - (qa00.m175859d(2.0f) * ((f - 0.55f) / 0.15f));
                }
                if (d > 0.85d) {
                    return 0.0f;
                }
                fM175859d = -qa00.m175859d(1.0f);
                iM175859d = qa00.m175859d(1.0f);
            } else {
                f2 = 0.7f;
                double d2 = f;
                if (d2 <= 0.25d) {
                    return (-qa00.m175859d(5.0f)) * (f / 0.25f);
                }
                if (d2 <= 0.4d) {
                    return (-qa00.m175859d(5.0f)) + (qa00.m175859d(7.0f) * ((f - 0.25f) / 0.15f));
                }
                if (d2 <= 0.55d) {
                    return qa00.m175859d(2.0f) - (qa00.m175859d(3.0f) * ((f - 0.4f) / 0.15f));
                }
                if (d2 <= 0.7d) {
                    return (-qa00.m175859d(1.0f)) + (qa00.m175859d(2.0f) * ((f - 0.55f) / 0.15f));
                }
                if (d2 > 0.85d) {
                    return 0.0f;
                }
                fM175859d = qa00.m175859d(1.0f);
                iM175859d = -qa00.m175859d(1.0f);
            }
            return fM175859d + (iM175859d * ((f - f2) / 0.15f));
        }
    }

    public AvatarView(Context context) {
        super(context);
        this.f49268v = qa00.m175859d(44.0f);
        this.f49269w = qa00.m175859d(44.0f);
        this.f49270x = 0;
        this.f49271y = 400L;
    }

    private Animator getFirstFollowAnimator() {
        if (this.f49264r == null) {
            Animator animatorM216976m = yo1.m216976m(getContext(), this.f49268v, this.f49253g, this.f49252f, this.f49254h, true);
            Animator animatorM216975l = yo1.m216975l(getContext(), this.f49268v, this.f49253g);
            animatorM216975l.setStartDelay(2000L);
            this.f49264r = gt0.m132173s(animatorM216976m, animatorM216975l);
        }
        return this.f49264r;
    }

    @NonNull
    private Animator getHideFollowAnimator() {
        ValueAnimator valueAnimator = this.f49267u;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        ValueAnimator duration = ValueAnimator.ofInt(this.f49268v, 0).setDuration(400L);
        this.f49267u = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ap1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f72682a.m73286p(valueAnimator2);
            }
        });
        return this.f49267u;
    }

    private void getShowFansClubEntryAnimatorStart() {
        if (this.f49261o == null) {
            this.f49261o = new ak1(this.f49247a, this.f49252f, this.f49253g, this.f49257k, this.f49258l, this.f49254h, this.f49255i);
        }
        this.f49261o.m98540g(bnl0.m105587w(146.0f), bnl0.m105587w(17.0f));
    }

    @NonNull
    private Animator getShowFollowAnimator() {
        ValueAnimator valueAnimator = this.f49266t;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        ValueAnimator duration = ValueAnimator.ofInt(0, this.f49268v).setDuration(400L);
        this.f49266t = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.zo1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f205267a.m73287q(valueAnimator2);
            }
        });
        return this.f49266t;
    }

    /* JADX INFO: renamed from: r */
    private void m73270r() {
        this.f49268v = ynp0.m216942s(12, (String) getContext().getText(R$string.f47475D4)) + qa00.m175859d(16.0f);
        bnl0.m105509E0(this.f49253g, new View.OnClickListener() { // from class: l.bp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77721a.m73271s(view);
            }
        });
        bnl0.m105509E0(this.f49254h, new View.OnClickListener() { // from class: l.cp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82953a.m73272u(view);
            }
        });
        bnl0.m105509E0(this.f49248b, new View.OnClickListener() { // from class: l.dp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90021a.m73273v(view);
            }
        });
        bnl0.m105509E0(this.f49259m, new View.OnClickListener() { // from class: l.ep1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95192a.m73274w(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m73271s(View view) {
        this.f49262p.mo141029l4(this.f49270x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m73272u(View view) {
        this.f49262p.mo141029l4(this.f49270x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m73273v(View view) {
        this.f49262p.m141028k4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m73274w(View view) {
        this.f49262p.m141028k4();
    }

    /* JADX INFO: renamed from: A */
    public final void m73275A(int i) {
        if (i == 2) {
            this.f49253g.setText(R$string.f47475D4);
            bnl0.m105525M0(this.f49253g, true);
            bnl0.m105507D0(this.f49268v, this.f49253g);
            bnl0.m105524M(this.f49254h, false);
            this.f49251e.setBackground(null);
            this.f49262p.mo141031n4(null);
            return;
        }
        if (i != 3) {
            bnl0.m105524M(this.f49253g, false);
            bnl0.m105524M(this.f49254h, false);
            return;
        }
        bnl0.m105507D0(this.f49268v, this.f49253g);
        bnl0.m105524M(this.f49255i, true);
        bnl0.m105524M(this.f49253g, false);
        bnl0.m105524M(this.f49254h, true);
        this.f49251e.setBackgroundResource(obc0.f146233X0);
    }

    /* JADX INFO: renamed from: B */
    public void m73276B(boolean z) {
        bnl0.m105524M(this.f49256j, z);
    }

    /* JADX INFO: renamed from: C */
    public void m73277C(boolean z) {
        bnl0.m105525M0((View) getParent(), z);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: E */
    public void m73278E() {
        this.f49249c.setText("");
        this.f49250d.setText("");
        this.f49270x = 0;
        bnl0.m105524M(this.f49253g, false);
        bnl0.m105524M(this.f49254h, false);
        this.f49259m.m73302i0();
    }

    /* JADX INFO: renamed from: F */
    public final boolean m73279F() {
        if (f49246A) {
            return true;
        }
        jxd0 jxd0Var = this.f49272z;
        return (jxd0Var == null || jxd0Var.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: G */
    public void m73280G(int i, boolean z) {
        Animator animatorM73285n = m73285n(i == 2 ? this.f49253g : this.f49251e, z);
        this.f49265s = animatorM73285n;
        animatorM73285n.start();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: H */
    public void m73281H(double d) {
        this.f49260n = xau.m209910t(vxr.m203876d().m171022s0() ? R$string.f47456C7 : R$string.f47898X);
        if (((civ) zrv.m221194l(htd0.f111524f)).m109970n()) {
            this.f49260n = xau.m209910t(R$string.f47828Td);
        }
        bnl0.m105524M(this.f49250d, vxr.m203876d().m171026u0());
        this.f49250d.setText(yau.m214935c(d) + this.f49260n);
    }

    /* JADX INFO: renamed from: I */
    public void m73282I(User user, BLiveUserMask bLiveUserMask) {
        biv.m104517b(this.f49259m, qa00.m175859d(53.0f), nsv.m164636f(user).m164641e(bLiveUserMask), new qcj() { // from class: l.fp1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).m61308fp().url;
            }
        });
        this.f49249c.setText(user.name);
        this.f49272z = new jxd0("fans_club_anim_shown" + user.f56859id + uqb0.f180396b0.f170324a.userId(), Boolean.FALSE);
        final long jM174454o = pzi0.m174454o() - uhd0.f179016l;
        fgt.m125531c(this.f49262p, "audience_avatar_info_loaded", new y20() { // from class: l.gp1
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Map) obj).put("watch_duration", Long.valueOf(jM174454o));
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
        m73278E();
        ValueAnimator valueAnimator = this.f49266t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Animator animator = this.f49263q;
        if (animator != null) {
            animator.cancel();
        }
        ak1 ak1Var = this.f49261o;
        if (ak1Var != null) {
            ak1Var.m98538e();
        }
        ValueAnimator valueAnimator2 = this.f49267u;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        Animator animator2 = this.f49264r;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.f49265s;
        if (animator3 != null) {
            animator3.cancel();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m73283l(View view) {
        ip1.m141392a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(in1 in1Var) {
        this.f49262p = in1Var;
        if (in1Var == null || !in1Var.m213815L2()) {
            return;
        }
        bnl0.m105524M(this.f49253g, false);
    }

    /* JADX INFO: renamed from: n */
    public Animator m73285n(final View view, boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hp1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat.setInterpolator(new InterpolatorC12879a(z));
        valueAnimatorOfFloat.setDuration(1000L);
        return valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73283l(this);
        m73270r();
        this.f49259m.m73308p0();
        qnp0.m177260c1(this.f49257k, -qa00.m175859d(16.0f), 0, 0, 0, qa00.m175859d(16.0f));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m73286p(ValueAnimator valueAnimator) {
        this.f49253g.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f49253g.requestLayout();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m73287q(ValueAnimator valueAnimator) {
        this.f49253g.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (((Integer) valueAnimator.getAnimatedValue()).intValue() >= this.f49268v) {
            this.f49253g.setVisibility(0);
            this.f49253g.setText(R$string.f47475D4);
        }
        this.f49253g.requestLayout();
    }

    /* JADX INFO: renamed from: x */
    public void m73288x() {
        if (this.f49270x == 3) {
            return;
        }
        getFirstFollowAnimator().start();
        this.f49262p.mo141031n4("slide");
    }

    /* JADX INFO: renamed from: y */
    public void m73289y(int i) {
        int i2 = this.f49270x;
        if (i2 == 0) {
            m73275A(i);
            this.f49270x = i;
            this.f49262p.m141018X3(i);
        } else if (i2 != i) {
            m73290z(i2, i);
            this.f49270x = i;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m73290z(int i, int i2) {
        if (i == 1 && i2 == 2) {
            this.f49253g.setVisibility(4);
            getShowFollowAnimator().start();
            return;
        }
        if (i != 2 || i2 != 3) {
            if (i != 2 || i2 != 1) {
                m73275A(i2);
                return;
            } else {
                this.f49253g.setVisibility(4);
                getHideFollowAnimator().start();
                return;
            }
        }
        if (!m73279F()) {
            m73275A(i2);
            return;
        }
        if (getFirstFollowAnimator().isRunning()) {
            getFirstFollowAnimator().cancel();
        }
        getShowFansClubEntryAnimatorStart();
        jxd0 jxd0Var = this.f49272z;
        if (jxd0Var != null) {
            jxd0Var.put(Boolean.TRUE);
        }
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49268v = qa00.m175859d(44.0f);
        this.f49269w = qa00.m175859d(44.0f);
        this.f49270x = 0;
        this.f49271y = 400L;
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49268v = qa00.m175859d(44.0f);
        this.f49269w = qa00.m175859d(44.0f);
        this.f49270x = 0;
        this.f49271y = 400L;
    }
}
