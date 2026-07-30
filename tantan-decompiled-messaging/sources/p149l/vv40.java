package p149l;

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

/* JADX INFO: loaded from: classes10.dex */
public class vv40 implements s7m<pv40> {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f183149a;

    /* JADX INFO: renamed from: b */
    public View f183150b;

    /* JADX INFO: renamed from: c */
    public View f183151c;

    /* JADX INFO: renamed from: d */
    public View f183152d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f183153e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f183154f;

    /* JADX INFO: renamed from: g */
    public VText f183155g;

    /* JADX INFO: renamed from: h */
    public VLinear_FillerMeasure f183156h;

    /* JADX INFO: renamed from: i */
    public VText f183157i;

    /* JADX INFO: renamed from: j */
    public VText f183158j;

    /* JADX INFO: renamed from: k */
    public VText f183159k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f183160l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f183161m;

    /* JADX INFO: renamed from: n */
    public VText f183162n;

    /* JADX INFO: renamed from: o */
    public VButton_FakeShadow f183163o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f183164p;

    /* JADX INFO: renamed from: q */
    public VButton f183165q;

    /* JADX INFO: renamed from: r */
    public VButton f183166r;

    /* JADX INFO: renamed from: s */
    public VScroll_Horizontal f183167s;

    /* JADX INFO: renamed from: t */
    public VLinear f183168t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f183169u;

    /* JADX INFO: renamed from: v */
    public VText f183170v;

    /* JADX INFO: renamed from: w */
    public Act f183171w;

    /* JADX INFO: renamed from: x */
    public pv40 f183172x;

    /* JADX INFO: renamed from: l.vv40$a */
    public class C20734a extends ohf0 {

        /* JADX INFO: renamed from: a */
        public int f183173a = xdl0.m208412y0();

        public C20734a() {
        }

        @Override // p149l.ohf0, p149l.xqf0
        /* JADX INFO: renamed from: c */
        public void mo9242c(jqf0 jqf0Var) {
            float fM142793d = 1.0f - ((float) jqf0Var.m142793d());
            vv40.this.f183163o.setTranslationX(this.f183173a * fM142793d);
            vv40.this.f183162n.setTranslationX((-fM142793d) * this.f183173a);
        }
    }

    public vv40(Act act) {
        this.f183171w = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m200162m(View view) {
        this.f183172x.m171537r0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m200163n(View view) {
        act().m50458m2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m200164p(View view) {
        act().m50458m2();
    }

    /* JADX INFO: renamed from: r */
    private void m200165r() {
        xdl0.m208329E0(this.f183163o, new View.OnClickListener() { // from class: l.uv40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178498a.m200164p(view);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f183171w;
    }

    public Animator enterAnimation() {
        final jqf0 jqf0VarM108322c = zqf0.m219852h().m108322c();
        jqf0VarM108322c.m142805p(new lqf0(300.0d, 13.0d));
        act().postDelayed(new Runnable() { // from class: l.rv40
            @Override // java.lang.Runnable
            public final void run() {
                this.f161161a.m200169k(jqf0VarM108322c);
            }
        }, 600L);
        AnticipateInterpolator anticipateInterpolator = new AnticipateInterpolator();
        VText vText = this.f183170v;
        Property property = View.ALPHA;
        ArrayList arrayListM200324f0 = vwb.m200324f0(bt0.m103739l(vText, property, 0L, 600L, anticipateInterpolator, 1.0f), bt0.m103739l(this.f183153e, property, 0L, 480L, null, 1.0f), bt0.m103739l(this.f183154f, property, 0L, 480L, null, 1.0f), bt0.m103739l(this.f183153e, bt0.f77162i, 200L, 800L, new OvershootInterpolator(2.0f), 1.0f), bt0.m103739l(this.f183154f, bt0.f77162i, 200L, 800L, new OvershootInterpolator(2.0f), 1.0f));
        return bt0.m103729b(this.f183153e, bt0.m103753z((Animator[]) arrayListM200324f0.toArray(new Animator[arrayListM200324f0.size()])));
    }

    public Animator exitAnimation() {
        AnticipateInterpolator anticipateInterpolator = new AnticipateInterpolator();
        ArrayList arrayListM200324f0 = vwb.m200324f0(bt0.m103739l(this.f183153e, bt0.f77162i, 0L, 500L, anticipateInterpolator, 0.0f), bt0.m103743p(this.f183153e, "alpha", 0L, 500L, anticipateInterpolator, 0.0f), bt0.m103739l(this.f183154f, bt0.f77162i, 0L, 500L, anticipateInterpolator, 0.0f), bt0.m103743p(this.f183154f, "alpha", 0L, 500L, anticipateInterpolator, 0.0f));
        Animator animatorM103753z = bt0.m103753z((Animator[]) arrayListM200324f0.toArray(new Animator[arrayListM200324f0.size()]));
        if (this.f183172x.m171532k0()) {
            return bt0.m103729b(this.f183153e, animatorM103753z);
        }
        xdl0.m208345M0(this.f183163o, false);
        VText vText = this.f183162n;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vText, BaseSei.f13930X, -vText.getWidth());
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        bt0.m103733f(animatorSet, new Runnable() { // from class: l.qv40
            @Override // java.lang.Runnable
            public final void run() {
                this.f156579a.m200170l();
            }
        });
        animatorSet.play(animatorM103753z).after(objectAnimatorOfFloat);
        return animatorSet;
    }

    /* JADX INFO: renamed from: f */
    public View m200166f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wv40.m205716b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(pv40 pv40Var) {
        this.f183172x = pv40Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM200166f = m200166f(layoutInflater, viewGroup);
        m200165r();
        xdl0.m208329E0(this.f183162n, new View.OnClickListener() { // from class: l.sv40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166526a.m200162m(view);
            }
        });
        xdl0.m208329E0(viewM200166f, new View.OnClickListener() { // from class: l.tv40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172251a.m200163n(view);
            }
        });
        return viewM200166f;
    }

    public void initAnimationState() {
        this.f183170v.setAlpha(0.0f);
        this.f183153e.setAlpha(0.0f);
        xdl0.m208402t0(this.f183153e, 0.1f);
        this.f183154f.setAlpha(0.0f);
        xdl0.m208402t0(this.f183154f, 0.1f);
        int iM208412y0 = xdl0.m208412y0();
        this.f183163o.setTranslationX(iM208412y0);
        this.f183162n.setTranslationX(-iM208412y0);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m200168j(User user) {
        return TEnum.equals(user.gender, "female");
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m200169k(jqf0 jqf0Var) {
        jqf0Var.m142790a(new C20734a());
        jqf0Var.m142804o(1.0d);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m200170l() {
        this.f183172x.m171536q0();
    }

    /* JADX INFO: renamed from: q */
    public void m200171q(User user, User user2) {
        qib0.f154691G.m102331L0(this.f183153e, user2.m60124fp().profileMiddle().formatted());
        qib0.f154691G.m102325I0(this.f183154f, user.m60124fp().profileMiddle().formatted(), 2, 100);
        this.f183157i.setText(user.name);
        this.f183159k.setText(String.format("开通黑金会员立即与%s聊天！", user.isFemale() ? "她" : "他"));
        this.f183163o.setText(this.f183171w.getResources().getText(m200168j(user) ? R$string.f20585H0 : R$string.f20582G0));
        xdl0.m208344M(this.f183155g, tae0.m187713q(user));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
