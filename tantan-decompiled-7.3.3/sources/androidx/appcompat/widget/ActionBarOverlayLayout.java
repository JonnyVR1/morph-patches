package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.InterfaceC0092g;
import com.google.android.gms.common.api.Api;
import p153l.ci20;
import p153l.di20;
import p153l.ei20;
import p153l.fi20;
import p153l.jnl0;
import p153l.kkl0;
import p153l.pid;
import p153l.qid;
import p153l.s8c0;
import p153l.wtq0;
import p153l.xdc0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarOverlayLayout extends ViewGroup implements pid, ei20, ci20, di20 {

    /* JADX INFO: renamed from: B */
    public static final int[] f503B = {s8c0.f166782b, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: A */
    public final fi20 f504A;

    /* JADX INFO: renamed from: a */
    public int f505a;

    /* JADX INFO: renamed from: b */
    public int f506b;

    /* JADX INFO: renamed from: c */
    public ContentFrameLayout f507c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f508d;

    /* JADX INFO: renamed from: e */
    public qid f509e;

    /* JADX INFO: renamed from: f */
    public Drawable f510f;

    /* JADX INFO: renamed from: g */
    public boolean f511g;

    /* JADX INFO: renamed from: h */
    public boolean f512h;

    /* JADX INFO: renamed from: i */
    public boolean f513i;

    /* JADX INFO: renamed from: j */
    public boolean f514j;

    /* JADX INFO: renamed from: k */
    public boolean f515k;

    /* JADX INFO: renamed from: l */
    public int f516l;

    /* JADX INFO: renamed from: m */
    public int f517m;

    /* JADX INFO: renamed from: n */
    public final Rect f518n;

    /* JADX INFO: renamed from: o */
    public final Rect f519o;

    /* JADX INFO: renamed from: p */
    public final Rect f520p;

    /* JADX INFO: renamed from: q */
    public final Rect f521q;

    /* JADX INFO: renamed from: r */
    public final Rect f522r;

    /* JADX INFO: renamed from: s */
    public final Rect f523s;

    /* JADX INFO: renamed from: t */
    public final Rect f524t;

    /* JADX INFO: renamed from: u */
    public InterfaceC0101d f525u;

    /* JADX INFO: renamed from: v */
    public OverScroller f526v;

    /* JADX INFO: renamed from: w */
    public ViewPropertyAnimator f527w;

    /* JADX INFO: renamed from: x */
    public final AnimatorListenerAdapter f528x;

    /* JADX INFO: renamed from: y */
    public final Runnable f529y;

    /* JADX INFO: renamed from: z */
    public final Runnable f530z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C0098a extends AnimatorListenerAdapter {
        public C0098a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f527w = null;
            actionBarOverlayLayout.f515k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f527w = null;
            actionBarOverlayLayout.f515k = false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class RunnableC0099b implements Runnable {
        public RunnableC0099b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m479o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f527w = actionBarOverlayLayout.f508d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f528x);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class RunnableC0100c implements Runnable {
        public RunnableC0100c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m479o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f527w = actionBarOverlayLayout.f508d.animate().translationY(-ActionBarOverlayLayout.this.f508d.getHeight()).setListener(ActionBarOverlayLayout.this.f528x);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface InterfaceC0101d {
        /* JADX INFO: renamed from: a */
        void mo486a();

        /* JADX INFO: renamed from: b */
        void mo487b();

        /* JADX INFO: renamed from: c */
        void mo488c();

        /* JADX INFO: renamed from: d */
        void mo489d();

        /* JADX INFO: renamed from: e */
        void mo490e(boolean z);

        void onWindowVisibilityChanged(int i);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f506b = 0;
        this.f518n = new Rect();
        this.f519o = new Rect();
        this.f520p = new Rect();
        this.f521q = new Rect();
        this.f522r = new Rect();
        this.f523s = new Rect();
        this.f524t = new Rect();
        this.f528x = new C0098a();
        this.f529y = new RunnableC0099b();
        this.f530z = new RunnableC0100c();
        m464p(context);
        this.f504A = new fi20(this);
    }

    /* JADX INFO: renamed from: p */
    private void m464p(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f503B);
        this.f505a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f510f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f511g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f526v = new OverScroller(context);
    }

    @Override // p153l.pid
    /* JADX INFO: renamed from: a */
    public boolean mo465a() {
        m483t();
        return this.f509e.mo654a();
    }

    @Override // p153l.pid
    /* JADX INFO: renamed from: b */
    public boolean mo466b() {
        m483t();
        return this.f509e.mo655b();
    }

    @Override // p153l.pid
    /* JADX INFO: renamed from: c */
    public boolean mo467c() {
        m483t();
        return this.f509e.mo656c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0102e;
    }

    @Override // p153l.pid
    /* JADX INFO: renamed from: d */
    public boolean mo468d() {
        m483t();
        return this.f509e.mo657d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f510f == null || this.f511g) {
            return;
        }
        int bottom = this.f508d.getVisibility() == 0 ? (int) (this.f508d.getBottom() + this.f508d.getTranslationY() + 0.5f) : 0;
        this.f510f.setBounds(0, bottom, getWidth(), this.f510f.getIntrinsicHeight() + bottom);
        this.f510f.draw(canvas);
    }

    @Override // p153l.pid
    /* JADX INFO: renamed from: e */
    public void mo469e(Menu menu, InterfaceC0092g.a aVar) {
        m483t();
        this.f509e.mo658e(menu, aVar);
    }

    @Override // p153l.pid
    /* JADX INFO: renamed from: f */
    public void mo470f() {
        m483t();
        this.f509e.mo659f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        m483t();
        kkl0.m150126I(this);
        boolean zM475k = m475k(this.f508d, rect, true, true, false, true);
        this.f521q.set(rect);
        jnl0.m146264a(this, this.f521q, this.f518n);
        if (!this.f522r.equals(this.f521q)) {
            this.f522r.set(this.f521q);
            zM475k = true;
        }
        if (!this.f519o.equals(this.f518n)) {
            this.f519o.set(this.f518n);
            zM475k = true;
        }
        if (zM475k) {
            requestLayout();
        }
        return true;
    }

    @Override // p153l.pid
    /* JADX INFO: renamed from: g */
    public boolean mo471g() {
        m483t();
        return this.f509e.mo660g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0102e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f508d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f504A.m125663a();
    }

    public CharSequence getTitle() {
        m483t();
        return this.f509e.getTitle();
    }

    @Override // p153l.pid
    /* JADX INFO: renamed from: h */
    public void mo472h(int i) {
        m483t();
        if (i == 2) {
            this.f509e.mo664k();
        } else if (i == 5) {
            this.f509e.mo669p();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // p153l.pid
    /* JADX INFO: renamed from: i */
    public void mo473i() {
        m483t();
        this.f509e.mo666m();
    }

    /* JADX INFO: renamed from: j */
    public final void m474j() {
        m479o();
        this.f530z.run();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final boolean m475k(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        C0102e c0102e = (C0102e) view.getLayoutParams();
        if (z) {
            int i = ((ViewGroup.MarginLayoutParams) c0102e).leftMargin;
            int i2 = rect.left;
            if (i != i2) {
                ((ViewGroup.MarginLayoutParams) c0102e).leftMargin = i2;
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        if (z2) {
            int i3 = ((ViewGroup.MarginLayoutParams) c0102e).topMargin;
            int i4 = rect.top;
            if (i3 != i4) {
                ((ViewGroup.MarginLayoutParams) c0102e).topMargin = i4;
                z5 = true;
            }
        }
        if (z4) {
            int i5 = ((ViewGroup.MarginLayoutParams) c0102e).rightMargin;
            int i6 = rect.right;
            if (i5 != i6) {
                ((ViewGroup.MarginLayoutParams) c0102e).rightMargin = i6;
                z5 = true;
            }
        }
        if (z3) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0102e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0102e).bottomMargin = i8;
                return true;
            }
        }
        return z5;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0102e generateDefaultLayoutParams() {
        return new C0102e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C0102e generateLayoutParams(AttributeSet attributeSet) {
        return new C0102e(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final qid m478n(View view) {
        if (view instanceof qid) {
            return (qid) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        wtq0.m207906a("Can't make a decor toolbar out of ".concat(view.getClass().getSimpleName()));
        return null;
    }

    /* JADX INFO: renamed from: o */
    public void m479o() {
        removeCallbacks(this.f529y);
        removeCallbacks(this.f530z);
        ViewPropertyAnimator viewPropertyAnimator = this.f527w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m464p(getContext());
        kkl0.m150158g0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m479o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0102e c0102e = (C0102e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0102e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0102e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        m483t();
        measureChildWithMargins(this.f508d, i, 0, i2, 0);
        C0102e c0102e = (C0102e) this.f508d.getLayoutParams();
        int measuredHeight = 0;
        int iMax = Math.max(0, this.f508d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0102e).leftMargin + ((ViewGroup.MarginLayoutParams) c0102e).rightMargin);
        int iMax2 = Math.max(0, this.f508d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0102e).topMargin + ((ViewGroup.MarginLayoutParams) c0102e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f508d.getMeasuredState());
        boolean z = (kkl0.m150126I(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f505a;
            if (this.f513i && this.f508d.getTabContainer() != null) {
                measuredHeight += this.f505a;
            }
        } else if (this.f508d.getVisibility() != 8) {
            measuredHeight = this.f508d.getMeasuredHeight();
        }
        this.f520p.set(this.f518n);
        this.f523s.set(this.f521q);
        if (this.f512h || z) {
            Rect rect = this.f523s;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
        } else {
            Rect rect2 = this.f520p;
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
        }
        m475k(this.f507c, this.f520p, true, true, true, true);
        if (!this.f524t.equals(this.f523s)) {
            this.f524t.set(this.f523s);
            this.f507c.m562a(this.f523s);
        }
        measureChildWithMargins(this.f507c, i, 0, i2, 0);
        C0102e c0102e2 = (C0102e) this.f507c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f507c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0102e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0102e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f507c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0102e2).topMargin + ((ViewGroup.MarginLayoutParams) c0102e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f507c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f514j || !z) {
            return false;
        }
        if (m485v(f, f2)) {
            m474j();
        } else {
            m484u();
        }
        this.f515k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // p153l.ci20
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f516l + i2;
        this.f516l = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f504A.m125664b(view, view2, i);
        this.f516l = getActionBarHideOffset();
        m479o();
        InterfaceC0101d interfaceC0101d = this.f525u;
        if (interfaceC0101d != null) {
            interfaceC0101d.mo489d();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f508d.getVisibility() != 0) {
            return false;
        }
        return this.f514j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f514j && !this.f515k) {
            if (this.f516l <= this.f508d.getHeight()) {
                m482s();
            } else {
                m481r();
            }
        }
        InterfaceC0101d interfaceC0101d = this.f525u;
        if (interfaceC0101d != null) {
            interfaceC0101d.mo487b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m483t();
        int i2 = this.f517m ^ i;
        this.f517m = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC0101d interfaceC0101d = this.f525u;
        if (interfaceC0101d != null) {
            interfaceC0101d.mo490e(!z2);
            if (z || !z2) {
                this.f525u.mo486a();
            } else {
                this.f525u.mo488c();
            }
        }
        if ((i2 & 256) == 0 || this.f525u == null) {
            return;
        }
        kkl0.m150158g0(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f506b = i;
        InterfaceC0101d interfaceC0101d = this.f525u;
        if (interfaceC0101d != null) {
            interfaceC0101d.onWindowVisibilityChanged(i);
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m480q() {
        return this.f512h;
    }

    /* JADX INFO: renamed from: r */
    public final void m481r() {
        m479o();
        postDelayed(this.f530z, 600L);
    }

    /* JADX INFO: renamed from: s */
    public final void m482s() {
        m479o();
        postDelayed(this.f529y, 600L);
    }

    public void setActionBarHideOffset(int i) {
        m479o();
        this.f508d.setTranslationY(-Math.max(0, Math.min(i, this.f508d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0101d interfaceC0101d) {
        this.f525u = interfaceC0101d;
        if (getWindowToken() != null) {
            this.f525u.onWindowVisibilityChanged(this.f506b);
            int i = this.f517m;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                kkl0.m150158g0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f513i = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f514j) {
            this.f514j = z;
            if (z) {
                return;
            }
            m479o();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m483t();
        this.f509e.setIcon(i);
    }

    public void setLogo(int i) {
        m483t();
        this.f509e.mo676w(i);
    }

    public void setOverlayMode(boolean z) {
        this.f512h = z;
        this.f511g = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // p153l.pid
    public void setWindowCallback(Window.Callback callback) {
        m483t();
        this.f509e.setWindowCallback(callback);
    }

    @Override // p153l.pid
    public void setWindowTitle(CharSequence charSequence) {
        m483t();
        this.f509e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public void m483t() {
        if (this.f507c == null) {
            this.f507c = (ContentFrameLayout) findViewById(xdc0.f193557b);
            this.f508d = (ActionBarContainer) findViewById(xdc0.f193558c);
            this.f509e = m478n(findViewById(xdc0.f193556a));
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m484u() {
        m479o();
        this.f529y.run();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m485v(float f, float f2) {
        this.f526v.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return this.f526v.getFinalY() > this.f508d.getHeight();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0102e extends ViewGroup.MarginLayoutParams {
        public C0102e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0102e(int i, int i2) {
            super(i, i2);
        }

        public C0102e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // p153l.ci20
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public void setIcon(Drawable drawable) {
        m483t();
        this.f509e.setIcon(drawable);
    }

    @Override // p153l.di20
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // p153l.ci20
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // p153l.ci20
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p153l.ci20
    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }
}
