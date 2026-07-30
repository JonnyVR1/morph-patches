package com.p046p1.mobile.putong.live.livingroom.common.avatar;

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
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.view.AvatarShineView;
import java.util.Map;
import p147v.VImage;
import p147v.VText;
import p149l.agv;
import p149l.bgv;
import p149l.bn1;
import p149l.bp1;
import p149l.bt0;
import p149l.e30;
import p149l.eet;
import p149l.fld0;
import p149l.hpd0;
import p149l.i3c0;
import p149l.mep0;
import p149l.mqi0;
import p149l.mqv;
import p149l.qib0;
import p149l.r9d0;
import p149l.ro1;
import p149l.s7m;
import p149l.t100;
import p149l.tj1;
import p149l.uep0;
import p149l.uvr;
import p149l.w8u;
import p149l.w9j;
import p149l.x8u;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class AvatarView extends FrameLayout implements s7m<bn1> {

    /* JADX INFO: renamed from: A */
    public static boolean f48398A = false;

    /* JADX INFO: renamed from: a */
    public AvatarView f48399a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f48400b;

    /* JADX INFO: renamed from: c */
    public VText f48401c;

    /* JADX INFO: renamed from: d */
    public VText f48402d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f48403e;

    /* JADX INFO: renamed from: f */
    public AvatarShineView f48404f;

    /* JADX INFO: renamed from: g */
    public VText f48405g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f48406h;

    /* JADX INFO: renamed from: i */
    public VImage f48407i;

    /* JADX INFO: renamed from: j */
    public VImage f48408j;

    /* JADX INFO: renamed from: k */
    public AnimEffectPlayer f48409k;

    /* JADX INFO: renamed from: l */
    public VText f48410l;

    /* JADX INFO: renamed from: m */
    public CommonMaskAvatarView f48411m;

    /* JADX INFO: renamed from: n */
    public String f48412n;

    /* JADX INFO: renamed from: o */
    public tj1 f48413o;

    /* JADX INFO: renamed from: p */
    public bn1 f48414p;

    /* JADX INFO: renamed from: q */
    public Animator f48415q;

    /* JADX INFO: renamed from: r */
    public Animator f48416r;

    /* JADX INFO: renamed from: s */
    public Animator f48417s;

    /* JADX INFO: renamed from: t */
    public ValueAnimator f48418t;

    /* JADX INFO: renamed from: u */
    public ValueAnimator f48419u;

    /* JADX INFO: renamed from: v */
    public int f48420v;

    /* JADX INFO: renamed from: w */
    public final int f48421w;

    /* JADX INFO: renamed from: x */
    public int f48422x;

    /* JADX INFO: renamed from: y */
    public final long f48423y;

    /* JADX INFO: renamed from: z */
    public hpd0 f48424z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.avatar.AvatarView$a */
    public static class InterpolatorC12716a implements Interpolator {

        /* JADX INFO: renamed from: a */
        public boolean f48425a;

        public InterpolatorC12716a(boolean z) {
            this.f48425a = z;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            float fM186890d;
            int iM186890d;
            if (this.f48425a) {
                f2 = 0.7f;
                double d = f;
                if (d <= 0.25d) {
                    return t100.m186890d(5.0f) * (f / 0.25f);
                }
                if (d <= 0.4d) {
                    return t100.m186890d(5.0f) - (t100.m186890d(7.0f) * ((f - 0.25f) / 0.15f));
                }
                if (d <= 0.55d) {
                    return (-t100.m186890d(2.0f)) + (t100.m186890d(3.0f) * ((f - 0.4f) / 0.15f));
                }
                if (d <= 0.7d) {
                    return t100.m186890d(1.0f) - (t100.m186890d(2.0f) * ((f - 0.55f) / 0.15f));
                }
                if (d > 0.85d) {
                    return 0.0f;
                }
                fM186890d = -t100.m186890d(1.0f);
                iM186890d = t100.m186890d(1.0f);
            } else {
                f2 = 0.7f;
                double d2 = f;
                if (d2 <= 0.25d) {
                    return (-t100.m186890d(5.0f)) * (f / 0.25f);
                }
                if (d2 <= 0.4d) {
                    return (-t100.m186890d(5.0f)) + (t100.m186890d(7.0f) * ((f - 0.25f) / 0.15f));
                }
                if (d2 <= 0.55d) {
                    return t100.m186890d(2.0f) - (t100.m186890d(3.0f) * ((f - 0.4f) / 0.15f));
                }
                if (d2 <= 0.7d) {
                    return (-t100.m186890d(1.0f)) + (t100.m186890d(2.0f) * ((f - 0.55f) / 0.15f));
                }
                if (d2 > 0.85d) {
                    return 0.0f;
                }
                fM186890d = t100.m186890d(1.0f);
                iM186890d = -t100.m186890d(1.0f);
            }
            return fM186890d + (iM186890d * ((f - f2) / 0.15f));
        }
    }

    public AvatarView(Context context) {
        super(context);
        this.f48420v = t100.m186890d(44.0f);
        this.f48421w = t100.m186890d(44.0f);
        this.f48422x = 0;
        this.f48423y = 400L;
    }

    private Animator getFirstFollowAnimator() {
        if (this.f48416r == null) {
            Animator animatorM180233m = ro1.m180233m(getContext(), this.f48420v, this.f48405g, this.f48404f, this.f48406h, true);
            Animator animatorM180232l = ro1.m180232l(getContext(), this.f48420v, this.f48405g);
            animatorM180232l.setStartDelay(2000L);
            this.f48416r = bt0.m103746s(animatorM180233m, animatorM180232l);
        }
        return this.f48416r;
    }

    @NonNull
    private Animator getHideFollowAnimator() {
        ValueAnimator valueAnimator = this.f48419u;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        ValueAnimator duration = ValueAnimator.ofInt(this.f48420v, 0).setDuration(400L);
        this.f48419u = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.to1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f171312a.m72103p(valueAnimator2);
            }
        });
        return this.f48419u;
    }

    private void getShowFansClubEntryAnimatorStart() {
        if (this.f48413o == null) {
            this.f48413o = new tj1(this.f48399a, this.f48404f, this.f48405g, this.f48409k, this.f48410l, this.f48406h, this.f48407i);
        }
        this.f48413o.m189242g(xdl0.m208407w(146.0f), xdl0.m208407w(17.0f));
    }

    @NonNull
    private Animator getShowFollowAnimator() {
        ValueAnimator valueAnimator = this.f48418t;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        ValueAnimator duration = ValueAnimator.ofInt(0, this.f48420v).setDuration(400L);
        this.f48418t = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.so1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f165535a.m72104q(valueAnimator2);
            }
        });
        return this.f48418t;
    }

    /* JADX INFO: renamed from: r */
    private void m72087r() {
        this.f48420v = uep0.m193332s(12, (String) getContext().getText(R$string.f46627D4)) + t100.m186890d(16.0f);
        xdl0.m208329E0(this.f48405g, new View.OnClickListener() { // from class: l.uo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177488a.m72088s(view);
            }
        });
        xdl0.m208329E0(this.f48406h, new View.OnClickListener() { // from class: l.vo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182328a.m72089u(view);
            }
        });
        xdl0.m208329E0(this.f48400b, new View.OnClickListener() { // from class: l.wo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187375a.m72090v(view);
            }
        });
        xdl0.m208329E0(this.f48411m, new View.OnClickListener() { // from class: l.xo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193774a.m72091w(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m72088s(View view) {
        this.f48414p.mo102741l4(this.f48422x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m72089u(View view) {
        this.f48414p.mo102741l4(this.f48422x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m72090v(View view) {
        this.f48414p.m102740k4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m72091w(View view) {
        this.f48414p.m102740k4();
    }

    /* JADX INFO: renamed from: A */
    public final void m72092A(int i) {
        if (i == 2) {
            this.f48405g.setText(R$string.f46627D4);
            xdl0.m208345M0(this.f48405g, true);
            xdl0.m208327D0(this.f48420v, this.f48405g);
            xdl0.m208344M(this.f48406h, false);
            this.f48403e.setBackground(null);
            this.f48414p.mo102743n4(null);
            return;
        }
        if (i != 3) {
            xdl0.m208344M(this.f48405g, false);
            xdl0.m208344M(this.f48406h, false);
            return;
        }
        xdl0.m208327D0(this.f48420v, this.f48405g);
        xdl0.m208344M(this.f48407i, true);
        xdl0.m208344M(this.f48405g, false);
        xdl0.m208344M(this.f48406h, true);
        this.f48403e.setBackgroundResource(i3c0.f110905X0);
    }

    /* JADX INFO: renamed from: B */
    public void m72093B(boolean z) {
        xdl0.m208344M(this.f48408j, z);
    }

    /* JADX INFO: renamed from: C */
    public void m72094C(boolean z) {
        xdl0.m208345M0((View) getParent(), z);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: E */
    public void m72095E() {
        this.f48401c.setText("");
        this.f48402d.setText("");
        this.f48422x = 0;
        xdl0.m208344M(this.f48405g, false);
        xdl0.m208344M(this.f48406h, false);
        this.f48411m.m72119i0();
    }

    /* JADX INFO: renamed from: F */
    public final boolean m72096F() {
        if (f48398A) {
            return true;
        }
        hpd0 hpd0Var = this.f48424z;
        return (hpd0Var == null || hpd0Var.get().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: G */
    public void m72097G(int i, boolean z) {
        Animator animatorM72102n = m72102n(i == 2 ? this.f48405g : this.f48403e, z);
        this.f48417s = animatorM72102n;
        animatorM72102n.start();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: H */
    public void m72098H(double d) {
        this.f48412n = w8u.m202217t(uvr.m196087d().m162715s0() ? R$string.f46608C7 : R$string.f47050X);
        if (((bgv) ypv.m215673l(fld0.f98151f)).m101734n()) {
            this.f48412n = w8u.m202217t(R$string.f46980Td);
        }
        xdl0.m208344M(this.f48402d, uvr.m196087d().m162719u0());
        this.f48402d.setText(x8u.m207433c(d) + this.f48412n);
    }

    /* JADX INFO: renamed from: I */
    public void m72099I(User user, BLiveUserMask bLiveUserMask) {
        agv.m96344b(this.f48411m, t100.m186890d(53.0f), mqv.m155998f(user).m156003e(bLiveUserMask), new w9j() { // from class: l.yo1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).m60124fp().url;
            }
        });
        this.f48401c.setText(user.name);
        this.f48424z = new hpd0("fans_club_anim_shown" + user.f56011id + qib0.f154713b0.f139230a.userId(), Boolean.FALSE);
        final long jM155944o = mqi0.m155944o() - r9d0.f158355l;
        eet.m116004c(this.f48414p, "audience_avatar_info_loaded", new e30() { // from class: l.zo1
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Map) obj).put("watch_duration", Long.valueOf(jM155944o));
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
        m72095E();
        ValueAnimator valueAnimator = this.f48418t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Animator animator = this.f48415q;
        if (animator != null) {
            animator.cancel();
        }
        tj1 tj1Var = this.f48413o;
        if (tj1Var != null) {
            tj1Var.m189240e();
        }
        ValueAnimator valueAnimator2 = this.f48419u;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        Animator animator2 = this.f48416r;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.f48417s;
        if (animator3 != null) {
            animator3.cancel();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m72100l(View view) {
        bp1.m103009a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(bn1 bn1Var) {
        this.f48414p = bn1Var;
        if (bn1Var == null || !bn1Var.m206032L2()) {
            return;
        }
        xdl0.m208344M(this.f48405g, false);
    }

    /* JADX INFO: renamed from: n */
    public Animator m72102n(final View view, boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ap1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat.setInterpolator(new InterpolatorC12716a(z));
        valueAnimatorOfFloat.setDuration(1000L);
        return valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72100l(this);
        m72087r();
        this.f48411m.m72125p0();
        mep0.m154301c1(this.f48409k, -t100.m186890d(16.0f), 0, 0, 0, t100.m186890d(16.0f));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m72103p(ValueAnimator valueAnimator) {
        this.f48405g.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f48405g.requestLayout();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m72104q(ValueAnimator valueAnimator) {
        this.f48405g.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (((Integer) valueAnimator.getAnimatedValue()).intValue() >= this.f48420v) {
            this.f48405g.setVisibility(0);
            this.f48405g.setText(R$string.f46627D4);
        }
        this.f48405g.requestLayout();
    }

    /* JADX INFO: renamed from: x */
    public void m72105x() {
        if (this.f48422x == 3) {
            return;
        }
        getFirstFollowAnimator().start();
        this.f48414p.mo102743n4("slide");
    }

    /* JADX INFO: renamed from: y */
    public void m72106y(int i) {
        int i2 = this.f48422x;
        if (i2 == 0) {
            m72092A(i);
            this.f48422x = i;
            this.f48414p.m102730X3(i);
        } else if (i2 != i) {
            m72107z(i2, i);
            this.f48422x = i;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m72107z(int i, int i2) {
        if (i == 1 && i2 == 2) {
            this.f48405g.setVisibility(4);
            getShowFollowAnimator().start();
            return;
        }
        if (i != 2 || i2 != 3) {
            if (i != 2 || i2 != 1) {
                m72092A(i2);
                return;
            } else {
                this.f48405g.setVisibility(4);
                getHideFollowAnimator().start();
                return;
            }
        }
        if (!m72096F()) {
            m72092A(i2);
            return;
        }
        if (getFirstFollowAnimator().isRunning()) {
            getFirstFollowAnimator().cancel();
        }
        getShowFansClubEntryAnimatorStart();
        hpd0 hpd0Var = this.f48424z;
        if (hpd0Var != null) {
            hpd0Var.put(Boolean.TRUE);
        }
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48420v = t100.m186890d(44.0f);
        this.f48421w = t100.m186890d(44.0f);
        this.f48422x = 0;
        this.f48423y = 400L;
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48420v = t100.m186890d(44.0f);
        this.f48421w = t100.m186890d(44.0f);
        this.f48422x = 0;
        this.f48423y = 400L;
    }
}
