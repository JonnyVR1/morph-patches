package com.p000p1.mobile.putong.live.livingroom.common.avatar;

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
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.view.AvatarShineView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantanapp.common.data.DbObject;
import java.util.Map;
import l.agv;
import l.bgv;
import l.bt0;
import l.e30;
import l.fld0;
import l.hpd0;
import l.mep0;
import l.mqi0;
import l.mqv;
import l.qib0;
import l.s7m;
import l.t100;
import l.uep0;
import l.uvr;
import l.w8u;
import l.w9j;
import l.x8u;
import l.xdl0;
import l.ypv;
import p002l.bn1;
import p002l.bp1;
import p002l.eet;
import p002l.i3c0;
import p002l.r9d0;
import p002l.ro1;
import p002l.tj1;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class AvatarView extends FrameLayout implements s7m<bn1> {

    /* JADX INFO: renamed from: A */
    public static boolean f4440A = false;

    /* JADX INFO: renamed from: a */
    public AvatarView f4441a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f4442b;

    /* JADX INFO: renamed from: c */
    public VText f4443c;

    /* JADX INFO: renamed from: d */
    public VText f4444d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f4445e;

    /* JADX INFO: renamed from: f */
    public AvatarShineView f4446f;

    /* JADX INFO: renamed from: g */
    public VText f4447g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f4448h;

    /* JADX INFO: renamed from: i */
    public VImage f4449i;

    /* JADX INFO: renamed from: j */
    public VImage f4450j;

    /* JADX INFO: renamed from: k */
    public AnimEffectPlayer f4451k;

    /* JADX INFO: renamed from: l */
    public VText f4452l;

    /* JADX INFO: renamed from: m */
    public CommonMaskAvatarView f4453m;

    /* JADX INFO: renamed from: n */
    public String f4454n;

    /* JADX INFO: renamed from: o */
    public tj1 f4455o;

    /* JADX INFO: renamed from: p */
    public bn1 f4456p;

    /* JADX INFO: renamed from: q */
    public Animator f4457q;

    /* JADX INFO: renamed from: r */
    public Animator f4458r;

    /* JADX INFO: renamed from: s */
    public Animator f4459s;

    /* JADX INFO: renamed from: t */
    public ValueAnimator f4460t;

    /* JADX INFO: renamed from: u */
    public ValueAnimator f4461u;

    /* JADX INFO: renamed from: v */
    public int f4462v;

    /* JADX INFO: renamed from: w */
    public final int f4463w;

    /* JADX INFO: renamed from: x */
    public int f4464x;

    /* JADX INFO: renamed from: y */
    public final long f4465y;

    /* JADX INFO: renamed from: z */
    public hpd0 f4466z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.avatar.AvatarView$a */
    public static class InterpolatorC0305a implements Interpolator {

        /* JADX INFO: renamed from: a */
        public boolean f4467a;

        public InterpolatorC0305a(boolean z) {
            this.f4467a = z;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            float fD;
            int iD;
            if (this.f4467a) {
                f2 = 0.7f;
                double d = f;
                if (d <= 0.25d) {
                    return t100.d(5.0f) * (f / 0.25f);
                }
                if (d <= 0.4d) {
                    return t100.d(5.0f) - (t100.d(7.0f) * ((f - 0.25f) / 0.15f));
                }
                if (d <= 0.55d) {
                    return (-t100.d(2.0f)) + (t100.d(3.0f) * ((f - 0.4f) / 0.15f));
                }
                if (d <= 0.7d) {
                    return t100.d(1.0f) - (t100.d(2.0f) * ((f - 0.55f) / 0.15f));
                }
                if (d > 0.85d) {
                    return 0.0f;
                }
                fD = -t100.d(1.0f);
                iD = t100.d(1.0f);
            } else {
                f2 = 0.7f;
                double d2 = f;
                if (d2 <= 0.25d) {
                    return (-t100.d(5.0f)) * (f / 0.25f);
                }
                if (d2 <= 0.4d) {
                    return (-t100.d(5.0f)) + (t100.d(7.0f) * ((f - 0.25f) / 0.15f));
                }
                if (d2 <= 0.55d) {
                    return t100.d(2.0f) - (t100.d(3.0f) * ((f - 0.4f) / 0.15f));
                }
                if (d2 <= 0.7d) {
                    return (-t100.d(1.0f)) + (t100.d(2.0f) * ((f - 0.55f) / 0.15f));
                }
                if (d2 > 0.85d) {
                    return 0.0f;
                }
                fD = t100.d(1.0f);
                iD = -t100.d(1.0f);
            }
            return fD + (iD * ((f - f2) / 0.15f));
        }
    }

    public AvatarView(Context context) {
        super(context);
        this.f4462v = t100.d(44.0f);
        this.f4463w = t100.d(44.0f);
        this.f4464x = 0;
        this.f4465y = 400L;
    }

    private Animator getFirstFollowAnimator() {
        if (this.f4458r == null) {
            Animator animatorM22094m = ro1.m22094m(getContext(), this.f4462v, this.f4447g, this.f4446f, this.f4448h, true);
            Animator animatorM22093l = ro1.m22093l(getContext(), this.f4462v, this.f4447g);
            animatorM22093l.setStartDelay(2000L);
            this.f4458r = bt0.s(new Animator[]{animatorM22094m, animatorM22093l});
        }
        return this.f4458r;
    }

    @NonNull
    private Animator getHideFollowAnimator() {
        ValueAnimator valueAnimator = this.f4461u;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        ValueAnimator duration = ValueAnimator.ofInt(this.f4462v, 0).setDuration(400L);
        this.f4461u = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.to1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f20316a.m5576p(valueAnimator2);
            }
        });
        return this.f4461u;
    }

    private void getShowFansClubEntryAnimatorStart() {
        if (this.f4455o == null) {
            this.f4455o = new tj1(this.f4441a, this.f4446f, this.f4447g, this.f4451k, this.f4452l, this.f4448h, this.f4449i);
        }
        this.f4455o.m22982g(xdl0.w(146.0f), xdl0.w(17.0f));
    }

    @NonNull
    private Animator getShowFollowAnimator() {
        ValueAnimator valueAnimator = this.f4460t;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        ValueAnimator duration = ValueAnimator.ofInt(0, this.f4462v).setDuration(400L);
        this.f4460t = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.so1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f19140a.m5577q(valueAnimator2);
            }
        });
        return this.f4460t;
    }

    /* JADX INFO: renamed from: r */
    private void m5558r() {
        this.f4462v = uep0.s(12, (String) getContext().getText(R$string.f2669D4)) + t100.d(16.0f);
        xdl0.E0(this.f4447g, new View.OnClickListener() { // from class: l.uo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20738a.m5559s(view);
            }
        });
        xdl0.E0(this.f4448h, new View.OnClickListener() { // from class: l.vo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21247a.m5560u(view);
            }
        });
        xdl0.E0(this.f4442b, new View.OnClickListener() { // from class: l.wo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21886a.m5561v(view);
            }
        });
        xdl0.E0(this.f4453m, new View.OnClickListener() { // from class: l.xo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22381a.m5562w(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m5559s(View view) {
        this.f4456p.mo10510l4(this.f4464x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m5560u(View view) {
        this.f4456p.mo10510l4(this.f4464x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m5561v(View view) {
        this.f4456p.m10509k4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m5562w(View view) {
        this.f4456p.m10509k4();
    }

    /* JADX INFO: renamed from: A */
    public final void m5563A(int i) {
        if (i == 2) {
            this.f4447g.setText(R$string.f2669D4);
            xdl0.M0(this.f4447g, true);
            xdl0.D0(this.f4462v, new View[]{this.f4447g});
            xdl0.M(this.f4448h, false);
            this.f4445e.setBackground(null);
            this.f4456p.mo10512n4(null);
            return;
        }
        if (i != 3) {
            xdl0.M(this.f4447g, false);
            xdl0.M(this.f4448h, false);
            return;
        }
        xdl0.D0(this.f4462v, new View[]{this.f4447g});
        xdl0.M(this.f4449i, true);
        xdl0.M(this.f4447g, false);
        xdl0.M(this.f4448h, true);
        this.f4445e.setBackgroundResource(i3c0.f12690X0);
    }

    /* JADX INFO: renamed from: B */
    public void m5564B(boolean z) {
        xdl0.M(this.f4450j, z);
    }

    /* JADX INFO: renamed from: C */
    public void m5565C(boolean z) {
        xdl0.M0((View) getParent(), z);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5566C0() {
        return getContext();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: E */
    public void m5567E() {
        this.f4443c.setText("");
        this.f4444d.setText("");
        this.f4464x = 0;
        xdl0.M(this.f4447g, false);
        xdl0.M(this.f4448h, false);
        this.f4453m.m5592i0();
    }

    /* JADX INFO: renamed from: F */
    public final boolean m5568F() {
        if (f4440A) {
            return true;
        }
        hpd0 hpd0Var = this.f4466z;
        return (hpd0Var == null || ((Boolean) hpd0Var.get()).booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: G */
    public void m5569G(int i, boolean z) {
        Animator animatorM5575n = m5575n(i == 2 ? this.f4447g : this.f4445e, z);
        this.f4459s = animatorM5575n;
        animatorM5575n.start();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: H */
    public void m5570H(double d) {
        this.f4454n = w8u.t(uvr.d().s0() ? R$string.f2650C7 : R$string.f3092X);
        if (((bgv) ypv.l(fld0.f)).n()) {
            this.f4454n = w8u.t(R$string.f3022Td);
        }
        xdl0.M(this.f4444d, uvr.d().u0());
        this.f4444d.setText(x8u.c(d) + this.f4454n);
    }

    /* JADX INFO: renamed from: I */
    public void m5571I(User user, BLiveUserMask bLiveUserMask) {
        agv.b(this.f4453m, t100.d(53.0f), mqv.f(user).e(bLiveUserMask), new w9j() { // from class: l.yo1
            public final Object call(Object obj) {
                return ((Media) ((User) obj).fp()).url;
            }
        });
        this.f4443c.setText(user.name);
        this.f4466z = new hpd0("fans_club_anim_shown" + ((DbObject) user).id + qib0.b0.a.userId(), Boolean.FALSE);
        final long jO = mqi0.o() - r9d0.f18419l;
        eet.m12449c(this.f4456p, "audience_avatar_info_loaded", new e30() { // from class: l.zo1
            public final void call(Object obj) {
                ((Map) obj).put("watch_duration", Long.valueOf(jO));
            }
        });
    }

    public void destroy() {
        m5567E();
        ValueAnimator valueAnimator = this.f4460t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Animator animator = this.f4457q;
        if (animator != null) {
            animator.cancel();
        }
        tj1 tj1Var = this.f4455o;
        if (tj1Var != null) {
            tj1Var.m22980e();
        }
        ValueAnimator valueAnimator2 = this.f4461u;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        Animator animator2 = this.f4458r;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.f4459s;
        if (animator3 != null) {
            animator3.cancel();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m5573l(View view) {
        bp1.m10539a(this, view);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m5572i1(bn1 bn1Var) {
        this.f4456p = bn1Var;
        if (bn1Var == null || !bn1Var.m25552L2()) {
            return;
        }
        xdl0.M(this.f4447g, false);
    }

    /* JADX INFO: renamed from: n */
    public Animator m5575n(final View view, boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ap1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat.setInterpolator(new InterpolatorC0305a(z));
        valueAnimatorOfFloat.setDuration(1000L);
        return valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5573l(this);
        m5558r();
        this.f4453m.m5598p0();
        mep0.c1(this.f4451k, -t100.d(16.0f), 0, 0, 0, t100.d(16.0f));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m5576p(ValueAnimator valueAnimator) {
        this.f4447g.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f4447g.requestLayout();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m5577q(ValueAnimator valueAnimator) {
        this.f4447g.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (((Integer) valueAnimator.getAnimatedValue()).intValue() >= this.f4462v) {
            this.f4447g.setVisibility(0);
            this.f4447g.setText(R$string.f2669D4);
        }
        this.f4447g.requestLayout();
    }

    /* JADX INFO: renamed from: x */
    public void m5578x() {
        if (this.f4464x == 3) {
            return;
        }
        getFirstFollowAnimator().start();
        this.f4456p.mo10512n4("slide");
    }

    /* JADX INFO: renamed from: y */
    public void m5579y(int i) {
        int i2 = this.f4464x;
        if (i2 == 0) {
            m5563A(i);
            this.f4464x = i;
            this.f4456p.m10499X3(i);
        } else if (i2 != i) {
            m5580z(i2, i);
            this.f4464x = i;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m5580z(int i, int i2) {
        if (i == 1 && i2 == 2) {
            this.f4447g.setVisibility(4);
            getShowFollowAnimator().start();
            return;
        }
        if (i != 2 || i2 != 3) {
            if (i != 2 || i2 != 1) {
                m5563A(i2);
                return;
            } else {
                this.f4447g.setVisibility(4);
                getHideFollowAnimator().start();
                return;
            }
        }
        if (!m5568F()) {
            m5563A(i2);
            return;
        }
        if (getFirstFollowAnimator().isRunning()) {
            getFirstFollowAnimator().cancel();
        }
        getShowFansClubEntryAnimatorStart();
        hpd0 hpd0Var = this.f4466z;
        if (hpd0Var != null) {
            hpd0Var.put(Boolean.TRUE);
        }
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4462v = t100.d(44.0f);
        this.f4463w = t100.d(44.0f);
        this.f4464x = 0;
        this.f4465y = 400L;
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4462v = t100.d(44.0f);
        this.f4463w = t100.d(44.0f);
        this.f4464x = 0;
        this.f4465y = 400L;
    }
}
