package p153l;

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
import com.google.android.exoplayer2.p031ui.DefaultTimeBar;
import com.google.android.exoplayer2.p031ui.StyledPlayerControlView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class tbg0 {

    /* JADX INFO: renamed from: A */
    public boolean f172922A;

    /* JADX INFO: renamed from: B */
    public boolean f172923B;

    /* JADX INFO: renamed from: a */
    public final StyledPlayerControlView f172925a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final View f172926b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final ViewGroup f172927c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final ViewGroup f172928d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final ViewGroup f172929e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final ViewGroup f172930f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final ViewGroup f172931g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final ViewGroup f172932h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final ViewGroup f172933i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final View f172934j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final View f172935k;

    /* JADX INFO: renamed from: l */
    public final AnimatorSet f172936l;

    /* JADX INFO: renamed from: m */
    public final AnimatorSet f172937m;

    /* JADX INFO: renamed from: n */
    public final AnimatorSet f172938n;

    /* JADX INFO: renamed from: o */
    public final AnimatorSet f172939o;

    /* JADX INFO: renamed from: p */
    public final AnimatorSet f172940p;

    /* JADX INFO: renamed from: q */
    public final ValueAnimator f172941q;

    /* JADX INFO: renamed from: r */
    public final ValueAnimator f172942r;

    /* JADX INFO: renamed from: s */
    public final Runnable f172943s = new Runnable() { // from class: l.gbg0
        @Override // java.lang.Runnable
        public final void run() {
            this.f103469a.m190063Y();
        }
    };

    /* JADX INFO: renamed from: t */
    public final Runnable f172944t = new Runnable() { // from class: l.mbg0
        @Override // java.lang.Runnable
        public final void run() {
            this.f135720a.m190043D();
        }
    };

    /* JADX INFO: renamed from: u */
    public final Runnable f172945u = new Runnable() { // from class: l.nbg0
        @Override // java.lang.Runnable
        public final void run() {
            this.f141224a.m190047H();
        }
    };

    /* JADX INFO: renamed from: v */
    public final Runnable f172946v = new Runnable() { // from class: l.obg0
        @Override // java.lang.Runnable
        public final void run() {
            this.f146585a.m190046G();
        }
    };

    /* JADX INFO: renamed from: w */
    public final Runnable f172947w = new Runnable() { // from class: l.pbg0
        @Override // java.lang.Runnable
        public final void run() {
            this.f151375a.m190044E();
        }
    };

    /* JADX INFO: renamed from: x */
    public final View.OnLayoutChangeListener f172948x = new View.OnLayoutChangeListener() { // from class: l.qbg0
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f156475a.m190052N(view, i, i2, i3, i4, i5, i6, i7, i8);
        }
    };

    /* JADX INFO: renamed from: C */
    public boolean f172924C = true;

    /* JADX INFO: renamed from: z */
    public int f172950z = 0;

    /* JADX INFO: renamed from: y */
    public final List<View> f172949y = new ArrayList();

    /* JADX INFO: renamed from: l.tbg0$a */
    public class C20266a extends AnimatorListenerAdapter {
        public C20266a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (tbg0.this.f172926b != null) {
                tbg0.this.f172926b.setVisibility(4);
            }
            if (tbg0.this.f172927c != null) {
                tbg0.this.f172927c.setVisibility(4);
            }
            if (tbg0.this.f172929e != null) {
                tbg0.this.f172929e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(tbg0.this.f172934j instanceof DefaultTimeBar) || tbg0.this.f172922A) {
                return;
            }
            ((DefaultTimeBar) tbg0.this.f172934j).m11871h(250L);
        }
    }

    /* JADX INFO: renamed from: l.tbg0$b */
    public class C20267b extends AnimatorListenerAdapter {
        public C20267b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (tbg0.this.f172926b != null) {
                tbg0.this.f172926b.setVisibility(0);
            }
            if (tbg0.this.f172927c != null) {
                tbg0.this.f172927c.setVisibility(0);
            }
            if (tbg0.this.f172929e != null) {
                tbg0.this.f172929e.setVisibility(tbg0.this.f172922A ? 0 : 4);
            }
            if (!(tbg0.this.f172934j instanceof DefaultTimeBar) || tbg0.this.f172922A) {
                return;
            }
            ((DefaultTimeBar) tbg0.this.f172934j).m11880s(250L);
        }
    }

    /* JADX INFO: renamed from: l.tbg0$c */
    public class C20268c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ StyledPlayerControlView f172953a;

        public C20268c(StyledPlayerControlView styledPlayerControlView) {
            this.f172953a = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            tbg0.this.m190060V(1);
            if (tbg0.this.f172923B) {
                this.f172953a.post(tbg0.this.f172943s);
                tbg0.this.f172923B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            tbg0.this.m190060V(3);
        }
    }

    /* JADX INFO: renamed from: l.tbg0$d */
    public class C20269d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ StyledPlayerControlView f172955a;

        public C20269d(StyledPlayerControlView styledPlayerControlView) {
            this.f172955a = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            tbg0.this.m190060V(2);
            if (tbg0.this.f172923B) {
                this.f172955a.post(tbg0.this.f172943s);
                tbg0.this.f172923B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            tbg0.this.m190060V(3);
        }
    }

    /* JADX INFO: renamed from: l.tbg0$e */
    public class C20270e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ StyledPlayerControlView f172957a;

        public C20270e(StyledPlayerControlView styledPlayerControlView) {
            this.f172957a = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            tbg0.this.m190060V(2);
            if (tbg0.this.f172923B) {
                this.f172957a.post(tbg0.this.f172943s);
                tbg0.this.f172923B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            tbg0.this.m190060V(3);
        }
    }

    /* JADX INFO: renamed from: l.tbg0$f */
    public class C20271f extends AnimatorListenerAdapter {
        public C20271f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            tbg0.this.m190060V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            tbg0.this.m190060V(4);
        }
    }

    /* JADX INFO: renamed from: l.tbg0$g */
    public class C20272g extends AnimatorListenerAdapter {
        public C20272g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            tbg0.this.m190060V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            tbg0.this.m190060V(4);
        }
    }

    /* JADX INFO: renamed from: l.tbg0$h */
    public class C20273h extends AnimatorListenerAdapter {
        public C20273h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (tbg0.this.f172930f != null) {
                tbg0.this.f172930f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (tbg0.this.f172932h != null) {
                tbg0.this.f172932h.setVisibility(0);
                tbg0.this.f172932h.setTranslationX(tbg0.this.f172932h.getWidth());
                tbg0.this.f172932h.scrollTo(tbg0.this.f172932h.getWidth(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: l.tbg0$i */
    public class C20274i extends AnimatorListenerAdapter {
        public C20274i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (tbg0.this.f172932h != null) {
                tbg0.this.f172932h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (tbg0.this.f172930f != null) {
                tbg0.this.f172930f.setVisibility(0);
            }
        }
    }

    public tbg0(StyledPlayerControlView styledPlayerControlView) {
        this.f172925a = styledPlayerControlView;
        this.f172926b = styledPlayerControlView.findViewById(lcc0.f131333l);
        this.f172927c = (ViewGroup) styledPlayerControlView.findViewById(lcc0.f131328g);
        this.f172929e = (ViewGroup) styledPlayerControlView.findViewById(lcc0.f131343v);
        ViewGroup viewGroup = (ViewGroup) styledPlayerControlView.findViewById(lcc0.f131326e);
        this.f172928d = viewGroup;
        this.f172933i = (ViewGroup) styledPlayerControlView.findViewById(lcc0.f131320T);
        View viewFindViewById = styledPlayerControlView.findViewById(lcc0.f131308H);
        this.f172934j = viewFindViewById;
        this.f172930f = (ViewGroup) styledPlayerControlView.findViewById(lcc0.f131325d);
        this.f172931g = (ViewGroup) styledPlayerControlView.findViewById(lcc0.f131336o);
        this.f172932h = (ViewGroup) styledPlayerControlView.findViewById(lcc0.f131337p);
        View viewFindViewById2 = styledPlayerControlView.findViewById(lcc0.f131347z);
        this.f172935k = viewFindViewById2;
        View viewFindViewById3 = styledPlayerControlView.findViewById(lcc0.f131346y);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.rbg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f162021a.m190054P(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.rbg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f162021a.m190054P(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.sbg0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                tbg0.m190019d(this.f167146a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C20266a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hbg0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                tbg0.m190022g(this.f108589a, valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new C20267b());
        Resources resources = styledPlayerControlView.getResources();
        float dimension = resources.getDimension(sac0.f167027b) - resources.getDimension(sac0.f167028c);
        float dimension2 = resources.getDimension(sac0.f167027b);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f172936l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new C20268c(styledPlayerControlView));
        animatorSet.play(valueAnimatorOfFloat).with(m190015J(0.0f, dimension, viewFindViewById)).with(m190015J(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f172937m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new C20269d(styledPlayerControlView));
        animatorSet2.play(m190015J(dimension, dimension2, viewFindViewById)).with(m190015J(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f172938n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new C20270e(styledPlayerControlView));
        animatorSet3.play(valueAnimatorOfFloat).with(m190015J(0.0f, dimension2, viewFindViewById)).with(m190015J(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f172939o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new C20271f());
        animatorSet4.play(valueAnimatorOfFloat2).with(m190015J(dimension, 0.0f, viewFindViewById)).with(m190015J(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f172940p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new C20272g());
        animatorSet5.play(valueAnimatorOfFloat2).with(m190015J(dimension2, 0.0f, viewFindViewById)).with(m190015J(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f172941q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kbg0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                tbg0.m190017b(this.f124946a, valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new C20273h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f172942r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lbg0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                tbg0.m190028m(this.f131205a, valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new C20274i());
    }

    /* JADX INFO: renamed from: B */
    public static int m190014B(@Nullable View view) {
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
    public static ObjectAnimator m190015J(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m190017b(tbg0 tbg0Var, ValueAnimator valueAnimator) {
        tbg0Var.getClass();
        tbg0Var.m190066y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m190019d(tbg0 tbg0Var, ValueAnimator valueAnimator) {
        tbg0Var.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = tbg0Var.f172926b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = tbg0Var.f172927c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = tbg0Var.f172929e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m190022g(tbg0 tbg0Var, ValueAnimator valueAnimator) {
        tbg0Var.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = tbg0Var.f172926b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = tbg0Var.f172927c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = tbg0Var.f172929e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m190028m(tbg0 tbg0Var, ValueAnimator valueAnimator) {
        tbg0Var.getClass();
        tbg0Var.m190066y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: z */
    public static int m190040z(@Nullable View view) {
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
    public boolean m190041A(@Nullable View view) {
        return view != null && this.f172949y.contains(view);
    }

    /* JADX INFO: renamed from: C */
    public void m190042C() {
        int i = this.f172950z;
        if (i == 3 || i == 2) {
            return;
        }
        m190056R();
        if (!this.f172924C) {
            m190044E();
        } else if (this.f172950z == 1) {
            m190047H();
        } else {
            m190043D();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m190043D() {
        this.f172938n.start();
    }

    /* JADX INFO: renamed from: E */
    public final void m190044E() {
        m190060V(2);
    }

    /* JADX INFO: renamed from: F */
    public void m190045F() {
        int i = this.f172950z;
        if (i == 3 || i == 2) {
            return;
        }
        m190056R();
        m190044E();
    }

    /* JADX INFO: renamed from: G */
    public final void m190046G() {
        this.f172936l.start();
        m190055Q(this.f172945u, 2000L);
    }

    /* JADX INFO: renamed from: H */
    public final void m190047H() {
        this.f172937m.start();
    }

    /* JADX INFO: renamed from: I */
    public boolean m190048I() {
        return this.f172950z == 0 && this.f172925a.m12040d0();
    }

    /* JADX INFO: renamed from: K */
    public void m190049K() {
        this.f172925a.addOnLayoutChangeListener(this.f172948x);
    }

    /* JADX INFO: renamed from: L */
    public void m190050L() {
        this.f172925a.removeOnLayoutChangeListener(this.f172948x);
    }

    /* JADX INFO: renamed from: M */
    public void m190051M(boolean z, int i, int i2, int i3, int i4) {
        View view = this.f172926b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m190052N(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean zM190065a0 = m190065a0();
        if (this.f172922A != zM190065a0) {
            this.f172922A = zM190065a0;
            view.post(new Runnable() { // from class: l.ibg0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f114216a.m190064Z();
                }
            });
        }
        boolean z = i3 - i != i7 - i5;
        if (this.f172922A || !z) {
            return;
        }
        view.post(new Runnable() { // from class: l.jbg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f119874a.m190053O();
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m190053O() {
        int i;
        if (this.f172930f == null || this.f172931g == null) {
            return;
        }
        int width = (this.f172925a.getWidth() - this.f172925a.getPaddingLeft()) - this.f172925a.getPaddingRight();
        while (true) {
            if (this.f172931g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f172931g.getChildCount() - 2;
            View childAt = this.f172931g.getChildAt(childCount);
            this.f172931g.removeViewAt(childCount);
            this.f172930f.addView(childAt, 0);
        }
        View view = this.f172935k;
        if (view != null) {
            view.setVisibility(8);
        }
        int iM190014B = m190014B(this.f172933i);
        int childCount2 = this.f172930f.getChildCount() - 1;
        for (int i2 = 0; i2 < childCount2; i2++) {
            iM190014B += m190014B(this.f172930f.getChildAt(i2));
        }
        if (iM190014B <= width) {
            ViewGroup viewGroup = this.f172932h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f172942r.isStarted()) {
                return;
            }
            this.f172941q.cancel();
            this.f172942r.start();
            return;
        }
        View view2 = this.f172935k;
        if (view2 != null) {
            view2.setVisibility(0);
            iM190014B += m190014B(this.f172935k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < childCount2; i3++) {
            View childAt2 = this.f172930f.getChildAt(i3);
            iM190014B -= m190014B(childAt2);
            arrayList.add(childAt2);
            if (iM190014B <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f172930f.removeViews(0, arrayList.size());
        for (i = 0; i < arrayList.size(); i++) {
            this.f172931g.addView((View) arrayList.get(i), this.f172931g.getChildCount() - 1);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m190054P(View view) {
        m190057S();
        if (view.getId() == lcc0.f131347z) {
            this.f172941q.start();
        } else if (view.getId() == lcc0.f131346y) {
            this.f172942r.start();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m190055Q(Runnable runnable, long j) {
        if (j >= 0) {
            this.f172925a.postDelayed(runnable, j);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m190056R() {
        this.f172925a.removeCallbacks(this.f172947w);
        this.f172925a.removeCallbacks(this.f172944t);
        this.f172925a.removeCallbacks(this.f172946v);
        this.f172925a.removeCallbacks(this.f172945u);
    }

    /* JADX INFO: renamed from: S */
    public void m190057S() {
        if (this.f172950z == 3) {
            return;
        }
        m190056R();
        int showTimeoutMs = this.f172925a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f172924C) {
                m190055Q(this.f172947w, showTimeoutMs);
            } else if (this.f172950z == 1) {
                m190055Q(this.f172945u, 2000L);
            } else {
                m190055Q(this.f172946v, showTimeoutMs);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public void m190058T(boolean z) {
        this.f172924C = z;
    }

    /* JADX INFO: renamed from: U */
    public void m190059U(@Nullable View view, boolean z) {
        if (view == null) {
            return;
        }
        if (!z) {
            view.setVisibility(8);
            this.f172949y.remove(view);
            return;
        }
        if (this.f172922A && m190061W(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f172949y.add(view);
    }

    /* JADX INFO: renamed from: V */
    public final void m190060V(int i) {
        int i2 = this.f172950z;
        this.f172950z = i;
        if (i == 2) {
            this.f172925a.setVisibility(8);
        } else if (i2 == 2) {
            this.f172925a.setVisibility(0);
        }
        if (i2 != i) {
            this.f172925a.m12041e0();
        }
    }

    /* JADX INFO: renamed from: W */
    public final boolean m190061W(View view) {
        int id = view.getId();
        return id == lcc0.f131326e || id == lcc0.f131307G || id == lcc0.f131345x || id == lcc0.f131311K || id == lcc0.f131312L || id == lcc0.f131338q || id == lcc0.f131339r;
    }

    /* JADX INFO: renamed from: X */
    public void m190062X() {
        if (!this.f172925a.m12040d0()) {
            this.f172925a.setVisibility(0);
            this.f172925a.m12051o0();
            this.f172925a.m12046j0();
        }
        m190063Y();
    }

    /* JADX INFO: renamed from: Y */
    public final void m190063Y() {
        if (!this.f172924C) {
            m190060V(0);
            m190057S();
            return;
        }
        int i = this.f172950z;
        if (i == 1) {
            this.f172939o.start();
        } else if (i == 2) {
            this.f172940p.start();
        } else if (i == 3) {
            this.f172923B = true;
        } else if (i == 4) {
            return;
        }
        m190057S();
    }

    /* JADX INFO: renamed from: Z */
    public final void m190064Z() {
        ViewGroup viewGroup = this.f172929e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.f172922A ? 0 : 4);
        }
        if (this.f172934j != null) {
            int dimensionPixelSize = this.f172925a.getResources().getDimensionPixelSize(sac0.f167029d);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f172934j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.f172922A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f172934j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f172934j;
            if (view instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                if (this.f172922A) {
                    defaultTimeBar.m11872i(true);
                } else {
                    int i = this.f172950z;
                    if (i == 1) {
                        defaultTimeBar.m11872i(false);
                    } else if (i != 3) {
                        defaultTimeBar.m11879r();
                    }
                }
            }
        }
        for (View view2 : this.f172949y) {
            view2.setVisibility((this.f172922A && m190061W(view2)) ? 4 : 0);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m190065a0() {
        int width = (this.f172925a.getWidth() - this.f172925a.getPaddingLeft()) - this.f172925a.getPaddingRight();
        int height = (this.f172925a.getHeight() - this.f172925a.getPaddingBottom()) - this.f172925a.getPaddingTop();
        int iM190014B = m190014B(this.f172927c);
        ViewGroup viewGroup = this.f172927c;
        int paddingLeft = iM190014B - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f172927c.getPaddingRight() : 0);
        int iM190040z = m190040z(this.f172927c);
        ViewGroup viewGroup2 = this.f172927c;
        return width <= Math.max(paddingLeft, m190014B(this.f172933i) + m190014B(this.f172935k)) || height <= (iM190040z - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f172927c.getPaddingBottom() : 0)) + (m190040z(this.f172928d) * 2);
    }

    /* JADX INFO: renamed from: y */
    public final void m190066y(float f) {
        ViewGroup viewGroup = this.f172932h;
        if (viewGroup != null) {
            this.f172932h.setTranslationX((int) (viewGroup.getWidth() * (1.0f - f)));
        }
        ViewGroup viewGroup2 = this.f172933i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f172930f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }
}
