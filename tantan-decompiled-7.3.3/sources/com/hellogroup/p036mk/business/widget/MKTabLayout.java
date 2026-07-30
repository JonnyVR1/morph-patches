package com.hellogroup.p036mk.business.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.ActionBar;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.common.api.Api;
import com.google.android.material.badge.BadgeDrawable;
import com.hellogroup.p036mk.business.widget.MKTabLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p153l.cf60;
import p153l.chc0;
import p153l.hvi0;
import p153l.jzv;
import p153l.kkl0;
import p153l.nj80;
import p153l.or0;
import p153l.pj80;
import p153l.rgc0;
import p153l.rj80;
import p153l.tac0;
import p153l.tu0;
import p153l.wg3;
import p153l.wtq0;
import p153l.wyh0;

/* JADX INFO: loaded from: classes7.dex */
@ViewPager.InterfaceC0713e
public class MKTabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: G */
    private static final nj80<C3592f> f12403G = new rj80(16);

    /* JADX INFO: renamed from: A */
    private cf60 f12404A;

    /* JADX INFO: renamed from: B */
    private DataSetObserver f12405B;

    /* JADX INFO: renamed from: C */
    private C3594h f12406C;

    /* JADX INFO: renamed from: D */
    private C3587a f12407D;

    /* JADX INFO: renamed from: E */
    private boolean f12408E;

    /* JADX INFO: renamed from: F */
    private final nj80<TabView> f12409F;

    /* JADX INFO: renamed from: a */
    private final String f12410a;

    /* JADX INFO: renamed from: b */
    private final ArrayList<C3592f> f12411b;

    /* JADX INFO: renamed from: c */
    private C3592f f12412c;

    /* JADX INFO: renamed from: d */
    private final SlidingTabStrip f12413d;

    /* JADX INFO: renamed from: e */
    int f12414e;

    /* JADX INFO: renamed from: f */
    int f12415f;

    /* JADX INFO: renamed from: g */
    int f12416g;

    /* JADX INFO: renamed from: h */
    int f12417h;

    /* JADX INFO: renamed from: i */
    int f12418i;

    /* JADX INFO: renamed from: j */
    ColorStateList f12419j;

    /* JADX INFO: renamed from: k */
    float f12420k;

    /* JADX INFO: renamed from: l */
    float f12421l;

    /* JADX INFO: renamed from: m */
    final int f12422m;

    /* JADX INFO: renamed from: n */
    int f12423n;

    /* JADX INFO: renamed from: o */
    private final int f12424o;

    /* JADX INFO: renamed from: p */
    private final int f12425p;

    /* JADX INFO: renamed from: q */
    private final int f12426q;

    /* JADX INFO: renamed from: r */
    private int f12427r;

    /* JADX INFO: renamed from: s */
    int f12428s;

    /* JADX INFO: renamed from: t */
    int f12429t;

    /* JADX INFO: renamed from: u */
    boolean f12430u;

    /* JADX INFO: renamed from: v */
    private InterfaceC3589c f12431v;

    /* JADX INFO: renamed from: w */
    private final ArrayList<InterfaceC3589c> f12432w;

    /* JADX INFO: renamed from: x */
    private InterfaceC3589c f12433x;

    /* JADX INFO: renamed from: y */
    private ValueAnimator f12434y;

    /* JADX INFO: renamed from: z */
    ViewPager f12435z;

    public class SlidingTabStrip extends ViewGroup {

        /* JADX INFO: renamed from: a */
        private int f12436a;

        /* JADX INFO: renamed from: b */
        private final Paint f12437b;

        /* JADX INFO: renamed from: c */
        private InterfaceC3588b f12438c;

        /* JADX INFO: renamed from: d */
        int f12439d;

        /* JADX INFO: renamed from: e */
        int f12440e;

        /* JADX INFO: renamed from: f */
        float f12441f;

        /* JADX INFO: renamed from: g */
        private int f12442g;

        /* JADX INFO: renamed from: h */
        private int f12443h;

        /* JADX INFO: renamed from: i */
        private ValueAnimator f12444i;

        /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKTabLayout$SlidingTabStrip$a */
        public class C3585a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f12446a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ View f12447b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ int f12448c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ boolean f12449d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ int f12450e;

            public C3585a(int i, View view, int i2, boolean z, int i3) {
                this.f12446a = i;
                this.f12447b = view;
                this.f12448c = i2;
                this.f12449d = z;
                this.f12450e = i3;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                SlidingTabStrip.this.m18335f(or0.m168852a(this.f12446a, this.f12447b.getLeft(), animatedFraction), or0.m168852a(this.f12448c, this.f12447b.getRight(), animatedFraction));
                if (!this.f12449d) {
                    SlidingTabStrip slidingTabStrip = SlidingTabStrip.this;
                    slidingTabStrip.m18331l(slidingTabStrip.f12440e, 1.0f - animatedFraction);
                }
                SlidingTabStrip.this.m18331l(this.f12450e, animatedFraction);
                SlidingTabStrip.this.requestLayout();
            }
        }

        /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKTabLayout$SlidingTabStrip$b */
        public class C3586b extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ boolean f12452a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f12453b;

            public C3586b(boolean z, int i) {
                this.f12452a = z;
                this.f12453b = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!this.f12452a) {
                    SlidingTabStrip slidingTabStrip = SlidingTabStrip.this;
                    slidingTabStrip.m18331l(slidingTabStrip.f12440e, 0.0f);
                }
                SlidingTabStrip.this.m18331l(this.f12453b, 1.0f);
                SlidingTabStrip.this.requestLayout();
                SlidingTabStrip slidingTabStrip2 = SlidingTabStrip.this;
                slidingTabStrip2.f12439d = slidingTabStrip2.f12440e;
                slidingTabStrip2.f12440e = this.f12453b;
                slidingTabStrip2.f12441f = 0.0f;
            }
        }

        public SlidingTabStrip(Context context) {
            super(context);
            this.f12439d = -1;
            this.f12440e = -1;
            this.f12442g = -1;
            this.f12443h = -1;
            setWillNotDraw(false);
            this.f12437b = new Paint();
        }

        /* JADX INFO: renamed from: k */
        private void m18330k(boolean z) {
            int left;
            int right;
            View childAt = getChildAt(this.f12440e);
            if (childAt == null || childAt.getWidth() <= 0) {
                left = -1;
                right = -1;
            } else {
                left = childAt.getLeft();
                right = childAt.getRight();
                if (this.f12441f > 0.0f && this.f12440e < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f12440e + 1);
                    float left2 = this.f12441f * childAt2.getLeft();
                    float f = this.f12441f;
                    left = (int) (left2 + ((1.0f - f) * left));
                    right = (int) ((f * childAt2.getRight()) + ((1.0f - this.f12441f) * right));
                }
            }
            if (z) {
                int i = this.f12439d;
                int i2 = this.f12440e;
                if (i != i2 && i != i2 + 1) {
                    m18331l(i, 0.0f);
                }
                m18331l(this.f12440e, Math.abs(1.0f - this.f12441f));
                m18331l(this.f12440e + 1, Math.abs(this.f12441f));
                requestLayout();
            }
            m18335f(left, right);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l */
        public void m18331l(int i, float f) {
            C3592f c3592fM18322t = MKTabLayout.this.m18322t(i);
            if (c3592fM18322t == null || c3592fM18322t.f12468f == null) {
                return;
            }
            c3592fM18322t.f12468f.m18364d(c3592fM18322t.f12469g, i, f);
        }

        /* JADX INFO: renamed from: c */
        public void m18332c(int i, int i2) {
            int i3;
            int i4;
            ValueAnimator valueAnimator = this.f12444i;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f12444i.cancel();
            }
            boolean z = kkl0.m150191x(this) == 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                m18330k(true);
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            if (Math.abs(i - this.f12440e) <= 1) {
                int i5 = this.f12442g;
                i4 = this.f12443h;
                i3 = i5;
            } else {
                int iM18321s = MKTabLayout.this.m18321s(24);
                i3 = (i >= this.f12440e ? !z : z) ? left - iM18321s : right + iM18321s;
                i4 = i3;
            }
            if (i3 == left && i4 == right) {
                return;
            }
            boolean z2 = this.f12440e == i;
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f12444i = valueAnimator2;
            valueAnimator2.setInterpolator(or0.f148666f);
            valueAnimator2.setDuration(i2);
            valueAnimator2.setFloatValues(0.0f, 1.0f);
            valueAnimator2.addUpdateListener(new C3585a(i3, childAt, i4, z2, i));
            valueAnimator2.addListener(new C3586b(z2, i));
            valueAnimator2.start();
        }

        /* JADX INFO: renamed from: d */
        public boolean m18333d() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int i;
            super.draw(canvas);
            int i2 = this.f12442g;
            if (i2 < 0 || (i = this.f12443h) <= i2) {
                return;
            }
            InterfaceC3588b interfaceC3588b = this.f12438c;
            if (interfaceC3588b != null) {
                interfaceC3588b.mo18343a(canvas, i2, 0, i, getHeight(), this.f12441f);
            } else {
                canvas.drawRect(i2, getHeight() - this.f12436a, this.f12443h, getHeight(), this.f12437b);
            }
        }

        /* JADX INFO: renamed from: e */
        public float m18334e() {
            return this.f12440e + this.f12441f;
        }

        /* JADX INFO: renamed from: f */
        public void m18335f(int i, int i2) {
            if (i == this.f12442g && i2 == this.f12443h) {
                return;
            }
            this.f12442g = i;
            this.f12443h = i2;
            kkl0.m150146a0(this);
        }

        /* JADX INFO: renamed from: g */
        public void m18336g(int i, float f) {
            ValueAnimator valueAnimator = this.f12444i;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f12444i.cancel();
            }
            this.f12439d = this.f12440e;
            this.f12440e = i;
            this.f12441f = f;
            m18330k(true);
        }

        /* JADX INFO: renamed from: h */
        public void m18337h(int i) {
            if (this.f12437b.getColor() != i) {
                this.f12437b.setColor(i);
                kkl0.m150146a0(this);
            }
        }

        /* JADX INFO: renamed from: i */
        public void m18338i(int i) {
            if (this.f12436a != i) {
                this.f12436a = i;
                kkl0.m150146a0(this);
            }
        }

        /* JADX INFO: renamed from: j */
        public void m18339j(InterfaceC3588b interfaceC3588b) {
            if (this.f12438c != interfaceC3588b) {
                this.f12438c = interfaceC3588b;
                kkl0.m150146a0(this);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int paddingLeft = getPaddingLeft();
            int bottom = ((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    int i6 = paddingLeft + marginLayoutParams.leftMargin;
                    int paddingTop = getPaddingTop() + ((((bottom - measuredHeight) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin) / 2);
                    childAt.layout(i6, paddingTop, i6 + measuredWidth, measuredHeight + paddingTop);
                    paddingLeft = i6 + measuredWidth + marginLayoutParams.rightMargin;
                }
            }
            ValueAnimator valueAnimator = this.f12444i;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m18330k(false);
            }
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                super.onMeasure(i, i2);
                return;
            }
            int i3 = 0;
            if (MKTabLayout.this.f12429t == 1) {
                int childCount = getChildCount();
                int size = childCount > 0 ? View.MeasureSpec.getSize(i) / childCount : View.MeasureSpec.getSize(i);
                while (i3 < childCount) {
                    measureChild(getChildAt(i3), View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
                    i3++;
                }
                super.onMeasure(i, i2);
                return;
            }
            int childCount2 = getChildCount();
            int measuredWidth = 0;
            int iMax = 0;
            while (i3 < childCount2) {
                View childAt = getChildAt(i3);
                measureChild(childAt, i, i2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                measuredWidth += childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                i3++;
            }
            setMeasuredDimension(measuredWidth, iMax);
        }
    }

    public class TabView extends FrameLayout implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        private C3592f f12455a;

        /* JADX INFO: renamed from: b */
        private View f12456b;

        public TabView(Context context) {
            super(context);
            int i = MKTabLayout.this.f12422m;
            if (i != 0) {
                setBackgroundDrawable(tu0.m192702b(context, i));
            }
            kkl0.m150196z0(this, MKTabLayout.this.f12414e, MKTabLayout.this.f12415f, MKTabLayout.this.f12416g, MKTabLayout.this.f12417h);
            setClickable(true);
        }

        /* JADX INFO: renamed from: a */
        public void m18340a() {
            setTab(null);
            setSelected(false);
        }

        /* JADX INFO: renamed from: b */
        public final void m18341b() {
            C3592f c3592f = this.f12455a;
            View viewM18352c = c3592f != null ? c3592f.m18352c() : null;
            boolean z = false;
            if (viewM18352c != null) {
                ViewParent parent = viewM18352c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewM18352c);
                    }
                    addView(viewM18352c, new FrameLayout.LayoutParams(-2, -2));
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewM18352c.getLayoutParams();
                if (MKTabLayout.this.m18323u()) {
                    layoutParams.bottomMargin = MKTabLayout.this.m18321s(8);
                    layoutParams.gravity = 83;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.gravity = 17;
                }
                this.f12456b = viewM18352c;
            } else {
                View view = this.f12456b;
                if (view != null) {
                    removeView(view);
                    this.f12456b = null;
                }
            }
            if (c3592f != null && c3592f.m18354e()) {
                z = true;
            }
            setSelected(z);
        }

        public C3592f getTab() {
            return this.f12455a;
        }

        @Override // android.view.View
        @TargetApi(14)
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.Tab.class.getName());
        }

        @Override // android.view.View
        @TargetApi(14)
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ActionBar.Tab.class.getName());
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            int[] iArr = new int[2];
            Rect rect = new Rect();
            getLocationOnScreen(iArr);
            getWindowVisibleDisplayFrame(rect);
            Context context = getContext();
            int width = getWidth();
            int height = getHeight();
            int i = iArr[1] + (height / 2);
            int i2 = iArr[0] + (width / 2);
            if (kkl0.m150191x(view) == 0) {
                i2 = context.getResources().getDisplayMetrics().widthPixels - i2;
            }
            Toast toastMakeText = Toast.makeText(context, this.f12455a.m18351b(), 0);
            if (i < rect.height()) {
                toastMakeText.setGravity(BadgeDrawable.TOP_END, i2, (iArr[1] + height) - rect.top);
            } else {
                toastMakeText.setGravity(81, 0, height);
            }
            toastMakeText.show();
            return true;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = MKTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(MKTabLayout.this.f12423n, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            C3592f c3592f = this.f12455a;
            if (c3592f == null) {
                return zPerformClick;
            }
            c3592f.m18356g();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            View view = this.f12456b;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(@Nullable C3592f c3592f) {
            if (c3592f != this.f12455a) {
                this.f12455a = c3592f;
                m18341b();
            }
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKTabLayout$a */
    public class C3587a implements ViewPager.InterfaceC0717i {

        /* JADX INFO: renamed from: a */
        private boolean f12458a;

        public C3587a() {
        }

        /* JADX INFO: renamed from: a */
        public void m18342a(boolean z) {
            this.f12458a = z;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0717i
        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable cf60 cf60Var, @Nullable cf60 cf60Var2) {
            MKTabLayout mKTabLayout = MKTabLayout.this;
            if (mKTabLayout.f12435z == viewPager) {
                mKTabLayout.m18312C(cf60Var2, this.f12458a);
            }
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKTabLayout$b */
    public interface InterfaceC3588b {
        /* JADX INFO: renamed from: a */
        void mo18343a(Canvas canvas, int i, int i2, int i3, int i4, float f);
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKTabLayout$c */
    public interface InterfaceC3589c {
        /* JADX INFO: renamed from: a */
        void mo18344a(C3592f c3592f);

        /* JADX INFO: renamed from: b */
        void mo18345b(C3592f c3592f);

        /* JADX INFO: renamed from: c */
        void mo18346c(C3592f c3592f);
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKTabLayout$d */
    public class C3590d extends DataSetObserver {
        public C3590d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            MKTabLayout.this.m18325w();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            MKTabLayout.this.m18325w();
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKTabLayout$e */
    public static class C3591e extends AbstractC3593g {

        /* JADX INFO: renamed from: b */
        @Nullable
        protected TextView f12461b;

        /* JADX INFO: renamed from: c */
        @Nullable
        private CharSequence f12462c;

        public C3591e(@Nullable CharSequence charSequence) {
            this.f12462c = charSequence;
        }

        @Override // com.hellogroup.p036mk.business.widget.MKTabLayout.AbstractC3593g
        @NonNull
        /* JADX INFO: renamed from: b */
        public View mo18347b(@NonNull MKTabLayout mKTabLayout) {
            TextView textView = new TextView(mKTabLayout.getContext());
            this.f12461b = textView;
            m18363c(textView, mKTabLayout);
            this.f12461b.setText(this.f12462c);
            return new ScaleLayout(this.f12461b);
        }

        @Override // com.hellogroup.p036mk.business.widget.MKTabLayout.AbstractC3593g
        /* JADX INFO: renamed from: e */
        public void mo18348e(@NonNull MKTabLayout mKTabLayout, @NonNull View view, float f) {
            if (mKTabLayout.m18323u()) {
                float f2 = (f * 0.6f) + 1.0f;
                ((ScaleLayout) view).m18367a(f2, f2);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m18349f(@Nullable CharSequence charSequence) {
            this.f12462c = charSequence;
            TextView textView = this.f12461b;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKTabLayout$f */
    public static final class C3592f {

        /* JADX INFO: renamed from: a */
        private Object f12463a;

        /* JADX INFO: renamed from: b */
        private CharSequence f12464b;

        /* JADX INFO: renamed from: c */
        private CharSequence f12465c;

        /* JADX INFO: renamed from: d */
        private int f12466d = -1;

        /* JADX INFO: renamed from: e */
        private View f12467e;

        /* JADX INFO: renamed from: f */
        private AbstractC3593g f12468f;

        /* JADX INFO: renamed from: g */
        MKTabLayout f12469g;

        /* JADX INFO: renamed from: h */
        TabView f12470h;

        @Nullable
        /* JADX INFO: renamed from: b */
        public CharSequence m18351b() {
            return this.f12465c;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public View m18352c() {
            return this.f12467e;
        }

        /* JADX INFO: renamed from: d */
        public int m18353d() {
            return this.f12466d;
        }

        /* JADX INFO: renamed from: e */
        public boolean m18354e() {
            MKTabLayout mKTabLayout = this.f12469g;
            if (mKTabLayout != null) {
                return mKTabLayout.getSelectedTabPosition() == this.f12466d;
            }
            wg3.m206174a("Tab not attached to a TabLayout");
            return false;
        }

        /* JADX INFO: renamed from: f */
        public void m18355f() {
            this.f12469g = null;
            this.f12470h = null;
            this.f12463a = null;
            this.f12464b = null;
            this.f12465c = null;
            this.f12466d = -1;
            this.f12467e = null;
            this.f12468f = null;
        }

        /* JADX INFO: renamed from: g */
        public void m18356g() {
            MKTabLayout mKTabLayout = this.f12469g;
            if (mKTabLayout != null) {
                mKTabLayout.m18310A(this);
            } else {
                wg3.m206174a("Tab not attached to a TabLayout");
            }
        }

        @NonNull
        /* JADX INFO: renamed from: h */
        public C3592f m18357h(@Nullable CharSequence charSequence) {
            this.f12465c = charSequence;
            m18361l();
            return this;
        }

        /* JADX INFO: renamed from: i */
        public void m18358i(int i) {
            this.f12466d = i;
        }

        /* JADX INFO: renamed from: j */
        public C3592f m18359j(@Nullable AbstractC3593g abstractC3593g) {
            if (abstractC3593g == null) {
                return this;
            }
            this.f12468f = abstractC3593g;
            this.f12467e = abstractC3593g.m18362a(this.f12469g);
            m18361l();
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: k */
        public C3592f m18360k(@Nullable CharSequence charSequence) {
            this.f12464b = charSequence;
            boolean zIsInstance = C3591e.class.isInstance(this.f12468f);
            AbstractC3593g abstractC3593g = this.f12468f;
            if (zIsInstance) {
                ((C3591e) abstractC3593g).m18349f(this.f12464b);
                return this;
            }
            if (abstractC3593g == null) {
                m18359j(new C3591e(this.f12464b));
                return this;
            }
            wtq0.m207906a("Can not setText with TabInfo=".concat(abstractC3593g.getClass().getName()));
            return null;
        }

        /* JADX INFO: renamed from: l */
        public void m18361l() {
            TabView tabView = this.f12470h;
            if (tabView != null) {
                tabView.m18341b();
            }
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKTabLayout$g */
    public static abstract class AbstractC3593g {

        /* JADX INFO: renamed from: a */
        @Nullable
        private View f12471a;

        @NonNull
        /* JADX INFO: renamed from: a */
        public View m18362a(@NonNull MKTabLayout mKTabLayout) {
            if (this.f12471a == null) {
                this.f12471a = mo18347b(mKTabLayout);
            }
            return this.f12471a;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public abstract View mo18347b(@NonNull MKTabLayout mKTabLayout);

        /* JADX INFO: renamed from: c */
        public void m18363c(@NonNull TextView textView, @NonNull MKTabLayout mKTabLayout) {
            textView.setGravity(17);
            textView.setTextAppearance(mKTabLayout.getContext(), mKTabLayout.f12418i);
            textView.setTextColor(mKTabLayout.f12419j);
        }

        /* JADX INFO: renamed from: d */
        public void m18364d(MKTabLayout mKTabLayout, int i, float f) {
            View view = this.f12471a;
            if (view == null) {
                return;
            }
            mo18348e(mKTabLayout, view, f);
        }

        /* JADX INFO: renamed from: e */
        public abstract void mo18348e(@NonNull MKTabLayout mKTabLayout, @NonNull View view, float f);
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKTabLayout$h */
    public static class C3594h implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: a */
        private final WeakReference<MKTabLayout> f12472a;

        /* JADX INFO: renamed from: b */
        private int f12473b;

        /* JADX INFO: renamed from: c */
        private int f12474c;

        public C3594h(MKTabLayout mKTabLayout) {
            this.f12472a = new WeakReference<>(mKTabLayout);
        }

        /* JADX INFO: renamed from: a */
        public void m18365a() {
            this.f12474c = 0;
            this.f12473b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            this.f12473b = this.f12474c;
            this.f12474c = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
            MKTabLayout mKTabLayout = this.f12472a.get();
            if (mKTabLayout != null) {
                int i3 = this.f12474c;
                mKTabLayout.m18314E(i, f, i3 != 2 || this.f12473b == 1, (i3 == 2 && this.f12473b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            MKTabLayout mKTabLayout = this.f12472a.get();
            if (mKTabLayout == null || mKTabLayout.getSelectedTabPosition() == i || i >= mKTabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f12474c;
            mKTabLayout.m18311B(mKTabLayout.m18322t(i), i2 == 0 || (i2 == 2 && this.f12473b == 0));
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.MKTabLayout$i */
    public static class C3595i implements InterfaceC3589c {

        /* JADX INFO: renamed from: a */
        private final ViewPager f12475a;

        public C3595i(ViewPager viewPager) {
            this.f12475a = viewPager;
        }

        @Override // com.hellogroup.p036mk.business.widget.MKTabLayout.InterfaceC3589c
        /* JADX INFO: renamed from: a */
        public void mo18344a(C3592f c3592f) {
        }

        @Override // com.hellogroup.p036mk.business.widget.MKTabLayout.InterfaceC3589c
        /* JADX INFO: renamed from: b */
        public void mo18345b(C3592f c3592f) {
        }

        @Override // com.hellogroup.p036mk.business.widget.MKTabLayout.InterfaceC3589c
        /* JADX INFO: renamed from: c */
        public void mo18346c(C3592f c3592f) {
            this.f12475a.setCurrentItem(c3592f.m18353d());
        }
    }

    public MKTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12410a = MKTabLayout.class.getSimpleName();
        this.f12411b = new ArrayList<>();
        this.f12423n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f12430u = true;
        this.f12432w = new ArrayList<>();
        this.f12409F = new pj80(12);
        hvi0.m137324a(context);
        setHorizontalScrollBarEnabled(false);
        SlidingTabStrip slidingTabStrip = new SlidingTabStrip(context);
        this.f12413d = slidingTabStrip;
        super.addView(slidingTabStrip, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, chc0.f81778d, i, rgc0.f162992b);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(chc0.f81783i, 0);
        slidingTabStrip.m18338i(dimensionPixelSize);
        slidingTabStrip.m18337h(typedArrayObtainStyledAttributes.getColor(chc0.f81782h, 0));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(chc0.f81787m, 0);
        this.f12417h = dimensionPixelSize2;
        this.f12416g = dimensionPixelSize2;
        this.f12415f = dimensionPixelSize2;
        this.f12414e = dimensionPixelSize2;
        this.f12414e = typedArrayObtainStyledAttributes.getDimensionPixelSize(chc0.f81790p, dimensionPixelSize2);
        this.f12415f = typedArrayObtainStyledAttributes.getDimensionPixelSize(chc0.f81791q, this.f12415f);
        this.f12416g = typedArrayObtainStyledAttributes.getDimensionPixelSize(chc0.f81789o, this.f12416g);
        this.f12417h = typedArrayObtainStyledAttributes.getDimensionPixelSize(chc0.f81788n, this.f12417h);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(chc0.f81793s, rgc0.f162991a);
        this.f12418i = resourceId;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, chc0.f81795u);
        try {
            this.f12420k = typedArrayObtainStyledAttributes2.getDimensionPixelSize(chc0.f81796v, 0);
            this.f12419j = typedArrayObtainStyledAttributes2.getColorStateList(chc0.f81797w);
            typedArrayObtainStyledAttributes2.recycle();
            if (typedArrayObtainStyledAttributes.hasValue(chc0.f81794t)) {
                this.f12419j = typedArrayObtainStyledAttributes.getColorStateList(chc0.f81794t);
            }
            if (typedArrayObtainStyledAttributes.hasValue(chc0.f81792r)) {
                this.f12419j = m18303m(this.f12419j.getDefaultColor(), typedArrayObtainStyledAttributes.getColor(chc0.f81792r, 0));
            }
            this.f12424o = typedArrayObtainStyledAttributes.getDimensionPixelSize(chc0.f81785k, -1);
            this.f12425p = typedArrayObtainStyledAttributes.getDimensionPixelSize(chc0.f81784j, -1);
            this.f12422m = typedArrayObtainStyledAttributes.getResourceId(chc0.f81779e, 0);
            this.f12427r = typedArrayObtainStyledAttributes.getDimensionPixelSize(chc0.f81780f, 0);
            this.f12429t = typedArrayObtainStyledAttributes.getInt(chc0.f81786l, 1);
            this.f12428s = typedArrayObtainStyledAttributes.getInt(chc0.f81781g, 0);
            typedArrayObtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f12421l = resources.getDimensionPixelSize(tac0.f172713b);
            this.f12426q = resources.getDimensionPixelSize(tac0.f172712a);
            setEnableScale(false);
            if (dimensionPixelSize == 0) {
                wyh0.m208618a(this);
            }
            m18300j();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: G */
    private void m18292G(@Nullable ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f12435z;
        if (viewPager2 != null) {
            C3594h c3594h = this.f12406C;
            if (c3594h != null) {
                viewPager2.m4177P(c3594h);
            }
            C3587a c3587a = this.f12407D;
            if (c3587a != null) {
                this.f12435z.m4176O(c3587a);
            }
        }
        InterfaceC3589c interfaceC3589c = this.f12433x;
        if (interfaceC3589c != null) {
            m18327y(interfaceC3589c);
            this.f12433x = null;
        }
        if (viewPager != null) {
            this.f12435z = viewPager;
            if (this.f12406C == null) {
                this.f12406C = new C3594h(this);
            }
            this.f12406C.m18365a();
            viewPager.m4187d(this.f12406C);
            C3595i c3595i = new C3595i(viewPager);
            this.f12433x = c3595i;
            m18317b(c3595i);
            cf60 adapter = viewPager.getAdapter();
            if (adapter != null) {
                m18312C(adapter, z);
            }
            if (this.f12407D == null) {
                this.f12407D = new C3587a();
            }
            this.f12407D.m18342a(z);
            viewPager.m4186c(this.f12407D);
            m18313D(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f12435z = null;
            m18312C(null, false);
        }
        this.f12408E = z2;
    }

    /* JADX INFO: renamed from: H */
    private void m18293H() {
        int size = this.f12411b.size();
        for (int i = 0; i < size; i++) {
            this.f12411b.get(i).m18361l();
        }
    }

    /* JADX INFO: renamed from: I */
    private void m18294I(FrameLayout.LayoutParams layoutParams) {
        if (this.f12429t == 1 && this.f12428s == 0) {
            layoutParams.width = -1;
        } else {
            layoutParams.width = -2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18295a(MKTabLayout mKTabLayout, ValueAnimator valueAnimator) {
        mKTabLayout.getClass();
        mKTabLayout.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }

    /* JADX INFO: renamed from: f */
    private void m18296f(@NonNull TabItem tabItem) {
        C3592f c3592fM18324v = m18324v();
        CharSequence charSequence = tabItem.f12478a;
        if (charSequence != null) {
            c3592fM18324v.m18360k(charSequence);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            c3592fM18324v.m18357h(tabItem.getContentDescription());
        }
        m18318c(c3592fM18324v);
    }

    /* JADX INFO: renamed from: g */
    private void m18297g(C3592f c3592f) {
        this.f12413d.addView(c3592f.f12470h, c3592f.m18353d(), m18304n());
    }

    private int getDefaultHeight() {
        return 48;
    }

    private float getScrollPosition() {
        return this.f12413d.m18334e();
    }

    private int getTabMinWidth() {
        int i = this.f12424o;
        if (i != -1) {
            return i;
        }
        if (this.f12429t == 0) {
            return this.f12426q;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f12413d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* JADX INFO: renamed from: h */
    private void m18298h(View view) {
        if (view instanceof TabItem) {
            m18296f((TabItem) view);
        } else {
            wg3.m206174a("Only TabItem instances can be added to TabLayout");
        }
    }

    /* JADX INFO: renamed from: i */
    private void m18299i(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() == null || !kkl0.m150134P(this) || this.f12413d.m18333d()) {
            m18313D(i, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iM18301k = m18301k(i, 0.0f);
        if (scrollX != iM18301k) {
            if (this.f12434y == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f12434y = valueAnimator;
                valueAnimator.setInterpolator(or0.f148666f);
                this.f12434y.setDuration(300L);
                this.f12434y.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.blw
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        MKTabLayout.m18295a(this.f77219a, valueAnimator2);
                    }
                });
            }
            this.f12434y.setIntValues(scrollX, iM18301k);
            this.f12434y.start();
        }
        this.f12413d.m18332c(i, 300);
    }

    /* JADX INFO: renamed from: j */
    private void m18300j() {
        kkl0.m150196z0(this.f12413d, this.f12429t == 0 ? Math.max(0, this.f12427r - this.f12414e) : 0, 0, 0, 0);
        m18316J(true);
    }

    /* JADX INFO: renamed from: k */
    private int m18301k(int i, float f) {
        if (this.f12429t != 0) {
            return 0;
        }
        View childAt = this.f12413d.getChildAt(i);
        int i2 = i + 1;
        View childAt2 = i2 < this.f12413d.getChildCount() ? this.f12413d.getChildAt(i2) : null;
        return ((childAt.getLeft() + ((int) ((((childAt != null ? childAt.getWidth() : 0) + (childAt2 != null ? childAt2.getWidth() : 0)) * f) * 0.5f))) + (childAt.getWidth() / 2)) - (getWidth() / 2);
    }

    /* JADX INFO: renamed from: l */
    private void m18302l(C3592f c3592f, int i) {
        c3592f.m18358i(i);
        this.f12411b.add(i, c3592f);
        int size = this.f12411b.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.f12411b.get(i).m18358i(i);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private static ColorStateList m18303m(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* JADX INFO: renamed from: n */
    private FrameLayout.LayoutParams m18304n() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        m18294I(layoutParams);
        return layoutParams;
    }

    /* JADX INFO: renamed from: o */
    private TabView m18305o(@NonNull C3592f c3592f) {
        nj80<TabView> nj80Var = this.f12409F;
        TabView tabViewAcquire = nj80Var != null ? nj80Var.acquire() : null;
        if (tabViewAcquire == null) {
            tabViewAcquire = new TabView(getContext());
        }
        tabViewAcquire.setTab(c3592f);
        tabViewAcquire.setFocusable(true);
        tabViewAcquire.setMinimumWidth(getTabMinWidth());
        return tabViewAcquire;
    }

    /* JADX INFO: renamed from: p */
    private void m18306p(@NonNull C3592f c3592f) {
        for (int size = this.f12432w.size() - 1; size >= 0; size--) {
            this.f12432w.get(size).mo18345b(c3592f);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m18307q(@NonNull C3592f c3592f) {
        for (int size = this.f12432w.size() - 1; size >= 0; size--) {
            this.f12432w.get(size).mo18346c(c3592f);
        }
    }

    /* JADX INFO: renamed from: r */
    private void m18308r(@NonNull C3592f c3592f) {
        for (int size = this.f12432w.size() - 1; size >= 0; size--) {
            this.f12432w.get(size).mo18344a(c3592f);
        }
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f12413d.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                this.f12413d.getChildAt(i2).setSelected(i2 == i);
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    private void m18309z(int i) {
        TabView tabView = (TabView) this.f12413d.getChildAt(i);
        this.f12413d.removeViewAt(i);
        if (tabView != null) {
            tabView.m18340a();
            this.f12409F.release(tabView);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: A */
    public void m18310A(C3592f c3592f) {
        m18311B(c3592f, true);
    }

    /* JADX INFO: renamed from: B */
    public void m18311B(C3592f c3592f, boolean z) {
        C3592f c3592f2 = this.f12412c;
        if (c3592f2 == c3592f) {
            if (c3592f2 != null) {
                m18306p(c3592f);
                m18299i(c3592f.m18353d());
                return;
            }
            return;
        }
        int iM18353d = c3592f != null ? c3592f.m18353d() : -1;
        if (z) {
            if ((c3592f2 == null || c3592f2.m18353d() == -1) && iM18353d != -1) {
                m18313D(iM18353d, 0.0f, true);
            } else {
                m18299i(iM18353d);
            }
            if (iM18353d != -1) {
                setSelectedTabView(iM18353d);
            }
        }
        if (c3592f2 != null) {
            m18308r(c3592f2);
        }
        this.f12412c = c3592f;
        if (c3592f != null) {
            m18307q(c3592f);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m18312C(@Nullable cf60 cf60Var, boolean z) {
        DataSetObserver dataSetObserver;
        cf60 cf60Var2 = this.f12404A;
        if (cf60Var2 != null && (dataSetObserver = this.f12405B) != null) {
            cf60Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f12404A = cf60Var;
        if (z && cf60Var != null) {
            if (this.f12405B == null) {
                this.f12405B = new C3590d();
            }
            cf60Var.registerDataSetObserver(this.f12405B);
        }
        m18325w();
    }

    /* JADX INFO: renamed from: D */
    public void m18313D(int i, float f, boolean z) {
        jzv.m147728a(this.f12410a, "setScrollPosition =====------ position:" + i + "\tpositionOffset:" + f + "\tupdateSelectedText:" + z);
        m18314E(i, f, z, true);
    }

    /* JADX INFO: renamed from: E */
    public void m18314E(int i, float f, boolean z, boolean z2) {
        jzv.m147728a(this.f12410a, "setScrollPosition====-----position:" + i + "\tpositionOffset:" + f + "\tupdateSelectedText:" + z + "\tupdateIndicatorPosition:" + z2);
        int iRound = Math.round(((float) i) + f);
        if (iRound < 0 || iRound >= this.f12413d.getChildCount()) {
            return;
        }
        if (z2) {
            this.f12413d.m18336g(i, f);
        }
        ValueAnimator valueAnimator = this.f12434y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f12434y.cancel();
        }
        scrollTo(m18301k(i, f), 0);
        if (z) {
            setSelectedTabView(iRound);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m18315F(@Nullable ViewPager viewPager, boolean z) {
        m18292G(viewPager, z, false);
    }

    /* JADX INFO: renamed from: J */
    public void m18316J(boolean z) {
        for (int i = 0; i < this.f12413d.getChildCount(); i++) {
            View childAt = this.f12413d.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m18294I((FrameLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m18298h(view);
    }

    /* JADX INFO: renamed from: b */
    public void m18317b(@NonNull InterfaceC3589c interfaceC3589c) {
        if (this.f12432w.contains(interfaceC3589c)) {
            return;
        }
        this.f12432w.add(interfaceC3589c);
    }

    /* JADX INFO: renamed from: c */
    public void m18318c(@NonNull C3592f c3592f) {
        m18320e(c3592f, this.f12411b.isEmpty());
    }

    /* JADX INFO: renamed from: d */
    public void m18319d(@NonNull C3592f c3592f, int i, boolean z) {
        if (c3592f.f12469g != this) {
            wg3.m206174a("Tab belongs to a different TabLayout.");
            return;
        }
        m18302l(c3592f, i);
        m18297g(c3592f);
        if (z) {
            c3592f.m18356g();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m18320e(@NonNull C3592f c3592f, boolean z) {
        m18319d(c3592f, this.f12411b.size(), z);
    }

    public InterfaceC3588b getIndicator() {
        SlidingTabStrip slidingTabStrip = this.f12413d;
        if (slidingTabStrip != null) {
            return slidingTabStrip.f12438c;
        }
        return null;
    }

    public int getSelectedTabPosition() {
        C3592f c3592f = this.f12412c;
        if (c3592f != null) {
            return c3592f.m18353d();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f12411b.size();
    }

    public int getTabGravity() {
        return this.f12428s;
    }

    public int getTabMaxWidth() {
        return this.f12423n;
    }

    public int getTabMode() {
        return this.f12429t;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f12419j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12435z == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m18292G((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f12408E) {
            setupWithViewPager(null);
            this.f12408E = false;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM18321s = m18321s(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(iM18321s, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(iM18321s, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iM18321s2 = this.f12425p;
            if (iM18321s2 <= 0) {
                iM18321s2 = size - m18321s(56);
            }
            this.f12423n = iM18321s2;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.f12429t;
            if (i3 != 0) {
                if (i3 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    /* JADX INFO: renamed from: s */
    public int m18321s(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public void setEnableScale(boolean z) {
        boolean z2 = this.f12430u != z;
        this.f12430u = z;
        if (z2) {
            m18293H();
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable InterfaceC3589c interfaceC3589c) {
        InterfaceC3589c interfaceC3589c2 = this.f12431v;
        if (interfaceC3589c2 != null) {
            m18327y(interfaceC3589c2);
        }
        this.f12431v = interfaceC3589c;
        if (interfaceC3589c != null) {
            m18317b(interfaceC3589c);
        }
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.f12413d.m18337h(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f12413d.m18338i(i);
    }

    public void setSelectedTabSlidingIndicator(InterfaceC3588b interfaceC3588b) {
        this.f12413d.m18339j(interfaceC3588b);
    }

    public void setTabGravity(int i) {
        if (this.f12428s != i) {
            this.f12428s = i;
            m18300j();
        }
    }

    public void setTabMode(int i) {
        if (i != this.f12429t) {
            this.f12429t = i;
            m18300j();
        }
    }

    public void setTabStripGravity(int i) {
        FrameLayout.LayoutParams layoutParams;
        SlidingTabStrip slidingTabStrip = this.f12413d;
        if (slidingTabStrip == null || (layoutParams = (FrameLayout.LayoutParams) slidingTabStrip.getLayoutParams()) == null) {
            return;
        }
        layoutParams.gravity = i;
        this.f12413d.requestLayout();
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f12419j != colorStateList) {
            this.f12419j = colorStateList;
            m18293H();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable cf60 cf60Var) {
        m18312C(cf60Var, false);
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        m18315F(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public C3592f m18322t(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f12411b.get(i);
    }

    /* JADX INFO: renamed from: u */
    public boolean m18323u() {
        return this.f12430u;
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public C3592f m18324v() {
        C3592f c3592fAcquire = f12403G.acquire();
        if (c3592fAcquire == null) {
            c3592fAcquire = new C3592f();
        }
        c3592fAcquire.f12469g = this;
        c3592fAcquire.f12470h = m18305o(c3592fAcquire);
        return c3592fAcquire;
    }

    /* JADX INFO: renamed from: w */
    public void m18325w() {
        int currentItem;
        m18326x();
        cf60 cf60Var = this.f12404A;
        if (cf60Var != null) {
            int count = cf60Var.getCount();
            for (int i = 0; i < count; i++) {
                m18318c(m18324v().m18360k(this.f12404A.getPageTitle(i)));
            }
            ViewPager viewPager = this.f12435z;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m18310A(m18322t(currentItem));
        }
    }

    /* JADX INFO: renamed from: x */
    public void m18326x() {
        for (int childCount = this.f12413d.getChildCount() - 1; childCount >= 0; childCount--) {
            m18309z(childCount);
        }
        Iterator<C3592f> it = this.f12411b.iterator();
        while (it.hasNext()) {
            C3592f next = it.next();
            it.remove();
            next.m18355f();
            f12403G.release(next);
        }
        this.f12412c = null;
    }

    /* JADX INFO: renamed from: y */
    public void m18327y(@NonNull InterfaceC3589c interfaceC3589c) {
        this.f12432w.remove(interfaceC3589c);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m18298h(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m18298h(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m18298h(view);
    }

    public MKTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MKTabLayout(Context context) {
        this(context, null);
    }
}
