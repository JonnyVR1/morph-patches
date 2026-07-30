package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import p153l.c30;
import p153l.f30;
import p153l.h2j0;
import p153l.s8c0;
import p153l.t0j0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: l */
    public static final Interpolator f689l = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public Runnable f690a;

    /* JADX INFO: renamed from: b */
    public ViewOnClickListenerC0135c f691b;

    /* JADX INFO: renamed from: c */
    public LinearLayoutCompat f692c;

    /* JADX INFO: renamed from: d */
    public Spinner f693d;

    /* JADX INFO: renamed from: e */
    public boolean f694e;

    /* JADX INFO: renamed from: f */
    public int f695f;

    /* JADX INFO: renamed from: g */
    public int f696g;

    /* JADX INFO: renamed from: h */
    public int f697h;

    /* JADX INFO: renamed from: i */
    public int f698i;

    /* JADX INFO: renamed from: j */
    public ViewPropertyAnimator f699j;

    /* JADX INFO: renamed from: k */
    public final C0136d f700k;

    public class TabView extends LinearLayout {

        /* JADX INFO: renamed from: a */
        public final int[] f701a;

        /* JADX INFO: renamed from: b */
        public c30.AbstractC16171c f702b;

        /* JADX INFO: renamed from: c */
        public TextView f703c;

        /* JADX INFO: renamed from: d */
        public ImageView f704d;

        /* JADX INFO: renamed from: e */
        public View f705e;

        public TabView(Context context, c30.AbstractC16171c abstractC16171c, boolean z) {
            super(context, null, s8c0.f166785e);
            int[] iArr = {R.attr.background};
            this.f701a = iArr;
            this.f702b = abstractC16171c;
            t0j0 t0j0VarM188782u = t0j0.m188782u(context, null, iArr, s8c0.f166785e, 0);
            if (t0j0VarM188782u.m188800r(0)) {
                setBackgroundDrawable(t0j0VarM188782u.m188789g(0));
            }
            t0j0VarM188782u.m188801v();
            if (z) {
                setGravity(8388627);
            }
            m592c();
        }

        /* JADX INFO: renamed from: a */
        public void m590a(c30.AbstractC16171c abstractC16171c) {
            this.f702b = abstractC16171c;
            m592c();
        }

        /* JADX INFO: renamed from: b */
        public c30.AbstractC16171c m591b() {
            return this.f702b;
        }

        /* JADX INFO: renamed from: c */
        public void m592c() {
            c30.AbstractC16171c abstractC16171c = this.f702b;
            View viewM107735b = abstractC16171c.m107735b();
            if (viewM107735b != null) {
                ViewParent parent = viewM107735b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewM107735b);
                    }
                    addView(viewM107735b);
                }
                this.f705e = viewM107735b;
                TextView textView = this.f703c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f704d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f704d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f705e;
            if (view != null) {
                removeView(view);
                this.f705e = null;
            }
            Drawable drawableM107736c = abstractC16171c.m107736c();
            CharSequence charSequenceM107737d = abstractC16171c.m107737d();
            ImageView imageView2 = this.f704d;
            if (drawableM107736c != null) {
                if (imageView2 == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f704d = appCompatImageView;
                }
                this.f704d.setImageDrawable(drawableM107736c);
                this.f704d.setVisibility(0);
            } else if (imageView2 != null) {
                imageView2.setVisibility(8);
                this.f704d.setImageDrawable(null);
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceM107737d);
            TextView textView2 = this.f703c;
            if (!zIsEmpty) {
                if (textView2 == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, s8c0.f166786f);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f703c = appCompatTextView;
                }
                this.f703c.setText(charSequenceM107737d);
                this.f703c.setVisibility(0);
            } else if (textView2 != null) {
                textView2.setVisibility(8);
                this.f703c.setText((CharSequence) null);
            }
            ImageView imageView3 = this.f704d;
            if (imageView3 != null) {
                imageView3.setContentDescription(abstractC16171c.m107734a());
            }
            h2j0.m133392a(this, zIsEmpty ? abstractC16171c.m107734a() : null);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView.this.f695f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = ScrollingTabContainerView.this.f695f;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ScrollingTabContainerView$a */
    public class RunnableC0133a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f707a;

        public RunnableC0133a(View view) {
            this.f707a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f707a.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f707a.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.f690a = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ScrollingTabContainerView$b */
    public class C0134b extends BaseAdapter {
        public C0134b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView.this.f692c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((TabView) ScrollingTabContainerView.this.f692c.getChildAt(i)).m591b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.m586d((c30.AbstractC16171c) getItem(i), true);
            }
            ((TabView) view).m590a((c30.AbstractC16171c) getItem(i));
            return view;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ScrollingTabContainerView$c */
    public class ViewOnClickListenerC0135c implements View.OnClickListener {
        public ViewOnClickListenerC0135c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((TabView) view).m591b().m107738e();
            int childCount = ScrollingTabContainerView.this.f692c.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ScrollingTabContainerView.this.f692c.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ScrollingTabContainerView$d */
    public class C0136d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f711a = false;

        /* JADX INFO: renamed from: b */
        public int f712b;

        public C0136d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f711a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f711a) {
                return;
            }
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            scrollingTabContainerView.f699j = null;
            scrollingTabContainerView.setVisibility(this.f712b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f711a = false;
        }
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        this.f700k = new C0136d();
        setHorizontalScrollBarEnabled(false);
        f30 f30VarM123689b = f30.m123689b(context);
        setContentHeight(f30VarM123689b.m123694f());
        this.f696g = f30VarM123689b.m123693e();
        LinearLayoutCompat linearLayoutCompatM585c = m585c();
        this.f692c = linearLayoutCompatM585c;
        addView(linearLayoutCompatM585c, new ViewGroup.LayoutParams(-2, -1));
    }

    /* JADX INFO: renamed from: a */
    public void m583a(int i) {
        View childAt = this.f692c.getChildAt(i);
        Runnable runnable = this.f690a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        RunnableC0133a runnableC0133a = new RunnableC0133a(childAt);
        this.f690a = runnableC0133a;
        post(runnableC0133a);
    }

    /* JADX INFO: renamed from: b */
    public final Spinner m584b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, s8c0.f166789i);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.C0132a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* JADX INFO: renamed from: c */
    public final LinearLayoutCompat m585c() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, s8c0.f166784d);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.C0132a(-2, -1));
        return linearLayoutCompat;
    }

    /* JADX INFO: renamed from: d */
    public TabView m586d(c30.AbstractC16171c abstractC16171c, boolean z) {
        TabView tabView = new TabView(getContext(), abstractC16171c, z);
        if (z) {
            tabView.setBackgroundDrawable(null);
            tabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.f697h));
            return tabView;
        }
        tabView.setFocusable(true);
        if (this.f691b == null) {
            this.f691b = new ViewOnClickListenerC0135c();
        }
        tabView.setOnClickListener(this.f691b);
        return tabView;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m587e() {
        Spinner spinner = this.f693d;
        return spinner != null && spinner.getParent() == this;
    }

    /* JADX INFO: renamed from: f */
    public final void m588f() {
        if (m587e()) {
            return;
        }
        if (this.f693d == null) {
            this.f693d = m584b();
        }
        removeView(this.f692c);
        addView(this.f693d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f693d.getAdapter() == null) {
            this.f693d.setAdapter((SpinnerAdapter) new C0134b());
        }
        Runnable runnable = this.f690a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f690a = null;
        }
        this.f693d.setSelection(this.f698i);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m589g() {
        if (!m587e()) {
            return false;
        }
        removeView(this.f693d);
        addView(this.f692c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f693d.getSelectedItemPosition());
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f690a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f30 f30VarM123689b = f30.m123689b(getContext());
        setContentHeight(f30VarM123689b.m123694f());
        this.f696g = f30VarM123689b.m123693e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f690a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((TabView) view).m591b().m107738e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f692c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f695f = -1;
        } else {
            if (childCount > 2) {
                this.f695f = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f695f = View.MeasureSpec.getSize(i) / 2;
            }
            this.f695f = Math.min(this.f695f, this.f696g);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f697h, 1073741824);
        if (z || !this.f694e) {
            m589g();
        } else {
            this.f692c.measure(0, iMakeMeasureSpec);
            if (this.f692c.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m588f();
            } else {
                m589g();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f698i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f694e = z;
    }

    public void setContentHeight(int i) {
        this.f697h = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f698i = i;
        int childCount = this.f692c.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f692c.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m583a(i);
            }
            i2++;
        }
        Spinner spinner = this.f693d;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
