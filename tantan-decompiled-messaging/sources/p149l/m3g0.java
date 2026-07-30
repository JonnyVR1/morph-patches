package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.p030ui.DefaultTimeBar;
import com.google.android.exoplayer2.p030ui.StyledPlayerControlView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class m3g0 {

    /* JADX INFO: renamed from: A */
    public boolean f131044A;

    /* JADX INFO: renamed from: B */
    public boolean f131045B;

    /* JADX INFO: renamed from: a */
    public final StyledPlayerControlView f131047a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final View f131048b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final ViewGroup f131049c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final ViewGroup f131050d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final ViewGroup f131051e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final ViewGroup f131052f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final ViewGroup f131053g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final ViewGroup f131054h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final ViewGroup f131055i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final View f131056j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final View f131057k;

    /* JADX INFO: renamed from: l */
    public final AnimatorSet f131058l;

    /* JADX INFO: renamed from: m */
    public final AnimatorSet f131059m;

    /* JADX INFO: renamed from: n */
    public final AnimatorSet f131060n;

    /* JADX INFO: renamed from: o */
    public final AnimatorSet f131061o;

    /* JADX INFO: renamed from: p */
    public final AnimatorSet f131062p;

    /* JADX INFO: renamed from: q */
    public final ValueAnimator f131063q;

    /* JADX INFO: renamed from: r */
    public final ValueAnimator f131064r;

    /* JADX INFO: renamed from: s */
    public final Runnable f131065s = new Runnable() { // from class: l.z2g0
        @Override // java.lang.Runnable
        public final void run() {
            this.f201233a.m152905Y();
        }
    };

    /* JADX INFO: renamed from: t */
    public final Runnable f131066t = new Runnable() { // from class: l.f3g0
        @Override // java.lang.Runnable
        public final void run() {
            this.f94683a.m152885D();
        }
    };

    /* JADX INFO: renamed from: u */
    public final Runnable f131067u = new Runnable() { // from class: l.g3g0
        @Override // java.lang.Runnable
        public final void run() {
            this.f100462a.m152889H();
        }
    };

    /* JADX INFO: renamed from: v */
    public final Runnable f131068v = new Runnable() { // from class: l.h3g0
        @Override // java.lang.Runnable
        public final void run() {
            this.f105740a.m152888G();
        }
    };

    /* JADX INFO: renamed from: w */
    public final Runnable f131069w = new Runnable() { // from class: l.i3g0
        @Override // java.lang.Runnable
        public final void run() {
            this.f111284a.m152886E();
        }
    };

    /* JADX INFO: renamed from: x */
    public final View.OnLayoutChangeListener f131070x = new View.OnLayoutChangeListener() { // from class: l.j3g0
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f116071a.m152894N(view, i, i2, i3, i4, i5, i6, i7, i8);
        }
    };

    /* JADX INFO: renamed from: C */
    public boolean f131046C = true;

    /* JADX INFO: renamed from: z */
    public int f131072z = 0;

    /* JADX INFO: renamed from: y */
    public final List<View> f131071y = new ArrayList();

    /* JADX INFO: renamed from: l.m3g0$a */
    public class C18377a extends AnimatorListenerAdapter {
        public C18377a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (m3g0.this.f131048b != null) {
                m3g0.this.f131048b.setVisibility(4);
            }
            if (m3g0.this.f131049c != null) {
                m3g0.this.f131049c.setVisibility(4);
            }
            if (m3g0.this.f131051e != null) {
                m3g0.this.f131051e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(m3g0.this.f131056j instanceof DefaultTimeBar) || m3g0.this.f131044A) {
                return;
            }
            ((DefaultTimeBar) m3g0.this.f131056j).m11817h(250L);
        }
    }

    /* JADX INFO: renamed from: l.m3g0$b */
    public class C18378b extends AnimatorListenerAdapter {
        public C18378b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (m3g0.this.f131048b != null) {
                m3g0.this.f131048b.setVisibility(0);
            }
            if (m3g0.this.f131049c != null) {
                m3g0.this.f131049c.setVisibility(0);
            }
            if (m3g0.this.f131051e != null) {
                m3g0.this.f131051e.setVisibility(m3g0.this.f131044A ? 0 : 4);
            }
            if (!(m3g0.this.f131056j instanceof DefaultTimeBar) || m3g0.this.f131044A) {
                return;
            }
            ((DefaultTimeBar) m3g0.this.f131056j).m11826s(250L);
        }
    }

    /* JADX INFO: renamed from: l.m3g0$c */
    public class C18379c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ StyledPlayerControlView f131075a;

        public C18379c(StyledPlayerControlView styledPlayerControlView) {
            this.f131075a = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m3g0.this.m152902V(1);
            if (m3g0.this.f131045B) {
                this.f131075a.post(m3g0.this.f131065s);
                m3g0.this.f131045B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m3g0.this.m152902V(3);
        }
    }

    /* JADX INFO: renamed from: l.m3g0$d */
    public class C18380d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ StyledPlayerControlView f131077a;

        public C18380d(StyledPlayerControlView styledPlayerControlView) {
            this.f131077a = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m3g0.this.m152902V(2);
            if (m3g0.this.f131045B) {
                this.f131077a.post(m3g0.this.f131065s);
                m3g0.this.f131045B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m3g0.this.m152902V(3);
        }
    }

    /* JADX INFO: renamed from: l.m3g0$e */
    public class C18381e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ StyledPlayerControlView f131079a;

        public C18381e(StyledPlayerControlView styledPlayerControlView) {
            this.f131079a = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m3g0.this.m152902V(2);
            if (m3g0.this.f131045B) {
                this.f131079a.post(m3g0.this.f131065s);
                m3g0.this.f131045B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m3g0.this.m152902V(3);
        }
    }

    /* JADX INFO: renamed from: l.m3g0$f */
    public class C18382f extends AnimatorListenerAdapter {
        public C18382f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m3g0.this.m152902V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m3g0.this.m152902V(4);
        }
    }

    /* JADX INFO: renamed from: l.m3g0$g */
    public class C18383g extends AnimatorListenerAdapter {
        public C18383g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m3g0.this.m152902V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m3g0.this.m152902V(4);
        }
    }

    /* JADX INFO: renamed from: l.m3g0$h */
    public class C18384h extends AnimatorListenerAdapter {
        public C18384h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (m3g0.this.f131052f != null) {
                m3g0.this.f131052f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (m3g0.this.f131054h != null) {
                m3g0.this.f131054h.setVisibility(0);
                m3g0.this.f131054h.setTranslationX(m3g0.this.f131054h.getWidth());
                m3g0.this.f131054h.scrollTo(m3g0.this.f131054h.getWidth(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: l.m3g0$i */
    public class C18385i extends AnimatorListenerAdapter {
        public C18385i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (m3g0.this.f131054h != null) {
                m3g0.this.f131054h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (m3g0.this.f131052f != null) {
                m3g0.this.f131052f.setVisibility(0);
            }
        }
    }

    public m3g0(StyledPlayerControlView styledPlayerControlView) {
        this.f131047a = styledPlayerControlView;
        this.f131048b = styledPlayerControlView.findViewById(f4c0.f94788l);
        this.f131049c = (ViewGroup) styledPlayerControlView.findViewById(f4c0.f94783g);
        this.f131051e = (ViewGroup) styledPlayerControlView.findViewById(f4c0.f94798v);
        ViewGroup viewGroup = (ViewGroup) styledPlayerControlView.findViewById(f4c0.f94781e);
        this.f131050d = viewGroup;
        this.f131055i = (ViewGroup) styledPlayerControlView.findViewById(f4c0.f94775T);
        View viewFindViewById = styledPlayerControlView.findViewById(f4c0.f94763H);
        this.f131056j = viewFindViewById;
        this.f131052f = (ViewGroup) styledPlayerControlView.findViewById(f4c0.f94780d);
        this.f131053g = (ViewGroup) styledPlayerControlView.findViewById(f4c0.f94791o);
        this.f131054h = (ViewGroup) styledPlayerControlView.findViewById(f4c0.f94792p);
        View viewFindViewById2 = styledPlayerControlView.findViewById(f4c0.f94802z);
        this.f131057k = viewFindViewById2;
        View viewFindViewById3 = styledPlayerControlView.findViewById(f4c0.f94801y);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.k3g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f120836a.m152896P(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.k3g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f120836a.m152896P(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.l3g0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                m3g0.m152861d(this.f125906a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C18377a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.a3g0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                m3g0.m152864g(this.f67366a, valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new C18378b());
        Resources resources = styledPlayerControlView.getResources();
        float dimension = resources.getDimension(l2c0.f125771b) - resources.getDimension(l2c0.f125772c);
        float dimension2 = resources.getDimension(l2c0.f125771b);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f131058l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new C18379c(styledPlayerControlView));
        animatorSet.play(valueAnimatorOfFloat).with(m152857J(0.0f, dimension, viewFindViewById)).with(m152857J(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f131059m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new C18380d(styledPlayerControlView));
        animatorSet2.play(m152857J(dimension, dimension2, viewFindViewById)).with(m152857J(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f131060n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new C18381e(styledPlayerControlView));
        animatorSet3.play(valueAnimatorOfFloat).with(m152857J(0.0f, dimension2, viewFindViewById)).with(m152857J(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f131061o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new C18382f());
        animatorSet4.play(valueAnimatorOfFloat2).with(m152857J(dimension, 0.0f, viewFindViewById)).with(m152857J(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f131062p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new C18383g());
        animatorSet5.play(valueAnimatorOfFloat2).with(m152857J(dimension2, 0.0f, viewFindViewById)).with(m152857J(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f131063q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.d3g0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                m3g0.m152859b(this.f84218a, valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new C18384h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f131064r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.e3g0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                m3g0.m152870m(this.f89178a, valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new C18385i());
    }

    /* JADX INFO: renamed from: B */
    public static int m152856B(@Nullable View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* JADX INFO: renamed from: J */
    public static ObjectAnimator m152857J(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m152859b(m3g0 m3g0Var, ValueAnimator valueAnimator) {
        m3g0Var.getClass();
        m3g0Var.m152908y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m152861d(m3g0 m3g0Var, ValueAnimator valueAnimator) {
        m3g0Var.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = m3g0Var.f131048b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = m3g0Var.f131049c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = m3g0Var.f131051e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m152864g(m3g0 m3g0Var, ValueAnimator valueAnimator) {
        m3g0Var.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = m3g0Var.f131048b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = m3g0Var.f131049c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = m3g0Var.f131051e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m152870m(m3g0 m3g0Var, ValueAnimator valueAnimator) {
        m3g0Var.getClass();
        m3g0Var.m152908y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: z */
    public static int m152882z(@Nullable View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: A */
    public boolean m152883A(@Nullable View view) {
        return view != null && this.f131071y.contains(view);
    }

    /* JADX INFO: renamed from: C */
    public void m152884C() {
        int i = this.f131072z;
        if (i == 3 || i == 2) {
            return;
        }
        m152898R();
        if (!this.f131046C) {
            m152886E();
        } else if (this.f131072z == 1) {
            m152889H();
        } else {
            m152885D();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m152885D() {
        this.f131060n.start();
    }

    /* JADX INFO: renamed from: E */
    public final void m152886E() {
        m152902V(2);
    }

    /* JADX INFO: renamed from: F */
    public void m152887F() {
        int i = this.f131072z;
        if (i == 3 || i == 2) {
            return;
        }
        m152898R();
        m152886E();
    }

    /* JADX INFO: renamed from: G */
    public final void m152888G() {
        this.f131058l.start();
        m152897Q(this.f131067u, 2000L);
    }

    /* JADX INFO: renamed from: H */
    public final void m152889H() {
        this.f131059m.start();
    }

    /* JADX INFO: renamed from: I */
    public boolean m152890I() {
        return this.f131072z == 0 && this.f131047a.m11986d0();
    }

    /* JADX INFO: renamed from: K */
    public void m152891K() {
        this.f131047a.addOnLayoutChangeListener(this.f131070x);
    }

    /* JADX INFO: renamed from: L */
    public void m152892L() {
        this.f131047a.removeOnLayoutChangeListener(this.f131070x);
    }

    /* JADX INFO: renamed from: M */
    public void m152893M(boolean z, int i, int i2, int i3, int i4) {
        View view = this.f131048b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m152894N(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean zM152907a0 = m152907a0();
        if (this.f131044A != zM152907a0) {
            this.f131044A = zM152907a0;
            view.post(new Runnable() { // from class: l.b3g0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73216a.m152906Z();
                }
            });
        }
        boolean z = i3 - i != i7 - i5;
        if (this.f131044A || !z) {
            return;
        }
        view.post(new Runnable() { // from class: l.c3g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f78944a.m152895O();
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m152895O() {
        int i;
        if (this.f131052f == null || this.f131053g == null) {
            return;
        }
        int width = (this.f131047a.getWidth() - this.f131047a.getPaddingLeft()) - this.f131047a.getPaddingRight();
        while (true) {
            if (this.f131053g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f131053g.getChildCount() - 2;
            View childAt = this.f131053g.getChildAt(childCount);
            this.f131053g.removeViewAt(childCount);
            this.f131052f.addView(childAt, 0);
        }
        View view = this.f131057k;
        if (view != null) {
            view.setVisibility(8);
        }
        int iM152856B = m152856B(this.f131055i);
        int childCount2 = this.f131052f.getChildCount() - 1;
        for (int i2 = 0; i2 < childCount2; i2++) {
            iM152856B += m152856B(this.f131052f.getChildAt(i2));
        }
        if (iM152856B <= width) {
            ViewGroup viewGroup = this.f131054h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f131064r.isStarted()) {
                return;
            }
            this.f131063q.cancel();
            this.f131064r.start();
            return;
        }
        View view2 = this.f131057k;
        if (view2 != null) {
            view2.setVisibility(0);
            iM152856B += m152856B(this.f131057k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < childCount2; i3++) {
            View childAt2 = this.f131052f.getChildAt(i3);
            iM152856B -= m152856B(childAt2);
            arrayList.add(childAt2);
            if (iM152856B <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f131052f.removeViews(0, arrayList.size());
        for (i = 0; i < arrayList.size(); i++) {
            this.f131053g.addView((View) arrayList.get(i), this.f131053g.getChildCount() - 1);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m152896P(View view) {
        m152899S();
        if (view.getId() == f4c0.f94802z) {
            this.f131063q.start();
        } else if (view.getId() == f4c0.f94801y) {
            this.f131064r.start();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m152897Q(Runnable runnable, long j) {
        if (j >= 0) {
            this.f131047a.postDelayed(runnable, j);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m152898R() {
        this.f131047a.removeCallbacks(this.f131069w);
        this.f131047a.removeCallbacks(this.f131066t);
        this.f131047a.removeCallbacks(this.f131068v);
        this.f131047a.removeCallbacks(this.f131067u);
    }

    /* JADX INFO: renamed from: S */
    public void m152899S() {
        if (this.f131072z == 3) {
            return;
        }
        m152898R();
        int showTimeoutMs = this.f131047a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f131046C) {
                m152897Q(this.f131069w, showTimeoutMs);
            } else if (this.f131072z == 1) {
                m152897Q(this.f131067u, 2000L);
            } else {
                m152897Q(this.f131068v, showTimeoutMs);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public void m152900T(boolean z) {
        this.f131046C = z;
    }

    /* JADX INFO: renamed from: U */
    public void m152901U(@Nullable View view, boolean z) {
        if (view == null) {
            return;
        }
        if (!z) {
            view.setVisibility(8);
            this.f131071y.remove(view);
            return;
        }
        if (this.f131044A && m152903W(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f131071y.add(view);
    }

    /* JADX INFO: renamed from: V */
    public final void m152902V(int i) {
        int i2 = this.f131072z;
        this.f131072z = i;
        if (i == 2) {
            this.f131047a.setVisibility(8);
        } else if (i2 == 2) {
            this.f131047a.setVisibility(0);
        }
        if (i2 != i) {
            this.f131047a.m11987e0();
        }
    }

    /* JADX INFO: renamed from: W */
    public final boolean m152903W(View view) {
        int id = view.getId();
        return id == f4c0.f94781e || id == f4c0.f94762G || id == f4c0.f94800x || id == f4c0.f94766K || id == f4c0.f94767L || id == f4c0.f94793q || id == f4c0.f94794r;
    }

    /* JADX INFO: renamed from: X */
    public void m152904X() {
        if (!this.f131047a.m11986d0()) {
            this.f131047a.setVisibility(0);
            this.f131047a.m11997o0();
            this.f131047a.m11992j0();
        }
        m152905Y();
    }

    /* JADX INFO: renamed from: Y */
    public final void m152905Y() {
        if (!this.f131046C) {
            m152902V(0);
            m152899S();
            return;
        }
        int i = this.f131072z;
        if (i == 1) {
            this.f131061o.start();
        } else if (i == 2) {
            this.f131062p.start();
        } else if (i == 3) {
            this.f131045B = true;
        } else if (i == 4) {
            return;
        }
        m152899S();
    }

    /* JADX INFO: renamed from: Z */
    public final void m152906Z() {
        ViewGroup viewGroup = this.f131051e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.f131044A ? 0 : 4);
        }
        if (this.f131056j != null) {
            int dimensionPixelSize = this.f131047a.getResources().getDimensionPixelSize(l2c0.f125773d);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f131056j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.f131044A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f131056j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f131056j;
            if (view instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                if (this.f131044A) {
                    defaultTimeBar.m11818i(true);
                } else {
                    int i = this.f131072z;
                    if (i == 1) {
                        defaultTimeBar.m11818i(false);
                    } else if (i != 3) {
                        defaultTimeBar.m11825r();
                    }
                }
            }
        }
        for (View view2 : this.f131071y) {
            view2.setVisibility((this.f131044A && m152903W(view2)) ? 4 : 0);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m152907a0() {
        int width = (this.f131047a.getWidth() - this.f131047a.getPaddingLeft()) - this.f131047a.getPaddingRight();
        int height = (this.f131047a.getHeight() - this.f131047a.getPaddingBottom()) - this.f131047a.getPaddingTop();
        int iM152856B = m152856B(this.f131049c);
        ViewGroup viewGroup = this.f131049c;
        int paddingLeft = iM152856B - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f131049c.getPaddingRight() : 0);
        int iM152882z = m152882z(this.f131049c);
        ViewGroup viewGroup2 = this.f131049c;
        return width <= Math.max(paddingLeft, m152856B(this.f131055i) + m152856B(this.f131057k)) || height <= (iM152882z - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f131049c.getPaddingBottom() : 0)) + (m152882z(this.f131050d) * 2);
    }

    /* JADX INFO: renamed from: y */
    public final void m152908y(float f) {
        ViewGroup viewGroup = this.f131054h;
        if (viewGroup != null) {
            this.f131054h.setTranslationX((int) (viewGroup.getWidth() * (1.0f - f)));
        }
        ViewGroup viewGroup2 = this.f131055i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f131052f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }
}
