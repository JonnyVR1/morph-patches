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
import p149l.dti0;
import p149l.i30;
import p149l.l30;
import p149l.n0c0;
import p149l.qri0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: l */
    public static final Interpolator f689l = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public Runnable f690a;

    /* JADX INFO: renamed from: b */
    public ViewOnClickListenerC0134c f691b;

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
    public final C0135d f700k;

    public class TabView extends LinearLayout {

        /* JADX INFO: renamed from: a */
        public final int[] f701a;

        /* JADX INFO: renamed from: b */
        public i30.AbstractC17467c f702b;

        /* JADX INFO: renamed from: c */
        public TextView f703c;

        /* JADX INFO: renamed from: d */
        public ImageView f704d;

        /* JADX INFO: renamed from: e */
        public View f705e;

        public TabView(Context context, i30.AbstractC17467c abstractC17467c, boolean z) {
            super(context, null, n0c0.f136513e);
            int[] iArr = {R.attr.background};
            this.f701a = iArr;
            this.f702b = abstractC17467c;
            qri0 qri0VarM175993u = qri0.m175993u(context, null, iArr, n0c0.f136513e, 0);
            if (qri0VarM175993u.m176011r(0)) {
                setBackgroundDrawable(qri0VarM175993u.m176000g(0));
            }
            qri0VarM175993u.m176012v();
            if (z) {
                setGravity(8388627);
            }
            m591c();
        }

        /* JADX INFO: renamed from: a */
        public void m589a(i30.AbstractC17467c abstractC17467c) {
            this.f702b = abstractC17467c;
            m591c();
        }

        /* JADX INFO: renamed from: b */
        public i30.AbstractC17467c m590b() {
            return this.f702b;
        }

        /* JADX INFO: renamed from: c */
        public void m591c() {
            i30.AbstractC17467c abstractC17467c = this.f702b;
            View viewM134141b = abstractC17467c.m134141b();
            if (viewM134141b != null) {
                ViewParent parent = viewM134141b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewM134141b);
                    }
                    addView(viewM134141b);
                }
                this.f705e = viewM134141b;
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
            Drawable drawableM134142c = abstractC17467c.m134142c();
            CharSequence charSequenceM134143d = abstractC17467c.m134143d();
            ImageView imageView2 = this.f704d;
            if (drawableM134142c != null) {
                if (imageView2 == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f704d = appCompatImageView;
                }
                this.f704d.setImageDrawable(drawableM134142c);
                this.f704d.setVisibility(0);
            } else if (imageView2 != null) {
                imageView2.setVisibility(8);
                this.f704d.setImageDrawable(null);
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceM134143d);
            TextView textView2 = this.f703c;
            if (!zIsEmpty) {
                if (textView2 == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, n0c0.f136514f);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f703c = appCompatTextView;
                }
                this.f703c.setText(charSequenceM134143d);
                this.f703c.setVisibility(0);
            } else if (textView2 != null) {
                textView2.setVisibility(8);
                this.f703c.setText((CharSequence) null);
            }
            ImageView imageView3 = this.f704d;
            if (imageView3 != null) {
                imageView3.setContentDescription(abstractC17467c.m134140a());
            }
            dti0.m113570a(this, zIsEmpty ? abstractC17467c.m134140a() : null);
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
    public class RunnableC0132a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f707a;

        public RunnableC0132a(View view) {
            this.f707a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f707a.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f707a.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.f690a = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ScrollingTabContainerView$b */
    public class C0133b extends BaseAdapter {
        public C0133b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView.this.f692c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((TabView) ScrollingTabContainerView.this.f692c.getChildAt(i)).m590b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.m585d((i30.AbstractC17467c) getItem(i), true);
            }
            ((TabView) view).m589a((i30.AbstractC17467c) getItem(i));
            return view;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ScrollingTabContainerView$c */
    public class ViewOnClickListenerC0134c implements View.OnClickListener {
        public ViewOnClickListenerC0134c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((TabView) view).m590b().m134144e();
            int childCount = ScrollingTabContainerView.this.f692c.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ScrollingTabContainerView.this.f692c.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ScrollingTabContainerView$d */
    public class C0135d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f711a = false;

        /* JADX INFO: renamed from: b */
        public int f712b;

        public C0135d() {
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
        this.f700k = new C0135d();
        setHorizontalScrollBarEnabled(false);
        l30 l30VarM148325b = l30.m148325b(context);
        setContentHeight(l30VarM148325b.m148330f());
        this.f696g = l30VarM148325b.m148329e();
        LinearLayoutCompat linearLayoutCompatM584c = m584c();
        this.f692c = linearLayoutCompatM584c;
        addView(linearLayoutCompatM584c, new ViewGroup.LayoutParams(-2, -1));
    }

    /* JADX INFO: renamed from: a */
    public void m582a(int i) {
        View childAt = this.f692c.getChildAt(i);
        Runnable runnable = this.f690a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        RunnableC0132a runnableC0132a = new RunnableC0132a(childAt);
        this.f690a = runnableC0132a;
        post(runnableC0132a);
    }

    /* JADX INFO: renamed from: b */
    public final Spinner m583b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, n0c0.f136517i);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.C0131a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* JADX INFO: renamed from: c */
    public final LinearLayoutCompat m584c() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, n0c0.f136512d);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.C0131a(-2, -1));
        return linearLayoutCompat;
    }

    /* JADX INFO: renamed from: d */
    public TabView m585d(i30.AbstractC17467c abstractC17467c, boolean z) {
        TabView tabView = new TabView(getContext(), abstractC17467c, z);
        if (z) {
            tabView.setBackgroundDrawable(null);
            tabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.f697h));
            return tabView;
        }
        tabView.setFocusable(true);
        if (this.f691b == null) {
            this.f691b = new ViewOnClickListenerC0134c();
        }
        tabView.setOnClickListener(this.f691b);
        return tabView;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m586e() {
        Spinner spinner = this.f693d;
        return spinner != null && spinner.getParent() == this;
    }

    /* JADX INFO: renamed from: f */
    public final void m587f() {
        if (m586e()) {
            return;
        }
        if (this.f693d == null) {
            this.f693d = m583b();
        }
        removeView(this.f692c);
        addView(this.f693d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f693d.getAdapter() == null) {
            this.f693d.setAdapter((SpinnerAdapter) new C0133b());
        }
        Runnable runnable = this.f690a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f690a = null;
        }
        this.f693d.setSelection(this.f698i);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m588g() {
        if (!m586e()) {
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
        l30 l30VarM148325b = l30.m148325b(getContext());
        setContentHeight(l30VarM148325b.m148330f());
        this.f696g = l30VarM148325b.m148329e();
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
        ((TabView) view).m590b().m134144e();
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
            m588g();
        } else {
            this.f692c.measure(0, iMakeMeasureSpec);
            if (this.f692c.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m587f();
            } else {
                m588g();
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
                m582a(i);
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
